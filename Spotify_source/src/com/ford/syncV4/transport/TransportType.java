// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.transport;


public final class TransportType extends Enum
{

    public static final TransportType a;
    public static final TransportType b;
    private static TransportType c;
    private static final TransportType d[];

    private TransportType(String s, int i)
    {
        super(s, i);
    }

    public static TransportType valueOf(String s)
    {
        return (TransportType)Enum.valueOf(com/ford/syncV4/transport/TransportType, s);
    }

    public static TransportType[] values()
    {
        return (TransportType[])d.clone();
    }

    static 
    {
        a = new TransportType("BLUETOOTH", 0);
        b = new TransportType("TCP", 1);
        c = new TransportType("USB", 2);
        d = (new TransportType[] {
            a, b, c
        });
    }
}
