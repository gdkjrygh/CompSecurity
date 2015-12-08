// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemPresenter, PlayerSeasonStatsProvider, PlayerBoxScoreProvider

public final class PlayerItemPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider boxScoreProvider;
    private final Provider engineProvider;
    private final MembersInjector membersInjector;
    private final Provider playerPresenterProvider;
    private final Provider seasonStatsProvider;
    private final Provider teamInfoProvider;
    private final Provider timelineProvider;

    public PlayerItemPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        playerPresenterProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        timelineProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        teamInfoProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        seasonStatsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            boxScoreProvider = provider5;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new PlayerItemPresenter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public PlayerItemPresenter get()
    {
        PlayerItemPresenter playeritempresenter = new PlayerItemPresenter((PremierLeagueEngine)engineProvider.get(), (PlayerPresenter)playerPresenterProvider.get(), (EventsTimelineProvider)timelineProvider.get(), (TeamInfoProvider)teamInfoProvider.get(), (PlayerSeasonStatsProvider)seasonStatsProvider.get(), (PlayerBoxScoreProvider)boxScoreProvider.get());
        membersInjector.injectMembers(playeritempresenter);
        return playeritempresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/player/PlayerItemPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
