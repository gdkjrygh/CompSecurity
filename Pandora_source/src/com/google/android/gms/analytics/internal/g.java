// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzx

class g
    implements Logger
{

    private int a;
    private boolean b;

    g()
    {
        a = 2;
    }

    public void error(Exception exception)
    {
    }

    public void error(String s)
    {
    }

    public int getLogLevel()
    {
        return a;
    }

    public void info(String s)
    {
    }

    public void setLogLevel(int i)
    {
        a = i;
        if (!b)
        {
            Log.i((String)zzx.zzHf.get(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzx.zzHf.get()).append(" DEBUG").toString());
            b = true;
        }
    }

    public void verbose(String s)
    {
    }

    public void warn(String s)
    {
    }
}
