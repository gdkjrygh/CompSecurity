// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


public class Constants
{

    public static final String ACCUMULATED_ACTIVE_USER_SESSION_TIME_KEY = "accumulatedActiveUserSessionTime";
    public static final String ACCUMULATED_APPLICATION_SESSION_TIME_KEY = "accumulatedApplicationSessionTime";
    public static final String ACCUMULATED_BACKGROUND_TIME_KEY = "accumulatedBackgroundTime";
    public static final String ACCUMULATED_FOREGROUND_TIME_KEY = "accumulatedForegroundTime";
    public static final String ACCUMULATED_INACTIVE_TIME_KEY = "accumulatedInactiveTime";
    public static final String ACCUMULATED_USER_SESSION_TIME_KEY = "accumulatedUserSessionTime";
    public static final String ACTIVE_USER_SESSION_COUNT_KEY = "activeUserSessionCount";
    public static final String ANDROID_AD_ID_SUFFIX = "-cs23";
    public static final String ANDROID_ID_SUFFIX = "-cs32";
    public static final String APPLICATION_SESSION_COUNT_KEY = "applicationSessionCountKey";
    public static final String CACHE_DROPPED_MEASUREMENTS = "CACHE_DROPPED_MEASUREMENTS";
    public static final int CACHE_EXPIRY_DAYS = 31;
    public static final String CACHE_FILENAME = "cs_cache_";
    public static final long CACHE_FLUSHING_INTERVAL = 0L;
    public static final int CACHE_MAX_BATCH_SIZE = 100;
    public static final int CACHE_MAX_FLUSHES_INAROW = 10;
    public static final int CACHE_MAX_SIZE = 2000;
    public static final int CACHE_MIN_SECS_ONLINE = 30;
    public static final int CACHE_WAIT_MINUTES = 30;
    public static final String CENSUS_URL = "http://b.scorecardresearch.com/p2?";
    public static final String CENSUS_URL_SECURE = "https://sb.scorecardresearch.com/p2?";
    public static final String COLD_START_COUNT_KEY = "coldStartCount";
    public static final String CONNECTIVITY_MOBILE_MARKER = "|||cs_3g|||";
    public static final String CROSS_PUBLISHER_ID_KEY = "crossPublisherId";
    public static final String CURRENT_VERSION_KEY = "currentVersion";
    public static boolean DEBUG = false;
    public static final int DEFAULT_AUTOUPDATE_INTERVAL_IN_SECONDS = 60;
    public static final String DEFAULT_BACKGROUND_PAGE_NAME = "background";
    public static final String DEFAULT_FOREGROUND_PAGE_NAME = "foreground";
    public static final String DEFAULT_START_PAGE_NAME = "start";
    public static final int EVENTS_LIMIT_PER_DAY = 6000;
    public static final int EVENTS_LIMIT_PER_SECOND = 20;
    public static final String FIRST_INSTALL_ID_KEY = "firstInstallId";
    public static final String FLAG_INSTRUMENTED_ACTIVITY_IMPLEMENTED = "instrumented_activity";
    public static final String FOREGROUND_TRANSITION_COUNT_KEY = "foregroundTransitionsCount";
    public static final String GENERATED_ID_SUFFIX = "-cs72";
    public static final String GENESIS_KEY = "genesis";
    public static final String HAS_GOOGLE_PLAY_STORE_KEY = "hasGooglePlayStore";
    public static final String INSTALL_ID_KEY = "installId";
    public static final int KEEPALIVE_INACCURACY_MS = 1000;
    public static final int KEEPALIVE_INTERVAL_MS = 0x5265c00;
    public static final int KEEPALIVE_INTERVAL_MS_AFTER_FOREGROUND = 3000;
    public static final String LABELS_ORDER[] = {
        "c1", "c2", "ns_site", "ns_vsite", "ns_ap_an", "ns_ap_pn", "ns_ap_pv", "c12", "name", "ns_ak", 
        "ns_ns_ap_hw", "ns_ap_ni", "ns_ap_ec", "ns_ap_ev", "ns_ap_device", "ns_ap_id", "ns_ap_csf", "ns_ap_bi", "ns_ap_pfm", "ns_ap_pfv", 
        "ns_ap_ver", "ns_ap_sv", "ns_ap_cv", "ns_type", "ns_radio", "ns_nc", "ns_ap_ui", "ns_ap_gs", "ns_st_sv", "ns_st_pv", 
        "ns_st_id", "ns_st_ec", "ns_st_sp", "ns_st_sq", "ns_st_cn", "ns_st_ev", "ns_st_po", "ns_st_cl", "ns_st_el", "ns_st_pb", 
        "ns_st_hc", "ns_st_mp", "ns_st_mv", "ns_st_pn", "ns_st_tp", "ns_st_pt", "ns_st_pa", "ns_st_ad", "ns_st_li", "ns_st_ci", 
        "ns_ap_jb", "ns_ap_res", "ns_ap_c12m", "ns_ap_install", "ns_ap_updated", "ns_ap_lastrun", "ns_ap_cs", "ns_ap_runs", "ns_ap_usage", "ns_ap_fg", 
        "ns_ap_ft", "ns_ap_dft", "ns_ap_bt", "ns_ap_dbt", "ns_ap_dit", "ns_ap_as", "ns_ap_das", "ns_ap_it", "ns_ap_uc", "ns_ap_aus", 
        "ns_ap_daus", "ns_ap_us", "ns_ap_dus", "ns_ap_ut", "ns_ap_oc", "ns_ap_uxc", "ns_ap_uxs", "ns_ap_lang", "ns_ap_miss", "ns_ts", 
        "ns_st_ca", "ns_st_cp", "ns_st_er", "ns_st_pe", "ns_st_ui", "ns_st_bc", "ns_st_bt", "ns_st_bp", "ns_st_pc", "ns_st_pp", 
        "ns_st_br", "ns_st_ub", "ns_st_vo", "ns_st_ws", "ns_st_pl", "ns_st_pr", "ns_st_ep", "ns_st_ty", "ns_st_ct", "ns_st_cs", 
        "ns_st_ge", "ns_st_st", "ns_st_dt", "ns_st_de", "ns_st_pu", "ns_st_cu", "ns_st_fee", "ns_ap_i1", "ns_ap_i2", "ns_ap_i3", 
        "ns_ap_i4", "ns_ap_i5", "ns_ap_i6", "c3", "c4", "c5", "c6", "c10", "c11", "c12", 
        "c13", "c14", "c15", "c16", "c7", "c8", "c9"
    };
    public static final String LAST_ACTIVE_USER_SESSION_TIMESTAMP_KEY = "lastActiveUserSessionTimestamp";
    public static final String LAST_APPLICATION_ACCUMULATION_TIMESTAMP_KEY = "lastApplicationAccumulationTimestamp";
    public static final String LAST_APPLICATION_SESSION_TIMESTAMP_KEY = "lastApplicationSessionTimestamp";
    public static final String LAST_SESSION_ACCUMULATION_TIMESTAMP_KEY = "lastSessionAccumulationTimestamp";
    public static final String LAST_TRANSMISSION_KEY = "lastTransmission";
    public static final String LAST_USER_INTERACTION_TIMESTAMP_KEY = "lastUserInteractionTimestamp";
    public static final String LAST_USER_SESSION_TIMESTAMP_KEY = "lastUserSessionTimestamp";
    public static final String MD5_RAW_CROSSPUBLISHER_ID_KEY = "md5RawCrossPublisherId";
    public static final int MINIMAL_AUTOUPDATE_INTERVAL = 60000;
    public static final String NETWORK_TYPE_LABEL_NAME = "ns_radio";
    public static final String OFFLINE_RECEIVER_URL = "http://udm.scorecardresearch.com/offline";
    public static final String OFFLINE_RECEIVER_URL_SECURE = "https://udm.scorecardresearch.com/offline";
    public static final String PAGE_NAME_LABEL = "name";
    public static final String PREVIOUS_GENESIS_KEY = "previousGenesis";
    public static final String PREVIOUS_VERSION_KEY = "previousVersion";
    public static final String RESPONSE_MASK = "OK";
    public static final byte RSA_PUBLIC_KEY[] = {
        48, -127, -97, 48, 13, 6, 9, 42, -122, 72, 
        -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, 
        -115, 0, 48, -127, -119, 2, -127, -127, 0, -12, 
        -7, -16, -107, -60, 106, -73, 6, 77, -72, -115, 
        66, -114, -44, -4, -20, -119, 75, 55, -66, -84, 
        48, -21, 52, 120, -97, 103, -73, 3, 7, -107, 
        45, 64, 32, -78, -80, -47, 108, 5, -119, -4, 
        72, -39, -101, 85, -127, 44, 21, 77, 50, 36, 
        -53, -91, 32, 36, 87, -85, 35, 56, -118, -44, 
        -77, 77, -15, 117, 65, 35, 65, -110, 71, -64, 
        -31, -118, -8, -57, -13, 21, -90, 110, -110, -118, 
        52, -88, 11, 4, 48, -4, 16, -26, -102, 44, 
        -65, 66, 93, -112, 23, 84, 26, 18, -100, -124, 
        -7, 58, -8, -42, 38, 15, -95, -37, -29, -126, 
        -28, -89, -65, -38, 66, 117, 94, 91, 59, -33, 
        0, -12, 50, 76, -108, 121, -63, 2, 3, 1, 
        0, 1
    };
    public static final String RUNS_COUNT_KEY = "runs";
    public static final String SDK_VERSION = "2.1409.23";
    public static final String SERIAL_NUMBER_SUFFIX = "-cs31";
    public static final long SESSION_INACTIVE_PERIOD = 0x1b7740L;
    public static final String TOTAL_BACKGROUND_TIME_KEY = "totalBackgroundTime";
    public static final String TOTAL_FOREGROUND_TIME_KEY = "totalForegroundTime";
    public static final String TOTAL_INACTIVE_TIME_KEY = "totalInactiveTime";
    public static final int URL_LENGTH_LIMIT = 4096;
    public static final String USER_INTERACTION_COUNT_KEY = "userInteractionCount";
    public static final String USER_SESSION_COUNT_KEY = "userSessionCount";
    public static final long USER_SESSION_INACTIVE_PERIOD = 0x493e0L;
    public static final String VID_KEY = "vid";

    public Constants()
    {
    }

    static 
    {
        DEBUG = false;
    }
}
