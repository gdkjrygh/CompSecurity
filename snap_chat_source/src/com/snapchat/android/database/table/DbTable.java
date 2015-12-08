// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import Bt;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.ads.StoryAdStreamDataTable;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
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
import com.snapchat.android.util.debug.ReleaseManager;
import ea;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
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
import tt;
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
//            FriendTable, SentSnapTable, ReceivedSnapTable, StoryGroupTable, 
//            StoryMetadataTable, ConversationTable, ChatTable, NotificationTable, 
//            ChatsReceivedInLastHourTable, ClearedChatIdsTable, CashFeedItemTable, FindFriendRequestCacheTable, 
//            FriendmojiEditableDictionaryTable, FriendmojiReadOnlyDictionaryTable, ScreenshotDetectionSessionTable, UpdateSnapsAnalyticsTable

public abstract class DbTable
{
    public static final class DatabaseTable extends Enum
    {

        private static final DatabaseTable $VALUES[];
        public static final DatabaseTable ANALYTICS_EVENTS;
        public static final DatabaseTable CASH_FEED_ITEM;
        public static final DatabaseTable CHANNEL_UPDATE_DATES;
        public static final DatabaseTable CHANNEL_VIEW_DATES;
        public static final DatabaseTable CHANNEL_VIEW_STATE;
        public static final DatabaseTable CHAT;
        public static final DatabaseTable CHATS_FROM_LAST_HOUR;
        public static final DatabaseTable CHAT_MEDIA_FILES;
        public static final DatabaseTable CLEARED_CHAT_IDS;
        public static final DatabaseTable CONTACTS_NOT_ON_SNAPCHAT;
        public static final DatabaseTable CONTACTS_ON_SNAPCHAT;
        public static final DatabaseTable CONVERSATION;
        public static final DatabaseTable DATA_CONSUMPTION_RECORDS;
        public static final DatabaseTable DISCOVER_SHARE_FILES;
        public static final DatabaseTable DSNAPS;
        public static final DatabaseTable DSNAP_ITEMS;
        public static final DatabaseTable DSNAP_MEDIA_FILES;
        public static final DatabaseTable DSNAP_VIEW_STATE;
        public static final DatabaseTable EDITIONS;
        public static final DatabaseTable EDITION_CHUNKS;
        public static final DatabaseTable EDITION_CHUNK_FILES;
        public static final DatabaseTable EDITION_VIEW_STATE;
        public static final DatabaseTable FAILED_CHAT_MEDIA_SNAPBRYOS;
        public static final DatabaseTable FAILED_POST_SNAPBRYOS;
        public static final DatabaseTable FAILED_SEND_DSNAPBRYOS;
        public static final DatabaseTable FAILED_SEND_SNAPBRYOS;
        public static final DatabaseTable FINDFRIENDS_REQUEST_CACHE;
        public static final DatabaseTable FONT;
        public static final DatabaseTable FRIENDMOJI_EDITABLE_DICTIONARY;
        public static final DatabaseTable FRIENDMOJI_READONLY_DICTIONARY;
        public static final DatabaseTable FRIENDS;
        public static final DatabaseTable FRIENDS_WHO_ADDED_ME;
        public static final DatabaseTable FRIEND_PROFILE_IMAGE_FILE_TABLE;
        public static final DatabaseTable FRIEND_STORIES;
        public static final DatabaseTable GEOFILTER_FILES;
        public static final DatabaseTable GEOFILTER_METADATA;
        public static final DatabaseTable GEO_LENSES_METADATA;
        public static final DatabaseTable HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE;
        public static final DatabaseTable HAS_SEEN_OUR_STORY_DIALOG_TABLE;
        public static final DatabaseTable HTTP_METRICS;
        public static final DatabaseTable INTRO_VIDEO_FILES;
        public static final DatabaseTable LENSES_RESOURCES;
        public static final DatabaseTable MY_POSTED_STORYSNAPS;
        public static final DatabaseTable MY_SNAP_IMAGE_FILES;
        public static final DatabaseTable MY_SNAP_VIDEO_FILES;
        public static final DatabaseTable MY_STORY_SNAP_THUMBNAIL_FILES;
        public static final DatabaseTable NOTIFICATION;
        public static final DatabaseTable POSTING_SNAPBRYOS;
        public static final DatabaseTable PREVIEW_SNAP_VIDEO_FILE;
        public static final DatabaseTable PROFILE_IMAGE_FILE_TABLE;
        public static final DatabaseTable PROMO_LENSES_METADATA;
        public static final DatabaseTable PUBLISHER_CHANNELS;
        public static final DatabaseTable PUBLISHER_ICONS;
        public static final DatabaseTable PURCHASED_LENSES_METADATA;
        public static final DatabaseTable RECEIVED_SNAPS;
        public static final DatabaseTable RECEIVED_SNAP_IMAGE_FILES;
        public static final DatabaseTable RECEIVED_SNAP_VIDEO_FILES;
        public static final DatabaseTable RECEIVED_STORY_SNAP_THUMBNAIL_FILES;
        public static final DatabaseTable SCHEDULED_LENSES_METADATA;
        public static final DatabaseTable SENDING_DSNAPBRYOS;
        public static final DatabaseTable SENDING_SNAPBRYOS;
        public static final DatabaseTable SENT_SNAPS;
        public static final DatabaseTable STORY_AD_STREAM_DATA_TABLE;
        public static final DatabaseTable STORY_GROUPS;
        public static final DatabaseTable STORY_METADATA;
        public static final DatabaseTable STORY_SNAP_IMAGE_FILES;
        public static final DatabaseTable STORY_SNAP_NOTE_TABLE;
        public static final DatabaseTable STORY_SNAP_VIDEO_FILES;
        public static final DatabaseTable SUGGESTED_FRIENDS;
        public static final DatabaseTable VERIFIED_DEVICE;
        public static final DatabaseTable VIEWING_SESSIONS;
        private DbTable a;

        public static DatabaseTable valueOf(String s)
        {
            return (DatabaseTable)Enum.valueOf(com/snapchat/android/database/table/DbTable$DatabaseTable, s);
        }

        public static DatabaseTable[] values()
        {
            return (DatabaseTable[])$VALUES.clone();
        }

        public final DbTable getTable()
        {
            return a;
        }

        static 
        {
            CONTACTS_ON_SNAPCHAT = new DatabaseTable("CONTACTS_ON_SNAPCHAT", 0, tz.a());
            CONTACTS_NOT_ON_SNAPCHAT = new DatabaseTable("CONTACTS_NOT_ON_SNAPCHAT", 1, ty.a());
            FRIENDS_WHO_ADDED_ME = new DatabaseTable("FRIENDS_WHO_ADDED_ME", 2, tJ.a());
            SUGGESTED_FRIENDS = new DatabaseTable("SUGGESTED_FRIENDS", 3, uj.a());
            FRIENDS = new DatabaseTable("FRIENDS", 4, FriendTable.f());
            SENT_SNAPS = new DatabaseTable("SENT_SNAPS", 5, SentSnapTable.a());
            RECEIVED_SNAPS = new DatabaseTable("RECEIVED_SNAPS", 6, ReceivedSnapTable.a());
            DISCOVER_SHARE_FILES = new DatabaseTable("DISCOVER_SHARE_FILES", 7, tC.a());
            CHAT_MEDIA_FILES = new DatabaseTable("CHAT_MEDIA_FILES", 8, tx.a());
            RECEIVED_SNAP_IMAGE_FILES = new DatabaseTable("RECEIVED_SNAP_IMAGE_FILES", 9, ua.a());
            RECEIVED_SNAP_VIDEO_FILES = new DatabaseTable("RECEIVED_SNAP_VIDEO_FILES", 10, ub.a());
            STORY_SNAP_IMAGE_FILES = new DatabaseTable("STORY_SNAP_IMAGE_FILES", 11, ug.a());
            RECEIVED_STORY_SNAP_THUMBNAIL_FILES = new DatabaseTable("RECEIVED_STORY_SNAP_THUMBNAIL_FILES", 12, uc.a());
            MY_STORY_SNAP_THUMBNAIL_FILES = new DatabaseTable("MY_STORY_SNAP_THUMBNAIL_FILES", 13, tU.a());
            STORY_SNAP_VIDEO_FILES = new DatabaseTable("STORY_SNAP_VIDEO_FILES", 14, ui.a());
            PREVIEW_SNAP_VIDEO_FILE = new DatabaseTable("PREVIEW_SNAP_VIDEO_FILE", 15, tW.a());
            DSNAP_MEDIA_FILES = new DatabaseTable("DSNAP_MEDIA_FILES", 16, tB.a());
            MY_SNAP_VIDEO_FILES = new DatabaseTable("MY_SNAP_VIDEO_FILES", 17, tT.a());
            MY_SNAP_IMAGE_FILES = new DatabaseTable("MY_SNAP_IMAGE_FILES", 18, tS.a());
            STORY_GROUPS = new DatabaseTable("STORY_GROUPS", 19, StoryGroupTable.a());
            MY_POSTED_STORYSNAPS = new DatabaseTable("MY_POSTED_STORYSNAPS", 20, tR.a());
            FRIEND_STORIES = new DatabaseTable("FRIEND_STORIES", 21, tI.a());
            STORY_METADATA = new DatabaseTable("STORY_METADATA", 22, StoryMetadataTable.a());
            STORY_AD_STREAM_DATA_TABLE = new DatabaseTable("STORY_AD_STREAM_DATA_TABLE", 23, StoryAdStreamDataTable.a());
            POSTING_SNAPBRYOS = new DatabaseTable("POSTING_SNAPBRYOS", 24, tV.a());
            FAILED_POST_SNAPBRYOS = new DatabaseTable("FAILED_POST_SNAPBRYOS", 25, tE.a());
            FAILED_SEND_SNAPBRYOS = new DatabaseTable("FAILED_SEND_SNAPBRYOS", 26, tG.a());
            FAILED_SEND_DSNAPBRYOS = new DatabaseTable("FAILED_SEND_DSNAPBRYOS", 27, tF.a());
            FAILED_CHAT_MEDIA_SNAPBRYOS = new DatabaseTable("FAILED_CHAT_MEDIA_SNAPBRYOS", 28, tD.a());
            SENDING_SNAPBRYOS = new DatabaseTable("SENDING_SNAPBRYOS", 29, uf.a());
            SENDING_DSNAPBRYOS = new DatabaseTable("SENDING_DSNAPBRYOS", 30, ue.a());
            CONVERSATION = new DatabaseTable("CONVERSATION", 31, ConversationTable.a());
            CHAT = new DatabaseTable("CHAT", 32, ChatTable.a());
            NOTIFICATION = new DatabaseTable("NOTIFICATION", 33, NotificationTable.a());
            CHATS_FROM_LAST_HOUR = new DatabaseTable("CHATS_FROM_LAST_HOUR", 34, ChatsReceivedInLastHourTable.a());
            CLEARED_CHAT_IDS = new DatabaseTable("CLEARED_CHAT_IDS", 35, ClearedChatIdsTable.a());
            GEO_LENSES_METADATA = new DatabaseTable("GEO_LENSES_METADATA", 36, tK.a());
            SCHEDULED_LENSES_METADATA = new DatabaseTable("SCHEDULED_LENSES_METADATA", 37, ud.a());
            PROMO_LENSES_METADATA = new DatabaseTable("PROMO_LENSES_METADATA", 38, tY.a());
            PURCHASED_LENSES_METADATA = new DatabaseTable("PURCHASED_LENSES_METADATA", 39, tZ.a());
            LENSES_RESOURCES = new DatabaseTable("LENSES_RESOURCES", 40, tQ.a());
            GEOFILTER_FILES = new DatabaseTable("GEOFILTER_FILES", 41, tL.a());
            GEOFILTER_METADATA = new DatabaseTable("GEOFILTER_METADATA", 42, tw.a());
            FONT = new DatabaseTable("FONT", 43, tv.a());
            HAS_SEEN_OUR_STORY_DIALOG_TABLE = new DatabaseTable("HAS_SEEN_OUR_STORY_DIALOG_TABLE", 44, tO.a());
            HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE = new DatabaseTable("HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE", 45, tN.a());
            STORY_SNAP_NOTE_TABLE = new DatabaseTable("STORY_SNAP_NOTE_TABLE", 46, uh.a());
            DATA_CONSUMPTION_RECORDS = new DatabaseTable("DATA_CONSUMPTION_RECORDS", 47, DataConsumptionRecordTable.a());
            VERIFIED_DEVICE = new DatabaseTable("VERIFIED_DEVICE", 48, ul.a());
            HTTP_METRICS = new DatabaseTable("HTTP_METRICS", 49, tP.a());
            CASH_FEED_ITEM = new DatabaseTable("CASH_FEED_ITEM", 50, CashFeedItemTable.a());
            PUBLISHER_CHANNELS = new DatabaseTable("PUBLISHER_CHANNELS", 51, PublisherChannelTable.a());
            EDITIONS = new DatabaseTable("EDITIONS", 52, EditionTable.a());
            EDITION_CHUNKS = new DatabaseTable("EDITION_CHUNKS", 53, EditionChunkTable.a());
            DSNAPS = new DatabaseTable("DSNAPS", 54, DSnapTable.a());
            DSNAP_ITEMS = new DatabaseTable("DSNAP_ITEMS", 55, DSnapItemTable.a());
            INTRO_VIDEO_FILES = new DatabaseTable("INTRO_VIDEO_FILES", 56, vF.a());
            PUBLISHER_ICONS = new DatabaseTable("PUBLISHER_ICONS", 57, vG.a());
            EDITION_CHUNK_FILES = new DatabaseTable("EDITION_CHUNK_FILES", 58, vE.a());
            EDITION_VIEW_STATE = new DatabaseTable("EDITION_VIEW_STATE", 59, EditionViewStateTable.a());
            CHANNEL_VIEW_STATE = new DatabaseTable("CHANNEL_VIEW_STATE", 60, ChannelViewStateTable.a());
            DSNAP_VIEW_STATE = new DatabaseTable("DSNAP_VIEW_STATE", 61, DSnapViewStateTable.a());
            PROFILE_IMAGE_FILE_TABLE = new DatabaseTable("PROFILE_IMAGE_FILE_TABLE", 62, tX.a());
            FRIEND_PROFILE_IMAGE_FILE_TABLE = new DatabaseTable("FRIEND_PROFILE_IMAGE_FILE_TABLE", 63, tH.a());
            FINDFRIENDS_REQUEST_CACHE = new DatabaseTable("FINDFRIENDS_REQUEST_CACHE", 64, FindFriendRequestCacheTable.a());
            CHANNEL_VIEW_DATES = new DatabaseTable("CHANNEL_VIEW_DATES", 65, ChannelViewDatesTable.a());
            CHANNEL_UPDATE_DATES = new DatabaseTable("CHANNEL_UPDATE_DATES", 66, ChannelUpdateDatesTable.a());
            FRIENDMOJI_EDITABLE_DICTIONARY = new DatabaseTable("FRIENDMOJI_EDITABLE_DICTIONARY", 67, FriendmojiEditableDictionaryTable.a());
            FRIENDMOJI_READONLY_DICTIONARY = new DatabaseTable("FRIENDMOJI_READONLY_DICTIONARY", 68, FriendmojiReadOnlyDictionaryTable.a());
            VIEWING_SESSIONS = new DatabaseTable("VIEWING_SESSIONS", 69, ScreenshotDetectionSessionTable.a());
            ANALYTICS_EVENTS = new DatabaseTable("ANALYTICS_EVENTS", 70, UpdateSnapsAnalyticsTable.a());
            $VALUES = (new DatabaseTable[] {
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

        private DatabaseTable(String s, int i1, DbTable dbtable)
        {
            super(s, i1);
            a = dbtable;
        }
    }

    public static final class DatabaseTableGroup extends Enum
    {

        private static final DatabaseTableGroup $VALUES[];
        public static final DatabaseTableGroup DISCOVER_GROUP;
        public static final DatabaseTableGroup FRIEND_GROUP;
        public static final DatabaseTableGroup GEOFILTER_GROUP;
        public static final DatabaseTableGroup IDENTITY_GROUP;
        public static final DatabaseTableGroup LENSES_GROUP;
        public static final DatabaseTableGroup MISC_GROUPS;
        public static final DatabaseTableGroup STORY_AND_CHAT_GROUP;
        private final List a;
        private final boolean b;

        public static DatabaseTableGroup valueOf(String s)
        {
            return (DatabaseTableGroup)Enum.valueOf(com/snapchat/android/database/table/DbTable$DatabaseTableGroup, s);
        }

        public static DatabaseTableGroup[] values()
        {
            return (DatabaseTableGroup[])$VALUES.clone();
        }

        public final List getDatabaseTables()
        {
            return a;
        }

        public final boolean isLateLoading()
        {
            return b;
        }

        static 
        {
            FRIEND_GROUP = new DatabaseTableGroup("FRIEND_GROUP", 0, ea.a(DatabaseTable.CONTACTS_ON_SNAPCHAT, DatabaseTable.CONTACTS_NOT_ON_SNAPCHAT, DatabaseTable.FRIENDS_WHO_ADDED_ME, DatabaseTable.SUGGESTED_FRIENDS, DatabaseTable.FRIENDS));
            STORY_AND_CHAT_GROUP = new DatabaseTableGroup("STORY_AND_CHAT_GROUP", 1, ea.a(DatabaseTable.SENT_SNAPS, DatabaseTable.RECEIVED_SNAPS, DatabaseTable.DISCOVER_SHARE_FILES, DatabaseTable.CHAT_MEDIA_FILES, DatabaseTable.RECEIVED_SNAP_IMAGE_FILES, DatabaseTable.RECEIVED_SNAP_VIDEO_FILES, DatabaseTable.STORY_SNAP_IMAGE_FILES, DatabaseTable.RECEIVED_STORY_SNAP_THUMBNAIL_FILES, DatabaseTable.MY_STORY_SNAP_THUMBNAIL_FILES, DatabaseTable.STORY_SNAP_VIDEO_FILES, DatabaseTable.DSNAP_MEDIA_FILES, DatabaseTable.STORY_GROUPS, new DatabaseTable[] {
                DatabaseTable.MY_POSTED_STORYSNAPS, DatabaseTable.FRIEND_STORIES, DatabaseTable.STORY_METADATA, DatabaseTable.STORY_AD_STREAM_DATA_TABLE, DatabaseTable.MY_SNAP_VIDEO_FILES, DatabaseTable.MY_SNAP_IMAGE_FILES, DatabaseTable.FAILED_POST_SNAPBRYOS, DatabaseTable.FAILED_SEND_SNAPBRYOS, DatabaseTable.FAILED_SEND_DSNAPBRYOS, DatabaseTable.FAILED_CHAT_MEDIA_SNAPBRYOS, 
                DatabaseTable.PREVIEW_SNAP_VIDEO_FILE, DatabaseTable.POSTING_SNAPBRYOS, DatabaseTable.SENDING_SNAPBRYOS, DatabaseTable.SENDING_DSNAPBRYOS, DatabaseTable.CONVERSATION, DatabaseTable.CHAT, DatabaseTable.NOTIFICATION, DatabaseTable.CHATS_FROM_LAST_HOUR, DatabaseTable.CLEARED_CHAT_IDS, DatabaseTable.CASH_FEED_ITEM
            }));
            GEOFILTER_GROUP = new DatabaseTableGroup("GEOFILTER_GROUP", 2, ea.a(DatabaseTable.GEOFILTER_FILES, DatabaseTable.GEOFILTER_METADATA, DatabaseTable.FONT, DatabaseTable.HAS_SEEN_OUR_STORY_DIALOG_TABLE, DatabaseTable.HAS_SEEN_OUR_CAMPUS_STORY_DIALOG_TABLE, DatabaseTable.STORY_SNAP_NOTE_TABLE, DatabaseTable.DATA_CONSUMPTION_RECORDS));
            IDENTITY_GROUP = new DatabaseTableGroup("IDENTITY_GROUP", 3, ea.a(DatabaseTable.VERIFIED_DEVICE, DatabaseTable.PROFILE_IMAGE_FILE_TABLE, DatabaseTable.FRIEND_PROFILE_IMAGE_FILE_TABLE, DatabaseTable.FINDFRIENDS_REQUEST_CACHE, DatabaseTable.FRIENDMOJI_EDITABLE_DICTIONARY, DatabaseTable.FRIENDMOJI_READONLY_DICTIONARY));
            DISCOVER_GROUP = new DatabaseTableGroup("DISCOVER_GROUP", 4, ea.a(DatabaseTable.PUBLISHER_ICONS, DatabaseTable.INTRO_VIDEO_FILES, DatabaseTable.EDITION_CHUNK_FILES, DatabaseTable.EDITION_VIEW_STATE, DatabaseTable.CHANNEL_VIEW_STATE, DatabaseTable.DSNAP_VIEW_STATE, DatabaseTable.CHANNEL_VIEW_DATES, DatabaseTable.CHANNEL_UPDATE_DATES));
            MISC_GROUPS = new DatabaseTableGroup("MISC_GROUPS", 5, ea.a(DatabaseTable.VIEWING_SESSIONS, DatabaseTable.ANALYTICS_EVENTS, DatabaseTable.HTTP_METRICS), true);
            LENSES_GROUP = new DatabaseTableGroup("LENSES_GROUP", 6, ea.a(DatabaseTable.SCHEDULED_LENSES_METADATA, DatabaseTable.GEO_LENSES_METADATA, DatabaseTable.PROMO_LENSES_METADATA, DatabaseTable.PURCHASED_LENSES_METADATA, DatabaseTable.LENSES_RESOURCES));
            $VALUES = (new DatabaseTableGroup[] {
                FRIEND_GROUP, STORY_AND_CHAT_GROUP, GEOFILTER_GROUP, IDENTITY_GROUP, DISCOVER_GROUP, MISC_GROUPS, LENSES_GROUP
            });
        }

        private DatabaseTableGroup(String s, int i1, ea ea1)
        {
            this(s, i1, ea1, false);
        }

        private DatabaseTableGroup(String s, int i1, ea ea1, boolean flag)
        {
            super(s, i1);
            a = ea1;
            b = flag;
        }
    }


    private static final String TAG = "DbTable";
    protected static Lock sTableLock = new ReentrantLock();
    public SQLiteDatabase mDatabase;

    public DbTable()
    {
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s)
    {
        Timber.c("DbTable", (new StringBuilder("Drop table ")).append(s).toString(), new Object[0]);
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
    }

    public static Lock i()
    {
        return sTableLock;
    }

    public abstract ContentValues a(Object obj);

    public Object a(Cursor cursor)
    {
        return null;
    }

    public abstract Collection a(Br br);

    public final List a(String s, String s1)
    {
        sTableLock.lock();
        if (m() == null)
        {
            return null;
        }
        s = mDatabase.query(c(), null, s, null, null, null, s1);
        s1 = new ArrayList();
        Timber.b("DbTable", "Querying [%s] database table", new Object[] {
            c()
        });
        s.moveToFirst();
_L2:
        Object obj;
        if (s.isAfterLast())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a(((Cursor) (s)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1.add(obj);
        if (s.moveToNext()) goto _L2; else goto _L1
_L1:
        Timber.b("DbTable", "DbTable [%s] retrieved %d elements of data", new Object[] {
            c(), Integer.valueOf(s1.size())
        });
        if (s != null)
        {
            s.close();
        }
        sTableLock.unlock();
        return s1;
        s1;
        if (s != null)
        {
            s.close();
        }
        sTableLock.unlock();
        throw s1;
    }

    public void b(Br br)
    {
    }

    public abstract tt[] b();

    public abstract String c();

    public void c(Br br)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        break MISSING_BLOCK_LABEL_5;
_L6:
        do
        {
            do
            {
                return;
            } while (e() || m() == null);
            if (br.mInitialized)
            {
                break;
            }
            br = new RuntimeException("saveToDatabase(User) should not be performed with a uninitialized user! This may be a source of data corruption in db.");
            Timber.e("DbTable", br.getMessage(), new Object[0]);
            if (ReleaseManager.a().c())
            {
                throw new RuntimeException(br);
            }
        } while (true);
        sTableLock.lock();
        mDatabase.beginTransaction();
        j();
        br = a(br);
        boolean flag1 = flag2;
        if (br == null) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        if (br.isEmpty()) goto _L2; else goto _L3
_L3:
        Timber.c("DbTable", (new StringBuilder("saveAllTablesToDatabaseAsync ")).append(c()).append(" ").append(br.size()).append(" item(s)").toString(), new Object[0]);
        br = br.iterator();
_L4:
        flag1 = flag;
        ContentValues contentvalues;
        if (!br.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        contentvalues = a(br.next());
        if (contentvalues == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (contentvalues.size() > 0 && mDatabase.insert(c(), null, contentvalues) == -1L)
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L2
_L2:
        mDatabase.setTransactionSuccessful();
        mDatabase.endTransaction();
        sTableLock.unlock();
        if (!flag1) goto _L6; else goto _L5
_L5:
        Bt.a();
        Bt.aP();
        return;
        br;
        mDatabase.endTransaction();
        sTableLock.unlock();
        Bt.a();
        Bt.aP();
        throw br;
    }

    public String d()
    {
        tt att[] = b();
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = att.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj = att[i1];
            if (i1 > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(((tt) (obj)).getColumnName()).append(" ").append(((tt) (obj)).getDataType().toString()).toString());
            obj = ((tt) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    public final void d(Br br)
    {
        if (m() == null)
        {
            return;
        }
        sTableLock.lock();
        Timber.c("DbTable", "Calling populateUserObjectFromTable from %s table", new Object[] {
            c()
        });
        b(br);
        sTableLock.unlock();
        return;
        br;
        sTableLock.unlock();
        throw br;
    }

    public boolean e()
    {
        return false;
    }

    public final void j()
    {
        mDatabase.delete(c(), null, null);
    }

    public void k()
    {
        String s;
        s = c();
        if (m() == null)
        {
            Timber.c("DbTable", "DB-LOG: Deleting %s table but openDatabase returned null!", new Object[] {
                s
            });
            return;
        }
        sTableLock.lock();
        Timber.c("DbTable", "DB-LOG: Deleting %s table", new Object[] {
            s
        });
        j();
        sTableLock.unlock();
_L2:
        Timber.c("DbTable", "DB-LOG: Deleted %s table", new Object[] {
            s
        });
        return;
        Exception exception1;
        exception1;
        Timber.c("DbTable", "DB-LOG: Deleting %s table encountered exception %s", new Object[] {
            s, Log.getStackTraceString(exception1)
        });
        sTableLock.unlock();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        sTableLock.unlock();
        throw exception;
    }

    public boolean l()
    {
        return true;
    }

    public final SQLiteDatabase m()
    {
        DatabaseHelper databasehelper = DatabaseHelper.a(SnapchatApplication.get());
        if (databasehelper == null)
        {
            Timber.e("DbTable", "Database helper is null", new Object[0]);
            return null;
        }
        mDatabase = databasehelper.getWritableDatabase();
        if (mDatabase == null)
        {
            Timber.e("DbTable", "Writeable database is null", new Object[0]);
            return null;
        } else
        {
            return mDatabase;
        }
    }

}
