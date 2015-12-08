// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.player.AuditudeConfiguration;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerView, PlayerPresenter

public final class PlayerView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider activityProvider;
    private final Provider auditudeConfigurationProvider;
    private final Provider captionStyleProvider;
    private final Provider configurationProvider;
    private final Provider passProvider;
    private final Provider picassoProvider;
    private final Provider playerProvider;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public PlayerView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8)
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
        activityProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        configurationProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        auditudeConfigurationProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        captionStyleProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        }
        trackingHelperProvider = provider5;
        if (!$assertionsDisabled && provider6 == null)
        {
            throw new AssertionError();
        }
        passProvider = provider6;
        if (!$assertionsDisabled && provider7 == null)
        {
            throw new AssertionError();
        }
        playerProvider = provider7;
        if (!$assertionsDisabled && provider8 == null)
        {
            throw new AssertionError();
        } else
        {
            presenterProvider = provider8;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        return new PlayerView_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public void injectMembers(PlayerView playerview)
    {
        if (playerview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playerview);
            playerview.activity = (PlayerActivity)activityProvider.get();
            playerview.picasso = (Picasso)picassoProvider.get();
            playerview.configuration = (Configuration)configurationProvider.get();
            playerview.auditudeConfiguration = (AuditudeConfiguration)auditudeConfigurationProvider.get();
            playerview.captionStyle = (CaptionStyle)captionStyleProvider.get();
            playerview.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            playerview.pass = (AuthService)passProvider.get();
            playerview.player = (MediaPlayer)playerProvider.get();
            playerview.presenter = (PlayerPresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
