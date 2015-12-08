// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            CollectPreconditions, Iterators, Collections2, Iterables, 
//            ImmutableList, TransformedListIterator

public final class Lists
{
    static final class RandomAccessReverseList extends ReverseList
        implements RandomAccess
    {

        RandomAccessReverseList(List list)
        {
            super(list);
        }
    }

    static class ReverseList extends AbstractList
    {

        private final List forwardList;

        private int reverseIndex(int i)
        {
            int j = size();
            Preconditions.checkElementIndex(i, j);
            return j - 1 - i;
        }

        private int reversePosition(int i)
        {
            int j = size();
            Preconditions.checkPositionIndex(i, j);
            return j - i;
        }

        public void add(int i, Object obj)
        {
            forwardList.add(reversePosition(i), obj);
        }

        public void clear()
        {
            forwardList.clear();
        }

        public Object get(int i)
        {
            return forwardList.get(reverseIndex(i));
        }

        final List getForwardList()
        {
            return forwardList;
        }

        public Iterator iterator()
        {
            return listIterator();
        }

        public ListIterator listIterator(int i)
        {
            i = reversePosition(i);
            return forwardList.listIterator(i). new ListIterator() {

                boolean canRemoveOrSet;
                final ReverseList this$0;
                final ListIterator val$forwardIterator;

                public final void add(Object obj)
                {
                    forwardIterator.add(obj);
                    forwardIterator.previous();
                    canRemoveOrSet = false;
                }

                public final boolean hasNext()
                {
                    return forwardIterator.hasPrevious();
                }

                public final boolean hasPrevious()
                {
                    return forwardIterator.hasNext();
                }

                public final Object next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        canRemoveOrSet = true;
                        return forwardIterator.previous();
                    }
                }

                public final int nextIndex()
                {
                    return reversePosition(forwardIterator.nextIndex());
                }

                public final Object previous()
                {
                    if (!hasPrevious())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        canRemoveOrSet = true;
                        return forwardIterator.next();
                    }
                }

                public final int previousIndex()
                {
                    return nextIndex() - 1;
                }

                public final void remove()
                {
                    CollectPreconditions.checkRemove(canRemoveOrSet);
                    forwardIterator.remove();
                    canRemoveOrSet = false;
                }

                public final void set(Object obj)
                {
                    Preconditions.checkState(canRemoveOrSet);
                    forwardIterator.set(obj);
                }

            
            {
                this$0 = final_reverselist;
                forwardIterator = ListIterator.this;
                super();
            }
            };
        }

        public Object remove(int i)
        {
            return forwardList.remove(reverseIndex(i));
        }

        protected void removeRange(int i, int j)
        {
            subList(i, j).clear();
        }

        public Object set(int i, Object obj)
        {
            return forwardList.set(reverseIndex(i), obj);
        }

        public int size()
        {
            return forwardList.size();
        }

        public List subList(int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, size());
            return Lists.reverse(forwardList.subList(reversePosition(j), reversePosition(i)));
        }


        ReverseList(List list)
        {
            forwardList = (List)Preconditions.checkNotNull(list);
        }
    }

    static final class TransformingRandomAccessList extends AbstractList
        implements Serializable, RandomAccess
    {

        final List fromList;
        final Function function;

        public final void clear()
        {
            fromList.clear();
        }

        public final Object get(int i)
        {
            return function.apply(fromList.get(i));
        }

        public final boolean isEmpty()
        {
            return fromList.isEmpty();
        }

        public final Iterator iterator()
        {
            return listIterator();
        }

        public final ListIterator listIterator(int i)
        {
            return new TransformedListIterator(fromList.listIterator(i)) {

                final TransformingRandomAccessList this$0;

                final Object transform(Object obj)
                {
                    return function.apply(obj);
                }

            
            {
                this$0 = TransformingRandomAccessList.this;
                super(listiterator);
            }
            };
        }

        public final Object remove(int i)
        {
            return function.apply(fromList.remove(i));
        }

        public final int size()
        {
            return fromList.size();
        }

        TransformingRandomAccessList(List list, Function function1)
        {
            fromList = (List)Preconditions.checkNotNull(list);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    static final class TransformingSequentialList extends AbstractSequentialList
        implements Serializable
    {

        final List fromList;
        final Function function;

        public final void clear()
        {
            fromList.clear();
        }

        public final ListIterator listIterator(int i)
        {
            return new TransformedListIterator(fromList.listIterator(i)) {

                final TransformingSequentialList this$0;

                final Object transform(Object obj)
                {
                    return function.apply(obj);
                }

            
            {
                this$0 = TransformingSequentialList.this;
                super(listiterator);
            }
            };
        }

        public final int size()
        {
            return fromList.size();
        }

        TransformingSequentialList(List list, Function function1)
        {
            fromList = (List)Preconditions.checkNotNull(list);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }


    private static int computeArrayListCapacity(int i)
    {
        CollectPreconditions.checkNonnegative(i, "arraySize");
        return Ints.saturatedCast(5L + (long)i + (long)(i / 10));
    }

    static boolean equalsImpl(List list, Object obj)
    {
        if (obj != Preconditions.checkNotNull(list))
        {
            if (!(obj instanceof List))
            {
                return false;
            }
            obj = (List)obj;
            if (list.size() != ((List) (obj)).size() || !Iterators.elementsEqual(list.iterator(), ((List) (obj)).iterator()))
            {
                return false;
            }
        }
        return true;
    }

    static int indexOfImpl(List list, Object obj)
    {
        for (list = list.listIterator(); list.hasNext();)
        {
            if (Objects.equal(obj, list.next()))
            {
                return list.previousIndex();
            }
        }

        return -1;
    }

    static int lastIndexOfImpl(List list, Object obj)
    {
        for (list = list.listIterator(list.size()); list.hasPrevious();)
        {
            if (Objects.equal(obj, list.previous()))
            {
                return list.nextIndex();
            }
        }

        return -1;
    }

    public static ArrayList newArrayList()
    {
        return new ArrayList();
    }

    public static ArrayList newArrayList(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(Collections2.cast(iterable));
        } else
        {
            return newArrayList(iterable.iterator());
        }
    }

    public static ArrayList newArrayList(Iterator iterator)
    {
        ArrayList arraylist = newArrayList();
        Iterators.addAll(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList newArrayList(Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        ArrayList arraylist = new ArrayList(computeArrayListCapacity(aobj.length));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static ArrayList newArrayListWithCapacity(int i)
    {
        CollectPreconditions.checkNonnegative(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList newArrayListWithExpectedSize(int i)
    {
        return new ArrayList(computeArrayListCapacity(i));
    }

    public static LinkedList newLinkedList()
    {
        return new LinkedList();
    }

    public static LinkedList newLinkedList(Iterable iterable)
    {
        LinkedList linkedlist = newLinkedList();
        Iterables.addAll(linkedlist, iterable);
        return linkedlist;
    }

    public static List reverse(List list)
    {
        if (list instanceof ImmutableList)
        {
            return ((ImmutableList)list).reverse();
        }
        if (list instanceof ReverseList)
        {
            return ((ReverseList)list).getForwardList();
        }
        if (list instanceof RandomAccess)
        {
            return new RandomAccessReverseList(list);
        } else
        {
            return new ReverseList(list);
        }
    }

    public static List transform(List list, Function function)
    {
        if (list instanceof RandomAccess)
        {
            return new TransformingRandomAccessList(list, function);
        } else
        {
            return new TransformingSequentialList(list, function);
        }
    }
}
