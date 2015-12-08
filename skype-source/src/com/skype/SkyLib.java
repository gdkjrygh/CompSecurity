// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            GI, PROPKEY, Conversation, AccessSession, 
//            ContactSearch, ContactGroup, MediaDocument, Sms, 
//            VideoMessage, Contact, Account, Alert, 
//            Message, Proptable, Voicemail, MessageAnnotation, 
//            ObjectInterface, Participant, PriceQuote, Transfer, 
//            Translator, Video, Search, NativeStringConvert, 
//            Metatag

public interface SkyLib
    extends GI
{
    public static final class ACCESSEVENTTYPE extends Enum
    {

        private static final ACCESSEVENTTYPE $VALUES[];
        public static final ACCESSEVENTTYPE EV_DISABLE_ACCESS;
        public static final ACCESSEVENTTYPE EV_DISABLE_TEST_MODE;
        public static final ACCESSEVENTTYPE EV_ENABLE_ACCESS;
        public static final ACCESSEVENTTYPE EV_ENABLE_TEST_MODE;
        public static final ACCESSEVENTTYPE EV_EXTEND;
        public static final ACCESSEVENTTYPE EV_IS_HOTSPOT;
        public static final ACCESSEVENTTYPE EV_IS_ONLINE;
        public static final ACCESSEVENTTYPE EV_LOGIN;
        public static final ACCESSEVENTTYPE EV_LOGIN_OPERATOR;
        public static final ACCESSEVENTTYPE EV_LOGOUT;
        public static final ACCESSEVENTTYPE EV_RATE_HOTSPOT;
        public static final ACCESSEVENTTYPE EV_REDETECT;
        public static final ACCESSEVENTTYPE EV_REPORT_LOCATION;
        public static final ACCESSEVENTTYPE EV_SET_SESSION_LENGTH;
        public static final ACCESSEVENTTYPE EV_START_PAYMENT;
        public static final ACCESSEVENTTYPE EV_WIFI_CHANGED_DISABLED;
        public static final ACCESSEVENTTYPE EV_WIFI_CHANGED_SUPPORTED;
        public static final ACCESSEVENTTYPE EV_WIFI_CHANGED_UNSUPPORTED;
        public static final ACCESSEVENTTYPE SA_OBJECT_INVALIDATED;
        public static final ACCESSEVENTTYPE SA_SESSION_AUTO_END;
        public static final ACCESSEVENTTYPE SA_SESSION_LOST;
        public static final ACCESSEVENTTYPE SA_SESSION_RECOVERABLE;
        public static final ACCESSEVENTTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static ACCESSEVENTTYPE fromInt(int i)
        {
            ACCESSEVENTTYPE accesseventtype = (ACCESSEVENTTYPE)intToTypeMap.a(i);
            if (accesseventtype != null)
            {
                return accesseventtype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static ACCESSEVENTTYPE valueOf(String s)
        {
            return (ACCESSEVENTTYPE)Enum.valueOf(com/skype/SkyLib$ACCESSEVENTTYPE, s);
        }

        public static ACCESSEVENTTYPE[] values()
        {
            return (ACCESSEVENTTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_OBJECT_INVALIDATED = new ACCESSEVENTTYPE("SA_OBJECT_INVALIDATED", 0, 0);
            SA_SESSION_AUTO_END = new ACCESSEVENTTYPE("SA_SESSION_AUTO_END", 1, 1);
            SA_SESSION_LOST = new ACCESSEVENTTYPE("SA_SESSION_LOST", 2, 2);
            SA_SESSION_RECOVERABLE = new ACCESSEVENTTYPE("SA_SESSION_RECOVERABLE", 3, 3);
            EV_LOGIN = new ACCESSEVENTTYPE("EV_LOGIN", 4, 1000);
            EV_LOGOUT = new ACCESSEVENTTYPE("EV_LOGOUT", 5, 1001);
            EV_REDETECT = new ACCESSEVENTTYPE("EV_REDETECT", 6, 1002);
            EV_EXTEND = new ACCESSEVENTTYPE("EV_EXTEND", 7, 1003);
            EV_START_PAYMENT = new ACCESSEVENTTYPE("EV_START_PAYMENT", 8, 1004);
            EV_WIFI_CHANGED_SUPPORTED = new ACCESSEVENTTYPE("EV_WIFI_CHANGED_SUPPORTED", 9, 1005);
            EV_WIFI_CHANGED_UNSUPPORTED = new ACCESSEVENTTYPE("EV_WIFI_CHANGED_UNSUPPORTED", 10, 1006);
            EV_WIFI_CHANGED_DISABLED = new ACCESSEVENTTYPE("EV_WIFI_CHANGED_DISABLED", 11, 1007);
            EV_RATE_HOTSPOT = new ACCESSEVENTTYPE("EV_RATE_HOTSPOT", 12, 1008);
            EV_REPORT_LOCATION = new ACCESSEVENTTYPE("EV_REPORT_LOCATION", 13, 1009);
            EV_LOGIN_OPERATOR = new ACCESSEVENTTYPE("EV_LOGIN_OPERATOR", 14, 1010);
            EV_SET_SESSION_LENGTH = new ACCESSEVENTTYPE("EV_SET_SESSION_LENGTH", 15, 1011);
            EV_ENABLE_ACCESS = new ACCESSEVENTTYPE("EV_ENABLE_ACCESS", 16, 1012);
            EV_DISABLE_ACCESS = new ACCESSEVENTTYPE("EV_DISABLE_ACCESS", 17, 1013);
            EV_ENABLE_TEST_MODE = new ACCESSEVENTTYPE("EV_ENABLE_TEST_MODE", 18, 2000);
            EV_DISABLE_TEST_MODE = new ACCESSEVENTTYPE("EV_DISABLE_TEST_MODE", 19, 2001);
            EV_IS_ONLINE = new ACCESSEVENTTYPE("EV_IS_ONLINE", 20, 2002);
            EV_IS_HOTSPOT = new ACCESSEVENTTYPE("EV_IS_HOTSPOT", 21, 2003);
            WRAPPER_UNKNOWN_VALUE = new ACCESSEVENTTYPE("WRAPPER_UNKNOWN_VALUE", 22, 0x7fffffff);
            $VALUES = (new ACCESSEVENTTYPE[] {
                SA_OBJECT_INVALIDATED, SA_SESSION_AUTO_END, SA_SESSION_LOST, SA_SESSION_RECOVERABLE, EV_LOGIN, EV_LOGOUT, EV_REDETECT, EV_EXTEND, EV_START_PAYMENT, EV_WIFI_CHANGED_SUPPORTED, 
                EV_WIFI_CHANGED_UNSUPPORTED, EV_WIFI_CHANGED_DISABLED, EV_RATE_HOTSPOT, EV_REPORT_LOCATION, EV_LOGIN_OPERATOR, EV_SET_SESSION_LENGTH, EV_ENABLE_ACCESS, EV_DISABLE_ACCESS, EV_ENABLE_TEST_MODE, EV_DISABLE_TEST_MODE, 
                EV_IS_ONLINE, EV_IS_HOTSPOT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            ACCESSEVENTTYPE aaccesseventtype[] = values();
            int k = aaccesseventtype.length;
            for (int i = 0; i < k; i++)
            {
                ACCESSEVENTTYPE accesseventtype = aaccesseventtype[i];
                intToTypeMap.a(accesseventtype.value, accesseventtype);
            }

        }

        private ACCESSEVENTTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class APP2APP_STREAMS extends Enum
    {

        private static final APP2APP_STREAMS $VALUES[];
        public static final APP2APP_STREAMS ALL_STREAMS;
        public static final APP2APP_STREAMS RECEIVED_STREAMS;
        public static final APP2APP_STREAMS SENDING_STREAMS;
        public static final APP2APP_STREAMS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static APP2APP_STREAMS fromInt(int i)
        {
            APP2APP_STREAMS app2app_streams = (APP2APP_STREAMS)intToTypeMap.a(i);
            if (app2app_streams != null)
            {
                return app2app_streams;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static APP2APP_STREAMS valueOf(String s)
        {
            return (APP2APP_STREAMS)Enum.valueOf(com/skype/SkyLib$APP2APP_STREAMS, s);
        }

        public static APP2APP_STREAMS[] values()
        {
            return (APP2APP_STREAMS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            ALL_STREAMS = new APP2APP_STREAMS("ALL_STREAMS", 0, 0);
            SENDING_STREAMS = new APP2APP_STREAMS("SENDING_STREAMS", 1, 1);
            RECEIVED_STREAMS = new APP2APP_STREAMS("RECEIVED_STREAMS", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new APP2APP_STREAMS("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new APP2APP_STREAMS[] {
                ALL_STREAMS, SENDING_STREAMS, RECEIVED_STREAMS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            APP2APP_STREAMS aapp2app_streams[] = values();
            int k = aapp2app_streams.length;
            for (int i = 0; i < k; i++)
            {
                APP2APP_STREAMS app2app_streams = aapp2app_streams[i];
                intToTypeMap.a(app2app_streams.value, app2app_streams);
            }

        }

        private APP2APP_STREAMS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class AUDIODEVICE_CAPABILITIES extends Enum
    {

        private static final AUDIODEVICE_CAPABILITIES $VALUES[];
        public static final AUDIODEVICE_CAPABILITIES CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE;
        public static final AUDIODEVICE_CAPABILITIES HAS_AUDIO_CAPTURE;
        public static final AUDIODEVICE_CAPABILITIES HAS_AUDIO_RENDERING;
        public static final AUDIODEVICE_CAPABILITIES HAS_BLUETOOTH_INTERFACE;
        public static final AUDIODEVICE_CAPABILITIES HAS_LOWBANDWIDTH_CAPTURE;
        public static final AUDIODEVICE_CAPABILITIES HAS_USB_INTERFACE;
        public static final AUDIODEVICE_CAPABILITIES HAS_VIDEO_CAPTURE;
        public static final AUDIODEVICE_CAPABILITIES HAS_VIDEO_RENDERING;
        public static final AUDIODEVICE_CAPABILITIES IS_HEADSET;
        public static final AUDIODEVICE_CAPABILITIES IS_WEBCAM;
        public static final AUDIODEVICE_CAPABILITIES POSSIBLY_HEADSET;
        public static final AUDIODEVICE_CAPABILITIES POSSIBLY_WEBCAM;
        public static final AUDIODEVICE_CAPABILITIES WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AUDIODEVICE_CAPABILITIES fromInt(int i)
        {
            AUDIODEVICE_CAPABILITIES audiodevice_capabilities = (AUDIODEVICE_CAPABILITIES)intToTypeMap.a(i);
            if (audiodevice_capabilities != null)
            {
                return audiodevice_capabilities;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AUDIODEVICE_CAPABILITIES valueOf(String s)
        {
            return (AUDIODEVICE_CAPABILITIES)Enum.valueOf(com/skype/SkyLib$AUDIODEVICE_CAPABILITIES, s);
        }

        public static AUDIODEVICE_CAPABILITIES[] values()
        {
            return (AUDIODEVICE_CAPABILITIES[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            HAS_VIDEO_CAPTURE = new AUDIODEVICE_CAPABILITIES("HAS_VIDEO_CAPTURE", 0, 1);
            HAS_USB_INTERFACE = new AUDIODEVICE_CAPABILITIES("HAS_USB_INTERFACE", 1, 2);
            POSSIBLY_HEADSET = new AUDIODEVICE_CAPABILITIES("POSSIBLY_HEADSET", 2, 4);
            HAS_AUDIO_CAPTURE = new AUDIODEVICE_CAPABILITIES("HAS_AUDIO_CAPTURE", 3, 8);
            HAS_AUDIO_RENDERING = new AUDIODEVICE_CAPABILITIES("HAS_AUDIO_RENDERING", 4, 16);
            HAS_LOWBANDWIDTH_CAPTURE = new AUDIODEVICE_CAPABILITIES("HAS_LOWBANDWIDTH_CAPTURE", 5, 32);
            IS_WEBCAM = new AUDIODEVICE_CAPABILITIES("IS_WEBCAM", 6, 64);
            IS_HEADSET = new AUDIODEVICE_CAPABILITIES("IS_HEADSET", 7, 128);
            POSSIBLY_WEBCAM = new AUDIODEVICE_CAPABILITIES("POSSIBLY_WEBCAM", 8, 256);
            HAS_VIDEO_RENDERING = new AUDIODEVICE_CAPABILITIES("HAS_VIDEO_RENDERING", 9, 2048);
            HAS_BLUETOOTH_INTERFACE = new AUDIODEVICE_CAPABILITIES("HAS_BLUETOOTH_INTERFACE", 10, 4096);
            CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE = new AUDIODEVICE_CAPABILITIES("CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE", 11, 8192);
            WRAPPER_UNKNOWN_VALUE = new AUDIODEVICE_CAPABILITIES("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
            $VALUES = (new AUDIODEVICE_CAPABILITIES[] {
                HAS_VIDEO_CAPTURE, HAS_USB_INTERFACE, POSSIBLY_HEADSET, HAS_AUDIO_CAPTURE, HAS_AUDIO_RENDERING, HAS_LOWBANDWIDTH_CAPTURE, IS_WEBCAM, IS_HEADSET, POSSIBLY_WEBCAM, HAS_VIDEO_RENDERING, 
                HAS_BLUETOOTH_INTERFACE, CAN_BE_CHOSEN_IN_LOUD_SPEAKER_MODE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AUDIODEVICE_CAPABILITIES aaudiodevice_capabilities[] = values();
            int k = aaudiodevice_capabilities.length;
            for (int i = 0; i < k; i++)
            {
                AUDIODEVICE_CAPABILITIES audiodevice_capabilities = aaudiodevice_capabilities[i];
                intToTypeMap.a(audiodevice_capabilities.value, audiodevice_capabilities);
            }

        }

        private AUDIODEVICE_CAPABILITIES(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class AUTH_RESULT extends Enum
    {

        private static final AUTH_RESULT $VALUES[];
        public static final AUTH_RESULT AUTH_ANOTHER_MAPPING_EXISTS;
        public static final AUTH_RESULT AUTH_INTERNAL_ERROR;
        public static final AUTH_RESULT AUTH_INVALID_OAUTH_AUTHENTICATION;
        public static final AUTH_RESULT AUTH_INVALID_PARAMETER;
        public static final AUTH_RESULT AUTH_INVALID_SKYPE_AUTHENTICATION;
        public static final AUTH_RESULT AUTH_MISSING_PARAMETER;
        public static final AUTH_RESULT AUTH_OK;
        public static final AUTH_RESULT AUTH_PARTNER_INTERNAL_ERROR;
        public static final AUTH_RESULT AUTH_PARTNER_TIMEOUT;
        public static final AUTH_RESULT AUTH_USER_IS_UNDERAGE;
        public static final AUTH_RESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AUTH_RESULT fromInt(int i)
        {
            AUTH_RESULT auth_result = (AUTH_RESULT)intToTypeMap.a(i);
            if (auth_result != null)
            {
                return auth_result;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AUTH_RESULT valueOf(String s)
        {
            return (AUTH_RESULT)Enum.valueOf(com/skype/SkyLib$AUTH_RESULT, s);
        }

        public static AUTH_RESULT[] values()
        {
            return (AUTH_RESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            AUTH_OK = new AUTH_RESULT("AUTH_OK", 0, 0);
            AUTH_INTERNAL_ERROR = new AUTH_RESULT("AUTH_INTERNAL_ERROR", 1, 1);
            AUTH_MISSING_PARAMETER = new AUTH_RESULT("AUTH_MISSING_PARAMETER", 2, 2);
            AUTH_INVALID_PARAMETER = new AUTH_RESULT("AUTH_INVALID_PARAMETER", 3, 3);
            AUTH_ANOTHER_MAPPING_EXISTS = new AUTH_RESULT("AUTH_ANOTHER_MAPPING_EXISTS", 4, 4);
            AUTH_INVALID_SKYPE_AUTHENTICATION = new AUTH_RESULT("AUTH_INVALID_SKYPE_AUTHENTICATION", 5, 5);
            AUTH_INVALID_OAUTH_AUTHENTICATION = new AUTH_RESULT("AUTH_INVALID_OAUTH_AUTHENTICATION", 6, 6);
            AUTH_USER_IS_UNDERAGE = new AUTH_RESULT("AUTH_USER_IS_UNDERAGE", 7, 7);
            AUTH_PARTNER_INTERNAL_ERROR = new AUTH_RESULT("AUTH_PARTNER_INTERNAL_ERROR", 8, 8);
            AUTH_PARTNER_TIMEOUT = new AUTH_RESULT("AUTH_PARTNER_TIMEOUT", 9, 9);
            WRAPPER_UNKNOWN_VALUE = new AUTH_RESULT("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new AUTH_RESULT[] {
                AUTH_OK, AUTH_INTERNAL_ERROR, AUTH_MISSING_PARAMETER, AUTH_INVALID_PARAMETER, AUTH_ANOTHER_MAPPING_EXISTS, AUTH_INVALID_SKYPE_AUTHENTICATION, AUTH_INVALID_OAUTH_AUTHENTICATION, AUTH_USER_IS_UNDERAGE, AUTH_PARTNER_INTERNAL_ERROR, AUTH_PARTNER_TIMEOUT, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AUTH_RESULT aauth_result[] = values();
            int k = aauth_result.length;
            for (int i = 0; i < k; i++)
            {
                AUTH_RESULT auth_result = aauth_result[i];
                intToTypeMap.a(auth_result.value, auth_result);
            }

        }

        private AUTH_RESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class AccessPaymentGetInt_Result
    {

        public boolean m_return;
        public int m_value;

        public void init(int i, boolean flag)
        {
            m_value = i;
            m_return = flag;
        }

        public AccessPaymentGetInt_Result()
        {
        }
    }

    public static class AccessPaymentGetString_Result
    {

        public boolean m_return;
        public String m_value;

        public void init(byte abyte0[], boolean flag)
        {
            m_value = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public AccessPaymentGetString_Result()
        {
        }
    }

    public static class App2AppGetConnectableUsers_Result
    {

        public boolean m_return;
        public String m_users[];

        public void init(byte abyte0[][], boolean flag)
        {
            m_users = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_return = flag;
        }

        public App2AppGetConnectableUsers_Result()
        {
        }
    }

    public static class App2AppGetStreamsList_Result
    {

        public int m_receivedSizes[];
        public boolean m_return;
        public String m_streams[];

        public void init(byte abyte0[][], int ai[], boolean flag)
        {
            m_streams = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_receivedSizes = ai;
            m_return = flag;
        }

        public App2AppGetStreamsList_Result()
        {
        }
    }

    public static class App2AppRead_Result
    {

        public byte m_data[];
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_data = abyte0;
            m_return = flag;
        }

        public App2AppRead_Result()
        {
        }
    }

    public static final class CALLERID_IDCONFIG extends Enum
    {

        private static final CALLERID_IDCONFIG $VALUES[];
        public static final CALLERID_IDCONFIG AUTOSELECT_CLI;
        public static final CALLERID_IDCONFIG USE_CLI_FOR_SMS;
        public static final CALLERID_IDCONFIG USE_SMS_FOR_CLI;
        public static final CALLERID_IDCONFIG WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALLERID_IDCONFIG fromInt(int i)
        {
            CALLERID_IDCONFIG callerid_idconfig = (CALLERID_IDCONFIG)intToTypeMap.a(i);
            if (callerid_idconfig != null)
            {
                return callerid_idconfig;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALLERID_IDCONFIG valueOf(String s)
        {
            return (CALLERID_IDCONFIG)Enum.valueOf(com/skype/SkyLib$CALLERID_IDCONFIG, s);
        }

        public static CALLERID_IDCONFIG[] values()
        {
            return (CALLERID_IDCONFIG[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            USE_CLI_FOR_SMS = new CALLERID_IDCONFIG("USE_CLI_FOR_SMS", 0, 1);
            USE_SMS_FOR_CLI = new CALLERID_IDCONFIG("USE_SMS_FOR_CLI", 1, 2);
            AUTOSELECT_CLI = new CALLERID_IDCONFIG("AUTOSELECT_CLI", 2, 4);
            WRAPPER_UNKNOWN_VALUE = new CALLERID_IDCONFIG("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CALLERID_IDCONFIG[] {
                USE_CLI_FOR_SMS, USE_SMS_FOR_CLI, AUTOSELECT_CLI, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALLERID_IDCONFIG acallerid_idconfig[] = values();
            int k = acallerid_idconfig.length;
            for (int i = 0; i < k; i++)
            {
                CALLERID_IDCONFIG callerid_idconfig = acallerid_idconfig[i];
                intToTypeMap.a(callerid_idconfig.value, callerid_idconfig);
            }

        }

        private CALLERID_IDCONFIG(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CALLERID_OPTIONS_CHANGE extends Enum
    {

        private static final CALLERID_OPTIONS_CHANGE $VALUES[];
        public static final CALLERID_OPTIONS_CHANGE CLI_LOADED_NEW;
        public static final CALLERID_OPTIONS_CHANGE CLI_SET_FAILED;
        public static final CALLERID_OPTIONS_CHANGE CLI_SET_SUCCESS;
        public static final CALLERID_OPTIONS_CHANGE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALLERID_OPTIONS_CHANGE fromInt(int i)
        {
            CALLERID_OPTIONS_CHANGE callerid_options_change = (CALLERID_OPTIONS_CHANGE)intToTypeMap.a(i);
            if (callerid_options_change != null)
            {
                return callerid_options_change;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALLERID_OPTIONS_CHANGE valueOf(String s)
        {
            return (CALLERID_OPTIONS_CHANGE)Enum.valueOf(com/skype/SkyLib$CALLERID_OPTIONS_CHANGE, s);
        }

        public static CALLERID_OPTIONS_CHANGE[] values()
        {
            return (CALLERID_OPTIONS_CHANGE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CLI_SET_SUCCESS = new CALLERID_OPTIONS_CHANGE("CLI_SET_SUCCESS", 0, 1);
            CLI_SET_FAILED = new CALLERID_OPTIONS_CHANGE("CLI_SET_FAILED", 1, 2);
            CLI_LOADED_NEW = new CALLERID_OPTIONS_CHANGE("CLI_LOADED_NEW", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new CALLERID_OPTIONS_CHANGE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CALLERID_OPTIONS_CHANGE[] {
                CLI_SET_SUCCESS, CLI_SET_FAILED, CLI_LOADED_NEW, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALLERID_OPTIONS_CHANGE acallerid_options_change[] = values();
            int k = acallerid_options_change.length;
            for (int i = 0; i < k; i++)
            {
                CALLERID_OPTIONS_CHANGE callerid_options_change = acallerid_options_change[i];
                intToTypeMap.a(callerid_options_change.value, callerid_options_change);
            }

        }

        private CALLERID_OPTIONS_CHANGE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CALLERID_STATE extends Enum
    {

        private static final CALLERID_STATE $VALUES[];
        public static final CALLERID_STATE CLI_ACTIVE;
        public static final CALLERID_STATE CLI_BLOCKED;
        public static final CALLERID_STATE CLI_FAILED;
        public static final CALLERID_STATE CLI_PENDING;
        public static final CALLERID_STATE CLI_VERIFIED;
        public static final CALLERID_STATE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALLERID_STATE fromInt(int i)
        {
            CALLERID_STATE callerid_state = (CALLERID_STATE)intToTypeMap.a(i);
            if (callerid_state != null)
            {
                return callerid_state;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALLERID_STATE valueOf(String s)
        {
            return (CALLERID_STATE)Enum.valueOf(com/skype/SkyLib$CALLERID_STATE, s);
        }

        public static CALLERID_STATE[] values()
        {
            return (CALLERID_STATE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CLI_PENDING = new CALLERID_STATE("CLI_PENDING", 0, 1);
            CLI_VERIFIED = new CALLERID_STATE("CLI_VERIFIED", 1, 2);
            CLI_ACTIVE = new CALLERID_STATE("CLI_ACTIVE", 2, 3);
            CLI_FAILED = new CALLERID_STATE("CLI_FAILED", 3, 4);
            CLI_BLOCKED = new CALLERID_STATE("CLI_BLOCKED", 4, 5);
            WRAPPER_UNKNOWN_VALUE = new CALLERID_STATE("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new CALLERID_STATE[] {
                CLI_PENDING, CLI_VERIFIED, CLI_ACTIVE, CLI_FAILED, CLI_BLOCKED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALLERID_STATE acallerid_state[] = values();
            int k = acallerid_state.length;
            for (int i = 0; i < k; i++)
            {
                CALLERID_STATE callerid_state = acallerid_state[i];
                intToTypeMap.a(callerid_state.value, callerid_state);
            }

        }

        private CALLERID_STATE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CALLERID_TYPE extends Enum
    {

        private static final CALLERID_TYPE $VALUES[];
        public static final CALLERID_TYPE CLI_T_MOBILE;
        public static final CALLERID_TYPE CLI_T_SKYPEIN;
        public static final CALLERID_TYPE CLI_T_SMS;
        public static final CALLERID_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CALLERID_TYPE fromInt(int i)
        {
            CALLERID_TYPE callerid_type = (CALLERID_TYPE)intToTypeMap.a(i);
            if (callerid_type != null)
            {
                return callerid_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CALLERID_TYPE valueOf(String s)
        {
            return (CALLERID_TYPE)Enum.valueOf(com/skype/SkyLib$CALLERID_TYPE, s);
        }

        public static CALLERID_TYPE[] values()
        {
            return (CALLERID_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CLI_T_SMS = new CALLERID_TYPE("CLI_T_SMS", 0, 1);
            CLI_T_MOBILE = new CALLERID_TYPE("CLI_T_MOBILE", 1, 2);
            CLI_T_SKYPEIN = new CALLERID_TYPE("CLI_T_SKYPEIN", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new CALLERID_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CALLERID_TYPE[] {
                CLI_T_SMS, CLI_T_MOBILE, CLI_T_SKYPEIN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CALLERID_TYPE acallerid_type[] = values();
            int k = acallerid_type.length;
            for (int i = 0; i < k; i++)
            {
                CALLERID_TYPE callerid_type = acallerid_type[i];
                intToTypeMap.a(callerid_type.value, callerid_type);
            }

        }

        private CALLERID_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CODEC_COMPATIBILITY extends Enum
    {

        private static final CODEC_COMPATIBILITY $VALUES[];
        public static final CODEC_COMPATIBILITY CODEC_COMPATIBLE;
        public static final CODEC_COMPATIBILITY CODEC_NOT_COMPATIBLE;
        public static final CODEC_COMPATIBILITY CODEC_NOT_COMPATIBLE_BUT_PLATFORM_IS_GVC_SUPPORTED;
        public static final CODEC_COMPATIBILITY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CODEC_COMPATIBILITY fromInt(int i)
        {
            CODEC_COMPATIBILITY codec_compatibility = (CODEC_COMPATIBILITY)intToTypeMap.a(i);
            if (codec_compatibility != null)
            {
                return codec_compatibility;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CODEC_COMPATIBILITY valueOf(String s)
        {
            return (CODEC_COMPATIBILITY)Enum.valueOf(com/skype/SkyLib$CODEC_COMPATIBILITY, s);
        }

        public static CODEC_COMPATIBILITY[] values()
        {
            return (CODEC_COMPATIBILITY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CODEC_COMPATIBLE = new CODEC_COMPATIBILITY("CODEC_COMPATIBLE", 0, 0);
            CODEC_NOT_COMPATIBLE_BUT_PLATFORM_IS_GVC_SUPPORTED = new CODEC_COMPATIBILITY("CODEC_NOT_COMPATIBLE_BUT_PLATFORM_IS_GVC_SUPPORTED", 1, 1);
            CODEC_NOT_COMPATIBLE = new CODEC_COMPATIBILITY("CODEC_NOT_COMPATIBLE", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new CODEC_COMPATIBILITY("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new CODEC_COMPATIBILITY[] {
                CODEC_COMPATIBLE, CODEC_NOT_COMPATIBLE_BUT_PLATFORM_IS_GVC_SUPPORTED, CODEC_NOT_COMPATIBLE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CODEC_COMPATIBILITY acodec_compatibility[] = values();
            int k = acodec_compatibility.length;
            for (int i = 0; i < k; i++)
            {
                CODEC_COMPATIBILITY codec_compatibility = acodec_compatibility[i];
                intToTypeMap.a(codec_compatibility.value, codec_compatibility);
            }

        }

        private CODEC_COMPATIBILITY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONNECTION_STATUS extends Enum
    {

        private static final CONNECTION_STATUS $VALUES[];
        public static final CONNECTION_STATUS MSNP_CONNECTED;
        public static final CONNECTION_STATUS MSNP_CONNECTING;
        public static final CONNECTION_STATUS MSNP_DISCONNECTED;
        public static final CONNECTION_STATUS MSNP_NO_NETWORK;
        public static final CONNECTION_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONNECTION_STATUS fromInt(int i)
        {
            CONNECTION_STATUS connection_status = (CONNECTION_STATUS)intToTypeMap.a(i);
            if (connection_status != null)
            {
                return connection_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONNECTION_STATUS valueOf(String s)
        {
            return (CONNECTION_STATUS)Enum.valueOf(com/skype/SkyLib$CONNECTION_STATUS, s);
        }

        public static CONNECTION_STATUS[] values()
        {
            return (CONNECTION_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MSNP_NO_NETWORK = new CONNECTION_STATUS("MSNP_NO_NETWORK", 0, 1);
            MSNP_DISCONNECTED = new CONNECTION_STATUS("MSNP_DISCONNECTED", 1, 2);
            MSNP_CONNECTING = new CONNECTION_STATUS("MSNP_CONNECTING", 2, 3);
            MSNP_CONNECTED = new CONNECTION_STATUS("MSNP_CONNECTED", 3, 4);
            WRAPPER_UNKNOWN_VALUE = new CONNECTION_STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new CONNECTION_STATUS[] {
                MSNP_NO_NETWORK, MSNP_DISCONNECTED, MSNP_CONNECTING, MSNP_CONNECTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONNECTION_STATUS aconnection_status[] = values();
            int k = aconnection_status.length;
            for (int i = 0; i < k; i++)
            {
                CONNECTION_STATUS connection_status = aconnection_status[i];
                intToTypeMap.a(connection_status.value, connection_status);
            }

        }

        private CONNECTION_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONTACT_SYNC_TYPE extends Enum
    {

        private static final CONTACT_SYNC_TYPE $VALUES[];
        public static final CONTACT_SYNC_TYPE CONTACT_AGGREGATION_DONE;
        public static final CONTACT_SYNC_TYPE CONTACT_MESSENGER;
        public static final CONTACT_SYNC_TYPE CONTACT_SCD;
        public static final CONTACT_SYNC_TYPE CONTACT_SKYPE;
        public static final CONTACT_SYNC_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONTACT_SYNC_TYPE fromInt(int i)
        {
            CONTACT_SYNC_TYPE contact_sync_type = (CONTACT_SYNC_TYPE)intToTypeMap.a(i);
            if (contact_sync_type != null)
            {
                return contact_sync_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONTACT_SYNC_TYPE valueOf(String s)
        {
            return (CONTACT_SYNC_TYPE)Enum.valueOf(com/skype/SkyLib$CONTACT_SYNC_TYPE, s);
        }

        public static CONTACT_SYNC_TYPE[] values()
        {
            return (CONTACT_SYNC_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONTACT_SCD = new CONTACT_SYNC_TYPE("CONTACT_SCD", 0, 0);
            CONTACT_SKYPE = new CONTACT_SYNC_TYPE("CONTACT_SKYPE", 1, 1);
            CONTACT_MESSENGER = new CONTACT_SYNC_TYPE("CONTACT_MESSENGER", 2, 2);
            CONTACT_AGGREGATION_DONE = new CONTACT_SYNC_TYPE("CONTACT_AGGREGATION_DONE", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new CONTACT_SYNC_TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new CONTACT_SYNC_TYPE[] {
                CONTACT_SCD, CONTACT_SKYPE, CONTACT_MESSENGER, CONTACT_AGGREGATION_DONE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONTACT_SYNC_TYPE acontact_sync_type[] = values();
            int k = acontact_sync_type.length;
            for (int i = 0; i < k; i++)
            {
                CONTACT_SYNC_TYPE contact_sync_type = acontact_sync_type[i];
                intToTypeMap.a(contact_sync_type.value, contact_sync_type);
            }

        }

        private CONTACT_SYNC_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONTENT_LIST_CONTEXT extends Enum
    {

        private static final CONTENT_LIST_CONTEXT $VALUES[];
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_API_ALLOWLIST;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_API_BLOCKLIST;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_DF_BLOCKED;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_HTTPS_DIRECT;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_PLUGIN_ALLOWLIST;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_SDK_ALLOWLIST;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_SDK_BLOCKLIST;
        public static final CONTENT_LIST_CONTEXT CL_CONTEXT_SF_BLOCKLIST;
        public static final CONTENT_LIST_CONTEXT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONTENT_LIST_CONTEXT fromInt(int i)
        {
            CONTENT_LIST_CONTEXT content_list_context = (CONTENT_LIST_CONTEXT)intToTypeMap.a(i);
            if (content_list_context != null)
            {
                return content_list_context;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONTENT_LIST_CONTEXT valueOf(String s)
        {
            return (CONTENT_LIST_CONTEXT)Enum.valueOf(com/skype/SkyLib$CONTENT_LIST_CONTEXT, s);
        }

        public static CONTENT_LIST_CONTEXT[] values()
        {
            return (CONTENT_LIST_CONTEXT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CL_CONTEXT_DF_BLOCKED = new CONTENT_LIST_CONTEXT("CL_CONTEXT_DF_BLOCKED", 0, 1);
            CL_CONTEXT_HTTPS_DIRECT = new CONTENT_LIST_CONTEXT("CL_CONTEXT_HTTPS_DIRECT", 1, 2);
            CL_CONTEXT_API_ALLOWLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_API_ALLOWLIST", 2, 3);
            CL_CONTEXT_API_BLOCKLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_API_BLOCKLIST", 3, 4);
            CL_CONTEXT_PLUGIN_ALLOWLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_PLUGIN_ALLOWLIST", 4, 5);
            CL_CONTEXT_SF_BLOCKLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_SF_BLOCKLIST", 5, 6);
            CL_CONTEXT_SDK_BLOCKLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_SDK_BLOCKLIST", 6, 7);
            CL_CONTEXT_SDK_ALLOWLIST = new CONTENT_LIST_CONTEXT("CL_CONTEXT_SDK_ALLOWLIST", 7, 8);
            WRAPPER_UNKNOWN_VALUE = new CONTENT_LIST_CONTEXT("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new CONTENT_LIST_CONTEXT[] {
                CL_CONTEXT_DF_BLOCKED, CL_CONTEXT_HTTPS_DIRECT, CL_CONTEXT_API_ALLOWLIST, CL_CONTEXT_API_BLOCKLIST, CL_CONTEXT_PLUGIN_ALLOWLIST, CL_CONTEXT_SF_BLOCKLIST, CL_CONTEXT_SDK_BLOCKLIST, CL_CONTEXT_SDK_ALLOWLIST, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONTENT_LIST_CONTEXT acontent_list_context[] = values();
            int k = acontent_list_context.length;
            for (int i = 0; i < k; i++)
            {
                CONTENT_LIST_CONTEXT content_list_context = acontent_list_context[i];
                intToTypeMap.a(content_list_context.value, content_list_context);
            }

        }

        private CONTENT_LIST_CONTEXT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class CONTENT_LIST_RESULT extends Enum
    {

        private static final CONTENT_LIST_RESULT $VALUES[];
        public static final CONTENT_LIST_RESULT CL_FILE_ERROR;
        public static final CONTENT_LIST_RESULT CL_LISTED;
        public static final CONTENT_LIST_RESULT CL_NOT_LISTED;
        public static final CONTENT_LIST_RESULT CL_QUERY_FAILED;
        public static final CONTENT_LIST_RESULT CL_QUERY_PENDING;
        public static final CONTENT_LIST_RESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static CONTENT_LIST_RESULT fromInt(int i)
        {
            CONTENT_LIST_RESULT content_list_result = (CONTENT_LIST_RESULT)intToTypeMap.a(i);
            if (content_list_result != null)
            {
                return content_list_result;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static CONTENT_LIST_RESULT valueOf(String s)
        {
            return (CONTENT_LIST_RESULT)Enum.valueOf(com/skype/SkyLib$CONTENT_LIST_RESULT, s);
        }

        public static CONTENT_LIST_RESULT[] values()
        {
            return (CONTENT_LIST_RESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CL_LISTED = new CONTENT_LIST_RESULT("CL_LISTED", 0, 0);
            CL_NOT_LISTED = new CONTENT_LIST_RESULT("CL_NOT_LISTED", 1, 1);
            CL_QUERY_PENDING = new CONTENT_LIST_RESULT("CL_QUERY_PENDING", 2, 2);
            CL_QUERY_FAILED = new CONTENT_LIST_RESULT("CL_QUERY_FAILED", 3, 3);
            CL_FILE_ERROR = new CONTENT_LIST_RESULT("CL_FILE_ERROR", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new CONTENT_LIST_RESULT("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new CONTENT_LIST_RESULT[] {
                CL_LISTED, CL_NOT_LISTED, CL_QUERY_PENDING, CL_QUERY_FAILED, CL_FILE_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            CONTENT_LIST_RESULT acontent_list_result[] = values();
            int k = acontent_list_result.length;
            for (int i = 0; i < k; i++)
            {
                CONTENT_LIST_RESULT content_list_result = acontent_list_result[i];
                intToTypeMap.a(content_list_result.value, content_list_result);
            }

        }

        private CONTENT_LIST_RESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class CanUnifyContacts_Result
    {

        public UNIFYRESULT m_resultCode;
        public int m_return;

        public void init(UNIFYRESULT unifyresult, int i)
        {
            m_resultCode = unifyresult;
            m_return = i;
        }

        public CanUnifyContacts_Result()
        {
        }
    }

    public static class ContentEncodeCloud_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentEncodeCloud_Result()
        {
        }
    }

    public static class ContentEncodeEx_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentEncodeEx_Result()
        {
        }
    }

    public static class ContentEncode_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentEncode_Result()
        {
        }
    }

    public static class ContentGetEditable_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentGetEditable_Result()
        {
        }
    }

    public static class ContentGetRichEditable_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentGetRichEditable_Result()
        {
        }
    }

    public static class ContentItemGetBody_Result
    {

        public byte m_body[];
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_body = abyte0;
            m_return = flag;
        }

        public ContentItemGetBody_Result()
        {
        }
    }

    public static class ContentItemGetChildItem_Result
    {

        public int m_resultItem;
        public boolean m_return;

        public void init(int i, boolean flag)
        {
            m_resultItem = i;
            m_return = flag;
        }

        public ContentItemGetChildItem_Result()
        {
        }
    }

    public static class ContentItemGetChildNames_Result
    {

        public String m_list[];
        public boolean m_return;

        public void init(byte abyte0[][], boolean flag)
        {
            m_list = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_return = flag;
        }

        public ContentItemGetChildNames_Result()
        {
        }
    }

    public static class ContentItemGet_Result
    {

        public int m_resultItem;
        public boolean m_return;

        public void init(int i, boolean flag)
        {
            m_resultItem = i;
            m_return = flag;
        }

        public ContentItemGet_Result()
        {
        }
    }

    public static class ContentStripXML_Result
    {

        public String m_result;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_result = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public ContentStripXML_Result()
        {
        }
    }

    public static class CreateSignedToken_Result
    {

        public boolean m_return;
        public byte m_token[];

        public void init(byte abyte0[], boolean flag)
        {
            m_token = abyte0;
            m_return = flag;
        }

        public CreateSignedToken_Result()
        {
        }
    }

    public static final class DEBUG_STRING extends Enum
    {

        private static final DEBUG_STRING $VALUES[];
        public static final DEBUG_STRING DEBUG_STRING_DEFAULT;
        public static final DEBUG_STRING DEBUG_STRING_MSNP_LOG;
        public static final DEBUG_STRING DEBUG_STRING_MSNP_SUMMARY;
        public static final DEBUG_STRING WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static DEBUG_STRING fromInt(int i)
        {
            DEBUG_STRING debug_string = (DEBUG_STRING)intToTypeMap.a(i);
            if (debug_string != null)
            {
                return debug_string;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static DEBUG_STRING valueOf(String s)
        {
            return (DEBUG_STRING)Enum.valueOf(com/skype/SkyLib$DEBUG_STRING, s);
        }

        public static DEBUG_STRING[] values()
        {
            return (DEBUG_STRING[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            DEBUG_STRING_DEFAULT = new DEBUG_STRING("DEBUG_STRING_DEFAULT", 0, 0);
            DEBUG_STRING_MSNP_SUMMARY = new DEBUG_STRING("DEBUG_STRING_MSNP_SUMMARY", 1, 1);
            DEBUG_STRING_MSNP_LOG = new DEBUG_STRING("DEBUG_STRING_MSNP_LOG", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new DEBUG_STRING("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new DEBUG_STRING[] {
                DEBUG_STRING_DEFAULT, DEBUG_STRING_MSNP_SUMMARY, DEBUG_STRING_MSNP_LOG, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            DEBUG_STRING adebug_string[] = values();
            int k = adebug_string.length;
            for (int i = 0; i < k; i++)
            {
                DEBUG_STRING debug_string = adebug_string[i];
                intToTypeMap.a(debug_string.value, debug_string);
            }

        }

        private DEBUG_STRING(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class ECS_CALLBACK_EVENT_TYPE extends Enum
    {

        private static final ECS_CALLBACK_EVENT_TYPE $VALUES[];
        public static final ECS_CALLBACK_EVENT_TYPE CONFIG_UPDATED;
        public static final ECS_CALLBACK_EVENT_TYPE TOKEN_IS_INVALID;
        public static final ECS_CALLBACK_EVENT_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static ECS_CALLBACK_EVENT_TYPE fromInt(int i)
        {
            ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type = (ECS_CALLBACK_EVENT_TYPE)intToTypeMap.a(i);
            if (ecs_callback_event_type != null)
            {
                return ecs_callback_event_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static ECS_CALLBACK_EVENT_TYPE valueOf(String s)
        {
            return (ECS_CALLBACK_EVENT_TYPE)Enum.valueOf(com/skype/SkyLib$ECS_CALLBACK_EVENT_TYPE, s);
        }

        public static ECS_CALLBACK_EVENT_TYPE[] values()
        {
            return (ECS_CALLBACK_EVENT_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONFIG_UPDATED = new ECS_CALLBACK_EVENT_TYPE("CONFIG_UPDATED", 0, 0);
            TOKEN_IS_INVALID = new ECS_CALLBACK_EVENT_TYPE("TOKEN_IS_INVALID", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new ECS_CALLBACK_EVENT_TYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new ECS_CALLBACK_EVENT_TYPE[] {
                CONFIG_UPDATED, TOKEN_IS_INVALID, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            ECS_CALLBACK_EVENT_TYPE aecs_callback_event_type[] = values();
            int k = aecs_callback_event_type.length;
            for (int i = 0; i < k; i++)
            {
                ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type = aecs_callback_event_type[i];
                intToTypeMap.a(ecs_callback_event_type.value, ecs_callback_event_type);
            }

        }

        private ECS_CALLBACK_EVENT_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class FetchLocal_Result
    {

        public boolean m_return;
        public byte m_value[];

        public void init(byte abyte0[], boolean flag)
        {
            m_value = abyte0;
            m_return = flag;
        }

        public FetchLocal_Result()
        {
        }
    }

    public static class FindContactByPstnNumber_Result
    {

        public int m_foundInKey;
        public boolean m_return;

        public void init(int i, boolean flag)
        {
            m_foundInKey = i;
            m_return = flag;
        }

        public FindContactByPstnNumber_Result()
        {
        }
    }

    public static class FindContactsByEmail_Result
    {

        public int m_contactObjectIDList[];

        public void init(int ai[])
        {
            m_contactObjectIDList = ai;
        }

        public FindContactsByEmail_Result()
        {
        }
    }

    public static class FindObjects_Result
    {

        public int m_objectIDList[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_objectIDList = ai;
            m_return = flag;
        }

        public FindObjects_Result()
        {
        }
    }

    public static class GetAudioDeviceCapabilities_Result
    {

        public String m_interfaceString;
        public int m_return;

        public void init(byte abyte0[], int i)
        {
            m_interfaceString = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = i;
        }

        public GetAudioDeviceCapabilities_Result()
        {
        }
    }

    public static class GetAvailableOutputDevices_Result
    {

        public String m_handleList[];
        public String m_nameList[];
        public String m_productIdList[];
        public boolean m_return;

        public void init(byte abyte0[][], byte abyte1[][], byte abyte2[][], boolean flag)
        {
            m_handleList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_nameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_productIdList = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
            m_return = flag;
        }

        public GetAvailableOutputDevices_Result()
        {
        }
    }

    public static class GetAvailableRecordingDevices_Result
    {

        public String m_handleList[];
        public String m_nameList[];
        public String m_productIdList[];
        public boolean m_return;

        public void init(byte abyte0[][], byte abyte1[][], byte abyte2[][], boolean flag)
        {
            m_handleList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_nameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_productIdList = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
            m_return = flag;
        }

        public GetAvailableRecordingDevices_Result()
        {
        }
    }

    public static class GetAvailableVideoDevices_Result
    {

        public String m_deviceNames[];
        public String m_devicePaths[];
        public int m_return;

        public void init(byte abyte0[][], byte abyte1[][], int i)
        {
            m_deviceNames = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_devicePaths = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_return = i;
        }

        public GetAvailableVideoDevices_Result()
        {
        }
    }

    public static class GetCallerIDNumbers_Result
    {

        public long m_IDs[];
        public String m_numbers[];
        public boolean m_return;
        public int m_states[];
        public int m_types[];

        public void init(int ai[], byte abyte0[][], long al[], int ai1[], boolean flag)
        {
            m_types = ai;
            m_numbers = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_IDs = al;
            m_states = ai1;
            m_return = flag;
        }

        public GetCallerIDNumbers_Result()
        {
        }
    }

    public static class GetCallerIDOptions_Result
    {

        public long m_callerID;
        public int m_idconfig;
        public boolean m_return;
        public long m_smsID;

        public void init(long l, long l1, int i, boolean flag)
        {
            m_smsID = l;
            m_callerID = l1;
            m_idconfig = i;
            m_return = flag;
        }

        public GetCallerIDOptions_Result()
        {
        }
    }

    public static class GetConnectivity_Result
    {

        public CONNECTION_STATUS m_conn_s;
        public SEND_STATUS m_send_s;
        public SYNC_STATUS m_sync_s;

        public void init(CONNECTION_STATUS connection_status, SYNC_STATUS sync_status, SEND_STATUS send_status)
        {
            m_conn_s = connection_status;
            m_sync_s = sync_status;
            m_send_s = send_status;
        }

        public GetConnectivity_Result()
        {
        }
    }

    public static class GetConversationList_Result
    {

        public int m_conversationObjectIDList[];

        public void init(int ai[])
        {
            m_conversationObjectIDList = ai;
        }

        public GetConversationList_Result()
        {
        }
    }

    public static class GetCustomContactGroups_Result
    {

        public int m_groupObjectIDList[];

        public void init(int ai[])
        {
            m_groupObjectIDList = ai;
        }

        public GetCustomContactGroups_Result()
        {
        }
    }

    public static class GetDefaultContentId_Result
    {

        public String m_contentId;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_contentId = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public GetDefaultContentId_Result()
        {
        }
    }

    public static class GetEmoticonListFromPack_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetEmoticonListFromPack_Result()
        {
        }
    }

    public static class GetEmoticonList_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetEmoticonList_Result()
        {
        }
    }

    public static class GetExistingAccounts_Result
    {

        public String m_accountNameList[];
        public boolean m_return;

        public void init(byte abyte0[][], boolean flag)
        {
            m_accountNameList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_return = flag;
        }

        public GetExistingAccounts_Result()
        {
        }
    }

    public static class GetISOCountryInfo_Result
    {

        public String m_countryCodeList[];
        public String m_countryDialExampleList[];
        public String m_countryNameList[];
        public int m_countryPrefixList[];

        public void init(byte abyte0[][], byte abyte1[][], int ai[], byte abyte2[][])
        {
            m_countryCodeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_countryNameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_countryPrefixList = ai;
            m_countryDialExampleList = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
        }

        public GetISOCountryInfo_Result()
        {
        }
    }

    public static class GetISOLanguageInfo_Result
    {

        public String m_languageCodeList[];
        public String m_languageNameList[];

        public void init(byte abyte0[][], byte abyte1[][])
        {
            m_languageCodeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_languageNameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        }

        public GetISOLanguageInfo_Result()
        {
        }
    }

    public static class GetLastConfirmationNumber_Result
    {

        public String m_number;

        public void init(byte abyte0[])
        {
            m_number = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        }

        public GetLastConfirmationNumber_Result()
        {
        }
    }

    public static class GetMessageListByType_Result
    {

        public int m_messageObjectIDList[];

        public void init(int ai[])
        {
            m_messageObjectIDList = ai;
        }

        public GetMessageListByType_Result()
        {
        }
    }

    public static class GetMessageList_Result
    {

        public int m_messageObjectIDList[];

        public void init(int ai[])
        {
            m_messageObjectIDList = ai;
        }

        public GetMessageList_Result()
        {
        }
    }

    public static class GetNrgLevels_Result
    {

        public int m_micLevel;
        public int m_speakerLevel;

        public void init(int i, int j)
        {
            m_micLevel = i;
            m_speakerLevel = j;
        }

        public GetNrgLevels_Result()
        {
        }
    }

    public static class GetOptimalAgeRanges_Result
    {

        public int m_rangeList[];

        public void init(int ai[])
        {
            m_rangeList = ai;
        }

        public GetOptimalAgeRanges_Result()
        {
        }
    }

    public static class GetPackListFromTab_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetPackListFromTab_Result()
        {
        }
    }

    public static class GetPackList_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetPackList_Result()
        {
        }
    }

    public static class GetPendingMediaDocumentsList_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetPendingMediaDocumentsList_Result()
        {
        }
    }

    public static class GetRecentAlertsOfType_Result
    {

        public int m_alertObjectIDList[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_alertObjectIDList = ai;
            m_return = flag;
        }

        public GetRecentAlertsOfType_Result()
        {
        }
    }

    public static class GetRecentAlerts_Result
    {

        public int m_alertObjectIDList[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_alertObjectIDList = ai;
            m_return = flag;
        }

        public GetRecentAlerts_Result()
        {
        }
    }

    public static class GetSupportedUILanguageList_Result
    {

        public String m_uiLanguageCodeList[];

        public void init(byte abyte0[][])
        {
            m_uiLanguageCodeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        }

        public GetSupportedUILanguageList_Result()
        {
        }
    }

    public static class GetSyncKeyofContactGroup_Result
    {

        public boolean m_return;
        public String m_syncKey;

        public void init(byte abyte0[], boolean flag)
        {
            m_syncKey = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public GetSyncKeyofContactGroup_Result()
        {
        }
    }

    public static class GetTabList_Result
    {

        public int m_mediaDocuments[];
        public boolean m_return;

        public void init(int ai[], boolean flag)
        {
            m_mediaDocuments = ai;
            m_return = flag;
        }

        public GetTabList_Result()
        {
        }
    }

    public static class GetVCard_Result
    {

        public boolean m_return;
        public byte m_vcard[];

        public void init(byte abyte0[], boolean flag)
        {
            m_vcard = abyte0;
            m_return = flag;
        }

        public GetVCard_Result()
        {
        }
    }

    public static class GetValidatedSmsNumbers_Result
    {

        public String m_numbers[];

        public void init(byte abyte0[][])
        {
            m_numbers = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        }

        public GetValidatedSmsNumbers_Result()
        {
        }
    }

    public static class GetVideoMessagingEntitlement_Result
    {

        public String m_ids[];
        public boolean m_isEntitled;
        public String m_planName;
        public int m_values[];

        public void init(boolean flag, byte abyte0[], byte abyte1[][], int ai[])
        {
            m_isEntitled = flag;
            m_planName = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_ids = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_values = ai;
        }

        public GetVideoMessagingEntitlement_Result()
        {
        }
    }

    public static final class HTTPFE_METHOD extends Enum
    {

        private static final HTTPFE_METHOD $VALUES[];
        public static final HTTPFE_METHOD HTTPFE_GET;
        public static final HTTPFE_METHOD HTTPFE_POST;
        public static final HTTPFE_METHOD WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static HTTPFE_METHOD fromInt(int i)
        {
            HTTPFE_METHOD httpfe_method = (HTTPFE_METHOD)intToTypeMap.a(i);
            if (httpfe_method != null)
            {
                return httpfe_method;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static HTTPFE_METHOD valueOf(String s)
        {
            return (HTTPFE_METHOD)Enum.valueOf(com/skype/SkyLib$HTTPFE_METHOD, s);
        }

        public static HTTPFE_METHOD[] values()
        {
            return (HTTPFE_METHOD[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            HTTPFE_GET = new HTTPFE_METHOD("HTTPFE_GET", 0, 0);
            HTTPFE_POST = new HTTPFE_METHOD("HTTPFE_POST", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new HTTPFE_METHOD("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new HTTPFE_METHOD[] {
                HTTPFE_GET, HTTPFE_POST, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            HTTPFE_METHOD ahttpfe_method[] = values();
            int k = ahttpfe_method.length;
            for (int i = 0; i < k; i++)
            {
                HTTPFE_METHOD httpfe_method = ahttpfe_method[i];
                intToTypeMap.a(httpfe_method.value, httpfe_method);
            }

        }

        private HTTPFE_METHOD(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class IDENTITYTYPE extends Enum
    {

        private static final IDENTITYTYPE $VALUES[];
        public static final IDENTITYTYPE BOT;
        public static final IDENTITYTYPE CONFERENCE;
        public static final IDENTITYTYPE EXTERNAL;
        public static final IDENTITYTYPE LYNC;
        public static final IDENTITYTYPE PASSPORT;
        public static final IDENTITYTYPE PSTN;
        public static final IDENTITYTYPE PSTN_EMERGENCY;
        public static final IDENTITYTYPE PSTN_FREE;
        public static final IDENTITYTYPE PSTN_UNDISCLOSED;
        public static final IDENTITYTYPE SKYPE;
        public static final IDENTITYTYPE SKYPE_MYSELF;
        public static final IDENTITYTYPE SKYPE_UNDISCLOSED;
        public static final IDENTITYTYPE UNRECOGNIZED;
        public static final IDENTITYTYPE WRAPPER_UNKNOWN_VALUE;
        public static final IDENTITYTYPE XMPP;
        private static final j intToTypeMap;
        private final int value;

        public static IDENTITYTYPE fromInt(int i)
        {
            IDENTITYTYPE identitytype = (IDENTITYTYPE)intToTypeMap.a(i);
            if (identitytype != null)
            {
                return identitytype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static IDENTITYTYPE valueOf(String s)
        {
            return (IDENTITYTYPE)Enum.valueOf(com/skype/SkyLib$IDENTITYTYPE, s);
        }

        public static IDENTITYTYPE[] values()
        {
            return (IDENTITYTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UNRECOGNIZED = new IDENTITYTYPE("UNRECOGNIZED", 0, 0);
            SKYPE = new IDENTITYTYPE("SKYPE", 1, 1);
            SKYPE_MYSELF = new IDENTITYTYPE("SKYPE_MYSELF", 2, 2);
            SKYPE_UNDISCLOSED = new IDENTITYTYPE("SKYPE_UNDISCLOSED", 3, 3);
            PSTN = new IDENTITYTYPE("PSTN", 4, 4);
            PSTN_EMERGENCY = new IDENTITYTYPE("PSTN_EMERGENCY", 5, 5);
            PSTN_FREE = new IDENTITYTYPE("PSTN_FREE", 6, 6);
            PSTN_UNDISCLOSED = new IDENTITYTYPE("PSTN_UNDISCLOSED", 7, 7);
            CONFERENCE = new IDENTITYTYPE("CONFERENCE", 8, 8);
            EXTERNAL = new IDENTITYTYPE("EXTERNAL", 9, 9);
            XMPP = new IDENTITYTYPE("XMPP", 10, 10);
            PASSPORT = new IDENTITYTYPE("PASSPORT", 11, 11);
            LYNC = new IDENTITYTYPE("LYNC", 12, 12);
            BOT = new IDENTITYTYPE("BOT", 13, 13);
            WRAPPER_UNKNOWN_VALUE = new IDENTITYTYPE("WRAPPER_UNKNOWN_VALUE", 14, 0x7fffffff);
            $VALUES = (new IDENTITYTYPE[] {
                UNRECOGNIZED, SKYPE, SKYPE_MYSELF, SKYPE_UNDISCLOSED, PSTN, PSTN_EMERGENCY, PSTN_FREE, PSTN_UNDISCLOSED, CONFERENCE, EXTERNAL, 
                XMPP, PASSPORT, LYNC, BOT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            IDENTITYTYPE aidentitytype[] = values();
            int k = aidentitytype.length;
            for (int i = 0; i < k; i++)
            {
                IDENTITYTYPE identitytype = aidentitytype[i];
                intToTypeMap.a(identitytype.value, identitytype);
            }

        }

        private IDENTITYTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class INTENT extends Enum
    {

        private static final INTENT $VALUES[];
        public static final INTENT I_CALL_PREHEAT;
        public static final INTENT I_CALL_PUSH;
        public static final INTENT I_CALL_USER;
        public static final INTENT I_CHAT_SYNC;
        public static final INTENT I_REGULAR;
        public static final INTENT I_UNKNOWN;
        public static final INTENT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static INTENT fromInt(int i)
        {
            INTENT intent = (INTENT)intToTypeMap.a(i);
            if (intent != null)
            {
                return intent;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static INTENT valueOf(String s)
        {
            return (INTENT)Enum.valueOf(com/skype/SkyLib$INTENT, s);
        }

        public static INTENT[] values()
        {
            return (INTENT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            I_REGULAR = new INTENT("I_REGULAR", 0, 0);
            I_CHAT_SYNC = new INTENT("I_CHAT_SYNC", 1, 1);
            I_CALL_PUSH = new INTENT("I_CALL_PUSH", 2, 2);
            I_CALL_USER = new INTENT("I_CALL_USER", 3, 3);
            I_UNKNOWN = new INTENT("I_UNKNOWN", 4, 4);
            I_CALL_PREHEAT = new INTENT("I_CALL_PREHEAT", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new INTENT("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new INTENT[] {
                I_REGULAR, I_CHAT_SYNC, I_CALL_PUSH, I_CALL_USER, I_UNKNOWN, I_CALL_PREHEAT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            INTENT aintent[] = values();
            int k = aintent.length;
            for (int i = 0; i < k; i++)
            {
                INTENT intent = aintent[i];
                intToTypeMap.a(intent.value, intent);
            }

        }

        private INTENT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class IngestAddContactAndLookupExisting_Result
    {

        public String m_matchingSkypenames[];
        public boolean m_return;

        public void init(byte abyte0[][], boolean flag)
        {
            m_matchingSkypenames = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_return = flag;
        }

        public IngestAddContactAndLookupExisting_Result()
        {
        }
    }

    public static class IngestGetMatchingContactIds_Result
    {

        public String m_deviceContactIds[];

        public void init(byte abyte0[][])
        {
            m_deviceContactIds = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        }

        public IngestGetMatchingContactIds_Result()
        {
        }
    }

    public static class IsMicrophoneMuted_Result
    {

        public boolean m_muted;
        public boolean m_return;

        public void init(boolean flag, boolean flag1)
        {
            m_muted = flag;
            m_return = flag1;
        }

        public IsMicrophoneMuted_Result()
        {
        }
    }

    public static class IsSpeakerMuted_Result
    {

        public boolean m_muted;
        public boolean m_return;

        public void init(boolean flag, boolean flag1)
        {
            m_muted = flag;
            m_return = flag1;
        }

        public IsSpeakerMuted_Result()
        {
        }
    }

    public static final class LEAVE_REASON extends Enum
    {

        private static final LEAVE_REASON $VALUES[];
        public static final LEAVE_REASON LEAVE_REASON_NONE;
        public static final LEAVE_REASON LIVE_BLOCKED_BY_PRIVACY_SETTINGS;
        public static final LEAVE_REASON LIVE_BLOCKED_BY_US;
        public static final LEAVE_REASON LIVE_BUSY;
        public static final LEAVE_REASON LIVE_CONNECTION_DROPPED;
        public static final LEAVE_REASON LIVE_EMERGENCY_CALL_DENIED;
        public static final LEAVE_REASON LIVE_ERROR;
        public static final LEAVE_REASON LIVE_INSUFFICIENT_FUNDS;
        public static final LEAVE_REASON LIVE_INTERNAL_ERROR;
        public static final LEAVE_REASON LIVE_INTERNET_CONNECTION_LOST;
        public static final LEAVE_REASON LIVE_LEGACY_ERROR;
        public static final LEAVE_REASON LIVE_MANUAL;
        public static final LEAVE_REASON LIVE_NO_ANSWER;
        public static final LEAVE_REASON LIVE_NO_SKYPEOUT_SUBSCRIPTION;
        public static final LEAVE_REASON LIVE_NUMBER_UNAVAILABLE;
        public static final LEAVE_REASON LIVE_PARTICIPANT_COUNT_LIMIT_REACHED;
        public static final LEAVE_REASON LIVE_PLAYBACK_ERROR;
        public static final LEAVE_REASON LIVE_PLUGIN_INSTALL_NEEDED;
        public static final LEAVE_REASON LIVE_PSTN_BLOCKED_REGULATORY_INDIA;
        public static final LEAVE_REASON LIVE_PSTN_BUSY;
        public static final LEAVE_REASON LIVE_PSTN_CALL_REJECTED;
        public static final LEAVE_REASON LIVE_PSTN_CALL_TERMINATED;
        public static final LEAVE_REASON LIVE_PSTN_CALL_TIMED_OUT;
        public static final LEAVE_REASON LIVE_PSTN_COULD_NOT_CONNECT_TO_SKYPE_PROXY;
        public static final LEAVE_REASON LIVE_PSTN_INVALID_NUMBER;
        public static final LEAVE_REASON LIVE_PSTN_MISC_ERROR;
        public static final LEAVE_REASON LIVE_PSTN_NETWORK_ERROR;
        public static final LEAVE_REASON LIVE_PSTN_NUMBER_FORBIDDEN;
        public static final LEAVE_REASON LIVE_RECORDING_FAILED;
        public static final LEAVE_REASON LIVE_SKYPEOUT_ACCOUNT_BLOCKED;
        public static final LEAVE_REASON LIVE_TOO_MANY_IDENTITIES;
        public static final LEAVE_REASON LIVE_TRANSFER_FAILED;
        public static final LEAVE_REASON LIVE_TRANSFER_INSUFFICIENT_FUNDS;
        public static final LEAVE_REASON LIVE_UNABLE_TO_CONNECT;
        public static final LEAVE_REASON RETIRED_ADDER_MUST_BE_AUTHORIZED;
        public static final LEAVE_REASON RETIRED_ADDER_MUST_BE_FRIEND;
        public static final LEAVE_REASON RETIRED_CHAT_FULL;
        public static final LEAVE_REASON RETIRED_DECLINE_ADD;
        public static final LEAVE_REASON RETIRED_INTERNAL_ERROR;
        public static final LEAVE_REASON RETIRED_UNSUBSCRIBE;
        public static final LEAVE_REASON RETIRED_USER_INCAPABLE;
        public static final LEAVE_REASON WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LEAVE_REASON fromInt(int i)
        {
            LEAVE_REASON leave_reason = (LEAVE_REASON)intToTypeMap.a(i);
            if (leave_reason != null)
            {
                return leave_reason;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LEAVE_REASON valueOf(String s)
        {
            return (LEAVE_REASON)Enum.valueOf(com/skype/SkyLib$LEAVE_REASON, s);
        }

        public static LEAVE_REASON[] values()
        {
            return (LEAVE_REASON[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LEAVE_REASON_NONE = new LEAVE_REASON("LEAVE_REASON_NONE", 0, 0);
            RETIRED_USER_INCAPABLE = new LEAVE_REASON("RETIRED_USER_INCAPABLE", 1, 2);
            RETIRED_ADDER_MUST_BE_FRIEND = new LEAVE_REASON("RETIRED_ADDER_MUST_BE_FRIEND", 2, 3);
            RETIRED_ADDER_MUST_BE_AUTHORIZED = new LEAVE_REASON("RETIRED_ADDER_MUST_BE_AUTHORIZED", 3, 4);
            RETIRED_DECLINE_ADD = new LEAVE_REASON("RETIRED_DECLINE_ADD", 4, 5);
            RETIRED_UNSUBSCRIBE = new LEAVE_REASON("RETIRED_UNSUBSCRIBE", 5, 6);
            RETIRED_CHAT_FULL = new LEAVE_REASON("RETIRED_CHAT_FULL", 6, 7);
            RETIRED_INTERNAL_ERROR = new LEAVE_REASON("RETIRED_INTERNAL_ERROR", 7, 8);
            LIVE_NO_ANSWER = new LEAVE_REASON("LIVE_NO_ANSWER", 8, 100);
            LIVE_MANUAL = new LEAVE_REASON("LIVE_MANUAL", 9, 101);
            LIVE_BUSY = new LEAVE_REASON("LIVE_BUSY", 10, 102);
            LIVE_CONNECTION_DROPPED = new LEAVE_REASON("LIVE_CONNECTION_DROPPED", 11, 103);
            LIVE_NO_SKYPEOUT_SUBSCRIPTION = new LEAVE_REASON("LIVE_NO_SKYPEOUT_SUBSCRIPTION", 12, 104);
            LIVE_INSUFFICIENT_FUNDS = new LEAVE_REASON("LIVE_INSUFFICIENT_FUNDS", 13, 105);
            LIVE_INTERNET_CONNECTION_LOST = new LEAVE_REASON("LIVE_INTERNET_CONNECTION_LOST", 14, 106);
            LIVE_SKYPEOUT_ACCOUNT_BLOCKED = new LEAVE_REASON("LIVE_SKYPEOUT_ACCOUNT_BLOCKED", 15, 107);
            LIVE_PSTN_COULD_NOT_CONNECT_TO_SKYPE_PROXY = new LEAVE_REASON("LIVE_PSTN_COULD_NOT_CONNECT_TO_SKYPE_PROXY", 16, 108);
            LIVE_PSTN_INVALID_NUMBER = new LEAVE_REASON("LIVE_PSTN_INVALID_NUMBER", 17, 109);
            LIVE_PSTN_NUMBER_FORBIDDEN = new LEAVE_REASON("LIVE_PSTN_NUMBER_FORBIDDEN", 18, 110);
            LIVE_PSTN_CALL_TIMED_OUT = new LEAVE_REASON("LIVE_PSTN_CALL_TIMED_OUT", 19, 111);
            LIVE_PSTN_BUSY = new LEAVE_REASON("LIVE_PSTN_BUSY", 20, 112);
            LIVE_PSTN_CALL_TERMINATED = new LEAVE_REASON("LIVE_PSTN_CALL_TERMINATED", 21, 113);
            LIVE_PSTN_NETWORK_ERROR = new LEAVE_REASON("LIVE_PSTN_NETWORK_ERROR", 22, 114);
            LIVE_NUMBER_UNAVAILABLE = new LEAVE_REASON("LIVE_NUMBER_UNAVAILABLE", 23, 115);
            LIVE_PSTN_CALL_REJECTED = new LEAVE_REASON("LIVE_PSTN_CALL_REJECTED", 24, 116);
            LIVE_PSTN_MISC_ERROR = new LEAVE_REASON("LIVE_PSTN_MISC_ERROR", 25, 117);
            LIVE_INTERNAL_ERROR = new LEAVE_REASON("LIVE_INTERNAL_ERROR", 26, 118);
            LIVE_UNABLE_TO_CONNECT = new LEAVE_REASON("LIVE_UNABLE_TO_CONNECT", 27, 119);
            LIVE_RECORDING_FAILED = new LEAVE_REASON("LIVE_RECORDING_FAILED", 28, 120);
            LIVE_PLAYBACK_ERROR = new LEAVE_REASON("LIVE_PLAYBACK_ERROR", 29, 121);
            LIVE_LEGACY_ERROR = new LEAVE_REASON("LIVE_LEGACY_ERROR", 30, 122);
            LIVE_BLOCKED_BY_PRIVACY_SETTINGS = new LEAVE_REASON("LIVE_BLOCKED_BY_PRIVACY_SETTINGS", 31, 123);
            LIVE_ERROR = new LEAVE_REASON("LIVE_ERROR", 32, 124);
            LIVE_TRANSFER_FAILED = new LEAVE_REASON("LIVE_TRANSFER_FAILED", 33, 125);
            LIVE_TRANSFER_INSUFFICIENT_FUNDS = new LEAVE_REASON("LIVE_TRANSFER_INSUFFICIENT_FUNDS", 34, 126);
            LIVE_BLOCKED_BY_US = new LEAVE_REASON("LIVE_BLOCKED_BY_US", 35, 127);
            LIVE_EMERGENCY_CALL_DENIED = new LEAVE_REASON("LIVE_EMERGENCY_CALL_DENIED", 36, 128);
            LIVE_PLUGIN_INSTALL_NEEDED = new LEAVE_REASON("LIVE_PLUGIN_INSTALL_NEEDED", 37, 129);
            LIVE_TOO_MANY_IDENTITIES = new LEAVE_REASON("LIVE_TOO_MANY_IDENTITIES", 38, 130);
            LIVE_PARTICIPANT_COUNT_LIMIT_REACHED = new LEAVE_REASON("LIVE_PARTICIPANT_COUNT_LIMIT_REACHED", 39, 131);
            LIVE_PSTN_BLOCKED_REGULATORY_INDIA = new LEAVE_REASON("LIVE_PSTN_BLOCKED_REGULATORY_INDIA", 40, 132);
            WRAPPER_UNKNOWN_VALUE = new LEAVE_REASON("WRAPPER_UNKNOWN_VALUE", 41, 0x7fffffff);
            $VALUES = (new LEAVE_REASON[] {
                LEAVE_REASON_NONE, RETIRED_USER_INCAPABLE, RETIRED_ADDER_MUST_BE_FRIEND, RETIRED_ADDER_MUST_BE_AUTHORIZED, RETIRED_DECLINE_ADD, RETIRED_UNSUBSCRIBE, RETIRED_CHAT_FULL, RETIRED_INTERNAL_ERROR, LIVE_NO_ANSWER, LIVE_MANUAL, 
                LIVE_BUSY, LIVE_CONNECTION_DROPPED, LIVE_NO_SKYPEOUT_SUBSCRIPTION, LIVE_INSUFFICIENT_FUNDS, LIVE_INTERNET_CONNECTION_LOST, LIVE_SKYPEOUT_ACCOUNT_BLOCKED, LIVE_PSTN_COULD_NOT_CONNECT_TO_SKYPE_PROXY, LIVE_PSTN_INVALID_NUMBER, LIVE_PSTN_NUMBER_FORBIDDEN, LIVE_PSTN_CALL_TIMED_OUT, 
                LIVE_PSTN_BUSY, LIVE_PSTN_CALL_TERMINATED, LIVE_PSTN_NETWORK_ERROR, LIVE_NUMBER_UNAVAILABLE, LIVE_PSTN_CALL_REJECTED, LIVE_PSTN_MISC_ERROR, LIVE_INTERNAL_ERROR, LIVE_UNABLE_TO_CONNECT, LIVE_RECORDING_FAILED, LIVE_PLAYBACK_ERROR, 
                LIVE_LEGACY_ERROR, LIVE_BLOCKED_BY_PRIVACY_SETTINGS, LIVE_ERROR, LIVE_TRANSFER_FAILED, LIVE_TRANSFER_INSUFFICIENT_FUNDS, LIVE_BLOCKED_BY_US, LIVE_EMERGENCY_CALL_DENIED, LIVE_PLUGIN_INSTALL_NEEDED, LIVE_TOO_MANY_IDENTITIES, LIVE_PARTICIPANT_COUNT_LIMIT_REACHED, 
                LIVE_PSTN_BLOCKED_REGULATORY_INDIA, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LEAVE_REASON aleave_reason[] = values();
            int k = aleave_reason.length;
            for (int i = 0; i < k; i++)
            {
                LEAVE_REASON leave_reason = aleave_reason[i];
                intToTypeMap.a(leave_reason.value, leave_reason);
            }

        }

        private LEAVE_REASON(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LIBPROP extends Enum
    {

        private static final LIBPROP $VALUES[];
        public static final LIBPROP LIBPROP_3G_FREE_TRIAL_IS_OVER;
        public static final LIBPROP LIBPROP_AD_ALLOWED_BASIC;
        public static final LIBPROP LIBPROP_AD_ALLOWED_RICH;
        public static final LIBPROP LIBPROP_ALL_LASTCALL_PROPERTIES_SET;
        public static final LIBPROP LIBPROP_API_ALLOWLIST_LOCK;
        public static final LIBPROP LIBPROP_AUTO_TOPUP_STATUS;
        public static final LIBPROP LIBPROP_BILLING_TYPE;
        public static final LIBPROP LIBPROP_BW_CURIN_KB;
        public static final LIBPROP LIBPROP_BW_CUROUT_KB;
        public static final LIBPROP LIBPROP_CURCALL_TBYB_SECONDS_REMAINING;
        public static final LIBPROP LIBPROP_DISABLED_AUTH_PARTNERS;
        public static final LIBPROP LIBPROP_DISABLE_SENDMONEY;
        public static final LIBPROP LIBPROP_DISABLE_VIRAL_UPGRADES;
        public static final LIBPROP LIBPROP_DISABLE_WEB_SEARCH;
        public static final LIBPROP LIBPROP_IS_HTTPFE_ENABLED;
        public static final LIBPROP LIBPROP_LASTCALL_END_DETAILS;
        public static final LIBPROP LIBPROP_LASTCALL_LOCAL_PROBLEMS;
        public static final LIBPROP LIBPROP_LASTCALL_REMOTE_PROBLEMS;
        public static final LIBPROP LIBPROP_LOGIN_STATS_SAMPLING;
        public static final LIBPROP LIBPROP_MAX_CONFCALL_PARTICIPANTS;
        public static final LIBPROP LIBPROP_MAX_VIDEOCONFCALL_PARTICIPANTS;
        public static final LIBPROP LIBPROP_MESH_PROBLEMS;
        public static final LIBPROP LIBPROP_MPV_ENABLED;
        public static final LIBPROP LIBPROP_NETCONF_IS_LATEST;
        public static final LIBPROP LIBPROP_NGC_CAPABILITIES;
        public static final LIBPROP LIBPROP_OLD_CAMERA_DRIVER;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_CONTACT_IMPORT;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_DRAGONFLY;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_FILE_TRANSFER;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_FLAMINGO_CHANNEL;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_LANGUAGE_EDIT;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_LOGOUT;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_MICROPAYMENTS;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_PERSONALISE;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_PUBLIC_API;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_SCREENSHARING;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_VERSION_CHECK;
        public static final LIBPROP LIBPROP_POLICY_DISABLE_VIDEO;
        public static final LIBPROP LIBPROP_POSTCALL_JUNCTION_DISABLED;
        public static final LIBPROP LIBPROP_SKYPEHOME_CHANNEL_DISABLED;
        public static final LIBPROP LIBPROP_SKYPEMANAGER_MEMBER_STATUS;
        public static final LIBPROP LIBPROP_UPGRADE_SIGNER_NAME;
        public static final LIBPROP LIBPROP_USER_LIKENESS;
        public static final LIBPROP LIBPROP_VIDEO_MESSAGE_SENDING_ENABLED;
        public static final LIBPROP WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIBPROP fromInt(int i)
        {
            LIBPROP libprop = (LIBPROP)intToTypeMap.a(i);
            if (libprop != null)
            {
                return libprop;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIBPROP valueOf(String s)
        {
            return (LIBPROP)Enum.valueOf(com/skype/SkyLib$LIBPROP, s);
        }

        public static LIBPROP[] values()
        {
            return (LIBPROP[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LIBPROP_MAX_CONFCALL_PARTICIPANTS = new LIBPROP("LIBPROP_MAX_CONFCALL_PARTICIPANTS", 0, 0);
            LIBPROP_IS_HTTPFE_ENABLED = new LIBPROP("LIBPROP_IS_HTTPFE_ENABLED", 1, 1);
            LIBPROP_BW_CURIN_KB = new LIBPROP("LIBPROP_BW_CURIN_KB", 2, 2);
            LIBPROP_BW_CUROUT_KB = new LIBPROP("LIBPROP_BW_CUROUT_KB", 3, 3);
            LIBPROP_POLICY_DISABLE_PUBLIC_API = new LIBPROP("LIBPROP_POLICY_DISABLE_PUBLIC_API", 4, 4);
            LIBPROP_POLICY_DISABLE_FILE_TRANSFER = new LIBPROP("LIBPROP_POLICY_DISABLE_FILE_TRANSFER", 5, 5);
            LIBPROP_POLICY_DISABLE_CONTACT_IMPORT = new LIBPROP("LIBPROP_POLICY_DISABLE_CONTACT_IMPORT", 6, 6);
            LIBPROP_POLICY_DISABLE_VERSION_CHECK = new LIBPROP("LIBPROP_POLICY_DISABLE_VERSION_CHECK", 7, 7);
            LIBPROP_POLICY_DISABLE_PERSONALISE = new LIBPROP("LIBPROP_POLICY_DISABLE_PERSONALISE", 8, 8);
            LIBPROP_POLICY_DISABLE_LANGUAGE_EDIT = new LIBPROP("LIBPROP_POLICY_DISABLE_LANGUAGE_EDIT", 9, 9);
            LIBPROP_DISABLE_SENDMONEY = new LIBPROP("LIBPROP_DISABLE_SENDMONEY", 10, 10);
            LIBPROP_POLICY_DISABLE_MICROPAYMENTS = new LIBPROP("LIBPROP_POLICY_DISABLE_MICROPAYMENTS", 11, 11);
            LIBPROP_POLICY_DISABLE_DRAGONFLY = new LIBPROP("LIBPROP_POLICY_DISABLE_DRAGONFLY", 12, 12);
            LIBPROP_POLICY_DISABLE_SCREENSHARING = new LIBPROP("LIBPROP_POLICY_DISABLE_SCREENSHARING", 13, 13);
            LIBPROP_OLD_CAMERA_DRIVER = new LIBPROP("LIBPROP_OLD_CAMERA_DRIVER", 14, 14);
            LIBPROP_POLICY_DISABLE_LOGOUT = new LIBPROP("LIBPROP_POLICY_DISABLE_LOGOUT", 15, 15);
            LIBPROP_LASTCALL_LOCAL_PROBLEMS = new LIBPROP("LIBPROP_LASTCALL_LOCAL_PROBLEMS", 16, 16);
            LIBPROP_LASTCALL_REMOTE_PROBLEMS = new LIBPROP("LIBPROP_LASTCALL_REMOTE_PROBLEMS", 17, 17);
            LIBPROP_POLICY_DISABLE_FLAMINGO_CHANNEL = new LIBPROP("LIBPROP_POLICY_DISABLE_FLAMINGO_CHANNEL", 18, 18);
            LIBPROP_MAX_VIDEOCONFCALL_PARTICIPANTS = new LIBPROP("LIBPROP_MAX_VIDEOCONFCALL_PARTICIPANTS", 19, 19);
            LIBPROP_3G_FREE_TRIAL_IS_OVER = new LIBPROP("LIBPROP_3G_FREE_TRIAL_IS_OVER", 20, 20);
            LIBPROP_DISABLE_WEB_SEARCH = new LIBPROP("LIBPROP_DISABLE_WEB_SEARCH", 21, 21);
            LIBPROP_MPV_ENABLED = new LIBPROP("LIBPROP_MPV_ENABLED", 22, 22);
            LIBPROP_AUTO_TOPUP_STATUS = new LIBPROP("LIBPROP_AUTO_TOPUP_STATUS", 23, 23);
            LIBPROP_LASTCALL_END_DETAILS = new LIBPROP("LIBPROP_LASTCALL_END_DETAILS", 24, 24);
            LIBPROP_POSTCALL_JUNCTION_DISABLED = new LIBPROP("LIBPROP_POSTCALL_JUNCTION_DISABLED", 25, 25);
            LIBPROP_ALL_LASTCALL_PROPERTIES_SET = new LIBPROP("LIBPROP_ALL_LASTCALL_PROPERTIES_SET", 26, 26);
            LIBPROP_UPGRADE_SIGNER_NAME = new LIBPROP("LIBPROP_UPGRADE_SIGNER_NAME", 27, 27);
            LIBPROP_CURCALL_TBYB_SECONDS_REMAINING = new LIBPROP("LIBPROP_CURCALL_TBYB_SECONDS_REMAINING", 28, 29);
            LIBPROP_MESH_PROBLEMS = new LIBPROP("LIBPROP_MESH_PROBLEMS", 29, 30);
            LIBPROP_SKYPEHOME_CHANNEL_DISABLED = new LIBPROP("LIBPROP_SKYPEHOME_CHANNEL_DISABLED", 30, 31);
            LIBPROP_POLICY_DISABLE_VIDEO = new LIBPROP("LIBPROP_POLICY_DISABLE_VIDEO", 31, 32);
            LIBPROP_SKYPEMANAGER_MEMBER_STATUS = new LIBPROP("LIBPROP_SKYPEMANAGER_MEMBER_STATUS", 32, 33);
            LIBPROP_USER_LIKENESS = new LIBPROP("LIBPROP_USER_LIKENESS", 33, 34);
            LIBPROP_NETCONF_IS_LATEST = new LIBPROP("LIBPROP_NETCONF_IS_LATEST", 34, 35);
            LIBPROP_BILLING_TYPE = new LIBPROP("LIBPROP_BILLING_TYPE", 35, 36);
            LIBPROP_AD_ALLOWED_BASIC = new LIBPROP("LIBPROP_AD_ALLOWED_BASIC", 36, 37);
            LIBPROP_AD_ALLOWED_RICH = new LIBPROP("LIBPROP_AD_ALLOWED_RICH", 37, 38);
            LIBPROP_DISABLED_AUTH_PARTNERS = new LIBPROP("LIBPROP_DISABLED_AUTH_PARTNERS", 38, 39);
            LIBPROP_VIDEO_MESSAGE_SENDING_ENABLED = new LIBPROP("LIBPROP_VIDEO_MESSAGE_SENDING_ENABLED", 39, 40);
            LIBPROP_DISABLE_VIRAL_UPGRADES = new LIBPROP("LIBPROP_DISABLE_VIRAL_UPGRADES", 40, 41);
            LIBPROP_LOGIN_STATS_SAMPLING = new LIBPROP("LIBPROP_LOGIN_STATS_SAMPLING", 41, 42);
            LIBPROP_API_ALLOWLIST_LOCK = new LIBPROP("LIBPROP_API_ALLOWLIST_LOCK", 42, 43);
            LIBPROP_NGC_CAPABILITIES = new LIBPROP("LIBPROP_NGC_CAPABILITIES", 43, 44);
            WRAPPER_UNKNOWN_VALUE = new LIBPROP("WRAPPER_UNKNOWN_VALUE", 44, 0x7fffffff);
            $VALUES = (new LIBPROP[] {
                LIBPROP_MAX_CONFCALL_PARTICIPANTS, LIBPROP_IS_HTTPFE_ENABLED, LIBPROP_BW_CURIN_KB, LIBPROP_BW_CUROUT_KB, LIBPROP_POLICY_DISABLE_PUBLIC_API, LIBPROP_POLICY_DISABLE_FILE_TRANSFER, LIBPROP_POLICY_DISABLE_CONTACT_IMPORT, LIBPROP_POLICY_DISABLE_VERSION_CHECK, LIBPROP_POLICY_DISABLE_PERSONALISE, LIBPROP_POLICY_DISABLE_LANGUAGE_EDIT, 
                LIBPROP_DISABLE_SENDMONEY, LIBPROP_POLICY_DISABLE_MICROPAYMENTS, LIBPROP_POLICY_DISABLE_DRAGONFLY, LIBPROP_POLICY_DISABLE_SCREENSHARING, LIBPROP_OLD_CAMERA_DRIVER, LIBPROP_POLICY_DISABLE_LOGOUT, LIBPROP_LASTCALL_LOCAL_PROBLEMS, LIBPROP_LASTCALL_REMOTE_PROBLEMS, LIBPROP_POLICY_DISABLE_FLAMINGO_CHANNEL, LIBPROP_MAX_VIDEOCONFCALL_PARTICIPANTS, 
                LIBPROP_3G_FREE_TRIAL_IS_OVER, LIBPROP_DISABLE_WEB_SEARCH, LIBPROP_MPV_ENABLED, LIBPROP_AUTO_TOPUP_STATUS, LIBPROP_LASTCALL_END_DETAILS, LIBPROP_POSTCALL_JUNCTION_DISABLED, LIBPROP_ALL_LASTCALL_PROPERTIES_SET, LIBPROP_UPGRADE_SIGNER_NAME, LIBPROP_CURCALL_TBYB_SECONDS_REMAINING, LIBPROP_MESH_PROBLEMS, 
                LIBPROP_SKYPEHOME_CHANNEL_DISABLED, LIBPROP_POLICY_DISABLE_VIDEO, LIBPROP_SKYPEMANAGER_MEMBER_STATUS, LIBPROP_USER_LIKENESS, LIBPROP_NETCONF_IS_LATEST, LIBPROP_BILLING_TYPE, LIBPROP_AD_ALLOWED_BASIC, LIBPROP_AD_ALLOWED_RICH, LIBPROP_DISABLED_AUTH_PARTNERS, LIBPROP_VIDEO_MESSAGE_SENDING_ENABLED, 
                LIBPROP_DISABLE_VIRAL_UPGRADES, LIBPROP_LOGIN_STATS_SAMPLING, LIBPROP_API_ALLOWLIST_LOCK, LIBPROP_NGC_CAPABILITIES, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIBPROP alibprop[] = values();
            int k = alibprop.length;
            for (int i = 0; i < k; i++)
            {
                LIBPROP libprop = alibprop[i];
                intToTypeMap.a(libprop.value, libprop);
            }

        }

        private LIBPROP(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LIVESESSION_END_DETAILS extends Enum
    {

        private static final LIVESESSION_END_DETAILS $VALUES[];
        public static final LIVESESSION_END_DETAILS LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY;
        public static final LIVESESSION_END_DETAILS LED_HOST_WENT_OFFLINE;
        public static final LIVESESSION_END_DETAILS LED_LOCAL_USER_TERMINATED_DURING_RECOVERY;
        public static final LIVESESSION_END_DETAILS LED_NO_LOCAL_CONNECTIVITY;
        public static final LIVESESSION_END_DETAILS LED_NO_REMOTE_CONNECTIVITY;
        public static final LIVESESSION_END_DETAILS LED_RECOVERY_UNSUCCESSFUL;
        public static final LIVESESSION_END_DETAILS LED_REMOTE_USER_TERMINATED_DURING_RECOVERY;
        public static final LIVESESSION_END_DETAILS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIVESESSION_END_DETAILS fromInt(int i)
        {
            LIVESESSION_END_DETAILS livesession_end_details = (LIVESESSION_END_DETAILS)intToTypeMap.a(i);
            if (livesession_end_details != null)
            {
                return livesession_end_details;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIVESESSION_END_DETAILS valueOf(String s)
        {
            return (LIVESESSION_END_DETAILS)Enum.valueOf(com/skype/SkyLib$LIVESESSION_END_DETAILS, s);
        }

        public static LIVESESSION_END_DETAILS[] values()
        {
            return (LIVESESSION_END_DETAILS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LED_NO_LOCAL_CONNECTIVITY = new LIVESESSION_END_DETAILS("LED_NO_LOCAL_CONNECTIVITY", 0, 1);
            LED_NO_REMOTE_CONNECTIVITY = new LIVESESSION_END_DETAILS("LED_NO_REMOTE_CONNECTIVITY", 1, 2);
            LED_RECOVERY_UNSUCCESSFUL = new LIVESESSION_END_DETAILS("LED_RECOVERY_UNSUCCESSFUL", 2, 4);
            LED_LOCAL_USER_TERMINATED_DURING_RECOVERY = new LIVESESSION_END_DETAILS("LED_LOCAL_USER_TERMINATED_DURING_RECOVERY", 3, 8);
            LED_REMOTE_USER_TERMINATED_DURING_RECOVERY = new LIVESESSION_END_DETAILS("LED_REMOTE_USER_TERMINATED_DURING_RECOVERY", 4, 16);
            LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY = new LIVESESSION_END_DETAILS("LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY", 5, 32);
            LED_HOST_WENT_OFFLINE = new LIVESESSION_END_DETAILS("LED_HOST_WENT_OFFLINE", 6, 64);
            WRAPPER_UNKNOWN_VALUE = new LIVESESSION_END_DETAILS("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new LIVESESSION_END_DETAILS[] {
                LED_NO_LOCAL_CONNECTIVITY, LED_NO_REMOTE_CONNECTIVITY, LED_RECOVERY_UNSUCCESSFUL, LED_LOCAL_USER_TERMINATED_DURING_RECOVERY, LED_REMOTE_USER_TERMINATED_DURING_RECOVERY, LED_ENDED_NORMALLY_WITH_SUCCESSFUL_RECOVERY, LED_HOST_WENT_OFFLINE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIVESESSION_END_DETAILS alivesession_end_details[] = values();
            int k = alivesession_end_details.length;
            for (int i = 0; i < k; i++)
            {
                LIVESESSION_END_DETAILS livesession_end_details = alivesession_end_details[i];
                intToTypeMap.a(livesession_end_details.value, livesession_end_details);
            }

        }

        private LIVESESSION_END_DETAILS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LIVESESSION_QUALITYRATING extends Enum
    {

        private static final LIVESESSION_QUALITYRATING $VALUES[];
        public static final LIVESESSION_QUALITYRATING AVERAGE;
        public static final LIVESESSION_QUALITYRATING BAD;
        public static final LIVESESSION_QUALITYRATING GOOD;
        public static final LIVESESSION_QUALITYRATING VERY_BAD;
        public static final LIVESESSION_QUALITYRATING VERY_GOOD;
        public static final LIVESESSION_QUALITYRATING WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LIVESESSION_QUALITYRATING fromInt(int i)
        {
            LIVESESSION_QUALITYRATING livesession_qualityrating = (LIVESESSION_QUALITYRATING)intToTypeMap.a(i);
            if (livesession_qualityrating != null)
            {
                return livesession_qualityrating;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LIVESESSION_QUALITYRATING valueOf(String s)
        {
            return (LIVESESSION_QUALITYRATING)Enum.valueOf(com/skype/SkyLib$LIVESESSION_QUALITYRATING, s);
        }

        public static LIVESESSION_QUALITYRATING[] values()
        {
            return (LIVESESSION_QUALITYRATING[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VERY_BAD = new LIVESESSION_QUALITYRATING("VERY_BAD", 0, 0);
            BAD = new LIVESESSION_QUALITYRATING("BAD", 1, 1);
            AVERAGE = new LIVESESSION_QUALITYRATING("AVERAGE", 2, 2);
            GOOD = new LIVESESSION_QUALITYRATING("GOOD", 3, 3);
            VERY_GOOD = new LIVESESSION_QUALITYRATING("VERY_GOOD", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new LIVESESSION_QUALITYRATING("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new LIVESESSION_QUALITYRATING[] {
                VERY_BAD, BAD, AVERAGE, GOOD, VERY_GOOD, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LIVESESSION_QUALITYRATING alivesession_qualityrating[] = values();
            int k = alivesession_qualityrating.length;
            for (int i = 0; i < k; i++)
            {
                LIVESESSION_QUALITYRATING livesession_qualityrating = alivesession_qualityrating[i];
                intToTypeMap.a(livesession_qualityrating.value, livesession_qualityrating);
            }

        }

        private LIVESESSION_QUALITYRATING(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class LOCALIZED_STRING extends Enum
    {

        private static final LOCALIZED_STRING $VALUES[];
        public static final LOCALIZED_STRING LOCALIZED_COUNT;
        public static final LOCALIZED_STRING LOCALIZED_UPGRADE_MESSAGE_IN_P2P;
        public static final LOCALIZED_STRING WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static LOCALIZED_STRING fromInt(int i)
        {
            LOCALIZED_STRING localized_string = (LOCALIZED_STRING)intToTypeMap.a(i);
            if (localized_string != null)
            {
                return localized_string;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static LOCALIZED_STRING valueOf(String s)
        {
            return (LOCALIZED_STRING)Enum.valueOf(com/skype/SkyLib$LOCALIZED_STRING, s);
        }

        public static LOCALIZED_STRING[] values()
        {
            return (LOCALIZED_STRING[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LOCALIZED_UPGRADE_MESSAGE_IN_P2P = new LOCALIZED_STRING("LOCALIZED_UPGRADE_MESSAGE_IN_P2P", 0, 0);
            LOCALIZED_COUNT = new LOCALIZED_STRING("LOCALIZED_COUNT", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new LOCALIZED_STRING("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new LOCALIZED_STRING[] {
                LOCALIZED_UPGRADE_MESSAGE_IN_P2P, LOCALIZED_COUNT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            LOCALIZED_STRING alocalized_string[] = values();
            int k = alocalized_string.length;
            for (int i = 0; i < k; i++)
            {
                LOCALIZED_STRING localized_string = alocalized_string[i];
                intToTypeMap.a(localized_string.value, localized_string);
            }

        }

        private LOCALIZED_STRING(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class MOBILE_DATA_USAGE_LEVEL extends Enum
    {

        private static final MOBILE_DATA_USAGE_LEVEL $VALUES[];
        public static final MOBILE_DATA_USAGE_LEVEL LOW;
        public static final MOBILE_DATA_USAGE_LEVEL MEDIUM;
        public static final MOBILE_DATA_USAGE_LEVEL UNLIMITED;
        public static final MOBILE_DATA_USAGE_LEVEL WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static MOBILE_DATA_USAGE_LEVEL fromInt(int i)
        {
            MOBILE_DATA_USAGE_LEVEL mobile_data_usage_level = (MOBILE_DATA_USAGE_LEVEL)intToTypeMap.a(i);
            if (mobile_data_usage_level != null)
            {
                return mobile_data_usage_level;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static MOBILE_DATA_USAGE_LEVEL valueOf(String s)
        {
            return (MOBILE_DATA_USAGE_LEVEL)Enum.valueOf(com/skype/SkyLib$MOBILE_DATA_USAGE_LEVEL, s);
        }

        public static MOBILE_DATA_USAGE_LEVEL[] values()
        {
            return (MOBILE_DATA_USAGE_LEVEL[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            LOW = new MOBILE_DATA_USAGE_LEVEL("LOW", 0, 10);
            MEDIUM = new MOBILE_DATA_USAGE_LEVEL("MEDIUM", 1, 20);
            UNLIMITED = new MOBILE_DATA_USAGE_LEVEL("UNLIMITED", 2, 100);
            WRAPPER_UNKNOWN_VALUE = new MOBILE_DATA_USAGE_LEVEL("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new MOBILE_DATA_USAGE_LEVEL[] {
                LOW, MEDIUM, UNLIMITED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            MOBILE_DATA_USAGE_LEVEL amobile_data_usage_level[] = values();
            int k = amobile_data_usage_level.length;
            for (int i = 0; i < k; i++)
            {
                MOBILE_DATA_USAGE_LEVEL mobile_data_usage_level = amobile_data_usage_level[i];
                intToTypeMap.a(mobile_data_usage_level.value, mobile_data_usage_level);
            }

        }

        private MOBILE_DATA_USAGE_LEVEL(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class NGC_CAPABILITIES extends Enum
    {

        private static final NGC_CAPABILITIES $VALUES[];
        public static final NGC_CAPABILITIES NGC_DISABLED;
        public static final NGC_CAPABILITIES NGC_ENABLED;
        public static final NGC_CAPABILITIES NGC_GROUP_CALLING_ENABLED;
        public static final NGC_CAPABILITIES NGC_GROUP_CALLING_INITIATION_ENABLED;
        public static final NGC_CAPABILITIES NGC_LYNC_CALLING_ENABLED;
        public static final NGC_CAPABILITIES NGC_SKYPE_CALLING_ENABLED;
        public static final NGC_CAPABILITIES WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static NGC_CAPABILITIES fromInt(int i)
        {
            NGC_CAPABILITIES ngc_capabilities = (NGC_CAPABILITIES)intToTypeMap.a(i);
            if (ngc_capabilities != null)
            {
                return ngc_capabilities;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static NGC_CAPABILITIES valueOf(String s)
        {
            return (NGC_CAPABILITIES)Enum.valueOf(com/skype/SkyLib$NGC_CAPABILITIES, s);
        }

        public static NGC_CAPABILITIES[] values()
        {
            return (NGC_CAPABILITIES[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NGC_DISABLED = new NGC_CAPABILITIES("NGC_DISABLED", 0, 0);
            NGC_ENABLED = new NGC_CAPABILITIES("NGC_ENABLED", 1, 1);
            NGC_LYNC_CALLING_ENABLED = new NGC_CAPABILITIES("NGC_LYNC_CALLING_ENABLED", 2, 2);
            NGC_SKYPE_CALLING_ENABLED = new NGC_CAPABILITIES("NGC_SKYPE_CALLING_ENABLED", 3, 4);
            NGC_GROUP_CALLING_ENABLED = new NGC_CAPABILITIES("NGC_GROUP_CALLING_ENABLED", 4, 8);
            NGC_GROUP_CALLING_INITIATION_ENABLED = new NGC_CAPABILITIES("NGC_GROUP_CALLING_INITIATION_ENABLED", 5, 16);
            WRAPPER_UNKNOWN_VALUE = new NGC_CAPABILITIES("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new NGC_CAPABILITIES[] {
                NGC_DISABLED, NGC_ENABLED, NGC_LYNC_CALLING_ENABLED, NGC_SKYPE_CALLING_ENABLED, NGC_GROUP_CALLING_ENABLED, NGC_GROUP_CALLING_INITIATION_ENABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            NGC_CAPABILITIES angc_capabilities[] = values();
            int k = angc_capabilities.length;
            for (int i = 0; i < k; i++)
            {
                NGC_CAPABILITIES ngc_capabilities = angc_capabilities[i];
                intToTypeMap.a(ngc_capabilities.value, ngc_capabilities);
            }

        }

        private NGC_CAPABILITIES(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class NORMALIZERESULT extends Enum
    {

        private static final NORMALIZERESULT $VALUES[];
        public static final NORMALIZERESULT IDENTITY_CONTAINS_INVALID_CHAR;
        public static final NORMALIZERESULT IDENTITY_EMPTY;
        public static final NORMALIZERESULT IDENTITY_OK;
        public static final NORMALIZERESULT IDENTITY_TOO_LONG;
        public static final NORMALIZERESULT PSTN_NUMBER_HAS_INVALID_PREFIX;
        public static final NORMALIZERESULT PSTN_NUMBER_TOO_SHORT;
        public static final NORMALIZERESULT SKYPENAME_SHORTER_THAN_6_CHARS;
        public static final NORMALIZERESULT SKYPENAME_STARTS_WITH_NONALPHA;
        public static final NORMALIZERESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static NORMALIZERESULT fromInt(int i)
        {
            NORMALIZERESULT normalizeresult = (NORMALIZERESULT)intToTypeMap.a(i);
            if (normalizeresult != null)
            {
                return normalizeresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static NORMALIZERESULT valueOf(String s)
        {
            return (NORMALIZERESULT)Enum.valueOf(com/skype/SkyLib$NORMALIZERESULT, s);
        }

        public static NORMALIZERESULT[] values()
        {
            return (NORMALIZERESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            IDENTITY_OK = new NORMALIZERESULT("IDENTITY_OK", 0, 0);
            IDENTITY_EMPTY = new NORMALIZERESULT("IDENTITY_EMPTY", 1, 1);
            IDENTITY_TOO_LONG = new NORMALIZERESULT("IDENTITY_TOO_LONG", 2, 2);
            IDENTITY_CONTAINS_INVALID_CHAR = new NORMALIZERESULT("IDENTITY_CONTAINS_INVALID_CHAR", 3, 3);
            PSTN_NUMBER_TOO_SHORT = new NORMALIZERESULT("PSTN_NUMBER_TOO_SHORT", 4, 4);
            PSTN_NUMBER_HAS_INVALID_PREFIX = new NORMALIZERESULT("PSTN_NUMBER_HAS_INVALID_PREFIX", 5, 5);
            SKYPENAME_STARTS_WITH_NONALPHA = new NORMALIZERESULT("SKYPENAME_STARTS_WITH_NONALPHA", 6, 6);
            SKYPENAME_SHORTER_THAN_6_CHARS = new NORMALIZERESULT("SKYPENAME_SHORTER_THAN_6_CHARS", 7, 7);
            WRAPPER_UNKNOWN_VALUE = new NORMALIZERESULT("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
            $VALUES = (new NORMALIZERESULT[] {
                IDENTITY_OK, IDENTITY_EMPTY, IDENTITY_TOO_LONG, IDENTITY_CONTAINS_INVALID_CHAR, PSTN_NUMBER_TOO_SHORT, PSTN_NUMBER_HAS_INVALID_PREFIX, SKYPENAME_STARTS_WITH_NONALPHA, SKYPENAME_SHORTER_THAN_6_CHARS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            NORMALIZERESULT anormalizeresult[] = values();
            int k = anormalizeresult.length;
            for (int i = 0; i < k; i++)
            {
                NORMALIZERESULT normalizeresult = anormalizeresult[i];
                intToTypeMap.a(normalizeresult.value, normalizeresult);
            }

        }

        private NORMALIZERESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class NormalizeIdentity_Result
    {

        public String m_normalized;
        public NORMALIZERESULT m_return;

        public void init(byte abyte0[], NORMALIZERESULT normalizeresult)
        {
            m_normalized = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = normalizeresult;
        }

        public NormalizeIdentity_Result()
        {
        }
    }

    public static class NormalizePSTNWithCountry_Result
    {

        public String m_normalized;
        public NORMALIZERESULT m_return;

        public void init(byte abyte0[], NORMALIZERESULT normalizeresult)
        {
            m_normalized = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = normalizeresult;
        }

        public NormalizePSTNWithCountry_Result()
        {
        }
    }

    public static final class OBJECTTYPE extends Enum
    {

        private static final OBJECTTYPE $VALUES[];
        public static final OBJECTTYPE ACCESS;
        public static final OBJECTTYPE ACCOUNT;
        public static final OBJECTTYPE ALERT;
        public static final OBJECTTYPE CALL;
        public static final OBJECTTYPE CALLMEMBER;
        public static final OBJECTTYPE CHAT;
        public static final OBJECTTYPE CHATMEMBER;
        public static final OBJECTTYPE CONTACT;
        public static final OBJECTTYPE CONTACTGROUP;
        public static final OBJECTTYPE CONTENTITEM;
        public static final OBJECTTYPE CONVERSATION;
        public static final OBJECTTYPE LEGACYMESSAGE;
        public static final OBJECTTYPE MEDIADOCUMENT;
        public static final OBJECTTYPE MESSAGE;
        public static final OBJECTTYPE MESSAGEANNOTATION;
        public static final OBJECTTYPE NROF_OBJECTTYPES;
        public static final OBJECTTYPE PARTICIPANT;
        public static final OBJECTTYPE PRICEQUOTE;
        public static final OBJECTTYPE SEARCH;
        public static final OBJECTTYPE SMS;
        public static final OBJECTTYPE TRANSFER;
        public static final OBJECTTYPE TRANSLATOR;
        public static final OBJECTTYPE VIDEO;
        public static final OBJECTTYPE VIDEOMESSAGE;
        public static final OBJECTTYPE VOICEMAIL;
        public static final OBJECTTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static OBJECTTYPE fromInt(int i)
        {
            OBJECTTYPE objecttype = (OBJECTTYPE)intToTypeMap.a(i);
            if (objecttype != null)
            {
                return objecttype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static OBJECTTYPE valueOf(String s)
        {
            return (OBJECTTYPE)Enum.valueOf(com/skype/SkyLib$OBJECTTYPE, s);
        }

        public static OBJECTTYPE[] values()
        {
            return (OBJECTTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CONTACTGROUP = new OBJECTTYPE("CONTACTGROUP", 0, 10);
            CONTACT = new OBJECTTYPE("CONTACT", 1, 2);
            SEARCH = new OBJECTTYPE("SEARCH", 2, 1);
            PARTICIPANT = new OBJECTTYPE("PARTICIPANT", 3, 19);
            MESSAGEANNOTATION = new OBJECTTYPE("MESSAGEANNOTATION", 4, 24);
            CONVERSATION = new OBJECTTYPE("CONVERSATION", 5, 18);
            MESSAGE = new OBJECTTYPE("MESSAGE", 6, 9);
            TRANSLATOR = new OBJECTTYPE("TRANSLATOR", 7, 23);
            CHATMEMBER = new OBJECTTYPE("CHATMEMBER", 8, 15);
            CHAT = new OBJECTTYPE("CHAT", 9, 8);
            VIDEO = new OBJECTTYPE("VIDEO", 10, 11);
            CALLMEMBER = new OBJECTTYPE("CALLMEMBER", 11, 13);
            CALL = new OBJECTTYPE("CALL", 12, 4);
            VOICEMAIL = new OBJECTTYPE("VOICEMAIL", 13, 7);
            SMS = new OBJECTTYPE("SMS", 14, 12);
            TRANSFER = new OBJECTTYPE("TRANSFER", 15, 6);
            CONTENTITEM = new OBJECTTYPE("CONTENTITEM", 16, 14);
            ALERT = new OBJECTTYPE("ALERT", 17, 16);
            PRICEQUOTE = new OBJECTTYPE("PRICEQUOTE", 18, 17);
            ACCOUNT = new OBJECTTYPE("ACCOUNT", 19, 5);
            ACCESS = new OBJECTTYPE("ACCESS", 20, 20);
            VIDEOMESSAGE = new OBJECTTYPE("VIDEOMESSAGE", 21, 21);
            MEDIADOCUMENT = new OBJECTTYPE("MEDIADOCUMENT", 22, 22);
            NROF_OBJECTTYPES = new OBJECTTYPE("NROF_OBJECTTYPES", 23, 25);
            LEGACYMESSAGE = new OBJECTTYPE("LEGACYMESSAGE", 24, 3);
            WRAPPER_UNKNOWN_VALUE = new OBJECTTYPE("WRAPPER_UNKNOWN_VALUE", 25, 0x7fffffff);
            $VALUES = (new OBJECTTYPE[] {
                CONTACTGROUP, CONTACT, SEARCH, PARTICIPANT, MESSAGEANNOTATION, CONVERSATION, MESSAGE, TRANSLATOR, CHATMEMBER, CHAT, 
                VIDEO, CALLMEMBER, CALL, VOICEMAIL, SMS, TRANSFER, CONTENTITEM, ALERT, PRICEQUOTE, ACCOUNT, 
                ACCESS, VIDEOMESSAGE, MEDIADOCUMENT, NROF_OBJECTTYPES, LEGACYMESSAGE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            OBJECTTYPE aobjecttype[] = values();
            int k = aobjecttype.length;
            for (int i = 0; i < k; i++)
            {
                OBJECTTYPE objecttype = aobjecttype[i];
                intToTypeMap.a(objecttype.value, objecttype);
            }

        }

        private OBJECTTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class OBJECT_TRACKER_CHANGE_TYPE extends Enum
    {

        private static final OBJECT_TRACKER_CHANGE_TYPE $VALUES[];
        public static final OBJECT_TRACKER_CHANGE_TYPE OTC_DELETE;
        public static final OBJECT_TRACKER_CHANGE_TYPE OTC_INSERT;
        public static final OBJECT_TRACKER_CHANGE_TYPE OTC_UPDATE;
        public static final OBJECT_TRACKER_CHANGE_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static OBJECT_TRACKER_CHANGE_TYPE fromInt(int i)
        {
            OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type = (OBJECT_TRACKER_CHANGE_TYPE)intToTypeMap.a(i);
            if (object_tracker_change_type != null)
            {
                return object_tracker_change_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static OBJECT_TRACKER_CHANGE_TYPE valueOf(String s)
        {
            return (OBJECT_TRACKER_CHANGE_TYPE)Enum.valueOf(com/skype/SkyLib$OBJECT_TRACKER_CHANGE_TYPE, s);
        }

        public static OBJECT_TRACKER_CHANGE_TYPE[] values()
        {
            return (OBJECT_TRACKER_CHANGE_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            OTC_INSERT = new OBJECT_TRACKER_CHANGE_TYPE("OTC_INSERT", 0, 0);
            OTC_UPDATE = new OBJECT_TRACKER_CHANGE_TYPE("OTC_UPDATE", 1, 1);
            OTC_DELETE = new OBJECT_TRACKER_CHANGE_TYPE("OTC_DELETE", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new OBJECT_TRACKER_CHANGE_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new OBJECT_TRACKER_CHANGE_TYPE[] {
                OTC_INSERT, OTC_UPDATE, OTC_DELETE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            OBJECT_TRACKER_CHANGE_TYPE aobject_tracker_change_type[] = values();
            int k = aobject_tracker_change_type.length;
            for (int i = 0; i < k; i++)
            {
                OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type = aobject_tracker_change_type[i];
                intToTypeMap.a(object_tracker_change_type.value, object_tracker_change_type);
            }

        }

        private OBJECT_TRACKER_CHANGE_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class OPERATING_MEDIA extends Enum
    {

        private static final OPERATING_MEDIA $VALUES[];
        public static final OPERATING_MEDIA OM_3G;
        public static final OPERATING_MEDIA OM_4G;
        public static final OPERATING_MEDIA OM_FREE;
        public static final OPERATING_MEDIA OM_FREE_WIRELESS;
        public static final OPERATING_MEDIA OM_UNKNOWN;
        public static final OPERATING_MEDIA WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static OPERATING_MEDIA fromInt(int i)
        {
            OPERATING_MEDIA operating_media = (OPERATING_MEDIA)intToTypeMap.a(i);
            if (operating_media != null)
            {
                return operating_media;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static OPERATING_MEDIA valueOf(String s)
        {
            return (OPERATING_MEDIA)Enum.valueOf(com/skype/SkyLib$OPERATING_MEDIA, s);
        }

        public static OPERATING_MEDIA[] values()
        {
            return (OPERATING_MEDIA[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            OM_UNKNOWN = new OPERATING_MEDIA("OM_UNKNOWN", 0, 0);
            OM_FREE = new OPERATING_MEDIA("OM_FREE", 1, 1);
            OM_FREE_WIRELESS = new OPERATING_MEDIA("OM_FREE_WIRELESS", 2, 2);
            OM_3G = new OPERATING_MEDIA("OM_3G", 3, 3);
            OM_4G = new OPERATING_MEDIA("OM_4G", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new OPERATING_MEDIA("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new OPERATING_MEDIA[] {
                OM_UNKNOWN, OM_FREE, OM_FREE_WIRELESS, OM_3G, OM_4G, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            OPERATING_MEDIA aoperating_media[] = values();
            int k = aoperating_media.length;
            for (int i = 0; i < k; i++)
            {
                OPERATING_MEDIA operating_media = aoperating_media[i];
                intToTypeMap.a(operating_media.value, operating_media);
            }

        }

        private OPERATING_MEDIA(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTNER_ID extends Enum
    {

        private static final PARTNER_ID $VALUES[];
        public static final PARTNER_ID PARTNER_FACEBOOK;
        public static final PARTNER_ID PARTNER_MICROSOFT;
        public static final PARTNER_ID PARTNER_NONE;
        public static final PARTNER_ID PARTNER_SKYPE;
        public static final PARTNER_ID WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTNER_ID fromInt(int i)
        {
            PARTNER_ID partner_id = (PARTNER_ID)intToTypeMap.a(i);
            if (partner_id != null)
            {
                return partner_id;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTNER_ID valueOf(String s)
        {
            return (PARTNER_ID)Enum.valueOf(com/skype/SkyLib$PARTNER_ID, s);
        }

        public static PARTNER_ID[] values()
        {
            return (PARTNER_ID[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PARTNER_NONE = new PARTNER_ID("PARTNER_NONE", 0, 0);
            PARTNER_SKYPE = new PARTNER_ID("PARTNER_SKYPE", 1, 1);
            PARTNER_FACEBOOK = new PARTNER_ID("PARTNER_FACEBOOK", 2, 95);
            PARTNER_MICROSOFT = new PARTNER_ID("PARTNER_MICROSOFT", 3, 999);
            WRAPPER_UNKNOWN_VALUE = new PARTNER_ID("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new PARTNER_ID[] {
                PARTNER_NONE, PARTNER_SKYPE, PARTNER_FACEBOOK, PARTNER_MICROSOFT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTNER_ID apartner_id[] = values();
            int k = apartner_id.length;
            for (int i = 0; i < k; i++)
            {
                PARTNER_ID partner_id = apartner_id[i];
                intToTypeMap.a(partner_id.value, partner_id);
            }

        }

        private PARTNER_ID(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTNER_QUERY_ERROR extends Enum
    {

        private static final PARTNER_QUERY_ERROR $VALUES[];
        public static final PARTNER_QUERY_ERROR PQ_SERVER_NOCONNECT;
        public static final PARTNER_QUERY_ERROR PQ_SERVER_NOSUCCESS;
        public static final PARTNER_QUERY_ERROR PQ_SUCCESS;
        public static final PARTNER_QUERY_ERROR WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTNER_QUERY_ERROR fromInt(int i)
        {
            PARTNER_QUERY_ERROR partner_query_error = (PARTNER_QUERY_ERROR)intToTypeMap.a(i);
            if (partner_query_error != null)
            {
                return partner_query_error;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTNER_QUERY_ERROR valueOf(String s)
        {
            return (PARTNER_QUERY_ERROR)Enum.valueOf(com/skype/SkyLib$PARTNER_QUERY_ERROR, s);
        }

        public static PARTNER_QUERY_ERROR[] values()
        {
            return (PARTNER_QUERY_ERROR[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PQ_SUCCESS = new PARTNER_QUERY_ERROR("PQ_SUCCESS", 0, 0);
            PQ_SERVER_NOSUCCESS = new PARTNER_QUERY_ERROR("PQ_SERVER_NOSUCCESS", 1, 1);
            PQ_SERVER_NOCONNECT = new PARTNER_QUERY_ERROR("PQ_SERVER_NOCONNECT", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new PARTNER_QUERY_ERROR("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new PARTNER_QUERY_ERROR[] {
                PQ_SUCCESS, PQ_SERVER_NOSUCCESS, PQ_SERVER_NOCONNECT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTNER_QUERY_ERROR apartner_query_error[] = values();
            int k = apartner_query_error.length;
            for (int i = 0; i < k; i++)
            {
                PARTNER_QUERY_ERROR partner_query_error = apartner_query_error[i];
                intToTypeMap.a(partner_query_error.value, partner_query_error);
            }

        }

        private PARTNER_QUERY_ERROR(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTNER_QUERY_ID extends Enum
    {

        private static final PARTNER_QUERY_ID $VALUES[];
        public static final PARTNER_QUERY_ID PQ_MANDALAY;
        public static final PARTNER_QUERY_ID WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTNER_QUERY_ID fromInt(int i)
        {
            PARTNER_QUERY_ID partner_query_id = (PARTNER_QUERY_ID)intToTypeMap.a(i);
            if (partner_query_id != null)
            {
                return partner_query_id;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTNER_QUERY_ID valueOf(String s)
        {
            return (PARTNER_QUERY_ID)Enum.valueOf(com/skype/SkyLib$PARTNER_QUERY_ID, s);
        }

        public static PARTNER_QUERY_ID[] values()
        {
            return (PARTNER_QUERY_ID[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PQ_MANDALAY = new PARTNER_QUERY_ID("PQ_MANDALAY", 0, 0);
            WRAPPER_UNKNOWN_VALUE = new PARTNER_QUERY_ID("WRAPPER_UNKNOWN_VALUE", 1, 0x7fffffff);
            $VALUES = (new PARTNER_QUERY_ID[] {
                PQ_MANDALAY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTNER_QUERY_ID apartner_query_id[] = values();
            int k = apartner_query_id.length;
            for (int i = 0; i < k; i++)
            {
                PARTNER_QUERY_ID partner_query_id = apartner_query_id[i];
                intToTypeMap.a(partner_query_id.value, partner_query_id);
            }

        }

        private PARTNER_QUERY_ID(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTNER_QUERY_PARAMS extends Enum
    {

        private static final PARTNER_QUERY_PARAMS $VALUES[];
        public static final PARTNER_QUERY_PARAMS PQ_EMAIL;
        public static final PARTNER_QUERY_PARAMS PQ_PARTNER_ID;
        public static final PARTNER_QUERY_PARAMS PQ_PASSWORD;
        public static final PARTNER_QUERY_PARAMS PQ_USERID;
        public static final PARTNER_QUERY_PARAMS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTNER_QUERY_PARAMS fromInt(int i)
        {
            PARTNER_QUERY_PARAMS partner_query_params = (PARTNER_QUERY_PARAMS)intToTypeMap.a(i);
            if (partner_query_params != null)
            {
                return partner_query_params;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTNER_QUERY_PARAMS valueOf(String s)
        {
            return (PARTNER_QUERY_PARAMS)Enum.valueOf(com/skype/SkyLib$PARTNER_QUERY_PARAMS, s);
        }

        public static PARTNER_QUERY_PARAMS[] values()
        {
            return (PARTNER_QUERY_PARAMS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PQ_PARTNER_ID = new PARTNER_QUERY_PARAMS("PQ_PARTNER_ID", 0, 32);
            PQ_EMAIL = new PARTNER_QUERY_PARAMS("PQ_EMAIL", 1, 33);
            PQ_PASSWORD = new PARTNER_QUERY_PARAMS("PQ_PASSWORD", 2, 34);
            PQ_USERID = new PARTNER_QUERY_PARAMS("PQ_USERID", 3, 35);
            WRAPPER_UNKNOWN_VALUE = new PARTNER_QUERY_PARAMS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new PARTNER_QUERY_PARAMS[] {
                PQ_PARTNER_ID, PQ_EMAIL, PQ_PASSWORD, PQ_USERID, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTNER_QUERY_PARAMS apartner_query_params[] = values();
            int k = apartner_query_params.length;
            for (int i = 0; i < k; i++)
            {
                PARTNER_QUERY_PARAMS partner_query_params = apartner_query_params[i];
                intToTypeMap.a(partner_query_params.value, partner_query_params);
            }

        }

        private PARTNER_QUERY_PARAMS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PARTNER_QUERY_TYPE extends Enum
    {

        private static final PARTNER_QUERY_TYPE $VALUES[];
        public static final PARTNER_QUERY_TYPE PQ_PICTURE_URL;
        public static final PARTNER_QUERY_TYPE PQ_PROFILE_URL;
        public static final PARTNER_QUERY_TYPE PQ_SESSIONTOKEN;
        public static final PARTNER_QUERY_TYPE PQ_USERID_QUERY;
        public static final PARTNER_QUERY_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PARTNER_QUERY_TYPE fromInt(int i)
        {
            PARTNER_QUERY_TYPE partner_query_type = (PARTNER_QUERY_TYPE)intToTypeMap.a(i);
            if (partner_query_type != null)
            {
                return partner_query_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PARTNER_QUERY_TYPE valueOf(String s)
        {
            return (PARTNER_QUERY_TYPE)Enum.valueOf(com/skype/SkyLib$PARTNER_QUERY_TYPE, s);
        }

        public static PARTNER_QUERY_TYPE[] values()
        {
            return (PARTNER_QUERY_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PQ_SESSIONTOKEN = new PARTNER_QUERY_TYPE("PQ_SESSIONTOKEN", 0, 0);
            PQ_PICTURE_URL = new PARTNER_QUERY_TYPE("PQ_PICTURE_URL", 1, 1);
            PQ_PROFILE_URL = new PARTNER_QUERY_TYPE("PQ_PROFILE_URL", 2, 2);
            PQ_USERID_QUERY = new PARTNER_QUERY_TYPE("PQ_USERID_QUERY", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new PARTNER_QUERY_TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new PARTNER_QUERY_TYPE[] {
                PQ_SESSIONTOKEN, PQ_PICTURE_URL, PQ_PROFILE_URL, PQ_USERID_QUERY, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PARTNER_QUERY_TYPE apartner_query_type[] = values();
            int k = apartner_query_type.length;
            for (int i = 0; i < k; i++)
            {
                PARTNER_QUERY_TYPE partner_query_type = apartner_query_type[i];
                intToTypeMap.a(partner_query_type.value, partner_query_type);
            }

        }

        private PARTNER_QUERY_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PNM_REGISTER_CONTEXTS_RESULT extends Enum
    {

        private static final PNM_REGISTER_CONTEXTS_RESULT $VALUES[];
        public static final PNM_REGISTER_CONTEXTS_RESULT REGISTER_CONTEXTS_FAILED;
        public static final PNM_REGISTER_CONTEXTS_RESULT REGISTER_CONTEXTS_FAILED_REQUEST;
        public static final PNM_REGISTER_CONTEXTS_RESULT REGISTER_CONTEXTS_SUCCEEDED;
        public static final PNM_REGISTER_CONTEXTS_RESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PNM_REGISTER_CONTEXTS_RESULT fromInt(int i)
        {
            PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result = (PNM_REGISTER_CONTEXTS_RESULT)intToTypeMap.a(i);
            if (pnm_register_contexts_result != null)
            {
                return pnm_register_contexts_result;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PNM_REGISTER_CONTEXTS_RESULT valueOf(String s)
        {
            return (PNM_REGISTER_CONTEXTS_RESULT)Enum.valueOf(com/skype/SkyLib$PNM_REGISTER_CONTEXTS_RESULT, s);
        }

        public static PNM_REGISTER_CONTEXTS_RESULT[] values()
        {
            return (PNM_REGISTER_CONTEXTS_RESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            REGISTER_CONTEXTS_SUCCEEDED = new PNM_REGISTER_CONTEXTS_RESULT("REGISTER_CONTEXTS_SUCCEEDED", 0, 0);
            REGISTER_CONTEXTS_FAILED = new PNM_REGISTER_CONTEXTS_RESULT("REGISTER_CONTEXTS_FAILED", 1, 1);
            REGISTER_CONTEXTS_FAILED_REQUEST = new PNM_REGISTER_CONTEXTS_RESULT("REGISTER_CONTEXTS_FAILED_REQUEST", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new PNM_REGISTER_CONTEXTS_RESULT("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new PNM_REGISTER_CONTEXTS_RESULT[] {
                REGISTER_CONTEXTS_SUCCEEDED, REGISTER_CONTEXTS_FAILED, REGISTER_CONTEXTS_FAILED_REQUEST, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PNM_REGISTER_CONTEXTS_RESULT apnm_register_contexts_result[] = values();
            int k = apnm_register_contexts_result.length;
            for (int i = 0; i < k; i++)
            {
                PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result = apnm_register_contexts_result[i];
                intToTypeMap.a(pnm_register_contexts_result.value, pnm_register_contexts_result);
            }

        }

        private PNM_REGISTER_CONTEXTS_RESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class POLICY_DISABLE_VIDEO_OPTIONS extends Enum
    {

        private static final POLICY_DISABLE_VIDEO_OPTIONS $VALUES[];
        public static final POLICY_DISABLE_VIDEO_OPTIONS POLICY_VIDEO_DISABLED;
        public static final POLICY_DISABLE_VIDEO_OPTIONS POLICY_VIDEO_ENABLED;
        public static final POLICY_DISABLE_VIDEO_OPTIONS POLICY_VIDEO_RECEIVE_DISABLED;
        public static final POLICY_DISABLE_VIDEO_OPTIONS POLICY_VIDEO_SEND_DISABLED;
        public static final POLICY_DISABLE_VIDEO_OPTIONS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static POLICY_DISABLE_VIDEO_OPTIONS fromInt(int i)
        {
            POLICY_DISABLE_VIDEO_OPTIONS policy_disable_video_options = (POLICY_DISABLE_VIDEO_OPTIONS)intToTypeMap.a(i);
            if (policy_disable_video_options != null)
            {
                return policy_disable_video_options;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static POLICY_DISABLE_VIDEO_OPTIONS valueOf(String s)
        {
            return (POLICY_DISABLE_VIDEO_OPTIONS)Enum.valueOf(com/skype/SkyLib$POLICY_DISABLE_VIDEO_OPTIONS, s);
        }

        public static POLICY_DISABLE_VIDEO_OPTIONS[] values()
        {
            return (POLICY_DISABLE_VIDEO_OPTIONS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            POLICY_VIDEO_ENABLED = new POLICY_DISABLE_VIDEO_OPTIONS("POLICY_VIDEO_ENABLED", 0, 0);
            POLICY_VIDEO_SEND_DISABLED = new POLICY_DISABLE_VIDEO_OPTIONS("POLICY_VIDEO_SEND_DISABLED", 1, 1);
            POLICY_VIDEO_RECEIVE_DISABLED = new POLICY_DISABLE_VIDEO_OPTIONS("POLICY_VIDEO_RECEIVE_DISABLED", 2, 2);
            POLICY_VIDEO_DISABLED = new POLICY_DISABLE_VIDEO_OPTIONS("POLICY_VIDEO_DISABLED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new POLICY_DISABLE_VIDEO_OPTIONS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new POLICY_DISABLE_VIDEO_OPTIONS[] {
                POLICY_VIDEO_ENABLED, POLICY_VIDEO_SEND_DISABLED, POLICY_VIDEO_RECEIVE_DISABLED, POLICY_VIDEO_DISABLED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            POLICY_DISABLE_VIDEO_OPTIONS apolicy_disable_video_options[] = values();
            int k = apolicy_disable_video_options.length;
            for (int i = 0; i < k; i++)
            {
                POLICY_DISABLE_VIDEO_OPTIONS policy_disable_video_options = apolicy_disable_video_options[i];
                intToTypeMap.a(policy_disable_video_options.value, policy_disable_video_options);
            }

        }

        private POLICY_DISABLE_VIDEO_OPTIONS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PREPARESOUNDRESULT extends Enum
    {

        private static final PREPARESOUNDRESULT $VALUES[];
        public static final PREPARESOUNDRESULT PREPARESOUND_FILE_NOT_FOUND;
        public static final PREPARESOUNDRESULT PREPARESOUND_FILE_READ_ERROR;
        public static final PREPARESOUNDRESULT PREPARESOUND_FILE_TOO_BIG;
        public static final PREPARESOUNDRESULT PREPARESOUND_MISC_ERROR;
        public static final PREPARESOUNDRESULT PREPARESOUND_PLAYBACK_NOT_SUPPORTED;
        public static final PREPARESOUNDRESULT PREPARESOUND_SUCCESS;
        public static final PREPARESOUNDRESULT PREPARESOUND_UNSUPPORTED_FILE_FORMAT;
        public static final PREPARESOUNDRESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PREPARESOUNDRESULT fromInt(int i)
        {
            PREPARESOUNDRESULT preparesoundresult = (PREPARESOUNDRESULT)intToTypeMap.a(i);
            if (preparesoundresult != null)
            {
                return preparesoundresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PREPARESOUNDRESULT valueOf(String s)
        {
            return (PREPARESOUNDRESULT)Enum.valueOf(com/skype/SkyLib$PREPARESOUNDRESULT, s);
        }

        public static PREPARESOUNDRESULT[] values()
        {
            return (PREPARESOUNDRESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            PREPARESOUND_SUCCESS = new PREPARESOUNDRESULT("PREPARESOUND_SUCCESS", 0, 0);
            PREPARESOUND_MISC_ERROR = new PREPARESOUNDRESULT("PREPARESOUND_MISC_ERROR", 1, 1);
            PREPARESOUND_FILE_NOT_FOUND = new PREPARESOUNDRESULT("PREPARESOUND_FILE_NOT_FOUND", 2, 2);
            PREPARESOUND_FILE_TOO_BIG = new PREPARESOUNDRESULT("PREPARESOUND_FILE_TOO_BIG", 3, 3);
            PREPARESOUND_FILE_READ_ERROR = new PREPARESOUNDRESULT("PREPARESOUND_FILE_READ_ERROR", 4, 4);
            PREPARESOUND_UNSUPPORTED_FILE_FORMAT = new PREPARESOUNDRESULT("PREPARESOUND_UNSUPPORTED_FILE_FORMAT", 5, 5);
            PREPARESOUND_PLAYBACK_NOT_SUPPORTED = new PREPARESOUNDRESULT("PREPARESOUND_PLAYBACK_NOT_SUPPORTED", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new PREPARESOUNDRESULT("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new PREPARESOUNDRESULT[] {
                PREPARESOUND_SUCCESS, PREPARESOUND_MISC_ERROR, PREPARESOUND_FILE_NOT_FOUND, PREPARESOUND_FILE_TOO_BIG, PREPARESOUND_FILE_READ_ERROR, PREPARESOUND_UNSUPPORTED_FILE_FORMAT, PREPARESOUND_PLAYBACK_NOT_SUPPORTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PREPARESOUNDRESULT apreparesoundresult[] = values();
            int k = apreparesoundresult.length;
            for (int i = 0; i < k; i++)
            {
                PREPARESOUNDRESULT preparesoundresult = apreparesoundresult[i];
                intToTypeMap.a(preparesoundresult.value, preparesoundresult);
            }

        }

        private PREPARESOUNDRESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class PUSHHANDLINGRESULT extends Enum
    {

        private static final PUSHHANDLINGRESULT $VALUES[];
        public static final PUSHHANDLINGRESULT ABCH_PUSH_HANDLED;
        public static final PUSHHANDLINGRESULT ABCH_PUSH_HANDLING_FAILED;
        public static final PUSHHANDLINGRESULT BAD_NOTIFICATION_EVENT_TYPE;
        public static final PUSHHANDLINGRESULT BAD_NOTIFICATION_PAYLOAD;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_ANSWERED_ELSEWHERE;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_CALL_ALREADY_ENDED;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_CANNOT_CONNECT;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_CONFLICT;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_NO_COMMON_CODEC;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_NO_PERMISSION;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_NO_SIGNALING;
        public static final PUSHHANDLINGRESULT CALL_SETUP_FAILED_PUSH_IGNORED;
        public static final PUSHHANDLINGRESULT CALL_SETUP_PROGRESS;
        public static final PUSHHANDLINGRESULT CALL_SETUP_SUCCEEDED;
        public static final PUSHHANDLINGRESULT CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS;
        public static final PUSHHANDLINGRESULT IM_PUSH_HANDLED;
        public static final PUSHHANDLINGRESULT IM_PUSH_HANDLING_FAILED;
        public static final PUSHHANDLINGRESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static PUSHHANDLINGRESULT fromInt(int i)
        {
            PUSHHANDLINGRESULT pushhandlingresult = (PUSHHANDLINGRESULT)intToTypeMap.a(i);
            if (pushhandlingresult != null)
            {
                return pushhandlingresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static PUSHHANDLINGRESULT valueOf(String s)
        {
            return (PUSHHANDLINGRESULT)Enum.valueOf(com/skype/SkyLib$PUSHHANDLINGRESULT, s);
        }

        public static PUSHHANDLINGRESULT[] values()
        {
            return (PUSHHANDLINGRESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            BAD_NOTIFICATION_PAYLOAD = new PUSHHANDLINGRESULT("BAD_NOTIFICATION_PAYLOAD", 0, 0);
            CALL_SETUP_SUCCEEDED = new PUSHHANDLINGRESULT("CALL_SETUP_SUCCEEDED", 1, 1);
            CALL_SETUP_FAILED = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED", 2, 2);
            IM_PUSH_HANDLED = new PUSHHANDLINGRESULT("IM_PUSH_HANDLED", 3, 3);
            IM_PUSH_HANDLING_FAILED = new PUSHHANDLINGRESULT("IM_PUSH_HANDLING_FAILED", 4, 4);
            BAD_NOTIFICATION_EVENT_TYPE = new PUSHHANDLINGRESULT("BAD_NOTIFICATION_EVENT_TYPE", 5, 5);
            CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS = new PUSHHANDLINGRESULT("CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS", 6, 6);
            CALL_SETUP_FAILED_CANNOT_CONNECT = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_CANNOT_CONNECT", 7, 7);
            CALL_SETUP_FAILED_NO_SIGNALING = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_NO_SIGNALING", 8, 8);
            CALL_SETUP_FAILED_NO_PERMISSION = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_NO_PERMISSION", 9, 9);
            CALL_SETUP_FAILED_NO_COMMON_CODEC = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_NO_COMMON_CODEC", 10, 10);
            CALL_SETUP_FAILED_CONFLICT = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_CONFLICT", 11, 11);
            CALL_SETUP_FAILED_PUSH_IGNORED = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_PUSH_IGNORED", 12, 12);
            CALL_SETUP_FAILED_ANSWERED_ELSEWHERE = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_ANSWERED_ELSEWHERE", 13, 13);
            CALL_SETUP_FAILED_CALL_ALREADY_ENDED = new PUSHHANDLINGRESULT("CALL_SETUP_FAILED_CALL_ALREADY_ENDED", 14, 14);
            ABCH_PUSH_HANDLED = new PUSHHANDLINGRESULT("ABCH_PUSH_HANDLED", 15, 15);
            ABCH_PUSH_HANDLING_FAILED = new PUSHHANDLINGRESULT("ABCH_PUSH_HANDLING_FAILED", 16, 16);
            CALL_SETUP_PROGRESS = new PUSHHANDLINGRESULT("CALL_SETUP_PROGRESS", 17, 17);
            WRAPPER_UNKNOWN_VALUE = new PUSHHANDLINGRESULT("WRAPPER_UNKNOWN_VALUE", 18, 0x7fffffff);
            $VALUES = (new PUSHHANDLINGRESULT[] {
                BAD_NOTIFICATION_PAYLOAD, CALL_SETUP_SUCCEEDED, CALL_SETUP_FAILED, IM_PUSH_HANDLED, IM_PUSH_HANDLING_FAILED, BAD_NOTIFICATION_EVENT_TYPE, CALL_SETUP_SUCCEEDED_CALL_ALREADY_EXISTS, CALL_SETUP_FAILED_CANNOT_CONNECT, CALL_SETUP_FAILED_NO_SIGNALING, CALL_SETUP_FAILED_NO_PERMISSION, 
                CALL_SETUP_FAILED_NO_COMMON_CODEC, CALL_SETUP_FAILED_CONFLICT, CALL_SETUP_FAILED_PUSH_IGNORED, CALL_SETUP_FAILED_ANSWERED_ELSEWHERE, CALL_SETUP_FAILED_CALL_ALREADY_ENDED, ABCH_PUSH_HANDLED, ABCH_PUSH_HANDLING_FAILED, CALL_SETUP_PROGRESS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            PUSHHANDLINGRESULT apushhandlingresult[] = values();
            int k = apushhandlingresult.length;
            for (int i = 0; i < k; i++)
            {
                PUSHHANDLINGRESULT pushhandlingresult = apushhandlingresult[i];
                intToTypeMap.a(pushhandlingresult.value, pushhandlingresult);
            }

        }

        private PUSHHANDLINGRESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class PrepareSoundFromFile_Result
    {

        public PREPARESOUNDRESULT m_return;
        public byte m_sound[];

        public void init(byte abyte0[], PREPARESOUNDRESULT preparesoundresult)
        {
            m_sound = abyte0;
            m_return = preparesoundresult;
        }

        public PrepareSoundFromFile_Result()
        {
        }
    }

    public static class PrepareSound_Result
    {

        public PREPARESOUNDRESULT m_return;
        public byte m_sound[];

        public void init(byte abyte0[], PREPARESOUNDRESULT preparesoundresult)
        {
            m_sound = abyte0;
            m_return = preparesoundresult;
        }

        public PrepareSound_Result()
        {
        }
    }

    public static class PublicAPIRequest_Result
    {

        public String m_response;

        public void init(byte abyte0[])
        {
            m_response = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        }

        public PublicAPIRequest_Result()
        {
        }
    }

    public static final class QUALITYTESTRESULT extends Enum
    {

        private static final QUALITYTESTRESULT $VALUES[];
        public static final QUALITYTESTRESULT QTR_AVERAGE;
        public static final QUALITYTESTRESULT QTR_CRITICAL;
        public static final QUALITYTESTRESULT QTR_EXCELLENT;
        public static final QUALITYTESTRESULT QTR_GOOD;
        public static final QUALITYTESTRESULT QTR_POOR;
        public static final QUALITYTESTRESULT QTR_UNDEFINED;
        public static final QUALITYTESTRESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static QUALITYTESTRESULT fromInt(int i)
        {
            QUALITYTESTRESULT qualitytestresult = (QUALITYTESTRESULT)intToTypeMap.a(i);
            if (qualitytestresult != null)
            {
                return qualitytestresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static QUALITYTESTRESULT valueOf(String s)
        {
            return (QUALITYTESTRESULT)Enum.valueOf(com/skype/SkyLib$QUALITYTESTRESULT, s);
        }

        public static QUALITYTESTRESULT[] values()
        {
            return (QUALITYTESTRESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            QTR_UNDEFINED = new QUALITYTESTRESULT("QTR_UNDEFINED", 0, 0);
            QTR_CRITICAL = new QUALITYTESTRESULT("QTR_CRITICAL", 1, 1);
            QTR_POOR = new QUALITYTESTRESULT("QTR_POOR", 2, 2);
            QTR_AVERAGE = new QUALITYTESTRESULT("QTR_AVERAGE", 3, 3);
            QTR_GOOD = new QUALITYTESTRESULT("QTR_GOOD", 4, 4);
            QTR_EXCELLENT = new QUALITYTESTRESULT("QTR_EXCELLENT", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new QUALITYTESTRESULT("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new QUALITYTESTRESULT[] {
                QTR_UNDEFINED, QTR_CRITICAL, QTR_POOR, QTR_AVERAGE, QTR_GOOD, QTR_EXCELLENT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            QUALITYTESTRESULT aqualitytestresult[] = values();
            int k = aqualitytestresult.length;
            for (int i = 0; i < k; i++)
            {
                QUALITYTESTRESULT qualitytestresult = aqualitytestresult[i];
                intToTypeMap.a(qualitytestresult.value, qualitytestresult);
            }

        }

        private QUALITYTESTRESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class QUALITYTESTTYPE extends Enum
    {

        private static final QUALITYTESTTYPE $VALUES[];
        public static final QUALITYTESTTYPE QTT_AUDIO_IN;
        public static final QUALITYTESTTYPE QTT_AUDIO_OUT;
        public static final QUALITYTESTTYPE QTT_CPU;
        public static final QUALITYTESTTYPE QTT_NETWORK;
        public static final QUALITYTESTTYPE QTT_VIDEO_IN;
        public static final QUALITYTESTTYPE QTT_VIDEO_OUT;
        public static final QUALITYTESTTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static QUALITYTESTTYPE fromInt(int i)
        {
            QUALITYTESTTYPE qualitytesttype = (QUALITYTESTTYPE)intToTypeMap.a(i);
            if (qualitytesttype != null)
            {
                return qualitytesttype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static QUALITYTESTTYPE valueOf(String s)
        {
            return (QUALITYTESTTYPE)Enum.valueOf(com/skype/SkyLib$QUALITYTESTTYPE, s);
        }

        public static QUALITYTESTTYPE[] values()
        {
            return (QUALITYTESTTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            QTT_AUDIO_IN = new QUALITYTESTTYPE("QTT_AUDIO_IN", 0, 0);
            QTT_AUDIO_OUT = new QUALITYTESTTYPE("QTT_AUDIO_OUT", 1, 1);
            QTT_VIDEO_OUT = new QUALITYTESTTYPE("QTT_VIDEO_OUT", 2, 2);
            QTT_CPU = new QUALITYTESTTYPE("QTT_CPU", 3, 3);
            QTT_NETWORK = new QUALITYTESTTYPE("QTT_NETWORK", 4, 4);
            QTT_VIDEO_IN = new QUALITYTESTTYPE("QTT_VIDEO_IN", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new QUALITYTESTTYPE("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new QUALITYTESTTYPE[] {
                QTT_AUDIO_IN, QTT_AUDIO_OUT, QTT_VIDEO_OUT, QTT_CPU, QTT_NETWORK, QTT_VIDEO_IN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            QUALITYTESTTYPE aqualitytesttype[] = values();
            int k = aqualitytesttype.length;
            for (int i = 0; i < k; i++)
            {
                QUALITYTESTTYPE qualitytesttype = aqualitytesttype[i];
                intToTypeMap.a(qualitytesttype.value, qualitytesttype);
            }

        }

        private QUALITYTESTTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class QueryContentListing_Result
    {

        public int m_requestID;
        public CONTENT_LIST_RESULT m_return;

        public void init(int i, CONTENT_LIST_RESULT content_list_result)
        {
            m_requestID = i;
            m_return = content_list_result;
        }

        public QueryContentListing_Result()
        {
        }
    }

    public static final class SA_PAYMENT_CARDTYPE extends Enum
    {

        private static final SA_PAYMENT_CARDTYPE $VALUES[];
        public static final SA_PAYMENT_CARDTYPE SA_PAYMENT_CARDTYPE_AMEX;
        public static final SA_PAYMENT_CARDTYPE SA_PAYMENT_CARDTYPE_MC;
        public static final SA_PAYMENT_CARDTYPE SA_PAYMENT_CARDTYPE_UNKNOWN;
        public static final SA_PAYMENT_CARDTYPE SA_PAYMENT_CARDTYPE_VISA;
        public static final SA_PAYMENT_CARDTYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SA_PAYMENT_CARDTYPE fromInt(int i)
        {
            SA_PAYMENT_CARDTYPE sa_payment_cardtype = (SA_PAYMENT_CARDTYPE)intToTypeMap.a(i);
            if (sa_payment_cardtype != null)
            {
                return sa_payment_cardtype;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SA_PAYMENT_CARDTYPE valueOf(String s)
        {
            return (SA_PAYMENT_CARDTYPE)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_CARDTYPE, s);
        }

        public static SA_PAYMENT_CARDTYPE[] values()
        {
            return (SA_PAYMENT_CARDTYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_PAYMENT_CARDTYPE_UNKNOWN = new SA_PAYMENT_CARDTYPE("SA_PAYMENT_CARDTYPE_UNKNOWN", 0, 0);
            SA_PAYMENT_CARDTYPE_VISA = new SA_PAYMENT_CARDTYPE("SA_PAYMENT_CARDTYPE_VISA", 1, 1);
            SA_PAYMENT_CARDTYPE_MC = new SA_PAYMENT_CARDTYPE("SA_PAYMENT_CARDTYPE_MC", 2, 2);
            SA_PAYMENT_CARDTYPE_AMEX = new SA_PAYMENT_CARDTYPE("SA_PAYMENT_CARDTYPE_AMEX", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new SA_PAYMENT_CARDTYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SA_PAYMENT_CARDTYPE[] {
                SA_PAYMENT_CARDTYPE_UNKNOWN, SA_PAYMENT_CARDTYPE_VISA, SA_PAYMENT_CARDTYPE_MC, SA_PAYMENT_CARDTYPE_AMEX, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SA_PAYMENT_CARDTYPE asa_payment_cardtype[] = values();
            int k = asa_payment_cardtype.length;
            for (int i = 0; i < k; i++)
            {
                SA_PAYMENT_CARDTYPE sa_payment_cardtype = asa_payment_cardtype[i];
                intToTypeMap.a(sa_payment_cardtype.value, sa_payment_cardtype);
            }

        }

        private SA_PAYMENT_CARDTYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SA_PAYMENT_IID extends Enum
    {

        private static final SA_PAYMENT_IID $VALUES[];
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_AMOUNT_NUM;
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_ATU;
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_CARDTYPE;
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_EXPDATE_MON;
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_EXPDATE_YEAR;
        public static final SA_PAYMENT_IID SA_PAYMENT_IID_PRODUCT;
        public static final SA_PAYMENT_IID WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SA_PAYMENT_IID fromInt(int i)
        {
            SA_PAYMENT_IID sa_payment_iid = (SA_PAYMENT_IID)intToTypeMap.a(i);
            if (sa_payment_iid != null)
            {
                return sa_payment_iid;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SA_PAYMENT_IID valueOf(String s)
        {
            return (SA_PAYMENT_IID)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_IID, s);
        }

        public static SA_PAYMENT_IID[] values()
        {
            return (SA_PAYMENT_IID[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_PAYMENT_IID_AMOUNT_NUM = new SA_PAYMENT_IID("SA_PAYMENT_IID_AMOUNT_NUM", 0, 0);
            SA_PAYMENT_IID_PRODUCT = new SA_PAYMENT_IID("SA_PAYMENT_IID_PRODUCT", 1, 1);
            SA_PAYMENT_IID_CARDTYPE = new SA_PAYMENT_IID("SA_PAYMENT_IID_CARDTYPE", 2, 2);
            SA_PAYMENT_IID_EXPDATE_MON = new SA_PAYMENT_IID("SA_PAYMENT_IID_EXPDATE_MON", 3, 3);
            SA_PAYMENT_IID_EXPDATE_YEAR = new SA_PAYMENT_IID("SA_PAYMENT_IID_EXPDATE_YEAR", 4, 4);
            SA_PAYMENT_IID_ATU = new SA_PAYMENT_IID("SA_PAYMENT_IID_ATU", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new SA_PAYMENT_IID("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new SA_PAYMENT_IID[] {
                SA_PAYMENT_IID_AMOUNT_NUM, SA_PAYMENT_IID_PRODUCT, SA_PAYMENT_IID_CARDTYPE, SA_PAYMENT_IID_EXPDATE_MON, SA_PAYMENT_IID_EXPDATE_YEAR, SA_PAYMENT_IID_ATU, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SA_PAYMENT_IID asa_payment_iid[] = values();
            int k = asa_payment_iid.length;
            for (int i = 0; i < k; i++)
            {
                SA_PAYMENT_IID sa_payment_iid = asa_payment_iid[i];
                intToTypeMap.a(sa_payment_iid.value, sa_payment_iid);
            }

        }

        private SA_PAYMENT_IID(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SA_PAYMENT_PRODUCT extends Enum
    {

        private static final SA_PAYMENT_PRODUCT $VALUES[];
        public static final SA_PAYMENT_PRODUCT SA_PAYMENT_PRODUCT_SKYPE_CREDIT;
        public static final SA_PAYMENT_PRODUCT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SA_PAYMENT_PRODUCT fromInt(int i)
        {
            SA_PAYMENT_PRODUCT sa_payment_product = (SA_PAYMENT_PRODUCT)intToTypeMap.a(i);
            if (sa_payment_product != null)
            {
                return sa_payment_product;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SA_PAYMENT_PRODUCT valueOf(String s)
        {
            return (SA_PAYMENT_PRODUCT)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_PRODUCT, s);
        }

        public static SA_PAYMENT_PRODUCT[] values()
        {
            return (SA_PAYMENT_PRODUCT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_PAYMENT_PRODUCT_SKYPE_CREDIT = new SA_PAYMENT_PRODUCT("SA_PAYMENT_PRODUCT_SKYPE_CREDIT", 0, 0);
            WRAPPER_UNKNOWN_VALUE = new SA_PAYMENT_PRODUCT("WRAPPER_UNKNOWN_VALUE", 1, 0x7fffffff);
            $VALUES = (new SA_PAYMENT_PRODUCT[] {
                SA_PAYMENT_PRODUCT_SKYPE_CREDIT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SA_PAYMENT_PRODUCT asa_payment_product[] = values();
            int k = asa_payment_product.length;
            for (int i = 0; i < k; i++)
            {
                SA_PAYMENT_PRODUCT sa_payment_product = asa_payment_product[i];
                intToTypeMap.a(sa_payment_product.value, sa_payment_product);
            }

        }

        private SA_PAYMENT_PRODUCT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SA_PAYMENT_SID extends Enum
    {

        private static final SA_PAYMENT_SID $VALUES[];
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_AMOUNT_STR;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_CARDHOLDER;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_CARD_NO;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_CARD_VAL_NO;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_COUNTRY;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_CURRENCY;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_ORDER_ID;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_SKYPENAME;
        public static final SA_PAYMENT_SID SA_PAYMENT_SID_SKYPERPWD;
        public static final SA_PAYMENT_SID WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SA_PAYMENT_SID fromInt(int i)
        {
            SA_PAYMENT_SID sa_payment_sid = (SA_PAYMENT_SID)intToTypeMap.a(i);
            if (sa_payment_sid != null)
            {
                return sa_payment_sid;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SA_PAYMENT_SID valueOf(String s)
        {
            return (SA_PAYMENT_SID)Enum.valueOf(com/skype/SkyLib$SA_PAYMENT_SID, s);
        }

        public static SA_PAYMENT_SID[] values()
        {
            return (SA_PAYMENT_SID[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SA_PAYMENT_SID_SKYPENAME = new SA_PAYMENT_SID("SA_PAYMENT_SID_SKYPENAME", 0, 0);
            SA_PAYMENT_SID_SKYPERPWD = new SA_PAYMENT_SID("SA_PAYMENT_SID_SKYPERPWD", 1, 1);
            SA_PAYMENT_SID_CARDHOLDER = new SA_PAYMENT_SID("SA_PAYMENT_SID_CARDHOLDER", 2, 2);
            SA_PAYMENT_SID_CARD_NO = new SA_PAYMENT_SID("SA_PAYMENT_SID_CARD_NO", 3, 3);
            SA_PAYMENT_SID_CARD_VAL_NO = new SA_PAYMENT_SID("SA_PAYMENT_SID_CARD_VAL_NO", 4, 4);
            SA_PAYMENT_SID_AMOUNT_STR = new SA_PAYMENT_SID("SA_PAYMENT_SID_AMOUNT_STR", 5, 5);
            SA_PAYMENT_SID_CURRENCY = new SA_PAYMENT_SID("SA_PAYMENT_SID_CURRENCY", 6, 6);
            SA_PAYMENT_SID_COUNTRY = new SA_PAYMENT_SID("SA_PAYMENT_SID_COUNTRY", 7, 7);
            SA_PAYMENT_SID_ORDER_ID = new SA_PAYMENT_SID("SA_PAYMENT_SID_ORDER_ID", 8, 8);
            WRAPPER_UNKNOWN_VALUE = new SA_PAYMENT_SID("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new SA_PAYMENT_SID[] {
                SA_PAYMENT_SID_SKYPENAME, SA_PAYMENT_SID_SKYPERPWD, SA_PAYMENT_SID_CARDHOLDER, SA_PAYMENT_SID_CARD_NO, SA_PAYMENT_SID_CARD_VAL_NO, SA_PAYMENT_SID_AMOUNT_STR, SA_PAYMENT_SID_CURRENCY, SA_PAYMENT_SID_COUNTRY, SA_PAYMENT_SID_ORDER_ID, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SA_PAYMENT_SID asa_payment_sid[] = values();
            int k = asa_payment_sid.length;
            for (int i = 0; i < k; i++)
            {
                SA_PAYMENT_SID sa_payment_sid = asa_payment_sid[i];
                intToTypeMap.a(sa_payment_sid.value, sa_payment_sid);
            }

        }

        private SA_PAYMENT_SID(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SEND_STATUS extends Enum
    {

        private static final SEND_STATUS $VALUES[];
        public static final SEND_STATUS MSNP_SENDING;
        public static final SEND_STATUS MSNP_SEND_IDLE;
        public static final SEND_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SEND_STATUS fromInt(int i)
        {
            SEND_STATUS send_status = (SEND_STATUS)intToTypeMap.a(i);
            if (send_status != null)
            {
                return send_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SEND_STATUS valueOf(String s)
        {
            return (SEND_STATUS)Enum.valueOf(com/skype/SkyLib$SEND_STATUS, s);
        }

        public static SEND_STATUS[] values()
        {
            return (SEND_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MSNP_SEND_IDLE = new SEND_STATUS("MSNP_SEND_IDLE", 0, 1);
            MSNP_SENDING = new SEND_STATUS("MSNP_SENDING", 1, 2);
            WRAPPER_UNKNOWN_VALUE = new SEND_STATUS("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new SEND_STATUS[] {
                MSNP_SEND_IDLE, MSNP_SENDING, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SEND_STATUS asend_status[] = values();
            int k = asend_status.length;
            for (int i = 0; i < k; i++)
            {
                SEND_STATUS send_status = asend_status[i];
                intToTypeMap.a(send_status.value, send_status);
            }

        }

        private SEND_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SERVICE_TYPE extends Enum
    {

        private static final SERVICE_TYPE $VALUES[];
        public static final SERVICE_TYPE ADM;
        public static final SERVICE_TYPE APPLE_APN;
        public static final SERVICE_TYPE GOOGLE_AC2DM;
        public static final SERVICE_TYPE GOOGLE_AGCM;
        public static final SERVICE_TYPE GRIFFIN;
        public static final SERVICE_TYPE HOTMAIL;
        public static final SERVICE_TYPE MICROSOFT_WNS;
        public static final SERVICE_TYPE MICROSOFT_WP7NS;
        public static final SERVICE_TYPE NNA;
        public static final SERVICE_TYPE TESTING;
        public static final SERVICE_TYPE TROUTER;
        public static final SERVICE_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SERVICE_TYPE fromInt(int i)
        {
            SERVICE_TYPE service_type = (SERVICE_TYPE)intToTypeMap.a(i);
            if (service_type != null)
            {
                return service_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SERVICE_TYPE valueOf(String s)
        {
            return (SERVICE_TYPE)Enum.valueOf(com/skype/SkyLib$SERVICE_TYPE, s);
        }

        public static SERVICE_TYPE[] values()
        {
            return (SERVICE_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TESTING = new SERVICE_TYPE("TESTING", 0, 0);
            MICROSOFT_WNS = new SERVICE_TYPE("MICROSOFT_WNS", 1, 1);
            MICROSOFT_WP7NS = new SERVICE_TYPE("MICROSOFT_WP7NS", 2, 2);
            APPLE_APN = new SERVICE_TYPE("APPLE_APN", 3, 3);
            GOOGLE_AGCM = new SERVICE_TYPE("GOOGLE_AGCM", 4, 4);
            HOTMAIL = new SERVICE_TYPE("HOTMAIL", 5, 5);
            GOOGLE_AC2DM = new SERVICE_TYPE("GOOGLE_AC2DM", 6, 6);
            TROUTER = new SERVICE_TYPE("TROUTER", 7, 7);
            GRIFFIN = new SERVICE_TYPE("GRIFFIN", 8, 8);
            ADM = new SERVICE_TYPE("ADM", 9, 9);
            NNA = new SERVICE_TYPE("NNA", 10, 10);
            WRAPPER_UNKNOWN_VALUE = new SERVICE_TYPE("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
            $VALUES = (new SERVICE_TYPE[] {
                TESTING, MICROSOFT_WNS, MICROSOFT_WP7NS, APPLE_APN, GOOGLE_AGCM, HOTMAIL, GOOGLE_AC2DM, TROUTER, GRIFFIN, ADM, 
                NNA, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SERVICE_TYPE aservice_type[] = values();
            int k = aservice_type.length;
            for (int i = 0; i < k; i++)
            {
                SERVICE_TYPE service_type = aservice_type[i];
                intToTypeMap.a(service_type.value, service_type);
            }

        }

        private SERVICE_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SKYPEMANAGER_MEMBER_STATUSES extends Enum
    {

        private static final SKYPEMANAGER_MEMBER_STATUSES $VALUES[];
        public static final SKYPEMANAGER_MEMBER_STATUSES SM_ADMIN;
        public static final SKYPEMANAGER_MEMBER_STATUSES SM_MANAGED;
        public static final SKYPEMANAGER_MEMBER_STATUSES SM_MEMBER;
        public static final SKYPEMANAGER_MEMBER_STATUSES SM_NONE;
        public static final SKYPEMANAGER_MEMBER_STATUSES WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SKYPEMANAGER_MEMBER_STATUSES fromInt(int i)
        {
            SKYPEMANAGER_MEMBER_STATUSES skypemanager_member_statuses = (SKYPEMANAGER_MEMBER_STATUSES)intToTypeMap.a(i);
            if (skypemanager_member_statuses != null)
            {
                return skypemanager_member_statuses;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SKYPEMANAGER_MEMBER_STATUSES valueOf(String s)
        {
            return (SKYPEMANAGER_MEMBER_STATUSES)Enum.valueOf(com/skype/SkyLib$SKYPEMANAGER_MEMBER_STATUSES, s);
        }

        public static SKYPEMANAGER_MEMBER_STATUSES[] values()
        {
            return (SKYPEMANAGER_MEMBER_STATUSES[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SM_NONE = new SKYPEMANAGER_MEMBER_STATUSES("SM_NONE", 0, 0);
            SM_MEMBER = new SKYPEMANAGER_MEMBER_STATUSES("SM_MEMBER", 1, 1);
            SM_MANAGED = new SKYPEMANAGER_MEMBER_STATUSES("SM_MANAGED", 2, 2);
            SM_ADMIN = new SKYPEMANAGER_MEMBER_STATUSES("SM_ADMIN", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new SKYPEMANAGER_MEMBER_STATUSES("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new SKYPEMANAGER_MEMBER_STATUSES[] {
                SM_NONE, SM_MEMBER, SM_MANAGED, SM_ADMIN, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SKYPEMANAGER_MEMBER_STATUSES askypemanager_member_statuses[] = values();
            int k = askypemanager_member_statuses.length;
            for (int i = 0; i < k; i++)
            {
                SKYPEMANAGER_MEMBER_STATUSES skypemanager_member_statuses = askypemanager_member_statuses[i];
                intToTypeMap.a(skypemanager_member_statuses.value, skypemanager_member_statuses);
            }

        }

        private SKYPEMANAGER_MEMBER_STATUSES(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SYNC_STATUS extends Enum
    {

        private static final SYNC_STATUS $VALUES[];
        public static final SYNC_STATUS MSNP_NEED_TO_SYNC;
        public static final SYNC_STATUS MSNP_SYNCING;
        public static final SYNC_STATUS MSNP_SYNC_IDLE;
        public static final SYNC_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SYNC_STATUS fromInt(int i)
        {
            SYNC_STATUS sync_status = (SYNC_STATUS)intToTypeMap.a(i);
            if (sync_status != null)
            {
                return sync_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SYNC_STATUS valueOf(String s)
        {
            return (SYNC_STATUS)Enum.valueOf(com/skype/SkyLib$SYNC_STATUS, s);
        }

        public static SYNC_STATUS[] values()
        {
            return (SYNC_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MSNP_NEED_TO_SYNC = new SYNC_STATUS("MSNP_NEED_TO_SYNC", 0, 1);
            MSNP_SYNCING = new SYNC_STATUS("MSNP_SYNCING", 1, 2);
            MSNP_SYNC_IDLE = new SYNC_STATUS("MSNP_SYNC_IDLE", 2, 3);
            WRAPPER_UNKNOWN_VALUE = new SYNC_STATUS("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new SYNC_STATUS[] {
                MSNP_NEED_TO_SYNC, MSNP_SYNCING, MSNP_SYNC_IDLE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SYNC_STATUS async_status[] = values();
            int k = async_status.length;
            for (int i = 0; i < k; i++)
            {
                SYNC_STATUS sync_status = async_status[i];
                intToTypeMap.a(sync_status.value, sync_status);
            }

        }

        private SYNC_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface SkyLibIListener
    {

        public abstract void onAccessConnected(SkyLib skylib);

        public abstract void onAccessConnectionFailure(SkyLib skylib, AccessSession.FAILUREREASON failurereason);

        public abstract void onAccessDetectFailure(SkyLib skylib);

        public abstract void onAccessDetecting(SkyLib skylib, AccessSession.HOTSPOTTYPE hotspottype);

        public abstract void onAccessDisconnected(SkyLib skylib);

        public abstract void onAccessEvent(SkyLib skylib, ACCESSEVENTTYPE accesseventtype, int i);

        public abstract void onAccountAvatarResult(SkyLib skylib, AUTH_RESULT auth_result, String s, byte abyte0[]);

        public abstract void onAccountPartnerLinkResult(SkyLib skylib, AUTH_RESULT auth_result, String s);

        public abstract void onApp2AppDatagram(SkyLib skylib, String s, String s1, byte abyte0[]);

        public abstract void onApp2AppStreamListChange(SkyLib skylib, String s, APP2APP_STREAMS app2app_streams, String as[], int ai[]);

        public abstract void onAuthTokenRequest(SkyLib skylib, long l, String as[]);

        public abstract void onAuthTokenResult(SkyLib skylib, boolean flag, int i, String s);

        public abstract void onAuthTokenResultWithTimeout(SkyLib skylib, boolean flag, int i, String s, int j, int k);

        public abstract void onAvailableDeviceListChange(SkyLib skylib);

        public abstract void onAvailableVideoDeviceListChange(SkyLib skylib);

        public abstract void onCallerIDOptionsChange(SkyLib skylib, int i, CALLERID_OPTIONS_CHANGE callerid_options_change);

        public abstract void onChatServiceConnectivity(SkyLib skylib);

        public abstract void onCheckUpgradeResult(SkyLib skylib, boolean flag, UPGRADERESULT upgraderesult);

        public abstract void onContactGoneOffline(SkyLib skylib, int i);

        public abstract void onContactGroupMembershipChanged(SkyLib skylib, int i, int j, boolean flag);

        public abstract void onContactOnlineAppearance(SkyLib skylib, int i);

        public abstract void onContentItemChange(SkyLib skylib, int i);

        public abstract void onContentListingResult(SkyLib skylib, int i, CONTENT_LIST_RESULT content_list_result, byte abyte0[], int j);

        public abstract void onConversationListChange(SkyLib skylib, int i, Conversation.LIST_TYPE list_type, boolean flag);

        public abstract void onCustomAPINotification(SkyLib skylib, int i);

        public abstract void onEcsEvent(SkyLib skylib, ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type);

        public abstract void onEmoticonListUpdated(SkyLib skylib);

        public abstract void onExternalLoginRequest(SkyLib skylib, byte abyte0[]);

        public abstract void onFileTransferInitiated(SkyLib skylib, int i, int j, int k);

        public abstract void onH264Activated(SkyLib skylib);

        public abstract void onHistorySyncFinished(SkyLib skylib);

        public abstract void onHttpResponse(SkyLib skylib, int i, WEBGW_RESULT webgw_result, int j, byte abyte0[], int k);

        public abstract void onHttpStreamResponse(SkyLib skylib, int i, byte abyte0[], int j);

        public abstract void onIncomingAlert(SkyLib skylib, int i);

        public abstract void onIncomingPriceQuote(SkyLib skylib, int i);

        public abstract void onInitialEasSyncDone(SkyLib skylib, CONTACT_SYNC_TYPE contact_sync_type);

        public abstract void onMessage(SkyLib skylib, int i, boolean flag, int j, int k, boolean flag1);

        public abstract void onMessageAnnotation(SkyLib skylib, int i);

        public abstract void onNewCustomContactGroup(SkyLib skylib, int i);

        public abstract void onNrgLevelsChange(SkyLib skylib);

        public abstract void onObjectDelete(SkyLib skylib, OBJECTTYPE objecttype, int i);

        public abstract void onObjectPropertyChangeWithValue(SkyLib skylib, int i, PROPKEY propkey, Metatag metatag);

        public abstract void onOperationModeChanged(SkyLib skylib, int i);

        public abstract void onParticipantListChange(SkyLib skylib, int i);

        public abstract void onPartnerLinkInfoResult(SkyLib skylib, AUTH_RESULT auth_result, String s, String s1, String s2, String s3);

        public abstract void onPartnerQueryResult(SkyLib skylib, int i, PARTNER_QUERY_ERROR partner_query_error, String s);

        public abstract void onPendingMediaDocumentsListChanged(SkyLib skylib);

        public abstract void onPromotedSCDContactsFound(SkyLib skylib, int i, int ai[]);

        public abstract void onPublicAPINotification(SkyLib skylib, int i, String s);

        public abstract void onPushHandlingComplete(SkyLib skylib, int i, PUSHHANDLINGRESULT pushhandlingresult);

        public abstract void onQualityTestResult(SkyLib skylib, QUALITYTESTTYPE qualitytesttype, QUALITYTESTRESULT qualitytestresult, String s, String s1, String s2);

        public abstract void onRegisterContextsComplete(SkyLib skylib, PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result, int i);

        public abstract void onSeamlessCapableResult(SkyLib skylib, String s, boolean flag);

        public abstract void onSearchMessagesResult(SkyLib skylib, int i, int ai[], String as[]);

        public abstract void onServerTimeAvailable(SkyLib skylib);

        public abstract void onStatsReported(SkyLib skylib, int i, byte abyte0[]);

        public abstract void onSuggestedAccountsResult(SkyLib skylib, AUTH_RESULT auth_result, String as[], String as1[], String as2[]);

        public abstract void onTrackedObjectChanged(SkyLib skylib, int i, OBJECTTYPE objecttype, OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type, int j, int k);

        public abstract void onTrouterCheckConnectionComplete(SkyLib skylib, boolean flag);

        public abstract void onTrouterConnectionStateChanged(SkyLib skylib, TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type);

        public abstract void onTrouterSuspendComplete(SkyLib skylib);

        public abstract void onTrouterSuspendReady(SkyLib skylib);

        public abstract void onUnifiedMastersChanged(SkyLib skylib, int i);

        public abstract void onUnifiedServantsChanged(SkyLib skylib, int i);

        public abstract void onVideoMessagingEntitlementChanged(SkyLib skylib, boolean flag, String s, String as[], int ai[]);
    }

    public static final class TRANSFER_SENDFILE_ERROR extends Enum
    {

        private static final TRANSFER_SENDFILE_ERROR $VALUES[];
        public static final TRANSFER_SENDFILE_ERROR TRANSFER_BAD_FILENAME;
        public static final TRANSFER_SENDFILE_ERROR TRANSFER_OPEN_FAILED;
        public static final TRANSFER_SENDFILE_ERROR TRANSFER_OPEN_SUCCESS;
        public static final TRANSFER_SENDFILE_ERROR TRANSFER_TOO_MANY_PARALLEL;
        public static final TRANSFER_SENDFILE_ERROR WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TRANSFER_SENDFILE_ERROR fromInt(int i)
        {
            TRANSFER_SENDFILE_ERROR transfer_sendfile_error = (TRANSFER_SENDFILE_ERROR)intToTypeMap.a(i);
            if (transfer_sendfile_error != null)
            {
                return transfer_sendfile_error;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TRANSFER_SENDFILE_ERROR valueOf(String s)
        {
            return (TRANSFER_SENDFILE_ERROR)Enum.valueOf(com/skype/SkyLib$TRANSFER_SENDFILE_ERROR, s);
        }

        public static TRANSFER_SENDFILE_ERROR[] values()
        {
            return (TRANSFER_SENDFILE_ERROR[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TRANSFER_OPEN_SUCCESS = new TRANSFER_SENDFILE_ERROR("TRANSFER_OPEN_SUCCESS", 0, 0);
            TRANSFER_BAD_FILENAME = new TRANSFER_SENDFILE_ERROR("TRANSFER_BAD_FILENAME", 1, 1);
            TRANSFER_OPEN_FAILED = new TRANSFER_SENDFILE_ERROR("TRANSFER_OPEN_FAILED", 2, 2);
            TRANSFER_TOO_MANY_PARALLEL = new TRANSFER_SENDFILE_ERROR("TRANSFER_TOO_MANY_PARALLEL", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new TRANSFER_SENDFILE_ERROR("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new TRANSFER_SENDFILE_ERROR[] {
                TRANSFER_OPEN_SUCCESS, TRANSFER_BAD_FILENAME, TRANSFER_OPEN_FAILED, TRANSFER_TOO_MANY_PARALLEL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TRANSFER_SENDFILE_ERROR atransfer_sendfile_error[] = values();
            int k = atransfer_sendfile_error.length;
            for (int i = 0; i < k; i++)
            {
                TRANSFER_SENDFILE_ERROR transfer_sendfile_error = atransfer_sendfile_error[i];
                intToTypeMap.a(transfer_sendfile_error.value, transfer_sendfile_error);
            }

        }

        private TRANSFER_SENDFILE_ERROR(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE extends Enum
    {

        private static final TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE $VALUES[];
        public static final TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE TROUTER_CONNECTED;
        public static final TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE TROUTER_CONNECT_FAILED;
        public static final TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE TROUTER_DISCONNECTED;
        public static final TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE fromInt(int i)
        {
            TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type = (TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE)intToTypeMap.a(i);
            if (trouter_connection_state_callback_event_type != null)
            {
                return trouter_connection_state_callback_event_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE valueOf(String s)
        {
            return (TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE)Enum.valueOf(com/skype/SkyLib$TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE, s);
        }

        public static TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE[] values()
        {
            return (TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TROUTER_CONNECTED = new TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE("TROUTER_CONNECTED", 0, 0);
            TROUTER_DISCONNECTED = new TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE("TROUTER_DISCONNECTED", 1, 1);
            TROUTER_CONNECT_FAILED = new TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE("TROUTER_CONNECT_FAILED", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE[] {
                TROUTER_CONNECTED, TROUTER_DISCONNECTED, TROUTER_CONNECT_FAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE atrouter_connection_state_callback_event_type[] = values();
            int k = atrouter_connection_state_callback_event_type.length;
            for (int i = 0; i < k; i++)
            {
                TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type = atrouter_connection_state_callback_event_type[i];
                intToTypeMap.a(trouter_connection_state_callback_event_type.value, trouter_connection_state_callback_event_type);
            }

        }

        private TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UIPROP extends Enum
    {

        private static final UIPROP $VALUES[];
        public static final UIPROP UIPROP_CALL_QUALITY_FEEDBACK_EXPECTED_WITH_NEXT_CALL;
        public static final UIPROP UIPROP_EXPRESSIVECONTENT_ITEMS;
        public static final UIPROP UIPROP_IC_LAST_YIELD;
        public static final UIPROP UIPROP_IC_RUN_COMPLETED_COUNT;
        public static final UIPROP UIPROP_IC_RUN_STARTUP_COUNT;
        public static final UIPROP UIPROP_IC_TOTAL_YIELD;
        public static final UIPROP UIPROP_IS_MOBILE_DEVICE;
        public static final UIPROP UIPROP_LANGUAGE;
        public static final UIPROP UIPROP_LAST_CALL_ORIGIN;
        public static final UIPROP UIPROP_MENUITEM_USED_IN_LAST_MINUTE;
        public static final UIPROP UIPROP_NOTIFICATIONS_LANGUAGE;
        public static final UIPROP UIPROP_POLICY_LISTEN_HTTP_PORTS;
        public static final UIPROP UIPROP_POLICY_LISTEN_PORT;
        public static final UIPROP UIPROP_POLICY_LISTEN_RANGE_BEGIN;
        public static final UIPROP UIPROP_POLICY_LISTEN_RANGE_END;
        public static final UIPROP UIPROP_POLICY_PROXY_ADDRESS;
        public static final UIPROP UIPROP_POLICY_PROXY_SETTING;
        public static final UIPROP UIPROP_POLICY_PROXY_USERNAME;
        public static final UIPROP UIPROP_SELECTED_CONTACT_IDENTITY;
        public static final UIPROP UIPROP_TOOLBARITEM_USED_IN_LAST_MINUTE;
        public static final UIPROP WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UIPROP fromInt(int i)
        {
            UIPROP uiprop = (UIPROP)intToTypeMap.a(i);
            if (uiprop != null)
            {
                return uiprop;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UIPROP valueOf(String s)
        {
            return (UIPROP)Enum.valueOf(com/skype/SkyLib$UIPROP, s);
        }

        public static UIPROP[] values()
        {
            return (UIPROP[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UIPROP_LANGUAGE = new UIPROP("UIPROP_LANGUAGE", 0, 0);
            UIPROP_IC_RUN_STARTUP_COUNT = new UIPROP("UIPROP_IC_RUN_STARTUP_COUNT", 1, 1);
            UIPROP_IC_RUN_COMPLETED_COUNT = new UIPROP("UIPROP_IC_RUN_COMPLETED_COUNT", 2, 2);
            UIPROP_IC_TOTAL_YIELD = new UIPROP("UIPROP_IC_TOTAL_YIELD", 3, 3);
            UIPROP_IC_LAST_YIELD = new UIPROP("UIPROP_IC_LAST_YIELD", 4, 4);
            UIPROP_MENUITEM_USED_IN_LAST_MINUTE = new UIPROP("UIPROP_MENUITEM_USED_IN_LAST_MINUTE", 5, 5);
            UIPROP_TOOLBARITEM_USED_IN_LAST_MINUTE = new UIPROP("UIPROP_TOOLBARITEM_USED_IN_LAST_MINUTE", 6, 6);
            UIPROP_LAST_CALL_ORIGIN = new UIPROP("UIPROP_LAST_CALL_ORIGIN", 7, 7);
            UIPROP_EXPRESSIVECONTENT_ITEMS = new UIPROP("UIPROP_EXPRESSIVECONTENT_ITEMS", 8, 8);
            UIPROP_POLICY_LISTEN_PORT = new UIPROP("UIPROP_POLICY_LISTEN_PORT", 9, 9);
            UIPROP_POLICY_LISTEN_HTTP_PORTS = new UIPROP("UIPROP_POLICY_LISTEN_HTTP_PORTS", 10, 10);
            UIPROP_POLICY_PROXY_SETTING = new UIPROP("UIPROP_POLICY_PROXY_SETTING", 11, 11);
            UIPROP_POLICY_PROXY_ADDRESS = new UIPROP("UIPROP_POLICY_PROXY_ADDRESS", 12, 12);
            UIPROP_POLICY_PROXY_USERNAME = new UIPROP("UIPROP_POLICY_PROXY_USERNAME", 13, 13);
            UIPROP_SELECTED_CONTACT_IDENTITY = new UIPROP("UIPROP_SELECTED_CONTACT_IDENTITY", 14, 14);
            UIPROP_IS_MOBILE_DEVICE = new UIPROP("UIPROP_IS_MOBILE_DEVICE", 15, 15);
            UIPROP_CALL_QUALITY_FEEDBACK_EXPECTED_WITH_NEXT_CALL = new UIPROP("UIPROP_CALL_QUALITY_FEEDBACK_EXPECTED_WITH_NEXT_CALL", 16, 16);
            UIPROP_NOTIFICATIONS_LANGUAGE = new UIPROP("UIPROP_NOTIFICATIONS_LANGUAGE", 17, 17);
            UIPROP_POLICY_LISTEN_RANGE_BEGIN = new UIPROP("UIPROP_POLICY_LISTEN_RANGE_BEGIN", 18, 18);
            UIPROP_POLICY_LISTEN_RANGE_END = new UIPROP("UIPROP_POLICY_LISTEN_RANGE_END", 19, 19);
            WRAPPER_UNKNOWN_VALUE = new UIPROP("WRAPPER_UNKNOWN_VALUE", 20, 0x7fffffff);
            $VALUES = (new UIPROP[] {
                UIPROP_LANGUAGE, UIPROP_IC_RUN_STARTUP_COUNT, UIPROP_IC_RUN_COMPLETED_COUNT, UIPROP_IC_TOTAL_YIELD, UIPROP_IC_LAST_YIELD, UIPROP_MENUITEM_USED_IN_LAST_MINUTE, UIPROP_TOOLBARITEM_USED_IN_LAST_MINUTE, UIPROP_LAST_CALL_ORIGIN, UIPROP_EXPRESSIVECONTENT_ITEMS, UIPROP_POLICY_LISTEN_PORT, 
                UIPROP_POLICY_LISTEN_HTTP_PORTS, UIPROP_POLICY_PROXY_SETTING, UIPROP_POLICY_PROXY_ADDRESS, UIPROP_POLICY_PROXY_USERNAME, UIPROP_SELECTED_CONTACT_IDENTITY, UIPROP_IS_MOBILE_DEVICE, UIPROP_CALL_QUALITY_FEEDBACK_EXPECTED_WITH_NEXT_CALL, UIPROP_NOTIFICATIONS_LANGUAGE, UIPROP_POLICY_LISTEN_RANGE_BEGIN, UIPROP_POLICY_LISTEN_RANGE_END, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UIPROP auiprop[] = values();
            int k = auiprop.length;
            for (int i = 0; i < k; i++)
            {
                UIPROP uiprop = auiprop[i];
                intToTypeMap.a(uiprop.value, uiprop);
            }

        }

        private UIPROP(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UNIFYRESULT extends Enum
    {

        private static final UNIFYRESULT $VALUES[];
        public static final UNIFYRESULT UNIFY_ALREADY_UNIFIED;
        public static final UNIFYRESULT UNIFY_INVALID_IDENTITY;
        public static final UNIFYRESULT UNIFY_OK;
        public static final UNIFYRESULT UNIFY_TOO_MANY_OUTLOOK;
        public static final UNIFYRESULT UNIFY_TOO_MANY_SKYPE;
        public static final UNIFYRESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UNIFYRESULT fromInt(int i)
        {
            UNIFYRESULT unifyresult = (UNIFYRESULT)intToTypeMap.a(i);
            if (unifyresult != null)
            {
                return unifyresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UNIFYRESULT valueOf(String s)
        {
            return (UNIFYRESULT)Enum.valueOf(com/skype/SkyLib$UNIFYRESULT, s);
        }

        public static UNIFYRESULT[] values()
        {
            return (UNIFYRESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UNIFY_OK = new UNIFYRESULT("UNIFY_OK", 0, 0);
            UNIFY_INVALID_IDENTITY = new UNIFYRESULT("UNIFY_INVALID_IDENTITY", 1, 1);
            UNIFY_ALREADY_UNIFIED = new UNIFYRESULT("UNIFY_ALREADY_UNIFIED", 2, 2);
            UNIFY_TOO_MANY_SKYPE = new UNIFYRESULT("UNIFY_TOO_MANY_SKYPE", 3, 3);
            UNIFY_TOO_MANY_OUTLOOK = new UNIFYRESULT("UNIFY_TOO_MANY_OUTLOOK", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new UNIFYRESULT("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new UNIFYRESULT[] {
                UNIFY_OK, UNIFY_INVALID_IDENTITY, UNIFY_ALREADY_UNIFIED, UNIFY_TOO_MANY_SKYPE, UNIFY_TOO_MANY_OUTLOOK, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UNIFYRESULT aunifyresult[] = values();
            int k = aunifyresult.length;
            for (int i = 0; i < k; i++)
            {
                UNIFYRESULT unifyresult = aunifyresult[i];
                intToTypeMap.a(unifyresult.value, unifyresult);
            }

        }

        private UNIFYRESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UNPACK_RESULT extends Enum
    {

        private static final UNPACK_RESULT $VALUES[];
        public static final UNPACK_RESULT UNPACK_BLOB_ERROR;
        public static final UNPACK_RESULT UNPACK_FILE_ERROR;
        public static final UNPACK_RESULT UNPACK_OK;
        public static final UNPACK_RESULT UNPACK_SIGNATURE_ERROR;
        public static final UNPACK_RESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UNPACK_RESULT fromInt(int i)
        {
            UNPACK_RESULT unpack_result = (UNPACK_RESULT)intToTypeMap.a(i);
            if (unpack_result != null)
            {
                return unpack_result;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UNPACK_RESULT valueOf(String s)
        {
            return (UNPACK_RESULT)Enum.valueOf(com/skype/SkyLib$UNPACK_RESULT, s);
        }

        public static UNPACK_RESULT[] values()
        {
            return (UNPACK_RESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UNPACK_OK = new UNPACK_RESULT("UNPACK_OK", 0, 0);
            UNPACK_FILE_ERROR = new UNPACK_RESULT("UNPACK_FILE_ERROR", 1, 1);
            UNPACK_BLOB_ERROR = new UNPACK_RESULT("UNPACK_BLOB_ERROR", 2, 2);
            UNPACK_SIGNATURE_ERROR = new UNPACK_RESULT("UNPACK_SIGNATURE_ERROR", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new UNPACK_RESULT("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new UNPACK_RESULT[] {
                UNPACK_OK, UNPACK_FILE_ERROR, UNPACK_BLOB_ERROR, UNPACK_SIGNATURE_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UNPACK_RESULT aunpack_result[] = values();
            int k = aunpack_result.length;
            for (int i = 0; i < k; i++)
            {
                UNPACK_RESULT unpack_result = aunpack_result[i];
                intToTypeMap.a(unpack_result.value, unpack_result);
            }

        }

        private UNPACK_RESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UNPACK_TYPE extends Enum
    {

        private static final UNPACK_TYPE $VALUES[];
        public static final UNPACK_TYPE UP_MAC_UPGRADE;
        public static final UNPACK_TYPE UP_SKYPEHOME_BUNDLE;
        public static final UNPACK_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UNPACK_TYPE fromInt(int i)
        {
            UNPACK_TYPE unpack_type = (UNPACK_TYPE)intToTypeMap.a(i);
            if (unpack_type != null)
            {
                return unpack_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UNPACK_TYPE valueOf(String s)
        {
            return (UNPACK_TYPE)Enum.valueOf(com/skype/SkyLib$UNPACK_TYPE, s);
        }

        public static UNPACK_TYPE[] values()
        {
            return (UNPACK_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UP_MAC_UPGRADE = new UNPACK_TYPE("UP_MAC_UPGRADE", 0, 4103);
            UP_SKYPEHOME_BUNDLE = new UNPACK_TYPE("UP_SKYPEHOME_BUNDLE", 1, 4106);
            WRAPPER_UNKNOWN_VALUE = new UNPACK_TYPE("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new UNPACK_TYPE[] {
                UP_MAC_UPGRADE, UP_SKYPEHOME_BUNDLE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UNPACK_TYPE aunpack_type[] = values();
            int k = aunpack_type.length;
            for (int i = 0; i < k; i++)
            {
                UNPACK_TYPE unpack_type = aunpack_type[i];
                intToTypeMap.a(unpack_type.value, unpack_type);
            }

        }

        private UNPACK_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UPGRADERESULT extends Enum
    {

        private static final UPGRADERESULT $VALUES[];
        public static final UPGRADERESULT BETA_AVAILABLE;
        public static final UPGRADERESULT DISCONTINUED;
        public static final UPGRADERESULT FORCED_STEALTH_UPGRADE;
        public static final UPGRADERESULT FORCED_UPGRADE;
        public static final UPGRADERESULT GOLD_AND_BETA_AVAILABLE;
        public static final UPGRADERESULT GOLD_AVAILABLE;
        public static final UPGRADERESULT NO_UPGRADE;
        public static final UPGRADERESULT RECOMMENDED_STEALTH_UPGRADE;
        public static final UPGRADERESULT RECOMMENDED_UPGRADE;
        public static final UPGRADERESULT UPGRADE_CHECK_FAILED;
        public static final UPGRADERESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UPGRADERESULT fromInt(int i)
        {
            UPGRADERESULT upgraderesult = (UPGRADERESULT)intToTypeMap.a(i);
            if (upgraderesult != null)
            {
                return upgraderesult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UPGRADERESULT valueOf(String s)
        {
            return (UPGRADERESULT)Enum.valueOf(com/skype/SkyLib$UPGRADERESULT, s);
        }

        public static UPGRADERESULT[] values()
        {
            return (UPGRADERESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NO_UPGRADE = new UPGRADERESULT("NO_UPGRADE", 0, 0);
            RECOMMENDED_UPGRADE = new UPGRADERESULT("RECOMMENDED_UPGRADE", 1, 1);
            RECOMMENDED_STEALTH_UPGRADE = new UPGRADERESULT("RECOMMENDED_STEALTH_UPGRADE", 2, 2);
            FORCED_UPGRADE = new UPGRADERESULT("FORCED_UPGRADE", 3, 3);
            FORCED_STEALTH_UPGRADE = new UPGRADERESULT("FORCED_STEALTH_UPGRADE", 4, 4);
            DISCONTINUED = new UPGRADERESULT("DISCONTINUED", 5, 5);
            GOLD_AVAILABLE = new UPGRADERESULT("GOLD_AVAILABLE", 6, 10);
            BETA_AVAILABLE = new UPGRADERESULT("BETA_AVAILABLE", 7, 11);
            GOLD_AND_BETA_AVAILABLE = new UPGRADERESULT("GOLD_AND_BETA_AVAILABLE", 8, 12);
            UPGRADE_CHECK_FAILED = new UPGRADERESULT("UPGRADE_CHECK_FAILED", 9, 20);
            WRAPPER_UNKNOWN_VALUE = new UPGRADERESULT("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new UPGRADERESULT[] {
                NO_UPGRADE, RECOMMENDED_UPGRADE, RECOMMENDED_STEALTH_UPGRADE, FORCED_UPGRADE, FORCED_STEALTH_UPGRADE, DISCONTINUED, GOLD_AVAILABLE, BETA_AVAILABLE, GOLD_AND_BETA_AVAILABLE, UPGRADE_CHECK_FAILED, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UPGRADERESULT aupgraderesult[] = values();
            int k = aupgraderesult.length;
            for (int i = 0; i < k; i++)
            {
                UPGRADERESULT upgraderesult = aupgraderesult[i];
                intToTypeMap.a(upgraderesult.value, upgraderesult);
            }

        }

        private UPGRADERESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class USER_LIKENESSES extends Enum
    {

        private static final USER_LIKENESSES $VALUES[];
        public static final USER_LIKENESSES USERLIKE_BUSINESS;
        public static final USER_LIKENESSES USERLIKE_REGULAR;
        public static final USER_LIKENESSES WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static USER_LIKENESSES fromInt(int i)
        {
            USER_LIKENESSES user_likenesses = (USER_LIKENESSES)intToTypeMap.a(i);
            if (user_likenesses != null)
            {
                return user_likenesses;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static USER_LIKENESSES valueOf(String s)
        {
            return (USER_LIKENESSES)Enum.valueOf(com/skype/SkyLib$USER_LIKENESSES, s);
        }

        public static USER_LIKENESSES[] values()
        {
            return (USER_LIKENESSES[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            USERLIKE_REGULAR = new USER_LIKENESSES("USERLIKE_REGULAR", 0, 0);
            USERLIKE_BUSINESS = new USER_LIKENESSES("USERLIKE_BUSINESS", 1, 1);
            WRAPPER_UNKNOWN_VALUE = new USER_LIKENESSES("WRAPPER_UNKNOWN_VALUE", 2, 0x7fffffff);
            $VALUES = (new USER_LIKENESSES[] {
                USERLIKE_REGULAR, USERLIKE_BUSINESS, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            USER_LIKENESSES auser_likenesses[] = values();
            int k = auser_likenesses.length;
            for (int i = 0; i < k; i++)
            {
                USER_LIKENESSES user_likenesses = auser_likenesses[i];
                intToTypeMap.a(user_likenesses.value, user_likenesses);
            }

        }

        private USER_LIKENESSES(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class UnifyContacts_Result
    {

        public UNIFYRESULT m_resultCode;
        public int m_return;

        public void init(UNIFYRESULT unifyresult, int i)
        {
            m_resultCode = unifyresult;
            m_return = i;
        }

        public UnifyContacts_Result()
        {
        }
    }

    public static final class VALIDATERESULT extends Enum
    {

        private static final VALIDATERESULT $VALUES[];
        public static final VALIDATERESULT CONTAINS_INVALID_CHAR;
        public static final VALIDATERESULT CONTAINS_INVALID_WORD;
        public static final VALIDATERESULT CONTAINS_SPACE;
        public static final VALIDATERESULT INVALID_FORMAT;
        public static final VALIDATERESULT NOT_VALIDATED;
        public static final VALIDATERESULT SAME_AS_USERNAME;
        public static final VALIDATERESULT STARTS_WITH_INVALID_CHAR;
        public static final VALIDATERESULT TOO_LONG;
        public static final VALIDATERESULT TOO_SHORT;
        public static final VALIDATERESULT TOO_SIMPLE;
        public static final VALIDATERESULT VALIDATED_OK;
        public static final VALIDATERESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VALIDATERESULT fromInt(int i)
        {
            VALIDATERESULT validateresult = (VALIDATERESULT)intToTypeMap.a(i);
            if (validateresult != null)
            {
                return validateresult;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VALIDATERESULT valueOf(String s)
        {
            return (VALIDATERESULT)Enum.valueOf(com/skype/SkyLib$VALIDATERESULT, s);
        }

        public static VALIDATERESULT[] values()
        {
            return (VALIDATERESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_VALIDATED = new VALIDATERESULT("NOT_VALIDATED", 0, 0);
            VALIDATED_OK = new VALIDATERESULT("VALIDATED_OK", 1, 1);
            TOO_SHORT = new VALIDATERESULT("TOO_SHORT", 2, 2);
            TOO_LONG = new VALIDATERESULT("TOO_LONG", 3, 3);
            CONTAINS_INVALID_CHAR = new VALIDATERESULT("CONTAINS_INVALID_CHAR", 4, 4);
            CONTAINS_SPACE = new VALIDATERESULT("CONTAINS_SPACE", 5, 5);
            SAME_AS_USERNAME = new VALIDATERESULT("SAME_AS_USERNAME", 6, 6);
            INVALID_FORMAT = new VALIDATERESULT("INVALID_FORMAT", 7, 7);
            CONTAINS_INVALID_WORD = new VALIDATERESULT("CONTAINS_INVALID_WORD", 8, 8);
            TOO_SIMPLE = new VALIDATERESULT("TOO_SIMPLE", 9, 9);
            STARTS_WITH_INVALID_CHAR = new VALIDATERESULT("STARTS_WITH_INVALID_CHAR", 10, 10);
            WRAPPER_UNKNOWN_VALUE = new VALIDATERESULT("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
            $VALUES = (new VALIDATERESULT[] {
                NOT_VALIDATED, VALIDATED_OK, TOO_SHORT, TOO_LONG, CONTAINS_INVALID_CHAR, CONTAINS_SPACE, SAME_AS_USERNAME, INVALID_FORMAT, CONTAINS_INVALID_WORD, TOO_SIMPLE, 
                STARTS_WITH_INVALID_CHAR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VALIDATERESULT avalidateresult[] = values();
            int k = avalidateresult.length;
            for (int i = 0; i < k; i++)
            {
                VALIDATERESULT validateresult = avalidateresult[i];
                intToTypeMap.a(validateresult.value, validateresult);
            }

        }

        private VALIDATERESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class VIDEO_DEVICE_TYPE extends Enum
    {

        private static final VIDEO_DEVICE_TYPE $VALUES[];
        public static final VIDEO_DEVICE_TYPE VIDEO_DEVICE_CAPTURE_ADAPTER;
        public static final VIDEO_DEVICE_TYPE VIDEO_DEVICE_SR_AUGMENTED;
        public static final VIDEO_DEVICE_TYPE VIDEO_DEVICE_USB_CAMERA;
        public static final VIDEO_DEVICE_TYPE VIDEO_DEVICE_VIRTUAL;
        public static final VIDEO_DEVICE_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static VIDEO_DEVICE_TYPE fromInt(int i)
        {
            VIDEO_DEVICE_TYPE video_device_type = (VIDEO_DEVICE_TYPE)intToTypeMap.a(i);
            if (video_device_type != null)
            {
                return video_device_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static VIDEO_DEVICE_TYPE valueOf(String s)
        {
            return (VIDEO_DEVICE_TYPE)Enum.valueOf(com/skype/SkyLib$VIDEO_DEVICE_TYPE, s);
        }

        public static VIDEO_DEVICE_TYPE[] values()
        {
            return (VIDEO_DEVICE_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            VIDEO_DEVICE_USB_CAMERA = new VIDEO_DEVICE_TYPE("VIDEO_DEVICE_USB_CAMERA", 0, 0);
            VIDEO_DEVICE_CAPTURE_ADAPTER = new VIDEO_DEVICE_TYPE("VIDEO_DEVICE_CAPTURE_ADAPTER", 1, 1);
            VIDEO_DEVICE_VIRTUAL = new VIDEO_DEVICE_TYPE("VIDEO_DEVICE_VIRTUAL", 2, 2);
            VIDEO_DEVICE_SR_AUGMENTED = new VIDEO_DEVICE_TYPE("VIDEO_DEVICE_SR_AUGMENTED", 3, 5);
            WRAPPER_UNKNOWN_VALUE = new VIDEO_DEVICE_TYPE("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new VIDEO_DEVICE_TYPE[] {
                VIDEO_DEVICE_USB_CAMERA, VIDEO_DEVICE_CAPTURE_ADAPTER, VIDEO_DEVICE_VIRTUAL, VIDEO_DEVICE_SR_AUGMENTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            VIDEO_DEVICE_TYPE avideo_device_type[] = values();
            int k = avideo_device_type.length;
            for (int i = 0; i < k; i++)
            {
                VIDEO_DEVICE_TYPE video_device_type = avideo_device_type[i];
                intToTypeMap.a(video_device_type.value, video_device_type);
            }

        }

        private VIDEO_DEVICE_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class ValidateAvatar_Result
    {

        public int m_freeBytesLeft;
        public VALIDATERESULT m_return;

        public void init(int i, VALIDATERESULT validateresult)
        {
            m_freeBytesLeft = i;
            m_return = validateresult;
        }

        public ValidateAvatar_Result()
        {
        }
    }

    public static class ValidateProfileString_Result
    {

        public int m_freeBytesLeft;
        public VALIDATERESULT m_return;

        public void init(int i, VALIDATERESULT validateresult)
        {
            m_freeBytesLeft = i;
            m_return = validateresult;
        }

        public ValidateProfileString_Result()
        {
        }
    }

    public static class VerifyAndUnpack_Result
    {

        public int m_file_error;
        public UNPACK_RESULT m_return;

        public void init(int i, UNPACK_RESULT unpack_result)
        {
            m_file_error = i;
            m_return = unpack_result;
        }

        public VerifyAndUnpack_Result()
        {
        }
    }

    public static class VideoCommand_Result
    {

        public String m_response;

        public void init(byte abyte0[])
        {
            m_response = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        }

        public VideoCommand_Result()
        {
        }
    }

    public static final class WEBGW_RESULT extends Enum
    {

        private static final WEBGW_RESULT $VALUES[];
        public static final WEBGW_RESULT WG_COOKIE_ERROR;
        public static final WEBGW_RESULT WG_ERROR;
        public static final WEBGW_RESULT WG_INVALID_HOST;
        public static final WEBGW_RESULT WG_INVALID_URI_FORMAT;
        public static final WEBGW_RESULT WG_INVALID_URI_SCHEME;
        public static final WEBGW_RESULT WG_LOCAL_ERROR;
        public static final WEBGW_RESULT WG_NO_ROUTES;
        public static final WEBGW_RESULT WG_REDIRECT_ERROR;
        public static final WEBGW_RESULT WG_SUCCESS;
        public static final WEBGW_RESULT WG_TRANSFER_FAILED;
        public static final WEBGW_RESULT WG_WEB_TIMEOUT;
        public static final WEBGW_RESULT WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static WEBGW_RESULT fromInt(int i)
        {
            WEBGW_RESULT webgw_result = (WEBGW_RESULT)intToTypeMap.a(i);
            if (webgw_result != null)
            {
                return webgw_result;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static WEBGW_RESULT valueOf(String s)
        {
            return (WEBGW_RESULT)Enum.valueOf(com/skype/SkyLib$WEBGW_RESULT, s);
        }

        public static WEBGW_RESULT[] values()
        {
            return (WEBGW_RESULT[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            WG_SUCCESS = new WEBGW_RESULT("WG_SUCCESS", 0, 0);
            WG_LOCAL_ERROR = new WEBGW_RESULT("WG_LOCAL_ERROR", 1, 1);
            WG_ERROR = new WEBGW_RESULT("WG_ERROR", 2, 2);
            WG_TRANSFER_FAILED = new WEBGW_RESULT("WG_TRANSFER_FAILED", 3, 3);
            WG_WEB_TIMEOUT = new WEBGW_RESULT("WG_WEB_TIMEOUT", 4, 4);
            WG_NO_ROUTES = new WEBGW_RESULT("WG_NO_ROUTES", 5, 5);
            WG_INVALID_URI_SCHEME = new WEBGW_RESULT("WG_INVALID_URI_SCHEME", 6, 6);
            WG_INVALID_URI_FORMAT = new WEBGW_RESULT("WG_INVALID_URI_FORMAT", 7, 7);
            WG_INVALID_HOST = new WEBGW_RESULT("WG_INVALID_HOST", 8, 8);
            WG_REDIRECT_ERROR = new WEBGW_RESULT("WG_REDIRECT_ERROR", 9, 9);
            WG_COOKIE_ERROR = new WEBGW_RESULT("WG_COOKIE_ERROR", 10, 10);
            WRAPPER_UNKNOWN_VALUE = new WEBGW_RESULT("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
            $VALUES = (new WEBGW_RESULT[] {
                WG_SUCCESS, WG_LOCAL_ERROR, WG_ERROR, WG_TRANSFER_FAILED, WG_WEB_TIMEOUT, WG_NO_ROUTES, WG_INVALID_URI_SCHEME, WG_INVALID_URI_FORMAT, WG_INVALID_HOST, WG_REDIRECT_ERROR, 
                WG_COOKIE_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            WEBGW_RESULT awebgw_result[] = values();
            int k = awebgw_result.length;
            for (int i = 0; i < k; i++)
            {
                WEBGW_RESULT webgw_result = awebgw_result[i];
                intToTypeMap.a(webgw_result.value, webgw_result);
            }

        }

        private WEBGW_RESULT(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract AccessPaymentGetInt_Result accessPaymentGetInt(SA_PAYMENT_IID sa_payment_iid);

    public abstract AccessPaymentGetString_Result accessPaymentGetString(SA_PAYMENT_SID sa_payment_sid);

    public abstract int accessPaymentPoll();

    public abstract void accessPaymentReset();

    public abstract boolean accessPaymentSetInt(SA_PAYMENT_IID sa_payment_iid, int i);

    public abstract boolean accessPaymentSetString(SA_PAYMENT_SID sa_payment_sid, String s);

    public abstract boolean accessPaymentSubmit();

    public abstract void addListener(SkyLibIListener skylibilistener);

    public abstract boolean addToObjectTrackingList(OBJECTTYPE objecttype, PROPKEY propkey);

    public abstract boolean app2AppConnect(String s, String s1);

    public abstract boolean app2AppCreate(String s);

    public abstract boolean app2AppDatagram(String s, String s1, byte abyte0[]);

    public abstract boolean app2AppDelete(String s);

    public abstract boolean app2AppDisconnect(String s, String s1);

    public abstract App2AppGetConnectableUsers_Result app2AppGetConnectableUsers(String s);

    public abstract App2AppGetStreamsList_Result app2AppGetStreamsList(String s, APP2APP_STREAMS app2app_streams);

    public abstract App2AppRead_Result app2AppRead(String s, String s1);

    public abstract boolean app2AppSetDesiredMinimumBandwidth(String s, String s1, int i);

    public abstract boolean app2AppWrite(String s, String s1, byte abyte0[]);

    public abstract int attachPublicAPIClient();

    public abstract int attachPublicAPIClient(boolean flag);

    public abstract boolean callExistingConference(String as[], String s, Conversation conversation);

    public abstract boolean callExistingConference(String as[], String s, Conversation conversation, String s1);

    public abstract boolean callExistingConference(String as[], String s, Conversation conversation, String s1, String s2);

    public abstract CanUnifyContacts_Result canUnifyContacts(int ai[]);

    public abstract void changeBackgroundMode(boolean flag);

    public abstract void changeOperationMode(int i);

    public abstract boolean checkClientUpgrade();

    public abstract void clearHttpCookies();

    public abstract void clearInbox(int i);

    public abstract void consumeAllConversations();

    public abstract String contactToVCard(int i);

    public abstract ContentEncode_Result contentEncode(String s);

    public abstract ContentEncode_Result contentEncode(String s, boolean flag);

    public abstract ContentEncodeCloud_Result contentEncodeCloud(String s);

    public abstract ContentEncodeCloud_Result contentEncodeCloud(String s, boolean flag);

    public abstract ContentEncodeCloud_Result contentEncodeCloud(String s, boolean flag, boolean flag1);

    public abstract ContentEncodeEx_Result contentEncodeEx(String s);

    public abstract ContentEncodeEx_Result contentEncodeEx(String s, boolean flag);

    public abstract ContentEncodeEx_Result contentEncodeEx(String s, boolean flag, boolean flag1);

    public abstract ContentGetEditable_Result contentGetEditable(String s);

    public abstract ContentGetRichEditable_Result contentGetRichEditable(String s, String as[]);

    public abstract void contentItemClosed(int i);

    public abstract void contentItemClosed(int i, boolean flag);

    public abstract void contentItemDelete(int i);

    public abstract void contentItemExecuted(int i);

    public abstract void contentItemExposingNow(int i, boolean flag);

    public abstract ContentItemGet_Result contentItemGet(String s, boolean flag);

    public abstract ContentItemGetBody_Result contentItemGetBody(int i);

    public abstract int contentItemGetChildCount(int i, String s, boolean flag);

    public abstract ContentItemGetChildItem_Result contentItemGetChildItem(int i, String s);

    public abstract ContentItemGetChildNames_Result contentItemGetChildNames(int i);

    public abstract String contentItemGetMeta(int i);

    public abstract String contentItemGetType(int i);

    public abstract String contentItemGetUri(int i);

    public abstract int contentItemRunBytecode(int i);

    public abstract ContentStripXML_Result contentStripXML(String s);

    public abstract boolean createAccessSession(AccessSession accesssession);

    public abstract boolean createBasicContactSearch(String s, ContactSearch contactsearch);

    public abstract boolean createConference(Conversation conversation);

    public abstract void createContactSearch(ContactSearch contactsearch);

    public abstract boolean createCustomContactGroup(ContactGroup contactgroup);

    public abstract boolean createEmoticonMediaDocument(String s, MediaDocument mediadocument);

    public abstract long createHrtfAudioProcessor(int i);

    public abstract int createHttpStream(HTTPFE_METHOD httpfe_method, String s, String s1);

    public abstract int createHttpStream(HTTPFE_METHOD httpfe_method, String s, String s1, int i);

    public abstract boolean createIdentitySearch(String s, ContactSearch contactsearch);

    public abstract int createLocalVideo(Video.MEDIATYPE mediatype);

    public abstract int createLocalVideo(Video.MEDIATYPE mediatype, String s);

    public abstract int createLocalVideo(Video.MEDIATYPE mediatype, String s, String s1);

    public abstract boolean createMediaDocument(MediaDocument.DOCUMENT_TYPE document_type, MediaDocument mediadocument);

    public abstract boolean createMediaDocument(MediaDocument.DOCUMENT_TYPE document_type, MediaDocument mediadocument, String s);

    public abstract boolean createMediaDocumentWithWebUrl(String s, MediaDocument mediadocument);

    public abstract boolean createOutgoingSms(Sms sms);

    public abstract int createPreviewVideo(Video.MEDIATYPE mediatype);

    public abstract int createPreviewVideo(Video.MEDIATYPE mediatype, String s);

    public abstract int createPreviewVideo(Video.MEDIATYPE mediatype, String s, String s1);

    public abstract CreateSignedToken_Result createSignedToken(String s);

    public abstract boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage);

    public abstract boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage, String s3);

    public abstract boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage, String s3, String s4);

    public abstract void customAPICall(int i);

    public abstract void declareExtendedProp(OBJECTTYPE objecttype, String s, PROPKEY propkey, Metatag.TYPE type);

    public abstract void deleteAllMessages();

    public abstract boolean deleteHrtfAudioProcessor(long l);

    public abstract void deleteUIProp(UIPROP uiprop);

    public abstract void detachPublicAPIClient(int i);

    public abstract void displayVideoDeviceTuningDialog(String s, String s1);

    public abstract void ecsAddQueryParameter(String s, String s1, String s2);

    public abstract String ecsGetETag();

    public abstract boolean ecsGetSettingsAsBool(String s, String s1, boolean flag);

    public abstract int ecsGetSettingsAsInt(String s, String s1, int i);

    public abstract String ecsGetSettingsAsString(String s, String s1, String s2);

    public abstract void ecsRemoveQueryParameter(String s, String s1);

    public abstract void ecsRemoveQueryParameterByNamespace(String s);

    public abstract boolean enableHrtfAudioProcessor(long l, boolean flag);

    public abstract void executeBackgroundTask();

    public abstract FetchLocal_Result fetchLocal(String s);

    public abstract boolean fillInbox();

    public abstract boolean fillInbox(int i);

    public abstract boolean fillInbox(int i, boolean flag);

    public abstract FindContactByPstnNumber_Result findContactByPstnNumber(String s, Contact contact);

    public abstract boolean findContactBySpeedDial(String s, Contact contact);

    public abstract FindContactsByEmail_Result findContactsByEmail(String s);

    public abstract int findObjectByDbID(OBJECTTYPE objecttype, int i);

    public abstract FindObjects_Result findObjects(OBJECTTYPE objecttype, String s);

    public abstract int findPromotedSCDContacts();

    public abstract int findPromotedSCDContacts(boolean flag);

    public abstract void fireIntent(INTENT intent);

    public abstract void fireIntent(INTENT intent, String s);

    public abstract void forceEasContactsSync();

    public abstract boolean getAccessSession(int i, AccessSession accesssession);

    public abstract boolean getAccount(int i, Account account);

    public abstract boolean getAccount(String s, Account account);

    public abstract boolean getAccountAvatar(long l, String s, String s1, String s2, String s3);

    public abstract boolean getAlert(int i, Alert alert);

    public abstract GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(String s);

    public abstract GetAvailableOutputDevices_Result getAvailableOutputDevices();

    public abstract GetAvailableRecordingDevices_Result getAvailableRecordingDevices();

    public abstract GetAvailableVideoDevices_Result getAvailableVideoDevices();

    public abstract GetCallerIDNumbers_Result getCallerIDNumbers();

    public abstract GetCallerIDOptions_Result getCallerIDOptions();

    public abstract int getChatMemberCountLimit();

    public abstract int getClientTelemetry();

    public abstract GetConnectivity_Result getConnectivity();

    public abstract boolean getContact(int i, Contact contact);

    public abstract boolean getContact(String s, Contact contact);

    public abstract boolean getContactGroup(int i, ContactGroup contactgroup);

    public abstract boolean getContactSearch(int i, ContactSearch contactsearch);

    public abstract Contact.TYPE getContactType(String s);

    public abstract boolean getConversation(int i, Conversation conversation);

    public abstract boolean getConversationByBlob(String s, Conversation conversation);

    public abstract boolean getConversationByBlob(String s, Conversation conversation, boolean flag);

    public abstract boolean getConversationByCallGUID(String s, Conversation conversation);

    public abstract boolean getConversationByConvoID(int i, Conversation conversation);

    public abstract boolean getConversationByIdentity(String s, Conversation conversation);

    public abstract boolean getConversationByIdentity(String s, Conversation conversation, boolean flag);

    public abstract boolean getConversationByParticipants(String as[], Conversation conversation);

    public abstract boolean getConversationByParticipants(String as[], Conversation conversation, boolean flag);

    public abstract boolean getConversationByParticipants(String as[], Conversation conversation, boolean flag, boolean flag1);

    public abstract GetConversationList_Result getConversationList();

    public abstract GetConversationList_Result getConversationList(Conversation.LIST_TYPE list_type);

    public abstract boolean getConversationMessage(int i, Message message);

    public abstract void getConversationTable(Conversation.LIST_TYPE list_type, PROPKEY apropkey[], Proptable proptable);

    public abstract GetCustomContactGroups_Result getCustomContactGroups();

    public abstract String getDebugString(DEBUG_STRING debug_string);

    public abstract String getDefaultAccountName();

    public abstract GetDefaultContentId_Result getDefaultContentId(MediaDocument.DOCUMENT_TYPE document_type);

    public abstract String getDefaultDBPath();

    public abstract String getDefaultDBPath(boolean flag);

    public abstract GetEmoticonList_Result getEmoticonList(String s);

    public abstract GetEmoticonListFromPack_Result getEmoticonListFromPack(int i);

    public abstract GetExistingAccounts_Result getExistingAccounts();

    public abstract boolean getGreeting(String s, Voicemail voicemail);

    public abstract int getHardwiredContactGroup(ContactGroup.TYPE type);

    public abstract String getISOCountryCodebyPhoneNo(String s);

    public abstract GetISOCountryInfo_Result getISOCountryInfo();

    public abstract String getISOFormattedCurrency(long l, int i, String s);

    public abstract GetISOLanguageInfo_Result getISOLanguageInfo();

    public abstract IDENTITYTYPE getIdentityType(String s);

    public abstract int getIntLibProp(LIBPROP libprop);

    public abstract GetLastConfirmationNumber_Result getLastConfirmationNumber();

    public abstract boolean getMediaDocument(int i, MediaDocument mediadocument);

    public abstract boolean getMessageAnnotation(int i, MessageAnnotation messageannotation);

    public abstract boolean getMessageByGuid(byte abyte0[], Message message);

    public abstract GetMessageList_Result getMessageList();

    public abstract GetMessageList_Result getMessageList(int i);

    public abstract GetMessageList_Result getMessageList(int i, int j);

    public abstract GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag);

    public abstract GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag, int i);

    public abstract GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag, int i, int j);

    public abstract int getMicVolume();

    public abstract GetNrgLevels_Result getNrgLevels();

    public abstract boolean getObjectInterface(int i, ObjectInterface objectinterface);

    public abstract OBJECTTYPE getObjectType(int i);

    public abstract GetOptimalAgeRanges_Result getOptimalAgeRanges();

    public abstract GetPackList_Result getPackList(String s);

    public abstract GetPackListFromTab_Result getPackListFromTab(int i);

    public abstract boolean getParticipant(int i, Participant participant);

    public abstract boolean getPartnerLinkInfo(long l);

    public abstract boolean getPartnerLinkInfo(long l, String s);

    public abstract boolean getPartnerLinkInfo(long l, String s, String s1);

    public abstract GetPendingMediaDocumentsList_Result getPendingMediaDocumentsList();

    public abstract boolean getPriceQuote(int i, PriceQuote pricequote);

    public abstract int getPropertyTable(int ai[], PROPKEY apropkey[], Proptable proptable);

    public abstract GetRecentAlerts_Result getRecentAlerts(int i, int j);

    public abstract GetRecentAlertsOfType_Result getRecentAlertsOfType(int i, int j, int ai[]);

    public abstract String getRegistrationId();

    public abstract void getSeamlessCapable(String s);

    public abstract int getServerTime();

    public abstract boolean getSkypeLinkInfo(long l, String s);

    public abstract boolean getSms(int i, Sms sms);

    public abstract int getSpeakerVolume();

    public abstract String getStrLibProp(LIBPROP libprop);

    public abstract String getStrLibProp(LIBPROP libprop, String s);

    public abstract String getStrLibPropInternal(int i);

    public abstract String getStrLibPropInternal(int i, String s);

    public abstract boolean getSuggestedAccounts(long l, String s);

    public abstract String getSuggestedSkypename(String s);

    public abstract GetSupportedUILanguageList_Result getSupportedUILanguageList();

    public abstract GetSyncKeyofContactGroup_Result getSyncKeyofContactGroup(ContactGroup.TYPE type);

    public abstract GetTabList_Result getTabList();

    public abstract int getTotalOnlineUserCount();

    public abstract boolean getTransfer(int i, Transfer transfer);

    public abstract boolean getTranslator(int i, Translator translator);

    public abstract int getUIIntProp(UIPROP uiprop);

    public abstract String getUIStrProp(UIPROP uiprop);

    public abstract String getUIStrProp(UIPROP uiprop, String s);

    public abstract int getUnconsumedConversationsCount();

    public abstract int getUnconsumedConversationsCount(Conversation.LIST_TYPE list_type);

    public abstract GetVCard_Result getVCard();

    public abstract String getVCardOwner(byte abyte0[]);

    public abstract GetValidatedSmsNumbers_Result getValidatedSmsNumbers();

    public abstract boolean getVideo(int i, Video video);

    public abstract VIDEO_DEVICE_TYPE getVideoDeviceType(String s, String s1);

    public abstract boolean getVideoMessage(int i, VideoMessage videomessage);

    public abstract GetVideoMessagingEntitlement_Result getVideoMessagingEntitlement();

    public abstract boolean getVoicemail(int i, Voicemail voicemail);

    public abstract int handlePushNotification(int i, byte abyte0[], byte abyte1[]);

    public abstract int handlePushNotification(int i, byte abyte0[], byte abyte1[], String s);

    public abstract boolean hasCalled(String s);

    public abstract boolean hasVideoDeviceCapability(String s, String s1, Video.VIDEO_DEVICE_CAPABILITY video_device_capability);

    public abstract boolean identitiesMatch(String s, String s1);

    public abstract boolean importBuddylist(byte abyte0[]);

    public abstract boolean importProfile(byte abyte0[]);

    public abstract IngestAddContactAndLookupExisting_Result ingestAddContactAndLookupExisting(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract boolean ingestAddContactInfo(String s, String s1);

    public abstract boolean ingestAddContactInfo(String s, String s1, String s2);

    public abstract boolean ingestAddContactInfo(String s, String s1, String s2, String s3);

    public abstract boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4);

    public abstract boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6);

    public abstract void ingestDeleteContactInfo(String s);

    public abstract IngestGetMatchingContactIds_Result ingestGetMatchingContactIds(int i);

    public abstract void ingestLookup();

    public abstract boolean isContactListMasteredInABCH();

    public abstract IsMicrophoneMuted_Result isMicrophoneMuted();

    public abstract IsSpeakerMuted_Result isSpeakerMuted();

    public abstract boolean issuePriceQuote(String s, PriceQuote.TYPE type, String s1, int i, int j, String s2, int k, 
            PriceQuote pricequote);

    public abstract boolean joinExistingConferenceCall(String s, String s1);

    public abstract boolean linkAccountWithPartner(long l, String s, String s1, String s2);

    public abstract boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3);

    public abstract boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3, boolean flag);

    public abstract boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3, boolean flag, 
            boolean flag1);

    public abstract void markObjectTrackerItemsAsConsumed(int i);

    public abstract boolean muteMicrophone(boolean flag);

    public abstract boolean muteSpeakers(boolean flag);

    public abstract NormalizeIdentity_Result normalizeIdentity(String s);

    public abstract NormalizeIdentity_Result normalizeIdentity(String s, boolean flag);

    public abstract NormalizePSTNWithCountry_Result normalizePSTNWithCountry(String s);

    public abstract NormalizePSTNWithCountry_Result normalizePSTNWithCountry(String s, int i);

    public abstract int partnerQueryData(PARTNER_QUERY_TYPE partner_query_type, PARTNER_QUERY_ID partner_query_id, byte abyte0[]);

    public abstract void playStart(int i, byte abyte0[], boolean flag);

    public abstract void playStart(int i, byte abyte0[], boolean flag, boolean flag1);

    public abstract PREPARESOUNDRESULT playStartFromFile(int i, String s, boolean flag);

    public abstract PREPARESOUNDRESULT playStartFromFile(int i, String s, boolean flag, boolean flag1);

    public abstract void playStop(int i);

    public abstract PrepareSound_Result prepareSound(byte abyte0[]);

    public abstract PrepareSoundFromFile_Result prepareSoundFromFile(String s);

    public abstract PublicAPIRequest_Result publicAPIRequest(int i, String s);

    public abstract boolean putAuthTokens(long l, String as[], String s);

    public abstract boolean putAuthTokens(long l, String as[], String s, int i);

    public abstract boolean putAuthTokens(long l, String as[], String s, int i, String s1);

    public abstract QueryContentListing_Result queryContentListing(String s, CONTENT_LIST_CONTEXT content_list_context);

    public abstract int registerContexts(SERVICE_TYPE service_type, String s, String s1, String as[], String as1[], int ai[]);

    public abstract int registerContextsEx(SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[]);

    public abstract int registerContextsEx(SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2);

    public abstract int registerContextsEx(SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3);

    public abstract int registerContextsEx2(SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3, String s4);

    public abstract int registerContextsEx2(SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3, String s4, String s5);

    public abstract void removeListener(SkyLibIListener skylibilistener);

    public abstract boolean reportStatsEvent(int i, byte abyte0[]);

    public abstract boolean reportStatsEvent(int i, byte abyte0[], String s);

    public abstract int requestAccessToken(long l, String s, boolean flag);

    public abstract boolean requestConfirmationCode(Sms.CONFIRM_TYPE confirm_type, String s, Sms sms);

    public abstract int requestSSOToken();

    public abstract int requestSkypeToken();

    public abstract int requestSkypeToken(boolean flag);

    public abstract int requestWebSession();

    public abstract int requestWebSessionWithPassword(String s, String s1);

    public abstract int reregisterContexts();

    public abstract int reregisterContextsEx2(String s, String s1);

    public abstract int searchMessages(String s);

    public abstract int searchMessages(String s, int i);

    public abstract void selectSoundDevices(String s, String s1, String s2);

    public abstract int sendHttpRequest(HTTPFE_METHOD httpfe_method, String s, String s1, String s2);

    public abstract int sendHttpRequest(HTTPFE_METHOD httpfe_method, String s, String s1, String s2, int i);

    public abstract boolean sendHttpStream(int i, byte abyte0[]);

    public abstract void setAndroidId(String s);

    public abstract int setCallerIDOptions(long l, long l1, int i);

    public abstract void setIMEI(String s);

    public abstract boolean setInstallContentBundleName(String s);

    public abstract void setLocalizedString(LOCALIZED_STRING localized_string, String s);

    public abstract void setMaxNrOfVideosVisibleInUI(int i);

    public abstract void setMicVolume(int i);

    public abstract void setMobileDataUsageLevel(MOBILE_DATA_USAGE_LEVEL mobile_data_usage_level);

    public abstract boolean setNetworkActivityLevel(int i);

    public abstract void setOperatingMedia(OPERATING_MEDIA operating_media, int i, int j);

    public abstract void setSeamlessCapable(boolean flag);

    public abstract void setSpeakerVolume(int i);

    public abstract void setUIIntProp(UIPROP uiprop, int i);

    public abstract void setUIStrProp(UIPROP uiprop, String s);

    public abstract void setUserActive(boolean flag);

    public abstract boolean start();

    public abstract boolean start(boolean flag);

    public abstract void startMonitoringQuality(String s, boolean flag);

    public abstract void startRecordingTest();

    public abstract void startRecordingTest(boolean flag);

    public abstract void stop();

    public abstract void stop(boolean flag);

    public abstract void stopEasContactsSync();

    public abstract void stopHistorySync();

    public abstract QUALITYTESTRESULT stopMonitoringQuality(String s);

    public abstract QUALITYTESTRESULT stopMonitoringQuality(String s, boolean flag);

    public abstract void stopPlayDTMF();

    public abstract void stopRecordingTest();

    public abstract boolean storeLocal(String s, byte abyte0[]);

    public abstract boolean submitConfirmationCode(String s, String s1, Sms sms);

    public abstract boolean submitSearch(Search search);

    public abstract void syncHistory();

    public abstract void triggerObjectTrackerConsumption();

    public abstract boolean trouterCheckConnection();

    public abstract boolean trouterCheckConnection(String s);

    public abstract boolean trouterConnect();

    public abstract boolean trouterReceiveData();

    public abstract boolean trouterReceiveData(String s);

    public abstract boolean trouterSuspend();

    public abstract boolean unUnifyContact(int i, int j);

    public abstract UnifyContacts_Result unifyContacts(int ai[]);

    public abstract int unregisterAllContexts(String s, String s1);

    public abstract int unregisterContexts(String as[]);

    public abstract int unregisterContextsEx2(String as[], String s, String s1);

    public abstract boolean updateHrtf3DSourcePosition(long l, int i, int j, int k, int i1);

    public abstract int vCardToContact(String s);

    public abstract ValidateAvatar_Result validateAvatar(byte abyte0[]);

    public abstract VALIDATERESULT validatePassword(String s, String s1);

    public abstract ValidateProfileString_Result validateProfileString(PROPKEY propkey, String s);

    public abstract ValidateProfileString_Result validateProfileString(PROPKEY propkey, String s, boolean flag);

    public abstract VerifyAndUnpack_Result verifyAndUnpack(String s, String s1, UNPACK_TYPE unpack_type);

    public abstract VideoCommand_Result videoCommand(String s);

    public abstract String voiceCommand(String s);
}
