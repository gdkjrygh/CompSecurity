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
//            Iterators, Collections2, ImmutableList, UnmodifiableListIterator, 
//            AbstractIndexedListIterator

public final class Lists
{
    private static class AbstractListWrapper extends AbstractList
    {

        final List backingList;

        public void add(int i, Object obj)
        {
            backingList.add(i, obj);
        }

        public boolean addAll(int i, Collection collection)
        {
            return backingList.addAll(i, collection);
        }

        public boolean contains(Object obj)
        {
            return backingList.contains(obj);
        }

        public Object get(int i)
        {
            return backingList.get(i);
        }

        public Object remove(int i)
        {
            return backingList.remove(i);
        }

        public Object set(int i, Object obj)
        {
            return backingList.set(i, obj);
        }

        public int size()
        {
            return backingList.size();
        }

        AbstractListWrapper(List list)
        {
            backingList = (List)Preconditions.checkNotNull(list);
        }
    }

    private static final class CharSequenceAsList extends AbstractList
    {

        private final CharSequence sequence;

        public boolean contains(Object obj)
        {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof List) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            obj = (List)obj;
            int j = sequence.length();
            if (j == ((List) (obj)).size())
            {
                obj = ((List) (obj)).iterator();
                int i = 0;
label0:
                do
                {
label1:
                    {
                        if (i >= j)
                        {
                            break label1;
                        }
                        Object obj1 = ((Iterator) (obj)).next();
                        if (!(obj1 instanceof Character) || ((Character)obj1).charValue() != sequence.charAt(i))
                        {
                            break label0;
                        }
                        i++;
                    }
                } while (true);
            }
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        public Character get(int i)
        {
            return Character.valueOf(sequence.charAt(i));
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        public int hashCode()
        {
            int j = 1;
            for (int i = 0; i < sequence.length(); i++)
            {
                j = j * 31 + sequence.charAt(i);
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Character)
            {
                char c = ((Character)obj).charValue();
                for (int i = 0; i < sequence.length(); i++)
                {
                    if (sequence.charAt(i) == c)
                    {
                        return i;
                    }
                }

            }
            return -1;
        }

        public int lastIndexOf(Object obj)
        {
            if (obj instanceof Character)
            {
                char c = ((Character)obj).charValue();
                for (int i = sequence.length() - 1; i >= 0; i--)
                {
                    if (sequence.charAt(i) == c)
                    {
                        return i;
                    }
                }

            }
            return -1;
        }

        public int size()
        {
            return sequence.length();
        }

        public List subList(int i, int j)
        {
            return Lists.charactersOf(sequence.subSequence(i, j));
        }

        CharSequenceAsList(CharSequence charsequence)
        {
            sequence = charsequence;
        }
    }

    private static class OnePlusArrayList extends AbstractList
        implements Serializable, RandomAccess
    {

        private static final long serialVersionUID = 0L;
        final Object first;
        final Object rest[];

        public Object get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            if (i == 0)
            {
                return first;
            } else
            {
                return rest[i - 1];
            }
        }

        public int size()
        {
            return rest.length + 1;
        }

        OnePlusArrayList(Object obj, Object aobj[])
        {
            first = obj;
            rest = (Object[])Preconditions.checkNotNull(((Object) (aobj)));
        }
    }

    private static class Partition extends AbstractList
    {

        final List list;
        final int size;

        public volatile Object get(int i)
        {
            return get(i);
        }

        public List get(int i)
        {
            Preconditions.checkElementIndex(i, size());
            i *= size;
            int j = Math.min(size + i, list.size());
            return list.subList(i, j);
        }

        public boolean isEmpty()
        {
            return list.isEmpty();
        }

        public int size()
        {
            return ((list.size() + size) - 1) / size;
        }

        Partition(List list1, int i)
        {
            list = list1;
            size = i;
        }
    }

    private static class RandomAccessListWrapper extends AbstractListWrapper
        implements RandomAccess
    {

        RandomAccessListWrapper(List list)
        {
            super(list);
        }
    }

    private static class RandomAccessPartition extends Partition
        implements RandomAccess
    {

        RandomAccessPartition(List list, int i)
        {
            super(list, i);
        }
    }

    private static class RandomAccessReverseList extends ReverseList
        implements RandomAccess
    {

        RandomAccessReverseList(List list)
        {
            super(list);
        }
    }

    private static class ReverseList extends AbstractList
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

        public boolean contains(Object obj)
        {
            return forwardList.contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return forwardList.containsAll(collection);
        }

        public Object get(int i)
        {
            return forwardList.get(reverseIndex(i));
        }

        List getForwardList()
        {
            return forwardList;
        }

        public int indexOf(Object obj)
        {
            int i = forwardList.lastIndexOf(obj);
            if (i >= 0)
            {
                return reverseIndex(i);
            } else
            {
                return -1;
            }
        }

        public boolean isEmpty()
        {
            return forwardList.isEmpty();
        }

        public Iterator iterator()
        {
            return listIterator();
        }

        public int lastIndexOf(Object obj)
        {
            int i = forwardList.indexOf(obj);
            if (i >= 0)
            {
                return reverseIndex(i);
            } else
            {
                return -1;
            }
        }

        public ListIterator listIterator(int i)
        {
            i = reversePosition(i);
            return forwardList.listIterator(i). new ListIterator() {

                boolean canRemove;
                boolean canSet;
                final ReverseList this$0;
                final ListIterator val$forwardIterator;

                public void add(Object obj)
                {
                    forwardIterator.add(obj);
                    forwardIterator.previous();
                    canRemove = false;
                    canSet = false;
                }

                public boolean hasNext()
                {
                    return forwardIterator.hasPrevious();
                }

                public boolean hasPrevious()
                {
                    return forwardIterator.hasNext();
                }

                public Object next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        canRemove = true;
                        canSet = true;
                        return forwardIterator.previous();
                    }
                }

                public int nextIndex()
                {
                    return reversePosition(forwardIterator.nextIndex());
                }

                public Object previous()
                {
                    if (!hasPrevious())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        canRemove = true;
                        canSet = true;
                        return forwardIterator.next();
                    }
                }

                public int previousIndex()
                {
                    return nextIndex() - 1;
                }

                public void remove()
                {
                    Preconditions.checkState(canRemove);
                    forwardIterator.remove();
                    canSet = false;
                    canRemove = false;
                }

                public void set(Object obj)
                {
                    Preconditions.checkState(canSet);
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

    private static final class StringAsImmutableList extends ImmutableList
    {

        int hash;
        private final String string;

        public boolean contains(Object obj)
        {
            return indexOf(obj) >= 0;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof List) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            obj = (List)obj;
            int j = string.length();
            if (j == ((List) (obj)).size())
            {
                obj = ((List) (obj)).iterator();
                int i = 0;
label0:
                do
                {
label1:
                    {
                        if (i >= j)
                        {
                            break label1;
                        }
                        Object obj1 = ((Iterator) (obj)).next();
                        if (!(obj1 instanceof Character) || ((Character)obj1).charValue() != string.charAt(i))
                        {
                            break label0;
                        }
                        i++;
                    }
                } while (true);
            }
            if (true) goto _L1; else goto _L3
_L3:
            return true;
        }

        public Character get(int i)
        {
            return Character.valueOf(string.charAt(i));
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        public int hashCode()
        {
            int j = hash;
            int i = j;
            if (j == 0)
            {
                i = 1;
                for (int k = 0; k < string.length(); k++)
                {
                    i = i * 31 + string.charAt(k);
                }

                hash = i;
            }
            return i;
        }

        public int indexOf(Object obj)
        {
            if (obj instanceof Character)
            {
                return string.indexOf(((Character)obj).charValue());
            } else
            {
                return -1;
            }
        }

        boolean isPartialView()
        {
            return false;
        }

        public int lastIndexOf(Object obj)
        {
            if (obj instanceof Character)
            {
                return string.lastIndexOf(((Character)obj).charValue());
            } else
            {
                return -1;
            }
        }

        public UnmodifiableListIterator listIterator(int i)
        {
            return new AbstractIndexedListIterator(size(), i) {

                final StringAsImmutableList this$0;

                protected Character get(int i)
                {
                    return Character.valueOf(string.charAt(i));
                }

                protected volatile Object get(int i)
                {
                    return get(i);
                }

            
            {
                this$0 = StringAsImmutableList.this;
                super(i, j);
            }
            };
        }

        public volatile ListIterator listIterator(int i)
        {
            return listIterator(i);
        }

        public int size()
        {
            return string.length();
        }

        public ImmutableList subList(int i, int j)
        {
            return Lists.charactersOf(string.substring(i, j));
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }


        StringAsImmutableList(String s)
        {
            hash = 0;
            string = s;
        }
    }

    private static class TransformingRandomAccessList extends AbstractList
        implements RandomAccess, Serializable
    {

        private static final long serialVersionUID = 0L;
        final List fromList;
        final Function function;

        public void clear()
        {
            fromList.clear();
        }

        public Object get(int i)
        {
            return function.apply(fromList.get(i));
        }

        public boolean isEmpty()
        {
            return fromList.isEmpty();
        }

        public Object remove(int i)
        {
            return function.apply(fromList.remove(i));
        }

        public int size()
        {
            return fromList.size();
        }

        TransformingRandomAccessList(List list, Function function1)
        {
            fromList = (List)Preconditions.checkNotNull(list);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    private static class TransformingSequentialList extends AbstractSequentialList
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final List fromList;
        final Function function;

        public void clear()
        {
            fromList.clear();
        }

        public ListIterator listIterator(int i)
        {
            return fromList.listIterator(i). new ListIterator() {

                final TransformingSequentialList this$0;
                final ListIterator val$delegate;

                public void add(Object obj)
                {
                    throw new UnsupportedOperationException();
                }

                public boolean hasNext()
                {
                    return delegate.hasNext();
                }

                public boolean hasPrevious()
                {
                    return delegate.hasPrevious();
                }

                public Object next()
                {
                    return function.apply(delegate.next());
                }

                public int nextIndex()
                {
                    return delegate.nextIndex();
                }

                public Object previous()
                {
                    return function.apply(delegate.previous());
                }

                public int previousIndex()
                {
                    return delegate.previousIndex();
                }

                public void remove()
                {
                    delegate.remove();
                }

                public void set(Object obj)
                {
                    throw new UnsupportedOperationException("not supported");
                }

            
            {
                this$0 = final_transformingsequentiallist;
                delegate = ListIterator.this;
                super();
            }
            };
        }

        public int size()
        {
            return fromList.size();
        }

        TransformingSequentialList(List list, Function function1)
        {
            fromList = (List)Preconditions.checkNotNull(list);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }

    private static class TwoPlusArrayList extends AbstractList
        implements Serializable, RandomAccess
    {

        private static final long serialVersionUID = 0L;
        final Object first;
        final Object rest[];
        final Object second;

        public Object get(int i)
        {
            switch (i)
            {
            default:
                Preconditions.checkElementIndex(i, size());
                return rest[i - 2];

            case 0: // '\0'
                return first;

            case 1: // '\001'
                return second;
            }
        }

        public int size()
        {
            return rest.length + 2;
        }

        TwoPlusArrayList(Object obj, Object obj1, Object aobj[])
        {
            first = obj;
            second = obj1;
            rest = (Object[])Preconditions.checkNotNull(((Object) (aobj)));
        }
    }


    private Lists()
    {
    }

    static boolean addAllImpl(List list, int i, Iterable iterable)
    {
        boolean flag = false;
        list = list.listIterator(i);
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            list.add(iterable.next());
            flag = true;
        }

        return flag;
    }

    public static List asList(Object obj, Object obj1, Object aobj[])
    {
        return new TwoPlusArrayList(obj, obj1, aobj);
    }

    public static List asList(Object obj, Object aobj[])
    {
        return new OnePlusArrayList(obj, aobj);
    }

    public static ImmutableList charactersOf(String s)
    {
        return new StringAsImmutableList((String)Preconditions.checkNotNull(s));
    }

    public static List charactersOf(CharSequence charsequence)
    {
        return new CharSequenceAsList((CharSequence)Preconditions.checkNotNull(charsequence));
    }

    static int computeArrayListCapacity(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
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

    static int hashCodeImpl(List list)
    {
        int i = 1;
        list = list.iterator();
        while (list.hasNext()) 
        {
            Object obj = list.next();
            int j;
            if (obj == null)
            {
                j = 0;
            } else
            {
                j = obj.hashCode();
            }
            i = i * 31 + j;
        }
        return i;
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

    static ListIterator listIteratorImpl(List list, int i)
    {
        return (new AbstractListWrapper(list)).listIterator(i);
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
        Preconditions.checkNotNull(iterator);
        ArrayList arraylist = newArrayList();
        for (; iterator.hasNext(); arraylist.add(iterator.next())) { }
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
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
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
        for (iterable = iterable.iterator(); iterable.hasNext(); linkedlist.add(iterable.next())) { }
        return linkedlist;
    }

    public static List partition(List list, int i)
    {
        Preconditions.checkNotNull(list);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (list instanceof RandomAccess)
        {
            return new RandomAccessPartition(list, i);
        } else
        {
            return new Partition(list, i);
        }
    }

    public static List reverse(List list)
    {
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

    static List subListImpl(List list, int i, int j)
    {
        if (list instanceof RandomAccess)
        {
            list = new RandomAccessListWrapper(list) {

                private static final long serialVersionUID = 0L;

                public ListIterator listIterator(int k)
                {
                    return backingList.listIterator(k);
                }

            };
        } else
        {
            list = new AbstractListWrapper(list) {

                private static final long serialVersionUID = 0L;

                public ListIterator listIterator(int k)
                {
                    return backingList.listIterator(k);
                }

            };
        }
        return list.subList(i, j);
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
