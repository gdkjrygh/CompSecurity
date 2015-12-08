// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate, AuthService, MvpdLookups

public final class PlaybackDelegate_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider anvatoServiceProvider;
    private final Provider blackoutServiceProvider;
    private final Provider configProvider;
    private final Provider lookupsProvider;
    private final Provider passProvider;
    private final MembersInjector supertypeInjector;
    private final Provider trackingHelperProvider;

    public PlaybackDelegate_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        configProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        passProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        blackoutServiceProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        anvatoServiceProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        lookupsProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            trackingHelperProvider = provider5;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new PlaybackDelegate_MembersInjector(membersinjector, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public void injectMembers(PlaybackDelegate playbackdelegate)
    {
        if (playbackdelegate == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playbackdelegate);
            playbackdelegate.config = (Configuration)configProvider.get();
            playbackdelegate.pass = (AuthService)passProvider.get();
            playbackdelegate.blackoutService = DoubleCheckLazy.create(blackoutServiceProvider);
            playbackdelegate.anvatoService = DoubleCheckLazy.create(anvatoServiceProvider);
            playbackdelegate.lookups = (MvpdLookups)lookupsProvider.get();
            playbackdelegate.trackingHelper = (TrackingHelper)trackingHelperProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlaybackDelegate)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/library/tve/PlaybackDelegate_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
