// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bv

public abstract class bn extends bv
    implements Collection
{

    protected bn()
    {
    }

    public abstract Collection a();

    public boolean add(Object obj)
    {
        return a().add(obj);
    }

    public boolean addAll(Collection collection)
    {
        return a().addAll(collection);
    }

    public Object c()
    {
        return a();
    }

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        return a().contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a().containsAll(collection);
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public Iterator iterator()
    {
        return a().iterator();
    }

    public boolean remove(Object obj)
    {
        return a().remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return a().removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return a().retainAll(collection);
    }

    public int size()
    {
        return a().size();
    }

    public Object[] toArray()
    {
        return a().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return a().toArray(aobj);
    }
}
