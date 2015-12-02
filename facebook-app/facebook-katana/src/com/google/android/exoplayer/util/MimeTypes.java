// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;


public final class MimeTypes
{

    private MimeTypes()
    {
    }

    public static boolean a(String s)
    {
        return g(s).equals("audio");
    }

    public static boolean b(String s)
    {
        return g(s).equals("video");
    }

    public static boolean c(String s)
    {
        return g(s).equals("text");
    }

    public static boolean d(String s)
    {
        return s.equals("application/ttml+xml");
    }

    public static int e(String s)
    {
        if ("audio/ac3".equals(s))
        {
            return 5;
        }
        if ("audio/eac3".equals(s))
        {
            return 6;
        }
        return !a(s) ? 0 : 2;
    }

    public static boolean f(String s)
    {
        return "audio/ac3".equals(s) || "audio/eac3".equals(s);
    }

    private static String g(String s)
    {
        int i = s.indexOf('/');
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid mime type: ")).append(s).toString());
        } else
        {
            return s.substring(0, i);
        }
    }
}
