// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, ObjectArrays, Collections2, 
//            UnmodifiableIterator, UnmodifiableListIterator, AbstractIndexedListIterator

class RegularImmutableList extends ImmutableList
{

    private final transient Object array[];
    private final transient int offset;
    private final transient int size;

    RegularImmutableList(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    RegularImmutableList(Object aobj[], int i, int j)
    {
        offset = i;
        size = j;
        array = aobj;
    }

    Object[] array()
    {
        return array;
    }

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
        Preconditions.checkElementIndex(i, size);
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

    boolean isPartialView()
    {
        return offset != 0 || size != array.length;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.forArray(array, offset, size);
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

    public UnmodifiableListIterator listIterator(int i)
    {
        return new AbstractIndexedListIterator(size, i) {

            final RegularImmutableList this$0;

            protected Object get(int j)
            {
                return array[offset + j];
            }

            
            {
                this$0 = RegularImmutableList.this;
                super(i, j);
            }
        };
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    int offset()
    {
        return offset;
    }

    public int size()
    {
        return size;
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size);
        if (i == j)
        {
            return ImmutableList.of();
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
        Object aobj1[] = ObjectArrays.newArray(aobj, size);
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
        StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(size()).append('[').append(array[offset]);
        for (int i = offset + 1; i < offset + size; i++)
        {
            stringbuilder.append(", ").append(array[i]);
        }

        return stringbuilder.append(']').toString();
    }


}
