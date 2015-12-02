// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.e;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.analytics.e:
//            a, j, h

class d
    implements Runnable
{

    final String a;
    final String b;
    final long c;
    final Map d;
    final a e;

    d(a a1, String s, String s1, long l, Map map)
    {
        e = a1;
        a = s;
        b = s1;
        c = l;
        d = map;
        super();
    }

    public void run()
    {
        String s = com.facebook.analytics.e.a.a(e, a, b);
        j j1 = (j)com.facebook.analytics.e.a.a(e).get(s);
        if (j1 == null)
        {
            return;
        }
        if (j1.d() && com.facebook.analytics.e.a.b(e))
        {
            com.facebook.analytics.e.a.a(e).remove(s);
            return;
        } else
        {
            com.facebook.analytics.e.a.a(e, j1, h.STOP, c, d);
            com.facebook.analytics.e.a.a(e).remove(s);
            return;
        }
    }
}
