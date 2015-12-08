// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzra;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            TrackerHandler, zzv, zzy, zzk, 
//            zzg, zzai, zza, zzx, 
//            Tracker, zzae, zzz, zzaa, 
//            zzaj, Logger, zzan, zzf, 
//            zzak, zzd

public class GoogleAnalytics extends TrackerHandler
{

    private static volatile GoogleAnalytics zzEl;
    private static List zzEm;
    private static boolean zzEv;
    private final Context mContext;
    private final zzra zzAM;
    private final zzk zzAN;
    private final zzf zzBS;
    private String zzBa;
    private String zzBb;
    private boolean zzBs;
    private final zzy zzEn;
    private final zzaj zzEo;
    private final zzai zzEp;
    private final zzg zzEq;
    private final zza zzEr;
    private Set zzEs;
    private volatile boolean zzEu;

    protected GoogleAnalytics(Context context)
    {
        this(context, null, ((zzaj) (zzv.zzfE())), null);
    }

    protected GoogleAnalytics(Context context, zzf zzf1, zzaj zzaj1, zzak zzak)
    {
        com.google.android.gms.common.internal.zzx.zzl(context);
        context = context.getApplicationContext();
        com.google.android.gms.common.internal.zzx.zzl(context);
        com.google.android.gms.common.internal.zzx.zzl(zzaj1);
        zzEn = zzy.zzfV();
        mContext = context;
        zzAM = zzra.zzaf(context);
        com.google.android.gms.common.internal.zzx.zzl(zzAM);
        zzEo = zzaj1;
        if (zzf1 != null)
        {
            zzBS = zzf1;
        } else
        {
            zzBS = new com.google.android.gms.analytics.zzx(this, zzak);
        }
        zzAN = new zzk(zzAM);
        zzEq = new zzg(zzAM);
        zzEp = new zzai(zzAM);
        zzEr = new zza(zzAM, zzAN);
        zzEs = new HashSet();
        zzgk();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        com.google.android.gms.common.internal.zzx.zzl(context);
        if (zzEl != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzEl != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        zzEl = new GoogleAnalytics(context);
        if (zzEm == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        for (context = zzEm.iterator(); context.hasNext(); ((Runnable)context.next()).run()) { }
        break MISSING_BLOCK_LABEL_78;
        context;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw context;
        zzEm = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
_L2:
        return zzEl;
    }

    private Tracker zza(Tracker tracker)
    {
        if (zzBa != null)
        {
            tracker.set("&an", zzBa);
        }
        if (zzBb != null)
        {
            tracker.set("&av", zzBb);
        }
        return tracker;
    }

    private int zzao(String s)
    {
        s = s.toLowerCase();
        if ("verbose".equals(s))
        {
            return 0;
        }
        if ("info".equals(s))
        {
            return 1;
        }
        if ("warning".equals(s))
        {
            return 2;
        }
        return !"error".equals(s) ? -1 : 3;
    }

    static GoogleAnalytics zzgj()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = zzEl;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void zzgk()
    {
        if (!zzEv)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                zzae.zzab((new StringBuilder("PackageManager doesn't know about package: ")).append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                zzae.zzac("Couldn't get ApplicationInfo to load global config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    zzaa zzaa1 = (zzaa)(new zzz(mContext)).zzD(i);
                    if (zzaa1 != null)
                    {
                        zza(zzaa1);
                        return;
                    }
                }
            }
        }
    }

    public void dispatchLocalHits()
    {
        zzEo.dispatchLocalHits();
    }

    public boolean getAppOptOut()
    {
        zzEn.zza(zzy.zza.zzDM);
        return zzEu;
    }

    public String getClientId()
    {
        return zzAN.getValue("&cid");
    }

    public Context getContext()
    {
        return mContext;
    }

    public Logger getLogger()
    {
        return zzae.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        zzEn.zza(zzy.zza.zzDY);
        return zzBs;
    }

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzEn.zza(zzy.zza.zzDI);
        s = zza(new Tracker(this, s, null, null));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void setDryRun(boolean flag)
    {
        zzEn.zza(zzy.zza.zzDX);
        zzBs = flag;
    }

    public void setLogger(Logger logger)
    {
        zzEn.zza(zzy.zza.zzDZ);
        zzae.setLogger(logger);
    }

    void zza(zzaa zzaa1)
    {
        zzae.zzab("Loading global config values.");
        if (zzaa1.zzfZ())
        {
            zzBa = zzaa1.zzga();
            zzae.zzab((new StringBuilder("app name loaded: ")).append(zzBa).toString());
        }
        if (zzaa1.zzgb())
        {
            zzBb = zzaa1.zzgc();
            zzae.zzab((new StringBuilder("app version loaded: ")).append(zzBb).toString());
        }
        if (zzaa1.zzgd())
        {
            int i = zzao(zzaa1.zzge());
            if (i >= 0)
            {
                zzae.zzab((new StringBuilder("log level loaded: ")).append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (zzaa1.zzgf())
        {
            zzEo.setLocalDispatchPeriod(zzaa1.zzgg());
        }
        if (zzaa1.zzgh())
        {
            setDryRun(zzaa1.zzgi());
        }
    }

    zzd zzgl()
    {
        return zzEo.zzE(mContext);
    }

    zzf zzgm()
    {
        return zzBS;
    }

    public zzg zzgo()
    {
        return zzEq;
    }

    public zzk zzgp()
    {
        return zzAN;
    }

    public zza zzgq()
    {
        return zzEr;
    }

    void zzx(Map map)
    {
        com.google.android.gms.common.internal.zzx.zzl(map);
        this;
        JVM INSTR monitorenter ;
        zzan.zza(map, "&ul", zzan.zza(Locale.getDefault()));
        zzan.zza(map, "&sr", zzEp);
        map.put("&_u", zzEn.zzfX());
        zzEn.zzfW();
        zzBS.zzx(map);
        this;
        JVM INSTR monitorexit ;
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }
}
