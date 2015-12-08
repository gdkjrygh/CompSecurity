// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Arrays;

public final class az
{

    public static boolean a(String s)
    {
        return s.equals("mock");
    }

    public static boolean b(String s)
    {
        return s.startsWith("sandbox");
    }

    public static boolean c(String s)
    {
        return s.equals("live");
    }

    public static boolean d(String s)
    {
        return !s.equals("live") && !s.startsWith("sandbox") && !s.equals("mock");
    }

    public static boolean e(String s)
    {
        return s.startsWith("sandbox") || s.equals("mock");
    }

    static 
    {
        Arrays.asList(new String[] {
            "live", "sandbox", "mock"
        });
    }
}
