// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import rx.functions.Func1;

public class PlayerSeasonStatsViewModel
{
    public static class PlayerSeasonStatsViewModelBuilder
    {

        private int appearances;
        private int assists;
        private int cleanShots;
        private int goals;
        private int goalsConceded;
        private int saves;
        private int starts;
        private int yellowCards;

        public PlayerSeasonStatsViewModelBuilder appearances(int i)
        {
            appearances = i;
            return this;
        }

        public PlayerSeasonStatsViewModelBuilder assists(int i)
        {
            assists = i;
            return this;
        }

        public PlayerSeasonStatsViewModel build()
        {
            return new PlayerSeasonStatsViewModel(appearances, goals, assists, yellowCards, starts, goalsConceded, saves, cleanShots);
        }

        public PlayerSeasonStatsViewModelBuilder cleanShots(int i)
        {
            cleanShots = i;
            return this;
        }

        public PlayerSeasonStatsViewModelBuilder goals(int i)
        {
            goals = i;
            return this;
        }

        public PlayerSeasonStatsViewModelBuilder goalsConceded(int i)
        {
            goalsConceded = i;
            return this;
        }

        public PlayerSeasonStatsViewModelBuilder saves(int i)
        {
            saves = i;
            return this;
        }

        public PlayerSeasonStatsViewModelBuilder starts(int i)
        {
            starts = i;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PlayerSeasonStatsViewModel.PlayerSeasonStatsViewModelBuilder(appearances=").append(appearances).append(", goals=").append(goals).append(", assists=").append(assists).append(", yellowCards=").append(yellowCards).append(", starts=").append(starts).append(", goalsConceded=").append(goalsConceded).append(", saves=").append(saves).append(", cleanShots=").append(cleanShots).append(")").toString();
        }

        public PlayerSeasonStatsViewModelBuilder yellowCards(int i)
        {
            yellowCards = i;
            return this;
        }

        PlayerSeasonStatsViewModelBuilder()
        {
        }
    }


    public int appearances;
    public int assists;
    public int cleanShots;
    public int goals;
    public int goalsConceded;
    public int saves;
    public int starts;
    public int yellowCards;

    PlayerSeasonStatsViewModel(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        appearances = i;
        goals = j;
        assists = k;
        yellowCards = l;
        starts = i1;
        goalsConceded = j1;
        saves = k1;
        cleanShots = l1;
    }

    public static PlayerSeasonStatsViewModelBuilder builder()
    {
        return new PlayerSeasonStatsViewModelBuilder();
    }

    public static Func1 fromFeed()
    {
        return new Func1() {

            public PlayerSeasonStatsViewModel call(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats.Stat stat)
            {
                return PlayerSeasonStatsViewModel.builder().appearances(stat.getG()).goals(stat.getGl()).assists(stat.getAst()).yellowCards(stat.getYc()).starts(stat.getGs()).goalsConceded(stat.getGlsAg()).saves(stat.getSv()).cleanShots(stat.getClnSht()).build();
            }

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerSeasonStats.Stat)obj);
            }

        };
    }
}
