// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.cm.a:
//            d, e

final class g
    implements Set
{

    final d a;

    g(d d1)
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
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        a.c();
    }

    public final boolean contains(Object obj)
    {
        return a.a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection)
    {
        Map map = a.b();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
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
        int i = a.a() - 1;
        int j = 0;
        while (i >= 0) 
        {
            Object obj = a.a(i, 0);
            int k;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            j += k;
            i--;
        }
        return j;
    }

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new e(a, 0);
    }

    public final boolean remove(Object obj)
    {
        int i = a.a(obj);
        if (i >= 0)
        {
            a.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean removeAll(Collection collection)
    {
        Map map = a.b();
        int i = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return i != map.size();
    }

    public final boolean retainAll(Collection collection)
    {
        Map map = a.b();
        int i = map.size();
        Iterator iterator1 = map.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator1.next()))
            {
                iterator1.remove();
            }
        } while (true);
        return i != map.size();
    }

    public final int size()
    {
        return a.a();
    }

    public final Object[] toArray()
    {
        return a.b(0);
    }

    public final Object[] toArray(Object aobj[])
    {
        return a.a(aobj, 0);
    }
}
