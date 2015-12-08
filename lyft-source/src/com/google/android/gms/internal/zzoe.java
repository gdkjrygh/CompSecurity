// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoe extends zznq
{

    public String a;
    public String b;
    public String c;

    public zzoe()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(zznq zznq1)
    {
        a((zzoe)zznq1);
    }

    public void a(zzoe zzoe1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzoe1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            zzoe1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            zzoe1.c(c);
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

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("network", a);
        hashmap.put("action", b);
        hashmap.put("target", c);
        return a(hashmap);
    }
}
