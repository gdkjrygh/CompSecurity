// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;


// Referenced classes of package com.snapchat.android.model.chat:
//            StatefulChatFeedItem

public static final class  extends Enum
{

    private static final FAILED_TIMED_OUT $VALUES[];
    public static final FAILED_TIMED_OUT FAILED;
    public static final FAILED_TIMED_OUT FAILED_NON_RECOVERABLE;
    public static final FAILED_TIMED_OUT FAILED_NOTIFIED_USER;
    public static final FAILED_TIMED_OUT FAILED_TIMED_OUT;
    public static final FAILED_TIMED_OUT RECEIVED;
    public static final FAILED_TIMED_OUT RECEIVING;
    public static final FAILED_TIMED_OUT SENDING;
    public static final FAILED_TIMED_OUT SENT;
    public static final FAILED_TIMED_OUT UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/chat/StatefulChatFeedItem$SendReceiveStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        RECEIVING = new <init>("RECEIVING", 1);
        RECEIVED = new <init>("RECEIVED", 2);
        SENDING = new <init>("SENDING", 3);
        SENT = new <init>("SENT", 4);
        FAILED = new <init>("FAILED", 5);
        FAILED_NOTIFIED_USER = new <init>("FAILED_NOTIFIED_USER", 6);
        FAILED_NON_RECOVERABLE = new <init>("FAILED_NON_RECOVERABLE", 7);
        FAILED_TIMED_OUT = new <init>("FAILED_TIMED_OUT", 8);
        $VALUES = (new .VALUES[] {
            UNKNOWN, RECEIVING, RECEIVED, SENDING, SENT, FAILED, FAILED_NOTIFIED_USER, FAILED_NON_RECOVERABLE, FAILED_TIMED_OUT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
