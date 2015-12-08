// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


public class $Strings
{

    private $Strings()
    {
    }

    public static String capitalize(String s)
    {
        if (s.length() != 0)
        {
            char c = s.charAt(0);
            char c1 = Character.toUpperCase(c);
            if (c != c1)
            {
                return (new StringBuilder()).append(c1).append(s.substring(1)).toString();
            }
        }
        return s;
    }
}
