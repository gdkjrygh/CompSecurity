// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.e;
import com.google.b.e.a.a.d;
import com.google.b.m;
import com.google.b.p;
import com.google.b.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q, p, e, g, 
//            c, m, a

public final class o extends com.google.b.e.q
{

    private final com.google.b.e.q a[];

    public o(Map map)
    {
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(e.c);
        }
        if (map != null && map.get(e.g) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(a.h) || collection.contains(a.o) || collection.contains(a.g) || collection.contains(a.p))
            {
                arraylist.add(new com.google.b.e.p(map));
            }
            if (collection.contains(a.c))
            {
                arraylist.add(new com.google.b.e.e(flag));
            }
            if (collection.contains(a.d))
            {
                arraylist.add(new g());
            }
            if (collection.contains(a.e))
            {
                arraylist.add(new c());
            }
            if (collection.contains(a.i))
            {
                arraylist.add(new com.google.b.e.m());
            }
            if (collection.contains(a.b))
            {
                arraylist.add(new com.google.b.e.a());
            }
            if (collection.contains(a.m))
            {
                arraylist.add(new com.google.b.e.a.e());
            }
            if (collection.contains(a.n))
            {
                arraylist.add(new d());
            }
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new com.google.b.e.p(map));
            arraylist.add(new com.google.b.e.e());
            arraylist.add(new com.google.b.e.a());
            arraylist.add(new g());
            arraylist.add(new c());
            arraylist.add(new com.google.b.e.m());
            arraylist.add(new com.google.b.e.a.e());
            arraylist.add(new d());
        }
        a = (com.google.b.e.q[])arraylist.toArray(new com.google.b.e.q[arraylist.size()]);
    }

    public q a(int i, com.google.b.b.a a1, Map map)
    {
        com.google.b.e.q aq[];
        int j;
        int k;
        aq = a;
        k = aq.length;
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aq[j];
        obj = ((com.google.b.e.q) (obj)).a(i, a1, map);
        return ((q) (obj));
        p p1;
        p1;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw m.a();
    }

    public void a()
    {
        com.google.b.e.q aq[] = a;
        int j = aq.length;
        for (int i = 0; i < j; i++)
        {
            aq[i].a();
        }

    }
}
