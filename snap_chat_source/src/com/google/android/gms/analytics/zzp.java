// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            Logger

class zzp
    implements Logger
{

    private int zzBJ;

    zzp()
    {
        zzBJ = 2;
    }

    private String zzal(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public void error(String s)
    {
        if (zzBJ <= 3)
        {
            zzal(s);
        }
    }

    public int getLogLevel()
    {
        return zzBJ;
    }

    public void info(String s)
    {
        if (zzBJ <= 1)
        {
            zzal(s);
        }
    }

    public void setLogLevel(int i)
    {
        zzBJ = i;
    }

    public void verbose(String s)
    {
        if (zzBJ <= 0)
        {
            zzal(s);
        }
    }

    public void warn(String s)
    {
        if (zzBJ <= 2)
        {
            zzal(s);
        }
    }
}
