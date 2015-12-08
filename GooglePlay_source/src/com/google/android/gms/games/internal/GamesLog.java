// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;

public final class GamesLog
{

    private static final GmsLogger sLogger = new GmsLogger("Games");

    public static boolean canLog$134632()
    {
        return sLogger.canLog(4);
    }

    public static void d(String s, String s1)
    {
        sLogger.d(s, s1);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        GmsLogger gmslogger = sLogger;
        if (gmslogger.canLog(3))
        {
            Log.d(s, gmslogger.prefix(s1), throwable);
        }
    }

    public static void e(String s, String s1)
    {
        sLogger.e(s, s1);
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        sLogger.e(s, s1, throwable);
    }

    public static void i(String s, String s1)
    {
        GmsLogger gmslogger = sLogger;
        if (gmslogger.canLog(4))
        {
            Log.i(s, gmslogger.prefix(s1));
        }
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        GmsLogger gmslogger = sLogger;
        if (gmslogger.canLog(4))
        {
            Log.i(s, gmslogger.prefix(s1), throwable);
        }
    }

    public static void pii(String s, String s1)
    {
    }

    public static void v(String s, String s1)
    {
        sLogger.v(s, s1);
    }

    public static void w(String s, String s1)
    {
        sLogger.w(s, s1);
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        GmsLogger gmslogger = sLogger;
        if (gmslogger.canLog(5))
        {
            Log.w(s, gmslogger.prefix(s1), throwable);
        }
    }

    public static void wtf(Context context, String s, String s1)
    {
        sLogger.wtf(context, s, s1, new Throwable());
    }

    public static void wtf(Context context, String s, String s1, Throwable throwable)
    {
        sLogger.wtf(context, s, s1, throwable);
    }

}
