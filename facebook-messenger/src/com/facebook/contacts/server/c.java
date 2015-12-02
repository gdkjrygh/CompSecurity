// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c CALL_RECEIVED;
    public static final c CALL_SENT;
    public static final c MMS_RECEIVED;
    public static final c MMS_SENT;
    public static final c SMS_RECEIVED;
    public static final c SMS_SENT;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/contacts/server/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        SMS_SENT = new c("SMS_SENT", 0);
        SMS_RECEIVED = new c("SMS_RECEIVED", 1);
        MMS_SENT = new c("MMS_SENT", 2);
        MMS_RECEIVED = new c("MMS_RECEIVED", 3);
        CALL_SENT = new c("CALL_SENT", 4);
        CALL_RECEIVED = new c("CALL_RECEIVED", 5);
        $VALUES = (new c[] {
            SMS_SENT, SMS_RECEIVED, MMS_SENT, MMS_RECEIVED, CALL_SENT, CALL_RECEIVED
        });
    }
}
