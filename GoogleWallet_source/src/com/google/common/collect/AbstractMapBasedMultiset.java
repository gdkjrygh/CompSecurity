// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Count, Maps, CollectPreconditions

abstract class AbstractMapBasedMultiset extends AbstractMultiset
    implements Serializable
{
    final class MapBasedMultisetIterator
        implements Iterator
    {

        boolean canRemove;
        java.util.Map.Entry currentEntry;
        final Iterator entryIterator;
        int occurrencesLeft;
        final AbstractMapBasedMultiset this$0;

        public final boolean hasNext()
        {
            return occurrencesLeft > 0 || entryIterator.hasNext();
        }

        public final Object next()
        {
            if (occurrencesLeft == 0)
            {
                currentEntry = (java.util.Map.Entry)entryIterator.next();
                occurrencesLeft = ((Count)currentEntry.getValue()).get();
            }
            occurrencesLeft = occurrencesLeft - 1;
            canRemove = true;
            return currentEntry.getKey();
        }

        public final void remove()
        {
            CollectPreconditions.checkRemove(canRemove);
            if (((Count)currentEntry.getValue()).get() <= 0)
            {
                throw new ConcurrentModificationException();
            }
            if (((Count)currentEntry.getValue()).addAndGet(-1) == 0)
            {
                entryIterator.remove();
            }
            long l = ((Map) (this)).entrySet;
            canRemove = false;
        }

        MapBasedMultisetIterator()
        {
            this$0 = AbstractMapBasedMultiset.this;
            super();
            entryIterator = backingMap.entrySet().iterator();
        }
    }


    private transient Map backingMap;
    private transient long size;

    protected AbstractMapBasedMultiset(Map map)
    {
        backingMap = (Map)Preconditions.checkNotNull(map);
        size = super.size();
    }

    private static int getAndSet(Count count1, int i)
    {
        if (count1 == null)
        {
            return 0;
        } else
        {
            return count1.getAndSet(i);
        }
    }

    public int add(Object obj, int i)
    {
        if (i == 0)
        {
            return count(obj);
        }
        Count count1;
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
        count1 = (Count)backingMap.get(obj);
        if (count1 == null)
        {
            j = 0;
            backingMap.put(obj, new Count(i));
        } else
        {
            j = count1.get();
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
            count1.getAndAdd(i);
        }
        size = size + (long)i;
        return j;
    }

    public void clear()
    {
        for (Iterator iterator1 = backingMap.values().iterator(); iterator1.hasNext(); ((Count)iterator1.next()).set(0)) { }
        backingMap.clear();
        size = 0L;
    }

    public int count(Object obj)
    {
        obj = (Count)Maps.safeGet(backingMap, obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Count) (obj)).get();
        }
    }

    final int distinctElements()
    {
        return backingMap.size();
    }

    final Iterator entryIterator()
    {
        return new Iterator() {

            final AbstractMapBasedMultiset this$0;
            java.util.Map.Entry toRemove;
            final Iterator val$backingEntries;

            private Multiset.Entry next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)backingEntries.next();
                toRemove = entry;
                return entry. new Multisets.AbstractEntry() {

                    final _cls1 this$1;
                    final java.util.Map.Entry val$mapEntry;

                    public final int getCount()
                    {
                        Count count1 = (Count)mapEntry.getValue();
                        if (count1 == null || count1.get() == 0)
                        {
                            Count count2 = (Count)backingMap.get(getElement());
                            if (count2 != null)
                            {
                                return count2.get();
                            }
                        }
                        if (count1 == null)
                        {
                            return 0;
                        } else
                        {
                            return count1.get();
                        }
                    }

                    public final Object getElement()
                    {
                        return mapEntry.getKey();
                    }

            
            {
                this$1 = final__pcls1;
                mapEntry = java.util.Map.Entry.this;
                super();
            }
                };
            }

            public final boolean hasNext()
            {
                return backingEntries.hasNext();
            }

            public final volatile Object next()
            {
                return next();
            }

            public final void remove()
            {
                boolean flag;
                if (toRemove != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                <no variable> = ((toRemove) (this)).toRemove - <no variable>;
                backingEntries.remove();
                toRemove = null;
            }

            
            {
                this$0 = AbstractMapBasedMultiset.this;
                backingEntries = iterator1;
                super();
            }
        };
    }

    public Set entrySet()
    {
        return super.entrySet();
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
            Count count1;
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
            count1 = (Count)backingMap.get(obj);
            if (count1 != null)
            {
                int k = count1.get();
                if (k <= i)
                {
                    i = k;
                    backingMap.remove(obj);
                }
                count1.addAndGet(-i);
                size = size - (long)i;
                return k;
            }
        }
        return j;
    }

    public int setCount(Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "count");
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = getAndSet((Count)backingMap.remove(obj), i);
_L4:
        size = size + (long)(i - j);
        return j;
_L2:
        Count count1 = (Count)backingMap.get(obj);
        int k = getAndSet(count1, i);
        j = k;
        if (count1 == null)
        {
            backingMap.put(obj, new Count(i));
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
    static long access$110(AbstractMapBasedMultiset abstractmapbasedmultiset)
    {
        long l = abstractmapbasedmultiset.size;
        abstractmapbasedmultiset.size = l - 1L;
        return l;
    }

*/


/*
    static long access$122(AbstractMapBasedMultiset abstractmapbasedmultiset, long l)
    {
        l = abstractmapbasedmultiset.size - l;
        abstractmapbasedmultiset.size = l;
        return l;
    }

*/
}
