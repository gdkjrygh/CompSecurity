// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed;

import android.util.Log;

// Referenced classes of package com.htc.blinkfeed:
//            Util

public static class 
{

    private static boolean debug_flag = false;

    public static void d(String s, String s1)
    {
        if (debug_flag)
        {
            Log.d(s, s1);
        }
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        if (debug_flag)
        {
            Log.d(s, s1, throwable);
        }
    }

    public static void setDebug(boolean flag)
    {
        debug_flag = flag;
        if (debug_flag)
        {
            Log.d("BLINKFEED_DEBUG", "debug enabled");
        }
    }


    public ()
    {
    }
}
