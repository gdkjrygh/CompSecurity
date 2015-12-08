// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueModule, PremierLeagueEngine

public final class PremierLeagueModule_EngineFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final PremierLeagueModule module;

    public PremierLeagueModule_EngineFactory(PremierLeagueModule premierleaguemodule)
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
        return new PremierLeagueModule_EngineFactory(premierleaguemodule);
    }

    public PremierLeagueEngine get()
    {
        PremierLeagueEngine premierleagueengine = module.engine();
        if (premierleagueengine == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return premierleagueengine;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/PremierLeagueModule_EngineFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
