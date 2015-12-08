// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ii, ig

final class a
    implements Set
{

    final ii a;

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        int i = a.a();
        java.util.ntry ntry;
        for (collection = collection.iterator(); collection.hasNext(); a.a(ntry.getKey(), ntry.getValue()))
        {
            ntry = (java.util.ntry)collection.next();
        }

        return i != a.a();
    }

    public final void clear()
    {
        a.c();
    }

    public final boolean contains(Object obj)
    {
        if (obj instanceof java.util.ntry)
        {
            obj = (java.util.ntry)obj;
            int i = a.a(((java.util.ntry) (obj)).getKey());
            if (i >= 0)
            {
                return ig.a(a.a(i, 1), ((java.util.ntry) (obj)).getValue());
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
        return ii.a(this, obj);
    }

    public final int hashCode()
    {
        int j = a.a() - 1;
        int i = 0;
        while (j >= 0) 
        {
            Object obj = a.a(j, 0);
            Object obj1 = a.a(j, 1);
            int k;
            int l;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            if (obj1 == null)
            {
                l = 0;
            } else
            {
                l = obj1.hashCode();
            }
            j--;
            i += l ^ k;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return a.a() == 0;
    }

    public final Iterator iterator()
    {
        return new <init>(a);
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

    on(ii ii1)
    {
        a = ii1;
        super();
    }
}
