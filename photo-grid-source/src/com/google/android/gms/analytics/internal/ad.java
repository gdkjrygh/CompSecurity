// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.bl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ad
{

    private final long a = 0L;
    private final String b;
    private final String c;
    private final boolean d;
    private long e;
    private final Map f;

    public ad(String s, String s1, boolean flag, long l, Map map)
    {
        bl.a(s);
        bl.a(s1);
        b = s;
        c = s1;
        d = flag;
        e = l;
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

    public final long a()
    {
        return a;
    }

    public final void a(long l)
    {
        e = l;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public final long e()
    {
        return e;
    }

    public final Map f()
    {
        return f;
    }
}
