// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.provider.BaseColumns;

// Referenced classes of package com.soundcloud.android.storage:
//            TableColumns

public static class ble extends ble
    implements BaseColumns
{

    public static final String ALL_FIELDS[];
    public static final String ALL_VIEW_FIELDS[] = {
        "sound_policies_monetizable", "sound_policies_policy", "sound_policies_syncable", "sound_user_id", "sound_user_username", "sound_user_permalink", "sound_user_avatar_url", "sound_user_like", "sound_user_repost", "sound_user_play_count", 
        "sound_offline_downloaded_at", "sound_offline_removed_at", "sound_cached"
    };
    public static final String ARTWORK_URL = "artwork_url";
    public static final String CACHED = "sound_cached";
    public static final String COMMENTABLE = "commentable";
    public static final String COMMENT_COUNT = "comment_count";
    public static final String CREATED_AT = "created_at";
    public static final String DESCRIPTION = "description";
    public static final String DOWNLOADABLE = "downloadable";
    public static final String DOWNLOAD_COUNT = "download_count";
    public static final String DOWNLOAD_URL = "download_url";
    public static final String DURATION = "duration";
    public static final String GENRE = "genre";
    public static final String LAST_UPDATED = "last_updated";
    public static final String LICENSE = "license";
    public static final String LIKES_COUNT = "favoritings_count";
    public static final String OFFLINE_DOWNLOADED_AT = "sound_offline_downloaded_at";
    public static final String OFFLINE_REMOVED_AT = "sound_offline_removed_at";
    public static final String ORIGINAL_CONTENT_SIZE = "original_content_size";
    public static final String PERMALINK = "permalink";
    public static final String PERMALINK_URL = "permalink_url";
    public static final String PLAYBACK_COUNT = "playback_count";
    public static final String POLICIES_MONETIZABLE = "sound_policies_monetizable";
    public static final String POLICIES_MONETIZATION_MODEL = "sound_policies_monetization_model";
    public static final String POLICIES_POLICY = "sound_policies_policy";
    public static final String POLICIES_SUB_HIGH_TIER = "sound_policies_sub_high_tier";
    public static final String POLICIES_SUB_MID_TIER = "sound_policies_sub_mid_tier";
    public static final String POLICIES_SYNCABLE = "sound_policies_syncable";
    public static final String PURCHASE_URL = "purchase_url";
    public static final String REPOSTS_COUNT = "reposts_count";
    public static final String SHARED_TO_COUNT = "shared_to_count";
    public static final String SHARING = "sharing";
    public static final String STATE = "state";
    public static final String STREAMABLE = "streamable";
    public static final String STREAM_URL = "stream_url";
    public static final String TAG_LIST = "tag_list";
    public static final String TITLE = "title";
    public static final String TRACKS_URI = "tracks_uri";
    public static final String TRACK_COUNT = "track_count";
    public static final String TRACK_TYPE = "track_type";
    public static final String USERNAME = "sound_user_username";
    public static final String USER_AVATAR_URL = "sound_user_avatar_url";
    public static final String USER_ID = "sound_user_id";
    public static final String USER_LIKE = "sound_user_like";
    public static final String USER_PERMALINK = "sound_user_permalink";
    public static final String USER_PLAY_COUNT = "sound_user_play_count";
    public static final String USER_REPOST = "sound_user_repost";
    public static final String WAVEFORM_URL = "waveform_url";

    static 
    {
        ALL_FIELDS = new String[_FIELDS.length + ALL_VIEW_FIELDS.length];
        System.arraycopy(_FIELDS, 0, ALL_FIELDS, 0, _FIELDS.length);
        System.arraycopy(ALL_VIEW_FIELDS, 0, ALL_FIELDS, _FIELDS.length, ALL_VIEW_FIELDS.length);
    }

    public ble()
    {
    }
}
