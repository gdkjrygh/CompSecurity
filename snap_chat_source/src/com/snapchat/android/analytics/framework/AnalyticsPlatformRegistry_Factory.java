// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import afw;
import javax.inject.Provider;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            AnalyticsPlatformRegistry, UpdateSnapsAnalyticsPlatform, FlurryAnalyticsPlatform

public final class AnalyticsPlatformRegistry_Factory
    implements afw
{

    private static boolean c;
    private final Provider a;
    private final Provider b;

    private AnalyticsPlatformRegistry_Factory(Provider provider, Provider provider1)
    {
        if (!c && provider == null)
        {
            throw new AssertionError();
        }
        a = provider;
        if (!c && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider1;
            return;
        }
    }

    public static afw a(Provider provider, Provider provider1)
    {
        return new AnalyticsPlatformRegistry_Factory(provider, provider1);
    }

    public final Object get()
    {
        return new AnalyticsPlatformRegistry((UpdateSnapsAnalyticsPlatform)a.get(), (FlurryAnalyticsPlatform)b.get());
    }

    static 
    {
        boolean flag;
        if (!com/snapchat/android/analytics/framework/AnalyticsPlatformRegistry_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
