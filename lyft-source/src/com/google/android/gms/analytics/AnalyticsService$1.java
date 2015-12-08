// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.analytics.internal.zzw;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

class c
    implements zzw
{

    final int a;
    final zzf b;
    final zzaf c;
    final AnalyticsService d;

    public void a(Throwable throwable)
    {
        AnalyticsService.a(d).post(new Runnable() {

            final AnalyticsService._cls1 a;

            public void run()
            {
label0:
                {
                    if (a.d.stopSelfResult(a.a))
                    {
                        if (!a.b.e().a())
                        {
                            break label0;
                        }
                        a.c.b("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                a.c.b("Local AnalyticsService processed last dispatch request");
            }

            
            {
                a = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.a(AnalyticsService analyticsservice, int i, zzf zzf, zzaf zzaf)
    {
        d = analyticsservice;
        a = i;
        b = zzf;
        c = zzaf;
        super();
    }
}
