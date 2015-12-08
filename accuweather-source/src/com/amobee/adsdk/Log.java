// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AdManager

public final class Log
{

    static int all = 0;
    static int d = 3;
    static int e = 2;
    static int i = 1;
    static int v = 4;
    static int w = 5;

    public Log()
    {
    }

    private static void LogHandler(int j, String s, String s1)
    {
        AdManager.DebugLevel debuglevel;
        try
        {
            debuglevel = AdManager.debugLevel;
        }
        catch (Exception exception)
        {
            exception = AdManager.DebugLevel.NODEBUG;
        }
        if (debuglevel != AdManager.DebugLevel.NODEBUG)
        {
            android.util.Log.d(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        LogHandler(d, s, s1);
    }

    public static void e(String s, String s1)
    {
        LogHandler(e, s, s1);
    }

    public static void i(String s, String s1)
    {
        LogHandler(i, s, s1);
    }

    public static void v(String s, String s1)
    {
        LogHandler(v, s, s1);
    }

    public static void w(String s, String s1)
    {
        LogHandler(w, s, s1);
    }

}
