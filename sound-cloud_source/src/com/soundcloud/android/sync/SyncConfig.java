// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.soundcloud.android.utils.IOUtils;

public final class SyncConfig
{

    public static final long ACTIVITY_STALE_TIME = 0x1499700L;
    public static final long DEFAULT_ATTEMPT_DELAY = 0x1b7740L;
    public static int DEFAULT_BACKOFF_MULTIPLIERS[] = {
        1, 2, 4, 8, 12, 18, 24
    };
    private static final long DEFAULT_NOTIFICATIONS_FREQUENCY = 0xdbba00L;
    public static final long DEFAULT_STALE_TIME = 0x36ee80L;
    public static final long DEFAULT_SYNC_DELAY = 3600L;
    public static final long PLAYLIST_STALE_TIME = 0x1499700L;
    public static final String PREF_SYNC_WIFI_ONLY = "syncWifiOnly";
    public static final long SHORTCUTS_STALE_TIME = 0x5265c00L;
    public static final long TRACK_STALE_TIME = 0x36ee80L;
    public static int USER_BACKOFF_MULTIPLIERS[] = {
        1, 2, 3
    };
    public static final long USER_STALE_TIME = 0x2932e00L;

    private SyncConfig()
    {
    }

    public static long getNotificationsFrequency(Context context)
    {
        if (PreferenceManager.getDefaultSharedPreferences(context).contains("notificationsFrequency"))
        {
            return Long.parseLong(PreferenceManager.getDefaultSharedPreferences(context).getString("notificationsFrequency", "14400000"));
        } else
        {
            return 0xdbba00L;
        }
    }

    public static boolean isActivitySyncEnabled(Context context)
    {
        return isLikeNotificationEnabled(context) || isCommentNotificationsEnabled(context);
    }

    public static boolean isCommentNotificationsEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsComments", true);
    }

    public static boolean isIncomingEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsIncoming", true);
    }

    public static boolean isLikeNotificationEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsFavoritings", true);
    }

    public static boolean isNewFollowerNotificationsEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsFollowers", true);
    }

    public static boolean isNotificationsWifiOnlyEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsWifiOnly", false);
    }

    public static boolean isRepostNotificationsEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notificationsReposts", true);
    }

    public static boolean isSyncWifiOnlyEnabled(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("syncWifiOnly", true);
    }

    public static boolean shouldSync(Context context, String s, long l)
    {
        long l1 = PreferenceManager.getDefaultSharedPreferences(context).getLong(s, System.currentTimeMillis());
        return System.currentTimeMillis() - l1 > l;
    }

    public static boolean shouldSyncCollections(Context context)
    {
        return !isSyncWifiOnlyEnabled(context) || IOUtils.isWifiConnected(context);
    }

    public static boolean shouldUpdateDashboard(Context context)
    {
        return !isNotificationsWifiOnlyEnabled(context) || IOUtils.isWifiConnected(context);
    }

}
