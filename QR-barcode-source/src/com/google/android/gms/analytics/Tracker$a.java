// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.jw;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics, z, t, 
//            ai

private class yD
    implements ytics.a
{

    final Tracker BA;
    private boolean Bv;
    private int Bw;
    private long Bx;
    private boolean By;
    private long Bz;
    private ju yD;

    private void eW()
    {
        GoogleAnalytics googleanalytics = GoogleAnalytics.eD();
        if (googleanalytics == null)
        {
            z.T("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (Bx >= 0L || Bv)
        {
            googleanalytics.a(Tracker.b(BA));
            return;
        } else
        {
            googleanalytics.b(Tracker.b(BA));
            return;
        }
    }

    public long eT()
    {
        return Bx;
    }

    public boolean eU()
    {
        return Bv;
    }

    public boolean eV()
    {
        boolean flag = By;
        By = false;
        return flag;
    }

    boolean eX()
    {
        return yD.elapsedRealtime() >= Bz + Math.max(1000L, Bx);
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        Bv = flag;
        eW();
    }

    public void i(Activity activity)
    {
        t.ep().a(eW);
        if (Bw == 0 && eX())
        {
            By = true;
        }
        Bw = Bw + 1;
        if (Bv)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            t.ep().B(true);
            Tracker tracker = BA;
            if (Tracker.c(BA) != null)
            {
                activity = Tracker.c(BA).k(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", activity);
            BA.send(hashmap);
            t.ep().B(false);
        }
    }

    public void j(Activity activity)
    {
        t.ep().a(nd);
        Bw = Bw - 1;
        Bw = Math.max(0, Bw);
        if (Bw == 0)
        {
            Bz = yD.elapsedRealtime();
        }
    }

    public void setSessionTimeout(long l)
    {
        Bx = l;
        eW();
    }

    public ytics(Tracker tracker)
    {
        BA = tracker;
        super();
        Bv = false;
        Bw = 0;
        Bx = -1L;
        By = false;
        yD = jw.hA();
    }
}
