// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.cm.a:
//            d, e

final class i
    implements Collection
{

    final d a;

    i(d d1)
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
        return a.b(obj) >= 0;
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

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new e(a, 1);
    }

    public final boolean remove(Object obj)
    {
        int j = a.b(obj);
        if (j >= 0)
        {
            a.a(j);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean removeAll(Collection collection)
    {
        int j = 0;
        int k = a.a();
        boolean flag = false;
        int l;
        for (; j < k; k = l)
        {
            int i1 = j;
            l = k;
            if (collection.contains(a.a(j, 1)))
            {
                a.a(j);
                i1 = j - 1;
                l = k - 1;
                flag = true;
            }
            j = i1 + 1;
        }

        return flag;
    }

    public final boolean retainAll(Collection collection)
    {
        int j = 0;
        int k = a.a();
        boolean flag = false;
        int l;
        for (; j < k; k = l)
        {
            int i1 = j;
            l = k;
            if (!collection.contains(a.a(j, 1)))
            {
                a.a(j);
                i1 = j - 1;
                l = k - 1;
                flag = true;
            }
            j = i1 + 1;
        }

        return flag;
    }

    public final int size()
    {
        return a.a();
    }

    public final Object[] toArray()
    {
        return a.b(1);
    }

    public final Object[] toArray(Object aobj[])
    {
        return a.a(aobj, 1);
    }
}
