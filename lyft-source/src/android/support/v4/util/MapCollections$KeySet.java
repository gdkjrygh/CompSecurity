// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            MapCollections

final class a
    implements Set
{

    final MapCollections a;

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
        return a.a(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return MapCollections.a(a.b(), collection);
    }

    public boolean equals(Object obj)
    {
        return MapCollections.a(this, obj);
    }

    public int hashCode()
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

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new erator(a, 0);
    }

    public boolean remove(Object obj)
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

    public boolean removeAll(Collection collection)
    {
        return MapCollections.b(a.b(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return MapCollections.c(a.b(), collection);
    }

    public int size()
    {
        return a.a();
    }

    public Object[] toArray()
    {
        return a.b(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return a.a(aobj, 0);
    }

    erator(MapCollections mapcollections)
    {
        a = mapcollections;
        super();
    }
}
