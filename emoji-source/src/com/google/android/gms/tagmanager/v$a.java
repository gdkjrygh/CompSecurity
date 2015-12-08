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
//            v, bh, ak

class sorFactory extends SQLiteOpenHelper
{

    final v afp;

    private void a(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
        obj = new HashSet();
        String as[] = sqlitedatabase.getColumnNames();
        int i = 0;
_L2:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Set) (obj)).add(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        if (!((Set) (obj)).remove("key") || !((Set) (obj)).remove("value") || !((Set) (obj)).remove("ID") || !((Set) (obj)).remove("expires"))
        {
            throw new SQLiteException("Database column missing");
        }
        break MISSING_BLOCK_LABEL_122;
        obj;
        sqlitedatabase.close();
        throw obj;
        if (!((Set) (obj)).isEmpty())
        {
            throw new SQLiteException("Database has extra columns");
        } else
        {
            return;
        }
    }

    private boolean a(String s, SQLiteDatabase sqlitedatabase)
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
        bh.D((new StringBuilder()).append("Error querying for table ").append(s).toString());
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

    public SQLiteDatabase getWritableDatabase()
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
        v.b(afp).getDatabasePath("google_tagmanager.db").delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        ak.N(sqlitedatabase.getPath());
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        if (android.os.d.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        if (!a("datalayer", sqlitedatabase))
        {
            sqlitedatabase.execSQL(v.lG());
            return;
        } else
        {
            a(sqlitedatabase);
            return;
        }
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    sorFactory(v v1, Context context, String s)
    {
        afp = v1;
        super(context, s, null, 1);
    }
}
