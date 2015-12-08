// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller.util;

import android.os.Bundle;

public class OrmmaUtils
{

    private static final String CHAR_SET = "ISO-8859-1";

    public OrmmaUtils()
    {
    }

    public static String byteToHex(byte byte0)
    {
        char ac[] = new char[16];
        char[] _tmp = ac;
        ac[0] = '0';
        ac[1] = '1';
        ac[2] = '2';
        ac[3] = '3';
        ac[4] = '4';
        ac[5] = '5';
        ac[6] = '6';
        ac[7] = '7';
        ac[8] = '8';
        ac[9] = '9';
        ac[10] = 'a';
        ac[11] = 'b';
        ac[12] = 'c';
        ac[13] = 'd';
        ac[14] = 'e';
        ac[15] = 'f';
        return new String(new char[] {
            ac[byte0 >> 4 & 0xf], ac[byte0 & 0xf]
        });
    }

    public static String convert(String s)
    {
        int i;
        StringBuffer stringbuffer;
        try
        {
            s = s.getBytes();
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i = 0;
_L2:
        if (i >= s.length)
        {
            return new String(stringbuffer.toString().getBytes(), "ISO-8859-1");
        }
        if ((s[i] & 0x80) <= 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        stringbuffer.append((new StringBuilder("%")).append(byteToHex(s[i])).toString());
        break MISSING_BLOCK_LABEL_92;
        stringbuffer.append((char)s[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getData(String s, Bundle bundle)
    {
        return bundle.getString(s);
    }
}
