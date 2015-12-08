// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset, Maps, Multisets, ag, 
//            bl, ea, dl, dm

public final class LinkedHashMultiset extends AbstractMapBasedMultiset
{

    private static final long serialVersionUID = 0L;

    private LinkedHashMultiset()
    {
        super(new LinkedHashMap());
    }

    private LinkedHashMultiset(int i)
    {
        super(new LinkedHashMap(Maps.a(i)));
    }

    public static LinkedHashMultiset create()
    {
        return new LinkedHashMultiset();
    }

    public static LinkedHashMultiset create(int i)
    {
        return new LinkedHashMultiset(i);
    }

    public static LinkedHashMultiset create(Iterable iterable)
    {
        LinkedHashMultiset linkedhashmultiset = create(Multisets.a(iterable));
        if (iterable instanceof Collection)
        {
            linkedhashmultiset.addAll(ag.a(iterable));
            return linkedhashmultiset;
        } else
        {
            bl.a(linkedhashmultiset, ((Iterable)p.a(iterable)).iterator());
            return linkedhashmultiset;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        int i = objectinputstream.readInt();
        setBackingMap(new LinkedHashMap(Maps.a(i)));
        ea.a(this, objectinputstream, i);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(entrySet().size());
        dm dm1;
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext(); objectoutputstream.writeInt(dm1.getCount()))
        {
            dm1 = (dm)iterator1.next();
            objectoutputstream.writeObject(dm1.getElement());
        }

    }

    public final volatile int add(Object obj, int i)
    {
        return super.add(obj, i);
    }

    public final volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public final volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public final volatile void clear()
    {
        super.clear();
    }

    public final volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public final volatile int count(Object obj)
    {
        return super.count(obj);
    }

    public final volatile Set elementSet()
    {
        return super.elementSet();
    }

    public final volatile Set entrySet()
    {
        return super.entrySet();
    }

    public final volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final volatile int hashCode()
    {
        return super.hashCode();
    }

    public final volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public final volatile Iterator iterator()
    {
        return super.iterator();
    }

    public final volatile int remove(Object obj, int i)
    {
        return super.remove(obj, i);
    }

    public final volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public final volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public final volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public final volatile int setCount(Object obj, int i)
    {
        return super.setCount(obj, i);
    }

    public final volatile boolean setCount(Object obj, int i, int j)
    {
        return super.setCount(obj, i, j);
    }

    public final volatile int size()
    {
        return super.size();
    }

    public final volatile String toString()
    {
        return super.toString();
    }
}
