// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.conviva.streamerProxies.adobe.PrimeTimeDefaultMediaPlayerProxy;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalyticsModule

public final class PlayerAnalyticsModule_ConvivaProxyFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final PlayerAnalyticsModule module;
    private final Provider playerProvider;

    public PlayerAnalyticsModule_ConvivaProxyFactory(PlayerAnalyticsModule playeranalyticsmodule, Provider provider)
    {
        if (!$assertionsDisabled && playeranalyticsmodule == null)
        {
            throw new AssertionError();
        }
        module = playeranalyticsmodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            playerProvider = provider;
            return;
        }
    }

    public static Factory create(PlayerAnalyticsModule playeranalyticsmodule, Provider provider)
    {
        return new PlayerAnalyticsModule_ConvivaProxyFactory(playeranalyticsmodule, provider);
    }

    public PrimeTimeDefaultMediaPlayerProxy get()
    {
        PrimeTimeDefaultMediaPlayerProxy primetimedefaultmediaplayerproxy = module.convivaProxy((MediaPlayer)playerProvider.get());
        if (primetimedefaultmediaplayerproxy == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return primetimedefaultmediaplayerproxy;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/PlayerAnalyticsModule_ConvivaProxyFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
