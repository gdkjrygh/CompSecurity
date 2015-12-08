// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaj;
import com.google.android.gms.analytics.internal.zzak;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzx;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            zza, Tracker, Logger

public final class GoogleAnalytics extends zza
{
    static interface a
    {

        public abstract void a(Activity activity);

        public abstract void b(Activity activity);
    }

    class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics a;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
        }

        public void onActivityResumed(Activity activity)
        {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
            a.zzl(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            a.zzm(activity);
        }

        b()
        {
            a = GoogleAnalytics.this;
            super();
        }
    }


    private static List zzEw = new ArrayList();
    private boolean zzEA;
    private volatile boolean zzEB;
    private boolean zzEC;
    private boolean zzEx;
    private Set zzEy;
    private boolean zzEz;
    private boolean zznz;

    public GoogleAnalytics(zze zze1)
    {
        super(zze1);
        zzEy = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        return zze.zzJ(context).zzgV();
    }

    public static void zzfX()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (zzEw == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = zzEw.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
        zzEw = null;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
    }

    private zzb zzfZ()
    {
        return zzfO().zzfZ();
    }

    private zzam zzga()
    {
        return zzfO().zzga();
    }

    public void dispatchLocalHits()
    {
        zzfZ().zzgw();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !zzEz)
        {
            application.registerActivityLifecycleCallbacks(new b());
            zzEz = true;
        }
    }

    public boolean getAppOptOut()
    {
        return zzEB;
    }

    public String getClientId()
    {
        zzv.zzbJ("getClientId can not be called from the main thread");
        return zzfO().zzgY().zzhI();
    }

    public Logger getLogger()
    {
        return zzad.getLogger();
    }

    public boolean isDryRunEnabled()
    {
        return zzEA;
    }

    public boolean isInitialized()
    {
        return zznz && !zzEx;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker = new Tracker(zzfO(), null, null);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        zzak zzak1 = (zzak)(new zzaj(zzfO())).zzS(i);
        if (zzak1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        tracker.zza(zzak1);
        tracker.zzfV();
        this;
        JVM INSTR monitorexit ;
        return tracker;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Tracker(zzfO(), s, null);
        s.zzfV();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void reportActivityStart(Activity activity)
    {
        if (!zzEz)
        {
            zzl(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!zzEz)
        {
            zzm(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        zzEB = flag;
        if (zzEB)
        {
            zzfZ().zzgv();
        }
    }

    public void setDryRun(boolean flag)
    {
        zzEA = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzfZ().setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        zzad.setLogger(logger);
        if (!zzEC)
        {
            Log.i((String)zzx.zzHf.get(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzx.zzHf.get()).append(" DEBUG").toString());
            zzEC = true;
        }
    }

    void zza(a a1)
    {
        zzEy.add(a1);
        a1 = zzfO().getContext();
        if (a1 instanceof Application)
        {
            enableAutoActivityReports((Application)a1);
        }
    }

    void zzb(a a1)
    {
        zzEy.remove(a1);
    }

    public void zzfV()
    {
        zzfW();
        zznz = true;
    }

    void zzfW()
    {
        zzam zzam1 = zzga();
        if (zzam1.zziH())
        {
            getLogger().setLogLevel(zzam1.getLogLevel());
        }
        if (zzam1.zziL())
        {
            setDryRun(zzam1.zziM());
        }
        if (zzam1.zziH())
        {
            Logger logger = zzad.getLogger();
            if (logger != null)
            {
                logger.setLogLevel(zzam1.getLogLevel());
            }
        }
    }

    void zzfY()
    {
        zzfZ().zzgx();
    }

    void zzl(Activity activity)
    {
        for (Iterator iterator = zzEy.iterator(); iterator.hasNext(); ((a)iterator.next()).a(activity)) { }
    }

    void zzm(Activity activity)
    {
        for (Iterator iterator = zzEy.iterator(); iterator.hasNext(); ((a)iterator.next()).b(activity)) { }
    }

}
