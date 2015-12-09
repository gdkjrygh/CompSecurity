// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.protocol.enums;


public final class MessageType extends Enum
{

    public static final MessageType a;
    public static final MessageType b;
    public static final MessageType c;
    private static final MessageType d[];

    private MessageType(String s, int i)
    {
        super(s, i);
    }

    public static MessageType valueOf(String s)
    {
        return (MessageType)Enum.valueOf(com/ford/syncV4/protocol/enums/MessageType, s);
    }

    public static MessageType[] values()
    {
        return (MessageType[])d.clone();
    }

    static 
    {
        a = new MessageType("UNDEFINED", 0);
        b = new MessageType("BULK", 1);
        c = new MessageType("RPC", 2);
        d = (new MessageType[] {
            a, b, c
        });
    }
}
