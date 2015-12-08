// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import rx.functions.Func1;

public class PlayerBoxScoreViewModel
{
    public static class PlayerBoxScoreViewModelBuilder
    {

        private int assists;
        private int goals;
        private int goalsConceded;
        private double passingPct;
        private double savePct;
        private int saves;
        private int shots;
        private int shotsFaced;

        public PlayerBoxScoreViewModelBuilder assists(int i)
        {
            assists = i;
            return this;
        }

        public PlayerBoxScoreViewModel build()
        {
            return new PlayerBoxScoreViewModel(goals, shots, assists, passingPct, shotsFaced, goalsConceded, saves, savePct);
        }

        public PlayerBoxScoreViewModelBuilder goals(int i)
        {
            goals = i;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder goalsConceded(int i)
        {
            goalsConceded = i;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder passingPct(double d)
        {
            passingPct = d;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder savePct(double d)
        {
            savePct = d;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder saves(int i)
        {
            saves = i;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder shots(int i)
        {
            shots = i;
            return this;
        }

        public PlayerBoxScoreViewModelBuilder shotsFaced(int i)
        {
            shotsFaced = i;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PlayerBoxScoreViewModel.PlayerBoxScoreViewModelBuilder(goals=").append(goals).append(", shots=").append(shots).append(", assists=").append(assists).append(", passingPct=").append(passingPct).append(", shotsFaced=").append(shotsFaced).append(", goalsConceded=").append(goalsConceded).append(", saves=").append(saves).append(", savePct=").append(savePct).append(")").toString();
        }

        PlayerBoxScoreViewModelBuilder()
        {
        }
    }


    public int assists;
    public int goals;
    public int goalsConceded;
    public double passingPct;
    public double savePct;
    public int saves;
    public int shots;
    public int shotsFaced;

    PlayerBoxScoreViewModel(int i, int j, int k, double d, int l, int i1, 
            int j1, double d1)
    {
        goals = i;
        shots = j;
        assists = k;
        passingPct = d;
        shotsFaced = l;
        goalsConceded = i1;
        saves = j1;
        savePct = d1;
    }

    public static PlayerBoxScoreViewModelBuilder builder()
    {
        return new PlayerBoxScoreViewModelBuilder();
    }

    public static Func1 fromFeed()
    {
        return new Func1() {

            public PlayerBoxScoreViewModel call(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore.Stat stat)
            {
                int i = stat.getSv() + stat.getGlsAg();
                double d;
                if (i == 0)
                {
                    d = 0.0D;
                } else
                {
                    d = ((double)stat.getSv() * 1.0D) / (double)i;
                }
                return PlayerBoxScoreViewModel.builder().goals(stat.getGoals()).shots(stat.getSht()).assists(stat.getAst()).passingPct(stat.getPsPct()).shotsFaced(i).goalsConceded(stat.getGlsAg()).saves(stat.getSv()).savePct(d).build();
            }

            public volatile Object call(Object obj)
            {
                return call((com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerBoxScore.Stat)obj);
            }

        };
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof PlayerBoxScoreViewModel;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof PlayerBoxScoreViewModel))
            {
                return false;
            }
            obj = (PlayerBoxScoreViewModel)obj;
            if (!((PlayerBoxScoreViewModel) (obj)).canEqual(this))
            {
                return false;
            }
            if (goals != ((PlayerBoxScoreViewModel) (obj)).goals)
            {
                return false;
            }
            if (shots != ((PlayerBoxScoreViewModel) (obj)).shots)
            {
                return false;
            }
            if (assists != ((PlayerBoxScoreViewModel) (obj)).assists)
            {
                return false;
            }
            if (Double.compare(passingPct, ((PlayerBoxScoreViewModel) (obj)).passingPct) != 0)
            {
                return false;
            }
            if (shotsFaced != ((PlayerBoxScoreViewModel) (obj)).shotsFaced)
            {
                return false;
            }
            if (goalsConceded != ((PlayerBoxScoreViewModel) (obj)).goalsConceded)
            {
                return false;
            }
            if (saves != ((PlayerBoxScoreViewModel) (obj)).saves)
            {
                return false;
            }
            if (Double.compare(savePct, ((PlayerBoxScoreViewModel) (obj)).savePct) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i = goals;
        int j = shots;
        int k = assists;
        long l1 = Double.doubleToLongBits(passingPct);
        int l = (int)(l1 >>> 32 ^ l1);
        int i1 = shotsFaced;
        int j1 = goalsConceded;
        int k1 = saves;
        l1 = Double.doubleToLongBits(savePct);
        return (((((((i + 59) * 59 + j) * 59 + k) * 59 + l) * 59 + i1) * 59 + j1) * 59 + k1) * 59 + (int)(l1 >>> 32 ^ l1);
    }
}
