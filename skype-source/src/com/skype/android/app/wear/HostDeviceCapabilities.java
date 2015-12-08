// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;


// Referenced classes of package com.skype.android.app.wear:
//            CommandPathEncoder

public class HostDeviceCapabilities
{
    public static final class RemoteCommands extends Enum
    {

        private static final RemoteCommands $VALUES[];
        public static final RemoteCommands ANSWER_CALL_COMMAND;
        public static final RemoteCommands FETCH_CONVERSATION_HISTORY_COMMAND;
        public static final RemoteCommands FETCH_EMOTICON_PACK_COMMAND;
        public static final RemoteCommands FETCH_RECENT_CONVERSATIONS_COMMAND;
        public static final RemoteCommands GET_UNREAD_COUNT_COMMAND;
        public static final RemoteCommands HANG_UP_CALL_COMMAND;
        public static final RemoteCommands MUTE_CALL_COMMAND;
        public static final RemoteCommands OPEN_HUB_ON_PHONE_COMMAND;
        public static final RemoteCommands REJECT_CALL_COMMAND;
        public static final RemoteCommands SEND_CHAT_EMOTICON_COMMAND;
        public static final RemoteCommands UNMUTE_CALL_COMMAND;
        private final String commandId;
        private final CommandPathEncoder pathEncoder;

        public static RemoteCommands valueOf(String s)
        {
            return (RemoteCommands)Enum.valueOf(com/skype/android/app/wear/HostDeviceCapabilities$RemoteCommands, s);
        }

        public static RemoteCommands[] values()
        {
            return (RemoteCommands[])$VALUES.clone();
        }

        public final String getCommand()
        {
            return commandId;
        }

        public final transient String getCommandPath(Object aobj[])
        {
            return pathEncoder.encode(commandId, aobj);
        }

        static 
        {
            ANSWER_CALL_COMMAND = new RemoteCommands("ANSWER_CALL_COMMAND", 0, ".answerCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            REJECT_CALL_COMMAND = new RemoteCommands("REJECT_CALL_COMMAND", 1, ".rejectCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            HANG_UP_CALL_COMMAND = new RemoteCommands("HANG_UP_CALL_COMMAND", 2, ".hangUpCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            MUTE_CALL_COMMAND = new RemoteCommands("MUTE_CALL_COMMAND", 3, ".muteCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            UNMUTE_CALL_COMMAND = new RemoteCommands("UNMUTE_CALL_COMMAND", 4, ".unmuteCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            GET_UNREAD_COUNT_COMMAND = new RemoteCommands("GET_UNREAD_COUNT_COMMAND", 5, ".getUnreadCount", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            OPEN_HUB_ON_PHONE_COMMAND = new RemoteCommands("OPEN_HUB_ON_PHONE_COMMAND", 6, ".openHubOnPhone", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            SEND_CHAT_EMOTICON_COMMAND = new RemoteCommands("SEND_CHAT_EMOTICON_COMMAND", 7, ".sendChatEmoticon", CommandPathEncoder.ARGUMENT_PATH_ENCODER);
            FETCH_EMOTICON_PACK_COMMAND = new RemoteCommands("FETCH_EMOTICON_PACK_COMMAND", 8, ".fetchEmoticonPackStills", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            FETCH_RECENT_CONVERSATIONS_COMMAND = new RemoteCommands("FETCH_RECENT_CONVERSATIONS_COMMAND", 9, ".fetchRecentConversations", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            FETCH_CONVERSATION_HISTORY_COMMAND = new RemoteCommands("FETCH_CONVERSATION_HISTORY_COMMAND", 10, ".fetchConversationHistory", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            $VALUES = (new RemoteCommands[] {
                ANSWER_CALL_COMMAND, REJECT_CALL_COMMAND, HANG_UP_CALL_COMMAND, MUTE_CALL_COMMAND, UNMUTE_CALL_COMMAND, GET_UNREAD_COUNT_COMMAND, OPEN_HUB_ON_PHONE_COMMAND, SEND_CHAT_EMOTICON_COMMAND, FETCH_EMOTICON_PACK_COMMAND, FETCH_RECENT_CONVERSATIONS_COMMAND, 
                FETCH_CONVERSATION_HISTORY_COMMAND
            });
        }

        private RemoteCommands(String s, int i, String s1)
        {
            this(s, i, s1, CommandPathEncoder.DEFAULT_PATH_ENCODER);
        }

        private RemoteCommands(String s, int i, String s1, CommandPathEncoder commandpathencoder)
        {
            super(s, i);
            commandId = (new StringBuilder("com.skype.android.app.host.cmd")).append(s1).toString();
            pathEncoder = commandpathencoder;
        }
    }


    private static final String HOST_COMMAND_PREFIX = "com.skype.android.app.host.cmd";
    public static String HOST_REMOTE_CONTROL_CAPABILITY = "HOST_REMOTE_CONTROL_CAPABILITY";

    public HostDeviceCapabilities()
    {
    }

}
