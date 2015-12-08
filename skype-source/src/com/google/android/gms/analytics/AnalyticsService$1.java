// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.aj;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.s;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

final class c
    implements aj
{

    final int a;
    final s b;
    final g c;
    final AnalyticsService d;

    public final void a()
    {
        AnalyticsService.a(d).post(new Runnable() {

            final AnalyticsService._cls1 a;

            public final void run()
            {
label0:
                {
                    if (a.d.stopSelfResult(a.a))
                    {
                        if (!com.google.android.gms.common.internal.g.a)
                        {
                            break label0;
                        }
                        a.c.c("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                a.c.c("Local AnalyticsService processed last dispatch request");
            }

            
            {
                a = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.a(AnalyticsService analyticsservice, int i, s s, g g)
    {
        d = analyticsservice;
        a = i;
        b = s;
        c = g;
        super();
    }
}
