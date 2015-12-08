// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            d

public final class e
{
    public final class a extends SQLiteOpenHelper
    {

        final e a;

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(e.c());
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString());
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sqlitedatabase);
        }

        public a(Context context, String s)
        {
            a = e.this;
            super(context, s, null, 4);
        }
    }


    static final Object a = new Object();
    private static final String b;
    private static e d;
    private final a c;

    private e(Context context)
    {
        c = new a(context, "google_inapp_purchase.db");
    }

    public static e a(Context context)
    {
        synchronized (a)
        {
            if (d == null)
            {
                d = new e(context);
            }
            context = d;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String c()
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
            com.google.android.gms.ads.internal.util.client.b.e("Error opening writable conversion tracking database");
            return null;
        }
        return sqlitedatabase;
    }

    public final void a(d d1)
    {
        if (d1 == null)
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
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
        sqlitedatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] {
            "purchase_id", Long.valueOf(d1.a)
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
        com.google.android.gms.ads.internal.util.client.b.e((new StringBuilder("Error getting record count")).append(sqliteexception.getMessage()).toString());
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
