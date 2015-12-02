// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


public final class bu extends Enum
{

    private static final bu $VALUES[];
    public static final bu CONNECTED;
    public static final bu CONNECTING;
    public static final bu DISCONNECTED;

    private bu(String s, int i)
    {
        super(s, i);
    }

    public static bu valueOf(String s)
    {
        return (bu)Enum.valueOf(com/facebook/push/mqtt/bu, s);
    }

    public static bu[] values()
    {
        return (bu[])$VALUES.clone();
    }

    static 
    {
        CONNECTING = new bu("CONNECTING", 0);
        CONNECTED = new bu("CONNECTED", 1);
        DISCONNECTED = new bu("DISCONNECTED", 2);
        $VALUES = (new bu[] {
            CONNECTING, CONNECTED, DISCONNECTED
        });
    }
}
