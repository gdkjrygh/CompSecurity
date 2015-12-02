// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c CHARGING_AC;
    public static final c CHARGING_USB;
    public static final c DISCHARGING;
    public static final c FULL;
    public static final c NOT_CHARGING;
    public static final c UNKNOWN;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/common/hardware/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new c("UNKNOWN", 0);
        DISCHARGING = new c("DISCHARGING", 1);
        NOT_CHARGING = new c("NOT_CHARGING", 2);
        CHARGING_USB = new c("CHARGING_USB", 3);
        CHARGING_AC = new c("CHARGING_AC", 4);
        FULL = new c("FULL", 5);
        $VALUES = (new c[] {
            UNKNOWN, DISCHARGING, NOT_CHARGING, CHARGING_USB, CHARGING_AC, FULL
        });
    }
}
