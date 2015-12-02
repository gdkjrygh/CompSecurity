// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;

import java.lang.reflect.Array;

public class a
{

    static final boolean a;

    private a()
    {
    }

    public static Object[] a(Object aobj[], int i)
    {
        if (aobj == null)
        {
            throw new NullPointerException();
        }
        if (i < 0)
        {
            throw new NegativeArraySizeException();
        } else
        {
            return a(aobj, 0, i);
        }
    }

    public static Object[] a(Object aobj[], int i, int j)
    {
        int k = aobj.length;
        if (i > j)
        {
            throw new IllegalArgumentException();
        }
        if (i < 0 || i > k)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            j -= i;
            k = Math.min(j, k - i);
            Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
            System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), 0, k);
            return aobj1;
        }
    }

    static 
    {
        boolean flag;
        if (!com/android/core/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
