// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.analytics:
//            NetworkAnalyticsInterceptor

class val.device extends ThreadLocal
{

    final NetworkAnalyticsInterceptor this$0;
    final IDevice val$device;

    public volatile Object initialValue()
    {
        return initialValue();
    }

    public tworkAnalytics initialValue()
    {
        return new tworkAnalytics(val$device);
    }

    tworkAnalytics()
    {
        this$0 = final_networkanalyticsinterceptor;
        val$device = IDevice.this;
        super();
    }
}
