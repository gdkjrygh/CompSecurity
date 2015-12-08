// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzny extends zznq
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public zzny()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(zznq zznq1)
    {
        a((zzny)zznq1);
    }

    public void a(zzny zzny1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzny1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            zzny1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            zzny1.c(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            zzny1.d(d);
        }
        if (!TextUtils.isEmpty(e))
        {
            zzny1.e(e);
        }
        if (!TextUtils.isEmpty(f))
        {
            zzny1.f(f);
        }
        if (!TextUtils.isEmpty(g))
        {
            zzny1.g(g);
        }
        if (!TextUtils.isEmpty(h))
        {
            zzny1.h(h);
        }
        if (!TextUtils.isEmpty(i))
        {
            zzny1.i(i);
        }
        if (!TextUtils.isEmpty(j))
        {
            zzny1.j(j);
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
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

    public String e()
    {
        return e;
    }

    public void e(String s)
    {
        e = s;
    }

    public String f()
    {
        return f;
    }

    public void f(String s)
    {
        f = s;
    }

    public String g()
    {
        return g;
    }

    public void g(String s)
    {
        g = s;
    }

    public String h()
    {
        return h;
    }

    public void h(String s)
    {
        h = s;
    }

    public String i()
    {
        return i;
    }

    public void i(String s)
    {
        i = s;
    }

    public String j()
    {
        return j;
    }

    public void j(String s)
    {
        j = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", a);
        hashmap.put("source", b);
        hashmap.put("medium", c);
        hashmap.put("keyword", d);
        hashmap.put("content", e);
        hashmap.put("id", f);
        hashmap.put("adNetworkId", g);
        hashmap.put("gclid", h);
        hashmap.put("dclid", i);
        hashmap.put("aclid", j);
        return a(hashmap);
    }
}
