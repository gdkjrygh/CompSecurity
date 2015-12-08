// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import com.soundcloud.android.SoundCloudApplication;

public final class Log
{

    public static final String ADS_TAG = "ScAds";

    private Log()
    {
    }

    public static void d(Object obj, String s)
    {
        obj.getClass().getSimpleName();
    }

    public static void d(String s)
    {
        s = SoundCloudApplication.TAG;
    }

    public static void d(String s, String s1)
    {
        android.util.Log.isLoggable(s, 3);
    }

    public static void e(Object obj, String s)
    {
        obj.getClass().getSimpleName();
    }

    public static void e(String s)
    {
        s = SoundCloudApplication.TAG;
    }

    public static void e(String s, String s1)
    {
        android.util.Log.isLoggable(s, 6);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        android.util.Log.isLoggable(s, 6);
    }

    public static void i(Object obj, String s)
    {
        obj.getClass().getSimpleName();
    }

    public static void i(String s)
    {
        s = SoundCloudApplication.TAG;
    }

    public static void i(String s, String s1)
    {
        android.util.Log.isLoggable(s, 4);
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        android.util.Log.isLoggable(s, 4);
    }

    public static void w(Object obj, String s)
    {
        obj.getClass().getSimpleName();
    }

    public static void w(String s)
    {
        s = SoundCloudApplication.TAG;
    }

    public static void w(String s, String s1)
    {
        android.util.Log.isLoggable(s, 5);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        android.util.Log.isLoggable(s, 5);
    }
}
