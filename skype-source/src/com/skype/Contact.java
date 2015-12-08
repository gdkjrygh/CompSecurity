// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, Conversation, NativeStringConvert

public interface Contact
    extends ObjectInterface
{
    public static final class AUTHLEVEL extends Enum
    {

        private static final AUTHLEVEL $VALUES[];
        public static final AUTHLEVEL AUTHORIZED_BY_ME;
        public static final AUTHLEVEL BLOCKED_BY_ME;
        public static final AUTHLEVEL NONE;
        public static final AUTHLEVEL WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AUTHLEVEL fromInt(int i)
        {
            AUTHLEVEL authlevel = (AUTHLEVEL)intToTypeMap.a(i);
            if (authlevel != null)
            {
                return authlevel;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AUTHLEVEL valueOf(String s)
        {
            return (AUTHLEVEL)Enum.valueOf(com/skype/Contact$AUTHLEVEL, s);
        }

        public static AUTHLEVEL[] values()
        {
            return (AUTHLEVEL[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NONE = new AUTHLEVEL("NONE", 0, 0);
            AUTHORIZED_BY_ME = new AUTHLEVEL("AUTHORIZED_BY_ME", 1, 1);
            BLOCKED_BY_ME = new AUTHLEVEL("BLOCKED_BY_ME", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new AUTHLEVEL("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new AUTHLEVEL[] {
                NONE, AUTHORIZED_BY_ME, BLOCKED_BY_ME, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AUTHLEVEL aauthlevel[] = values();
            int k = aauthlevel.length;
            for (int i = 0; i < k; i++)
            {
                AUTHLEVEL authlevel = aauthlevel[i];
                intToTypeMap.a(authlevel.value, authlevel);
            }

        }

        private AUTHLEVEL(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class AVAILABILITY extends Enum
    {

        private static final AVAILABILITY $VALUES[];
        public static final AVAILABILITY AWAY;
        public static final AVAILABILITY AWAY_FROM_MOBILE;
        public static final AVAILABILITY BLOCKED;
        public static final AVAILABILITY BLOCKED_SKYPEOUT;
        public static final AVAILABILITY CONNECTING;
        public static final AVAILABILITY DO_NOT_DISTURB;
        public static final AVAILABILITY DO_NOT_DISTURB_FROM_MOBILE;
        public static final AVAILABILITY INVISIBLE;
        public static final AVAILABILITY NOT_AVAILABLE;
        public static final AVAILABILITY NOT_AVAILABLE_FROM_MOBILE;
        public static final AVAILABILITY OFFLINE;
        public static final AVAILABILITY OFFLINE_BUT_CF_ABLE;
        public static final AVAILABILITY OFFLINE_BUT_VM_ABLE;
        public static final AVAILABILITY ONLINE;
        public static final AVAILABILITY ONLINE_FROM_MOBILE;
        public static final AVAILABILITY PENDINGAUTH;
        public static final AVAILABILITY SKYPEOUT;
        public static final AVAILABILITY SKYPE_ME;
        public static final AVAILABILITY SKYPE_ME_FROM_MOBILE;
        public static final AVAILABILITY UNKNOWN;
        public static final AVAILABILITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AVAILABILITY fromInt(int i)
        {
            AVAILABILITY availability = (AVAILABILITY)intToTypeMap.a(i);
            if (availability != null)
            {
                return availability;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AVAILABILITY valueOf(String s)
        {
            return (AVAILABILITY)Enum.valueOf(com/skype/Contact$AVAILABILITY, s);
        }

        public static AVAILABILITY[] values()
        {
            return (AVAILABILITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UNKNOWN = new AVAILABILITY("UNKNOWN", 0, 0);
            PENDINGAUTH = new AVAILABILITY("PENDINGAUTH", 1, 8);
            BLOCKED = new AVAILABILITY("BLOCKED", 2, 9);
            BLOCKED_SKYPEOUT = new AVAILABILITY("BLOCKED_SKYPEOUT", 3, 11);
            SKYPEOUT = new AVAILABILITY("SKYPEOUT", 4, 10);
            OFFLINE = new AVAILABILITY("OFFLINE", 5, 1);
            OFFLINE_BUT_VM_ABLE = new AVAILABILITY("OFFLINE_BUT_VM_ABLE", 6, 12);
            OFFLINE_BUT_CF_ABLE = new AVAILABILITY("OFFLINE_BUT_CF_ABLE", 7, 13);
            ONLINE = new AVAILABILITY("ONLINE", 8, 2);
            AWAY = new AVAILABILITY("AWAY", 9, 3);
            NOT_AVAILABLE = new AVAILABILITY("NOT_AVAILABLE", 10, 4);
            DO_NOT_DISTURB = new AVAILABILITY("DO_NOT_DISTURB", 11, 5);
            SKYPE_ME = new AVAILABILITY("SKYPE_ME", 12, 7);
            INVISIBLE = new AVAILABILITY("INVISIBLE", 13, 6);
            CONNECTING = new AVAILABILITY("CONNECTING", 14, 14);
            ONLINE_FROM_MOBILE = new AVAILABILITY("ONLINE_FROM_MOBILE", 15, 15);
            AWAY_FROM_MOBILE = new AVAILABILITY("AWAY_FROM_MOBILE", 16, 16);
            NOT_AVAILABLE_FROM_MOBILE = new AVAILABILITY("NOT_AVAILABLE_FROM_MOBILE", 17, 17);
            DO_NOT_DISTURB_FROM_MOBILE = new AVAILABILITY("DO_NOT_DISTURB_FROM_MOBILE", 18, 18);
            SKYPE_ME_FROM_MOBILE = new AVAILABILITY("SKYPE_ME_FROM_MOBILE", 19, 20);
            WRAPPER_UNKNOWN_VALUE = new AVAILABILITY("WRAPPER_UNKNOWN_VALUE", 20, 0x7fffffff);
            $VALUES = (new AVAILABILITY[] {
                UNKNOWN, PENDINGAUTH, BLOCKED, BLOCKED_SKYPEOUT, SKYPEOUT, OFFLINE, OFFLINE_BUT_VM_ABLE, OFFLINE_BUT_CF_ABLE, ONLINE, AWAY, 
                NOT_AVAILABLE, DO_NOT_DISTURB, SKYPE_ME, INVISIBLE, CONNECTING, ONLINE_FROM_MOBILE, AWAY_FROM_MOBILE, NOT_AVAILABLE_FROM_MOBILE, DO_NOT_DISTURB_FROM_MOBILE, SKYPE_ME_FROM_MOBILE, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AVAILABILITY aavailability[] = values();
            int k = aavailability.length;
            for (int i = 0; i < k; i++)
            {
                AVAILABILITY availability = aavailability[i];
                intToTypeMap.a(availability.value, availability);
            }

        }

        private AVAILABILITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CAPABILITY extends Enum
    {

        private static final CAPABILITY $VALUES[];
        public static final CAPABILITY CAPABILITY_CALL_FORWARD;
        public static final CAPABILITY CAPABILITY_CAN_BE_SENT_VM;
        public static final CAPABILITY CAPABILITY_COMMERCIAL_CONTACT;
        public static final CAPABILITY CAPABILITY_LARGE_CONFERENCE;
        public static final CAPABILITY CAPABILITY_MOBILE_DEVICE;
        public static final CAPABILITY CAPABILITY_PSTN_TRANSFER;
        public static final CAPABILITY CAPABILITY_PUBLIC_CONTACT;
        public static final CAPABILITY CAPABILITY_SERVICE_PROVIDER;
        public static final CAPABILITY CAPABILITY_SKYPEIN;
        public static final CAPABILITY CAPABILITY_SKYPEOUT;
        public static final CAPABILITY CAPABILITY_TEXT;
        public static final CAPABILITY CAPABILITY_TEXT_EVER;
        public static final CAPABILITY CAPABILITY_VIDEO;
        public static final CAPABILITY CAPABILITY_VOICEMAIL;
        public static final CAPABILITY CAPABILITY_VOICE_EVER;
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
            return (CAPABILITY)Enum.valueOf(com/skype/Contact$CAPABILITY, s);
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
            CAPABILITY_VOICEMAIL = new CAPABILITY("CAPABILITY_VOICEMAIL", 0, 0);
            CAPABILITY_SKYPEOUT = new CAPABILITY("CAPABILITY_SKYPEOUT", 1, 1);
            CAPABILITY_SKYPEIN = new CAPABILITY("CAPABILITY_SKYPEIN", 2, 2);
            CAPABILITY_CAN_BE_SENT_VM = new CAPABILITY("CAPABILITY_CAN_BE_SENT_VM", 3, 3);
            CAPABILITY_CALL_FORWARD = new CAPABILITY("CAPABILITY_CALL_FORWARD", 4, 4);
            CAPABILITY_VIDEO = new CAPABILITY("CAPABILITY_VIDEO", 5, 5);
            CAPABILITY_TEXT = new CAPABILITY("CAPABILITY_TEXT", 6, 6);
            CAPABILITY_SERVICE_PROVIDER = new CAPABILITY("CAPABILITY_SERVICE_PROVIDER", 7, 7);
            CAPABILITY_LARGE_CONFERENCE = new CAPABILITY("CAPABILITY_LARGE_CONFERENCE", 8, 8);
            CAPABILITY_COMMERCIAL_CONTACT = new CAPABILITY("CAPABILITY_COMMERCIAL_CONTACT", 9, 9);
            CAPABILITY_PSTN_TRANSFER = new CAPABILITY("CAPABILITY_PSTN_TRANSFER", 10, 10);
            CAPABILITY_TEXT_EVER = new CAPABILITY("CAPABILITY_TEXT_EVER", 11, 11);
            CAPABILITY_VOICE_EVER = new CAPABILITY("CAPABILITY_VOICE_EVER", 12, 12);
            CAPABILITY_MOBILE_DEVICE = new CAPABILITY("CAPABILITY_MOBILE_DEVICE", 13, 13);
            CAPABILITY_PUBLIC_CONTACT = new CAPABILITY("CAPABILITY_PUBLIC_CONTACT", 14, 14);
            WRAPPER_UNKNOWN_VALUE = new CAPABILITY("WRAPPER_UNKNOWN_VALUE", 15, 0x7fffffff);
            $VALUES = (new CAPABILITY[] {
                CAPABILITY_VOICEMAIL, CAPABILITY_SKYPEOUT, CAPABILITY_SKYPEIN, CAPABILITY_CAN_BE_SENT_VM, CAPABILITY_CALL_FORWARD, CAPABILITY_VIDEO, CAPABILITY_TEXT, CAPABILITY_SERVICE_PROVIDER, CAPABILITY_LARGE_CONFERENCE, CAPABILITY_COMMERCIAL_CONTACT, 
                CAPABILITY_PSTN_TRANSFER, CAPABILITY_TEXT_EVER, CAPABILITY_VOICE_EVER, CAPABILITY_MOBILE_DEVICE, CAPABILITY_PUBLIC_CONTACT, WRAPPER_UNKNOWN_VALUE
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

    public static final class CAPABILITYSTATUS extends Enum
    {

        private static final CAPABILITYSTATUS $VALUES[];
        public static final CAPABILITYSTATUS CAPABILITY_EXISTS;
        public static final CAPABILITYSTATUS CAPABILITY_MIXED;
        public static final CAPABILITYSTATUS NO_CAPABILITY;
        public static final CAPABILITYSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CAPABILITYSTATUS fromInt(int i)
        {
            CAPABILITYSTATUS capabilitystatus = (CAPABILITYSTATUS)intToTypeMap.a(i);
            if (capabilitystatus != null)
            {
                return capabilitystatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CAPABILITYSTATUS valueOf(String s)
        {
            return (CAPABILITYSTATUS)Enum.valueOf(com/skype/Contact$CAPABILITYSTATUS, s);
        }

        public static CAPABILITYSTATUS[] values()
        {
            return (CAPABILITYSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NO_CAPABILITY = new CAPABILITYSTATUS("NO_CAPABILITY", 0, 0);
            CAPABILITY_MIXED = new CAPABILITYSTATUS("CAPABILITY_MIXED", 1, 1);
            CAPABILITY_EXISTS = new CAPABILITYSTATUS("CAPABILITY_EXISTS", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new CAPABILITYSTATUS("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CAPABILITYSTATUS[] {
                NO_CAPABILITY, CAPABILITY_MIXED, CAPABILITY_EXISTS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CAPABILITYSTATUS acapabilitystatus[] = values();
            int k = acapabilitystatus.length;
            for (int i = 0; i < k; i++)
            {
                CAPABILITYSTATUS capabilitystatus = acapabilitystatus[i];
                intToTypeMap.a(capabilitystatus.value, capabilitystatus);
            }

        }

        private CAPABILITYSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface ContactIListener
    {
    }

    public static final class EXTRA_AUTHREQ_FIELDS extends Enum
    {

        private static final EXTRA_AUTHREQ_FIELDS $VALUES[];
        public static final EXTRA_AUTHREQ_FIELDS SEND_VERIFIED_COMPANY;
        public static final EXTRA_AUTHREQ_FIELDS SEND_VERIFIED_EMAIL;
        public static final EXTRA_AUTHREQ_FIELDS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static EXTRA_AUTHREQ_FIELDS fromInt(int i)
        {
            EXTRA_AUTHREQ_FIELDS extra_authreq_fields = (EXTRA_AUTHREQ_FIELDS)intToTypeMap.a(i);
            if (extra_authreq_fields != null)
            {
                return extra_authreq_fields;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static EXTRA_AUTHREQ_FIELDS valueOf(String s)
        {
            return (EXTRA_AUTHREQ_FIELDS)Enum.valueOf(com/skype/Contact$EXTRA_AUTHREQ_FIELDS, s);
        }

        public static EXTRA_AUTHREQ_FIELDS[] values()
        {
            return (EXTRA_AUTHREQ_FIELDS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SEND_VERIFIED_EMAIL = new EXTRA_AUTHREQ_FIELDS("SEND_VERIFIED_EMAIL", 0, 1);
            SEND_VERIFIED_COMPANY = new EXTRA_AUTHREQ_FIELDS("SEND_VERIFIED_COMPANY", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new EXTRA_AUTHREQ_FIELDS("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new EXTRA_AUTHREQ_FIELDS[] {
                SEND_VERIFIED_EMAIL, SEND_VERIFIED_COMPANY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            EXTRA_AUTHREQ_FIELDS aextra_authreq_fields[] = values();
            int k = aextra_authreq_fields.length;
            for (int i = 0; i < k; i++)
            {
                EXTRA_AUTHREQ_FIELDS extra_authreq_fields = aextra_authreq_fields[i];
                intToTypeMap.a(extra_authreq_fields.value, extra_authreq_fields);
            }

        }

        private EXTRA_AUTHREQ_FIELDS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class GetAvatar_Result
    {

        public byte m_avatar[];
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_avatar = abyte0;
            m_return = flag;
        }

        public GetAvatar_Result()
        {
        }
    }

    public static class GetKnownRemoteVersions_Result
    {

        public String m_versions[];

        public void init(byte abyte0[][])
        {
            m_versions = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        }

        public GetKnownRemoteVersions_Result()
        {
        }
    }

    public static class GetProfileAttachment_Result
    {

        public byte m_attachment[];
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_attachment = abyte0;
            m_return = flag;
        }

        public GetProfileAttachment_Result()
        {
        }
    }

    public static class GetUnifiedMasters_Result
    {

        public int m_masterObjectIDList[];

        public void init(int ai[])
        {
            m_masterObjectIDList = ai;
        }

        public GetUnifiedMasters_Result()
        {
        }
    }

    public static class GetUnifiedServants_Result
    {

        public int m_servantObjectIDList[];

        public void init(int ai[])
        {
            m_servantObjectIDList = ai;
        }

        public GetUnifiedServants_Result()
        {
        }
    }

    public static final class TYPE extends Enum
    {

        private static final TYPE $VALUES[];
        public static final TYPE BOT;
        public static final TYPE EMERGENCY_PSTN;
        public static final TYPE EXTERNAL;
        public static final TYPE FREE_PSTN;
        public static final TYPE LYNC;
        public static final TYPE PASSPORT;
        public static final TYPE PSTN;
        public static final TYPE SKYPE;
        public static final TYPE UNDISCLOSED_PSTN;
        public static final TYPE UNRECOGNIZED;
        public static final TYPE WRAPPER_UNKNOWN_VALUE;
        public static final TYPE XMPP;
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
            return (TYPE)Enum.valueOf(com/skype/Contact$TYPE, s);
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
            UNRECOGNIZED = new TYPE("UNRECOGNIZED", 0, 0);
            SKYPE = new TYPE("SKYPE", 1, 1);
            PSTN = new TYPE("PSTN", 2, 2);
            EMERGENCY_PSTN = new TYPE("EMERGENCY_PSTN", 3, 3);
            FREE_PSTN = new TYPE("FREE_PSTN", 4, 4);
            UNDISCLOSED_PSTN = new TYPE("UNDISCLOSED_PSTN", 5, 5);
            EXTERNAL = new TYPE("EXTERNAL", 6, 6);
            XMPP = new TYPE("XMPP", 7, 7);
            PASSPORT = new TYPE("PASSPORT", 8, 8);
            LYNC = new TYPE("LYNC", 9, 9);
            BOT = new TYPE("BOT", 10, 10);
            WRAPPER_UNKNOWN_VALUE = new TYPE("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
            $VALUES = (new TYPE[] {
                UNRECOGNIZED, SKYPE, PSTN, EMERGENCY_PSTN, FREE_PSTN, UNDISCLOSED_PSTN, EXTERNAL, XMPP, PASSPORT, LYNC, 
                BOT, WRAPPER_UNKNOWN_VALUE
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


    public abstract void addListener(ContactIListener contactilistener);

    public abstract boolean assignSpeedDial(String s);

    public abstract boolean copyLocalDataFrom(int i);

    public abstract String getAboutProp();

    public abstract String getAlertstringProp();

    public abstract String getAssignedCommentProp();

    public abstract String getAssignedPhone1LabelProp();

    public abstract String getAssignedPhone1Prop();

    public abstract String getAssignedPhone2LabelProp();

    public abstract String getAssignedPhone2Prop();

    public abstract String getAssignedPhone3LabelProp();

    public abstract String getAssignedPhone3Prop();

    public abstract String getAssignedSpeeddialProp();

    public abstract int getAuthreqTimestampProp();

    public abstract int getAuthrequestCountProp();

    public abstract AVAILABILITY getAvailabilityProp();

    public abstract GetAvatar_Result getAvatar();

    public abstract byte[] getAvatarImageProp();

    public abstract int getAvatarTimestampProp();

    public abstract int getBirthdayProp();

    public abstract byte[] getCapabilitiesProp();

    public abstract CAPABILITYSTATUS getCapabilityStatus(CAPABILITY capability);

    public abstract CAPABILITYSTATUS getCapabilityStatus(CAPABILITY capability, boolean flag);

    public abstract String getCityProp();

    public abstract String getCountryProp();

    public abstract String getDisplaynameProp();

    public abstract String getEmailsProp();

    public abstract String getExternalIdProp();

    public abstract String getExternalSystemIdProp();

    public abstract String getFirstnameProp();

    public abstract String getFullnameProp();

    public abstract int getGenderProp();

    public abstract AUTHLEVEL getGivenAuthlevelProp();

    public abstract String getGivenDisplaynameProp();

    public abstract String getHashedEmailsProp();

    public abstract String getHomepageProp();

    public abstract String getIdentity();

    public abstract String getIpcountryProp();

    public abstract int getIsMobileProp();

    public abstract int getIsTrustedProp();

    public abstract GetKnownRemoteVersions_Result getKnownRemoteVersions();

    public abstract GetKnownRemoteVersions_Result getKnownRemoteVersions(boolean flag);

    public abstract String getLanguagesProp();

    public abstract String getLastnameProp();

    public abstract int getLastonlineTimestampProp();

    public abstract int getLastusedTimestampProp();

    public abstract String getMoodTextProp();

    public abstract int getMoodTimestampProp();

    public abstract int getNrofAuthedBuddiesProp();

    public abstract String getPhoneHomeProp();

    public abstract String getPhoneMobileProp();

    public abstract String getPhoneOfficeProp();

    public abstract int getPopularityOrdProp();

    public abstract GetProfileAttachment_Result getProfileAttachment(String s);

    public abstract int getProfileTimestampProp();

    public abstract String getProvinceProp();

    public abstract String getPstnnumberProp();

    public abstract String getReceivedAuthrequestProp();

    public abstract boolean getRefreshingProp();

    public abstract String getRichMoodTextProp();

    public abstract String getSkypenameProp();

    public abstract int getTimezoneProp();

    public abstract TYPE getType();

    public abstract TYPE getTypeProp();

    public abstract GetUnifiedMasters_Result getUnifiedMasters();

    public abstract GetUnifiedServants_Result getUnifiedServants();

    public abstract String getVerifiedCompany();

    public abstract String getVerifiedEmail();

    public abstract boolean giveDisplayName(String s);

    public abstract boolean hasAuthorizedMe();

    public abstract boolean hasCapability(CAPABILITY capability);

    public abstract boolean hasCapability(CAPABILITY capability, boolean flag);

    public abstract boolean ignoreAuthRequest();

    public abstract boolean isMemberOf(int i);

    public abstract boolean isMemberOfHardwiredGroup(ContactGroup.TYPE type);

    public abstract boolean openConversation(Conversation conversation);

    public abstract void refreshProfile();

    public abstract void removeListener(ContactIListener contactilistener);

    public abstract boolean sendAuthRequest(String s);

    public abstract boolean sendAuthRequest(String s, int i);

    public abstract boolean setBlocked(boolean flag);

    public abstract boolean setBlocked(boolean flag, boolean flag1);

    public abstract boolean setBuddyStatus(boolean flag);

    public abstract boolean setBuddyStatus(boolean flag, boolean flag1);

    public abstract boolean setPhoneNumber(int i, String s, String s1);
}
