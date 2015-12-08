// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jl extends jc
{

    private String a;
    private String b;
    private String c;
    private long d;

    public jl()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(jc jc1)
    {
        jc1 = (jl)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            jc1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            jc1.c = c;
        }
        if (d != 0L)
        {
            jc1.d = d;
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
