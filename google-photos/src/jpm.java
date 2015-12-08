// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Locale;

public final class jpm
{

    static final Object a = new Object();
    private static final String b;
    private static jpm d;
    private final jpn c;

    private jpm(Context context)
    {
        c = new jpn(this, context, "google_inapp_purchase.db");
    }

    public static jpm a(Context context)
    {
        synchronized (a)
        {
            if (d == null)
            {
                d = new jpm(context);
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
            b.m("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    public final void a(jpl jpl1)
    {
        if (jpl1 == null)
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
        jpl1;
        obj;
        JVM INSTR monitorexit ;
        throw jpl1;
        sqlitedatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] {
            "purchase_id", Long.valueOf(jpl1.a)
        }), null);
        obj;
        JVM INSTR monitorexit ;
    }

    public final int b()
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
        b.m((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
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

    public final void c()
    {
        jpl jpl1 = null;
        Object obj2 = a;
        obj2;
        JVM INSTR monitorenter ;
        Object obj = a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        Object obj1 = ((SQLiteDatabase) (obj)).query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L3
_L3:
        if (obj1 != null) goto _L5; else goto _L4
_L4:
        obj = obj1;
        a(jpl1);
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        ((Cursor) (obj1)).close();
_L7:
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        obj = obj1;
        jpl1 = new jpl(((Cursor) (obj1)).getLong(0), ((Cursor) (obj1)).getString(1), ((Cursor) (obj1)).getString(2));
          goto _L4
        SQLiteException sqliteexception;
        sqliteexception;
_L9:
        obj = obj1;
        b.m((new StringBuilder("Error remove oldest record")).append(sqliteexception.getMessage()).toString());
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        ((Cursor) (obj1)).close();
          goto _L7
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((Cursor) (obj)).close();
        throw obj1;
        obj1;
          goto _L8
        sqliteexception;
        obj1 = null;
          goto _L9
        obj1;
        obj = null;
          goto _L8
    }

    static 
    {
        b = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] {
            "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"
        });
    }
}
