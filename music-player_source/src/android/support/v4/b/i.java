// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.b:
//            f, g

final class i
    implements Set
{

    final f a;

    i(f f1)
    {
        a = f1;
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
        return f.a(this, obj);
    }

    public final int hashCode()
    {
        int j = a.a() - 1;
        int k = 0;
        while (j >= 0) 
        {
            Object obj = a.a(j, 0);
            int l;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            k += l;
            j--;
        }
        return k;
    }

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new g(a, 0);
    }

    public final boolean remove(Object obj)
    {
        int j = a.a(obj);
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
        Map map = a.b();
        int j = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return j != map.size();
    }

    public final boolean retainAll(Collection collection)
    {
        Map map = a.b();
        int j = map.size();
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
        return j != map.size();
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
