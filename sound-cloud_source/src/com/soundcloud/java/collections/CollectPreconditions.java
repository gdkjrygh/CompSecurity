// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;

public final class CollectPreconditions
{

    private CollectPreconditions()
    {
    }

    public static Object checkElementNotNull(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("at index ")).append(i).toString());
        } else
        {
            return obj;
        }
    }

    public static transient Object[] checkElementsNotNull(Object aobj[])
    {
        return checkElementsNotNull(aobj, aobj.length);
    }

    public static Object[] checkElementsNotNull(Object aobj[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            checkElementNotNull(aobj[j], j);
        }

        return aobj;
    }

    public static void checkIndexNonnegative(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("value (")).append(i).append(") must not be negative").toString());
        } else
        {
            return;
        }
    }

    public static int checkNonnegative(int i, String s)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" cannot be negative but was: ").append(i).toString());
        } else
        {
            return i;
        }
    }

    static void checkRemove(boolean flag)
    {
        Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
    }
}
