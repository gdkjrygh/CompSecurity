// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;


public final class h
{

    public static boolean a(String s)
    {
        if (s == null || s.equals("null"))
        {
            return true;
        } else
        {
            return s.trim().isEmpty();
        }
    }

    public static boolean b(String s)
    {
        return !a(s);
    }
}
