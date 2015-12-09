// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.internal.ix;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            g, c

private class d extends r
    implements rnal.r
{

    final g a;
    private boolean b;
    private int c;
    private long d;
    private boolean e;
    private long f;

    private void d()
    {
        if (d >= 0L || b)
        {
            s().a(g.a(a));
            return;
        } else
        {
            s().b(g.a(a));
            return;
        }
    }

    protected void a()
    {
    }

    public void a(long l)
    {
        d = l;
        d();
    }

    public void a(Activity activity)
    {
        if (c == 0 && c())
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
            HashMap hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            g g1 = a;
            if (g.k(a) != null)
            {
                obj = g.k(a).a(activity);
            } else
            {
                obj = activity.getClass().getCanonicalName();
            }
            g1.a("&cd", ((String) (obj)));
            if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
            {
                activity = g.a(activity);
                if (!TextUtils.isEmpty(activity))
                {
                    hashmap.put("&dr", activity);
                }
            }
            a.a(hashmap);
        }
    }

    public void a(boolean flag)
    {
        b = flag;
        d();
    }

    public void b(Activity activity)
    {
        c = c - 1;
        c = Math.max(0, c);
        if (c == 0)
        {
            f = n().b();
        }
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = e;
        e = false;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean c()
    {
        return n().b() >= f + Math.max(1000L, d);
    }

    protected rnal.t(g g1, t t)
    {
        a = g1;
        super(t);
        d = -1L;
    }
}
