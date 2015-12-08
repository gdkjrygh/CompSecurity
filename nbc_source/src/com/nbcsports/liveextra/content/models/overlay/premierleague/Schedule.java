// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.ArrayList;

public class Schedule
{
    public static class Collection extends ArrayList
    {

        public Collection()
        {
        }
    }


    String awayGoals;
    String awayTeam;
    String clock;
    String gameDate;
    int gameId;
    String gameState;
    String homeGoals;
    String homeTeam;

    public Schedule()
    {
    }

    public String getAwayGoals()
    {
        return awayGoals;
    }

    public String getAwayTeam()
    {
        return awayTeam;
    }

    public String getClock()
    {
        return clock;
    }

    public String getGameDate()
    {
        return gameDate;
    }

    public int getGameId()
    {
        return gameId;
    }

    public String getGameState()
    {
        return gameState;
    }

    public String getHomeGoals()
    {
        return homeGoals;
    }

    public String getHomeTeam()
    {
        return homeTeam;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Schedule(gameId=").append(getGameId()).append(", gameDate=").append(getGameDate()).append(", homeTeam=").append(getHomeTeam()).append(", awayTeam=").append(getAwayTeam()).append(", awayGoals=").append(getAwayGoals()).append(", homeGoals=").append(getHomeGoals()).append(", clock=").append(getClock()).append(", gameState=").append(getGameState()).append(")").toString();
    }
}
