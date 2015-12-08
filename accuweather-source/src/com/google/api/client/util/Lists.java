// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.api.client.util:
//            Collections2

public final class Lists
{

    private Lists()
    {
    }

    public static ArrayList newArrayList()
    {
        return new ArrayList();
    }

    public static ArrayList newArrayList(Iterable iterable)
    {
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
        for (; iterator.hasNext(); arraylist.add(iterator.next())) { }
        return arraylist;
    }

    public static ArrayList newArrayListWithCapacity(int i)
    {
        return new ArrayList(i);
    }
}
