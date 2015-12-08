// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.ads.StoryAdStreamDataTable;
import com.snapchat.android.discover.model.database.table.ChannelUpdateDatesTable;
import com.snapchat.android.discover.model.database.table.ChannelViewDatesTable;
import com.snapchat.android.discover.model.database.table.ChannelViewStateTable;
import com.snapchat.android.discover.model.database.table.DSnapItemTable;
import com.snapchat.android.discover.model.database.table.DSnapTable;
import com.snapchat.android.discover.model.database.table.DSnapViewStateTable;
import com.snapchat.android.discover.model.database.table.EditionChunkTable;
import com.snapchat.android.discover.model.database.table.EditionTable;
import com.snapchat.android.discover.model.database.table.EditionViewStateTable;
import com.snapchat.android.discover.model.database.table.PublisherChannelTable;
import com.snapchat.android.networkmanager.consumption.DataConsumptionRecordTable;
import tB;
import tC;
import tD;
import tE;
import tF;
import tG;
import tH;
import tI;
import tJ;
import tK;
import tL;
import tN;
import tO;
import tP;
import tQ;
import tR;
import tS;
import tT;
import tU;
import tV;
import tW;
import tX;
import tY;
import tZ;
import tv;
import tw;
import tx;
import ty;
import tz;
import ua;
import ub;
import uc;
import ud;
import ue;
import uf;
import ug;
import uh;
import ui;
import uj;
import ul;
import vE;
import vF;
import vG;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable, FriendTable, SentSnapTable, ReceivedSnapTable, 
//            StoryGroupTable, StoryMetadataTable, ConversationTable, ChatTable, 
//            NotificationTable, ChatsReceivedInLastHourTable, ClearedChatIdsTable, CashFeedItemTable, 
//            FindFriendRequestCacheTable, FriendmojiEditableDictionaryTable, FriendmojiReadOnlyDictionaryTable, ScreenshotDetectionSessionTable, 
//            UpdateSnapsAnalyticsTable

public static final class a extends Enum
{

    private static final ANALYTICS_EVENTS $VALUES[];
    public static final ANALYTICS_EVENTS ANALYTICS_EVENTS;
    public static final ANALYTICS_EVENTS CASH_FEED_ITEM;
    public static final ANALYTICS_EVENTS CHANNEL_UPDATE_DATES;
    public static final ANALYTICS_EVENTS CHANNEL_VIEW_DATES;
    public static final ANALYTICS_EVENTS CHANNEL_VIEW_STATE;
    public static final ANALYTICS_EVENTS CHAT;
    public static final ANALYTICS_EVENTS CHATS_FROM_LAST_HOUR;
    public static final ANALYTICS_EVENTS CHAT_MEDIA_FILES;
    public static final ANALYTICS_EVENTS CLEARED_CHAT_IDS;
    public static final ANALYTICS_EVENTS CONTACTS_NOT_ON_SNAPCHAT;
    public static final ANALYTICS_EVENTS CONTACTS_ON_SNAPCHAT;
    public static final ANALYTICS_EVENTS CONVERSATION;
    public static final ANALYTICS_EVENTS DATA_CONSUMPTION_RECORDS;
    public static final ANALYTICS_EVENTS DISCOVER_SHARE_FILES;
    public static final ANALYTICS_EVENTS DSNAPS;
    public static final ANALYTICS_EVENTS DSNAP_ITEMS;
    public static final ANALYTICS_EVENTS DSNAP_MEDIA_FILES;
    public static final ANALYTICS_EVENTS DSNAP_VIEW_STATE;
    public static final ANALYTICS_EVENTS EDITIONS;
    public static final ANALYTICS_EVENTS EDITION_CHUNKS;
    public static final ANALYTICS_EVENTS EDITION_CHUNK_FILES;
    public static final ANALYTICS_EVENTS EDITION_VIEW_STATE;
    public static final ANALYTICS_EVENTS FAILED_CHAT_MEDIA_SNAPBRYOS;
    public static final ANALYTICS_EVENTS FAILED_POST_SNAPBRYOS;
    public static final ANALYTICS_EVENTS FAILED_SEND_DSNAPBRYOS;
    public static final ANALYTICS_EVENTS FAILED_SEND_SNAPBRYOS;
    public static final ANALYTICS_EVENTS FINDFRIENDS_REQUEST_CACHE;
    public static final ANALYTICS_EVENTS FONT;
    public static final ANALYTICS_EVENTS FRIENDMOJI_EDITABLE_DICTIONARY;
    public static final ANALYTICS_EVENTS FRIENDMOJI_READONLY_DICTIONARY;
    public static final ANALYTICS_EVENTS FRIENDS;
    public static final ANALYTICS_EVENTS FRIENDS_WHO_ADDED_ME;
    public static final ANALYTICS_EVENTS FRIEND_PROFILE_IMAGE_FILE_TABLE;
    public static final ANALYTICS_EVENTS FRIEND_STORIES;
    public static final ANALYTICS_EVENTS GEOFILTER_FILES;
    public static final ANALYTICS_EVENTS GEOFILTER_METADATA;
    public static final ANALYTICS_EVENTS GEO_LENSES_METADATA;
    public static final ANALYTICS_EVENTS HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE;
    public static final ANALYTICS_EVENTS HAS_SEEN_OUR_STORY_DIALOG_TABLE;
    public static final ANALYTICS_EVENTS HTTP_METRICS;
    public static final ANALYTICS_EVENTS INTRO_VIDEO_FILES;
    public static final ANALYTICS_EVENTS LENSES_RESOURCES;
    public static final ANALYTICS_EVENTS MY_POSTED_STORYSNAPS;
    public static final ANALYTICS_EVENTS MY_SNAP_IMAGE_FILES;
    public static final ANALYTICS_EVENTS MY_SNAP_VIDEO_FILES;
    public static final ANALYTICS_EVENTS MY_STORY_SNAP_THUMBNAIL_FILES;
    public static final ANALYTICS_EVENTS NOTIFICATION;
    public static final ANALYTICS_EVENTS POSTING_SNAPBRYOS;
    public static final ANALYTICS_EVENTS PREVIEW_SNAP_VIDEO_FILE;
    public static final ANALYTICS_EVENTS PROFILE_IMAGE_FILE_TABLE;
    public static final ANALYTICS_EVENTS PROMO_LENSES_METADATA;
    public static final ANALYTICS_EVENTS PUBLISHER_CHANNELS;
    public static final ANALYTICS_EVENTS PUBLISHER_ICONS;
    public static final ANALYTICS_EVENTS PURCHASED_LENSES_METADATA;
    public static final ANALYTICS_EVENTS RECEIVED_SNAPS;
    public static final ANALYTICS_EVENTS RECEIVED_SNAP_IMAGE_FILES;
    public static final ANALYTICS_EVENTS RECEIVED_SNAP_VIDEO_FILES;
    public static final ANALYTICS_EVENTS RECEIVED_STORY_SNAP_THUMBNAIL_FILES;
    public static final ANALYTICS_EVENTS SCHEDULED_LENSES_METADATA;
    public static final ANALYTICS_EVENTS SENDING_DSNAPBRYOS;
    public static final ANALYTICS_EVENTS SENDING_SNAPBRYOS;
    public static final ANALYTICS_EVENTS SENT_SNAPS;
    public static final ANALYTICS_EVENTS STORY_AD_STREAM_DATA_TABLE;
    public static final ANALYTICS_EVENTS STORY_GROUPS;
    public static final ANALYTICS_EVENTS STORY_METADATA;
    public static final ANALYTICS_EVENTS STORY_SNAP_IMAGE_FILES;
    public static final ANALYTICS_EVENTS STORY_SNAP_NOTE_TABLE;
    public static final ANALYTICS_EVENTS STORY_SNAP_VIDEO_FILES;
    public static final ANALYTICS_EVENTS SUGGESTED_FRIENDS;
    public static final ANALYTICS_EVENTS VERIFIED_DEVICE;
    public static final ANALYTICS_EVENTS VIEWING_SESSIONS;
    private DbTable a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/database/table/DbTable$DatabaseTable, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final DbTable getTable()
    {
        return a;
    }

    static 
    {
        CONTACTS_ON_SNAPCHAT = new <init>("CONTACTS_ON_SNAPCHAT", 0, tz.a());
        CONTACTS_NOT_ON_SNAPCHAT = new <init>("CONTACTS_NOT_ON_SNAPCHAT", 1, ty.a());
        FRIENDS_WHO_ADDED_ME = new <init>("FRIENDS_WHO_ADDED_ME", 2, tJ.a());
        SUGGESTED_FRIENDS = new <init>("SUGGESTED_FRIENDS", 3, uj.a());
        FRIENDS = new <init>("FRIENDS", 4, FriendTable.f());
        SENT_SNAPS = new <init>("SENT_SNAPS", 5, SentSnapTable.a());
        RECEIVED_SNAPS = new <init>("RECEIVED_SNAPS", 6, ReceivedSnapTable.a());
        DISCOVER_SHARE_FILES = new <init>("DISCOVER_SHARE_FILES", 7, tC.a());
        CHAT_MEDIA_FILES = new <init>("CHAT_MEDIA_FILES", 8, tx.a());
        RECEIVED_SNAP_IMAGE_FILES = new <init>("RECEIVED_SNAP_IMAGE_FILES", 9, ua.a());
        RECEIVED_SNAP_VIDEO_FILES = new <init>("RECEIVED_SNAP_VIDEO_FILES", 10, ub.a());
        STORY_SNAP_IMAGE_FILES = new <init>("STORY_SNAP_IMAGE_FILES", 11, ug.a());
        RECEIVED_STORY_SNAP_THUMBNAIL_FILES = new <init>("RECEIVED_STORY_SNAP_THUMBNAIL_FILES", 12, uc.a());
        MY_STORY_SNAP_THUMBNAIL_FILES = new <init>("MY_STORY_SNAP_THUMBNAIL_FILES", 13, tU.a());
        STORY_SNAP_VIDEO_FILES = new <init>("STORY_SNAP_VIDEO_FILES", 14, ui.a());
        PREVIEW_SNAP_VIDEO_FILE = new <init>("PREVIEW_SNAP_VIDEO_FILE", 15, tW.a());
        DSNAP_MEDIA_FILES = new <init>("DSNAP_MEDIA_FILES", 16, tB.a());
        MY_SNAP_VIDEO_FILES = new <init>("MY_SNAP_VIDEO_FILES", 17, tT.a());
        MY_SNAP_IMAGE_FILES = new <init>("MY_SNAP_IMAGE_FILES", 18, tS.a());
        STORY_GROUPS = new <init>("STORY_GROUPS", 19, StoryGroupTable.a());
        MY_POSTED_STORYSNAPS = new <init>("MY_POSTED_STORYSNAPS", 20, tR.a());
        FRIEND_STORIES = new <init>("FRIEND_STORIES", 21, tI.a());
        STORY_METADATA = new <init>("STORY_METADATA", 22, StoryMetadataTable.a());
        STORY_AD_STREAM_DATA_TABLE = new <init>("STORY_AD_STREAM_DATA_TABLE", 23, StoryAdStreamDataTable.a());
        POSTING_SNAPBRYOS = new <init>("POSTING_SNAPBRYOS", 24, tV.a());
        FAILED_POST_SNAPBRYOS = new <init>("FAILED_POST_SNAPBRYOS", 25, tE.a());
        FAILED_SEND_SNAPBRYOS = new <init>("FAILED_SEND_SNAPBRYOS", 26, tG.a());
        FAILED_SEND_DSNAPBRYOS = new <init>("FAILED_SEND_DSNAPBRYOS", 27, tF.a());
        FAILED_CHAT_MEDIA_SNAPBRYOS = new <init>("FAILED_CHAT_MEDIA_SNAPBRYOS", 28, tD.a());
        SENDING_SNAPBRYOS = new <init>("SENDING_SNAPBRYOS", 29, uf.a());
        SENDING_DSNAPBRYOS = new <init>("SENDING_DSNAPBRYOS", 30, ue.a());
        CONVERSATION = new <init>("CONVERSATION", 31, ConversationTable.a());
        CHAT = new <init>("CHAT", 32, ChatTable.a());
        NOTIFICATION = new <init>("NOTIFICATION", 33, NotificationTable.a());
        CHATS_FROM_LAST_HOUR = new <init>("CHATS_FROM_LAST_HOUR", 34, ChatsReceivedInLastHourTable.a());
        CLEARED_CHAT_IDS = new <init>("CLEARED_CHAT_IDS", 35, ClearedChatIdsTable.a());
        GEO_LENSES_METADATA = new <init>("GEO_LENSES_METADATA", 36, tK.a());
        SCHEDULED_LENSES_METADATA = new <init>("SCHEDULED_LENSES_METADATA", 37, ud.a());
        PROMO_LENSES_METADATA = new <init>("PROMO_LENSES_METADATA", 38, tY.a());
        PURCHASED_LENSES_METADATA = new <init>("PURCHASED_LENSES_METADATA", 39, tZ.a());
        LENSES_RESOURCES = new <init>("LENSES_RESOURCES", 40, tQ.a());
        GEOFILTER_FILES = new <init>("GEOFILTER_FILES", 41, tL.a());
        GEOFILTER_METADATA = new <init>("GEOFILTER_METADATA", 42, tw.a());
        FONT = new <init>("FONT", 43, tv.a());
        HAS_SEEN_OUR_STORY_DIALOG_TABLE = new <init>("HAS_SEEN_OUR_STORY_DIALOG_TABLE", 44, tO.a());
        HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE = new <init>("HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE", 45, tN.a());
        STORY_SNAP_NOTE_TABLE = new <init>("STORY_SNAP_NOTE_TABLE", 46, uh.a());
        DATA_CONSUMPTION_RECORDS = new <init>("DATA_CONSUMPTION_RECORDS", 47, DataConsumptionRecordTable.a());
        VERIFIED_DEVICE = new <init>("VERIFIED_DEVICE", 48, ul.a());
        HTTP_METRICS = new <init>("HTTP_METRICS", 49, tP.a());
        CASH_FEED_ITEM = new <init>("CASH_FEED_ITEM", 50, CashFeedItemTable.a());
        PUBLISHER_CHANNELS = new <init>("PUBLISHER_CHANNELS", 51, PublisherChannelTable.a());
        EDITIONS = new <init>("EDITIONS", 52, EditionTable.a());
        EDITION_CHUNKS = new <init>("EDITION_CHUNKS", 53, EditionChunkTable.a());
        DSNAPS = new <init>("DSNAPS", 54, DSnapTable.a());
        DSNAP_ITEMS = new <init>("DSNAP_ITEMS", 55, DSnapItemTable.a());
        INTRO_VIDEO_FILES = new <init>("INTRO_VIDEO_FILES", 56, vF.a());
        PUBLISHER_ICONS = new <init>("PUBLISHER_ICONS", 57, vG.a());
        EDITION_CHUNK_FILES = new <init>("EDITION_CHUNK_FILES", 58, vE.a());
        EDITION_VIEW_STATE = new <init>("EDITION_VIEW_STATE", 59, EditionViewStateTable.a());
        CHANNEL_VIEW_STATE = new <init>("CHANNEL_VIEW_STATE", 60, ChannelViewStateTable.a());
        DSNAP_VIEW_STATE = new <init>("DSNAP_VIEW_STATE", 61, DSnapViewStateTable.a());
        PROFILE_IMAGE_FILE_TABLE = new <init>("PROFILE_IMAGE_FILE_TABLE", 62, tX.a());
        FRIEND_PROFILE_IMAGE_FILE_TABLE = new <init>("FRIEND_PROFILE_IMAGE_FILE_TABLE", 63, tH.a());
        FINDFRIENDS_REQUEST_CACHE = new <init>("FINDFRIENDS_REQUEST_CACHE", 64, FindFriendRequestCacheTable.a());
        CHANNEL_VIEW_DATES = new <init>("CHANNEL_VIEW_DATES", 65, ChannelViewDatesTable.a());
        CHANNEL_UPDATE_DATES = new <init>("CHANNEL_UPDATE_DATES", 66, ChannelUpdateDatesTable.a());
        FRIENDMOJI_EDITABLE_DICTIONARY = new <init>("FRIENDMOJI_EDITABLE_DICTIONARY", 67, FriendmojiEditableDictionaryTable.a());
        FRIENDMOJI_READONLY_DICTIONARY = new <init>("FRIENDMOJI_READONLY_DICTIONARY", 68, FriendmojiReadOnlyDictionaryTable.a());
        VIEWING_SESSIONS = new <init>("VIEWING_SESSIONS", 69, ScreenshotDetectionSessionTable.a());
        ANALYTICS_EVENTS = new <init>("ANALYTICS_EVENTS", 70, UpdateSnapsAnalyticsTable.a());
        $VALUES = (new .VALUES[] {
            CONTACTS_ON_SNAPCHAT, CONTACTS_NOT_ON_SNAPCHAT, FRIENDS_WHO_ADDED_ME, SUGGESTED_FRIENDS, FRIENDS, SENT_SNAPS, RECEIVED_SNAPS, DISCOVER_SHARE_FILES, CHAT_MEDIA_FILES, RECEIVED_SNAP_IMAGE_FILES, 
            RECEIVED_SNAP_VIDEO_FILES, STORY_SNAP_IMAGE_FILES, RECEIVED_STORY_SNAP_THUMBNAIL_FILES, MY_STORY_SNAP_THUMBNAIL_FILES, STORY_SNAP_VIDEO_FILES, PREVIEW_SNAP_VIDEO_FILE, DSNAP_MEDIA_FILES, MY_SNAP_VIDEO_FILES, MY_SNAP_IMAGE_FILES, STORY_GROUPS, 
            MY_POSTED_STORYSNAPS, FRIEND_STORIES, STORY_METADATA, STORY_AD_STREAM_DATA_TABLE, POSTING_SNAPBRYOS, FAILED_POST_SNAPBRYOS, FAILED_SEND_SNAPBRYOS, FAILED_SEND_DSNAPBRYOS, FAILED_CHAT_MEDIA_SNAPBRYOS, SENDING_SNAPBRYOS, 
            SENDING_DSNAPBRYOS, CONVERSATION, CHAT, NOTIFICATION, CHATS_FROM_LAST_HOUR, CLEARED_CHAT_IDS, GEO_LENSES_METADATA, SCHEDULED_LENSES_METADATA, PROMO_LENSES_METADATA, PURCHASED_LENSES_METADATA, 
            LENSES_RESOURCES, GEOFILTER_FILES, GEOFILTER_METADATA, FONT, HAS_SEEN_OUR_STORY_DIALOG_TABLE, HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE, STORY_SNAP_NOTE_TABLE, DATA_CONSUMPTION_RECORDS, VERIFIED_DEVICE, HTTP_METRICS, 
            CASH_FEED_ITEM, PUBLISHER_CHANNELS, EDITIONS, EDITION_CHUNKS, DSNAPS, DSNAP_ITEMS, INTRO_VIDEO_FILES, PUBLISHER_ICONS, EDITION_CHUNK_FILES, EDITION_VIEW_STATE, 
            CHANNEL_VIEW_STATE, DSNAP_VIEW_STATE, PROFILE_IMAGE_FILE_TABLE, FRIEND_PROFILE_IMAGE_FILE_TABLE, FINDFRIENDS_REQUEST_CACHE, CHANNEL_VIEW_DATES, CHANNEL_UPDATE_DATES, FRIENDMOJI_EDITABLE_DICTIONARY, FRIENDMOJI_READONLY_DICTIONARY, VIEWING_SESSIONS, 
            ANALYTICS_EVENTS
        });
    }

    private ble(String s, int i, DbTable dbtable)
    {
        super(s, i);
        a = dbtable;
    }
}
