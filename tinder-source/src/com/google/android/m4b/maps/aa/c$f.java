// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

class e extends AbstractCollection
{
    class a
        implements Iterator
    {

        final Iterator a;
        private Collection b;
        private c.f c;

        final void a()
        {
            c.a();
            if (c.b != b)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        public boolean hasNext()
        {
            a();
            return a.hasNext();
        }

        public Object next()
        {
            a();
            return a.next();
        }

        public void remove()
        {
            a.remove();
            com.google.android.m4b.maps.aa.c.b(c.d);
            c.b();
        }

        a()
        {
            c = c.f.this;
            super();
            b = c.b;
            a = com.google.android.m4b.maps.aa.c.a(c.f.this.b);
        }

        a(Iterator iterator1)
        {
            c = c.f.this;
            super();
            b = c.b;
            a = iterator1;
        }
    }


    final Object a;
    Collection b;
    final b c;
    final c d;
    private Collection e;

    final void a()
    {
        if (c != null)
        {
            c.a();
            if (c.b != e)
            {
                throw new ConcurrentModificationException();
            }
        } else
        if (b.isEmpty())
        {
            Collection collection = (Collection)com.google.android.m4b.maps.aa.c.a(d).get(a);
            if (collection != null)
            {
                b = collection;
            }
        }
    }

    public boolean add(Object obj)
    {
        a();
        boolean flag = b.isEmpty();
        boolean flag1 = b.add(obj);
        if (flag1)
        {
            com.google.android.m4b.maps.aa.c.c(d);
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
            boolean flag1 = b.addAll(collection);
            flag = flag1;
            if (flag1)
            {
                int k = b.size();
                com.google.android.m4b.maps.aa.c.a(d, k - i);
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
        c c1;
        for (c1 = this; c1.c != null; c1 = c1.c) { }
        if (c1.b.isEmpty())
        {
            com.google.android.m4b.maps.aa.c.a(c1.d).remove(c1.a);
        }
    }

    final void c()
    {
        a a1;
        for (a1 = this; a1.c != null; a1 = a1.c) { }
        com.google.android.m4b.maps.aa.c.a(a1.d).put(a1.a, a1.b);
    }

    public void clear()
    {
        int i = size();
        if (i == 0)
        {
            return;
        } else
        {
            b.clear();
            com.google.android.m4b.maps.aa.c.b(d, i);
            b();
            return;
        }
    }

    public boolean contains(Object obj)
    {
        a();
        return b.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        a();
        return b.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        } else
        {
            a();
            return b.equals(obj);
        }
    }

    public int hashCode()
    {
        a();
        return b.hashCode();
    }

    public Iterator iterator()
    {
        a();
        return new a();
    }

    public boolean remove(Object obj)
    {
        a();
        boolean flag = b.remove(obj);
        if (flag)
        {
            com.google.android.m4b.maps.aa.c.b(d);
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
            boolean flag1 = b.removeAll(collection);
            flag = flag1;
            if (flag1)
            {
                int k = b.size();
                com.google.android.m4b.maps.aa.c.a(d, k - i);
                b();
                return flag1;
            }
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        j.a(collection);
        int i = size();
        boolean flag = b.retainAll(collection);
        if (flag)
        {
            int k = b.size();
            com.google.android.m4b.maps.aa.c.a(d, k - i);
            b();
        }
        return flag;
    }

    public int size()
    {
        a();
        return b.size();
    }

    public String toString()
    {
        a();
        return b.toString();
    }

    a.a(c c1, Object obj, Collection collection, a.a a1)
    {
        d = c1;
        super();
        a = obj;
        b = collection;
        c = a1;
        if (a1 == null)
        {
            c1 = null;
        } else
        {
            c1 = a1.b;
        }
        e = c1;
    }
}
