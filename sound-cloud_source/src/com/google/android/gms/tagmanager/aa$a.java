// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aa, s, n

final class rFactory extends SQLiteOpenHelper
{

    final aa a;

    private static boolean a(String s1, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        s1 = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s1
        }, null, null, null);
        boolean flag = s1.moveToFirst();
        if (s1 != null)
        {
            s1.close();
        }
        return flag;
        s1;
        s1 = null;
_L4:
        s.c();
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        s1;
        sqlitedatabase = obj;
_L2:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw s1;
        Exception exception;
        exception;
        sqlitedatabase = s1;
        s1 = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        sqlitedatabase = s1;
        s1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
_L2:
        SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
        if (sqlitedatabase == null)
        {
            sqlitedatabase2 = super.getWritableDatabase();
        }
        return sqlitedatabase2;
        SQLiteException sqliteexception;
        sqliteexception;
        aa.b(a).getDatabasePath("google_tagmanager.db").delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.getPath();
        if (n.a() >= 9)
        {
            sqlitedatabase = new File(sqlitedatabase);
            sqlitedatabase.setReadable(false, false);
            sqlitedatabase.setWritable(false, false);
            sqlitedatabase.setReadable(true, true);
            sqlitedatabase.setWritable(true, true);
        }
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        if (android.os..VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        ((Cursor) (obj)).moveToFirst();
        ((Cursor) (obj)).close();
        if (a("datalayer", sqlitedatabase)) goto _L2; else goto _L1
_L1:
        sqlitedatabase.execSQL(aa.a());
_L6:
        return;
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L2:
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
        obj = new HashSet();
        String as[] = sqlitedatabase.getColumnNames();
        int i = 0;
_L4:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Set) (obj)).add(as[i]);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        sqlitedatabase.close();
        if (!((Set) (obj)).remove("key") || !((Set) (obj)).remove("value") || !((Set) (obj)).remove("ID") || !((Set) (obj)).remove("expires"))
        {
            throw new SQLiteException("Database column missing");
        }
        continue; /* Loop/switch isn't completed */
        obj;
        sqlitedatabase.close();
        throw obj;
        if (((Set) (obj)).isEmpty()) goto _L6; else goto _L5
_L5:
        throw new SQLiteException("Database has extra columns");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    rFactory(aa aa1, Context context, String s1)
    {
        a = aa1;
        super(context, s1, null, 1);
    }
}
