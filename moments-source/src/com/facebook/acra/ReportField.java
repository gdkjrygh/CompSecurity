// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;


public final class ReportField extends Enum
{

    private static final ReportField $VALUES[];
    public static final ReportField ACRA_INTERNAL;
    public static final ReportField ACRA_REPORT_FILENAME;
    public static final ReportField ACRA_REPORT_TYPE;
    public static final ReportField ACTIVITY_LOG;
    public static final ReportField ANDROID_ID;
    public static final ReportField ANDROID_RUNTIME;
    public static final ReportField ANDROID_VERSION;
    public static final ReportField APP_INSTALL_TIME;
    public static final ReportField APP_UPGRADE_TIME;
    public static final ReportField APP_VERSION_CODE;
    public static final ReportField APP_VERSION_NAME;
    public static final ReportField ATTACHMENT_ORIGINAL_SIZE;
    public static final ReportField AVAILABLE_MEM_SIZE;
    public static final ReportField BRAND;
    public static final ReportField BUILD;
    public static final ReportField BUILD_HOST;
    public static final ReportField CRASH_CONFIGURATION;
    public static final ReportField CUSTOM_DATA;
    public static final ReportField DEVICE;
    public static final ReportField DEVICE_FEATURES;
    public static final ReportField DEVICE_ID;
    public static final ReportField DEVICE_UPTIME;
    public static final ReportField DISPLAY;
    public static final ReportField DROPBOX;
    public static final ReportField DUMPSYS_MEMINFO;
    public static final ReportField ENVIRONMENT;
    public static final ReportField EVENTSLOG;
    public static final ReportField EXCEPTION_CAUSE;
    public static final ReportField FILE_PATH;
    public static final ReportField IAB_OPEN_TIMES;
    public static final ReportField INSTALLATION_ID;
    public static final ReportField IS_LOW_RAM_DEVICE;
    public static final ReportField IS_SILENT;
    public static final ReportField JAIL_BROKEN;
    public static final ReportField LARGE_MEM_HEAP;
    public static final ReportField LAST_ACTIVITY_LOGGED;
    public static final ReportField LAST_ACTIVITY_LOGGED_TIME;
    public static final ReportField LAST_URL_VISITED;
    public static final ReportField LAST_URL_VISITED_TIME;
    public static final ReportField LOGCAT;
    public static final ReportField MINIDUMP;
    public static final ReportField MINIDUMP_EXCLUDE_REASON;
    public static final ReportField OPEN_FD_COUNT;
    public static final ReportField OPEN_FD_HARD_LIMIT;
    public static final ReportField OPEN_FD_SOFT_LIMIT;
    public static final ReportField OS_VERSION;
    public static final ReportField PACKAGE_NAME;
    public static final ReportField PHONE_MODEL;
    public static final ReportField PROCESS_NAME;
    public static final ReportField PROCESS_NAME_BY_AMS;
    public static final ReportField PROCESS_UPTIME;
    public static final ReportField PRODUCT;
    public static final ReportField RADIOLOG;
    public static final ReportField REPORT_ID;
    public static final ReportField REPORT_LOAD_THROW;
    public static final ReportField RUNTIME_PERMISSIONS;
    public static final ReportField SERIAL;
    public static final ReportField SETTINGS_SECURE;
    public static final ReportField SETTINGS_SYSTEM;
    public static final ReportField SIGQUIT;
    public static final ReportField STACK_TRACE;
    public static final ReportField TIME_OF_CRASH;
    public static final ReportField TOTAL_MEM_SIZE;
    public static final ReportField UID;
    public static final ReportField UPLOADED_BY_PROCESS;
    public static final ReportField USER_APP_START_DATE;
    public static final ReportField USER_CRASH_DATE;
    public static final ReportField USER_EMAIL;
    public static final ReportField WEBVIEW_VERSION;

    private ReportField(String s, int i)
    {
        super(s, i);
    }

    public static ReportField valueOf(String s)
    {
        return (ReportField)Enum.valueOf(com/facebook/acra/ReportField, s);
    }

    public static ReportField[] values()
    {
        return (ReportField[])$VALUES.clone();
    }

    static 
    {
        ACRA_REPORT_TYPE = new ReportField("ACRA_REPORT_TYPE", 0);
        REPORT_ID = new ReportField("REPORT_ID", 1);
        ANDROID_ID = new ReportField("ANDROID_ID", 2);
        UID = new ReportField("UID", 3);
        APP_VERSION_CODE = new ReportField("APP_VERSION_CODE", 4);
        APP_VERSION_NAME = new ReportField("APP_VERSION_NAME", 5);
        PACKAGE_NAME = new ReportField("PACKAGE_NAME", 6);
        FILE_PATH = new ReportField("FILE_PATH", 7);
        PHONE_MODEL = new ReportField("PHONE_MODEL", 8);
        DEVICE = new ReportField("DEVICE", 9);
        ANDROID_VERSION = new ReportField("ANDROID_VERSION", 10);
        OS_VERSION = new ReportField("OS_VERSION", 11);
        BUILD = new ReportField("BUILD", 12);
        BUILD_HOST = new ReportField("BUILD_HOST", 13);
        BRAND = new ReportField("BRAND", 14);
        PRODUCT = new ReportField("PRODUCT", 15);
        TOTAL_MEM_SIZE = new ReportField("TOTAL_MEM_SIZE", 16);
        AVAILABLE_MEM_SIZE = new ReportField("AVAILABLE_MEM_SIZE", 17);
        CUSTOM_DATA = new ReportField("CUSTOM_DATA", 18);
        STACK_TRACE = new ReportField("STACK_TRACE", 19);
        CRASH_CONFIGURATION = new ReportField("CRASH_CONFIGURATION", 20);
        DISPLAY = new ReportField("DISPLAY", 21);
        USER_APP_START_DATE = new ReportField("USER_APP_START_DATE", 22);
        USER_CRASH_DATE = new ReportField("USER_CRASH_DATE", 23);
        DUMPSYS_MEMINFO = new ReportField("DUMPSYS_MEMINFO", 24);
        DROPBOX = new ReportField("DROPBOX", 25);
        LOGCAT = new ReportField("LOGCAT", 26);
        EVENTSLOG = new ReportField("EVENTSLOG", 27);
        RADIOLOG = new ReportField("RADIOLOG", 28);
        IS_SILENT = new ReportField("IS_SILENT", 29);
        DEVICE_ID = new ReportField("DEVICE_ID", 30);
        INSTALLATION_ID = new ReportField("INSTALLATION_ID", 31);
        USER_EMAIL = new ReportField("USER_EMAIL", 32);
        DEVICE_FEATURES = new ReportField("DEVICE_FEATURES", 33);
        ENVIRONMENT = new ReportField("ENVIRONMENT", 34);
        SETTINGS_SYSTEM = new ReportField("SETTINGS_SYSTEM", 35);
        SETTINGS_SECURE = new ReportField("SETTINGS_SECURE", 36);
        PROCESS_NAME = new ReportField("PROCESS_NAME", 37);
        PROCESS_NAME_BY_AMS = new ReportField("PROCESS_NAME_BY_AMS", 38);
        UPLOADED_BY_PROCESS = new ReportField("UPLOADED_BY_PROCESS", 39);
        ACTIVITY_LOG = new ReportField("ACTIVITY_LOG", 40);
        ACRA_INTERNAL = new ReportField("ACRA_INTERNAL", 41);
        PROCESS_UPTIME = new ReportField("PROCESS_UPTIME", 42);
        DEVICE_UPTIME = new ReportField("DEVICE_UPTIME", 43);
        JAIL_BROKEN = new ReportField("JAIL_BROKEN", 44);
        ACRA_REPORT_FILENAME = new ReportField("ACRA_REPORT_FILENAME", 45);
        EXCEPTION_CAUSE = new ReportField("EXCEPTION_CAUSE", 46);
        REPORT_LOAD_THROW = new ReportField("REPORT_LOAD_THROW", 47);
        MINIDUMP = new ReportField("MINIDUMP", 48);
        OPEN_FD_COUNT = new ReportField("OPEN_FD_COUNT", 49);
        OPEN_FD_SOFT_LIMIT = new ReportField("OPEN_FD_SOFT_LIMIT", 50);
        OPEN_FD_HARD_LIMIT = new ReportField("OPEN_FD_HARD_LIMIT", 51);
        APP_INSTALL_TIME = new ReportField("APP_INSTALL_TIME", 52);
        APP_UPGRADE_TIME = new ReportField("APP_UPGRADE_TIME", 53);
        SERIAL = new ReportField("SERIAL", 54);
        IS_LOW_RAM_DEVICE = new ReportField("IS_LOW_RAM_DEVICE", 55);
        SIGQUIT = new ReportField("SIGQUIT", 56);
        LARGE_MEM_HEAP = new ReportField("LARGE_MEM_HEAP", 57);
        ANDROID_RUNTIME = new ReportField("ANDROID_RUNTIME", 58);
        MINIDUMP_EXCLUDE_REASON = new ReportField("MINIDUMP_EXCLUDE_REASON", 59);
        ATTACHMENT_ORIGINAL_SIZE = new ReportField("ATTACHMENT_ORIGINAL_SIZE", 60);
        LAST_URL_VISITED = new ReportField("LAST_URL_VISITED", 61);
        LAST_URL_VISITED_TIME = new ReportField("LAST_URL_VISITED_TIME", 62);
        TIME_OF_CRASH = new ReportField("TIME_OF_CRASH", 63);
        WEBVIEW_VERSION = new ReportField("WEBVIEW_VERSION", 64);
        LAST_ACTIVITY_LOGGED = new ReportField("LAST_ACTIVITY_LOGGED", 65);
        LAST_ACTIVITY_LOGGED_TIME = new ReportField("LAST_ACTIVITY_LOGGED_TIME", 66);
        IAB_OPEN_TIMES = new ReportField("IAB_OPEN_TIMES", 67);
        RUNTIME_PERMISSIONS = new ReportField("RUNTIME_PERMISSIONS", 68);
        $VALUES = (new ReportField[] {
            ACRA_REPORT_TYPE, REPORT_ID, ANDROID_ID, UID, APP_VERSION_CODE, APP_VERSION_NAME, PACKAGE_NAME, FILE_PATH, PHONE_MODEL, DEVICE, 
            ANDROID_VERSION, OS_VERSION, BUILD, BUILD_HOST, BRAND, PRODUCT, TOTAL_MEM_SIZE, AVAILABLE_MEM_SIZE, CUSTOM_DATA, STACK_TRACE, 
            CRASH_CONFIGURATION, DISPLAY, USER_APP_START_DATE, USER_CRASH_DATE, DUMPSYS_MEMINFO, DROPBOX, LOGCAT, EVENTSLOG, RADIOLOG, IS_SILENT, 
            DEVICE_ID, INSTALLATION_ID, USER_EMAIL, DEVICE_FEATURES, ENVIRONMENT, SETTINGS_SYSTEM, SETTINGS_SECURE, PROCESS_NAME, PROCESS_NAME_BY_AMS, UPLOADED_BY_PROCESS, 
            ACTIVITY_LOG, ACRA_INTERNAL, PROCESS_UPTIME, DEVICE_UPTIME, JAIL_BROKEN, ACRA_REPORT_FILENAME, EXCEPTION_CAUSE, REPORT_LOAD_THROW, MINIDUMP, OPEN_FD_COUNT, 
            OPEN_FD_SOFT_LIMIT, OPEN_FD_HARD_LIMIT, APP_INSTALL_TIME, APP_UPGRADE_TIME, SERIAL, IS_LOW_RAM_DEVICE, SIGQUIT, LARGE_MEM_HEAP, ANDROID_RUNTIME, MINIDUMP_EXCLUDE_REASON, 
            ATTACHMENT_ORIGINAL_SIZE, LAST_URL_VISITED, LAST_URL_VISITED_TIME, TIME_OF_CRASH, WEBVIEW_VERSION, LAST_ACTIVITY_LOGGED, LAST_ACTIVITY_LOGGED_TIME, IAB_OPEN_TIMES, RUNTIME_PERMISSIONS
        });
    }
}
