// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;


// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerServicesStateListener

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/pedometer/service/PedometerServicesStateListener$PedometerServicesState, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("IDLE", 0);
        b = new <init>("SYNCING_WITH_SERVER", 1);
        c = new <init>("LIVE_DATA_STREAMING", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
