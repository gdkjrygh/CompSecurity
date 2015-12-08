// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class MoreArrays
{

    private MoreArrays()
    {
    }

    public static Object[] concat(Object obj, Object aobj[])
    {
        Object aobj1[] = newArray(aobj, aobj.length + 1);
        aobj1[0] = obj;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, aobj.length);
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object obj)
    {
        Object aobj1[] = Arrays.copyOf(aobj, aobj.length + 1);
        aobj1[aobj.length] = obj;
        return aobj1;
    }

    public static Object[] concat(Object aobj[], Object aobj1[], Class class1)
    {
        class1 = ((Class) (newArray(class1, aobj.length + aobj1.length)));
        System.arraycopy(((Object) (aobj)), 0, class1, 0, aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, class1, aobj.length, aobj1.length);
        return class1;
    }

    public static transient Object firstNonNull(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (obj != null)
            {
                return obj;
            }
        }

        return null;
    }

    public static Object[] newArray(Class class1, int i)
    {
        return (Object[])(Object[])Array.newInstance(class1, i);
    }

    public static Object[] newArray(Object aobj[], int i)
    {
        return (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
    }
}
