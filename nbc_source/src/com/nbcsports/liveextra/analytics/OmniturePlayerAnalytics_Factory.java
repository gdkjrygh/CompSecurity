// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            OmniturePlayerAnalytics

public final class OmniturePlayerAnalytics_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider trackingHelperProvider;
    private final Provider viewModelProvider;

    public OmniturePlayerAnalytics_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        viewModelProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            trackingHelperProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new OmniturePlayerAnalytics_Factory(provider, provider1);
    }

    public OmniturePlayerAnalytics get()
    {
        return new OmniturePlayerAnalytics((AssetViewModel)viewModelProvider.get(), (TrackingHelper)trackingHelperProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/OmniturePlayerAnalytics_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
