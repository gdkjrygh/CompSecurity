// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


public class StringUtils
{

    public StringUtils()
    {
    }

    public static boolean questionMarkMatch(String s, String s1)
    {
        int i;
        int j;
        j = s.length();
        if (j != s1.length())
        {
            return false;
        }
        i = 0;
_L2:
        char c;
        if (i >= j)
        {
            return true;
        }
        c = s1.charAt(i);
          goto _L1
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c == '?' || c == s.charAt(i)) goto _L4; else goto _L3
_L3:
        return false;
    }
}
