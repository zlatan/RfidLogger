package org.rfid;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by iliyapetrov on 24.07.16.
 */
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

    List<Event> findByRfidAndDateBetweenOrderByDate(@Param("rfid") String rfid, @Param("starttime") Long starttime, @Param("endtime") Long endtime);
}
