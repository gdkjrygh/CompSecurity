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
//            di, ak, p

final class rFactory extends SQLiteOpenHelper
{

    final di a;

    private static boolean a(String s, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s
        }, null, null, null);
        boolean flag = sqlitedatabase.moveToFirst();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
        sqlitedatabase;
        sqlitedatabase = null;
_L4:
        ak.b((new StringBuilder("Error querying for table ")).append(s).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return false;
        s;
        sqlitedatabase = obj;
_L2:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
        SQLiteException sqliteexception;
        sqliteexception;
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
        di.b(a).getDatabasePath("google_tagmanager.db").delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        p.a(sqlitedatabase.getPath());
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
        sqlitedatabase.execSQL(di.a());
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

    rFactory(di di1, Context context, String s)
    {
        a = di1;
        super(context, s, null, 1);
    }
}
