// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.util.Log;

// Referenced classes of package com.google.android.gms.analytics:
//            Logger

class k
    implements Logger
{

    private int xW;

    k()
    {
        xW = 2;
    }

    private String ae(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(Exception exception)
    {
        if (xW <= 3)
        {
            Log.e("GAV4", null, exception);
        }
    }

    public void error(String s)
    {
        if (xW <= 3)
        {
            Log.e("GAV4", ae(s));
        }
    }

    public int getLogLevel()
    {
        return xW;
    }

    public void info(String s)
    {
        if (xW <= 1)
        {
            Log.i("GAV4", ae(s));
        }
    }

    public void setLogLevel(int i)
    {
        xW = i;
    }

    public void verbose(String s)
    {
        if (xW <= 0)
        {
            Log.v("GAV4", ae(s));
        }
    }

    public void warn(String s)
    {
        if (xW <= 2)
        {
            Log.w("GAV4", ae(s));
        }
    }
}
