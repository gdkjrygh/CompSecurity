// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class ww extends d
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private String f;

    public ww()
    {
    }

    public final String a()
    {
        return f;
    }

    public final void a(d d1)
    {
        d1 = (ww)d1;
        if (a != 0)
        {
            d1.a = a;
        }
        if (b != 0)
        {
            d1.b = b;
        }
        if (c != 0)
        {
            d1.c = c;
        }
        if (d != 0)
        {
            d1.d = d;
        }
        if (e != 0)
        {
            d1.e = e;
        }
        if (!TextUtils.isEmpty(f))
        {
            d1.f = f;
        }
    }

    public final void a(String s)
    {
        f = s;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", f);
        hashmap.put("screenColors", Integer.valueOf(a));
        hashmap.put("screenWidth", Integer.valueOf(b));
        hashmap.put("screenHeight", Integer.valueOf(c));
        hashmap.put("viewportWidth", Integer.valueOf(d));
        hashmap.put("viewportHeight", Integer.valueOf(e));
        return a(hashmap);
    }
}
