// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class NetworkCost extends Enum
{

    private static final NetworkCost $VALUES[];
    public static final NetworkCost METERED;
    public static final NetworkCost OVER_DATA_LIMIT;
    public static final NetworkCost UNKNOWN;
    public static final NetworkCost UNMETERED;
    private final int cost;

    private NetworkCost(String s, int i, int j)
    {
        super(s, i);
        cost = j;
    }

    public static NetworkCost valueOf(String s)
    {
        return (NetworkCost)Enum.valueOf(com/microsoft/applications/telemetry/NetworkCost, s);
    }

    public static NetworkCost[] values()
    {
        return (NetworkCost[])$VALUES.clone();
    }

    public final int getValue()
    {
        return cost;
    }

    static 
    {
        UNKNOWN = new NetworkCost("UNKNOWN", 0, 0);
        UNMETERED = new NetworkCost("UNMETERED", 1, 1);
        METERED = new NetworkCost("METERED", 2, 2);
        OVER_DATA_LIMIT = new NetworkCost("OVER_DATA_LIMIT", 3, 3);
        $VALUES = (new NetworkCost[] {
            UNKNOWN, UNMETERED, METERED, OVER_DATA_LIMIT
        });
    }
}
