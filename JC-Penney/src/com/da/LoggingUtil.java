// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da;

import android.util.Log;

public final class LoggingUtil
{

    public static final int DEBUG = 2;
    public static final int ERROR = 1;
    public static final int INFO = 3;
    private static final String TAG = "DigitalAnalytics";
    public static final int VERBOSE = 5;
    public static final int WARNING = 4;
    private static boolean debugMode = false;

    private LoggingUtil()
    {
    }

    public static void forceLog(String s, Throwable throwable, int i)
    {
        switch (i)
        {
        default:
            Log.e("DigitalAnalytics", s, throwable);
            return;

        case 3: // '\003'
            Log.i("DigitalAnalytics", s, throwable);
            return;

        case 2: // '\002'
            Log.d("DigitalAnalytics", s, throwable);
            return;

        case 4: // '\004'
            Log.w("DigitalAnalytics", s, throwable);
            return;

        case 5: // '\005'
            Log.v("DigitalAnalytics", s, throwable);
            return;

        case 1: // '\001'
            Log.e("DigitalAnalytics", s, throwable);
            return;
        }
    }

    public static void log(String s, int i)
    {
        if (!debugMode)
        {
            return;
        }
        switch (i)
        {
        default:
            Log.d("DigitalAnalytics", s);
            return;

        case 3: // '\003'
            Log.i("DigitalAnalytics", s);
            return;

        case 2: // '\002'
            Log.d("DigitalAnalytics", s);
            return;

        case 4: // '\004'
            Log.w("DigitalAnalytics", s);
            return;

        case 5: // '\005'
            Log.v("DigitalAnalytics", s);
            return;

        case 1: // '\001'
            Log.e("DigitalAnalytics", s);
            return;
        }
    }

    public static void setDebugMode(boolean flag)
    {
        debugMode = flag;
    }

}
