// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamBoxScoreProvider;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.TeamInfoProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerCardsPresenter, PlayerInfoProvider

public final class PlayerCardsPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final MembersInjector membersInjector;
    private final Provider playerInfoProvider;
    private final Provider playerPresenterProvider;
    private final Provider scoreProvider;
    private final Provider teamInfoProvider;

    public PlayerCardsPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
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
        teamInfoProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        playerInfoProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            scoreProvider = provider4;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new PlayerCardsPresenter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4);
    }

    public PlayerCardsPresenter get()
    {
        PlayerCardsPresenter playercardspresenter = new PlayerCardsPresenter((PremierLeagueEngine)engineProvider.get(), (PlayerPresenter)playerPresenterProvider.get(), (TeamInfoProvider)teamInfoProvider.get(), (PlayerInfoProvider)playerInfoProvider.get(), (TeamBoxScoreProvider)scoreProvider.get());
        membersInjector.injectMembers(playercardspresenter);
        return playercardspresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/player/PlayerCardsPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
