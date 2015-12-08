// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractSetMultimap, Sets, Multimap, Maps, 
//            Serialization, Multiset, ForwardingSet, Lists

public final class LinkedHashMultimap extends AbstractSetMultimap
{
    private class SetDecorator extends ForwardingSet
    {

        final Set _flddelegate;
        final Object key;
        final LinkedHashMultimap this$0;

        public boolean add(Object obj)
        {
            boolean flag = _flddelegate.add(obj);
            if (flag)
            {
                linkedEntries.add(createEntry(obj));
            }
            return flag;
        }

        public boolean addAll(Collection collection)
        {
            boolean flag = _flddelegate.addAll(collection);
            if (flag)
            {
                linkedEntries.addAll(createEntries(_mthdelegate()));
            }
            return flag;
        }

        public void clear()
        {
            Object obj;
            for (Iterator iterator1 = _flddelegate.iterator(); iterator1.hasNext(); linkedEntries.remove(createEntry(obj)))
            {
                obj = iterator1.next();
            }

            _flddelegate.clear();
        }

        Collection createEntries(Collection collection)
        {
            java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(collection.size());
            for (collection = collection.iterator(); collection.hasNext(); arraylist.add(createEntry(collection.next()))) { }
            return arraylist;
        }

        java.util.Map.Entry createEntry(Object obj)
        {
            return Maps.immutableEntry(key, obj);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate;
        }

        public Iterator iterator()
        {
            return _flddelegate.iterator(). new Iterator() {

                final SetDecorator this$1;
                final Iterator val$delegateIterator;
                Object value;

                public boolean hasNext()
                {
                    return delegateIterator.hasNext();
                }

                public Object next()
                {
                    value = delegateIterator.next();
                    return value;
                }

                public void remove()
                {
                    delegateIterator.remove();
                    linkedEntries.remove(createEntry(value));
                }

            
            {
                this$1 = final_setdecorator;
                delegateIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            boolean flag = _flddelegate.remove(obj);
            if (flag)
            {
                linkedEntries.remove(createEntry(obj));
            }
            return flag;
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag = _flddelegate.removeAll(collection);
            if (flag)
            {
                linkedEntries.removeAll(createEntries(collection));
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag = false;
            Iterator iterator1 = _flddelegate.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(obj))
                {
                    iterator1.remove();
                    linkedEntries.remove(Maps.immutableEntry(key, obj));
                    flag = true;
                }
            } while (true);
            return flag;
        }

        SetDecorator(Object obj, Set set)
        {
            this$0 = LinkedHashMultimap.this;
            super();
            _flddelegate = set;
            key = obj;
        }
    }


    private static final int DEFAULT_VALUES_PER_KEY = 8;
    private static final long serialVersionUID = 0L;
    transient int expectedValuesPerKey;
    transient Collection linkedEntries;

    private LinkedHashMultimap()
    {
        super(new LinkedHashMap());
        expectedValuesPerKey = 8;
        linkedEntries = Sets.newLinkedHashSet();
    }

    private LinkedHashMultimap(int i, int j)
    {
        super(new LinkedHashMap(i));
        expectedValuesPerKey = 8;
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        expectedValuesPerKey = j;
        linkedEntries = new LinkedHashSet((int)Math.min(0x40000000L, (long)i * (long)j));
    }

    private LinkedHashMultimap(Multimap multimap)
    {
        super(new LinkedHashMap(Maps.capacity(multimap.keySet().size())));
        expectedValuesPerKey = 8;
        linkedEntries = new LinkedHashSet(Maps.capacity(multimap.size()));
        putAll(multimap);
    }

    public static LinkedHashMultimap create()
    {
        return new LinkedHashMultimap();
    }

    public static LinkedHashMultimap create(int i, int j)
    {
        return new LinkedHashMultimap(i, j);
    }

    public static LinkedHashMultimap create(Multimap multimap)
    {
        return new LinkedHashMultimap(multimap);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        expectedValuesPerKey = objectinputstream.readInt();
        int i = Serialization.readCount(objectinputstream);
        setMap(new LinkedHashMap(Maps.capacity(i)));
        linkedEntries = new LinkedHashSet(expectedValuesPerKey * i);
        Serialization.populateMultimap(this, objectinputstream, i);
        linkedEntries.clear();
        for (int j = 0; j < size(); j++)
        {
            Object obj = objectinputstream.readObject();
            Object obj1 = objectinputstream.readObject();
            linkedEntries.add(Maps.immutableEntry(obj, obj1));
        }

    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(expectedValuesPerKey);
        Serialization.writeMultimap(this, objectoutputstream);
        java.util.Map.Entry entry;
        for (Iterator iterator = linkedEntries.iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            objectoutputstream.writeObject(entry.getKey());
        }

    }

    public volatile Map asMap()
    {
        return super.asMap();
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean containsEntry(Object obj, Object obj1)
    {
        return super.containsEntry(obj, obj1);
    }

    public volatile boolean containsKey(Object obj)
    {
        return super.containsKey(obj);
    }

    public volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    volatile Collection createCollection()
    {
        return createCollection();
    }

    Collection createCollection(Object obj)
    {
        return new SetDecorator(obj, createCollection());
    }

    Set createCollection()
    {
        return new LinkedHashSet(Maps.capacity(expectedValuesPerKey));
    }

    Iterator createEntryIterator()
    {
        return new Iterator() {

            java.util.Map.Entry entry;
            final LinkedHashMultimap this$0;
            final Iterator val$delegateIterator;

            public boolean hasNext()
            {
                return delegateIterator.hasNext();
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                entry = (java.util.Map.Entry)delegateIterator.next();
                return entry;
            }

            public void remove()
            {
                delegateIterator.remove();
                LinkedHashMultimap.this.remove(entry.getKey(), entry.getValue());
            }

            
            {
                this$0 = LinkedHashMultimap.this;
                delegateIterator = iterator;
                super();
            }
        };
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return super.entries();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile Set get(Object obj)
    {
        return super.get(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public volatile Multiset keys()
    {
        return super.keys();
    }

    public volatile boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
    }

    public volatile boolean putAll(Multimap multimap)
    {
        return super.putAll(multimap);
    }

    public volatile boolean putAll(Object obj, Iterable iterable)
    {
        return super.putAll(obj, iterable);
    }

    public volatile boolean remove(Object obj, Object obj1)
    {
        return super.remove(obj, obj1);
    }

    public volatile Set removeAll(Object obj)
    {
        return super.removeAll(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        return super.replaceValues(obj, iterable);
    }

    public volatile int size()
    {
        return super.size();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    public Collection values()
    {
        return super.values();
    }
}
