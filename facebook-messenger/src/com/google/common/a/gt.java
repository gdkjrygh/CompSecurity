// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dz, ik, gr, hq, 
//            gu

class gt extends dz
{

    final Set a;
    final Object b;
    final gr c;

    gt(gr gr1, Object obj, Set set)
    {
        c = gr1;
        super();
        a = set;
        b = obj;
    }

    java.util.Map.Entry a(Object obj)
    {
        return ik.a(b, obj);
    }

    protected Set a()
    {
        return a;
    }

    public boolean add(Object obj)
    {
        boolean flag = a.add(obj);
        if (flag)
        {
            c.b.add(a(obj));
        }
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = a.addAll(collection);
        if (flag)
        {
            c.b.addAll(d(a()));
        }
        return flag;
    }

    protected Collection b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public void clear()
    {
        Object obj;
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); c.b.remove(a(obj)))
        {
            obj = iterator1.next();
        }

        a.clear();
    }

    Collection d(Collection collection)
    {
        java.util.ArrayList arraylist = hq.c(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(a(collection.next()))) { }
        return arraylist;
    }

    public Iterator iterator()
    {
        return new gu(this, a.iterator());
    }

    public boolean remove(Object obj)
    {
        boolean flag = a.remove(obj);
        if (flag)
        {
            c.b.remove(a(obj));
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = a.removeAll(collection);
        if (flag)
        {
            c.b.removeAll(d(collection));
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag = false;
        Iterator iterator1 = a.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Object obj = iterator1.next();
            if (!collection.contains(obj))
            {
                iterator1.remove();
                c.b.remove(ik.a(b, obj));
                flag = true;
            }
        } while (true);
        return flag;
    }
}
