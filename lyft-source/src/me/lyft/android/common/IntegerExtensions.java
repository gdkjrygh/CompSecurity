// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;


public class IntegerExtensions
{

    public IntegerExtensions()
    {
    }

    public static Integer tryParse(String s)
    {
        try
        {
            s = Integer.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static Integer tryParse(String s, int i)
    {
        try
        {
            s = Integer.valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return Integer.valueOf(i);
        }
        return s;
    }
}
