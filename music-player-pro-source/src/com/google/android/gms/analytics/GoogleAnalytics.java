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
//            TrackerHandler, x, v, g, 
//            ai, k, p, Tracker, 
//            ae, z, aa, Logger, 
//            aj, f, y, al, 
//            am, an

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

        final GoogleAnalytics Bt;

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
            Bt.g(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            Bt.h(activity);
        }

        b()
        {
            Bt = GoogleAnalytics.this;
            super();
        }
    }


    private static boolean Bm;
    private static GoogleAnalytics Bs;
    private aj Bn;
    private volatile Boolean Bo;
    private Logger Bp;
    private Set Bq;
    private boolean Br;
    private Context mContext;
    private f yV;
    private String ya;
    private String yb;
    private boolean yt;

    protected GoogleAnalytics(Context context)
    {
        this(context, ((f) (x.A(context))), ((aj) (v.eu())));
    }

    private GoogleAnalytics(Context context, f f1, aj aj1)
    {
        Bo = Boolean.valueOf(false);
        Br = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            yV = f1;
            Bn = aj1;
            com.google.android.gms.analytics.g.y(mContext);
            com.google.android.gms.analytics.ai.y(mContext);
            k.y(mContext);
            Bp = new p();
            Bq = new HashSet();
            eZ();
            return;
        }
    }

    private Tracker a(Tracker tracker)
    {
        if (ya != null)
        {
            tracker.set("&an", ya);
        }
        if (yb != null)
        {
            tracker.set("&av", yb);
        }
        return tracker;
    }

    private int ai(String s)
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

    static GoogleAnalytics eY()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = Bs;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void eZ()
    {
        if (!Bm)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ae.V((new StringBuilder()).append("PackageManager doesn't know about package: ").append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                ae.W("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    aa aa1 = (aa)(new z(mContext)).x(i);
                    if (aa1 != null)
                    {
                        a(aa1);
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
        if (Bs == null)
        {
            Bs = new GoogleAnalytics(context);
        }
        context = Bs;
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
        Bq.add(a1);
        if (mContext instanceof Application)
        {
            enableAutoActivityReports((Application)mContext);
        }
    }

    void a(aa aa1)
    {
        ae.V("Loading global config values.");
        if (aa1.eO())
        {
            ya = aa1.eP();
            ae.V((new StringBuilder()).append("app name loaded: ").append(ya).toString());
        }
        if (aa1.eQ())
        {
            yb = aa1.eR();
            ae.V((new StringBuilder()).append("app version loaded: ").append(yb).toString());
        }
        if (aa1.eS())
        {
            int i = ai(aa1.eT());
            if (i >= 0)
            {
                ae.V((new StringBuilder()).append("log level loaded: ").append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (aa1.eU())
        {
            Bn.setLocalDispatchPeriod(aa1.eV());
        }
        if (aa1.eW())
        {
            setDryRun(aa1.eX());
        }
    }

    void b(a a1)
    {
        Bq.remove(a1);
    }

    void dY()
    {
        yV.dY();
    }

    public void dispatchLocalHits()
    {
        Bn.dispatchLocalHits();
    }

    public void enableAutoActivityReports(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !Br)
        {
            application.registerActivityLifecycleCallbacks(new b());
            Br = true;
        }
    }

    void g(Activity activity)
    {
        for (Iterator iterator = Bq.iterator(); iterator.hasNext(); ((a)iterator.next()).i(activity)) { }
    }

    public boolean getAppOptOut()
    {
        y.eK().a(y.a.AN);
        return Bo.booleanValue();
    }

    public Logger getLogger()
    {
        return Bp;
    }

    void h(Activity activity)
    {
        for (Iterator iterator = Bq.iterator(); iterator.hasNext(); ((a)iterator.next()).j(activity)) { }
    }

    public boolean isDryRunEnabled()
    {
        y.eK().a(y.a.AZ);
        return yt;
    }

    public Tracker newTracker(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Tracker tracker;
        y.eK().a(y.a.AJ);
        tracker = new Tracker(null, this, mContext);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        am am1 = (am)(new al(mContext)).x(i);
        if (am1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        tracker.a(am1);
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
        y.eK().a(y.a.AJ);
        s = a(new Tracker(s, this, mContext));
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
        if (!Br)
        {
            g(activity);
        }
    }

    public void reportActivityStop(Activity activity)
    {
        if (!Br)
        {
            h(activity);
        }
    }

    public void setAppOptOut(boolean flag)
    {
        y.eK().a(y.a.AM);
        Bo = Boolean.valueOf(flag);
        if (Bo.booleanValue())
        {
            yV.dQ();
        }
    }

    public void setDryRun(boolean flag)
    {
        y.eK().a(y.a.AY);
        yt = flag;
    }

    public void setLocalDispatchPeriod(int i)
    {
        Bn.setLocalDispatchPeriod(i);
    }

    public void setLogger(Logger logger)
    {
        y.eK().a(y.a.Ba);
        Bp = logger;
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
        an.a(map, "&ul", an.a(Locale.getDefault()));
        an.a(map, "&sr", com.google.android.gms.analytics.ai.fl());
        map.put("&_u", y.eK().eM());
        y.eK().eL();
        yV.u(map);
        this;
        JVM INSTR monitorexit ;
    }
}
