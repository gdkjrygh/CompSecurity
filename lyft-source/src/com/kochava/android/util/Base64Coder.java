// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.util;


public class Base64Coder
{

    private static char a[];
    private static byte b[];

    public static String a(String s)
    {
        return s;
    }

    static 
    {
        char c;
        int i;
        boolean flag;
        flag = false;
        a = new char[64];
        c = 'A';
        i = 0;
_L9:
        if (c <= 'Z') goto _L2; else goto _L1
_L1:
        c = 'a';
_L10:
        if (c <= 'z') goto _L4; else goto _L3
_L3:
        c = '0';
_L11:
        if (c <= '9') goto _L6; else goto _L5
_L5:
        char ac[] = a;
        int j = i + 1;
        ac[i] = '+';
        a[j] = '/';
        b = new byte[128];
        i = 0;
_L12:
        if (i < b.length) goto _L8; else goto _L7
_L7:
        i = ((flag) ? 1 : 0);
_L13:
        if (i >= 64)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_154;
_L2:
        a[i] = c;
        c++;
        i++;
          goto _L9
_L4:
        a[i] = c;
        c++;
        i++;
          goto _L10
_L6:
        a[i] = c;
        c++;
        i++;
          goto _L11
_L8:
        b[i] = -1;
        i++;
          goto _L12
        b[a[i]] = (byte)i;
        i++;
          goto _L13
    }
}
