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

    private int sz;

    l()
    {
        sz = 1;
    }

    private String E(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(Exception exception)
    {
        if (sz <= 3)
        {
            Log.e("GAV4", null, exception);
        }
    }

    public void error(String s)
    {
        if (sz <= 3)
        {
            Log.e("GAV4", E(s));
        }
    }

    public int getLogLevel()
    {
        return sz;
    }

    public void info(String s)
    {
        if (sz <= 1)
        {
            Log.i("GAV4", E(s));
        }
    }

    public void setLogLevel(int i)
    {
        sz = i;
    }

    public void verbose(String s)
    {
        if (sz <= 0)
        {
            Log.v("GAV4", E(s));
        }
    }

    public void warn(String s)
    {
        if (sz <= 2)
        {
            Log.w("GAV4", E(s));
        }
    }
}
