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
//            TrackerHandler, t, r, g, 
//            ae, h, l, Tracker, 
//            aa, v, w, Logger, 
//            af, u, ai, aj, 
//            ak, f

public class GoogleAnalytics extends TrackerHandler
{
    static interface a
    {

        public abstract void h(Activity activity);

        public abstract void i(Activity activity);
    }

    class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics wr;

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
            GoogleAnalytics.a(wr, activity);
        }

        public void onActivityStopped(Activity activity)
        {
            GoogleAnalytics.b(wr, activity);
        }

        b()
        {
            wr = GoogleAnalytics.this;
            super();
        }
    }


    private static boolean wj;
    private static GoogleAnalytics wq;
    private Context mContext;
    private String tA;
    private f tS;
    private String tz;
    private boolean wk;
    private af wl;
    private volatile Boolean wm;
    private Logger wn;
    private Set wo;
    private boolean wp;

    protected GoogleAnalytics(Context context)
    {
        this(context, ((f) (t.u(context))), ((af) (r.cz())));
    }

    private GoogleAnalytics(Context context, f f1, af af1)
    {
        wm = Boolean.valueOf(false);
        wp = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            tS = f1;
            wl = af1;
            com.google.android.gms.analytics.g.r(mContext);
            ae.r(mContext);
            h.r(mContext);
            wn = new l();
            wo = new HashSet();
            de();
            return;
        }
    }

    private int P(String s)
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

    private Tracker a(Tracker tracker)
    {
        if (tz != null)
        {
            tracker.set("&an", tz);
        }
        if (tA != null)
        {
            tracker.set("&av", tA);
        }
        return tracker;
    }

    static void a(GoogleAnalytics googleanalytics, Activity activity)
    {
        googleanalytics.f(activity);
    }

    static void b(GoogleAnalytics googleanalytics, Activity activity)
    {
        googleanalytics.g(activity);
    }

    static GoogleAnalytics dd()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = wq;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void de()
    {
        if (!wj)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                aa.C((new StringBuilder()).append("PackageManager doesn't know about package: ").append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                aa.D("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    w w1 = (w)(new v(mContext)).r(i);
                    if (w1 != null)
                    {
                        a(w1);
                        return;
                    }
                }
            }
        }
    }

    private void f(Activity activity)
    {
        for (Iterator iterator = wo.iterator(); iterator.hasNext(); ((a)iterator.next()).h(activity)) { }
    }

    private void g(Activity activity)
    {
        for (Iterator iterator = wo.iterator(); iterator.hasNext(); ((a)iterator.next()).i(activity)) { }
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (wq == null)
        {
            wq = new GoogleAnalytics(context);
        }
        context = wq;
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
        wo.add(a1);
    }

    void a(w w1)
    {
        aa.C("Loading global config values.");
        if (w1.cT())
        {
            tz = w1.cU();
            aa.C((new StringBuilder()).append("app name loaded: ").append(tz).toString());
        }
        if (w1.cV())
        {
            tA = w1.cW();
            aa.C((new StringBuilder()).append("app version loaded: ").append(tA).toString());
        }
        if (w1.cX())
        {
            int i = P(w1.cY());
            if (i >= 0)
            {
                aa.C((new StringBuilder()).append("log level loaded: ").append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (w1.cZ())
        {
            wl.setLocalDispatchPeriod(w1.da());
        }
        if (w1.db())
        {
            setDryRun(w1.dc());
        }
    }

    void b(a a1)
    {
        wo.remove(a1);
    }

    public void dispatchLocalHits()
    {
        wl.dispatchLocalHits();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !wp)
        {
            application.registerActivityLifecycleCallbacks(new b());
            wp = true;
        }
    }

    public boolean getAppOptOut()
    {
        u.cP().a(u.a.vK);
        return wm.booleanValue();
    }

    public Logger getLogger()
    {
        return wn;
    }

    public boolean isDryRunEnabled()
    {
        u.cP().a(u.a.vW);
        return wk;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker;
        u.cP().a(u.a.vG);
        tracker = new Tracker(null, this, mContext);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aj aj1 = (aj)(new ai(mContext)).r(i);
        if (aj1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        tracker.a(aj1);
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

    public Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        u.cP().a(u.a.vG);
        s = a(new Tracker(s, this, mContext));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    void p(Map map)
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
        ak.a(map, "&ul", ak.a(Locale.getDefault()));
        ak.a(map, "&sr", ae.dq().getValue("&sr"));
        map.put("&_u", u.cP().cR());
        u.cP().cQ();
        tS.p(map);
        this;
        JVM INSTR monitorexit ;
    }

    public void reportActivityStart(Activity activity)
    {
        if (!wp)
        {
            f(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!wp)
        {
            g(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        u.cP().a(u.a.vJ);
        wm = Boolean.valueOf(flag);
        if (wm.booleanValue())
        {
            tS.cg();
        }
    }

    public void setDryRun(boolean flag)
    {
        u.cP().a(u.a.vV);
        wk = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        wl.setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        u.cP().a(u.a.vX);
        wn = logger;
    }
}
