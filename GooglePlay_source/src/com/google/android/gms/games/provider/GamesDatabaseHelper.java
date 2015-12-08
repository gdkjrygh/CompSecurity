// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesTableHelper, GamesDataStore, GamesSQLHelper

public final class GamesDatabaseHelper extends SQLiteOpenHelper
{
    static final class PreferenceHelper
        implements GamesSQLHelper
    {

        private final int mAction = 1;
        private final android.content.SharedPreferences.Editor mEditor;
        private final String mKey;

        public final void execute(SQLiteDatabase sqlitedatabase, int i)
        {
            mEditor.remove(mKey);
            SharedPreferencesCompat.apply(mEditor);
        }

        PreferenceHelper(android.content.SharedPreferences.Editor editor, String s)
        {
            mEditor = editor;
            mKey = s;
        }
    }


    static final int DATABASE_VERSION = 1701;
    static final int LAUNCH_VERSION = 196;
    private final ArrayList mAllTableBuilders = new ArrayList();
    private final Context mContext;
    private final ArrayList mLegacyIndexNames = new ArrayList();
    private final ArrayList mLegacyTableNames = new ArrayList();
    private final GamesDataStore mParent;
    final TreeMap mVersionToMigrationsMap = new TreeMap();

    public GamesDatabaseHelper(GamesDataStore gamesdatastore, Context context, String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = String.format("games_%s.db", new Object[] {
                s
            });
        }
        super(context, s, null, 1701);
        mParent = gamesdatastore;
        mContext = context;
    }

    private void addColumnMigration(GamesTableHelper gamestablehelper, String s, int i)
    {
        int j = gamestablehelper.version(gamestablehelper.mMapVersionToColumns, gamestablehelper.mColumnNames.indexOf(s), i);
        addMigration(new GamesTableHelper.StatementHelper(String.format("ALTER TABLE %s ADD %s;", new Object[] {
            gamestablehelper.mTable, gamestablehelper.mColumnStatements.get(j)
        })), i);
    }

    private void addIndexMigration(GamesTableHelper gamestablehelper, String s, int i)
    {
        s = String.format("CREATE INDEX %s ON %s (%s);", new Object[] {
            GamesTableHelper.Builder.generateIndexName(gamestablehelper.mTable, s), gamestablehelper.mTable, s
        });
        int j = gamestablehelper.version(gamestablehelper.mMapVersionToIndexes, gamestablehelper.mIndexStatements.indexOf(s), i);
        addMigration(new GamesTableHelper.StatementHelper((String)gamestablehelper.mIndexStatements.get(j)), i);
    }

    private void addMigration(GamesSQLHelper gamessqlhelper, int i)
    {
        ArrayList arraylist1 = (ArrayList)mVersionToMigrationsMap.get(Integer.valueOf(i));
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            mVersionToMigrationsMap.put(Integer.valueOf(i), arraylist);
        }
        arraylist.add(gamessqlhelper);
    }

    private void addTableMigration(GamesSQLHelper gamessqlhelper, int i)
    {
        addMigration(gamessqlhelper, i);
    }

    private void clearDatabase(SQLiteDatabase sqlitedatabase)
    {
        initBuilders();
        int i = 0;
        for (int j = mAllTableBuilders.size(); i < j; i++)
        {
            ((GamesTableHelper)mAllTableBuilders.get(i)).drop(sqlitedatabase);
        }

        i = 0;
        for (int k = mLegacyTableNames.size(); i < k; i++)
        {
            sqlitedatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", new Object[] {
                mLegacyTableNames.get(i)
            }));
        }

        i = 0;
        for (int l = mLegacyIndexNames.size(); i < l; i++)
        {
            sqlitedatabase.execSQL(String.format("DROP INDEX IF EXISTS %s;", new Object[] {
                mLegacyIndexNames.get(i)
            }));
        }

    }

    private void initBuilders()
    {
        if (mAllTableBuilders.size() > 0)
        {
            GamesLog.d("GamesDatabaseHelper", "Builders already initialized.");
            return;
        } else
        {
            GamesLog.d("GamesDatabaseHelper", "Initializing builders.");
            Object obj = (new GamesTableHelper.Builder("images")).primaryKey("_id").col("url", ColumnSpec.DataType.STRING).col("local", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("filesize", ColumnSpec.DataType.INTEGER).col("download_timestamp", ColumnSpec.DataType.INTEGER).build();
            mAllTableBuilders.add(obj);
            obj = (new GamesTableHelper.Builder("players")).primaryKey("_id").col("external_player_id", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("profile_name", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("profile_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("profile_hi_res_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("last_updated", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("is_in_circles", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("current_xp_total", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("current_level", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("current_level_min_xp", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("current_level_max_xp", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("next_level", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("next_level_max_xp", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("last_level_up_timestamp", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("player_title", ColumnSpec.DataType.STRING).col("has_all_public_acls", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(1).col("has_debug_access", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("is_profile_visible", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(1).col("most_recent_activity_timestamp", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(-1).col("most_recent_external_game_id", ColumnSpec.DataType.STRING).col("most_recent_game_name", ColumnSpec.DataType.STRING).col("most_recent_game_icon_id", ColumnSpec.DataType.INTEGER).refCol("images").col("most_recent_game_hi_res_id", ColumnSpec.DataType.INTEGER).refCol("images").col("most_recent_game_featured_id", ColumnSpec.DataType.INTEGER).refCol("images").col("gamer_tag", ColumnSpec.DataType.STRING).col("real_name", ColumnSpec.DataType.STRING).col("banner_image_landscape_id", ColumnSpec.DataType.INTEGER).refCol("images").col("banner_image_portrait_id", ColumnSpec.DataType.INTEGER).refCol("images").index("external_player_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "is_in_circles", 403);
            addColumnMigration(((GamesTableHelper) (obj)), "current_xp_total", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "current_level", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "current_level_min_xp", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "current_level_max_xp", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "next_level", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "next_level_max_xp", 701);
            addColumnMigration(((GamesTableHelper) (obj)), "last_level_up_timestamp", 702);
            addColumnMigration(((GamesTableHelper) (obj)), "player_title", 708);
            addColumnMigration(((GamesTableHelper) (obj)), "most_recent_external_game_id", 713);
            addColumnMigration(((GamesTableHelper) (obj)), "most_recent_game_name", 713);
            addColumnMigration(((GamesTableHelper) (obj)), "most_recent_game_icon_id", 713);
            addColumnMigration(((GamesTableHelper) (obj)), "most_recent_game_hi_res_id", 713);
            addColumnMigration(((GamesTableHelper) (obj)), "most_recent_game_featured_id", 713);
            addColumnMigration(((GamesTableHelper) (obj)), "has_all_public_acls", 720);
            addColumnMigration(((GamesTableHelper) (obj)), "is_profile_visible", 804);
            addColumnMigration(((GamesTableHelper) (obj)), "has_debug_access", 1101);
            addColumnMigration(((GamesTableHelper) (obj)), "gamer_tag", 1600);
            addColumnMigration(((GamesTableHelper) (obj)), "real_name", 1600);
            addColumnMigration(((GamesTableHelper) (obj)), "banner_image_landscape_id", 1701);
            addColumnMigration(((GamesTableHelper) (obj)), "banner_image_portrait_id", 1701);
            obj = (new GamesTableHelper.Builder("games")).primaryKey("_id").col("external_game_id", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("display_name", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("primary_category", ColumnSpec.DataType.STRING).col("secondary_category", ColumnSpec.DataType.STRING).col("developer_name", ColumnSpec.DataType.STRING).col("game_description", ColumnSpec.DataType.STRING).col("game_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("game_hi_res_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("featured_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("screenshot_image_ids", ColumnSpec.DataType.STRING).col("video_url", ColumnSpec.DataType.STRING).col("play_enabled_game", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("last_played_server_time", ColumnSpec.DataType.INTEGER).col("last_connection_local_time", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("last_synced_local_time", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("metadata_version", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("sync_token", ColumnSpec.DataType.STRING).col("metadata_sync_requested", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("target_instance", ColumnSpec.DataType.INTEGER).refCol("game_instances").col("gameplay_acl_status", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(1).col("availability", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(1).col("owned", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("achievement_total_count", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("leaderboard_count", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("price_micros", ColumnSpec.DataType.INTEGER).col("formatted_price", ColumnSpec.DataType.STRING).col("full_price_micros", ColumnSpec.DataType.INTEGER).col("formatted_full_price", ColumnSpec.DataType.STRING).col("muted", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("identity_sharing_confirmed", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("snapshots_enabled", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(1).col("theme_color", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue("000000").index("external_game_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "muted", 505);
            addColumnMigration(((GamesTableHelper) (obj)), "identity_sharing_confirmed", 601);
            addColumnMigration(((GamesTableHelper) (obj)), "snapshots_enabled", 718);
            addColumnMigration(((GamesTableHelper) (obj)), "theme_color", 802);
            addMigration(((GamesSQLHelper) (obj)), 802);
            addMigration(((GamesSQLHelper) (obj)), 805);
            addColumnMigration(((GamesTableHelper) (obj)), "sync_token", 903);
            addColumnMigration(((GamesTableHelper) (obj)), "screenshot_image_ids", 1301);
            addColumnMigration(((GamesTableHelper) (obj)), "video_url", 1301);
            obj = (new GamesTableHelper.Builder("game_badges")).primaryKey("_id").col("badge_game_id", ColumnSpec.DataType.INTEGER).refCol("games");
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("badge_type", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("badge_title", ColumnSpec.DataType.STRING);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("badge_description", ColumnSpec.DataType.STRING).col("badge_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").index("badge_game_id").build();
            mAllTableBuilders.add(obj);
            obj = (new GamesTableHelper.Builder("game_instances")).primaryKey("_id").col("instance_game_id", ColumnSpec.DataType.INTEGER).refCol("games");
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("real_time_support", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("turn_based_support", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).defaultValue(0).col("platform_type", ColumnSpec.DataType.INTEGER);
            ((GamesTableHelper.Builder) (obj)).appendToLastColumn("NOT NULL");
            obj = ((GamesTableHelper.Builder) (obj)).col("instance_display_name", ColumnSpec.DataType.STRING).notNull().col("package_name", ColumnSpec.DataType.STRING).col("piracy_check", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("installed", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("preferred", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("gamepad_support", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).index("instance_game_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "preferred", version(100, 98));
            addColumnMigration(((GamesTableHelper) (obj)), "gamepad_support", version(1100, 3));
            obj = (new GamesTableHelper.Builder("client_contexts")).primaryKey("_id").col("package_name", ColumnSpec.DataType.STRING).notNull().col("package_uid", ColumnSpec.DataType.INTEGER).notNull().col("account_name", ColumnSpec.DataType.STRING).notNull().build();
            mAllTableBuilders.add(obj);
            obj = (new GamesTableHelper.Builder("achievement_definitions")).primaryKey("_id").col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_achievement_id", ColumnSpec.DataType.STRING).notNull().col("type", ColumnSpec.DataType.INTEGER).notNull().col("name", ColumnSpec.DataType.STRING).notNull().col("description", ColumnSpec.DataType.STRING).col("unlocked_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("revealed_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("total_steps", ColumnSpec.DataType.INTEGER).col("formatted_total_steps", ColumnSpec.DataType.STRING).col("initial_state", ColumnSpec.DataType.INTEGER).notNull().col("sorting_rank", ColumnSpec.DataType.INTEGER).notNull().col("definition_xp_value", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).index("game_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "definition_xp_value", version(700, 4));
            obj = (new GamesTableHelper.Builder("achievement_pending_ops")).primaryKey("_id").col("client_context_id", ColumnSpec.DataType.INTEGER).refCol("client_contexts").notNull().col("external_achievement_id", ColumnSpec.DataType.STRING).notNull().col("achievement_type", ColumnSpec.DataType.INTEGER).notNull().col("new_state", ColumnSpec.DataType.INTEGER).col("steps_to_increment", ColumnSpec.DataType.INTEGER).col("min_steps_to_set", ColumnSpec.DataType.INTEGER).col("external_game_id", ColumnSpec.DataType.STRING).col("external_player_id", ColumnSpec.DataType.STRING).index("client_context_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "min_steps_to_set", version(200, 2));
            addColumnMigration(((GamesTableHelper) (obj)), "external_game_id", version(300, 6));
            addColumnMigration(((GamesTableHelper) (obj)), "external_player_id", version(300, 6));
            addIndexMigration(((GamesTableHelper) (obj)), "client_context_id", version(700, 5));
            obj = (new GamesTableHelper.Builder("achievement_instances")).primaryKey("_id").col("definition_id", ColumnSpec.DataType.INTEGER).refCol("achievement_definitions").notNull().col("player_id", ColumnSpec.DataType.INTEGER).refCol("players").notNull().col("state", ColumnSpec.DataType.INTEGER).notNull().col("current_steps", ColumnSpec.DataType.INTEGER).col("formatted_current_steps", ColumnSpec.DataType.STRING).col("last_updated_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("instance_xp_value", ColumnSpec.DataType.INTEGER).index("definition_id").index("player_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "instance_xp_value", version(700, 4));
            obj = (new GamesTableHelper.Builder("invitations")).primaryKey("_id").col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_invitation_id", ColumnSpec.DataType.STRING).notNull().col("external_inviter_id", ColumnSpec.DataType.STRING).notNull().col("creation_timestamp", ColumnSpec.DataType.INTEGER).notNull().col("last_modified_timestamp", ColumnSpec.DataType.INTEGER).notNull().col("description", ColumnSpec.DataType.STRING).col("type", ColumnSpec.DataType.INTEGER).notNull().col("variant", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("has_automatch_criteria", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("automatch_min_players", ColumnSpec.DataType.INTEGER).col("automatch_max_players", ColumnSpec.DataType.INTEGER).col("inviter_in_circles", ColumnSpec.DataType.INTEGER).notNull().defaultValue(1).index("external_invitation_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "variant", version(100, 97));
            addColumnMigration(((GamesTableHelper) (obj)), "automatch_max_players", version(400, 6));
            addColumnMigration(((GamesTableHelper) (obj)), "automatch_min_players", version(400, 6));
            addColumnMigration(((GamesTableHelper) (obj)), "has_automatch_criteria", version(400, 6));
            addColumnMigration(((GamesTableHelper) (obj)), "inviter_in_circles", version(500, 1));
            addIndexMigration(((GamesTableHelper) (obj)), "external_invitation_id", version(700, 5));
            obj = (new GamesTableHelper.Builder("leaderboards")).primaryKey("_id").col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_leaderboard_id", ColumnSpec.DataType.STRING).notNull().col("name", ColumnSpec.DataType.STRING).notNull().col("board_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("sorting_rank", ColumnSpec.DataType.INTEGER).col("score_order", ColumnSpec.DataType.INTEGER).notNull().index("game_id,external_leaderboard_id").build();
            mAllTableBuilders.add(obj);
            addIndexMigration(((GamesTableHelper) (obj)), "game_id,external_leaderboard_id", version(700, 5));
            obj = (new GamesTableHelper.Builder("leaderboard_instances")).primaryKey("_id").col("leaderboard_id", ColumnSpec.DataType.INTEGER).refCol("leaderboards").notNull().col("timespan", ColumnSpec.DataType.INTEGER).notNull().col("collection", ColumnSpec.DataType.INTEGER).notNull().col("player_raw_score", ColumnSpec.DataType.INTEGER).col("player_display_score", ColumnSpec.DataType.STRING).col("player_rank", ColumnSpec.DataType.INTEGER).col("player_display_rank", ColumnSpec.DataType.STRING).col("player_score_tag", ColumnSpec.DataType.STRING).col("total_scores", ColumnSpec.DataType.INTEGER).col("top_page_token_next", ColumnSpec.DataType.STRING).col("window_page_token_prev", ColumnSpec.DataType.STRING).col("window_page_token_next", ColumnSpec.DataType.STRING).index("leaderboard_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "player_score_tag", version(200, 1));
            obj = (new GamesTableHelper.Builder("leaderboard_scores")).primaryKey("_id").col("instance_id", ColumnSpec.DataType.INTEGER).refCol("leaderboard_instances").notNull().col("page_type", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("player_id", ColumnSpec.DataType.INTEGER).refCol("players").col("default_display_name", ColumnSpec.DataType.STRING).col("default_display_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("rank", ColumnSpec.DataType.INTEGER).notNull().col("display_rank", ColumnSpec.DataType.STRING).notNull().col("raw_score", ColumnSpec.DataType.INTEGER).notNull().col("display_score", ColumnSpec.DataType.STRING).notNull().col("achieved_timestamp", ColumnSpec.DataType.INTEGER).notNull().col("score_tag", ColumnSpec.DataType.STRING).index("instance_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "score_tag", version(200, 1));
            obj = (new GamesTableHelper.Builder("leaderboard_pending_scores")).primaryKey("_id").col("client_context_id", ColumnSpec.DataType.INTEGER).refCol("client_contexts").notNull().col("external_game_id", ColumnSpec.DataType.STRING).notNull().col("external_leaderboard_id", ColumnSpec.DataType.STRING).notNull().col("external_player_id", ColumnSpec.DataType.STRING).notNull().col("raw_score", ColumnSpec.DataType.INTEGER).notNull().col("achieved_timestamp", ColumnSpec.DataType.INTEGER).notNull().col("score_tag", ColumnSpec.DataType.STRING).col("signature", ColumnSpec.DataType.STRING).notNull().defaultValue("").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "score_tag", version(200, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "signature", version(800, 5));
            obj = (new GamesTableHelper.Builder("matches")).primaryKey("_id").col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_match_id", ColumnSpec.DataType.STRING).notNull().col("creator_external", ColumnSpec.DataType.STRING).notNull().col("creation_timestamp", ColumnSpec.DataType.INTEGER).notNull().col("last_updater_external", ColumnSpec.DataType.STRING).col("last_updated_timestamp", ColumnSpec.DataType.INTEGER).col("pending_participant_external", ColumnSpec.DataType.STRING).col("data", ColumnSpec.DataType.BLOB).col("status", ColumnSpec.DataType.INTEGER).notNull().col("description", ColumnSpec.DataType.STRING).col("version", ColumnSpec.DataType.INTEGER).notNull().col("variant", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("notification_text", ColumnSpec.DataType.STRING).col("user_match_status", ColumnSpec.DataType.INTEGER).notNull().col("has_automatch_criteria", ColumnSpec.DataType.INTEGER).notNull().col("automatch_min_players", ColumnSpec.DataType.INTEGER).col("automatch_max_players", ColumnSpec.DataType.INTEGER).col("automatch_bit_mask", ColumnSpec.DataType.INTEGER).col("automatch_wait_estimate_sec", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("rematch_id", ColumnSpec.DataType.STRING).col("match_number", ColumnSpec.DataType.INTEGER).notNull().defaultValue(1).col("previous_match_data", ColumnSpec.DataType.BLOB).col("upsync_required", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("description_participant_id", ColumnSpec.DataType.STRING).index("external_match_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "automatch_wait_estimate_sec", 300);
            addColumnMigration(((GamesTableHelper) (obj)), "rematch_id", version(300, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "match_number", version(300, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "previous_match_data", version(300, 1));
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 3));
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 5));
            addColumnMigration(((GamesTableHelper) (obj)), "description_participant_id", version(500, 4));
            obj = (new GamesTableHelper.Builder("matches_pending_ops")).primaryKey("_id").col("client_context_id", ColumnSpec.DataType.INTEGER).refCol("client_contexts").notNull().col("type", ColumnSpec.DataType.INTEGER).notNull().col("external_game_id", ColumnSpec.DataType.STRING).notNull().col("external_match_id", ColumnSpec.DataType.STRING).col("pending_participant_id", ColumnSpec.DataType.STRING).col("version", ColumnSpec.DataType.INTEGER).col("is_turn", ColumnSpec.DataType.INTEGER).col("results", ColumnSpec.DataType.STRING).index("client_context_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 4));
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 5));
            obj = (new GamesTableHelper.Builder("notifications")).primaryKey("_id").col("notification_id", ColumnSpec.DataType.STRING).col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_sub_id", ColumnSpec.DataType.STRING).notNull().col("type", ColumnSpec.DataType.INTEGER).notNull().col("image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("ticker", ColumnSpec.DataType.STRING).col("title", ColumnSpec.DataType.STRING).col("text", ColumnSpec.DataType.STRING).col("coalesced_text", ColumnSpec.DataType.STRING).col("timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("acknowledged", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("alert_level", ColumnSpec.DataType.INTEGER).notNull().defaultValue(1).build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(500, 3));
            addColumnMigration(((GamesTableHelper) (obj)), "notification_id", 200);
            addColumnMigration(((GamesTableHelper) (obj)), "coalesced_text", version(300, 7));
            addColumnMigration(((GamesTableHelper) (obj)), "timestamp", version(300, 7));
            addColumnMigration(((GamesTableHelper) (obj)), "alert_level", version(500, 2));
            obj = (new GamesTableHelper.Builder("participants")).primaryKey("_id").col("match_id", ColumnSpec.DataType.INTEGER).refCol("matches").col("invitation_id", ColumnSpec.DataType.INTEGER).refCol("invitations").col("external_participant_id", ColumnSpec.DataType.STRING).notNull().col("player_id", ColumnSpec.DataType.INTEGER).refCol("players").col("default_display_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("default_display_hi_res_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("default_display_name", ColumnSpec.DataType.STRING).col("player_status", ColumnSpec.DataType.INTEGER).notNull().col("client_address", ColumnSpec.DataType.STRING).col("result_type", ColumnSpec.DataType.INTEGER).col("placing", ColumnSpec.DataType.INTEGER).col("connected", ColumnSpec.DataType.INTEGER).col("capabilities", ColumnSpec.DataType.INTEGER).index("match_id").index("invitation_id").index("player_id").build();
            mAllTableBuilders.add(obj);
            addColumnMigration(((GamesTableHelper) (obj)), "capabilities", version(100, 99));
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 3));
            addTableMigration(((GamesSQLHelper) (obj)), version(300, 5));
            addColumnMigration(((GamesTableHelper) (obj)), "default_display_hi_res_image_id", 400);
            obj = (new GamesTableHelper.Builder("requests")).primaryKey("_id").col("external_request_id", ColumnSpec.DataType.STRING).notNull().col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("sender_id", ColumnSpec.DataType.INTEGER).refCol("players").notNull().col("data", ColumnSpec.DataType.BLOB).col("type", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("creation_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("expiration_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("status", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).index("sender_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), 500);
            obj = (new GamesTableHelper.Builder("request_recipients")).primaryKey("_id").col("request_id", ColumnSpec.DataType.INTEGER).refCol("requests").notNull().col("player_id", ColumnSpec.DataType.INTEGER).refCol("players").notNull().col("recipient_status", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).index("request_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), 500);
            addIndexMigration(((GamesTableHelper) (obj)), "request_id", version(700, 5));
            obj = (new GamesTableHelper.Builder("application_sessions")).primaryKey("_id").col("session_id", ColumnSpec.DataType.STRING).notNull().col("external_game_id", ColumnSpec.DataType.STRING).notNull().col("start_time", ColumnSpec.DataType.INTEGER).notNull().col("end_time", ColumnSpec.DataType.INTEGER).notNull().col("client_context_id", ColumnSpec.DataType.INTEGER).refCol("client_contexts").notNull().col("ad_id", ColumnSpec.DataType.STRING).col("limit_ad_tracking", ColumnSpec.DataType.BOOLEAN).notNull().defaultValue(0).index("client_context_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), 600);
            addColumnMigration(((GamesTableHelper) (obj)), "ad_id", version(900, 2));
            addColumnMigration(((GamesTableHelper) (obj)), "limit_ad_tracking", version(900, 2));
            obj = (new GamesTableHelper.Builder("event_definitions")).primaryKey("_id").col("event_definitions_game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("external_event_id", ColumnSpec.DataType.STRING).notNull().col("name", ColumnSpec.DataType.STRING).notNull().col("description", ColumnSpec.DataType.STRING).col("icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("sorting_rank", ColumnSpec.DataType.INTEGER).col("visibility", ColumnSpec.DataType.INTEGER).index("event_definitions_game_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 9));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 17));
            obj = (new GamesTableHelper.Builder("event_pending_ops")).primaryKey("_id").col("instance_id", ColumnSpec.DataType.INTEGER).refCol("event_instances").col("client_context_id", ColumnSpec.DataType.INTEGER).refCol("client_contexts").notNull().col("window_start_time", ColumnSpec.DataType.INTEGER).notNull().col("window_end_time", ColumnSpec.DataType.INTEGER).notNull().col("increment", ColumnSpec.DataType.INTEGER).col("request_id", ColumnSpec.DataType.INTEGER).defaultValue(0).index("window_start_time").index("window_end_time").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 9));
            obj = (new GamesTableHelper.Builder("event_instances")).primaryKey("_id").col("definition_id", ColumnSpec.DataType.INTEGER).refCol("event_definitions").notNull().col("player_id", ColumnSpec.DataType.INTEGER).refCol("players").notNull().col("value", ColumnSpec.DataType.INTEGER).col("formatted_value", ColumnSpec.DataType.STRING).col("last_updated_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).index("definition_id").index("player_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 9));
            obj = (new GamesTableHelper.Builder("quests")).primaryKey("_id").col("accepted_ts", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("quest_banner_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("quest_description", ColumnSpec.DataType.STRING).notNull().col("quest_end_ts", ColumnSpec.DataType.INTEGER).notNull().col("external_quest_id", ColumnSpec.DataType.STRING).notNull().col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("quest_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("quest_last_updated_ts", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("quest_name", ColumnSpec.DataType.STRING).notNull().col("notified", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("notification_ts", ColumnSpec.DataType.INTEGER).notNull().col("quest_start_ts", ColumnSpec.DataType.INTEGER).notNull().col("quest_state", ColumnSpec.DataType.INTEGER).notNull().col("quest_type", ColumnSpec.DataType.INTEGER).notNull().index("game_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 3));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 6));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 7));
            obj = (new GamesTableHelper.Builder("milestones")).primaryKey("_id").col("completion_reward_data", ColumnSpec.DataType.BLOB).col("current_value", ColumnSpec.DataType.INTEGER).col("external_milestone_id", ColumnSpec.DataType.STRING).notNull().col("event_instance_id", ColumnSpec.DataType.INTEGER).refCol("event_instances").notNull().col("initial_value", ColumnSpec.DataType.INTEGER).notNull().col("quest_id", ColumnSpec.DataType.INTEGER).refCol("quests").notNull().col("milestones_sorting_rank", ColumnSpec.DataType.INTEGER).notNull().col("milestone_state", ColumnSpec.DataType.INTEGER).notNull().col("target_value", ColumnSpec.DataType.INTEGER).notNull().index("quest_id").build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 3));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 6));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 14));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 15));
            addColumnMigration(((GamesTableHelper) (obj)), "current_value", version(1400, 2));
            obj = (new GamesTableHelper.Builder("snapshots")).primaryKey("_id").col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("owner_id", ColumnSpec.DataType.INTEGER).refCol("players").notNull().col("external_snapshot_id", ColumnSpec.DataType.STRING).notNull().col("drive_resolved_id_string", ColumnSpec.DataType.STRING).col("drive_resource_id_string", ColumnSpec.DataType.STRING).col("cover_icon_image_id", ColumnSpec.DataType.INTEGER).refCol("images").col("title", ColumnSpec.DataType.STRING).col("description", ColumnSpec.DataType.STRING).col("last_modified_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("duration", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("cover_icon_image_height", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("cover_icon_image_width", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("unique_name", ColumnSpec.DataType.STRING).notNull().col("visible", ColumnSpec.DataType.INTEGER).notNull().defaultValue(1).col("pending_change_count", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("progress_value", ColumnSpec.DataType.LONG).notNull().defaultValue(-1).col("device_name", ColumnSpec.DataType.STRING).build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 5));
            addColumnMigration(((GamesTableHelper) (obj)), "cover_icon_image_height", version(700, 9));
            addColumnMigration(((GamesTableHelper) (obj)), "cover_icon_image_width", version(700, 9));
            addColumnMigration(((GamesTableHelper) (obj)), "drive_resolved_id_string", version(700, 10));
            addColumnMigration(((GamesTableHelper) (obj)), "drive_resource_id_string", version(700, 10));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 10));
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 16));
            addColumnMigration(((GamesTableHelper) (obj)), "visible", version(700, 19));
            addColumnMigration(((GamesTableHelper) (obj)), "pending_change_count", version(900, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "progress_value", version(1000, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "device_name", version(1400, 3));
            obj = (new GamesTableHelper.Builder("experience_events")).primaryKey("_id").col("external_experience_id", ColumnSpec.DataType.STRING).notNull().col("game_id", ColumnSpec.DataType.INTEGER).refCol("games").notNull().col("created_timestamp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("display_title", ColumnSpec.DataType.STRING).notNull().col("display_description", ColumnSpec.DataType.STRING).notNull().col("display_string", ColumnSpec.DataType.STRING).notNull().col("icon_id", ColumnSpec.DataType.INTEGER).refCol("images").col("type", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("current_xp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("xp_earned", ColumnSpec.DataType.INTEGER).notNull().defaultValue(0).col("newLevel", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 11));
            addColumnMigration(((GamesTableHelper) (obj)), "newLevel", version(800, 1));
            addTableMigration(((GamesSQLHelper) (obj)), version(800, 2));
            addTableMigration(((GamesSQLHelper) (obj)), version(800, 3));
            obj = (new GamesTableHelper.Builder("player_levels")).primaryKey("_id").col("level_value", ColumnSpec.DataType.INTEGER).notNull().col("level_min_xp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("level_max_xp", ColumnSpec.DataType.INTEGER).notNull().defaultValue(-1).col("version", ColumnSpec.DataType.INTEGER).notNull().build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(700, 12));
            obj = (new GamesTableHelper.Builder("request_pending_ops")).primaryKey("_id").col("external_request_id", ColumnSpec.DataType.STRING).notNull().col("external_game_id", ColumnSpec.DataType.STRING).notNull().col("client_context_id", ColumnSpec.DataType.INTEGER).notNull().build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(800, 0));
            obj = (new GamesTableHelper.Builder("app_content")).primaryKey("_id").col("experiments", ColumnSpec.DataType.STRING).col("json", ColumnSpec.DataType.BLOB).notNull().col("page_token", ColumnSpec.DataType.STRING).col("screen_name", ColumnSpec.DataType.STRING).notNull().col("server_cookie", ColumnSpec.DataType.BLOB).build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(1000, 2));
            addColumnMigration(((GamesTableHelper) (obj)), "server_cookie", version(1100, 2));
            obj = (new GamesTableHelper.Builder("player_stats")).primaryKey("_id").col("churn_probability", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("days_since_last_played", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("game_id", ColumnSpec.DataType.INTEGER).col("player_id", ColumnSpec.DataType.INTEGER).col("num_purchases", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("num_sessions", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("num_sessions_percentile", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("ave_session_length_minutes", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("spend_percentile", ColumnSpec.DataType.INTEGER).defaultValue(-1).col("unknown_raw_keys", ColumnSpec.DataType.STRING).col("unknown_raw_values", ColumnSpec.DataType.STRING).build();
            mAllTableBuilders.add(obj);
            addTableMigration(((GamesSQLHelper) (obj)), version(1400, 1));
            addColumnMigration(((GamesTableHelper) (obj)), "unknown_raw_keys", version(1700, 0));
            addColumnMigration(((GamesTableHelper) (obj)), "unknown_raw_values", version(1700, 0));
            obj = mParent.getPrefs(mContext).edit();
            mLegacyTableNames.add("featured_games");
            addMigration(new GamesTableHelper.PurgeHelper("matches"), version(500, 4));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "match_sync_token"), version(500, 4));
            addMigration(new GamesTableHelper.PurgeHelper("requests"), version(500, 6));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "request_sync_token"), version(500, 6));
            addMigration(new GamesTableHelper.PurgeHelper("quests"), version(700, 9));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "quest_sync_token"), version(700, 9));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "quest_sync_metadata_token"), version(700, 9));
            addMigration(new GamesTableHelper.PurgeHelper("experience_events"), version(700, 11));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "xp_sync_token"), version(700, 11));
            addMigration(new GamesTableHelper.PurgeHelper("experience_events"), version(800, 2));
            addMigration(new PreferenceHelper(((android.content.SharedPreferences.Editor) (obj)), "xp_sync_token"), version(800, 2));
            mLegacyIndexNames.add("event_pending_ops_window_start_time_INDEX");
            mLegacyIndexNames.add("event_pending_ops_window_end_time_INDEX");
            mLegacyIndexNames.add("leaderboards_game_id_index");
            mLegacyIndexNames.add("matches_pending_op_client_contexts_id_index");
            mLegacyIndexNames.add("invitations_external_id_index");
            mLegacyIndexNames.add("requests_participants_request_id_index");
            mLegacyIndexNames.add("achievement_pending_op_client_contexts_id_index");
            mLegacyIndexNames.add("application_sessions_external_game_id_index");
            mLegacyIndexNames.add("milestones_player_id_index");
            return;
        }
    }

    private void purgeBuilders()
    {
        mLegacyTableNames.clear();
        mLegacyIndexNames.clear();
        mAllTableBuilders.clear();
        mVersionToMigrationsMap.clear();
    }

    private static int version(int i, int j)
    {
        return i + j;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        GamesLog.i("GamesDatabaseHelper", (new StringBuilder("Bootstrapping database version: 1701")).toString());
        initBuilders();
        int j = mAllTableBuilders.size();
        for (int i = 0; i < j; i++)
        {
            ((GamesTableHelper)mAllTableBuilders.get(i)).execute(sqlitedatabase, 1701);
        }

        purgeBuilders();
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        GamesLog.i("GamesDatabaseHelper", (new StringBuilder("Downgrading from version ")).append(i).append(" to ").append(j).toString());
        initBuilders();
        clearDatabase(sqlitedatabase);
        onCreate(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        initBuilders();
        if (i < 196 || j >= 1800 || i > j)
        {
            GamesLog.i("GamesDatabaseHelper", (new StringBuilder("Upgrading from version ")).append(i).append(" to ").append(j).append(", all data will be wiped!").toString());
            clearDatabase(sqlitedatabase);
            onCreate(sqlitedatabase);
            return;
        }
        GamesLog.i("GamesDatabaseHelper", (new StringBuilder("Upgrading from version ")).append(i).append(" to ").append(j).toString());
        for (Iterator iterator = mVersionToMigrationsMap.subMap(Integer.valueOf(i), false, Integer.valueOf(j), true).keySet().iterator(); iterator.hasNext();)
        {
            j = ((Integer)iterator.next()).intValue();
            ArrayList arraylist = (ArrayList)mVersionToMigrationsMap.get(Integer.valueOf(j));
            i = 0;
            int k = arraylist.size();
            while (i < k) 
            {
                ((GamesSQLHelper)arraylist.get(i)).execute(sqlitedatabase, j);
                i++;
            }
        }

        purgeBuilders();
    }

}
