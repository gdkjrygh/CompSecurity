// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.android.impl.analytics;

import android.content.Context;
import com.flurry.sdk.dd;
import com.flurry.sdk.dj;
import com.flurry.sdk.eq;

public class FlurryAnalyticsModule
    implements eq
{

    private static FlurryAnalyticsModule a;
    private dd b;

    private FlurryAnalyticsModule()
    {
    }

    public static FlurryAnalyticsModule getInstance()
    {
        com/flurry/android/impl/analytics/FlurryAnalyticsModule;
        JVM INSTR monitorenter ;
        FlurryAnalyticsModule flurryanalyticsmodule;
        if (a == null)
        {
            a = new FlurryAnalyticsModule();
        }
        flurryanalyticsmodule = a;
        com/flurry/android/impl/analytics/FlurryAnalyticsModule;
        JVM INSTR monitorexit ;
        return flurryanalyticsmodule;
        Exception exception;
        exception;
        throw exception;
    }

    public dd a()
    {
        return b;
    }

    public void a(dj dj)
    {
    }

    public void a(dj dj, Context context)
    {
        if (b == null)
        {
            b = new dd();
        }
    }

    public void b(dj dj, Context context)
    {
    }

    public void c(dj dj, Context context)
    {
    }
}
