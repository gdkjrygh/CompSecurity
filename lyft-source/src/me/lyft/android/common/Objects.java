// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


public class Objects
{

    public Objects()
    {
    }

    public static boolean equals(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj == obj1;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static Object firstNonNull(Object obj, Object obj1)
    {
        if (obj != null)
        {
            return obj;
        }
        if (obj1 == null)
        {
            throw new NullPointerException("All items are null");
        } else
        {
            return obj1;
        }
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

        throw new NullPointerException("All items are null");
    }
}
