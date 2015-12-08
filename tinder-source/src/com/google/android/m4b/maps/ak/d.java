// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


public final class d
{

    public static long a(String s)
    {
        if (a(s, 16))
        {
            return Long.parseLong(c(s), 16) - 0x8000000000000000L;
        } else
        {
            return Long.parseLong(s, 16);
        }
    }

    private static boolean a(String s, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s.length() == i)
        {
            flag = flag1;
            if (Integer.parseInt(String.valueOf(s.charAt(0)), 16) > 7)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static int b(String s)
    {
        if (a(s, 8))
        {
            return Integer.parseInt(c(s), 16) - 0x80000000;
        } else
        {
            return Integer.parseInt(s, 16);
        }
    }

    private static String c(String s)
    {
        String s1 = String.valueOf(String.valueOf(Integer.parseInt(String.valueOf(s.charAt(0)), 16) - 8));
        s = String.valueOf(s.substring(1));
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }
}
