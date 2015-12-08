// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

final class bjk extends SQLiteOpenHelper
{

    private final File a;
    private final bjr b;

    public bjk(Context context, String s, File file, bjr bjr1)
    {
        super(context, s, null, 6);
        a = file;
        b = (bjr)b.a(bjr1, "metricsV19FileHelper", null);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("CREATE TABLE metrics(uri TEXT NOT NULL PRIMARY KEY ON CONFLICT REPLACE, metrics TEXT, version INTEGER NOT NULL, attempts INTEGER NOT NULL DEFAULT 0, analysis_completed INTEGER NOT NULL DEFAULT 0, duration INTEGER NOT NULL DEFAULT -1 )");
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        throw c.a("failed to create database", ((Throwable) (obj)));
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i == 1)
        {
            sqlitedatabase.execSQL("DROP TABLE metrics");
            onCreate(sqlitedatabase);
            return;
        }
        if (i != 2) goto _L2; else goto _L1
_L1:
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("ALTER TABLE metrics ADD COLUMN attempts INTEGER NOT NULL DEFAULT 0");
        sqlitedatabase.setTransactionSuccessful();
        int k;
        sqlitedatabase.endTransaction();
        k = 3;
_L14:
        i = k;
        if (k != 3) goto _L4; else goto _L3
_L3:
        Object obj;
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("ALTER TABLE metrics ADD COLUMN analysis_completed INTEGER NOT NULL DEFAULT 0");
        obj = sqlitedatabase.query("metrics", new String[] {
            "uri", "metrics"
        }, "metrics IS NOT NULL", null, null, null, null);
        Object obj1 = obj;
        ContentValues contentvalues = new ContentValues(1);
        obj1 = obj;
        contentvalues.put("analysis_completed", Integer.valueOf(1));
_L8:
        obj1 = obj;
        if (!((Cursor) (obj)).moveToNext()) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        String s = ((Cursor) (obj)).getString(0);
        obj1 = obj;
        Object obj3 = ((Cursor) (obj)).getString(1);
        obj1 = obj;
        obj3 = new File(a, ((String) (obj3)));
        obj1 = obj;
        obj3 = (cwb)b.a(((File) (obj3)));
        if (obj3 == null) goto _L8; else goto _L7
_L7:
        obj1 = obj;
        if (!((cwb) (obj3)).f) goto _L8; else goto _L9
_L9:
        obj1 = obj;
        sqlitedatabase.update("metrics", contentvalues, "uri = ?", new String[] {
            s
        });
          goto _L8
        Object obj2;
        obj2;
_L12:
        obj1 = obj;
        throw c.a("failed to update database", ((Throwable) (obj2)));
        obj;
_L10:
        b.a(((java.io.Closeable) (obj1)));
        sqlitedatabase.endTransaction();
        throw obj;
        obj;
        throw c.a("failed to create database", ((Throwable) (obj)));
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
_L6:
        obj1 = obj;
        sqlitedatabase.setTransactionSuccessful();
        i = 4;
        b.a(((java.io.Closeable) (obj)));
        sqlitedatabase.endTransaction();
_L4:
        k = i;
        if (i != 4)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("ALTER TABLE metrics ADD COLUMN duration INTEGER NOT NULL DEFAULT -1");
        sqlitedatabase.setTransactionSuccessful();
        k = 5;
        sqlitedatabase.endTransaction();
        i = k;
        if (k != 5)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("UPDATE metrics SET duration = -1 WHERE duration = 0");
        sqlitedatabase.setTransactionSuccessful();
        i = 6;
        sqlitedatabase.endTransaction();
        c.a(i, "oldVersion", j, null);
        return;
        obj2;
        obj = null;
_L11:
        obj1 = obj;
        throw c.a("unexpected", ((Throwable) (obj2)));
        obj;
        throw c.a("failed to update database", ((Throwable) (obj)));
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        obj;
        throw c.a("failed to update database", ((Throwable) (obj)));
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        obj;
        obj1 = null;
          goto _L10
        obj2;
          goto _L11
        obj2;
        obj = null;
        if (true) goto _L12; else goto _L2
_L2:
        k = i;
        if (true) goto _L14; else goto _L13
_L13:
    }
}
