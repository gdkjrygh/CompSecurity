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

    private int tN;

    l()
    {
        tN = 1;
    }

    private String L(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(Exception exception)
    {
        if (tN <= 3)
        {
            Log.e("GAV4", null, exception);
        }
    }

    public void error(String s)
    {
        if (tN <= 3)
        {
            Log.e("GAV4", L(s));
        }
    }

    public int getLogLevel()
    {
        return tN;
    }

    public void info(String s)
    {
        if (tN <= 1)
        {
            Log.i("GAV4", L(s));
        }
    }

    public void setLogLevel(int i)
    {
        tN = i;
    }

    public void verbose(String s)
    {
        if (tN <= 0)
        {
            Log.v("GAV4", L(s));
        }
    }

    public void warn(String s)
    {
        if (tN <= 2)
        {
            Log.w("GAV4", L(s));
        }
    }
}
