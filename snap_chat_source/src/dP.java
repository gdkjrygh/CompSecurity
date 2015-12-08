// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

public abstract class dP extends dQ
    implements Collection
{

    protected dP()
    {
    }

    public boolean add(Object obj)
    {
        return b().add(obj);
    }

    public boolean addAll(Collection collection)
    {
        return b().addAll(collection);
    }

    protected abstract Collection b();

    protected Object c()
    {
        return b();
    }

    public void clear()
    {
        b().clear();
    }

    public boolean contains(Object obj)
    {
        return b().contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return b().containsAll(collection);
    }

    public boolean isEmpty()
    {
        return b().isEmpty();
    }

    public Iterator iterator()
    {
        return b().iterator();
    }

    public boolean remove(Object obj)
    {
        return b().remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return b().removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return b().retainAll(collection);
    }

    public int size()
    {
        return b().size();
    }

    public Object[] toArray()
    {
        return b().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return b().toArray(aobj);
    }
}
