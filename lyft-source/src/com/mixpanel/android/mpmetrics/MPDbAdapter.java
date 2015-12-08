// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MPDbAdapter
{

    private static final String a;
    private static final String b;
    private final MPDatabaseHelper c;

    public MPDbAdapter(Context context)
    {
        this(context, "mixpanel");
    }

    public MPDbAdapter(Context context, String s)
    {
        c = new MPDatabaseHelper(context, s);
    }

    static String b()
    {
        return a;
    }

    static String c()
    {
        return b;
    }

    public int a(JSONObject jsonobject, Table table)
    {
        JSONObject jsonobject1;
        Object obj;
        Object obj1;
        String s;
        int j;
        obj1 = null;
        obj = null;
        s = table.a();
        j = -1;
        jsonobject1 = obj;
        table = obj1;
        SQLiteDatabase sqlitedatabase = c.getWritableDatabase();
        jsonobject1 = obj;
        table = obj1;
        ContentValues contentvalues = new ContentValues();
        jsonobject1 = obj;
        table = obj1;
        contentvalues.put("data", jsonobject.toString());
        jsonobject1 = obj;
        table = obj1;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        jsonobject1 = obj;
        table = obj1;
        sqlitedatabase.insert(s, null, contentvalues);
        jsonobject1 = obj;
        table = obj1;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT COUNT(*) FROM ").append(s).toString(), null);
        jsonobject1 = jsonobject;
        table = jsonobject;
        jsonobject.moveToFirst();
        jsonobject1 = jsonobject;
        table = jsonobject;
        int i = jsonobject.getInt(0);
        c.close();
        j = i;
        if (jsonobject != null)
        {
            jsonobject.close();
            j = i;
        }
_L2:
        return j;
        jsonobject;
        table = jsonobject1;
        Log.e("MixpanelAPI", (new StringBuilder()).append("addJSON ").append(s).append(" FAILED. Deleting DB.").toString(), jsonobject);
        table = jsonobject1;
        c.a();
        c.close();
        if (jsonobject1 == null) goto _L2; else goto _L1
_L1:
        jsonobject1.close();
        return -1;
        jsonobject;
        c.close();
        if (table != null)
        {
            table.close();
        }
        throw jsonobject;
    }

    public void a()
    {
        c.a();
    }

    public void a(long l, Table table)
    {
        table = table.a();
        c.getWritableDatabase().delete(table, (new StringBuilder()).append("created_at <= ").append(l).toString(), null);
        c.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI", (new StringBuilder()).append("cleanupEvents ").append(table).append(" by time FAILED. Deleting DB.").toString(), sqliteexception);
        c.a();
        c.close();
        return;
        table;
        c.close();
        throw table;
    }

    public void a(String s, Table table)
    {
        table = table.a();
        c.getWritableDatabase().delete(table, (new StringBuilder()).append("_id <= ").append(s).toString(), null);
        c.close();
        return;
        s;
        Log.e("MixpanelAPI", (new StringBuilder()).append("cleanupEvents ").append(table).append(" by id FAILED. Deleting DB.").toString(), s);
        c.a();
        c.close();
        return;
        s;
        c.close();
        throw s;
    }

    public String[] a(Table table)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = table.a();
        String as[] = c.getReadableDatabase().rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" ORDER BY ").append("created_at").append(" ASC LIMIT 50").toString(), null);
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
        c.close();
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
        Log.e("MixpanelAPI", (new StringBuilder()).append("generateDataString ").append(s).toString(), table);
        c.close();
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
        c.close();
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

    static 
    {
        a = (new StringBuilder()).append("CREATE TABLE ").append(Table.a.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        b = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(Table.a.a()).append(" (").append("created_at").append(");").toString();
    }

    private class MPDatabaseHelper extends SQLiteOpenHelper
    {

        private final File a;

        public void a()
        {
            close();
            a.delete();
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(MPDbAdapter.b());
            sqlitedatabase.execSQL(MPDbAdapter.c());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(Table.a.a()).toString());
            sqlitedatabase.execSQL(MPDbAdapter.b());
            sqlitedatabase.execSQL(MPDbAdapter.c());
        }

        MPDatabaseHelper(Context context, String s)
        {
            super(context, s, null, 4);
            a = context.getDatabasePath(s);
        }
    }


    private class Table extends Enum
    {

        public static final Table a;
        private static final Table b[];
        private final String mTableName;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])b.clone();
        }

        public String a()
        {
            return mTableName;
        }

        static 
        {
            a = new Table("EVENTS", 0, "events");
            b = (new Table[] {
                a
            });
        }

        private Table(String s, int i, String s1)
        {
            super(s, i);
            mTableName = s1;
        }
    }

}
