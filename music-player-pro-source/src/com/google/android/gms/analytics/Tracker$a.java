// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            Tracker, GoogleAnalytics, ae, y, 
//            am

private class wb
    implements ytics.a
{

    private boolean Co;
    private int Cp;
    private long Cq;
    private boolean Cr;
    private long Cs;
    final Tracker Ct;
    private ld wb;

    private void fq()
    {
        GoogleAnalytics googleanalytics = GoogleAnalytics.eY();
        if (googleanalytics == null)
        {
            ae.T("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (Cq >= 0L || Co)
        {
            googleanalytics.a(Tracker.b(Ct));
            return;
        } else
        {
            googleanalytics.b(Tracker.b(Ct));
            return;
        }
    }

    public void enableAutoActivityTracking(boolean flag)
    {
        Co = flag;
        fq();
    }

    public long fn()
    {
        return Cq;
    }

    public boolean fo()
    {
        return Co;
    }

    public boolean fp()
    {
        boolean flag = Cr;
        Cr = false;
        return flag;
    }

    boolean fr()
    {
        return wb.elapsedRealtime() >= Cs + Math.max(1000L, Cq);
    }

    public void i(Activity activity)
    {
        y.eK().a(Cq);
        if (Cp == 0 && fr())
        {
            Cr = true;
        }
        Cp = Cp + 1;
        if (Co)
        {
            Object obj = activity.getIntent();
            if (obj != null)
            {
                Ct.setCampaignParamsOnNextHit(((Intent) (obj)).getData());
            }
            obj = new HashMap();
            ((Map) (obj)).put("&t", "screenview");
            y.eK().D(true);
            Tracker tracker = Ct;
            if (Tracker.c(Ct) != null)
            {
                activity = Tracker.c(Ct).k(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            tracker.set("&cd", activity);
            Ct.send(((Map) (obj)));
            y.eK().D(false);
        }
    }

    public void j(Activity activity)
    {
        y.eK().a(nd);
        Cp = Cp - 1;
        Cp = Math.max(0, Cp);
        if (Cp == 0)
        {
            Cs = wb.elapsedRealtime();
        }
    }

    public void setSessionTimeout(long l)
    {
        Cq = l;
        fq();
    }

    public ytics(Tracker tracker)
    {
        Ct = tracker;
        super();
        Co = false;
        Cp = 0;
        Cq = -1L;
        Cr = false;
        wb = lf._mthif();
    }
}
