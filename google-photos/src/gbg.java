// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;

public class gbg extends SQLiteOpenHelper
{

    private final noz a;
    private final Context b;
    private final obl c;

    public gbg(Context context)
    {
        super(context, "media_store_extras", null, 21);
        b = context;
        a = noz.a(context, "MediaStoreExtrDbHelp", new String[0]);
        c = (obl)olm.b(context, obl);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setWriteAheadLoggingEnabled(true);
        }
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        mvj.b(sqlitedatabase);
        for (Iterator iterator = olm.c(b, gbf).iterator(); iterator.hasNext(); a(sqlitedatabase, (gbf)iterator.next())) { }
    }

    private static void a(SQLiteDatabase sqlitedatabase, gbf gbf1)
    {
        sqlitedatabase.execSQL(gbf1.a());
        gbf1 = gbf1.b();
        if (gbf1 != null)
        {
            int j = gbf1.length;
            for (int i = 0; i < j; i++)
            {
                sqlitedatabase.execSQL(gbf1[i]);
            }

        }
    }

    public final Cursor a(String s, String s1)
    {
        return getReadableDatabase().query(s, null, "content_uri=?", new String[] {
            s1
        }, null, null, null, "1");
    }

    public final void a(String s, String s1, ContentValues contentvalues)
    {
        contentvalues.put("content_uri", s1);
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        if (sqlitedatabase.update(s, contentvalues, "content_uri=?", new String[] {
    s1
}) == 0)
        {
            sqlitedatabase.replace(s, null, contentvalues);
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = olm.c(b, gbf).iterator(); iterator.hasNext(); a(sqlitedatabase, (gbf)iterator.next())) { }
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            sqlitedatabase.enableWriteAheadLogging();
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 14)
        {
            try
            {
                a(sqlitedatabase);
                return;
            }
            catch (Throwable throwable)
            {
                (new obw("n/a", "media_store_extras", i, j, i)).b(b);
                if (c != null)
                {
                    c.a(throwable, "Database Upgrade Failures");
                }
                a(sqlitedatabase);
            }
            break MISSING_BLOCK_LABEL_207;
        }
        if (i >= 15)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        a(sqlitedatabase, (gbf)olm.a(b, gbb));
        if (i >= 16)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        sqlitedatabase.execSQL("DELETE FROM media_store_extra_fingerprint WHERE _id IN (SELECT _id FROM media_store_extra_fingerprint,(SELECT MAX(_id) max_id, content_uri max_content_uri FROM media_store_extra_fingerprint GROUP BY content_uri) WHERE _id < max_id AND content_uri = max_content_uri)");
        sqlitedatabase.execSQL("DROP INDEX media_store_extra_fingerprint_content_uri");
        sqlitedatabase.execSQL("CREATE UNIQUE INDEX media_store_extra_fingerprint_content_uri ON media_store_extra_fingerprint(content_uri)");
        if (i >= 17)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        sqlitedatabase.execSQL("DELETE FROM media_store_extra_photosphere WHERE _id IN (SELECT _id FROM media_store_extra_photosphere,(SELECT MAX(_id) AS max_id, content_uri AS max_content_uri FROM media_store_extra_photosphere GROUP BY content_uri) WHERE _id < max_id AND content_uri = max_content_uri)");
        sqlitedatabase.execSQL("DROP INDEX media_store_extra_photosphere_content_uri");
        sqlitedatabase.execSQL("CREATE UNIQUE INDEX media_store_extra_photosphere_content_uri ON media_store_extra_photosphere(content_uri)");
        sqlitedatabase.execSQL("DELETE FROM media_store_extra_animation WHERE _id IN (SELECT _id FROM media_store_extra_animation,(SELECT MAX(_id) AS max_id, content_uri AS max_content_uri FROM media_store_extra_animation GROUP BY content_uri) WHERE _id < max_id AND content_uri = max_content_uri)");
        sqlitedatabase.execSQL("DROP INDEX media_store_extra_animation_content_uri");
        sqlitedatabase.execSQL("CREATE UNIQUE INDEX media_store_extra_animation_content_uri ON media_store_extra_animation(content_uri)");
        if (i >= 18)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        sqlitedatabase.execSQL("CREATE TABLE media_store_extra_framerate (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, capture_frame_rate REAL, encoded_frame_rate REAL)");
        sqlitedatabase.execSQL("CREATE TABLE media_store_extra_video_dimension (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, width INTEGER, height INTEGER)");
        if (i >= 19)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        sqlitedatabase.execSQL("CREATE TABLE media_store_extra_slomo_transition (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, transition_data BLOB NOT NULL)");
        if (i >= 20)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        sqlitedatabase.execSQL("CREATE TABLE media_store_extra_deleted_media (_id INTEGER PRIMARY KEY AUTOINCREMENT, content_uri TEXT UNIQUE NOT NULL, deleted_by INTEGER NOT NULL, deleted_timestamp INTEGER NOT NULL )");
        if (i >= 21)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        sqlitedatabase.execSQL("DROP TABLE media_store_extra_deleted_media");
        sqlitedatabase.execSQL("CREATE TABLE media_store_extra_deleted_media (_id INTEGER PRIMARY KEY AUTOINCREMENT, local_dedup_key TEXT UNIQUE NOT NULL, deleted_timestamp INTEGER NOT NULL )");
        return;
    }
}
