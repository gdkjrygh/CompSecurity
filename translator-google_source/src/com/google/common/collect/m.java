// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, n

class m extends AbstractCollection
{

    final Object b;
    Collection c;
    final m d;
    final Collection e;
    final AbstractMapBasedMultimap f;

    m(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj, Collection collection, m m1)
    {
        f = abstractmapbasedmultimap;
        super();
        b = obj;
        c = collection;
        d = m1;
        if (m1 == null)
        {
            abstractmapbasedmultimap = null;
        } else
        {
            abstractmapbasedmultimap = m1.c;
        }
        e = abstractmapbasedmultimap;
    }

    final void a()
    {
        if (d != null)
        {
            d.a();
            if (d.c != e)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (c.isEmpty())
        {
            Collection collection = (Collection)AbstractMapBasedMultimap.access$000(f).get(b);
            if (collection != null)
            {
                c = collection;
            }
        }
    }

    public boolean add(Object obj)
    {
        a();
        boolean flag = c.isEmpty();
        boolean flag1 = c.add(obj);
        if (flag1)
        {
            int _tmp = AbstractMapBasedMultimap.access$208(f);
            if (flag)
            {
                c();
            }
        }
        return flag1;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = c.addAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                AbstractMapBasedMultimap.access$212(f, j - i);
                flag = flag1;
                if (i == 0)
                {
                    c();
                    return flag1;
                }
            }
        }
        return flag;
    }

    final void b()
    {
        m m1;
        for (m1 = this; m1.d != null; m1 = m1.d) { }
        if (m1.c.isEmpty())
        {
            AbstractMapBasedMultimap.access$000(m1.f).remove(m1.b);
        }
    }

    final void c()
    {
        m m1;
        for (m1 = this; m1.d != null; m1 = m1.d) { }
        AbstractMapBasedMultimap.access$000(m1.f).put(m1.b, m1.c);
    }

    public void clear()
    {
        int i = size();
        if (i == 0)
        {
            return;
        } else
        {
            c.clear();
            AbstractMapBasedMultimap.access$220(f, i);
            b();
            return;
        }
    }

    public boolean contains(Object obj)
    {
        a();
        return c.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        a();
        return c.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        } else
        {
            a();
            return c.equals(obj);
        }
    }

    public int hashCode()
    {
        a();
        return c.hashCode();
    }

    public Iterator iterator()
    {
        a();
        return new n(this);
    }

    public boolean remove(Object obj)
    {
        a();
        boolean flag = c.remove(obj);
        if (flag)
        {
            int _tmp = AbstractMapBasedMultimap.access$210(f);
            b();
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = c.removeAll(collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                AbstractMapBasedMultimap.access$212(f, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        p.a(collection);
        int i = size();
        boolean flag = c.retainAll(collection);
        if (flag)
        {
            int j = c.size();
            AbstractMapBasedMultimap.access$212(f, j - i);
            b();
        }
        return flag;
    }

    public int size()
    {
        a();
        return c.size();
    }

    public String toString()
    {
        a();
        return c.toString();
    }
}
