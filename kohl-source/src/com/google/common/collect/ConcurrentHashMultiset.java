// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, GenericMapMaker, Iterables, Lists, 
//            Multisets, ForwardingSet, Serialization

public final class ConcurrentHashMultiset extends AbstractMultiset
    implements Serializable
{
    private class EntrySet extends AbstractSet
    {

        final ConcurrentHashMultiset this$0;

        private List snapshot()
        {
            java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
            for (Iterator iterator1 = iterator(); iterator1.hasNext(); arraylist.add((Multiset.Entry)iterator1.next())) { }
            return arraylist;
        }

        public void clear()
        {
            countMap.clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Object obj1 = ((Multiset.Entry) (obj)).getElement();
                int i = ((Multiset.Entry) (obj)).getCount();
                flag = flag1;
                if (i > 0)
                {
                    flag = flag1;
                    if (count(obj1) == i)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return countMap.hashCode();
        }

        public boolean isEmpty()
        {
            return countMap.isEmpty();
        }

        public Iterator iterator()
        {
            return countMap.entrySet().iterator(). new Iterator() {

                final EntrySet this$1;
                final Iterator val$backingIterator;

                public boolean hasNext()
                {
                    return backingIterator.hasNext();
                }

                public Multiset.Entry next()
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)backingIterator.next();
                    return Multisets.immutableEntry(entry.getKey(), ((Integer)entry.getValue()).intValue());
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    backingIterator.remove();
                }

            
            {
                this$1 = final_entryset;
                backingIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Object obj1 = ((Multiset.Entry) (obj)).getElement();
                int i = ((Multiset.Entry) (obj)).getCount();
                return countMap.remove(obj1, Integer.valueOf(i));
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return countMap.size();
        }

        public Object[] toArray()
        {
            return snapshot().toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return snapshot().toArray(aobj);
        }

        private EntrySet()
        {
            this$0 = ConcurrentHashMultiset.this;
            super();
        }

    }

    private static class FieldSettersHolder
    {

        static final Serialization.FieldSetter COUNT_MAP_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ConcurrentHashMultiset, "countMap");


        private FieldSettersHolder()
        {
        }
    }


    private static final long serialVersionUID = 1L;
    private final transient ConcurrentMap countMap;
    private transient EntrySet entrySet;

    ConcurrentHashMultiset(ConcurrentMap concurrentmap)
    {
        Preconditions.checkArgument(concurrentmap.isEmpty());
        countMap = concurrentmap;
    }

    public static ConcurrentHashMultiset create()
    {
        return new ConcurrentHashMultiset(new ConcurrentHashMap());
    }

    public static ConcurrentHashMultiset create(GenericMapMaker genericmapmaker)
    {
        return new ConcurrentHashMultiset(genericmapmaker.makeMap());
    }

    public static ConcurrentHashMultiset create(Iterable iterable)
    {
        ConcurrentHashMultiset concurrenthashmultiset = create();
        Iterables.addAll(concurrenthashmultiset, iterable);
        return concurrenthashmultiset;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        objectinputstream = (ConcurrentMap)objectinputstream.readObject();
        FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, objectinputstream);
    }

    private int removeAllOccurrences(Object obj)
    {
        int i;
        try
        {
            i = unbox((Integer)countMap.remove(obj));
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

    private List snapshot()
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
            Object obj = entry.getElement();
            int i = entry.getCount();
            while (i > 0) 
            {
                arraylist.add(obj);
                i--;
            }
        }

        return arraylist;
    }

    private static int unbox(Integer integer)
    {
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(countMap);
    }

    public int add(Object obj, int i)
    {
        if (i == 0)
        {
            return count(obj);
        }
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid occurrences: %s", new Object[] {
            Integer.valueOf(i)
        });
        do
        {
            int j;
            do
            {
                j = count(obj);
                if (j != 0)
                {
                    break;
                }
                if (countMap.putIfAbsent(obj, Integer.valueOf(i)) == null)
                {
                    return 0;
                }
            } while (true);
            if (i <= 0x7fffffff - j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Overflow adding %s occurrences to a count of %s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
        } while (!countMap.replace(obj, Integer.valueOf(j), Integer.valueOf(j + i)));
        return j;
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
            i = unbox((Integer)countMap.get(obj));
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
        return new ForwardingSet() {

            final ConcurrentHashMultiset this$0;
            final Set val$delegate;

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
                return delegate;
            }

            public boolean remove(Object obj)
            {
                boolean flag;
                try
                {
                    flag = delegate.remove(obj);
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

            
            {
                this$0 = ConcurrentHashMultiset.this;
                delegate = set;
                super();
            }
        };
    }

    public volatile Set elementSet()
    {
        return super.elementSet();
    }

    public Set entrySet()
    {
        EntrySet entryset1 = entrySet;
        EntrySet entryset = entryset1;
        if (entryset1 == null)
        {
            entryset = new EntrySet();
            entrySet = entryset;
        }
        return entryset;
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

    public int remove(Object obj, int i)
    {
        if (i == 0)
        {
            return count(obj);
        }
        int j;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid occurrences: %s", new Object[] {
            Integer.valueOf(i)
        });
label0:
        do
        {
            do
            {
                j = count(obj);
                if (j == 0)
                {
                    return 0;
                }
                if (i < j)
                {
                    continue label0;
                }
            } while (!countMap.remove(obj, Integer.valueOf(j)));
            return j;
        } while (!countMap.replace(obj, Integer.valueOf(j), Integer.valueOf(j - i)));
        return j;
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public boolean removeExactly(Object obj, int i)
    {
        if (i == 0)
        {
            return true;
        }
        int j;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid occurrences: %s", new Object[] {
            Integer.valueOf(i)
        });
label0:
        do
        {
            do
            {
                j = count(obj);
                if (i > j)
                {
                    return false;
                }
                if (i != j)
                {
                    continue label0;
                }
            } while (!countMap.remove(obj, Integer.valueOf(i)));
            return true;
        } while (!countMap.replace(obj, Integer.valueOf(j), Integer.valueOf(j - i)));
        return true;
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public int setCount(Object obj, int i)
    {
        Multisets.checkNonnegative(i, "count");
        if (i == 0)
        {
            return removeAllOccurrences(obj);
        } else
        {
            return unbox((Integer)countMap.put(obj, Integer.valueOf(i)));
        }
    }

    public boolean setCount(Object obj, int i, int j)
    {
        Multisets.checkNonnegative(i, "oldCount");
        Multisets.checkNonnegative(j, "newCount");
        if (j != 0) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        if (countMap.containsKey(obj)) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        return countMap.remove(obj, Integer.valueOf(i));
_L2:
        if (i == 0)
        {
            if (countMap.putIfAbsent(obj, Integer.valueOf(j)) != null)
            {
                return false;
            }
        } else
        {
            return countMap.replace(obj, Integer.valueOf(i), Integer.valueOf(j));
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public int size()
    {
        long l = 0L;
        for (Iterator iterator1 = countMap.values().iterator(); iterator1.hasNext();)
        {
            l += ((Integer)iterator1.next()).intValue();
        }

        return Ints.saturatedCast(l);
    }

    public Object[] toArray()
    {
        return snapshot().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return snapshot().toArray(aobj);
    }

    public volatile String toString()
    {
        return super.toString();
    }

}
