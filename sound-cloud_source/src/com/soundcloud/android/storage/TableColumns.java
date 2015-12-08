// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.provider.BaseColumns;

public final class TableColumns
{
    public static class Activities
        implements BaseColumns
    {

        public static final String ALL_FIELDS[] = {
            "_id", "uuid", "type", "tags", "user_id", "sound_id", "sound_type", "comment_id", "created_at", "content_id", 
            "sharing_note_text", "sharing_note_created_at"
        };
        public static final String COMMENT_ID = "comment_id";
        public static final String CONTENT_ID = "content_id";
        public static final String CREATED_AT = "created_at";
        public static final String SHARING_NOTE_CREATED_AT = "sharing_note_created_at";
        public static final String SHARING_NOTE_TEXT = "sharing_note_text";
        public static final String SOUND_ID = "sound_id";
        public static final String SOUND_TYPE = "sound_type";
        public static final String TAGS = "tags";
        public static final String TYPE = "type";
        public static final String USER_ID = "user_id";
        public static final String UUID = "uuid";


        public Activities()
        {
        }
    }

    public static final class ActivityView extends Activities
    {

        public static final String ALL_FIELDS[];
        public static final String ALL_VIEW_FIELDS[] = {
            "comment_body", "comment_timestamp", "comment_created_at", "activity_user_username", "activity_user_permalink", "activity_user_avatar_url"
        };
        public static final String COMMENT_BODY = "comment_body";
        public static final String COMMENT_CREATED_AT = "comment_created_at";
        public static final String COMMENT_TIMESTAMP = "comment_timestamp";
        public static final String USER_AVATAR_URL = "activity_user_avatar_url";
        public static final String USER_PERMALINK = "activity_user_permalink";
        public static final String USER_USERNAME = "activity_user_username";

        static 
        {
            ALL_FIELDS = new String[Activities.ALL_FIELDS.length + ALL_VIEW_FIELDS.length + SoundView.ALL_FIELDS.length];
            System.arraycopy(Activities.ALL_FIELDS, 0, ALL_FIELDS, 0, Activities.ALL_FIELDS.length);
            System.arraycopy(ALL_VIEW_FIELDS, 0, ALL_FIELDS, Activities.ALL_FIELDS.length, ALL_VIEW_FIELDS.length);
            System.arraycopy(SoundView.ALL_FIELDS, 0, ALL_FIELDS, Activities.ALL_FIELDS.length + ALL_VIEW_FIELDS.length, SoundView.ALL_FIELDS.length);
        }

        public ActivityView()
        {
        }
    }

    public static final class AssociationView
    {

        public static final String ASSOCIATION_OWNER_ID = "association_owner_id";
        public static final String ASSOCIATION_TIMESTAMP = "association_timestamp";
        public static final String ASSOCIATION_TYPE = "association_type";

        public AssociationView()
        {
        }
    }

    public static final class CollectionItems
    {

        public static final String COLLECTION_TYPE = "collection_type";
        public static final String CREATED_AT = "created_at";
        public static final String ITEM_ID = "item_id";
        public static final String POSITION = "position";
        public static final String RESOURCE_TYPE = "resource_type";
        public static final String USER_ID = "user_id";

        public CollectionItems()
        {
        }
    }

    public static final class CollectionPages
        implements BaseColumns
    {

        public static final String COLLECTION_ID = "collection_id";
        public static final String ETAG = "etag";
        public static final String PAGE_INDEX = "page_index";
        public static final String SIZE = "size";

        public CollectionPages()
        {
        }
    }

    public static final class Collections
        implements BaseColumns
    {

        public static final String EXTRA = "extra";
        public static final String LAST_SYNC = "last_sync";
        public static final String LAST_SYNC_ATTEMPT = "last_sync_attempt";
        public static final String SIZE = "size";
        public static final String SYNC_STATE = "sync_state";
        public static final String URI = "uri";

        public Collections()
        {
        }
    }

    public static final class Comments
        implements BaseColumns
    {

        public static final String BODY = "body";
        public static final String CREATED_AT = "created_at";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACK_ID = "track_id";
        public static final String USER_ID = "user_id";

        public Comments()
        {
        }
    }

    public static final class Likes
        implements BaseColumns
    {

        public static final String ADDED_AT = "added_at";
        public static final String CREATED_AT = "created_at";
        public static final String REMOVED_AT = "removed_at";
        public static final String _TYPE = "_type";

        public Likes()
        {
        }
    }

    public static final class PlaylistTracks
        implements BaseColumns
    {

        public static final String ADDED_AT = "added_at";
        public static final String PLAYLIST_ID = "playlist_id";
        public static final String POSITION = "position";
        public static final String REMOVED_AT = "removed_at";
        public static final String TRACK_ID = "track_id";

        public PlaylistTracks()
        {
        }
    }

    public static final class PlaylistTracksView extends SoundView
    {

        public static final String PLAYLIST_ADDED_AT = "playlist_added_at";
        public static final String PLAYLIST_ID = "playlist_id";
        public static final String PLAYLIST_POSITION = "playlist_position";

        public PlaylistTracksView()
        {
        }
    }

    public static final class Posts
    {

        public static final String ADDED_AT = "added_at";
        public static final String CREATED_AT = "created_at";
        public static final String REMOVED_AT = "removed_at";
        public static final String TARGET_ID = "target_id";
        public static final String TARGET_TYPE = "target_type";
        public static final String TYPE = "type";
        public static final String TYPE_POST = "post";
        public static final String TYPE_REPOST = "repost";

        public Posts()
        {
        }
    }

    public static class PromotedTracks
        implements BaseColumns
    {

        public static final String AD_URN = "ad_urn";
        public static final String CREATED_AT = "created_at";
        public static final String PROMOTER_ID = "promoter_id";
        public static final String PROMOTER_NAME = "promoter_name";
        public static final String TRACKING_PROFILE_CLICKED_URLS = "tracking_profile_clicked_urls";
        public static final String TRACKING_PROMOTER_CLICKED_URLS = "tracking_promoter_clicked_urls";
        public static final String TRACKING_TRACK_CLICKED_URLS = "tracking_track_clicked_urls";
        public static final String TRACKING_TRACK_IMPRESSION_URLS = "tracking_track_impression_urls";
        public static final String TRACKING_TRACK_PLAYED_URLS = "tracking_track_played_urls";

        public PromotedTracks()
        {
        }
    }

    public static final class Recordings
        implements BaseColumns
    {

        public static final String ALL_FIELDS[] = {
            "_id", "user_id", "timestamp", "longitude", "latitude", "what_text", "where_text", "audio_path", "duration", "description", 
            "artwork_path", "shared_emails", "shared_ids", "private_user_id", "tip_key", "service_ids", "is_private", "external_upload", "upload_status", "four_square_venue_id", 
            "trim_left", "trim_right", "filters", "optimize", "fading"
        };
        public static final String ARTWORK_PATH = "artwork_path";
        public static final String AUDIO_PATH = "audio_path";
        public static final String DESCRIPTION = "description";
        public static final String DURATION = "duration";
        public static final String EXTERNAL_UPLOAD = "external_upload";
        public static final String FADING = "fading";
        public static final String FILTERS = "filters";
        public static final String FOUR_SQUARE_VENUE_ID = "four_square_venue_id";
        public static final String IS_PRIVATE = "is_private";
        public static final String LATITUDE = "latitude";
        public static final String LONGITUDE = "longitude";
        public static final String OPTIMIZE = "optimize";
        public static final String PRIVATE_USER_ID = "private_user_id";
        public static final String SERVICE_IDS = "service_ids";
        public static final String SHARED_EMAILS = "shared_emails";
        public static final String SHARED_IDS = "shared_ids";
        public static final String TIMESTAMP = "timestamp";
        public static final String TIP_KEY = "tip_key";
        public static final String TRIM_LEFT = "trim_left";
        public static final String TRIM_RIGHT = "trim_right";
        public static final String UPLOAD_STATUS = "upload_status";
        public static final String USER_ID = "user_id";
        public static final String WHAT_TEXT = "what_text";
        public static final String WHERE_TEXT = "where_text";


        public Recordings()
        {
        }
    }

    public static class ResourceTable
        implements BaseColumns
    {

        public static final String CREATED_AT = "created_at";
        public static final String LAST_UPDATED = "last_updated";
        public static final String PERMALINK = "permalink";
        public static final String _TYPE = "_type";

        public ResourceTable()
        {
        }
    }

    public static final class SoundAssociationView extends SoundView
    {

        public static final String SOUND_ASSOCIATION_OWNER_ID = "association_owner_id";
        public static final String SOUND_ASSOCIATION_TIMESTAMP = "association_timestamp";
        public static final String SOUND_ASSOCIATION_TYPE = "association_type";

        public SoundAssociationView()
        {
        }
    }

    public static class SoundStream
        implements BaseColumns
    {

        public static final String CREATED_AT = "created_at";
        public static final String PROMOTED_ID = "promoted_id";
        public static final String REPOSTER_ID = "reposter_id";
        public static final String SOUND_ID = "sound_id";
        public static final String SOUND_TYPE = "sound_type";

        public SoundStream()
        {
        }
    }

    public static final class SoundStreamView extends SoundStream
    {

        public static final String REPOSTER_AVATAR_URL = "reposter_avatar_url";
        public static final String REPOSTER_PERMALINK = "reposter_permalink";
        public static final String REPOSTER_USERNAME = "reposter_username";

        public SoundStreamView()
        {
        }
    }

    public static class SoundView extends ResourceTable
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
            ALL_FIELDS = new String[Sounds.ALL_FIELDS.length + ALL_VIEW_FIELDS.length];
            System.arraycopy(Sounds.ALL_FIELDS, 0, ALL_FIELDS, 0, Sounds.ALL_FIELDS.length);
            System.arraycopy(ALL_VIEW_FIELDS, 0, ALL_FIELDS, Sounds.ALL_FIELDS.length, ALL_VIEW_FIELDS.length);
        }

        public SoundView()
        {
        }
    }

    public static class Sounds extends ResourceTable
    {

        public static final String ALL_FIELDS[] = {
            "_id", "_type", "original_content_size", "duration", "genre", "tag_list", "track_type", "title", "permalink_url", "artwork_url", 
            "waveform_url", "downloadable", "download_url", "stream_url", "streamable", "commentable", "sharing", "license", "purchase_url", "playback_count", 
            "download_count", "comment_count", "favoritings_count", "reposts_count", "shared_to_count", "user_id", "state", "created_at", "permalink", "last_updated", 
            "tracks_uri", "track_count", "playlist_type", "description"
        };
        public static final String ARTWORK_URL = "artwork_url";
        public static final String COMMENTABLE = "commentable";
        public static final String COMMENT_COUNT = "comment_count";
        public static final String DESCRIPTION = "description";
        public static final String DOWNLOADABLE = "downloadable";
        public static final String DOWNLOAD_COUNT = "download_count";
        public static final String DOWNLOAD_URL = "download_url";
        public static final String DURATION = "duration";
        public static final String GENRE = "genre";
        public static final String LICENSE = "license";
        public static final String LIKES_COUNT = "favoritings_count";
        public static final String ORIGINAL_CONTENT_SIZE = "original_content_size";
        public static final String PERMALINK_URL = "permalink_url";
        public static final String PLAYBACK_COUNT = "playback_count";
        public static final String PLAYLIST_TYPE = "playlist_type";
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
        public static final int TYPE_COLLECTION = 2;
        public static final int TYPE_PLAYLIST = 1;
        public static final int TYPE_TRACK = 0;
        public static final String USER_ID = "user_id";
        public static final String WAVEFORM_URL = "waveform_url";


        public Sounds()
        {
        }
    }

    public static final class Suggestions
        implements BaseColumns
    {

        public static final String ALL_FIELDS[] = {
            "id", "kind", "text", "icon_url", "permalink_url", "suggest_text_1", "suggest_text_2", "suggest_icon_1", "suggest_intent_data"
        };
        public static final String COLUMN_ICON = "suggest_icon_1";
        public static final String COLUMN_TEXT1 = "suggest_text_1";
        public static final String COLUMN_TEXT2 = "suggest_text_2";
        public static final String ICON_URL = "icon_url";
        public static final String ID = "id";
        public static final String INTENT_DATA = "suggest_intent_data";
        public static final String KIND = "kind";
        public static final String PERMALINK_URL = "permalink_url";
        public static final String TEXT = "text";


        public Suggestions()
        {
        }
    }

    public static final class TrackMetadata
        implements BaseColumns
    {

        public static final String ALL_FIELDS[] = {
            "_id", "user_id", "play_count", "cached", "type", "etag", "bitrate", "url_hash", "size"
        };
        public static final String BITRATE = "bitrate";
        public static final String CACHED = "cached";
        public static final String ETAG = "etag";
        public static final String PLAY_COUNT = "play_count";
        public static final String SIZE = "size";
        public static final String TYPE = "type";
        public static final String URL_HASH = "url_hash";
        public static final String USER_ID = "user_id";


        public TrackMetadata()
        {
        }
    }

    public static class TrackPolicies
        implements BaseColumns
    {

        public static final String ALL_FIELDS[] = {
            "track_id", "monetizable", "sub_mid_tier", "sub_high_tier", "policy", "monetization_model", "syncable", "last_updated"
        };
        public static final String LAST_UPDATED = "last_updated";
        public static final String MONETIZABLE = "monetizable";
        public static final String MONETIZATION_MODEL = "monetization_model";
        public static final String POLICY = "policy";
        public static final String SUB_HIGH_TIER = "sub_high_tier";
        public static final String SUB_MID_TIER = "sub_mid_tier";
        public static final String SYNCABLE = "syncable";
        public static final String TRACK_ID = "track_id";


        public TrackPolicies()
        {
        }
    }

    public static final class UserAssociationView extends Users
    {

        public static final String USER_ASSOCIATION_ADDED_AT = "user_association_added_at";
        public static final String USER_ASSOCIATION_OWNER_ID = "association_owner_id";
        public static final String USER_ASSOCIATION_POSITION = "user_association_position";
        public static final String USER_ASSOCIATION_REMOVED_AT = "user_association_removed_at";
        public static final String USER_ASSOCIATION_TIMESTAMP = "association_timestamp";
        public static final String USER_ASSOCIATION_TOKEN = "user_association_token";
        public static final String USER_ASSOCIATION_TYPE = "association_type";

        public UserAssociationView()
        {
        }
    }

    public static final class UserAssociations
    {

        public static final String ADDED_AT = "added_at";
        public static final String ASSOCIATION_TYPE = "association_type";
        public static final String CREATED_AT = "created_at";
        public static final String OWNER_ID = "owner_id";
        public static final String POSITION = "position";
        public static final String REMOVED_AT = "removed_at";
        public static final String RESOURCE_TYPE = "resource_type";
        public static final String TARGET_ID = "target_id";
        public static final String TOKEN = "token";
        public static final int TYPE_FOLLOWER = 3;
        public static final int TYPE_FOLLOWING = 2;
        public static final int TYPE_RESOURCE_USER = 0;

        public UserAssociations()
        {
        }
    }

    public static class Users extends ResourceTable
    {

        public static final String ALL_FIELDS[] = {
            "_id", "username", "avatar_url", "city", "country", "discogs_name", "followers_count", "followings_count", "full_name", "myspace_name", 
            "track_count", "website", "website_title", "description", "permalink", "last_updated", "permalink_url", "primary_email_confirmed", "public_favorites_count", "private_tracks_count", 
            "plan"
        };
        public static final String AVATAR_URL = "avatar_url";
        public static final String CITY = "city";
        public static final String COUNTRY = "country";
        public static final String DESCRIPTION = "description";
        public static final String DISCOGS_NAME = "discogs_name";
        public static final String FOLLOWERS_COUNT = "followers_count";
        public static final String FOLLOWINGS_COUNT = "followings_count";
        public static final String FULL_NAME = "full_name";
        public static final String MYSPACE_NAME = "myspace_name";
        public static final String PERMALINK_URL = "permalink_url";
        public static final String PLAN = "plan";
        public static final String PRIMARY_EMAIL_CONFIRMED = "primary_email_confirmed";
        public static final String PRIVATE_TRACKS_COUNT = "private_tracks_count";
        public static final String PUBLIC_LIKES_COUNT = "public_favorites_count";
        public static final String TRACK_COUNT = "track_count";
        public static final String USERNAME = "username";
        public static final String USER_FOLLOWER = "user_follower";
        public static final String USER_FOLLOWING = "user_following";
        public static final String WEBSITE_NAME = "website_title";
        public static final String WEBSITE_URL = "website";


        public Users()
        {
        }
    }

    public static final class Waveforms
        implements BaseColumns
    {

        public static final String CREATED_AT = "created_at";
        public static final String MAX_AMPLITUDE = "max_amplitude";
        public static final String SAMPLES = "samples";
        public static final String TRACK_ID = "track_id";

        public Waveforms()
        {
        }
    }


    public TableColumns()
    {
    }
}
