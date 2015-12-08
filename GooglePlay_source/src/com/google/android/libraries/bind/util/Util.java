// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.util;


public final class Util
{

    private static int memoryClass = -1;

    public static void checkPrecondition(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void checkPrecondition(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }

    public static String getResourceName(int i)
    {
        return Integer.toString(i);
    }

    public static transient int hashCode(Object aobj[])
    {
        int j = 1;
        int i = 0;
        while (i < 2) 
        {
            Object obj = aobj[i];
            int k;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            j = j * 31 + k;
            i++;
        }
        return j;
    }

    public static boolean objectsEqual(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

}
