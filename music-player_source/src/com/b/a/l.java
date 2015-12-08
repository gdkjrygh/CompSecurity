// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import b.a.fg;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class l
{

    private static final byte a[] = {
        10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 
        1, 6, 8, 12, 13, 91
    };

    public static int a(int i, String s)
    {
        if ((double)(new Random()).nextFloat() >= 0.001D) goto _L2; else goto _L1
_L1:
        if (s == null)
        {
            fg.b("--->", "null signature..");
        }
        i = 0;
        int j = Integer.parseInt(s.substring(9, 11), 16);
        i = j;
_L7:
        i = (i | 0x80) * 1000;
_L4:
        return i;
_L2:
        j = (new Random()).nextInt(i);
        i = j;
        if (j > 0x3e418) goto _L4; else goto _L3
_L3:
        i = j;
        if (j < 0x1f400) goto _L4; else goto _L5
_L5:
        return 0x1f018;
        s;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < abyte0.length; i++)
        {
            stringbuffer.append(String.format("%02X", new Object[] {
                Byte.valueOf(abyte0[i])
            }));
        }

        return stringbuffer.toString().toLowerCase(Locale.US);
    }

    public static byte[] a(String s)
    {
        byte abyte0[] = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        int j;
        return abyte0;
_L2:
        if ((j = s.length()) % 2 != 0)
        {
            continue;
        }
        byte abyte1[] = new byte[j / 2];
        int i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= j)
            {
                continue;
            }
            abyte1[i / 2] = (byte)Integer.valueOf(s.substring(i, i + 2), 16).intValue();
            i += 2;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static byte[] a(byte abyte0[], byte abyte1[])
    {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(abyte1, "AES"), new IvParameterSpec(a));
        return cipher.doFinal(abyte0);
    }

    public static byte[] b(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.reset();
            messagedigest.update(abyte0);
            abyte0 = messagedigest.digest();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

}
