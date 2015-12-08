// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.functions.Predicates;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.strings.Joiner;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            UnmodifiableIterator, CollectPreconditions, MoreCollections, UnmodifiableListIterator, 
//            PeekingIterator

public final class Iterators
{
    private static class PeekingImpl
        implements PeekingIterator
    {

        private boolean hasPeeked;
        private final Iterator iterator;
        private Object peekedElement;

        public boolean hasNext()
        {
            return hasPeeked || iterator.hasNext();
        }

        public Object next()
        {
            if (!hasPeeked)
            {
                return iterator.next();
            } else
            {
                Object obj = peekedElement;
                hasPeeked = false;
                peekedElement = null;
                return obj;
            }
        }

        public Object peek()
        {
            if (!hasPeeked)
            {
                peekedElement = iterator.next();
                hasPeeked = true;
            }
            return peekedElement;
        }

        public void remove()
        {
            boolean flag;
            if (!hasPeeked)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Can't remove after you've peeked at next");
            iterator.remove();
        }

        public PeekingImpl(Iterator iterator1)
        {
            iterator = (Iterator)Preconditions.checkNotNull(iterator1);
        }
    }


    static final UnmodifiableListIterator EMPTY_LIST_ITERATOR = new _cls1();
    private static final Iterator EMPTY_MODIFIABLE_ITERATOR = new _cls2();

    private Iterators()
    {
    }

    public static boolean addAll(Collection collection, Iterator iterator)
    {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static int advance(Iterator iterator, int i)
    {
        int j = 0;
        Preconditions.checkNotNull(iterator);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numberToAdvance must be nonnegative");
        for (; j < i && iterator.hasNext(); j++)
        {
            iterator.next();
        }

        return j;
    }

    public static boolean all(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) 
        {
            if (!predicate.apply(iterator.next()))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean any(Iterator iterator, Predicate predicate)
    {
        return indexOf(iterator, predicate) != -1;
    }

    static void clear(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static Iterator concat(final Iterator inputs)
    {
        Preconditions.checkNotNull(inputs);
        return new _cls3();
    }

    public static boolean contains(Iterator iterator, Object obj)
    {
        return any(iterator, Predicates.equalTo(obj));
    }

    public static boolean elementsEqual(Iterator iterator, Iterator iterator1)
    {
        do
        {
            if (iterator.hasNext())
            {
                if (iterator1.hasNext())
                {
                    continue;
                }
            } else
            if (!iterator1.hasNext())
            {
                return true;
            }
            return false;
        } while (MoreObjects.equal(iterator.next(), iterator1.next()));
        return false;
    }

    static UnmodifiableIterator emptyIterator()
    {
        return emptyListIterator();
    }

    static UnmodifiableListIterator emptyListIterator()
    {
        return EMPTY_LIST_ITERATOR;
    }

    static Iterator emptyModifiableIterator()
    {
        return EMPTY_MODIFIABLE_ITERATOR;
    }

    public static UnmodifiableIterator filter(final Iterator unfiltered, final Predicate predicate)
    {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(predicate);
        return new _cls5();
    }

    public static UnmodifiableIterator filter(Iterator iterator, Class class1)
    {
        return filter(iterator, Predicates.instanceOf(class1));
    }

    public static Object find(Iterator iterator, Predicate predicate)
    {
        return filter(iterator, predicate).next();
    }

    public static Object find(Iterator iterator, Predicate predicate, Object obj)
    {
        return getNext(filter(iterator, predicate), obj);
    }

    public static Object get(Iterator iterator, int i)
    {
        CollectPreconditions.checkIndexNonnegative(i);
        int j = advance(iterator, i);
        if (!iterator.hasNext())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("position (")).append(i).append(") must be less than the number of elements that remained (").append(j).append(")").toString());
        } else
        {
            return iterator.next();
        }
    }

    public static Object get(Iterator iterator, int i, Object obj)
    {
        CollectPreconditions.checkIndexNonnegative(i);
        advance(iterator, i);
        return getNext(iterator, obj);
    }

    public static Object getLast(Iterator iterator)
    {
        Object obj;
        do
        {
            obj = iterator.next();
        } while (iterator.hasNext());
        return obj;
    }

    public static Object getLast(Iterator iterator, Object obj)
    {
        if (iterator.hasNext())
        {
            obj = getLast(iterator);
        }
        return obj;
    }

    public static Object getNext(Iterator iterator, Object obj)
    {
        if (iterator.hasNext())
        {
            obj = iterator.next();
        }
        return obj;
    }

    public static Object getOnlyElement(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        } else
        {
            throw new IllegalArgumentException("expected one element but found multiple");
        }
    }

    public static Object getOnlyElement(Iterator iterator, Object obj)
    {
        if (iterator.hasNext())
        {
            obj = getOnlyElement(iterator);
        }
        return obj;
    }

    public static int indexOf(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate, "predicate");
        for (int i = 0; iterator.hasNext(); i++)
        {
            if (predicate.apply(iterator.next()))
            {
                return i;
            }
        }

        return -1;
    }

    public static UnmodifiableIterator paddedPartition(Iterator iterator, int i)
    {
        return partitionImpl(iterator, i, true);
    }

    public static UnmodifiableIterator partition(Iterator iterator, int i)
    {
        return partitionImpl(iterator, i, false);
    }

    private static UnmodifiableIterator partitionImpl(final Iterator iterator, final int size, final boolean pad)
    {
        Preconditions.checkNotNull(iterator);
        boolean flag;
        if (size > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new _cls4();
    }

    public static PeekingIterator peekingIterator(Iterator iterator)
    {
        if (iterator instanceof PeekingImpl)
        {
            return (PeekingImpl)iterator;
        } else
        {
            return new PeekingImpl(iterator);
        }
    }

    public static boolean removeAll(Iterator iterator, Collection collection)
    {
        return removeIf(iterator, Predicates.in(collection));
    }

    public static boolean removeIf(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (predicate.apply(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static boolean retainAll(Iterator iterator, Collection collection)
    {
        return removeIf(iterator, Predicates.not(Predicates.in(collection)));
    }

    public static int size(Iterator iterator)
    {
        int i;
        for (i = 0; iterator.hasNext(); i++)
        {
            iterator.next();
        }

        return i;
    }

    public static String toString(Iterator iterator)
    {
        return MoreCollections.STANDARD_JOINER.appendTo(new StringBuilder("["), iterator).append(']').toString();
    }

    public static Iterator transform(final Iterator final_iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        return new _cls6(function);
    }

    public static Optional tryFind(Iterator iterator, Predicate predicate)
    {
        iterator = filter(iterator, predicate);
        if (iterator.hasNext())
        {
            return Optional.of(iterator.next());
        } else
        {
            return Optional.absent();
        }
    }


    private class _cls3
        implements Iterator
    {

        Iterator current;
        Iterator removeFrom;
        final Iterator val$inputs;

        public final boolean hasNext()
        {
            do
            {
                boolean flag = ((Iterator)Preconditions.checkNotNull(current)).hasNext();
                if (!flag && inputs.hasNext())
                {
                    current = (Iterator)inputs.next();
                } else
                {
                    return flag;
                }
            } while (true);
        }

        public final Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                removeFrom = current;
                return current.next();
            }
        }

        public final void remove()
        {
            boolean flag;
            if (removeFrom != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            CollectPreconditions.checkRemove(flag);
            removeFrom.remove();
            removeFrom = null;
        }

        _cls3()
        {
            inputs = iterator;
            super();
            current = Iterators.emptyIterator();
        }
    }


    private class _cls5 extends AbstractIterator
    {

        final Predicate val$predicate;
        final Iterator val$unfiltered;

        protected final Object computeNext()
        {
            while (unfiltered.hasNext()) 
            {
                Object obj = unfiltered.next();
                if (predicate.apply(obj))
                {
                    return obj;
                }
            }
            return endOfData();
        }

        _cls5()
        {
            unfiltered = iterator;
            predicate = predicate1;
            super();
        }
    }


    private class _cls4 extends UnmodifiableIterator
    {

        final Iterator val$iterator;
        final boolean val$pad;
        final int val$size;

        public final boolean hasNext()
        {
            return iterator.hasNext();
        }

        public final volatile Object next()
        {
            return next();
        }

        public final List next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            Object aobj[] = new Object[size];
            int i;
            for (i = 0; i < size && iterator.hasNext(); i++)
            {
                aobj[i] = iterator.next();
            }

            for (int j = i; j < size; j++)
            {
                aobj[j] = null;
            }

            List list = Collections.unmodifiableList(Arrays.asList(aobj));
            if (pad || i == size)
            {
                return list;
            } else
            {
                return list.subList(0, i);
            }
        }

        _cls4()
        {
            iterator = iterator1;
            size = i;
            pad = flag;
            super();
        }
    }


    private class _cls6 extends TransformedIterator
    {

        final Function val$function;

        final Object transform(Object obj)
        {
            return function.apply(obj);
        }

        _cls6(Function function1)
        {
            function = function1;
            super(final_iterator);
        }
    }


    private class _cls1 extends UnmodifiableListIterator
    {

        public final boolean hasNext()
        {
            return false;
        }

        public final boolean hasPrevious()
        {
            return false;
        }

        public final Object next()
        {
            throw new NoSuchElementException();
        }

        public final int nextIndex()
        {
            return 0;
        }

        public final Object previous()
        {
            throw new NoSuchElementException();
        }

        public final int previousIndex()
        {
            return -1;
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements Iterator
    {

        public final boolean hasNext()
        {
            return false;
        }

        public final Object next()
        {
            throw new NoSuchElementException();
        }

        public final void remove()
        {
            CollectPreconditions.checkRemove(false);
        }

        _cls2()
        {
        }
    }

}
