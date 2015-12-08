// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.lang.reflect.Array;

public final class j
{

    static final Object a[] = new Object[0];

    static Object a(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("at index ")).append(i).toString());
        } else
        {
            return obj;
        }
    }

    static transient Object[] a(Object aobj[])
    {
        return c(aobj, aobj.length);
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

    static Object[] c(Object aobj[], int i)
    {
        for (int k = 0; k < i; k++)
        {
            a(aobj[k], k);
        }

        return aobj;
    }

}
