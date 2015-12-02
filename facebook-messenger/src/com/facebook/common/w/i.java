// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class i
{

    static final byte a[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };

    public i()
    {
    }

    public static String a(String s)
    {
        try
        {
            s = a(s.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static String a(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.update(abyte0, 0, abyte0.length);
            abyte0 = d(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    public static String b(String s)
    {
        try
        {
            s = c(s.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static String b(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
            messagedigest.update(abyte0, 0, abyte0.length);
            abyte0 = Base64.encodeToString(messagedigest.digest(), 11);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    public static String c(byte abyte0[])
    {
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(abyte0, 0, abyte0.length);
            abyte0 = d(messagedigest.digest());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    private static String d(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length);
        int k = abyte0.length;
        for (int j = 0; j < k; j++)
        {
            int l = abyte0[j] & 0xff;
            stringbuilder.append((char)a[l >>> 4]);
            stringbuilder.append((char)a[l & 0xf]);
        }

        return stringbuilder.toString();
    }

}
