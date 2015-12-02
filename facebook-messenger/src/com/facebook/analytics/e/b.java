// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics.e:
//            a, j

class b
    implements Runnable
{

    final String a;
    final String b;
    final boolean c;
    final long d;
    final Map e;
    final a f;

    b(a a1, String s, String s1, boolean flag, long l, Map map)
    {
        f = a1;
        a = s;
        b = s1;
        c = flag;
        d = l;
        e = map;
        super();
    }

    public void run()
    {
        Object obj = com.facebook.analytics.e.a.a(f, a, b);
        if (com.facebook.analytics.e.a.a(f).containsKey(obj) && c)
        {
            obj = (j)com.facebook.analytics.e.a.a(f).get(obj);
            com.facebook.analytics.e.a.a(f, ((j) (obj)), b, d, c, e);
            return;
        } else
        {
            com.facebook.analytics.e.a.a(f, new j(a), b, d, c, e);
            return;
        }
    }
}
