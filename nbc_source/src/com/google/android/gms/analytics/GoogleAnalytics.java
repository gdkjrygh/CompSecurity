// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzy;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zza, Tracker, Logger

public final class GoogleAnalytics extends zza
{

    private static List zzIt = new ArrayList();
    private boolean zzIu;
    private Set zzIv;
    private boolean zzIx;
    private volatile boolean zzIy;
    private boolean zzIz;
    private boolean zzpb;

    public GoogleAnalytics(zzf zzf1)
    {
        super(zzf1);
        zzIv = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        return zzf.zzV(context).zzie();
    }

    public static void zzhj()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzIt == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = zzIt.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        zzIt = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private zzan zzhm()
    {
        return zzhb().zzhm();
    }

    public boolean getAppOptOut()
    {
        return zzIy;
    }

    public String getClientId()
    {
        zzu.zzbZ("getClientId can not be called from the main thread");
        return zzhb().zzih().zziP();
    }

    public Logger getLogger()
    {
        return zzae.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        return zzIx;
    }

    public boolean isInitialized()
    {
        return zzpb && !zzIu;
    }

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Tracker(zzhb(), s, null);
        s.zza();
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
        zzIx = flag;
    }

    public void setLogger(Logger logger)
    {
        zzae.setLogger(logger);
        if (!zzIz)
        {
            Log.i((String)zzy.zzLb.get(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzy.zzLb.get()).append(" DEBUG").toString());
            zzIz = true;
        }
    }

    public void zza()
    {
        zzhi();
        zzpb = true;
    }

    void zzhi()
    {
        zzan zzan1 = zzhm();
        if (zzan1.zzjO())
        {
            getLogger().setLogLevel(zzan1.getLogLevel());
        }
        if (zzan1.zzjS())
        {
            setDryRun(zzan1.zzjT());
        }
        if (zzan1.zzjO())
        {
            Logger logger = zzae.getLogger();
            if (logger != null)
            {
                logger.setLogLevel(zzan1.getLogLevel());
            }
        }
    }

}
