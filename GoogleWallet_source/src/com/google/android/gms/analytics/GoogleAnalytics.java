// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            TrackerHandler, GAThread, GAServiceManager, g, 
//            ag, k, Logger, Tracker, 
//            ac, y, ah, x, 
//            w, f, al

public class GoogleAnalytics extends TrackerHandler
{

    private static boolean Bk;
    private static GoogleAnalytics Bq;
    private ah Bl;
    private volatile Boolean Bm;
    private Logger Bn;
    private Set Bo;
    private boolean Bp;
    private Context mContext;
    private String xZ;
    private f yU;
    private String ya;
    private boolean ys;

    private GoogleAnalytics(Context context)
    {
        this(context, ((f) (GAThread.getInstance(context))), ((ah) (GAServiceManager.getInstance())));
    }

    private GoogleAnalytics(Context context, f f1, ah ah1)
    {
        Bm = Boolean.valueOf(false);
        Bp = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            yU = f1;
            Bl = ah1;
            g.y(mContext);
            ag.y(mContext);
            k.y(mContext);
            Bn = new Logger();
            Bo = new HashSet();
            eU();
            return;
        }
    }

    private Tracker a(Tracker tracker)
    {
        if (xZ != null)
        {
            tracker.set("&an", xZ);
        }
        if (ya != null)
        {
            tracker.set("&av", ya);
        }
        return tracker;
    }

    private void a(y y1)
    {
        ac.v("Loading global config values.");
        if (y1.eJ())
        {
            xZ = y1.eK();
            ac.v((new StringBuilder("app name loaded: ")).append(xZ).toString());
        }
        if (y1.eL())
        {
            ya = y1.eM();
            ac.v((new StringBuilder("app version loaded: ")).append(ya).toString());
        }
        if (y1.eN())
        {
            int i = ah(y1.eO());
            if (i >= 0)
            {
                ac.v((new StringBuilder("log level loaded: ")).append(i).toString());
                getLogger().setLogLevel(i);
            }
        }
        if (y1.eP())
        {
            Bl.setLocalDispatchPeriod(y1.eQ());
        }
        if (y1.eR())
        {
            setDryRun(y1.eS());
        }
    }

    private static int ah(String s)
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

    static GoogleAnalytics eT()
    {
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorenter ;
        GoogleAnalytics googleanalytics = Bq;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return googleanalytics;
        Exception exception;
        exception;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void eU()
    {
        if (!Bk)
        {
            Object obj;
            try
            {
                obj = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ac.v((new StringBuilder("PackageManager doesn't know about package: ")).append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                ac.w("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i > 0)
                {
                    y y1 = (y)(new x(mContext)).x(i);
                    if (y1 != null)
                    {
                        a(y1);
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
        if (Bq == null)
        {
            Bq = new GoogleAnalytics(context);
        }
        context = Bq;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/analytics/GoogleAnalytics;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void setDryRun(boolean flag)
    {
        w.eF().a(w.a.AW);
        ys = flag;
    }

    public final void dispatchLocalHits()
    {
        Bl.dispatchLocalHits();
    }

    final void forceDispatch()
    {
        yU.forceDispatch();
    }

    public final boolean getAppOptOut()
    {
        w.eF().a(w.a.AL);
        return Bm.booleanValue();
    }

    public final Logger getLogger()
    {
        return Bn;
    }

    public final boolean isDryRunEnabled()
    {
        w.eF().a(w.a.AX);
        return ys;
    }

    public final Tracker newTracker(String s)
    {
        this;
        JVM INSTR monitorenter ;
        w.eF().a(w.a.AH);
        s = a(new Tracker(s, this, mContext));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    final void sendHit(Map map)
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
        al.a(map, "&ul", al.a(Locale.getDefault()));
        al.a(map, "&sr", ag.fg());
        map.put("&_u", w.eF().eH());
        w.eF().eG();
        yU.sendHit(map);
        this;
        JVM INSTR monitorexit ;
    }
}
