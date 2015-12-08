// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics, aa, i, 
//            u, aj

private class _cls1
    implements ytics.a
{

    private i ur;
    private boolean xl;
    private int xm;
    private long xn;
    private boolean xo;
    private long xp;
    final Tracker xq;

    private void dw()
    {
        GoogleAnalytics googleanalytics = GoogleAnalytics.dd();
        if (googleanalytics == null)
        {
            aa.A("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (xn >= 0L || xl)
        {
            googleanalytics.a(Tracker.b(xq));
            return;
        } else
        {
            googleanalytics.b(Tracker.b(xq));
            return;
        }
    }

    public long dt()
    {
        return xn;
    }

    public boolean du()
    {
        return xl;
    }

    public boolean dv()
    {
        boolean flag = xo;
        xo = false;
        return flag;
    }

    boolean dx()
    {
        return ur.currentTimeMillis() >= xp + Math.max(1000L, xn);
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        xl = flag;
        dw();
    }

    public void h(Activity activity)
    {
        u.cP().a(dw);
        if (xm == 0 && dx())
        {
            xo = true;
        }
        xm = xm + 1;
        if (xl)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            u.cP().u(true);
            Tracker tracker = xq;
            if (Tracker.c(xq) != null)
            {
                activity = Tracker.c(xq).j(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", activity);
            xq.send(hashmap);
            u.cP().u(false);
        }
    }

    public void i(Activity activity)
    {
        u.cP().a(nd);
        xm = xm - 1;
        xm = Math.max(0, xm);
        if (xm == 0)
        {
            xp = ur.currentTimeMillis();
        }
    }

    public void setSessionTimeout(long l)
    {
        xn = l;
        dw();
    }

    public _cls1.xr(Tracker tracker)
    {
        xq = tracker;
        super();
        xl = false;
        xm = 0;
        xn = -1L;
        xo = false;
        ur = new i(tracker) {

            final Tracker xr;
            final Tracker.a xs;

            public long currentTimeMillis()
            {
                return System.currentTimeMillis();
            }

            
            {
                xs = Tracker.a.this;
                xr = tracker;
                super();
            }
        };
    }
}
