// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar, AltCamPresenter, PlayerPresenter

public final class PlayerControlBar_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider altCamPresenterProvider;
    private final Provider favoritesProvider;
    private final Provider playerPresenterProvider;
    private final Provider playerProvider;
    private final Provider preferencesProvider;
    private final MembersInjector supertypeInjector;
    private final Provider viewModelProvider;

    public PlayerControlBar_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        playerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        favoritesProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        preferencesProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        viewModelProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        altCamPresenterProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            playerPresenterProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new PlayerControlBar_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public void injectMembers(PlayerControlBar playercontrolbar)
    {
        if (playercontrolbar == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playercontrolbar);
            playercontrolbar.player = (MediaPlayer)playerProvider.get();
            playercontrolbar.favorites = (FavoriteService)favoritesProvider.get();
            playercontrolbar.preferences = (AppPreferences)preferencesProvider.get();
            playercontrolbar.viewModel = (AssetViewModel)viewModelProvider.get();
            playercontrolbar.altCamPresenter = (AltCamPresenter)altCamPresenterProvider.get();
            playercontrolbar.playerPresenter = (PlayerPresenter)playerPresenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerControlBar)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerControlBar_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
