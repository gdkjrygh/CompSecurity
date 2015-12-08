// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class al extends ab
{

    private String a;
    private String b;
    private String c;
    private String d;

    public al()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(ab ab1)
    {
        a((al)ab1);
    }

    public void a(al al1)
    {
        if (!TextUtils.isEmpty(a))
        {
            al1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            al1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            al1.c(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            al1.d(d);
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

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        d = s;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("appName", a);
        hashmap.put("appVersion", b);
        hashmap.put("appId", c);
        hashmap.put("appInstallerId", d);
        return a(hashmap);
    }
}
