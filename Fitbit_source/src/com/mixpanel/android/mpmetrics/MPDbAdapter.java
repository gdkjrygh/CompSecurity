// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            g

class MPDbAdapter
{
    public static final class Table extends Enum
    {

        public static final Table a;
        public static final Table b;
        private static final Table c[];
        private final String mTableName;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])c.clone();
        }

        public String a()
        {
            return mTableName;
        }

        static 
        {
            a = new Table("EVENTS", 0, "events");
            b = new Table("PEOPLE", 1, "people");
            c = (new Table[] {
                a, b
            });
        }

        private Table(String s, int i1, String s1)
        {
            super(s, i1);
            mTableName = s1;
        }
    }

    private static class a extends SQLiteOpenHelper
    {

        private final File a;
        private final g b;

        public void a()
        {
            close();
            a.delete();
        }

        public boolean b()
        {
            return !a.exists() || Math.max(a.getUsableSpace(), b.d()) >= a.length();
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            if (g.b)
            {
                Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            }
            sqlitedatabase.execSQL(MPDbAdapter.c());
            sqlitedatabase.execSQL(MPDbAdapter.d());
            sqlitedatabase.execSQL(MPDbAdapter.e());
            sqlitedatabase.execSQL(MPDbAdapter.f());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
            if (g.b)
            {
                Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            }
            sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(Table.a.a()).toString());
            sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(Table.b.a()).toString());
            sqlitedatabase.execSQL(MPDbAdapter.c());
            sqlitedatabase.execSQL(MPDbAdapter.d());
            sqlitedatabase.execSQL(MPDbAdapter.e());
            sqlitedatabase.execSQL(MPDbAdapter.f());
        }

        a(Context context, String s)
        {
            super(context, s, null, 4);
            a = context.getDatabasePath(s);
            b = com.mixpanel.android.mpmetrics.g.a(context);
        }
    }


    public static final String a = "data";
    public static final String b = "created_at";
    public static final int c = -1;
    public static final int d = -2;
    public static final int e = -3;
    private static final String f = "MixpanelAPI.Database";
    private static final String g = "mixpanel";
    private static final int h = 4;
    private static final String i;
    private static final String j;
    private static final String k;
    private static final String l;
    private final a m;

    public MPDbAdapter(Context context)
    {
        this(context, "mixpanel");
    }

    public MPDbAdapter(Context context, String s)
    {
        m = new a(context, s);
    }

    static String c()
    {
        return i;
    }

    static String d()
    {
        return j;
    }

    static String e()
    {
        return k;
    }

    static String f()
    {
        return l;
    }

    public int a(JSONObject jsonobject, Table table)
    {
        Object obj;
        Object obj1;
        String s;
        obj = null;
        obj1 = null;
        if (!b())
        {
            Log.e("MixpanelAPI.Database", "There is not enough space left on the device to store Mixpanel data, so data was discarded");
            return -2;
        }
        s = table.a();
        table = obj;
        SQLiteDatabase sqlitedatabase = m.getWritableDatabase();
        table = obj;
        ContentValues contentvalues = new ContentValues();
        table = obj;
        contentvalues.put("data", jsonobject.toString());
        table = obj;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        table = obj;
        sqlitedatabase.insert(s, null, contentvalues);
        table = obj;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT COUNT(*) FROM ").append(s).toString(), null);
        table = jsonobject;
        jsonobject.moveToFirst();
        table = jsonobject;
        int i1 = jsonobject.getInt(0);
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        m.close();
        return i1;
        SQLiteException sqliteexception;
        sqliteexception;
        jsonobject = null;
_L4:
        table = jsonobject;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not add Mixpanel data to table ").append(s).append(". Re-initializing database.").toString(), sqliteexception);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        table = jsonobject;
        jsonobject.close();
        jsonobject = obj1;
        table = jsonobject;
        m.a();
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        m.close();
        return -1;
        jsonobject;
_L2:
        if (table != null)
        {
            table.close();
        }
        m.close();
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        m.a();
    }

    public void a(long l1, Table table)
    {
        table = table.a();
        m.getWritableDatabase().delete(table, (new StringBuilder()).append("created_at <= ").append(l1).toString(), null);
        m.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not clean timed-out Mixpanel records from ").append(table).append(". Re-initializing database.").toString(), sqliteexception);
        m.a();
        m.close();
        return;
        table;
        m.close();
        throw table;
    }

    public void a(String s, Table table)
    {
        table = table.a();
        m.getWritableDatabase().delete(table, (new StringBuilder()).append("_id <= ").append(s).toString(), null);
        m.close();
        return;
        s;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not clean sent Mixpanel records from ").append(table).append(". Re-initializing database.").toString(), s);
        m.a();
        m.close();
        return;
        s;
        m.close();
        throw s;
    }

    public String[] a(Table table)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = table.a();
        String as[] = m.getReadableDatabase().rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" ORDER BY ").append("created_at").append(" ASC LIMIT 50").toString(), null);
        Object obj = as;
        Object obj2 = new JSONArray();
        table = null;
_L2:
        obj = as;
        if (!as.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = as;
        if (!as.isLast())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = as;
        table = as.getString(as.getColumnIndex("_id"));
        obj = as;
        ((JSONArray) (obj2)).put(new JSONObject(as.getString(as.getColumnIndex("data"))));
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj = as;
        if (((JSONArray) (obj2)).length() <= 0) goto _L4; else goto _L3
_L3:
        obj = as;
        obj2 = ((JSONArray) (obj2)).toString();
        obj = obj2;
_L10:
        m.close();
        if (as != null)
        {
            as.close();
        }
_L5:
        as = obj1;
        if (table != null)
        {
            as = obj1;
            if (obj != null)
            {
                as = new String[2];
                as[0] = table;
                as[1] = obj;
            }
        }
        return as;
        table;
        as = null;
_L8:
        obj = as;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not pull records for Mixpanel out of database ").append(s).append(". Waiting to send.").toString(), table);
        m.close();
        if (as != null)
        {
            as.close();
            table = null;
            obj = null;
        } else
        {
            table = null;
            obj = null;
        }
          goto _L5
        table;
        obj = null;
_L7:
        m.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw table;
        table;
        if (true) goto _L7; else goto _L6
_L6:
        table;
          goto _L8
_L4:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected boolean b()
    {
        return m.b();
    }

    static 
    {
        i = (new StringBuilder()).append("CREATE TABLE ").append(Table.a.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        j = (new StringBuilder()).append("CREATE TABLE ").append(Table.b.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        k = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(Table.a.a()).append(" (").append("created_at").append(");").toString();
        l = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(Table.b.a()).append(" (").append("created_at").append(");").toString();
    }
}
