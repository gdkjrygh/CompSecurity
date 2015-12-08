// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class SyncConnectionState extends Enum
{

    public static final SyncConnectionState a;
    public static final SyncConnectionState b;
    private static final SyncConnectionState c[];

    private SyncConnectionState(String s, int i)
    {
        super(s, i);
    }

    public static SyncConnectionState valueOf(String s)
    {
        return (SyncConnectionState)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SyncConnectionState, s);
    }

    public static SyncConnectionState[] values()
    {
        return (SyncConnectionState[])c.clone();
    }

    static 
    {
        a = new SyncConnectionState("SYNC_CONNECTED", 0);
        b = new SyncConnectionState("SYNC_DISCONNECTED", 1);
        c = (new SyncConnectionState[] {
            a, b
        });
    }
}
