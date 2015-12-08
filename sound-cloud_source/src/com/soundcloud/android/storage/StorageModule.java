// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.crypto.Obfuscator;
import com.soundcloud.android.utils.ObfuscatedPreferences;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;

// Referenced classes of package com.soundcloud.android.storage:
//            DatabaseManager

public class StorageModule
{

    public static final String ACTIVITIES_SYNC = "ActivitiesSync";
    public static final String COLLECTIONS = "collections";
    public static final String DEVICE_KEYS = "DeviceKeys";
    public static final String DEVICE_MANAGEMENT = "DeviceManagement";
    public static final String FACEBOOK_INVITES = "FacebookInvites";
    public static final String FEATURES = "Features";
    public static final String GCM = "gcm";
    public static final String OFFLINE_SETTINGS = "OfflineSettings";
    public static final String PAYMENTS = "Payments";
    public static final String PLAYLIST_TAGS = "PlaylistTags";
    public static final String POLICY_SETTINGS = "Policies";
    private static final String PREFS_ACTIVITIES_SYNC = "ActivitiesSync";
    private static final String PREFS_COLLECTIONS = "collections";
    private static final String PREFS_DEVICE_KEYS = "device_keys";
    private static final String PREFS_DEVICE_MANAGEMENT = "device_management";
    private static final String PREFS_FACEBOOK_INVITES = "facebook_invites";
    private static final String PREFS_FEATURES = "features_settings";
    private static final String PREFS_GCM = "gcm";
    private static final String PREFS_OFFLINE_SETTINGS = "offline_settings";
    private static final String PREFS_PAYMENTS = "payments";
    private static final String PREFS_PLAYLIST_TAGS = "playlist_tags";
    private static final String PREFS_POLICY_SETTINGS = "policy_settings";
    private static final String PREFS_RECOMMENDATIONS_SYNC = "RecommendationsSync";
    private static final String PREFS_STATIONS = "stations";
    private static final String PREFS_STREAM_SYNC = "StreamSync";
    private static final String PREFS_SYNCER = "syncer";
    public static final String RECOMMENDATIONS_SYNC = "RecommendationsSync";
    public static final String STATIONS = "stations";
    public static final String STREAM_SYNC = "StreamSync";
    public static final String SYNCER = "syncer";

    public StorageModule()
    {
    }

    public SharedPreferences provideActivitiesSyncPrefs(Context context)
    {
        return context.getSharedPreferences("ActivitiesSync", 0);
    }

    public SharedPreferences provideCollectionsPrefs(Context context)
    {
        return context.getSharedPreferences("collections", 0);
    }

    public ContentResolver provideContentResolver(SoundCloudApplication soundcloudapplication)
    {
        return soundcloudapplication.getContentResolver();
    }

    public SQLiteDatabase provideDatabase(Context context)
    {
        return DatabaseManager.getInstance(context).getWritableDatabase();
    }

    public SharedPreferences provideDeviceManagementPrefs(Context context)
    {
        return context.getSharedPreferences("device_management", 0);
    }

    public SharedPreferences provideFacebookInvitesPrefs(Context context)
    {
        return context.getSharedPreferences("facebook_invites", 0);
    }

    public SharedPreferences provideFeaturePrefs(Context context, Obfuscator obfuscator)
    {
        return new ObfuscatedPreferences(context.getSharedPreferences("features_settings", 0), obfuscator);
    }

    public SharedPreferences provideGcmPrefs(Context context)
    {
        return context.getSharedPreferences("gcm", 0);
    }

    public SharedPreferences provideKeysPrefs(Context context)
    {
        return context.getSharedPreferences("device_keys", 0);
    }

    public SharedPreferences provideOfflinePrefs(Context context)
    {
        return context.getSharedPreferences("offline_settings", 0);
    }

    public SharedPreferences providePaymentsPrefs(Context context)
    {
        return context.getSharedPreferences("payments", 0);
    }

    public SharedPreferences providePlaylistTagPrefs(Context context)
    {
        return context.getSharedPreferences("playlist_tags", 0);
    }

    public SharedPreferences providePolicyPrefs(Context context)
    {
        return context.getSharedPreferences("policy_settings", 0);
    }

    public PropellerDatabase providePropeller(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = new PropellerDatabase(sqlitedatabase);
        sqlitedatabase.setAssertBackgroundThread();
        return sqlitedatabase;
    }

    public PropellerRx providePropellerRxWrapper(PropellerDatabase propellerdatabase)
    {
        return new PropellerRx(propellerdatabase);
    }

    public SharedPreferences provideRecommendationsSyncPrefs(Context context)
    {
        return context.getSharedPreferences("RecommendationsSync", 0);
    }

    public SharedPreferences provideStationsPreferences(Context context)
    {
        return context.getSharedPreferences("stations", 0);
    }

    public SharedPreferences provideStreamSyncPrefs(Context context)
    {
        return context.getSharedPreferences("StreamSync", 0);
    }

    public SharedPreferences provideSyncerPreferences(Context context)
    {
        return context.getSharedPreferences("syncer", 0);
    }
}
