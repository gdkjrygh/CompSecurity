// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsLiveProvider

public final class StandingsLiveProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final Provider gameInfoProvider;
    private final MembersInjector membersInjector;
    private final Provider subscriberProvider;

    public StandingsLiveProvider_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        engineProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        subscriberProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            gameInfoProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new StandingsLiveProvider_Factory(membersinjector, provider, provider1, provider2);
    }

    public StandingsLiveProvider get()
    {
        StandingsLiveProvider standingsliveprovider = new StandingsLiveProvider((PremierLeagueEngine)engineProvider.get(), (StandingsLiveProvider.StandingsLiveSubscriber)subscriberProvider.get(), (GameInfoProvider)gameInfoProvider.get());
        membersInjector.injectMembers(standingsliveprovider);
        return standingsliveprovider;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/standings/StandingsLiveProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
