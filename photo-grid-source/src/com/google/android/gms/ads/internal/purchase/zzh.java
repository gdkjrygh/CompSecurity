// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzf

public class zzh
{

    private static final String a;
    private static final Object c = new Object();
    private static zzh d;
    private final zza b;

    private zzh(Context context)
    {
        b = new zza(context, "google_inapp_purchase.db");
    }

    static String a()
    {
        return a;
    }

    public static zzh zzw(Context context)
    {
        synchronized (c)
        {
            if (d == null)
            {
                d = new zzh(context);
            }
            context = d;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public int getRecordCount()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj3 = c;
        obj3;
        JVM INSTR monitorenter ;
        Object obj2 = getWritableDatabase();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj3;
        JVM INSTR monitorexit ;
        return 0;
        obj2 = ((SQLiteDatabase) (obj2)).rawQuery("select count(*) from InAppPurchase", null);
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = obj2;
        obj1 = obj2;
        int i = ((Cursor) (obj2)).getInt(0);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        ((Cursor) (obj2)).close();
        obj3;
        JVM INSTR monitorexit ;
        return i;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        ((Cursor) (obj2)).close();
_L2:
        obj3;
        JVM INSTR monitorexit ;
        return 0;
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = obj;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
          goto _L2
        Exception exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        ((Cursor) (obj1)).close();
        throw exception;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    public zzf zza(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            return new zzf(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public void zza(zzf zzf1)
    {
        if (zzf1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        zzf1;
        obj;
        JVM INSTR monitorexit ;
        throw zzf1;
        sqlitedatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] {
            "purchase_id", Long.valueOf(zzf1.zzCQ)
        }), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzb(zzf zzf1)
    {
        if (zzf1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        zzf1;
        obj;
        JVM INSTR monitorexit ;
        throw zzf1;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("product_id", zzf1.zzCS);
        contentvalues.put("developer_payload", zzf1.zzCR);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        zzf1.zzCQ = sqlitedatabase.insert("InAppPurchase", null, contentvalues);
        if ((long)getRecordCount() > 20000L)
        {
            zzfo();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzfo()
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = getWritableDatabase();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        Cursor cursor = ((SQLiteDatabase) (obj)).query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = cursor;
        zza(zza(cursor));
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        cursor.close();
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L4:
        obj = cursor;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
          goto _L2
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((Cursor) (obj)).close();
        Exception exception;
        throw exception;
        exception;
          goto _L3
        sqliteexception;
          goto _L4
        exception;
        obj = null;
          goto _L3
    }

    public List zzg(long l)
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = new LinkedList();
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj1;
        JVM INSTR monitorexit ;
        return linkedlist;
        Object obj = getWritableDatabase();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        obj1;
        JVM INSTR monitorexit ;
        return linkedlist;
        Cursor cursor = ((SQLiteDatabase) (obj)).query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(l));
        obj = cursor;
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = cursor;
        linkedlist.add(zza(cursor));
        obj = cursor;
        boolean flag = cursor.moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        cursor.close();
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return linkedlist;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L7:
        obj = cursor;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Error extracing purchase info: ")).append(sqliteexception.getMessage()).toString());
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
          goto _L4
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj = null;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        sqliteexception;
          goto _L7
    }

    static 
    {
        a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
            "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
        });
    }

    private class zza extends SQLiteOpenHelper
    {

        final zzh a;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(zzh.a());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaG((new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString());
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sqlitedatabase);
        }

        public zza(Context context, String s)
        {
            a = zzh.this;
            super(context, s, null, 4);
        }
    }

}
