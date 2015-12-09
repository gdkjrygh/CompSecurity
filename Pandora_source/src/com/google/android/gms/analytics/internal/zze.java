// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzae, zzq, zzah, 
//            zzam, zzm, zza, zzj, 
//            zzt, zzu, zzb, zzx, 
//            zzd

public class zze
{

    private static zze zzFG;
    private final Context mContext;
    private final Context zzFH;
    private final zzq zzFI;
    private final zzae zzFJ;
    private final zzkk zzFK;
    private final zzb zzFL;
    private final zzu zzFM;
    private final zzam zzFN;
    private final zzah zzFO;
    private final GoogleAnalytics zzFP;
    private final zzm zzFQ;
    private final zza zzFR;
    private final zzj zzFS;
    private final zzt zzFT;
    private final zzht zznR;

    protected zze(zzf zzf1)
    {
        Object obj = zzf1.getApplicationContext();
        zzv.zzb(obj, "Application context can't be null");
        zzv.zzb(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = zzf1.zzgT();
        zzv.zzr(obj1);
        mContext = ((Context) (obj));
        zzFH = ((Context) (obj1));
        zznR = zzf1.zzh(this);
        zzFI = zzf1.zzg(this);
        obj1 = zzf1.zzf(this);
        ((zzae) (obj1)).zzfV();
        zzFJ = ((zzae) (obj1));
        zzm zzm1;
        zza zza1;
        zzj zzj1;
        zzt zzt1;
        if (zzgI().zzhP())
        {
            zzgH().zzaH((new StringBuilder()).append("Google Analytics 4.5.0/").append(zzgZ()).append(" is starting up.").toString());
        } else
        {
            zzgH().zzaH((new StringBuilder()).append("Google Analytics 4.5.0/").append(zzgZ()).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = zzf1.zzq(this);
        ((zzah) (obj1)).zzfV();
        zzFO = ((zzah) (obj1));
        obj1 = zzf1.zze(this);
        ((zzam) (obj1)).zzfV();
        zzFN = ((zzam) (obj1));
        obj1 = zzf1.zzl(this);
        zzm1 = zzf1.zzd(this);
        zza1 = zzf1.zzc(this);
        zzj1 = zzf1.zzb(this);
        zzt1 = zzf1.zza(this);
        obj = zzf1.zzK(((Context) (obj)));
        ((zzkk) (obj)).zza(zzgS());
        zzFK = ((zzkk) (obj));
        obj = zzf1.zzi(this);
        zzm1.zzfV();
        zzFQ = zzm1;
        zza1.zzfV();
        zzFR = zza1;
        zzj1.zzfV();
        zzFS = zzj1;
        zzt1.zzfV();
        zzFT = zzt1;
        zzf1 = zzf1.zzp(this);
        zzf1.zzfV();
        zzFM = zzf1;
        ((zzb) (obj1)).zzfV();
        zzFL = ((zzb) (obj1));
        if (zzgI().zzhP())
        {
            zzgH().zzb("Device AnalyticsService version", zzfZ().zzgy());
        }
        ((GoogleAnalytics) (obj)).zzfV();
        zzFP = ((GoogleAnalytics) (obj));
        ((zzb) (obj1)).start();
    }

    public static zze zzJ(Context context)
    {
        zzv.zzr(context);
        if (zzFG != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/zze;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        if (zzFG != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zzht zzht1 = zzhv.zznd();
        l = zzht1.elapsedRealtime();
        context = new zze(new zzf(context.getApplicationContext()));
        zzFG = context;
        GoogleAnalytics.zzfX();
        l = zzht1.elapsedRealtime() - l;
        l1 = ((Long)zzx.zzHT.get()).longValue();
        if (l <= l1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.zzgH().zzc("Slow initialization (ms)", Long.valueOf(l), Long.valueOf(l1));
        com/google/android/gms/analytics/internal/zze;
        JVM INSTR monitorexit ;
_L2:
        return zzFG;
        context;
        com/google/android/gms/analytics/internal/zze;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void zza(zzd zzd1)
    {
        zzv.zzb(zzd1, "Analytics service not created/initialized");
        zzv.zzb(zzd1.isInitialized(), "Analytics service not initialized");
    }

    static int zzgZ()
    {
        return 7327;
    }

    public Context getContext()
    {
        return mContext;
    }

    public zzb zzfZ()
    {
        zza(zzFL);
        return zzFL;
    }

    public void zzgF()
    {
        zzkk.zzgF();
    }

    public zzht zzgG()
    {
        return zznR;
    }

    public zzae zzgH()
    {
        zza(zzFJ);
        return zzFJ;
    }

    public zzq zzgI()
    {
        return zzFI;
    }

    public zzkk zzgJ()
    {
        zzv.zzr(zzFK);
        return zzFK;
    }

    public zzu zzgK()
    {
        zza(zzFM);
        return zzFM;
    }

    public zzah zzgL()
    {
        zza(zzFO);
        return zzFO;
    }

    public zzj zzgO()
    {
        zza(zzFS);
        return zzFS;
    }

    public zzt zzgP()
    {
        return zzFT;
    }

    protected Thread.UncaughtExceptionHandler zzgS()
    {
        return new Thread.UncaughtExceptionHandler() {

            final zze a;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = a.zzgU();
                if (thread != null)
                {
                    thread.zze("Job execution failed", throwable);
                }
            }

            
            {
                a = zze.this;
                super();
            }
        };
    }

    public Context zzgT()
    {
        return zzFH;
    }

    public zzae zzgU()
    {
        return zzFJ;
    }

    public GoogleAnalytics zzgV()
    {
        zzv.zzr(zzFP);
        zzv.zzb(zzFP.isInitialized(), "Analytics instance not initialized");
        return zzFP;
    }

    public zzah zzgW()
    {
        if (zzFO == null || !zzFO.isInitialized())
        {
            return null;
        } else
        {
            return zzFO;
        }
    }

    public zza zzgX()
    {
        zza(zzFR);
        return zzFR;
    }

    public zzm zzgY()
    {
        zza(zzFQ);
        return zzFQ;
    }

    public zzam zzga()
    {
        zza(zzFN);
        return zzFN;
    }
}
