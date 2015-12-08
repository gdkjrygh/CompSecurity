// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection, $Lists, $UnmodifiableIterator, $Preconditions, 
//            $Iterators, $ObjectArrays

public abstract class $ImmutableList extends $ImmutableCollection
    implements List, RandomAccess
{
    public static class Builder
    {

        private final ArrayList contents = $Lists.newArrayList();

        public Builder add(Object obj)
        {
            $Preconditions.checkNotNull(obj, "element cannot be null");
            contents.add(obj);
            return this;
        }

        public Builder addAll(Iterable iterable)
        {
            if (iterable instanceof Collection)
            {
                Collection collection = (Collection)iterable;
                contents.ensureCapacity(contents.size() + collection.size());
            }
            Object obj;
            for (iterable = iterable.iterator(); iterable.hasNext(); contents.add(obj))
            {
                obj = iterable.next();
                $Preconditions.checkNotNull(obj, "elements contains a null");
            }

            return this;
        }

        public $ImmutableList build()
        {
            return $ImmutableList.copyOf(contents);
        }

        public Builder()
        {
        }
    }

    private static final class EmptyImmutableList extends $ImmutableList
    {

        private static final Object EMPTY_ARRAY[] = new Object[0];

        public boolean contains(Object obj)
        {
            return false;
        }

        public boolean containsAll(Collection collection)
        {
            return collection.isEmpty();
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof List)
            {
                return ((List)obj).isEmpty();
            } else
            {
                return false;
            }
        }

        public Object get(int i)
        {
            $Preconditions.checkElementIndex(i, 0);
            throw new AssertionError("unreachable");
        }

        public int hashCode()
        {
            return 1;
        }

        public int indexOf(Object obj)
        {
            return -1;
        }

        public boolean isEmpty()
        {
            return true;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.emptyIterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int lastIndexOf(Object obj)
        {
            return -1;
        }

        public ListIterator listIterator()
        {
            return $Iterators.emptyListIterator();
        }

        public ListIterator listIterator(int i)
        {
            $Preconditions.checkPositionIndex(i, 0);
            return $Iterators.emptyListIterator();
        }

        public int size()
        {
            return 0;
        }

        public $ImmutableList subList(int i, int j)
        {
            $Preconditions.checkPositionIndexes(i, j, 0);
            return this;
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }

        public Object[] toArray()
        {
            return EMPTY_ARRAY;
        }

        public Object[] toArray(Object aobj[])
        {
            if (aobj.length > 0)
            {
                aobj[0] = null;
            }
            return aobj;
        }

        public String toString()
        {
            return "[]";
        }


        private EmptyImmutableList()
        {
        }

    }

    private static final class RegularImmutableList extends $ImmutableList
    {

        private final Object array[];
        private final int offset;
        private final int size;

        public boolean contains(Object obj)
        {
            return indexOf(obj) != -1;
        }

        public boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            List list;
            int i;
            if (!(obj instanceof List))
            {
                return false;
            }
            list = (List)obj;
            if (size() != list.size())
            {
                return false;
            }
            i = offset;
            if (!(obj instanceof RegularImmutableList))
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (RegularImmutableList)obj;
            int j = ((RegularImmutableList) (obj)).offset;
            while (j < ((RegularImmutableList) (obj)).offset + ((RegularImmutableList) (obj)).size) 
            {
                if (!array[i].equals(((RegularImmutableList) (obj)).array[j]))
                {
                    return false;
                }
                j++;
                i++;
            }
            if (true) goto _L1; else goto _L3
_L3:
            obj = list.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = ((Iterator) (obj)).next();
                if (!array[i].equals(obj1))
                {
                    return false;
                }
                i++;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public Object get(int i)
        {
            $Preconditions.checkElementIndex(i, size);
            return array[offset + i];
        }

        public int hashCode()
        {
            int j = 1;
            for (int i = offset; i < offset + size; i++)
            {
                j = j * 31 + array[i].hashCode();
            }

            return j;
        }

        public int indexOf(Object obj)
        {
            if (obj != null)
            {
                for (int i = offset; i < offset + size; i++)
                {
                    if (array[i].equals(obj))
                    {
                        return i - offset;
                    }
                }

            }
            return -1;
        }

        public boolean isEmpty()
        {
            return false;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.forArray(array, offset, size);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int lastIndexOf(Object obj)
        {
            if (obj != null)
            {
                for (int i = (offset + size) - 1; i >= offset; i--)
                {
                    if (array[i].equals(obj))
                    {
                        return i - offset;
                    }
                }

            }
            return -1;
        }

        public ListIterator listIterator()
        {
            return listIterator(0);
        }

        public ListIterator listIterator(int i)
        {
            $Preconditions.checkPositionIndex(i, size);
            return i. new ListIterator() {

                int index;
                final RegularImmutableList this$0;
                final int val$start;

                public void add(Object obj)
                {
                    throw new UnsupportedOperationException();
                }

                public boolean hasNext()
                {
                    return index < size;
                }

                public boolean hasPrevious()
                {
                    return index > 0;
                }

                public Object next()
                {
                    Object obj;
                    try
                    {
                        obj = get(index);
                    }
                    catch (IndexOutOfBoundsException indexoutofboundsexception)
                    {
                        throw new NoSuchElementException();
                    }
                    index = index + 1;
                    return obj;
                }

                public int nextIndex()
                {
                    return index;
                }

                public Object previous()
                {
                    Object obj;
                    try
                    {
                        obj = get(index - 1);
                    }
                    catch (IndexOutOfBoundsException indexoutofboundsexception)
                    {
                        throw new NoSuchElementException();
                    }
                    index = index - 1;
                    return obj;
                }

                public int previousIndex()
                {
                    return index - 1;
                }

                public void remove()
                {
                    throw new UnsupportedOperationException();
                }

                public void set(Object obj)
                {
                    throw new UnsupportedOperationException();
                }

            
            {
                this$0 = final_regularimmutablelist;
                start = I.this;
                super();
                index = start;
            }
            };
        }

        public int size()
        {
            return size;
        }

        public $ImmutableList subList(int i, int j)
        {
            $Preconditions.checkPositionIndexes(i, j, size);
            if (i == j)
            {
                return $ImmutableList.of();
            } else
            {
                return new RegularImmutableList(array, offset + i, j - i);
            }
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }

        public Object[] toArray()
        {
            Object aobj[] = new Object[size()];
            System.arraycopy(((Object) (array)), offset, ((Object) (aobj)), 0, size);
            return aobj;
        }

        public Object[] toArray(Object aobj[])
        {
            if (aobj.length >= size) goto _L2; else goto _L1
_L1:
            Object aobj1[] = $ObjectArrays.newArray(aobj, size);
_L4:
            System.arraycopy(((Object) (array)), offset, ((Object) (aobj1)), 0, size);
            return aobj1;
_L2:
            aobj1 = aobj;
            if (aobj.length > size)
            {
                aobj[size] = null;
                aobj1 = aobj;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(size() * 16);
            stringbuilder.append('[').append(array[offset]);
            for (int i = offset + 1; i < offset + size; i++)
            {
                stringbuilder.append(", ").append(array[i]);
            }

            return stringbuilder.append(']').toString();
        }


        private RegularImmutableList(Object aobj[])
        {
            this(aobj, 0, aobj.length);
        }

        private RegularImmutableList(Object aobj[], int i, int j)
        {
            offset = i;
            size = j;
            array = aobj;
        }


    }

    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return $ImmutableList.of(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }


    private static final $ImmutableList EMPTY_IMMUTABLE_LIST = new EmptyImmutableList();

    private $ImmutableList()
    {
    }


    public static Builder builder()
    {
        return new Builder();
    }

    private static transient Object[] copyIntoArray(Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length];
        int k = aobj.length;
        int j = 0;
        for (int i = 0; j < k; i++)
        {
            Object obj = aobj[j];
            if (obj == null)
            {
                throw new NullPointerException((new StringBuilder()).append("at index ").append(i).toString());
            }
            aobj1[i] = obj;
            j++;
        }

        return aobj1;
    }

    public static $ImmutableList copyOf(Iterable iterable)
    {
        if (iterable instanceof $ImmutableList)
        {
            return ($ImmutableList)iterable;
        }
        if (iterable instanceof Collection)
        {
            return copyOfInternal((Collection)iterable);
        } else
        {
            return copyOfInternal($Lists.newArrayList(iterable));
        }
    }

    public static $ImmutableList copyOf(Iterator iterator1)
    {
        return copyOfInternal($Lists.newArrayList(iterator1));
    }

    private static Object[] copyOf(Object aobj[], int i)
    {
        Object aobj1[] = new Object[i];
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, Math.min(aobj.length, i));
        return aobj1;
    }

    private static $ImmutableList copyOfInternal(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            return of();
        } else
        {
            return new RegularImmutableList(nullChecked(arraylist.toArray()));
        }
    }

    private static $ImmutableList copyOfInternal(Collection collection)
    {
        int i = collection.size();
        if (i == 0)
        {
            return of();
        } else
        {
            return createFromIterable(collection, i);
        }
    }

    private static $ImmutableList createFromIterable(Iterable iterable, int i)
    {
        Object aobj[] = new Object[i];
        boolean flag = false;
        Iterator iterator1 = iterable.iterator();
        int j = i;
        i = ((flag) ? 1 : 0);
        iterable = ((Iterable) (aobj));
        while (iterator1.hasNext()) 
        {
            Object obj2 = iterator1.next();
            Object obj = iterable;
            int k = j;
            if (i == j)
            {
                k = (j / 2 + 1) * 3;
                obj = ((Object) (copyOf(iterable, k)));
            }
            if (obj2 == null)
            {
                throw new NullPointerException((new StringBuilder()).append("at index ").append(i).toString());
            }
            obj[i] = obj2;
            i++;
            iterable = ((Iterable) (obj));
            j = k;
        }
        if (i == 0)
        {
            return of();
        }
        Object obj1 = iterable;
        if (i != j)
        {
            obj1 = ((Object) (copyOf(iterable, i)));
        }
        return new RegularImmutableList(((Object []) (obj1)), 0, i);
    }

    private static Object[] nullChecked(Object aobj[])
    {
        int i = 0;
        for (int j = aobj.length; i < j; i++)
        {
            if (aobj[i] == null)
            {
                throw new NullPointerException((new StringBuilder()).append("at index ").append(i).toString());
            }
        }

        return aobj;
    }

    public static $ImmutableList of()
    {
        return EMPTY_IMMUTABLE_LIST;
    }

    public static $ImmutableList of(Object obj)
    {
        return new RegularImmutableList(copyIntoArray(new Object[] {
            obj
        }));
    }

    public static $ImmutableList of(Object obj, Object obj1)
    {
        return new RegularImmutableList(copyIntoArray(new Object[] {
            obj, obj1
        }));
    }

    public static $ImmutableList of(Object obj, Object obj1, Object obj2)
    {
        return new RegularImmutableList(copyIntoArray(new Object[] {
            obj, obj1, obj2
        }));
    }

    public static $ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableList(copyIntoArray(new Object[] {
            obj, obj1, obj2, obj3
        }));
    }

    public static $ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return new RegularImmutableList(copyIntoArray(new Object[] {
            obj, obj1, obj2, obj3, obj4
        }));
    }

    public static transient $ImmutableList of(Object aobj[])
    {
        if (aobj.length == 0)
        {
            return of();
        } else
        {
            return new RegularImmutableList(copyIntoArray(aobj));
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public abstract int indexOf(Object obj);

    public abstract $UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public abstract int lastIndexOf(Object obj);

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public abstract $ImmutableList subList(int i, int j);

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

}
