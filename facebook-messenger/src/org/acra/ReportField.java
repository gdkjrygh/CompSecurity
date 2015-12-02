// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;


public final class ReportField extends Enum
{

    private static final ReportField $VALUES[];
    public static final ReportField ACRA_INTERNAL;
    public static final ReportField ACRA_REPORT_FILENAME;
    public static final ReportField ACTIVITY_LOG;
    public static final ReportField ANDROID_VERSION;
    public static final ReportField APP_VERSION_CODE;
    public static final ReportField APP_VERSION_NAME;
    public static final ReportField AVAILABLE_MEM_SIZE;
    public static final ReportField BRAND;
    public static final ReportField BUILD;
    public static final ReportField CRASH_CONFIGURATION;
    public static final ReportField CUSTOM_DATA;
    public static final ReportField DEVICE_FEATURES;
    public static final ReportField DEVICE_ID;
    public static final ReportField DISPLAY;
    public static final ReportField DROPBOX;
    public static final ReportField DUMPSYS_MEMINFO;
    public static final ReportField ENVIRONMENT;
    public static final ReportField EVENTSLOG;
    public static final ReportField FILE_PATH;
    public static final ReportField INITIAL_CONFIGURATION;
    public static final ReportField INSTALLATION_ID;
    public static final ReportField IS_SILENT;
    public static final ReportField JAIL_BROKEN;
    public static final ReportField LOGCAT;
    public static final ReportField PACKAGE_NAME;
    public static final ReportField PHONE_MODEL;
    public static final ReportField PROCESS_NAME;
    public static final ReportField PROCESS_NAME_BY_AMS;
    public static final ReportField PROCESS_UPTIME;
    public static final ReportField PRODUCT;
    public static final ReportField RADIOLOG;
    public static final ReportField REPORT_ID;
    public static final ReportField SETTINGS_SECURE;
    public static final ReportField SETTINGS_SYSTEM;
    public static final ReportField STACK_TRACE;
    public static final ReportField TOTAL_MEM_SIZE;
    public static final ReportField USER_APP_START_DATE;
    public static final ReportField USER_CRASH_DATE;
    public static final ReportField USER_EMAIL;

    private ReportField(String s, int i)
    {
        super(s, i);
    }

    public static ReportField valueOf(String s)
    {
        return (ReportField)Enum.valueOf(org/acra/ReportField, s);
    }

    public static ReportField[] values()
    {
        return (ReportField[])$VALUES.clone();
    }

    static 
    {
        REPORT_ID = new ReportField("REPORT_ID", 0);
        APP_VERSION_CODE = new ReportField("APP_VERSION_CODE", 1);
        APP_VERSION_NAME = new ReportField("APP_VERSION_NAME", 2);
        PACKAGE_NAME = new ReportField("PACKAGE_NAME", 3);
        FILE_PATH = new ReportField("FILE_PATH", 4);
        PHONE_MODEL = new ReportField("PHONE_MODEL", 5);
        ANDROID_VERSION = new ReportField("ANDROID_VERSION", 6);
        BUILD = new ReportField("BUILD", 7);
        BRAND = new ReportField("BRAND", 8);
        PRODUCT = new ReportField("PRODUCT", 9);
        TOTAL_MEM_SIZE = new ReportField("TOTAL_MEM_SIZE", 10);
        AVAILABLE_MEM_SIZE = new ReportField("AVAILABLE_MEM_SIZE", 11);
        CUSTOM_DATA = new ReportField("CUSTOM_DATA", 12);
        STACK_TRACE = new ReportField("STACK_TRACE", 13);
        INITIAL_CONFIGURATION = new ReportField("INITIAL_CONFIGURATION", 14);
        CRASH_CONFIGURATION = new ReportField("CRASH_CONFIGURATION", 15);
        DISPLAY = new ReportField("DISPLAY", 16);
        USER_APP_START_DATE = new ReportField("USER_APP_START_DATE", 17);
        USER_CRASH_DATE = new ReportField("USER_CRASH_DATE", 18);
        DUMPSYS_MEMINFO = new ReportField("DUMPSYS_MEMINFO", 19);
        DROPBOX = new ReportField("DROPBOX", 20);
        LOGCAT = new ReportField("LOGCAT", 21);
        EVENTSLOG = new ReportField("EVENTSLOG", 22);
        RADIOLOG = new ReportField("RADIOLOG", 23);
        IS_SILENT = new ReportField("IS_SILENT", 24);
        DEVICE_ID = new ReportField("DEVICE_ID", 25);
        INSTALLATION_ID = new ReportField("INSTALLATION_ID", 26);
        USER_EMAIL = new ReportField("USER_EMAIL", 27);
        DEVICE_FEATURES = new ReportField("DEVICE_FEATURES", 28);
        ENVIRONMENT = new ReportField("ENVIRONMENT", 29);
        SETTINGS_SYSTEM = new ReportField("SETTINGS_SYSTEM", 30);
        SETTINGS_SECURE = new ReportField("SETTINGS_SECURE", 31);
        PROCESS_NAME = new ReportField("PROCESS_NAME", 32);
        PROCESS_NAME_BY_AMS = new ReportField("PROCESS_NAME_BY_AMS", 33);
        ACTIVITY_LOG = new ReportField("ACTIVITY_LOG", 34);
        ACRA_INTERNAL = new ReportField("ACRA_INTERNAL", 35);
        PROCESS_UPTIME = new ReportField("PROCESS_UPTIME", 36);
        JAIL_BROKEN = new ReportField("JAIL_BROKEN", 37);
        ACRA_REPORT_FILENAME = new ReportField("ACRA_REPORT_FILENAME", 38);
        $VALUES = (new ReportField[] {
            REPORT_ID, APP_VERSION_CODE, APP_VERSION_NAME, PACKAGE_NAME, FILE_PATH, PHONE_MODEL, ANDROID_VERSION, BUILD, BRAND, PRODUCT, 
            TOTAL_MEM_SIZE, AVAILABLE_MEM_SIZE, CUSTOM_DATA, STACK_TRACE, INITIAL_CONFIGURATION, CRASH_CONFIGURATION, DISPLAY, USER_APP_START_DATE, USER_CRASH_DATE, DUMPSYS_MEMINFO, 
            DROPBOX, LOGCAT, EVENTSLOG, RADIOLOG, IS_SILENT, DEVICE_ID, INSTALLATION_ID, USER_EMAIL, DEVICE_FEATURES, ENVIRONMENT, 
            SETTINGS_SYSTEM, SETTINGS_SECURE, PROCESS_NAME, PROCESS_NAME_BY_AMS, ACTIVITY_LOG, ACRA_INTERNAL, PROCESS_UPTIME, JAIL_BROKEN, ACRA_REPORT_FILENAME
        });
    }
}
