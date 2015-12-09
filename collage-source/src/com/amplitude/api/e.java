// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amplitude.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class e extends SQLiteOpenHelper
{

    static e a;
    private File b;

    private e(Context context)
    {
        super(context, "com.amplitude.api", null, 2);
        b = context.getDatabasePath("com.amplitude.api");
    }

    static e a(Context context)
    {
        com/amplitude/api/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(context.getApplicationContext());
        }
        context = a;
        com/amplitude/api/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS store");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sqlitedatabase);
    }

    private void b()
    {
        try
        {
            close();
            b.delete();
            return;
        }
        catch (SecurityException securityexception)
        {
            Log.e("com.amplitude.api.DatabaseHelper", "delete failed", securityexception);
        }
    }

    long a()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteStatement sqlitestatement;
        SQLiteStatement sqlitestatement1;
        long l;
        l = 0L;
        sqlitestatement1 = null;
        sqlitestatement = null;
        SQLiteStatement sqlitestatement2 = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM events");
        sqlitestatement = sqlitestatement2;
        sqlitestatement1 = sqlitestatement2;
        long l1 = sqlitestatement2.simpleQueryForLong();
        l = l1;
        if (sqlitestatement2 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        sqlitestatement2.close();
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitestatement1 = sqlitestatement;
        Log.e("com.amplitude.api.DatabaseHelper", "getNumberRows failed", sqliteexception);
        if (sqlitestatement == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        sqlitestatement.close();
        close();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
        exception;
        if (sqlitestatement1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        sqlitestatement1.close();
        close();
        throw exception;
    }

    long a(long l)
    {
        long l1 = -1L;
        this;
        JVM INSTR monitorenter ;
        SQLiteStatement sqlitestatement;
        SQLiteStatement sqlitestatement1;
        sqlitestatement1 = null;
        sqlitestatement = null;
        SQLiteStatement sqlitestatement2 = getReadableDatabase().compileStatement((new StringBuilder()).append("SELECT id FROM events LIMIT 1 OFFSET ").append(l - 1L).toString());
        sqlitestatement = sqlitestatement2;
        sqlitestatement1 = sqlitestatement2;
        l = sqlitestatement2.simpleQueryForLong();
_L1:
        if (sqlitestatement2 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        sqlitestatement2.close();
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
        SQLiteDoneException sqlitedoneexception;
        sqlitedoneexception;
        sqlitestatement = sqlitestatement2;
        sqlitestatement1 = sqlitestatement2;
        Log.w("com.amplitude.api.DatabaseHelper", sqlitedoneexception);
        l = l1;
          goto _L1
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitestatement1 = sqlitestatement;
        Log.e("com.amplitude.api.DatabaseHelper", "getNthEventId failed", sqliteexception);
        if (sqlitestatement == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        sqlitestatement.close();
        close();
        l = l1;
          goto _L2
        Exception exception;
        exception;
        throw exception;
        exception;
        if (sqlitestatement1 == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        sqlitestatement1.close();
        close();
        throw exception;
          goto _L1
    }

    long a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("event", s);
        l = sqlitedatabase.insert("events", null, contentvalues);
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        Log.w("com.amplitude.api.DatabaseHelper", "Insert failed");
        close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        l = -1L;
_L2:
        Log.e("com.amplitude.api.DatabaseHelper", "addEvent failed", s);
        b();
        close();
          goto _L1
        s;
        throw s;
        s;
        close();
        throw s;
        s;
          goto _L2
    }

    long a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("key", s);
        contentvalues.put("value", s1);
        l = sqlitedatabase.insertWithOnConflict("store", null, contentvalues, 5);
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        Log.w("com.amplitude.api.DatabaseHelper", "Insert failed");
        close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        l = -1L;
_L2:
        Log.e("com.amplitude.api.DatabaseHelper", "insertOrReplaceKeyValue failed", s);
        b();
        close();
          goto _L1
        s;
        throw s;
        s;
        close();
        throw s;
        s;
          goto _L2
    }

    Pair a(long l, int i)
        throws JSONException
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray = new JSONArray();
        Object obj2 = null;
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        if (l < 0L) goto _L2; else goto _L1
_L1:
        Object obj = (new StringBuilder()).append("id <= ").append(l).toString();
_L7:
        if (i < 0) goto _L4; else goto _L3
_L3:
        Object obj1 = (new StringBuilder()).append("").append(i).toString();
_L8:
        obj1 = sqlitedatabase.query("events", new String[] {
            "id", "event"
        }, ((String) (obj)), null, null, null, "id ASC", ((String) (obj1)));
        l = -1L;
_L6:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        long l1 = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        obj2 = new JSONObject(((Cursor) (obj1)).getString(1));
        obj = obj1;
        ((JSONObject) (obj2)).put("event_id", l1);
        obj = obj1;
        jsonarray.put(obj2);
        l = l1;
        if (true) goto _L6; else goto _L5
_L2:
        obj = null;
          goto _L7
_L4:
        obj1 = null;
          goto _L8
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        ((Cursor) (obj1)).close();
        close();
_L9:
        obj = new Pair(Long.valueOf(l), jsonarray);
        this;
        JVM INSTR monitorexit ;
        return ((Pair) (obj));
        obj2;
        obj1 = null;
        l = -1L;
_L12:
        obj = obj1;
        Log.e("com.amplitude.api.DatabaseHelper", "getEvents failed", ((Throwable) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ((Cursor) (obj1)).close();
        close();
          goto _L9
        obj;
        throw obj;
        obj;
        obj1 = obj2;
_L11:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        ((Cursor) (obj1)).close();
        close();
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L11; else goto _L10
_L10:
        obj2;
          goto _L12
    }

    String b(String s)
    {
        String s1 = null;
        this;
        JVM INSTR monitorenter ;
        s = getReadableDatabase().query("store", new String[] {
            "key", "value"
        }, "key = ?", new String[] {
            s
        }, null, null, null, null);
        s1 = s;
        if (!s.moveToFirst()) goto _L2; else goto _L1
_L1:
        s1 = s;
        String s2 = s.getString(1);
        s1 = s2;
_L6:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s.close();
        close();
_L3:
        this;
        JVM INSTR monitorexit ;
        return s1;
        SQLiteException sqliteexception;
        sqliteexception;
        s = null;
_L5:
        s1 = s;
        Log.e("com.amplitude.api.DatabaseHelper", "getValue failed", sqliteexception);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s.close();
        close();
        s1 = null;
          goto _L3
_L4:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s1.close();
        close();
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        s;
          goto _L4
        sqliteexception;
          goto _L5
_L2:
        s1 = null;
          goto _L6
        s;
          goto _L4
    }

    void b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        getWritableDatabase().delete("events", (new StringBuilder()).append("id <= ").append(l).toString(), null);
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("com.amplitude.api.DatabaseHelper", "removeEvents failed", ((Throwable) (obj)));
        close();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        close();
        throw obj;
    }

    void c(long l)
    {
        this;
        JVM INSTR monitorenter ;
        getWritableDatabase().delete("events", (new StringBuilder()).append("id = ").append(l).toString(), null);
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("com.amplitude.api.DatabaseHelper", "removeEvent failed", ((Throwable) (obj)));
        close();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        close();
        throw obj;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (i)
        {
        default:
            Log.e("com.amplitude.api.DatabaseHelper", (new StringBuilder()).append("onUpgrade() with unknown oldVersion ").append(i).toString());
            a(sqlitedatabase);
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            break;
        }
    }
}
