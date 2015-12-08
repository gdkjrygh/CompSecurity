// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.playbyplay;

import com.nbcsports.liveextra.ui.player.PlayerPresenter;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.playbyplay:
//            PlayByPlayPresenter, PlayByPlayProvider

public final class PlayByPlayPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider engineProvider;
    private final MembersInjector membersInjector;
    private final Provider playerPresenterProvider;
    private final Provider providerProvider;

    public PlayByPlayPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        } else
        {
            providerProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new PlayByPlayPresenter_Factory(membersinjector, provider, provider1, provider2);
    }

    public PlayByPlayPresenter get()
    {
        PlayByPlayPresenter playbyplaypresenter = new PlayByPlayPresenter((PremierLeagueEngine)engineProvider.get(), (PlayerPresenter)playerPresenterProvider.get(), (PlayByPlayProvider)providerProvider.get());
        membersInjector.injectMembers(playbyplaypresenter);
        return playbyplaypresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/playbyplay/PlayByPlayPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
