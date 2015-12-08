// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;


public final class ConnectionQuality extends Enum
{

    private static final ConnectionQuality $VALUES[];
    public static final ConnectionQuality EXCELLENT;
    public static final ConnectionQuality GOOD;
    public static final ConnectionQuality MODERATE;
    public static final ConnectionQuality POOR;
    public static final ConnectionQuality UNKNOWN;

    private ConnectionQuality(String s, int i)
    {
        super(s, i);
    }

    public static ConnectionQuality valueOf(String s)
    {
        return (ConnectionQuality)Enum.valueOf(com/facebook/network/connectionclass/ConnectionQuality, s);
    }

    public static ConnectionQuality[] values()
    {
        return (ConnectionQuality[])$VALUES.clone();
    }

    static 
    {
        POOR = new ConnectionQuality("POOR", 0);
        MODERATE = new ConnectionQuality("MODERATE", 1);
        GOOD = new ConnectionQuality("GOOD", 2);
        EXCELLENT = new ConnectionQuality("EXCELLENT", 3);
        UNKNOWN = new ConnectionQuality("UNKNOWN", 4);
        $VALUES = (new ConnectionQuality[] {
            POOR, MODERATE, GOOD, EXCELLENT, UNKNOWN
        });
    }
}
