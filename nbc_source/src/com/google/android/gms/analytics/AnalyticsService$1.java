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

class zzIh
    implements zzw
{

    final int zzIf;
    final zzf zzIg;
    final zzaf zzIh;
    final AnalyticsService zzIi;

    public void zzc(Throwable throwable)
    {
        AnalyticsService.zza(zzIi).post(new Runnable() {

            final AnalyticsService._cls1 zzIj;

            public void run()
            {
label0:
                {
                    if (zzIj.zzIi.stopSelfResult(zzIj.zzIf))
                    {
                        if (!zzIj.zzIg.zzhR().zziW())
                        {
                            break label0;
                        }
                        zzIj.zzIh.zzaT("Device AnalyticsService processed last dispatch request");
                    }
                    return;
                }
                zzIj.zzIh.zzaT("Local AnalyticsService processed last dispatch request");
            }

            
            {
                zzIj = AnalyticsService._cls1.this;
                super();
            }
        });
    }

    _cls1.zzIj(AnalyticsService analyticsservice, int i, zzf zzf, zzaf zzaf)
    {
        zzIi = analyticsservice;
        zzIf = i;
        zzIg = zzf;
        zzIh = zzaf;
        super();
    }
}
