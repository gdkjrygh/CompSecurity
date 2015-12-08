// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class hu extends jc
{

    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private boolean g;
    private double h;

    public hu()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(jc jc1)
    {
        boolean flag = true;
        jc1 = (hu)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            jc1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            jc1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            jc1.d = d;
        }
        if (e)
        {
            jc1.e = true;
        }
        if (!TextUtils.isEmpty(f))
        {
            jc1.f = f;
        }
        if (g)
        {
            jc1.g = g;
        }
        if (h != 0.0D)
        {
            double d1 = h;
            if (d1 < 0.0D || d1 > 100D)
            {
                flag = false;
            }
            y.b(flag, "Sample rate must be between 0% and 100%");
            jc1.h = d1;
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
