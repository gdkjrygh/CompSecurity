// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.a.b:
//            e, o

class n extends AbstractCollection
{

    final Object b;
    Collection c;
    final n d;
    final Collection e;
    final e f;

    n(e e1, Object obj, Collection collection, n n1)
    {
        f = e1;
        super();
        b = obj;
        c = collection;
        d = n1;
        if (n1 == null)
        {
            e1 = null;
        } else
        {
            e1 = n1.c;
        }
        e = e1;
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
            Collection collection = (Collection)com.google.a.b.e.a(f).get(b);
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
            com.google.a.b.e.c(f);
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
                com.google.a.b.e.a(f, j - i);
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
        n n1;
        for (n1 = this; n1.d != null; n1 = n1.d) { }
        if (n1.c.isEmpty())
        {
            com.google.a.b.e.a(n1.f).remove(n1.b);
        }
    }

    final void c()
    {
        n n1;
        for (n1 = this; n1.d != null; n1 = n1.d) { }
        com.google.a.b.e.a(n1.f).put(n1.b, n1.c);
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
            com.google.a.b.e.b(f, i);
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
        return new o(this);
    }

    public boolean remove(Object obj)
    {
        a();
        boolean flag = c.remove(obj);
        if (flag)
        {
            com.google.a.b.e.b(f);
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
                com.google.a.b.e.a(f, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        ad.a(collection);
        int i = size();
        boolean flag = c.retainAll(collection);
        if (flag)
        {
            int j = c.size();
            com.google.a.b.e.a(f, j - i);
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
