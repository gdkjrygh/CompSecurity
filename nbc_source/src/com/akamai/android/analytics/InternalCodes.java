// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            CSMAKEYS

class InternalCodes
{
    public static final class PARSER_EVENT extends Enum
    {

        public static final PARSER_EVENT DEBUG;
        private static final PARSER_EVENT ENUM$VALUES[];
        public static final PARSER_EVENT GENERAL_PARSING_ERROR;
        public static final PARSER_EVENT LOG_LINE_METRICS_NOT_DEFINED;
        public static final PARSER_EVENT MALFORMED_URL_EXCEPTION;
        public static final PARSER_EVENT NO_BEACON_ID;
        public static final PARSER_EVENT NO_HOST_DATA;
        public static final PARSER_EVENT NO_STAT_DATA;
        public static final PARSER_EVENT PARSER_CONFIG_EXCEPTION;
        public static final PARSER_EVENT SAX_EXCEPTION;
        public static final PARSER_EVENT XML_LOADED;
        public static final PARSER_EVENT XML_NOT_LOADED;

        public static PARSER_EVENT valueOf(String s)
        {
            return (PARSER_EVENT)Enum.valueOf(com/akamai/android/analytics/InternalCodes$PARSER_EVENT, s);
        }

        public static PARSER_EVENT[] values()
        {
            PARSER_EVENT aparser_event[] = ENUM$VALUES;
            int i = aparser_event.length;
            PARSER_EVENT aparser_event1[] = new PARSER_EVENT[i];
            System.arraycopy(aparser_event, 0, aparser_event1, 0, i);
            return aparser_event1;
        }

        static 
        {
            XML_LOADED = new PARSER_EVENT("XML_LOADED", 0);
            XML_NOT_LOADED = new PARSER_EVENT("XML_NOT_LOADED", 1);
            PARSER_CONFIG_EXCEPTION = new PARSER_EVENT("PARSER_CONFIG_EXCEPTION", 2);
            MALFORMED_URL_EXCEPTION = new PARSER_EVENT("MALFORMED_URL_EXCEPTION", 3);
            SAX_EXCEPTION = new PARSER_EVENT("SAX_EXCEPTION", 4);
            GENERAL_PARSING_ERROR = new PARSER_EVENT("GENERAL_PARSING_ERROR", 5);
            NO_BEACON_ID = new PARSER_EVENT("NO_BEACON_ID", 6);
            NO_HOST_DATA = new PARSER_EVENT("NO_HOST_DATA", 7);
            NO_STAT_DATA = new PARSER_EVENT("NO_STAT_DATA", 8);
            LOG_LINE_METRICS_NOT_DEFINED = new PARSER_EVENT("LOG_LINE_METRICS_NOT_DEFINED", 9);
            DEBUG = new PARSER_EVENT("DEBUG", 10);
            ENUM$VALUES = (new PARSER_EVENT[] {
                XML_LOADED, XML_NOT_LOADED, PARSER_CONFIG_EXCEPTION, MALFORMED_URL_EXCEPTION, SAX_EXCEPTION, GENERAL_PARSING_ERROR, NO_BEACON_ID, NO_HOST_DATA, NO_STAT_DATA, LOG_LINE_METRICS_NOT_DEFINED, 
                DEBUG
            });
        }

        private PARSER_EVENT(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PLAYERROR extends Enum
    {

        public static final PLAYERROR CONNECTION_CLOSED;
        private static final PLAYERROR ENUM$VALUES[];
        public static final PLAYERROR PLAYER_ERROR;

        public static PLAYERROR valueOf(String s)
        {
            return (PLAYERROR)Enum.valueOf(com/akamai/android/analytics/InternalCodes$PLAYERROR, s);
        }

        public static PLAYERROR[] values()
        {
            PLAYERROR aplayerror[] = ENUM$VALUES;
            int i = aplayerror.length;
            PLAYERROR aplayerror1[] = new PLAYERROR[i];
            System.arraycopy(aplayerror, 0, aplayerror1, 0, i);
            return aplayerror1;
        }

        static 
        {
            CONNECTION_CLOSED = new PLAYERROR("CONNECTION_CLOSED", 0);
            PLAYER_ERROR = new PLAYERROR("PLAYER_ERROR", 1);
            ENUM$VALUES = (new PLAYERROR[] {
                CONNECTION_CLOSED, PLAYER_ERROR
            });
        }

        private PLAYERROR(String s, int i)
        {
            super(s, i);
        }
    }

    public static class PluginDefaults
    {

        static final int CONFIG_POLLING_COUNT = 40;
        static final int CONFIG_POLLING_INTERVAL = 500;
        static final int DEFAULT_NO_START_TIME = 0xdbba0;
        static final CSMAKEYS iSLineKeysForPending[];

        static 
        {
            iSLineKeysForPending = (new CSMAKEYS[] {
                CSMAKEYS.hostname, CSMAKEYS.appname, CSMAKEYS.streamname, CSMAKEYS.port, CSMAKEYS.protocol, CSMAKEYS.playerreferrer, CSMAKEYS.pageurl, CSMAKEYS.pagereferrer, CSMAKEYS.pagehost, CSMAKEYS.pagereferrerhost, 
                CSMAKEYS.useragent, CSMAKEYS.playerversion, CSMAKEYS.playertype, CSMAKEYS.os, CSMAKEYS.format, CSMAKEYS.connecttime, CSMAKEYS.bufferingtime, CSMAKEYS.startuptime, CSMAKEYS.streamlength, CSMAKEYS.bytestotal, 
                CSMAKEYS.encodedfps, CSMAKEYS.browser, CSMAKEYS.browsersize, CSMAKEYS.videosize, CSMAKEYS.streamurl, CSMAKEYS.deliverytype, CSMAKEYS.pluginversion, CSMAKEYS.beaconversion, CSMAKEYS.bucketlength, CSMAKEYS.serverip, 
                CSMAKEYS.playerformat, CSMAKEYS.cdn, CSMAKEYS.connectivity, CSMAKEYS.segmentlength, CSMAKEYS.ismediaencrypted, CSMAKEYS.isallowcache, CSMAKEYS.outlierstartuptime, CSMAKEYS.startupwaittime, CSMAKEYS.clientdns, CSMAKEYS.currentclocktime, 
                CSMAKEYS.adsession, CSMAKEYS.adcount, CSMAKEYS.adplayclocktime, CSMAKEYS.adstartcount, CSMAKEYS.adabandoncount, CSMAKEYS.fullos, CSMAKEYS.isfirsttitle
            });
        }

        public PluginDefaults()
        {
        }
    }

    public static final class STATE_EVENT extends Enum
    {

        public static final STATE_EVENT DEBUG;
        private static final STATE_EVENT ENUM$VALUES[];
        public static final STATE_EVENT ERROR;
        public static final STATE_EVENT FIRSTPLAY;
        public static final STATE_EVENT INIT;
        public static final STATE_EVENT INTERNALERROR;
        public static final STATE_EVENT STOP;

        public static STATE_EVENT valueOf(String s)
        {
            return (STATE_EVENT)Enum.valueOf(com/akamai/android/analytics/InternalCodes$STATE_EVENT, s);
        }

        public static STATE_EVENT[] values()
        {
            STATE_EVENT astate_event[] = ENUM$VALUES;
            int i = astate_event.length;
            STATE_EVENT astate_event1[] = new STATE_EVENT[i];
            System.arraycopy(astate_event, 0, astate_event1, 0, i);
            return astate_event1;
        }

        static 
        {
            DEBUG = new STATE_EVENT("DEBUG", 0);
            INTERNALERROR = new STATE_EVENT("INTERNALERROR", 1);
            INIT = new STATE_EVENT("INIT", 2);
            FIRSTPLAY = new STATE_EVENT("FIRSTPLAY", 3);
            STOP = new STATE_EVENT("STOP", 4);
            ERROR = new STATE_EVENT("ERROR", 5);
            ENUM$VALUES = (new STATE_EVENT[] {
                DEBUG, INTERNALERROR, INIT, FIRSTPLAY, STOP, ERROR
            });
        }

        private STATE_EVENT(String s, int i)
        {
            super(s, i);
        }
    }


    public static int ADENDEDNORMALLY = 0;
    public static int ADENDEDWITHAPPCLOSE = 2;
    public static int ADENDEDWITHERROR = 3;
    public static int ADENDEDWITHUSERSTOP = 1;
    public static String ADPOSITIONKEY = "adtype";
    public static int ADTYPE_MIDROLL = 1;
    public static int ADTYPE_POSTROLL = 2;
    public static int ADTYPE_PREROLL = 0;
    public static String DEFAULT_ENCODEDPARAMSEPARATOR = "*@*";
    public static int DEFAULT_HEARTBEAT_INTERVAL = 60;
    public static int DEFAULT_ISSESSIONWITHREBUFFER_LIMIT = 500;
    public static int DEFAULT_LOG_INTERVAL = 300;
    public static int DEFAULT_SECONDARYLOGTIME = 5;
    public static String DEFAULT_URLPARAM_SEPERATOR = "~";
    public static int FEEDBACK_LIMIT = 3;
    public static String SETDATA_FEEDBACK_PFX = "feedback";
    public static String SETDATA_SOCIAL_SHARE_PFX = "socialshare";
    public static int SOCIAL_SHARE_LIMIT = 1;
    public static String debugTAG = "AKADEBUG";
    public static int isViewMinimumPlayTime = 5000;
    public static String logLineTAG = "AKALOGLINE";
    public static String mainThreadName = "AkamaiPluginMainThread";
    public static String pluginVersion = "2.6.3";
    public static int visitTimeOut = 0x36ee80;

    InternalCodes()
    {
    }

}
