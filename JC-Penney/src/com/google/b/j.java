// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.a.b;
import com.google.b.e.o;
import com.google.b.g.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.b:
//            o, p, m, e, 
//            a, c, q

public final class j
    implements com.google.b.o
{

    private Map a;
    private com.google.b.o b[];

    public j()
    {
    }

    private q b(c c)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        com.google.b.o ao[];
        int i;
        int k;
        ao = b;
        k = ao.length;
        i = 0;
_L3:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ao[i];
        obj = ((com.google.b.o) (obj)).a(c, a);
        return ((q) (obj));
        p p1;
        p1;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        throw com.google.b.m.a();
    }

    public q a(c c)
    {
        if (b == null)
        {
            a(((Map) (null)));
        }
        return b(c);
    }

    public q a(c c, Map map)
    {
        a(map);
        return b(c);
    }

    public void a()
    {
        if (b != null)
        {
            com.google.b.o ao[] = b;
            int k = ao.length;
            for (int i = 0; i < k; i++)
            {
                ao[i].a();
            }

        }
    }

    public void a(Map map)
    {
        boolean flag1 = false;
        a = map;
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map != null && map.containsKey(e.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(e.c);
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(com.google.b.a.o) || collection.contains(a.p) || collection.contains(a.h) || collection.contains(a.g) || collection.contains(b) || collection.contains(a.c) || collection.contains(a.d) || collection.contains(a.e) || collection.contains(a.i) || collection.contains(a.m) || collection.contains(a.n))
            {
                flag1 = true;
            }
            if (flag1 && !flag)
            {
                arraylist.add(new o(map));
            }
            if (collection.contains(a.l))
            {
                arraylist.add(new a());
            }
            if (collection.contains(a.f))
            {
                arraylist.add(new com.google.b.c.a());
            }
            if (collection.contains(com.google.b.a.a))
            {
                arraylist.add(new b());
            }
            if (collection.contains(a.k))
            {
                arraylist.add(new com.google.b.f.b());
            }
            if (collection.contains(a.j))
            {
                arraylist.add(new com.google.b.d.a());
            }
            if (flag1 && flag)
            {
                arraylist.add(new o(map));
            }
        }
        if (arraylist.isEmpty())
        {
            if (!flag)
            {
                arraylist.add(new o(map));
            }
            arraylist.add(new a());
            arraylist.add(new com.google.b.c.a());
            arraylist.add(new b());
            arraylist.add(new com.google.b.f.b());
            arraylist.add(new com.google.b.d.a());
            if (flag)
            {
                arraylist.add(new o(map));
            }
        }
        b = (com.google.b.o[])arraylist.toArray(new com.google.b.o[arraylist.size()]);
    }
}
