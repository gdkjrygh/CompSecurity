// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d
{
    public static interface a
    {

        public abstract byte a(byte byte0, byte byte1);
    }

    public static interface b
    {

        public abstract byte a(byte byte0);
    }


    public d()
    {
    }

    public static int a(Object aobj[], Object obj)
    {
        for (int i = 0; i < aobj.length; i++)
        {
            if (aobj[i] == obj || obj != null && obj.equals(aobj[i]))
            {
                return i;
            }
        }

        return -1;
    }

    public static String a(String s, Collection collection)
    {
        if (collection.size() == 0)
        {
            return "";
        }
        int i = Math.max(0, s.length() * (collection.size() - 1));
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            i = ((Enum)iterator.next()).name().length() + i;
        }

        StringBuilder stringbuilder = new StringBuilder(i);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append(((Enum)collection.next()).name());
            if (collection.hasNext())
            {
                stringbuilder.append(s);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static Collection a(int ai[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(Integer.valueOf(ai[i]));
        }

        return arraylist;
    }

    public static byte[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        return abyte1;
    }

    public static byte[] a(byte abyte0[], int i)
    {
        byte abyte1[];
        if (abyte0.length < i)
        {
            abyte1 = new byte[i];
            for (int j = 0; j < i; j++)
            {
                abyte1[j] = abyte0[j % abyte0.length];
            }

        } else
        {
            abyte1 = abyte0;
            if (abyte0.length > i)
            {
                return Arrays.copyOf(abyte0, i);
            }
        }
        return abyte1;
    }

    public static byte[] a(byte abyte0[], b b1)
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = b1.a(abyte0[i]);
        }

        return abyte0;
    }

    public static int[] a(Collection collection)
    {
        int ai[] = new int[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            ai[i] = ((Integer)collection.next()).intValue();
        }

        return ai;
    }

    public static boolean b(byte abyte0[])
    {
        return abyte0 == null || abyte0.length == 0;
    }
}
