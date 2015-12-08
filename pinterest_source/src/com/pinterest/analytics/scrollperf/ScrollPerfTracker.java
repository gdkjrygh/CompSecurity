// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics.scrollperf;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.analytics.scrollperf:
//            ScrollPerfTrackerListener, ScrollPerfTrackerConfig

class ScrollPerfTracker
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    boolean a;
    View b;
    private ScrollPerfTrackerConfig c;
    private boolean d;
    private long e;
    private double f;
    private double g;
    private double h;
    private double i;
    private ScrollPerfTrackerListener j;

    public ScrollPerfTracker(View view, ScrollPerfTrackerConfig scrollperftrackerconfig, ScrollPerfTrackerListener scrollperftrackerlistener)
    {
        b = view;
        c = scrollperftrackerconfig;
        j = scrollperftrackerlistener;
        d = true;
        a();
    }

    void a()
    {
        ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.addOnPreDrawListener(this);
        }
    }

    void b()
    {
        ViewTreeObserver viewtreeobserver = b.getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            viewtreeobserver.removeOnPreDrawListener(this);
        }
    }

    public final void c()
    {
        if (!a)
        {
            a = true;
        }
        d = true;
        e = 0L;
        f = 0.0D;
        g = 0.0D;
        i = 0.0D;
        h = 0.0D;
    }

    public final void d()
    {
        if (a)
        {
            a = false;
            if (f > 0.0D)
            {
                j.updateDurationAndDropEvents((long)f, h, i);
            }
        }
    }

    public boolean onPreDraw()
    {
        double d2 = 0.0D;
        if (!a)
        {
            return true;
        }
        if (d)
        {
            d = false;
            e = SystemClock.elapsedRealtime();
            return true;
        }
        long l = SystemClock.elapsedRealtime();
        long l1 = l - e;
        long l2 = c.d;
        g = Math.max(l1, g);
        int k = Math.max(Math.round(l1 / l2) - 1, 0);
        k = Math.min(c.c, k);
        f = f + (double)(l2 * (long)(k + 1));
        double d3 = h;
        double d1;
        if (k >= c.a)
        {
            d1 = (double)k / (double)c.a;
        } else
        {
            d1 = 0.0D;
        }
        h = d1 + d3;
        d3 = i;
        d1 = d2;
        if (k >= c.b)
        {
            d1 = (double)k / (double)c.b;
        }
        i = d3 + d1;
        e = l;
        return true;
    }
}
