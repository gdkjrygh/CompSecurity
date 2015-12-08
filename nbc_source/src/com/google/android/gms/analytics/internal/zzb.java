// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzg, zzl, zzf, 
//            zzh, zzab, zzw

public class zzb extends zzd
{

    private final zzl zzJq;

    public zzb(zzf zzf, zzg zzg1)
    {
        super(zzf);
        zzu.zzu(zzg1);
        zzJq = zzg1.zzj(zzf);
    }

    static zzl zza(zzb zzb1)
    {
        return zzb1.zzJq;
    }

    void onServiceConnected()
    {
        zzhO();
        zzJq.onServiceConnected();
    }

    public void start()
    {
        zzJq.start();
    }

    public void zzG(boolean flag)
    {
        zza("Network connectivity status changed", Boolean.valueOf(flag));
        zzhS().zze(new Runnable(flag) {

            final zzb zzJs;
            final boolean zzJt;

            public void run()
            {
                zzb.zza(zzJs).zzG(zzJt);
            }

            
            {
                zzJs = zzb.this;
                zzJt = flag;
                super();
            }
        });
    }

    public long zza(zzh zzh)
    {
        zzia();
        zzu.zzu(zzh);
        zzhO();
        long l = zzJq.zza(zzh, true);
        if (l == 0L)
        {
            zzJq.zzc(zzh);
        }
        return l;
    }

    public void zza(zzab zzab)
    {
        zzu.zzu(zzab);
        zzia();
        zzb("Hit delivery requested", zzab);
        zzhS().zze(new Runnable(zzab) {

            final zzb zzJs;
            final zzab zzJw;

            public void run()
            {
                zzb.zza(zzJs).zza(zzJw);
            }

            
            {
                zzJs = zzb.this;
                zzJw = zzab;
                super();
            }
        });
    }

    public void zza(zzw zzw)
    {
        zzia();
        zzhS().zze(new Runnable(zzw) {

            final zzb zzJs;
            final zzw zzJx;

            public void run()
            {
                zzb.zza(zzJs).zzb(zzJx);
            }

            
            {
                zzJs = zzb.this;
                zzJx = zzw;
                super();
            }
        });
    }

    public void zza(String s, Runnable runnable)
    {
        zzu.zzh(s, "campaign param can't be empty");
        zzhS().zze(new Runnable(s, runnable) {

            final zzb zzJs;
            final String zzJu;
            final Runnable zzJv;

            public void run()
            {
                zzb.zza(zzJs).zzbb(zzJu);
                if (zzJv != null)
                {
                    zzJv.run();
                }
            }

            
            {
                zzJs = zzb.this;
                zzJu = s;
                zzJv = runnable;
                super();
            }
        });
    }

    public void zzhH()
    {
        zzia();
        Context context = getContext();
        if (AnalyticsReceiver.zzT(context) && AnalyticsService.zzU(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            zza(((zzw) (null)));
            return;
        }
    }

    public void zzhJ()
    {
        zzia();
        zzns.zzhO();
        zzJq.zzhJ();
    }

    public void zzhK()
    {
        zzaT("Radio powered up");
        zzhH();
    }

    void zzhL()
    {
        zzhO();
        zzJq.zzhL();
    }

    protected void zzhn()
    {
        zzJq.zza();
    }
}
