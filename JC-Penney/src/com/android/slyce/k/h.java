// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import android.util.Log;

public class h
{

    public static void a(String s, String s1)
    {
        Log.i(s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        Log.e(s, s1, throwable);
    }

    public static void b(String s, String s1)
    {
        Log.e(s, s1);
    }

    public static void c(String s, String s1)
    {
        Log.d(s, s1);
    }
}
