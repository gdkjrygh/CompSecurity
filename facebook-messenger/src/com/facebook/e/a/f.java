// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e.a;

import android.net.TrafficStats;
import android.os.Process;

class f
{

    private long a;
    private long b;

    public f(long l, long l1)
    {
        a = l;
        b = l1;
    }

    static f a()
    {
        int i = Process.myUid();
        return new f(TrafficStats.getUidRxBytes(i), TrafficStats.getUidTxBytes(i));
    }

    static long b(f f1)
    {
        return f1.b;
    }

    public f a(f f1)
    {
        return new f(a - f1.b(), b - f1.c());
    }

    public long b()
    {
        return a;
    }

    public long c()
    {
        return b;
    }
}
