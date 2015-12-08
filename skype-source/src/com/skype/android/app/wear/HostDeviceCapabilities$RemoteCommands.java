// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;


// Referenced classes of package com.skype.android.app.wear:
//            HostDeviceCapabilities, CommandPathEncoder

public static final class pathEncoder extends Enum
{

    private static final FETCH_CONVERSATION_HISTORY_COMMAND $VALUES[];
    public static final FETCH_CONVERSATION_HISTORY_COMMAND ANSWER_CALL_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND FETCH_CONVERSATION_HISTORY_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND FETCH_EMOTICON_PACK_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND FETCH_RECENT_CONVERSATIONS_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND GET_UNREAD_COUNT_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND HANG_UP_CALL_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND MUTE_CALL_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND OPEN_HUB_ON_PHONE_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND REJECT_CALL_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND SEND_CHAT_EMOTICON_COMMAND;
    public static final FETCH_CONVERSATION_HISTORY_COMMAND UNMUTE_CALL_COMMAND;
    private final String commandId;
    private final CommandPathEncoder pathEncoder;

    public static pathEncoder valueOf(String s)
    {
        return (pathEncoder)Enum.valueOf(com/skype/android/app/wear/HostDeviceCapabilities$RemoteCommands, s);
    }

    public static pathEncoder[] values()
    {
        return (pathEncoder[])$VALUES.clone();
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
        ANSWER_CALL_COMMAND = new <init>("ANSWER_CALL_COMMAND", 0, ".answerCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        REJECT_CALL_COMMAND = new <init>("REJECT_CALL_COMMAND", 1, ".rejectCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        HANG_UP_CALL_COMMAND = new <init>("HANG_UP_CALL_COMMAND", 2, ".hangUpCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        MUTE_CALL_COMMAND = new <init>("MUTE_CALL_COMMAND", 3, ".muteCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        UNMUTE_CALL_COMMAND = new <init>("UNMUTE_CALL_COMMAND", 4, ".unmuteCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        GET_UNREAD_COUNT_COMMAND = new <init>("GET_UNREAD_COUNT_COMMAND", 5, ".getUnreadCount", CommandPathEncoder.DEFAULT_PATH_ENCODER);
        OPEN_HUB_ON_PHONE_COMMAND = new <init>("OPEN_HUB_ON_PHONE_COMMAND", 6, ".openHubOnPhone", CommandPathEncoder.DEFAULT_PATH_ENCODER);
        SEND_CHAT_EMOTICON_COMMAND = new <init>("SEND_CHAT_EMOTICON_COMMAND", 7, ".sendChatEmoticon", CommandPathEncoder.ARGUMENT_PATH_ENCODER);
        FETCH_EMOTICON_PACK_COMMAND = new <init>("FETCH_EMOTICON_PACK_COMMAND", 8, ".fetchEmoticonPackStills", CommandPathEncoder.DEFAULT_PATH_ENCODER);
        FETCH_RECENT_CONVERSATIONS_COMMAND = new <init>("FETCH_RECENT_CONVERSATIONS_COMMAND", 9, ".fetchRecentConversations", CommandPathEncoder.DEFAULT_PATH_ENCODER);
        FETCH_CONVERSATION_HISTORY_COMMAND = new <init>("FETCH_CONVERSATION_HISTORY_COMMAND", 10, ".fetchConversationHistory", CommandPathEncoder.SIMPLE_PATH_ENCODER);
        $VALUES = (new .VALUES[] {
            ANSWER_CALL_COMMAND, REJECT_CALL_COMMAND, HANG_UP_CALL_COMMAND, MUTE_CALL_COMMAND, UNMUTE_CALL_COMMAND, GET_UNREAD_COUNT_COMMAND, OPEN_HUB_ON_PHONE_COMMAND, SEND_CHAT_EMOTICON_COMMAND, FETCH_EMOTICON_PACK_COMMAND, FETCH_RECENT_CONVERSATIONS_COMMAND, 
            FETCH_CONVERSATION_HISTORY_COMMAND
        });
    }

    private (String s, int i, String s1)
    {
        this(s, i, s1, CommandPathEncoder.DEFAULT_PATH_ENCODER);
    }

    private R(String s, int i, String s1, CommandPathEncoder commandpathencoder)
    {
        super(s, i);
        commandId = (new StringBuilder("com.skype.android.app.host.cmd")).append(s1).toString();
        pathEncoder = commandpathencoder;
    }
}
