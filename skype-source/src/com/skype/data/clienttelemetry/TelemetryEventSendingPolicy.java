// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.data.clienttelemetry;


public final class TelemetryEventSendingPolicy extends Enum
{

    public static final TelemetryEventSendingPolicy a;
    public static final TelemetryEventSendingPolicy b;
    public static final TelemetryEventSendingPolicy c;
    public static final TelemetryEventSendingPolicy d;
    public static final TelemetryEventSendingPolicy e;
    private static final TelemetryEventSendingPolicy g[];
    private int f;

    private TelemetryEventSendingPolicy(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static TelemetryEventSendingPolicy valueOf(String s)
    {
        return (TelemetryEventSendingPolicy)Enum.valueOf(com/skype/data/clienttelemetry/TelemetryEventSendingPolicy, s);
    }

    public static TelemetryEventSendingPolicy[] values()
    {
        return (TelemetryEventSendingPolicy[])g.clone();
    }

    static 
    {
        a = new TelemetryEventSendingPolicy("EVENT_SENDING_POLICY_OFF", 0, 0);
        b = new TelemetryEventSendingPolicy("EVENT_SENDING_POLICY_LOW", 1, 1);
        c = new TelemetryEventSendingPolicy("EVENT_SENDING_POLICY_NORMAL", 2, 2);
        d = new TelemetryEventSendingPolicy("EVENT_SENDING_POLICY_HIGH", 3, 3);
        e = new TelemetryEventSendingPolicy("EVENT_SENDING_POLICY_IMMEDIATE", 4, 4);
        g = (new TelemetryEventSendingPolicy[] {
            a, b, c, d, e
        });
    }
}
