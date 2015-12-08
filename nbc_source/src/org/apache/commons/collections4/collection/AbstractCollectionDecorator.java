// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.collection;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractCollectionDecorator
    implements Serializable, Collection
{

    private Collection collection;

    protected AbstractCollectionDecorator(Collection collection1)
    {
        if (collection1 == null)
        {
            throw new IllegalArgumentException("Collection must not be null");
        } else
        {
            collection = collection1;
            return;
        }
    }

    public boolean add(Object obj)
    {
        return decorated().add(obj);
    }

    public boolean addAll(Collection collection1)
    {
        return decorated().addAll(collection1);
    }

    public void clear()
    {
        decorated().clear();
    }

    public boolean contains(Object obj)
    {
        return decorated().contains(obj);
    }

    public boolean containsAll(Collection collection1)
    {
        return decorated().containsAll(collection1);
    }

    protected Collection decorated()
    {
        return collection;
    }

    public boolean equals(Object obj)
    {
        return obj == this || decorated().equals(obj);
    }

    public int hashCode()
    {
        return decorated().hashCode();
    }

    public boolean isEmpty()
    {
        return decorated().isEmpty();
    }

    public Iterator iterator()
    {
        return decorated().iterator();
    }

    public boolean remove(Object obj)
    {
        return decorated().remove(obj);
    }

    public boolean removeAll(Collection collection1)
    {
        return decorated().removeAll(collection1);
    }

    public boolean retainAll(Collection collection1)
    {
        return decorated().retainAll(collection1);
    }

    public int size()
    {
        return decorated().size();
    }

    public Object[] toArray()
    {
        return decorated().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return decorated().toArray(aobj);
    }

    public String toString()
    {
        return decorated().toString();
    }
}
