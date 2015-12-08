// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.schedule;

import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.schedule:
//            ScheduleViewModel

public static class i
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

    public i awayScore(int i)
    {
        awayScore = i;
        return this;
    }

    public awayScore awayTeam(String s)
    {
        awayTeam = s;
        return this;
    }

    public ScheduleViewModel build()
    {
        return new ScheduleViewModel(gameId, viewType, homeTeam, awayTeam, homeScore, awayScore, clock, providerIcon, gameDate, startTime, dateTime);
    }

    public dateTime clock(int i)
    {
        clock = i;
        return this;
    }

    public clock dateTime(DateTime datetime)
    {
        dateTime = datetime;
        return this;
    }

    public dateTime gameDate(String s)
    {
        gameDate = s;
        return this;
    }

    public gameDate gameId(int i)
    {
        gameId = i;
        return this;
    }

    public gameId homeScore(int i)
    {
        homeScore = i;
        return this;
    }

    public homeScore homeTeam(String s)
    {
        homeTeam = s;
        return this;
    }

    public homeTeam providerIcon(int i)
    {
        providerIcon = i;
        return this;
    }

    public providerIcon startTime(String s)
    {
        startTime = s;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ScheduleViewModel.ScheduleViewModelBuilder(gameId=").append(gameId).append(", viewType=").append(viewType).append(", homeTeam=").append(homeTeam).append(", awayTeam=").append(awayTeam).append(", homeScore=").append(homeScore).append(", awayScore=").append(awayScore).append(", clock=").append(clock).append(", providerIcon=").append(providerIcon).append(", gameDate=").append(gameDate).append(", startTime=").append(startTime).append(", dateTime=").append(dateTime).append(")").toString();
    }

    public dateTime viewType(String s)
    {
        viewType = s;
        return this;
    }

    i()
    {
    }
}
