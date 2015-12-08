// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface Voicemail
    extends ObjectInterface
{
    public static final class FAILUREREASON extends Enum
    {

        private static final FAILUREREASON $VALUES[];
        public static final FAILUREREASON CONNECT_ERROR;
        public static final FAILUREREASON FILE_READ_ERROR;
        public static final FAILUREREASON FILE_WRITE_ERROR;
        public static final FAILUREREASON MISC_ERROR;
        public static final FAILUREREASON NO_PERMISSION;
        public static final FAILUREREASON NO_SUCH_VOICEMAIL;
        public static final FAILUREREASON NO_VOICEMAIL_CAPABILITY;
        public static final FAILUREREASON PLAYBACK_ERROR;
        public static final FAILUREREASON RECEIVER_DISABLED_VOICEMAIL;
        public static final FAILUREREASON RECORDING_ERROR;
        public static final FAILUREREASON SENDER_BLOCKED;
        public static final FAILUREREASON SENDER_NOT_AUTHORIZED;
        public static final FAILUREREASON WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static FAILUREREASON fromInt(int i)
        {
            FAILUREREASON failurereason = (FAILUREREASON)intToTypeMap.a(i);
            if (failurereason != null)
            {
                return failurereason;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static FAILUREREASON valueOf(String s)
        {
            return (FAILUREREASON)Enum.valueOf(com/skype/Voicemail$FAILUREREASON, s);
        }

        public static FAILUREREASON[] values()
        {
            return (FAILUREREASON[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MISC_ERROR = new FAILUREREASON("MISC_ERROR", 0, 1);
            CONNECT_ERROR = new FAILUREREASON("CONNECT_ERROR", 1, 2);
            NO_VOICEMAIL_CAPABILITY = new FAILUREREASON("NO_VOICEMAIL_CAPABILITY", 2, 3);
            NO_SUCH_VOICEMAIL = new FAILUREREASON("NO_SUCH_VOICEMAIL", 3, 4);
            FILE_READ_ERROR = new FAILUREREASON("FILE_READ_ERROR", 4, 5);
            FILE_WRITE_ERROR = new FAILUREREASON("FILE_WRITE_ERROR", 5, 6);
            RECORDING_ERROR = new FAILUREREASON("RECORDING_ERROR", 6, 7);
            PLAYBACK_ERROR = new FAILUREREASON("PLAYBACK_ERROR", 7, 8);
            NO_PERMISSION = new FAILUREREASON("NO_PERMISSION", 8, 9);
            RECEIVER_DISABLED_VOICEMAIL = new FAILUREREASON("RECEIVER_DISABLED_VOICEMAIL", 9, 10);
            SENDER_NOT_AUTHORIZED = new FAILUREREASON("SENDER_NOT_AUTHORIZED", 10, 11);
            SENDER_BLOCKED = new FAILUREREASON("SENDER_BLOCKED", 11, 12);
            WRAPPER_UNKNOWN_VALUE = new FAILUREREASON("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
            $VALUES = (new FAILUREREASON[] {
                MISC_ERROR, CONNECT_ERROR, NO_VOICEMAIL_CAPABILITY, NO_SUCH_VOICEMAIL, FILE_READ_ERROR, FILE_WRITE_ERROR, RECORDING_ERROR, PLAYBACK_ERROR, NO_PERMISSION, RECEIVER_DISABLED_VOICEMAIL, 
                SENDER_NOT_AUTHORIZED, SENDER_BLOCKED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            FAILUREREASON afailurereason[] = values();
            int k = afailurereason.length;
            for (int i = 0; i < k; i++)
            {
                FAILUREREASON failurereason = afailurereason[i];
                intToTypeMap.a(failurereason.value, failurereason);
            }

        }

        private FAILUREREASON(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS BLANK;
        public static final STATUS BUFFERING;
        public static final STATUS CANCELLED;
        public static final STATUS CHECKING;
        public static final STATUS DELETING;
        public static final STATUS DELETING_FAILED;
        public static final STATUS DOWNLOADING;
        public static final STATUS FAILED;
        public static final STATUS NOTDOWNLOADED;
        public static final STATUS PLAYED;
        public static final STATUS PLAYING;
        public static final STATUS RECORDED;
        public static final STATUS RECORDING;
        public static final STATUS UNPLAYED;
        public static final STATUS UPLOADED;
        public static final STATUS UPLOADING;
        public static final STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STATUS fromInt(int i)
        {
            STATUS status = (STATUS)intToTypeMap.a(i);
            if (status != null)
            {
                return status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STATUS valueOf(String s)
        {
            return (STATUS)Enum.valueOf(com/skype/Voicemail$STATUS, s);
        }

        public static STATUS[] values()
        {
            return (STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOTDOWNLOADED = new STATUS("NOTDOWNLOADED", 0, 1);
            DOWNLOADING = new STATUS("DOWNLOADING", 1, 2);
            UNPLAYED = new STATUS("UNPLAYED", 2, 3);
            BUFFERING = new STATUS("BUFFERING", 3, 4);
            PLAYING = new STATUS("PLAYING", 4, 5);
            PLAYED = new STATUS("PLAYED", 5, 6);
            BLANK = new STATUS("BLANK", 6, 7);
            RECORDING = new STATUS("RECORDING", 7, 8);
            RECORDED = new STATUS("RECORDED", 8, 9);
            UPLOADING = new STATUS("UPLOADING", 9, 10);
            UPLOADED = new STATUS("UPLOADED", 10, 11);
            DELETING = new STATUS("DELETING", 11, 12);
            FAILED = new STATUS("FAILED", 12, 13);
            DELETING_FAILED = new STATUS("DELETING_FAILED", 13, 14);
            CHECKING = new STATUS("CHECKING", 14, 15);
            CANCELLED = new STATUS("CANCELLED", 15, 16);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 16, 0x7fffffff);
            $VALUES = (new STATUS[] {
                NOTDOWNLOADED, DOWNLOADING, UNPLAYED, BUFFERING, PLAYING, PLAYED, BLANK, RECORDING, RECORDED, UPLOADING, 
                UPLOADED, DELETING, FAILED, DELETING_FAILED, CHECKING, CANCELLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STATUS astatus[] = values();
            int k = astatus.length;
            for (int i = 0; i < k; i++)
            {
                STATUS status = astatus[i];
                intToTypeMap.a(status.value, status);
            }

        }

        private STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE CUSTOM_GREETING;
        public static final TYPE DEFAULT_GREETING;
        public static final TYPE INCOMING;
        public static final TYPE OUTGOING;
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
            return (TYPE)Enum.valueOf(com/skype/Voicemail$TYPE, s);
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
            INCOMING = new TYPE("INCOMING", 0, 1);
            DEFAULT_GREETING = new TYPE("DEFAULT_GREETING", 1, 4);
            CUSTOM_GREETING = new TYPE("CUSTOM_GREETING", 2, 2);
            OUTGOING = new TYPE("OUTGOING", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new TYPE[] {
                INCOMING, DEFAULT_GREETING, CUSTOM_GREETING, OUTGOING, WRAPPER_UNKNOWN_VALUE
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

    public static interface VoicemailIListener
    {
    }


    public abstract void addListener(VoicemailIListener voicemaililistener);

    public abstract boolean cancel();

    public abstract boolean checkPermission();

    public abstract boolean delete();

    public abstract boolean forwardToContacts(int ai[]);

    public abstract boolean forwardToGroups(int ai[]);

    public abstract int getAllowedDurationProp();

    public abstract byte[] getChatmsgGuidProp();

    public abstract int getConvoIdProp();

    public abstract int getDurationProp();

    public abstract int getEventId();

    public abstract FAILUREREASON getFailureReasonProp();

    public abstract String getPartnerDispnameProp();

    public abstract String getPartnerHandleProp();

    public abstract int getPlaybackProgressProp();

    public abstract STATUS getStatusProp();

    public abstract String getSubjectProp();

    public abstract int getTimestampProp();

    public abstract TYPE getTypeProp();

    public abstract void removeListener(VoicemailIListener voicemaililistener);

    public abstract boolean startPlayback();

    public abstract boolean startRecording();

    public abstract boolean stopPlayback();

    public abstract boolean stopRecording();
}
