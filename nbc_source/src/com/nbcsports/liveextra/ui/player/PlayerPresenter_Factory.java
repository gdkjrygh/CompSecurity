// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.ui.systemui.SystemUiHelper;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.dataviews.DataEngine;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerPresenter, PlayerActivity

public final class PlayerPresenter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider engineProvider;
    private final Provider favoritesProvider;
    private final MembersInjector membersInjector;
    private final Provider playerProvider;
    private final Provider preferencesProvider;
    private final Provider systemUiHelperProvider;
    private final Provider viewModelProvider;

    public PlayerPresenter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6)
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
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        playerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        systemUiHelperProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        preferencesProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        viewModelProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        favoritesProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        } else
        {
            engineProvider = provider6;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6)
    {
        return new PlayerPresenter_Factory(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6);
    }

    public PlayerPresenter get()
    {
        PlayerPresenter playerpresenter = new PlayerPresenter((PlayerActivity)activityProvider.get(), (MediaPlayer)playerProvider.get(), (SystemUiHelper)systemUiHelperProvider.get(), (AppPreferences)preferencesProvider.get(), (AssetViewModel)viewModelProvider.get(), (FavoriteService)favoritesProvider.get(), (DataEngine)engineProvider.get());
        membersInjector.injectMembers(playerpresenter);
        return playerpresenter;
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerPresenter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
