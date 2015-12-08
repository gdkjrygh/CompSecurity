// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class e
{

    public static String a(byte abyte0[])
    {
        StringBuilder stringbuilder;
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        stringbuilder = new StringBuilder((abyte0.length * 8) / 5 + 1);
        for (int i = 0; i < abyte0.length; i += 5)
        {
            byte abyte1[] = new byte[8];
            int j = Math.min(abyte0.length - i, 5);
            System.arraycopy(abyte0, i, abyte1, 8 - j - 1, j);
            long l = ByteBuffer.wrap(abyte1).getLong();
            for (j = (j + 1) * 8 - 5; j > 3; j -= 5)
            {
                stringbuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt((int)(l >>> j & 31L)));
            }

        }

        return stringbuilder.toString();
    }

    public static MessageDigest a()
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA256");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        return messagedigest;
    }

    private static Cipher a(String s, Key key, IvParameterSpec ivparameterspec)
    {
        try
        {
            s = Cipher.getInstance(s);
            s.init(2, key, ivparameterspec);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static Mac a(Key key)
    {
        return a(key, "HmacSHA256");
    }

    private static Mac a(Key key, String s)
    {
        try
        {
            s = Mac.getInstance(s);
            s.init(key);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new RuntimeException(key);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new RuntimeException(key);
        }
        return s;
    }

    public static byte[] a(byte abyte0[], byte abyte1[])
        throws IllegalBlockSizeException, BadPaddingException
    {
        return a("AES/CBC/PKCS5Padding", ((Key) (new SecretKeySpec(abyte1, "AES"))), new IvParameterSpec(abyte0, 0, 16)).doFinal(abyte0, 16, abyte0.length - 16);
    }

    public static MessageDigest b()
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException(nosuchalgorithmexception);
        }
        return messagedigest;
    }
}
