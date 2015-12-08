// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class DriverDistractionState extends Enum
{

    public static final DriverDistractionState a;
    private static DriverDistractionState b;
    private static final DriverDistractionState c[];

    private DriverDistractionState(String s, int i)
    {
        super(s, i);
    }

    public static DriverDistractionState a(String s)
    {
        return valueOf(s);
    }

    public static DriverDistractionState valueOf(String s)
    {
        return (DriverDistractionState)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/DriverDistractionState, s);
    }

    public static DriverDistractionState[] values()
    {
        return (DriverDistractionState[])c.clone();
    }

    static 
    {
        a = new DriverDistractionState("DD_ON", 0);
        b = new DriverDistractionState("DD_OFF", 1);
        c = (new DriverDistractionState[] {
            a, b
        });
    }
}
