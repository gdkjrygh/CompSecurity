// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;


// Referenced classes of package com.fitbit.galileo.service:
//            GalileoServicesStateListener

public static final class isMultiTrackerState extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];
    private final boolean isMultiTrackerState;

    public static isMultiTrackerState valueOf(String s)
    {
        return (isMultiTrackerState)Enum.valueOf(com/fitbit/galileo/service/GalileoServicesStateListener$GalileoState, s);
    }

    public static isMultiTrackerState[] values()
    {
        return (isMultiTrackerState[])f.clone();
    }

    public boolean a()
    {
        return isMultiTrackerState;
    }

    static 
    {
        a = new <init>("IDLE", 0, true);
        b = new <init>("NOT_IDLE", 1, true);
        c = new <init>("NOT_IDLE_LONG_SEARCH", 2, false);
        d = new <init>("SYNCING_WITH_TRACKER", 3, false);
        e = new <init>("SYNCING_WITH_SERVER", 4, true);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        isMultiTrackerState = flag;
    }
}
