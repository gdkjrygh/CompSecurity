// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.android.common.SharedPreferencesCompat;
import com.android.common.content.ProjectionMap;
import com.google.android.gms.chimera.BaseGmsContentProvider;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.provider.TableJoiner;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.cache.TransientDataHolderCache;
import com.google.android.gms.games.constants.OfflineMatchAction;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.utils.UriUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.games.provider:
//            ColumnSpec, GamesDataStore, GamesDatabaseHelper, ImageStore, 
//            GamesContractInternal

public class PlayGamesContentProvider extends BaseGmsContentProvider
{
    private class DataDeleter
    {

        private final DataDeleterAssociatedQuery mAssociatedQueries[];
        private final String mColumnId;
        private final String mImageColumns[];
        private final HashMap mTableAndForeignKeyPairs;
        private final String mTableName;
        final PlayGamesContentProvider this$0;

        public int delete(GamesDataStore gamesdatastore, long l)
        {
            SQLiteDatabase sqlitedatabase;
            String as[];
            int i;
            int j;
            sqlitedatabase = gamesdatastore.mDatabaseHelper.getWritableDatabase();
            if (mImageColumns != null && !deleteImageReferences(gamesdatastore, mTableName, l, mImageColumns))
            {
                return 0;
            }
            as = new String[1];
            as[0] = String.valueOf(l);
            if (mAssociatedQueries == null)
            {
                break MISSING_BLOCK_LABEL_248;
            }
            i = 0;
            j = mAssociatedQueries.length;
_L5:
            if (i >= j) goto _L2; else goto _L1
_L1:
            DataDeleterAssociatedQuery datadeleterassociatedquery;
            Object obj;
            datadeleterassociatedquery = mAssociatedQueries[i];
            obj = datadeleterassociatedquery.readTable;
            String s1 = datadeleterassociatedquery.readColumn;
            String s2 = (new StringBuilder()).append(datadeleterassociatedquery.readSelection).append("=?").toString();
            obj = sqlitedatabase.query(((String) (obj)), new String[] {
                s1
            }, s2, as, null, null, null);
_L4:
            if (!((Cursor) (obj)).moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            if (datadeleterassociatedquery.deleter == null)
            {
                sqlitedatabase.delete(datadeleterassociatedquery.deleteTable, datadeleterassociatedquery.deleteSelection, new String[] {
                    ((Cursor) (obj)).getString(0)
                });
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_211;
            gamesdatastore;
            ((Cursor) (obj)).close();
            throw gamesdatastore;
            datadeleterassociatedquery.deleter.delete(gamesdatastore, ((Cursor) (obj)).getLong(0));
            if (true) goto _L4; else goto _L3
_L3:
            ((Cursor) (obj)).close();
            i++;
              goto _L5
_L2:
            if (mTableAndForeignKeyPairs != null)
            {
                String s;
                for (gamesdatastore = mTableAndForeignKeyPairs.keySet().iterator(); gamesdatastore.hasNext(); sqlitedatabase.delete(s, (new StringBuilder()).append((String)mTableAndForeignKeyPairs.get(s)).append("=?").toString(), as))
                {
                    s = (String)gamesdatastore.next();
                }

            }
            return sqlitedatabase.delete(mTableName, (new StringBuilder()).append(mColumnId).append("=?").toString(), as);
        }

        DataDeleter(String s, String s1)
        {
            this(s, s1, null, null, null);
        }

        DataDeleter(String s, String s1, String as[])
        {
            this(s, s1, as, null, null);
        }

        DataDeleter(String s, String s1, String as[], DataDeleterAssociatedQuery adatadeleterassociatedquery[], HashMap hashmap)
        {
            this$0 = PlayGamesContentProvider.this;
            super();
            mColumnId = s1;
            mTableName = s;
            mImageColumns = as;
            mTableAndForeignKeyPairs = hashmap;
            mAssociatedQueries = adatadeleterassociatedquery;
        }
    }

    private static final class DataDeleterAssociatedQuery
    {

        public final String deleteSelection;
        public final String deleteTable;
        public final DataDeleter deleter;
        public final String readColumn;
        public final String readSelection;
        public final String readTable;

        DataDeleterAssociatedQuery(String s, String s1, String s2, DataDeleter datadeleter)
        {
            readColumn = s1;
            deleteSelection = null;
            deleteTable = null;
            deleter = datadeleter;
            readSelection = s2;
            readTable = s;
        }

        DataDeleterAssociatedQuery(String s, String s1, String s2, String s3, String s4)
        {
            readColumn = s1;
            deleteSelection = s4;
            deleteTable = s3;
            deleter = null;
            readSelection = s2;
            readTable = s;
        }
    }

    private static final class GamesProjectionMapBuilder extends com.android.common.content.ProjectionMap.Builder
    {

        private final Uri mUri;

        public final volatile com.android.common.content.ProjectionMap.Builder add(String s)
        {
            return add(s);
        }

        public final volatile com.android.common.content.ProjectionMap.Builder add(String s, String s1)
        {
            return add(s, s1);
        }

        public final GamesProjectionMapBuilder add(String s)
        {
            return (GamesProjectionMapBuilder)super.add(s);
        }

        public final GamesProjectionMapBuilder add(String s, String s1)
        {
            return (GamesProjectionMapBuilder)super.add(s, s1);
        }

        public final GamesProjectionMapBuilder addAchievementDefinitionColumns()
        {
            addAll(GamesContractInternal.AchievementDefinitions.ALL_COLUMNS);
            add("unlocked_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "unlocked_icon_image_id"));
            add("unlocked_icon_image_url", PlayGamesContentProvider.createImageUrl("achievement_definitions", "unlocked_icon_image_id"));
            add("revealed_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "revealed_icon_image_id"));
            add("revealed_icon_image_url", PlayGamesContentProvider.createImageUrl("achievement_definitions", "revealed_icon_image_id"));
            return this;
        }

        public final volatile com.android.common.content.ProjectionMap.Builder addAll(String as[])
        {
            return addAll(as);
        }

        public final GamesProjectionMapBuilder addAll(String as[])
        {
            return (GamesProjectionMapBuilder)super.addAll(as);
        }

        public final GamesProjectionMapBuilder addEventDefinitionColumns()
        {
            addAll(GamesContractInternal.EventDefinitions.ALL_COLUMNS);
            add("icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "icon_image_id"));
            add("icon_image_url", PlayGamesContentProvider.createImageUrl("event_definitions", "icon_image_id"));
            return this;
        }

        public final GamesProjectionMapBuilder addGameBadgesColumns()
        {
            addAll(GamesContractInternal.GameBadges.ALL_COLUMNS);
            add("badge_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "badge_icon_image_id"));
            return this;
        }

        public final GamesProjectionMapBuilder addGamesColumns()
        {
            addAll(GamesContractInternal.Games.ALL_COLUMNS);
            add("game_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "game_icon_image_id"));
            add("game_icon_image_url", PlayGamesContentProvider.createImageUrl("games", "game_icon_image_id"));
            add("game_hi_res_image_uri", PlayGamesContentProvider.createImageUri(mUri, "game_hi_res_image_id"));
            add("game_hi_res_image_url", PlayGamesContentProvider.createImageUrl("games", "game_hi_res_image_id"));
            add("featured_image_uri", PlayGamesContentProvider.createImageUri(mUri, "featured_image_id"));
            add("featured_image_url", PlayGamesContentProvider.createImageUrl("games", "featured_image_id"));
            add("screenshot_image_uris", PlayGamesContentProvider.createImageUri(mUri, "screenshot_image_ids"));
            return this;
        }

        public final GamesProjectionMapBuilder addLeaderboardsColumns()
        {
            addAll(GamesContractInternal.Leaderboards.ALL_COLUMNS);
            add("board_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "board_icon_image_id"));
            add("board_icon_image_url", PlayGamesContentProvider.createImageUrl("leaderboards", "board_icon_image_id"));
            return this;
        }

        public final GamesProjectionMapBuilder addPlayersColumns()
        {
            addAll(GamesContractInternal.Players.ALL_COLUMNS);
            add("profile_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "profile_icon_image_id"));
            add("profile_icon_image_url", PlayGamesContentProvider.createImageUrl("players", "profile_icon_image_id"));
            add("profile_hi_res_image_uri", PlayGamesContentProvider.createImageUri(mUri, "profile_hi_res_image_id"));
            add("profile_hi_res_image_url", PlayGamesContentProvider.createImageUrl("players", "profile_hi_res_image_id"));
            add("most_recent_game_icon_uri", PlayGamesContentProvider.createImageUri(mUri, "most_recent_game_icon_id"));
            add("most_recent_game_hi_res_uri", PlayGamesContentProvider.createImageUri(mUri, "most_recent_game_hi_res_id"));
            add("most_recent_game_featured_uri", PlayGamesContentProvider.createImageUri(mUri, "most_recent_game_featured_id"));
            add("banner_image_landscape_uri", PlayGamesContentProvider.createImageUri(mUri, "banner_image_landscape_id"));
            add("banner_image_landscape_url", PlayGamesContentProvider.createImageUrl("players", "banner_image_landscape_id"));
            add("banner_image_portrait_uri", PlayGamesContentProvider.createImageUri(mUri, "banner_image_portrait_id"));
            add("banner_image_portrait_url", PlayGamesContentProvider.createImageUrl("players", "banner_image_portrait_id"));
            return this;
        }

        public final GamesProjectionMapBuilder addQuestsColumns()
        {
            addAll(GamesContractInternal.Quests.ALL_COLUMNS);
            add("quest_icon_image_uri", PlayGamesContentProvider.createImageUri(mUri, "quest_icon_image_id"));
            add("quest_icon_image_url", PlayGamesContentProvider.createImageUrl("quests", "quest_icon_image_id"));
            add("quest_banner_image_uri", PlayGamesContentProvider.createImageUri(mUri, "quest_banner_image_id"));
            add("quest_banner_image_url", PlayGamesContentProvider.createImageUrl("quests", "quest_banner_image_id"));
            return this;
        }

        GamesProjectionMapBuilder(Uri uri)
        {
            mUri = uri;
        }
    }

    private final class ImageCleaner
    {

        private final GamesDataStore mDataStore;
        private final HashSet mImageIdColumns = new HashSet();
        final HashSet mUsedImageIds = new HashSet();
        final PlayGamesContentProvider this$0;

        private static void cleanupDatabase(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
        {
            Cursor cursor;
            boolean flag1;
            s2 = (new StringBuilder()).append(s1).append(" IN (").append(s2).append(")").toString();
            cursor = sqlitedatabase.query(s, new String[] {
                "_id", s1
            }, s2, null, null, null, null);
            flag1 = false;
            int i = cursor.getCount();
            if (i != 0) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            cursor.close();
            if (flag)
            {
                return;
            } else
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.putNull(s1);
                sqlitedatabase.update(s, contentvalues, s2, null);
                return;
            }
_L2:
            flag = flag1;
            if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
            GamesLog.w("GamesContentProvider", (new StringBuilder("Found a dangling image reference: ")).append(s).append(".").append(s1).append(" | id : ").append(cursor.getLong(0)).append(" | image id : ").append(cursor.getLong(1)).toString());
              goto _L2
              goto _L4
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        private Set getAllUsedImageKeys(SQLiteDatabase sqlitedatabase)
        {
            HashSet hashset = new HashSet(mUsedImageIds);
            for (Iterator iterator = mImageIdColumns.iterator(); iterator.hasNext(); getUsedKeysForImageColumn(sqlitedatabase, (Pair)iterator.next(), hashset)) { }
            getUsedKeysForImageColumnsInCaches(hashset);
            return hashset;
        }

        private static void getUsedKeysForImageColumn(SQLiteDatabase sqlitedatabase, Pair pair, Set set)
        {
            String s = (String)pair.first;
            pair = (String)pair.second;
            String s1 = (new StringBuilder()).append(pair).append(" IS NOT NULL").toString();
            sqlitedatabase = sqlitedatabase.query(s, new String[] {
                pair
            }, s1, null, null, null, null);
            while (sqlitedatabase.moveToNext()) 
            {
                set.add(Long.valueOf(sqlitedatabase.getLong(0)));
            }
            break MISSING_BLOCK_LABEL_95;
            pair;
            sqlitedatabase.close();
            throw pair;
            sqlitedatabase.close();
            return;
        }

        private static void getUsedKeysForImageColumnsInCaches(Set set)
        {
label0:
            {
                synchronized (PlayGamesContentProvider.CACHE_LIST_LOCK)
                {
                    if (PlayGamesContentProvider.sCacheList != null)
                    {
                        break label0;
                    }
                }
                return;
            }
            GamesLog.d("GamesContentProvider", String.format("sCacheList - %d keys in use before and processing %d caches", new Object[] {
                Integer.valueOf(set.size()), Integer.valueOf(PlayGamesContentProvider.sCacheList.size())
            }));
            int i = 0;
            int l = PlayGamesContentProvider.sCacheList.size();
_L11:
            if (i >= l) goto _L2; else goto _L1
_L1:
            TransientDataHolderCache transientdataholdercache;
            String as[];
            Iterator iterator;
            transientdataholdercache = (TransientDataHolderCache)PlayGamesContentProvider.sCacheList.get(i);
            as = transientdataholdercache.mImageColumns;
            GamesLog.d("GamesContentProvider", String.format("sCacheList - contains %d keys", new Object[] {
                Integer.valueOf(transientdataholdercache.getCacheKeys().size())
            }));
            iterator = transientdataholdercache.getCacheKeys().iterator();
_L9:
            DataHolder dataholder;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_348;
            }
            Object obj1 = iterator.next();
            dataholder = transientdataholdercache.getData(obj1, null);
            GamesLog.d("GamesContentProvider", String.format("sCacheList - processing cache key (%s) with %d rows", new Object[] {
                obj1, Integer.valueOf(dataholder.mRowCount)
            }));
            int i1 = dataholder.mRowCount;
            int j = 0;
_L8:
            if (j >= i1) goto _L4; else goto _L3
_L3:
            int j1 = as.length;
            int k = 0;
_L6:
            if (k >= j1)
            {
                continue; /* Loop/switch isn't completed */
            }
            String s = dataholder.getString(as[k], j, dataholder.getWindowIndex(j));
            if (!TextUtils.isEmpty(s))
            {
                set.add(Long.decode(Uri.parse(s).getLastPathSegment()));
            }
_L7:
            k++;
            if (true) goto _L6; else goto _L5
_L5:
            Object obj2;
            continue; /* Loop/switch isn't completed */
            obj2;
            GamesLog.e("GamesContentProvider", "sCacheList - couldn't parse URI", ((Throwable) (obj2)));
              goto _L7
            set;
            dataholder.close();
            throw set;
            set;
            obj;
            JVM INSTR monitorexit ;
            throw set;
              goto _L8
_L4:
            dataholder.close();
              goto _L9
_L2:
            GamesLog.d("GamesContentProvider", String.format("sCacheList - %d keys in use after processing caches", new Object[] {
                Integer.valueOf(set.size())
            }));
            obj;
            JVM INSTR monitorexit ;
            return;
            obj2;
              goto _L7
            i++;
            if (true) goto _L11; else goto _L10
_L10:
        }

        final void cleanupOrphans(Set set)
        {
            SQLiteDatabase sqlitedatabase;
            sqlitedatabase = mDataStore.mDatabaseHelper.getWritableDatabase();
            sqlitedatabase.beginTransaction();
            set.removeAll(getAllUsedImageKeys(sqlitedatabase));
            Long long1;
            for (set = set.iterator(); set.hasNext(); mDataStore.mImageStore.remove(long1.longValue()))
            {
                long1 = (Long)set.next();
            }

            break MISSING_BLOCK_LABEL_78;
            set;
            sqlitedatabase.endTransaction();
            throw set;
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
            return;
        }

        public final void performCleanup()
        {
            SQLiteDatabase sqlitedatabase;
            sqlitedatabase = mDataStore.mDatabaseHelper.getWritableDatabase();
            sqlitedatabase.beginTransaction();
            Object obj;
            Object obj1;
            obj = getAllUsedImageKeys(sqlitedatabase);
            obj1 = mDataStore.mImageStore.cleanup(((Set) (obj)));
            if (((Set) (obj1)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_206;
            }
            GamesLog.d("GamesContentProvider", (new StringBuilder("Found ")).append(((Set) (obj1)).size()).append(" dangling image references").toString());
            obj = new StringBuilder();
            boolean flag = true;
            obj1 = ((Set) (obj1)).iterator();
_L1:
            long l;
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_149;
            }
            l = ((Long)((Iterator) (obj1)).next()).longValue();
            if (flag)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            ((StringBuilder) (obj)).append(",");
            flag = false;
            ((StringBuilder) (obj)).append(l);
              goto _L1
            obj;
            sqlitedatabase.endTransaction();
            throw obj;
            obj = ((StringBuilder) (obj)).toString();
            Pair pair;
            for (Iterator iterator = mImageIdColumns.iterator(); iterator.hasNext(); cleanupDatabase(sqlitedatabase, (String)pair.first, (String)pair.second, ((String) (obj))))
            {
                pair = (Pair)iterator.next();
            }

            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
            return;
        }

        public final void registerImageIdColumn(String s, String s1)
        {
            mImageIdColumns.add(Pair.create(s, s1));
        }

        public ImageCleaner(GamesDataStore gamesdatastore)
        {
            this$0 = PlayGamesContentProvider.this;
            super();
            mDataStore = (GamesDataStore)Preconditions.checkNotNull(gamesdatastore);
        }
    }

    private static final class UriType extends Enum
    {

        private static final UriType $VALUES[];
        public static final UriType ACCOUNT_METADATA;
        public static final UriType ACCOUNT_METADATA_COVER_IMAGE;
        public static final UriType ACHIEVEMENT_DEFINITIONS;
        public static final UriType ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID;
        public static final UriType ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID;
        public static final UriType ACHIEVEMENT_DEFINITIONS_GAME_ID;
        public static final UriType ACHIEVEMENT_DEFINITIONS_ID;
        public static final UriType ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE;
        public static final UriType ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE;
        public static final UriType ACHIEVEMENT_INSTANCES;
        public static final UriType ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID;
        public static final UriType ACHIEVEMENT_INSTANCES_ID;
        public static final UriType ACHIEVEMENT_INSTANCES_PLAYER_ID;
        public static final UriType ACHIEVEMENT_PENDING_OPS;
        public static final UriType ACHIEVEMENT_PENDING_OPS_ID;
        public static final UriType APPLICATION_SESSIONS;
        public static final UriType APPLICATION_SESSIONS_ID;
        public static final UriType APP_CONTENT;
        public static final UriType CLEAR_DATA_FOR_LOCALE_CHANGE;
        public static final UriType CLIENT_CONTEXT;
        public static final UriType CLIENT_CONTEXT_ID;
        public static final UriType EVENT_DEFINITIONS;
        public static final UriType EVENT_DEFINITIONS_EXT_EVENT_ID;
        public static final UriType EVENT_DEFINITIONS_EXT_GAME_ID;
        public static final UriType EVENT_DEFINITIONS_GAME_ID;
        public static final UriType EVENT_DEFINITIONS_ID;
        public static final UriType EVENT_DEFINITIONS_ID_ICON_IMAGE;
        public static final UriType EVENT_INSTANCES;
        public static final UriType EVENT_INSTANCES_EXT_EVENT_ID;
        public static final UriType EVENT_INSTANCES_EXT_PLAYER_ID;
        public static final UriType EVENT_INSTANCES_ID;
        public static final UriType EVENT_INSTANCES_PLAYER_ID;
        public static final UriType EVENT_PENDING_OPS;
        public static final UriType EVENT_PENDING_OPS_EXT_EVENT_ID;
        public static final UriType EVENT_PENDING_OPS_EXT_PLAYER_ID;
        public static final UriType EVENT_PENDING_OPS_ID;
        public static final UriType EXPERIENCE_EVENTS;
        public static final UriType EXPERIENCE_EVENTS_EXT_ID;
        public static final UriType EXPERIENCE_EVENTS_ID;
        public static final UriType GAMES;
        public static final UriType GAMES_EXT_GAME_ID;
        public static final UriType GAMES_EXT_GAME_ID_FEATURED_IMAGE;
        public static final UriType GAMES_EXT_GAME_ID_ICON_IMAGE;
        public static final UriType GAMES_ID;
        public static final UriType GAMES_ID_FEATURED_IMAGE;
        public static final UriType GAMES_ID_HI_RES_IMAGE;
        public static final UriType GAMES_ID_ICON_IMAGE;
        public static final UriType GAME_BADGES;
        public static final UriType GAME_BADGES_EXT_GAME_ID;
        public static final UriType GAME_BADGES_GAME_ID;
        public static final UriType GAME_BADGES_ICON_IMAGE;
        public static final UriType GAME_BADGES_ID;
        public static final UriType GAME_INSTANCES;
        public static final UriType GAME_INSTANCES_EXT_GAME_ID;
        public static final UriType GAME_INSTANCES_GAME_ID;
        public static final UriType GAME_INSTANCES_ID;
        public static final UriType IMAGES;
        public static final UriType IMAGES_ID;
        public static final UriType INVITATIONS;
        public static final UriType INVITATIONS_EXT_INVITATION_ID;
        public static final UriType INVITATIONS_ID;
        public static final UriType INVITATIONS_RAW_ID;
        public static final UriType LEADERBOARDS;
        public static final UriType LEADERBOARDS_EXT_GAME_ID;
        public static final UriType LEADERBOARDS_EXT_LEADERBOARD_ID;
        public static final UriType LEADERBOARDS_GAME_ID;
        public static final UriType LEADERBOARDS_ID;
        public static final UriType LEADERBOARD_INSTANCES;
        public static final UriType LEADERBOARD_INSTANCES_EXT_GAME_ID;
        public static final UriType LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID;
        public static final UriType LEADERBOARD_INSTANCES_ID;
        public static final UriType LEADERBOARD_PENDING_SCORES;
        public static final UriType LEADERBOARD_PENDING_SCORES_ID;
        public static final UriType LEADERBOARD_SCORES;
        public static final UriType LEADERBOARD_SCORES_ID;
        public static final UriType LEADERBOARD_SCORES_INSTANCE_ID;
        public static final UriType MATCHES;
        public static final UriType MATCHES_EXT_GAME_ID;
        public static final UriType MATCHES_EXT_MATCH_ID;
        public static final UriType MATCHES_GAME_ID;
        public static final UriType MATCHES_ID;
        public static final UriType MATCHES_PENDING_OPS;
        public static final UriType MATCHES_PENDING_OPS_EXT_MATCH_ID;
        public static final UriType MATCHES_PENDING_OPS_ID;
        public static final UriType MATCHES_RAW_ID;
        public static final UriType MATCH_ENTITIES;
        public static final UriType MATCH_ENTITIES_EXT_MATCH_ID;
        public static final UriType MATCH_ENTITIES_MATCH_ID;
        public static final UriType NOTIFICATIONS;
        public static final UriType NOTIFICATIONS_EXT_GAME_ID;
        public static final UriType NOTIFICATIONS_GAME_ID;
        public static final UriType NOTIFICATIONS_ID;
        public static final UriType PARTICIPANTS;
        public static final UriType PARTICIPANTS_EXT_PARTICIPANT_ID;
        public static final UriType PARTICIPANTS_ID;
        public static final UriType PARTICIPANTS_INVITATION_ID;
        public static final UriType PARTICIPANTS_MATCH_ID;
        public static final UriType PLAYERS;
        public static final UriType PLAYERS_EXT_PLAYER_ID;
        public static final UriType PLAYERS_ID;
        public static final UriType PLAYERS_ID_PROFILE_HI_RES_IMAGE;
        public static final UriType PLAYERS_ID_PROFILE_ICON_IMAGE;
        public static final UriType PLAYER_LEVELS;
        public static final UriType PLAYER_LEVELS_ID;
        public static final UriType PLAYER_LEVELS_LVL_NUM;
        public static final UriType PLAYER_STATS;
        public static final UriType PLAYER_STATS_ID;
        public static final UriType PLAYER_STATS_PLAYER_AND_GAME_ID;
        public static final UriType QUESTS;
        public static final UriType QUESTS_ENTITIES;
        public static final UriType QUESTS_ENTITIES_EXT_GAME_ID;
        public static final UriType QUESTS_ENTITIES_EXT_MILESTONE_ID;
        public static final UriType QUESTS_ENTITIES_EXT_QUEST_ID;
        public static final UriType QUESTS_ENTITIES_GAME_ID;
        public static final UriType QUESTS_ENTITIES_QUEST_ID;
        public static final UriType QUESTS_EXT_GAME_ID;
        public static final UriType QUESTS_EXT_PLAYER_ID;
        public static final UriType QUESTS_EXT_QUEST_ID;
        public static final UriType QUESTS_GAME_ID;
        public static final UriType QUESTS_ID;
        public static final UriType QUESTS_ID_ICON_IMAGE;
        public static final UriType QUESTS_ID_PROMOTIONAL_IMAGE;
        public static final UriType QUESTS_PLAYER_ID;
        public static final UriType QUEST_MILESTONES;
        public static final UriType QUEST_MILESTONES_EXT_MILESTONE_ID;
        public static final UriType QUEST_MILESTONES_EXT_QUEST_ID;
        public static final UriType QUEST_MILESTONES_ID;
        public static final UriType QUEST_MILESTONES_QUEST_ID;
        public static final UriType REQUESTS;
        public static final UriType REQUESTS_ENTITIES;
        public static final UriType REQUESTS_ENTITIES_EXT_REQUEST_ID;
        public static final UriType REQUESTS_ENTITIES_REQUEST_ID;
        public static final UriType REQUESTS_EXT_REQ_ID;
        public static final UriType REQUESTS_ID;
        public static final UriType REQUESTS_RAW_ID;
        public static final UriType REQUEST_PENDING_OPS;
        public static final UriType REQUEST_PENDING_OPS_EXT_REQ_ID;
        public static final UriType REQUEST_PENDING_OPS_ID;
        public static final UriType REQUEST_RECIPIENTS;
        public static final UriType REQUEST_RECIPIENTS_ID;
        public static final UriType REQUEST_RECIPIENTS_REQ_ID;
        public static final UriType SNAPSHOTS;
        public static final UriType SNAPSHOTS_EXT_GAME_ID;
        public static final UriType SNAPSHOTS_EXT_SNAPSHOT_ID;
        public static final UriType SNAPSHOTS_GAME_ID;
        public static final UriType SNAPSHOTS_ID;
        final String mMatchPath;

        public static UriType valueOf(String s)
        {
            return (UriType)Enum.valueOf(com/google/android/gms/games/provider/PlayGamesContentProvider$UriType, s);
        }

        public static UriType[] values()
        {
            return (UriType[])$VALUES.clone();
        }

        static 
        {
            GAMES = new UriType("GAMES", 0, "games/*");
            GAMES_ID = new UriType("GAMES_ID", 1, "games/*/#");
            GAMES_EXT_GAME_ID = new UriType("GAMES_EXT_GAME_ID", 2, "games/*/ext_game/*");
            GAMES_ID_ICON_IMAGE = new UriType("GAMES_ID_ICON_IMAGE", 3, "games/*/#/icon_image");
            GAMES_EXT_GAME_ID_ICON_IMAGE = new UriType("GAMES_EXT_GAME_ID_ICON_IMAGE", 4, "games/*/ext_game/*/icon_image");
            GAMES_ID_HI_RES_IMAGE = new UriType("GAMES_ID_HI_RES_IMAGE", 5, "games/*/#/hi_res_image");
            GAMES_ID_FEATURED_IMAGE = new UriType("GAMES_ID_FEATURED_IMAGE", 6, "games/*/#/featured_image");
            GAMES_EXT_GAME_ID_FEATURED_IMAGE = new UriType("GAMES_EXT_GAME_ID_FEATURED_IMAGE", 7, "games/*/ext_game/*/featured_image");
            GAME_BADGES = new UriType("GAME_BADGES", 8, "game_badges/*");
            GAME_BADGES_ID = new UriType("GAME_BADGES_ID", 9, "game_badges/*/#");
            GAME_BADGES_GAME_ID = new UriType("GAME_BADGES_GAME_ID", 10, "game_badges/*/game/#");
            GAME_BADGES_EXT_GAME_ID = new UriType("GAME_BADGES_EXT_GAME_ID", 11, "game_badges/*/ext_game/*");
            GAME_BADGES_ICON_IMAGE = new UriType("GAME_BADGES_ICON_IMAGE", 12, "game_badges/*/#/icon_image");
            GAME_INSTANCES = new UriType("GAME_INSTANCES", 13, "game_instances/*");
            GAME_INSTANCES_ID = new UriType("GAME_INSTANCES_ID", 14, "game_instances/*/#");
            GAME_INSTANCES_GAME_ID = new UriType("GAME_INSTANCES_GAME_ID", 15, "game_instances/*/game/#");
            GAME_INSTANCES_EXT_GAME_ID = new UriType("GAME_INSTANCES_EXT_GAME_ID", 16, "game_instances/*/ext_game/*");
            PLAYERS = new UriType("PLAYERS", 17, "players/*");
            PLAYERS_ID = new UriType("PLAYERS_ID", 18, "players/*/#");
            PLAYERS_EXT_PLAYER_ID = new UriType("PLAYERS_EXT_PLAYER_ID", 19, "players/*/ext_player/*");
            PLAYERS_ID_PROFILE_ICON_IMAGE = new UriType("PLAYERS_ID_PROFILE_ICON_IMAGE", 20, "players/*/#/profile_icon_image");
            PLAYERS_ID_PROFILE_HI_RES_IMAGE = new UriType("PLAYERS_ID_PROFILE_HI_RES_IMAGE", 21, "players/*/#/profile_hi_res_image");
            PLAYER_LEVELS = new UriType("PLAYER_LEVELS", 22, "player_levels/*");
            PLAYER_LEVELS_ID = new UriType("PLAYER_LEVELS_ID", 23, "player_levels/*/#");
            PLAYER_LEVELS_LVL_NUM = new UriType("PLAYER_LEVELS_LVL_NUM", 24, "player_levels/*/player_level/#");
            PLAYER_STATS = new UriType("PLAYER_STATS", 25, "player_stats/*");
            PLAYER_STATS_ID = new UriType("PLAYER_STATS_ID", 26, "player_stats/*/#");
            PLAYER_STATS_PLAYER_AND_GAME_ID = new UriType("PLAYER_STATS_PLAYER_AND_GAME_ID", 27, "player_stats/*/player/#/game/#");
            ACHIEVEMENT_DEFINITIONS = new UriType("ACHIEVEMENT_DEFINITIONS", 28, "achievement_definitions/*");
            ACHIEVEMENT_DEFINITIONS_ID = new UriType("ACHIEVEMENT_DEFINITIONS_ID", 29, "achievement_definitions/*/#");
            ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID = new UriType("ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID", 30, "achievement_definitions/*/ext_achievement/*");
            ACHIEVEMENT_DEFINITIONS_GAME_ID = new UriType("ACHIEVEMENT_DEFINITIONS_GAME_ID", 31, "achievement_definitions/*/game/#");
            ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID = new UriType("ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID", 32, "achievement_definitions/*/ext_game/*");
            ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE = new UriType("ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE", 33, "achievement_definitions/*/#/unlocked_icon_image");
            ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE = new UriType("ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE", 34, "achievement_definitions/*/#/revealed_icon_image");
            ACHIEVEMENT_PENDING_OPS = new UriType("ACHIEVEMENT_PENDING_OPS", 35, "achievement_pending_ops/*");
            ACHIEVEMENT_PENDING_OPS_ID = new UriType("ACHIEVEMENT_PENDING_OPS_ID", 36, "achievement_pending_ops/*/#");
            ACHIEVEMENT_INSTANCES = new UriType("ACHIEVEMENT_INSTANCES", 37, "achievement_instances/*");
            ACHIEVEMENT_INSTANCES_ID = new UriType("ACHIEVEMENT_INSTANCES_ID", 38, "achievement_instances/*/#");
            ACHIEVEMENT_INSTANCES_PLAYER_ID = new UriType("ACHIEVEMENT_INSTANCES_PLAYER_ID", 39, "achievement_instances/*/player/#");
            ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID = new UriType("ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID", 40, "achievement_instances/*/ext_player/*");
            APP_CONTENT = new UriType("APP_CONTENT", 41, "app_contents/*");
            APPLICATION_SESSIONS = new UriType("APPLICATION_SESSIONS", 42, "application_sessions/*");
            APPLICATION_SESSIONS_ID = new UriType("APPLICATION_SESSIONS_ID", 43, "application_sessions/*/#");
            CLIENT_CONTEXT = new UriType("CLIENT_CONTEXT", 44, "client_contexts/*");
            CLIENT_CONTEXT_ID = new UriType("CLIENT_CONTEXT_ID", 45, "client_contexts/*/#");
            EVENT_DEFINITIONS = new UriType("EVENT_DEFINITIONS", 46, "event_definitions/*");
            EVENT_DEFINITIONS_ID = new UriType("EVENT_DEFINITIONS_ID", 47, "event_definitions/*/#");
            EVENT_DEFINITIONS_EXT_EVENT_ID = new UriType("EVENT_DEFINITIONS_EXT_EVENT_ID", 48, "event_definitions/*/ext_event/*");
            EVENT_DEFINITIONS_GAME_ID = new UriType("EVENT_DEFINITIONS_GAME_ID", 49, "event_definitions/*/game/#");
            EVENT_DEFINITIONS_EXT_GAME_ID = new UriType("EVENT_DEFINITIONS_EXT_GAME_ID", 50, "event_definitions/*/ext_game/*");
            EVENT_DEFINITIONS_ID_ICON_IMAGE = new UriType("EVENT_DEFINITIONS_ID_ICON_IMAGE", 51, "event_definitions/*/#/icon_image");
            EVENT_INSTANCES = new UriType("EVENT_INSTANCES", 52, "event_instances/*");
            EVENT_INSTANCES_ID = new UriType("EVENT_INSTANCES_ID", 53, "event_instances/*/#");
            EVENT_INSTANCES_PLAYER_ID = new UriType("EVENT_INSTANCES_PLAYER_ID", 54, "event_instances/*/player/#");
            EVENT_INSTANCES_EXT_EVENT_ID = new UriType("EVENT_INSTANCES_EXT_EVENT_ID", 55, "event_instances/*/ext_event/*");
            EVENT_INSTANCES_EXT_PLAYER_ID = new UriType("EVENT_INSTANCES_EXT_PLAYER_ID", 56, "event_instances/*/ext_player/*");
            EVENT_PENDING_OPS = new UriType("EVENT_PENDING_OPS", 57, "event_pending_ops/*");
            EVENT_PENDING_OPS_ID = new UriType("EVENT_PENDING_OPS_ID", 58, "event_pending_ops/*/#");
            EVENT_PENDING_OPS_EXT_EVENT_ID = new UriType("EVENT_PENDING_OPS_EXT_EVENT_ID", 59, "event_pending_ops/*/ext_event/*");
            EVENT_PENDING_OPS_EXT_PLAYER_ID = new UriType("EVENT_PENDING_OPS_EXT_PLAYER_ID", 60, "event_pending_ops/*/ext_player/*");
            EXPERIENCE_EVENTS = new UriType("EXPERIENCE_EVENTS", 61, "experience_events/*");
            EXPERIENCE_EVENTS_ID = new UriType("EXPERIENCE_EVENTS_ID", 62, "experience_events/*/#");
            EXPERIENCE_EVENTS_EXT_ID = new UriType("EXPERIENCE_EVENTS_EXT_ID", 63, "experience_events/*/ext_event/*");
            LEADERBOARDS = new UriType("LEADERBOARDS", 64, "leaderboards/*");
            LEADERBOARDS_ID = new UriType("LEADERBOARDS_ID", 65, "leaderboards/*/#");
            LEADERBOARDS_EXT_LEADERBOARD_ID = new UriType("LEADERBOARDS_EXT_LEADERBOARD_ID", 66, "leaderboards/*/ext_leaderboard/*");
            LEADERBOARDS_GAME_ID = new UriType("LEADERBOARDS_GAME_ID", 67, "leaderboards/*/game/#");
            LEADERBOARDS_EXT_GAME_ID = new UriType("LEADERBOARDS_EXT_GAME_ID", 68, "leaderboards/*/ext_game/*");
            LEADERBOARD_INSTANCES = new UriType("LEADERBOARD_INSTANCES", 69, "leaderboard_instances/*");
            LEADERBOARD_INSTANCES_ID = new UriType("LEADERBOARD_INSTANCES_ID", 70, "leaderboard_instances/*/#");
            LEADERBOARD_INSTANCES_EXT_GAME_ID = new UriType("LEADERBOARD_INSTANCES_EXT_GAME_ID", 71, "leaderboard_instances/*/ext_game/*");
            LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID = new UriType("LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID", 72, "leaderboard_instances/*/ext_leaderboard/*");
            LEADERBOARD_SCORES = new UriType("LEADERBOARD_SCORES", 73, "leaderboard_scores/*");
            LEADERBOARD_SCORES_ID = new UriType("LEADERBOARD_SCORES_ID", 74, "leaderboard_scores/*/#");
            LEADERBOARD_SCORES_INSTANCE_ID = new UriType("LEADERBOARD_SCORES_INSTANCE_ID", 75, "leaderboard_scores/*/instance/#");
            LEADERBOARD_PENDING_SCORES = new UriType("LEADERBOARD_PENDING_SCORES", 76, "leaderboard_pending_scores/*");
            LEADERBOARD_PENDING_SCORES_ID = new UriType("LEADERBOARD_PENDING_SCORES_ID", 77, "leaderboard_pending_scores/*/#");
            IMAGES = new UriType("IMAGES", 78, "images/*");
            IMAGES_ID = new UriType("IMAGES_ID", 79, "images/*/#");
            INVITATIONS = new UriType("INVITATIONS", 80, "invitations/*");
            INVITATIONS_ID = new UriType("INVITATIONS_ID", 81, "invitations/*/#");
            INVITATIONS_RAW_ID = new UriType("INVITATIONS_RAW_ID", 82, "invitations/*/raw_id/#");
            INVITATIONS_EXT_INVITATION_ID = new UriType("INVITATIONS_EXT_INVITATION_ID", 83, "invitations/*/ext_invitation/*");
            MATCHES = new UriType("MATCHES", 84, "matches/*");
            MATCHES_ID = new UriType("MATCHES_ID", 85, "matches/*/#");
            MATCHES_RAW_ID = new UriType("MATCHES_RAW_ID", 86, "matches/*/raw_id/#");
            MATCHES_EXT_MATCH_ID = new UriType("MATCHES_EXT_MATCH_ID", 87, "matches/*/ext_match/*");
            MATCHES_GAME_ID = new UriType("MATCHES_GAME_ID", 88, "matches/*/game/#");
            MATCHES_EXT_GAME_ID = new UriType("MATCHES_EXT_GAME_ID", 89, "matches/*/ext_game/*");
            MATCHES_PENDING_OPS = new UriType("MATCHES_PENDING_OPS", 90, "matches_pending_ops/*");
            MATCHES_PENDING_OPS_ID = new UriType("MATCHES_PENDING_OPS_ID", 91, "matches_pending_ops/*/#");
            MATCHES_PENDING_OPS_EXT_MATCH_ID = new UriType("MATCHES_PENDING_OPS_EXT_MATCH_ID", 92, "matches_pending_ops/*/ext_match/*");
            MATCH_ENTITIES = new UriType("MATCH_ENTITIES", 93, "match_entities/*");
            MATCH_ENTITIES_MATCH_ID = new UriType("MATCH_ENTITIES_MATCH_ID", 94, "match_entities/*/#");
            MATCH_ENTITIES_EXT_MATCH_ID = new UriType("MATCH_ENTITIES_EXT_MATCH_ID", 95, "match_entities/*/ext_match/*");
            NOTIFICATIONS = new UriType("NOTIFICATIONS", 96, "notifications/*");
            NOTIFICATIONS_ID = new UriType("NOTIFICATIONS_ID", 97, "notifications/*/#");
            NOTIFICATIONS_GAME_ID = new UriType("NOTIFICATIONS_GAME_ID", 98, "notifications/*/game/#");
            NOTIFICATIONS_EXT_GAME_ID = new UriType("NOTIFICATIONS_EXT_GAME_ID", 99, "notifications/*/ext_game/*");
            PARTICIPANTS = new UriType("PARTICIPANTS", 100, "participants/*");
            PARTICIPANTS_ID = new UriType("PARTICIPANTS_ID", 101, "participants/*/#");
            PARTICIPANTS_EXT_PARTICIPANT_ID = new UriType("PARTICIPANTS_EXT_PARTICIPANT_ID", 102, "participants/*/ext_participant/*");
            PARTICIPANTS_MATCH_ID = new UriType("PARTICIPANTS_MATCH_ID", 103, "participants/*/match/#");
            PARTICIPANTS_INVITATION_ID = new UriType("PARTICIPANTS_INVITATION_ID", 104, "participants/*/invitation/#");
            QUESTS = new UriType("QUESTS", 105, "quests/*");
            QUESTS_EXT_QUEST_ID = new UriType("QUESTS_EXT_QUEST_ID", 106, "quests/*/ext_quest/*");
            QUESTS_EXT_GAME_ID = new UriType("QUESTS_EXT_GAME_ID", 107, "quests/*/ext_game/*");
            QUESTS_EXT_PLAYER_ID = new UriType("QUESTS_EXT_PLAYER_ID", 108, "quests/*/ext_player/*");
            QUESTS_GAME_ID = new UriType("QUESTS_GAME_ID", 109, "quests/*/game/#");
            QUESTS_ID = new UriType("QUESTS_ID", 110, "quests/*/#");
            QUESTS_ID_ICON_IMAGE = new UriType("QUESTS_ID_ICON_IMAGE", 111, "quests/*/#/icon_image");
            QUESTS_ID_PROMOTIONAL_IMAGE = new UriType("QUESTS_ID_PROMOTIONAL_IMAGE", 112, "quests/*/#/promo_image");
            QUESTS_PLAYER_ID = new UriType("QUESTS_PLAYER_ID", 113, "quests/*/player/#");
            QUEST_MILESTONES = new UriType("QUEST_MILESTONES", 114, "milestones/*");
            QUEST_MILESTONES_EXT_MILESTONE_ID = new UriType("QUEST_MILESTONES_EXT_MILESTONE_ID", 115, "milestones/*/ext_milestone/*");
            QUEST_MILESTONES_EXT_QUEST_ID = new UriType("QUEST_MILESTONES_EXT_QUEST_ID", 116, "milestones/*/ext_quest/*");
            QUEST_MILESTONES_ID = new UriType("QUEST_MILESTONES_ID", 117, "milestones/*/#");
            QUEST_MILESTONES_QUEST_ID = new UriType("QUEST_MILESTONES_QUEST_ID", 118, "milestones/*/quest/#");
            QUESTS_ENTITIES = new UriType("QUESTS_ENTITIES", 119, "quest_entities/*");
            QUESTS_ENTITIES_QUEST_ID = new UriType("QUESTS_ENTITIES_QUEST_ID", 120, "quest_entities/*/#");
            QUESTS_ENTITIES_EXT_QUEST_ID = new UriType("QUESTS_ENTITIES_EXT_QUEST_ID", 121, "quest_entities/*/ext_quest/*");
            QUESTS_ENTITIES_GAME_ID = new UriType("QUESTS_ENTITIES_GAME_ID", 122, "quest_entities/*/game/#");
            QUESTS_ENTITIES_EXT_GAME_ID = new UriType("QUESTS_ENTITIES_EXT_GAME_ID", 123, "quest_entities/*/ext_game/*");
            QUESTS_ENTITIES_EXT_MILESTONE_ID = new UriType("QUESTS_ENTITIES_EXT_MILESTONE_ID", 124, "quest_entities/*/ext_milestone/*");
            REQUESTS = new UriType("REQUESTS", 125, "requests/*");
            REQUESTS_ID = new UriType("REQUESTS_ID", 126, "requests/*/#");
            REQUESTS_RAW_ID = new UriType("REQUESTS_RAW_ID", 127, "requests/*/raw_id/#");
            REQUESTS_EXT_REQ_ID = new UriType("REQUESTS_EXT_REQ_ID", 128, "requests/*/ext_request/*");
            REQUEST_PENDING_OPS = new UriType("REQUEST_PENDING_OPS", 129, "request_pending_ops/*");
            REQUEST_PENDING_OPS_ID = new UriType("REQUEST_PENDING_OPS_ID", 130, "request_pending_ops/*/#");
            REQUEST_PENDING_OPS_EXT_REQ_ID = new UriType("REQUEST_PENDING_OPS_EXT_REQ_ID", 131, "request_pending_ops/*/ext_request/*");
            REQUEST_RECIPIENTS = new UriType("REQUEST_RECIPIENTS", 132, "request_recipients/*");
            REQUEST_RECIPIENTS_ID = new UriType("REQUEST_RECIPIENTS_ID", 133, "request_recipients/*/#");
            REQUEST_RECIPIENTS_REQ_ID = new UriType("REQUEST_RECIPIENTS_REQ_ID", 134, "request_recipients/*/request/#");
            REQUESTS_ENTITIES = new UriType("REQUESTS_ENTITIES", 135, "request_entities/*");
            REQUESTS_ENTITIES_REQUEST_ID = new UriType("REQUESTS_ENTITIES_REQUEST_ID", 136, "request_entities/*/#");
            REQUESTS_ENTITIES_EXT_REQUEST_ID = new UriType("REQUESTS_ENTITIES_EXT_REQUEST_ID", 137, "request_entities/*/ext_request/*");
            SNAPSHOTS = new UriType("SNAPSHOTS", 138, "snapshots/*");
            SNAPSHOTS_ID = new UriType("SNAPSHOTS_ID", 139, "snapshots/*/#");
            SNAPSHOTS_EXT_SNAPSHOT_ID = new UriType("SNAPSHOTS_EXT_SNAPSHOT_ID", 140, "snapshots/*/ext_snapshot/*");
            SNAPSHOTS_GAME_ID = new UriType("SNAPSHOTS_GAME_ID", 141, "snapshots/*/game/#");
            SNAPSHOTS_EXT_GAME_ID = new UriType("SNAPSHOTS_EXT_GAME_ID", 142, "snapshots/*/ext_game/*");
            ACCOUNT_METADATA = new UriType("ACCOUNT_METADATA", 143, "account_metadata/*");
            ACCOUNT_METADATA_COVER_IMAGE = new UriType("ACCOUNT_METADATA_COVER_IMAGE", 144, "account_metadata/*/cover_image");
            CLEAR_DATA_FOR_LOCALE_CHANGE = new UriType("CLEAR_DATA_FOR_LOCALE_CHANGE", 145, "clear_for_locale_change/*");
            $VALUES = (new UriType[] {
                GAMES, GAMES_ID, GAMES_EXT_GAME_ID, GAMES_ID_ICON_IMAGE, GAMES_EXT_GAME_ID_ICON_IMAGE, GAMES_ID_HI_RES_IMAGE, GAMES_ID_FEATURED_IMAGE, GAMES_EXT_GAME_ID_FEATURED_IMAGE, GAME_BADGES, GAME_BADGES_ID, 
                GAME_BADGES_GAME_ID, GAME_BADGES_EXT_GAME_ID, GAME_BADGES_ICON_IMAGE, GAME_INSTANCES, GAME_INSTANCES_ID, GAME_INSTANCES_GAME_ID, GAME_INSTANCES_EXT_GAME_ID, PLAYERS, PLAYERS_ID, PLAYERS_EXT_PLAYER_ID, 
                PLAYERS_ID_PROFILE_ICON_IMAGE, PLAYERS_ID_PROFILE_HI_RES_IMAGE, PLAYER_LEVELS, PLAYER_LEVELS_ID, PLAYER_LEVELS_LVL_NUM, PLAYER_STATS, PLAYER_STATS_ID, PLAYER_STATS_PLAYER_AND_GAME_ID, ACHIEVEMENT_DEFINITIONS, ACHIEVEMENT_DEFINITIONS_ID, 
                ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID, ACHIEVEMENT_DEFINITIONS_GAME_ID, ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID, ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE, ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE, ACHIEVEMENT_PENDING_OPS, ACHIEVEMENT_PENDING_OPS_ID, ACHIEVEMENT_INSTANCES, ACHIEVEMENT_INSTANCES_ID, ACHIEVEMENT_INSTANCES_PLAYER_ID, 
                ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID, APP_CONTENT, APPLICATION_SESSIONS, APPLICATION_SESSIONS_ID, CLIENT_CONTEXT, CLIENT_CONTEXT_ID, EVENT_DEFINITIONS, EVENT_DEFINITIONS_ID, EVENT_DEFINITIONS_EXT_EVENT_ID, EVENT_DEFINITIONS_GAME_ID, 
                EVENT_DEFINITIONS_EXT_GAME_ID, EVENT_DEFINITIONS_ID_ICON_IMAGE, EVENT_INSTANCES, EVENT_INSTANCES_ID, EVENT_INSTANCES_PLAYER_ID, EVENT_INSTANCES_EXT_EVENT_ID, EVENT_INSTANCES_EXT_PLAYER_ID, EVENT_PENDING_OPS, EVENT_PENDING_OPS_ID, EVENT_PENDING_OPS_EXT_EVENT_ID, 
                EVENT_PENDING_OPS_EXT_PLAYER_ID, EXPERIENCE_EVENTS, EXPERIENCE_EVENTS_ID, EXPERIENCE_EVENTS_EXT_ID, LEADERBOARDS, LEADERBOARDS_ID, LEADERBOARDS_EXT_LEADERBOARD_ID, LEADERBOARDS_GAME_ID, LEADERBOARDS_EXT_GAME_ID, LEADERBOARD_INSTANCES, 
                LEADERBOARD_INSTANCES_ID, LEADERBOARD_INSTANCES_EXT_GAME_ID, LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID, LEADERBOARD_SCORES, LEADERBOARD_SCORES_ID, LEADERBOARD_SCORES_INSTANCE_ID, LEADERBOARD_PENDING_SCORES, LEADERBOARD_PENDING_SCORES_ID, IMAGES, IMAGES_ID, 
                INVITATIONS, INVITATIONS_ID, INVITATIONS_RAW_ID, INVITATIONS_EXT_INVITATION_ID, MATCHES, MATCHES_ID, MATCHES_RAW_ID, MATCHES_EXT_MATCH_ID, MATCHES_GAME_ID, MATCHES_EXT_GAME_ID, 
                MATCHES_PENDING_OPS, MATCHES_PENDING_OPS_ID, MATCHES_PENDING_OPS_EXT_MATCH_ID, MATCH_ENTITIES, MATCH_ENTITIES_MATCH_ID, MATCH_ENTITIES_EXT_MATCH_ID, NOTIFICATIONS, NOTIFICATIONS_ID, NOTIFICATIONS_GAME_ID, NOTIFICATIONS_EXT_GAME_ID, 
                PARTICIPANTS, PARTICIPANTS_ID, PARTICIPANTS_EXT_PARTICIPANT_ID, PARTICIPANTS_MATCH_ID, PARTICIPANTS_INVITATION_ID, QUESTS, QUESTS_EXT_QUEST_ID, QUESTS_EXT_GAME_ID, QUESTS_EXT_PLAYER_ID, QUESTS_GAME_ID, 
                QUESTS_ID, QUESTS_ID_ICON_IMAGE, QUESTS_ID_PROMOTIONAL_IMAGE, QUESTS_PLAYER_ID, QUEST_MILESTONES, QUEST_MILESTONES_EXT_MILESTONE_ID, QUEST_MILESTONES_EXT_QUEST_ID, QUEST_MILESTONES_ID, QUEST_MILESTONES_QUEST_ID, QUESTS_ENTITIES, 
                QUESTS_ENTITIES_QUEST_ID, QUESTS_ENTITIES_EXT_QUEST_ID, QUESTS_ENTITIES_GAME_ID, QUESTS_ENTITIES_EXT_GAME_ID, QUESTS_ENTITIES_EXT_MILESTONE_ID, REQUESTS, REQUESTS_ID, REQUESTS_RAW_ID, REQUESTS_EXT_REQ_ID, REQUEST_PENDING_OPS, 
                REQUEST_PENDING_OPS_ID, REQUEST_PENDING_OPS_EXT_REQ_ID, REQUEST_RECIPIENTS, REQUEST_RECIPIENTS_ID, REQUEST_RECIPIENTS_REQ_ID, REQUESTS_ENTITIES, REQUESTS_ENTITIES_REQUEST_ID, REQUESTS_ENTITIES_EXT_REQUEST_ID, SNAPSHOTS, SNAPSHOTS_ID, 
                SNAPSHOTS_EXT_SNAPSHOT_ID, SNAPSHOTS_GAME_ID, SNAPSHOTS_EXT_GAME_ID, ACCOUNT_METADATA, ACCOUNT_METADATA_COVER_IMAGE, CLEAR_DATA_FOR_LOCALE_CHANGE
            });
        }

        private UriType(String s, int i, String s1)
        {
            super(s, i);
            mMatchPath = s1;
        }
    }


    private static final ColumnSpec ACCOUNT_METADATA_SPEC;
    private static final String ACHIEVEMENT_DEFINITIONS_TABLE = (new TableJoiner()).base("achievement_definitions").join("games", "game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String ACHIEVEMENT_INSTANCES_TABLE = (new TableJoiner()).base("achievement_instances").join("achievement_definitions", "definition_id", "achievement_definitions._id").join("games", "game_id", "games._id").join("players", "player_id", "players._id").build();
    private static final String ACHIEVEMENT_PENDING_OPS_TABLE = (new TableJoiner()).base("achievement_pending_ops").join("client_contexts", "client_context_id", "client_contexts._id").build();
    private static final String APPLICATION_SESSION_TABLE = (new TableJoiner()).base("application_sessions").join("client_contexts", "client_context_id", "client_contexts._id").build();
    private static final Object CACHE_LIST_LOCK = new Object();
    private static final String EVENT_DEFINITIONS_TABLE = (new TableJoiner()).base("event_definitions").join("games", "event_definitions_game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String EVENT_INSTANCES_TABLE = (new TableJoiner()).base("event_instances").join("event_definitions", "definition_id", "event_definitions._id").join("games", "event_definitions_game_id", "games._id").join("players", "player_id", "players._id").build();
    private static final String EVENT_PENDING_OPS_TABLE = (new TableJoiner()).base("event_pending_ops").join("client_contexts", "client_context_id", "client_contexts._id").join("event_instances", "instance_id", "event_instances._id").join("event_definitions", "definition_id", "event_definitions._id").join("games", "event_definitions_game_id", "games._id").join("players", "player_id", "players._id").build();
    private static final String EXPERIENCE_EVENTS_TABLE = (new TableJoiner()).base("experience_events").join("games", "game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String GAMES_TABLE = (new TableJoiner()).base("games").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").outerJoin("game_badges AS Badges", "games._id", "Badges._id").build();
    private static final String GAME_BADGES_TABLE = (new TableJoiner()).base("game_badges").join("games", "badge_game_id", "games._id").build();
    private static final String GAME_FEATURED_IMAGES_TABLE = (new TableJoiner()).base("games").join("images", "featured_image_id", "images._id").build();
    private static final String GAME_HI_RES_IMAGES_TABLE = (new TableJoiner()).base("games").join("images", "game_hi_res_image_id", "images._id").build();
    private static final String GAME_ICON_IMAGES_TABLE = (new TableJoiner()).base("games").join("images", "game_icon_image_id", "images._id").build();
    private static final String GAME_INSTANCES_TABLE = (new TableJoiner()).base("game_instances").join("games", "instance_game_id", "games._id").build();
    private static final String INVITATION_ENTITIES_TABLE = (new TableJoiner()).base("invitations").join("games", "game_id", "games._id").join("participants", "invitation_id", "invitations._id").outerJoin("players AS ParticipantPlayer", "player_id", "ParticipantPlayer._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String LEADERBOARDS_TABLE = (new TableJoiner()).base("leaderboards").join("games", "game_id", "games._id").build();
    private static final String LEADERBOARD_INSTANCES_TABLE = (new TableJoiner()).base("leaderboard_instances").join("leaderboards", "leaderboard_id", "leaderboards._id").join("games", "game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String LEADERBOARD_PENDING_SCORES_TABLE = (new TableJoiner()).base("leaderboard_pending_scores").join("client_contexts", "client_context_id", "client_contexts._id").build();
    private static final String LEADERBOARD_SCORES_TABLE = (new TableJoiner()).base("leaderboard_scores").join("leaderboard_instances", "instance_id", "leaderboard_instances._id").join("leaderboards", "leaderboard_id", "leaderboards._id").outerJoin("players", "player_id", "players._id").build();
    private static final String MATCHES_PENDING_OPS_TABLE = (new TableJoiner()).base("matches_pending_ops").join("client_contexts", "client_context_id", "client_contexts._id").build();
    private static final String MATCHES_TABLE = (new TableJoiner()).base("matches").join("games", "game_id", "games._id").build();
    private static final String MATCH_ENTITIES_TABLE = (new TableJoiner()).base(MATCHES_TABLE).join("participants", "match_id", "matches._id").outerJoin("players AS ParticipantPlayer", "player_id", "ParticipantPlayer._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String NOTIFICATIONS_TABLE = (new TableJoiner()).base("notifications").join("games", "game_id", "games._id").build();
    private static final String PARTICIPANTS_TABLE = (new TableJoiner()).base("participants").outerJoin("players", "player_id", "players._id").build();
    private static final String QUESTS_ENTITIES_TABLE = (new TableJoiner()).base("quests").join("milestones", "quest_id", "quests._id").join("event_instances", "event_instance_id", "event_instances._id").join("event_definitions", "definition_id", "event_definitions._id").join("games", "game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String QUESTS_TABLE = (new TableJoiner()).base("quests").join("games", "game_id", "games._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String QUEST_MILESTONES_TABLE = (new TableJoiner()).base("milestones").join("quests", "quest_id", "quests._id").join("event_instances", "event_instance_id", "event_instances._id").build();
    private static final String REQUESTS_ENTITIES_TABLE = (new TableJoiner()).base(REQUESTS_TABLE).join("request_recipients", "request_id", "requests._id").outerJoin("players AS RequestRecipientPlayer", "player_id", "RequestRecipientPlayer._id").outerJoin("players AS RequestSenderPlayer", "sender_id", "RequestSenderPlayer._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final String REQUESTS_TABLE = (new TableJoiner()).base("requests").join("games", "game_id", "games._id").build();
    private static final String REQUEST_PENDING_OPS_TABLE = (new TableJoiner()).base("request_pending_ops").join("client_contexts", "client_context_id", "client_contexts._id").build();
    private static final String REQUEST_RECIPIENTS_TABLE = (new TableJoiner()).base("request_recipients").outerJoin("players", "player_id", "players._id").build();
    private static final String SNAPSHOTS_TABLE = (new TableJoiner()).base("snapshots").join("games", "game_id", "games._id").join("players", "owner_id", "players._id").outerJoin("game_instances AS TargetInstance", "target_instance", "TargetInstance._id").build();
    private static final ProjectionMap sAchievementPendingOpsProjectionMap;
    private static final ProjectionMap sAppContentProjectionMap;
    private static final ProjectionMap sApplicationSessionsProjectionMap;
    private static ArrayList sCacheList;
    private static final ProjectionMap sClientContextProjectionMap;
    private static final ProjectionMap sCountProjectionMap = ProjectionMap.builder().add("_count", "COUNT(*)").build();
    private static final ProjectionMap sImagesProjectionMap;
    private static final ProjectionMap sLeaderboardPendingScoresProjectionMap;
    private static final ProjectionMap sMatchesPendingOpsProjectionMap;
    private static final ProjectionMap sMatchesProjectionMap;
    private static final ProjectionMap sPlayerLevelsProjectionMap;
    private static final ProjectionMap sPlayerStatsProjectionMap;
    private static final ProjectionMap sRequestPendingOpsProjectionMap;
    private static final ProjectionMap sRequestsProjectionMap;
    private static final UriMatcher sUriMatcher;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private Clock mClock;
    private final Object mDataStoreLock = new Object();
    protected final ArrayMap mDataStores = new ArrayMap();
    private DataDeleter mDeleteAchievementDefinition;
    private DataDeleter mDeleteAchievementInstances;
    private DataDeleter mDeleteAchievementPendingOps;
    private DataDeleter mDeleteAppContentSession;
    private DataDeleter mDeleteApplicationSession;
    private DataDeleter mDeleteClientContext;
    private DataDeleter mDeleteEventDefinition;
    private DataDeleter mDeleteEventInstances;
    private DataDeleter mDeleteEventPendingOps;
    private DataDeleter mDeleteExperienceEvent;
    private DataDeleter mDeleteGame;
    private DataDeleter mDeleteGameBadge;
    private DataDeleter mDeleteImage;
    private DataDeleter mDeleteInvitation;
    private DataDeleter mDeleteLeaderboard;
    private DataDeleter mDeleteLeaderboardInstance;
    private DataDeleter mDeleteLeaderboardScore;
    private DataDeleter mDeleteMatch;
    private DataDeleter mDeleteMatchPendingOps;
    private DataDeleter mDeletePlayer;
    private DataDeleter mDeletePlayerStats;
    private DataDeleter mDeleteQuestMilestones;
    private DataDeleter mDeleteQuests;
    private DataDeleter mDeleteRequest;
    private DataDeleter mDeleteRequestPendingOps;
    private DataDeleter mDeleteSnapshots;
    private final Map mOrphanCheckImageIds = new HashMap();
    private final Object mOrphanImageLock = new Object();

    public PlayGamesContentProvider()
    {
        mClock = DefaultClock.getInstance();
    }

    public static void addCacheToImageCleaner(TransientDataHolderCache transientdataholdercache)
    {
        if (sCacheList == null)
        {
            synchronized (CACHE_LIST_LOCK)
            {
                sCacheList = new ArrayList();
            }
        }
        if (transientdataholdercache.mImageColumns.length > 0)
        {
            synchronized (CACHE_LIST_LOCK)
            {
                sCacheList.add(transientdataholdercache);
            }
        }
        return;
        transientdataholdercache;
        obj;
        JVM INSTR monitorexit ;
        throw transientdataholdercache;
        transientdataholdercache;
        obj;
        JVM INSTR monitorexit ;
        throw transientdataholdercache;
    }

    private int applyDelete(Uri uri, String s, String as[], String s1, DataDeleter datadeleter)
    {
        GamesDataStore gamesdatastore;
        int i;
        i = 0;
        gamesdatastore = getDataStore$743ee347(uri);
        uri = query(uri, new String[] {
            s1
        }, s, as, null);
_L2:
        int j;
        if (!uri.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = datadeleter.delete(gamesdatastore, uri.getLong(0));
        i += j;
        if (true) goto _L2; else goto _L1
_L1:
        uri.close();
        return i;
        s;
        uri.close();
        throw s;
    }

    private static String createImageUri(Uri uri, String s)
    {
        return (new StringBuilder("'")).append(GamesContractInternal.Images.getContentUri(uri).toString()).append("/'||").append(s).toString();
    }

    private static String createImageUrl(String s, String s1)
    {
        return String.format("(SELECT url FROM images innerimage WHERE innerimage._id=%s.%s LIMIT 1)", new Object[] {
            s, s1
        });
    }

    private transient boolean deleteImageReferences(GamesDataStore gamesdatastore, String s, long l, String as[])
    {
        Cursor cursor = gamesdatastore.mDatabaseHelper.getReadableDatabase().query(s, as, "_id=?", new String[] {
            String.valueOf(l)
        }, null, null, null);
        if (cursor.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        GamesLog.w("GamesContentProvider", (new StringBuilder("Attempting to delete a row from ")).append(s).append(" that doesn't exist.  ID: ").append(l).toString());
        cursor.close();
        return false;
        cursor.moveToFirst();
        int i = 0;
_L2:
        String s1;
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (cursor.isNull(i))
        {
            break MISSING_BLOCK_LABEL_227;
        }
        s1 = gamesdatastore.mName;
        l = cursor.getLong(i);
        Object obj = mOrphanImageLock;
        obj;
        JVM INSTR monitorenter ;
        Set set = (Set)mOrphanCheckImageIds.get(s1);
        s = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        s = new HashSet();
        mOrphanCheckImageIds.put(s1, s);
        s.add(Long.valueOf(l));
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_227;
        gamesdatastore;
        obj;
        JVM INSTR monitorexit ;
        throw gamesdatastore;
        gamesdatastore;
        cursor.close();
        throw gamesdatastore;
        cursor.close();
        return true;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private GamesDataStore getDataStore$743ee347(Uri uri)
    {
        String s;
        s = UriUtils.getDataStoreNameFromUri(uri);
        if (!DATABASE_LOCK.isHeldByCurrentThread())
        {
            Asserts.fail("Must hold the database lock!");
        }
        Object obj = mDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        GamesDataStore gamesdatastore = (GamesDataStore)mDataStores.get(s);
        uri = gamesdatastore;
        if (gamesdatastore != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        uri = new GamesDataStore(getContext(), s);
        mDataStores.put(((GamesDataStore) (uri)).mName, uri);
        scheduleBackgroundTask(0, s, 0L);
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
    }

    private ImageCleaner getImageCleaner(GamesDataStore gamesdatastore)
    {
        if (!gamesdatastore.initialize(getContext()))
        {
            return null;
        }
        ImageCleaner imagecleaner = new ImageCleaner(gamesdatastore);
        long l = gamesdatastore.getPrefs(getContext()).getLong("cover_photo_image_id", -1L);
        if (l != -1L)
        {
            imagecleaner.mUsedImageIds.add(Long.valueOf(l));
        }
        imagecleaner.registerImageIdColumn("games", "game_icon_image_id");
        imagecleaner.registerImageIdColumn("games", "game_hi_res_image_id");
        imagecleaner.registerImageIdColumn("games", "featured_image_id");
        imagecleaner.registerImageIdColumn("game_badges", "badge_icon_image_id");
        imagecleaner.registerImageIdColumn("players", "profile_icon_image_id");
        imagecleaner.registerImageIdColumn("players", "profile_hi_res_image_id");
        imagecleaner.registerImageIdColumn("event_definitions", "icon_image_id");
        imagecleaner.registerImageIdColumn("achievement_definitions", "unlocked_icon_image_id");
        imagecleaner.registerImageIdColumn("achievement_definitions", "revealed_icon_image_id");
        imagecleaner.registerImageIdColumn("experience_events", "icon_id");
        imagecleaner.registerImageIdColumn("leaderboards", "board_icon_image_id");
        imagecleaner.registerImageIdColumn("leaderboard_scores", "default_display_image_id");
        imagecleaner.registerImageIdColumn("notifications", "image_id");
        imagecleaner.registerImageIdColumn("participants", "default_display_image_id");
        imagecleaner.registerImageIdColumn("participants", "default_display_hi_res_image_id");
        imagecleaner.registerImageIdColumn("quests", "quest_banner_image_id");
        imagecleaner.registerImageIdColumn("quests", "quest_icon_image_id");
        imagecleaner.registerImageIdColumn("snapshots", "cover_icon_image_id");
        return imagecleaner;
    }

    private long getImageId(SQLiteDatabase sqlitedatabase, Uri uri)
        throws FileNotFoundException
    {
        UriType uritype = matchUri(uri);
        static final class _cls3
        {

            static final int $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[];
            static final int $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[];

            static 
            {
                $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType = new int[UriType.values().length];
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror147) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_ID.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror146) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_ID_ICON_IMAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror145) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_EXT_GAME_ID_ICON_IMAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror144) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_ID_HI_RES_IMAGE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror143) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_ID_FEATURED_IMAGE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror142) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_EXT_GAME_ID_FEATURED_IMAGE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror141) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAMES_EXT_GAME_ID.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror140) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_BADGES.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror139) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_BADGES_ID.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror138) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_BADGES_GAME_ID.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror137) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_BADGES_EXT_GAME_ID.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror136) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_INSTANCES.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror135) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_INSTANCES_ID.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror134) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_INSTANCES_GAME_ID.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror133) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_INSTANCES_EXT_GAME_ID.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror132) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYERS.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror131) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYERS_ID.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror130) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYERS_EXT_PLAYER_ID.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror129) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_LEVELS.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror128) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_LEVELS_ID.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror127) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_LEVELS_LVL_NUM.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror126) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_STATS_ID.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror125) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_STATS_PLAYER_AND_GAME_ID.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror124) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACCOUNT_METADATA.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror123) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror122) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_ID.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror121) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror120) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_GAME_ID.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror119) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror118) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_PENDING_OPS.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror117) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_PENDING_OPS_ID.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror116) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_INSTANCES.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror115) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_INSTANCES_ID.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror114) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_INSTANCES_PLAYER_ID.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror113) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror112) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS.ordinal()] = 37;
                }
                catch (NoSuchFieldError nosuchfielderror111) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS_ID.ordinal()] = 38;
                }
                catch (NoSuchFieldError nosuchfielderror110) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS_GAME_ID.ordinal()] = 39;
                }
                catch (NoSuchFieldError nosuchfielderror109) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS_EXT_EVENT_ID.ordinal()] = 40;
                }
                catch (NoSuchFieldError nosuchfielderror108) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS_EXT_GAME_ID.ordinal()] = 41;
                }
                catch (NoSuchFieldError nosuchfielderror107) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_INSTANCES.ordinal()] = 42;
                }
                catch (NoSuchFieldError nosuchfielderror106) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_INSTANCES_ID.ordinal()] = 43;
                }
                catch (NoSuchFieldError nosuchfielderror105) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_INSTANCES_PLAYER_ID.ordinal()] = 44;
                }
                catch (NoSuchFieldError nosuchfielderror104) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_INSTANCES_EXT_PLAYER_ID.ordinal()] = 45;
                }
                catch (NoSuchFieldError nosuchfielderror103) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_INSTANCES_EXT_EVENT_ID.ordinal()] = 46;
                }
                catch (NoSuchFieldError nosuchfielderror102) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_PENDING_OPS.ordinal()] = 47;
                }
                catch (NoSuchFieldError nosuchfielderror101) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_PENDING_OPS_ID.ordinal()] = 48;
                }
                catch (NoSuchFieldError nosuchfielderror100) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_PENDING_OPS_EXT_EVENT_ID.ordinal()] = 49;
                }
                catch (NoSuchFieldError nosuchfielderror99) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_PENDING_OPS_EXT_PLAYER_ID.ordinal()] = 50;
                }
                catch (NoSuchFieldError nosuchfielderror98) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.APPLICATION_SESSIONS.ordinal()] = 51;
                }
                catch (NoSuchFieldError nosuchfielderror97) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.APPLICATION_SESSIONS_ID.ordinal()] = 52;
                }
                catch (NoSuchFieldError nosuchfielderror96) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.APP_CONTENT.ordinal()] = 53;
                }
                catch (NoSuchFieldError nosuchfielderror95) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.CLIENT_CONTEXT.ordinal()] = 54;
                }
                catch (NoSuchFieldError nosuchfielderror94) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.CLIENT_CONTEXT_ID.ordinal()] = 55;
                }
                catch (NoSuchFieldError nosuchfielderror93) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EXPERIENCE_EVENTS.ordinal()] = 56;
                }
                catch (NoSuchFieldError nosuchfielderror92) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EXPERIENCE_EVENTS_ID.ordinal()] = 57;
                }
                catch (NoSuchFieldError nosuchfielderror91) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EXPERIENCE_EVENTS_EXT_ID.ordinal()] = 58;
                }
                catch (NoSuchFieldError nosuchfielderror90) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARDS.ordinal()] = 59;
                }
                catch (NoSuchFieldError nosuchfielderror89) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARDS_ID.ordinal()] = 60;
                }
                catch (NoSuchFieldError nosuchfielderror88) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARDS_EXT_LEADERBOARD_ID.ordinal()] = 61;
                }
                catch (NoSuchFieldError nosuchfielderror87) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARDS_GAME_ID.ordinal()] = 62;
                }
                catch (NoSuchFieldError nosuchfielderror86) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARDS_EXT_GAME_ID.ordinal()] = 63;
                }
                catch (NoSuchFieldError nosuchfielderror85) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_INSTANCES.ordinal()] = 64;
                }
                catch (NoSuchFieldError nosuchfielderror84) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_INSTANCES_ID.ordinal()] = 65;
                }
                catch (NoSuchFieldError nosuchfielderror83) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_INSTANCES_EXT_GAME_ID.ordinal()] = 66;
                }
                catch (NoSuchFieldError nosuchfielderror82) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID.ordinal()] = 67;
                }
                catch (NoSuchFieldError nosuchfielderror81) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_SCORES.ordinal()] = 68;
                }
                catch (NoSuchFieldError nosuchfielderror80) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_SCORES_ID.ordinal()] = 69;
                }
                catch (NoSuchFieldError nosuchfielderror79) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_SCORES_INSTANCE_ID.ordinal()] = 70;
                }
                catch (NoSuchFieldError nosuchfielderror78) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_PENDING_SCORES.ordinal()] = 71;
                }
                catch (NoSuchFieldError nosuchfielderror77) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.IMAGES.ordinal()] = 72;
                }
                catch (NoSuchFieldError nosuchfielderror76) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.IMAGES_ID.ordinal()] = 73;
                }
                catch (NoSuchFieldError nosuchfielderror75) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.INVITATIONS.ordinal()] = 74;
                }
                catch (NoSuchFieldError nosuchfielderror74) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.INVITATIONS_ID.ordinal()] = 75;
                }
                catch (NoSuchFieldError nosuchfielderror73) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.INVITATIONS_RAW_ID.ordinal()] = 76;
                }
                catch (NoSuchFieldError nosuchfielderror72) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.INVITATIONS_EXT_INVITATION_ID.ordinal()] = 77;
                }
                catch (NoSuchFieldError nosuchfielderror71) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_PENDING_OPS.ordinal()] = 78;
                }
                catch (NoSuchFieldError nosuchfielderror70) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_PENDING_OPS_ID.ordinal()] = 79;
                }
                catch (NoSuchFieldError nosuchfielderror69) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_PENDING_OPS_EXT_REQ_ID.ordinal()] = 80;
                }
                catch (NoSuchFieldError nosuchfielderror68) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS.ordinal()] = 81;
                }
                catch (NoSuchFieldError nosuchfielderror67) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_ID.ordinal()] = 82;
                }
                catch (NoSuchFieldError nosuchfielderror66) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_EXT_REQ_ID.ordinal()] = 83;
                }
                catch (NoSuchFieldError nosuchfielderror65) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_RECIPIENTS.ordinal()] = 84;
                }
                catch (NoSuchFieldError nosuchfielderror64) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_RECIPIENTS_ID.ordinal()] = 85;
                }
                catch (NoSuchFieldError nosuchfielderror63) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUEST_RECIPIENTS_REQ_ID.ordinal()] = 86;
                }
                catch (NoSuchFieldError nosuchfielderror62) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_RAW_ID.ordinal()] = 87;
                }
                catch (NoSuchFieldError nosuchfielderror61) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES.ordinal()] = 88;
                }
                catch (NoSuchFieldError nosuchfielderror60) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_ID.ordinal()] = 89;
                }
                catch (NoSuchFieldError nosuchfielderror59) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_RAW_ID.ordinal()] = 90;
                }
                catch (NoSuchFieldError nosuchfielderror58) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_EXT_MATCH_ID.ordinal()] = 91;
                }
                catch (NoSuchFieldError nosuchfielderror57) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_GAME_ID.ordinal()] = 92;
                }
                catch (NoSuchFieldError nosuchfielderror56) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_EXT_GAME_ID.ordinal()] = 93;
                }
                catch (NoSuchFieldError nosuchfielderror55) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_PENDING_OPS.ordinal()] = 94;
                }
                catch (NoSuchFieldError nosuchfielderror54) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_PENDING_OPS_ID.ordinal()] = 95;
                }
                catch (NoSuchFieldError nosuchfielderror53) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCHES_PENDING_OPS_EXT_MATCH_ID.ordinal()] = 96;
                }
                catch (NoSuchFieldError nosuchfielderror52) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PARTICIPANTS.ordinal()] = 97;
                }
                catch (NoSuchFieldError nosuchfielderror51) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PARTICIPANTS_ID.ordinal()] = 98;
                }
                catch (NoSuchFieldError nosuchfielderror50) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PARTICIPANTS_EXT_PARTICIPANT_ID.ordinal()] = 99;
                }
                catch (NoSuchFieldError nosuchfielderror49) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PARTICIPANTS_MATCH_ID.ordinal()] = 100;
                }
                catch (NoSuchFieldError nosuchfielderror48) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PARTICIPANTS_INVITATION_ID.ordinal()] = 101;
                }
                catch (NoSuchFieldError nosuchfielderror47) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS.ordinal()] = 102;
                }
                catch (NoSuchFieldError nosuchfielderror46) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ID.ordinal()] = 103;
                }
                catch (NoSuchFieldError nosuchfielderror45) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_GAME_ID.ordinal()] = 104;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_EXT_GAME_ID.ordinal()] = 105;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_EXT_QUEST_ID.ordinal()] = 106;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES.ordinal()] = 107;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES_QUEST_ID.ordinal()] = 108;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES_EXT_QUEST_ID.ordinal()] = 109;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES_GAME_ID.ordinal()] = 110;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES_EXT_GAME_ID.ordinal()] = 111;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ENTITIES_EXT_MILESTONE_ID.ordinal()] = 112;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUEST_MILESTONES.ordinal()] = 113;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUEST_MILESTONES_ID.ordinal()] = 114;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUEST_MILESTONES_EXT_MILESTONE_ID.ordinal()] = 115;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUEST_MILESTONES_QUEST_ID.ordinal()] = 116;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUEST_MILESTONES_EXT_QUEST_ID.ordinal()] = 117;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_ENTITIES.ordinal()] = 118;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_ENTITIES_REQUEST_ID.ordinal()] = 119;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.REQUESTS_ENTITIES_EXT_REQUEST_ID.ordinal()] = 120;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCH_ENTITIES.ordinal()] = 121;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCH_ENTITIES_MATCH_ID.ordinal()] = 122;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.MATCH_ENTITIES_EXT_MATCH_ID.ordinal()] = 123;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.NOTIFICATIONS.ordinal()] = 124;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.NOTIFICATIONS_ID.ordinal()] = 125;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.NOTIFICATIONS_GAME_ID.ordinal()] = 126;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.NOTIFICATIONS_EXT_GAME_ID.ordinal()] = 127;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.SNAPSHOTS.ordinal()] = 128;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.SNAPSHOTS_ID.ordinal()] = 129;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.SNAPSHOTS_EXT_SNAPSHOT_ID.ordinal()] = 130;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.SNAPSHOTS_GAME_ID.ordinal()] = 131;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.SNAPSHOTS_EXT_GAME_ID.ordinal()] = 132;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYER_STATS.ordinal()] = 133;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACCOUNT_METADATA_COVER_IMAGE.ordinal()] = 134;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.LEADERBOARD_PENDING_SCORES_ID.ordinal()] = 135;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_EXT_PLAYER_ID.ordinal()] = 136;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_PLAYER_ID.ordinal()] = 137;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.CLEAR_DATA_FOR_LOCALE_CHANGE.ordinal()] = 138;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.GAME_BADGES_ICON_IMAGE.ordinal()] = 139;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYERS_ID_PROFILE_ICON_IMAGE.ordinal()] = 140;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.PLAYERS_ID_PROFILE_HI_RES_IMAGE.ordinal()] = 141;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ID_ICON_IMAGE.ordinal()] = 142;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.QUESTS_ID_PROMOTIONAL_IMAGE.ordinal()] = 143;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE.ordinal()] = 144;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE.ordinal()] = 145;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[UriType.EVENT_DEFINITIONS_ID_ICON_IMAGE.ordinal()] = 146;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType = new int[ColumnSpec.DataType.values().length];
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[ColumnSpec.DataType.STRING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[ColumnSpec.DataType.LONG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[uritype.ordinal()])
        {
        default:
            return -1L;

        case 3: // '\003'
            return queryImageId(sqlitedatabase, "games", "game_icon_image_id", String.valueOf(UriUtils.getGameIdFromGameImageUri(uri)));

        case 4: // '\004'
            return queryImageId(sqlitedatabase, "games", "game_icon_image_id", UriUtils.getExternalGameIdFromGameImageUri(uri), "external_game_id=?");

        case 5: // '\005'
            return queryImageId(sqlitedatabase, "games", "game_hi_res_image_id", String.valueOf(UriUtils.getGameIdFromGameImageUri(uri)));

        case 6: // '\006'
            return queryImageId(sqlitedatabase, "games", "featured_image_id", String.valueOf(UriUtils.getGameIdFromGameImageUri(uri)));

        case 7: // '\007'
            return queryImageId(sqlitedatabase, "games", "featured_image_id", UriUtils.getExternalGameIdFromGameImageUri(uri), "external_game_id=?");

        case 139: 
            return queryImageId(sqlitedatabase, "game_badges", "badge_icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 140: 
            return queryImageId(sqlitedatabase, "players", "profile_icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 141: 
            return queryImageId(sqlitedatabase, "players", "profile_hi_res_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 142: 
            return queryImageId(sqlitedatabase, "quests", "quest_icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 143: 
            return queryImageId(sqlitedatabase, "quests", "quest_banner_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 144: 
            return queryImageId(sqlitedatabase, "achievement_definitions", "unlocked_icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 145: 
            return queryImageId(sqlitedatabase, "achievement_definitions", "revealed_icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 146: 
            return queryImageId(sqlitedatabase, "event_definitions", "icon_image_id", UriUtils.getImageIdFromImageUri(uri));

        case 73: // 'I'
            return ContentUris.parseId(uri);
        }
    }

    private long getImageId(ImageStore imagestore, SQLiteDatabase sqlitedatabase, String s)
        throws SQLiteException
    {
        long l1 = resolveImageIdFromUrl(sqlitedatabase, s);
        long l = l1;
        if (l1 == -1L)
        {
            long l2 = imagestore.insert(null, s, mClock.currentTimeMillis());
            l = l2;
            if (l2 == 0L)
            {
                throw new SQLiteException("Unable to store image.");
            }
        }
        return l;
    }

    private void handleAchievementImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "unlocked_icon_image_url", "unlocked_icon_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "revealed_icon_image_url", "revealed_icon_image_id");
    }

    private void handleEventImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "icon_image_url", "icon_image_id");
    }

    private void handleExperienceEventImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "icon_url", "icon_id");
    }

    private void handleGameBadgeImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImage(gamesdatastore, contentvalues, "badge_icon_image_bytes", "badge_icon_image_url", "badge_icon_image_id");
    }

    private void handleGameImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImage(gamesdatastore, contentvalues, "icon_image_bytes", "game_icon_image_url", "game_icon_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "game_hi_res_image_url", "game_hi_res_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "featured_image_url", "featured_image_id");
        ImageStore imagestore = gamesdatastore.mImageStore;
        gamesdatastore = gamesdatastore.mDatabaseHelper.getReadableDatabase();
        if (contentvalues.containsKey("screenshot_image_urls"))
        {
            String s = contentvalues.getAsString("screenshot_image_urls");
            if (TextUtils.isEmpty(s))
            {
                contentvalues.putNull("screenshot_image_ids");
            } else
            {
                int j = TextUtils.split(s, "\\s*,\\s*").length;
                String as[] = new String[j];
                for (int i = 0; i < j; i++)
                {
                    as[i] = Long.toString(getImageId(imagestore, gamesdatastore, s));
                }

                contentvalues.put("screenshot_image_ids", TextUtils.join(",", as));
            }
            contentvalues.remove("screenshot_image_urls");
        }
    }

    private void handleImage(GamesDataStore gamesdatastore, ContentValues contentvalues, String s, String s1, String s2)
    {
        if (contentvalues.containsKey(s))
        {
            boolean flag;
            if (!contentvalues.containsKey(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            gamesdatastore = gamesdatastore.mImageStore;
            if (contentvalues.containsKey(s))
            {
                s1 = contentvalues.getAsByteArray(s);
                if (s1.length == 0)
                {
                    contentvalues.putNull(s2);
                } else
                {
                    long l = gamesdatastore.insert(s1, null, mClock.currentTimeMillis());
                    if (l != 0L)
                    {
                        contentvalues.put(s2, Long.valueOf(l));
                    } else
                    {
                        throw new SQLiteException("Unable to store image.");
                    }
                }
                contentvalues.remove(s);
            }
            sanitizeIdField(contentvalues, s2);
            return;
        } else
        {
            handleImageFieldUrl(gamesdatastore, contentvalues, s1, s2);
            return;
        }
    }

    private void handleImageFieldUrl(GamesDataStore gamesdatastore, ContentValues contentvalues, String s, String s1)
    {
        ImageStore imagestore = gamesdatastore.mImageStore;
        gamesdatastore = gamesdatastore.mDatabaseHelper.getReadableDatabase();
        if (contentvalues.containsKey(s))
        {
            String s2 = contentvalues.getAsString(s);
            if (TextUtils.isEmpty(s2))
            {
                contentvalues.putNull(s1);
            } else
            {
                contentvalues.put(s1, Long.valueOf(getImageId(imagestore, gamesdatastore, s2)));
            }
            contentvalues.remove(s);
        }
        sanitizeIdField(contentvalues, s1);
    }

    private void handleLeaderboardImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "board_icon_image_url", "board_icon_image_id");
    }

    private void handleLeaderboardScoreImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "default_display_image_url", "default_display_image_id");
    }

    private void handleParticipantImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "default_display_image_url", "default_display_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "default_display_hi_res_image_url", "default_display_hi_res_image_id");
    }

    private void handlePlayerImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "profile_icon_image_url", "profile_icon_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "profile_hi_res_image_url", "profile_hi_res_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "most_recent_game_icon_url", "most_recent_game_icon_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "most_recent_game_hi_res_url", "most_recent_game_hi_res_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "most_recent_game_featured_url", "most_recent_game_featured_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "banner_image_landscape_url", "banner_image_landscape_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "banner_image_portrait_url", "banner_image_portrait_id");
    }

    private void handleQuestImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImageFieldUrl(gamesdatastore, contentvalues, "quest_icon_image_url", "quest_icon_image_id");
        handleImageFieldUrl(gamesdatastore, contentvalues, "quest_banner_image_url", "quest_banner_image_id");
    }

    private void handleSnapshotImages(GamesDataStore gamesdatastore, ContentValues contentvalues)
    {
        handleImage(gamesdatastore, contentvalues, "cover_icon_image_bytes", "cover_icon_image_url", "cover_icon_image_id");
    }

    private static UriType matchUri(Uri uri)
    {
        int i = sUriMatcher.match(uri);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unrecognized URI: %s", new Object[] {
            uri
        });
        return ((UriType[])com/google/android/gms/games/provider/PlayGamesContentProvider$UriType.getEnumConstants())[i];
    }

    private static AssetFileDescriptor openImageForRead(ImageStore imagestore, long l)
        throws FileNotFoundException
    {
        imagestore = (ImageStore.Entry)imagestore.mEntries.get(Long.valueOf(l));
        if (imagestore != null)
        {
            try
            {
                imagestore = new AssetFileDescriptor(ParcelFileDescriptor.open(new File(((ImageStore.Entry) (imagestore)).path), 0x10000000), 0L, ((ImageStore.Entry) (imagestore)).size);
            }
            // Misplaced declaration of an exception variable
            catch (ImageStore imagestore)
            {
                throw imagestore;
            }
            return imagestore;
        } else
        {
            throw new FileNotFoundException((new StringBuilder("No image found for ID ")).append(l).toString());
        }
    }

    private static long queryImageId(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
        throws FileNotFoundException
    {
        return queryImageId(sqlitedatabase, s, s1, s2, "_id=?");
    }

    private static long queryImageId(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, String s3)
        throws FileNotFoundException
    {
        sqlitedatabase = sqlitedatabase.query(s, new String[] {
            s1
        }, s3, new String[] {
            s2
        }, null, null, null);
        boolean flag;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        flag = sqlitedatabase.isNull(0);
        if (flag)
        {
            sqlitedatabase.close();
            return -1L;
        }
        long l = sqlitedatabase.getLong(0);
        sqlitedatabase.close();
        return l;
        throw new FileNotFoundException((new StringBuilder("No image found for non-existent ")).append(s).append(" row with ID ").append(s2).toString());
        s;
        sqlitedatabase.close();
        throw s;
    }

    private static long resolveImageIdFromUrl(SQLiteDatabase sqlitedatabase, String s)
    {
        long l;
        l = -1L;
        sqlitedatabase = sqlitedatabase.query("images", new String[] {
            "_id"
        }, "url=?", new String[] {
            s
        }, null, null, null);
        if (sqlitedatabase.moveToFirst())
        {
            l = sqlitedatabase.getLong(0);
        }
        sqlitedatabase.close();
        return l;
        s;
        sqlitedatabase.close();
        throw s;
    }

    private static void sanitizeIdField(ContentValues contentvalues, String s)
    {
        Long long1 = contentvalues.getAsLong(s);
        if (long1 != null && long1.longValue() == -1L)
        {
            GamesLog.e("GamesContentProvider", "Attempting to insert an invalid image ID", new Throwable());
            contentvalues.remove(s);
        }
    }

    private void scheduleBackgroundTask(int i, Object obj, long l)
    {
        mBackgroundHandler.sendMessageDelayed(mBackgroundHandler.obtainMessage(i, obj), l);
    }

    private static void setTablesAndProjection(SQLiteQueryBuilder sqlitequerybuilder, String s, ProjectionMap projectionmap)
    {
        sqlitequerybuilder.setTables(s);
        sqlitequerybuilder.setProjectionMap(projectionmap);
    }

    private static void setTablesAndProjectionMapForAchievementDefinitions(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, ACHIEVEMENT_DEFINITIONS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "achievement_definitions._id").addGamesColumns().addAchievementDefinitionColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForAchievementInstances(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, ACHIEVEMENT_INSTANCES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "achievement_instances._id").addPlayersColumns().addAchievementDefinitionColumns().addAll(GamesContractInternal.AchievementInstances.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForAchievementPendingOps$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, ACHIEVEMENT_PENDING_OPS_TABLE, sAchievementPendingOpsProjectionMap);
    }

    private static void setTablesAndProjectionMapForApplicationSessions$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, APPLICATION_SESSION_TABLE, sApplicationSessionsProjectionMap);
    }

    private static void setTablesAndProjectionMapForClientContext$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, "client_contexts", sClientContextProjectionMap);
    }

    private static void setTablesAndProjectionMapForEventDefinitions(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, EVENT_DEFINITIONS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "event_definitions._id").addGamesColumns().addEventDefinitionColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForEventInstances(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, EVENT_INSTANCES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "event_instances._id").addPlayersColumns().addEventDefinitionColumns().addAll(GamesContractInternal.EventInstances.ALL_COLUMNS).add("value", "(   SELECT sum( total )    FROM (           SELECT ei2.value AS total            FROM event_instances AS ei2           WHERE ei2._id = event_instances._id          UNION ALL          SELECT sum( event_pending_ops.increment ) AS total            FROM event_pending_ops           WHERE event_pending_ops.instance_id = event_instances._id      )     )").build());
    }

    private static void setTablesAndProjectionMapForEventPendingOps$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, EVENT_PENDING_OPS_TABLE, ProjectionMap.builder().add("_id", "event_definitions._id").add("_id", "event_instances._id").add("_id", "event_pending_ops._id").add("external_event_id").addAll(GamesContractInternal.EventPendingOps.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).add("external_game_id").add("external_player_id").build());
    }

    private static void setTablesAndProjectionMapForExperienceEvents(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, EXPERIENCE_EVENTS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "experience_events._id").addGamesColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.ExperienceEvents.ALL_COLUMNS).add("icon_uri", createImageUri(uri, "icon_id")).add("icon_url", createImageUrl("experience_events", "icon_id")).build());
    }

    private static void setTablesAndProjectionMapForGameBadges(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, GAME_BADGES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "game_badges._id").addGamesColumns().addGameBadgesColumns().build());
    }

    private static void setTablesAndProjectionMapForGameFeaturedImages$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, GAME_FEATURED_IMAGES_TABLE, sImagesProjectionMap);
    }

    private static void setTablesAndProjectionMapForGameIconImages$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, GAME_ICON_IMAGES_TABLE, sImagesProjectionMap);
    }

    private static void setTablesAndProjectionMapForGameInstances(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, GAME_INSTANCES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "game_instances._id").addGamesColumns().addAll(GamesContractInternal.GameInstances.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForGames(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, GAMES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "games._id").addGamesColumns().addGameBadgesColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).add("target_instance", "TargetInstance._id").add("availability").add("owned").add("achievement_unlocked_count", "(SELECT COUNT(1) FROM achievement_instances, achievement_definitions, games AS SubGame WHERE SubGame._id=games._id AND games._id=achievement_definitions.game_id AND achievement_definitions._id=achievement_instances.definition_id AND 0=achievement_instances.state)").add("price_micros").add("formatted_price").add("full_price_micros").add("formatted_full_price").build());
    }

    private static void setTablesAndProjectionMapForImages$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, "images", sImagesProjectionMap);
    }

    private static void setTablesAndProjectionMapForInvitations(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, INVITATION_ENTITIES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "invitations._id").addGamesColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.Invitations.ALL_COLUMNS).add("most_recent_invitation", "(SELECT MAX(last_modified_timestamp) FROM invitations innerinvite WHERE innerinvite.external_inviter_id=invitations.external_inviter_id)").addAll(GamesContractInternal.Participants.ALL_COLUMNS).add("target_instance", "TargetInstance._id").add("external_player_id", "ParticipantPlayer.external_player_id").add("profile_name", "ParticipantPlayer.profile_name").add("gamer_tag", "ParticipantPlayer.gamer_tag").add("real_name", "ParticipantPlayer.real_name").add("profile_icon_image_id", "ParticipantPlayer.profile_icon_image_id").add("profile_icon_image_url", createImageUrl("ParticipantPlayer", "profile_icon_image_id")).add("profile_hi_res_image_id", "ParticipantPlayer.profile_hi_res_image_id").add("profile_hi_res_image_url", createImageUrl("ParticipantPlayer", "profile_hi_res_image_id")).add("last_updated", "ParticipantPlayer.last_updated").add("is_in_circles", "ParticipantPlayer.is_in_circles").add("current_xp_total", "ParticipantPlayer.current_xp_total").add("current_level", "ParticipantPlayer.current_level").add("current_level_min_xp", "ParticipantPlayer.current_level_min_xp").add("current_level_max_xp", "ParticipantPlayer.current_level_max_xp").add("next_level", "ParticipantPlayer.next_level").add("next_level_max_xp", "ParticipantPlayer.next_level_max_xp").add("last_level_up_timestamp", "ParticipantPlayer.last_level_up_timestamp").add("player_title", "ParticipantPlayer.player_title").add("has_all_public_acls", "ParticipantPlayer.has_all_public_acls").add("has_debug_access", "ParticipantPlayer.has_debug_access").add("is_profile_visible", "ParticipantPlayer.is_profile_visible").add("most_recent_external_game_id", "ParticipantPlayer.most_recent_external_game_id").add("most_recent_game_name", "ParticipantPlayer.most_recent_game_name").add("most_recent_activity_timestamp", "ParticipantPlayer.most_recent_activity_timestamp").add("most_recent_game_icon_id", "ParticipantPlayer.most_recent_game_icon_id").add("most_recent_game_hi_res_id", "ParticipantPlayer.most_recent_game_hi_res_id").add("most_recent_game_featured_id", "ParticipantPlayer.most_recent_game_featured_id").add("banner_image_landscape_id", "ParticipantPlayer.banner_image_landscape_id").add("banner_image_landscape_url", createImageUrl("ParticipantPlayer", "banner_image_landscape_id")).add("banner_image_portrait_id", "ParticipantPlayer.banner_image_portrait_id").add("banner_image_portrait_url", createImageUrl("ParticipantPlayer", "banner_image_portrait_id")).add("profile_icon_image_uri", createImageUri(uri, "profile_icon_image_id")).add("profile_hi_res_image_uri", createImageUri(uri, "profile_hi_res_image_id")).add("most_recent_game_icon_uri", createImageUri(uri, "most_recent_game_icon_id")).add("most_recent_game_hi_res_uri", createImageUri(uri, "most_recent_game_hi_res_id")).add("most_recent_game_featured_uri", createImageUri(uri, "most_recent_game_featured_id")).add("banner_image_landscape_uri", createImageUri(uri, "banner_image_landscape_id")).add("banner_image_portrait_uri", createImageUri(uri, "banner_image_portrait_id")).add("default_display_image_uri", createImageUri(uri, "default_display_image_id")).add("default_display_image_url", createImageUrl("participants", "default_display_image_id")).add("default_display_hi_res_image_uri", createImageUri(uri, "default_display_hi_res_image_id")).add("default_display_hi_res_image_url", createImageUrl("participants", "default_display_hi_res_image_id")).build());
    }

    private static void setTablesAndProjectionMapForLeaderboardInstances(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, LEADERBOARD_INSTANCES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "leaderboard_instances._id").addGamesColumns().addLeaderboardsColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.LeaderboardInstances.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForLeaderboardScores(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, LEADERBOARD_SCORES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "leaderboard_scores._id").addPlayersColumns().addAll(GamesContractInternal.LeaderboardScores.ALL_COLUMNS).add("default_display_image_uri", createImageUri(uri, "default_display_image_id")).add("default_display_image_url", createImageUrl("leaderboard_scores", "default_display_image_id")).build());
    }

    private static void setTablesAndProjectionMapForLeaderboards(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, LEADERBOARDS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "leaderboards._id").addLeaderboardsColumns().build());
    }

    private static void setTablesAndProjectionMapForMatchEntities(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, MATCH_ENTITIES_TABLE, (new GamesProjectionMapBuilder(uri)).addGamesColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.Participants.ALL_COLUMNS).addAll(GamesContractInternal.Matches.ALL_COLUMNS).add("target_instance", "TargetInstance._id").add("external_player_id", "ParticipantPlayer.external_player_id").add("profile_name", "ParticipantPlayer.profile_name").add("gamer_tag", "ParticipantPlayer.gamer_tag").add("real_name", "ParticipantPlayer.real_name").add("profile_icon_image_id", "ParticipantPlayer.profile_icon_image_id").add("profile_icon_image_url", createImageUrl("ParticipantPlayer", "profile_icon_image_id")).add("profile_hi_res_image_id", "ParticipantPlayer.profile_hi_res_image_id").add("profile_hi_res_image_url", createImageUrl("ParticipantPlayer", "profile_hi_res_image_id")).add("last_updated", "ParticipantPlayer.last_updated").add("is_in_circles", "ParticipantPlayer.is_in_circles").add("current_xp_total", "ParticipantPlayer.current_xp_total").add("current_level", "ParticipantPlayer.current_level").add("current_level_min_xp", "ParticipantPlayer.current_level_min_xp").add("current_level_max_xp", "ParticipantPlayer.current_level_max_xp").add("next_level", "ParticipantPlayer.next_level").add("next_level_max_xp", "ParticipantPlayer.next_level_max_xp").add("last_level_up_timestamp", "ParticipantPlayer.last_level_up_timestamp").add("player_title", "ParticipantPlayer.player_title").add("has_all_public_acls", "ParticipantPlayer.has_all_public_acls").add("has_debug_access", "ParticipantPlayer.has_debug_access").add("is_profile_visible", "ParticipantPlayer.is_profile_visible").add("most_recent_external_game_id", "ParticipantPlayer.most_recent_external_game_id").add("most_recent_game_name", "ParticipantPlayer.most_recent_game_name").add("most_recent_activity_timestamp", "ParticipantPlayer.most_recent_activity_timestamp").add("most_recent_game_icon_id", "ParticipantPlayer.most_recent_game_icon_id").add("most_recent_game_hi_res_id", "ParticipantPlayer.most_recent_game_hi_res_id").add("most_recent_game_featured_id", "ParticipantPlayer.most_recent_game_featured_id").add("banner_image_landscape_id", "ParticipantPlayer.banner_image_landscape_id").add("banner_image_landscape_url", createImageUrl("ParticipantPlayer", "banner_image_landscape_id")).add("banner_image_portrait_id", "ParticipantPlayer.banner_image_portrait_id").add("banner_image_portrait_url", createImageUrl("ParticipantPlayer", "banner_image_portrait_id")).add("profile_icon_image_uri", createImageUri(uri, "profile_icon_image_id")).add("profile_hi_res_image_uri", createImageUri(uri, "profile_hi_res_image_id")).add("most_recent_game_icon_uri", createImageUri(uri, "most_recent_game_icon_id")).add("most_recent_game_hi_res_uri", createImageUri(uri, "most_recent_game_hi_res_id")).add("most_recent_game_featured_uri", createImageUri(uri, "most_recent_game_featured_id")).add("banner_image_landscape_uri", createImageUri(uri, "banner_image_landscape_id")).add("banner_image_portrait_uri", createImageUri(uri, "banner_image_portrait_id")).add("default_display_image_uri", createImageUri(uri, "default_display_image_id")).add("default_display_image_url", createImageUrl("participants", "default_display_image_id")).add("default_display_hi_res_image_uri", createImageUri(uri, "default_display_hi_res_image_id")).add("default_display_hi_res_image_url", createImageUrl("participants", "default_display_hi_res_image_id")).build());
    }

    private static void setTablesAndProjectionMapForMatches$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, MATCHES_TABLE, sMatchesProjectionMap);
    }

    private static void setTablesAndProjectionMapForMatchesPendingOps$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, MATCHES_PENDING_OPS_TABLE, sMatchesPendingOpsProjectionMap);
    }

    private static void setTablesAndProjectionMapForNotifications(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, NOTIFICATIONS_TABLE, ProjectionMap.builder().add("_id", "notifications._id").addAll(GamesContractInternal.Notifications.ALL_COLUMNS).add("image_uri", createImageUri(uri, "image_id")).add("external_game_id").build());
    }

    private static void setTablesAndProjectionMapForParticipants(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, PARTICIPANTS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "participants._id").addPlayersColumns().addAll(GamesContractInternal.Participants.ALL_COLUMNS).add("default_display_image_uri", createImageUri(uri, "default_display_image_id")).add("default_display_image_url", createImageUrl("participants", "default_display_image_id")).add("default_display_hi_res_image_uri", createImageUri(uri, "default_display_hi_res_image_id")).add("default_display_hi_res_image_url", createImageUrl("participants", "default_display_hi_res_image_id")).build());
    }

    private static void setTablesAndProjectionMapForPlayerLevels$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, "player_levels", sPlayerLevelsProjectionMap);
    }

    private static void setTablesAndProjectionMapForPlayerStats$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, "player_stats", sPlayerStatsProjectionMap);
    }

    private static void setTablesAndProjectionMapForPlayers(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, "players", (new GamesProjectionMapBuilder(uri)).addPlayersColumns().add("_id").build());
    }

    private static void setTablesAndProjectionMapForQuestMilestones(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, QUEST_MILESTONES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "milestones._id").addQuestsColumns().add("current_value", "(CASE WHEN quest_state = 6 THEN milestones.current_value ELSE (   SELECT sum( total )    FROM (           SELECT ei2.value AS total            FROM event_instances AS ei2           WHERE ei2._id = event_instances._id          UNION ALL          SELECT sum( event_pending_ops.increment ) AS total            FROM event_pending_ops           WHERE event_pending_ops.instance_id = event_instances._id      )     ) END)").addAll(GamesContractInternal.Milestones.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForQuests(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, QUESTS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "quests._id").addGamesColumns().addQuestsColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForQuestsEntities(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, QUESTS_ENTITIES_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "quests._id").addGamesColumns().addQuestsColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).add("external_event_id").add("current_value", "(CASE WHEN quest_state = 6 THEN milestones.current_value ELSE (   SELECT sum( total )    FROM (           SELECT ei2.value AS total            FROM event_instances AS ei2           WHERE ei2._id = event_instances._id          UNION ALL          SELECT sum( event_pending_ops.increment ) AS total            FROM event_pending_ops           WHERE event_pending_ops.instance_id = event_instances._id      )     ) END)").addAll(GamesContractInternal.Milestones.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForRequestPendingOps$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, REQUEST_PENDING_OPS_TABLE, sRequestPendingOpsProjectionMap);
    }

    private static void setTablesAndProjectionMapForRequestRecipients(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, REQUEST_RECIPIENTS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "request_recipients._id").addPlayersColumns().addAll(GamesContractInternal.RequestRecipients.ALL_COLUMNS).build());
    }

    private static void setTablesAndProjectionMapForRequests$269de591(SQLiteQueryBuilder sqlitequerybuilder)
    {
        setTablesAndProjection(sqlitequerybuilder, REQUESTS_TABLE, sRequestsProjectionMap);
    }

    private static void setTablesAndProjectionMapForRequestsEntities(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, REQUESTS_ENTITIES_TABLE, (new GamesProjectionMapBuilder(uri)).addGamesColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.RequestRecipients.ALL_COLUMNS).addAll(GamesContractInternal.Requests.ALL_COLUMNS).add("next_expiring_request", "(SELECT MIN(expiration_timestamp) FROM requests innerrequests WHERE innerrequests.sender_id=requests.sender_id)").add("target_instance", "TargetInstance._id").add("sender_external_player_id", "RequestSenderPlayer.external_player_id").add("sender_profile_name", "RequestSenderPlayer.profile_name").add("sender_profile_icon_image_id", "RequestSenderPlayer.profile_icon_image_id").add("sender_profile_icon_image_url", createImageUrl("RequestSenderPlayer", "profile_icon_image_id")).add("sender_profile_hi_res_image_id", "RequestSenderPlayer.profile_hi_res_image_id").add("sender_profile_hi_res_image_url", createImageUrl("RequestSenderPlayer", "profile_hi_res_image_id")).add("sender_last_updated", "RequestSenderPlayer.last_updated").add("sender_is_in_circles", "RequestSenderPlayer.is_in_circles").add("sender_profile_icon_image_uri", createImageUri(uri, "RequestSenderPlayer.profile_icon_image_id")).add("sender_profile_hi_res_image_uri", createImageUri(uri, "RequestSenderPlayer.profile_hi_res_image_id")).add("sender_current_xp_total", "RequestSenderPlayer.current_xp_total").add("sender_current_level", "RequestSenderPlayer.current_level").add("sender_current_level_min_xp", "RequestSenderPlayer.current_level_min_xp").add("sender_current_level_max_xp", "RequestSenderPlayer.current_level_max_xp").add("sender_next_level", "RequestSenderPlayer.next_level").add("sender_next_level_max_xp", "RequestSenderPlayer.next_level_max_xp").add("sender_last_level_up_timestamp", "RequestSenderPlayer.last_level_up_timestamp").add("sender_player_title", "RequestSenderPlayer.player_title").add("sender_has_debug_access", "RequestSenderPlayer.has_all_public_acls").add("sender_has_all_public_acls", "RequestSenderPlayer.has_debug_access").add("sender_is_profile_visible", "RequestSenderPlayer.is_profile_visible").add("sender_most_recent_external_game_id", "RequestSenderPlayer.most_recent_external_game_id").add("sender_most_recent_game_name", "RequestSenderPlayer.most_recent_game_name").add("sender_most_recent_activity_timestamp", "RequestSenderPlayer.most_recent_activity_timestamp").add("sender_most_recent_game_icon_id", "RequestSenderPlayer.most_recent_game_icon_id").add("sender_most_recent_game_icon_uri", createImageUri(uri, "RequestSenderPlayer.most_recent_game_icon_id")).add("sender_most_recent_game_hi_res_id", "RequestSenderPlayer.most_recent_game_hi_res_id").add("sender_most_recent_game_hi_res_uri", createImageUri(uri, "RequestSenderPlayer.most_recent_game_hi_res_id")).add("sender_most_recent_game_featured_id", "RequestSenderPlayer.most_recent_game_featured_id").add("sender_most_recent_game_featured_uri", createImageUri(uri, "RequestSenderPlayer.most_recent_game_featured_id")).add("sender_banner_image_landscape_id", "RequestSenderPlayer.banner_image_landscape_id").add("sender_banner_image_landscape_uri", createImageUri(uri, "RequestSenderPlayer.banner_image_landscape_id")).add("sender_banner_image_landscape_url", createImageUrl("RequestSenderPlayer", "banner_image_landscape_id")).add("sender_banner_image_portrait_id", "RequestSenderPlayer.banner_image_portrait_id").add("sender_banner_image_portrait_uri", createImageUri(uri, "RequestSenderPlayer.banner_image_portrait_id")).add("sender_banner_image_portrait_url", createImageUrl("RequestSenderPlayer", "banner_image_portrait_id")).add("sender_gamer_tag", "RequestSenderPlayer.gamer_tag").add("sender_real_name", "RequestSenderPlayer.real_name").add("recipient_external_player_id", "RequestRecipientPlayer.external_player_id").add("recipient_profile_name", "RequestRecipientPlayer.profile_name").add("recipient_profile_icon_image_id", "RequestRecipientPlayer.profile_icon_image_id").add("recipient_profile_icon_image_url", createImageUrl("RequestRecipientPlayer", "profile_icon_image_id")).add("recipient_profile_hi_res_image_url", createImageUrl("RequestRecipientPlayer", "profile_hi_res_image_id")).add("recipient_profile_hi_res_image_id", "RequestRecipientPlayer.profile_hi_res_image_id").add("recipient_last_updated", "RequestRecipientPlayer.last_updated").add("recipient_is_in_circles", "RequestRecipientPlayer.is_in_circles").add("recipient_profile_icon_image_uri", createImageUri(uri, "RequestRecipientPlayer.profile_icon_image_id")).add("recipient_profile_hi_res_image_uri", createImageUri(uri, "RequestRecipientPlayer.profile_hi_res_image_id")).add("recipient_current_xp_total", "RequestRecipientPlayer.current_xp_total").add("recipient_current_level", "RequestRecipientPlayer.current_level").add("recipient_current_level_min_xp", "RequestRecipientPlayer.current_level_min_xp").add("recipient_current_level_max_xp", "RequestRecipientPlayer.current_level_max_xp").add("recipient_next_level", "RequestRecipientPlayer.next_level").add("recipient_next_level_max_xp", "RequestRecipientPlayer.next_level_max_xp").add("recipient_last_level_up_timestamp", "RequestRecipientPlayer.last_level_up_timestamp").add("recipient_player_title", "RequestRecipientPlayer.player_title").add("recipient_has_all_public_acls", "RequestRecipientPlayer.has_all_public_acls").add("recipient_has_debug_access", "RequestRecipientPlayer.has_debug_access").add("recipient_is_profile_visible", "RequestRecipientPlayer.is_profile_visible").add("recipient_most_recent_external_game_id", "RequestRecipientPlayer.most_recent_external_game_id").add("recipient_most_recent_game_name", "RequestRecipientPlayer.most_recent_game_name").add("recipient_most_recent_activity_timestamp", "RequestRecipientPlayer.most_recent_activity_timestamp").add("recipient_most_recent_game_icon_id", "RequestRecipientPlayer.most_recent_game_icon_id").add("recipient_most_recent_game_icon_uri", createImageUri(uri, "RequestRecipientPlayer.most_recent_game_icon_id")).add("recipient_most_recent_game_hi_res_id", "RequestRecipientPlayer.most_recent_game_hi_res_id").add("recipient_most_recent_game_hi_res_uri", createImageUri(uri, "RequestRecipientPlayer.most_recent_game_hi_res_id")).add("recipient_most_recent_game_featured_id", "RequestRecipientPlayer.most_recent_game_featured_id").add("recipient_most_recent_game_featured_uri", createImageUri(uri, "RequestRecipientPlayer.most_recent_game_featured_id")).add("recipient_banner_image_landscape_id", "RequestRecipientPlayer.banner_image_landscape_id").add("recipient_banner_image_landscape_uri", createImageUri(uri, "RequestRecipientPlayer.banner_image_landscape_id")).add("recipient_banner_image_landscape_url", createImageUrl("RequestRecipientPlayer", "banner_image_landscape_id")).add("recipient_banner_image_portrait_id", "RequestRecipientPlayer.banner_image_portrait_id").add("recipient_banner_image_portrait_uri", createImageUri(uri, "RequestRecipientPlayer.banner_image_portrait_id")).add("recipient_banner_image_portrait_url", createImageUrl("RequestRecipientPlayer", "banner_image_portrait_id")).add("recipient_gamer_tag", "RequestRecipientPlayer.gamer_tag").add("recipient_real_name", "RequestRecipientPlayer.real_name").build());
    }

    private static void setTablesAndProjectionMapForSnapshots(SQLiteQueryBuilder sqlitequerybuilder, Uri uri)
    {
        setTablesAndProjection(sqlitequerybuilder, SNAPSHOTS_TABLE, (new GamesProjectionMapBuilder(uri)).add("_id", "snapshots._id").addGamesColumns().addPlayersColumns().addAll(GamesContractInternal.GameInstances.JOIN_COLUMNS).addAll(GamesContractInternal.Snapshots.ALL_COLUMNS).add("cover_icon_image_uri", createImageUri(uri, "cover_icon_image_id")).add("cover_icon_image_url", createImageUrl("snapshots", "cover_icon_image_id")).build());
    }

    private static int updateByForeignExternalId(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, String s3, String s4, ContentValues contentvalues)
    {
        return sqlitedatabase.update(s1, contentvalues, String.format("%s IN (SELECT %s FROM %s WHERE %s=?)", new Object[] {
            s2, "_id", s3, s4
        }), new String[] {
            s
        });
    }

    private int updateImageData(ImageStore imagestore, long l, ContentValues contentvalues)
    {
        if (l == -1L)
        {
            throw new IllegalArgumentException("No image ID specified for image data update");
        }
        if (contentvalues.containsKey("image_data"))
        {
            if (imagestore.update(l, contentvalues.getAsByteArray("image_data"), mClock.currentTimeMillis()))
            {
                return 1;
            } else
            {
                GamesLog.w("GamesContentProvider", (new StringBuilder("Unable to update image data for image ID ")).append(l).toString());
                return 0;
            }
        } else
        {
            return 0;
        }
    }

    protected final int deleteInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, String s, String as[])
    {
        GamesDataStore gamesdatastore = getDataStore$743ee347(uri);
        GamesDataStore.waitForAccess(gamesdatastore.mWriteAccessLatch);
        UriType uritype = matchUri(uri);
        switch (_cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[uritype.ordinal()])
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 71: // 'G'
        case 76: // 'L'
        case 84: // 'T'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 90: // 'Z'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        case 123: // '{'
        case 134: 
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid delete URI: ")).append(uri).append(" - ").append(uritype).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 8: // '\b'
            return applyDelete(uri, s, as, "_id", mDeleteGame);

        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            return applyDelete(uri, s, as, "_id", mDeleteGameBadge);

        case 13: // '\r'
            return sqlitedatabase.delete("game_instances", s, as);

        case 14: // '\016'
            return sqlitedatabase.delete("game_instances", "_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 15: // '\017'
            return sqlitedatabase.delete("game_instances", "instance_game_id=?", new String[] {
                uri.getLastPathSegment()
            });

        case 16: // '\020'
            throw new IllegalArgumentException("Can't delete game instances by external id!");

        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            return applyDelete(uri, s, as, "_id", mDeletePlayer);

        case 20: // '\024'
            return sqlitedatabase.delete("player_levels", null, null);

        case 21: // '\025'
            return sqlitedatabase.delete("player_levels", "_id=?", new String[] {
                uri.getLastPathSegment()
            });

        case 22: // '\026'
            return sqlitedatabase.delete("player_levels", "level_value=?", new String[] {
                uri.getLastPathSegment()
            });

        case 133: 
            return sqlitedatabase.delete("player_levels", null, null);

        case 23: // '\027'
            return applyDelete(uri, s, as, "_id", mDeletePlayerStats);

        case 24: // '\030'
            uri = GamesContractInternal.PlayerStats.getQuerySpecParams(uri);
            return sqlitedatabase.delete("player_stats", "player_id=? AND game_id=?", new String[] {
                (String)((Pair) (uri)).first, (String)((Pair) (uri)).second
            });

        case 25: // '\031'
            sqlitedatabase = gamesdatastore.getPrefs(getContext());
            boolean flag = sqlitedatabase.contains("account_name");
            sqlitedatabase = sqlitedatabase.edit();
            sqlitedatabase.clear();
            SharedPreferencesCompat.apply(sqlitedatabase);
            return !flag ? 0 : 1;

        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
            return applyDelete(uri, s, as, "_id", mDeleteAchievementDefinition);

        case 34: // '"'
            return sqlitedatabase.delete("achievement_instances", "_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 31: // '\037'
        case 32: // ' '
            return applyDelete(uri, s, as, "_id", mDeleteAchievementPendingOps);

        case 33: // '!'
        case 35: // '#'
        case 36: // '$'
            return applyDelete(uri, s, as, "_id", mDeleteAchievementInstances);

        case 51: // '3'
        case 52: // '4'
            return applyDelete(uri, s, as, "_id", mDeleteApplicationSession);

        case 53: // '5'
            return applyDelete(uri, s, as, "_id", mDeleteAppContentSession);

        case 54: // '6'
        case 55: // '7'
            return applyDelete(uri, s, as, "_id", mDeleteClientContext);

        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
            return applyDelete(uri, s, as, "_id", mDeleteEventDefinition);

        case 43: // '+'
            return sqlitedatabase.delete("event_instances", "_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 42: // '*'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
            return applyDelete(uri, s, as, "_id", mDeleteEventInstances);

        case 47: // '/'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
            return applyDelete(uri, s, as, "_id", mDeleteEventPendingOps);

        case 56: // '8'
        case 57: // '9'
        case 58: // ':'
            return applyDelete(uri, s, as, "_id", mDeleteExperienceEvent);

        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
            return applyDelete(uri, s, as, "_id", mDeleteLeaderboard);

        case 64: // '@'
        case 65: // 'A'
        case 66: // 'B'
        case 67: // 'C'
            return applyDelete(uri, s, as, "_id", mDeleteLeaderboardInstance);

        case 68: // 'D'
        case 69: // 'E'
        case 70: // 'F'
            return applyDelete(uri, s, as, "_id", mDeleteLeaderboardScore);

        case 135: 
            return sqlitedatabase.delete("leaderboard_pending_scores", "_id=?", new String[] {
                uri.getLastPathSegment()
            });

        case 72: // 'H'
        case 73: // 'I'
            return applyDelete(uri, s, as, "_id", mDeleteImage);

        case 74: // 'J'
        case 75: // 'K'
        case 77: // 'M'
            return applyDelete(uri, s, as, "_id", mDeleteInvitation);

        case 78: // 'N'
        case 79: // 'O'
        case 80: // 'P'
            return applyDelete(uri, s, as, "_id", mDeleteRequestPendingOps);

        case 81: // 'Q'
        case 82: // 'R'
        case 83: // 'S'
            return applyDelete(uri, s, as, "_id", mDeleteRequest);

        case 88: // 'X'
        case 89: // 'Y'
        case 91: // '['
        case 92: // '\\'
        case 93: // ']'
            return applyDelete(uri, s, as, "_id", mDeleteMatch);

        case 94: // '^'
        case 95: // '_'
        case 96: // '`'
            return applyDelete(uri, s, as, "_id", mDeleteMatchPendingOps);

        case 97: // 'a'
            return sqlitedatabase.delete("participants", s, as);

        case 98: // 'b'
            return sqlitedatabase.delete("participants", "_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 99: // 'c'
            return sqlitedatabase.delete("participants", "external_participant_id=?", new String[] {
                uri.getLastPathSegment()
            });

        case 100: // 'd'
            return sqlitedatabase.delete("participants", "match_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 101: // 'e'
            return sqlitedatabase.delete("participants", "invitation_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 106: // 'j'
        case 136: 
        case 137: 
            return applyDelete(uri, s, as, "_id", mDeleteQuests);

        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
            return applyDelete(uri, s, as, "_id", mDeleteQuestMilestones);

        case 124: // '|'
            return sqlitedatabase.delete("notifications", s, as);

        case 125: // '}'
            return sqlitedatabase.delete("notifications", "_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 126: // '~'
            return sqlitedatabase.delete("notifications", "game_id=?", new String[] {
                String.valueOf(ContentUris.parseId(uri))
            });

        case 127: // '\177'
            throw new IllegalArgumentException("Can't delete notifications by external id!");

        case 138: 
            sqlitedatabase = gamesdatastore.mDatabaseHelper.getReadableDatabase();
            int i = sqlitedatabase.delete("achievement_definitions", null, null);
            int j = sqlitedatabase.delete("achievement_instances", null, null);
            int k = sqlitedatabase.delete("games", null, null);
            int l = sqlitedatabase.delete("game_badges", null, null);
            int i1 = sqlitedatabase.delete("game_instances", null, null);
            int j1 = sqlitedatabase.delete("invitations", null, null);
            int k1 = sqlitedatabase.delete("leaderboards", null, null);
            int l1 = sqlitedatabase.delete("leaderboard_instances", null, null);
            int i2 = sqlitedatabase.delete("leaderboard_scores", null, null);
            int j2 = sqlitedatabase.delete("matches", null, null);
            int k2 = sqlitedatabase.delete("notifications", null, null);
            int l2 = sqlitedatabase.delete("participants", null, null);
            int i3 = sqlitedatabase.delete("snapshots", null, null);
            sqlitedatabase = gamesdatastore.getPrefs(getContext()).edit();
            sqlitedatabase.remove("match_sync_token");
            sqlitedatabase.remove("request_sync_token");
            SharedPreferencesCompat.apply(sqlitedatabase);
            return i3 + (i + 0 + j + k + l + i1 + j1 + k1 + l1 + i2 + j2 + k2 + l2);

        case 128: 
        case 129: 
        case 130: 
        case 131: 
        case 132: 
            return applyDelete(uri, s, as, "_id", mDeleteSnapshots);
        }
    }

    protected final String getDataStoreName(Uri uri)
    {
        return UriUtils.getDataStoreNameFromUri(uri);
    }

    protected final SQLiteOpenHelper getDatabaseHelper(Uri uri)
    {
        return getDataStore$743ee347(uri).mDatabaseHelper;
    }

    public String getType(Uri uri)
    {
        UriType uritype = matchUri(uri);
        switch (_cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[uritype.ordinal()])
        {
        case 43: // '+'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 79: // 'O'
        case 81: // 'Q'
        case 82: // 'R'
        case 83: // 'S'
        case 84: // 'T'
        case 85: // 'U'
        case 86: // 'V'
        case 87: // 'W'
        case 90: // 'Z'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        case 123: // '{'
        case 134: 
        case 137: 
        case 138: 
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI: ")).append(uri).append(" - ").append(uritype).toString());

        case 1: // '\001'
        case 8: // '\b'
            return "vnd.android.cursor.dir/vnd.google.android.games.games";

        case 2: // '\002'
            return "vnd.android.cursor.item/vnd.google.android.games.game";

        case 9: // '\t'
        case 11: // '\013'
        case 12: // '\f'
            return "vnd.android.cursor.dir/vnd.google.android.games.game_badges";

        case 10: // '\n'
            return "vnd.android.cursor.item/vnd.google.android.games.game_badge";

        case 13: // '\r'
        case 15: // '\017'
        case 16: // '\020'
            return "vnd.android.cursor.dir/vnd.google.android.games.game_instances";

        case 14: // '\016'
            return "vnd.android.cursor.item/vnd.google.android.games.game_instance";

        case 17: // '\021'
            return "vnd.android.cursor.dir/vnd.google.android.games.players";

        case 18: // '\022'
        case 19: // '\023'
            return "vnd.android.cursor.item/vnd.google.android.games.player";

        case 20: // '\024'
            return "vnd.android.cursor.dir/vnd.google.android.games.player_levels";

        case 21: // '\025'
        case 22: // '\026'
            return "vnd.android.cursor.item/and.google.android.games.player_level";

        case 133: 
            return "vnd.android.cursor.dir/vnd.google.android.games.player_stats";

        case 23: // '\027'
        case 24: // '\030'
            return "vnd.android.cursor.dir/vnd.google.android.games.player_stat";

        case 25: // '\031'
            return "vnd.android.cursor.item/vnd.google.android.games.account_metadata";

        case 26: // '\032'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
            return "vnd.android.cursor.dir/vnd.google.android.games.achievements";

        case 27: // '\033'
            return "vnd.android.cursor.item/vnd.google.android.games.achievement";

        case 31: // '\037'
            return "vnd.android.cursor.dir/vnd.google.android.games.achievement_pending_ops";

        case 32: // ' '
            return "vnd.android.cursor.item/vnd.google.android.games.achievement_pending_op";

        case 33: // '!'
        case 35: // '#'
        case 36: // '$'
            return "vnd.android.cursor.dir/vnd.google.android.games.achievement_states";

        case 34: // '"'
            return "vnd.android.cursor.item/vnd.google.android.games.achievement_state";

        case 78: // 'N'
            return "vnd.android.cursor.dir/vnd.google.android.games.request_pending_ops";

        case 80: // 'P'
            return "vnd.android.cursor.item/vnd.google.android.games.request_pending_op";

        case 54: // '6'
            return "vnd.android.cursor.dir/vnd.google.android.games.client_contexts";

        case 55: // '7'
            return "vnd.android.cursor.item/vnd.google.android.games.client_context";

        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
            return "vnd.android.cursor.dir/vnd.google.android.games.event";

        case 42: // '*'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
            return "vnd.android.cursor.dir/vnd.google.android.games.event_instances";

        case 47: // '/'
            return "vnd.android.cursor.dir/vnd.google.android.games.event_pending_ops";

        case 74: // 'J'
            return "vnd.android.cursor.dir/vnd.google.android.games.invitations";

        case 75: // 'K'
        case 76: // 'L'
        case 77: // 'M'
            return "vnd.android.cursor.item/vnd.google.android.games.invitation";

        case 56: // '8'
            return "vnd.android.cursor.dir/vnd.google.android.games.experience_events";

        case 57: // '9'
        case 58: // ':'
            return "vnd.android.cursor.item/vnd.google.android.games.experience_event";

        case 59: // ';'
        case 62: // '>'
        case 63: // '?'
            return "vnd.android.cursor.dir/vnd.google.android.games.leaderboards";

        case 60: // '<'
        case 61: // '='
            return "vnd.android.cursor.item/vnd.google.android.games.leaderboard";

        case 64: // '@'
        case 66: // 'B'
        case 67: // 'C'
            return "vnd.android.cursor.dir/vnd.google.android.games.leaderboard_instances";

        case 65: // 'A'
            return "vnd.android.cursor.item/vnd.google.android.games.leaderboard_instance";

        case 68: // 'D'
        case 70: // 'F'
            return "vnd.android.cursor.dir/vnd.google.android.games.leaderboard_scores";

        case 69: // 'E'
            return "vnd.android.cursor.item/vnd.google.android.games.leaderboard_score";

        case 71: // 'G'
            return "vnd.android.cursor.dir/vnd.google.android.games.leaderboard_pending_scores";

        case 135: 
            return "vnd.android.cursor.item/vnd.google.android.games.leaderboard_pending_score";

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 73: // 'I'
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 143: 
        case 144: 
        case 145: 
        case 146: 
            return "image/png";

        case 72: // 'H'
            return "vnd.android.cursor.dir/vnd.google.android.games.images";

        case 88: // 'X'
        case 92: // '\\'
        case 93: // ']'
            return "vnd.android.cursor.dir/vnd.google.android.games.matches";

        case 89: // 'Y'
        case 91: // '['
            return "vnd.android.cursor.item/vnd.google.android.games.match";

        case 94: // '^'
            return "vnd.android.cursor.dir/vnd.google.android.games.match_pending_ops";

        case 95: // '_'
        case 96: // '`'
            return "vnd.android.cursor.item/vnd.google.android.games.match_pending_op";

        case 124: // '|'
        case 126: // '~'
        case 127: // '\177'
            return "vnd.android.cursor.dir/vnd.google.android.games.notifications";

        case 125: // '}'
            return "vnd.android.cursor.item/vnd.google.android.games.notification";

        case 97: // 'a'
        case 100: // 'd'
        case 101: // 'e'
            return "vnd.android.cursor.dir/vnd.google.android.games.participants";

        case 98: // 'b'
        case 99: // 'c'
            return "vnd.android.cursor.item/vnd.google.android.games.participant";

        case 102: // 'f'
        case 104: // 'h'
        case 106: // 'j'
        case 136: 
            return "vnd.android.cursor.dir/vnd.google.android.games.quests";

        case 103: // 'g'
        case 105: // 'i'
            return "vnd.android.cursor.item/vnd.google.android.games.quest";

        case 113: // 'q'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
            return "vnd.android.cursor.dir/vnd.google.android.games.milestones";

        case 114: // 'r'
            return "vnd.android.cursor.item/vnd.google.android.games.milestone";

        case 128: 
        case 130: 
            return "vnd.android.cursor.item/vnd.google.android.games.snapshot";

        case 129: 
        case 131: 
        case 132: 
            return "vnd.android.cursor.dir/vnd.google.android.games.snapshots";
        }
    }

    protected final Uri insertInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues)
    {
_L41:
        Object obj;
        Object obj1;
        UriType uritype;
        long l;
        obj = getDataStore$743ee347(uri);
        GamesDataStore.waitForAccess(((GamesDataStore) (obj)).mWriteAccessLatch);
        obj1 = ((GamesDataStore) (obj)).mImageStore;
        l = -1L;
        uritype = matchUri(uri);
        _cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[uritype.ordinal()];
        JVM INSTR lookupswitch 44: default 404
    //                   1: 440
    //                   3: 478
    //                   4: 478
    //                   5: 478
    //                   6: 478
    //                   7: 478
    //                   9: 572
    //                   13: 592
    //                   17: 605
    //                   20: 652
    //                   21: 652
    //                   22: 652
    //                   25: 767
    //                   26: 1017
    //                   31: 1055
    //                   33: 1069
    //                   37: 1238
    //                   42: 1277
    //                   47: 1291
    //                   51: 1083
    //                   53: 1097
    //                   54: 1111
    //                   56: 1305
    //                   59: 1344
    //                   64: 1383
    //                   68: 1527
    //                   71: 1548
    //                   72: 1562
    //                   73: 1562
    //                   74: 1612
    //                   78: 1990
    //                   81: 2033
    //                   84: 2061
    //                   88: 1640
    //                   94: 1668
    //                   97: 1807
    //                   102: 1881
    //                   103: 1848
    //                   113: 1943
    //                   114: 1931
    //                   124: 1708
    //                   128: 2176
    //                   133: 683
    //                   134: 928;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L7 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid insert URI: ")).append(uri).append(" - ").append(uritype).toString());
_L2:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_game_id"));
        handleGameImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Games.getUriForExternalGameId(uri, ((String) (obj1))), "games", contentvalues);
_L3:
        long l1 = getImageId(sqlitedatabase, uri);
        l = l1;
_L43:
        if (l != -1L) goto _L40; else goto _L39
_L39:
        GamesLog.w("GamesContentProvider", (new StringBuilder("Couldn't find image to write to for URI ")).append(uri).toString());
_L42:
        if (l < 0L)
        {
            throw new SQLiteException((new StringBuilder("Error occured while inserting ")).append(contentvalues).append(" to uri ").append(uri).toString());
        } else
        {
            return ContentUris.withAppendedId(uri, l);
        }
_L40:
        uri = GamesContractInternal.Images.getContentUri(uri);
          goto _L41
_L4:
        handleGameBadgeImages(((GamesDataStore) (obj)), contentvalues);
        l = sqlitedatabase.insert("game_badges", null, contentvalues);
          goto _L42
_L5:
        l = sqlitedatabase.insert("game_instances", null, contentvalues);
          goto _L42
_L6:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_player_id"));
        handlePlayerImages(((GamesDataStore) (obj)), contentvalues);
        Agents.validatePlayerName(getContext(), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Players.getUriForExternalPlayerId(uri, ((String) (obj1))), "players", contentvalues);
_L7:
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.PlayerLevels.getUriForLevel(uri, ((Integer)Preconditions.checkNotNull(contentvalues.getAsInteger("level_value"))).intValue()), "player_levels", contentvalues);
_L37:
        l = contentvalues.getAsLong("game_id").longValue();
        long l2 = contentvalues.getAsLong("player_id").longValue();
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (l2 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.PlayerStats.getUriForGamesContext(uri, l2, l), "player_stats", contentvalues);
_L8:
        sqlitedatabase = ((GamesDataStore) (obj)).getPrefs(getContext()).edit();
        contentvalues = contentvalues.valueSet().iterator();
        do
        {
            if (contentvalues.hasNext())
            {
                obj = (java.util.Map.Entry)contentvalues.next();
                obj1 = (String)((java.util.Map.Entry) (obj)).getKey();
                ColumnSpec.DataType datatype = ACCOUNT_METADATA_SPEC.getColumnDataType(((String) (obj1)));
                switch (_cls3..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[datatype.ordinal()])
                {
                default:
                    throw new IllegalStateException("Unsupported metadata column type");

                case 1: // '\001'
                    sqlitedatabase.putString(((String) (obj1)), (String)((java.util.Map.Entry) (obj)).getValue());
                    break;

                case 2: // '\002'
                    sqlitedatabase.putLong(((String) (obj1)), ((Long)((java.util.Map.Entry) (obj)).getValue()).longValue());
                    break;
                }
            } else
            {
                SharedPreferencesCompat.apply(sqlitedatabase);
                return uri;
            }
        } while (true);
_L38:
        Preconditions.checkNotNull(contentvalues.getAsString("cover_photo_image_url"), "Must provide an image URL when inserting");
        handleImageFieldUrl(((GamesDataStore) (obj)), contentvalues, "cover_photo_image_url", "cover_photo_image_id");
        l = contentvalues.getAsLong("cover_photo_image_id").longValue();
        sqlitedatabase = ((GamesDataStore) (obj)).getPrefs(getContext()).edit();
        sqlitedatabase.putLong("cover_photo_image_id", l);
        SharedPreferencesCompat.apply(sqlitedatabase);
        return GamesContractInternal.Images.getContentUri(uri).buildUpon().appendPath(String.valueOf(l)).build();
_L9:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_achievement_id"));
        handleAchievementImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.AchievementDefinitions.getUriForExternalAchievementId(uri, ((String) (obj1))), "achievement_definitions", contentvalues);
_L10:
        l = sqlitedatabase.insert("achievement_pending_ops", null, contentvalues);
          goto _L42
_L11:
        l = sqlitedatabase.insert("achievement_instances", null, contentvalues);
          goto _L42
_L15:
        l = sqlitedatabase.insert("application_sessions", null, contentvalues);
          goto _L42
_L16:
        l = sqlitedatabase.insert("app_content", null, contentvalues);
          goto _L42
_L17:
        obj = (String)Preconditions.checkNotNull(contentvalues.getAsString("package_name"));
        int i = contentvalues.getAsInteger("package_uid").intValue();
        QuerySpec queryspec2;
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("account_name"));
        queryspec2 = new QuerySpec(uri, null, null);
        queryspec2.addWhere("package_name", ((String) (obj)));
        queryspec2.addWhereById("package_uid", i);
        queryspec2.addWhere("account_name", ((String) (obj1)));
        return applyUpsert(sqlitedatabase, uri, uri, "client_contexts", null, contentvalues, queryspec2.getSelection(), queryspec2.mSelectionArgs);
_L12:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_event_id"));
        handleEventImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.EventDefinitions.getUriForExternalEventId(uri, ((String) (obj1))), "event_definitions", contentvalues);
_L13:
        l = sqlitedatabase.insert("event_instances", null, contentvalues);
          goto _L42
_L14:
        l = sqlitedatabase.insert("event_pending_ops", null, contentvalues);
          goto _L42
_L18:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_experience_id"));
        handleExperienceEventImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.ExperienceEvents.getUriForExternalExperienceId(uri, ((String) (obj1))), "experience_events", contentvalues);
_L19:
        obj1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_leaderboard_id"));
        handleLeaderboardImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Leaderboards.getUriForExternalLeaderboardId(uri, ((String) (obj1))), "leaderboards", contentvalues);
_L20:
        l = contentvalues.getAsLong("leaderboard_id").longValue();
        int j;
        int k;
        boolean flag2;
        if (l > 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2);
        Preconditions.checkState(contentvalues.containsKey("collection"));
        j = contentvalues.getAsInteger("collection").intValue();
        Preconditions.checkState(contentvalues.containsKey("timespan"));
        k = contentvalues.getAsInteger("timespan").intValue();
        obj = new QuerySpec(uri, null, null);
        ((QuerySpec) (obj)).addWhereById("leaderboard_id", l);
        ((QuerySpec) (obj)).addWhereById("collection", j);
        ((QuerySpec) (obj)).addWhereById("timespan", k);
        return applyUpsert(sqlitedatabase, uri, uri, "leaderboard_instances", null, contentvalues, ((QuerySpec) (obj)).getSelection(), ((QuerySpec) (obj)).mSelectionArgs);
_L21:
        handleLeaderboardScoreImages(((GamesDataStore) (obj)), contentvalues);
        l = sqlitedatabase.insert("leaderboard_scores", null, contentvalues);
          goto _L42
_L22:
        l = sqlitedatabase.insert("leaderboard_pending_scores", null, contentvalues);
          goto _L42
_L23:
        Preconditions.checkNotNull(contentvalues.getAsString("url"), "Must provide an image URL when inserting");
        handleImageFieldUrl(((GamesDataStore) (obj)), contentvalues, "url", "_id");
        l = contentvalues.getAsLong("_id").longValue();
        updateImageData(((ImageStore) (obj1)), l, contentvalues);
          goto _L42
_L24:
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Invitations.getUriForExternalInvitationId(uri, (String)Preconditions.checkNotNull(contentvalues.getAsString("external_invitation_id"))), "invitations", contentvalues);
_L28:
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Matches.getUriForExternalMatchId(uri, (String)Preconditions.checkNotNull(contentvalues.getAsString("external_match_id"))), "matches", contentvalues);
_L29:
        Preconditions.checkState(contentvalues.containsKey("type"));
        Preconditions.checkState(OfflineMatchAction.isValid(contentvalues.getAsInteger("type").intValue()));
        l = sqlitedatabase.insert("matches_pending_ops", null, contentvalues);
          goto _L42
_L35:
        Preconditions.checkState(contentvalues.containsKey("game_id"));
        l = contentvalues.getAsLong("game_id").longValue();
        obj = contentvalues.getAsString("external_sub_id");
        Preconditions.checkNotNull(obj);
        Preconditions.checkState(contentvalues.containsKey("type"));
        QuerySpec queryspec = new QuerySpec(uri, null, null);
        queryspec.addWhereById("game_id", l);
        queryspec.addWhere("external_sub_id", ((String) (obj)));
        return applyUpsert(sqlitedatabase, uri, uri, "notifications", null, contentvalues, queryspec.getSelection(), queryspec.mSelectionArgs);
_L30:
        if (contentvalues.get("placing") != null)
        {
            Asserts.checkNotNull(contentvalues.get("result_type"));
        }
        handleParticipantImages(((GamesDataStore) (obj)), contentvalues);
        l = sqlitedatabase.insert("participants", null, contentvalues);
          goto _L42
_L32:
        Preconditions.checkNotNullIfPresent("accepted_ts", contentvalues);
        Preconditions.checkNotNullIfPresent("notification_ts", contentvalues);
        handleQuestImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, uri, "quests", contentvalues);
_L31:
        String s = Preconditions.checkNotEmpty(contentvalues.getAsString("external_quest_id"));
        Preconditions.checkNotNullIfPresent("accepted_ts", contentvalues);
        Preconditions.checkNotNullIfPresent("notification_ts", contentvalues);
        handleQuestImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Quests.getUriForExternalQuestId(uri, s), "quests", contentvalues);
_L34:
        return applyUpsert$175c4d11(sqlitedatabase, uri, uri, "milestones", contentvalues);
_L33:
        Preconditions.checkNotNull(contentvalues.getAsInteger("milestones_sorting_rank"));
        Preconditions.checkNotNull(contentvalues.getAsLong("quest_id"));
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Milestones.getUriForExternalMilestoneId(uri, Preconditions.checkNotEmpty(contentvalues.getAsString("external_milestone_id"))), "milestones", contentvalues);
_L25:
        obj = Preconditions.checkNotEmpty(contentvalues.getAsString("external_request_id"));
        Preconditions.checkNotNull("external_game_id");
        Preconditions.checkNotNull("client_context_id");
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.RequestPendingOps.getUriForExternalRequestId(uri, ((String) (obj))), "request_pending_ops", contentvalues);
_L26:
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Requests.getUriForExternalRequestId(uri, (String)Preconditions.checkNotNull(contentvalues.getAsString("external_request_id"))), "requests", contentvalues);
_L27:
        obj = (Long)Preconditions.checkNotNull(contentvalues.getAsLong("request_id"));
        if (!contentvalues.containsKey("player_id"))
        {
            return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.RequestRecipients.getUriForRequestId(uri, ((Long) (obj)).longValue()), "request_recipients", contentvalues);
        } else
        {
            l = contentvalues.getAsLong("player_id").longValue();
            QuerySpec queryspec1 = new QuerySpec(uri, null, null);
            queryspec1.addWhereById("player_id", l);
            queryspec1.addWhereById("request_id", ((Long) (obj)).longValue());
            return applyUpsert(sqlitedatabase, uri, uri, "request_recipients", null, contentvalues, queryspec1.getSelection(), queryspec1.mSelectionArgs);
        }
_L36:
        String s1 = (String)Preconditions.checkNotNull(contentvalues.getAsString("external_snapshot_id"));
        handleSnapshotImages(((GamesDataStore) (obj)), contentvalues);
        return applyUpsert$175c4d11(sqlitedatabase, uri, GamesContractInternal.Snapshots.getUriForExternalSnapshotId(uri, s1), "snapshots", contentvalues);
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
          goto _L43
    }

    protected final void notifyChange()
    {
        getContext().getContentResolver().notifyChange(GamesContractInternal.AUTHORITY_URI, null, false);
    }

    public boolean onCreate()
    {
        super.onCreate();
        mBackgroundThread = new HandlerThread("GamesProviderWorker", 10);
        mBackgroundThread.start();
        mBackgroundHandler = new Handler(mBackgroundThread.getLooper()) {

            final PlayGamesContentProvider this$0;

            public final void handleMessage(Message message)
            {
                performBackgroundTask(message.what, message.obj);
            }

            
            {
                this$0 = PlayGamesContentProvider.this;
                super(looper);
            }
        };
        Object obj = new HashMap();
        ((HashMap) (obj)).put("achievement_instances", "definition_id");
        mDeleteAchievementDefinition = new DataDeleter("achievement_definitions", "_id", new String[] {
            "unlocked_icon_image_id", "revealed_icon_image_id"
        }, null, ((HashMap) (obj)));
        mDeleteAchievementInstances = new DataDeleter("achievement_instances", "_id");
        mDeleteAchievementPendingOps = new DataDeleter("achievement_pending_ops", "_id");
        mDeleteAppContentSession = new DataDeleter("app_content", "_id");
        mDeleteApplicationSession = new DataDeleter("application_sessions", "_id");
        obj = new HashMap();
        ((HashMap) (obj)).put("achievement_pending_ops", "client_context_id");
        ((HashMap) (obj)).put("application_sessions", "client_context_id");
        ((HashMap) (obj)).put("event_pending_ops", "client_context_id");
        ((HashMap) (obj)).put("leaderboard_pending_scores", "client_context_id");
        ((HashMap) (obj)).put("matches_pending_ops", "client_context_id");
        ((HashMap) (obj)).put("request_pending_ops", "client_context_id");
        mDeleteClientContext = new DataDeleter("client_contexts", "_id", null, null, ((HashMap) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("event_instances", "definition_id");
        mDeleteEventDefinition = new DataDeleter("event_definitions", "_id", new String[] {
            "icon_image_id"
        }, null, ((HashMap) (obj)));
        mDeleteEventInstances = new DataDeleter("event_instances", "_id");
        mDeleteEventPendingOps = new DataDeleter("event_pending_ops", "_id");
        mDeleteExperienceEvent = new DataDeleter("experience_events", "_id", new String[] {
            "icon_id"
        });
        mDeleteGameBadge = new DataDeleter("game_badges", "_id", new String[] {
            "badge_icon_image_id"
        });
        mDeleteImage = new DataDeleter() {

            final PlayGamesContentProvider this$0;

            public final int delete(GamesDataStore gamesdatastore, long l)
            {
                return gamesdatastore.mImageStore.remove(l);
            }

            
            {
                this$0 = PlayGamesContentProvider.this;
                super(null, null, null);
            }
        };
        mDeleteLeaderboardScore = new DataDeleter("leaderboard_scores", "_id", new String[] {
            "default_display_image_id"
        });
        mDeleteLeaderboardInstance = new DataDeleter("leaderboard_instances", "_id", null, new DataDeleterAssociatedQuery[] {
            new DataDeleterAssociatedQuery("leaderboard_scores", "_id", "instance_id", mDeleteLeaderboardScore)
        }, null);
        obj = new DataDeleterAssociatedQuery("leaderboard_instances", "_id", "leaderboard_id", mDeleteLeaderboardInstance);
        mDeleteLeaderboard = new DataDeleter("leaderboards", "_id", new String[] {
            "board_icon_image_id"
        }, new DataDeleterAssociatedQuery[] {
            obj
        }, null);
        obj = new HashMap();
        ((HashMap) (obj)).put("participants", "match_id");
        mDeleteMatch = new DataDeleter("matches", "_id", null, new DataDeleterAssociatedQuery[] {
            new DataDeleterAssociatedQuery("matches", "external_match_id", "_id", "notifications", "external_sub_id=?")
        }, ((HashMap) (obj)));
        mDeleteMatchPendingOps = new DataDeleter("matches_pending_ops", "_id");
        obj = new HashMap();
        ((HashMap) (obj)).put("participants", "invitation_id");
        mDeleteInvitation = new DataDeleter("invitations", "_id", null, new DataDeleterAssociatedQuery[] {
            new DataDeleterAssociatedQuery("invitations", "external_invitation_id", "_id", "notifications", "external_sub_id=?")
        }, ((HashMap) (obj)));
        mDeleteQuestMilestones = new DataDeleter("milestones", "_id");
        obj = new HashMap();
        ((HashMap) (obj)).put("milestones", "quest_id");
        mDeleteQuests = new DataDeleter("quests", "_id", new String[] {
            "quest_icon_image_id", "quest_banner_image_id"
        }, null, ((HashMap) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("request_recipients", "request_id");
        mDeleteRequest = new DataDeleter("requests", "_id", null, new DataDeleterAssociatedQuery[] {
            new DataDeleterAssociatedQuery("requests", "external_request_id", "_id", "notifications", "external_sub_id=?")
        }, ((HashMap) (obj)));
        mDeleteRequestPendingOps = new DataDeleter("request_pending_ops", "_id");
        mDeleteSnapshots = new DataDeleter("snapshots", "_id", new String[] {
            "cover_icon_image_id"
        });
        obj = new HashMap();
        ((HashMap) (obj)).put("leaderboard_scores", "player_id");
        ((HashMap) (obj)).put("achievement_instances", "player_id");
        DataDeleterAssociatedQuery datadeleterassociatedquery = new DataDeleterAssociatedQuery("snapshots", "_id", "owner_id", mDeleteSnapshots);
        mDeletePlayer = new DataDeleter("players", "_id", new String[] {
            "profile_icon_image_id", "profile_hi_res_image_id"
        }, new DataDeleterAssociatedQuery[] {
            datadeleterassociatedquery
        }, ((HashMap) (obj)));
        mDeletePlayerStats = new DataDeleter("player_stats", "_id");
        obj = new HashMap();
        ((HashMap) (obj)).put("game_instances", "instance_game_id");
        datadeleterassociatedquery = new DataDeleterAssociatedQuery("game_badges", "_id", "badge_game_id", mDeleteGameBadge);
        DataDeleterAssociatedQuery datadeleterassociatedquery1 = new DataDeleterAssociatedQuery("achievement_definitions", "_id", "game_id", mDeleteAchievementDefinition);
        DataDeleterAssociatedQuery datadeleterassociatedquery2 = new DataDeleterAssociatedQuery("leaderboards", "_id", "game_id", mDeleteLeaderboard);
        DataDeleterAssociatedQuery datadeleterassociatedquery3 = new DataDeleterAssociatedQuery("matches", "_id", "game_id", mDeleteMatch);
        DataDeleterAssociatedQuery datadeleterassociatedquery4 = new DataDeleterAssociatedQuery("invitations", "_id", "game_id", mDeleteInvitation);
        DataDeleterAssociatedQuery datadeleterassociatedquery5 = new DataDeleterAssociatedQuery("requests", "_id", "game_id", mDeleteRequest);
        DataDeleterAssociatedQuery datadeleterassociatedquery6 = new DataDeleterAssociatedQuery("quests", "_id", "game_id", mDeleteQuests);
        DataDeleterAssociatedQuery datadeleterassociatedquery7 = new DataDeleterAssociatedQuery("snapshots", "_id", "game_id", mDeleteSnapshots);
        DataDeleterAssociatedQuery datadeleterassociatedquery8 = new DataDeleterAssociatedQuery("event_definitions", "_id", "event_definitions_game_id", mDeleteEventDefinition);
        DataDeleterAssociatedQuery datadeleterassociatedquery9 = new DataDeleterAssociatedQuery("player_stats", "_id", "game_id", mDeletePlayerStats);
        mDeleteGame = new DataDeleter("games", "_id", new String[] {
            "game_icon_image_id", "game_hi_res_image_id", "featured_image_id"
        }, new DataDeleterAssociatedQuery[] {
            datadeleterassociatedquery, datadeleterassociatedquery1, datadeleterassociatedquery2, datadeleterassociatedquery3, datadeleterassociatedquery4, datadeleterassociatedquery5, datadeleterassociatedquery6, datadeleterassociatedquery7, datadeleterassociatedquery8, datadeleterassociatedquery9
        }, ((HashMap) (obj)));
        return true;
    }

    protected final void onEndTransaction()
    {
        super.onEndTransaction();
        Object obj = mOrphanImageLock;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = mOrphanCheckImageIds.keySet().iterator();
_L1:
        Object obj1;
        Object obj2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj2 = (String)iterator.next();
        obj1 = (GamesDataStore)mDataStores.get(obj2);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        GamesLog.wtf(getContext(), "GamesContentProvider", (new StringBuilder("Null data store found for store name ")).append(((String) (obj2))).toString());
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj2 = (Set)mOrphanCheckImageIds.get(obj2);
        obj1 = getImageCleaner(((GamesDataStore) (obj1)));
        if (obj1 == null) goto _L1; else goto _L2
_L2:
        ((ImageCleaner) (obj1)).cleanupOrphans(((Set) (obj2)));
          goto _L1
        mOrphanCheckImageIds.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected final AssetFileDescriptor openAssetFileLocked(Uri uri, String s)
        throws FileNotFoundException
    {
        GamesDataStore gamesdatastore = getDataStore$743ee347(uri);
        if (s.equals("r"))
        {
            GamesDataStore.waitForAccess(gamesdatastore.mReadAccessLatch);
            long l = getImageId(gamesdatastore.mDatabaseHelper.getReadableDatabase(), uri);
            if (l != -1L)
            {
                return openImageForRead(gamesdatastore.mImageStore, l);
            } else
            {
                throw new FileNotFoundException((new StringBuilder("No image found for URI ")).append(uri).toString());
            }
        } else
        {
            throw new FileNotFoundException((new StringBuilder("Mode ")).append(s).append(" not supported.").toString());
        }
    }

    protected final void performBackgroundTask(int i, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        i;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 161;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        Object obj1 = (String)obj;
        obj = mDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj2;
        obj2 = (GamesDataStore)mDataStores.get(obj1);
        if (((GamesDataStore) (obj2)).initialize(getContext()))
        {
            scheduleBackgroundTask(1, obj1, 30000L);
            return;
        }
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L4:
        if (((GamesDataStore) (obj2)).mInitRetries < 3)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        GamesLog.d("GamesContentProvider", (new StringBuilder("Retrying data store creation ")).append(((String) (obj1))).toString());
        scheduleBackgroundTask(0, obj1, 200L);
        obj;
        JVM INSTR monitorexit ;
        return;
_L6:
        obj;
        JVM INSTR monitorexit ;
        throw new RuntimeException((new StringBuilder("Unable to initialize data store ")).append(((String) (obj1))).toString());
_L3:
        obj = (String)obj;
        if (!DATABASE_LOCK.tryLock())
        {
            GamesLog.d("GamesContentProvider", String.format("Can't lock DB for task %d, waiting 30s", new Object[] {
                Integer.valueOf(1)
            }));
            scheduleBackgroundTask(1, obj, 30000L);
            return;
        }
        obj1 = (GamesDataStore)mDataStores.get(obj);
        if (obj1 != null) goto _L8; else goto _L7
_L7:
        GamesLog.wtf(getContext(), "GamesContentProvider", (new StringBuilder("Null data store found for store name ")).append(((String) (obj))).toString());
_L10:
        DATABASE_LOCK.unlock();
        return;
_L8:
        if (!((GamesDataStore) (obj1)).initialize(getContext())) goto _L10; else goto _L9
_L9:
        obj2 = ((GamesDataStore) (obj1)).mImageStore;
        if (SystemClock.elapsedRealtime() - ((ImageStore) (obj2)).mLastCleanupTimeMillis > 0x36ee80L) goto _L12; else goto _L11
_L11:
        i = ((flag) ? 1 : 0);
        if (((ImageStore) (obj2)).mLastCleanupTimeMillis != 0L) goto _L13; else goto _L12
_L13:
        if (i == 0) goto _L15; else goto _L14
_L14:
        GamesLog.d("GamesContentProvider", String.format("Cleaning data store %s ", new Object[] {
            obj
        }));
        obj = getImageCleaner(((GamesDataStore) (obj1)));
        if (obj == null) goto _L10; else goto _L16
_L16:
        ((ImageCleaner) (obj)).performCleanup();
          goto _L10
        obj;
        DATABASE_LOCK.unlock();
        throw obj;
_L15:
        GamesLog.d("GamesContentProvider", String.format("Rate limited cleanup for data store %s ", new Object[] {
            obj
        }));
          goto _L10
_L12:
        i = 1;
          goto _L13
    }

    protected final Cursor queryLocked(SQLiteDatabase sqlitedatabase, Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        GamesDataStore gamesdatastore;
        gamesdatastore = getDataStore$743ee347(uri);
        GamesDataStore.waitForAccess(gamesdatastore.mReadAccessLatch);
        sqlitequerybuilder = new SQLiteQueryBuilder();
        s = new QuerySpec(uri, s, as1);
        as1 = matchUri(uri);
        _cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[as1.ordinal()];
        JVM INSTR tableswitch 1 132: default 596
    //                   1 632
    //                   2 723
    //                   3 739
    //                   4 758
    //                   5 778
    //                   6 803
    //                   7 822
    //                   8 842
    //                   9 859
    //                   10 868
    //                   11 885
    //                   12 901
    //                   13 918
    //                   14 927
    //                   15 944
    //                   16 960
    //                   17 977
    //                   18 986
    //                   19 1002
    //                   20 1019
    //                   21 1027
    //                   22 1042
    //                   23 1058
    //                   24 1074
    //                   25 1116
    //                   26 1367
    //                   27 1376
    //                   28 1393
    //                   29 1410
    //                   30 1426
    //                   31 1443
    //                   32 1451
    //                   33 1466
    //                   34 1475
    //                   35 1492
    //                   36 1520
    //                   37 1548
    //                   38 1557
    //                   39 1574
    //                   40 1591
    //                   41 1608
    //                   42 1625
    //                   43 1634
    //                   44 1651
    //                   45 1679
    //                   46 1707
    //                   47 1727
    //                   48 1735
    //                   49 1751
    //                   50 1767
    //                   51 1794
    //                   52 1802
    //                   53 1818
    //                   54 1832
    //                   55 1840
    //                   56 1856
    //                   57 1865
    //                   58 1882
    //                   59 1899
    //                   60 1908
    //                   61 1925
    //                   62 1942
    //                   63 1958
    //                   64 1975
    //                   65 1984
    //                   66 2001
    //                   67 2018
    //                   68 2035
    //                   69 2044
    //                   70 2061
    //                   71 2078
    //                   72 2097
    //                   73 2105
    //                   74 2120
    //                   75 2129
    //                   76 2146
    //                   77 2164
    //                   78 2181
    //                   79 2189
    //                   80 2205
    //                   81 2221
    //                   82 2229
    //                   83 2245
    //                   84 2261
    //                   85 2270
    //                   86 2287
    //                   87 2304
    //                   88 2323
    //                   89 2331
    //                   90 2347
    //                   91 2366
    //                   92 2382
    //                   93 2397
    //                   94 2413
    //                   95 2421
    //                   96 2437
    //                   97 2453
    //                   98 2462
    //                   99 2479
    //                   100 2496
    //                   101 2513
    //                   102 2530
    //                   103 2539
    //                   104 2556
    //                   105 2572
    //                   106 2589
    //                   107 2606
    //                   108 2615
    //                   109 2632
    //                   110 2649
    //                   111 2665
    //                   112 2682
    //                   113 2699
    //                   114 2708
    //                   115 2725
    //                   116 2742
    //                   117 2759
    //                   118 2776
    //                   119 2785
    //                   120 2802
    //                   121 2819
    //                   122 2828
    //                   123 2845
    //                   124 2862
    //                   125 2871
    //                   126 2888
    //                   127 2904
    //                   128 2921
    //                   129 2930
    //                   130 2947
    //                   131 2964
    //                   132 2980;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99 _L100 _L101 _L102 _L103 _L104 _L105 _L106 _L107 _L108 _L109 _L110 _L111 _L112 _L113 _L114 _L115 _L116 _L117 _L118 _L119 _L120 _L121 _L122 _L123 _L124 _L125 _L126 _L127 _L128 _L129 _L130 _L131 _L132 _L133
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid query URI: ")).append(uri).append(" - ").append(as1).toString());
_L2:
        setTablesAndProjectionMapForGames(sqlitequerybuilder, uri);
_L141:
        if (as != null && as.length == 1 && "_count".equals(as[0]))
        {
            sqlitequerybuilder.setProjectionMap(sCountProjectionMap);
        }
        uri = sqlitequerybuilder.query(sqlitedatabase, as, s.getSelection(), ((QuerySpec) (s)).mSelectionArgs, null, null, s1, null);
        Asserts.checkState(uri instanceof AbstractWindowedCursor);
        sqlitedatabase = uri;
        if (uri != null)
        {
            uri.setNotificationUri(getContext().getContentResolver(), GamesContractInternal.AUTHORITY_URI);
            sqlitedatabase = uri;
        }
_L139:
        return sqlitedatabase;
_L3:
        s.addWhereById("games._id");
        setTablesAndProjectionMapForGames(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L4:
        s.addWhereById("games._id", UriUtils.getGameIdFromGameImageUri(uri));
        setTablesAndProjectionMapForGameIconImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L5:
        s.addWhere("external_game_id", UriUtils.getExternalGameIdFromGameImageUri(uri));
        setTablesAndProjectionMapForGameIconImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L6:
        s.addWhereById("games._id", UriUtils.getGameIdFromGameImageUri(uri));
        setTablesAndProjection(sqlitequerybuilder, GAME_HI_RES_IMAGES_TABLE, sImagesProjectionMap);
        continue; /* Loop/switch isn't completed */
_L7:
        s.addWhereById("games._id", UriUtils.getGameIdFromGameImageUri(uri));
        setTablesAndProjectionMapForGameFeaturedImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L8:
        s.addWhere("external_game_id", UriUtils.getExternalGameIdFromGameImageUri(uri));
        setTablesAndProjectionMapForGameFeaturedImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L9:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForGames(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L10:
        setTablesAndProjectionMapForGameBadges(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L11:
        s.addWhereById("game_badges._id");
        setTablesAndProjectionMapForGameBadges(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L12:
        s.addWhereById("badge_game_id");
        setTablesAndProjectionMapForGameBadges(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L13:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForGameBadges(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L14:
        setTablesAndProjectionMapForGameInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L15:
        s.addWhereById("game_instances._id");
        setTablesAndProjectionMapForGameInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L16:
        s.addWhereById("instance_game_id");
        setTablesAndProjectionMapForGameInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L17:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForGameInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L18:
        setTablesAndProjectionMapForPlayers(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L19:
        s.addWhereById("_id");
        setTablesAndProjectionMapForPlayers(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L20:
        s.addWhereByStringKey("external_player_id");
        setTablesAndProjectionMapForPlayers(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L21:
        setTablesAndProjectionMapForPlayerLevels$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L22:
        s.addWhereById("_id");
        setTablesAndProjectionMapForPlayerLevels$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L23:
        s.addWhereById("level_value");
        setTablesAndProjectionMapForPlayerLevels$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L24:
        s.addWhereById("player_stats._id");
        setTablesAndProjectionMapForPlayerStats$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L25:
        uri = GamesContractInternal.PlayerStats.getQuerySpecParams(uri);
        s.addWhere("player_id", (String)((Pair) (uri)).first);
        s.addWhere("game_id", (String)((Pair) (uri)).second);
        setTablesAndProjectionMapForPlayerStats$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L26:
        int i;
        boolean flag;
        s = gamesdatastore.getPrefs(getContext());
        if (as != null)
        {
            sqlitedatabase = as;
        } else
        {
            sqlitedatabase = ACCOUNT_METADATA_SPEC.mColumnNames;
        }
        as = ((String []) (new Object[sqlitedatabase.length]));
        flag = false;
        i = 0;
_L135:
        if (i >= sqlitedatabase.length)
        {
            break MISSING_BLOCK_LABEL_1344;
        }
        flag |= s.contains(sqlitedatabase[i]);
        if ("cover_photo_image_uri".equals(sqlitedatabase[i]))
        {
            long l = s.getLong("cover_photo_image_id", -1L);
            if (l == -1L)
            {
                as[i] = null;
            } else
            {
                as[i] = GamesContractInternal.Images.getContentUri(uri).buildUpon().appendPath(String.valueOf(l));
            }
        }
        as1 = ACCOUNT_METADATA_SPEC.getColumnDataType(sqlitedatabase[i]);
        switch (_cls3..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[as1.ordinal()])
        {
        default:
            throw new IllegalStateException("Unsupported metadata column type");

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            as[i] = s.getString(sqlitedatabase[i], null);
            break;
        }
_L136:
        i++;
        if (true) goto _L135; else goto _L134
_L134:
        as[i] = Long.valueOf(s.getLong(sqlitedatabase[i], -1L));
          goto _L136
        if (true) goto _L135; else goto _L137
_L137:
        uri = new MatrixCursor(sqlitedatabase);
        sqlitedatabase = uri;
        if (!flag) goto _L139; else goto _L138
_L138:
        uri.addRow(as);
        return uri;
_L27:
        setTablesAndProjectionMapForAchievementDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L28:
        s.addWhereById("achievement_definitions._id");
        setTablesAndProjectionMapForAchievementDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L29:
        s.addWhereByStringKey("external_achievement_id");
        setTablesAndProjectionMapForAchievementDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L30:
        s.addWhereById("game_id");
        setTablesAndProjectionMapForAchievementDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L31:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForAchievementDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L32:
        setTablesAndProjectionMapForAchievementPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L33:
        s.addWhereById("achievement_pending_ops._id");
        setTablesAndProjectionMapForAchievementPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L34:
        setTablesAndProjectionMapForAchievementInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L35:
        s.addWhereById("achievement_instances._id");
        setTablesAndProjectionMapForAchievementInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L36:
        s.addWhereById("player_id");
        s.addWhereByQuery("external_game_id", "external_game_id");
        setTablesAndProjectionMapForAchievementInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L37:
        s.addWhereByStringKey("external_player_id");
        s.addWhereByQuery("external_game_id", "external_game_id");
        setTablesAndProjectionMapForAchievementInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L38:
        setTablesAndProjectionMapForEventDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L39:
        s.addWhereById("event_definitions._id");
        setTablesAndProjectionMapForEventDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L40:
        s.addWhereById("event_definitions_game_id");
        setTablesAndProjectionMapForEventDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L41:
        s.addWhereByStringKey("external_event_id");
        setTablesAndProjectionMapForEventDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L42:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForEventDefinitions(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L43:
        setTablesAndProjectionMapForEventInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L44:
        s.addWhereById("event_instances._id");
        setTablesAndProjectionMapForEventInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L45:
        s.addWhereById("player_id");
        s.addWhereByQuery("external_game_id", "external_game_id");
        setTablesAndProjectionMapForEventInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L46:
        s.addWhereByStringKey("external_player_id");
        s.addWhereByQuery("external_game_id", "external_game_id");
        setTablesAndProjectionMapForEventInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L47:
        s.addWhereByQuery("external_event_id", "external_event_id");
        setTablesAndProjectionMapForEventInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L48:
        setTablesAndProjectionMapForEventPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L49:
        s.addWhereById("event_pending_ops._id");
        setTablesAndProjectionMapForEventPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L50:
        s.addWhereByStringKey("external_event_id");
        setTablesAndProjectionMapForEventPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L51:
        s.addWhereByStringKey("external_player_id");
        s.addWhereByQuery("external_game_id", "external_game_id");
        setTablesAndProjectionMapForEventPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L52:
        setTablesAndProjectionMapForApplicationSessions$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L53:
        s.addWhereById("application_sessions._id");
        setTablesAndProjectionMapForApplicationSessions$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L54:
        setTablesAndProjection(sqlitequerybuilder, "app_content", sAppContentProjectionMap);
        continue; /* Loop/switch isn't completed */
_L55:
        setTablesAndProjectionMapForClientContext$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L56:
        s.addWhereById("client_contexts._id");
        setTablesAndProjectionMapForClientContext$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L57:
        setTablesAndProjectionMapForExperienceEvents(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L58:
        s.addWhereById("experience_events._id");
        setTablesAndProjectionMapForExperienceEvents(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L59:
        s.addWhereByStringKey("external_experience_id");
        setTablesAndProjectionMapForExperienceEvents(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L60:
        setTablesAndProjectionMapForLeaderboards(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L61:
        s.addWhereById("leaderboards._id");
        setTablesAndProjectionMapForLeaderboards(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L62:
        s.addWhereByStringKey("external_leaderboard_id");
        setTablesAndProjectionMapForLeaderboards(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L63:
        s.addWhereById("game_id");
        setTablesAndProjectionMapForLeaderboards(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L64:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForLeaderboards(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L65:
        setTablesAndProjectionMapForLeaderboardInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L66:
        s.addWhereById("leaderboard_instances._id");
        setTablesAndProjectionMapForLeaderboardInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L67:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForLeaderboardInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L68:
        s.addWhereByStringKey("external_leaderboard_id");
        setTablesAndProjectionMapForLeaderboardInstances(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L69:
        setTablesAndProjectionMapForLeaderboardScores(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L70:
        s.addWhereById("leaderboard_scores._id");
        setTablesAndProjectionMapForLeaderboardScores(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L71:
        s.addWhereById("leaderboard_instances._id");
        setTablesAndProjectionMapForLeaderboardScores(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L72:
        sqlitequerybuilder.setTables(LEADERBOARD_PENDING_SCORES_TABLE);
        sqlitequerybuilder.setProjectionMap(sLeaderboardPendingScoresProjectionMap);
        continue; /* Loop/switch isn't completed */
_L73:
        setTablesAndProjectionMapForImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L74:
        s.addWhereById("_id");
        setTablesAndProjectionMapForImages$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L75:
        setTablesAndProjectionMapForInvitations(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L76:
        s.addWhereById("invitations._id");
        setTablesAndProjectionMapForInvitations(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L77:
        s.addWhereById("_id");
        sqlitequerybuilder.setTables("invitations");
        continue; /* Loop/switch isn't completed */
_L78:
        s.addWhereByStringKey("external_invitation_id");
        setTablesAndProjectionMapForInvitations(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L79:
        setTablesAndProjectionMapForRequestPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L80:
        s.addWhereById("request_pending_ops._id");
        setTablesAndProjectionMapForRequestPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L81:
        s.addWhereByStringKey("external_request_id");
        setTablesAndProjectionMapForRequestPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L82:
        setTablesAndProjectionMapForRequests$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L83:
        s.addWhereById("requests._id");
        setTablesAndProjectionMapForRequests$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L84:
        s.addWhereByStringKey("external_request_id");
        setTablesAndProjectionMapForRequests$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L85:
        setTablesAndProjectionMapForRequestRecipients(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L86:
        s.addWhereById("request_recipients._id");
        setTablesAndProjectionMapForRequestRecipients(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L87:
        s.addWhereByStringKey("request_id");
        setTablesAndProjectionMapForRequestRecipients(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L88:
        s.addWhereById("requests._id");
        sqlitequerybuilder.setTables("requests");
        continue; /* Loop/switch isn't completed */
_L89:
        setTablesAndProjectionMapForMatches$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L90:
        s.addWhereById("matches._id");
        setTablesAndProjectionMapForMatches$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L91:
        s.addWhereById("matches._id");
        sqlitequerybuilder.setTables("matches");
        continue; /* Loop/switch isn't completed */
_L92:
        s.addWhereByStringKey("external_match_id");
        setTablesAndProjectionMapForMatches$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L93:
        s.addWhereById("game_id");
        setTablesAndProjectionMapForMatches$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L94:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForMatches$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L95:
        setTablesAndProjectionMapForMatchesPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L96:
        s.addWhereById("matches_pending_ops._id");
        setTablesAndProjectionMapForMatchesPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L97:
        s.addWhereByStringKey("external_match_id");
        setTablesAndProjectionMapForMatchesPendingOps$269de591(sqlitequerybuilder);
        continue; /* Loop/switch isn't completed */
_L98:
        setTablesAndProjectionMapForParticipants(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L99:
        s.addWhereById("participants._id");
        setTablesAndProjectionMapForParticipants(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L100:
        s.addWhereByStringKey("external_participant_id");
        setTablesAndProjectionMapForParticipants(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L101:
        s.addWhereById("match_id");
        setTablesAndProjectionMapForParticipants(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L102:
        s.addWhereById("invitation_id");
        setTablesAndProjectionMapForParticipants(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L103:
        setTablesAndProjectionMapForQuests(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L104:
        s.addWhereById("quests._id");
        setTablesAndProjectionMapForQuests(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L105:
        s.addWhereByStringKey("game_id");
        setTablesAndProjectionMapForQuests(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L106:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForQuests(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L107:
        s.addWhereByStringKey("external_quest_id");
        setTablesAndProjectionMapForQuests(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L108:
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L109:
        s.addWhereById("quests._id");
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L110:
        s.addWhereByStringKey("external_quest_id");
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L111:
        s.addWhereByStringKey("game_id");
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L112:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L113:
        s.addWhereByStringKey("external_milestone_id");
        setTablesAndProjectionMapForQuestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L114:
        setTablesAndProjectionMapForQuestMilestones(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L115:
        s.addWhereById("milestones._id");
        setTablesAndProjectionMapForQuestMilestones(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L116:
        s.addWhereByStringKey("external_milestone_id");
        setTablesAndProjectionMapForQuestMilestones(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L117:
        s.addWhereByStringKey("quest_id");
        setTablesAndProjectionMapForQuestMilestones(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L118:
        s.addWhereByStringKey("external_quest_id");
        setTablesAndProjectionMapForQuestMilestones(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L119:
        setTablesAndProjectionMapForRequestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L120:
        s.addWhereById("requests._id");
        setTablesAndProjectionMapForRequestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L121:
        s.addWhereByStringKey("external_request_id");
        setTablesAndProjectionMapForRequestsEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L122:
        setTablesAndProjectionMapForMatchEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L123:
        s.addWhereById("matches._id");
        setTablesAndProjectionMapForMatchEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L124:
        s.addWhereByStringKey("external_match_id");
        setTablesAndProjectionMapForMatchEntities(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L125:
        setTablesAndProjectionMapForNotifications(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L126:
        s.addWhereById("notifications._id");
        setTablesAndProjectionMapForNotifications(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L127:
        s.addWhereById("game_id");
        setTablesAndProjectionMapForNotifications(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L128:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForNotifications(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L129:
        setTablesAndProjectionMapForSnapshots(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L130:
        s.addWhereById("snapshots._id");
        setTablesAndProjectionMapForSnapshots(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L131:
        s.addWhereByStringKey("external_snapshot_id");
        setTablesAndProjectionMapForSnapshots(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L132:
        s.addWhereById("game_id");
        setTablesAndProjectionMapForSnapshots(sqlitequerybuilder, uri);
        continue; /* Loop/switch isn't completed */
_L133:
        s.addWhereByStringKey("external_game_id");
        setTablesAndProjectionMapForSnapshots(sqlitequerybuilder, uri);
        if (true) goto _L141; else goto _L140
_L140:
    }

    public void shutdown()
    {
        mBackgroundHandler.getLooper().quit();
        mBackgroundThread = null;
        synchronized (CACHE_LIST_LOCK)
        {
            if (sCacheList != null)
            {
                sCacheList.clear();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int updateInTransaction(SQLiteDatabase sqlitedatabase, Uri uri, ContentValues contentvalues, String s, String as[])
    {
        GamesDataStore gamesdatastore = getDataStore$743ee347(uri);
        GamesDataStore.waitForAccess(gamesdatastore.mWriteAccessLatch);
        ImageStore imagestore = gamesdatastore.mImageStore;
        UriType uritype = matchUri(uri);
        switch (_cls3..SwitchMap.com.google.android.gms.games.provider.PlayGamesContentProvider.UriType[uritype.ordinal()])
        {
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 23: // '\027'
        case 29: // '\035'
        case 30: // '\036'
        case 35: // '#'
        case 36: // '$'
        case 39: // '\''
        case 41: // ')'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 63: // '?'
        case 66: // 'B'
        case 67: // 'C'
        case 70: // 'F'
        case 71: // 'G'
        case 76: // 'L'
        case 87: // 'W'
        case 90: // 'Z'
        case 93: // ']'
        case 102: // 'f'
        case 104: // 'h'
        case 105: // 'i'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 117: // 'u'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        case 123: // '{'
        case 127: // '\177'
        case 133: 
        case 134: 
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid update URI: ")).append(uri).append(" - ").append(uritype).toString());

        case 1: // '\001'
            Preconditions.checkNotNullIfPresent("external_game_id", contentvalues);
            handleGameImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("games", contentvalues, s, as);

        case 2: // '\002'
            Preconditions.checkNotNullIfPresent("external_game_id", contentvalues);
            handleGameImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "games", "_id", contentvalues);

        case 8: // '\b'
            Preconditions.checkNotNullIfPresent("external_game_id", contentvalues);
            handleGameImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "games", "external_game_id", contentvalues);

        case 9: // '\t'
            handleGameBadgeImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("game_badges", contentvalues, s, as);

        case 10: // '\n'
            handleGameBadgeImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "game_badges", "_id", contentvalues);

        case 11: // '\013'
            handleGameBadgeImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "game_badges", "badge_game_id", contentvalues);

        case 12: // '\f'
            handleGameBadgeImages(gamesdatastore, contentvalues);
            return updateByForeignExternalId(sqlitedatabase, uri.getLastPathSegment(), "game_badges", "badge_game_id", "games", "external_game_id", contentvalues);

        case 13: // '\r'
            return sqlitedatabase.update("game_instances", contentvalues, s, as);

        case 14: // '\016'
            return updateById(sqlitedatabase, uri, "game_instances", "_id", contentvalues);

        case 15: // '\017'
            return updateById(sqlitedatabase, uri, "game_instances", "instance_game_id", contentvalues);

        case 16: // '\020'
            return updateByForeignExternalId(sqlitedatabase, uri.getLastPathSegment(), "game_instances", "instance_game_id", "games", "external_game_id", contentvalues);

        case 17: // '\021'
            Preconditions.checkNotNullIfPresent("external_player_id", contentvalues);
            Preconditions.checkNotNullIfPresent("profile_name", contentvalues);
            handlePlayerImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("players", contentvalues, s, as);

        case 18: // '\022'
            Preconditions.checkNotNullIfPresent("external_player_id", contentvalues);
            Preconditions.checkNotNullIfPresent("profile_name", contentvalues);
            handlePlayerImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "players", "_id", contentvalues);

        case 20: // '\024'
            Preconditions.checkNotNull("level_value", contentvalues);
            return sqlitedatabase.update("player_levels", contentvalues, s, as);

        case 21: // '\025'
            Preconditions.checkNotNull("level_value", contentvalues);
            return updateById(sqlitedatabase, uri, "player_levels", "_id", contentvalues);

        case 22: // '\026'
            Preconditions.checkNotNull("level_value", contentvalues);
            return updateById(sqlitedatabase, uri, "player_levels", "level_value", contentvalues);

        case 24: // '\030'
            boolean flag;
            if (contentvalues.getAsLong("game_id").longValue() > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            if (contentvalues.getAsLong("player_id").longValue() > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            return sqlitedatabase.update("player_stats", contentvalues, s, as);

        case 19: // '\023'
            Preconditions.checkNotNullIfPresent("external_player_id", contentvalues);
            Preconditions.checkNotNullIfPresent("profile_name", contentvalues);
            handlePlayerImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "players", "external_player_id", contentvalues);

        case 25: // '\031'
            sqlitedatabase = gamesdatastore.getPrefs(getContext()).edit();
            uri = contentvalues.valueSet().iterator();
            do
            {
                if (uri.hasNext())
                {
                    contentvalues = (java.util.Map.Entry)uri.next();
                    s = (String)contentvalues.getKey();
                    as = ACCOUNT_METADATA_SPEC.getColumnDataType(s);
                    switch (_cls3..SwitchMap.com.google.android.gms.games.provider.ColumnSpec.DataType[as.ordinal()])
                    {
                    default:
                        throw new IllegalStateException("Unsupported metadata column type");

                    case 1: // '\001'
                        sqlitedatabase.putString(s, (String)contentvalues.getValue());
                        break;

                    case 2: // '\002'
                        sqlitedatabase.putLong(s, ((Long)contentvalues.getValue()).longValue());
                        break;
                    }
                } else
                {
                    SharedPreferencesCompat.apply(sqlitedatabase);
                    return 1;
                }
            } while (true);

        case 26: // '\032'
            Preconditions.checkNotNullIfPresent("external_achievement_id", contentvalues);
            handleAchievementImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("achievement_definitions", contentvalues, s, as);

        case 27: // '\033'
            Preconditions.checkNotNullIfPresent("external_achievement_id", contentvalues);
            handleAchievementImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "achievement_definitions", "_id", contentvalues);

        case 28: // '\034'
            Preconditions.checkNotNullIfPresent("external_achievement_id", contentvalues);
            handleAchievementImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "achievement_definitions", "external_achievement_id", contentvalues);

        case 31: // '\037'
            return sqlitedatabase.update("achievement_pending_ops", contentvalues, s, as);

        case 32: // ' '
            return updateById(sqlitedatabase, uri, "achievement_pending_ops", "_id", contentvalues);

        case 33: // '!'
            return sqlitedatabase.update("achievement_instances", contentvalues, s, as);

        case 34: // '"'
            return updateById(sqlitedatabase, uri, "achievement_instances", "_id", contentvalues);

        case 54: // '6'
            Preconditions.checkNotNull(contentvalues.get("package_name"));
            Preconditions.checkNotNull(contentvalues.get("package_uid"));
            Preconditions.checkNotNull(contentvalues.get("account_name"));
            return sqlitedatabase.update("client_contexts", contentvalues, s, as);

        case 55: // '7'
            Preconditions.checkNotNull(contentvalues.get("package_name"));
            Preconditions.checkNotNull(contentvalues.get("package_uid"));
            Preconditions.checkNotNull(contentvalues.get("account_name"));
            return updateById(sqlitedatabase, uri, "client_contexts", "_id", contentvalues);

        case 37: // '%'
            Preconditions.checkNotNullIfPresent("external_event_id", contentvalues);
            handleEventImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("event_definitions", contentvalues, s, as);

        case 38: // '&'
            Preconditions.checkNotNullIfPresent("external_event_id", contentvalues);
            handleEventImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "event_definitions", "_id", contentvalues);

        case 40: // '('
            Preconditions.checkNotNullIfPresent("external_event_id", contentvalues);
            handleEventImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "event_definitions", "external_event_id", contentvalues);

        case 42: // '*'
            return sqlitedatabase.update("event_instances", contentvalues, s, as);

        case 43: // '+'
            return updateById(sqlitedatabase, uri, "event_instances", "_id", contentvalues);

        case 47: // '/'
            return sqlitedatabase.update("event_pending_ops", contentvalues, s, as);

        case 48: // '0'
            return updateById(sqlitedatabase, uri, "event_pending_ops", "_id", contentvalues);

        case 56: // '8'
            Preconditions.checkNotNullIfPresent("external_experience_id", contentvalues);
            handleExperienceEventImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("experience_events", contentvalues, s, as);

        case 57: // '9'
            Preconditions.checkNotNullIfPresent("external_experience_id", contentvalues);
            handleExperienceEventImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "experience_events", "_id", contentvalues);

        case 58: // ':'
            Preconditions.checkNotNullIfPresent("external_experience_id", contentvalues);
            handleExperienceEventImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "experience_events", "external_experience_id", contentvalues);

        case 59: // ';'
            Preconditions.checkNotNullIfPresent("external_leaderboard_id", contentvalues);
            handleLeaderboardImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("leaderboards", contentvalues, s, as);

        case 60: // '<'
            Preconditions.checkNotNullIfPresent("external_leaderboard_id", contentvalues);
            handleLeaderboardImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "leaderboards", "_id", contentvalues);

        case 61: // '='
            Preconditions.checkNotNullIfPresent("external_leaderboard_id", contentvalues);
            handleLeaderboardImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "leaderboards", "external_leaderboard_id", contentvalues);

        case 62: // '>'
            Preconditions.checkNotNullIfPresent("external_leaderboard_id", contentvalues);
            handleLeaderboardImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "leaderboards", "game_id", contentvalues);

        case 64: // '@'
            return sqlitedatabase.update("leaderboard_instances", contentvalues, s, as);

        case 65: // 'A'
            return updateById(sqlitedatabase, uri, "leaderboard_instances", "_id", contentvalues);

        case 68: // 'D'
            handleLeaderboardScoreImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("leaderboard_scores", contentvalues, s, as);

        case 69: // 'E'
            handleLeaderboardScoreImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "leaderboard_scores", "_id", contentvalues);

        case 135: 
            return updateById(sqlitedatabase, uri, "leaderboard_pending_scores", "_id", contentvalues);

        case 72: // 'H'
            return updateImageData(imagestore, contentvalues.getAsLong("_id").longValue(), contentvalues);

        case 73: // 'I'
            return updateImageData(imagestore, ContentUris.parseId(uri), contentvalues);

        case 74: // 'J'
            Preconditions.checkNotNullIfPresent("external_invitation_id", contentvalues);
            return sqlitedatabase.update("invitations", contentvalues, s, as);

        case 75: // 'K'
            Preconditions.checkNotNullIfPresent("external_invitation_id", contentvalues);
            return updateById(sqlitedatabase, uri, "invitations", "_id", contentvalues);

        case 77: // 'M'
            Preconditions.checkNotNullIfPresent("external_invitation_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "invitations", "external_invitation_id", contentvalues);

        case 78: // 'N'
            return sqlitedatabase.update("request_pending_ops", contentvalues, s, as);

        case 79: // 'O'
            return updateById(sqlitedatabase, uri, "request_pending_ops", "_id", contentvalues);

        case 80: // 'P'
            Preconditions.checkNotNullIfPresent("external_request_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "request_pending_ops", "external_request_id", contentvalues);

        case 81: // 'Q'
            Preconditions.checkNotNullIfPresent("external_request_id", contentvalues);
            return sqlitedatabase.update("requests", contentvalues, s, as);

        case 82: // 'R'
            Preconditions.checkNotNullIfPresent("external_request_id", contentvalues);
            return updateById(sqlitedatabase, uri, "requests", "_id", contentvalues);

        case 83: // 'S'
            Preconditions.checkNotNullIfPresent("external_request_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "requests", "external_request_id", contentvalues);

        case 84: // 'T'
            Preconditions.checkNotNullIfPresent("player_id", contentvalues);
            Preconditions.checkNotNullIfPresent("request_id", contentvalues);
            return sqlitedatabase.update("request_recipients", contentvalues, s, as);

        case 85: // 'U'
            Preconditions.checkNotNullIfPresent("player_id", contentvalues);
            Preconditions.checkNotNullIfPresent("request_id", contentvalues);
            return updateById(sqlitedatabase, uri, "request_recipients", "_id", contentvalues);

        case 86: // 'V'
            Preconditions.checkNotNullIfPresent("request_id", contentvalues);
            Preconditions.checkNotNullIfPresent("player_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "request_recipients", "request_id", contentvalues);

        case 88: // 'X'
            Preconditions.checkNotNullIfPresent("external_match_id", contentvalues);
            return sqlitedatabase.update("matches", contentvalues, s, as);

        case 89: // 'Y'
            Preconditions.checkNotNullIfPresent("external_match_id", contentvalues);
            return updateById(sqlitedatabase, uri, "matches", "_id", contentvalues);

        case 91: // '['
            Preconditions.checkNotNullIfPresent("external_match_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "matches", "external_match_id", contentvalues);

        case 92: // '\\'
            Preconditions.checkNotNullIfPresent("external_match_id", contentvalues);
            return updateById(sqlitedatabase, uri, "matches", "game_id", contentvalues);

        case 94: // '^'
            if (contentvalues.containsKey("type"))
            {
                Preconditions.checkState(OfflineMatchAction.isValid(contentvalues.getAsInteger("type").intValue()));
            }
            return sqlitedatabase.update("matches_pending_ops", contentvalues, s, as);

        case 95: // '_'
            if (contentvalues.containsKey("type"))
            {
                Preconditions.checkState(OfflineMatchAction.isValid(contentvalues.getAsInteger("type").intValue()));
            }
            return updateById(sqlitedatabase, uri, "matches_pending_ops", "_id", contentvalues);

        case 96: // '`'
            if (contentvalues.containsKey("type"))
            {
                Preconditions.checkState(OfflineMatchAction.isValid(contentvalues.getAsInteger("type").intValue()));
            }
            return updateByStringId(sqlitedatabase, uri, "matches_pending_ops", "external_match_id", contentvalues);

        case 97: // 'a'
            handleParticipantImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("participants", contentvalues, s, as);

        case 98: // 'b'
            Preconditions.checkNotNullIfPresent("external_participant_id", contentvalues);
            handleParticipantImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "participants", "_id", contentvalues);

        case 99: // 'c'
            Preconditions.checkNotNullIfPresent("external_participant_id", contentvalues);
            handleParticipantImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "participants", "external_participant_id", contentvalues);

        case 100: // 'd'
            Preconditions.checkNotNullIfPresent("external_participant_id", contentvalues);
            handleParticipantImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "participants", "match_id", contentvalues);

        case 101: // 'e'
            Preconditions.checkNotNullIfPresent("external_participant_id", contentvalues);
            handleParticipantImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "participants", "invitation_id", contentvalues);

        case 124: // '|'
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_sub_id", contentvalues);
            Preconditions.checkNotNullIfPresent("type", contentvalues);
            return sqlitedatabase.update("notifications", contentvalues, s, as);

        case 125: // '}'
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_sub_id", contentvalues);
            Preconditions.checkNotNullIfPresent("type", contentvalues);
            return updateById(sqlitedatabase, uri, "notifications", "_id", contentvalues);

        case 126: // '~'
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_sub_id", contentvalues);
            Preconditions.checkNotNullIfPresent("type", contentvalues);
            return updateById(sqlitedatabase, uri, "notifications", "game_id", contentvalues);

        case 114: // 'r'
            Preconditions.checkNotNullIfPresent("external_milestone_id", contentvalues);
            Preconditions.checkNotNullIfPresent("milestones_sorting_rank", contentvalues);
            Preconditions.checkNotNullIfPresent("quest_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "milestones", "_id", contentvalues);

        case 115: // 's'
            Preconditions.checkNotNullIfPresent("external_milestone_id", contentvalues);
            Preconditions.checkNotNullIfPresent("milestones_sorting_rank", contentvalues);
            Preconditions.checkNotNullIfPresent("quest_id", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "milestones", "external_milestone_id", contentvalues);

        case 116: // 't'
            Preconditions.checkNotNullIfPresent("external_milestone_id", contentvalues);
            Preconditions.checkNotNullIfPresent("milestones_sorting_rank", contentvalues);
            Preconditions.checkNotNullIfPresent("quest_id", contentvalues);
            return sqlitedatabase.update("milestones", contentvalues, "quest_id=? AND external_milestone_id=?", new String[] {
                contentvalues.getAsString("quest_id"), contentvalues.getAsString("milestones_sorting_rank")
            });

        case 106: // 'j'
            Preconditions.checkNotNullIfPresent("external_quest_id", contentvalues);
            Preconditions.checkNotNullIfPresent("accepted_ts", contentvalues);
            Preconditions.checkNotNullIfPresent("notification_ts", contentvalues);
            return updateByStringId(sqlitedatabase, uri, "quests", "external_quest_id", contentvalues);

        case 103: // 'g'
            Preconditions.checkNotNullIfPresent("external_quest_id", contentvalues);
            Preconditions.checkNotNullIfPresent("accepted_ts", contentvalues);
            Preconditions.checkNotNullIfPresent("notification_ts", contentvalues);
            handleQuestImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "quests", "_id", contentvalues);

        case 128: 
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("owner_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_snapshot_id", contentvalues);
            handleSnapshotImages(gamesdatastore, contentvalues);
            return sqlitedatabase.update("snapshots", contentvalues, s, as);

        case 129: 
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("owner_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_snapshot_id", contentvalues);
            handleSnapshotImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "snapshots", "_id", contentvalues);

        case 130: 
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("owner_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_snapshot_id", contentvalues);
            handleSnapshotImages(gamesdatastore, contentvalues);
            return updateByStringId(sqlitedatabase, uri, "snapshots", "external_snapshot_id", contentvalues);

        case 131: 
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("owner_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_snapshot_id", contentvalues);
            handleSnapshotImages(gamesdatastore, contentvalues);
            return updateById(sqlitedatabase, uri, "snapshots", "game_id", contentvalues);

        case 132: 
            Preconditions.checkNotNullIfPresent("game_id", contentvalues);
            Preconditions.checkNotNullIfPresent("owner_id", contentvalues);
            Preconditions.checkNotNullIfPresent("external_snapshot_id", contentvalues);
            handleSnapshotImages(gamesdatastore, contentvalues);
            return updateByForeignExternalId(sqlitedatabase, uri.getLastPathSegment(), "snapshots", "game_id", "games", "external_game_id", contentvalues);
        }
    }

    static 
    {
        sUriMatcher = new UriMatcher(-1);
        UriType auritype[] = UriType.values();
        int j = auritype.length;
        for (int i = 0; i < j; i++)
        {
            UriType uritype = auritype[i];
            sUriMatcher.addURI("com.google.android.gms.games.background", uritype.mMatchPath, uritype.ordinal());
        }

        sPlayerLevelsProjectionMap = ProjectionMap.builder().add("_id").addAll(GamesContractInternal.PlayerLevels.ALL_COLUMNS).build();
        sPlayerStatsProjectionMap = ProjectionMap.builder().add("_id").addAll(GamesContractInternal.PlayerStats.ALL_COLUMNS).build();
        sAchievementPendingOpsProjectionMap = ProjectionMap.builder().add("_id", "achievement_pending_ops._id").addAll(GamesContractInternal.AchievementPendingOps.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        sRequestPendingOpsProjectionMap = ProjectionMap.builder().add("_id", "request_pending_ops._id").addAll(GamesContractInternal.RequestPendingOps.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        sApplicationSessionsProjectionMap = ProjectionMap.builder().add("_id", "application_sessions._id").addAll(GamesContractInternal.ApplicationSessions.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        sAppContentProjectionMap = ProjectionMap.builder().add("_id", "app_content._id").addAll(GamesContractInternal.AppContents.ALL_COLUMNS).build();
        sClientContextProjectionMap = ProjectionMap.builder().add("_id", "client_contexts._id").addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        sImagesProjectionMap = ProjectionMap.builder().add("_id", "images._id").addAll(GamesContractInternal.Images.ALL_COLUMNS).build();
        sLeaderboardPendingScoresProjectionMap = ProjectionMap.builder().add("_id", "leaderboard_pending_scores._id").addAll(GamesContractInternal.LeaderboardPendingScores.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        sRequestsProjectionMap = ProjectionMap.builder().add("_id", "requests._id").addAll(GamesContractInternal.Requests.ALL_COLUMNS).build();
        sMatchesProjectionMap = ProjectionMap.builder().add("_id", "matches._id").addAll(GamesContractInternal.Matches.ALL_COLUMNS).build();
        sMatchesPendingOpsProjectionMap = ProjectionMap.builder().add("_id", "matches_pending_ops._id").addAll(GamesContractInternal.MatchesPendingOps.ALL_COLUMNS).addAll(GamesContractInternal.ClientContexts.ALL_COLUMNS).build();
        ACCOUNT_METADATA_SPEC = ColumnSpec.builder().withColumn("account_name", ColumnSpec.DataType.STRING).withColumn("account_type", ColumnSpec.DataType.STRING).withColumn("external_player_id", ColumnSpec.DataType.STRING).withColumn("match_sync_token", ColumnSpec.DataType.STRING).withColumn("last_package_scan_timestamp", ColumnSpec.DataType.LONG).withColumn("quest_sync_token", ColumnSpec.DataType.STRING).withColumn("quest_sync_metadata_token", ColumnSpec.DataType.STRING).withColumn("request_sync_token", ColumnSpec.DataType.STRING).withColumn("xp_sync_token", ColumnSpec.DataType.STRING).withColumn("cover_photo_image_id", ColumnSpec.DataType.LONG).withColumn("cover_photo_image_uri", ColumnSpec.DataType.STRING).withColumn("cover_photo_image_url", ColumnSpec.DataType.STRING).build();
    }





}
