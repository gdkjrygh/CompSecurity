// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;


// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

public class PremierLeagueModule
{

    private final PremierLeagueEngine engine;

    public PremierLeagueModule(PremierLeagueEngine premierleagueengine)
    {
        engine = premierleagueengine;
    }

    PremierLeagueEngine engine()
    {
        return engine;
    }

    String splashData()
    {
        return "http://stream.nbcsports.com/data/splash_data.json";
    }
}
