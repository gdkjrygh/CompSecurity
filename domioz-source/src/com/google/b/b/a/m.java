// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.ac;
import com.google.b.af;
import com.google.b.al;
import com.google.b.b.ae;
import com.google.b.b.ag;
import com.google.b.b.u;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import com.google.b.k;
import com.google.b.t;
import com.google.b.w;
import com.google.b.y;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.b.b.a:
//            y, l

final class m extends al
{

    final l a;
    private final al b;
    private final al c;
    private final ae d;

    public m(l l1, k k, Type type, al al1, Type type1, al al2, ae ae1)
    {
        a = l1;
        super();
        b = new com.google.b.b.a.y(k, al1, type);
        c = new com.google.b.b.a.y(k, al2, type1);
        d = ae1;
    }

    public final Object a(a a1)
    {
        c c1 = a1.f();
        if (c1 == c.i)
        {
            a1.j();
            return null;
        }
        Map map = (Map)d.a();
        if (c1 == c.a)
        {
            a1.a();
            for (; a1.e(); a1.b())
            {
                a1.a();
                Object obj = b.a(a1);
                if (map.put(obj, c.a(a1)) != null)
                {
                    throw new af((new StringBuilder("duplicate key: ")).append(obj).toString());
                }
            }

            a1.b();
            return map;
        }
        a1.c();
        while (a1.e()) 
        {
            u.a.a(a1);
            Object obj1 = b.a(a1);
            if (map.put(obj1, c.a(a1)) != null)
            {
                throw new af((new StringBuilder("duplicate key: ")).append(obj1).toString());
            }
        }
        a1.d();
        return map;
    }

    public final void a(d d1, Object obj)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        obj = (Map)obj;
        if (obj == null)
        {
            d1.f();
            return;
        }
        if (!com.google.b.b.a.l.a(a))
        {
            d1.d();
            java.util.Map.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); c.a(d1, entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                d1.a(String.valueOf(entry.getKey()));
            }

            d1.e();
            return;
        }
        ArrayList arraylist = new ArrayList(((Map) (obj)).size());
        ArrayList arraylist1 = new ArrayList(((Map) (obj)).size());
        obj = ((Map) (obj)).entrySet().iterator();
        boolean flag = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            w w1 = b.a(entry1.getKey());
            arraylist.add(w1);
            arraylist1.add(entry1.getValue());
            boolean flag1;
            if ((w1 instanceof t) || (w1 instanceof z))
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
            d1.b();
            for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
            {
                d1.b();
                ag.a((w)arraylist.get(i), d1);
                c.a(d1, arraylist1.get(i));
                d1.c();
            }

            d1.c();
            return;
        }
        d1.d();
        int j = ((flag3) ? 1 : 0);
        while (j < arraylist.size()) 
        {
            obj = (w)arraylist.get(j);
            if (obj instanceof ac)
            {
                obj = ((w) (obj)).j();
                if (((ac) (obj)).k())
                {
                    obj = String.valueOf(((ac) (obj)).b());
                } else
                if (((ac) (obj)).a())
                {
                    obj = Boolean.toString(((ac) (obj)).g());
                } else
                if (((ac) (obj)).l())
                {
                    obj = ((ac) (obj)).c();
                } else
                {
                    throw new AssertionError();
                }
            } else
            if (obj instanceof y)
            {
                obj = "null";
            } else
            {
                throw new AssertionError();
            }
            d1.a(((String) (obj)));
            c.a(d1, arraylist1.get(j));
            j++;
        }
        d1.e();
    }
}
