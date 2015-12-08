// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, MediaDocument, Sms, VideoMessage, 
//            Voicemail, NativeStringConvert

public interface Message
    extends ObjectInterface
{
    public static final class CONSUMPTION_STATUS extends Enum
    {

        private static final CONSUMPTION_STATUS $VALUES[];
        public static final CONSUMPTION_STATUS CONSUMED;
        public static final CONSUMPTION_STATUS UNCONSUMED_ELEVATED;
        public static final CONSUMPTION_STATUS UNCONSUMED_NORMAL;
        public static final CONSUMPTION_STATUS UNCONSUMED_SUPPRESSED;
        public static final CONSUMPTION_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONSUMPTION_STATUS fromInt(int i)
        {
            CONSUMPTION_STATUS consumption_status = (CONSUMPTION_STATUS)intToTypeMap.a(i);
            if (consumption_status != null)
            {
                return consumption_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONSUMPTION_STATUS valueOf(String s)
        {
            return (CONSUMPTION_STATUS)Enum.valueOf(com/skype/Message$CONSUMPTION_STATUS, s);
        }

        public static CONSUMPTION_STATUS[] values()
        {
            return (CONSUMPTION_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONSUMED = new CONSUMPTION_STATUS("CONSUMED", 0, 0);
            UNCONSUMED_SUPPRESSED = new CONSUMPTION_STATUS("UNCONSUMED_SUPPRESSED", 1, 1);
            UNCONSUMED_NORMAL = new CONSUMPTION_STATUS("UNCONSUMED_NORMAL", 2, 2);
            UNCONSUMED_ELEVATED = new CONSUMPTION_STATUS("UNCONSUMED_ELEVATED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new CONSUMPTION_STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new CONSUMPTION_STATUS[] {
                CONSUMED, UNCONSUMED_SUPPRESSED, UNCONSUMED_NORMAL, UNCONSUMED_ELEVATED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONSUMPTION_STATUS aconsumption_status[] = values();
            int k = aconsumption_status.length;
            for (int i = 0; i < k; i++)
            {
                CONSUMPTION_STATUS consumption_status = aconsumption_status[i];
                intToTypeMap.a(consumption_status.value, consumption_status);
            }

        }

        private CONSUMPTION_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class CountAnnotations_Result
    {

        public int m_counts[];
        public String m_keys[];

        public void init(byte abyte0[][], int ai[])
        {
            m_keys = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_counts = ai;
        }

        public CountAnnotations_Result()
        {
        }
    }

    public static class GetAnnotations_Result
    {

        public int m_annotationObjectIDList[];

        public void init(int ai[])
        {
            m_annotationObjectIDList = ai;
        }

        public GetAnnotations_Result()
        {
        }
    }

    public static class GetContacts_Result
    {

        public int m_contactObjectIDList[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_contactObjectIDList = ai;
            m_return = flag;
        }

        public GetContacts_Result()
        {
        }
    }

    public static class GetLocation_Result
    {

        public String m_address;
        public int m_altitude;
        public int m_course;
        public int m_horizontalAccuracy;
        public int m_latitude;
        public int m_longitude;
        public String m_pointOfInterest;
        public boolean m_return;
        public int m_speed;
        public int m_timeStamp;
        public int m_verticalAccuracy;

        public void init(int i, int j, int k, int l, int i1, int j1, int k1, 
                int l1, byte abyte0[], byte abyte1[], boolean flag)
        {
            m_latitude = i;
            m_longitude = j;
            m_altitude = k;
            m_horizontalAccuracy = l;
            m_verticalAccuracy = i1;
            m_speed = j1;
            m_course = k1;
            m_timeStamp = l1;
            m_address = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_pointOfInterest = NativeStringConvert.ConvertFromNativeBytes(abyte1);
            m_return = flag;
        }

        public GetLocation_Result()
        {
        }
    }

    public static class GetOwnAnnotations_Result
    {

        public int m_messageannotationObjectIDList[];

        public void init(int ai[])
        {
            m_messageannotationObjectIDList = ai;
        }

        public GetOwnAnnotations_Result()
        {
        }
    }

    public static class GetTransfers_Result
    {

        public boolean m_return;
        public int m_transferObjectIDList[];

        public void init(int ai[], boolean flag)
        {
            m_transferObjectIDList = ai;
            m_return = flag;
        }

        public GetTransfers_Result()
        {
        }
    }

    public static final class LEAVEREASON extends Enum
    {

        private static final LEAVEREASON $VALUES[];
        public static final LEAVEREASON ACCOUNT_REMOVED_OR_EXPIRED;
        public static final LEAVEREASON ADDER_MUST_BE_AUTHORIZED;
        public static final LEAVEREASON ADDER_MUST_BE_FRIEND;
        public static final LEAVEREASON CHAT_FULL;
        public static final LEAVEREASON DECLINE_ADD;
        public static final LEAVEREASON INTERNAL_ERROR;
        public static final LEAVEREASON UNSUBSCRIBE;
        public static final LEAVEREASON USER_INCAPABLE;
        public static final LEAVEREASON WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LEAVEREASON fromInt(int i)
        {
            LEAVEREASON leavereason = (LEAVEREASON)intToTypeMap.a(i);
            if (leavereason != null)
            {
                return leavereason;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LEAVEREASON valueOf(String s)
        {
            return (LEAVEREASON)Enum.valueOf(com/skype/Message$LEAVEREASON, s);
        }

        public static LEAVEREASON[] values()
        {
            return (LEAVEREASON[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            USER_INCAPABLE = new LEAVEREASON("USER_INCAPABLE", 0, 2);
            ADDER_MUST_BE_FRIEND = new LEAVEREASON("ADDER_MUST_BE_FRIEND", 1, 3);
            ADDER_MUST_BE_AUTHORIZED = new LEAVEREASON("ADDER_MUST_BE_AUTHORIZED", 2, 4);
            DECLINE_ADD = new LEAVEREASON("DECLINE_ADD", 3, 5);
            UNSUBSCRIBE = new LEAVEREASON("UNSUBSCRIBE", 4, 6);
            CHAT_FULL = new LEAVEREASON("CHAT_FULL", 5, 7);
            INTERNAL_ERROR = new LEAVEREASON("INTERNAL_ERROR", 6, 8);
            ACCOUNT_REMOVED_OR_EXPIRED = new LEAVEREASON("ACCOUNT_REMOVED_OR_EXPIRED", 7, 9);
            WRAPPER_UNKNOWN_VALUE = new LEAVEREASON("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new LEAVEREASON[] {
                USER_INCAPABLE, ADDER_MUST_BE_FRIEND, ADDER_MUST_BE_AUTHORIZED, DECLINE_ADD, UNSUBSCRIBE, CHAT_FULL, INTERNAL_ERROR, ACCOUNT_REMOVED_OR_EXPIRED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LEAVEREASON aleavereason[] = values();
            int k = aleavereason.length;
            for (int i = 0; i < k; i++)
            {
                LEAVEREASON leavereason = aleavereason[i];
                intToTypeMap.a(leavereason.value, leavereason);
            }

        }

        private LEAVEREASON(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface MessageIListener
    {
    }

    public static final class OPTION_BITS extends Enum
    {

        private static final OPTION_BITS $VALUES[];
        public static final OPTION_BITS ORIGINATED_VIA_PUSH;
        public static final OPTION_BITS PUSH_NEED_SYNC;
        public static final OPTION_BITS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static OPTION_BITS fromInt(int i)
        {
            OPTION_BITS option_bits = (OPTION_BITS)intToTypeMap.a(i);
            if (option_bits != null)
            {
                return option_bits;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static OPTION_BITS valueOf(String s)
        {
            return (OPTION_BITS)Enum.valueOf(com/skype/Message$OPTION_BITS, s);
        }

        public static OPTION_BITS[] values()
        {
            return (OPTION_BITS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PUSH_NEED_SYNC = new OPTION_BITS("PUSH_NEED_SYNC", 0, 1);
            ORIGINATED_VIA_PUSH = new OPTION_BITS("ORIGINATED_VIA_PUSH", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new OPTION_BITS("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new OPTION_BITS[] {
                PUSH_NEED_SYNC, ORIGINATED_VIA_PUSH, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            OPTION_BITS aoption_bits[] = values();
            int k = aoption_bits.length;
            for (int i = 0; i < k; i++)
            {
                OPTION_BITS option_bits = aoption_bits[i];
                intToTypeMap.a(option_bits.value, option_bits);
            }

        }

        private OPTION_BITS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PERMISSIONS extends Enum
    {

        private static final PERMISSIONS $VALUES[];
        public static final PERMISSIONS PERM_DELETABLE;
        public static final PERMISSIONS PERM_EDITABLE;
        public static final PERMISSIONS PERM_NONE;
        public static final PERMISSIONS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PERMISSIONS fromInt(int i)
        {
            PERMISSIONS permissions = (PERMISSIONS)intToTypeMap.a(i);
            if (permissions != null)
            {
                return permissions;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PERMISSIONS valueOf(String s)
        {
            return (PERMISSIONS)Enum.valueOf(com/skype/Message$PERMISSIONS, s);
        }

        public static PERMISSIONS[] values()
        {
            return (PERMISSIONS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PERM_NONE = new PERMISSIONS("PERM_NONE", 0, 0);
            PERM_EDITABLE = new PERMISSIONS("PERM_EDITABLE", 1, 1);
            PERM_DELETABLE = new PERMISSIONS("PERM_DELETABLE", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new PERMISSIONS("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new PERMISSIONS[] {
                PERM_NONE, PERM_EDITABLE, PERM_DELETABLE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PERMISSIONS apermissions[] = values();
            int k = apermissions.length;
            for (int i = 0; i < k; i++)
            {
                PERMISSIONS permissions = apermissions[i];
                intToTypeMap.a(permissions.value, permissions);
            }

        }

        private PERMISSIONS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SENDING_STATUS extends Enum
    {

        private static final SENDING_STATUS $VALUES[];
        public static final SENDING_STATUS FAILED_TO_SEND;
        public static final SENDING_STATUS SENDING;
        public static final SENDING_STATUS SENDING_STATUS_UNKNOWN;
        public static final SENDING_STATUS SENT;
        public static final SENDING_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SENDING_STATUS fromInt(int i)
        {
            SENDING_STATUS sending_status = (SENDING_STATUS)intToTypeMap.a(i);
            if (sending_status != null)
            {
                return sending_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SENDING_STATUS valueOf(String s)
        {
            return (SENDING_STATUS)Enum.valueOf(com/skype/Message$SENDING_STATUS, s);
        }

        public static SENDING_STATUS[] values()
        {
            return (SENDING_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SENDING_STATUS_UNKNOWN = new SENDING_STATUS("SENDING_STATUS_UNKNOWN", 0, 0);
            SENDING = new SENDING_STATUS("SENDING", 1, 1);
            SENT = new SENDING_STATUS("SENT", 2, 2);
            FAILED_TO_SEND = new SENDING_STATUS("FAILED_TO_SEND", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new SENDING_STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SENDING_STATUS[] {
                SENDING_STATUS_UNKNOWN, SENDING, SENT, FAILED_TO_SEND, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SENDING_STATUS asending_status[] = values();
            int k = asending_status.length;
            for (int i = 0; i < k; i++)
            {
                SENDING_STATUS sending_status = asending_status[i];
                intToTypeMap.a(sending_status.value, sending_status);
            }

        }

        private SENDING_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SET_METADATA_KEY extends Enum
    {

        private static final SET_METADATA_KEY $VALUES[];
        public static final SET_METADATA_KEY SET_META_GUIDELINES;
        public static final SET_METADATA_KEY SET_META_NAME;
        public static final SET_METADATA_KEY SET_META_PICTURE;
        public static final SET_METADATA_KEY SET_META_TOPIC;
        public static final SET_METADATA_KEY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SET_METADATA_KEY fromInt(int i)
        {
            SET_METADATA_KEY set_metadata_key = (SET_METADATA_KEY)intToTypeMap.a(i);
            if (set_metadata_key != null)
            {
                return set_metadata_key;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SET_METADATA_KEY valueOf(String s)
        {
            return (SET_METADATA_KEY)Enum.valueOf(com/skype/Message$SET_METADATA_KEY, s);
        }

        public static SET_METADATA_KEY[] values()
        {
            return (SET_METADATA_KEY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SET_META_NAME = new SET_METADATA_KEY("SET_META_NAME", 0, 3640);
            SET_META_TOPIC = new SET_METADATA_KEY("SET_META_TOPIC", 1, 3644);
            SET_META_GUIDELINES = new SET_METADATA_KEY("SET_META_GUIDELINES", 2, 3652);
            SET_META_PICTURE = new SET_METADATA_KEY("SET_META_PICTURE", 3, 3658);
            WRAPPER_UNKNOWN_VALUE = new SET_METADATA_KEY("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SET_METADATA_KEY[] {
                SET_META_NAME, SET_META_TOPIC, SET_META_GUIDELINES, SET_META_PICTURE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SET_METADATA_KEY aset_metadata_key[] = values();
            int k = aset_metadata_key.length;
            for (int i = 0; i < k; i++)
            {
                SET_METADATA_KEY set_metadata_key = aset_metadata_key[i];
                intToTypeMap.a(set_metadata_key.value, set_metadata_key);
            }

        }

        private SET_METADATA_KEY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SET_OPTION_KEY extends Enum
    {

        private static final SET_OPTION_KEY $VALUES[];
        public static final SET_OPTION_KEY SET_OPTION_ADMIN_ONLY_ACTIVITIES;
        public static final SET_OPTION_KEY SET_OPTION_DISCLOSE_HISTORY;
        public static final SET_OPTION_KEY SET_OPTION_ENTRY_LEVEL_RANK;
        public static final SET_OPTION_KEY SET_OPTION_HISTORY_LIMIT_IN_DAYS;
        public static final SET_OPTION_KEY SET_OPTION_JOINING_ENABLED;
        public static final SET_OPTION_KEY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SET_OPTION_KEY fromInt(int i)
        {
            SET_OPTION_KEY set_option_key = (SET_OPTION_KEY)intToTypeMap.a(i);
            if (set_option_key != null)
            {
                return set_option_key;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SET_OPTION_KEY valueOf(String s)
        {
            return (SET_OPTION_KEY)Enum.valueOf(com/skype/Message$SET_OPTION_KEY, s);
        }

        public static SET_OPTION_KEY[] values()
        {
            return (SET_OPTION_KEY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SET_OPTION_JOINING_ENABLED = new SET_OPTION_KEY("SET_OPTION_JOINING_ENABLED", 0, 3689);
            SET_OPTION_ENTRY_LEVEL_RANK = new SET_OPTION_KEY("SET_OPTION_ENTRY_LEVEL_RANK", 1, 3625);
            SET_OPTION_DISCLOSE_HISTORY = new SET_OPTION_KEY("SET_OPTION_DISCLOSE_HISTORY", 2, 3629);
            SET_OPTION_HISTORY_LIMIT_IN_DAYS = new SET_OPTION_KEY("SET_OPTION_HISTORY_LIMIT_IN_DAYS", 3, 3633);
            SET_OPTION_ADMIN_ONLY_ACTIVITIES = new SET_OPTION_KEY("SET_OPTION_ADMIN_ONLY_ACTIVITIES", 4, 3637);
            WRAPPER_UNKNOWN_VALUE = new SET_OPTION_KEY("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new SET_OPTION_KEY[] {
                SET_OPTION_JOINING_ENABLED, SET_OPTION_ENTRY_LEVEL_RANK, SET_OPTION_DISCLOSE_HISTORY, SET_OPTION_HISTORY_LIMIT_IN_DAYS, SET_OPTION_ADMIN_ONLY_ACTIVITIES, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SET_OPTION_KEY aset_option_key[] = values();
            int k = aset_option_key.length;
            for (int i = 0; i < k; i++)
            {
                SET_OPTION_KEY set_option_key = aset_option_key[i];
                intToTypeMap.a(set_option_key.value, set_option_key);
            }

        }

        private SET_OPTION_KEY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE ADDED_APPLICANTS;
        public static final TYPE ADDED_CONSUMERS;
        public static final TYPE ADDED_LEGACY_CONSUMERS;
        public static final TYPE BLOCKED;
        public static final TYPE ENDED_LIVESESSION;
        public static final TYPE GRANTED_AUTH;
        public static final TYPE HAS_BIRTHDAY;
        public static final TYPE LEGACY_MEMBER_UPGRADED;
        public static final TYPE LEGACY_MESSAGE;
        public static final TYPE MESSAGE_EXPANSION_END;
        public static final TYPE MESSAGE_EXPANSION_START;
        public static final TYPE MESSAGE_GENERIC_MEDIA_END;
        public static final TYPE MESSAGE_GENERIC_MEDIA_START;
        public static final TYPE MISSING_MESSAGES;
        public static final TYPE POSTED_ALERT;
        public static final TYPE POSTED_AUDIO_MESSAGE;
        public static final TYPE POSTED_CONTACTS;
        public static final TYPE POSTED_EMOTE;
        public static final TYPE POSTED_FILES;
        public static final TYPE POSTED_FILE_MESSAGE;
        public static final TYPE POSTED_FLIK_MESSAGE;
        public static final TYPE POSTED_GENERIC_MEDIA_FALLBACK;
        public static final TYPE POSTED_INVOICE;
        public static final TYPE POSTED_LOCATION;
        public static final TYPE POSTED_MEDIA_MESSAGE;
        public static final TYPE POSTED_SKYPECHAT_MESSAGE;
        public static final TYPE POSTED_SMS;
        public static final TYPE POSTED_TEXT;
        public static final TYPE POSTED_VIDEO;
        public static final TYPE POSTED_VIDEO_MESSAGE;
        public static final TYPE POSTED_VOICE_AUTORESPONSE;
        public static final TYPE POSTED_VOICE_MESSAGE;
        public static final TYPE REQUESTED_AUTH;
        public static final TYPE REQUESTED_RANK;
        public static final TYPE RETIRED;
        public static final TYPE RETIRED_OTHERS;
        public static final TYPE SET_METADATA;
        public static final TYPE SET_OPTION;
        public static final TYPE SET_RANK;
        public static final TYPE SPAWNED_CONFERENCE;
        public static final TYPE STARTED_LIVESESSION;
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
            return (TYPE)Enum.valueOf(com/skype/Message$TYPE, s);
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
            SET_METADATA = new TYPE("SET_METADATA", 0, 2);
            SPAWNED_CONFERENCE = new TYPE("SPAWNED_CONFERENCE", 1, 4);
            LEGACY_MEMBER_UPGRADED = new TYPE("LEGACY_MEMBER_UPGRADED", 2, 8);
            ADDED_LEGACY_CONSUMERS = new TYPE("ADDED_LEGACY_CONSUMERS", 3, 9);
            ADDED_CONSUMERS = new TYPE("ADDED_CONSUMERS", 4, 10);
            ADDED_APPLICANTS = new TYPE("ADDED_APPLICANTS", 5, 11);
            RETIRED_OTHERS = new TYPE("RETIRED_OTHERS", 6, 12);
            RETIRED = new TYPE("RETIRED", 7, 13);
            SET_RANK = new TYPE("SET_RANK", 8, 21);
            STARTED_LIVESESSION = new TYPE("STARTED_LIVESESSION", 9, 30);
            ENDED_LIVESESSION = new TYPE("ENDED_LIVESESSION", 10, 39);
            REQUESTED_AUTH = new TYPE("REQUESTED_AUTH", 11, 50);
            GRANTED_AUTH = new TYPE("GRANTED_AUTH", 12, 51);
            BLOCKED = new TYPE("BLOCKED", 13, 53);
            POSTED_TEXT = new TYPE("POSTED_TEXT", 14, 61);
            POSTED_EMOTE = new TYPE("POSTED_EMOTE", 15, 60);
            POSTED_CONTACTS = new TYPE("POSTED_CONTACTS", 16, 63);
            POSTED_SMS = new TYPE("POSTED_SMS", 17, 64);
            POSTED_ALERT = new TYPE("POSTED_ALERT", 18, 65);
            POSTED_VOICE_MESSAGE = new TYPE("POSTED_VOICE_MESSAGE", 19, 67);
            POSTED_FILES = new TYPE("POSTED_FILES", 20, 68);
            POSTED_INVOICE = new TYPE("POSTED_INVOICE", 21, 69);
            POSTED_VIDEO_MESSAGE = new TYPE("POSTED_VIDEO_MESSAGE", 22, 70);
            MISSING_MESSAGES = new TYPE("MISSING_MESSAGES", 23, 90);
            LEGACY_MESSAGE = new TYPE("LEGACY_MESSAGE", 24, 100);
            HAS_BIRTHDAY = new TYPE("HAS_BIRTHDAY", 25, 110);
            MESSAGE_EXPANSION_START = new TYPE("MESSAGE_EXPANSION_START", 26, 200);
            POSTED_MEDIA_MESSAGE = new TYPE("POSTED_MEDIA_MESSAGE", 27, 201);
            POSTED_LOCATION = new TYPE("POSTED_LOCATION", 28, 202);
            POSTED_SKYPECHAT_MESSAGE = new TYPE("POSTED_SKYPECHAT_MESSAGE", 29, 203);
            MESSAGE_GENERIC_MEDIA_START = new TYPE("MESSAGE_GENERIC_MEDIA_START", 30, 250);
            POSTED_GENERIC_MEDIA_FALLBACK = new TYPE("POSTED_GENERIC_MEDIA_FALLBACK", 31, 251);
            POSTED_AUDIO_MESSAGE = new TYPE("POSTED_AUDIO_MESSAGE", 32, 252);
            POSTED_FLIK_MESSAGE = new TYPE("POSTED_FLIK_MESSAGE", 33, 253);
            POSTED_FILE_MESSAGE = new TYPE("POSTED_FILE_MESSAGE", 34, 254);
            POSTED_VIDEO = new TYPE("POSTED_VIDEO", 35, 255);
            MESSAGE_GENERIC_MEDIA_END = new TYPE("MESSAGE_GENERIC_MEDIA_END", 36, 299);
            MESSAGE_EXPANSION_END = new TYPE("MESSAGE_EXPANSION_END", 37, 300);
            SET_OPTION = new TYPE("SET_OPTION", 38, 1);
            REQUESTED_RANK = new TYPE("REQUESTED_RANK", 39, 20);
            POSTED_VOICE_AUTORESPONSE = new TYPE("POSTED_VOICE_AUTORESPONSE", 40, 66);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 41, 0x7fffffff);
            $VALUES = (new TYPE[] {
                SET_METADATA, SPAWNED_CONFERENCE, LEGACY_MEMBER_UPGRADED, ADDED_LEGACY_CONSUMERS, ADDED_CONSUMERS, ADDED_APPLICANTS, RETIRED_OTHERS, RETIRED, SET_RANK, STARTED_LIVESESSION, 
                ENDED_LIVESESSION, REQUESTED_AUTH, GRANTED_AUTH, BLOCKED, POSTED_TEXT, POSTED_EMOTE, POSTED_CONTACTS, POSTED_SMS, POSTED_ALERT, POSTED_VOICE_MESSAGE, 
                POSTED_FILES, POSTED_INVOICE, POSTED_VIDEO_MESSAGE, MISSING_MESSAGES, LEGACY_MESSAGE, HAS_BIRTHDAY, MESSAGE_EXPANSION_START, POSTED_MEDIA_MESSAGE, POSTED_LOCATION, POSTED_SKYPECHAT_MESSAGE, 
                MESSAGE_GENERIC_MEDIA_START, POSTED_GENERIC_MEDIA_FALLBACK, POSTED_AUDIO_MESSAGE, POSTED_FLIK_MESSAGE, POSTED_FILE_MESSAGE, POSTED_VIDEO, MESSAGE_GENERIC_MEDIA_END, MESSAGE_EXPANSION_END, SET_OPTION, REQUESTED_RANK, 
                POSTED_VOICE_AUTORESPONSE, WRAPPER_UNKNOWN_VALUE
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


    public abstract int addAnnotation(MessageAnnotation.TYPE type, String s, String s1);

    public abstract void addListener(MessageIListener messageilistener);

    public abstract boolean canAnnotate();

    public abstract boolean canEdit();

    public abstract CountAnnotations_Result countAnnotations(MessageAnnotation.TYPE type);

    public abstract boolean deleteLocally();

    public abstract boolean edit(String s);

    public abstract boolean edit(String s, boolean flag);

    public abstract boolean edit(String s, boolean flag, boolean flag1);

    public abstract boolean edit(String s, boolean flag, boolean flag1, String s1);

    public abstract int getAnnotationVersionProp();

    public abstract GetAnnotations_Result getAnnotations(MessageAnnotation.TYPE type);

    public abstract String getAuthorDisplaynameProp();

    public abstract String getAuthorProp();

    public abstract boolean getAuthorWasLiveProp();

    public abstract String getBodyXmlProp();

    public abstract String getCallGuidProp();

    public abstract CONSUMPTION_STATUS getConsumptionStatusProp();

    public abstract GetContacts_Result getContacts();

    public abstract String getConvoGuidProp();

    public abstract int getConvoIdProp();

    public abstract int getEditTimestampProp();

    public abstract String getEditedByProp();

    public abstract byte[] getGuidProp();

    public abstract String getIdentitiesProp();

    public abstract SkyLib.LEAVE_REASON getLeaveReasonProp();

    public abstract GetLocation_Result getLocation();

    public abstract boolean getMediaDocument(MediaDocument mediadocument);

    public abstract int getOptionBitsProp();

    public abstract String getOriginallyMeantForProp();

    public abstract int getOtherLiveMessage();

    public abstract GetOwnAnnotations_Result getOwnAnnotations(MessageAnnotation.TYPE type);

    public abstract int getParamKeyProp();

    public abstract int getParamValueProp();

    public abstract int getParticipantCountProp();

    public abstract PERMISSIONS getPermissions();

    public abstract String getReasonProp();

    public abstract boolean getSMS(Sms sms);

    public abstract SENDING_STATUS getSendingStatusProp();

    public abstract int getTimestampProp();

    public abstract GetTransfers_Result getTransfers();

    public abstract TYPE getTypeProp();

    public abstract boolean getVideoMessage(VideoMessage videomessage);

    public abstract boolean getVoiceMessage(Voicemail voicemail);

    public abstract void removeAnnotation(int i);

    public abstract void removeListener(MessageIListener messageilistener);
}
