// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.lang.reflect.Array;

public final class cm
{

    static final Object a[] = new Object[0];

    static Object a(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder(20)).append("at index ").append(i).toString());
        } else
        {
            return obj;
        }
    }

    static void a(Object aobj[], int i, int j)
    {
        Object obj = aobj[i];
        aobj[i] = aobj[j];
        aobj[j] = obj;
    }

    static transient Object[] a(Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            a(aobj[i], i);
        }

        return aobj;
    }

    public static Object[] a(Object aobj[], int i)
    {
        return (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
    }

    static Object[] b(Object aobj[], int i)
    {
        Object aobj1[] = a(aobj, i);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, Math.min(aobj.length, i));
        return aobj1;
    }

}
