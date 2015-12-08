// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public final class ConnectionType extends Enum
{

    private static final ConnectionType $VALUES[];
    public static final ConnectionType NOT_CONNECTED;
    public static final ConnectionType TCP_RELAY;
    public static final ConnectionType UDP_P2P;
    public static final ConnectionType UDP_RELAY;
    private String stringValue;

    private ConnectionType(String s, int i, String s1)
    {
        super(s, i);
        stringValue = s1;
    }

    public static ConnectionType fromString(String s)
    {
        ConnectionType aconnectiontype[] = values();
        int j = aconnectiontype.length;
        for (int i = 0; i < j; i++)
        {
            ConnectionType connectiontype = aconnectiontype[i];
            if (connectiontype.stringValue.equals(s))
            {
                return connectiontype;
            }
        }

        return NOT_CONNECTED;
    }

    public static ConnectionType valueOf(String s)
    {
        return (ConnectionType)Enum.valueOf(com/addlive/service/ConnectionType, s);
    }

    public static ConnectionType[] values()
    {
        return (ConnectionType[])$VALUES.clone();
    }

    static 
    {
        NOT_CONNECTED = new ConnectionType("NOT_CONNECTED", 0, "MEDIA_TRANSPORT_TYPE_NOT_CONNECTED");
        UDP_RELAY = new ConnectionType("UDP_RELAY", 1, "MEDIA_TRANSPORT_TYPE_UDP_RELAY");
        UDP_P2P = new ConnectionType("UDP_P2P", 2, "MEDIA_TRANSPORT_TYPE_UDP_P2P");
        TCP_RELAY = new ConnectionType("TCP_RELAY", 3, "MEDIA_TRANSPORT_TYPE_TCP_RELAY");
        $VALUES = (new ConnectionType[] {
            NOT_CONNECTED, UDP_RELAY, UDP_P2P, TCP_RELAY
        });
    }
}
