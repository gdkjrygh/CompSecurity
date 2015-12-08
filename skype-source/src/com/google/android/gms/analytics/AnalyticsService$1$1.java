// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.aj;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.g;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
label0:
        {
            if (a.a.stopSelfResult(a.a))
            {
                if (!g.a)
                {
                    break label0;
                }
                a.a.c("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        a.a.c("Local AnalyticsService processed last dispatch request");
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/gms/analytics/AnalyticsService$1

/* anonymous class */
    final class AnalyticsService._cls1
        implements aj
    {

        final int a;
        final s b;
        final com.google.android.gms.analytics.internal.g c;
        final AnalyticsService d;

        public final void a()
        {
            AnalyticsService.a(d).post(new AnalyticsService._cls1._cls1(this));
        }

            
            {
                d = analyticsservice;
                a = i;
                b = s;
                c = g1;
                super();
            }
    }

}
