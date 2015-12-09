// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;


// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerServerSyncHelper

public static final class Q extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/fitbit/pedometer/service/PedometerServerSyncHelper$SoftTrackerSyncError, s);
    }

    public static Q[] values()
    {
        return (Q[])f.clone();
    }

    static 
    {
        a = new <init>("NO_NETWORK", 0);
        b = new <init>("NO_DATA", 1);
        c = new <init>("BACKOFF", 2);
        d = new <init>("KEY_EXPIRED", 3);
        e = new <init>("SERVER_COMMUNICATION_ERROR", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
