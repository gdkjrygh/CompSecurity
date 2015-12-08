// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            TrackerHandler, s, q, g, 
//            ad, h, k, Tracker, 
//            z, u, v, Logger, 
//            ae, t, ah, ai, 
//            f, aj

public class GoogleAnalytics extends TrackerHandler
{
    static interface a
    {

        public abstract void i(Activity activity);

        public abstract void j(Activity activity);
    }

    class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics AD;

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
            AD.g(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            AD.h(activity);
        }

        b()
        {
            AD = GoogleAnalytics.this;
            super();
        }
    }


    private static GoogleAnalytics AC;
    private static boolean Av;
    private Set AA;
    private boolean AB;
    private boolean Aw;
    private ae Ax;
    private volatile Boolean Ay;
    private Logger Az;
    private Context mContext;
    private String xL;
    private String xM;
    private f ye;

    protected GoogleAnalytics(Context context)
    {
        this(context, ((f) (s.B(context))), ((ae) (q.dZ())));
    }

    private GoogleAnalytics(Context context, f f1, ae ae1)
    {
        Ay = Boolean.valueOf(false);
        AB = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            ye = f1;
            Ax = ae1;
            com.google.android.gms.analytics.g.y(mContext);
            ad.y(mContext);
            com.google.android.gms.analytics.h.y(mContext);
            Az = new k();
            AA = new HashSet();
            eE();
            return;
        }
    }

    private Tracker a(Tracker tracker)
    {
        if (xL != null)
        {
            tracker.set("&an", xL);
        }
        if (xM != null)
        {
            tracker.set("&av", xM);
        }
        return tracker;
    }

    private int ai(String s1)
    {
        s1 = s1.toLowerCase();
        if ("verbose".equals(s1))
        {
            return 0;
        }
        if ("info".equals(s1))
        {
            return 1;
        }
        if ("warning".equals(s1))
        {
            return 2;
        }
        return !"error".equals(s1) ? -1 : 3;
    }

    static GoogleAnalytics eD()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = AC;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void eE()
    {
        if (!Av)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                z.V((new StringBuilder()).append("PackageManager doesn't know about package: ").append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                z.W("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    v v1 = (v)(new u(mContext)).w(i);
                    if (v1 != null)
                    {
                        a(v1);
                        return;
                    }
                }
            }
        }
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (AC == null)
        {
            AC = new GoogleAnalytics(context);
        }
        context = AC;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw context;
    }

    void a(a a1)
    {
        AA.add(a1);
        if (mContext instanceof Application)
        {
            enableAutoActivityReports((Application)mContext);
        }
    }

    void a(v v1)
    {
        z.V("Loading global config values.");
        if (v1.et())
        {
            xL = v1.eu();
            z.V((new StringBuilder()).append("app name loaded: ").append(xL).toString());
        }
        if (v1.ev())
        {
            xM = v1.ew();
            z.V((new StringBuilder()).append("app version loaded: ").append(xM).toString());
        }
        if (v1.ex())
        {
            int i = ai(v1.ey());
            if (i >= 0)
            {
                z.V((new StringBuilder()).append("log level loaded: ").append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (v1.ez())
        {
            Ax.setLocalDispatchPeriod(v1.eA());
        }
        if (v1.eB())
        {
            setDryRun(v1.eC());
        }
    }

    void b(a a1)
    {
        AA.remove(a1);
    }

    public void dispatchLocalHits()
    {
        Ax.dispatchLocalHits();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !AB)
        {
            application.registerActivityLifecycleCallbacks(new b());
            AB = true;
        }
    }

    void g(Activity activity)
    {
        for (Iterator iterator = AA.iterator(); iterator.hasNext(); ((a)iterator.next()).i(activity)) { }
    }

    public boolean getAppOptOut()
    {
        t.ep().a(t.a.zW);
        return Ay.booleanValue();
    }

    public Logger getLogger()
    {
        return Az;
    }

    void h(Activity activity)
    {
        for (Iterator iterator = AA.iterator(); iterator.hasNext(); ((a)iterator.next()).j(activity)) { }
    }

    public boolean isDryRunEnabled()
    {
        t.ep().a(t.a.Ai);
        return Aw;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker;
        t.ep().a(t.a.zS);
        tracker = new Tracker(null, this, mContext);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ai ai1 = (ai)(new ah(mContext)).w(i);
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        tracker.a(ai1);
        tracker = a(tracker);
        this;
        JVM INSTR monitorexit ;
        return tracker;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Tracker newTracker(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        t.ep().a(t.a.zS);
        s1 = a(new Tracker(s1, this, mContext));
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void reportActivityStart(Activity activity)
    {
        if (!AB)
        {
            g(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!AB)
        {
            h(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        t.ep().a(t.a.zV);
        Ay = Boolean.valueOf(flag);
        if (Ay.booleanValue())
        {
            ye.dH();
        }
    }

    public void setDryRun(boolean flag)
    {
        t.ep().a(t.a.Ah);
        Aw = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        Ax.setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        t.ep().a(t.a.Aj);
        Az = logger;
    }

    void u(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new IllegalArgumentException("hit cannot be null");
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
        aj.a(map, "&ul", aj.a(Locale.getDefault()));
        aj.a(map, "&sr", ad.eQ());
        map.put("&_u", t.ep().er());
        t.ep().eq();
        ye.u(map);
        this;
        JVM INSTR monitorexit ;
    }
}
