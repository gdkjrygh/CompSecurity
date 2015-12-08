// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Lists, UnmodifiableIterator, Iterables, 
//            PeekingIterator, AbstractIndexedListIterator, AbstractIterator

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


    static final UnmodifiableIterator EMPTY_ITERATOR = new UnmodifiableIterator() {

        public boolean hasNext()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

    };
    private static final Iterator EMPTY_MODIFIABLE_ITERATOR = new Iterator() {

        public boolean hasNext()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

        public void remove()
        {
            throw new IllegalStateException();
        }

    };

    private Iterators()
    {
    }

    public static boolean addAll(Collection collection, Iterator iterator)
    {
        Preconditions.checkNotNull(collection);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
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
        Preconditions.checkNotNull(predicate);
        while (iterator.hasNext()) 
        {
            if (predicate.apply(iterator.next()))
            {
                return true;
            }
        }
        return false;
    }

    public static Enumeration asEnumeration(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new Enumeration(iterator) {

            final Iterator val$iterator;

            public boolean hasMoreElements()
            {
                return iterator.hasNext();
            }

            public Object nextElement()
            {
                return iterator.next();
            }

            
            {
                iterator = iterator1;
                super();
            }
        };
    }

    private static void checkNonnegative(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must not be negative").toString());
        } else
        {
            return;
        }
    }

    public static Iterator concat(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new Iterator(iterator) {

            Iterator current;
            Iterator removeFrom;
            final Iterator val$inputs;

            public boolean hasNext()
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

            public Object next()
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

            public void remove()
            {
                boolean flag;
                if (removeFrom != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "no calls to next() since last call to remove()");
                removeFrom.remove();
                removeFrom = null;
            }

            
            {
                inputs = iterator;
                super();
                current = Iterators.emptyIterator();
            }
        };
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator1);
        return concat(Arrays.asList(new Iterator[] {
            iterator, iterator1
        }).iterator());
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1, Iterator iterator2)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator1);
        Preconditions.checkNotNull(iterator2);
        return concat(Arrays.asList(new Iterator[] {
            iterator, iterator1, iterator2
        }).iterator());
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1, Iterator iterator2, Iterator iterator3)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator1);
        Preconditions.checkNotNull(iterator2);
        Preconditions.checkNotNull(iterator3);
        return concat(Arrays.asList(new Iterator[] {
            iterator, iterator1, iterator2, iterator3
        }).iterator());
    }

    public static transient Iterator concat(Iterator aiterator[])
    {
        return concat(((Iterator) (ImmutableList.copyOf(aiterator).iterator())));
    }

    public static Iterator consumingIterator(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new UnmodifiableIterator(iterator) {

            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                Object obj = iterator.next();
                iterator.remove();
                return obj;
            }

            
            {
                iterator = iterator1;
                super();
            }
        };
    }

    public static boolean contains(Iterator iterator, Object obj)
    {
label0:
        {
            if (obj == null)
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (iterator.next() != null);
                return true;
            }
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!obj.equals(iterator.next()));
            return true;
        }
        return false;
    }

    public static Iterator cycle(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new Iterator(iterable) {

            Iterator iterator;
            Iterator removeFrom;
            final Iterable val$iterable;

            public boolean hasNext()
            {
                if (!iterator.hasNext())
                {
                    iterator = iterable.iterator();
                }
                return iterator.hasNext();
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    removeFrom = iterator;
                    return iterator.next();
                }
            }

            public void remove()
            {
                boolean flag;
                if (removeFrom != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "no calls to next() since last call to remove()");
                removeFrom.remove();
                removeFrom = null;
            }

            
            {
                iterable = iterable1;
                super();
                iterator = Iterators.emptyIterator();
            }
        };
    }

    public static transient Iterator cycle(Object aobj[])
    {
        return cycle(((Iterable) (Lists.newArrayList(aobj))));
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
        } while (Objects.equal(iterator.next(), iterator1.next()));
        return false;
    }

    public static UnmodifiableIterator emptyIterator()
    {
        return EMPTY_ITERATOR;
    }

    static Iterator emptyModifiableIterator()
    {
        return EMPTY_MODIFIABLE_ITERATOR;
    }

    public static UnmodifiableIterator filter(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator(iterator, predicate) {

            final Predicate val$predicate;
            final Iterator val$unfiltered;

            protected Object computeNext()
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

            
            {
                unfiltered = iterator;
                predicate = predicate1;
                super();
            }
        };
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
        iterator = filter(iterator, predicate);
        if (iterator.hasNext())
        {
            obj = iterator.next();
        }
        return obj;
    }

    public static transient UnmodifiableIterator forArray(Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        return new AbstractIndexedListIterator(aobj.length, aobj) {

            final Object val$array[];

            protected Object get(int i)
            {
                return array[i];
            }

            
            {
                array = aobj;
                super(i);
            }
        };
    }

    static UnmodifiableIterator forArray(Object aobj[], int i, int j)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkPositionIndexes(i, i + j, aobj.length);
        return new AbstractIndexedListIterator(j, aobj, i) {

            final Object val$array[];
            final int val$offset;

            protected Object get(int k)
            {
                return array[offset + k];
            }

            
            {
                array = aobj;
                offset = j;
                super(i);
            }
        };
    }

    public static UnmodifiableIterator forEnumeration(Enumeration enumeration)
    {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator(enumeration) {

            final Enumeration val$enumeration;

            public boolean hasNext()
            {
                return enumeration.hasMoreElements();
            }

            public Object next()
            {
                return enumeration.nextElement();
            }

            
            {
                enumeration = enumeration1;
                super();
            }
        };
    }

    public static int frequency(Iterator iterator, Object obj)
    {
        int i = 0;
        int j = 0;
        if (obj == null)
        {
            i = j;
            do
            {
                j = i;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (iterator.next() == null)
                {
                    i++;
                }
            } while (true);
        } else
        {
            do
            {
                j = i;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (obj.equals(iterator.next()))
                {
                    i++;
                }
            } while (true);
        }
        return j;
    }

    public static Object get(Iterator iterator, int i)
    {
        checkNonnegative(i);
        int j;
        for (j = 0; iterator.hasNext(); j++)
        {
            Object obj = iterator.next();
            if (j == i)
            {
                return obj;
            }
        }

        throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must be less than the number of elements that remained (").append(j).append(")").toString());
    }

    public static Object get(Iterator iterator, int i, Object obj)
    {
        checkNonnegative(i);
        try
        {
            iterator = ((Iterator) (get(iterator, i)));
        }
        // Misplaced declaration of an exception variable
        catch (Iterator iterator)
        {
            return obj;
        }
        return iterator;
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
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("expected one element but was: <").append(obj).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            stringbuilder.append((new StringBuilder()).append(", ").append(iterator.next()).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
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

    public static Iterator limit(Iterator iterator, int i)
    {
        Preconditions.checkNotNull(iterator);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "limit is negative");
        return new Iterator(i, iterator) {

            private int count;
            final Iterator val$iterator;
            final int val$limitSize;

            public boolean hasNext()
            {
                return count < limitSize && iterator.hasNext();
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    count = count + 1;
                    return iterator.next();
                }
            }

            public void remove()
            {
                iterator.remove();
            }

            
            {
                limitSize = i;
                iterator = iterator1;
                super();
            }
        };
    }

    public static UnmodifiableIterator paddedPartition(Iterator iterator, int i)
    {
        return partitionImpl(iterator, i, true);
    }

    public static UnmodifiableIterator partition(Iterator iterator, int i)
    {
        return partitionImpl(iterator, i, false);
    }

    private static UnmodifiableIterator partitionImpl(Iterator iterator, int i, boolean flag)
    {
        Preconditions.checkNotNull(iterator);
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        return new UnmodifiableIterator(iterator, i, flag) {

            final Iterator val$iterator;
            final boolean val$pad;
            final int val$size;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public volatile Object next()
            {
                return next();
            }

            public List next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                Object aobj[] = new Object[size];
                int j;
                for (j = 0; j < size && iterator.hasNext(); j++)
                {
                    aobj[j] = iterator.next();
                }

                List list = Collections.unmodifiableList(Arrays.asList(aobj));
                if (pad || j == size)
                {
                    return list;
                } else
                {
                    return list.subList(0, j);
                }
            }

            
            {
                iterator = iterator1;
                size = i;
                pad = flag;
                super();
            }
        };
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
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (collection.contains(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
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
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static UnmodifiableIterator singletonIterator(Object obj)
    {
        return new UnmodifiableIterator(obj) {

            boolean done;
            final Object val$value;

            public boolean hasNext()
            {
                return !done;
            }

            public Object next()
            {
                if (done)
                {
                    throw new NoSuchElementException();
                } else
                {
                    done = true;
                    return value;
                }
            }

            
            {
                value = obj;
                super();
            }
        };
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

    public static int skip(Iterator iterator, int i)
    {
        Preconditions.checkNotNull(iterator);
        int j;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "number to skip cannot be negative");
        for (j = 0; j < i && iterator.hasNext(); j++)
        {
            iterator.next();
        }

        return j;
    }

    public static Object[] toArray(Iterator iterator, Class class1)
    {
        return Iterables.toArray(Lists.newArrayList(iterator), class1);
    }

    public static String toString(Iterator iterator)
    {
        if (!iterator.hasNext())
        {
            return "[]";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[').append(iterator.next());
        for (; iterator.hasNext(); stringbuilder.append(", ").append(iterator.next())) { }
        return stringbuilder.append(']').toString();
    }

    public static Iterator transform(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(function);
        return new Iterator(iterator, function) {

            final Iterator val$fromIterator;
            final Function val$function;

            public boolean hasNext()
            {
                return fromIterator.hasNext();
            }

            public Object next()
            {
                Object obj = fromIterator.next();
                return function.apply(obj);
            }

            public void remove()
            {
                fromIterator.remove();
            }

            
            {
                fromIterator = iterator;
                function = function1;
                super();
            }
        };
    }

    public static UnmodifiableIterator unmodifiableIterator(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new UnmodifiableIterator(iterator) {

            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                return iterator.next();
            }

            
            {
                iterator = iterator1;
                super();
            }
        };
    }

}
