// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bn;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            g, c, p, y, 
//            z

private class g
    implements g
{

    final g a;
    private boolean b;
    private int c;
    private long d;
    private boolean e;
    private long f;
    private bl g;

    private void e()
    {
        c c1 = com.google.android.gms.analytics.c.a();
        if (c1 == null)
        {
            p.a("GoogleAnalytics isn't initialized for the Tracker!");
            return;
        }
        if (d >= 0L || b)
        {
            c1.a(com.google.android.gms.analytics.g.a(a));
            return;
        } else
        {
            c1.b(com.google.android.gms.analytics.g.a(a));
            return;
        }
    }

    public long a()
    {
        return d;
    }

    public void a(long l)
    {
        d = l;
        e();
    }

    public void a(Activity activity)
    {
        y.a().a(ai);
        if (c == 0 && d())
        {
            e = true;
        }
        c = c + 1;
        if (b)
        {
            Object obj = activity.getIntent();
            if (obj != null)
            {
                a.a(((Intent) (obj)).getData());
            }
            obj = new HashMap();
            ((Map) (obj)).put("&t", "screenview");
            y.a().a(true);
            g g1 = a;
            if (com.google.android.gms.analytics.g.b(a) != null)
            {
                activity = com.google.android.gms.analytics.g.b(a).a(activity);
            } else
            {
                activity = activity.getClass().getCanonicalName();
            }
            g1.a("&cd", activity);
            a.a(((Map) (obj)));
            y.a().a(false);
        }
    }

    public void a(boolean flag)
    {
        b = flag;
        e();
    }

    public void b(Activity activity)
    {
        y.a().a(aj);
        c = c - 1;
        c = Math.max(0, c);
        if (c == 0)
        {
            f = g.b();
        }
    }

    public boolean b()
    {
        return b;
    }

    public boolean c()
    {
        boolean flag = e;
        e = false;
        return flag;
    }

    boolean d()
    {
        return g.b() >= f + Math.max(1000L, d);
    }

    public (g g1)
    {
        a = g1;
        super();
        b = false;
        c = 0;
        d = -1L;
        e = false;
        g = bn.c();
    }
}
