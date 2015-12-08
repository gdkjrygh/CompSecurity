// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class k
{

    private static final byte a[] = "qwertyuiopasdfghjklzxcvbnmqwsadf".getBytes();
    private static long b[];

    public k()
    {
    }

    public static String a(String s, char c, int i)
    {
        return String.format((new StringBuilder()).append("%-").append(i).append("s").toString(), new Object[] {
            s
        }).replace(' ', c);
    }

    public static String a(Collection collection)
    {
        collection = collection.iterator();
        int i;
        for (i = 1; collection.hasNext(); i = ((String)collection.next()).hashCode() + i * 31) { }
        return String.valueOf(i);
    }

    public static String a(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(list.get(i).toString());
            if (i < list.size() - 1)
            {
                stringbuilder.append(s);
            }
        }

        return stringbuilder.toString();
    }

    public static String a(Object aobj[], String s)
    {
        StringBuilder stringbuilder = new StringBuilder("");
        for (int i = 0; i < aobj.length; i++)
        {
            stringbuilder.append(aobj[i].toString());
            if (i < aobj.length - 1)
            {
                stringbuilder.append(s);
            }
        }

        return stringbuilder.toString();
    }

    static 
    {
        b = new long[256];
        for (int i = 0; i < 256; i++)
        {
            long l = i;
            int j = 0;
            while (j < 8) 
            {
                long l1;
                if (((int)l & 1) != 0)
                {
                    l1 = 0x95ac9329ac4bc9b5L;
                } else
                {
                    l1 = 0L;
                }
                l = l >> 1 ^ l1;
                j++;
            }
            b[i] = l;
        }

    }
}
