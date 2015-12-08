// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsTimelineProvider;
import com.nbcsports.liveextra.ui.player.premierleague.league.LeagueInfoProvider;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsLiveProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter, GameInfoProvider, TeamInfoProvider, TeamBoxScoreProvider

public final class MatchScorePresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final Provider gameInfoProvider;
    private final Provider leagueInfoProvider;
    private final MembersInjector membersInjector;
    private final Provider playerPresenterProvider;
    private final Provider scoreProvider;
    private final Provider standingsProvider;
    private final Provider teamInfoProvider;
    private final Provider timelineProvider;

    public MatchScorePresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7)
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
        gameInfoProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        teamInfoProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        scoreProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        leagueInfoProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        timelineProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            standingsProvider = provider7;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        return new MatchScorePresenter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public MatchScorePresenter get()
    {
        MatchScorePresenter matchscorepresenter = new MatchScorePresenter((PremierLeagueEngine)engineProvider.get(), (PlayerPresenter)playerPresenterProvider.get(), (GameInfoProvider)gameInfoProvider.get(), (TeamInfoProvider)teamInfoProvider.get(), (TeamBoxScoreProvider)scoreProvider.get(), (LeagueInfoProvider)leagueInfoProvider.get(), (EventsTimelineProvider)timelineProvider.get(), (StandingsLiveProvider)standingsProvider.get());
        membersInjector.injectMembers(matchscorepresenter);
        return matchscorepresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/gameinfo/MatchScorePresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
