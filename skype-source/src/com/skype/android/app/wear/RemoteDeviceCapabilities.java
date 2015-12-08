// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;


// Referenced classes of package com.skype.android.app.wear:
//            CommandPathEncoder

public class RemoteDeviceCapabilities
{
    public static final class RemoteCommands extends Enum
    {

        private static final RemoteCommands $VALUES[];
        public static final RemoteCommands CALL_RINGING_STATUS_COMMAND;
        public static final RemoteCommands DISMISS_EMOTICON_PICKER_COMMAND;
        public static final RemoteCommands DISPLAY_EMOTICON_PICKER_COMMAND;
        public static final RemoteCommands NOTIFY_CONTENT_CONVERSATIONS_HISTORY_UPDATED;
        public static final RemoteCommands NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED;
        public static final RemoteCommands NOTIFY_CONTENT_PACK_STATIC_BITMAPS_UPDATED;
        public static final RemoteCommands NOTIFY_CONTENT_RECENT_CONVO_LIST_JSON_DEFINITION_UPDATED;
        public static final RemoteCommands UPDATE_LIVE_CONVERSATION_INFO_COMMAND;
        public static final RemoteCommands UPDATE_RECENT_CONVERSATIONS_COMMAND;
        public static final RemoteCommands UPDATE_RECENT_COUNT_COMMAND;
        private final String commandId;
        private final CommandPathEncoder pathEncoder;

        public static RemoteCommands valueOf(String s)
        {
            return (RemoteCommands)Enum.valueOf(com/skype/android/app/wear/RemoteDeviceCapabilities$RemoteCommands, s);
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
            CALL_RINGING_STATUS_COMMAND = new RemoteCommands("CALL_RINGING_STATUS_COMMAND", 0, ".callRingingStatus", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            UPDATE_LIVE_CONVERSATION_INFO_COMMAND = new RemoteCommands("UPDATE_LIVE_CONVERSATION_INFO_COMMAND", 1, ".updateCall", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            DISPLAY_EMOTICON_PICKER_COMMAND = new RemoteCommands("DISPLAY_EMOTICON_PICKER_COMMAND", 2, ".displayEmoticonPicker", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            UPDATE_RECENT_COUNT_COMMAND = new RemoteCommands("UPDATE_RECENT_COUNT_COMMAND", 3, ".updateRecentCount", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED = new RemoteCommands("NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED", 4, ".notifyContentPackJsonDefinitionUpdated", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            NOTIFY_CONTENT_PACK_STATIC_BITMAPS_UPDATED = new RemoteCommands("NOTIFY_CONTENT_PACK_STATIC_BITMAPS_UPDATED", 5, ".notifyContentPackStaticBitmapsUpdated", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            DISMISS_EMOTICON_PICKER_COMMAND = new RemoteCommands("DISMISS_EMOTICON_PICKER_COMMAND", 6, ".dismissEmoticonPicker", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            UPDATE_RECENT_CONVERSATIONS_COMMAND = new RemoteCommands("UPDATE_RECENT_CONVERSATIONS_COMMAND", 7, ".updateRecentConversations", CommandPathEncoder.SIMPLE_PATH_ENCODER);
            NOTIFY_CONTENT_RECENT_CONVO_LIST_JSON_DEFINITION_UPDATED = new RemoteCommands("NOTIFY_CONTENT_RECENT_CONVO_LIST_JSON_DEFINITION_UPDATED", 8, ".notifyContentRecentConvoListJsonDefinitionUpdated", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            NOTIFY_CONTENT_CONVERSATIONS_HISTORY_UPDATED = new RemoteCommands("NOTIFY_CONTENT_CONVERSATIONS_HISTORY_UPDATED", 9, ".notifyContentConversationHistoryUpdated", CommandPathEncoder.DEFAULT_PATH_ENCODER);
            $VALUES = (new RemoteCommands[] {
                CALL_RINGING_STATUS_COMMAND, UPDATE_LIVE_CONVERSATION_INFO_COMMAND, DISPLAY_EMOTICON_PICKER_COMMAND, UPDATE_RECENT_COUNT_COMMAND, NOTIFY_CONTENT_PACK_JSON_DEFINITION_UPDATED, NOTIFY_CONTENT_PACK_STATIC_BITMAPS_UPDATED, DISMISS_EMOTICON_PICKER_COMMAND, UPDATE_RECENT_CONVERSATIONS_COMMAND, NOTIFY_CONTENT_RECENT_CONVO_LIST_JSON_DEFINITION_UPDATED, NOTIFY_CONTENT_CONVERSATIONS_HISTORY_UPDATED
            });
        }

        private RemoteCommands(String s, int i, String s1)
        {
            this(s, i, s1, CommandPathEncoder.DEFAULT_PATH_ENCODER);
        }

        private RemoteCommands(String s, int i, String s1, CommandPathEncoder commandpathencoder)
        {
            super(s, i);
            commandId = (new StringBuilder("com.skype.android.app.remote.cmd")).append(s1).toString();
            pathEncoder = commandpathencoder;
        }
    }


    private static final String REMOTE_COMMAND_PREFIX = "com.skype.android.app.remote.cmd";
    public static String WEAR_REMOTE_CONTROL_CAPABILITY = "WEAR_REMOTE_CONTROL_CAPABILITY";

    public RemoteDeviceCapabilities()
    {
    }

}
