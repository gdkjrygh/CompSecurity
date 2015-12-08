// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzg, zzaf, zzr, zze, 
//            zzai, zzan, zzn, zza, 
//            zzk, zzu, zzv, zzb, 
//            zzy, zzd

public class zzf
{

    private static zzf zzJC;
    private final Context mContext;
    private final Context zzJD;
    private final zzr zzJE;
    private final zzaf zzJF;
    private final zzns zzJG;
    private final zzb zzJH;
    private final zzv zzJI;
    private final zzan zzJJ;
    private final zzai zzJK;
    private final GoogleAnalytics zzJL;
    private final zzn zzJM;
    private final zza zzJN;
    private final zzk zzJO;
    private final com.google.android.gms.analytics.internal.zzu zzJP;
    private final zzlb zzpw;

    protected zzf(zzg zzg1)
    {
        Object obj = zzg1.getApplicationContext();
        zzu.zzb(obj, "Application context can't be null");
        zzu.zzb(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = zzg1.zzic();
        zzu.zzu(obj1);
        mContext = ((Context) (obj));
        zzJD = ((Context) (obj1));
        zzpw = zzg1.zzh(this);
        zzJE = zzg1.zzg(this);
        obj1 = zzg1.zzf(this);
        ((zzaf) (obj1)).zza();
        zzJF = ((zzaf) (obj1));
        zzn zzn1;
        zza zza1;
        zzk zzk1;
        com.google.android.gms.analytics.internal.zzu zzu1;
        if (zzhR().zziW())
        {
            zzhQ().zzaV((new StringBuilder()).append("Google Analytics ").append(zze.VERSION).append(" is starting up.").toString());
        } else
        {
            zzhQ().zzaV((new StringBuilder()).append("Google Analytics ").append(zze.VERSION).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = zzg1.zzq(this);
        ((zzai) (obj1)).zza();
        zzJK = ((zzai) (obj1));
        obj1 = zzg1.zze(this);
        ((zzan) (obj1)).zza();
        zzJJ = ((zzan) (obj1));
        obj1 = zzg1.zzl(this);
        zzn1 = zzg1.zzd(this);
        zza1 = zzg1.zzc(this);
        zzk1 = zzg1.zzb(this);
        zzu1 = zzg1.zza(this);
        obj = zzg1.zzW(((Context) (obj)));
        ((zzns) (obj)).zza(zzib());
        zzJG = ((zzns) (obj));
        obj = zzg1.zzi(this);
        zzn1.zza();
        zzJM = zzn1;
        zza1.zza();
        zzJN = zza1;
        zzk1.zza();
        zzJO = zzk1;
        zzu1.zza();
        zzJP = zzu1;
        zzg1 = zzg1.zzp(this);
        zzg1.zza();
        zzJI = zzg1;
        ((zzb) (obj1)).zza();
        zzJH = ((zzb) (obj1));
        if (zzhR().zziW())
        {
            zzhQ().zzb("Device AnalyticsService version", zze.VERSION);
        }
        ((GoogleAnalytics) (obj)).zza();
        zzJL = ((GoogleAnalytics) (obj));
        ((zzb) (obj1)).start();
    }

    public static zzf zzV(Context context)
    {
        zzu.zzu(context);
        if (zzJC != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        if (zzJC != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzlb zzlb1 = zzld.zzoQ();
        l = zzlb1.elapsedRealtime();
        context = new zzf(new zzg(context.getApplicationContext()));
        zzJC = context;
        GoogleAnalytics.zzhj();
        l = zzlb1.elapsedRealtime() - l;
        l1 = ((Long)zzy.zzLP.get()).longValue();
        if (l <= l1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.zzhQ().zzc("Slow initialization (ms)", Long.valueOf(l), Long.valueOf(l1));
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
_L2:
        return zzJC;
        context;
        com/google/android/gms/analytics/internal/zzf;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void zza(zzd zzd1)
    {
        zzu.zzb(zzd1, "Analytics service not created/initialized");
        zzu.zzb(zzd1.isInitialized(), "Analytics service not initialized");
    }

    public Context getContext()
    {
        return mContext;
    }

    public void zzhO()
    {
        zzns.zzhO();
    }

    public zzlb zzhP()
    {
        return zzpw;
    }

    public zzaf zzhQ()
    {
        zza(zzJF);
        return zzJF;
    }

    public zzr zzhR()
    {
        return zzJE;
    }

    public zzns zzhS()
    {
        zzu.zzu(zzJG);
        return zzJG;
    }

    public zzv zzhT()
    {
        zza(zzJI);
        return zzJI;
    }

    public zzai zzhU()
    {
        zza(zzJK);
        return zzJK;
    }

    public zzk zzhX()
    {
        zza(zzJO);
        return zzJO;
    }

    public com.google.android.gms.analytics.internal.zzu zzhY()
    {
        return zzJP;
    }

    public zzb zzhl()
    {
        zza(zzJH);
        return zzJH;
    }

    public zzan zzhm()
    {
        zza(zzJJ);
        return zzJJ;
    }

    protected Thread.UncaughtExceptionHandler zzib()
    {
        return new Thread.UncaughtExceptionHandler() {

            final zzf zzJQ;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = zzJQ.zzid();
                if (thread != null)
                {
                    thread.zze("Job execution failed", throwable);
                }
            }

            
            {
                zzJQ = zzf.this;
                super();
            }
        };
    }

    public Context zzic()
    {
        return zzJD;
    }

    public zzaf zzid()
    {
        return zzJF;
    }

    public GoogleAnalytics zzie()
    {
        zzu.zzu(zzJL);
        zzu.zzb(zzJL.isInitialized(), "Analytics instance not initialized");
        return zzJL;
    }

    public zzai zzif()
    {
        if (zzJK == null || !zzJK.isInitialized())
        {
            return null;
        } else
        {
            return zzJK;
        }
    }

    public zza zzig()
    {
        zza(zzJN);
        return zzJN;
    }

    public zzn zzih()
    {
        zza(zzJM);
        return zzJM;
    }
}
