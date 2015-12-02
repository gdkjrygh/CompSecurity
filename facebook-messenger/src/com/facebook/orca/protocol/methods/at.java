// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;


public final class at extends Enum
{

    private static final at $VALUES[];
    public static final at NONE;
    public static final at SEND_FAILED_PUBLISH_FAILED;
    public static final at SEND_FAILED_SERVER_RETURNED_FAILURE;
    public static final at SEND_FAILED_TIMED_OUT_AFTER_PUBLISH;
    public static final at SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE;
    public static final at SEND_FAILED_UNKNOWN_EXCEPTION;
    public static final at SEND_SKIPPED_ATTACHMENT;
    public static final at SEND_SKIPPED_ATTACHMENT_FBID;
    public static final at SEND_SKIPPED_NOT_CONNECTED;
    public final String message;

    private at(String s, int i, String s1)
    {
        super(s, i);
        message = s1;
    }

    public static at valueOf(String s)
    {
        return (at)Enum.valueOf(com/facebook/orca/protocol/methods/at, s);
    }

    public static at[] values()
    {
        return (at[])$VALUES.clone();
    }

    static 
    {
        NONE = new at("NONE", 0, null);
        SEND_SKIPPED_ATTACHMENT = new at("SEND_SKIPPED_ATTACHMENT", 1, "message has attachment");
        SEND_SKIPPED_ATTACHMENT_FBID = new at("SEND_SKIPPED_ATTACHMENT_FBID", 2, "message has object_attachment fbid");
        SEND_SKIPPED_NOT_CONNECTED = new at("SEND_SKIPPED_NOT_CONNECTED", 3, "MQTT not conencted");
        SEND_FAILED_TIMED_OUT_AFTER_PUBLISH = new at("SEND_FAILED_TIMED_OUT_AFTER_PUBLISH", 4, "timed out after publish");
        SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE = new at("SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE", 5, "timed out waiting for response");
        SEND_FAILED_SERVER_RETURNED_FAILURE = new at("SEND_FAILED_SERVER_RETURNED_FAILURE", 6, "server returned failure");
        SEND_FAILED_PUBLISH_FAILED = new at("SEND_FAILED_PUBLISH_FAILED", 7, "publish failed");
        SEND_FAILED_UNKNOWN_EXCEPTION = new at("SEND_FAILED_UNKNOWN_EXCEPTION", 8, "Failed to send via MQTT (%1$s)");
        $VALUES = (new at[] {
            NONE, SEND_SKIPPED_ATTACHMENT, SEND_SKIPPED_ATTACHMENT_FBID, SEND_SKIPPED_NOT_CONNECTED, SEND_FAILED_TIMED_OUT_AFTER_PUBLISH, SEND_FAILED_TIMED_OUT_WAITING_FOR_RESPONSE, SEND_FAILED_SERVER_RETURNED_FAILURE, SEND_FAILED_PUBLISH_FAILED, SEND_FAILED_UNKNOWN_EXCEPTION
        });
    }
}
