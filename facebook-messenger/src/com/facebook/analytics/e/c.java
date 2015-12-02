// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics.e:
//            g, a, j

class c
    implements Runnable
{

    final g a;
    final boolean b;
    final long c;
    final a d;

    c(a a1, g g1, boolean flag, long l)
    {
        d = a1;
        a = g1;
        b = flag;
        c = l;
        super();
    }

    public void run()
    {
        Object obj = com.facebook.analytics.e.a.a(d, a.a(), a.b());
        if (com.facebook.analytics.e.a.a(d).containsKey(obj) && b)
        {
            obj = (j)com.facebook.analytics.e.a.a(d).get(obj);
            com.facebook.analytics.e.a.a(d, ((j) (obj)), a.b(), c, b, null);
            return;
        }
        obj = new j(a.a(), a.f(), a.g());
        ((j) (obj)).a(a.i());
        if (a.h())
        {
            ((j) (obj)).c();
        }
        com.facebook.analytics.e.a.a(d, ((j) (obj)), a.b(), c, b, a.j());
    }
}
