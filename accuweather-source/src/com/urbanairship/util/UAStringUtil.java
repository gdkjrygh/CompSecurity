// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.util;

import java.util.Collection;
import java.util.Iterator;

public abstract class UAStringUtil
{

    public UAStringUtil()
    {
    }

    public static boolean equals(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String join(Collection collection, String s)
    {
        if (collection == null || s == null)
        {
            throw new IllegalArgumentException("Collections and delimiters given to join cannot be null!");
        }
        StringBuilder stringbuilder = new StringBuilder("");
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append((String)collection.next());
            if (collection.hasNext())
            {
                stringbuilder.append(s);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String repeat(String s, int i, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < i; j++)
        {
            stringbuilder.append(s);
            if (j + 1 != i)
            {
                stringbuilder.append(s1);
            }
        }

        return stringbuilder.toString();
    }
}
