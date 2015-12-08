// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Lists, UnmodifiableIterator, PeekingIterator, 
//            Iterables, Collections2, UnmodifiableListIterator

public final class Iterators
{

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

    public static Enumeration asEnumeration(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new _cls14(iterator);
    }

    static ListIterator cast(Iterator iterator)
    {
        return (ListIterator)iterator;
    }

    static void checkNonnegative(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(43)).append("position (").append(i).append(") must not be negative").toString());
        } else
        {
            return;
        }
    }

    static void clear(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static Iterator concat(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new _cls5(iterator);
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1)
    {
        return concat(((Iterator) (ImmutableList.of(iterator, iterator1).iterator())));
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1, Iterator iterator2)
    {
        return concat(((Iterator) (ImmutableList.of(iterator, iterator1, iterator2).iterator())));
    }

    public static Iterator concat(Iterator iterator, Iterator iterator1, Iterator iterator2, Iterator iterator3)
    {
        return concat(((Iterator) (ImmutableList.of(iterator, iterator1, iterator2, iterator3).iterator())));
    }

    public static transient Iterator concat(Iterator aiterator[])
    {
        return concat(((Iterator) (ImmutableList.copyOf(aiterator).iterator())));
    }

    public static Iterator consumingIterator(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new _cls10(iterator);
    }

    public static boolean contains(Iterator iterator, Object obj)
    {
        return any(iterator, Predicates.equalTo(obj));
    }

    public static Iterator cycle(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new _cls4(iterable);
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

    public static UnmodifiableIterator filter(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        return new _cls7(iterator, predicate);
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

    public static transient UnmodifiableIterator forArray(Object aobj[])
    {
        return forArray(aobj, 0, aobj.length, 0);
    }

    static UnmodifiableListIterator forArray(Object aobj[], int i, int j, int k)
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
        Preconditions.checkPositionIndex(k, j);
        if (j == 0)
        {
            return emptyListIterator();
        } else
        {
            return new _cls11(j, k, aobj, i);
        }
    }

    public static UnmodifiableIterator forEnumeration(Enumeration enumeration)
    {
        Preconditions.checkNotNull(enumeration);
        return new _cls13(enumeration);
    }

    public static int frequency(Iterator iterator, Object obj)
    {
        return size(filter(iterator, Predicates.equalTo(obj)));
    }

    public static Object get(Iterator iterator, int i)
    {
        checkNonnegative(i);
        int j = advance(iterator, i);
        if (!iterator.hasNext())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(91)).append("position (").append(i).append(") must be less than the number of elements that remained (").append(j).append(")").toString());
        } else
        {
            return iterator.next();
        }
    }

    public static Object get(Iterator iterator, int i, Object obj)
    {
        checkNonnegative(i);
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
        }
        StringBuilder stringbuilder = new StringBuilder();
        obj = String.valueOf(String.valueOf(obj));
        stringbuilder.append((new StringBuilder(((String) (obj)).length() + 31)).append("expected one element but was: <").append(((String) (obj))).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            String s = String.valueOf(String.valueOf(iterator.next()));
            stringbuilder.append((new StringBuilder(s.length() + 2)).append(", ").append(s).toString());
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
        return new _cls9(i, iterator);
    }

    public static UnmodifiableIterator mergeSorted(Iterable iterable, Comparator comparator)
    {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
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
        return new _cls6(iterator, i, flag);
    }

    public static PeekingIterator peekingIterator(PeekingIterator peekingiterator)
    {
        return (PeekingIterator)Preconditions.checkNotNull(peekingiterator);
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

    static Object pollNext(Iterator iterator)
    {
        if (iterator.hasNext())
        {
            Object obj = iterator.next();
            iterator.remove();
            return obj;
        } else
        {
            return null;
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

    public static UnmodifiableIterator singletonIterator(Object obj)
    {
        return new _cls12(obj);
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

    public static Object[] toArray(Iterator iterator, Class class1)
    {
        return Iterables.toArray(Lists.newArrayList(iterator), class1);
    }

    public static String toString(Iterator iterator)
    {
        return Collections2.STANDARD_JOINER.appendTo(new StringBuilder("["), iterator).append(']').toString();
    }

    public static Iterator transform(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        return new _cls8(iterator, function);
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

    public static UnmodifiableIterator unmodifiableIterator(UnmodifiableIterator unmodifiableiterator)
    {
        return (UnmodifiableIterator)Preconditions.checkNotNull(unmodifiableiterator);
    }

    public static UnmodifiableIterator unmodifiableIterator(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        if (iterator instanceof UnmodifiableIterator)
        {
            return (UnmodifiableIterator)iterator;
        } else
        {
            return new _cls3(iterator);
        }
    }


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class MergingIterator {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class PeekingImpl {}


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
