// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;


// Referenced classes of package com.qihoo.security.support:
//            ScreenAnalytics

public static final class a extends Enum
{

    public static final FLOAT_VIEW_PROCESS APK_CLEAR;
    public static final FLOAT_VIEW_PROCESS APK_MANAGER;
    public static final FLOAT_VIEW_PROCESS APP_BOX;
    public static final FLOAT_VIEW_PROCESS APP_INSTALLED;
    public static final FLOAT_VIEW_PROCESS APP_MGR_MAIN;
    public static final FLOAT_VIEW_PROCESS APP_MOVE;
    public static final FLOAT_VIEW_PROCESS BLOCK_BLACK_LIST;
    public static final FLOAT_VIEW_PROCESS BLOCK_CALL_RECORDS;
    public static final FLOAT_VIEW_PROCESS BLOCK_MAIN;
    public static final FLOAT_VIEW_PROCESS BLOCK_SMS_RECORDS;
    public static final FLOAT_VIEW_PROCESS FEED_BACK;
    public static final FLOAT_VIEW_PROCESS FLOAT_VIEW_PROCESS;
    public static final FLOAT_VIEW_PROCESS FLOAT_VIEW_SWITCH;
    public static final FLOAT_VIEW_PROCESS FULL_SCAN;
    public static final FLOAT_VIEW_PROCESS LEAK_MAIN;
    public static final FLOAT_VIEW_PROCESS LOCK_SCREEN_CLEAR;
    public static final FLOAT_VIEW_PROCESS MAIN;
    public static final FLOAT_VIEW_PROCESS MAIN_DRAWER;
    public static final FLOAT_VIEW_PROCESS MALWARE_LIST;
    public static final FLOAT_VIEW_PROCESS MALWARE_PROTECTION;
    public static final FLOAT_VIEW_PROCESS MALWARE_SCAN;
    public static final FLOAT_VIEW_PROCESS MEMORY_BOOSTER;
    public static final FLOAT_VIEW_PROCESS MY_DATA;
    public static final FLOAT_VIEW_PROCESS NET_TRAFFIC_FIREWALL;
    public static final FLOAT_VIEW_PROCESS NET_TRAFFIC_MONITOR;
    public static final FLOAT_VIEW_PROCESS NET_TRAFFIC_TRAFFIC_LIST;
    public static final FLOAT_VIEW_PROCESS PHONE_CHECKUP_MAIN;
    public static final FLOAT_VIEW_PROCESS PHONE_CLEAN;
    public static final FLOAT_VIEW_PROCESS PRIVACY_APP_LOCK;
    public static final FLOAT_VIEW_PROCESS PRIVACY_CLEAR;
    public static final FLOAT_VIEW_PROCESS PRIVACY_MAIN;
    public static final FLOAT_VIEW_PROCESS PRIVACY_SMS;
    public static final FLOAT_VIEW_PROCESS PROCESS_CLEAR;
    public static final FLOAT_VIEW_PROCESS PROCESS_CLEAR_WHITE_LIST;
    public static final FLOAT_VIEW_PROCESS PROTECTION_ALARM;
    public static final FLOAT_VIEW_PROCESS PROTECTION_ERASE_DATA;
    public static final FLOAT_VIEW_PROCESS PROTECTION_LOCATION_TRACKING;
    public static final FLOAT_VIEW_PROCESS PROTECTION_LOCK_PHONE;
    public static final FLOAT_VIEW_PROCESS PROTECTION_MAIN;
    public static final FLOAT_VIEW_PROCESS PROTECTION_SMS_WHEN_SIM_CARD_CHANGE;
    public static final FLOAT_VIEW_PROCESS RESIDUAL_FILE;
    public static final FLOAT_VIEW_PROCESS SETTINGS;
    public static final FLOAT_VIEW_PROCESS SETTINGS_ABOUT_US;
    public static final FLOAT_VIEW_PROCESS SETTINGS_ACCOUNT;
    public static final FLOAT_VIEW_PROCESS SETTINGS_FLOAT_VIEW;
    public static final FLOAT_VIEW_PROCESS SETTINGS_LOCALE;
    public static final FLOAT_VIEW_PROCESS SETTINGS_SHAKE_PHONE;
    public static final FLOAT_VIEW_PROCESS SHIELD_ACCESS_CALLLOG;
    public static final FLOAT_VIEW_PROCESS SHIELD_ACCESS_CONTACTS;
    public static final FLOAT_VIEW_PROCESS SHIELD_ACCESS_LOCATION;
    public static final FLOAT_VIEW_PROCESS SHIELD_ACCESS_PHONEINFO;
    public static final FLOAT_VIEW_PROCESS SHIELD_ACCESS_SMS;
    public static final FLOAT_VIEW_PROCESS SHIELD_CALL_PHONE;
    public static final FLOAT_VIEW_PROCESS SHIELD_MAIN;
    public static final FLOAT_VIEW_PROCESS SHIELD_SEND_SMS;
    public static final FLOAT_VIEW_PROCESS SYSTEM_SETTINGS_CLEAN_DATA;
    public static final FLOAT_VIEW_PROCESS SYS_PROCESS_CLEAR;
    public static final FLOAT_VIEW_PROCESS TRAFFIC_TAB;
    public static final FLOAT_VIEW_PROCESS TRASH_CLEAR;
    public static final FLOAT_VIEW_PROCESS TRASH_FILE_CLEAR;
    public static final FLOAT_VIEW_PROCESS USER_CENTER;
    public static final FLOAT_VIEW_PROCESS USER_LOGIN;
    public static final FLOAT_VIEW_PROCESS USER_PROCESS_CLEAR;
    public static final FLOAT_VIEW_PROCESS USER_REGISTER;
    private static final FLOAT_VIEW_PROCESS b[];
    private final String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/qihoo/security/support/ScreenAnalytics$AnalyticsScreen, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public String getName()
    {
        return a;
    }

    static 
    {
        MAIN = new <init>("MAIN", 0, "\u624B\u673A\u4F53\u68C0");
        MAIN_DRAWER = new <init>("MAIN_DRAWER", 1, "\u4FA7\u8FB9\u680F");
        PHONE_CHECKUP_MAIN = new <init>("PHONE_CHECKUP_MAIN", 2, "\u4F53\u68C0\u626B\u63CF\u7ED3\u679C\u9875");
        PHONE_CLEAN = new <init>("PHONE_CLEAN", 3, "\u624B\u673A\u6E05\u7406");
        MEMORY_BOOSTER = new <init>("MEMORY_BOOSTER", 4, "\u5185\u5B58\u4F18\u5316");
        APP_MGR_MAIN = new <init>("APP_MGR_MAIN", 5, "\u8F6F\u4EF6\u7BA1\u5BB6");
        MALWARE_SCAN = new <init>("MALWARE_SCAN", 6, "\u75C5\u6BD2\u626B\u63CF");
        SHIELD_MAIN = new <init>("SHIELD_MAIN", 7, "\u9690\u79C1\u987E\u95EE");
        FEED_BACK = new <init>("FEED_BACK", 8, "\u53CD\u9988");
        BLOCK_MAIN = new <init>("BLOCK_MAIN", 9, "\u9A9A\u6270\u62E6\u622A");
        TRAFFIC_TAB = new <init>("TRAFFIC_TAB", 10, "\u6D41\u91CF\u76D1\u63A7");
        PRIVACY_MAIN = new <init>("PRIVACY_MAIN", 11, "\u9690\u79C1\u7A7A\u95F4");
        USER_CENTER = new <init>("USER_CENTER", 12, "\u7528\u6237\u4E2D\u5FC3");
        SETTINGS = new <init>("SETTINGS", 13, "\u8BBE\u7F6E");
        MY_DATA = new <init>("MY_DATA", 14, "\u6211\u7684\u6570\u636E");
        TRASH_CLEAR = new <init>("TRASH_CLEAR", 15, "\u4F53\u68C0\u5783\u573E\u6E05\u7406");
        PROCESS_CLEAR = new <init>("PROCESS_CLEAR", 16, "\u5185\u5B58\u6E05\u7406");
        PROTECTION_MAIN = new <init>("PROTECTION_MAIN", 17, "\u624B\u673A\u9632\u76D7");
        TRASH_FILE_CLEAR = new <init>("TRASH_FILE_CLEAR", 18, "\u5783\u573E\u6587\u4EF6");
        PRIVACY_CLEAR = new <init>("PRIVACY_CLEAR", 19, "\u9690\u79C1\u75D5\u8FF9");
        RESIDUAL_FILE = new <init>("RESIDUAL_FILE", 20, "\u5378\u8F7D\u6B8B\u7559");
        APK_CLEAR = new <init>("APK_CLEAR", 21, "\u65E0\u7528\u5B89\u88C5\u5305");
        USER_PROCESS_CLEAR = new <init>("USER_PROCESS_CLEAR", 22, "\u7528\u6237\u7A0B\u5E8F");
        SYS_PROCESS_CLEAR = new <init>("SYS_PROCESS_CLEAR", 23, "\u7CFB\u7EDF\u7A0B\u5E8F");
        PROCESS_CLEAR_WHITE_LIST = new <init>("PROCESS_CLEAR_WHITE_LIST", 24, "\u767D\u540D\u5355");
        LOCK_SCREEN_CLEAR = new <init>("LOCK_SCREEN_CLEAR", 25, "\u9501\u5C4F\u7701\u7535");
        APP_BOX = new <init>("APP_BOX", 26, "APPBOX");
        APP_INSTALLED = new <init>("APP_INSTALLED", 27, "\u8F6F\u4EF6\u5378\u8F7D");
        APK_MANAGER = new <init>("APK_MANAGER", 28, "\u5B89\u88C5\u5305\u7BA1\u7406");
        APP_MOVE = new <init>("APP_MOVE", 29, "\u8F6F\u4EF6\u642C\u5BB6");
        MALWARE_LIST = new <init>("MALWARE_LIST", 30, "\u6076\u610F\u8F6F\u4EF6");
        LEAK_MAIN = new <init>("LEAK_MAIN", 31, "\u6F0F\u6D1E");
        MALWARE_PROTECTION = new <init>("MALWARE_PROTECTION", 32, "\u5B9E\u65F6\u4FDD\u62A4");
        FULL_SCAN = new <init>("FULL_SCAN", 33, "\u5168\u76D8\u626B\u63CF");
        SHIELD_CALL_PHONE = new <init>("SHIELD_CALL_PHONE", 34, "\u6253\u7535\u8BDD");
        SHIELD_SEND_SMS = new <init>("SHIELD_SEND_SMS", 35, "\u53D1\u9001\u77ED\u4FE1");
        SHIELD_ACCESS_CONTACTS = new <init>("SHIELD_ACCESS_CONTACTS", 36, "\u8BFB\u5199\u8054\u7CFB\u4EBA");
        SHIELD_ACCESS_SMS = new <init>("SHIELD_ACCESS_SMS", 37, "\u8BFB\u5199\u77ED\u4FE1");
        SHIELD_ACCESS_CALLLOG = new <init>("SHIELD_ACCESS_CALLLOG", 38, "\u8BFB\u5199\u901A\u8BDD\u8BB0\u5F55");
        SHIELD_ACCESS_LOCATION = new <init>("SHIELD_ACCESS_LOCATION", 39, "\u8BFB\u53D6\u624B\u673A\u4F4D\u7F6E");
        SHIELD_ACCESS_PHONEINFO = new <init>("SHIELD_ACCESS_PHONEINFO", 40, "\u8BFB\u53D6\u8BBE\u5907\u8BC6\u522B\u4FE1\u606F");
        BLOCK_CALL_RECORDS = new <init>("BLOCK_CALL_RECORDS", 41, "\u9A9A\u6270\u7535\u8BDD");
        BLOCK_SMS_RECORDS = new <init>("BLOCK_SMS_RECORDS", 42, "\u5783\u573E\u77ED\u4FE1");
        BLOCK_BLACK_LIST = new <init>("BLOCK_BLACK_LIST", 43, "\u9ED1\u540D\u5355");
        NET_TRAFFIC_MONITOR = new <init>("NET_TRAFFIC_MONITOR", 44, "\u6D41\u91CF\u76D1\u63A7");
        NET_TRAFFIC_FIREWALL = new <init>("NET_TRAFFIC_FIREWALL", 45, "\u8054\u7F51\u9632\u706B\u5899");
        NET_TRAFFIC_TRAFFIC_LIST = new <init>("NET_TRAFFIC_TRAFFIC_LIST", 46, "\u7EDF\u8BA1\u6392\u884C");
        PRIVACY_SMS = new <init>("PRIVACY_SMS", 47, "\u9690\u79C1\u77ED\u4FE1");
        PRIVACY_APP_LOCK = new <init>("PRIVACY_APP_LOCK", 48, "\u7A0B\u5E8F\u9501");
        SYSTEM_SETTINGS_CLEAN_DATA = new <init>("SYSTEM_SETTINGS_CLEAN_DATA", 49, "\u7CFB\u7EDF\u8BBE\u7F6E\u6E05\u7406\u6570\u636E");
        USER_REGISTER = new <init>("USER_REGISTER", 50, "\u6CE8\u518C");
        USER_LOGIN = new <init>("USER_LOGIN", 51, "\u767B\u5F55");
        PROTECTION_SMS_WHEN_SIM_CARD_CHANGE = new <init>("PROTECTION_SMS_WHEN_SIM_CARD_CHANGE", 52, "\u6362\u5361\u77ED\u4FE1\u901A\u77E5");
        PROTECTION_ERASE_DATA = new <init>("PROTECTION_ERASE_DATA", 53, "\u5220\u9664\u6570\u636E");
        PROTECTION_LOCATION_TRACKING = new <init>("PROTECTION_LOCATION_TRACKING", 54, "\u8FFD\u8E2A\u624B\u673A\u4F4D\u7F6E");
        PROTECTION_ALARM = new <init>("PROTECTION_ALARM", 55, "\u54CD\u94C3\u62A5\u8B66");
        PROTECTION_LOCK_PHONE = new <init>("PROTECTION_LOCK_PHONE", 56, "\u9501\u5B9A\u624B\u673A");
        SETTINGS_LOCALE = new <init>("SETTINGS_LOCALE", 57, "\u8BED\u8A00\u8BBE\u7F6E");
        SETTINGS_ABOUT_US = new <init>("SETTINGS_ABOUT_US", 58, "\u5173\u4E8E");
        SETTINGS_FLOAT_VIEW = new <init>("SETTINGS_FLOAT_VIEW", 59, "\u6D6E\u7A97");
        SETTINGS_SHAKE_PHONE = new <init>("SETTINGS_SHAKE_PHONE", 60, "\u6447\u4E00\u6447");
        SETTINGS_ACCOUNT = new <init>("SETTINGS_ACCOUNT", 61, "\u8D26\u6237\u8BBE\u7F6E");
        FLOAT_VIEW_SWITCH = new <init>("FLOAT_VIEW_SWITCH", 62, "\u6D6E\u7A97\u5F00\u5173");
        FLOAT_VIEW_PROCESS = new <init>("FLOAT_VIEW_PROCESS", 63, "\u6D6E\u7A97\u5173\u95ED\u8FDB\u7A0B");
        b = (new b[] {
            MAIN, MAIN_DRAWER, PHONE_CHECKUP_MAIN, PHONE_CLEAN, MEMORY_BOOSTER, APP_MGR_MAIN, MALWARE_SCAN, SHIELD_MAIN, FEED_BACK, BLOCK_MAIN, 
            TRAFFIC_TAB, PRIVACY_MAIN, USER_CENTER, SETTINGS, MY_DATA, TRASH_CLEAR, PROCESS_CLEAR, PROTECTION_MAIN, TRASH_FILE_CLEAR, PRIVACY_CLEAR, 
            RESIDUAL_FILE, APK_CLEAR, USER_PROCESS_CLEAR, SYS_PROCESS_CLEAR, PROCESS_CLEAR_WHITE_LIST, LOCK_SCREEN_CLEAR, APP_BOX, APP_INSTALLED, APK_MANAGER, APP_MOVE, 
            MALWARE_LIST, LEAK_MAIN, MALWARE_PROTECTION, FULL_SCAN, SHIELD_CALL_PHONE, SHIELD_SEND_SMS, SHIELD_ACCESS_CONTACTS, SHIELD_ACCESS_SMS, SHIELD_ACCESS_CALLLOG, SHIELD_ACCESS_LOCATION, 
            SHIELD_ACCESS_PHONEINFO, BLOCK_CALL_RECORDS, BLOCK_SMS_RECORDS, BLOCK_BLACK_LIST, NET_TRAFFIC_MONITOR, NET_TRAFFIC_FIREWALL, NET_TRAFFIC_TRAFFIC_LIST, PRIVACY_SMS, PRIVACY_APP_LOCK, SYSTEM_SETTINGS_CLEAN_DATA, 
            USER_REGISTER, USER_LOGIN, PROTECTION_SMS_WHEN_SIM_CARD_CHANGE, PROTECTION_ERASE_DATA, PROTECTION_LOCATION_TRACKING, PROTECTION_ALARM, PROTECTION_LOCK_PHONE, SETTINGS_LOCALE, SETTINGS_ABOUT_US, SETTINGS_FLOAT_VIEW, 
            SETTINGS_SHAKE_PHONE, SETTINGS_ACCOUNT, FLOAT_VIEW_SWITCH, FLOAT_VIEW_PROCESS
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}
