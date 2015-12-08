// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;


final class r
{

    r()
    {
    }

    public static boolean a(String s)
    {
        return s != null && !s.equals("");
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        s = s.toCharArray();
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return stringbuilder.toString();
            }
            char c = s[i];
            if (c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || ":-_.!~*'()/&=?@#$,;+".indexOf(c) != -1)
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append((new StringBuilder("%")).append(Integer.toHexString(c)).toString());
            }
            i++;
        } while (true);
    }
}
