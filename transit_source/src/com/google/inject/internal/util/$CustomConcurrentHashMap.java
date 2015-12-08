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
//            $Function, $AbstractMapEntry

final class $CustomConcurrentHashMap
{
    static final class Builder
    {

        int concurrencyLevel;
        int initialCapacity;
        float loadFactor;

        public ConcurrentMap buildComputingMap(ComputingStrategy computingstrategy, $Function $function)
        {
            if (computingstrategy == null)
            {
                throw new NullPointerException("strategy");
            }
            if ($function == null)
            {
                throw new NullPointerException("computer");
            } else
            {
                return new ComputingImpl(computingstrategy, this, $function);
            }
        }

        public ConcurrentMap buildMap(Strategy strategy)
        {
            if (strategy == null)
            {
                throw new NullPointerException("strategy");
            } else
            {
                return new Impl(strategy, this);
            }
        }

        public Builder concurrencyLevel(int i)
        {
            if (i <= 0)
            {
                throw new IllegalArgumentException();
            } else
            {
                concurrencyLevel = i;
                return this;
            }
        }

        public Builder initialCapacity(int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException();
            } else
            {
                initialCapacity = i;
                return this;
            }
        }

        public Builder loadFactor(float f)
        {
            if (f <= 0.0F)
            {
                throw new IllegalArgumentException();
            } else
            {
                loadFactor = f;
                return this;
            }
        }

        Builder()
        {
            loadFactor = 0.75F;
            initialCapacity = 16;
            concurrencyLevel = 16;
        }
    }

    static class ComputingImpl extends Impl
    {

        static final long serialVersionUID = 0L;
        final $Function computer;
        final ComputingStrategy computingStrategy;

        public Object get(Object obj)
        {
            Impl.Segment segment;
            int i;
            if (obj == null)
            {
                throw new NullPointerException("key");
            }
            i = hash(obj);
            segment = segmentFor(i);
_L7:
            Object obj1;
            Object obj2;
            obj1 = segment.getEntry(obj, i);
            obj2 = obj1;
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            boolean flag;
            flag = false;
            segment.lock();
            obj2 = segment.getEntry(obj, i);
            obj1 = obj2;
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_158;
            }
            flag = true;
            int j = segment.count;
            if (j > segment.threshold)
            {
                segment.expand();
            }
            obj2 = segment.table;
            int k = i & ((AtomicReferenceArray) (obj2)).length() - 1;
            obj1 = ((AtomicReferenceArray) (obj2)).get(k);
            segment.modCount = segment.modCount + 1;
            obj1 = computingStrategy.newEntry(obj, i, obj1);
            ((AtomicReferenceArray) (obj2)).set(k, obj1);
            segment.count = j + 1;
            segment.unlock();
            obj2 = obj1;
            if (!flag) goto _L2; else goto _L3
_L3:
            obj2 = computingStrategy.compute(obj, obj1, computer);
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            throw new NullPointerException("compute() returned null unexpectedly");
            obj;
            if (true)
            {
                segment.removeEntry(obj1, i);
            }
            throw obj;
            obj;
            segment.unlock();
            throw obj;
            obj = obj2;
            if (false)
            {
                segment.removeEntry(obj1, i);
                obj = obj2;
            }
_L4:
            return obj;
_L2:
            flag = false;
_L5:
            obj1 = computingStrategy.waitForValue(obj2);
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_284;
            }
            segment.removeEntry(obj2, i);
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
            continue; /* Loop/switch isn't completed */
            obj = obj1;
            if (flag)
            {
                Thread.currentThread().interrupt();
                return obj1;
            }
              goto _L4
            InterruptedException interruptedexception;
            interruptedexception;
            flag = true;
              goto _L5
            obj;
            if (flag)
            {
                Thread.currentThread().interrupt();
            }
            throw obj;
            if (true) goto _L7; else goto _L6
_L6:
        }

        ComputingImpl(ComputingStrategy computingstrategy, Builder builder, $Function $function)
        {
            super(computingstrategy, builder);
            computingStrategy = computingstrategy;
            computer = $function;
        }
    }

    public static interface ComputingStrategy
        extends Strategy
    {

        public abstract Object compute(Object obj, Object obj1, $Function $function);

        public abstract Object waitForValue(Object obj)
            throws InterruptedException;
    }

    static class Impl extends AbstractMap
        implements ConcurrentMap, Serializable
    {

        static final int MAXIMUM_CAPACITY = 0x40000000;
        static final int MAX_SEGMENTS = 0x10000;
        static final int RETRIES_BEFORE_LOCK = 2;
        private static final long serialVersionUID = 0L;
        Set entrySet;
        Set keySet;
        final float loadFactor;
        final int segmentMask;
        final int segmentShift;
        final Segment segments[];
        final Strategy strategy;
        Collection values;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
_L3:
            Fields.segmentShift.set(this, Integer.valueOf(32 - k));
            Fields.segmentMask.set(this, Integer.valueOf(j - 1));
            Fields.segments.set(this, newSegmentArray(j));
            k = l;
            if (l > 0x40000000)
            {
                k = 0x40000000;
            }
            l = k / j;
            i = l;
            if (l * j < k)
            {
                i = l + 1;
            }
            break MISSING_BLOCK_LABEL_246;
_L1:
            if (i >= segments.length)
            {
                break MISSING_BLOCK_LABEL_177;
            }
            segments[i] = new Segment(j);
            i++;
              goto _L1
            Fields.strategy.set(this, obj);
_L2:
            obj = objectinputstream.readObject();
            if (obj == null)
            {
                return;
            }
            put(obj, objectinputstream.readObject());
              goto _L2
            {
                Object obj;
                int k;
                int l;
                try
                {
                    l = objectinputstream.readInt();
                    float f = objectinputstream.readFloat();
                    j = objectinputstream.readInt();
                    obj = (Strategy)objectinputstream.readObject();
                    Fields.loadFactor.set(this, Float.valueOf(f));
                }
                // Misplaced declaration of an exception variable
                catch (ObjectInputStream objectinputstream)
                {
                    throw new AssertionError(objectinputstream);
                }
                i = j;
                if (j > 0x10000)
                {
                    i = 0x10000;
                }
                k = 0;
                j = 1;
                while (j < i) 
                {
                    k++;
                    j <<= 1;
                }
            }
              goto _L3
            for (j = 1; j < i; j <<= 1) { }
            i = 0;
              goto _L1
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeInt(size());
            objectoutputstream.writeFloat(loadFactor);
            objectoutputstream.writeInt(segments.length);
            objectoutputstream.writeObject(strategy);
            java.util.Map.Entry entry;
            for (Iterator iterator = entrySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
                objectoutputstream.writeObject(entry.getKey());
            }

            objectoutputstream.writeObject(null);
        }

        public void clear()
        {
            Segment asegment[] = segments;
            int j = asegment.length;
            for (int i = 0; i < j; i++)
            {
                asegment[i].clear();
            }

        }

        public boolean containsKey(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).containsKey(obj, i);
            }
        }

        public boolean containsValue(Object obj)
        {
            Segment asegment[];
            int ai[];
            int i;
            if (obj == null)
            {
                throw new NullPointerException("value");
            }
            asegment = segments;
            ai = new int[asegment.length];
            i = 0;
_L15:
            if (i >= 2) goto _L2; else goto _L1
_L1:
            int k;
            int i1;
            k = 0;
            i1 = 0;
_L7:
            if (i1 >= asegment.length) goto _L4; else goto _L3
_L3:
            int j1 = asegment[i1].count;
            j1 = asegment[i1].modCount;
            ai[i1] = j1;
            k += j1;
            if (!asegment[i1].containsValue(obj)) goto _L6; else goto _L5
_L5:
            boolean flag2 = true;
_L17:
            return flag2;
_L6:
            i1++;
              goto _L7
_L4:
            boolean flag;
            flag = true;
            i1 = ((flag) ? 1 : 0);
            if (k == 0) goto _L9; else goto _L8
_L8:
            k = 0;
_L14:
            i1 = ((flag) ? 1 : 0);
            if (k >= asegment.length) goto _L9; else goto _L10
_L10:
            i1 = asegment[k].count;
            if (ai[k] == asegment[k].modCount) goto _L12; else goto _L11
_L11:
            i1 = 0;
_L9:
            if (i1 != 0)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
_L12:
            k++;
            if (true) goto _L14; else goto _L13
_L13:
            i++;
              goto _L15
_L2:
            k = asegment.length;
            for (i = 0; i < k; i++)
            {
                asegment[i].lock();
            }

            flag2 = false;
            k = asegment.length;
            i = 0;
_L19:
            boolean flag1;
            flag1 = flag2;
            if (i >= k)
            {
                break MISSING_BLOCK_LABEL_249;
            }
            flag1 = asegment[i].containsValue(obj);
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_283;
            }
            flag1 = true;
            k = asegment.length;
            i = 0;
_L18:
            flag2 = flag1;
            if (i >= k) goto _L17; else goto _L16
_L16:
            asegment[i].unlock();
            i++;
              goto _L18
              goto _L17
            i++;
              goto _L19
            obj;
            int l = asegment.length;
            for (int j = 0; j < l; j++)
            {
                asegment[j].unlock();
            }

            throw obj;
              goto _L7
        }

        public Set entrySet()
        {
            Set set = entrySet;
            if (set != null)
            {
                return set;
            } else
            {
                EntrySet entryset = new EntrySet();
                entrySet = entryset;
                return entryset;
            }
        }

        public Object get(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).get(obj, i);
            }
        }

        int hash(Object obj)
        {
            return $CustomConcurrentHashMap.rehash(strategy.hashKey(obj));
        }

        public boolean isEmpty()
        {
            Segment asegment[];
            int ai[];
            int i;
            int k;
            asegment = segments;
            ai = new int[asegment.length];
            k = 0;
            i = 0;
_L7:
            if (i >= asegment.length) goto _L2; else goto _L1
_L1:
            if (asegment[i].count == 0) goto _L4; else goto _L3
_L3:
            return false;
_L4:
            int l = asegment[i].modCount;
            ai[i] = l;
            k += l;
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
label0:
            {
                if (k == 0)
                {
                    break label0;
                }
                int j = 0;
                do
                {
                    if (j >= asegment.length)
                    {
                        break label0;
                    }
                    if (asegment[j].count != 0 || ai[j] != asegment[j].modCount)
                    {
                        break;
                    }
                    j++;
                } while (true);
            }
            if (true) goto _L3; else goto _L5
_L5:
            return true;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public Set keySet()
        {
            Set set = keySet;
            if (set != null)
            {
                return set;
            } else
            {
                KeySet keyset = new KeySet();
                keySet = keyset;
                return keyset;
            }
        }

        Segment[] newSegmentArray(int i)
        {
            return (Segment[])(Segment[])Array.newInstance(com/google/inject/internal/util/$CustomConcurrentHashMap$Impl$Segment, i);
        }

        public Object put(Object obj, Object obj1)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            }
            if (obj1 == null)
            {
                throw new NullPointerException("value");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).put(obj, i, obj1, false);
            }
        }

        public void putAll(Map map)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }

        public Object putIfAbsent(Object obj, Object obj1)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            }
            if (obj1 == null)
            {
                throw new NullPointerException("value");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).put(obj, i, obj1, true);
            }
        }

        public Object remove(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).remove(obj, i);
            }
        }

        public boolean remove(Object obj, Object obj1)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).remove(obj, i, obj1);
            }
        }

        public Object replace(Object obj, Object obj1)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            }
            if (obj1 == null)
            {
                throw new NullPointerException("value");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).replace(obj, i, obj1);
            }
        }

        public boolean replace(Object obj, Object obj1, Object obj2)
        {
            if (obj == null)
            {
                throw new NullPointerException("key");
            }
            if (obj1 == null)
            {
                throw new NullPointerException("oldValue");
            }
            if (obj2 == null)
            {
                throw new NullPointerException("newValue");
            } else
            {
                int i = hash(obj);
                return segmentFor(i).replace(obj, i, obj1, obj2);
            }
        }

        Segment segmentFor(int i)
        {
            return segments[i >>> segmentShift & segmentMask];
        }

        public int size()
        {
            Segment asegment[];
            int ai[];
            int i;
            long l2;
            long l3;
            asegment = segments;
            l3 = 0L;
            l2 = 0L;
            ai = new int[asegment.length];
            i = 0;
_L11:
            if (i >= 2) goto _L2; else goto _L1
_L1:
            int k1;
            long l4;
            l4 = 0L;
            l3 = 0L;
            k1 = 0;
            for (int l = 0; l < asegment.length; l++)
            {
                l3 += asegment[l].count;
                int l1 = asegment[l].modCount;
                ai[l] = l1;
                k1 += l1;
            }

            l2 = l4;
            if (k1 == 0) goto _L4; else goto _L3
_L3:
            int i1 = 0;
_L9:
            l2 = l4;
            if (i1 >= asegment.length) goto _L4; else goto _L5
_L5:
            l4 += asegment[i1].count;
            if (ai[i1] == asegment[i1].modCount) goto _L7; else goto _L6
_L6:
            l2 = -1L;
_L4:
            if (l2 != l3)
            {
                break; /* Loop/switch isn't completed */
            }
_L2:
            l4 = l3;
            if (l2 == l3)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            l2 = 0L;
            i1 = asegment.length;
            for (i = 0; i < i1; i++)
            {
                asegment[i].lock();
            }

            break; /* Loop/switch isn't completed */
_L7:
            i1++;
            if (true) goto _L9; else goto _L8
_L8:
            i++;
            if (true) goto _L11; else goto _L10
_L10:
            int j1 = asegment.length;
            for (int j = 0; j < j1; j++)
            {
                l2 += asegment[j].count;
            }

            j1 = asegment.length;
            int k = 0;
            do
            {
                l4 = l2;
                if (k >= j1)
                {
                    break;
                }
                asegment[k].unlock();
                k++;
            } while (true);
            if (l4 > 0x7fffffffL)
            {
                return 0x7fffffff;
            } else
            {
                return (int)l4;
            }
        }

        public Collection values()
        {
            Collection collection = values;
            if (collection != null)
            {
                return collection;
            } else
            {
                Values values1 = new Values();
                values = values1;
                return values1;
            }
        }

        Impl(Strategy strategy1, Builder builder)
        {
            loadFactor = builder.loadFactor;
            int k = builder.concurrencyLevel;
            int i1 = builder.initialCapacity;
            int i = k;
            if (k > 0x10000)
            {
                i = 0x10000;
            }
            int l = 0;
            for (k = 1; k < i; k <<= 1)
            {
                l++;
            }

            segmentShift = 32 - l;
            segmentMask = k - 1;
            segments = newSegmentArray(k);
            l = i1;
            if (i1 > 0x40000000)
            {
                l = 0x40000000;
            }
            i1 = l / k;
            i = i1;
            if (i1 * k < l)
            {
                i = i1 + 1;
            }
            for (k = 1; k < i; k <<= 1) { }
            for (int j = 0; j < segments.length; j++)
            {
                segments[j] = new Segment(k);
            }

            strategy = strategy1;
            strategy1.setInternals(new InternalsImpl());
        }
    }

    final class Impl.EntryIterator extends Impl.HashIterator
        implements Iterator
    {

        final Impl this$0;

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return nextEntry();
        }

        Impl.EntryIterator()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.EntrySet extends AbstractSet
    {

        final Impl this$0;

        public void clear()
        {
            Impl.this.clear();
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
            return Impl.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new Impl.EntryIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && Impl.this.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return Impl.this.size();
        }

        Impl.EntrySet()
        {
            this$0 = Impl.this;
            super();
        }
    }

    static class Impl.Fields
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


        Impl.Fields()
        {
        }
    }

    abstract class Impl.HashIterator
    {

        AtomicReferenceArray currentTable;
        Impl.WriteThroughEntry lastReturned;
        Object nextEntry;
        Impl.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final Impl this$0;

        final void advance()
        {
            nextExternal = null;
            break MISSING_BLOCK_LABEL_5;
            if (!nextInChain() && !nextInTable())
            {
                while (nextSegmentIndex >= 0) 
                {
                    Impl.Segment asegment[] = segments;
                    int i = nextSegmentIndex;
                    nextSegmentIndex = i - 1;
                    Impl.Segment segment = asegment[i];
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
            Strategy strategy = Impl.this.strategy;
            Object obj1 = strategy.getKey(obj);
            obj = strategy.getValue(obj);
            if (obj1 != null && obj != null)
            {
                nextExternal = new Impl.WriteThroughEntry(obj1, obj);
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

        Impl.WriteThroughEntry nextEntry()
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
            Strategy strategy = Impl.this.strategy;
            if (nextEntry != null)
            {
                for (nextEntry = strategy.getNext(nextEntry); nextEntry != null; nextEntry = strategy.getNext(nextEntry))
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
                Impl.this.remove(lastReturned.getKey());
                lastReturned = null;
                return;
            }
        }

        Impl.HashIterator()
        {
            this$0 = Impl.this;
            super();
            nextSegmentIndex = segments.length - 1;
            nextTableIndex = -1;
            advance();
        }
    }

    class Impl.InternalsImpl
        implements Internals, Serializable
    {

        static final long serialVersionUID = 0L;
        final Impl this$0;

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

        Impl.InternalsImpl()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.KeyIterator extends Impl.HashIterator
        implements Iterator
    {

        final Impl this$0;

        public Object next()
        {
            return super.nextEntry().getKey();
        }

        Impl.KeyIterator()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.KeySet extends AbstractSet
    {

        final Impl this$0;

        public void clear()
        {
            Impl.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public boolean isEmpty()
        {
            return Impl.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new Impl.KeyIterator();
        }

        public boolean remove(Object obj)
        {
            return Impl.this.remove(obj) != null;
        }

        public int size()
        {
            return Impl.this.size();
        }

        Impl.KeySet()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.Segment extends ReentrantLock
    {

        volatile int count;
        int modCount;
        volatile AtomicReferenceArray table;
        final Impl this$0;
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
            Strategy strategy;
            boolean flag;
            boolean flag1;
            flag1 = false;
            strategy = Impl.this.strategy;
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
            if (strategy.getHash(obj1) == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            obj1 = strategy.getNext(obj1);
            Object obj2;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj2 = strategy.getKey(obj1)) == null || !strategy.equalKeys(obj2, obj)) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (strategy.getValue(obj1) != null)
            {
                flag = true;
            }
            return flag;
        }

        boolean containsValue(Object obj)
        {
            Strategy strategy;
            AtomicReferenceArray atomicreferencearray;
            int i;
            int j;
            strategy = Impl.this.strategy;
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
            obj2 = strategy.getValue(obj1);
              goto _L3
_L7:
            obj1 = strategy.getNext(obj1);
            if (true) goto _L5; else goto _L4
_L4:
            continue; /* Loop/switch isn't completed */
_L3:
            if (obj2 == null || !strategy.equalValues(obj2, obj)) goto _L7; else goto _L6
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
            Strategy strategy = Impl.this.strategy;
            AtomicReferenceArray atomicreferencearray1 = newEntryArray(j1 << 1);
            threshold = (int)((float)atomicreferencearray1.length() * loadFactor);
            int k1 = atomicreferencearray1.length() - 1;
            int i = 0;
            while (i < j1) 
            {
                Object obj1 = atomicreferencearray.get(i);
                if (obj1 != null)
                {
                    Object obj = strategy.getNext(obj1);
                    int j = strategy.getHash(obj1) & k1;
                    if (obj == null)
                    {
                        atomicreferencearray1.set(j, obj1);
                    } else
                    {
                        Object obj3 = obj1;
                        while (obj != null) 
                        {
                            int i1 = strategy.getHash(obj) & k1;
                            int l = j;
                            if (i1 != j)
                            {
                                l = i1;
                                obj3 = obj;
                            }
                            obj = strategy.getNext(obj);
                            j = l;
                        }
                        atomicreferencearray1.set(j, obj3);
                        obj = obj1;
                        while (obj != obj3) 
                        {
                            Object obj2 = strategy.getKey(obj);
                            if (obj2 != null)
                            {
                                int k = strategy.getHash(obj) & k1;
                                atomicreferencearray1.set(k, strategy.copyEntry(obj2, obj, atomicreferencearray1.get(k)));
                            }
                            obj = strategy.getNext(obj);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            if (strategy.getHash(obj1) == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            obj1 = strategy.getNext(obj1);
            Object obj2;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj2 = strategy.getKey(obj1)) == null || !strategy.equalKeys(obj2, obj)) goto _L4; else goto _L3
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            Object obj4 = strategy.getKey(obj2);
            if (strategy.getHash(obj2) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            if (!strategy.equalKeys(obj, obj4))
            {
                break MISSING_BLOCK_LABEL_150;
            }
            obj = strategy.getValue(obj2);
            if (flag && obj != null)
            {
                unlock();
                return obj;
            }
            strategy.setValue(obj2, obj1);
            unlock();
            return obj;
            obj2 = strategy.getNext(obj2);
              goto _L1
            modCount = modCount + 1;
            obj = strategy.newEntry(obj, i, obj3);
            strategy.setValue(obj, obj1);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            Object obj3 = strategy.getKey(obj1);
            if (strategy.getHash(obj1) != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            Object obj4;
            if (!strategy.equalKeys(obj3, obj))
            {
                break MISSING_BLOCK_LABEL_212;
            }
            obj4 = Impl.this.strategy.getValue(obj1);
            modCount = modCount + 1;
            obj3 = strategy.getNext(obj1);
            obj = obj2;
            obj2 = obj3;
_L2:
            if (obj == obj1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj5 = strategy.getKey(obj);
            obj3 = obj2;
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            obj3 = strategy.copyEntry(obj5, obj, obj2);
            obj = strategy.getNext(obj);
            obj2 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj2);
            count = j - 1;
            unlock();
            return obj4;
            obj1 = strategy.getNext(obj1);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            Object obj4 = strategy.getKey(obj2);
            if (strategy.getHash(obj2) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_239;
            }
            if (!strategy.equalKeys(obj4, obj))
            {
                break MISSING_BLOCK_LABEL_239;
            }
            obj = Impl.this.strategy.getValue(obj2);
            if (obj1 == obj)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            if (obj1 == null || obj == null)
            {
                break MISSING_BLOCK_LABEL_233;
            }
            if (!strategy.equalValues(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_233;
            }
            modCount = modCount + 1;
            obj1 = strategy.getNext(obj2);
            obj = obj3;
_L2:
            if (obj == obj2)
            {
                break; /* Loop/switch isn't completed */
            }
            obj4 = strategy.getKey(obj);
            obj3 = obj1;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_196;
            }
            obj3 = strategy.copyEntry(obj4, obj, obj1);
            obj = strategy.getNext(obj);
            obj1 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj1);
            count = j - 1;
            unlock();
            return true;
            unlock();
            return false;
            obj2 = strategy.getNext(obj2);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            if (strategy.getHash(obj1) != i || !obj.equals(obj1))
            {
                break MISSING_BLOCK_LABEL_176;
            }
            modCount = modCount + 1;
            obj3 = strategy.getNext(obj1);
            obj = obj2;
            obj2 = obj3;
_L2:
            if (obj == obj1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy.getKey(obj);
            obj3 = obj2;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            obj3 = strategy.copyEntry(obj4, obj, obj2);
            obj = strategy.getNext(obj);
            obj2 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj2);
            count = j - 1;
            unlock();
            return true;
            obj1 = strategy.getNext(obj1);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
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
            if (strategy.getHash(obj2) != i || !obj.equals(obj2))
            {
                break MISSING_BLOCK_LABEL_210;
            }
            obj = strategy.getValue(obj2);
            if (obj == obj1)
            {
                break MISSING_BLOCK_LABEL_107;
            }
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_204;
            }
            if (!strategy.equalValues(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_204;
            }
            modCount = modCount + 1;
            obj1 = strategy.getNext(obj2);
            obj = obj3;
_L2:
            if (obj == obj2)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy.getKey(obj);
            obj3 = obj1;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            obj3 = strategy.copyEntry(obj4, obj, obj1);
            obj = strategy.getNext(obj);
            obj1 = obj3;
            if (true) goto _L2; else goto _L1
_L1:
            atomicreferencearray.set(k, obj1);
            count = j - 1;
            unlock();
            return true;
            unlock();
            return false;
            obj2 = strategy.getNext(obj2);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
            lock();
            Object obj2 = getFirst(i);
_L2:
            if (obj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = strategy.getKey(obj2);
            if (strategy.getHash(obj2) != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            if (!strategy.equalKeys(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj = strategy.getValue(obj2);
            if (obj == null)
            {
                unlock();
                return null;
            }
            strategy.setValue(obj2, obj1);
            unlock();
            return obj;
            obj2 = strategy.getNext(obj2);
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
            Strategy strategy;
            strategy = Impl.this.strategy;
            lock();
            Object obj3 = getFirst(i);
_L2:
            if (obj3 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj4 = strategy.getKey(obj3);
            if (strategy.getHash(obj3) != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            if (!strategy.equalKeys(obj, obj4))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            obj4 = strategy.getValue(obj3);
            if (obj4 == null)
            {
                unlock();
                return false;
            }
            if (!strategy.equalValues(obj4, obj1))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            strategy.setValue(obj3, obj2);
            unlock();
            return true;
            obj3 = strategy.getNext(obj3);
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        void setTable(AtomicReferenceArray atomicreferencearray)
        {
            threshold = (int)((float)atomicreferencearray.length() * loadFactor);
            table = atomicreferencearray;
        }

        Impl.Segment(int i)
        {
            this$0 = Impl.this;
            super();
            setTable(newEntryArray(i));
        }
    }

    final class Impl.ValueIterator extends Impl.HashIterator
        implements Iterator
    {

        final Impl this$0;

        public Object next()
        {
            return super.nextEntry().getValue();
        }

        Impl.ValueIterator()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.Values extends AbstractCollection
    {

        final Impl this$0;

        public void clear()
        {
            Impl.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsValue(obj);
        }

        public boolean isEmpty()
        {
            return Impl.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new Impl.ValueIterator();
        }

        public int size()
        {
            return Impl.this.size();
        }

        Impl.Values()
        {
            this$0 = Impl.this;
            super();
        }
    }

    final class Impl.WriteThroughEntry extends $AbstractMapEntry
    {

        final Object key;
        final Impl this$0;
        Object value;

        public Object getKey()
        {
            return key;
        }

        public Object getValue()
        {
            return value;
        }

        public Object setValue(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException();
            } else
            {
                Object obj1 = put(getKey(), obj);
                value = obj;
                return obj1;
            }
        }

        Impl.WriteThroughEntry(Object obj, Object obj1)
        {
            this$0 = Impl.this;
            super();
            key = obj;
            value = obj1;
        }
    }

    public static interface Internals
    {

        public abstract Object getEntry(Object obj);

        public abstract boolean removeEntry(Object obj);

        public abstract boolean removeEntry(Object obj, Object obj1);
    }

    static class SimpleInternalEntry
    {

        final int hash;
        final Object key;
        final SimpleInternalEntry next;
        volatile Object value;

        SimpleInternalEntry(Object obj, int i, Object obj1, SimpleInternalEntry simpleinternalentry)
        {
            key = obj;
            hash = i;
            value = obj1;
            next = simpleinternalentry;
        }
    }

    static class SimpleStrategy
        implements Strategy
    {

        public SimpleInternalEntry copyEntry(Object obj, SimpleInternalEntry simpleinternalentry, SimpleInternalEntry simpleinternalentry1)
        {
            return new SimpleInternalEntry(obj, simpleinternalentry.hash, simpleinternalentry.value, simpleinternalentry1);
        }

        public volatile Object copyEntry(Object obj, Object obj1, Object obj2)
        {
            return copyEntry(obj, (SimpleInternalEntry)obj1, (SimpleInternalEntry)obj2);
        }

        public boolean equalKeys(Object obj, Object obj1)
        {
            return obj.equals(obj1);
        }

        public boolean equalValues(Object obj, Object obj1)
        {
            return obj.equals(obj1);
        }

        public int getHash(SimpleInternalEntry simpleinternalentry)
        {
            return simpleinternalentry.hash;
        }

        public volatile int getHash(Object obj)
        {
            return getHash((SimpleInternalEntry)obj);
        }

        public Object getKey(SimpleInternalEntry simpleinternalentry)
        {
            return simpleinternalentry.key;
        }

        public volatile Object getKey(Object obj)
        {
            return getKey((SimpleInternalEntry)obj);
        }

        public SimpleInternalEntry getNext(SimpleInternalEntry simpleinternalentry)
        {
            return simpleinternalentry.next;
        }

        public volatile Object getNext(Object obj)
        {
            return getNext((SimpleInternalEntry)obj);
        }

        public Object getValue(SimpleInternalEntry simpleinternalentry)
        {
            return simpleinternalentry.value;
        }

        public volatile Object getValue(Object obj)
        {
            return getValue((SimpleInternalEntry)obj);
        }

        public int hashKey(Object obj)
        {
            return obj.hashCode();
        }

        public SimpleInternalEntry newEntry(Object obj, int i, SimpleInternalEntry simpleinternalentry)
        {
            return new SimpleInternalEntry(obj, i, null, simpleinternalentry);
        }

        public volatile Object newEntry(Object obj, int i, Object obj1)
        {
            return newEntry(obj, i, (SimpleInternalEntry)obj1);
        }

        public void setInternals(Internals internals)
        {
        }

        public void setValue(SimpleInternalEntry simpleinternalentry, Object obj)
        {
            simpleinternalentry.value = obj;
        }

        public volatile void setValue(Object obj, Object obj1)
        {
            setValue((SimpleInternalEntry)obj, obj1);
        }

        SimpleStrategy()
        {
        }
    }

    public static interface Strategy
    {

        public abstract Object copyEntry(Object obj, Object obj1, Object obj2);

        public abstract boolean equalKeys(Object obj, Object obj1);

        public abstract boolean equalValues(Object obj, Object obj1);

        public abstract int getHash(Object obj);

        public abstract Object getKey(Object obj);

        public abstract Object getNext(Object obj);

        public abstract Object getValue(Object obj);

        public abstract int hashKey(Object obj);

        public abstract Object newEntry(Object obj, int i, Object obj1);

        public abstract void setInternals(Internals internals);

        public abstract void setValue(Object obj, Object obj1);
    }


    private $CustomConcurrentHashMap()
    {
    }

    private static int rehash(int i)
    {
        i += i << 15 ^ 0xffffcd7d;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i >>> 16 ^ i;
    }

}
