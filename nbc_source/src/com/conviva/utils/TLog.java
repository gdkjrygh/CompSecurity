// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import android.util.Log;

public class TLog
{

    public TLog()
    {
    }

    public static void d(String s, String s1)
    {
        Log.d(s, s1);
    }

    public static void e(String s, String s1)
    {
        Log.e(s, s1);
    }

    public static void i(String s, String s1)
    {
        Log.i(s, s1);
    }
}
