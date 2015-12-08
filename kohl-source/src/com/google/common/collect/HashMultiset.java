// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset, Maps, Multisets, Iterables, 
//            Serialization

public final class HashMultiset extends AbstractMapBasedMultiset
{

    private static final long serialVersionUID = 0L;

    private HashMultiset()
    {
        super(new HashMap());
    }

    private HashMultiset(int i)
    {
        super(new HashMap(Maps.capacity(i)));
    }

    public static HashMultiset create()
    {
        return new HashMultiset();
    }

    public static HashMultiset create(int i)
    {
        return new HashMultiset(i);
    }

    public static HashMultiset create(Iterable iterable)
    {
        HashMultiset hashmultiset = create(Multisets.inferDistinctElements(iterable));
        Iterables.addAll(hashmultiset, iterable);
        return hashmultiset;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        int i = Serialization.readCount(objectinputstream);
        setBackingMap(Maps.newHashMapWithExpectedSize(i));
        Serialization.populateMultiset(this, objectinputstream, i);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        Serialization.writeMultiset(this, objectoutputstream);
    }

    public volatile int add(Object obj, int i)
    {
        return super.add(obj, i);
    }

    public volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public volatile int count(Object obj)
    {
        return super.count(obj);
    }

    public volatile Set elementSet()
    {
        return super.elementSet();
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public volatile int remove(Object obj, int i)
    {
        return super.remove(obj, i);
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public volatile int setCount(Object obj, int i)
    {
        return super.setCount(obj, i);
    }

    public volatile boolean setCount(Object obj, int i, int j)
    {
        return super.setCount(obj, i, j);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
