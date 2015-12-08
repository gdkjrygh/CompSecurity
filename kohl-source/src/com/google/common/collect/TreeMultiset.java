// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset, Iterables, Serialization

public final class TreeMultiset extends AbstractMapBasedMultiset
{
    private class SortedMapBasedElementSet extends AbstractMapBasedMultiset.MapBasedElementSet
        implements SortedSet
    {

        final TreeMultiset this$0;

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        public Object first()
        {
            return sortedMap().firstKey();
        }

        public SortedSet headSet(Object obj)
        {
            return new SortedMapBasedElementSet(sortedMap().headMap(obj));
        }

        public Object last()
        {
            return sortedMap().lastKey();
        }

        public boolean remove(Object obj)
        {
            boolean flag;
            try
            {
                flag = super.remove(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag;
        }

        SortedMap sortedMap()
        {
            return (SortedMap)getMap();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return new SortedMapBasedElementSet(sortedMap().subMap(obj, obj1));
        }

        public SortedSet tailSet(Object obj)
        {
            return new SortedMapBasedElementSet(sortedMap().tailMap(obj));
        }

        SortedMapBasedElementSet(SortedMap sortedmap)
        {
            this$0 = TreeMultiset.this;
            super(TreeMultiset.this, sortedmap);
        }
    }


    private static final long serialVersionUID = 0L;

    private TreeMultiset()
    {
        super(new TreeMap());
    }

    private TreeMultiset(Comparator comparator)
    {
        super(new TreeMap(comparator));
    }

    public static TreeMultiset create()
    {
        return new TreeMultiset();
    }

    public static TreeMultiset create(Iterable iterable)
    {
        TreeMultiset treemultiset = create();
        Iterables.addAll(treemultiset, iterable);
        return treemultiset;
    }

    public static TreeMultiset create(Comparator comparator)
    {
        return new TreeMultiset(comparator);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        setBackingMap(new TreeMap((Comparator)objectinputstream.readObject()));
        Serialization.populateMultiset(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(elementSet().comparator());
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

    public int count(Object obj)
    {
        int i;
        try
        {
            i = super.count(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return 0;
        }
        return i;
    }

    Set createElementSet()
    {
        return new SortedMapBasedElementSet((SortedMap)backingMap());
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public SortedSet elementSet()
    {
        return (SortedSet)super.elementSet();
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
