// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class jru extends SQLiteOpenHelper
{

    private jrt a;

    jru(jrt jrt1, Context context, String s)
    {
        a = jrt1;
        super(context, s, null, 1);
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        int i = 0;
        sqlitedatabase = b(sqlitedatabase, "properties");
        for (; i < 6; i++)
        {
            String s = (new String[] {
                "app_uid", "cid", "tid", "params", "adid", "hits_count"
            })[i];
            if (!sqlitedatabase.remove(s))
            {
                throw new SQLiteException((new StringBuilder("Database properties is missing required column: ")).append(s).toString());
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
        if (!jrt.a(a).a(0x36ee80L))
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
            jrt.a(a).a();
            a.f("Opening the database failed, dropping the table and recreating it");
            Object obj = jrt.b(a);
            a.h().getDatabasePath(((String) (obj))).delete();
            try
            {
                obj = super.getWritableDatabase();
                jrt.a(a).a = 0L;
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

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.getPath();
        if (b.o() < 9)
        {
            return;
        } else
        {
            sqlitedatabase = new File(sqlitedatabase);
            sqlitedatabase.setReadable(false, false);
            sqlitedatabase.setWritable(false, false);
            sqlitedatabase.setReadable(true, true);
            sqlitedatabase.setWritable(true, true);
            return;
        }
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        boolean flag1;
        flag1 = true;
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        if (!a(sqlitedatabase, "hits2"))
        {
            sqlitedatabase.execSQL(jrt.o());
        } else
        {
            Set set = b(sqlitedatabase, "hits2");
            for (int i = 0; i < 4; i++)
            {
                String s = (new String[] {
                    "hit_id", "hit_string", "hit_time", "hit_url"
                })[i];
                if (!set.remove(s))
                {
                    throw new SQLiteException((new StringBuilder("Database hits2 is missing required column: ")).append(s).toString());
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
        if (!a(sqlitedatabase, "properties"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        } else
        {
            a(sqlitedatabase);
            return;
        }
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
