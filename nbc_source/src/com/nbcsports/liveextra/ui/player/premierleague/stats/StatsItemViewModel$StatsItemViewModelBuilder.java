// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;


// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.stats:
//            StatsItemViewModel

public static class 
{

    private int away;
    private String awayColor;
    private int home;
    private String homeColor;
    private int name;

    public  away(int i)
    {
        away = i;
        return this;
    }

    public away awayColor(String s)
    {
        awayColor = s;
        return this;
    }

    public StatsItemViewModel build()
    {
        return new StatsItemViewModel(name, home, away, homeColor, awayColor);
    }

    public awayColor home(int i)
    {
        home = i;
        return this;
    }

    public home homeColor(String s)
    {
        homeColor = s;
        return this;
    }

    public homeColor name(int i)
    {
        name = i;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StatsItemViewModel.StatsItemViewModelBuilder(name=").append(name).append(", home=").append(home).append(", away=").append(away).append(", homeColor=").append(homeColor).append(", awayColor=").append(awayColor).append(")").toString();
    }

    ()
    {
    }
}
