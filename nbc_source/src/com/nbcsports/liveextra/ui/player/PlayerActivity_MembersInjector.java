// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.ui.systemui.SystemUiHelper;
import com.nbcsports.liveextra.ui.player.dataviews.DataEngine;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, AltCamPresenter, PlayerPresenter

public final class PlayerActivity_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider altCamPresenterProvider;
    private final Provider analyticsSetProvider;
    private final Provider clientProvider;
    private final Provider configProvider;
    private final Provider engineProvider;
    private final Provider passProvider;
    private final Provider picassoProvider;
    private final Provider playerPresenterProvider;
    private final Provider playerProvider;
    private final MembersInjector supertypeInjector;
    private final Provider systemUiHelperProvider;

    public PlayerActivity_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9)
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
        clientProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        passProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        systemUiHelperProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        analyticsSetProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        altCamPresenterProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        playerPresenterProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        }
        playerProvider = provider8;
        if (!$assertionsDisabled && provider9 == null)
        {
            throw new AssertionError();
        } else
        {
            engineProvider = provider9;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9)
    {
        return new PlayerActivity_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public void injectMembers(PlayerActivity playeractivity)
    {
        if (playeractivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playeractivity);
            playeractivity.client = (OkHttpClient)clientProvider.get();
            playeractivity.pass = (AuthService)passProvider.get();
            playeractivity.config = (Configuration)configProvider.get();
            playeractivity.picasso = (Picasso)picassoProvider.get();
            playeractivity.systemUiHelper = (SystemUiHelper)systemUiHelperProvider.get();
            playeractivity.analyticsSet = (Set)analyticsSetProvider.get();
            playeractivity.altCamPresenter = (AltCamPresenter)altCamPresenterProvider.get();
            playeractivity.playerPresenter = (PlayerPresenter)playerPresenterProvider.get();
            playeractivity.player = (MediaPlayer)playerProvider.get();
            playeractivity.engine = (DataEngine)engineProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerActivity_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
