// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Iterators, Ordering, ImmutableMultiset, 
//            CollectPreconditions, TransformedIterator

public final class Multisets
{
    static abstract class AbstractEntry
        implements Multiset.Entry
    {

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                flag = flag1;
                if (getCount() == ((Multiset.Entry) (obj)).getCount())
                {
                    flag = flag1;
                    if (Objects.equal(getElement(), ((Multiset.Entry) (obj)).getElement()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            Object obj = getElement();
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = obj.hashCode();
            }
            return i ^ getCount();
        }

        public String toString()
        {
            String s = String.valueOf(getElement());
            int i = getCount();
            if (i == 1)
            {
                return s;
            } else
            {
                return (new StringBuilder()).append(s).append(" x ").append(i).toString();
            }
        }

        AbstractEntry()
        {
        }
    }

    static abstract class ElementSet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            multiset().clear();
        }

        public boolean contains(Object obj)
        {
            return multiset().contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return multiset().containsAll(collection);
        }

        public boolean isEmpty()
        {
            return multiset().isEmpty();
        }

        public Iterator iterator()
        {
            return new TransformedIterator(multiset().entrySet().iterator()) {

                final ElementSet this$0;

                private static Object transform(Multiset.Entry entry)
                {
                    return entry.getElement();
                }

                final volatile Object transform(Object obj)
                {
                    return transform((Multiset.Entry)obj);
                }

            
            {
                this$0 = ElementSet.this;
                super(iterator);
            }
            };
        }

        abstract Multiset multiset();

        public boolean remove(Object obj)
        {
            int i = multiset().count(obj);
            if (i > 0)
            {
                multiset().remove(obj, i);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return multiset().entrySet().size();
        }

        ElementSet()
        {
        }
    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            multiset().clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                break MISSING_BLOCK_LABEL_12;
            }
            do
            {
                return false;
            } while (((Multiset.Entry) (obj)).getCount() <= 0 || multiset().count(((Multiset.Entry) (obj)).getElement()) != ((Multiset.Entry) (obj)).getCount());
            return true;
        }

        abstract Multiset multiset();

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Object obj1 = ((Multiset.Entry) (obj)).getElement();
                int i = ((Multiset.Entry) (obj)).getCount();
                flag = flag1;
                if (i != 0)
                {
                    flag = multiset().setCount(obj1, i, 0);
                }
            }
            return flag;
        }

        EntrySet()
        {
        }
    }

    static final class ImmutableEntry extends AbstractEntry
        implements Serializable
    {

        final int count;
        final Object element;

        public final int getCount()
        {
            return count;
        }

        public final Object getElement()
        {
            return element;
        }

        ImmutableEntry(Object obj, int i)
        {
            element = obj;
            count = i;
            CollectPreconditions.checkNonnegative(i, "count");
        }
    }

    static final class MultisetIteratorImpl
        implements Iterator
    {

        private boolean canRemove;
        private Multiset.Entry currentEntry;
        private final Iterator entryIterator;
        private int laterCount;
        private final Multiset multiset;
        private int totalCount;

        public final boolean hasNext()
        {
            return laterCount > 0 || entryIterator.hasNext();
        }

        public final Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            if (laterCount == 0)
            {
                currentEntry = (Multiset.Entry)entryIterator.next();
                int i = currentEntry.getCount();
                laterCount = i;
                totalCount = i;
            }
            laterCount = laterCount - 1;
            canRemove = true;
            return currentEntry.getElement();
        }

        public final void remove()
        {
            CollectPreconditions.checkRemove(canRemove);
            if (totalCount == 1)
            {
                entryIterator.remove();
            } else
            {
                multiset.remove(currentEntry.getElement());
            }
            totalCount = totalCount - 1;
            canRemove = false;
        }

        MultisetIteratorImpl(Multiset multiset1, Iterator iterator)
        {
            multiset = multiset1;
            entryIterator = iterator;
        }
    }


    private static final Ordering DECREASING_COUNT_ORDERING = new Ordering() {

        private static int compare(Multiset.Entry entry, Multiset.Entry entry1)
        {
            return Ints.compare(entry1.getCount(), entry.getCount());
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((Multiset.Entry)obj, (Multiset.Entry)obj1);
        }

    };

    static boolean addAllImpl(Multiset multiset, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof Multiset)
        {
            Multiset.Entry entry;
            for (collection = cast(collection).entrySet().iterator(); collection.hasNext(); multiset.add(entry.getElement(), entry.getCount()))
            {
                entry = (Multiset.Entry)collection.next();
            }

        } else
        {
            Iterators.addAll(multiset, collection.iterator());
        }
        return true;
    }

    private static Multiset cast(Iterable iterable)
    {
        return (Multiset)iterable;
    }

    public static ImmutableMultiset copyHighestCountFirst(Multiset multiset)
    {
        return ImmutableMultiset.copyFromEntries(DECREASING_COUNT_ORDERING.immutableSortedCopy(multiset.entrySet()));
    }

    static boolean equalsImpl(Multiset multiset, Object obj)
    {
        if (obj != multiset) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj instanceof Multiset)
        {
            obj = (Multiset)obj;
            if (multiset.size() != ((Multiset) (obj)).size() || multiset.entrySet().size() != ((Multiset) (obj)).entrySet().size())
            {
                return false;
            }
            obj = ((Multiset) (obj)).entrySet().iterator();
            Multiset.Entry entry;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                entry = (Multiset.Entry)((Iterator) (obj)).next();
            } while (multiset.count(entry.getElement()) == entry.getCount());
            break; /* Loop/switch isn't completed */
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static Multiset.Entry immutableEntry(Object obj, int i)
    {
        return new ImmutableEntry(obj, i);
    }

    static Iterator iteratorImpl(Multiset multiset)
    {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static boolean removeAllImpl(Multiset multiset, Collection collection)
    {
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    static boolean retainAllImpl(Multiset multiset, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static int setCountImpl(Multiset multiset, Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "count");
        int j = multiset.count(obj);
        i -= j;
        if (i > 0)
        {
            multiset.add(obj, i);
        } else
        if (i < 0)
        {
            multiset.remove(obj, -i);
            return j;
        }
        return j;
    }

    static boolean setCountImpl(Multiset multiset, Object obj, int i, int j)
    {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(j, "newCount");
        if (multiset.count(obj) == i)
        {
            multiset.setCount(obj, j);
            return true;
        } else
        {
            return false;
        }
    }

    static int sizeImpl(Multiset multiset)
    {
        long l = 0L;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
        {
            l += ((Multiset.Entry)multiset.next()).getCount();
        }

        return Ints.saturatedCast(l);
    }

}
