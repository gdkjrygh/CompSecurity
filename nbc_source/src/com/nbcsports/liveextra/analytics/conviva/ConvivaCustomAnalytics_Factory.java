// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import android.content.Context;
import com.conviva.streamerProxies.adobe.PrimeTimeDefaultMediaPlayerProxy;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            ConvivaCustomAnalytics

public final class ConvivaCustomAnalytics_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider proxyProvider;
    private final Provider viewModelProvider;

    public ConvivaCustomAnalytics_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        viewModelProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            proxyProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new ConvivaCustomAnalytics_Factory(provider, provider1, provider2);
    }

    public ConvivaCustomAnalytics get()
    {
        return new ConvivaCustomAnalytics((Context)contextProvider.get(), (AssetViewModel)viewModelProvider.get(), (PrimeTimeDefaultMediaPlayerProxy)proxyProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/conviva/ConvivaCustomAnalytics_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
