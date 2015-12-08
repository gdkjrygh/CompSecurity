// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.cm.a:
//            d, j, h

final class f
    implements Set
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        int i = a.a();
        java.util.Map.Entry entry;
        for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)collection.next();
        }

        return i != a.a();
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
            int i = a.a(((java.util.Map.Entry) (obj)).getKey());
            if (i >= 0)
            {
                return j.a(a.a(i, 1), ((java.util.Map.Entry) (obj)).getValue());
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
        return d.a(this, obj);
    }

    public final int hashCode()
    {
        int k = a.a() - 1;
        int i = 0;
        while (k >= 0) 
        {
            Object obj = a.a(k, 0);
            Object obj1 = a.a(k, 1);
            int l;
            int i1;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            if (obj1 == null)
            {
                i1 = 0;
            } else
            {
                i1 = obj1.hashCode();
            }
            k--;
            i += i1 ^ l;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new h(a);
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
