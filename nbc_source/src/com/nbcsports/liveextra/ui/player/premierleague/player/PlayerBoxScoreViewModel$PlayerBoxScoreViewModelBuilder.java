// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;


// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerBoxScoreViewModel

public static class 
{

    private int assists;
    private int goals;
    private int goalsConceded;
    private double passingPct;
    private double savePct;
    private int saves;
    private int shots;
    private int shotsFaced;

    public  assists(int i)
    {
        assists = i;
        return this;
    }

    public PlayerBoxScoreViewModel build()
    {
        return new PlayerBoxScoreViewModel(goals, shots, assists, passingPct, shotsFaced, goalsConceded, saves, savePct);
    }

    public savePct goals(int i)
    {
        goals = i;
        return this;
    }

    public goals goalsConceded(int i)
    {
        goalsConceded = i;
        return this;
    }

    public goalsConceded passingPct(double d)
    {
        passingPct = d;
        return this;
    }

    public passingPct savePct(double d)
    {
        savePct = d;
        return this;
    }

    public savePct saves(int i)
    {
        saves = i;
        return this;
    }

    public saves shots(int i)
    {
        shots = i;
        return this;
    }

    public shots shotsFaced(int i)
    {
        shotsFaced = i;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayerBoxScoreViewModel.PlayerBoxScoreViewModelBuilder(goals=").append(goals).append(", shots=").append(shots).append(", assists=").append(assists).append(", passingPct=").append(passingPct).append(", shotsFaced=").append(shotsFaced).append(", goalsConceded=").append(goalsConceded).append(", saves=").append(saves).append(", savePct=").append(savePct).append(")").toString();
    }

    ()
    {
    }
}
