// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;


public final class NetworkType extends Enum
{

    private static final NetworkType $VALUES[];
    public static final NetworkType UNKNOWN;
    public static final NetworkType WIFI;
    public static final NetworkType WIRED;
    public static final NetworkType WWAN;
    private final int networkType;

    private NetworkType(String s, int i, int j)
    {
        super(s, i);
        networkType = j;
    }

    public static NetworkType valueOf(String s)
    {
        return (NetworkType)Enum.valueOf(com/microsoft/applications/telemetry/NetworkType, s);
    }

    public static NetworkType[] values()
    {
        return (NetworkType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return networkType;
    }

    static 
    {
        UNKNOWN = new NetworkType("UNKNOWN", 0, 0);
        WIRED = new NetworkType("WIRED", 1, 1);
        WIFI = new NetworkType("WIFI", 2, 2);
        WWAN = new NetworkType("WWAN", 3, 3);
        $VALUES = (new NetworkType[] {
            UNKNOWN, WIRED, WIFI, WWAN
        });
    }
}
