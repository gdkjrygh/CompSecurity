// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;

import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.widget.animatablelistview:
//            d, h, i, o

public class k
{

    private final d a;
    private final es b;
    private final List c;
    private final List d = hq.a();
    private final Set e = kl.a();
    private final Map f = ik.a();

    public k(d d1)
    {
        a = d1;
        b = es.a(d1.d());
        c = new ArrayList(b);
    }

    private es a(List list)
    {
        et et1 = es.e();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (!e.contains(obj))
            {
                if (f.containsKey(obj))
                {
                    et1.b(f.get(obj));
                } else
                {
                    et1.b(obj);
                }
            }
        } while (true);
        return et1.b();
    }

    public int a()
    {
        return c.size();
    }

    public void a(int j)
    {
        Object obj = c.get(j);
        c.remove(j);
        d.add(new h(obj, i.REMOVE));
    }

    public void a(int j, int l, o o1)
    {
        Object obj = c.get(j);
        d.add(new h(obj, o1.toMutationType(), l));
    }

    public void a(int j, Object obj)
    {
        d.add(new h(obj, i.ADD));
        c.add(j, obj);
    }

    public void a(int j, Object obj, boolean flag)
    {
        d.add(new h(obj, i.ADD_WITH_ANIMATION_UP, flag));
        c.add(j, obj);
    }

    public void a(int j, boolean flag)
    {
        Object obj = c.get(j);
        d.add(new h(obj, i.REMOVE_WITH_ANIMATION_DOWN, flag));
        e.add(obj);
    }

    public void a(Object obj)
    {
        a(obj, false);
    }

    public void a(Object obj, boolean flag)
    {
        d.add(new h(obj, i.ADD_WITH_ANIMATION_UP, flag));
        c.add(obj);
    }

    public void a(Collection collection)
    {
        Object obj;
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); d.add(new h(obj, i.ADD)))
        {
            obj = iterator.next();
        }

        c.addAll(collection);
    }

    public void b()
    {
        es es1 = es.a(c);
        es es2 = a(es1);
        es es3 = es.a(d);
        a.a(this, es1, es2, es3);
    }

    public void b(int j)
    {
        a(j, false);
    }

    public void b(int j, Object obj)
    {
        a(j, obj, false);
    }

    public void b(int j, boolean flag)
    {
        Object obj = c.get(j);
        d.add(new h(obj, i.REMOVE_WITH_ANIMATION_UP, flag));
        e.add(obj);
    }

    public List c()
    {
        return c;
    }

    public void c(int j)
    {
        b(j, false);
    }

    public void c(int j, Object obj)
    {
        c.set(j, obj);
        d.add(new h(obj, i.REPLACE));
    }

    public void d(int j, Object obj)
    {
        Object obj1 = c.get(j);
        d.add(new h(obj, i.MARKED_FOR_REPLACE));
        f.put(obj1, obj);
    }

    public boolean d(int j)
    {
        return c.size() > j;
    }
}
