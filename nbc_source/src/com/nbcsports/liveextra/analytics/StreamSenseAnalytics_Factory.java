// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            StreamSenseAnalytics

public final class StreamSenseAnalytics_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider viewModelProvider;

    public StreamSenseAnalytics_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            viewModelProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new StreamSenseAnalytics_Factory(provider);
    }

    public StreamSenseAnalytics get()
    {
        return new StreamSenseAnalytics((AssetViewModel)viewModelProvider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/analytics/StreamSenseAnalytics_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
