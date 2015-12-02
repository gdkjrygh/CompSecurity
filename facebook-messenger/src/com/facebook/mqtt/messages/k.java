// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.messages;

import com.google.common.a.ev;
import com.google.common.a.ew;

public final class k extends Enum
{

    private static final k $VALUES[];
    public static final k CONNACK;
    public static final k CONNECT;
    public static final k DISCONNECT;
    public static final k PINGREQ;
    public static final k PINGRESP;
    public static final k PUBACK;
    public static final k PUBCOMP;
    public static final k PUBLISH;
    public static final k PUBREC;
    public static final k PUBREL;
    public static final k SUBACK;
    public static final k SUBSCRIBE;
    public static final k UNSUBACK;
    public static final k UNSUBSCRIBE;
    private static final ev map;
    private final int value;

    private k(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static k fromInt(int i)
    {
        return (k)map.get(Integer.valueOf(i));
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/mqtt/messages/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    public int toInt()
    {
        return value;
    }

    static 
    {
        int i = 0;
        CONNECT = new k("CONNECT", 0, 1);
        CONNACK = new k("CONNACK", 1, 2);
        PUBLISH = new k("PUBLISH", 2, 3);
        PUBACK = new k("PUBACK", 3, 4);
        PUBREC = new k("PUBREC", 4, 5);
        PUBREL = new k("PUBREL", 5, 6);
        PUBCOMP = new k("PUBCOMP", 6, 7);
        SUBSCRIBE = new k("SUBSCRIBE", 7, 8);
        SUBACK = new k("SUBACK", 8, 9);
        UNSUBSCRIBE = new k("UNSUBSCRIBE", 9, 10);
        UNSUBACK = new k("UNSUBACK", 10, 11);
        PINGREQ = new k("PINGREQ", 11, 12);
        PINGRESP = new k("PINGRESP", 12, 13);
        DISCONNECT = new k("DISCONNECT", 13, 14);
        $VALUES = (new k[] {
            CONNECT, CONNACK, PUBLISH, PUBACK, PUBREC, PUBREL, PUBCOMP, SUBSCRIBE, SUBACK, UNSUBSCRIBE, 
            UNSUBACK, PINGREQ, PINGRESP, DISCONNECT
        });
        ew ew1 = ev.k();
        k ak[] = values();
        for (int j = ak.length; i < j; i++)
        {
            k k1 = ak[i];
            ew1.b(Integer.valueOf(k1.value), k1);
        }

        map = ew1.b();
    }
}
