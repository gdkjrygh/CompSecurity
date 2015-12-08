// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class PowerSource extends Enum
{

    private static final PowerSource $VALUES[];
    public static final PowerSource AC;
    public static final PowerSource BATTERY;
    public static final PowerSource UNKNOWN;
    private final int source;

    private PowerSource(String s, int i, int j)
    {
        super(s, i);
        source = j;
    }

    public static PowerSource valueOf(String s)
    {
        return (PowerSource)Enum.valueOf(com/microsoft/applications/telemetry/PowerSource, s);
    }

    public static PowerSource[] values()
    {
        return (PowerSource[])$VALUES.clone();
    }

    public final int getValue()
    {
        return source;
    }

    static 
    {
        UNKNOWN = new PowerSource("UNKNOWN", 0, 0);
        BATTERY = new PowerSource("BATTERY", 1, 1);
        AC = new PowerSource("AC", 2, 2);
        $VALUES = (new PowerSource[] {
            UNKNOWN, BATTERY, AC
        });
    }
}
