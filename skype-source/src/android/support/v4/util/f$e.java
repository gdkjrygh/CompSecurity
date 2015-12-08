// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.util:
//            f

final class a
    implements Collection
{

    final f a;

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
        return new <init>(a, 1);
    }

    public final boolean remove(Object obj)
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

    public final boolean removeAll(Collection collection)
    {
        int j = a.a();
        boolean flag = false;
        int k;
        for (int i = 0; i < j; j = k)
        {
            k = j;
            int l = i;
            if (collection.contains(a.a(i, 1)))
            {
                a.a(i);
                l = i - 1;
                k = j - 1;
                flag = true;
            }
            i = l + 1;
        }

        return flag;
    }

    public final boolean retainAll(Collection collection)
    {
        int j = a.a();
        boolean flag = false;
        int k;
        for (int i = 0; i < j; j = k)
        {
            k = j;
            int l = i;
            if (!collection.contains(a.a(i, 1)))
            {
                a.a(i);
                l = i - 1;
                k = j - 1;
                flag = true;
            }
            i = l + 1;
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

    onException(f f1)
    {
        a = f1;
        super();
    }
}
