// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            f

public final class h
{
    public final class a extends SQLiteOpenHelper
    {

        final h a;

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(com.google.android.gms.ads.internal.purchase.h.b());
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString());
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sqlitedatabase);
        }

        public a(Context context, String s)
        {
            a = h.this;
            super(context, s, null, 4);
        }
    }


    private static final String a;
    private static final Object c = new Object();
    private static h d;
    private final a b;

    private h(Context context)
    {
        b = new a(context, "google_inapp_purchase.db");
    }

    private static f a(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            return new f(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public static h a(Context context)
    {
        synchronized (c)
        {
            if (d == null)
            {
                d = new h(context);
            }
            context = d;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String b()
    {
        return a;
    }

    private SQLiteDatabase c()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = b.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    private int d()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj3 = c;
        obj3;
        JVM INSTR monitorenter ;
        Object obj2 = c();
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
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
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

    public final List a()
    {
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        LinkedList linkedlist = new LinkedList();
        if (10L > 0L)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        obj1;
        JVM INSTR monitorexit ;
        return linkedlist;
        Object obj = c();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj1;
        JVM INSTR monitorexit ;
        return linkedlist;
        Cursor cursor = ((SQLiteDatabase) (obj)).query("InAppPurchase", null, null, null, null, null, "record_time ASC", "10");
        obj = cursor;
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = cursor;
        linkedlist.add(a(cursor));
        obj = cursor;
        boolean flag = cursor.moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_112;
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
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Error extracing purchase info: ")).append(sqliteexception.getMessage()).toString());
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
            break MISSING_BLOCK_LABEL_177;
        }
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        sqliteexception;
          goto _L7
    }

    public final void a(f f1)
    {
        if (f1 == null)
        {
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = c();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
        sqlitedatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] {
            "purchase_id", Long.valueOf(f1.a)
        }), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b(f f1)
    {
        if (f1 == null)
        {
            return;
        }
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = c();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        f1;
        obj1;
        JVM INSTR monitorexit ;
        throw f1;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("product_id", f1.c);
        contentvalues.put("developer_payload", f1.b);
        contentvalues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        f1.a = ((SQLiteDatabase) (obj)).insert("InAppPurchase", null, contentvalues);
        if ((long)d() <= 20000L) goto _L2; else goto _L1
_L1:
        Object obj2 = c;
        obj2;
        JVM INSTR monitorenter ;
        f1 = c();
        if (f1 != null) goto _L4; else goto _L3
_L3:
        obj2;
        JVM INSTR monitorexit ;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = f1.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        f1 = ((f) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        f1 = ((f) (obj));
        a(a(((Cursor) (obj))));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        ((Cursor) (obj)).close();
_L6:
        obj2;
        JVM INSTR monitorexit ;
          goto _L2
        f1;
        obj2;
        JVM INSTR monitorexit ;
        throw f1;
        SQLiteException sqliteexception;
        sqliteexception;
        obj = null;
_L8:
        f1 = ((f) (obj));
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
          goto _L6
_L7:
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        f1.close();
        Exception exception;
        throw exception;
        exception;
          goto _L7
        sqliteexception;
          goto _L8
        exception;
        f1 = null;
          goto _L7
    }

    static 
    {
        a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
            "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
        });
    }
}
