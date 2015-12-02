// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            x, al

class ak extends AbstractCollection
{

    final Object b;
    Collection c;
    final ak d;
    final Collection e;
    final x f;

    ak(x x1, Object obj, Collection collection, ak ak1)
    {
        f = x1;
        super();
        b = obj;
        c = collection;
        d = ak1;
        if (ak1 == null)
        {
            x1 = null;
        } else
        {
            x1 = ak1.e();
        }
        e = x1;
    }

    void a()
    {
        if (d != null)
        {
            d.a();
            if (d.e() != e)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (c.isEmpty())
        {
            Collection collection = (Collection)x.a(f).get(b);
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
            x.c(f);
            if (flag)
            {
                d();
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
                x.a(f, j - i);
                flag = flag1;
                if (i == 0)
                {
                    d();
                    return flag1;
                }
            }
        }
        return flag;
    }

    void b()
    {
        if (d != null)
        {
            d.b();
        } else
        if (c.isEmpty())
        {
            x.a(f).remove(b);
            return;
        }
    }

    Object c()
    {
        return b;
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
            x.b(f, i);
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

    void d()
    {
        if (d != null)
        {
            d.d();
            return;
        } else
        {
            x.a(f).put(b, c);
            return;
        }
    }

    Collection e()
    {
        return c;
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

    ak f()
    {
        return d;
    }

    public int hashCode()
    {
        a();
        return c.hashCode();
    }

    public Iterator iterator()
    {
        a();
        return new al(this);
    }

    public boolean remove(Object obj)
    {
        a();
        boolean flag = c.remove(obj);
        if (flag)
        {
            x.b(f);
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
                x.a(f, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        int i = size();
        boolean flag = c.retainAll(collection);
        if (flag)
        {
            int j = c.size();
            x.a(f, j - i);
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
