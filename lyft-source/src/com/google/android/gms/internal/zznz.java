// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zznz extends zznq
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private String f;

    public zznz()
    {
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public volatile void a(zznq zznq1)
    {
        a((zznz)zznq1);
    }

    public void a(zznz zznz1)
    {
        if (a != 0)
        {
            zznz1.a(a);
        }
        if (b != 0)
        {
            zznz1.b(b);
        }
        if (c != 0)
        {
            zznz1.c(c);
        }
        if (d != 0)
        {
            zznz1.d(d);
        }
        if (e != 0)
        {
            zznz1.e(e);
        }
        if (!TextUtils.isEmpty(f))
        {
            zznz1.a(f);
        }
    }

    public void a(String s)
    {
        f = s;
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        b = i;
    }

    public int c()
    {
        return c;
    }

    public void c(int i)
    {
        c = i;
    }

    public int d()
    {
        return d;
    }

    public void d(int i)
    {
        d = i;
    }

    public int e()
    {
        return e;
    }

    public void e(int i)
    {
        e = i;
    }

    public String f()
    {
        return f;
    }

    public String toString()
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
