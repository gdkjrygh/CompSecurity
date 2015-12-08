// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class at extends ab
{

    public String a;
    public long b;
    public String c;
    public String d;

    public at()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(long l)
    {
        b = l;
    }

    public volatile void a(ab ab1)
    {
        a((at)ab1);
    }

    public void a(at at1)
    {
        if (!TextUtils.isEmpty(a))
        {
            at1.a(a);
        }
        if (b != 0L)
        {
            at1.a(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            at1.b(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            at1.c(d);
        }
    }

    public void a(String s)
    {
        a = s;
    }

    public long b()
    {
        return b;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return d;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", a);
        hashmap.put("timeInMillis", Long.valueOf(b));
        hashmap.put("category", c);
        hashmap.put("label", d);
        return a(hashmap);
    }
}
