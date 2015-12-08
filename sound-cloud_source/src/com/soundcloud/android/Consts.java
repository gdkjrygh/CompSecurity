// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.os.Environment;
import java.io.File;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android:
//            SoundCloudApplication

public final class Consts
{
    public static final class GeneralIntents
    {

        public static final String UNAUTHORIZED = (new StringBuilder()).append(com/soundcloud/android/SoundCloudApplication.getSimpleName()).append(".unauthorized").toString();


        public GeneralIntents()
        {
        }
    }

    public static final class PrefKeys
    {

        public static final String C2DM_DEVICE_URL = "c2dm.device_url";
        public static final String DEV_HTTP_PROXY = "dev.http.proxy";
        public static final String LAST_USER_SYNC = "lastUserSync";
        public static final String NOTIFICATIONS_COMMENTS = "notificationsComments";
        public static final String NOTIFICATIONS_FOLLOWERS = "notificationsFollowers";
        public static final String NOTIFICATIONS_FREQUENCY = "notificationsFrequency";
        public static final String NOTIFICATIONS_INCOMING = "notificationsIncoming";
        public static final String NOTIFICATIONS_LIKES = "notificationsFavoritings";
        public static final String NOTIFICATIONS_REPOSTS = "notificationsReposts";
        public static final String NOTIFICATIONS_WIFI_ONLY = "notificationsWifiOnly";
        public static final String PLAYBACK_ERROR_REPORTING_ENABLED = "playbackErrorReportingEnabled";

        public PrefKeys()
        {
        }
    }

    public static final class RequestCodes
    {

        public static final int GALLERY_IMAGE_PICK = 9000;
        public static final int GALLERY_IMAGE_TAKE = 9001;
        public static final int RECOVER_FROM_PLAY_SERVICES_ERROR = 8004;
        public static final int RECOVER_PASSWORD_CODE = 8002;
        public static final int SIGNUP_VIA_GOOGLE = 8003;

        public RequestCodes()
        {
        }
    }

    public static final class ResourceStaleTimes
    {

        public static final long ACTIVITY;
        public static final long PLAYLIST;
        public static final long TRACK;
        public static final long USER;

        static 
        {
            USER = TimeUnit.DAYS.toMillis(1L);
            TRACK = TimeUnit.HOURS.toMillis(4L);
            PLAYLIST = TimeUnit.HOURS.toMillis(4L);
            ACTIVITY = TimeUnit.MINUTES.toMillis(20L);
        }

        public ResourceStaleTimes()
        {
        }
    }


    public static final int CARD_PAGE_SIZE = 20;
    public static final File EXTERNAL_MEDIAPLAYER_STREAM_DIRECTORY;
    public static final File EXTERNAL_SKIPPY_STREAM_DIRECTORY;
    public static final File EXTERNAL_STORAGE_DIRECTORY = new File(Environment.getExternalStorageDirectory(), "SoundCloud");
    public static final File FILES_PATH;
    public static final int LIST_PAGE_SIZE = 30;
    public static final int MAX_COMMENTS_TO_LOAD = 50;
    public static final int NOT_SET = -1;
    public static final File OLD_EXTERNAL_CACHE_DIRECTORY;

    public Consts()
    {
    }

    static 
    {
        FILES_PATH = new File(Environment.getExternalStorageDirectory(), "Android/data/com.soundcloud.android/files");
        OLD_EXTERNAL_CACHE_DIRECTORY = new File(FILES_PATH, ".cache");
        EXTERNAL_MEDIAPLAYER_STREAM_DIRECTORY = new File(FILES_PATH, "stream");
        EXTERNAL_SKIPPY_STREAM_DIRECTORY = new File(FILES_PATH, "skippy");
    }
}
