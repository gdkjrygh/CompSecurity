// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


public final class l
{

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    public static boolean b(String s)
    {
        return !a(s);
    }
}
