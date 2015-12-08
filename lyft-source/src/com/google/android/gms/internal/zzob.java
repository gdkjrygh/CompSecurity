// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzob extends zznq
{

    private String a;
    private String b;
    private String c;
    private long d;

    public zzob()
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

    public volatile void a(zznq zznq1)
    {
        a((zzob)zznq1);
    }

    public void a(zzob zzob1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzob1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            zzob1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            zzob1.c(c);
        }
        if (d != 0L)
        {
            zzob1.a(d);
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
