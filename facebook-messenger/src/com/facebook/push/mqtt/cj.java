// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


public final class cj extends Enum
{

    private static final cj $VALUES[];
    public static final cj CHANNEL_CONNECTED;
    public static final cj CHANNEL_CONNECTING;
    public static final cj CHANNEL_DISCONNECTED;
    public static final cj SERVICE_STARTED;
    public static final cj SERVICE_STOPPED;
    public static final cj UNKNOWN;
    private final int value;

    private cj(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static cj fromValue(int i)
    {
        cj acj[] = values();
        int k = acj.length;
        for (int j = 0; j < k; j++)
        {
            cj cj1 = acj[j];
            if (cj1.value == i)
            {
                return cj1;
            }
        }

        return UNKNOWN;
    }

    public static cj valueOf(String s)
    {
        return (cj)Enum.valueOf(com/facebook/push/mqtt/cj, s);
    }

    public static cj[] values()
    {
        return (cj[])$VALUES.clone();
    }

    public int toValue()
    {
        return value;
    }

    static 
    {
        SERVICE_STARTED = new cj("SERVICE_STARTED", 0, 0);
        CHANNEL_CONNECTING = new cj("CHANNEL_CONNECTING", 1, 1);
        CHANNEL_CONNECTED = new cj("CHANNEL_CONNECTED", 2, 2);
        CHANNEL_DISCONNECTED = new cj("CHANNEL_DISCONNECTED", 3, 3);
        SERVICE_STOPPED = new cj("SERVICE_STOPPED", 4, 4);
        UNKNOWN = new cj("UNKNOWN", 5, 5);
        $VALUES = (new cj[] {
            SERVICE_STARTED, CHANNEL_CONNECTING, CHANNEL_CONNECTED, CHANNEL_DISCONNECTED, SERVICE_STOPPED, UNKNOWN
        });
    }
}
