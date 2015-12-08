// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.languages;


public final class c
{

    public static boolean a(String s)
    {
        return s != null && (s.startsWith("zh-") || s.equals("zh"));
    }

    public static String b(String s)
    {
        String s1 = s;
        if (a(s))
        {
            s1 = "zh";
        }
        return s1;
    }

    public static String c(String s)
    {
        String s1;
        if ("zh-CN".equals(s))
        {
            s1 = "zh-Hans";
        } else
        {
            if ("zh-TW".equals(s))
            {
                return "zh-Hant";
            }
            s1 = s;
            if ("sr".equals(s))
            {
                return "sr-Cyrl";
            }
        }
        return s1;
    }

    public static String d(String s)
    {
        String s1;
        if ("zh-Hans".equals(s))
        {
            s1 = "zh-CN";
        } else
        {
            if ("zh-Hant".equals(s))
            {
                return "zh-TW";
            }
            s1 = s;
            if ("sr-Cyrl".equals(s))
            {
                return "sr";
            }
        }
        return s1;
    }
}
