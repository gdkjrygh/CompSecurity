// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatService

public static final class  extends Enum
{

    private static final SCCP_MESSAGE_QUEUE_FULL $VALUES[];
    public static final SCCP_MESSAGE_QUEUE_FULL NOT_FRIENDS;
    public static final SCCP_MESSAGE_QUEUE_FULL NO_CONNECTION;
    public static final SCCP_MESSAGE_QUEUE_FULL SCCP_CONNECTION_ENDED;
    public static final SCCP_MESSAGE_QUEUE_FULL SCCP_ERROR;
    public static final SCCP_MESSAGE_QUEUE_FULL SCCP_MESSAGE_QUEUE_FULL;
    public static final SCCP_MESSAGE_QUEUE_FULL SCCP_NACK;
    public static final SCCP_MESSAGE_QUEUE_FULL SCCP_TIMEOUT_ERROR;
    public static final SCCP_MESSAGE_QUEUE_FULL SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/chat/SecureChatService$SecureChatWriteCompletedCallback$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        NO_CONNECTION = new <init>("NO_CONNECTION", 1);
        NOT_FRIENDS = new <init>("NOT_FRIENDS", 2);
        SCCP_ERROR = new <init>("SCCP_ERROR", 3);
        SCCP_CONNECTION_ENDED = new <init>("SCCP_CONNECTION_ENDED", 4);
        SCCP_TIMEOUT_ERROR = new <init>("SCCP_TIMEOUT_ERROR", 5);
        SCCP_NACK = new <init>("SCCP_NACK", 6);
        SCCP_MESSAGE_QUEUE_FULL = new <init>("SCCP_MESSAGE_QUEUE_FULL", 7);
        $VALUES = (new .VALUES[] {
            SUCCESS, NO_CONNECTION, NOT_FRIENDS, SCCP_ERROR, SCCP_CONNECTION_ENDED, SCCP_TIMEOUT_ERROR, SCCP_NACK, SCCP_MESSAGE_QUEUE_FULL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
