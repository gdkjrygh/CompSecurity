// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import java.util.Map;
import org.json.JSONArray;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener

public interface Mdx
{
    public static final class Events extends Enum
    {

        private static final Events $VALUES[];
        public static final Events mdx_discovery_devicefound;
        public static final Events mdx_discovery_devicelost;
        public static final Events mdx_discovery_remoteDeviceReady;
        public static final Events mdx_init;
        public static final Events mdx_initerror;
        public static final Events mdx_mdxstate;
        public static final Events mdx_pair_pairingdeleted;
        public static final Events mdx_pair_pairingresponse;
        public static final Events mdx_pair_regpairresponse;
        public static final Events mdx_session_message;
        public static final Events mdx_session_messagedelivered;
        public static final Events mdx_session_messagingerror;
        public static final Events mdx_session_sessionended;
        public static final Events mdx_session_startSessionResponse;
        protected String name;

        public static Events valueOf(String s)
        {
            return (Events)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/Mdx$Events, s);
        }

        public static Events[] values()
        {
            return (Events[])$VALUES.clone();
        }

        public final String getName()
        {
            return name;
        }

        static 
        {
            mdx_init = new Events("mdx_init", 0, "init");
            mdx_mdxstate = new Events("mdx_mdxstate", 1, "mdxstate");
            mdx_initerror = new Events("mdx_initerror", 2, "initerror");
            mdx_discovery_devicelost = new Events("mdx_discovery_devicelost", 3, "devicelost");
            mdx_discovery_remoteDeviceReady = new Events("mdx_discovery_remoteDeviceReady", 4, "remoteDeviceReady");
            mdx_discovery_devicefound = new Events("mdx_discovery_devicefound", 5, "devicefound");
            mdx_pair_pairingresponse = new Events("mdx_pair_pairingresponse", 6, "pairingresponse");
            mdx_pair_regpairresponse = new Events("mdx_pair_regpairresponse", 7, "regpairresponse");
            mdx_pair_pairingdeleted = new Events("mdx_pair_pairingdeleted", 8, "pairingdeleted");
            mdx_session_message = new Events("mdx_session_message", 9, "message");
            mdx_session_startSessionResponse = new Events("mdx_session_startSessionResponse", 10, "startSessionResponse");
            mdx_session_messagedelivered = new Events("mdx_session_messagedelivered", 11, "messagedelivered");
            mdx_session_messagingerror = new Events("mdx_session_messagingerror", 12, "messagingerror");
            mdx_session_sessionended = new Events("mdx_session_sessionended", 13, "sessionended");
            $VALUES = (new Events[] {
                mdx_init, mdx_mdxstate, mdx_initerror, mdx_discovery_devicelost, mdx_discovery_remoteDeviceReady, mdx_discovery_devicefound, mdx_pair_pairingresponse, mdx_pair_regpairresponse, mdx_pair_pairingdeleted, mdx_session_message, 
                mdx_session_startSessionResponse, mdx_session_messagedelivered, mdx_session_messagingerror, mdx_session_sessionended
            });
        }

        private Events(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }


    public static final String BOTH = "BOTH";
    public static final String COMPLETE = "COMPLETE";
    public static final String CONTROLLER = "CONTROLLER";
    public static final String MDX_ERR_NETWORK = "3";
    public static final String MDX_ERR_NOT_PAIRED = "12";
    public static final String MDX_ERR_NO_CTICKET = "13";
    public static final String MDX_ERR_PAIRING_NO_MATCH = "10";
    public static final String MDX_ERR_PORT = "2";
    public static final String MDX_ERR_SESSION_DECRYPTION_FAILED = "6";
    public static final String MDX_ERR_SESSION_INVALID_HMAC = "5";
    public static final String MDX_ERR_SESSION_INVALID_SID = "11";
    public static final String MDX_ERR_SSDP = "1";
    public static final String MDX_ERR_VERSION = "4";
    public static final int MDX_LAUNCHED = 1;
    public static final int MDX_NOTLAUNCHED = 0;
    public static final String MDX_PAIRING_ALREADY_PAIRED = "31";
    public static final String MDX_PAIRING_CONTROLLER_CTICKET_CORRUPTED = "22";
    public static final String MDX_PAIRING_CONTROLLER_CTICKET_EXPIRED = "21";
    public static final String MDX_PAIRING_CONTROLLER_HMAC_FAILURE = "20";
    public static final String MDX_PAIRING_INVALID_CONTROLLER_REQUEST = "10";
    public static final String MDX_PAIRING_NETWORK_ERROR = "99";
    public static final String MDX_PAIRING_NOT_PAIRING = "30";
    public static final String MDX_PAIRING_NO_ERROR = "0";
    public static final String MDX_PAIRING_SERVER_ERROR = "11";
    public static final String MDX_PAIRING_SERVER_NOT_REACHABLE = "13";
    public static final String MDX_PAIRING_TARGET_ERROR = "12";
    public static final String MDX_PAIRING_UNKNOWN_VERSION = "1";
    public static final String MDX_PAIRING_USER_MISMATCH = "USER_MISMATCH";
    public static final String MDX_PAIRING_USER_PAIRING_FAILED = "PAIRING_FAILED";
    public static final String MDX_REGISTRATION_ALREADY_REGISTERED = "41";
    public static final int MDX_REGISTRATION_DEFAULT_PIN = 2;
    public static final int MDX_REGISTRATION_DISABLED = 0;
    public static final int MDX_REGISTRATION_ENABLED = 1;
    public static final String MDX_REGISTRATION_NOT_REGISTERING = "40";
    public static final String MDX_REGISTRATION_PAIRING_IN_PROGRESS = "42";
    public static final String MDX_REGISTRATION_PIN_MISMATCH = "43";
    public static final String MDX_SESSION_DECRYPTION_FAILED = "6";
    public static final String MDX_SESSION_INVALID_HMAC = "5";
    public static final String MDX_SESSION_INVALID_NONCE = "4";
    public static final String MDX_SESSION_INVALID_SID = "11";
    public static final String MDX_SESSION_NETWORK_ERROR = "10";
    public static final String MDX_SESSION_UNKNOWN_RECEIVER = "3";
    public static final String MDX_SESSION_UNKNOWN_RECEIVER_USERID = "9";
    public static final String MDX_SESSION_UNKNOWN_SENDER = "2";
    public static final String MDX_SESSION_UNKNOWN_SENDER_USERID = "8";
    public static final String MDX_SESSION_UNKNOWN_VERSION = "1";
    public static final String NAME = "mdx";
    public static final String PATH = "nrdp.mdx";
    public static final String TARGET = "TARGET";

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void clearDeviceMap();

    public abstract void configure(Map map);

    public abstract void exit();

    public abstract void init(Map map, boolean flag, JSONArray jsonarray);

    public abstract void removeEventListener(String s, EventListener eventlistener);
}
