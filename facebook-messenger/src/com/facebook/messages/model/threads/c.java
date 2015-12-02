// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c API;
    public static final c C2DM;
    public static final c CALL_LOG;
    public static final c MMS;
    public static final c MQTT;
    public static final c SEND;
    public static final c SMS;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/messages/model/threads/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        API = new c("API", 0);
        CALL_LOG = new c("CALL_LOG", 1);
        C2DM = new c("C2DM", 2);
        MQTT = new c("MQTT", 3);
        MMS = new c("MMS", 4);
        SEND = new c("SEND", 5);
        SMS = new c("SMS", 6);
        $VALUES = (new c[] {
            API, CALL_LOG, C2DM, MQTT, MMS, SEND, SMS
        });
    }
}
