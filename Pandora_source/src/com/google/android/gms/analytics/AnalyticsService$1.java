// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.analytics.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

class c
    implements zzv
{

    final int a;
    final zze b;
    final zzae c;
    final AnalyticsService d;

    public void zzc(Throwable throwable)
    {
        AnalyticsService.zza(d).post(new Runnable() {

            final AnalyticsService._cls1 a;

            public void run()
            {
label0:
                {
                    if (a.d.stopSelfResult(a.a))
                    {
                        if (!a.b.zzgI().zzhP())
                        {
                            break label0;
                        }
                        a.c.zzaF("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                a.c.zzaF("Local AnalyticsService processed last dispatch request");
            }

            
            {
                a = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.a(AnalyticsService analyticsservice, int i, zze zze, zzae zzae)
    {
        d = analyticsservice;
        a = i;
        b = zze;
        c = zzae;
        super();
    }
}
