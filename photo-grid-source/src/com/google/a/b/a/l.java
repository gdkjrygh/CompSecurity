// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.aa;
import com.google.a.ad;
import com.google.a.ag;
import com.google.a.am;
import com.google.a.b.q;
import com.google.a.b.s;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.k;
import com.google.a.u;
import com.google.a.x;
import com.google.a.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b.a:
//            x, k

final class l extends am
{

    final com.google.a.b.a.k a;
    private final am b;
    private final am c;
    private final s d;

    public l(com.google.a.b.a.k k1, k k2, Type type, am am1, Type type1, am am2, s s1)
    {
        a = k1;
        super();
        b = new com.google.a.b.a.x(k2, am1, type);
        c = new com.google.a.b.a.x(k2, am2, type1);
        d = s1;
    }

    public final Object a(a a1)
    {
        e e1 = a1.f();
        if (e1 == e.i)
        {
            a1.j();
            return null;
        }
        Map map = (Map)d.a();
        if (e1 == e.a)
        {
            a1.a();
            for (; a1.e(); a1.b())
            {
                a1.a();
                Object obj = b.a(a1);
                if (map.put(obj, c.a(a1)) != null)
                {
                    throw new ag((new StringBuilder("duplicate key: ")).append(obj).toString());
                }
            }

            a1.b();
            return map;
        }
        a1.c();
        while (a1.e()) 
        {
            q.a.a(a1);
            Object obj1 = b.a(a1);
            if (map.put(obj1, c.a(a1)) != null)
            {
                throw new ag((new StringBuilder("duplicate key: ")).append(obj1).toString());
            }
        }
        a1.d();
        return map;
    }

    public final void a(f f1, Object obj)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        obj = (Map)obj;
        if (obj == null)
        {
            f1.f();
            return;
        }
        if (!com.google.a.b.a.k.a(a))
        {
            f1.d();
            java.util.Map.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); c.a(f1, entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                f1.a(String.valueOf(entry.getKey()));
            }

            f1.e();
            return;
        }
        ArrayList arraylist = new ArrayList(((Map) (obj)).size());
        ArrayList arraylist1 = new ArrayList(((Map) (obj)).size());
        obj = ((Map) (obj)).entrySet().iterator();
        boolean flag = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            x x1 = b.a(entry1.getKey());
            arraylist.add(x1);
            arraylist1.add(entry1.getValue());
            boolean flag1;
            if ((x1 instanceof u) || (x1 instanceof aa))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            f1.b();
            for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
            {
                f1.b();
                com.google.a.b.u.a((x)arraylist.get(i), f1);
                c.a(f1, arraylist1.get(i));
                f1.c();
            }

            f1.c();
            return;
        }
        f1.d();
        int j = ((flag3) ? 1 : 0);
        while (j < arraylist.size()) 
        {
            obj = (x)arraylist.get(j);
            if (obj instanceof ad)
            {
                obj = ((x) (obj)).k();
                if (((ad) (obj)).l())
                {
                    obj = String.valueOf(((ad) (obj)).b());
                } else
                if (((ad) (obj)).a())
                {
                    obj = Boolean.toString(((ad) (obj)).h());
                } else
                if (((ad) (obj)).m())
                {
                    obj = ((ad) (obj)).c();
                } else
                {
                    throw new AssertionError();
                }
            } else
            if (obj instanceof z)
            {
                obj = "null";
            } else
            {
                throw new AssertionError();
            }
            f1.a(((String) (obj)));
            c.a(f1, arraylist1.get(j));
            j++;
        }
        f1.e();
    }
}
