// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class c
{

    private static char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static String a(String s)
    {
        StringBuffer stringbuffer;
        int i;
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("String to encript cannot be null or zero length");
        }
        stringbuffer = new StringBuffer();
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            s = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder()).append(s).toString());
        }
        i = 0;
_L2:
        if (i >= s.length)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if ((s[i] & 0xff) >= 16)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        stringbuffer.append((new StringBuilder("0")).append(Integer.toHexString(s[i] & 0xff)).toString());
        break MISSING_BLOCK_LABEL_147;
        stringbuffer.append(Integer.toHexString(s[i] & 0xff));
        break MISSING_BLOCK_LABEL_147;
        return stringbuffer.toString();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            stringbuilder.append(a[(abyte0[i] & 0xf0) >>> 4]);
            stringbuilder.append(a[abyte0[i] & 0xf]);
        }

        return stringbuilder.toString();
    }

    public static String b(String s)
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            s = a(messagedigest.digest()).toLowerCase();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

}
