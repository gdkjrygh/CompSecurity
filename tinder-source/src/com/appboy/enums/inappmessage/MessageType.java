// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums.inappmessage;


public final class MessageType extends Enum
{

    public static final MessageType FULL;
    public static final MessageType HTML_FULL;
    public static final MessageType MODAL;
    public static final MessageType SLIDEUP;
    private static final MessageType a[];

    private MessageType(String s, int i)
    {
        super(s, i);
    }

    public static MessageType valueOf(String s)
    {
        return (MessageType)Enum.valueOf(com/appboy/enums/inappmessage/MessageType, s);
    }

    public static MessageType[] values()
    {
        return (MessageType[])a.clone();
    }

    static 
    {
        SLIDEUP = new MessageType("SLIDEUP", 0);
        MODAL = new MessageType("MODAL", 1);
        FULL = new MessageType("FULL", 2);
        HTML_FULL = new MessageType("HTML_FULL", 3);
        a = (new MessageType[] {
            SLIDEUP, MODAL, FULL, HTML_FULL
        });
    }
}
