// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.f:
//            g, c, k

final class i
    implements Set
{

    final g a;

    i(g g1)
    {
        a = g1;
        super();
    }

    public boolean a(java.util.Map.Entry entry)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }

    public boolean addAll(Collection collection)
    {
        int j = a.a();
        java.util.Map.Entry entry;
        for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)collection.next();
        }

        return j != a.a();
    }

    public void clear()
    {
        a.c();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            int j = a.a(((java.util.Map.Entry) (obj)).getKey());
            if (j >= 0)
            {
                return c.a(a.a(j, 1), ((java.util.Map.Entry) (obj)).getValue());
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        return g.a(this, obj);
    }

    public int hashCode()
    {
        int l = a.a() - 1;
        int j = 0;
        while (l >= 0) 
        {
            Object obj = a.a(l, 0);
            Object obj1 = a.a(l, 1);
            int i1;
            int j1;
            if (obj == null)
            {
                i1 = 0;
            } else
            {
                i1 = obj.hashCode();
            }
            if (obj1 == null)
            {
                j1 = 0;
            } else
            {
                j1 = obj1.hashCode();
            }
            l--;
            j += j1 ^ i1;
        }
        return j;
    }

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new k(a);
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return a.a();
    }

    public Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }
}
