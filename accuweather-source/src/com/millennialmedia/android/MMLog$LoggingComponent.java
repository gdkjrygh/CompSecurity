// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.util.Log;

// Referenced classes of package com.millennialmedia.android:
//            MMLog

static class 
{

    private static final String TAG_STARTER = "MMSDK-";
    private static int logLevel = 4;
    private wInternal registeredLogHandler;

    private void callLogHandler(String s)
    {
        if (registeredLogHandler != null)
        {
            registeredLogHandler.Log(s);
        }
    }

    private void dInternal(String s, String s1)
    {
        Log.d((new StringBuilder()).append("MMSDK-").append(s).toString(), s1);
        callLogHandler(s1);
    }

    private void eInternal(String s, String s1)
    {
        Log.e((new StringBuilder()).append("MMSDK-").append(s).toString(), s1);
        callLogHandler(s1);
    }

    private void iInternal(String s, String s1)
    {
        Log.i((new StringBuilder()).append("MMSDK-").append(s).toString(), s1);
        callLogHandler(s1);
    }

    private void vInternal(String s, String s1)
    {
        Log.v((new StringBuilder()).append("MMSDK-").append(s).toString(), s1);
        callLogHandler(s1);
    }

    private void wInternal(String s, String s1)
    {
        Log.w((new StringBuilder()).append("MMSDK-").append(s).toString(), s1);
        callLogHandler(s1);
    }

    void d(String s, String s1)
    {
        if (logLevel <= 3)
        {
            dInternal(s, s1);
        }
    }

    void d(String s, String s1, Throwable throwable)
    {
        if (logLevel <= 3)
        {
            dInternal(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    void e(String s, String s1)
    {
        if (logLevel <= 6)
        {
            eInternal(s, s1);
        }
    }

    void e(String s, String s1, Throwable throwable)
    {
        if (logLevel <= 6)
        {
            eInternal(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    public int getLogLevel()
    {
        return logLevel;
    }

    void i(String s, String s1)
    {
        if (logLevel <= 4)
        {
            iInternal(s, s1);
        }
    }

    void i(String s, String s1, Throwable throwable)
    {
        if (logLevel <= 4)
        {
            iInternal(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    void registerLogHandler(iInternal iinternal)
    {
        registeredLogHandler = iinternal;
    }

    public void setLogLevel(int j)
    {
        logLevel = j;
    }

    void v(String s, String s1)
    {
        if (logLevel <= 2)
        {
            vInternal(s, s1);
        }
    }

    void v(String s, String s1, Throwable throwable)
    {
        if (logLevel <= 2)
        {
            vInternal(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    void w(String s, String s1)
    {
        if (logLevel <= 5)
        {
            wInternal(s, s1);
        }
    }

    void w(String s, String s1, Throwable throwable)
    {
        if (logLevel <= 5)
        {
            wInternal(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }


    ()
    {
    }
}
