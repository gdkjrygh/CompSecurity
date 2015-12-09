// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


public final class Strings
{

    public static String emptyToNull(String s)
    {
        String s1 = s;
        if (isNullOrEmpty(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String nullToEmpty(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }
}
