// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.map;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;

public class AbstractHashedMap extends AbstractMap
    implements IterableMap
{
    protected static class EntrySet extends AbstractSet
    {

        private final AbstractHashedMap parent;

        public void clear()
        {
            parent.clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                HashEntry hashentry = parent.getEntry(((java.util.Map.Entry) (obj)).getKey());
                flag = flag1;
                if (hashentry != null)
                {
                    flag = flag1;
                    if (hashentry.equals(obj))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return parent.createEntrySetIterator();
        }

        public boolean remove(Object obj)
        {
            while (!(obj instanceof java.util.Map.Entry) || !contains(obj)) 
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            parent.remove(((java.util.Map.Entry) (obj)).getKey());
            return true;
        }

        public int size()
        {
            return parent.size();
        }

        protected EntrySet(AbstractHashedMap abstracthashedmap)
        {
            parent = abstracthashedmap;
        }
    }

    protected static class EntrySetIterator extends HashIterator
        implements Iterator
    {

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return super.nextEntry();
        }

        protected EntrySetIterator(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    protected static class HashEntry
        implements java.util.Map.Entry
    {

        protected int hashCode;
        protected Object key;
        protected HashEntry next;
        protected Object value;

        public boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
label0:
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                if (getKey() != null ? getKey().equals(((java.util.Map.Entry) (obj)).getKey()) : ((java.util.Map.Entry) (obj)).getKey() == null)
                {
                    break label0;
                } else
                {
                    break; /* Loop/switch isn't completed */
                }
            }
            if (getValue() != null) goto _L4; else goto _L3
_L3:
            if (((java.util.Map.Entry) (obj)).getValue() == null) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (getValue().equals(((java.util.Map.Entry) (obj)).getValue()))
            {
                return true;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public Object getKey()
        {
            if (key == AbstractHashedMap.NULL)
            {
                return null;
            } else
            {
                return key;
            }
        }

        public Object getValue()
        {
            return value;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (getKey() == null)
            {
                i = 0;
            } else
            {
                i = getKey().hashCode();
            }
            if (getValue() != null)
            {
                j = getValue().hashCode();
            }
            return i ^ j;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = value;
            value = obj;
            return obj1;
        }

        public String toString()
        {
            return (new StringBuilder()).append(getKey()).append('=').append(getValue()).toString();
        }

        protected HashEntry(HashEntry hashentry, int i, Object obj, Object obj1)
        {
            next = hashentry;
            hashCode = i;
            key = obj;
            value = obj1;
        }
    }

    protected static abstract class HashIterator
    {

        private int expectedModCount;
        private int hashIndex;
        private HashEntry last;
        private HashEntry next;
        private final AbstractHashedMap parent;

        protected HashEntry currentEntry()
        {
            return last;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        protected HashEntry nextEntry()
        {
            if (parent.modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            }
            HashEntry hashentry1 = next;
            if (hashentry1 == null)
            {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            HashEntry ahashentry[] = parent.data;
            int i = hashIndex;
            HashEntry hashentry;
            for (hashentry = hashentry1.next; hashentry == null && i > 0; hashentry = ahashentry[i])
            {
                i--;
            }

            next = hashentry;
            hashIndex = i;
            last = hashentry1;
            return hashentry1;
        }

        public void remove()
        {
            if (last == null)
            {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            if (parent.modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                parent.remove(last.getKey());
                last = null;
                expectedModCount = parent.modCount;
                return;
            }
        }

        public String toString()
        {
            if (last != null)
            {
                return (new StringBuilder()).append("Iterator[").append(last.getKey()).append("=").append(last.getValue()).append("]").toString();
            } else
            {
                return "Iterator[]";
            }
        }

        protected HashIterator(AbstractHashedMap abstracthashedmap)
        {
            parent = abstracthashedmap;
            HashEntry ahashentry[] = abstracthashedmap.data;
            int i = ahashentry.length;
            HashEntry hashentry;
            for (hashentry = null; i > 0 && hashentry == null; hashentry = ahashentry[i])
            {
                i--;
            }

            next = hashentry;
            hashIndex = i;
            expectedModCount = abstracthashedmap.modCount;
        }
    }

    protected static class HashMapIterator extends HashIterator
        implements MapIterator
    {

        public Object getValue()
        {
            HashEntry hashentry = currentEntry();
            if (hashentry == null)
            {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            } else
            {
                return hashentry.getValue();
            }
        }

        public Object next()
        {
            return super.nextEntry().getKey();
        }

        protected HashMapIterator(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    protected static class KeySet extends AbstractSet
    {

        private final AbstractHashedMap parent;

        public void clear()
        {
            parent.clear();
        }

        public boolean contains(Object obj)
        {
            return parent.containsKey(obj);
        }

        public Iterator iterator()
        {
            return parent.createKeySetIterator();
        }

        public boolean remove(Object obj)
        {
            boolean flag = parent.containsKey(obj);
            parent.remove(obj);
            return flag;
        }

        public int size()
        {
            return parent.size();
        }

        protected KeySet(AbstractHashedMap abstracthashedmap)
        {
            parent = abstracthashedmap;
        }
    }

    protected static class KeySetIterator extends HashIterator
        implements Iterator
    {

        public Object next()
        {
            return super.nextEntry().getKey();
        }

        protected KeySetIterator(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }

    protected static class Values extends AbstractCollection
    {

        private final AbstractHashedMap parent;

        public void clear()
        {
            parent.clear();
        }

        public boolean contains(Object obj)
        {
            return parent.containsValue(obj);
        }

        public Iterator iterator()
        {
            return parent.createValuesIterator();
        }

        public int size()
        {
            return parent.size();
        }

        protected Values(AbstractHashedMap abstracthashedmap)
        {
            parent = abstracthashedmap;
        }
    }

    protected static class ValuesIterator extends HashIterator
        implements Iterator
    {

        public Object next()
        {
            return super.nextEntry().getValue();
        }

        protected ValuesIterator(AbstractHashedMap abstracthashedmap)
        {
            super(abstracthashedmap);
        }
    }


    protected static final Object NULL = new Object();
    transient HashEntry data[];
    transient EntrySet entrySet;
    transient KeySet keySet;
    transient float loadFactor;
    transient int modCount;
    transient int size;
    transient int threshold;
    transient Values values;

    protected AbstractHashedMap()
    {
    }

    private void _putAll(Map map)
    {
        int i = map.size();
        if (i != 0)
        {
            ensureCapacity(calculateNewCapacity((int)((float)(size + i) / loadFactor + 1.0F)));
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    protected void addEntry(HashEntry hashentry, int i)
    {
        data[i] = hashentry;
    }

    protected void addMapping(int i, int j, Object obj, Object obj1)
    {
        modCount = modCount + 1;
        addEntry(createEntry(data[i], j, obj, obj1), i);
        size = size + 1;
        checkCapacity();
    }

    protected int calculateNewCapacity(int i)
    {
        int j = 1;
        if (i > 0x40000000)
        {
            i = 0x40000000;
        } else
        {
            for (; j < i; j <<= 1) { }
            i = j;
            if (j > 0x40000000)
            {
                return 0x40000000;
            }
        }
        return i;
    }

    protected int calculateThreshold(int i, float f)
    {
        return (int)((float)i * f);
    }

    protected void checkCapacity()
    {
        if (size >= threshold)
        {
            int i = data.length * 2;
            if (i <= 0x40000000)
            {
                ensureCapacity(i);
            }
        }
    }

    public void clear()
    {
        modCount = modCount + 1;
        HashEntry ahashentry[] = data;
        for (int i = ahashentry.length - 1; i >= 0; i--)
        {
            ahashentry[i] = null;
        }

        size = 0;
    }

    protected volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    protected AbstractHashedMap clone()
    {
        AbstractHashedMap abstracthashedmap;
        try
        {
            abstracthashedmap = (AbstractHashedMap)super.clone();
            abstracthashedmap.data = new HashEntry[data.length];
            abstracthashedmap.entrySet = null;
            abstracthashedmap.keySet = null;
            abstracthashedmap.values = null;
            abstracthashedmap.modCount = 0;
            abstracthashedmap.size = 0;
            abstracthashedmap.init();
            abstracthashedmap.putAll(this);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError();
        }
        return abstracthashedmap;
    }

    public boolean containsKey(Object obj)
    {
        Object obj1 = convertKey(obj);
        int i = hash(obj1);
        for (obj = data[hashIndex(i, data.length)]; obj != null; obj = ((HashEntry) (obj)).next)
        {
            if (((HashEntry) (obj)).hashCode == i && isEqualKey(obj1, ((HashEntry) (obj)).key))
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        HashEntry ahashentry[];
        int i;
        int j;
        ahashentry = data;
        j = ahashentry.length;
        i = 0;
_L8:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = ahashentry[i];
_L7:
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((HashEntry) (obj)).getValue() != null) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        obj = ((HashEntry) (obj)).next;
          goto _L7
_L4:
        i++;
          goto _L8
_L2:
        HashEntry ahashentry1[];
        ahashentry1 = data;
        j = ahashentry1.length;
        i = 0;
_L11:
        HashEntry hashentry;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        hashentry = ahashentry1[i];
_L10:
        if (hashentry == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (isEqualValue(obj, hashentry.getValue())) goto _L5; else goto _L9
_L9:
        hashentry = hashentry.next;
          goto _L10
          goto _L5
        i++;
          goto _L11
        return false;
          goto _L7
    }

    protected Object convertKey(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = NULL;
        }
        return obj1;
    }

    protected HashEntry createEntry(HashEntry hashentry, int i, Object obj, Object obj1)
    {
        return new HashEntry(hashentry, i, convertKey(obj), obj1);
    }

    protected Iterator createEntrySetIterator()
    {
        if (size() == 0)
        {
            return EmptyIterator.emptyIterator();
        } else
        {
            return new EntrySetIterator(this);
        }
    }

    protected Iterator createKeySetIterator()
    {
        if (size() == 0)
        {
            return EmptyIterator.emptyIterator();
        } else
        {
            return new KeySetIterator(this);
        }
    }

    protected Iterator createValuesIterator()
    {
        if (size() == 0)
        {
            return EmptyIterator.emptyIterator();
        } else
        {
            return new ValuesIterator(this);
        }
    }

    protected void destroyEntry(HashEntry hashentry)
    {
        hashentry.next = null;
        hashentry.key = null;
        hashentry.value = null;
    }

    protected void ensureCapacity(int i)
    {
        int j = data.length;
        if (i <= j)
        {
            return;
        }
        if (size == 0)
        {
            threshold = calculateThreshold(i, loadFactor);
            data = new HashEntry[i];
            return;
        }
        HashEntry ahashentry[] = data;
        HashEntry ahashentry1[] = new HashEntry[i];
        modCount = modCount + 1;
        for (j--; j >= 0; j--)
        {
            HashEntry hashentry = ahashentry[j];
            if (hashentry == null)
            {
                continue;
            }
            ahashentry[j] = null;
            HashEntry hashentry1;
            do
            {
                hashentry1 = hashentry.next;
                int k = hashIndex(hashentry.hashCode, i);
                hashentry.next = ahashentry1[k];
                ahashentry1[k] = hashentry;
                hashentry = hashentry1;
            } while (hashentry1 != null);
        }

        threshold = calculateThreshold(i, loadFactor);
        data = ahashentry1;
    }

    public Set entrySet()
    {
        if (entrySet == null)
        {
            entrySet = new EntrySet(this);
        }
        return entrySet;
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        MapIterator mapiterator;
        if (!(obj instanceof Map))
        {
            return false;
        }
        obj = (Map)obj;
        if (((Map) (obj)).size() != size())
        {
            return false;
        }
        mapiterator = mapIterator();
_L4:
        Object obj1;
        Object obj2;
        if (!mapiterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = mapiterator.next();
        obj2 = mapiterator.getValue();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (((Map) (obj)).get(obj1) != null || !((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        continue; /* Loop/switch isn't completed */
        boolean flag;
        try
        {
            flag = obj2.equals(((Map) (obj)).get(obj1));
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
        if (!flag)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
    }

    public Object get(Object obj)
    {
        Object obj1 = convertKey(obj);
        int i = hash(obj1);
        for (obj = data[hashIndex(i, data.length)]; obj != null; obj = ((HashEntry) (obj)).next)
        {
            if (((HashEntry) (obj)).hashCode == i && isEqualKey(obj1, ((HashEntry) (obj)).key))
            {
                return ((HashEntry) (obj)).getValue();
            }
        }

        return null;
    }

    protected HashEntry getEntry(Object obj)
    {
        Object obj1 = convertKey(obj);
        int i = hash(obj1);
        for (obj = data[hashIndex(i, data.length)]; obj != null; obj = ((HashEntry) (obj)).next)
        {
            if (((HashEntry) (obj)).hashCode == i && isEqualKey(obj1, ((HashEntry) (obj)).key))
            {
                return ((HashEntry) (obj));
            }
        }

        return null;
    }

    protected int hash(Object obj)
    {
        int i = obj.hashCode();
        i += ~(i << 9);
        i ^= i >>> 14;
        i += i << 4;
        return i ^ i >>> 10;
    }

    public int hashCode()
    {
        int i = 0;
        for (Iterator iterator = createEntrySetIterator(); iterator.hasNext();)
        {
            i += ((java.util.Map.Entry)iterator.next()).hashCode();
        }

        return i;
    }

    protected int hashIndex(int i, int j)
    {
        return j - 1 & i;
    }

    protected void init()
    {
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    protected boolean isEqualKey(Object obj, Object obj1)
    {
        return obj == obj1 || obj.equals(obj1);
    }

    protected boolean isEqualValue(Object obj, Object obj1)
    {
        return obj == obj1 || obj.equals(obj1);
    }

    public Set keySet()
    {
        if (keySet == null)
        {
            keySet = new KeySet(this);
        }
        return keySet;
    }

    public MapIterator mapIterator()
    {
        if (size == 0)
        {
            return EmptyMapIterator.emptyMapIterator();
        } else
        {
            return new HashMapIterator(this);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        Object obj2 = convertKey(obj);
        int i = hash(obj2);
        int j = hashIndex(i, data.length);
        for (HashEntry hashentry = data[j]; hashentry != null; hashentry = hashentry.next)
        {
            if (hashentry.hashCode == i && isEqualKey(obj2, hashentry.key))
            {
                obj = hashentry.getValue();
                updateEntry(hashentry, obj1);
                return obj;
            }
        }

        addMapping(j, i, obj, obj1);
        return null;
    }

    public void putAll(Map map)
    {
        _putAll(map);
    }

    public Object remove(Object obj)
    {
        Object obj2 = convertKey(obj);
        int i = hash(obj2);
        int j = hashIndex(i, data.length);
        obj = data[j];
        Object obj1 = null;
        for (; obj != null; obj = ((HashEntry) (obj)).next)
        {
            if (((HashEntry) (obj)).hashCode == i && isEqualKey(obj2, ((HashEntry) (obj)).key))
            {
                Object obj3 = ((HashEntry) (obj)).getValue();
                removeMapping(((HashEntry) (obj)), j, ((HashEntry) (obj1)));
                return obj3;
            }
            obj1 = obj;
        }

        return null;
    }

    protected void removeEntry(HashEntry hashentry, int i, HashEntry hashentry1)
    {
        if (hashentry1 == null)
        {
            data[i] = hashentry.next;
            return;
        } else
        {
            hashentry1.next = hashentry.next;
            return;
        }
    }

    protected void removeMapping(HashEntry hashentry, int i, HashEntry hashentry1)
    {
        modCount = modCount + 1;
        removeEntry(hashentry, i, hashentry1);
        size = size - 1;
        destroyEntry(hashentry);
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        if (size() == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(size() * 32);
        stringbuilder.append('{');
        MapIterator mapiterator = mapIterator();
        boolean flag = mapiterator.hasNext();
        do
        {
            if (!flag)
            {
                break;
            }
            Object obj2 = mapiterator.next();
            Object obj1 = mapiterator.getValue();
            Object obj = obj2;
            if (obj2 == this)
            {
                obj = "(this Map)";
            }
            obj2 = stringbuilder.append(obj).append('=');
            obj = obj1;
            if (obj1 == this)
            {
                obj = "(this Map)";
            }
            ((StringBuilder) (obj2)).append(obj);
            boolean flag1 = mapiterator.hasNext();
            flag = flag1;
            if (flag1)
            {
                stringbuilder.append(',').append(' ');
                flag = flag1;
            }
        } while (true);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    protected void updateEntry(HashEntry hashentry, Object obj)
    {
        hashentry.setValue(obj);
    }

    public Collection values()
    {
        if (values == null)
        {
            values = new Values(this);
        }
        return values;
    }

}
