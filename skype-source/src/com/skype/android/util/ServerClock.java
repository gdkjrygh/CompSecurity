// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.SystemClock;
import com.skype.SkyLib;

public class ServerClock
{

    private SkyLib a;
    private long b;
    private long c;

    public ServerClock(SkyLib skylib)
    {
        a = skylib;
    }

    public final long a()
    {
        long l = 0L;
        if (b == 0L)
        {
            c = SystemClock.elapsedRealtime() / 1000L;
            b = a.getServerTime();
            if (b != 0L)
            {
                l = b;
            }
            return l;
        } else
        {
            return (SystemClock.elapsedRealtime() / 1000L - c) + b;
        }
    }

    public final void b()
    {
        b = 0L;
        c = 0L;
    }
}
