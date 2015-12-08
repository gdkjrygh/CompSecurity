// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.kochava.android.util.Base64Coder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Global

public class KochavaDbAdapter
{

    private KochavaDatabaseHelper a;

    public KochavaDbAdapter(Context context)
    {
        a = new KochavaDatabaseHelper(context);
    }

    public int a(JSONObject jsonobject)
    {
        Object obj1 = null;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (Global.a)
        {
            Log.e("KochavaDbAdapter", "addEvent");
        }
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        jsonobject2 = obj;
        jsonobject1 = obj1;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        jsonobject2 = obj;
        jsonobject1 = obj1;
        ContentValues contentvalues = new ContentValues();
        jsonobject2 = obj;
        jsonobject1 = obj1;
        contentvalues.put("data", jsonobject.toString());
        jsonobject2 = obj;
        jsonobject1 = obj1;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        jsonobject2 = obj;
        jsonobject1 = obj1;
        sqlitedatabase.insert("events", null, contentvalues);
        jsonobject2 = obj;
        jsonobject1 = obj1;
        jsonobject = sqlitedatabase.rawQuery("SELECT * FROM events", null);
        jsonobject2 = jsonobject;
        jsonobject1 = jsonobject;
        int j = jsonobject.getCount();
        a.close();
        int i;
        i = j;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        jsonobject.close();
        i = j;
_L2:
        this;
        JVM INSTR monitorexit ;
        return i;
        jsonobject;
        jsonobject1 = jsonobject2;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        jsonobject1 = jsonobject2;
        Log.e("KochavaDbAdapter", "addEvent", jsonobject);
        a.close();
        if (jsonobject2 == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        jsonobject2.close();
        i = -1;
        continue; /* Loop/switch isn't completed */
        jsonobject;
        a.close();
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        jsonobject1.close();
        throw jsonobject;
        jsonobject;
        this;
        JVM INSTR monitorexit ;
        throw jsonobject;
        i = -1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String a()
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor = a.getReadableDatabase().rawQuery("SELECT * FROM events ORDER BY created_at ASC", null);
        Object obj1 = cursor;
        JSONArray jsonarray = new JSONArray();
        Object obj = null;
_L7:
        String s;
        obj1 = cursor;
        s = ((String) (obj));
        if (cursor.moveToNext()) goto _L2; else goto _L1
_L1:
        obj1 = cursor;
        s = ((String) (obj));
        if (jsonarray.length() <= 0) goto _L4; else goto _L3
_L3:
        obj1 = cursor;
        s = ((String) (obj));
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj1 = cursor;
        s = ((String) (obj));
        Log.e("KochavaDbAdapter", (new StringBuilder("[JSON DATA VER 4] : ")).append(jsonarray.toString()).toString());
        obj1 = cursor;
        s = ((String) (obj));
        Object obj2 = Base64Coder.a(jsonarray.toString());
        s = ((String) (obj2));
_L13:
        a.close();
        obj1 = s;
        obj2 = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        cursor.close();
        obj2 = obj;
        obj1 = s;
_L10:
        if (obj2 == null || obj1 == null) goto _L6; else goto _L5
_L5:
        obj = (new StringBuilder(String.valueOf(obj2))).append("=").append(((String) (obj1))).toString();
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj2 = obj;
        obj1 = cursor;
        s = ((String) (obj));
        if (!cursor.isLast())
        {
            break MISSING_BLOCK_LABEL_222;
        }
        obj1 = cursor;
        s = ((String) (obj));
        obj2 = cursor.getString(cursor.getColumnIndex("created_at"));
        obj1 = cursor;
        s = ((String) (obj2));
        jsonarray.put(new JSONObject(cursor.getString(cursor.getColumnIndex("data"))));
        obj = obj2;
          goto _L7
        JSONException jsonexception;
        jsonexception;
        jsonexception = ((JSONException) (obj2));
          goto _L7
        SQLiteException sqliteexception;
        sqliteexception;
        jsonexception = null;
        cursor = null;
_L12:
        obj1 = cursor;
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        obj1 = cursor;
        Log.e("KochavaDbAdapter", "generateDataString", sqliteexception);
        a.close();
        if (cursor == null) goto _L9; else goto _L8
_L8:
        cursor.close();
        obj1 = null;
        sqliteexception = jsonexception;
          goto _L10
_L11:
        a.close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        ((Cursor) (obj1)).close();
        throw jsonexception;
        jsonexception;
        this;
        JVM INSTR monitorexit ;
        throw jsonexception;
_L6:
        this;
        JVM INSTR monitorexit ;
        return null;
        jsonexception;
          goto _L11
        sqliteexception;
        jsonexception = null;
          goto _L12
        sqliteexception;
        jsonexception = s;
          goto _L12
_L9:
        obj1 = null;
        sqliteexception = jsonexception;
          goto _L10
_L4:
        s = null;
          goto _L13
        jsonexception;
        obj1 = null;
          goto _L11
    }

    public String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        this;
        JVM INSTR monitorexit ;
        return "";
        Object obj = a.getReadableDatabase().rawQuery((new StringBuilder("SELECT * FROM keys WHERE id='")).append(s).append("'").toString(), null);
        s = ((String) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        s = ((String) (obj));
        String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data"));
        a.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((Cursor) (obj)).close();
        this;
        JVM INSTR monitorexit ;
        return s1;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        SQLiteException sqliteexception;
        sqliteexception;
        obj = null;
_L6:
        s = ((String) (obj));
        if (!Global.a)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        s = ((String) (obj));
        Log.e("KochavaDbAdapter", "generateDataString", sqliteexception);
        a.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        ((Cursor) (obj)).close();
_L4:
        this;
        JVM INSTR monitorexit ;
        return null;
_L5:
        a.close();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s.close();
        throw obj;
_L2:
        a.close();
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj)).close();
          goto _L4
        obj;
          goto _L5
        sqliteexception;
          goto _L6
        obj;
        s = null;
          goto _L5
    }

    public void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (Global.a)
        {
            Log.e("KochavaDbAdapter", "cleanupEvent");
        }
        a.getWritableDatabase().delete("events", (new StringBuilder("created_at <= ")).append(l).toString(), null);
        a.close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        if (Global.a)
        {
            Log.e("KochavaDbAdapter", "cleanupEvents", ((Throwable) (obj)));
        }
        a.close();
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a.close();
        throw obj;
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("data", s1);
        sqlitedatabase.update("keys", contentvalues, (new StringBuilder("id='")).append(s).append("'").toString(), null);
        a.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        throw new NullPointerException();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (Global.a)
        {
            Log.e("KochavaDbAdapter", "addEvent", s);
        }
        a.close();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NullPointerException();
        s;
        a.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        throw new NullPointerException();
        throw s;
    }

    public void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        if (s.trim().length() != 0)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", s);
        contentvalues.put("data", s1);
        sqlitedatabase.insert("keys", null, contentvalues);
        a.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        throw new NullPointerException();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (Global.a)
        {
            Log.e("KochavaDbAdapter", "addEvent", s);
        }
        a.close();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NullPointerException();
        s;
        a.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        throw new NullPointerException();
        throw s;
    }

    private class KochavaDatabaseHelper extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);");
            if (Global.a)
            {
                Log.e("KochavaDbAdapter", "DATABASE_CREATE_2 : CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);");
            }
            sqlitedatabase.execSQL("CREATE TABLE keys (id STRING NOT NULL PRIMARY KEY, data STRING NOT NULL);");
            if (Global.a)
            {
                Log.e("KochavaDbAdapter", "DATABASE_CREATE_2 : Done");
            }
            sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (Global.a)
            {
                Log.e("KochavaDbAdapter", (new StringBuilder("Upgrading database from version ")).append(i).append(" to ").append(j).toString());
            }
            sqlitedatabase.execSQL("DROP TABLE events");
            sqlitedatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL,created_at INTEGER NOT NULL);");
            sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
        }

        KochavaDatabaseHelper(Context context)
        {
            super(context, "KochavaFeatureTracker", null, 2);
        }
    }

}
