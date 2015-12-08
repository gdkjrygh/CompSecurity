// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, MediaDocument, PROPKEY, NativeStringConvert

public interface Conversation
    extends ObjectInterface
{
    public static final class ALLOWED_ACTIVITY extends Enum
    {

        private static final ALLOWED_ACTIVITY $VALUES[];
        public static final ALLOWED_ACTIVITY ADD_CONSUMERS;
        public static final ALLOWED_ACTIVITY DELETE_OTHERS_MESSAGES;
        public static final ALLOWED_ACTIVITY SET_META;
        public static final ALLOWED_ACTIVITY SPEAK;
        public static final ALLOWED_ACTIVITY SPEAK_AND_WRITE;
        public static final ALLOWED_ACTIVITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static ALLOWED_ACTIVITY fromInt(int i)
        {
            ALLOWED_ACTIVITY allowed_activity = (ALLOWED_ACTIVITY)intToTypeMap.a(i);
            if (allowed_activity != null)
            {
                return allowed_activity;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static ALLOWED_ACTIVITY valueOf(String s)
        {
            return (ALLOWED_ACTIVITY)Enum.valueOf(com/skype/Conversation$ALLOWED_ACTIVITY, s);
        }

        public static ALLOWED_ACTIVITY[] values()
        {
            return (ALLOWED_ACTIVITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SET_META = new ALLOWED_ACTIVITY("SET_META", 0, 1);
            ADD_CONSUMERS = new ALLOWED_ACTIVITY("ADD_CONSUMERS", 1, 2);
            SPEAK = new ALLOWED_ACTIVITY("SPEAK", 2, 4);
            SPEAK_AND_WRITE = new ALLOWED_ACTIVITY("SPEAK_AND_WRITE", 3, 8);
            DELETE_OTHERS_MESSAGES = new ALLOWED_ACTIVITY("DELETE_OTHERS_MESSAGES", 4, 16);
            WRAPPER_UNKNOWN_VALUE = new ALLOWED_ACTIVITY("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new ALLOWED_ACTIVITY[] {
                SET_META, ADD_CONSUMERS, SPEAK, SPEAK_AND_WRITE, DELETE_OTHERS_MESSAGES, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            ALLOWED_ACTIVITY aallowed_activity[] = values();
            int k = aallowed_activity.length;
            for (int i = 0; i < k; i++)
            {
                ALLOWED_ACTIVITY allowed_activity = aallowed_activity[i];
                intToTypeMap.a(allowed_activity.value, allowed_activity);
            }

        }

        private ALLOWED_ACTIVITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CALL_END_ACTION extends Enum
    {

        private static final CALL_END_ACTION $VALUES[];
        public static final CALL_END_ACTION END_NORMAL;
        public static final CALL_END_ACTION END_TIMED_OUT;
        public static final CALL_END_ACTION END_VOICE_MAIL;
        public static final CALL_END_ACTION WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALL_END_ACTION fromInt(int i)
        {
            CALL_END_ACTION call_end_action = (CALL_END_ACTION)intToTypeMap.a(i);
            if (call_end_action != null)
            {
                return call_end_action;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALL_END_ACTION valueOf(String s)
        {
            return (CALL_END_ACTION)Enum.valueOf(com/skype/Conversation$CALL_END_ACTION, s);
        }

        public static CALL_END_ACTION[] values()
        {
            return (CALL_END_ACTION[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            END_NORMAL = new CALL_END_ACTION("END_NORMAL", 0, 0);
            END_VOICE_MAIL = new CALL_END_ACTION("END_VOICE_MAIL", 1, 1);
            END_TIMED_OUT = new CALL_END_ACTION("END_TIMED_OUT", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new CALL_END_ACTION("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CALL_END_ACTION[] {
                END_NORMAL, END_VOICE_MAIL, END_TIMED_OUT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALL_END_ACTION acall_end_action[] = values();
            int k = acall_end_action.length;
            for (int i = 0; i < k; i++)
            {
                CALL_END_ACTION call_end_action = acall_end_action[i];
                intToTypeMap.a(call_end_action.value, call_end_action);
            }

        }

        private CALL_END_ACTION(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CALL_TECHNOLOGY extends Enum
    {

        private static final CALL_TECHNOLOGY $VALUES[];
        public static final CALL_TECHNOLOGY CALL_NGC;
        public static final CALL_TECHNOLOGY CALL_NONE;
        public static final CALL_TECHNOLOGY CALL_P2P;
        public static final CALL_TECHNOLOGY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALL_TECHNOLOGY fromInt(int i)
        {
            CALL_TECHNOLOGY call_technology = (CALL_TECHNOLOGY)intToTypeMap.a(i);
            if (call_technology != null)
            {
                return call_technology;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALL_TECHNOLOGY valueOf(String s)
        {
            return (CALL_TECHNOLOGY)Enum.valueOf(com/skype/Conversation$CALL_TECHNOLOGY, s);
        }

        public static CALL_TECHNOLOGY[] values()
        {
            return (CALL_TECHNOLOGY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CALL_NONE = new CALL_TECHNOLOGY("CALL_NONE", 0, 0);
            CALL_P2P = new CALL_TECHNOLOGY("CALL_P2P", 1, 1);
            CALL_NGC = new CALL_TECHNOLOGY("CALL_NGC", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new CALL_TECHNOLOGY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CALL_TECHNOLOGY[] {
                CALL_NONE, CALL_P2P, CALL_NGC, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALL_TECHNOLOGY acall_technology[] = values();
            int k = acall_technology.length;
            for (int i = 0; i < k; i++)
            {
                CALL_TECHNOLOGY call_technology = acall_technology[i];
                intToTypeMap.a(call_technology.value, call_technology);
            }

        }

        private CALL_TECHNOLOGY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CAPABILITY extends Enum
    {

        private static final CAPABILITY $VALUES[];
        public static final CAPABILITY CAN_ADD;
        public static final CAPABILITY CAN_CHANGE_PICTURE;
        public static final CAPABILITY CAN_CHANGE_TOPIC;
        public static final CAPABILITY CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION;
        public static final CAPABILITY CAN_CHECK_QUALITY;
        public static final CAPABILITY CAN_DELETE_OTHERS_MESSAGES;
        public static final CAPABILITY CAN_EDIT_MYSELF;
        public static final CAPABILITY CAN_EDIT_OTHERS;
        public static final CAPABILITY CAN_GO_LIVE;
        public static final CAPABILITY CAN_HOLD_LIVE_SESSION;
        public static final CAPABILITY CAN_KICK;
        public static final CAPABILITY CAN_RETIRE;
        public static final CAPABILITY CAN_RING;
        public static final CAPABILITY CAN_RING_ALL;
        public static final CAPABILITY CAN_RING_PSTN;
        public static final CAPABILITY CAN_RING_TRANSLATED;
        public static final CAPABILITY CAN_RING_VIDEO;
        public static final CAPABILITY CAN_SEND_ANNOTATION;
        public static final CAPABILITY CAN_SEND_CONTACTS;
        public static final CAPABILITY CAN_SEND_FILE;
        public static final CAPABILITY CAN_SEND_MEDIAMESSAGE;
        public static final CAPABILITY CAN_SEND_SMS;
        public static final CAPABILITY CAN_SEND_STATIC_LOCATION_MESSAGE;
        public static final CAPABILITY CAN_SEND_TEXT;
        public static final CAPABILITY CAN_SEND_TRANSLATED_TEXT;
        public static final CAPABILITY CAN_SEND_VIDEOMESSAGE;
        public static final CAPABILITY CAN_SEND_VOICEMAIL;
        public static final CAPABILITY CAN_SHARE_SCREEN;
        public static final CAPABILITY CAN_SPAWN;
        public static final CAPABILITY CAPABILITY_COUNT;
        public static final CAPABILITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CAPABILITY fromInt(int i)
        {
            CAPABILITY capability = (CAPABILITY)intToTypeMap.a(i);
            if (capability != null)
            {
                return capability;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CAPABILITY valueOf(String s)
        {
            return (CAPABILITY)Enum.valueOf(com/skype/Conversation$CAPABILITY, s);
        }

        public static CAPABILITY[] values()
        {
            return (CAPABILITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CAN_GO_LIVE = new CAPABILITY("CAN_GO_LIVE", 0, 0);
            CAN_RING = new CAPABILITY("CAN_RING", 1, 1);
            CAN_RING_ALL = new CAPABILITY("CAN_RING_ALL", 2, 2);
            CAN_RING_VIDEO = new CAPABILITY("CAN_RING_VIDEO", 3, 3);
            CAN_RING_PSTN = new CAPABILITY("CAN_RING_PSTN", 4, 4);
            CAN_SHARE_SCREEN = new CAPABILITY("CAN_SHARE_SCREEN", 5, 5);
            CAN_HOLD_LIVE_SESSION = new CAPABILITY("CAN_HOLD_LIVE_SESSION", 6, 6);
            CAN_CHECK_QUALITY = new CAPABILITY("CAN_CHECK_QUALITY", 7, 7);
            CAN_SEND_SMS = new CAPABILITY("CAN_SEND_SMS", 8, 8);
            CAN_SEND_TEXT = new CAPABILITY("CAN_SEND_TEXT", 9, 9);
            CAN_SEND_FILE = new CAPABILITY("CAN_SEND_FILE", 10, 10);
            CAN_SEND_VOICEMAIL = new CAPABILITY("CAN_SEND_VOICEMAIL", 11, 11);
            CAN_SEND_CONTACTS = new CAPABILITY("CAN_SEND_CONTACTS", 12, 12);
            CAN_EDIT_MYSELF = new CAPABILITY("CAN_EDIT_MYSELF", 13, 13);
            CAN_EDIT_OTHERS = new CAPABILITY("CAN_EDIT_OTHERS", 14, 14);
            CAN_CHANGE_TOPIC = new CAPABILITY("CAN_CHANGE_TOPIC", 15, 15);
            CAN_CHANGE_PICTURE = new CAPABILITY("CAN_CHANGE_PICTURE", 16, 16);
            CAN_ADD = new CAPABILITY("CAN_ADD", 17, 17);
            CAN_RETIRE = new CAPABILITY("CAN_RETIRE", 18, 18);
            CAN_KICK = new CAPABILITY("CAN_KICK", 19, 19);
            CAN_SPAWN = new CAPABILITY("CAN_SPAWN", 20, 20);
            CAN_SEND_VIDEOMESSAGE = new CAPABILITY("CAN_SEND_VIDEOMESSAGE", 21, 21);
            CAN_SEND_MEDIAMESSAGE = new CAPABILITY("CAN_SEND_MEDIAMESSAGE", 22, 22);
            CAN_SEND_STATIC_LOCATION_MESSAGE = new CAPABILITY("CAN_SEND_STATIC_LOCATION_MESSAGE", 23, 23);
            CAN_DELETE_OTHERS_MESSAGES = new CAPABILITY("CAN_DELETE_OTHERS_MESSAGES", 24, 24);
            CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION = new CAPABILITY("CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION", 25, 25);
            CAN_SEND_ANNOTATION = new CAPABILITY("CAN_SEND_ANNOTATION", 26, 26);
            CAN_RING_TRANSLATED = new CAPABILITY("CAN_RING_TRANSLATED", 27, 27);
            CAN_SEND_TRANSLATED_TEXT = new CAPABILITY("CAN_SEND_TRANSLATED_TEXT", 28, 28);
            CAPABILITY_COUNT = new CAPABILITY("CAPABILITY_COUNT", 29, 29);
            WRAPPER_UNKNOWN_VALUE = new CAPABILITY("WRAPPER_UNKNOWN_VALUE", 30, 0x7fffffff);
            $VALUES = (new CAPABILITY[] {
                CAN_GO_LIVE, CAN_RING, CAN_RING_ALL, CAN_RING_VIDEO, CAN_RING_PSTN, CAN_SHARE_SCREEN, CAN_HOLD_LIVE_SESSION, CAN_CHECK_QUALITY, CAN_SEND_SMS, CAN_SEND_TEXT, 
                CAN_SEND_FILE, CAN_SEND_VOICEMAIL, CAN_SEND_CONTACTS, CAN_EDIT_MYSELF, CAN_EDIT_OTHERS, CAN_CHANGE_TOPIC, CAN_CHANGE_PICTURE, CAN_ADD, CAN_RETIRE, CAN_KICK, 
                CAN_SPAWN, CAN_SEND_VIDEOMESSAGE, CAN_SEND_MEDIAMESSAGE, CAN_SEND_STATIC_LOCATION_MESSAGE, CAN_DELETE_OTHERS_MESSAGES, CAN_CHECK_PREMIUM_VIDEO_SUBSCRIPTION, CAN_SEND_ANNOTATION, CAN_RING_TRANSLATED, CAN_SEND_TRANSLATED_TEXT, CAPABILITY_COUNT, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CAPABILITY acapability[] = values();
            int k = acapability.length;
            for (int i = 0; i < k; i++)
            {
                CAPABILITY capability = acapability[i];
                intToTypeMap.a(capability.value, capability);
            }

        }

        private CAPABILITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface ConversationIListener
    {

        public abstract void onCallQualityFeedbackRequested(Conversation conversation, String s, String s1, String s2);

        public abstract void onCapabilitiesChanged(Conversation conversation, boolean aflag[]);

        public abstract void onEventMessage(Conversation conversation, EVENT_MESSAGE_TYPE event_message_type, String s);

        public abstract void onLiveSessionEvent(Conversation conversation, LIVE_SESSION_EVENT live_session_event);

        public abstract void onLiveSessionMoved(Conversation conversation, int i);

        public abstract void onMessage(Conversation conversation, int i);

        public abstract void onParticipantListChange(Conversation conversation);

        public abstract void onPendingMediaDocumentsListChanged(Conversation conversation);

        public abstract void onPremiumVideoSubscriptionCheckResult(Conversation conversation, int i, PREMIUM_VIDEO_STATUS premium_video_status);

        public abstract void onSpawnConference(Conversation conversation, int i);
    }

    public static final class EVENT_MESSAGE_TYPE extends Enum
    {

        private static final EVENT_MESSAGE_TYPE $VALUES[];
        public static final EVENT_MESSAGE_TYPE INK;
        public static final EVENT_MESSAGE_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static EVENT_MESSAGE_TYPE fromInt(int i)
        {
            EVENT_MESSAGE_TYPE event_message_type = (EVENT_MESSAGE_TYPE)intToTypeMap.a(i);
            if (event_message_type != null)
            {
                return event_message_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static EVENT_MESSAGE_TYPE valueOf(String s)
        {
            return (EVENT_MESSAGE_TYPE)Enum.valueOf(com/skype/Conversation$EVENT_MESSAGE_TYPE, s);
        }

        public static EVENT_MESSAGE_TYPE[] values()
        {
            return (EVENT_MESSAGE_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            INK = new EVENT_MESSAGE_TYPE("INK", 0, 1);
            WRAPPER_UNKNOWN_VALUE = new EVENT_MESSAGE_TYPE("WRAPPER_UNKNOWN_VALUE", 1, 0x7fffffff);
            $VALUES = (new EVENT_MESSAGE_TYPE[] {
                INK, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            EVENT_MESSAGE_TYPE aevent_message_type[] = values();
            int k = aevent_message_type.length;
            for (int i = 0; i < k; i++)
            {
                EVENT_MESSAGE_TYPE event_message_type = aevent_message_type[i];
                intToTypeMap.a(event_message_type.value, event_message_type);
            }

        }

        private EVENT_MESSAGE_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class GetLastMessages_Result
    {

        public int m_contextMessageObjectIDList[];
        public int m_unconsumedMessageObjectIDList[];

        public void init(int ai[], int ai1[])
        {
            m_contextMessageObjectIDList = ai;
            m_unconsumedMessageObjectIDList = ai1;
        }

        public GetLastMessages_Result()
        {
        }
    }

    public static class GetParticipants_Result
    {

        public int m_participantObjectIDList[];

        public void init(int ai[])
        {
            m_participantObjectIDList = ai;
        }

        public GetParticipants_Result()
        {
        }
    }

    public static class GetPendingMediaDocumentsList_Result
    {

        public int m_documents[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_documents = ai;
            m_return = flag;
        }

        public GetPendingMediaDocumentsList_Result()
        {
        }
    }

    public static final class LIST_TYPE extends Enum
    {

        private static final LIST_TYPE $VALUES[];
        public static final LIST_TYPE ALL_CONVERSATIONS;
        public static final LIST_TYPE BOOKMARKED_CONVERSATIONS;
        public static final LIST_TYPE INBOX_CONVERSATIONS;
        public static final LIST_TYPE LIVE_CONVERSATIONS;
        public static final LIST_TYPE PINNED_CONVERSATIONS;
        public static final LIST_TYPE REALLY_ALL_CONVERSATIONS;
        public static final LIST_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIST_TYPE fromInt(int i)
        {
            LIST_TYPE list_type = (LIST_TYPE)intToTypeMap.a(i);
            if (list_type != null)
            {
                return list_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIST_TYPE valueOf(String s)
        {
            return (LIST_TYPE)Enum.valueOf(com/skype/Conversation$LIST_TYPE, s);
        }

        public static LIST_TYPE[] values()
        {
            return (LIST_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL_CONVERSATIONS = new LIST_TYPE("ALL_CONVERSATIONS", 0, 0);
            INBOX_CONVERSATIONS = new LIST_TYPE("INBOX_CONVERSATIONS", 1, 1);
            BOOKMARKED_CONVERSATIONS = new LIST_TYPE("BOOKMARKED_CONVERSATIONS", 2, 2);
            LIVE_CONVERSATIONS = new LIST_TYPE("LIVE_CONVERSATIONS", 3, 3);
            PINNED_CONVERSATIONS = new LIST_TYPE("PINNED_CONVERSATIONS", 4, 4);
            REALLY_ALL_CONVERSATIONS = new LIST_TYPE("REALLY_ALL_CONVERSATIONS", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new LIST_TYPE("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new LIST_TYPE[] {
                ALL_CONVERSATIONS, INBOX_CONVERSATIONS, BOOKMARKED_CONVERSATIONS, LIVE_CONVERSATIONS, PINNED_CONVERSATIONS, REALLY_ALL_CONVERSATIONS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIST_TYPE alist_type[] = values();
            int k = alist_type.length;
            for (int i = 0; i < k; i++)
            {
                LIST_TYPE list_type = alist_type[i];
                intToTypeMap.a(list_type.value, list_type);
            }

        }

        private LIST_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LIVE_SESSION_EVENT extends Enum
    {

        private static final LIVE_SESSION_EVENT $VALUES[];
        public static final LIVE_SESSION_EVENT DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT;
        public static final LIVE_SESSION_EVENT USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT;
        public static final LIVE_SESSION_EVENT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIVE_SESSION_EVENT fromInt(int i)
        {
            LIVE_SESSION_EVENT live_session_event = (LIVE_SESSION_EVENT)intToTypeMap.a(i);
            if (live_session_event != null)
            {
                return live_session_event;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIVE_SESSION_EVENT valueOf(String s)
        {
            return (LIVE_SESSION_EVENT)Enum.valueOf(com/skype/Conversation$LIVE_SESSION_EVENT, s);
        }

        public static LIVE_SESSION_EVENT[] values()
        {
            return (LIVE_SESSION_EVENT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT = new LIVE_SESSION_EVENT("DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT", 0, 0);
            USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT = new LIVE_SESSION_EVENT("USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new LIVE_SESSION_EVENT("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new LIVE_SESSION_EVENT[] {
                DOWNGRADED_TO_AUDIO_BECAUSE_OF_VIDEO_PARTICIPANTS_LIMIT, USER_REJECTED_BECAUSE_OF_CONF_PARTICIPANTS_LIMIT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIVE_SESSION_EVENT alive_session_event[] = values();
            int k = alive_session_event.length;
            for (int i = 0; i < k; i++)
            {
                LIVE_SESSION_EVENT live_session_event = alive_session_event[i];
                intToTypeMap.a(live_session_event.value, live_session_event);
            }

        }

        private LIVE_SESSION_EVENT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LOCAL_LIVESTATUS extends Enum
    {

        private static final LOCAL_LIVESTATUS $VALUES[];
        public static final LOCAL_LIVESTATUS ACTIVATING;
        public static final LOCAL_LIVESTATUS IM_LIVE;
        public static final LOCAL_LIVESTATUS NONE;
        public static final LOCAL_LIVESTATUS ON_HOLD_LOCALLY;
        public static final LOCAL_LIVESTATUS ON_HOLD_REMOTELY;
        public static final LOCAL_LIVESTATUS OTHERS_ARE_LIVE;
        public static final LOCAL_LIVESTATUS OTHERS_ARE_LIVE_FULL;
        public static final LOCAL_LIVESTATUS PLAYING_VOICE_MESSAGE;
        public static final LOCAL_LIVESTATUS RECENTLY_LIVE;
        public static final LOCAL_LIVESTATUS RECORDING_VOICE_MESSAGE;
        public static final LOCAL_LIVESTATUS RINGING_FOR_ME;
        public static final LOCAL_LIVESTATUS STARTING;
        public static final LOCAL_LIVESTATUS TRANSFERRING;
        public static final LOCAL_LIVESTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LOCAL_LIVESTATUS fromInt(int i)
        {
            LOCAL_LIVESTATUS local_livestatus = (LOCAL_LIVESTATUS)intToTypeMap.a(i);
            if (local_livestatus != null)
            {
                return local_livestatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LOCAL_LIVESTATUS valueOf(String s)
        {
            return (LOCAL_LIVESTATUS)Enum.valueOf(com/skype/Conversation$LOCAL_LIVESTATUS, s);
        }

        public static LOCAL_LIVESTATUS[] values()
        {
            return (LOCAL_LIVESTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NONE = new LOCAL_LIVESTATUS("NONE", 0, 0);
            STARTING = new LOCAL_LIVESTATUS("STARTING", 1, 1);
            RINGING_FOR_ME = new LOCAL_LIVESTATUS("RINGING_FOR_ME", 2, 2);
            IM_LIVE = new LOCAL_LIVESTATUS("IM_LIVE", 3, 3);
            ON_HOLD_LOCALLY = new LOCAL_LIVESTATUS("ON_HOLD_LOCALLY", 4, 5);
            ON_HOLD_REMOTELY = new LOCAL_LIVESTATUS("ON_HOLD_REMOTELY", 5, 6);
            OTHERS_ARE_LIVE = new LOCAL_LIVESTATUS("OTHERS_ARE_LIVE", 6, 7);
            OTHERS_ARE_LIVE_FULL = new LOCAL_LIVESTATUS("OTHERS_ARE_LIVE_FULL", 7, 11);
            PLAYING_VOICE_MESSAGE = new LOCAL_LIVESTATUS("PLAYING_VOICE_MESSAGE", 8, 8);
            RECORDING_VOICE_MESSAGE = new LOCAL_LIVESTATUS("RECORDING_VOICE_MESSAGE", 9, 9);
            RECENTLY_LIVE = new LOCAL_LIVESTATUS("RECENTLY_LIVE", 10, 10);
            TRANSFERRING = new LOCAL_LIVESTATUS("TRANSFERRING", 11, 12);
            ACTIVATING = new LOCAL_LIVESTATUS("ACTIVATING", 12, 13);
            WRAPPER_UNKNOWN_VALUE = new LOCAL_LIVESTATUS("WRAPPER_UNKNOWN_VALUE", 13, 0x7fffffff);
            $VALUES = (new LOCAL_LIVESTATUS[] {
                NONE, STARTING, RINGING_FOR_ME, IM_LIVE, ON_HOLD_LOCALLY, ON_HOLD_REMOTELY, OTHERS_ARE_LIVE, OTHERS_ARE_LIVE_FULL, PLAYING_VOICE_MESSAGE, RECORDING_VOICE_MESSAGE, 
                RECENTLY_LIVE, TRANSFERRING, ACTIVATING, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LOCAL_LIVESTATUS alocal_livestatus[] = values();
            int k = alocal_livestatus.length;
            for (int i = 0; i < k; i++)
            {
                LOCAL_LIVESTATUS local_livestatus = alocal_livestatus[i];
                intToTypeMap.a(local_livestatus.value, local_livestatus);
            }

        }

        private LOCAL_LIVESTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class LoadMessages_Result
    {

        public int m_messageObjectIDList[];

        public void init(int ai[])
        {
            m_messageObjectIDList = ai;
        }

        public LoadMessages_Result()
        {
        }
    }

    public static final class MY_STATUS extends Enum
    {

        private static final MY_STATUS $VALUES[];
        public static final MY_STATUS APPLICANT;
        public static final MY_STATUS APPLICATION_DENIED;
        public static final MY_STATUS CONNECTING;
        public static final MY_STATUS CONSUMER;
        public static final MY_STATUS DOWNLOADING_MESSAGES;
        public static final MY_STATUS INVALID_ACCESS_TOKEN;
        public static final MY_STATUS QUEUED_TO_ENTER;
        public static final MY_STATUS RETIRED_FORCEFULLY;
        public static final MY_STATUS RETIRED_VOLUNTARILY;
        public static final MY_STATUS RETRY_CONNECTING;
        public static final MY_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static MY_STATUS fromInt(int i)
        {
            MY_STATUS my_status = (MY_STATUS)intToTypeMap.a(i);
            if (my_status != null)
            {
                return my_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static MY_STATUS valueOf(String s)
        {
            return (MY_STATUS)Enum.valueOf(com/skype/Conversation$MY_STATUS, s);
        }

        public static MY_STATUS[] values()
        {
            return (MY_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONNECTING = new MY_STATUS("CONNECTING", 0, 1);
            RETRY_CONNECTING = new MY_STATUS("RETRY_CONNECTING", 1, 2);
            DOWNLOADING_MESSAGES = new MY_STATUS("DOWNLOADING_MESSAGES", 2, 3);
            QUEUED_TO_ENTER = new MY_STATUS("QUEUED_TO_ENTER", 3, 4);
            APPLICANT = new MY_STATUS("APPLICANT", 4, 5);
            APPLICATION_DENIED = new MY_STATUS("APPLICATION_DENIED", 5, 6);
            INVALID_ACCESS_TOKEN = new MY_STATUS("INVALID_ACCESS_TOKEN", 6, 7);
            CONSUMER = new MY_STATUS("CONSUMER", 7, 8);
            RETIRED_FORCEFULLY = new MY_STATUS("RETIRED_FORCEFULLY", 8, 9);
            RETIRED_VOLUNTARILY = new MY_STATUS("RETIRED_VOLUNTARILY", 9, 10);
            WRAPPER_UNKNOWN_VALUE = new MY_STATUS("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new MY_STATUS[] {
                CONNECTING, RETRY_CONNECTING, DOWNLOADING_MESSAGES, QUEUED_TO_ENTER, APPLICANT, APPLICATION_DENIED, INVALID_ACCESS_TOKEN, CONSUMER, RETIRED_FORCEFULLY, RETIRED_VOLUNTARILY, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            MY_STATUS amy_status[] = values();
            int k = amy_status.length;
            for (int i = 0; i < k; i++)
            {
                MY_STATUS my_status = amy_status[i];
                intToTypeMap.a(my_status.value, my_status);
            }

        }

        private MY_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTICIPANTFILTER extends Enum
    {

        private static final PARTICIPANTFILTER $VALUES[];
        public static final PARTICIPANTFILTER ALL;
        public static final PARTICIPANTFILTER APPLICANTS;
        public static final PARTICIPANTFILTER CONSUMERS;
        public static final PARTICIPANTFILTER CONSUMERS_AND_APPLICANTS;
        public static final PARTICIPANTFILTER MYSELF;
        public static final PARTICIPANTFILTER OTHER_CONSUMERS;
        public static final PARTICIPANTFILTER WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTICIPANTFILTER fromInt(int i)
        {
            PARTICIPANTFILTER participantfilter = (PARTICIPANTFILTER)intToTypeMap.a(i);
            if (participantfilter != null)
            {
                return participantfilter;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTICIPANTFILTER valueOf(String s)
        {
            return (PARTICIPANTFILTER)Enum.valueOf(com/skype/Conversation$PARTICIPANTFILTER, s);
        }

        public static PARTICIPANTFILTER[] values()
        {
            return (PARTICIPANTFILTER[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL = new PARTICIPANTFILTER("ALL", 0, 0);
            CONSUMERS = new PARTICIPANTFILTER("CONSUMERS", 1, 1);
            APPLICANTS = new PARTICIPANTFILTER("APPLICANTS", 2, 2);
            CONSUMERS_AND_APPLICANTS = new PARTICIPANTFILTER("CONSUMERS_AND_APPLICANTS", 3, 3);
            MYSELF = new PARTICIPANTFILTER("MYSELF", 4, 4);
            OTHER_CONSUMERS = new PARTICIPANTFILTER("OTHER_CONSUMERS", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new PARTICIPANTFILTER("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new PARTICIPANTFILTER[] {
                ALL, CONSUMERS, APPLICANTS, CONSUMERS_AND_APPLICANTS, MYSELF, OTHER_CONSUMERS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTICIPANTFILTER aparticipantfilter[] = values();
            int k = aparticipantfilter.length;
            for (int i = 0; i < k; i++)
            {
                PARTICIPANTFILTER participantfilter = aparticipantfilter[i];
                intToTypeMap.a(participantfilter.value, participantfilter);
            }

        }

        private PARTICIPANTFILTER(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PICTURE_FORMAT extends Enum
    {

        private static final PICTURE_FORMAT $VALUES[];
        public static final PICTURE_FORMAT PICTURE_DEFAULT;
        public static final PICTURE_FORMAT PICTURE_SINGLE_URL;
        public static final PICTURE_FORMAT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PICTURE_FORMAT fromInt(int i)
        {
            PICTURE_FORMAT picture_format = (PICTURE_FORMAT)intToTypeMap.a(i);
            if (picture_format != null)
            {
                return picture_format;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PICTURE_FORMAT valueOf(String s)
        {
            return (PICTURE_FORMAT)Enum.valueOf(com/skype/Conversation$PICTURE_FORMAT, s);
        }

        public static PICTURE_FORMAT[] values()
        {
            return (PICTURE_FORMAT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PICTURE_DEFAULT = new PICTURE_FORMAT("PICTURE_DEFAULT", 0, 0);
            PICTURE_SINGLE_URL = new PICTURE_FORMAT("PICTURE_SINGLE_URL", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new PICTURE_FORMAT("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new PICTURE_FORMAT[] {
                PICTURE_DEFAULT, PICTURE_SINGLE_URL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PICTURE_FORMAT apicture_format[] = values();
            int k = apicture_format.length;
            for (int i = 0; i < k; i++)
            {
                PICTURE_FORMAT picture_format = apicture_format[i];
                intToTypeMap.a(picture_format.value, picture_format);
            }

        }

        private PICTURE_FORMAT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PREMIUM_VIDEO_STATUS extends Enum
    {

        private static final PREMIUM_VIDEO_STATUS $VALUES[];
        public static final PREMIUM_VIDEO_STATUS NOT_MULTIPARTY_VIDEO;
        public static final PREMIUM_VIDEO_STATUS RESULT_200_OK;
        public static final PREMIUM_VIDEO_STATUS RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING;
        public static final PREMIUM_VIDEO_STATUS RESULT_401_P2P_BLOCK;
        public static final PREMIUM_VIDEO_STATUS RESULT_403_PAID_SERVICE_BLOCK;
        public static final PREMIUM_VIDEO_STATUS RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED;
        public static final PREMIUM_VIDEO_STATUS RESULT_405_GROUP_TOO_LARGE;
        public static final PREMIUM_VIDEO_STATUS RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE;
        public static final PREMIUM_VIDEO_STATUS RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL;
        public static final PREMIUM_VIDEO_STATUS RESULT_414_NO_SUBSCRIPTION;
        public static final PREMIUM_VIDEO_STATUS RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE;
        public static final PREMIUM_VIDEO_STATUS RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED;
        public static final PREMIUM_VIDEO_STATUS RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED;
        public static final PREMIUM_VIDEO_STATUS RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED;
        public static final PREMIUM_VIDEO_STATUS RESULT_430_GRACE_TIME_EXPIRED;
        public static final PREMIUM_VIDEO_STATUS RESULT_500_GENERAL_SERVICE_ERROR;
        public static final PREMIUM_VIDEO_STATUS RESULT_503_SERVICE_TIMEOUT;
        public static final PREMIUM_VIDEO_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PREMIUM_VIDEO_STATUS fromInt(int i)
        {
            PREMIUM_VIDEO_STATUS premium_video_status = (PREMIUM_VIDEO_STATUS)intToTypeMap.a(i);
            if (premium_video_status != null)
            {
                return premium_video_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PREMIUM_VIDEO_STATUS valueOf(String s)
        {
            return (PREMIUM_VIDEO_STATUS)Enum.valueOf(com/skype/Conversation$PREMIUM_VIDEO_STATUS, s);
        }

        public static PREMIUM_VIDEO_STATUS[] values()
        {
            return (PREMIUM_VIDEO_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_MULTIPARTY_VIDEO = new PREMIUM_VIDEO_STATUS("NOT_MULTIPARTY_VIDEO", 0, 0);
            RESULT_200_OK = new PREMIUM_VIDEO_STATUS("RESULT_200_OK", 1, 1);
            RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING = new PREMIUM_VIDEO_STATUS("RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING", 2, 2);
            RESULT_401_P2P_BLOCK = new PREMIUM_VIDEO_STATUS("RESULT_401_P2P_BLOCK", 3, 3);
            RESULT_403_PAID_SERVICE_BLOCK = new PREMIUM_VIDEO_STATUS("RESULT_403_PAID_SERVICE_BLOCK", 4, 4);
            RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED = new PREMIUM_VIDEO_STATUS("RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED", 5, 5);
            RESULT_405_GROUP_TOO_LARGE = new PREMIUM_VIDEO_STATUS("RESULT_405_GROUP_TOO_LARGE", 6, 6);
            RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE = new PREMIUM_VIDEO_STATUS("RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE", 7, 7);
            RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL = new PREMIUM_VIDEO_STATUS("RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL", 8, 8);
            RESULT_414_NO_SUBSCRIPTION = new PREMIUM_VIDEO_STATUS("RESULT_414_NO_SUBSCRIPTION", 9, 9);
            RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE = new PREMIUM_VIDEO_STATUS("RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE", 10, 10);
            RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED = new PREMIUM_VIDEO_STATUS("RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED", 11, 11);
            RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED = new PREMIUM_VIDEO_STATUS("RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED", 12, 12);
            RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED = new PREMIUM_VIDEO_STATUS("RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED", 13, 13);
            RESULT_430_GRACE_TIME_EXPIRED = new PREMIUM_VIDEO_STATUS("RESULT_430_GRACE_TIME_EXPIRED", 14, 14);
            RESULT_500_GENERAL_SERVICE_ERROR = new PREMIUM_VIDEO_STATUS("RESULT_500_GENERAL_SERVICE_ERROR", 15, 15);
            RESULT_503_SERVICE_TIMEOUT = new PREMIUM_VIDEO_STATUS("RESULT_503_SERVICE_TIMEOUT", 16, 16);
            WRAPPER_UNKNOWN_VALUE = new PREMIUM_VIDEO_STATUS("WRAPPER_UNKNOWN_VALUE", 17, 0x7fffffff);
            $VALUES = (new PREMIUM_VIDEO_STATUS[] {
                NOT_MULTIPARTY_VIDEO, RESULT_200_OK, RESULT_400_BAD_REQUEST_SOME_FIELDS_MISSING, RESULT_401_P2P_BLOCK, RESULT_403_PAID_SERVICE_BLOCK, RESULT_404_CONVERSATION_ID_NOT_FOUND_OR_CALL_ALREADY_TERMINATED, RESULT_405_GROUP_TOO_LARGE, RESULT_410_NO_VALID_SUBSCRIPTION_BUT_TRIAL_IS_AVAILABLE, RESULT_412_SUBSCRIPTION_INSUFFICENT_FOR_THIS_CALL, RESULT_414_NO_SUBSCRIPTION, 
                RESULT_416_SUBSCRIPTION_IS_ALREADY_IN_USE, RESULT_420_FAIR_USAGE_POLICY_VIOLATION_CALL_LIMIT_REACHED, RESULT_422_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_DAY_LIMIT_REACHED, RESULT_424_FAIR_USAGE_POLICY_VIOLATION_SPONSORS_MONTH_LIMIT_REACHED, RESULT_430_GRACE_TIME_EXPIRED, RESULT_500_GENERAL_SERVICE_ERROR, RESULT_503_SERVICE_TIMEOUT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PREMIUM_VIDEO_STATUS apremium_video_status[] = values();
            int k = apremium_video_status.length;
            for (int i = 0; i < k; i++)
            {
                PREMIUM_VIDEO_STATUS premium_video_status = apremium_video_status[i];
                intToTypeMap.a(premium_video_status.value, premium_video_status);
            }

        }

        private PREMIUM_VIDEO_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class PostFiles_Result
    {

        public SkyLib.TRANSFER_SENDFILE_ERROR m_error_code;
        public String m_error_file;
        public int m_return;

        public void init(SkyLib.TRANSFER_SENDFILE_ERROR transfer_sendfile_error, byte abyte0[], int i)
        {
            m_error_code = transfer_sendfile_error;
            m_error_file = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = i;
        }

        public PostFiles_Result()
        {
        }
    }

    public static class PostTextWithAnnotation_Result
    {

        public int m_annotationId;
        public int m_return;

        public void init(int i, int j)
        {
            m_annotationId = i;
            m_return = j;
        }

        public PostTextWithAnnotation_Result()
        {
        }
    }

    public static final class SUBSCRIPTION_CHECK_CONTEXT extends Enum
    {

        private static final SUBSCRIPTION_CHECK_CONTEXT $VALUES[];
        public static final SUBSCRIPTION_CHECK_CONTEXT USER_IS_ABOUT_TO_START_SCREENSHARE;
        public static final SUBSCRIPTION_CHECK_CONTEXT USER_IS_ABOUT_TO_START_VIDEO;
        public static final SUBSCRIPTION_CHECK_CONTEXT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SUBSCRIPTION_CHECK_CONTEXT fromInt(int i)
        {
            SUBSCRIPTION_CHECK_CONTEXT subscription_check_context = (SUBSCRIPTION_CHECK_CONTEXT)intToTypeMap.a(i);
            if (subscription_check_context != null)
            {
                return subscription_check_context;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SUBSCRIPTION_CHECK_CONTEXT valueOf(String s)
        {
            return (SUBSCRIPTION_CHECK_CONTEXT)Enum.valueOf(com/skype/Conversation$SUBSCRIPTION_CHECK_CONTEXT, s);
        }

        public static SUBSCRIPTION_CHECK_CONTEXT[] values()
        {
            return (SUBSCRIPTION_CHECK_CONTEXT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            USER_IS_ABOUT_TO_START_SCREENSHARE = new SUBSCRIPTION_CHECK_CONTEXT("USER_IS_ABOUT_TO_START_SCREENSHARE", 0, 0);
            USER_IS_ABOUT_TO_START_VIDEO = new SUBSCRIPTION_CHECK_CONTEXT("USER_IS_ABOUT_TO_START_VIDEO", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new SUBSCRIPTION_CHECK_CONTEXT("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new SUBSCRIPTION_CHECK_CONTEXT[] {
                USER_IS_ABOUT_TO_START_SCREENSHARE, USER_IS_ABOUT_TO_START_VIDEO, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SUBSCRIPTION_CHECK_CONTEXT asubscription_check_context[] = values();
            int k = asubscription_check_context.length;
            for (int i = 0; i < k; i++)
            {
                SUBSCRIPTION_CHECK_CONTEXT subscription_check_context = asubscription_check_context[i];
                intToTypeMap.a(subscription_check_context.value, subscription_check_context);
            }

        }

        private SUBSCRIPTION_CHECK_CONTEXT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE CONFERENCE;
        public static final TYPE DIALOG;
        public static final TYPE LEGACY_SHAREDGROUP;
        public static final TYPE LEGACY_VOICE_CONFERENCE;
        public static final TYPE TERMINATED_CONFERENCE;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TYPE fromInt(int i)
        {
            TYPE type = (TYPE)intToTypeMap.a(i);
            if (type != null)
            {
                return type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TYPE valueOf(String s)
        {
            return (TYPE)Enum.valueOf(com/skype/Conversation$TYPE, s);
        }

        public static TYPE[] values()
        {
            return (TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            DIALOG = new TYPE("DIALOG", 0, 1);
            CONFERENCE = new TYPE("CONFERENCE", 1, 2);
            TERMINATED_CONFERENCE = new TYPE("TERMINATED_CONFERENCE", 2, 3);
            LEGACY_VOICE_CONFERENCE = new TYPE("LEGACY_VOICE_CONFERENCE", 3, 4);
            LEGACY_SHAREDGROUP = new TYPE("LEGACY_SHAREDGROUP", 4, 5);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new TYPE[] {
                DIALOG, CONFERENCE, TERMINATED_CONFERENCE, LEGACY_VOICE_CONFERENCE, LEGACY_SHAREDGROUP, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TYPE atype[] = values();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                TYPE type = atype[i];
                intToTypeMap.a(type.value, type);
            }

        }

        private TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract boolean addConsumers(String as[]);

    public abstract boolean addConsumers(String as[], boolean flag);

    public abstract void addListener(ConversationIListener conversationilistener);

    public abstract boolean addToInbox();

    public abstract boolean addToInbox(int i);

    public abstract int assimilate(int i);

    public abstract boolean attachVideoToLiveSession(int i);

    public abstract boolean canAddConsumersOrSpawn(String as[]);

    public abstract boolean canTransferLiveSession(String s);

    public abstract int checkPremiumVideoSubscription();

    public abstract int checkPremiumVideoSubscription(SUBSCRIPTION_CHECK_CONTEXT subscription_check_context);

    public abstract boolean delete();

    public abstract boolean enterPassword(String s);

    public abstract int findMessage(String s);

    public abstract int findMessage(String s, int i);

    public abstract int getActiveInvoiceMessageProp();

    public abstract int getActiveVmIdProp();

    public abstract String[] getAddCandidates(String as[]);

    public abstract String getAlertStringProp();

    public abstract String getAltIdentityProp();

    public abstract String getCallGUID();

    public abstract boolean[] getCapabilities();

    public abstract String getChatNameFromThreadId();

    public abstract String getChatname();

    public abstract int getConsumptionHorizonProp();

    public abstract int getCreationTimestampProp();

    public abstract String getCreatorProp();

    public abstract String getDisplaynameProp();

    public abstract String getGivenDisplaynameProp();

    public abstract String getIdentityProp();

    public abstract int getInboxMessageIdProp();

    public abstract int getInboxTimestampProp();

    public abstract boolean getIsBlockedProp();

    public abstract boolean getIsBookmarkedProp();

    public abstract boolean getIsP2pMigratedProp();

    public abstract String getJoinBlob();

    public abstract String getJoinUrlProp();

    public abstract int getLastActivityTimestampProp();

    public abstract int getLastMessageIdProp();

    public abstract GetLastMessages_Result getLastMessages();

    public abstract GetLastMessages_Result getLastMessages(int i);

    public abstract CALL_TECHNOLOGY getLiveCallTechnologyProp();

    public abstract String getLiveHostProp();

    public abstract boolean getLiveIsMutedProp();

    public abstract int getLiveStartTimestampProp();

    public abstract LOCAL_LIVESTATUS getLocalLiveStatusProp();

    public abstract int getMaxVideoconfcallParticipantsProp();

    public abstract String getMcrCallerProp();

    public abstract String getMetaGuidelinesProp();

    public abstract String getMetaNameProp();

    public abstract byte[] getMetaPictureProp();

    public abstract String getMetaTopicProp();

    public abstract MY_STATUS getMyStatusProp();

    public abstract String getNonseWord();

    public abstract int getOptAdminOnlyActivitiesProp();

    public abstract boolean getOptDiscloseHistoryProp();

    public abstract Participant.RANK getOptEntryLevelRankProp();

    public abstract boolean getOptJoiningEnabledProp();

    public abstract int getOptimalRemoteVideosInConferenceProp();

    public abstract GetParticipants_Result getParticipants();

    public abstract GetParticipants_Result getParticipants(PARTICIPANTFILTER participantfilter);

    public abstract String getPasswordhintProp();

    public abstract GetPendingMediaDocumentsList_Result getPendingMediaDocumentsList();

    public abstract boolean getPictureMediaDocument(MediaDocument mediadocument);

    public abstract String getPictureProp();

    public abstract int getPinnedOrderProp();

    public abstract boolean getPremiumVideoIsGracePeriodProp();

    public abstract String getPremiumVideoSponsorListProp();

    public abstract PREMIUM_VIDEO_STATUS getPremiumVideoStatusProp();

    public abstract int getSpawnedFromConvoIdProp();

    public abstract String getThreadIdFromChatName();

    public abstract TYPE getTypeProp();

    public abstract int getUnconsumedElevatedMessagesProp();

    public abstract boolean getUnconsumedMessagesVoiceProp();

    public abstract int getUnconsumedNormalMessagesProp();

    public abstract int getUnconsumedSuppressedMessagesProp();

    public abstract boolean holdMyLiveSession();

    public abstract boolean isMemberOf(int i);

    public abstract boolean join();

    public abstract boolean joinLiveSession();

    public abstract boolean joinLiveSession(String s);

    public abstract boolean joinLiveSession(String s, boolean flag);

    public abstract boolean leaveLiveSession();

    public abstract boolean leaveLiveSession(boolean flag);

    public abstract boolean leaveLiveSessionEx(CALL_END_ACTION call_end_action);

    public abstract LoadMessages_Result loadMessages(int i, int j, boolean flag);

    public abstract boolean markRead();

    public abstract boolean markUnread();

    public abstract boolean moveConsumedHorizon(int i);

    public abstract boolean moveConsumedHorizon(int i, boolean flag);

    public abstract boolean muteMyMicrophone();

    public abstract boolean pinAfter(int i);

    public abstract boolean pinFirst();

    public abstract boolean postContacts(int ai[]);

    public abstract boolean postContacts(int ai[], String s);

    public abstract boolean postEventMessage(EVENT_MESSAGE_TYPE event_message_type, String s);

    public abstract int postExternalMessage(int i, String s);

    public abstract PostFiles_Result postFiles(String as[], String s);

    public abstract int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1);

    public abstract int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s);

    public abstract int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s, String s1);

    public abstract int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s, String s1, String s2);

    public abstract boolean postMediaDocument(int i);

    public abstract boolean postMediaDocument(int i, String s);

    public abstract boolean postSMS(int i);

    public abstract boolean postSMS(int i, String s);

    public abstract int postSystemMessage(String s);

    public abstract int postSystemMessage(String s, boolean flag);

    public abstract int postText(String s);

    public abstract int postText(String s, boolean flag);

    public abstract PostTextWithAnnotation_Result postTextWithAnnotation(String s, MessageAnnotation.TYPE type, String s1, String s2);

    public abstract PostTextWithAnnotation_Result postTextWithAnnotation(String s, MessageAnnotation.TYPE type, String s1, String s2, boolean flag);

    public abstract int postVideoMessage(int i);

    public abstract int postVideoMessage(int i, String s);

    public abstract boolean postVoiceMessage(int i, String s);

    public abstract boolean provideLiveSessionQualityFeedback(String s, String s1, SkyLib.LIVESESSION_QUALITYRATING livesession_qualityrating, String s2, String s3);

    public abstract boolean removeFromInbox();

    public abstract void removeListener(ConversationIListener conversationilistener);

    public abstract boolean renameTo(String s);

    public abstract boolean resumeMyLiveSession();

    public abstract boolean retireFrom();

    public abstract boolean ringOthers();

    public abstract boolean ringOthers(String as[]);

    public abstract boolean ringOthers(String as[], boolean flag);

    public abstract boolean ringOthers(String as[], boolean flag, String s);

    public abstract boolean ringSeamless();

    public abstract boolean ringSeamless(boolean flag);

    public abstract boolean sendDTMF(Participant.DTMF dtmf);

    public abstract boolean sendDTMF(Participant.DTMF dtmf, int i);

    public abstract boolean setAlertString(String s);

    public abstract boolean setBookmark(boolean flag);

    public abstract boolean setConsumedHorizon(int i);

    public abstract boolean setConsumedHorizon(int i, boolean flag);

    public abstract boolean setDeferredSetup(boolean flag);

    public abstract boolean setMyTextStatusTo(Participant.TEXT_STATUS text_status);

    public abstract boolean setOption(PROPKEY propkey, int i);

    public abstract boolean setPassword(String s, String s1);

    public abstract boolean setPicture(byte abyte0[]);

    public abstract boolean setTopic(String s);

    public abstract boolean setTopic(String s, boolean flag);

    public abstract boolean setTranslatedCall(boolean flag);

    public abstract int spawnConference(String as[]);

    public abstract int spawnConference(String as[], boolean flag);

    public abstract boolean startVoiceMessage();

    public abstract boolean stopSendDTMF();

    public abstract boolean transferLiveSession(String as[]);

    public abstract boolean transferLiveSession(String as[], String s);

    public abstract boolean transferLiveSession(String as[], String s, byte abyte0[]);

    public abstract boolean unPin();

    public abstract boolean unmuteMyMicrophone();
}
