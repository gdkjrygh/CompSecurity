// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Platform

public final class ObjectArrays
{

    private ObjectArrays()
    {
    }

    private static Object[] arraysCopyOf(Object aobj[], int i)
    {
        Object aobj1[] = newArray(aobj, i);
        Platform.unsafeArrayCopy(aobj, 0, aobj1, 0, Math.min(aobj.length, i));
        return aobj1;
    }

    public static Object[] concat(Object obj, Object aobj[])
    {
        Object aobj1[] = newArray(aobj, aobj.length + 1);
        aobj1[0] = obj;
        Platform.unsafeArrayCopy(aobj, 0, aobj1, 1, aobj.length);
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object obj)
    {
        Object aobj1[] = arraysCopyOf(aobj, aobj.length + 1);
        aobj1[aobj.length] = obj;
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object aobj1[], Class class1)
    {
        class1 = ((Class) (newArray(class1, aobj.length + aobj1.length)));
        Platform.unsafeArrayCopy(aobj, 0, class1, 0, aobj.length);
        Platform.unsafeArrayCopy(aobj1, 0, class1, aobj.length, aobj1.length);
        return class1;
    }

    private static Object[] fillArray(Iterable iterable, Object aobj[])
    {
        int i = 0;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            aobj[i] = iterable.next();
            i++;
        }

        return aobj;
    }

    public static Object[] newArray(Class class1, int i)
    {
        return Platform.newArray(class1, i);
    }

    public static Object[] newArray(Object aobj[], int i)
    {
        return Platform.newArray(aobj, i);
    }

    static void swap(Object aobj[], int i, int j)
    {
        Object obj = aobj[i];
        aobj[i] = aobj[j];
        aobj[j] = obj;
    }

    static Object[] toArrayImpl(Collection collection)
    {
        return fillArray(collection, new Object[collection.size()]);
    }

    static Object[] toArrayImpl(Collection collection, Object aobj[])
    {
        int i = collection.size();
        Object aobj1[] = aobj;
        if (aobj.length < i)
        {
            aobj1 = newArray(aobj, i);
        }
        fillArray(collection, aobj1);
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        return aobj1;
    }
}
