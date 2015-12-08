// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            aq, az, l, s

final class bc extends SQLiteOpenHelper
{

    final az a;
    private boolean b;
    private long c;

    bc(az az1, Context context, String s1)
    {
        a = az1;
        super(context, s1, null, 1);
        c = 0L;
    }

    private static boolean a(String s1, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
            "name"
        }, "name=?", new String[] {
            s1
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
        aq.f((new StringBuilder("error querying for table ")).append(s1).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
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
        s1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L2; else goto _L1
_L1:
        SQLiteException sqliteexception;
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase;
        if (b && c + 0x36ee80L > az.a(a).a())
        {
            throw new SQLiteException("Database creation failed");
        }
        sqlitedatabase = null;
        b = true;
        c = az.a(a).a();
        SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
_L2:
        SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
        if (sqlitedatabase == null)
        {
            sqlitedatabase2 = super.getWritableDatabase();
        }
        b = false;
        return sqlitedatabase2;
        SQLiteException sqliteexception;
        sqliteexception;
        az.c(a).getDatabasePath(az.b(a)).delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.getPath();
        if (s.a() >= 9)
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
        Cursor cursor;
        boolean flag1;
        flag1 = false;
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        if (a("hits2", sqlitedatabase)) goto _L2; else goto _L1
_L1:
        sqlitedatabase.execSQL(az.c());
_L6:
        return;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L2:
        HashSet hashset;
        cursor = sqlitedatabase.rawQuery("SELECT * FROM hits2 WHERE 0", null);
        hashset = new HashSet();
        String as[] = cursor.getColumnNames();
        int i = 0;
_L4:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(as[i]);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        cursor.close();
        if (!hashset.remove("hit_id") || !hashset.remove("hit_url") || !hashset.remove("hit_string") || !hashset.remove("hit_time"))
        {
            throw new SQLiteException("Database column missing");
        }
        break MISSING_BLOCK_LABEL_183;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        boolean flag = flag1;
        if (!hashset.remove("hit_app_id"))
        {
            flag = true;
        }
        if (!hashset.isEmpty())
        {
            throw new SQLiteException("Database has extra columns");
        }
        if (flag)
        {
            sqlitedatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
