// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


public final class ConnectionStatus extends Enum
{

    private static final ConnectionStatus $VALUES[];
    public static final ConnectionStatus DISCONNECTED;
    public static final ConnectionStatus READY;
    public static final ConnectionStatus UNSUPPORTED;

    private ConnectionStatus(String s, int i)
    {
        super(s, i);
    }

    public static ConnectionStatus valueOf(String s)
    {
        return (ConnectionStatus)Enum.valueOf(com/soundcloud/android/payments/ConnectionStatus, s);
    }

    public static ConnectionStatus[] values()
    {
        return (ConnectionStatus[])$VALUES.clone();
    }

    public final boolean isDisconnected()
    {
        return this == DISCONNECTED;
    }

    public final boolean isReady()
    {
        return this == READY;
    }

    public final boolean isUnsupported()
    {
        return this == UNSUPPORTED;
    }

    static 
    {
        DISCONNECTED = new ConnectionStatus("DISCONNECTED", 0);
        UNSUPPORTED = new ConnectionStatus("UNSUPPORTED", 1);
        READY = new ConnectionStatus("READY", 2);
        $VALUES = (new ConnectionStatus[] {
            DISCONNECTED, UNSUPPORTED, READY
        });
    }
}
