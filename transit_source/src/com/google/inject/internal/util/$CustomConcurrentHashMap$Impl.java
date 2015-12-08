// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap, $AbstractMapEntry

static class InternalsImpl extends AbstractMap
    implements ConcurrentMap, Serializable
{
    final class EntryIterator extends HashIterator
        implements Iterator
    {

        final .CustomConcurrentHashMap.Impl this$0;

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return nextEntry();
        }

        EntryIterator()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
        }
    }

    final class EntrySet extends AbstractSet
    {

        final .CustomConcurrentHashMap.Impl this$0;

        public void clear()
        {
            .CustomConcurrentHashMap.Impl.this.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null)
                {
                    obj1 = get(obj1);
                    if (obj1 != null && strategy.equalValues(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isEmpty()
        {
            return .CustomConcurrentHashMap.Impl.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new EntryIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && .CustomConcurrentHashMap.Impl.this.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return .CustomConcurrentHashMap.Impl.this.size();
        }

        EntrySet()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
        }
    }

    static class Fields
    {

        static final Field loadFactor = findField("loadFactor");
        static final Field segmentMask = findField("segmentMask");
        static final Field segmentShift = findField("segmentShift");
        static final Field segments = findField("segments");
        static final Field strategy = findField("strategy");

        static Field findField(String s)
        {
            try
            {
                s = com/google/inject/internal/util/$CustomConcurrentHashMap$Impl.getDeclaredField(s);
                s.setAccessible(true);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
            return s;
        }


        Fields()
        {
        }
    }

    abstract class HashIterator
    {

        AtomicReferenceArray currentTable;
        WriteThroughEntry lastReturned;
        Object nextEntry;
        WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final .CustomConcurrentHashMap.Impl this$0;

        final void advance()
        {
            nextExternal = null;
            break MISSING_BLOCK_LABEL_5;
            if (!nextInChain() && !nextInTable())
            {
                while (nextSegmentIndex >= 0) 
                {
                    Segment asegment[] = segments;
                    int i = nextSegmentIndex;
                    nextSegmentIndex = i - 1;
                    Segment segment = asegment[i];
                    if (segment.count != 0)
                    {
                        currentTable = segment.table;
                        nextTableIndex = currentTable.length() - 1;
                        if (nextInTable())
                        {
                            return;
                        }
                    }
                }
            }
            return;
        }

        boolean advanceTo(Object obj)
        {
            .CustomConcurrentHashMap.Strategy strategy1 = strategy;
            Object obj1 = strategy1.getKey(obj);
            obj = strategy1.getValue(obj);
            if (obj1 != null && obj != null)
            {
                nextExternal = new WriteThroughEntry(obj1, obj);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean hasMoreElements()
        {
            return hasNext();
        }

        public boolean hasNext()
        {
            return nextExternal != null;
        }

        WriteThroughEntry nextEntry()
        {
            if (nextExternal == null)
            {
                throw new NoSuchElementException();
            } else
            {
                lastReturned = nextExternal;
                advance();
                return lastReturned;
            }
        }

        boolean nextInChain()
        {
            .CustomConcurrentHashMap.Strategy strategy1 = strategy;
            if (nextEntry != null)
            {
                for (nextEntry = strategy1.getNext(nextEntry); nextEntry != null; nextEntry = strategy1.getNext(nextEntry))
                {
                    if (advanceTo(nextEntry))
                    {
                        return true;
                    }
                }

            }
            return false;
        }

        boolean nextInTable()
        {
            while (nextTableIndex >= 0) 
            {
                Object obj = currentTable;
                int i = nextTableIndex;
                nextTableIndex = i - 1;
                obj = ((AtomicReferenceArray) (obj)).get(i);
                nextEntry = obj;
                if (obj != null && (advanceTo(nextEntry) || nextInChain()))
                {
                    return true;
                }
            }
            return false;
        }

        public void remove()
        {
            if (lastReturned == null)
            {
                throw new IllegalStateException();
            } else
            {
                .CustomConcurrentHashMap.Impl.this.remove(lastReturned.getKey());
                lastReturned = null;
                return;
            }
        }

        HashIterator()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
            nextSegmentIndex = segments.length - 1;
            nextTableIndex = -1;
            advance();
        }
    }

    class InternalsImpl
        implements .CustomConcurrentHashMap.Internals, Serializable
    {

        static final long serialVersionUID = 0L;
        final .CustomConcurrentHashMap.Impl this$0;

        public Object getEntry(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).getEntry(obj, i);
            }
        }

        public boolean removeEntry(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException("entry");
            } else
            {
                int i = strategy.getHash(obj);
                return segmentFor(i).removeEntry(obj, i);
            }
        }

        public boolean removeEntry(Object obj, Object obj1)
        {
            if (obj == null)
            {
                throw new NullPointerException("entry");
            } else
            {
                int i = strategy.getHash(obj);
                return segmentFor(i).removeEntry(obj, i, obj1);
            }
        }

        InternalsImpl()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
        }
    }

    final class KeyIterator extends HashIterator
        implements Iterator
    {

        final .CustomConcurrentHashMap.Impl this$0;

        public Object next()
        {
            return super.nextEntry().getKey();
        }

        KeyIterator()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
        }
    }

    final class KeySet extends AbstractSet
    {

        final .CustomConcurrentHashMap.Impl this$0;

        public void clear()
        {
            .CustomConcurrentHashMap.Impl.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public boolean isEmpty()
        {
            return .CustomConcurrentHashMap.Impl.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new KeyIterator();
        }

        public boolean remove(Object obj)
        {
            return .CustomConcurrentHashMap.Impl.this.remove(obj) != null;
        }

        public int size()
        {
            return .CustomConcurrentHashMap.Impl.this.size();
        }

        KeySet()
        {
            this$0 = .CustomConcurrentHashMap.Impl.this;
            super();
        }
    }

    final class Segment extends ReentrantLock
    {

        volatile int count;
        int modCount;
        volatile AtomicReferenceArray table;
        final .CustomConcurrentHashMap.Impl this$0;
        int threshold;

        void clear()
        {
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            lock();
            AtomicReferenceArray atomicreferencearray = table;
            int i = 0;
_L2:
            if (i >= atomicreferencearray.length())
            {
                break; /* Loop/switch isn't completed */
            }
            atomicreferencearray.set(i, null);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            modCount = modCount + 1;
            count = 0;
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        boolean containsKey(Object obj, int i)
        {
            Object obj1;
            .CustomConcurrentHashMap.Strategy strategy1;
            boolean flag;
            boolean flag1;
            flag1 = false;
            strategy1 = strategy;
            flag = flag1;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            obj1 = getFirst(i);
_L2:
            flag = flag1;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            if (strategy1.getHash(obj1) == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            obj1 = strategy1.getNext(obj1);
            Object obj2;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj2 = strategy1.getKey(obj1)) == null || !strategy1.equalKeys(obj2, obj)) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (strategy1.getValue(obj1) != null)
            {
                flag = true;
            }
            return flag;
        }

        boolean containsValue(Object obj)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            AtomicReferenceArray atomicreferencearray;
            int i;
            int j;
            strategy1 = strategy;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            atomicreferencearray = table;
            j = atomicreferencearray.length();
            i = 0;
_L8:
            if (i >= j) goto _L2; else goto _L1
_L1:
            Object obj1 = atomicreferencearray.get(i);
_L5:
            Object obj2;
            if (obj1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj2 = strategy1.getValue(obj1);
              goto _L3
_L7:
            obj1 = strategy1.getNext(obj1);
            if (true) goto _L5; else goto _L4
_L4:
            continue; /* Loop/switch isn't completed */
_L3:
            if (obj2 == null || !strategy1.equalValues(obj2, obj)) goto _L7; else goto _L6
_L6:
            return true;
            i++;
              goto _L8
_L2:
            return false;
        }

        void expand()
        {
            AtomicReferenceArray atomicreferencearray = table;
            int j1 = atomicreferencearray.length();
            if (j1 >= 0x40000000)
            {
                return;
            }
            .CustomConcurrentHashMap.Strategy strategy1 = strategy;
            AtomicReferenceArray atomicreferencearray1 = newEntryArray(j1 << 1);
            threshold = (int)((float)atomicreferencearray1.length() * loadFactor);
            int k1 = atomicreferencearray1.length() - 1;
            int i = 0;
            while (i < j1) 
            {
                Object obj1 = atomicreferencearray.get(i);
                if (obj1 != null)
                {
                    Object obj = strategy1.getNext(obj1);
                    int j = strategy1.getHash(obj1) & k1;
                    if (obj == null)
                    {
                        atomicreferencearray1.set(j, obj1);
                    } else
                    {
                        Object obj3 = obj1;
                        while (obj != null) 
                        {
                            int i1 = strategy1.getHash(obj) & k1;
                            int l = j;
                            if (i1 != j)
                            {
                                l = i1;
                                obj3 = obj;
                            }
                            obj = strategy1.getNext(obj);
                            j = l;
                        }
                        atomicreferencearray1.set(j, obj3);
                        obj = obj1;
                        while (obj != obj3) 
                        {
                            Object obj2 = strategy1.getKey(obj);
                            if (obj2 != null)
                            {
                                int k = strategy1.getHash(obj) & k1;
                                atomicreferencearray1.set(k, strategy1.copyEntry(obj2, obj, atomicreferencearray1.get(k)));
                            }
                            obj = strategy1.getNext(obj);
                        }
                    }
                }
                i++;
            }
            table = atomicreferencearray1;
        }

        Object get(Object obj, int i)
        {
            obj = getEntry(obj, i);
            if (obj == null)
            {
                return null;
            } else
            {
                return strategy.getValue(obj);
            }
        }

        public Object getEntry(Object obj, int i)
        {
            Object obj1;
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            obj1 = getFirst(i);
_L2:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            if (strategy1.getHash(obj1) == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            obj1 = strategy1.getNext(obj1);
            Object obj2;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj2 = strategy1.getKey(obj1)) == null || !strategy1.equalKeys(obj2, obj)) goto _L4; else goto _L3
_L3:
            return obj1;
            return null;
        }

        Object getFirst(int i)
        {
            AtomicReferenceArray atomicreferencearray = table;
            return atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
        }

        AtomicReferenceArray newEntryArray(int i)
        {
            return new AtomicReferenceArray(i);
        }

        Object put(Object obj, int i, Object obj1, boolean flag)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj3;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            j = count;
            if (j > threshold)
            {
                expand();
            }
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj3 = atomicreferencearray.get(k);
            Object obj2 = obj3;
_L1:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_164;
            }
            Object obj4 = strategy1.getKey(obj2);
            if (strategy1.getHash(obj2) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            if (!strategy1.equalKeys(obj, obj4))
            {
                break MISSING_BLOCK_LABEL_150;
            }
            obj = strategy1.getValue(obj2);
            if (flag && obj != null)
            {
                unlock();
                return obj;
            }
            strategy1.setValue(obj2, obj1);
            unlock();
            return obj;
            obj2 = strategy1.getNext(obj2);
              goto _L1
            modCount = modCount + 1;
            obj = strategy1.newEntry(obj, i, obj3);
            strategy1.setValue(obj, obj1);
            atomicreferencearray.set(k, obj);
            count = j + 1;
            unlock();
            return null;
            obj;
            unlock();
            throw obj;
        }

        Object remove(Object obj, int i)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            j = count;
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj2 = atomicreferencearray.get(k);
            Object obj1 = obj2;
_L4:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = strategy1.getKey(obj1);
            if (strategy1.getHash(obj1) != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            Object obj4;
            if (!strategy1.equalKeys(obj3, obj))
            {
                break MISSING_BLOCK_LABEL_212;
            }
            obj4 = strategy.getValue(obj1);
            modCount = modCount + 1;
            obj3 = strategy1.getNext(obj1);
            obj = obj2;
            obj2 = obj3;
_L2:
            if (obj == obj1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj5 = strategy1.getKey(obj);
            obj3 = obj2;
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            obj3 = strategy1.copyEntry(obj5, obj, obj2);
            obj = strategy1.getNext(obj);
            obj2 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj2);
            count = j - 1;
            unlock();
            return obj4;
            obj1 = strategy1.getNext(obj1);
            if (true) goto _L4; else goto _L3
_L3:
            unlock();
            return null;
            obj;
            unlock();
            throw obj;
        }

        boolean remove(Object obj, int i, Object obj1)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj3;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            j = count;
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj3 = atomicreferencearray.get(k);
            Object obj2 = obj3;
_L4:
            if (obj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy1.getKey(obj2);
            if (strategy1.getHash(obj2) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_239;
            }
            if (!strategy1.equalKeys(obj4, obj))
            {
                break MISSING_BLOCK_LABEL_239;
            }
            obj = strategy.getValue(obj2);
            if (obj1 == obj)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            if (obj1 == null || obj == null)
            {
                break MISSING_BLOCK_LABEL_233;
            }
            if (!strategy1.equalValues(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_233;
            }
            modCount = modCount + 1;
            obj1 = strategy1.getNext(obj2);
            obj = obj3;
_L2:
            if (obj == obj2)
            {
                break; /* Loop/switch isn't completed */
            }
            obj4 = strategy1.getKey(obj);
            obj3 = obj1;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_196;
            }
            obj3 = strategy1.copyEntry(obj4, obj, obj1);
            obj = strategy1.getNext(obj);
            obj1 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj1);
            count = j - 1;
            unlock();
            return true;
            unlock();
            return false;
            obj2 = strategy1.getNext(obj2);
            if (true) goto _L4; else goto _L3
_L3:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        public boolean removeEntry(Object obj, int i)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            j = count;
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj2 = atomicreferencearray.get(k);
            Object obj1 = obj2;
_L4:
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3;
            if (strategy1.getHash(obj1) != i || !obj.equals(obj1))
            {
                break MISSING_BLOCK_LABEL_176;
            }
            modCount = modCount + 1;
            obj3 = strategy1.getNext(obj1);
            obj = obj2;
            obj2 = obj3;
_L2:
            if (obj == obj1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy1.getKey(obj);
            obj3 = obj2;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            obj3 = strategy1.copyEntry(obj4, obj, obj2);
            obj = strategy1.getNext(obj);
            obj2 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj2);
            count = j - 1;
            unlock();
            return true;
            obj1 = strategy1.getNext(obj1);
            if (true) goto _L4; else goto _L3
_L3:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        public boolean removeEntry(Object obj, int i, Object obj1)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj3;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            j = count;
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj3 = atomicreferencearray.get(k);
            Object obj2 = obj3;
_L4:
            if (obj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (strategy1.getHash(obj2) != i || !obj.equals(obj2))
            {
                break MISSING_BLOCK_LABEL_210;
            }
            obj = strategy1.getValue(obj2);
            if (obj == obj1)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_204;
            }
            if (!strategy1.equalValues(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_204;
            }
            modCount = modCount + 1;
            obj1 = strategy1.getNext(obj2);
            obj = obj3;
_L2:
            if (obj == obj2)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy1.getKey(obj);
            obj3 = obj1;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            obj3 = strategy1.copyEntry(obj4, obj, obj1);
            obj = strategy1.getNext(obj);
            obj1 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj1);
            count = j - 1;
            unlock();
            return true;
            unlock();
            return false;
            obj2 = strategy1.getNext(obj2);
            if (true) goto _L4; else goto _L3
_L3:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        Object replace(Object obj, int i, Object obj1)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj2 = getFirst(i);
_L2:
            if (obj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = strategy1.getKey(obj2);
            if (strategy1.getHash(obj2) != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            if (!strategy1.equalKeys(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj = strategy1.getValue(obj2);
            if (obj == null)
            {
                unlock();
                return null;
            }
            strategy1.setValue(obj2, obj1);
            unlock();
            return obj;
            obj2 = strategy1.getNext(obj2);
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            return null;
            obj;
            unlock();
            throw obj;
        }

        boolean replace(Object obj, int i, Object obj1, Object obj2)
        {
            .CustomConcurrentHashMap.Strategy strategy1;
            strategy1 = strategy;
            lock();
            Object obj3 = getFirst(i);
_L2:
            if (obj3 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy1.getKey(obj3);
            if (strategy1.getHash(obj3) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            if (!strategy1.equalKeys(obj, obj4))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            obj4 = strategy1.getValue(obj3);
            if (obj4 == null)
            {
                unlock();
         