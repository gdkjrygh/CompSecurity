// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a FAILED_CONNECTION_REFUSED;
    public static final a FAILED_CONNECT_MESSAGE;
    public static final a FAILED_CREATE_IOSTREAM;
    public static final a FAILED_DNS_UNRESOLVED;
    public static final a FAILED_INVALID_CONACK;
    public static final a FAILED_SOCKET_CONNECT_ERROR;
    public static final a FAILED_SOCKET_ERROR;
    public static final a FAILED_UNEXPECTED_DISCONNECT;
    public static final a MQTT_ERROR;
    public static final a NETWORK_ERROR;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/mqtt/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        NETWORK_ERROR = new a("NETWORK_ERROR", 0);
        MQTT_ERROR = new a("MQTT_ERROR", 1);
        FAILED_SOCKET_ERROR = new a("FAILED_SOCKET_ERROR", 2);
        FAILED_SOCKET_CONNECT_ERROR = new a("FAILED_SOCKET_CONNECT_ERROR", 3);
        FAILED_CONNECT_MESSAGE = new a("FAILED_CONNECT_MESSAGE", 4);
        FAILED_INVALID_CONACK = new a("FAILED_INVALID_CONACK", 5);
        FAILED_DNS_UNRESOLVED = new a("FAILED_DNS_UNRESOLVED", 6);
        FAILED_CREATE_IOSTREAM = new a("FAILED_CREATE_IOSTREAM", 7);
        FAILED_CONNECTION_REFUSED = new a("FAILED_CONNECTION_REFUSED", 8);
        FAILED_UNEXPECTED_DISCONNECT = new a("FAILED_UNEXPECTED_DISCONNECT", 9);
        $VALUES = (new a[] {
            NETWORK_ERROR, MQTT_ERROR, FAILED_SOCKET_ERROR, FAILED_SOCKET_CONNECT_ERROR, FAILED_CONNECT_MESSAGE, FAILED_INVALID_CONACK, FAILED_DNS_UNRESOLVED, FAILED_CREATE_IOSTREAM, FAILED_CONNECTION_REFUSED, FAILED_UNEXPECTED_DISCONNECT
        });
    }
}
