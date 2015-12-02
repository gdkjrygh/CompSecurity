// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


final class m extends Enum
{

    private static final m $VALUES[];
    public static final m DISCONNECT;
    public static final m NETWORK_THREAD_LOOP;
    public static final m PING;
    public static final m PUBACK;
    public static final m PUBLISH;
    public static final m SUBSCRIBE;
    public static final m UNSUBSCRIBE;

    private m(String s, int i)
    {
        super(s, i);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/mqtt/m, s);
    }

    public static m[] values()
    {
        return (m[])$VALUES.clone();
    }

    static 
    {
        DISCONNECT = new m("DISCONNECT", 0);
        NETWORK_THREAD_LOOP = new m("NETWORK_THREAD_LOOP", 1);
        PUBLISH = new m("PUBLISH", 2);
        PUBACK = new m("PUBACK", 3);
        PING = new m("PING", 4);
        SUBSCRIBE = new m("SUBSCRIBE", 5);
        UNSUBSCRIBE = new m("UNSUBSCRIBE", 6);
        $VALUES = (new m[] {
            DISCONNECT, NETWORK_THREAD_LOOP, PUBLISH, PUBACK, PING, SUBSCRIBE, UNSUBSCRIBE
        });
    }
}
