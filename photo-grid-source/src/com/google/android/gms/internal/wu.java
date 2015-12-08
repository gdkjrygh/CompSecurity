// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class wu extends d
{

    private String a;
    private String b;
    private String c;
    private String d;

    public wu()
    {
    }

    public final String a()
    {
        return a;
    }

    public final volatile void a(d d1)
    {
        a((wu)d1);
    }

    public final void a(wu wu1)
    {
        if (!TextUtils.isEmpty(a))
        {
            wu1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            wu1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            wu1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            wu1.d = d;
        }
    }

    public final void a(String s)
    {
        a = s;
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

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", a);
        hashmap.put("appVersion", b);
        hashmap.put("appId", c);
        hashmap.put("appInstallerId", d);
        return a(hashmap);
    }
}
