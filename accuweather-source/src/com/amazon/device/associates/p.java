// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.util.Log;

class p
{

    private static boolean a = true;
    private static boolean b = false;

    p()
    {
    }

    public static void a(String s, String s1)
    {
        if (a() && b)
        {
            Log.d((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), s1);
        }
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        if (a() && b)
        {
            Log.d((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), String.format(s1, aobj));
        }
    }

    public static boolean a()
    {
        return a;
    }

    public static void b(String s, String s1)
    {
        if (a())
        {
            Log.e((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), s1);
        }
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        if (a())
        {
            Log.e((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), String.format(s1, aobj));
        }
    }

    public static void c(String s, String s1)
    {
        if (a() && b)
        {
            Log.i((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), s1);
        }
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        if (a() && b)
        {
            Log.i((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), String.format(s1, aobj));
        }
    }

    public static void d(String s, String s1)
    {
        if (a())
        {
            Log.w((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), s1);
        }
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        if (a())
        {
            Log.w((new StringBuilder()).append("AmazonMobileAssociates ").append(s).toString(), String.format(s1, aobj));
        }
    }

}
