// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class wy extends d
{

    private String a;
    private String b;
    private String c;
    private long d;

    public wy()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(d d1)
    {
        d1 = (wy)d1;
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
        if (d != 0L)
        {
            d1.d = d;
        }
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final long d()
    {
        return d;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("category", a);
        hashmap.put("action", b);
        hashmap.put("label", c);
        hashmap.put("value", Long.valueOf(d));
        return a(hashmap);
    }
}
