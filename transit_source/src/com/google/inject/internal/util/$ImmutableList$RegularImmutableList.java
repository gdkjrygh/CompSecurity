// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableList, $Preconditions, $Iterators, $ObjectArrays, 
//            $UnmodifiableIterator

private static final class <init> extends $ImmutableList
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
        if (!(obj instanceof offset))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (offset)obj;
        int j = ((offset) (obj)).offset;
        while (j < ((offset) (obj)).offset + ((offset) (obj)).size) 
        {
            if (!array[i].equals(((array) (obj)).array[j]))
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

    public ListIterator listIterator(final int start)
    {
        $Preconditions.checkPositionIndex(start, size);
        return new ListIterator() {

            int index;
            final .ImmutableList.RegularImmutableList this$0;
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
                this$0 = .ImmutableList.RegularImmutableList.this;
                start = i;
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
            return new <init>(array, offset + i, j - i);
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


    private _cls1.val.start(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private <init>(Object aobj[], int i, int j)
    {
        super(null);
        offset = i;
        size = j;
        array = aobj;
    }

    array(Object aobj[], int i, int j, array array1)
    {
        this(aobj, i, j);
    }

    <init>(Object aobj[], <init> <init>1)
    {
        this(aobj);
    }
}
