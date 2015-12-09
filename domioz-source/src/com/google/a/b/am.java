// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            cp, ar, di, cm

public abstract class am extends AbstractCollection
    implements Serializable
{

    private transient ar a;

    am()
    {
    }

    int a(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    public abstract di a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public ar b()
    {
        ar ar2 = a;
        ar ar1 = ar2;
        if (ar2 == null)
        {
            ar1 = f();
            a = ar1;
        }
        return ar1;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    abstract boolean e();

    ar f()
    {
        switch (size())
        {
        default:
            return new cp(this, toArray());

        case 0: // '\0'
            return ar.d();

        case 1: // '\001'
            return ar.a(a().next());
        }
    }

    public Iterator iterator()
    {
        return a();
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

    public final Object[] toArray()
    {
        int i = size();
        if (i == 0)
        {
            return cm.a;
        } else
        {
            Object aobj[] = new Object[i];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        ad.a(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = cm.a(aobj, i);
_L4:
        a(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
