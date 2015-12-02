// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


public final class Ascii
{

    private Ascii()
    {
    }

    public static boolean isUpperCase(char c)
    {
        return c >= 'A' && c <= 'Z';
    }

    public static char toLowerCase(char c)
    {
        char c1 = c;
        if (isUpperCase(c))
        {
            c1 = (char)(c ^ 0x20);
        }
        return c1;
    }

    public static String toLowerCase(String s)
    {
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(toLowerCase(s.charAt(i)));
        }

        return stringbuilder.toString();
    }
}
