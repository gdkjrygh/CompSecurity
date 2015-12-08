// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import afq;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            EasyMetric, UpdateSnapsAnalyticsPlatform, FlurryAnalyticsPlatform

public final class EasyMetric_MembersInjector
    implements afq
{

    private static boolean d;
    private final Provider a;
    private final Provider b;
    private final Provider c;

    private EasyMetric_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!d && provider == null)
        {
            throw new AssertionError();
        }
        a = provider;
        if (!d && provider1 == null)
        {
            throw new AssertionError();
        }
        b = provider1;
        if (!d && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider2;
            return;
        }
    }

    public static afq a(Provider provider, Provider provider1, Provider provider2)
    {
        return new EasyMetric_MembersInjector(provider, provider1, provider2);
    }

    public final void a(Object obj)
    {
        obj = (EasyMetric)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.c = (UpdateSnapsAnalyticsPlatform)a.get();
            obj.d = (FlurryAnalyticsPlatform)b.get();
            obj.e = (ExecutorService)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/snapchat/android/analytics/framework/EasyMetric_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
