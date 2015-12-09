// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.analytics.platforms.fitbit:
//            b

final class DbAdapter
{
    public static final class Table extends Enum
    {

        public static final Table a;
        private static final Table b[];
        private final String tableName;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/fitbit/analytics/platforms/fitbit/DbAdapter$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])b.clone();
        }

        public String a()
        {
            return tableName;
        }

        static 
        {
            a = new Table("INTERACTION", 0, "interaction");
            b = (new Table[] {
                a
            });
        }

        private Table(String s, int i, String s1)
        {
            super(s, i);
            tableName = s1;
        }
    }

    private static class a extends SQLiteOpenHelper
    {

        private final File a;

        public void a()
        {
            close();
            a.delete();
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            if (b.a)
            {
                Log.d("FitbitAnalytics", "Creating FitbitAnalytics database...");
            }
            sqlitedatabase.execSQL(DbAdapter.b());
            sqlitedatabase.execSQL(DbAdapter.c());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (b.a)
            {
                Log.d("FitbitAnalytics", "Upgrading FitbitAnalytics database...");
            }
            sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(Table.a.a()).toString());
            sqlitedatabase.execSQL(DbAdapter.b());
            sqlitedatabase.execSQL(DbAdapter.c());
        }

        a(Context context, String s)
        {
            super(context, s, null, 1);
            a = context.getDatabasePath(s);
        }
    }


    public static final String a = "data";
    public static final String b = "created_at";
    private static final String c = "FitbitAnalytics";
    private static final String d = "fitbit_analytics";
    private static final int e = 1;
    private static final String f;
    private static final String g;
    private final a h;

    public DbAdapter(Context context)
    {
        this(context, "fitbit_analytics");
    }

    public DbAdapter(Context context, String s)
    {
        h = new a(context, s);
    }

    static String b()
    {
        return f;
    }

    static String c()
    {
        return g;
    }

    public int a(String s)
    {
        Object obj;
        Object obj1;
        String s1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        s1 = Table.a.a();
        obj = obj1;
        SQLiteDatabase sqlitedatabase = h.getWritableDatabase();
        obj = obj1;
        ContentValues contentvalues = new ContentValues();
        obj = obj1;
        contentvalues.put("data", s);
        obj = obj1;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        obj = obj1;
        sqlitedatabase.insert(s1, null, contentvalues);
        obj = obj1;
        obj1 = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT COUNT(*) FROM ").append(s1).toString(), null);
        obj = obj1;
        obj1 = obj;
        ((Cursor) (obj)).moveToFirst();
        obj1 = obj;
        int i = ((Cursor) (obj)).getInt(0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        h.close();
        return i;
        SQLiteException sqliteexception;
        sqliteexception;
        obj = null;
_L3:
        obj1 = obj;
        Log.e("FitbitAnalytics", (new StringBuilder()).append("Unable to add interaction ").append(s).append(". Deleting database.").toString(), sqliteexception);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj1 = obj;
        ((Cursor) (obj)).close();
        s = obj2;
_L4:
        obj = s;
        h.a();
        if (s != null)
        {
            s.close();
        }
        h.close();
        return -1;
        s;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        h.close();
        throw s;
        s;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
          goto _L3
        s = ((String) (obj));
          goto _L4
    }

    public Pair a(Table table)
    {
        Object obj2;
        String s;
        obj2 = null;
        s = table.a();
        Object obj = h.getReadableDatabase().rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" ORDER BY ").append("_id").append(" ASC  LIMIT 10").toString(), null);
        table = ((Table) (obj));
        ArrayList arraylist = new ArrayList();
        Object obj1 = null;
_L2:
        table = ((Table) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        table = ((Table) (obj));
        if (!((Cursor) (obj)).isLast())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        table = ((Table) (obj));
        obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("_id"));
        table = ((Table) (obj));
        arraylist.add(((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data")));
        if (true) goto _L2; else goto _L1
        obj1;
_L8:
        table = ((Table) (obj));
        Log.e("FitbitAnalytics", (new StringBuilder()).append("Unable to get interactions from table ").append(s).toString(), ((Throwable) (obj1)));
        h.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            obj1 = null;
            table = null;
        } else
        {
            obj1 = null;
            table = null;
        }
_L4:
        obj = obj2;
        if (obj1 != null)
        {
            obj = obj2;
            if (table != null)
            {
                obj = Pair.create(Integer.valueOf(((String) (obj1))), table);
            }
        }
        return ((Pair) (obj));
_L1:
        h.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            table = arraylist;
        } else
        {
            table = arraylist;
        }
        if (true) goto _L4; else goto _L3
_L3:
        table;
        obj1 = null;
        obj = table;
_L6:
        h.close();
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = table;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a()
    {
        h.a();
    }

    public void a(long l, Table table)
    {
        table = table.a();
        h.getWritableDatabase().delete(table, (new StringBuilder()).append("created_at <= ").append(l).toString(), null);
        h.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("FitbitAnalytics", (new StringBuilder()).append("Unable to clean up interactions for time ").append(l).append(" and table ").append(table).append(". Deleting database.").toString(), sqliteexception);
        h.a();
        h.close();
        return;
        table;
        h.close();
        throw table;
    }

    public void a(String s, Table table)
    {
        table = table.a();
        h.getWritableDatabase().delete(table, (new StringBuilder()).append("_id = ").append(s).toString(), null);
        h.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("FitbitAnalytics", (new StringBuilder()).append("Unable to clean up interaction with id ").append(s).append(" and table ").append(table).append(". Deleting database.").toString(), sqliteexception);
        h.a();
        h.close();
        return;
        s;
        h.close();
        throw s;
    }

    static 
    {
        f = (new StringBuilder()).append("CREATE TABLE ").append(Table.a.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        g = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(Table.a.a()).append(" (").append("created_at").append(");").toString();
    }
}
