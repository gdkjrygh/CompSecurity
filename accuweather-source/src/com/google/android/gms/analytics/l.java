// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.util.Log;

// Referenced classes of package com.google.android.gms.analytics:
//            Logger

class l
    implements Logger
{

    private int tK;

    l()
    {
        tK = 1;
    }

    private String L(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(Exception exception)
    {
        if (tK <= 3)
        {
            Log.e("GAV4", null, exception);
        }
    }

    public void error(String s)
    {
        if (tK <= 3)
        {
            Log.e("GAV4", L(s));
        }
    }

    public int getLogLevel()
    {
        return tK;
    }

    public void info(String s)
    {
        if (tK <= 1)
        {
            Log.i("GAV4", L(s));
        }
    }

    public void setLogLevel(int i)
    {
        tK = i;
    }

    public void verbose(String s)
    {
        if (tK <= 0)
        {
            Log.v("GAV4", L(s));
        }
    }

    public void warn(String s)
    {
        if (tK <= 2)
        {
            Log.w("GAV4", L(s));
        }
    }
}
