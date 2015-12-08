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
//            t

final class u
{
    private static final class a extends SQLiteOpenHelper
    {

        private final File a;

        public final void a()
        {
            close();
            a.delete();
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            boolean flag = t.a;
            sqlitedatabase.execSQL(u.b());
            sqlitedatabase.execSQL(u.c());
            sqlitedatabase.execSQL(u.d());
            sqlitedatabase.execSQL(u.e());
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            boolean flag = t.a;
            sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(b.a.a()).toString());
            sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(b.b.a()).toString());
            sqlitedatabase.execSQL(u.b());
            sqlitedatabase.execSQL(u.c());
            sqlitedatabase.execSQL(u.d());
            sqlitedatabase.execSQL(u.e());
        }

        a(Context context, String s)
        {
            super(context, s, null, 4);
            a = context.getDatabasePath(s);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b d[];
        private final String c;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/mixpanel/android/mpmetrics/u$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        public final String a()
        {
            return c;
        }

        static 
        {
            a = new b("EVENTS", 0, "events");
            b = new b("PEOPLE", 1, "people");
            d = (new b[] {
                a, b
            });
        }

        private b(String s, int i, String s1)
        {
            super(s, i);
            c = s1;
        }
    }


    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private final a e;

    public u(Context context)
    {
        this(context, "mixpanel");
    }

    private u(Context context, String s)
    {
        e = new a(context, s);
    }

    static String b()
    {
        return a;
    }

    static String c()
    {
        return b;
    }

    static String d()
    {
        return c;
    }

    static String e()
    {
        return d;
    }

    public final int a(JSONObject jsonobject, b b1)
    {
        Object obj;
        Object obj1;
        String s;
        obj = null;
        obj1 = null;
        s = b1.a();
        b1 = obj;
        SQLiteDatabase sqlitedatabase = e.getWritableDatabase();
        b1 = obj;
        ContentValues contentvalues = new ContentValues();
        b1 = obj;
        contentvalues.put("data", jsonobject.toString());
        b1 = obj;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        b1 = obj;
        sqlitedatabase.insert(s, null, contentvalues);
        b1 = obj;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder("SELECT COUNT(*) FROM ")).append(s).toString(), null);
        b1 = jsonobject;
        jsonobject.moveToFirst();
        b1 = jsonobject;
        int i = jsonobject.getInt(0);
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        e.close();
        return i;
        SQLiteException sqliteexception;
        sqliteexception;
        jsonobject = null;
_L4:
        b1 = jsonobject;
        Log.e("MixpanelAPI", (new StringBuilder("addJSON ")).append(s).append(" FAILED. Deleting DB.").toString(), sqliteexception);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        b1 = jsonobject;
        jsonobject.close();
        jsonobject = obj1;
        b1 = jsonobject;
        e.a();
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        e.close();
        return -1;
        jsonobject;
_L2:
        if (b1 != null)
        {
            b1.close();
        }
        e.close();
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        e.a();
    }

    public final void a(long l, b b1)
    {
        b1 = b1.a();
        e.getWritableDatabase().delete(b1, (new StringBuilder("created_at <= ")).append(l).toString(), null);
        e.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI", (new StringBuilder("cleanupEvents ")).append(b1).append(" by time FAILED. Deleting DB.").toString(), sqliteexception);
        e.a();
        e.close();
        return;
        b1;
        e.close();
        throw b1;
    }

    public final void a(String s, b b1)
    {
        b1 = b1.a();
        e.getWritableDatabase().delete(b1, (new StringBuilder("_id <= ")).append(s).toString(), null);
        e.close();
        return;
        s;
        Log.e("MixpanelAPI", (new StringBuilder("cleanupEvents ")).append(b1).append(" by id FAILED. Deleting DB.").toString(), s);
        e.a();
        e.close();
        return;
        s;
        e.close();
        throw s;
    }

    public final String[] a(b b1)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = b1.a();
        String as[] = e.getReadableDatabase().rawQuery((new StringBuilder("SELECT * FROM ")).append(s).append(" ORDER BY created_at ASC LIMIT 50").toString(), null);
        Object obj = as;
        Object obj2 = new JSONArray();
        b1 = null;
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
        b1 = as.getString(as.getColumnIndex("_id"));
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
        e.close();
        if (as != null)
        {
            as.close();
        }
_L5:
        as = obj1;
        if (b1 != null)
        {
            as = obj1;
            if (obj != null)
            {
                as = new String[2];
                as[0] = b1;
                as[1] = obj;
            }
        }
        return as;
        b1;
        as = null;
_L8:
        obj = as;
        Log.e("MixpanelAPI", (new StringBuilder("generateDataString ")).append(s).toString(), b1);
        e.close();
        if (as != null)
        {
            as.close();
            b1 = null;
            obj = null;
        } else
        {
            b1 = null;
            obj = null;
        }
          goto _L5
        b1;
        obj = null;
_L7:
        e.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw b1;
        b1;
        if (true) goto _L7; else goto _L6
_L6:
        b1;
          goto _L8
_L4:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        a = (new StringBuilder("CREATE TABLE ")).append(b.a.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);").toString();
        b = (new StringBuilder("CREATE TABLE ")).append(b.b.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);").toString();
        c = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(b.a.a()).append(" (created_at);").toString();
        d = (new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ")).append(b.b.a()).append(" (created_at);").toString();
    }
}
