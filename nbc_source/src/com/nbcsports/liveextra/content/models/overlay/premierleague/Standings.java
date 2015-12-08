// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class Standings
{
    public class Team
    {

        private static final int DRAW_POINTS = 1;
        private static final int WIN_POINTS = 3;
        int apos;
        int awayDraw;
        int awayGoalsAgainst;
        int awayGoalsFor;
        int awayLoss;
        int awayWin;
        int draw;
        int goalsAgainst;
        int goalsFor;
        int homeDraw;
        int homeGoalsAgainst;
        int homeGoalsFor;
        int homeLoss;
        int homeWin;
        int hpos;
        int loss;
        int position;
        int teamId;
        final Standings this$0;
        int win;

        public int getApos()
        {
            return apos;
        }

        public int getAwayDraw()
        {
            return awayDraw;
        }

        public int getAwayGoalsAgainst()
        {
            return awayGoalsAgainst;
        }

        public int getAwayGoalsFor()
        {
            return awayGoalsFor;
        }

        public int getAwayLoss()
        {
            return awayLoss;
        }

        public int getAwayWin()
        {
            return awayWin;
        }

        public int getDraw()
        {
            return draw;
        }

        public int getGoalsAgainst()
        {
            return goalsAgainst;
        }

        public int getGoalsDiff()
        {
            return goalsFor - goalsAgainst;
        }

        public int getGoalsFor()
        {
            return goalsFor;
        }

        public int getHomeDraw()
        {
            return homeDraw;
        }

        public int getHomeGoalsAgainst()
        {
            return homeGoalsAgainst;
        }

        public int getHomeGoalsFor()
        {
            return homeGoalsFor;
        }

        public int getHomeLoss()
        {
            return homeLoss;
        }

        public int getHomeWin()
        {
            return homeWin;
        }

        public int getHpos()
        {
            return hpos;
        }

        public int getLoss()
        {
            return loss;
        }

        public int getPoints()
        {
            return win * 3 + draw * 1;
        }

        public int getPosition()
        {
            return position;
        }

        public int getTeamId()
        {
            return teamId;
        }

        public int getWin()
        {
            return win;
        }

        public void setPosition(int i)
        {
            position = i;
        }

        public Team()
        {
            this$0 = Standings.this;
            super();
        }
    }

    public class Week
    {

        List teams;
        final Standings this$0;

        public List getTeams()
        {
            return teams;
        }

        public Week()
        {
            this$0 = Standings.this;
            super();
        }
    }


    List weeks;

    public Standings()
    {
    }

    public List getWeeks()
    {
        return weeks;
    }
}
