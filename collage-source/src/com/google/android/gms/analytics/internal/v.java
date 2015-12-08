// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class v
{

    private final long a;
    private final String b;
    private final String c;
    private final boolean d;
    private long e;
    private final Map f;

    public v(long l, String s, String s1, boolean flag, long l1, 
            Map map)
    {
        z.a(s);
        z.a(s1);
        a = l;
        b = s;
        c = s1;
        d = flag;
        e = l1;
        if (map != null)
        {
            f = new HashMap(map);
            return;
        } else
        {
            f = Collections.emptyMap();
            return;
        }
    }

    public long a()
    {
        return a;
    }

    public void a(long l)
    {
        e = l;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public long e()
    {
        return e;
    }

    public Map f()
    {
        return f;
    }
}
