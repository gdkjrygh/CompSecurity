// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public final class TelemetryTransmissionConditions extends Enum
{

    public static final TelemetryTransmissionConditions a;
    public static final TelemetryTransmissionConditions b;
    public static final TelemetryTransmissionConditions c;
    public static final TelemetryTransmissionConditions d;
    public static final TelemetryTransmissionConditions e;
    private static final TelemetryTransmissionConditions g[];
    private int f;

    private TelemetryTransmissionConditions(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static TelemetryTransmissionConditions valueOf(String s)
    {
        return (TelemetryTransmissionConditions)Enum.valueOf(com/skype/data/clienttelemetry/TelemetryTransmissionConditions, s);
    }

    public static TelemetryTransmissionConditions[] values()
    {
        return (TelemetryTransmissionConditions[])g.clone();
    }

    static 
    {
        a = new TelemetryTransmissionConditions("NETWORK_METERED", 0, 1);
        b = new TelemetryTransmissionConditions("NETWORK_UNMETERED", 1, 2);
        c = new TelemetryTransmissionConditions("POWER_AC", 2, 256);
        d = new TelemetryTransmissionConditions("POWER_BATTERY", 3, 512);
        e = new TelemetryTransmissionConditions("ALL", 4, -1);
        g = (new TelemetryTransmissionConditions[] {
            a, b, c, d, e
        });
    }
}
