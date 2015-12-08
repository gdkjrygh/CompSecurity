// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.f:
//            g, h

final class l
    implements Collection
{

    final g a;

    l(g g1)
    {
        a = g1;
        super();
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        a.c();
    }

    public boolean contains(Object obj)
    {
        return a.b(obj) >= 0;
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

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new h(a, 1);
    }

    public boolean remove(Object obj)
    {
        int i = a.b(obj);
        if (i >= 0)
        {
            a.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        int i = 0;
        int j = a.a();
        boolean flag = false;
        int k;
        for (; i < j; j = k)
        {
            int i1 = i;
            k = j;
            if (collection.contains(a.a(i, 1)))
            {
                a.a(i);
                i1 = i - 1;
                k = j - 1;
                flag = true;
            }
            i = i1 + 1;
        }

        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        int i = 0;
        int j = a.a();
        boolean flag = false;
        int k;
        for (; i < j; j = k)
        {
            int i1 = i;
            k = j;
            if (!collection.contains(a.a(i, 1)))
            {
                a.a(i);
                i1 = i - 1;
                k = j - 1;
                flag = true;
            }
            i = i1 + 1;
        }

        return flag;
    }

    public int size()
    {
        return a.a();
    }

    public Object[] toArray()
    {
        return a.b(1);
    }

    public Object[] toArray(Object aobj[])
    {
        return a.a(aobj, 1);
    }
}
