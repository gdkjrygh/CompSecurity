// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class ap extends ab
{

    private String a;
    private String b;
    private String c;
    private long d;

    public ap()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(long l)
    {
        d = l;
    }

    public volatile void a(ab ab1)
    {
        a((ap)ab1);
    }

    public void a(ap ap1)
    {
        if (!TextUtils.isEmpty(a))
        {
            ap1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            ap1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            ap1.c(c);
        }
        if (d != 0L)
        {
            ap1.a(d);
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

    public long d()
    {
        return d;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", a);
        hashmap.put("action", b);
        hashmap.put("label", c);
        hashmap.put("value", Long.valueOf(d));
        return a(hashmap);
    }
}
