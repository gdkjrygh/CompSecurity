// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics.e:
//            a, j, h

class e
    implements Runnable
{

    final String a;
    final String b;
    final double c;
    final long d;
    final a e;

    e(a a1, String s, String s1, double d1, long l)
    {
        e = a1;
        a = s;
        b = s1;
        c = d1;
        d = l;
        super();
    }

    public void run()
    {
        Object obj = com.facebook.analytics.e.a.a(e, a, b);
        obj = (j)com.facebook.analytics.e.a.a(e).get(obj);
        if (obj != null)
        {
            ((j) (obj)).a(c);
            com.facebook.analytics.e.a.a(e, ((j) (obj)), h.VALUE, d, null);
        }
    }
}
