// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;


public final class p extends Enum
{

    private static final p $VALUES[];
    public static final p ALARM_NEXT_TIME;
    public static final p BACK_BUTTON_PRESS_CANCEL;
    public static final p BUILD_TAG;
    public static final p BUTTON_PRESS_INSTALL;
    public static final p BUTTON_PRESS_REMIND;
    public static final p CLEAN_UPDATE_INFO;
    public static final p CREATE_NOTIFICATION;
    public static final p DOWNLOAD_AT_EXTERNAL_DESTINATION;
    public static final p DOWNLOAD_SUCCESS_FILE_URI;
    public static final p FORCE_UPDATE_CHECK_NOW;
    public static final p NO_CANCEL_CHANGED_TO_FALSE;
    public static final p NO_CANCEL_FROM_INTENT;
    public static final p NO_FREE_SPACE_TO_DOWNLOAD;
    public static final p ON_ACTIVITY_CREATE;
    public static final p ON_CREATE;
    public static final p ON_HANDLE_INTENT;
    public static final p PENDING_DOWNLOAD_COMPLETE;
    public static final p PENDING_DOWNLOAD_OLD_VERSION;
    public static final p QUEUE_DOWNLOAD;
    public static final p SCHEDULE_SERVICE;
    public static final p SHOULD_SCHEDULE_SERVICE_FALSE;
    public static final p UNKNOWN_SOURCES_NOT_CHECKED;
    public static final p UPDATE_CHECK_NOW;
    private String mName;

    private p(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/facebook/selfupdate/p, s);
    }

    public static p[] values()
    {
        return (p[])$VALUES.clone();
    }

    public String toString()
    {
        return mName;
    }

    static 
    {
        SCHEDULE_SERVICE = new p("SCHEDULE_SERVICE", 0, "schedule_service");
        SHOULD_SCHEDULE_SERVICE_FALSE = new p("SHOULD_SCHEDULE_SERVICE_FALSE", 1, "should_schedule_service_false");
        PENDING_DOWNLOAD_OLD_VERSION = new p("PENDING_DOWNLOAD_OLD_VERSION", 2, "pending_download_old_version");
        PENDING_DOWNLOAD_COMPLETE = new p("PENDING_DOWNLOAD_COMPLETE", 3, "pending_download_complete");
        UPDATE_CHECK_NOW = new p("UPDATE_CHECK_NOW", 4, "update_check_now");
        FORCE_UPDATE_CHECK_NOW = new p("FORCE_UPDATE_CHECK_NOW", 5, "force_update_check_now");
        BUILD_TAG = new p("BUILD_TAG", 6, "build_tag");
        DOWNLOAD_SUCCESS_FILE_URI = new p("DOWNLOAD_SUCCESS_FILE_URI", 7, "download_success_file_uri");
        CREATE_NOTIFICATION = new p("CREATE_NOTIFICATION", 8, "create_notification");
        CLEAN_UPDATE_INFO = new p("CLEAN_UPDATE_INFO", 9, "clean_update_info");
        ON_CREATE = new p("ON_CREATE", 10, "on_create");
        ON_HANDLE_INTENT = new p("ON_HANDLE_INTENT", 11, "on_handle_intent");
        DOWNLOAD_AT_EXTERNAL_DESTINATION = new p("DOWNLOAD_AT_EXTERNAL_DESTINATION", 12, "download_at_external_destination");
        NO_FREE_SPACE_TO_DOWNLOAD = new p("NO_FREE_SPACE_TO_DOWNLOAD", 13, "no_free_space_to_download");
        QUEUE_DOWNLOAD = new p("QUEUE_DOWNLOAD", 14, "queue_download");
        ALARM_NEXT_TIME = new p("ALARM_NEXT_TIME", 15, "alarm_next_time");
        ON_ACTIVITY_CREATE = new p("ON_ACTIVITY_CREATE", 16, "on_activity_create");
        NO_CANCEL_FROM_INTENT = new p("NO_CANCEL_FROM_INTENT", 17, "no_cancel_from_intent");
        NO_CANCEL_CHANGED_TO_FALSE = new p("NO_CANCEL_CHANGED_TO_FALSE", 18, "no_cancel_changed_to_false");
        UNKNOWN_SOURCES_NOT_CHECKED = new p("UNKNOWN_SOURCES_NOT_CHECKED", 19, "unknown_sources_not_checked");
        BUTTON_PRESS_INSTALL = new p("BUTTON_PRESS_INSTALL", 20, "button_press_install");
        BUTTON_PRESS_REMIND = new p("BUTTON_PRESS_REMIND", 21, "button_press_remind");
        BACK_BUTTON_PRESS_CANCEL = new p("BACK_BUTTON_PRESS_CANCEL", 22, "back_button_press_cancel");
        $VALUES = (new p[] {
            SCHEDULE_SERVICE, SHOULD_SCHEDULE_SERVICE_FALSE, PENDING_DOWNLOAD_OLD_VERSION, PENDING_DOWNLOAD_COMPLETE, UPDATE_CHECK_NOW, FORCE_UPDATE_CHECK_NOW, BUILD_TAG, DOWNLOAD_SUCCESS_FILE_URI, CREATE_NOTIFICATION, CLEAN_UPDATE_INFO, 
            ON_CREATE, ON_HANDLE_INTENT, DOWNLOAD_AT_EXTERNAL_DESTINATION, NO_FREE_SPACE_TO_DOWNLOAD, QUEUE_DOWNLOAD, ALARM_NEXT_TIME, ON_ACTIVITY_CREATE, NO_CANCEL_FROM_INTENT, NO_CANCEL_CHANGED_TO_FALSE, UNKNOWN_SOURCES_NOT_CHECKED, 
            BUTTON_PRESS_INSTALL, BUTTON_PRESS_REMIND, BACK_BUTTON_PRESS_CANCEL
        });
    }
}
