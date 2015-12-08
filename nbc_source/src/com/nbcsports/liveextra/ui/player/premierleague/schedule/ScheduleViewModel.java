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

public class ScheduleViewModel
{
    public static class ScheduleViewModelBuilder
    {

        private int awayScore;
        private String awayTeam;
        private int clock;
        private DateTime dateTime;
        private String gameDate;
        private int gameId;
        private int homeScore;
        private String homeTeam;
        private int providerIcon;
        private String startTime;
        private String viewType;

        public ScheduleViewModelBuilder awayScore(int i)
        {
            awayScore = i;
            return this;
        }

        public ScheduleViewModelBuilder awayTeam(String s)
        {
            awayTeam = s;
            return this;
        }

        public ScheduleViewModel build()
        {
            return new ScheduleViewModel(gameId, viewType, homeTeam, awayTeam, homeScore, awayScore, clock, providerIcon, gameDate, startTime, dateTime);
        }

        public ScheduleViewModelBuilder clock(int i)
        {
            clock = i;
            return this;
        }

        public ScheduleViewModelBuilder dateTime(DateTime datetime)
        {
            dateTime = datetime;
            return this;
        }

        public ScheduleViewModelBuilder gameDate(String s)
        {
            gameDate = s;
            return this;
        }

        public ScheduleViewModelBuilder gameId(int i)
        {
            gameId = i;
            return this;
        }

        public ScheduleViewModelBuilder homeScore(int i)
        {
            homeScore = i;
            return this;
        }

        public ScheduleViewModelBuilder homeTeam(String s)
        {
            homeTeam = s;
            return this;
        }

        public ScheduleViewModelBuilder providerIcon(int i)
        {
            providerIcon = i;
            return this;
        }

        public ScheduleViewModelBuilder startTime(String s)
        {
            startTime = s;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("ScheduleViewModel.ScheduleViewModelBuilder(gameId=").append(gameId).append(", viewType=").append(viewType).append(", homeTeam=").append(homeTeam).append(", awayTeam=").append(awayTeam).append(", homeScore=").append(homeScore).append(", awayScore=").append(awayScore).append(", clock=").append(clock).append(", providerIcon=").append(providerIcon).append(", gameDate=").append(gameDate).append(", startTime=").append(startTime).append(", dateTime=").append(dateTime).append(")").toString();
        }

        public ScheduleViewModelBuilder viewType(String s)
        {
            viewType = s;
            return this;
        }

        ScheduleViewModelBuilder()
        {
        }
    }


    int awayScore;
    String awayTeam;
    int clock;
    DateTime dateTime;
    String gameDate;
    int gameId;
    int homeScore;
    String homeTeam;
    int providerIcon;
    String startTime;
    String viewType;

    ScheduleViewModel(int i, String s, String s1, String s2, int j, int k, int l, 
            int i1, String s3, String s4, DateTime datetime)
    {
        gameId = i;
        viewType = s;
        homeTeam = s1;
        awayTeam = s2;
        homeScore = j;
        awayScore = k;
        clock = l;
        providerIcon = i1;
        gameDate = s3;
        startTime = s4;
        dateTime = datetime;
    }

    public static ScheduleViewModelBuilder builder()
    {
        return new ScheduleViewModelBuilder();
    }

    public static Func1 fromSchedule()
    {
        return new Func1() {

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                list = new ArrayList(CollectionUtils.collect(list, new Transformer() {

                    final _cls1 this$0;

                    public ScheduleViewModel transform(Schedule schedule)
                    {
                        DateTime datetime = DateTime.parse(TimeUtils.normalizeTimestamp(schedule.getGameDate()));
                        return ScheduleViewModel.builder().gameId(schedule.getGameId()).dateTime(datetime).gameDate(datetime.toString(DateTimeFormat.forPattern("M/d"))).startTime(datetime.toString(DateTimeFormat.forPattern("h:mm a z").withZone(DateTimeZone.getDefault()))).homeTeam(schedule.getHomeTeam()).homeScore(Integer.parseInt(schedule.getHomeGoals())).awayTeam(schedule.getAwayTeam()).awayScore(Integer.parseInt(schedule.getAwayGoals())).viewType(schedule.getGameState()).clock(Integer.parseInt(schedule.getClock())).build();
                    }

                    public volatile Object transform(Object obj)
                    {
                        return transform((Schedule)obj);
                    }

            
            {
                this$0 = _cls1.this;
                super();
            }
                }));
                Collections.sort(list, new Comparator() {

                    final _cls1 this$0;

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
                this$0 = _cls1.this;
                super();
            }
                });
                return list;
            }

        };
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof ScheduleViewModel;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ScheduleViewModel))
            {
                return false;
            }
            obj = (ScheduleViewModel)obj;
            if (!((ScheduleViewModel) (obj)).canEqual(this))
            {
                return false;
            }
            if (getGameId() != ((ScheduleViewModel) (obj)).getGameId())
            {
                return false;
            }
            String s = getViewType();
            String s1 = ((ScheduleViewModel) (obj)).getViewType();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            if (getClock() != ((ScheduleViewModel) (obj)).getClock())
            {
                return false;
            }
        }
        return true;
    }

    public int getAwayScore()
    {
        return awayScore;
    }

    public String getAwayTeam()
    {
        return awayTeam;
    }

    public int getClock()
    {
        return clock;
    }

    public DateTime getDateTime()
    {
        return dateTime;
    }

    public String getGameDate()
    {
        return gameDate;
    }

    public int getGameId()
    {
        return gameId;
    }

    public int getHomeScore()
    {
        return homeScore;
    }

    public String getHomeTeam()
    {
        return homeTeam;
    }

    public int getProviderIcon()
    {
        return providerIcon;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public String getViewType()
    {
        return viewType;
    }

    public int hashCode()
    {
        int j = getGameId();
        String s = getViewType();
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        return ((j + 59) * 59 + i) * 59 + getClock();
    }

    public boolean isLive()
    {
        return clock > 0 && !viewType.equals("FullTime") && !viewType.equals("PreMatch");
    }

    public void setProviderIcon(int i)
    {
        providerIcon = i;
    }
}
