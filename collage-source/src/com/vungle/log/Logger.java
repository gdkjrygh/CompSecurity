// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.log;

import android.text.TextUtils;
import android.util.Log;

public class Logger
{

    public static final String AD_TAG = "VungleAd";
    public static final String ASYNC_TAG = "VungleAsync";
    public static final String CONFIG_TAG = "VungleConfig";
    public static final String DATABASE_DUMP_TAG = "VungleDumpDatabase";
    public static final String DATABASE_TAG = "VungleDatabase";
    public static final String DATA_TAG = "VungleData";
    public static final int DEBUG_LOGGING_LEVEL = 3;
    public static final String DEVICE_TAG = "VungleDevice";
    public static final int ERROR_LOGGING_LEVEL = 5;
    public static final String EVENT_TAG = "VungleEvent";
    public static final String FILE_TAG = "VungleFile";
    public static final int INFO_LOGGING_LEVEL = 4;
    public static final String INJECT_TAG = "VungleInject";
    public static final String LOCATION_TAG = "VungleLocation";
    public static final String NETWORK_TAG = "VungleNetwork";
    public static final String PREPARE_TAG = "VunglePrepare";
    public static final String PROTOCOL_TAG = "VungleProtocol";
    public static final String REPORT_TAG = "VungleReport";
    public static final int VERBOSE_LOGGING_LEVEL = 2;
    public static final String VUNGLE_TAG = "Vungle";
    public static final int WARN_LOGGING_LEVEL = 5;

    private Logger()
    {
    }

    private static void a(int j, String s, String s1, Throwable throwable)
    {
        boolean flag1 = true;
        boolean flag2 = Log.isLoggable("VungleDebug", 3);
        if (!flag2 && j >= 5 || flag2 && isLoggable(j))
        {
            StringBuilder stringbuilder;
            boolean flag;
            if (!TextUtils.isEmpty(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (throwable == null)
            {
                flag1 = false;
            }
            stringbuilder = new StringBuilder();
            if (flag)
            {
                stringbuilder.append(s1);
            }
            if (flag && flag1)
            {
                stringbuilder.append("\n");
            }
            if (flag1)
            {
                stringbuilder.append(Log.getStackTraceString(throwable));
            }
            Log.println(j, s, stringbuilder.toString());
        }
    }

    public static void d(String s, String s1)
    {
        a(3, s, s1, null);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        a(3, s, s1, throwable);
    }

    public static void d(String s, Throwable throwable)
    {
        a(3, s, null, throwable);
    }

    public static void e(String s, String s1)
    {
        a(6, s, s1, null);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        a(6, s, s1, throwable);
    }

    public static void e(String s, Throwable throwable)
    {
        a(6, s, null, throwable);
    }

    public static void i(String s, String s1)
    {
        a(4, s, s1, null);
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        a(4, s, s1, throwable);
    }

    public static void i(String s, Throwable throwable)
    {
        a(4, s, null, throwable);
    }

    public static boolean isLoggable(int j)
    {
        return Log.isLoggable("Vungle", j);
    }

    public static void v(String s, String s1)
    {
        a(2, s, s1, null);
    }

    public static void v(String s, String s1, Throwable throwable)
    {
        a(2, s, s1, throwable);
    }

    public static void v(String s, Throwable throwable)
    {
        a(2, s, null, throwable);
    }

    public static void w(String s, String s1)
    {
        a(5, s, s1, null);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        a(5, s, s1, throwable);
    }

    public static void w(String s, Throwable throwable)
    {
        a(5, s, null, throwable);
    }
}
