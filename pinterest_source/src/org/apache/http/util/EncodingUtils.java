// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.http.Consts;

public final class EncodingUtils
{

    private EncodingUtils()
    {
    }

    public static byte[] getAsciiBytes(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try
        {
            s = s.getBytes(Consts.ASCII.name());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Error("HttpClient requires ASCII support");
        }
        return s;
    }

    public static String getAsciiString(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Parameter may not be null");
        } else
        {
            return getAsciiString(abyte0, 0, abyte0.length);
        }
    }

    public static String getAsciiString(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        try
        {
            abyte0 = new String(abyte0, i, j, Consts.ASCII.name());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new Error("HttpClient requires ASCII support");
        }
        return abyte0;
    }

    public static byte[] getBytes(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("data may not be null");
        }
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        try
        {
            s1 = s.getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s.getBytes();
        }
        return s1;
    }

    public static String getString(byte abyte0[], int i, int j, String s)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Parameter may not be null");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("charset may not be null or empty");
        }
        try
        {
            s = new String(abyte0, i, j, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new String(abyte0, i, j);
        }
        return s;
    }

    public static String getString(byte abyte0[], String s)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Parameter may not be null");
        } else
        {
            return getString(abyte0, 0, abyte0.length, s);
        }
    }
}
