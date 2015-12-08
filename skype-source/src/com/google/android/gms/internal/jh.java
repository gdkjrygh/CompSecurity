// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jh extends jc
{

    private String a;
    private String b;
    private String c;
    private String d;

    public jh()
    {
    }

    public final String a()
    {
        return a;
    }

    public final volatile void a(jc jc1)
    {
        a((jh)jc1);
    }

    public final void a(jh jh1)
    {
        if (!TextUtils.isEmpty(a))
        {
            jh1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            jh1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            jh1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            jh1.d = d;
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
