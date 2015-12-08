// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
{

    private static final byte d[] = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
        11, 12, 13, 14, 15, 16
    };
    protected IvParameterSpec a;
    protected SecretKeySpec b;
    private int c;

    public a()
    {
        byte abyte0[];
        byte abyte2[];
        c = 1;
        abyte0 = new byte[16];
        (new SecureRandom()).nextBytes(abyte0);
        a = new IvParameterSpec(abyte0);
        abyte2 = new byte[16];
        abyte0 = null;
        byte abyte1[] = "liebao%^&()@Io=-".getBytes("utf-8");
        abyte0 = abyte1;
_L2:
        for (int i = 0; i < 16 && i < abyte0.length && abyte0 != null; i++)
        {
            abyte2[i] = abyte0[i];
        }

        break; /* Loop/switch isn't completed */
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        unsupportedencodingexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        b = new SecretKeySpec(abyte2, "AES");
        return;
    }

    public String a(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        String s1 = new String((new DecimalFormat("0000")).format(c));
        int i = a.getIV().length;
        int j = s1.getBytes("utf-8").length;
        s = a(s.getBytes("utf-8"));
        int k = s.length;
        byte abyte0[] = new byte[i + j + k];
        System.arraycopy(a.getIV(), 0, abyte0, 0, i);
        System.arraycopy(s1.getBytes("utf-8"), 0, abyte0, i, j);
        System.arraycopy(s, 0, abyte0, i + j, k);
        s = Base64.encodeToString(abyte0, 2);
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    public byte[] a(byte abyte0[])
    {
        try
        {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, b, a);
            abyte0 = cipher.doFinal(abyte0);
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
