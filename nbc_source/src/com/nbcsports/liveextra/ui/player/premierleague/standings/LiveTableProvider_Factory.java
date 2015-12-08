// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInfoProvider;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            LiveTableProvider

public final class LiveTableProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final Provider gameInfoProvider;
    private final Provider leagueInfoProvider;
    private final MembersInjector membersInjector;
    private final Provider subscriberProvider;

    public LiveTableProvider_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        }
        gameInfoProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            leagueInfoProvider = provider3;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new LiveTableProvider_Factory(membersinjector, provider, provider1, provider2, provider3);
    }

    public LiveTableProvider get()
    {
        LiveTableProvider livetableprovider = new LiveTableProvider((PremierLeagueEngine)engineProvider.get(), (LiveTableProvider.LiveTableSubscriber)subscriberProvider.get(), (GameInfoProvider)gameInfoProvider.get(), (LeagueInfoProvider)leagueInfoProvider.get());
        membersInjector.injectMembers(livetableprovider);
        return livetableprovider;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/standings/LiveTableProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
