// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions

public final class $Lists
{

    private $Lists()
    {
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
        $Preconditions.checkArgument(flag);
        return (int)Math.min(5L + (long)i + (long)(i / 10), 0x7fffffffL);
    }

    public static ArrayList newArrayList()
    {
        return new ArrayList();
    }

    public static ArrayList newArrayList(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new ArrayList((Collection)iterable);
        } else
        {
            return newArrayList(iterable.iterator());
        }
    }

    public static ArrayList newArrayList(Object obj, Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length + 1);
        arraylist.add(obj);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static ArrayList newArrayList(Iterator iterator)
    {
        ArrayList arraylist = newArrayList();
        for (; iterator.hasNext(); arraylist.add(iterator.next())) { }
        return arraylist;
    }

    public static transient ArrayList newArrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(computeArrayListCapacity(aobj.length));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }
}
