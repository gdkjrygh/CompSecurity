// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, PROPKEY, NativeStringConvert

public interface Account
    extends ObjectInterface
{
    public static final class ADPOLICY extends Enum
    {

        private static final ADPOLICY $VALUES[];
        public static final ADPOLICY ADS_ENABLED;
        public static final ADPOLICY ADS_ENABLED_NOTARGET;
        public static final ADPOLICY ADS_RESERVED1;
        public static final ADPOLICY ADS_RESERVED2;
        public static final ADPOLICY ADS_RESERVED3;
        public static final ADPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static ADPOLICY fromInt(int i)
        {
            ADPOLICY adpolicy = (ADPOLICY)intToTypeMap.a(i);
            if (adpolicy != null)
            {
                return adpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static ADPOLICY valueOf(String s)
        {
            return (ADPOLICY)Enum.valueOf(com/skype/Account$ADPOLICY, s);
        }

        public static ADPOLICY[] values()
        {
            return (ADPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ADS_ENABLED = new ADPOLICY("ADS_ENABLED", 0, 0);
            ADS_RESERVED1 = new ADPOLICY("ADS_RESERVED1", 1, 1);
            ADS_RESERVED2 = new ADPOLICY("ADS_RESERVED2", 2, 2);
            ADS_RESERVED3 = new ADPOLICY("ADS_RESERVED3", 3, 3);
            ADS_ENABLED_NOTARGET = new ADPOLICY("ADS_ENABLED_NOTARGET", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new ADPOLICY("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new ADPOLICY[] {
                ADS_ENABLED, ADS_RESERVED1, ADS_RESERVED2, ADS_RESERVED3, ADS_ENABLED_NOTARGET, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            ADPOLICY aadpolicy[] = values();
            int k = aadpolicy.length;
            for (int i = 0; i < k; i++)
            {
                ADPOLICY adpolicy = aadpolicy[i];
                intToTypeMap.a(adpolicy.value, adpolicy);
            }

        }

        private ADPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class AUTHREQUESTPOLICY extends Enum
    {

        private static final AUTHREQUESTPOLICY $VALUES[];
        public static final AUTHREQUESTPOLICY AUTHREQUEST_DISABLED;
        public static final AUTHREQUESTPOLICY AUTHREQUEST_ENABLED;
        public static final AUTHREQUESTPOLICY CHAT_PARTICIPANTS_CAN_AUTHREQ;
        public static final AUTHREQUESTPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AUTHREQUESTPOLICY fromInt(int i)
        {
            AUTHREQUESTPOLICY authrequestpolicy = (AUTHREQUESTPOLICY)intToTypeMap.a(i);
            if (authrequestpolicy != null)
            {
                return authrequestpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AUTHREQUESTPOLICY valueOf(String s)
        {
            return (AUTHREQUESTPOLICY)Enum.valueOf(com/skype/Account$AUTHREQUESTPOLICY, s);
        }

        public static AUTHREQUESTPOLICY[] values()
        {
            return (AUTHREQUESTPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            AUTHREQUEST_ENABLED = new AUTHREQUESTPOLICY("AUTHREQUEST_ENABLED", 0, 0);
            CHAT_PARTICIPANTS_CAN_AUTHREQ = new AUTHREQUESTPOLICY("CHAT_PARTICIPANTS_CAN_AUTHREQ", 1, 5);
            AUTHREQUEST_DISABLED = new AUTHREQUESTPOLICY("AUTHREQUEST_DISABLED", 2, 9);
            WRAPPER_UNKNOWN_VALUE = new AUTHREQUESTPOLICY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new AUTHREQUESTPOLICY[] {
                AUTHREQUEST_ENABLED, CHAT_PARTICIPANTS_CAN_AUTHREQ, AUTHREQUEST_DISABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AUTHREQUESTPOLICY aauthrequestpolicy[] = values();
            int k = aauthrequestpolicy.length;
            for (int i = 0; i < k; i++)
            {
                AUTHREQUESTPOLICY authrequestpolicy = aauthrequestpolicy[i];
                intToTypeMap.a(authrequestpolicy.value, authrequestpolicy);
            }

        }

        private AUTHREQUESTPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class AVATARPOLICY extends Enum
    {

        private static final AVATARPOLICY $VALUES[];
        public static final AVATARPOLICY BUDDIES_OR_AUTHORIZED_CAN_SEE;
        public static final AVATARPOLICY EVERYONE_CAN_SEE;
        public static final AVATARPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AVATARPOLICY fromInt(int i)
        {
            AVATARPOLICY avatarpolicy = (AVATARPOLICY)intToTypeMap.a(i);
            if (avatarpolicy != null)
            {
                return avatarpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AVATARPOLICY valueOf(String s)
        {
            return (AVATARPOLICY)Enum.valueOf(com/skype/Account$AVATARPOLICY, s);
        }

        public static AVATARPOLICY[] values()
        {
            return (AVATARPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            BUDDIES_OR_AUTHORIZED_CAN_SEE = new AVATARPOLICY("BUDDIES_OR_AUTHORIZED_CAN_SEE", 0, 0);
            EVERYONE_CAN_SEE = new AVATARPOLICY("EVERYONE_CAN_SEE", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new AVATARPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new AVATARPOLICY[] {
                BUDDIES_OR_AUTHORIZED_CAN_SEE, EVERYONE_CAN_SEE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AVATARPOLICY aavatarpolicy[] = values();
            int k = aavatarpolicy.length;
            for (int i = 0; i < k; i++)
            {
                AVATARPOLICY avatarpolicy = aavatarpolicy[i];
                intToTypeMap.a(avatarpolicy.value, avatarpolicy);
            }

        }

        private AVATARPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface AccountIListener
    {

        public abstract void onEndpointsChanged(Account account);
    }

    public static final class BUDDYCOUNTPOLICY extends Enum
    {

        private static final BUDDYCOUNTPOLICY $VALUES[];
        public static final BUDDYCOUNTPOLICY DISCLOSE_TO_AUTHORIZED;
        public static final BUDDYCOUNTPOLICY DISCLOSE_TO_NOONE;
        public static final BUDDYCOUNTPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static BUDDYCOUNTPOLICY fromInt(int i)
        {
            BUDDYCOUNTPOLICY buddycountpolicy = (BUDDYCOUNTPOLICY)intToTypeMap.a(i);
            if (buddycountpolicy != null)
            {
                return buddycountpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static BUDDYCOUNTPOLICY valueOf(String s)
        {
            return (BUDDYCOUNTPOLICY)Enum.valueOf(com/skype/Account$BUDDYCOUNTPOLICY, s);
        }

        public static BUDDYCOUNTPOLICY[] values()
        {
            return (BUDDYCOUNTPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            DISCLOSE_TO_AUTHORIZED = new BUDDYCOUNTPOLICY("DISCLOSE_TO_AUTHORIZED", 0, 0);
            DISCLOSE_TO_NOONE = new BUDDYCOUNTPOLICY("DISCLOSE_TO_NOONE", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new BUDDYCOUNTPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new BUDDYCOUNTPOLICY[] {
                DISCLOSE_TO_AUTHORIZED, DISCLOSE_TO_NOONE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            BUDDYCOUNTPOLICY abuddycountpolicy[] = values();
            int k = abuddycountpolicy.length;
            for (int i = 0; i < k; i++)
            {
                BUDDYCOUNTPOLICY buddycountpolicy = abuddycountpolicy[i];
                intToTypeMap.a(buddycountpolicy.value, buddycountpolicy);
            }

        }

        private BUDDYCOUNTPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CAPABILITYSTATUS extends Enum
    {

        private static final CAPABILITYSTATUS $VALUES[];
        public static final CAPABILITYSTATUS CAPABILITY_EXISTS;
        public static final CAPABILITYSTATUS FINAL_EXPIRY_WARNING;
        public static final CAPABILITYSTATUS FIRST_EXPIRY_WARNING;
        public static final CAPABILITYSTATUS NO_CAPABILITY;
        public static final CAPABILITYSTATUS SECOND_EXPIRY_WARNING;
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
            return (CAPABILITYSTATUS)Enum.valueOf(com/skype/Account$CAPABILITYSTATUS, s);
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
            CAPABILITY_EXISTS = new CAPABILITYSTATUS("CAPABILITY_EXISTS", 1, 1);
            FIRST_EXPIRY_WARNING = new CAPABILITYSTATUS("FIRST_EXPIRY_WARNING", 2, 2);
            SECOND_EXPIRY_WARNING = new CAPABILITYSTATUS("SECOND_EXPIRY_WARNING", 3, 3);
            FINAL_EXPIRY_WARNING = new CAPABILITYSTATUS("FINAL_EXPIRY_WARNING", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new CAPABILITYSTATUS("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new CAPABILITYSTATUS[] {
                NO_CAPABILITY, CAPABILITY_EXISTS, FIRST_EXPIRY_WARNING, SECOND_EXPIRY_WARNING, FINAL_EXPIRY_WARNING, WRAPPER_UNKNOWN_VALUE
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

    public static final class CBLSYNCSTATUS extends Enum
    {

        private static final CBLSYNCSTATUS $VALUES[];
        public static final CBLSYNCSTATUS CBL_INITIALIZING;
        public static final CBLSYNCSTATUS CBL_INITIAL_SYNC_PENDING;
        public static final CBLSYNCSTATUS CBL_IN_SYNC;
        public static final CBLSYNCSTATUS CBL_REMOTE_SYNC_PENDING;
        public static final CBLSYNCSTATUS CBL_SYNC_FAILED;
        public static final CBLSYNCSTATUS CBL_SYNC_IN_PROGRESS;
        public static final CBLSYNCSTATUS CBL_SYNC_PENDING;
        public static final CBLSYNCSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CBLSYNCSTATUS fromInt(int i)
        {
            CBLSYNCSTATUS cblsyncstatus = (CBLSYNCSTATUS)intToTypeMap.a(i);
            if (cblsyncstatus != null)
            {
                return cblsyncstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CBLSYNCSTATUS valueOf(String s)
        {
            return (CBLSYNCSTATUS)Enum.valueOf(com/skype/Account$CBLSYNCSTATUS, s);
        }

        public static CBLSYNCSTATUS[] values()
        {
            return (CBLSYNCSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CBL_INITIALIZING = new CBLSYNCSTATUS("CBL_INITIALIZING", 0, 0);
            CBL_INITIAL_SYNC_PENDING = new CBLSYNCSTATUS("CBL_INITIAL_SYNC_PENDING", 1, 1);
            CBL_SYNC_PENDING = new CBLSYNCSTATUS("CBL_SYNC_PENDING", 2, 2);
            CBL_SYNC_IN_PROGRESS = new CBLSYNCSTATUS("CBL_SYNC_IN_PROGRESS", 3, 3);
            CBL_IN_SYNC = new CBLSYNCSTATUS("CBL_IN_SYNC", 4, 4);
            CBL_SYNC_FAILED = new CBLSYNCSTATUS("CBL_SYNC_FAILED", 5, 5);
            CBL_REMOTE_SYNC_PENDING = new CBLSYNCSTATUS("CBL_REMOTE_SYNC_PENDING", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new CBLSYNCSTATUS("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new CBLSYNCSTATUS[] {
                CBL_INITIALIZING, CBL_INITIAL_SYNC_PENDING, CBL_SYNC_PENDING, CBL_SYNC_IN_PROGRESS, CBL_IN_SYNC, CBL_SYNC_FAILED, CBL_REMOTE_SYNC_PENDING, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CBLSYNCSTATUS acblsyncstatus[] = values();
            int k = acblsyncstatus.length;
            for (int i = 0; i < k; i++)
            {
                CBLSYNCSTATUS cblsyncstatus = acblsyncstatus[i];
                intToTypeMap.a(cblsyncstatus.value, cblsyncstatus);
            }

        }

        private CBLSYNCSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CHATPOLICY extends Enum
    {

        private static final CHATPOLICY $VALUES[];
        public static final CHATPOLICY BUDDIES_OR_AUTHORIZED_CAN_ADD;
        public static final CHATPOLICY EVERYONE_CAN_ADD;
        public static final CHATPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CHATPOLICY fromInt(int i)
        {
            CHATPOLICY chatpolicy = (CHATPOLICY)intToTypeMap.a(i);
            if (chatpolicy != null)
            {
                return chatpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CHATPOLICY valueOf(String s)
        {
            return (CHATPOLICY)Enum.valueOf(com/skype/Account$CHATPOLICY, s);
        }

        public static CHATPOLICY[] values()
        {
            return (CHATPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            EVERYONE_CAN_ADD = new CHATPOLICY("EVERYONE_CAN_ADD", 0, 0);
            BUDDIES_OR_AUTHORIZED_CAN_ADD = new CHATPOLICY("BUDDIES_OR_AUTHORIZED_CAN_ADD", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new CHATPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new CHATPOLICY[] {
                EVERYONE_CAN_ADD, BUDDIES_OR_AUTHORIZED_CAN_ADD, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CHATPOLICY achatpolicy[] = values();
            int k = achatpolicy.length;
            for (int i = 0; i < k; i++)
            {
                CHATPOLICY chatpolicy = achatpolicy[i];
                intToTypeMap.a(chatpolicy.value, chatpolicy);
            }

        }

        private CHATPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class COMMITSTATUS extends Enum
    {

        private static final COMMITSTATUS $VALUES[];
        public static final COMMITSTATUS COMMITTED;
        public static final COMMITSTATUS COMMITTING_TO_SERVER;
        public static final COMMITSTATUS COMMIT_FAILED;
        public static final COMMITSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static COMMITSTATUS fromInt(int i)
        {
            COMMITSTATUS commitstatus = (COMMITSTATUS)intToTypeMap.a(i);
            if (commitstatus != null)
            {
                return commitstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static COMMITSTATUS valueOf(String s)
        {
            return (COMMITSTATUS)Enum.valueOf(com/skype/Account$COMMITSTATUS, s);
        }

        public static COMMITSTATUS[] values()
        {
            return (COMMITSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            COMMITTED = new COMMITSTATUS("COMMITTED", 0, 1);
            COMMITTING_TO_SERVER = new COMMITSTATUS("COMMITTING_TO_SERVER", 1, 2);
            COMMIT_FAILED = new COMMITSTATUS("COMMIT_FAILED", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new COMMITSTATUS("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new COMMITSTATUS[] {
                COMMITTED, COMMITTING_TO_SERVER, COMMIT_FAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            COMMITSTATUS acommitstatus[] = values();
            int k = acommitstatus.length;
            for (int i = 0; i < k; i++)
            {
                COMMITSTATUS commitstatus = acommitstatus[i];
                intToTypeMap.a(commitstatus.value, commitstatus);
            }

        }

        private COMMITSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class FEDERATEDPRESENCEPOLICY extends Enum
    {

        private static final FEDERATEDPRESENCEPOLICY $VALUES[];
        public static final FEDERATEDPRESENCEPOLICY FEDERATED_DISABLE_FLAMINGO;
        public static final FEDERATEDPRESENCEPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static FEDERATEDPRESENCEPOLICY fromInt(int i)
        {
            FEDERATEDPRESENCEPOLICY federatedpresencepolicy = (FEDERATEDPRESENCEPOLICY)intToTypeMap.a(i);
            if (federatedpresencepolicy != null)
            {
                return federatedpresencepolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static FEDERATEDPRESENCEPOLICY valueOf(String s)
        {
            return (FEDERATEDPRESENCEPOLICY)Enum.valueOf(com/skype/Account$FEDERATEDPRESENCEPOLICY, s);
        }

        public static FEDERATEDPRESENCEPOLICY[] values()
        {
            return (FEDERATEDPRESENCEPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            FEDERATED_DISABLE_FLAMINGO = new FEDERATEDPRESENCEPOLICY("FEDERATED_DISABLE_FLAMINGO", 0, 1);
            WRAPPER_UNKNOWN_VALUE = new FEDERATEDPRESENCEPOLICY("WRAPPER_UNKNOWN_VALUE", 1, 0x7fffffff);
            $VALUES = (new FEDERATEDPRESENCEPOLICY[] {
                FEDERATED_DISABLE_FLAMINGO, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            FEDERATEDPRESENCEPOLICY afederatedpresencepolicy[] = values();
            int k = afederatedpresencepolicy.length;
            for (int i = 0; i < k; i++)
            {
                FEDERATEDPRESENCEPOLICY federatedpresencepolicy = afederatedpresencepolicy[i];
                intToTypeMap.a(federatedpresencepolicy.value, federatedpresencepolicy);
            }

        }

        private FEDERATEDPRESENCEPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class GetCapabilityStatus_Result
    {

        public int m_expiryTimestamp;
        public CAPABILITYSTATUS m_return;

        public void init(int i, CAPABILITYSTATUS capabilitystatus)
        {
            m_expiryTimestamp = i;
            m_return = capabilitystatus;
        }

        public GetCapabilityStatus_Result()
        {
        }
    }

    public static class GetOwnEndpointsInfo_Result
    {

        public String m_id[];
        public String m_name[];
        public String m_type[];

        public void init(byte abyte0[][], byte abyte1[][], byte abyte2[][])
        {
            m_id = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_name = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_type = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
        }

        public GetOwnEndpointsInfo_Result()
        {
        }
    }

    public static class GetStatusWithProgress_Result
    {

        public int m_progress;
        public STATUS m_return;

        public void init(int i, STATUS status)
        {
            m_progress = i;
            m_return = status;
        }

        public GetStatusWithProgress_Result()
        {
        }
    }

    public static class GetSubscriptionInfo_Result
    {

        public int m_endtime[];
        public String m_name[];
        public int m_package_type[];
        public int m_service_type[];
        public int m_status[];

        public void init(byte abyte0[][], int ai[], int ai1[], int ai2[], int ai3[])
        {
            m_name = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_endtime = ai;
            m_status = ai1;
            m_package_type = ai2;
            m_service_type = ai3;
        }

        public GetSubscriptionInfo_Result()
        {
        }
    }

    public static final class LOGOUTREASON extends Enum
    {

        private static final LOGOUTREASON $VALUES[];
        public static final LOGOUTREASON ACCESS_TOKEN_RENEWAL_FAILED;
        public static final LOGOUTREASON APP_ID_FAILURE;
        public static final LOGOUTREASON ATO_BLOCKED;
        public static final LOGOUTREASON DB_ACCESS_DENIED;
        public static final LOGOUTREASON DB_CANTOPEN;
        public static final LOGOUTREASON DB_CORRUPT;
        public static final LOGOUTREASON DB_DISK_FULL;
        public static final LOGOUTREASON DB_FAILURE;
        public static final LOGOUTREASON DB_IN_USE;
        public static final LOGOUTREASON DB_IO_ERROR;
        public static final LOGOUTREASON HTTPS_PROXY_AUTH_FAILED;
        public static final LOGOUTREASON INCORRECT_PASSWORD;
        public static final LOGOUTREASON INVALID_APP_ID;
        public static final LOGOUTREASON INVALID_EMAIL;
        public static final LOGOUTREASON INVALID_SKYPENAME;
        public static final LOGOUTREASON LOGOUT_CALLED;
        public static final LOGOUTREASON NO_SUCH_IDENTITY;
        public static final LOGOUTREASON P2P_CONNECT_FAILED;
        public static final LOGOUTREASON PASSWORD_HAS_CHANGED;
        public static final LOGOUTREASON PERIODIC_UIC_UPDATE_FAILED;
        public static final LOGOUTREASON REJECTED_AS_UNDERAGE;
        public static final LOGOUTREASON REMOTE_LOGOUT;
        public static final LOGOUTREASON SERVER_CONNECT_FAILED;
        public static final LOGOUTREASON SERVER_OVERLOADED;
        public static final LOGOUTREASON SKYPENAME_TAKEN;
        public static final LOGOUTREASON SOCKS_PROXY_AUTH_FAILED;
        public static final LOGOUTREASON TOO_MANY_LOGIN_ATTEMPTS;
        public static final LOGOUTREASON UNACCEPTABLE_PASSWORD;
        public static final LOGOUTREASON UNSUPPORTED_VERSION;
        public static final LOGOUTREASON WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LOGOUTREASON fromInt(int i)
        {
            LOGOUTREASON logoutreason = (LOGOUTREASON)intToTypeMap.a(i);
            if (logoutreason != null)
            {
                return logoutreason;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LOGOUTREASON valueOf(String s)
        {
            return (LOGOUTREASON)Enum.valueOf(com/skype/Account$LOGOUTREASON, s);
        }

        public static LOGOUTREASON[] values()
        {
            return (LOGOUTREASON[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LOGOUT_CALLED = new LOGOUTREASON("LOGOUT_CALLED", 0, 1);
            HTTPS_PROXY_AUTH_FAILED = new LOGOUTREASON("HTTPS_PROXY_AUTH_FAILED", 1, 2);
            SOCKS_PROXY_AUTH_FAILED = new LOGOUTREASON("SOCKS_PROXY_AUTH_FAILED", 2, 3);
            P2P_CONNECT_FAILED = new LOGOUTREASON("P2P_CONNECT_FAILED", 3, 4);
            SERVER_CONNECT_FAILED = new LOGOUTREASON("SERVER_CONNECT_FAILED", 4, 5);
            SERVER_OVERLOADED = new LOGOUTREASON("SERVER_OVERLOADED", 5, 6);
            DB_IN_USE = new LOGOUTREASON("DB_IN_USE", 6, 7);
            INVALID_SKYPENAME = new LOGOUTREASON("INVALID_SKYPENAME", 7, 8);
            INVALID_EMAIL = new LOGOUTREASON("INVALID_EMAIL", 8, 9);
            UNACCEPTABLE_PASSWORD = new LOGOUTREASON("UNACCEPTABLE_PASSWORD", 9, 10);
            SKYPENAME_TAKEN = new LOGOUTREASON("SKYPENAME_TAKEN", 10, 11);
            REJECTED_AS_UNDERAGE = new LOGOUTREASON("REJECTED_AS_UNDERAGE", 11, 12);
            NO_SUCH_IDENTITY = new LOGOUTREASON("NO_SUCH_IDENTITY", 12, 13);
            INCORRECT_PASSWORD = new LOGOUTREASON("INCORRECT_PASSWORD", 13, 14);
            TOO_MANY_LOGIN_ATTEMPTS = new LOGOUTREASON("TOO_MANY_LOGIN_ATTEMPTS", 14, 15);
            PASSWORD_HAS_CHANGED = new LOGOUTREASON("PASSWORD_HAS_CHANGED", 15, 16);
            PERIODIC_UIC_UPDATE_FAILED = new LOGOUTREASON("PERIODIC_UIC_UPDATE_FAILED", 16, 17);
            DB_DISK_FULL = new LOGOUTREASON("DB_DISK_FULL", 17, 18);
            DB_IO_ERROR = new LOGOUTREASON("DB_IO_ERROR", 18, 19);
            DB_CORRUPT = new LOGOUTREASON("DB_CORRUPT", 19, 20);
            DB_FAILURE = new LOGOUTREASON("DB_FAILURE", 20, 21);
            INVALID_APP_ID = new LOGOUTREASON("INVALID_APP_ID", 21, 22);
            APP_ID_FAILURE = new LOGOUTREASON("APP_ID_FAILURE", 22, 23);
            UNSUPPORTED_VERSION = new LOGOUTREASON("UNSUPPORTED_VERSION", 23, 24);
            ATO_BLOCKED = new LOGOUTREASON("ATO_BLOCKED", 24, 25);
            REMOTE_LOGOUT = new LOGOUTREASON("REMOTE_LOGOUT", 25, 26);
            ACCESS_TOKEN_RENEWAL_FAILED = new LOGOUTREASON("ACCESS_TOKEN_RENEWAL_FAILED", 26, 27);
            DB_CANTOPEN = new LOGOUTREASON("DB_CANTOPEN", 27, 28);
            DB_ACCESS_DENIED = new LOGOUTREASON("DB_ACCESS_DENIED", 28, 29);
            WRAPPER_UNKNOWN_VALUE = new LOGOUTREASON("WRAPPER_UNKNOWN_VALUE", 29, 0x7fffffff);
            $VALUES = (new LOGOUTREASON[] {
                LOGOUT_CALLED, HTTPS_PROXY_AUTH_FAILED, SOCKS_PROXY_AUTH_FAILED, P2P_CONNECT_FAILED, SERVER_CONNECT_FAILED, SERVER_OVERLOADED, DB_IN_USE, INVALID_SKYPENAME, INVALID_EMAIL, UNACCEPTABLE_PASSWORD, 
                SKYPENAME_TAKEN, REJECTED_AS_UNDERAGE, NO_SUCH_IDENTITY, INCORRECT_PASSWORD, TOO_MANY_LOGIN_ATTEMPTS, PASSWORD_HAS_CHANGED, PERIODIC_UIC_UPDATE_FAILED, DB_DISK_FULL, DB_IO_ERROR, DB_CORRUPT, 
                DB_FAILURE, INVALID_APP_ID, APP_ID_FAILURE, UNSUPPORTED_VERSION, ATO_BLOCKED, REMOTE_LOGOUT, ACCESS_TOKEN_RENEWAL_FAILED, DB_CANTOPEN, DB_ACCESS_DENIED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LOGOUTREASON alogoutreason[] = values();
            int k = alogoutreason.length;
            for (int i = 0; i < k; i++)
            {
                LOGOUTREASON logoutreason = alogoutreason[i];
                intToTypeMap.a(logoutreason.value, logoutreason);
            }

        }

        private LOGOUTREASON(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PACKAGETYPE extends Enum
    {

        private static final PACKAGETYPE $VALUES[];
        public static final PACKAGETYPE PT_DAYPASS;
        public static final PACKAGETYPE PT_FREETRIAL;
        public static final PACKAGETYPE PT_NONE;
        public static final PACKAGETYPE PT_SUBSCRIPTION;
        public static final PACKAGETYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PACKAGETYPE fromInt(int i)
        {
            PACKAGETYPE packagetype = (PACKAGETYPE)intToTypeMap.a(i);
            if (packagetype != null)
            {
                return packagetype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PACKAGETYPE valueOf(String s)
        {
            return (PACKAGETYPE)Enum.valueOf(com/skype/Account$PACKAGETYPE, s);
        }

        public static PACKAGETYPE[] values()
        {
            return (PACKAGETYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PT_NONE = new PACKAGETYPE("PT_NONE", 0, 0);
            PT_SUBSCRIPTION = new PACKAGETYPE("PT_SUBSCRIPTION", 1, 1);
            PT_DAYPASS = new PACKAGETYPE("PT_DAYPASS", 2, 2);
            PT_FREETRIAL = new PACKAGETYPE("PT_FREETRIAL", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new PACKAGETYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new PACKAGETYPE[] {
                PT_NONE, PT_SUBSCRIPTION, PT_DAYPASS, PT_FREETRIAL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PACKAGETYPE apackagetype[] = values();
            int k = apackagetype.length;
            for (int i = 0; i < k; i++)
            {
                PACKAGETYPE packagetype = apackagetype[i];
                intToTypeMap.a(packagetype.value, packagetype);
            }

        }

        private PACKAGETYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PHONENUMBERSPOLICY extends Enum
    {

        private static final PHONENUMBERSPOLICY $VALUES[];
        public static final PHONENUMBERSPOLICY PHONENUMBERS_VISIBLE_FOR_BUDDIES;
        public static final PHONENUMBERSPOLICY PHONENUMBERS_VISIBLE_FOR_EVERYONE;
        public static final PHONENUMBERSPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PHONENUMBERSPOLICY fromInt(int i)
        {
            PHONENUMBERSPOLICY phonenumberspolicy = (PHONENUMBERSPOLICY)intToTypeMap.a(i);
            if (phonenumberspolicy != null)
            {
                return phonenumberspolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PHONENUMBERSPOLICY valueOf(String s)
        {
            return (PHONENUMBERSPOLICY)Enum.valueOf(com/skype/Account$PHONENUMBERSPOLICY, s);
        }

        public static PHONENUMBERSPOLICY[] values()
        {
            return (PHONENUMBERSPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PHONENUMBERS_VISIBLE_FOR_BUDDIES = new PHONENUMBERSPOLICY("PHONENUMBERS_VISIBLE_FOR_BUDDIES", 0, 0);
            PHONENUMBERS_VISIBLE_FOR_EVERYONE = new PHONENUMBERSPOLICY("PHONENUMBERS_VISIBLE_FOR_EVERYONE", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new PHONENUMBERSPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new PHONENUMBERSPOLICY[] {
                PHONENUMBERS_VISIBLE_FOR_BUDDIES, PHONENUMBERS_VISIBLE_FOR_EVERYONE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PHONENUMBERSPOLICY aphonenumberspolicy[] = values();
            int k = aphonenumberspolicy.length;
            for (int i = 0; i < k; i++)
            {
                PHONENUMBERSPOLICY phonenumberspolicy = aphonenumberspolicy[i];
                intToTypeMap.a(phonenumberspolicy.value, phonenumberspolicy);
            }

        }

        private PHONENUMBERSPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PSTNCALLPOLICY extends Enum
    {

        private static final PSTNCALLPOLICY $VALUES[];
        public static final PSTNCALLPOLICY ALL_NUMBERS_CAN_CALL;
        public static final PSTNCALLPOLICY BUDDY_NUMBERS_CAN_CALL;
        public static final PSTNCALLPOLICY DISCLOSED_NUMBERS_CAN_CALL;
        public static final PSTNCALLPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PSTNCALLPOLICY fromInt(int i)
        {
            PSTNCALLPOLICY pstncallpolicy = (PSTNCALLPOLICY)intToTypeMap.a(i);
            if (pstncallpolicy != null)
            {
                return pstncallpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PSTNCALLPOLICY valueOf(String s)
        {
            return (PSTNCALLPOLICY)Enum.valueOf(com/skype/Account$PSTNCALLPOLICY, s);
        }

        public static PSTNCALLPOLICY[] values()
        {
            return (PSTNCALLPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL_NUMBERS_CAN_CALL = new PSTNCALLPOLICY("ALL_NUMBERS_CAN_CALL", 0, 0);
            DISCLOSED_NUMBERS_CAN_CALL = new PSTNCALLPOLICY("DISCLOSED_NUMBERS_CAN_CALL", 1, 1);
            BUDDY_NUMBERS_CAN_CALL = new PSTNCALLPOLICY("BUDDY_NUMBERS_CAN_CALL", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new PSTNCALLPOLICY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new PSTNCALLPOLICY[] {
                ALL_NUMBERS_CAN_CALL, DISCLOSED_NUMBERS_CAN_CALL, BUDDY_NUMBERS_CAN_CALL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PSTNCALLPOLICY apstncallpolicy[] = values();
            int k = apstncallpolicy.length;
            for (int i = 0; i < k; i++)
            {
                PSTNCALLPOLICY pstncallpolicy = apstncallpolicy[i];
                intToTypeMap.a(pstncallpolicy.value, pstncallpolicy);
            }

        }

        private PSTNCALLPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PWDCHANGESTATUS extends Enum
    {

        private static final PWDCHANGESTATUS $VALUES[];
        public static final PWDCHANGESTATUS PWD_CHANGING;
        public static final PWDCHANGESTATUS PWD_INVALID_NEW_PWD;
        public static final PWDCHANGESTATUS PWD_INVALID_OLD_PASSWORD;
        public static final PWDCHANGESTATUS PWD_MUST_DIFFER_FROM_OLD;
        public static final PWDCHANGESTATUS PWD_MUST_LOG_IN_TO_CHANGE;
        public static final PWDCHANGESTATUS PWD_OK;
        public static final PWDCHANGESTATUS PWD_OK_BUT_CHANGE_SUGGESTED;
        public static final PWDCHANGESTATUS PWD_SERVER_CONNECT_FAILED;
        public static final PWDCHANGESTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PWDCHANGESTATUS fromInt(int i)
        {
            PWDCHANGESTATUS pwdchangestatus = (PWDCHANGESTATUS)intToTypeMap.a(i);
            if (pwdchangestatus != null)
            {
                return pwdchangestatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PWDCHANGESTATUS valueOf(String s)
        {
            return (PWDCHANGESTATUS)Enum.valueOf(com/skype/Account$PWDCHANGESTATUS, s);
        }

        public static PWDCHANGESTATUS[] values()
        {
            return (PWDCHANGESTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PWD_OK = new PWDCHANGESTATUS("PWD_OK", 0, 0);
            PWD_CHANGING = new PWDCHANGESTATUS("PWD_CHANGING", 1, 1);
            PWD_INVALID_OLD_PASSWORD = new PWDCHANGESTATUS("PWD_INVALID_OLD_PASSWORD", 2, 2);
            PWD_SERVER_CONNECT_FAILED = new PWDCHANGESTATUS("PWD_SERVER_CONNECT_FAILED", 3, 3);
            PWD_OK_BUT_CHANGE_SUGGESTED = new PWDCHANGESTATUS("PWD_OK_BUT_CHANGE_SUGGESTED", 4, 4);
            PWD_MUST_DIFFER_FROM_OLD = new PWDCHANGESTATUS("PWD_MUST_DIFFER_FROM_OLD", 5, 5);
            PWD_INVALID_NEW_PWD = new PWDCHANGESTATUS("PWD_INVALID_NEW_PWD", 6, 6);
            PWD_MUST_LOG_IN_TO_CHANGE = new PWDCHANGESTATUS("PWD_MUST_LOG_IN_TO_CHANGE", 7, 7);
            WRAPPER_UNKNOWN_VALUE = new PWDCHANGESTATUS("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new PWDCHANGESTATUS[] {
                PWD_OK, PWD_CHANGING, PWD_INVALID_OLD_PASSWORD, PWD_SERVER_CONNECT_FAILED, PWD_OK_BUT_CHANGE_SUGGESTED, PWD_MUST_DIFFER_FROM_OLD, PWD_INVALID_NEW_PWD, PWD_MUST_LOG_IN_TO_CHANGE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PWDCHANGESTATUS apwdchangestatus[] = values();
            int k = apwdchangestatus.length;
            for (int i = 0; i < k; i++)
            {
                PWDCHANGESTATUS pwdchangestatus = apwdchangestatus[i];
                intToTypeMap.a(pwdchangestatus.value, pwdchangestatus);
            }

        }

        private PWDCHANGESTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SERVICETYPE extends Enum
    {

        private static final SERVICETYPE $VALUES[];
        public static final SERVICETYPE ST_NONE;
        public static final SERVICETYPE ST_PREMIUMVIDEO;
        public static final SERVICETYPE ST_PSTN;
        public static final SERVICETYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SERVICETYPE fromInt(int i)
        {
            SERVICETYPE servicetype = (SERVICETYPE)intToTypeMap.a(i);
            if (servicetype != null)
            {
                return servicetype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SERVICETYPE valueOf(String s)
        {
            return (SERVICETYPE)Enum.valueOf(com/skype/Account$SERVICETYPE, s);
        }

        public static SERVICETYPE[] values()
        {
            return (SERVICETYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ST_NONE = new SERVICETYPE("ST_NONE", 0, 0);
            ST_PSTN = new SERVICETYPE("ST_PSTN", 1, 1);
            ST_PREMIUMVIDEO = new SERVICETYPE("ST_PREMIUMVIDEO", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new SERVICETYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new SERVICETYPE[] {
                ST_NONE, ST_PSTN, ST_PREMIUMVIDEO, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SERVICETYPE aservicetype[] = values();
            int k = aservicetype.length;
            for (int i = 0; i < k; i++)
            {
                SERVICETYPE servicetype = aservicetype[i];
                intToTypeMap.a(servicetype.value, servicetype);
            }

        }

        private SERVICETYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SHORTCIRCUITSYNC extends Enum
    {

        private static final SHORTCIRCUITSYNC $VALUES[];
        public static final SHORTCIRCUITSYNC SHORTCIRCUITSYNC_DISABLED;
        public static final SHORTCIRCUITSYNC SHORTCIRCUITSYNC_ENABLED;
        public static final SHORTCIRCUITSYNC WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SHORTCIRCUITSYNC fromInt(int i)
        {
            SHORTCIRCUITSYNC shortcircuitsync = (SHORTCIRCUITSYNC)intToTypeMap.a(i);
            if (shortcircuitsync != null)
            {
                return shortcircuitsync;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SHORTCIRCUITSYNC valueOf(String s)
        {
            return (SHORTCIRCUITSYNC)Enum.valueOf(com/skype/Account$SHORTCIRCUITSYNC, s);
        }

        public static SHORTCIRCUITSYNC[] values()
        {
            return (SHORTCIRCUITSYNC[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SHORTCIRCUITSYNC_DISABLED = new SHORTCIRCUITSYNC("SHORTCIRCUITSYNC_DISABLED", 0, 0);
            SHORTCIRCUITSYNC_ENABLED = new SHORTCIRCUITSYNC("SHORTCIRCUITSYNC_ENABLED", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new SHORTCIRCUITSYNC("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new SHORTCIRCUITSYNC[] {
                SHORTCIRCUITSYNC_DISABLED, SHORTCIRCUITSYNC_ENABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SHORTCIRCUITSYNC ashortcircuitsync[] = values();
            int k = ashortcircuitsync.length;
            for (int i = 0; i < k; i++)
            {
                SHORTCIRCUITSYNC shortcircuitsync = ashortcircuitsync[i];
                intToTypeMap.a(shortcircuitsync.value, shortcircuitsync);
            }

        }

        private SHORTCIRCUITSYNC(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SKYPECALLPOLICY extends Enum
    {

        private static final SKYPECALLPOLICY $VALUES[];
        public static final SKYPECALLPOLICY BUDDIES_OR_AUTHORIZED_CAN_CALL;
        public static final SKYPECALLPOLICY EVERYONE_CAN_CALL;
        public static final SKYPECALLPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SKYPECALLPOLICY fromInt(int i)
        {
            SKYPECALLPOLICY skypecallpolicy = (SKYPECALLPOLICY)intToTypeMap.a(i);
            if (skypecallpolicy != null)
            {
                return skypecallpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SKYPECALLPOLICY valueOf(String s)
        {
            return (SKYPECALLPOLICY)Enum.valueOf(com/skype/Account$SKYPECALLPOLICY, s);
        }

        public static SKYPECALLPOLICY[] values()
        {
            return (SKYPECALLPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            EVERYONE_CAN_CALL = new SKYPECALLPOLICY("EVERYONE_CAN_CALL", 0, 0);
            BUDDIES_OR_AUTHORIZED_CAN_CALL = new SKYPECALLPOLICY("BUDDIES_OR_AUTHORIZED_CAN_CALL", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new SKYPECALLPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new SKYPECALLPOLICY[] {
                EVERYONE_CAN_CALL, BUDDIES_OR_AUTHORIZED_CAN_CALL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SKYPECALLPOLICY askypecallpolicy[] = values();
            int k = askypecallpolicy.length;
            for (int i = 0; i < k; i++)
            {
                SKYPECALLPOLICY skypecallpolicy = askypecallpolicy[i];
                intToTypeMap.a(skypecallpolicy.value, skypecallpolicy);
            }

        }

        private SKYPECALLPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS CONNECTING_TO_P2P;
        public static final STATUS CONNECTING_TO_SERVER;
        public static final STATUS INITIALIZING;
        public static final STATUS LOGGED_IN;
        public static final STATUS LOGGED_IN_PARTIALLY;
        public static final STATUS LOGGED_OUT;
        public static final STATUS LOGGED_OUT_AND_PWD_SAVED;
        public static final STATUS LOGGING_IN;
        public static final STATUS LOGGING_OUT;
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
            return (STATUS)Enum.valueOf(com/skype/Account$STATUS, s);
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
            LOGGED_OUT = new STATUS("LOGGED_OUT", 0, 1);
            LOGGED_OUT_AND_PWD_SAVED = new STATUS("LOGGED_OUT_AND_PWD_SAVED", 1, 2);
            CONNECTING_TO_P2P = new STATUS("CONNECTING_TO_P2P", 2, 3);
            CONNECTING_TO_SERVER = new STATUS("CONNECTING_TO_SERVER", 3, 4);
            LOGGING_IN = new STATUS("LOGGING_IN", 4, 5);
            INITIALIZING = new STATUS("INITIALIZING", 5, 6);
            LOGGED_IN = new STATUS("LOGGED_IN", 6, 7);
            LOGGING_OUT = new STATUS("LOGGING_OUT", 7, 8);
            LOGGED_IN_PARTIALLY = new STATUS("LOGGED_IN_PARTIALLY", 8, 9);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new STATUS[] {
                LOGGED_OUT, LOGGED_OUT_AND_PWD_SAVED, CONNECTING_TO_P2P, CONNECTING_TO_SERVER, LOGGING_IN, INITIALIZING, LOGGED_IN, LOGGING_OUT, LOGGED_IN_PARTIALLY, WRAPPER_UNKNOWN_VALUE
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

    public static final class SUBSCRIPTIONSTATUS extends Enum
    {

        private static final SUBSCRIPTIONSTATUS $VALUES[];
        public static final SUBSCRIPTIONSTATUS SS_ACTIVE;
        public static final SUBSCRIPTIONSTATUS SS_CANCELLED;
        public static final SUBSCRIPTIONSTATUS SS_NONE;
        public static final SUBSCRIPTIONSTATUS SS_SUSPENDED;
        public static final SUBSCRIPTIONSTATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SUBSCRIPTIONSTATUS fromInt(int i)
        {
            SUBSCRIPTIONSTATUS subscriptionstatus = (SUBSCRIPTIONSTATUS)intToTypeMap.a(i);
            if (subscriptionstatus != null)
            {
                return subscriptionstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SUBSCRIPTIONSTATUS valueOf(String s)
        {
            return (SUBSCRIPTIONSTATUS)Enum.valueOf(com/skype/Account$SUBSCRIPTIONSTATUS, s);
        }

        public static SUBSCRIPTIONSTATUS[] values()
        {
            return (SUBSCRIPTIONSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SS_NONE = new SUBSCRIPTIONSTATUS("SS_NONE", 0, 0);
            SS_ACTIVE = new SUBSCRIPTIONSTATUS("SS_ACTIVE", 1, 1);
            SS_CANCELLED = new SUBSCRIPTIONSTATUS("SS_CANCELLED", 2, 2);
            SS_SUSPENDED = new SUBSCRIPTIONSTATUS("SS_SUSPENDED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new SUBSCRIPTIONSTATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SUBSCRIPTIONSTATUS[] {
                SS_NONE, SS_ACTIVE, SS_CANCELLED, SS_SUSPENDED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SUBSCRIPTIONSTATUS asubscriptionstatus[] = values();
            int k = asubscriptionstatus.length;
            for (int i = 0; i < k; i++)
            {
                SUBSCRIPTIONSTATUS subscriptionstatus = asubscriptionstatus[i];
                intToTypeMap.a(subscriptionstatus.value, subscriptionstatus);
            }

        }

        private SUBSCRIPTIONSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TIMEZONEPOLICY extends Enum
    {

        private static final TIMEZONEPOLICY $VALUES[];
        public static final TIMEZONEPOLICY TZ_AUTOMATIC;
        public static final TIMEZONEPOLICY TZ_MANUAL;
        public static final TIMEZONEPOLICY TZ_UNDISCLOSED;
        public static final TIMEZONEPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TIMEZONEPOLICY fromInt(int i)
        {
            TIMEZONEPOLICY timezonepolicy = (TIMEZONEPOLICY)intToTypeMap.a(i);
            if (timezonepolicy != null)
            {
                return timezonepolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TIMEZONEPOLICY valueOf(String s)
        {
            return (TIMEZONEPOLICY)Enum.valueOf(com/skype/Account$TIMEZONEPOLICY, s);
        }

        public static TIMEZONEPOLICY[] values()
        {
            return (TIMEZONEPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TZ_AUTOMATIC = new TIMEZONEPOLICY("TZ_AUTOMATIC", 0, 0);
            TZ_MANUAL = new TIMEZONEPOLICY("TZ_MANUAL", 1, 1);
            TZ_UNDISCLOSED = new TIMEZONEPOLICY("TZ_UNDISCLOSED", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new TIMEZONEPOLICY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TIMEZONEPOLICY[] {
                TZ_AUTOMATIC, TZ_MANUAL, TZ_UNDISCLOSED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TIMEZONEPOLICY atimezonepolicy[] = values();
            int k = atimezonepolicy.length;
            for (int i = 0; i < k; i++)
            {
                TIMEZONEPOLICY timezonepolicy = atimezonepolicy[i];
                intToTypeMap.a(timezonepolicy.value, timezonepolicy);
            }

        }

        private TIMEZONEPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class VOICEMAILPOLICY extends Enum
    {

        private static final VOICEMAILPOLICY $VALUES[];
        public static final VOICEMAILPOLICY VOICEMAIL_DISABLED;
        public static final VOICEMAILPOLICY VOICEMAIL_ENABLED;
        public static final VOICEMAILPOLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VOICEMAILPOLICY fromInt(int i)
        {
            VOICEMAILPOLICY voicemailpolicy = (VOICEMAILPOLICY)intToTypeMap.a(i);
            if (voicemailpolicy != null)
            {
                return voicemailpolicy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VOICEMAILPOLICY valueOf(String s)
        {
            return (VOICEMAILPOLICY)Enum.valueOf(com/skype/Account$VOICEMAILPOLICY, s);
        }

        public static VOICEMAILPOLICY[] values()
        {
            return (VOICEMAILPOLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VOICEMAIL_ENABLED = new VOICEMAILPOLICY("VOICEMAIL_ENABLED", 0, 0);
            VOICEMAIL_DISABLED = new VOICEMAILPOLICY("VOICEMAIL_DISABLED", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new VOICEMAILPOLICY("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new VOICEMAILPOLICY[] {
                VOICEMAIL_ENABLED, VOICEMAIL_DISABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VOICEMAILPOLICY avoicemailpolicy[] = values();
            int k = avoicemailpolicy.length;
            for (int i = 0; i < k; i++)
            {
                VOICEMAILPOLICY voicemailpolicy = avoicemailpolicy[i];
                intToTypeMap.a(voicemailpolicy.value, voicemailpolicy);
            }

        }

        private VOICEMAILPOLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class WEBPRESENCEPOLICY_DEPRECATED extends Enum
    {

        private static final WEBPRESENCEPOLICY_DEPRECATED $VALUES[];
        public static final WEBPRESENCEPOLICY_DEPRECATED WEBPRESENCE_DISABLED;
        public static final WEBPRESENCEPOLICY_DEPRECATED WEBPRESENCE_ENABLED;
        public static final WEBPRESENCEPOLICY_DEPRECATED WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static WEBPRESENCEPOLICY_DEPRECATED fromInt(int i)
        {
            WEBPRESENCEPOLICY_DEPRECATED webpresencepolicy_deprecated = (WEBPRESENCEPOLICY_DEPRECATED)intToTypeMap.a(i);
            if (webpresencepolicy_deprecated != null)
            {
                return webpresencepolicy_deprecated;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static WEBPRESENCEPOLICY_DEPRECATED valueOf(String s)
        {
            return (WEBPRESENCEPOLICY_DEPRECATED)Enum.valueOf(com/skype/Account$WEBPRESENCEPOLICY_DEPRECATED, s);
        }

        public static WEBPRESENCEPOLICY_DEPRECATED[] values()
        {
            return (WEBPRESENCEPOLICY_DEPRECATED[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            WEBPRESENCE_DISABLED = new WEBPRESENCEPOLICY_DEPRECATED("WEBPRESENCE_DISABLED", 0, 0);
            WEBPRESENCE_ENABLED = new WEBPRESENCEPOLICY_DEPRECATED("WEBPRESENCE_ENABLED", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new WEBPRESENCEPOLICY_DEPRECATED("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new WEBPRESENCEPOLICY_DEPRECATED[] {
                WEBPRESENCE_DISABLED, WEBPRESENCE_ENABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            WEBPRESENCEPOLICY_DEPRECATED awebpresencepolicy_deprecated[] = values();
            int k = awebpresencepolicy_deprecated.length;
            for (int i = 0; i < k; i++)
            {
                WEBPRESENCEPOLICY_DEPRECATED webpresencepolicy_deprecated = awebpresencepolicy_deprecated[i];
                intToTypeMap.a(webpresencepolicy_deprecated.value, webpresencepolicy_deprecated);
            }

        }

        private WEBPRESENCEPOLICY_DEPRECATED(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class XMPPSTATUS extends Enum
    {

        private static final XMPPSTATUS $VALUES[];
        public static final XMPPSTATUS WRAPPER_UNKNOWN_VALUE;
        public static final XMPPSTATUS XMPP_CONNECTING;
        public static final XMPPSTATUS XMPP_DISABLED;
        public static final XMPPSTATUS XMPP_ERROR_AUTH;
        public static final XMPPSTATUS XMPP_ERROR_OTHER;
        public static final XMPPSTATUS XMPP_OFFLINE_EXPLICIT;
        public static final XMPPSTATUS XMPP_OFFLINE_SKYPE;
        public static final XMPPSTATUS XMPP_ONLINE;
        public static final XMPPSTATUS XMPP_PAUSING;
        public static final XMPPSTATUS XMPP_UNLINKED;
        private static final j intToTypeMap;
        private final int value;

        public static XMPPSTATUS fromInt(int i)
        {
            XMPPSTATUS xmppstatus = (XMPPSTATUS)intToTypeMap.a(i);
            if (xmppstatus != null)
            {
                return xmppstatus;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static XMPPSTATUS valueOf(String s)
        {
            return (XMPPSTATUS)Enum.valueOf(com/skype/Account$XMPPSTATUS, s);
        }

        public static XMPPSTATUS[] values()
        {
            return (XMPPSTATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            XMPP_UNLINKED = new XMPPSTATUS("XMPP_UNLINKED", 0, 0);
            XMPP_ONLINE = new XMPPSTATUS("XMPP_ONLINE", 1, 1);
            XMPP_CONNECTING = new XMPPSTATUS("XMPP_CONNECTING", 2, 2);
            XMPP_PAUSING = new XMPPSTATUS("XMPP_PAUSING", 3, 3);
            XMPP_ERROR_AUTH = new XMPPSTATUS("XMPP_ERROR_AUTH", 4, 10);
            XMPP_ERROR_OTHER = new XMPPSTATUS("XMPP_ERROR_OTHER", 5, 11);
            XMPP_DISABLED = new XMPPSTATUS("XMPP_DISABLED", 6, 20);
            XMPP_OFFLINE_SKYPE = new XMPPSTATUS("XMPP_OFFLINE_SKYPE", 7, 21);
            XMPP_OFFLINE_EXPLICIT = new XMPPSTATUS("XMPP_OFFLINE_EXPLICIT", 8, 22);
            WRAPPER_UNKNOWN_VALUE = new XMPPSTATUS("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new XMPPSTATUS[] {
                XMPP_UNLINKED, XMPP_ONLINE, XMPP_CONNECTING, XMPP_PAUSING, XMPP_ERROR_AUTH, XMPP_ERROR_OTHER, XMPP_DISABLED, XMPP_OFFLINE_SKYPE, XMPP_OFFLINE_EXPLICIT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            XMPPSTATUS axmppstatus[] = values();
            int k = axmppstatus.length;
            for (int i = 0; i < k; i++)
            {
                XMPPSTATUS xmppstatus = axmppstatus[i];
                intToTypeMap.a(xmppstatus.value, xmppstatus);
            }

        }

        private XMPPSTATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(AccountIListener accountilistener);

    public abstract void beginLogin();

    public abstract void beginLogin(Contact.AVAILABILITY availability);

    public abstract void cancelServerCommit();

    public abstract void changePassword(String s, String s1);

    public abstract void changePassword(String s, String s1, boolean flag);

    public abstract void delete();

    public abstract void externalLoginResponse(byte abyte0[]);

    public abstract void finishLogin();

    public abstract String getAboutProp();

    public abstract ADPOLICY getAdPolicyProp();

    public abstract String getAlertstringProp();

    public abstract String[] getAllSubscriptionTypes();

    public abstract String getAssignedCommentProp();

    public abstract String getAssignedSpeeddialProp();

    public abstract int getAuthreqTimestampProp();

    public abstract int getAuthrequestCountProp();

    public abstract AUTHREQUESTPOLICY getAuthrequestPolicyProp();

    public abstract Contact.AVAILABILITY getAvailabilityProp();

    public abstract byte[] getAvatarImageProp();

    public abstract AVATARPOLICY getAvatarPolicyProp();

    public abstract int getAvatarTimestampProp();

    public abstract int getBirthdayProp();

    public abstract BUDDYCOUNTPOLICY getBuddycountPolicyProp();

    public abstract byte[] getCapabilitiesProp();

    public abstract GetCapabilityStatus_Result getCapabilityStatus(Contact.CAPABILITY capability);

    public abstract CBLSYNCSTATUS getCblSyncStatusProp();

    public abstract CHATPOLICY getChatPolicyProp();

    public abstract String getCityProp();

    public abstract int getCobrandIdProp();

    public abstract COMMITSTATUS getCommitStatusProp();

    public abstract int getContactObjectID();

    public abstract String getCountryProp();

    public abstract String getDBPath();

    public abstract String getDisplaynameProp();

    public abstract String getEmailsProp();

    public abstract int getFederatedPresencePolicyProp();

    public abstract int getFlamingoXmppStatusProp();

    public abstract String getFullnameProp();

    public abstract int getGenderProp();

    public abstract Contact.AUTHLEVEL getGivenAuthlevelProp();

    public abstract String getGivenDisplaynameProp();

    public abstract String getHomepageProp();

    public abstract String getIpcountryProp();

    public abstract String getLanguagesProp();

    public abstract SkyLib.PARTNER_ID getLastPartnerId();

    public abstract int getLastonlineTimestampProp();

    public abstract int getLastusedTimestampProp();

    public abstract String getLiveidMembernameProp();

    public abstract LOGOUTREASON getLogoutReasonProp();

    public abstract String getMoodTextProp();

    public abstract int getMoodTimestampProp();

    public abstract int getNrOfOtherInstancesProp();

    public abstract int getNrofAuthedBuddiesProp();

    public abstract String getOfflineCallforwardProp();

    public abstract GetOwnEndpointsInfo_Result getOwnEndpointsInfo();

    public abstract String getPartnerChannelStatus();

    public abstract String getPartnerChannelStatusProp();

    public abstract String getPartnerOptedoutProp();

    public abstract String getPartnerUID(SkyLib.PARTNER_ID partner_id);

    public abstract String getPhoneHomeProp();

    public abstract String getPhoneMobileProp();

    public abstract String getPhoneOfficeProp();

    public abstract PHONENUMBERSPOLICY getPhonenumbersPolicyProp();

    public abstract int getProfileTimestampProp();

    public abstract String getProvinceProp();

    public abstract PSTNCALLPOLICY getPstnCallPolicyProp();

    public abstract String getPstnnumberProp();

    public abstract PWDCHANGESTATUS getPwdChangeStatusProp();

    public abstract String getReceivedAuthrequestProp();

    public abstract boolean getRefreshingProp();

    public abstract int getRegistrationTimestampProp();

    public abstract String getRichMoodTextProp();

    public abstract boolean getRoamingHistoryEnabledProp();

    public abstract String getServiceProviderInfoProp();

    public abstract SHORTCIRCUITSYNC getShortcircuitSyncProp();

    public abstract String getSigninNameProp();

    public abstract SKYPECALLPOLICY getSkypeCallPolicyProp();

    public abstract String getSkypeinNumbersProp();

    public abstract String getSkypenameHash();

    public abstract String getSkypenameProp();

    public abstract String getSkypeoutBalanceCurrencyProp();

    public abstract int getSkypeoutBalanceProp();

    public abstract int getSkypeoutPrecisionProp();

    public abstract STATUS getStatusProp();

    public abstract GetStatusWithProgress_Result getStatusWithProgress();

    public abstract GetSubscriptionInfo_Result getSubscriptionInfo();

    public abstract String[] getSubscriptionsByType(String s);

    public abstract String getSubscriptionsProp();

    public abstract String getSuggestedSkypenameProp();

    public abstract TIMEZONEPOLICY getTimezonePolicyProp();

    public abstract int getTimezoneProp();

    public abstract Contact.TYPE getTypeProp();

    public abstract String getVerifiedCompany();

    public abstract String getVerifiedEmail();

    public abstract VOICEMAILPOLICY getVoicemailPolicyProp();

    public abstract WEBPRESENCEPOLICY_DEPRECATED getWebpresencePolicyProp();

    public abstract void login();

    public abstract void login(Contact.AVAILABILITY availability);

    public abstract void loginWithOAuth(long l, String s);

    public abstract void loginWithOAuth(long l, String s, String s1);

    public abstract void loginWithOAuth(long l, String s, String s1, boolean flag);

    public abstract void loginWithOAuth(long l, String s, String s1, boolean flag, boolean flag1);

    public abstract void loginWithPassword(String s);

    public abstract void loginWithPassword(String s, boolean flag);

    public abstract void loginWithPassword(String s, boolean flag, boolean flag1);

    public abstract void logout();

    public abstract void logout(boolean flag);

    public abstract void logoutEx();

    public abstract void logoutEx(boolean flag);

    public abstract void logoutEx(boolean flag, boolean flag1);

    public abstract void logoutOtherEndpoint(String s);

    public abstract void logoutOtherEndpoints();

    public abstract void reconnectXMPP();

    public abstract void register(String s);

    public abstract void register(String s, boolean flag);

    public abstract void register(String s, boolean flag, boolean flag1);

    public abstract void register(String s, boolean flag, boolean flag1, String s1);

    public abstract void register(String s, boolean flag, boolean flag1, String s1, boolean flag2);

    public abstract void removeListener(AccountIListener accountilistener);

    public abstract void setAvailability(Contact.AVAILABILITY availability);

    public abstract boolean setBinProperty(PROPKEY propkey, byte abyte0[]);

    public abstract boolean setIntProperty(PROPKEY propkey, int i);

    public abstract void setPasswordSaved(boolean flag);

    public abstract boolean setProfileAttachment(String s, byte abyte0[]);

    public abstract boolean setServersideIntProperty(PROPKEY propkey, int i);

    public abstract boolean setServersideStrProperty(PROPKEY propkey, String s);

    public abstract void setStandby(boolean flag);

    public abstract boolean setStrProperty(PROPKEY propkey, String s);

    public abstract void setUIVersion(String s);

    public abstract void updateSubscriptions();
}
