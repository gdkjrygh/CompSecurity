// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;


// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerSeasonStatsViewModel

public static class y
{

    private int appearances;
    private int assists;
    private int cleanShots;
    private int goals;
    private int goalsConceded;
    private int saves;
    private int starts;
    private int yellowCards;

    public y appearances(int i)
    {
        appearances = i;
        return this;
    }

    public appearances assists(int i)
    {
        assists = i;
        return this;
    }

    public PlayerSeasonStatsViewModel build()
    {
        return new PlayerSeasonStatsViewModel(appearances, goals, assists, yellowCards, starts, goalsConceded, saves, cleanShots);
    }

    public cleanShots cleanShots(int i)
    {
        cleanShots = i;
        return this;
    }

    public cleanShots goals(int i)
    {
        goals = i;
        return this;
    }

    public goals goalsConceded(int i)
    {
        goalsConceded = i;
        return this;
    }

    public goalsConceded saves(int i)
    {
        saves = i;
        return this;
    }

    public saves starts(int i)
    {
        starts = i;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayerSeasonStatsViewModel.PlayerSeasonStatsViewModelBuilder(appearances=").append(appearances).append(", goals=").append(goals).append(", assists=").append(assists).append(", yellowCards=").append(yellowCards).append(", starts=").append(starts).append(", goalsConceded=").append(goalsConceded).append(", saves=").append(saves).append(", cleanShots=").append(cleanShots).append(")").toString();
    }

    public cleanShots yellowCards(int i)
    {
        yellowCards = i;
        return this;
    }

    y()
    {
    }
}
