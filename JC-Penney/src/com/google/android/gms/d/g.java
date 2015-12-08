// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class g extends ab
{

    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private boolean g;
    private double h;

    public g()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(double d1)
    {
        boolean flag;
        if (d1 >= 0.0D && d1 <= 100D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag, "Sample rate must be between 0% and 100%");
        h = d1;
    }

    public volatile void a(ab ab1)
    {
        a((g)ab1);
    }

    public void a(g g1)
    {
        if (!TextUtils.isEmpty(a))
        {
            g1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            g1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            g1.c(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            g1.d(d);
        }
        if (e)
        {
            g1.a(true);
        }
        if (!TextUtils.isEmpty(f))
        {
            g1.e(f);
        }
        if (g)
        {
            g1.b(g);
        }
        if (h != 0.0D)
        {
            g1.a(h);
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public void b(boolean flag)
    {
        g = flag;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        d = s;
    }

    public void e(String s)
    {
        f = s;
    }

    public boolean e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public boolean g()
    {
        return g;
    }

    public double h()
    {
        return h;
    }

    public String toString()
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
