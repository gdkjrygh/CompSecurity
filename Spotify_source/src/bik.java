// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class bik
{

    static final Object a = new Object();
    private static final String b;
    private static bik d;
    private final bil c;

    private bik(Context context)
    {
        c = new bil(context, "google_inapp_purchase.db");
    }

    static bii a(Cursor cursor)
    {
        if (cursor == null)
        {
            return null;
        } else
        {
            return new bii(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public static bik a(Context context)
    {
        synchronized (a)
        {
            if (d == null)
            {
                d = new bik(context);
            }
            context = d;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String d()
    {
        return b;
    }

    public final SQLiteDatabase a()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = c.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            bka.e("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    public final void a(bii bii1)
    {
        if (bii1 == null)
        {
            return;
        }
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a();
        if (sqlitedatabase != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        bii1;
        obj;
        JVM INSTR monitorexit ;
        throw bii1;
        sqlitedatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] {
            "purchase_id", Long.valueOf(bii1.a)
        }), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public final List b()
    {
        Object obj1 = a;
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
        Object obj = a();
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
        bka.e((new StringBuilder("Error extracing purchase info: ")).append(sqliteexception.getMessage()).toString());
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

    public final int c()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj3 = a;
        obj3;
        JVM INSTR monitorenter ;
        Object obj2 = a();
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
        bka.e((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
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

    static 
    {
        b = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
            "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
        });
    }
}
