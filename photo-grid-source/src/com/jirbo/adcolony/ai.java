// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.security.MessageDigest;

class ai
{

    ai()
    {
    }

    public static String a(String s)
    {
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        messagedigest.update(s.getBytes("iso-8859-1"), 0, s.length());
        return a(messagedigest.digest());
    }

    private static String a(byte abyte0[])
    {
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder();
        l = abyte0.length;
        i = 0;
_L2:
        int j;
        int k;
        byte byte0;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = abyte0[i];
        j = byte0 >>> 4 & 0xf;
        k = 0;
_L3:
        char c;
        if (j >= 0 && j <= 9)
        {
            c = (char)(j + 48);
        } else
        {
            c = (char)((j - 10) + 97);
        }
        stringbuilder.append(c);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        k++;
        j = byte0 & 0xf;
          goto _L3
    }
}
