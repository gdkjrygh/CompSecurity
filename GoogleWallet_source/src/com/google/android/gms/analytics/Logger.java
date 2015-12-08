// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.util.Log;

public class Logger
{

    private int yL;

    Logger()
    {
        yL = 2;
    }

    private static String ae(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(String s)
    {
        if (yL <= 3)
        {
            Log.e("GAV4", ae(s));
        }
    }

    public int getLogLevel()
    {
        return yL;
    }

    public void info(String s)
    {
        if (yL <= 1)
        {
            Log.i("GAV4", ae(s));
        }
    }

    public void setLogLevel(int i)
    {
        yL = i;
    }

    public void verbose(String s)
    {
        if (yL <= 0)
        {
            Log.v("GAV4", ae(s));
        }
    }

    public void warn(String s)
    {
        if (yL <= 2)
        {
            Log.w("GAV4", ae(s));
        }
    }
}
