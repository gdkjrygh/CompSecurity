// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            x, k, al

class ry extends SQLiteOpenHelper
{

    final x a;

    private void a(SQLiteDatabase sqlitedatabase)
    {
        boolean flag1 = true;
        Set set = b(sqlitedatabase, "hits2");
        String as[] = new String[4];
        as[0] = "hit_id";
        as[1] = "hit_string";
        as[2] = "hit_time";
        as[3] = "hit_url";
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (!set.remove(s))
            {
                throw new SQLiteException((new StringBuilder()).append("Database hits2 is missing required column: ").append(s).toString());
            }
        }

        boolean flag;
        if (!set.remove("hit_app_id"))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!set.isEmpty())
        {
            throw new SQLiteException("Database hits2 has extra columns");
        }
        if (flag)
        {
            sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
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
        a.c("Error querying for table", s, sqliteexception);
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

    private Set b(SQLiteDatabase sqlitedatabase, String s)
    {
        HashSet hashset;
        hashset = new HashSet();
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" LIMIT 0").toString(), null);
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

    private void b(SQLiteDatabase sqlitedatabase)
    {
        int i = 0;
        sqlitedatabase = b(sqlitedatabase, "properties");
        String as[] = new String[6];
        as[0] = "app_uid";
        as[1] = "cid";
        as[2] = "tid";
        as[3] = "params";
        as[4] = "adid";
        as[5] = "hits_count";
        for (int j = as.length; i < j; i++)
        {
            String s = as[i];
            if (!sqlitedatabase.remove(s))
            {
                throw new SQLiteException((new StringBuilder()).append("Database properties is missing required column: ").append(s).toString());
            }
        }

        if (!sqlitedatabase.isEmpty())
        {
            throw new SQLiteException("Database properties table has extra columns");
        } else
        {
            return;
        }
    }

    public SQLiteDatabase getWritableDatabase()
    {
        if (!x.a(a).a(0x36ee80L))
        {
            throw new SQLiteException("Database open failed");
        }
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = super.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            x.a(a).a();
            a.f("Opening the database failed, dropping the table and recreating it");
            Object obj = x.b(a);
            a.o().getDatabasePath(((String) (obj))).delete();
            try
            {
                obj = super.getWritableDatabase();
                x.a(a).b();
            }
            catch (SQLiteException sqliteexception1)
            {
                a.e("Failed to open freshly created database", sqliteexception1);
                throw sqliteexception1;
            }
            return ((SQLiteDatabase) (obj));
        }
        return sqlitedatabase;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        al.a(sqlitedatabase.getPath());
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        if (android.os.d.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        if (!a(sqlitedatabase, "hits2"))
        {
            sqlitedatabase.execSQL(x.G());
        } else
        {
            a(sqlitedatabase);
        }
        if (!a(sqlitedatabase, "properties"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        } else
        {
            b(sqlitedatabase);
            return;
        }
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    ry(x x1, Context context, String s)
    {
        a = x1;
        super(context, s, null, 1);
    }
}
