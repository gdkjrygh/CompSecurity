// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import com.nbcsports.liveextra.content.models.overlay.premierleague.Schedule;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleViewModel

class this._cls0
    implements Transformer
{

    final transform this$0;

    public ScheduleViewModel transform(Schedule schedule)
    {
        DateTime datetime = DateTime.parse(TimeUtils.normalizeTimestamp(schedule.getGameDate()));
        return ScheduleViewModel.builder().gameId(schedule.getGameId()).dateTime(datetime).gameDate(datetime.toString(DateTimeFormat.forPattern("M/d"))).startTime(datetime.toString(DateTimeFormat.forPattern("h:mm a z").withZone(DateTimeZone.getDefault()))).homeTeam(schedule.getHomeTeam()).homeScore(Integer.parseInt(schedule.getHomeGoals())).awayTeam(schedule.getAwayTeam()).awayScore(Integer.parseInt(schedule.getAwayGoals())).viewType(schedule.getGameState()).clock(Integer.parseInt(schedule.getClock())).build();
    }

    public volatile Object transform(Object obj)
    {
        return transform((Schedule)obj);
    }

    this._cls0()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleViewModel$1

/* anonymous class */
    static final class ScheduleViewModel._cls1
        implements Func1
    {

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public List call(List list)
        {
            list = new ArrayList(CollectionUtils.collect(list, new ScheduleViewModel._cls1._cls1()));
            Collections.sort(list, new ScheduleViewModel._cls1._cls2());
            return list;
        }


        // Unreferenced inner class com/nbcsports/liveextra/ui/player/premierleague/schedule/ScheduleViewModel$1$2

/* anonymous class */
        class ScheduleViewModel._cls1._cls2
            implements Comparator
        {

            final ScheduleViewModel._cls1 this$0;

            public int compare(ScheduleViewModel scheduleviewmodel, ScheduleViewModel scheduleviewmodel1)
            {
                if (scheduleviewmodel.getDateTime().isEqual(scheduleviewmodel.getDateTime()))
                {
                    if (scheduleviewmodel.clock == scheduleviewmodel1.clock)
                    {
                        return 0;
                    } else
                    {
                        return Integer.valueOf(scheduleviewmodel.clock).compareTo(Integer.valueOf(scheduleviewmodel1.clock));
                    }
                }
                return !scheduleviewmodel.getDateTime().isBefore(scheduleviewmodel1.getDateTime()) ? 1 : -1;
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ScheduleViewModel)obj, (ScheduleViewModel)obj1);
            }

                    
                    {
                        this$0 = ScheduleViewModel._cls1.this;
                        super();
                    }
        }

    }

}
