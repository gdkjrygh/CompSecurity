// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d COLD;
    public static final d DEAD;
    public static final d GOOD;
    public static final d OVERHEAT;
    public static final d OVER_VOLTAGE;
    public static final d UNKNOWN;
    public static final d UNSPECIFIED_FAILURE;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/common/hardware/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new d("UNKNOWN", 0);
        GOOD = new d("GOOD", 1);
        OVERHEAT = new d("OVERHEAT", 2);
        DEAD = new d("DEAD", 3);
        OVER_VOLTAGE = new d("OVER_VOLTAGE", 4);
        UNSPECIFIED_FAILURE = new d("UNSPECIFIED_FAILURE", 5);
        COLD = new d("COLD", 6);
        $VALUES = (new d[] {
            UNKNOWN, GOOD, OVERHEAT, DEAD, OVER_VOLTAGE, UNSPECIFIED_FAILURE, COLD
        });
    }
}
