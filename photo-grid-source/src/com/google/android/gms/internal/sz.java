// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import com.google.android.gms.common.internal.bl;
import java.util.HashMap;
import java.util.Map;

public final class sz extends d
{

    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private boolean g;
    private double h;

    public sz()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(d d1)
    {
        boolean flag = true;
        d1 = (sz)d1;
        if (!TextUtils.isEmpty(a))
        {
            d1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            d1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            d1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            d1.d = d;
        }
        if (e)
        {
            d1.e = true;
        }
        if (!TextUtils.isEmpty(f))
        {
            d1.f = f;
        }
        if (g)
        {
            d1.g = g;
        }
        if (h != 0.0D)
        {
            double d2 = h;
            if (d2 < 0.0D || d2 > 100D)
            {
                flag = false;
            }
            bl.b(flag, "Sample rate must be between 0% and 100%");
            d1.h = d2;
        }
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void a(boolean flag)
    {
        e = flag;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final String c()
    {
        return c;
    }

    public final void c(String s)
    {
        c = s;
    }

    public final String d()
    {
        return d;
    }

    public final void d(String s)
    {
        d = s;
    }

    public final boolean e()
    {
        return e;
    }

    public final String f()
    {
        return f;
    }

    public final boolean g()
    {
        return g;
    }

    public final void h()
    {
        g = true;
    }

    public final double i()
    {
        return h;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("hitType", a);
        hashmap.put("clientId", b);
        hashmap.put("userId", c);
        hashmap.put("androidAdId", d);
        hashmap.put("AdTargetingEnabled", Boolean.valueOf(e));
        hashmap.put("sessionControl", f);
        hashmap.put("nonInteraction", Boolean.valueOf(g));
        hashmap.put("sampleRate", Double.valueOf(h));
        return a(hashmap);
    }
}
