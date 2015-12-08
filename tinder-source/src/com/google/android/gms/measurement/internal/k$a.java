// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.ef;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            k, w, j, d

private final class  extends SQLiteOpenHelper
{

    final k a;

    private void a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2)
        throws SQLiteException
    {
        int i;
        if (!a(sqlitedatabase, s))
        {
            sqlitedatabase.execSQL(s1);
        }
        int l;
        try
        {
            sqlitedatabase = b(sqlitedatabase, s);
            s1 = s2.split(",");
            l = s1.length;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            a.l().a.a("Failed to verify columns on table that was just created", s);
            throw sqlitedatabase;
        }
        i = 0;
_L2:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1[i];
        if (!sqlitedatabase.remove(s2))
        {
            throw new SQLiteException((new StringBuilder("Database ")).append(s).append(" is missing required column: ").append(s2).toString());
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!sqlitedatabase.isEmpty())
        {
            throw new SQLiteException((new StringBuilder("Database ")).append(s).append(" table has extra columns").toString());
        } else
        {
            return;
        }
    }

    private boolean a(SQLiteDatabase sqlitedatabase, String s)
    {
        SQLiteDatabase sqlitedatabase1 = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s
        }, null, null, null);
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase = sqlitedatabase1;
        boolean flag = sqlitedatabase1.moveToFirst();
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        return flag;
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitedatabase1 = null;
_L4:
        sqlitedatabase = sqlitedatabase1;
        a.l().b.a("Error querying for table", s, sqliteexception);
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        return false;
        sqlitedatabase;
        s = sqlitedatabase1;
_L2:
        if (s != null)
        {
            s.close();
        }
        throw sqlitedatabase;
        Exception exception;
        exception;
        s = sqlitedatabase;
        sqlitedatabase = exception;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Set b(SQLiteDatabase sqlitedatabase, String s)
    {
        HashSet hashset;
        hashset = new HashSet();
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder("SELECT * FROM ")).append(s).append(" LIMIT 0").toString(), null);
        s = sqlitedatabase.getColumnNames();
        int i = 0;
_L2:
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(s[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return hashset;
        s;
        sqlitedatabase.close();
        throw s;
    }

    public final SQLiteDatabase getWritableDatabase()
    {
        d d1;
        boolean flag;
        flag = true;
        d1 = a.a;
        j.r();
        break MISSING_BLOCK_LABEL_14;
        if (d1.b != 0L && d1.a.b() - d1.b < 0x36ee80L)
        {
            flag = false;
        }
        if (!flag)
        {
            throw new SQLiteException("Database open failed");
        }
        break MISSING_BLOCK_LABEL_63;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = super.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            a.a.a();
            a.l().a.a("Opening the database failed, dropping and recreating it");
            Object obj = a.q();
            a.i().getDatabasePath(((String) (obj))).delete();
            try
            {
                obj = super.getWritableDatabase();
                a.a.b = 0L;
            }
            catch (SQLiteException sqliteexception1)
            {
                a.l().a.a("Failed to open freshly created database", sqliteexception1);
                throw sqliteexception1;
            }
            return ((SQLiteDatabase) (obj));
        }
        return sqlitedatabase;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (android.os.d.VERSION.SDK_INT >= 9)
        {
            sqlitedatabase = new File(sqlitedatabase.getPath());
            sqlitedatabase.setReadable(false, false);
            sqlitedatabase.setWritable(false, false);
            sqlitedatabase.setReadable(true, true);
            sqlitedatabase.setWritable(true, true);
        }
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        if (android.os.d.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        a(sqlitedatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp");
        a(sqlitedatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value");
        a(sqlitedatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp");
        a(sqlitedatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data");
        return;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int l)
    {
    }

    (k k1, Context context, String s)
    {
        a = k1;
        super(context, s, null, 1);
    }
}
