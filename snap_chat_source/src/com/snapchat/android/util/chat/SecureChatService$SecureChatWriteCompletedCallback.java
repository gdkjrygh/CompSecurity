// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatService

public static interface Status
{
    public static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status NOT_FRIENDS;
        public static final Status NO_CONNECTION;
        public static final Status SCCP_CONNECTION_ENDED;
        public static final Status SCCP_ERROR;
        public static final Status SCCP_MESSAGE_QUEUE_FULL;
        public static final Status SCCP_NACK;
        public static final Status SCCP_TIMEOUT_ERROR;
        public static final Status SUCCESS;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/snapchat/android/util/chat/SecureChatService$SecureChatWriteCompletedCallback$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            SUCCESS = new Status("SUCCESS", 0);
            NO_CONNECTION = new Status("NO_CONNECTION", 1);
            NOT_FRIENDS = new Status("NOT_FRIENDS", 2);
            SCCP_ERROR = new Status("SCCP_ERROR", 3);
            SCCP_CONNECTION_ENDED = new Status("SCCP_CONNECTION_ENDED", 4);
            SCCP_TIMEOUT_ERROR = new Status("SCCP_TIMEOUT_ERROR", 5);
            SCCP_NACK = new Status("SCCP_NACK", 6);
            SCCP_MESSAGE_QUEUE_FULL = new Status("SCCP_MESSAGE_QUEUE_FULL", 7);
            $VALUES = (new Status[] {
                SUCCESS, NO_CONNECTION, NOT_FRIENDS, SCCP_ERROR, SCCP_CONNECTION_ENDED, SCCP_TIMEOUT_ERROR, SCCP_NACK, SCCP_MESSAGE_QUEUE_FULL
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void a(boolean flag, Status status, String s);
}
