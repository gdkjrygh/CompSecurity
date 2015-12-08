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

        public abstract void f(Activity activity);

        public abstract void g(Activity activity);
    }

    class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final GoogleAnalytics vg;

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
            GoogleAnalytics.a(vg, activity);
        }

        public void onActivityStopped(Activity activity)
        {
            GoogleAnalytics.b(vg, activity);
        }

        b()
        {
            vg = GoogleAnalytics.this;
            super();
        }
    }


    private static boolean uY;
    private static GoogleAnalytics vf;
    private Context mContext;
    private f sH;
    private String so;
    private String sp;
    private boolean uZ;
    private af va;
    private volatile Boolean vb;
    private Logger vc;
    private Set vd;
    private boolean ve;

    protected GoogleAnalytics(Context context)
    {
        this(context, ((f) (t.q(context))), ((af) (r.ci())));
    }

    private GoogleAnalytics(Context context, f f1, af af1)
    {
        vb = Boolean.valueOf(false);
        ve = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            sH = f1;
            va = af1;
            g.n(mContext);
            ae.n(mContext);
            h.n(mContext);
            vc = new l();
            vd = new HashSet();
            cN();
            return;
        }
    }

    private int I(String s)
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
        if (so != null)
        {
            tracker.set("&an", so);
        }
        if (sp != null)
        {
            tracker.set("&av", sp);
        }
        return tracker;
    }

    static void a(GoogleAnalytics googleanalytics, Activity activity)
    {
        googleanalytics.d(activity);
    }

    static void b(GoogleAnalytics googleanalytics, Activity activity)
    {
        googleanalytics.e(activity);
    }

    static GoogleAnalytics cM()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = vf;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void cN()
    {
        if (!uY)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                aa.y((new StringBuilder()).append("PackageManager doesn't know about package: ").append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                aa.z("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    w w1 = (w)(new v(mContext)).p(i);
                    if (w1 != null)
                    {
                        a(w1);
                        return;
                    }
                }
            }
        }
    }

    private void d(Activity activity)
    {
        for (Iterator iterator = vd.iterator(); iterator.hasNext(); ((a)iterator.next()).f(activity)) { }
    }

    private void e(Activity activity)
    {
        for (Iterator iterator = vd.iterator(); iterator.hasNext(); ((a)iterator.next()).g(activity)) { }
    }

    public static GoogleAnalytics getInstance(Context context)
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        if (vf == null)
        {
            vf = new GoogleAnalytics(context);
        }
        context = vf;
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
        vd.add(a1);
    }

    void a(w w1)
    {
        aa.y("Loading global config values.");
        if (w1.cC())
        {
            so = w1.cD();
            aa.y((new StringBuilder()).append("app name loaded: ").append(so).toString());
        }
        if (w1.cE())
        {
            sp = w1.cF();
            aa.y((new StringBuilder()).append("app version loaded: ").append(sp).toString());
        }
        if (w1.cG())
        {
            int i = I(w1.cH());
            if (i >= 0)
            {
                aa.y((new StringBuilder()).append("log level loaded: ").append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (w1.cI())
        {
            va.setLocalDispatchPeriod(w1.cJ());
        }
        if (w1.cK())
        {
            setDryRun(w1.cL());
        }
    }

    void b(a a1)
    {
        vd.remove(a1);
    }

    public void dispatchLocalHits()
    {
        va.dispatchLocalHits();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !ve)
        {
            application.registerActivityLifecycleCallbacks(new b());
            ve = true;
        }
    }

    public boolean getAppOptOut()
    {
        u.cy().a(u.a.uz);
        return vb.booleanValue();
    }

    public Logger getLogger()
    {
        return vc;
    }

    public boolean isDryRunEnabled()
    {
        u.cy().a(u.a.uL);
        return uZ;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker;
        u.cy().a(u.a.uv);
        tracker = new Tracker(null, this);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        aj aj1 = (aj)(new ai(mContext)).p(i);
        if (aj1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        tracker.a(mContext, aj1);
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
        u.cy().a(u.a.uv);
        s = a(new Tracker(s, this));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    void q(Map map)
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
        ak.a(map, "&sr", ae.cZ().getValue("&sr"));
        map.put("&_u", u.cy().cA());
        u.cy().cz();
        sH.q(map);
        this;
        JVM INSTR monitorexit ;
    }

    public void reportActivityStart(Activity activity)
    {
        if (!ve)
        {
            d(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!ve)
        {
            e(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        u.cy().a(u.a.uy);
        vb = Boolean.valueOf(flag);
        if (vb.booleanValue())
        {
            sH.bR();
        }
    }

    public void setDryRun(boolean flag)
    {
        u.cy().a(u.a.uK);
        uZ = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        va.setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        u.cy().a(u.a.uM);
        vc = logger;
    }
}
