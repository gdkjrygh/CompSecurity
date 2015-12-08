// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            dp, fj, dn

public final class do
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
        "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
    });
    private static final Object c = new Object();
    private static do d;
    private final dp b;

    private do(Context context)
    {
        b = new dp(this, context, "google_inapp_purchase.db");
    }

    public static do a(Context context)
    {
        synchronized (c)
        {
            if (d == null)
            {
                d = new do(context);
            }
            context = d;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String a()
    {
        return a;
    }

    private SQLiteDatabase b()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            fj.e("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    private int c()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj3 = c;
        obj3;
        JVM INSTR monitorenter ;
        Object obj2 = b();
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
        fj.e((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
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

    public final void a(dn dn1)
    {
        if (dn1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        dn1;
        obj;
        JVM INSTR monitorexit ;
        throw dn1;
        sqlitedatabase.delete("InAppPurchase", String.format("%s = %d", new Object[] {
            "purchase_id", Long.valueOf(dn1.a)
        }), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b(dn dn1)
    {
        dn dn2;
        dn2 = null;
        if (dn1 == null)
        {
            return;
        }
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        dn1;
        obj1;
        JVM INSTR monitorexit ;
        throw dn1;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("product_id", dn1.c);
        contentvalues.put("developer_payload", dn1.b);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        dn1.a = ((SQLiteDatabase) (obj)).insert("InAppPurchase", null, contentvalues);
        if ((long)c() <= 20000L) goto _L2; else goto _L1
_L1:
        Object obj2 = c;
        obj2;
        JVM INSTR monitorenter ;
        dn1 = b();
        if (dn1 != null) goto _L4; else goto _L3
_L3:
        obj2;
        JVM INSTR monitorexit ;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = dn1.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (obj == null) goto _L6; else goto _L5
_L5:
        dn1 = ((dn) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L6; else goto _L7
_L7:
        if (obj != null) goto _L9; else goto _L8
_L8:
        dn1 = ((dn) (obj));
        a(dn2);
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        ((Cursor) (obj)).close();
_L11:
        obj2;
        JVM INSTR monitorexit ;
          goto _L2
        dn1;
        obj2;
        JVM INSTR monitorexit ;
        throw dn1;
_L9:
        dn1 = ((dn) (obj));
        dn2 = new dn(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(2));
          goto _L8
        SQLiteException sqliteexception;
        sqliteexception;
_L13:
        dn1 = ((dn) (obj));
        fj.e((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (obj == null) goto _L11; else goto _L10
_L10:
        ((Cursor) (obj)).close();
          goto _L11
_L12:
        if (dn1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        dn1.close();
        throw obj;
        obj;
          goto _L12
        sqliteexception;
        obj = null;
          goto _L13
        obj;
        dn1 = null;
          goto _L12
    }

}
