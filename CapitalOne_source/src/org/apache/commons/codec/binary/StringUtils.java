// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.apache.commons.codec.Charsets;

public class StringUtils
{

    public StringUtils()
    {
    }

    private static byte[] getBytes(String s, Charset charset)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.getBytes(charset);
        }
    }

    public static byte[] getBytesIso8859_1(String s)
    {
        return getBytes(s, Charsets.ISO_8859_1);
    }

    public static byte[] getBytesUnchecked(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = s.getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw newIllegalStateException(s1, s);
        }
        return s;
    }

    public static byte[] getBytesUsAscii(String s)
    {
        return getBytes(s, Charsets.US_ASCII);
    }

    public static byte[] getBytesUtf16(String s)
    {
        return getBytes(s, Charsets.UTF_16);
    }

    public static byte[] getBytesUtf16Be(String s)
    {
        return getBytes(s, Charsets.UTF_16BE);
    }

    public static byte[] getBytesUtf16Le(String s)
    {
        return getBytes(s, Charsets.UTF_16LE);
    }

    public static byte[] getBytesUtf8(String s)
    {
        return getBytes(s, Charsets.UTF_8);
    }

    private static IllegalStateException newIllegalStateException(String s, UnsupportedEncodingException unsupportedencodingexception)
    {
        return new IllegalStateException((new StringBuilder()).append(s).append(": ").append(unsupportedencodingexception).toString());
    }

    public static String newString(byte abyte0[], String s)
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new String(abyte0, s);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw newIllegalStateException(s, abyte0);
        }
        return abyte0;
    }

    private static String newString(byte abyte0[], Charset charset)
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return new String(abyte0, charset);
        }
    }

    public static String newStringIso8859_1(byte abyte0[])
    {
        return new String(abyte0, Charsets.ISO_8859_1);
    }

    public static String newStringUsAscii(byte abyte0[])
    {
        return new String(abyte0, Charsets.US_ASCII);
    }

    public static String newStringUtf16(byte abyte0[])
    {
        return new String(abyte0, Charsets.UTF_16);
    }

    public static String newStringUtf16Be(byte abyte0[])
    {
        return new String(abyte0, Charsets.UTF_16BE);
    }

    public static String newStringUtf16Le(byte abyte0[])
    {
        return new String(abyte0, Charsets.UTF_16LE);
    }

    public static String newStringUtf8(byte abyte0[])
    {
        return newString(abyte0, Charsets.UTF_8);
    }
}
