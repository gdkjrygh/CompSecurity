// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.collection;

import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.Unmodifiable;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;

// Referenced classes of package org.apache.commons.collections4.collection:
//            AbstractCollectionDecorator

public final class UnmodifiableCollection extends AbstractCollectionDecorator
    implements Unmodifiable
{

    private UnmodifiableCollection(Collection collection)
    {
        super(collection);
    }

    public static Collection unmodifiableCollection(Collection collection)
    {
        if (collection instanceof Unmodifiable)
        {
            return collection;
        } else
        {
            return new UnmodifiableCollection(collection);
        }
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
        throw new UnsupportedOperationException();
    }

    public Iterator iterator()
    {
        return UnmodifiableIterator.unmodifiableIterator(decorated().iterator());
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }
}
