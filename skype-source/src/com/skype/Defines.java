// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


public class Defines
{

    public static final int DEFAULT_ACCESS_ENABLED = 1;
    public static final int DEFAULT_ACCESS_SESSION_LEN = 0;
    public static final String DEFAULT_ADMAUTH_TRANSLATOR_CLIENTNAME = "SkypeP2PTranslator";
    public static final String DEFAULT_ADMAUTH_TRANSLATOR_URI = "https://datamarket.accesscontrol.windows.net";
    public static final String DEFAULT_API_TRANSLATOR_URI = "https://dev.microsofttranslator.com/api";
    public static final int DEFAULT_CALL_NOANSWER_TIMEOUT = 15;
    public static final int DEFAULT_CHATDB_LIMIT_KB = 0;
    public static final int DEFAULT_DB_PAGE_SIZE = 4096;
    public static final int DEFAULT_DB_STORAGE_QUOTA_KB = 0;
    public static final int DEFAULT_ENABLE_BIRTHDAY_NOTIFICATION = 1;
    public static final int DEFAULT_ENABLE_EXTERNAL_CONTACTS = 0;
    public static final int DEFAULT_ENABLE_REACHBACK_CALLING = 0;
    public static final int DEFAULT_INBOX_LIMIT_DAYS = 180;
    public static final int DEFAULT_INCOMING_AUTH_REQUEST_IN_CONV = 0;
    public static final int DEFAULT_KEEP_IN_INBOX_WHEN_BLOCKING = 0;
    public static final int DEFAULT_OBJECT_TRACKER_MAX_ITEMS_CONSUMED_ONCE = 16;
    public static final int DEFAULT_OBJECT_TRACKER_REPEAT_TIME_MS = 60000;
    public static final int DEFAULT_OBJECT_TRACKER_START_DELAY_MS = 0;
    public static final int DEFAULT_RECENTLY_LIVE_TIMEOUT = 20;
    public static final String DEFAULT_SPEECH_TRANSLATOR_FALLBACK_URIS = "";
    public static final String DEFAULT_SPEECH_TRANSLATOR_URI = "wss://dev.microsofttranslator.com/api/speech/translate";
    public static final String DEFAULT_TEXT_TRANSLATOR_URI = "https://api.microsofttranslator.com";
    public static final String DEFAULT_TRANSLATOR_STREAM_GAINS = "100,50,0.10,0.90";
    public static final int DEFAULT_TROUTER_MAX_RECONNECT_COUNT = 0;
    public static final int DEFAULT_TROUTER_SUSPENDED_STATE_PING_CONFIGURATION = 0xdbba0;
    public static final String DEFAULT_VIDEO_ADVERTPOLICY = "contacts";
    public static final String DEFAULT_VIDEO_RECVPOLICY = "contacts";
    public static final int GI_HAS_PROPTABLE = 1;
    public static final int MAX_SUPPORTED_WAV_FILE_SIZE = 0x180000;
    public static final String SETUPKEY_ACCESS_ENABLED = "*Lib/Access/Enabled";
    public static final String SETUPKEY_ACCESS_SESSION_LEN = "*Lib/Access/SessionLen";
    public static final String SETUPKEY_ADMAUTH_TRANSLATOR_CLIENTNAME = "Lib/Translator/ClientName";
    public static final String SETUPKEY_ADMAUTH_TRANSLATOR_CLIENTSERVICEID = "Lib/Translator/ClientServiceId";
    public static final String SETUPKEY_ADMAUTH_TRANSLATOR_URI = "Lib/Translator/AdmAuthUri";
    public static final String SETUPKEY_ALLOW_DEBUG_DATA_COLLECTION = "Lib/Sherlock/AllowDebugDataCollection";
    public static final String SETUPKEY_ALLOW_INCOMING_LYNC_ID = "*Lib/Call/AllowIncomingLyncId";
    public static final String SETUPKEY_API_TRANSLATOR_URI = "Lib/Translator/ApiUri";
    public static final String SETUPKEY_BEAMFORMER_MIC_SPACING = "*Lib/Audio/BeamformerMicSpacing";
    public static final String SETUPKEY_CALL_APPLY_CF = "Lib/Call/ApplyCF";
    public static final String SETUPKEY_CALL_EMERGENCY_COUNTRY = "Lib/Call/EmergencyCountry";
    public static final String SETUPKEY_CALL_INCOMING_IN_ROUTING_STATUS = "*Lib/Call/IncomingInRoutingStatus";
    public static final String SETUPKEY_CALL_NOANSWER_TIMEOUT = "Lib/Call/NoAnswerTimeout";
    public static final String SETUPKEY_CALL_SEAMLESS_UPGRADE_CAPABLE = "*Lib/Call/SeamlessUpgradeCapable";
    public static final String SETUPKEY_CALL_SEND_TO_VM = "Lib/Call/SendToVM";
    public static final String SETUPKEY_CHATDB_LIMIT_KB = "Lib/Chat/ChatDBLimitKb";
    public static final String SETUPKEY_CHAT_HISTORY_DAYS = "Lib/Chat/HistoryDays";
    public static final String SETUPKEY_DB_PAGE_SIZE = "*Lib/DbManager/PageSize";
    public static final String SETUPKEY_DB_STORAGE_QUOTA_KB = "*Lib/DbManager/StorageQuotaKb";
    public static final String SETUPKEY_DC_NOPERSONAL = "Lib/DynContent/DisablePersonal";
    public static final String SETUPKEY_DC_NOPROMO = "Lib/DynContent/DisablePromo";
    public static final String SETUPKEY_DC_NOTIPS = "Lib/DynContent/DisableTip";
    public static final String SETUPKEY_DISABLED_CODECS = "*Lib/Audio/DisableCodecs";
    public static final String SETUPKEY_DISABLE_AEC = "*Lib/Audio/DisableAEC";
    public static final String SETUPKEY_DISABLE_AGC = "*Lib/Audio/DisableAGC";
    public static final String SETUPKEY_DISABLE_AUDIO_DEVICE_PROBING = "*Lib/QualityMonitor/DisableAudioDeviceProbing";
    public static final String SETUPKEY_DISABLE_CHAT = "Lib/Chat/DisableChat";
    public static final String SETUPKEY_DISABLE_CHAT_ACTIVITY_INDICATION = "Lib/Chat/DisableActivityIndication";
    public static final String SETUPKEY_DISABLE_CHAT_HISTORY = "Lib/Message/DisableHistory";
    public static final String SETUPKEY_DISABLE_DIGITAL_FAR_END_AGC = "*Lib/Audio/DisableDigitalFarEndAGC";
    public static final String SETUPKEY_DISABLE_DIGITAL_NEAR_END_AGC = "*Lib/Audio/DisableDigitalNearEndAGC";
    public static final String SETUPKEY_DISABLE_DTMF_BEEP = "*Lib/Conversation/DisableLocalPlayoutOfDTMFTone";
    public static final String SETUPKEY_DISABLE_INBOX_UPDATE_ON_TYPING = "Lib/Conversation/DisableInboxUpdateOnTyping";
    public static final String SETUPKEY_DISABLE_NOISE_SUPPRESSOR = "*Lib/Audio/DisableNS";
    public static final String SETUPKEY_DISABLE_P2P_CHAT = "*Lib/Chat/Disable";
    public static final String SETUPKEY_DISABLE_PORT80 = "*Lib/Connection/DisablePort80";
    public static final String SETUPKEY_DISABLE_SUPERNODE = "*Lib/Connection/DisableSupernode";
    public static final String SETUPKEY_DISABLE_UDP = "*Lib/Connection/DisableUDP";
    public static final String SETUPKEY_DISABLE_VOIP_SOCKETS = "*Lib/Connection/DisableVoipSockets";
    public static final String SETUPKEY_DISABLE_XMPP = "*Lib/XMPP/Disable";
    public static final String SETUPKEY_ENABLE_BIRTHDAY_NOTIFICATION = "Lib/Conversation/EnableBirthday";
    public static final String SETUPKEY_ENABLE_DIFF_HIGHLIGHTING = "Lib/Chat/HighlightDiffs";
    public static final String SETUPKEY_ENABLE_EXTERNAL_CONTACTS = "Lib/Contacts/EnableExternalContacts";
    public static final String SETUPKEY_ENABLE_REACHBACK_CALLING = "Lib/Reachback/Enable";
    public static final String SETUPKEY_ENABLE_TCP_NODELAY = "*Lib/EnableTCPNoDelay";
    public static final String SETUPKEY_ENDPOINT_NAME = "Lib/MSNP/EndpointName";
    public static final String SETUPKEY_FORCEDSNODESLOT = "*Lib/ForcedSnodeSlot";
    public static final String SETUPKEY_FT_AUTOACCEPT = "Lib/FileTransfer/AutoAccept";
    public static final String SETUPKEY_FT_INCOMING_LIMIT = "Lib/FileTransfer/IncomingLimit";
    public static final String SETUPKEY_FT_SAVEPATH = "Lib/FileTransfer/SavePath";
    public static final String SETUPKEY_HASH_LINK_URL = "UI/General/HashLinkURL";
    public static final String SETUPKEY_HTTPFE_ACCEPT_DEFLATE = "Lib/Pic/AcceptDeflate";
    public static final String SETUPKEY_HTTPFE_DISABLE_COOKIES = "Lib/Pic/DisableCookies";
    public static final String SETUPKEY_HTTPS_PROXY_ADDR = "*Lib/Connection/HttpsProxy/Addr";
    public static final String SETUPKEY_HTTPS_PROXY_ENABLE = "*Lib/Connection/HttpsProxy/Enable";
    public static final String SETUPKEY_HTTPS_PROXY_PWD = "*Lib/Connection/HttpsProxy/Pwd";
    public static final String SETUPKEY_HTTPS_PROXY_USER = "*Lib/Connection/HttpsProxy/User";
    public static final String SETUPKEY_IDLE_TIME_FOR_AWAY = "Lib/Account/IdleTimeForAway";
    public static final String SETUPKEY_IDLE_TIME_FOR_NA = "Lib/Account/IdleTimeForNA";
    public static final String SETUPKEY_INBOX_LIMIT_DAYS = "Lib/Conversation/InboxLimitDays";
    public static final String SETUPKEY_INBOX_UPDATE_TIMEOUT = "Lib/Conversation/InboxUpdateTimeout";
    public static final String SETUPKEY_INCOMING_AUTH_REQUEST_IN_CONV = "Lib/Conversation/IncomingAuthRequestInConv";
    public static final String SETUPKEY_KEEP_IN_INBOX_WHEN_BLOCKING = "Lib/Conversation/KeepInInboxWhenBlocking";
    public static final String SETUPKEY_LOCALADDRESS = "*Lib/Connection/LocalAddress";
    public static final String SETUPKEY_LOGROTATION_DELETEOLDLOGS = "*Lib/Logging/Rotation/DeleteOldLogs";
    public static final String SETUPKEY_LOGROTATION_PRESERVEFIRSTLOG = "*Lib/Logging/Rotation/PreserveFirstLog";
    public static final String SETUPKEY_LOGROTATION_RETENTIONTIME = "*Lib/Logging/Rotation/RetentionTime";
    public static final String SETUPKEY_LOGROTATION_ROTATESIZE = "*Lib/Logging/Rotation/RotateSize";
    public static final String SETUPKEY_LOGSTACKINFO = "*Lib/LogStackInfo";
    public static final String SETUPKEY_MAX_NUMBER_OF_VIDEOS_VISIBLE_IN_UI = "*Lib/Call/MaxNrOfVideosVisibleInUI";
    public static final String SETUPKEY_OBJECT_TRACKER_MAX_ITEMS_CONSUMED_ONCE = "*Lib/ObjectTracker/MaxItems";
    public static final String SETUPKEY_OBJECT_TRACKER_REPEAT_TIME_MS = "*Lib/ObjectTracker/RepeatTimeMs";
    public static final String SETUPKEY_OBJECT_TRACKER_START_DELAY_MS = "*Lib/ObjectTracker/StartDelayMs";
    public static final String SETUPKEY_PACKETLOGGING = "*Lib/PacketLogging";
    public static final String SETUPKEY_PORT = "*Lib/Connection/Port";
    public static final String SETUPKEY_PRIVATE_SKYPE_MODE = "Lib/Account/PrivateSkypeMode";
    public static final String SETUPKEY_PRIVATE_SKYPE_MODE_ENFORCED = "*Lib/Account/PrivateSkypeMode";
    public static final String SETUPKEY_QUIET_P2P_IN_CALL = "*Lib/Conversation/QuietP2PInCall";
    public static final String SETUPKEY_RECENTLY_LIVE_TIMEOUT = "Lib/Conversation/RecentlyLiveTimeout";
    public static final String SETUPKEY_SOCKS_PROXY_ADDR = "*Lib/Connection/SocksProxy/Addr";
    public static final String SETUPKEY_SOCKS_PROXY_ENABLE = "*Lib/Connection/SocksProxy/Enable";
    public static final String SETUPKEY_SOCKS_PROXY_PWD = "*Lib/Connection/SocksProxy/Pwd";
    public static final String SETUPKEY_SOCKS_PROXY_USER = "*Lib/Connection/SocksProxy/User";
    public static final String SETUPKEY_SPEECH_TRANSLATOR_FALLBACK_URIS = "Lib/Translator/FallbackUris";
    public static final String SETUPKEY_SPEECH_TRANSLATOR_URI = "Lib/Translator/Uri";
    public static final String SETUPKEY_TEXT_TRANSLATOR_URI = "Lib/Translator/TextUri";
    public static final String SETUPKEY_TRANSLATOR_STREAM_GAINS = "Lib/Translator/StreamGains";
    public static final String SETUPKEY_TROUTER_BROKERED_SOCKET_ID = "*Lib/Trouter/BrokeredSocketId";
    public static final String SETUPKEY_TROUTER_BROKERED_SOCKET_TASK_ENTRY = "*Lib/Trouter/BrokeredSocketTaskEntry";
    public static final String SETUPKEY_TROUTER_BROKERED_SOCKET_TASK_NAME = "*Lib/Trouter/BrokeredSocketTaskName";
    public static final String SETUPKEY_TROUTER_CONNECTION_CACHE = "Lib/Trouter/ConnectionCache";
    public static final String SETUPKEY_TROUTER_MAX_RECONNECT_COUNT = "*Lib/Trouter/MaxReconnectCount";
    public static final String SETUPKEY_TROUTER_SUSPENDED_STATE_PING_CONFIGURATION = "*Lib/Trouter/SuspendedStatePingConfiguration";
    public static final String SETUPKEY_UPDATE_INBOX_MESSAGE_ID_METHOD = "Lib/Conversation/UpdateInboxMessageIDMethod";
    public static final String SETUPKEY_VIDEO_ADVERTPOLICY = "Lib/Video/AdvertPolicy";
    public static final String SETUPKEY_VIDEO_AUTOSEND = "Lib/Video/AutoSend";
    public static final String SETUPKEY_VIDEO_DEVICE = "Lib/Video/Device";
    public static final String SETUPKEY_VIDEO_DEVICE_PATH = "Lib/Video/DevicePath";
    public static final String SETUPKEY_VIDEO_DISABLE = "*Lib/Video/Disable";
    public static final String SETUPKEY_VIDEO_RECVPOLICY = "Lib/Video/RecvPolicy";
    public static final int SKYLIB_CONVERSATION_MAX_TOPIC_SIZE = 256;
    public static final int SKYLIB_MESSAGE_MAX_BODY_SIZE = 8000;

    public Defines()
    {
    }
}
