// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import java.util.Locale;

public class a
{

    public a()
    {
    }

    public static boolean a(String s)
    {
        while (s == null || !s.toLowerCase(Locale.US).startsWith("armeabi")) 
        {
            return false;
        }
        return true;
    }
}
