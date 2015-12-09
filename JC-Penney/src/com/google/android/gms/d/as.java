// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class as extends ab
{

    public String a;
    public String b;
    public String c;

    public as()
    {
    }

    public String a()
    {
        return a;
    }

    public volatile void a(ab ab1)
    {
        a((as)ab1);
    }

    public void a(as as1)
    {
        if (!TextUtils.isEmpty(a))
        {
            as1.a(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            as1.b(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            as1.c(c);
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
