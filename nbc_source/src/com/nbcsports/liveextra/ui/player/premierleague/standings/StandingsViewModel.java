// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;


public class StandingsViewModel
    implements Comparable
{

    private static final int DRAW_POINTS = 1;
    private static final int WIN_POINTS = 3;
    int d;
    int goalsAgainst;
    int goalsDiff;
    int goalsFor;
    int id;
    int l;
    int p;
    int pos;
    int pts;
    String team;
    int viewPos;
    int w;

    public StandingsViewModel(com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team team1, String s)
    {
        id = team1.getTeamId();
        pos = team1.getPosition();
        viewPos = pos;
        team = s;
        w = team1.getWin();
        d = team1.getDraw();
        l = team1.getLoss();
        p = w + d + l;
        pts = w * 3 + d * 1;
        goalsFor = team1.getGoalsFor();
        goalsAgainst = team1.getGoalsAgainst();
        goalsDiff = team1.getGoalsFor() - team1.getGoalsAgainst();
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof StandingsViewModel;
    }

    public int compareTo(StandingsViewModel standingsviewmodel)
    {
        int i = Integer.valueOf(getPts()).compareTo(Integer.valueOf(standingsviewmodel.getPts()));
        if (i != 0)
        {
            return -i;
        }
        i = Integer.valueOf(getGoalsDiff()).compareTo(Integer.valueOf(standingsviewmodel.getGoalsDiff()));
        if (i != 0)
        {
            return -i;
        }
        i = Integer.valueOf(getGoalsFor()).compareTo(Integer.valueOf(standingsviewmodel.getGoalsFor()));
        if (i != 0)
        {
            return -i;
        } else
        {
            return getTeam().compareTo(standingsviewmodel.getTeam());
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((StandingsViewModel)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof StandingsViewModel))
            {
                return false;
            }
            obj = (StandingsViewModel)obj;
            if (!((StandingsViewModel) (obj)).canEqual(this))
            {
                return false;
            }
            if (getId() != ((StandingsViewModel) (obj)).getId())
            {
                return false;
            }
        }
        return true;
    }

    public int getD()
    {
        return d;
    }

    public int getGoalsAgainst()
    {
        return goalsAgainst;
    }

    public int getGoalsDiff()
    {
        return goalsDiff;
    }

    public int getGoalsFor()
    {
        return goalsFor;
    }

    public int getId()
    {
        return id;
    }

    public int getL()
    {
        return l;
    }

    public int getP()
    {
        return p;
    }

    public int getPos()
    {
        return pos;
    }

    public int getPts()
    {
        return pts;
    }

    public String getTeam()
    {
        return team;
    }

    public int getViewPos()
    {
        return viewPos;
    }

    public int getW()
    {
        return w;
    }

    public int hashCode()
    {
        return getId() + 59;
    }

    public void setViewPos(int i)
    {
        viewPos = i;
    }
}
