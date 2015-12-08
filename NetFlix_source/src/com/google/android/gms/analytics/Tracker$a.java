// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics, aa, i, 
//            u, aj

private class _cls1
    implements ytics.a
{
    private class a extends TimerTask
    {

        final Tracker.a wf;

        public void run()
        {
            Tracker.a.a(wf, false);
        }

        private a()
        {
            wf = Tracker.a.this;
            super();
        }

        a(Tracker._cls1 _pcls1)
        {
            this();
        }
    }


    private i tg;
    private Timer vV;
    private TimerTask vW;
    private boolean vX;
    private boolean vY;
    private int vZ;
    private long wa;
    private boolean wb;
    private long wc;
    final Tracker wd;

    static boolean a(a.wf wf, boolean flag)
    {
        wf.vX = flag;
        return flag;
    }

    private void df()
    {
        GoogleAnalytics googleanalytics = GoogleAnalytics.cM();
        if (googleanalytics == null)
        {
            aa.w("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (wa >= 0L || vY)
        {
            googleanalytics.a(Tracker.b(wd));
            return;
        } else
        {
            googleanalytics.b(Tracker.b(wd));
            return;
        }
    }

    private void dg()
    {
        this;
        JVM INSTR monitorenter ;
        if (vV != null)
        {
            vV.cancel();
            vV = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long dc()
    {
        return wa;
    }

    public boolean dd()
    {
        return vY;
    }

    public boolean de()
    {
        boolean flag = wb;
        wb = false;
        return flag;
    }

    boolean dh()
    {
        return wa == 0L || wa > 0L && tg.currentTimeMillis() > wc + wa;
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        vY = flag;
        df();
    }

    public void f(Activity activity)
    {
        u.cy().a(df);
        dg();
        if (!vX && vZ == 0 && dh())
        {
            wb = true;
        }
        vX = true;
        vZ = vZ + 1;
        if (vY)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "appview");
            u.cy().t(true);
            Tracker tracker = wd;
            if (Tracker.c(wd) != null)
            {
                activity = Tracker.c(wd).h(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", activity);
            wd.send(hashmap);
            u.cy().t(false);
        }
    }

    public void g(Activity activity)
    {
        u.cy().a(nd);
        vZ = vZ - 1;
        vZ = Math.max(0, vZ);
        wc = tg.currentTimeMillis();
        if (vZ == 0)
        {
            dg();
            vW = new a(null);
            vV = new Timer("waitForActivityStart");
            vV.schedule(vW, 1000L);
        }
    }

    public void setSessionTimeout(long l)
    {
        wa = l;
        df();
    }

    public _cls1.we(Tracker tracker)
    {
        wd = tracker;
        super();
        vX = false;
        vY = false;
        vZ = 0;
        wa = -1L;
        wb = false;
        tg = new i(tracker) {

            final Tracker we;
            final Tracker.a wf;

            public long currentTimeMillis()
            {
                return System.currentTimeMillis();
            }

            
            {
                wf = Tracker.a.this;
                we = tracker;
                super();
            }
        };
    }
}
