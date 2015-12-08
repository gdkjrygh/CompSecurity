// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.soundcloud.java.collections:
//            MoreCollections, Iterators, Iterables, RandomAccessPartition, 
//            Partition, ReverseList, RandomAccessReverseList, TransformingRandomAccessList, 
//            TransformingSequentialList

public final class Lists
{

    private Lists()
    {
    }

    static List cast(Iterable iterable)
    {
        return (List)iterable;
    }

    public static ArrayList newArrayList(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(MoreCollections.cast(iterable));
        } else
        {
            return newArrayList(iterable.iterator());
        }
    }

    public static ArrayList newArrayList(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        Iterators.addAll(arraylist, iterator);
        return arraylist;
    }

    public static ArrayList newArrayList(int ai[])
    {
        ArrayList arraylist = new ArrayList(ai.length);
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Integer.valueOf(ai[i]));
        }

        return arraylist;
    }

    public static transient ArrayList newArrayList(Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        ArrayList arraylist = new ArrayList(aobj.length);
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static LinkedList newLinkedList(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        Iterables.addAll(linkedlist, iterable);
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
