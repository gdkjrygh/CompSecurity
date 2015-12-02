// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.facebook.common.time.a;

// Referenced classes of package com.facebook.ui.media.cache:
//            g, l

class i
{

    final g a;
    private final l b;
    private final Object c;
    private final int d;
    private volatile long e;
    private long f;

    i(g g1, l l, Object obj, int j)
    {
        a = g1;
        super();
        b = l;
        c = obj;
        d = j;
        e = com.facebook.ui.media.cache.g.a(g1).a();
    }

    static long a(i j, long l)
    {
        j.f = l;
        return l;
    }

    static Object a(i j)
    {
        return j.c;
    }

    static int b(i j)
    {
        return j.d;
    }

    static long c(i j)
    {
        return j.e;
    }

    static l d(i j)
    {
        return j.b;
    }

    static long e(i j)
    {
        return j.f;
    }

    void a()
    {
        e = com.facebook.ui.media.cache.g.a(a).a();
    }
}
