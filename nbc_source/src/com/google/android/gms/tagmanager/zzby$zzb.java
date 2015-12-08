// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.zzlb;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzby, zzbg, zzal

class zzaMA extends SQLiteOpenHelper
{

    private long zzaMA;
    final zzby zzaMy;
    private boolean zzaMz;

    private boolean zza(String s, SQLiteDatabase sqlitedatabase)
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
        zzbg.zzaC((new StringBuilder()).append("Error querying for table ").append(s).toString());
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

    private void zzc(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
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
        if (!((Set) (obj)).remove("hit_id") || !((Set) (obj)).remove("hit_url") || !((Set) (obj)).remove("hit_time") || !((Set) (obj)).remove("hit_first_send_time"))
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

    public SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase;
        if (zzaMz && zzaMA + 0x36ee80L > zzby.zza(zzaMy).currentTimeMillis())
        {
            throw new SQLiteException("Database creation failed");
        }
        sqlitedatabase = null;
        zzaMz = true;
        zzaMA = zzby.zza(zzaMy).currentTimeMillis();
        SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
_L2:
        SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
        if (sqlitedatabase == null)
        {
            sqlitedatabase2 = super.getWritableDatabase();
        }
        zzaMz = false;
        return sqlitedatabase2;
        SQLiteException sqliteexception;
        sqliteexception;
        zzby.zzc(zzaMy).getDatabasePath(zzby.zzb(zzaMy)).delete();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        zzal.zzbe(sqlitedatabase.getPath());
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        if (android.os.SION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
        cursor.moveToFirst();
        cursor.close();
        if (!zza("gtm_hits", sqlitedatabase))
        {
            sqlitedatabase.execSQL(zzby.zzze());
            return;
        } else
        {
            zzc(sqlitedatabase);
            return;
        }
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    (zzby zzby1, Context context, String s)
    {
        zzaMy = zzby1;
        super(context, s, null, 1);
        zzaMA = 0L;
    }
}
