// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multisets, ForwardingSet, Iterators

abstract class AbstractMapBasedMultiset extends AbstractMultiset
    implements Serializable
{
    private class EntrySet extends AbstractSet
    {

        final AbstractMapBasedMultiset this$0;

        public void clear()
        {
            for (Iterator iterator1 = backingMap.values().iterator(); iterator1.hasNext(); ((AtomicInteger)iterator1.next()).set(0)) { }
            backingMap.clear();
            AbstractMapBasedMultiset.this.size = 0L;
        }

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                int i = count(((Multiset.Entry) (obj)).getElement());
                flag = flag1;
                if (i == ((Multiset.Entry) (obj)).getCount())
                {
                    flag = flag1;
                    if (i > 0)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public Iterator iterator()
        {
            return backingMap.entrySet().iterator(). new Iterator() {

                final EntrySet this$1;
                java.util.Map.Entry toRemove;
                final Iterator val$backingEntries;

                public boolean hasNext()
                {
                    return backingEntries.hasNext();
                }

                public Multiset.Entry next()
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)backingEntries.next();
                    toRemove = entry;
                    return entry. new Multisets.AbstractEntry() {

                        final EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$mapEntry;

                        public int getCount()
                        {
                            int j = ((AtomicInteger)mapEntry.getValue()).get();
                            int i = j;
                            if (j == 0)
                            {
                                AtomicInteger atomicinteger = (AtomicInteger)backingMap.get(getElement());
                                i = j;
                                if (atomicinteger != null)
                                {
                                    i = atomicinteger.get();
                                }
                            }
                            return i;
                        }

                        public Object getElement()
                        {
                            return mapEntry.getKey();
                        }

            
            {
                this$2 = final__pcls1;
                mapEntry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

                public volatile Object next()
                {
                    return next();
                }

                public void remove()
                {
                    boolean flag;
                    if (toRemove != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
                    <no variable> = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$1 = final_entryset;
                backingEntries = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            boolean flag = false;
            if (contains(obj))
            {
                obj = (Multiset.Entry)obj;
                int i = ((AtomicInteger)backingMap.remove(((Multiset.Entry) (obj)).getElement())).getAndSet(0);
                obj = 
// JavaClassFileOutputException: get_constant: invalid tag

        public int size()
        {
            return backingMap.size();
        }

        private EntrySet()
        {
            this$0 = AbstractMapBasedMultiset.this;
            super();
        }

    }

    class MapBasedElementSet extends ForwardingSet
    {

        private final Set _flddelegate;
        private final Map map;
        final AbstractMapBasedMultiset this$0;

        public void clear()
        {
            if (map == backingMap)
            {
                AbstractMapBasedMultiset.this.clear();
            } else
            {
                Iterator iterator1 = iterator();
                while (iterator1.hasNext()) 
                {
                    iterator1.next();
                    iterator1.remove();
                }
            }
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

        public Map getMap()
        {
            return map;
        }

        public Iterator iterator()
        {
            return map.entrySet().iterator(). new Iterator() {

                final MapBasedElementSet this$1;
                java.util.Map.Entry toRemove;
                final Iterator val$entries;

                public boolean hasNext()
                {
                    return entries.hasNext();
                }

                public Object next()
                {
                    toRemove = (java.util.Map.Entry)entries.next();
                    return toRemove.getKey();
                }

                public void remove()
                {
                    boolean flag;
                    if (toRemove != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
                    <no variable> = ((this._cls0) (this)).this$0 - <no variable>;
                    entries.remove();
                    toRemove = null;
                }

            
            {
                this$1 = final_mapbasedelementset;
                entries = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            return removeAllOccurrences(obj, map) != 0;
        }

        public boolean removeAll(Collection collection)
        {
            return Iterators.removeAll(iterator(), collection);
        }

        public boolean retainAll(Collection collection)
        {
            return Iterators.retainAll(iterator(), collection);
        }

        MapBasedElementSet(Map map1)
        {
            this$0 = AbstractMapBasedMultiset.this;
            super();
            map = map1;
            _flddelegate = map1.keySet();
        }
    }

    private class MapBasedMultisetIterator
        implements Iterator
    {

        boolean canRemove;
        java.util.Map.Entry currentEntry;
        final Iterator entryIterator;
        int occurrencesLeft;
        final AbstractMapBasedMultiset this$0;

        public boolean hasNext()
        {
            return occurrencesLeft > 0 || entryIterator.hasNext();
        }

        public Object next()
        {
            if (occurrencesLeft == 0)
            {
                currentEntry = (java.util.Map.Entry)entryIterator.next();
                occurrencesLeft = ((AtomicInteger)currentEntry.getValue()).get();
            }
            occurrencesLeft = occurrencesLeft - 1;
            canRemove = true;
            return currentEntry.getKey();
        }

        public void remove()
        {
            Preconditions.checkState(canRemove, "no calls to next() since the last call to remove()");
            if (((AtomicInteger)currentEntry.getValue()).get() <= 0)
            {
                throw new ConcurrentModificationException();
            }
            if (((AtomicInteger)currentEntry.getValue()).addAndGet(-1) == 0)
            {
                entryIterator.remove();
            }
            long l = ((currentEntry) (this)).currentEntry;
            canRemove = false;
        }

        MapBasedMultisetIterator()
        {
            this$0 = AbstractMapBasedMultiset.this;
            super();
            entryIterator = backingMap.entrySet().iterator();
        }
    }


    private static final long serialVersionUID = 0xe0c3ab9b328ff63aL;
    private transient Map backingMap;
    private transient EntrySet entrySet;
    private transient long size;

    protected AbstractMapBasedMultiset(Map map)
    {
        backingMap = (Map)Preconditions.checkNotNull(map);
        size = super.size();
    }

    private static int getAndSet(AtomicInteger atomicinteger, int i)
    {
        if (atomicinteger == null)
        {
            return 0;
        } else
        {
            return atomicinteger.getAndSet(i);
        }
    }

    private void readObjectNoData()
        throws ObjectStreamException
    {
        throw new InvalidObjectException("Stream data required");
    }

    private int removeAllOccurrences(Object obj, Map map)
    {
        obj = (AtomicInteger)map.remove(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            int i = ((AtomicInteger) (obj)).getAndSet(0);
            size = size - (long)i;
            return i;
        }
    }

    public int add(Object obj, int i)
    {
        if (i == 0)
        {
            return count(obj);
        }
        AtomicInteger atomicinteger;
        int j;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "occurrences cannot be negative: %s", new Object[] {
            Integer.valueOf(i)
        });
        atomicinteger = (AtomicInteger)backingMap.get(obj);
        if (atomicinteger == null)
        {
            j = 0;
            backingMap.put(obj, new AtomicInteger(i));
        } else
        {
            j = atomicinteger.get();
            long l = (long)j + (long)i;
            boolean flag1;
            if (l <= 0x7fffffffL)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "too many occurrences: %s", new Object[] {
                Long.valueOf(l)
            });
            atomicinteger.getAndAdd(i);
        }
        size = size + (long)i;
        return j;
    }

    Map backingMap()
    {
        return backingMap;
    }

    public boolean contains(Object obj)
    {
        obj = (AtomicInteger)backingMap.get(obj);
        return obj != null && ((AtomicInteger) (obj)).get() > 0;
    }

    public int count(Object obj)
    {
        obj = (AtomicInteger)backingMap.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((AtomicInteger) (obj)).get();
        }
    }

    Set createElementSet()
    {
        return new MapBasedElementSet(backingMap);
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

    public Iterator iterator()
    {
        return new MapBasedMultisetIterator();
    }

    public int remove(Object obj, int i)
    {
        int j = 0;
        if (i == 0)
        {
            j = count(obj);
        } else
        {
            AtomicInteger atomicinteger;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "occurrences cannot be negative: %s", new Object[] {
                Integer.valueOf(i)
            });
            atomicinteger = (AtomicInteger)backingMap.get(obj);
            if (atomicinteger != null)
            {
                int k = atomicinteger.get();
                if (k <= i)
                {
                    i = k;
                    backingMap.remove(obj);
                }
                atomicinteger.addAndGet(-i);
                size = size - (long)i;
                return k;
            }
        }
        return j;
    }

    void setBackingMap(Map map)
    {
        backingMap = map;
    }

    public int setCount(Object obj, int i)
    {
        Multisets.checkNonnegative(i, "count");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = getAndSet((AtomicInteger)backingMap.remove(obj), i);
_L4:
        size = size + (long)(i - j);
        return j;
_L2:
        AtomicInteger atomicinteger = (AtomicInteger)backingMap.get(obj);
        int k = getAndSet(atomicinteger, i);
        j = k;
        if (atomicinteger == null)
        {
            backingMap.put(obj, new AtomicInteger(i));
            j = k;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int size()
    {
        return Ints.saturatedCast(size);
    }



/*
    static long access$202(AbstractMapBasedMultiset abstractmapbasedmultiset, long l)
    {
        abstractmapbasedmultiset.size = l;
        return l;
    }

*/


/*
    static long access$210(AbstractMapBasedMultiset abstractmapbasedmultiset)
    {
        long l = abstractmapbasedmultiset.size;
        abstractmapbasedmultiset.size = l - 1L;
        return l;
    }

*/


/*
    static long access$222(AbstractMapBasedMultiset abstractmapbasedmultiset, long l)
    {
        l = abstractmapbasedmultiset.size - l;
        abstractmapbasedmultiset.size = l;
        return l;
    }

*/

}
