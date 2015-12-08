// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueModule

public final class PremierLeagueModule_SplashDataFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final PremierLeagueModule module;

    public PremierLeagueModule_SplashDataFactory(PremierLeagueModule premierleaguemodule)
    {
        if (!$assertionsDisabled && premierleaguemodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = premierleaguemodule;
            return;
        }
    }

    public static Factory create(PremierLeagueModule premierleaguemodule)
    {
        return new PremierLeagueModule_SplashDataFactory(premierleaguemodule);
    }

    public volatile Object get()
    {
        return get();
    }

    public String get()
    {
        String s = module.splashData();
        if (s == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return s;
        }
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/PremierLeagueModule_SplashDataFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
