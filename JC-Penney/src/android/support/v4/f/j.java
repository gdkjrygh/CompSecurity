// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.f:
//            g, h

final class j
    implements Set
{

    final g a;

    j(g g1)
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
        return a.a(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return g.a(a.b(), collection);
    }

    public boolean equals(Object obj)
    {
        return g.a(this, obj);
    }

    public int hashCode()
    {
        int i = a.a() - 1;
        int k = 0;
        while (i >= 0) 
        {
            Object obj = a.a(i, 0);
            int l;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            k += l;
            i--;
        }
        return k;
    }

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new h(a, 0);
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
        return g.b(a.b(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return g.c(a.b(), collection);
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
}
