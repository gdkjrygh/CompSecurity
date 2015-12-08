// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzof extends zznq
{

    public String a;
    public long b;
    public String c;
    public String d;

    public zzof()
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

    public volatile void a(zznq zznq1)
    {
        a((zzof)zznq1);
    }

    public void a(zzof zzof1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzof1.a(a);
        }
        if (b != 0L)
        {
            zzof1.a(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            zzof1.b(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            zzof1.c(d);
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
