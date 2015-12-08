// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class SyncInterfaceAvailability extends Enum
{

    public static final SyncInterfaceAvailability a;
    private static SyncInterfaceAvailability b;
    private static final SyncInterfaceAvailability c[];

    private SyncInterfaceAvailability(String s, int i)
    {
        super(s, i);
    }

    public static SyncInterfaceAvailability valueOf(String s)
    {
        return (SyncInterfaceAvailability)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SyncInterfaceAvailability, s);
    }

    public static SyncInterfaceAvailability[] values()
    {
        return (SyncInterfaceAvailability[])c.clone();
    }

    static 
    {
        b = new SyncInterfaceAvailability("SYNC_INTERFACE_AVAILABLE", 0);
        a = new SyncInterfaceAvailability("SYNC_INTERFACE_UNAVAILABLE", 1);
        c = (new SyncInterfaceAvailability[] {
            b, a
        });
    }
}
