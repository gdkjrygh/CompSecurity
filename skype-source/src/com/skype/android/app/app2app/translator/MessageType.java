// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app.translator;


public final class MessageType extends Enum
{

    private static final MessageType $VALUES[];
    public static final MessageType MESSAGE_ID;
    public static final MessageType NOT_USED;
    public static final MessageType PARTNER_ID;
    public static final MessageType TRANSCRIBED_TEXT;
    public static final MessageType TRANSLATOR_TYPE;

    private MessageType(String s, int i)
    {
        super(s, i);
    }

    public static MessageType valueOf(String s)
    {
        return (MessageType)Enum.valueOf(com/skype/android/app/app2app/translator/MessageType, s);
    }

    public static MessageType[] values()
    {
        return (MessageType[])$VALUES.clone();
    }

    static 
    {
        NOT_USED = new MessageType("NOT_USED", 0);
        MESSAGE_ID = new MessageType("MESSAGE_ID", 1);
        TRANSLATOR_TYPE = new MessageType("TRANSLATOR_TYPE", 2);
        PARTNER_ID = new MessageType("PARTNER_ID", 3);
        TRANSCRIBED_TEXT = new MessageType("TRANSCRIBED_TEXT", 4);
        $VALUES = (new MessageType[] {
            NOT_USED, MESSAGE_ID, TRANSLATOR_TYPE, PARTNER_ID, TRANSCRIBED_TEXT
        });
    }
}
