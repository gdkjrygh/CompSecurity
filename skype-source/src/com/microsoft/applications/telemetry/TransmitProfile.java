// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class TransmitProfile extends Enum
{

    private static final TransmitProfile $VALUES[];
    public static final TransmitProfile BEST_EFFORT;
    public static final TransmitProfile NEAR_REAL_TIME;
    public static final TransmitProfile REAL_TIME;
    final int value;

    private TransmitProfile(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static TransmitProfile valueOf(String s)
    {
        return (TransmitProfile)Enum.valueOf(com/microsoft/applications/telemetry/TransmitProfile, s);
    }

    public static TransmitProfile[] values()
    {
        return (TransmitProfile[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        REAL_TIME = new TransmitProfile("REAL_TIME", 0, 0);
        NEAR_REAL_TIME = new TransmitProfile("NEAR_REAL_TIME", 1, 1);
        BEST_EFFORT = new TransmitProfile("BEST_EFFORT", 2, 2);
        $VALUES = (new TransmitProfile[] {
            REAL_TIME, NEAR_REAL_TIME, BEST_EFFORT
        });
    }
}
