// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.common;


public class WoblStringUtil
{

    public WoblStringUtil()
    {
    }

    public static String toTitleCase(String s)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        int j = s.length();
        StringBuilder stringbuilder = new StringBuilder(j);
        boolean flag = true;
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (Character.isWhitespace(c))
            {
                stringbuilder.append(c);
                flag = true;
            } else
            if (flag)
            {
                stringbuilder.append(Character.toTitleCase(c));
                flag = false;
            } else
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder.toString();
    }
}
