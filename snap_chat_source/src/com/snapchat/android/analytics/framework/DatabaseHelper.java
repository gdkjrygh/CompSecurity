// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Pair;
import com.snapchat.android.Timber;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            Constants

class DatabaseHelper extends SQLiteOpenHelper
{

    private static DatabaseHelper a;
    private File b;

    private DatabaseHelper(Context context)
    {
        super(context, Constants.a, null, 1);
        b = context.getDatabasePath(Constants.a);
    }

    public static DatabaseHelper a(Context context)
    {
        com/snapchat/android/analytics/framework/DatabaseHelper;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new DatabaseHelper(context.getApplicationContext());
        }
        context = a;
        com/snapchat/android/analytics/framework/DatabaseHelper;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = 0L;
        long l1 = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM events").simpleQueryForLong();
        l = l1;
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
        Object obj;
        obj;
        Timber.e("com.amplitude.api.DatabaseHelper", "getNumberRows failed", new Object[] {
            obj
        });
        close();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        close();
        throw obj;
    }

    final long a(String s)
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
            break MISSING_BLOCK_LABEL_52;
        }
        Timber.d("com.amplitude.api.DatabaseHelper", "Insert failed", new Object[0]);
        close();
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        l = -1L;
_L3:
        Timber.e("com.amplitude.api.DatabaseHelper", "addEvent failed", new Object[] {
            s
        });
        close();
        b.delete();
_L2:
        close();
          goto _L1
        s;
        throw s;
        s;
        Timber.e("com.amplitude.api.DatabaseHelper", "delete failed", new Object[] {
            s
        });
          goto _L2
        s;
        close();
        throw s;
        s;
          goto _L3
    }

    final Pair a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray = new JSONArray();
        Object obj1 = getReadableDatabase();
        if (i < 0) goto _L2; else goto _L1
_L1:
        Object obj = String.valueOf(i);
_L5:
        obj1 = ((SQLiteDatabase) (obj1)).query("events", new String[] {
            "id", "event"
        }, null, null, null, null, "id ASC", ((String) (obj)));
        long l = -1L;
_L4:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        long l1 = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        JSONObject jsonobject = new JSONObject(((Cursor) (obj1)).getString(1));
        obj = obj1;
        jsonobject.put("sequence_id", l1);
        obj = obj1;
        jsonarray.put(jsonobject);
        l = l1;
        if (true) goto _L4; else goto _L3
_L2:
        obj = null;
          goto _L5
_L3:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        ((Cursor) (obj1)).close();
        close();
_L6:
        obj = new Pair(Long.valueOf(l), jsonarray);
        this;
        JVM INSTR monitorexit ;
        return ((Pair) (obj));
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
        l = -1L;
_L9:
        obj = obj1;
        Timber.e("com.amplitude.api.DatabaseHelper", "getEvents failed", new Object[] {
            sqliteexception
        });
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        ((Cursor) (obj1)).close();
        close();
          goto _L6
        obj;
        throw obj;
        Exception exception;
        exception;
        obj = null;
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        ((Cursor) (obj)).close();
        close();
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        sqliteexception;
          goto _L9
    }

    final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        getWritableDatabase().delete("events", (new StringBuilder("id <= ")).append(l).toString(), null);
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Timber.e("com.amplitude.api.DatabaseHelper", "removeEvents failed", new Object[] {
            obj
        });
        close();
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        close();
        throw obj;
    }

    final long b()
    {
        long l = -1L;
        this;
        JVM INSTR monitorenter ;
        SQLiteStatement sqlitestatement = getReadableDatabase().compileStatement("SELECT id FROM events LIMIT 1 OFFSET 19");
        long l1 = sqlitestatement.simpleQueryForLong();
        l = l1;
_L1:
        close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return l;
        Object obj;
        obj;
        Timber.d("com.amplitude.api.DatabaseHelper", ((SQLiteDoneException) (obj)).getMessage(), new Object[0]);
          goto _L1
        obj;
        Timber.e("com.amplitude.api.DatabaseHelper", "getNthEventId failed", new Object[] {
            obj
        });
        close();
          goto _L2
        obj;
        throw obj;
        obj;
        close();
        throw obj;
          goto _L1
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
    }
}
