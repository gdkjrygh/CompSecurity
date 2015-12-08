// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractSortedSetMultimap, Multimaps

private static class valueComparator extends AbstractSortedSetMultimap
{

    private static final long serialVersionUID = 0L;
    transient Supplier factory;
    transient Comparator valueComparator;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        factory = (Supplier)objectinputstream.readObject();
        valueComparator = ((SortedSet)factory.get()).comparator();
        setMap((Map)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(factory);
        objectoutputstream.writeObject(backingMap());
    }

    protected volatile Collection createCollection()
    {
        return createCollection();
    }

    protected volatile Set createCollection()
    {
        return createCollection();
    }

    protected SortedSet createCollection()
    {
        return (SortedSet)factory.get();
    }

    public Comparator valueComparator()
    {
        return valueComparator;
    }

    A(Map map, Supplier supplier)
    {
        super(map);
        factory = (Supplier)Preconditions.checkNotNull(supplier);
        valueComparator = ((SortedSet)supplier.get()).comparator();
    }
}
