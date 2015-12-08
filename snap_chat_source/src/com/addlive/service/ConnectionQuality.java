// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public final class ConnectionQuality extends Enum
{

    private static final ConnectionQuality $VALUES[];
    public static final ConnectionQuality AVERAGE;
    public static final ConnectionQuality BAD;
    public static final ConnectionQuality FINE;
    public static final ConnectionQuality UNKNOWN;

    private ConnectionQuality(String s, int i)
    {
        super(s, i);
    }

    public static ConnectionQuality _fromInt(int i)
    {
        switch (i)
        {
        default:
            return UNKNOWN;

        case 0: // '\0'
            return FINE;

        case 1: // '\001'
            return AVERAGE;

        case 2: // '\002'
            return BAD;
        }
    }

    public static ConnectionQuality valueOf(String s)
    {
        return (ConnectionQuality)Enum.valueOf(com/addlive/service/ConnectionQuality, s);
    }

    public static ConnectionQuality[] values()
    {
        return (ConnectionQuality[])$VALUES.clone();
    }

    static 
    {
        FINE = new ConnectionQuality("FINE", 0);
        AVERAGE = new ConnectionQuality("AVERAGE", 1);
        BAD = new ConnectionQuality("BAD", 2);
        UNKNOWN = new ConnectionQuality("UNKNOWN", 3);
        $VALUES = (new ConnectionQuality[] {
            FINE, AVERAGE, BAD, UNKNOWN
        });
    }
}
