// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import java.io.UnsupportedEncodingException;

public class a
{

    public a()
    {
    }

    private static IllegalStateException a(String s, UnsupportedEncodingException unsupportedencodingexception)
    {
        return new IllegalStateException((new StringBuilder(String.valueOf(s))).append(": ").append(unsupportedencodingexception).toString());
    }

    public static String a(byte abyte0[])
    {
        return a(abyte0, "ISO-8859-1");
    }

    public static String a(byte abyte0[], String s)
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
            throw a(s, ((UnsupportedEncodingException) (abyte0)));
        }
        return abyte0;
    }

    public static byte[] a(String s)
    {
        return a(s, "ISO-8859-1");
    }

    public static byte[] a(String s, String s1)
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
            throw a(s1, ((UnsupportedEncodingException) (s)));
        }
        return s;
    }

    public static String b(byte abyte0[])
    {
        return a(abyte0, "US-ASCII");
    }

    public static byte[] b(String s)
    {
        return a(s, "US-ASCII");
    }

    public static String c(byte abyte0[])
    {
        return a(abyte0, "UTF-16");
    }

    public static byte[] c(String s)
    {
        return a(s, "UTF-16");
    }

    public static String d(byte abyte0[])
    {
        return a(abyte0, "UTF-16BE");
    }

    public static byte[] d(String s)
    {
        return a(s, "UTF-16BE");
    }

    public static String e(byte abyte0[])
    {
        return a(abyte0, "UTF-16LE");
    }

    public static byte[] e(String s)
    {
        return a(s, "UTF-16LE");
    }

    public static String f(byte abyte0[])
    {
        return a(abyte0, "UTF-8");
    }

    public static byte[] f(String s)
    {
        return a(s, "UTF-8");
    }
}
