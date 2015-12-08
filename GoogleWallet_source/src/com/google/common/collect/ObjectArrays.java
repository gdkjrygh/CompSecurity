// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.reflect.Array;

// Referenced classes of package com.google.common.collect:
//            Platform

public final class ObjectArrays
{

    static final Object EMPTY_ARRAY[] = new Object[0];

    static Object[] arraysCopyOf(Object aobj[], int i)
    {
        Object aobj1[] = newArray(aobj, i);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, Math.min(aobj.length, i));
        return aobj1;
    }

    static Object checkElementNotNull(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("at index ")).append(i).toString());
        } else
        {
            return obj;
        }
    }

    static transient Object[] checkElementsNotNull(Object aobj[])
    {
        return checkElementsNotNull(aobj, aobj.length);
    }

    private static Object[] checkElementsNotNull(Object aobj[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            checkElementNotNull(aobj[j], j);
        }

        return aobj;
    }

    public static Object[] concat(Object aobj[], Object obj)
    {
        Object aobj1[] = arraysCopyOf(aobj, aobj.length + 1);
        aobj1[aobj.length] = obj;
        return aobj1;
    }

    public static Object[] newArray(Class class1, int i)
    {
        return (Object[])Array.newInstance(class1, i);
    }

    public static Object[] newArray(Object aobj[], int i)
    {
        return Platform.newArray(aobj, i);
    }

}
