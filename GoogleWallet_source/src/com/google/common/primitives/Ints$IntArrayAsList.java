// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.primitives:
//            Ints

static final class end extends AbstractList
    implements Serializable, RandomAccess
{

    final int array[];
    final int end;
    final int start;

    private Integer get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Integer.valueOf(array[start + i]);
    }

    private Integer set(int i, Integer integer)
    {
        Preconditions.checkElementIndex(i, size());
        int j = array[start + i];
        array[start + i] = ((Integer)Preconditions.checkNotNull(integer)).intValue();
        return Integer.valueOf(j);
    }

    public final boolean contains(Object obj)
    {
        return (obj instanceof Integer) && Ints.access$000(array, ((Integer)obj).intValue(), start, end) != -1;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof end)
            {
                obj = (end)obj;
                int j = size();
                if (((size) (obj)).size() != j)
                {
                    return false;
                }
                int i = 0;
                while (i < j) 
                {
                    if (array[start + i] != ((start) (obj)).array[((array) (obj)).start + i])
                    {
                        return false;
                    }
                    i++;
                }
            } else
            {
                return super.equals(obj);
            }
        }
        return true;
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final int hashCode()
    {
        int j = 1;
        for (int i = start; i < end; i++)
        {
            j = j * 31 + Ints.hashCode(array[i]);
        }

        return j;
    }

    public final int indexOf(Object obj)
    {
        if (obj instanceof Integer)
        {
            int i = Ints.access$000(array, ((Integer)obj).intValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final int lastIndexOf(Object obj)
    {
        if (obj instanceof Integer)
        {
            int i = Ints.access$100(array, ((Integer)obj).intValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public final volatile Object set(int i, Object obj)
    {
        return set(i, (Integer)obj);
    }

    public final int size()
    {
        return end - start;
    }

    public final List subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        if (i == j)
        {
            return Collections.emptyList();
        } else
        {
            return new <init>(array, start + i, start + j);
        }
    }

    final int[] toIntArray()
    {
        int i = size();
        int ai[] = new int[i];
        System.arraycopy(array, start, ai, 0, i);
        return ai;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 5);
        stringbuilder.append('[').append(array[start]);
        for (int i = start + 1; i < end; i++)
        {
            stringbuilder.append(", ").append(array[i]);
        }

        return stringbuilder.append(']').toString();
    }

    (int ai[])
    {
        this(ai, 0, ai.length);
    }

    private <init>(int ai[], int i, int j)
    {
        array = ai;
        start = i;
        end = j;
    }
}
