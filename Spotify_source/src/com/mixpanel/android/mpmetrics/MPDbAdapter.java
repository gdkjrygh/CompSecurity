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
import cxi;
import cxj;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MPDbAdapter
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    public final cxj a;

    public MPDbAdapter(Context context)
    {
        this(context, "mixpanel");
    }

    private MPDbAdapter(Context context, String s)
    {
        a = new cxj(context, s);
    }

    public static String a()
    {
        return b;
    }

    public static String b()
    {
        return c;
    }

    public static String c()
    {
        return d;
    }

    public static String d()
    {
        return e;
    }

    public final int a(JSONObject jsonobject, Table table)
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag = false;
        obj = null;
        obj1 = null;
        obj2 = a;
        if (!((cxj) (obj2)).a.exists() || Math.max(((cxj) (obj2)).a.getUsableSpace(), ((cxj) (obj2)).b.d) >= ((cxj) (obj2)).a.length())
        {
            flag = true;
        }
        if (!flag)
        {
            Log.e("MixpanelAPI.Database", "There is not enough space left on the device to store Mixpanel data, so data was discarded");
            return -2;
        }
        obj2 = table.mTableName;
        table = obj;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        table = obj;
        ContentValues contentvalues = new ContentValues();
        table = obj;
        contentvalues.put("data", jsonobject.toString());
        table = obj;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        table = obj;
        sqlitedatabase.insert(((String) (obj2)), null, contentvalues);
        table = obj;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder("SELECT COUNT(*) FROM ")).append(((String) (obj2))).toString(), null);
        table = jsonobject;
        jsonobject.moveToFirst();
        table = jsonobject;
        int i = jsonobject.getInt(0);
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        a.close();
        return i;
        SQLiteException sqliteexception;
        sqliteexception;
        jsonobject = null;
_L4:
        table = jsonobject;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not add Mixpanel data to table ")).append(((String) (obj2))).append(". Re-initializing database.").toString(), sqliteexception);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        table = jsonobject;
        jsonobject.close();
        jsonobject = obj1;
        table = jsonobject;
        a.a();
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        a.close();
        return -1;
        jsonobject;
_L2:
        if (table != null)
        {
            table.close();
        }
        a.close();
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(long l, Table table)
    {
        table = table.mTableName;
        a.getWritableDatabase().delete(table, (new StringBuilder("created_at <= ")).append(l).toString(), null);
        a.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not clean timed-out Mixpanel records from ")).append(table).append(". Re-initializing database.").toString(), sqliteexception);
        a.a();
        a.close();
        return;
        table;
        a.close();
        throw table;
    }

    public final String[] a(Table table)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = table.mTableName;
        String as[] = a.getReadableDatabase().rawQuery((new StringBuilder("SELECT * FROM ")).append(s).append(" ORDER BY created_at ASC LIMIT 50").toString(), null);
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
            break MISSING_BLOCK_LABEL_95;
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
        a.close();
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
        Log.e("MixpanelAPI.Database", (new StringBuilder("Could not pull records for Mixpanel out of database ")).append(s).append(". Waiting to send.").toString(), table);
        a.close();
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
        a.close();
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
        b = (new StringBuilder("CREATE TABLE ")).append(Table.a.mTableName).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);").toString();
        c = (new StringBuilder("CREATE TABLE ")).append(Table.b.mTableName).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);").toString();
        d = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(Table.a.mTableName).append(" (created_at);").toString();
        e = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(Table.b.mTableName).append(" (created_at);").toString();
    }

    private class Table extends Enum
    {

        public static final Table a;
        public static final Table b;
        private static final Table c[];
        public final String mTableName;

        public static Table valueOf(String s)
        {
            return (Table)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
        }

        public static Table[] values()
        {
            return (Table[])c.clone();
        }

        static 
        {
            a = new Table("EVENTS", 0, "events");
            b = new Table("PEOPLE", 1, "people");
            c = (new Table[] {
                a, b
            });
        }

        private Table(String s, int i, String s1)
        {
            super(s, i);
            mTableName = s1;
        }
    }

}
