// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


public final class NumberUtils
{

    private NumberUtils()
    {
    }

    public static Integer toIntegerSafely(String s, Integer integer)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = Integer.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return integer;
        }
        return s;
    }
}
