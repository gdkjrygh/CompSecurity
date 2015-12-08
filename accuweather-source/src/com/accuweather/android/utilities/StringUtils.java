// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


public class StringUtils
{

    private StringUtils()
    {
    }

    public static String padLeft(String s, char c, int i)
    {
        if (s.length() >= i)
        {
            return s;
        }
        int j = s.length();
        s = new StringBuilder(s);
        for (; j < i; j++)
        {
            s.insert(0, c);
        }

        return s.toString();
    }
}
