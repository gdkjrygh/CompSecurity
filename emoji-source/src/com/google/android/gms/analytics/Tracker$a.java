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

    private i uu;
    private boolean xo;
    private int xp;
    private long xq;
    private boolean xr;
    private long xs;
    final Tracker xt;

    private void dB()
    {
        GoogleAnalytics googleanalytics = GoogleAnalytics.di();
        if (googleanalytics == null)
        {
            aa.A("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (xq >= 0L || xo)
        {
            googleanalytics.a(Tracker.b(xt));
            return;
        } else
        {
            googleanalytics.b(Tracker.b(xt));
            return;
        }
    }

    public boolean dA()
    {
        boolean flag = xr;
        xr = false;
        return flag;
    }

    boolean dC()
    {
        return uu.currentTimeMillis() >= xs + Math.max(1000L, xq);
    }

    public long dy()
    {
        return xq;
    }

    public boolean dz()
    {
        return xo;
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        xo = flag;
        dB();
    }

    public void h(Activity activity)
    {
        u.cU().a(dB);
        if (xp == 0 && dC())
        {
            xr = true;
        }
        xp = xp + 1;
        if (xo)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            u.cU().u(true);
            Tracker tracker = xt;
            if (Tracker.c(xt) != null)
            {
                activity = Tracker.c(xt).j(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", activity);
            xt.send(hashmap);
            u.cU().u(false);
        }
    }

    public void i(Activity activity)
    {
        u.cU().a(nd);
        xp = xp - 1;
        xp = Math.max(0, xp);
        if (xp == 0)
        {
            xs = uu.currentTimeMillis();
        }
    }

    public void setSessionTimeout(long l)
    {
        xq = l;
        dB();
    }

    public _cls1.xu(Tracker tracker)
    {
        xt = tracker;
        super();
        xo = false;
        xp = 0;
        xq = -1L;
        xr = false;
        uu = new i(tracker) {

            final Tracker xu;
            final Tracker.a xv;

            public long currentTimeMillis()
            {
                return System.currentTimeMillis();
            }

            
            {
                xv = Tracker.a.this;
                xu = tracker;
                super();
            }
        };
    }
}
