// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface

public interface Participant
    extends ObjectInterface
{
    public static final class DTMF extends Enum
    {

        private static final DTMF $VALUES[];
        public static final DTMF DTMF_0;
        public static final DTMF DTMF_1;
        public static final DTMF DTMF_2;
        public static final DTMF DTMF_3;
        public static final DTMF DTMF_4;
        public static final DTMF DTMF_5;
        public static final DTMF DTMF_6;
        public static final DTMF DTMF_7;
        public static final DTMF DTMF_8;
        public static final DTMF DTMF_9;
        public static final DTMF DTMF_POUND;
        public static final DTMF DTMF_STAR;
        public static final DTMF WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static DTMF fromInt(int i)
        {
            DTMF dtmf = (DTMF)intToTypeMap.a(i);
            if (dtmf != null)
            {
                return dtmf;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static DTMF valueOf(String s)
        {
            return (DTMF)Enum.valueOf(com/skype/Participant$DTMF, s);
        }

        public static DTMF[] values()
        {
            return (DTMF[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            DTMF_0 = new DTMF("DTMF_0", 0, 0);
            DTMF_1 = new DTMF("DTMF_1", 1, 1);
            DTMF_2 = new DTMF("DTMF_2", 2, 2);
            DTMF_3 = new DTMF("DTMF_3", 3, 3);
            DTMF_4 = new DTMF("DTMF_4", 4, 4);
            DTMF_5 = new DTMF("DTMF_5", 5, 5);
            DTMF_6 = new DTMF("DTMF_6", 6, 6);
            DTMF_7 = new DTMF("DTMF_7", 7, 7);
            DTMF_8 = new DTMF("DTMF_8", 8, 8);
            DTMF_9 = new DTMF("DTMF_9", 9, 9);
            DTMF_STAR = new DTMF("DTMF_STAR", 10, 10);
            DTMF_POUND = new DTMF("DTMF_POUND", 11, 11);
            WRAPPER_UNKNOWN_VALUE = new DTMF("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
            $VALUES = (new DTMF[] {
                DTMF_0, DTMF_1, DTMF_2, DTMF_3, DTMF_4, DTMF_5, DTMF_6, DTMF_7, DTMF_8, DTMF_9, 
                DTMF_STAR, DTMF_POUND, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            DTMF adtmf[] = values();
            int k = adtmf.length;
            for (int i = 0; i < k; i++)
            {
                DTMF dtmf = adtmf[i];
                intToTypeMap.a(dtmf.value, dtmf);
            }

        }

        private DTMF(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class GetLiveSessionVideos_Result
    {

        public boolean m_return;
        public int m_videoObjectIDList[];

        public void init(int ai[], boolean flag)
        {
            m_videoObjectIDList = ai;
            m_return = flag;
        }

        public GetLiveSessionVideos_Result()
        {
        }
    }

    public static final class PARTICIPANT_CAPABILITIES extends Enum
    {

        private static final PARTICIPANT_CAPABILITIES $VALUES[];
        public static final PARTICIPANT_CAPABILITIES PARTICIPANT_CAPABILITIES_ALL;
        public static final PARTICIPANT_CAPABILITIES PARTICIPANT_CAPABILITIES_NONE;
        public static final PARTICIPANT_CAPABILITIES PARTICIPANT_CAPABILITY_SCREEN_SHARING;
        public static final PARTICIPANT_CAPABILITIES PARTICIPANT_CAPABILITY_SCREEN_VIEWING;
        public static final PARTICIPANT_CAPABILITIES PARTICIPANT_GROUP_CALL_COMPATIBLE;
        public static final PARTICIPANT_CAPABILITIES WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTICIPANT_CAPABILITIES fromInt(int i)
        {
            PARTICIPANT_CAPABILITIES participant_capabilities = (PARTICIPANT_CAPABILITIES)intToTypeMap.a(i);
            if (participant_capabilities != null)
            {
                return participant_capabilities;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTICIPANT_CAPABILITIES valueOf(String s)
        {
            return (PARTICIPANT_CAPABILITIES)Enum.valueOf(com/skype/Participant$PARTICIPANT_CAPABILITIES, s);
        }

        public static PARTICIPANT_CAPABILITIES[] values()
        {
            return (PARTICIPANT_CAPABILITIES[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PARTICIPANT_CAPABILITIES_NONE = new PARTICIPANT_CAPABILITIES("PARTICIPANT_CAPABILITIES_NONE", 0, 0);
            PARTICIPANT_GROUP_CALL_COMPATIBLE = new PARTICIPANT_CAPABILITIES("PARTICIPANT_GROUP_CALL_COMPATIBLE", 1, 1);
            PARTICIPANT_CAPABILITY_SCREEN_SHARING = new PARTICIPANT_CAPABILITIES("PARTICIPANT_CAPABILITY_SCREEN_SHARING", 2, 2);
            PARTICIPANT_CAPABILITY_SCREEN_VIEWING = new PARTICIPANT_CAPABILITIES("PARTICIPANT_CAPABILITY_SCREEN_VIEWING", 3, 4);
            PARTICIPANT_CAPABILITIES_ALL = new PARTICIPANT_CAPABILITIES("PARTICIPANT_CAPABILITIES_ALL", 4, 65535);
            WRAPPER_UNKNOWN_VALUE = new PARTICIPANT_CAPABILITIES("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new PARTICIPANT_CAPABILITIES[] {
                PARTICIPANT_CAPABILITIES_NONE, PARTICIPANT_GROUP_CALL_COMPATIBLE, PARTICIPANT_CAPABILITY_SCREEN_SHARING, PARTICIPANT_CAPABILITY_SCREEN_VIEWING, PARTICIPANT_CAPABILITIES_ALL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTICIPANT_CAPABILITIES aparticipant_capabilities[] = values();
            int k = aparticipant_capabilities.length;
            for (int i = 0; i < k; i++)
            {
                PARTICIPANT_CAPABILITIES participant_capabilities = aparticipant_capabilities[i];
                intToTypeMap.a(participant_capabilities.value, participant_capabilities);
            }

        }

        private PARTICIPANT_CAPABILITIES(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface ParticipantIListener
    {

        public abstract void onIncomingDTMF(Participant participant, DTMF dtmf);

        public abstract void onLiveSessionVideosChanged(Participant participant);
    }

    public static final class RANK extends Enum
    {

        private static final RANK $VALUES[];
        public static final RANK ADMIN;
        public static final RANK APPLICANT;
        public static final RANK CREATOR;
        public static final RANK OUTLAW;
        public static final RANK RETIRED;
        public static final RANK SPEAKER;
        public static final RANK SPECTATOR;
        public static final RANK WRAPPER_UNKNOWN_VALUE;
        public static final RANK WRITER;
        private static final j intToTypeMap;
        private final int value;

        public static RANK fromInt(int i)
        {
            RANK rank = (RANK)intToTypeMap.a(i);
            if (rank != null)
            {
                return rank;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static RANK valueOf(String s)
        {
            return (RANK)Enum.valueOf(com/skype/Participant$RANK, s);
        }

        public static RANK[] values()
        {
            return (RANK[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CREATOR = new RANK("CREATOR", 0, 1);
            ADMIN = new RANK("ADMIN", 1, 2);
            SPEAKER = new RANK("SPEAKER", 2, 3);
            WRITER = new RANK("WRITER", 3, 4);
            SPECTATOR = new RANK("SPECTATOR", 4, 5);
            APPLICANT = new RANK("APPLICANT", 5, 6);
            RETIRED = new RANK("RETIRED", 6, 7);
            OUTLAW = new RANK("OUTLAW", 7, 8);
            WRAPPER_UNKNOWN_VALUE = new RANK("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new RANK[] {
                CREATOR, ADMIN, SPEAKER, WRITER, SPECTATOR, APPLICANT, RETIRED, OUTLAW, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            RANK arank[] = values();
            int k = arank.length;
            for (int i = 0; i < k; i++)
            {
                RANK rank = arank[i];
                intToTypeMap.a(rank.value, rank);
            }

        }

        private RANK(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TEXT_STATUS extends Enum
    {

        private static final TEXT_STATUS $VALUES[];
        public static final TEXT_STATUS READING;
        public static final TEXT_STATUS TEXT_NA;
        public static final TEXT_STATUS TEXT_UNKNOWN;
        public static final TEXT_STATUS WRAPPER_UNKNOWN_VALUE;
        public static final TEXT_STATUS WRITING;
        public static final TEXT_STATUS WRITING_AS_ANGRY;
        public static final TEXT_STATUS WRITING_AS_CAT;
        private static final j intToTypeMap;
        private final int value;

        public static TEXT_STATUS fromInt(int i)
        {
            TEXT_STATUS text_status = (TEXT_STATUS)intToTypeMap.a(i);
            if (text_status != null)
            {
                return text_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TEXT_STATUS valueOf(String s)
        {
            return (TEXT_STATUS)Enum.valueOf(com/skype/Participant$TEXT_STATUS, s);
        }

        public static TEXT_STATUS[] values()
        {
            return (TEXT_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TEXT_UNKNOWN = new TEXT_STATUS("TEXT_UNKNOWN", 0, 0);
            TEXT_NA = new TEXT_STATUS("TEXT_NA", 1, 1);
            READING = new TEXT_STATUS("READING", 2, 2);
            WRITING = new TEXT_STATUS("WRITING", 3, 3);
            WRITING_AS_ANGRY = new TEXT_STATUS("WRITING_AS_ANGRY", 4, 4);
            WRITING_AS_CAT = new TEXT_STATUS("WRITING_AS_CAT", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new TEXT_STATUS("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new TEXT_STATUS[] {
                TEXT_UNKNOWN, TEXT_NA, READING, WRITING, WRITING_AS_ANGRY, WRITING_AS_CAT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TEXT_STATUS atext_status[] = values();
            int k = atext_status.length;
            for (int i = 0; i < k; i++)
            {
                TEXT_STATUS text_status = atext_status[i];
                intToTypeMap.a(text_status.value, text_status);
            }

        }

        private TEXT_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class VOICE_STATUS extends Enum
    {

        private static final VOICE_STATUS $VALUES[];
        public static final VOICE_STATUS EARLY_MEDIA;
        public static final VOICE_STATUS LISTENING;
        public static final VOICE_STATUS RINGING;
        public static final VOICE_STATUS SPEAKING;
        public static final VOICE_STATUS VOICE_AVAILABLE;
        public static final VOICE_STATUS VOICE_CONNECTING;
        public static final VOICE_STATUS VOICE_NA;
        public static final VOICE_STATUS VOICE_ON_HOLD;
        public static final VOICE_STATUS VOICE_STOPPED;
        public static final VOICE_STATUS VOICE_UNKNOWN;
        public static final VOICE_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VOICE_STATUS fromInt(int i)
        {
            VOICE_STATUS voice_status = (VOICE_STATUS)intToTypeMap.a(i);
            if (voice_status != null)
            {
                return voice_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VOICE_STATUS valueOf(String s)
        {
            return (VOICE_STATUS)Enum.valueOf(com/skype/Participant$VOICE_STATUS, s);
        }

        public static VOICE_STATUS[] values()
        {
            return (VOICE_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VOICE_UNKNOWN = new VOICE_STATUS("VOICE_UNKNOWN", 0, 0);
            VOICE_NA = new VOICE_STATUS("VOICE_NA", 1, 1);
            VOICE_AVAILABLE = new VOICE_STATUS("VOICE_AVAILABLE", 2, 2);
            VOICE_CONNECTING = new VOICE_STATUS("VOICE_CONNECTING", 3, 3);
            RINGING = new VOICE_STATUS("RINGING", 4, 4);
            EARLY_MEDIA = new VOICE_STATUS("EARLY_MEDIA", 5, 5);
            LISTENING = new VOICE_STATUS("LISTENING", 6, 6);
            SPEAKING = new VOICE_STATUS("SPEAKING", 7, 7);
            VOICE_ON_HOLD = new VOICE_STATUS("VOICE_ON_HOLD", 8, 8);
            VOICE_STOPPED = new VOICE_STATUS("VOICE_STOPPED", 9, 9);
            WRAPPER_UNKNOWN_VALUE = new VOICE_STATUS("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new VOICE_STATUS[] {
                VOICE_UNKNOWN, VOICE_NA, VOICE_AVAILABLE, VOICE_CONNECTING, RINGING, EARLY_MEDIA, LISTENING, SPEAKING, VOICE_ON_HOLD, VOICE_STOPPED, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VOICE_STATUS avoice_status[] = values();
            int k = avoice_status.length;
            for (int i = 0; i < k; i++)
            {
                VOICE_STATUS voice_status = avoice_status[i];
                intToTypeMap.a(voice_status.value, voice_status);
            }

        }

        private VOICE_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(ParticipantIListener participantilistener);

    public abstract boolean canSetRankTo(RANK rank);

    public abstract String getAdderProp();

    public abstract int getConvoIdProp();

    public abstract String getDebuginfoProp();

    public abstract PARTICIPANT_CAPABILITIES getGroupCallingCapabilitiesProp();

    public abstract String getIdentityProp();

    public abstract boolean getIsMultipartyVideoCapableProp();

    public abstract boolean getIsMultipartyVideoUpdatableProp();

    public abstract boolean getIsPremiumVideoSponsorProp();

    public abstract boolean getIsSeamlesslyUpgradedCallProp();

    public abstract SkyLib.CODEC_COMPATIBILITY getIsVideoCodecCompatibleProp();

    public abstract SkyLib.LEAVE_REASON getLastLeavereasonProp();

    public abstract String getLastVoiceErrorProp();

    public abstract String getLiveCountryProp();

    public abstract String getLiveFwdIdentitiesProp();

    public abstract String getLiveIdentityProp();

    public abstract String getLiveIdentityToUseProp();

    public abstract String getLiveIpAddressProp();

    public abstract String getLivePriceForMeProp();

    public abstract GetLiveSessionVideos_Result getLiveSessionVideos();

    public abstract int getLiveStartTimestampProp();

    public abstract SkyLib.IDENTITYTYPE getLiveTypeProp();

    public abstract int getLiveVoicechannelProp();

    public abstract boolean getLivesessionFallbackInProgressProp();

    public abstract boolean getLivesessionRecoveryInProgressProp();

    public abstract String getQualityProblemsProp();

    public abstract RANK getRankProp();

    public abstract int getReadHorizonProp();

    public abstract String getRemoteVersion();

    public abstract RANK getRequestedRankProp();

    public abstract int getSoundLevelProp();

    public abstract TEXT_STATUS getTextStatusProp();

    public abstract String getTransferredByProp();

    public abstract String getTransferredToProp();

    public abstract VOICE_STATUS getVoiceStatusProp();

    public abstract boolean hangup();

    public abstract void removeListener(ParticipantIListener participantilistener);

    public abstract boolean retire();

    public abstract boolean ring();

    public abstract boolean ring(String s);

    public abstract boolean ring(String s, boolean flag);

    public abstract boolean ring(String s, boolean flag, int i);

    public abstract boolean ring(String s, boolean flag, int i, int j);

    public abstract boolean ring(String s, boolean flag, int i, int j, boolean flag1);

    public abstract boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1);

    public abstract boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1, String s2);

    public abstract boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1, String s2, 
            String s3);

    public abstract boolean ringIt();

    public abstract boolean ringIt(boolean flag);

    public abstract boolean ringNodeInfo();

    public abstract boolean ringNodeInfo(String s);

    public abstract boolean ringNodeInfo(String s, boolean flag);

    public abstract boolean ringNodeInfo(String s, boolean flag, byte abyte0[]);

    public abstract boolean ringNodeInfo(String s, boolean flag, byte abyte0[], String s1);

    public abstract boolean setLiveIdentityToUse();

    public abstract boolean setLiveIdentityToUse(String s);

    public abstract boolean setPosition(int i);

    public abstract boolean setRankTo(RANK rank);
}
