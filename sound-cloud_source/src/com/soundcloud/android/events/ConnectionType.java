// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


public final class ConnectionType extends Enum
{

    private static final ConnectionType $VALUES[];
    public static final ConnectionType FOUR_G;
    public static final ConnectionType OFFLINE;
    public static final ConnectionType THREE_G;
    public static final ConnectionType TWO_G;
    public static final ConnectionType UNKNOWN;
    public static final ConnectionType WIFI;
    private final String value;

    private ConnectionType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static ConnectionType valueOf(String s)
    {
        return (ConnectionType)Enum.valueOf(com/soundcloud/android/events/ConnectionType, s);
    }

    public static ConnectionType[] values()
    {
        return (ConnectionType[])$VALUES.clone();
    }

    public final String getValue()
    {
        return value;
    }

    static 
    {
        TWO_G = new ConnectionType("TWO_G", 0, "2g");
        THREE_G = new ConnectionType("THREE_G", 1, "3g");
        FOUR_G = new ConnectionType("FOUR_G", 2, "4g");
        WIFI = new ConnectionType("WIFI", 3, "wifi");
        OFFLINE = new ConnectionType("OFFLINE", 4, "offline");
        UNKNOWN = new ConnectionType("UNKNOWN", 5, "unknown");
        $VALUES = (new ConnectionType[] {
            TWO_G, THREE_G, FOUR_G, WIFI, OFFLINE, UNKNOWN
        });
    }
}
