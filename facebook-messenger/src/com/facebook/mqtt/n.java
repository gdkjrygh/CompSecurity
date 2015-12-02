// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


final class n extends Enum
{

    private static final n $VALUES[];
    public static final n CONNECTED;
    public static final n CONNECTING;
    public static final n DISCONNECTED;
    public static final n INIT;

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/facebook/mqtt/n, s);
    }

    public static n[] values()
    {
        return (n[])$VALUES.clone();
    }

    static 
    {
        INIT = new n("INIT", 0);
        CONNECTING = new n("CONNECTING", 1);
        CONNECTED = new n("CONNECTED", 2);
        DISCONNECTED = new n("DISCONNECTED", 3);
        $VALUES = (new n[] {
            INIT, CONNECTING, CONNECTED, DISCONNECTED
        });
    }
}
