// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.storage:
//            Table, SchemaMigrationHelper

public class DatabaseManager extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "SoundCloud";
    public static final int DATABASE_VERSION = 59;
    static final String TAG = "DatabaseManager";
    private static DatabaseManager instance;

    public DatabaseManager(Context context)
    {
        super(context, "SoundCloud", null, 59);
    }

    public static DatabaseManager getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new DatabaseManager(context);
        }
        return instance;
    }

    private static void handleUpgradeException(SQLException sqlexception, int i, int j)
    {
        ErrorUtils.handleSilentException(String.format(Locale.US, "error during upgrade%d (from %d)", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }), sqlexception);
    }

    private static void migratePolicies(SQLiteDatabase sqlitedatabase)
    {
        java.util.List list = Arrays.asList(new String[] {
            "_id", "monetizable", "policy"
        });
        java.util.List list1 = Arrays.asList(new String[] {
            "track_id", "monetizable", "policy"
        });
        SchemaMigrationHelper.migrate(sqlitedatabase, Table.TrackPolicies.name(), list1, Table.Sounds.name(), list);
    }

    private static boolean upgradeTo36(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS TrackDownloads (_id INTEGER PRIMARY KEY,requested_at INTEGER DEFAULT CURRENT_TIMESTAMP,downloaded_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,unavailable_at INTEGER DEFAULT NULL);");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 36);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo37(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.alterColumns(Table.PlaylistTracks, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 37);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo38(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.create(Table.Posts, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 38);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo39(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS OfflineContent (_id INTEGER,_type INTEGER,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));");
            SchemaMigrationHelper.create(Table.TrackPolicies, sqlitedatabase);
            migratePolicies(sqlitedatabase);
            SchemaMigrationHelper.alterColumns(Table.Sounds, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundView, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundAssociationView, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.PlaylistTracksView, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundStreamView, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.ActivityView, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 39);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo40(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.recreate(Table.Posts, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 40);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo41(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.recreate(Table.PromotedTracks, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundStreamView, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 41);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo42(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.recreate(Table.SoundStreamView, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 42);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo43(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.alterColumns(Table.PromotedTracks, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 43);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo44(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.alterColumns(Table.TrackPolicies, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundView, sqlitedatabase);
            SchemaMigrationHelper.recreate(Table.SoundStreamView, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 44);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo45(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.create(Table.Waveforms, sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 45);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo46(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Recommendations (_id INTEGER PRIMARY KEY,seed_id INTEGER, recommended_sound_id INTEGER,recommended_sound_type INTEGER,FOREIGN KEY(seed_id) REFERENCES RecommendationSeeds(_id) FOREIGN KEY(recommended_sound_id, recommended_sound_type) REFERENCES Sounds(_id, _type));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS RecommendationSeeds (_id INTEGER PRIMARY KEY,seed_sound_id INTEGER, seed_sound_type INTEGER, recommendation_reason INTEGER, FOREIGN KEY(seed_sound_id, seed_sound_type) REFERENCES Sounds(_id, _type));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 46);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo47(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.alterColumns(Tables.PlayQueue.TABLE.name(), "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));", sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 47);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo48(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.PlayQueue.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 48);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo49(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 49);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo50(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.Stations.TABLE.name(), sqlitedatabase);
            SchemaMigrationHelper.dropTable(Tables.StationsPlayQueues.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS RecentStations (station_urn TEXT,position INTEGER NOT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 50);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo51(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.PlayQueue.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 51);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo52(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.StationsPlayQueues.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 52);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo53(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.Stations.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 53);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo54(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(LegacyTables.RecentStations.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS RecentStations (station_urn TEXT,position INTEGER NOT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 54);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo55(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(LegacyTables.RecentStations.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsCollections (station_urn TEXT NOT NULL,collection_type INTEGER NOT NULL,position INTEGER,updated_locally_at INTEGER,PRIMARY KEY(station_urn, collection_type) ON CONFLICT IGNORE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 55);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo56(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.StationsPlayQueues.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 56);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo57(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.dropTable(Tables.Stations.TABLE.name(), sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 57);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo58(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE VIEW IF NOT EXISTS Shortcuts AS SELECT 'like' AS kind, Sounds._id AS _id, Sounds._type AS _type, title AS display_text FROM Likes INNER JOIN Sounds ON Likes._id = Sounds._id AND Likes._type = Sounds._type UNION SELECT 'following' AS kind, Users._id, 0 AS _type, username AS text from UserAssociations INNER JOIN Users ON UserAssociations.target_id = Users._id");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 58);
            return false;
        }
        return true;
    }

    private static boolean upgradeTo59(SQLiteDatabase sqlitedatabase, int i)
    {
        try
        {
            SchemaMigrationHelper.alterColumns(Tables.Comments.TABLE.name(), "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body TEXT);", sqlitedatabase);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            handleUpgradeException(sqlitedatabase, i, 59);
            return false;
        }
        return true;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        (new StringBuilder("onCreate(")).append(sqlitedatabase).append(")");
        Table atable[];
        int i;
        int j;
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Recommendations (_id INTEGER PRIMARY KEY,seed_id INTEGER, recommended_sound_id INTEGER,recommended_sound_type INTEGER,FOREIGN KEY(seed_id) REFERENCES RecommendationSeeds(_id) FOREIGN KEY(recommended_sound_id, recommended_sound_type) REFERENCES Sounds(_id, _type));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS RecommendationSeeds (_id INTEGER PRIMARY KEY,seed_sound_id INTEGER, seed_sound_type INTEGER, recommendation_reason INTEGER, FOREIGN KEY(seed_sound_id, seed_sound_type) REFERENCES Sounds(_id, _type));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS RecentStations (station_urn TEXT,position INTEGER NOT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS TrackDownloads (_id INTEGER PRIMARY KEY,requested_at INTEGER DEFAULT CURRENT_TIMESTAMP,downloaded_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,unavailable_at INTEGER DEFAULT NULL);");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS OfflineContent (_id INTEGER,_type INTEGER,PRIMARY KEY (_id, _type),FOREIGN KEY(_id, _type) REFERENCES Sounds(_id, _type));");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS StationsCollections (station_urn TEXT NOT NULL,collection_type INTEGER NOT NULL,position INTEGER,updated_locally_at INTEGER,PRIMARY KEY(station_urn, collection_type) ON CONFLICT IGNORE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));");
            atable = Table.values();
            j = atable.length;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw new RuntimeException(sqlitedatabase);
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        SchemaMigrationHelper.create(atable[i], sqlitedatabase);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_83;
_L1:
        sqlitedatabase.execSQL("CREATE VIEW IF NOT EXISTS Shortcuts AS SELECT 'like' AS kind, Sounds._id AS _id, Sounds._type AS _type, title AS display_text FROM Likes INNER JOIN Sounds ON Likes._id = Sounds._id AND Likes._type = Sounds._type UNION SELECT 'following' AS kind, Users._id, 0 AS _type, username AS text from UserAssociations INNER JOIN Users ON UserAssociations.target_id = Users._id");
        return;
    }

    public void onRecreateDb(SQLiteDatabase sqlitedatabase)
    {
        (new StringBuilder("onRecreate(")).append(sqlitedatabase).append(")");
        SchemaMigrationHelper.dropTable(Tables.Recommendations.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.RecommendationSeeds.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.PlayQueue.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.Stations.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.StationsPlayQueues.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.StationsCollections.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.TrackDownloads.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(Tables.OfflineContent.TABLE.name(), sqlitedatabase);
        SchemaMigrationHelper.dropTable(LegacyTables.RecentStations.TABLE.name(), sqlitedatabase);
        Table atable[] = Table.values();
        int j = atable.length;
        for (int i = 0; i < j; i++)
        {
            SchemaMigrationHelper.drop(atable[i], sqlitedatabase);
        }

        onCreate(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        (new StringBuilder("Upgrading database from version ")).append(i).append(" to ").append(j);
        if (j <= i) goto _L2; else goto _L1
_L1:
        boolean flag;
        boolean flag1;
        sqlitedatabase.beginTransaction();
        flag1 = false;
        flag = false;
        if (i < 35) goto _L4; else goto _L3
_L3:
        int k = i;
_L32:
        flag1 = flag;
        if (k >= j) goto _L4; else goto _L5
_L5:
        k + 1;
        JVM INSTR tableswitch 36 59: default 172
    //                   36 190
    //                   37 200
    //                   38 210
    //                   39 220
    //                   40 230
    //                   41 240
    //                   42 250
    //                   43 260
    //                   44 270
    //                   45 280
    //                   46 290
    //                   47 300
    //                   48 310
    //                   49 320
    //                   50 330
    //                   51 340
    //                   52 350
    //                   53 360
    //                   54 370
    //                   55 380
    //                   56 390
    //                   57 400
    //                   58 410
    //                   59 420;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L6:
        flag1 = flag;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k++;
        continue; /* Loop/switch isn't completed */
_L7:
        flag = upgradeTo36(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L8:
        flag = upgradeTo37(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L9:
        flag = upgradeTo38(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L10:
        flag = upgradeTo39(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L11:
        flag = upgradeTo40(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L12:
        flag = upgradeTo41(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L13:
        flag = upgradeTo42(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L14:
        flag = upgradeTo43(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L15:
        flag = upgradeTo44(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L16:
        flag = upgradeTo45(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L17:
        flag = upgradeTo46(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L18:
        flag = upgradeTo47(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L19:
        flag = upgradeTo48(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L20:
        flag = upgradeTo49(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L21:
        flag = upgradeTo50(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L22:
        flag = upgradeTo51(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L23:
        flag = upgradeTo52(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L24:
        flag = upgradeTo53(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L25:
        flag = upgradeTo54(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L26:
        flag = upgradeTo55(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L27:
        flag = upgradeTo56(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L28:
        flag = upgradeTo57(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L29:
        flag = upgradeTo58(sqlitedatabase, i);
        continue; /* Loop/switch isn't completed */
_L30:
        flag = upgradeTo59(sqlitedatabase, i);
        if (true) goto _L6; else goto _L4
_L4:
        if (!flag1)
        {
            onRecreateDb(sqlitedatabase);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
_L2:
        onRecreateDb(sqlitedatabase);
        return;
        if (true) goto _L32; else goto _L31
_L31:
    }
}
