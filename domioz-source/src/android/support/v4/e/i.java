// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.e:
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

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        int j = a.a();
        java.util.Map.Entry entry;
        for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)collection.next();
        }

        return j != a.a();
    }

    public final void clear()
    {
        a.c();
    }

    public final boolean contains(Object obj)
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

    public final boolean containsAll(Collection collection)
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

    public final boolean equals(Object obj)
    {
        return g.a(this, obj);
    }

    public final int hashCode()
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

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new k(a);
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        return a.a();
    }

    public final Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }
}
