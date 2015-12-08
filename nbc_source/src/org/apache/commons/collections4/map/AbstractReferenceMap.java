// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.map;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.keyvalue.DefaultMapEntry;

// Referenced classes of package org.apache.commons.collections4.map:
//            AbstractHashedMap

public abstract class AbstractReferenceMap extends AbstractHashedMap
{
    static class ReferenceBaseIterator
    {

        Object currentKey;
        Object currentValue;
        ReferenceEntry entry;
        int expectedModCount;
        int index;
        Object nextKey;
        Object nextValue;
        final AbstractReferenceMap parent;
        ReferenceEntry previous;

        private void checkMod()
        {
            if (parent.modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                return;
            }
        }

        private boolean nextNull()
        {
            return nextKey == null || nextValue == null;
        }

        protected ReferenceEntry currentEntry()
        {
            checkMod();
            return previous;
        }

        public boolean hasNext()
        {
            checkMod();
            do
            {
                if (!nextNull())
                {
                    break;
                }
                ReferenceEntry referenceentry = entry;
                int i;
                for (i = index; referenceentry == null && i > 0; referenceentry = (ReferenceEntry)parent.data[i])
                {
                    i--;
                }

                entry = referenceentry;
                index = i;
                if (referenceentry == null)
                {
                    currentKey = null;
                    currentValue = null;
                    return false;
                }
                nextKey = referenceentry.getKey();
                nextValue = referenceentry.getValue();
                if (nextNull())
                {
                    entry = entry.next();
                }
            } while (true);
            return true;
        }

        protected ReferenceEntry nextEntry()
        {
            checkMod();
            if (nextNull() && !hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                previous = entry;
                entry = entry.next();
                currentKey = nextKey;
                currentValue = nextValue;
                nextKey = null;
                nextValue = null;
                return previous;
            }
        }

        public void remove()
        {
            checkMod();
            if (previous == null)
            {
                throw new IllegalStateException();
            } else
            {
                parent.remove(currentKey);
                previous = null;
                currentKey = null;
                currentValue = null;
                expectedModCount = parent.modCount;
                return;
            }
        }

        public ReferenceBaseIterator(AbstractReferenceMap abstractreferencemap)
        {
            parent = abstractreferencemap;
            int i;
            if (abstractreferencemap.size() != 0)
            {
                i = abstractreferencemap.data.length;
            } else
            {
                i = 0;
            }
            index = i;
            expectedModCount = abstractreferencemap.modCount;
        }
    }

    protected static class ReferenceEntry extends AbstractHashedMap.HashEntry
    {

        private final AbstractReferenceMap parent;

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                Object obj1 = (java.util.Map.Entry)obj;
                obj = ((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                if (obj == null || obj1 == null)
                {
                    return false;
                }
                if (!parent.isEqualKey(obj, key) || !parent.isEqualValue(obj1, getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public Object getKey()
        {
            if (parent.keyType == ReferenceStrength.HARD)
            {
                return key;
            } else
            {
                return ((Reference)key).get();
            }
        }

        public Object getValue()
        {
            if (parent.valueType == ReferenceStrength.HARD)
            {
                return value;
            } else
            {
                return ((Reference)value).get();
            }
        }

        public int hashCode()
        {
            return parent.hashEntry(getKey(), getValue());
        }

        protected ReferenceEntry next()
        {
            return (ReferenceEntry)next;
        }

        boolean purge(Reference reference)
        {
            boolean flag;
            boolean flag1;
            if (parent.keyType != ReferenceStrength.HARD && key == reference)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || parent.valueType != ReferenceStrength.HARD && value == reference)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (parent.keyType != ReferenceStrength.HARD)
                {
                    ((Reference)key).clear();
                }
                if (parent.valueType != ReferenceStrength.HARD)
                {
                    ((Reference)value).clear();
                } else
                if (parent.purgeValues)
                {
                    value = null;
                    return flag1;
                }
            }
            return flag1;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = getValue();
            if (parent.valueType != ReferenceStrength.HARD)
            {
                ((Reference)value).clear();
            }
            value = toReference(parent.valueType, obj, hashCode);
            return obj1;
        }

        protected Object toReference(ReferenceStrength referencestrength, Object obj, int i)
        {
            if (referencestrength == ReferenceStrength.HARD)
            {
                return obj;
            }
            if (referencestrength == ReferenceStrength.SOFT)
            {
                return new SoftRef(i, obj, parent.queue);
            }
            if (referencestrength == ReferenceStrength.WEAK)
            {
                return new WeakRef(i, obj, parent.queue);
            } else
            {
                throw new Error();
            }
        }

        public ReferenceEntry(AbstractReferenceMap abstractreferencemap, AbstractHashedMap.HashEntry hashentry, int i, Object obj, Object obj1)
        {
            super(hashentry, i, null, null);
            parent = abstractreferencemap;
            key = toReference(abstractreferencemap.keyType, obj, i);
            value = toReference(abstractreferencemap.valueType, obj1, i);
        }
    }

    static class ReferenceEntrySet extends AbstractHashedMap.EntrySet
    {

        public Object[] toArray()
        {
            return toArray(new Object[size()]);
        }

        public Object[] toArray(Object aobj[])
        {
            ArrayList arraylist = new ArrayList(size());
            for (Iterator iterator = iterator(); iterator.hasNext(); arraylist.add(new DefaultMapEntry((java.util.Map.Entry)iterator.next()))) { }
            return arraylist.toArray(aobj);
        }

        protected ReferenceEntrySet(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    static class ReferenceEntrySetIterator extends ReferenceBaseIterator
        implements Iterator
    {

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return nextEntry();
        }

        public ReferenceEntrySetIterator(AbstractReferenceMap abstractreferencemap)
        {
            super(abstractreferencemap);
        }
    }

    static class ReferenceKeySet extends AbstractHashedMap.KeySet
    {

        public Object[] toArray()
        {
            return toArray(new Object[size()]);
        }

        public Object[] toArray(Object aobj[])
        {
            ArrayList arraylist = new ArrayList(size());
            for (Iterator iterator = iterator(); iterator.hasNext(); arraylist.add(iterator.next())) { }
            return arraylist.toArray(aobj);
        }

        protected ReferenceKeySet(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    static class ReferenceKeySetIterator extends ReferenceBaseIterator
        implements Iterator
    {

        public Object next()
        {
            return nextEntry().getKey();
        }

        ReferenceKeySetIterator(AbstractReferenceMap abstractreferencemap)
        {
            super(abstractreferencemap);
        }
    }

    static class ReferenceMapIterator extends ReferenceBaseIterator
        implements MapIterator
    {

        public Object getValue()
        {
            ReferenceEntry referenceentry = currentEntry();
            if (referenceentry == null)
            {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            } else
            {
                return referenceentry.getValue();
            }
        }

        public Object next()
        {
            return nextEntry().getKey();
        }

        protected ReferenceMapIterator(AbstractReferenceMap abstractreferencemap)
        {
            super(abstractreferencemap);
        }
    }

    public static final class ReferenceStrength extends Enum
    {

        private static final ReferenceStrength $VALUES[];
        public static final ReferenceStrength HARD;
        public static final ReferenceStrength SOFT;
        public static final ReferenceStrength WEAK;
        public final int value;

        public static ReferenceStrength resolve(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException();

            case 0: // '\0'
                return HARD;

            case 1: // '\001'
                return SOFT;

            case 2: // '\002'
                return WEAK;
            }
        }

        public static ReferenceStrength valueOf(String s)
        {
            return (ReferenceStrength)Enum.valueOf(org/apache/commons/collections4/map/AbstractReferenceMap$ReferenceStrength, s);
        }

        public static ReferenceStrength[] values()
        {
            return (ReferenceStrength[])$VALUES.clone();
        }

        static 
        {
            HARD = new ReferenceStrength("HARD", 0, 0);
            SOFT = new ReferenceStrength("SOFT", 1, 1);
            WEAK = new ReferenceStrength("WEAK", 2, 2);
            $VALUES = (new ReferenceStrength[] {
                HARD, SOFT, WEAK
            });
        }

        private ReferenceStrength(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    static class ReferenceValues extends AbstractHashedMap.Values
    {

        public Object[] toArray()
        {
            return toArray(new Object[size()]);
        }

        public Object[] toArray(Object aobj[])
        {
            ArrayList arraylist = new ArrayList(size());
            for (Iterator iterator = iterator(); iterator.hasNext(); arraylist.add(iterator.next())) { }
            return arraylist.toArray(aobj);
        }

        protected ReferenceValues(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    static class ReferenceValuesIterator extends ReferenceBaseIterator
        implements Iterator
    {

        public Object next()
        {
            return nextEntry().getValue();
        }

        ReferenceValuesIterator(AbstractReferenceMap abstractreferencemap)
        {
            super(abstractreferencemap);
        }
    }

    static class SoftRef extends SoftReference
    {

        private final int hash;

        public int hashCode()
        {
            return hash;
        }

        public SoftRef(int i, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            hash = i;
        }
    }

    static class WeakRef extends WeakReference
    {

        private final int hash;

        public int hashCode()
        {
            return hash;
        }

        public WeakRef(int i, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            hash = i;
        }
    }


    private ReferenceStrength keyType;
    private boolean purgeValues;
    private transient ReferenceQueue queue;
    private ReferenceStrength valueType;

    public void clear()
    {
        super.clear();
        while (queue.poll() != null) ;
    }

    public boolean containsKey(Object obj)
    {
        purgeBeforeRead();
        for (obj = getEntry(obj); obj == null || ((java.util.Map.Entry) (obj)).getValue() == null;)
        {
            return false;
        }

        return true;
    }

    public boolean containsValue(Object obj)
    {
        purgeBeforeRead();
        if (obj == null)
        {
            return false;
        } else
        {
            return super.containsValue(obj);
        }
    }

    protected volatile AbstractHashedMap.HashEntry createEntry(AbstractHashedMap.HashEntry hashentry, int i, Object obj, Object obj1)
    {
        return createEntry(hashentry, i, obj, obj1);
    }

    protected ReferenceEntry createEntry(AbstractHashedMap.HashEntry hashentry, int i, Object obj, Object obj1)
    {
        return new ReferenceEntry(this, hashentry, i, obj, obj1);
    }

    protected Iterator createEntrySetIterator()
    {
        return new ReferenceEntrySetIterator(this);
    }

    protected Iterator createKeySetIterator()
    {
        return new ReferenceKeySetIterator(this);
    }

    protected Iterator createValuesIterator()
    {
        return new ReferenceValuesIterator(this);
    }

    public Set entrySet()
    {
        if (entrySet == null)
        {
            entrySet = new ReferenceEntrySet(this);
        }
        return entrySet;
    }

    public Object get(Object obj)
    {
        purgeBeforeRead();
        obj = getEntry(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((java.util.Map.Entry) (obj)).getValue();
        }
    }

    protected AbstractHashedMap.HashEntry getEntry(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return super.getEntry(obj);
        }
    }

    protected int hashEntry(Object obj, Object obj1)
    {
        int j = 0;
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    protected void init()
    {
        queue = new ReferenceQueue();
    }

    public boolean isEmpty()
    {
        purgeBeforeRead();
        return super.isEmpty();
    }

    protected boolean isEqualKey(Object obj, Object obj1)
    {
        if (keyType != ReferenceStrength.HARD)
        {
            obj1 = ((Reference)obj1).get();
        }
        return obj == obj1 || obj.equals(obj1);
    }

    public Set keySet()
    {
        if (keySet == null)
        {
            keySet = new ReferenceKeySet(this);
        }
        return keySet;
    }

    public MapIterator mapIterator()
    {
        return new ReferenceMapIterator(this);
    }

    protected void purge()
    {
        for (Reference reference = queue.poll(); reference != null; reference = queue.poll())
        {
            purge(reference);
        }

    }

    protected void purge(Reference reference)
    {
        int i = hashIndex(reference.hashCode(), data.length);
        AbstractHashedMap.HashEntry hashentry1 = null;
        AbstractHashedMap.HashEntry hashentry = data[i];
        do
        {
label0:
            {
                if (hashentry != null)
                {
                    if (!((ReferenceEntry)hashentry).purge(reference))
                    {
                        break label0;
                    }
                    if (hashentry1 == null)
                    {
                        data[i] = hashentry.next;
                    } else
                    {
                        hashentry1.next = hashentry.next;
                    }
                    size = size - 1;
                }
                return;
            }
            hashentry1 = hashentry;
            hashentry = hashentry.next;
        } while (true);
    }

    protected void purgeBeforeRead()
    {
        purge();
    }

    protected void purgeBeforeWrite()
    {
        purge();
    }

    public Object put(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException("null keys not allowed");
        }
        if (obj1 == null)
        {
            throw new NullPointerException("null values not allowed");
        } else
        {
            purgeBeforeWrite();
            return super.put(obj, obj1);
        }
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            purgeBeforeWrite();
            return super.remove(obj);
        }
    }

    public int size()
    {
        purgeBeforeRead();
        return super.size();
    }

    public Collection values()
    {
        if (values == null)
        {
            values = new ReferenceValues(this);
        }
        return values;
    }




}
