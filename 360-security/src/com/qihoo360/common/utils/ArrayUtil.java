// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


public class ArrayUtil
{

    public ArrayUtil()
    {
    }

    public static boolean endsWith(byte abyte0[], byte abyte1[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (abyte1 == null) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (abyte0.length < abyte1.length) goto _L2; else goto _L4
_L4:
        int i = 0;
_L9:
        if (i < abyte1.length) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        flag = flag1;
        if (abyte0[abyte0.length - 1 - i] != abyte1[abyte1.length - 1 - i]) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean startsWith(byte abyte0[], byte abyte1[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (abyte1 == null) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (abyte0.length < abyte1.length) goto _L2; else goto _L4
_L4:
        int i = 0;
_L9:
        if (i < abyte1.length) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        flag = flag1;
        if (abyte0[i] != abyte1[i]) goto _L2; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
