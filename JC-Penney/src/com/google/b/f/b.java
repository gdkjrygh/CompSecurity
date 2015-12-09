// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f;

import com.google.b.b.e;
import com.google.b.c;
import com.google.b.f.a.l;
import com.google.b.f.b.a;
import com.google.b.m;
import com.google.b.o;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.f:
//            c

public final class b
    implements o
{

    public b()
    {
    }

    private static int a(s s1, s s2)
    {
        if (s1 == null || s2 == null)
        {
            return 0;
        } else
        {
            return (int)Math.abs(s1.a() - s2.a());
        }
    }

    private static int a(s as[])
    {
        return Math.max(Math.max(a(as[0], as[4]), (a(as[6], as[2]) * 17) / 18), Math.max(a(as[1], as[5]), (a(as[7], as[3]) * 17) / 18));
    }

    private static q[] a(c c1, Map map, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        c1 = com.google.b.f.b.a.a(c1, map, flag);
        q q1;
        for (map = c1.b().iterator(); map.hasNext(); arraylist.add(q1))
        {
            s as[] = (s[])map.next();
            Object obj = l.a(c1.a(), as[4], as[5], as[6], as[7], b(as), a(as));
            q1 = new q(((e) (obj)).b(), ((e) (obj)).a(), as, com.google.b.a.k);
            q1.a(r.d, ((e) (obj)).d());
            obj = (com.google.b.f.c)((e) (obj)).e();
            if (obj != null)
            {
                q1.a(r.i, obj);
            }
        }

        return (q[])arraylist.toArray(new q[arraylist.size()]);
    }

    private static int b(s s1, s s2)
    {
        if (s1 == null || s2 == null)
        {
            return 0x7fffffff;
        } else
        {
            return (int)Math.abs(s1.a() - s2.a());
        }
    }

    private static int b(s as[])
    {
        return Math.min(Math.min(b(as[0], as[4]), (b(as[6], as[2]) * 17) / 18), Math.min(b(as[1], as[5]), (b(as[7], as[3]) * 17) / 18));
    }

    public q a(c c1, Map map)
    {
        c1 = a(c1, map, false);
        if (c1 == null || c1.length == 0 || c1[0] == null)
        {
            throw m.a();
        } else
        {
            return c1[0];
        }
    }

    public void a()
    {
    }
}
