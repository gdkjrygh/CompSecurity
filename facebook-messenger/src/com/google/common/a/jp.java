// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            js

public final class jp
{

    private jp()
    {
    }

    private static Object[] a(Iterable iterable, Object aobj[])
    {
        int i = 0;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            aobj[i] = iterable.next();
            i++;
        }

        return aobj;
    }

    static Object[] a(Collection collection)
    {
        return a(((Iterable) (collection)), new Object[collection.size()]);
    }

    static Object[] a(Collection collection, Object aobj[])
    {
        int i = collection.size();
        Object aobj1[] = aobj;
        if (aobj.length < i)
        {
            aobj1 = a(aobj, i);
        }
        a(((Iterable) (collection)), aobj1);
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        return aobj1;
    }

    public static Object[] a(Object aobj[], int i)
    {
        return js.a(aobj, i);
    }
}
