// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import com.aviary.android.feather.common.a.a;
import java.nio.charset.Charset;
import org.json.JSONObject;

public class c
{
    private static final class a extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            com.aviary.android.feather.a.c.a.b("onCreate");
            com.aviary.android.feather.a.c.a.a("CREATE TABLE IF NOT EXISTS receipts_table( r_id INTEGER PRIMARY KEY AUTOINCREMENT, r_json BLOB NOT NULL, r_is_free INTEGER NOT NULL DEFAULT 1 )");
            com.aviary.android.feather.a.c.a.a("CREATE TABLE IF NOT EXISTS uploads_table( u_id INTEGER PRIMARY KEY AUTOINCREMENT, u_receipt_id INTEGER NOT NULL UNIQUE, u_response_status INTEGER NOT NULL, u_fail_count INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(u_receipt_id) REFERENCES receipts_table(r_id) ON DELETE CASCADE);");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS receipts_table( r_id INTEGER PRIMARY KEY AUTOINCREMENT, r_json BLOB NOT NULL, r_is_free INTEGER NOT NULL DEFAULT 1 )");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS uploads_table( u_id INTEGER PRIMARY KEY AUTOINCREMENT, u_receipt_id INTEGER NOT NULL UNIQUE, u_response_status INTEGER NOT NULL, u_fail_count INTEGER NOT NULL DEFAULT 1, FOREIGN KEY(u_receipt_id) REFERENCES receipts_table(r_id) ON DELETE CASCADE);");
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            super.onOpen(sqlitedatabase);
            com.aviary.android.feather.a.c.a.b("onOpen");
            if (!sqlitedatabase.isReadOnly())
            {
                com.aviary.android.feather.a.c.a.b("onConfigure");
                sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
                sqlitedatabase.execSQL("PRAGMA encoding=\"UTF-8\";");
            }
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            com.aviary.android.feather.a.c.a.b("onUpgrade");
        }

        public a(Context context)
        {
            super(context, "receipts", null, 1);
        }
    }


    static com.aviary.android.feather.common.a.a.c a;
    private static c c;
    private SQLiteDatabase b;

    public c(Context context)
    {
        try
        {
            b = (new a(context)).getWritableDatabase();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        a.d("cannot open the database!!!!");
    }

    public static c a(Context context)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/aviary/android/feather/a/c;
        JVM INSTR monitorenter ;
        if (c != null) goto _L4; else goto _L3
_L3:
        com/aviary/android/feather/a/c;
        JVM INSTR monitorenter ;
        c = new c(context);
        com/aviary/android/feather/a/c;
        JVM INSTR monitorexit ;
_L4:
        com/aviary/android/feather/a/c;
        JVM INSTR monitorexit ;
_L2:
        return c;
        context;
        com/aviary/android/feather/a/c;
        JVM INSTR monitorexit ;
        throw context;
        context;
        com/aviary/android/feather/a/c;
        JVM INSTR monitorexit ;
        throw context;
    }

    public transient int a(String s, String s1, String as[])
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.delete(s, s1, as);
        }
    }

    public long a(String s, String s1, ContentValues contentvalues, int i)
    {
        if (b == null)
        {
            return -1L;
        } else
        {
            return b.insertWithOnConflict(s, s1, contentvalues, i);
        }
    }

    public long a(JSONObject jsonobject, boolean flag)
    {
        int i = 1;
        if (b == null)
        {
            return -1L;
        }
        a.c("addTicket: %s", new Object[] {
            jsonobject
        });
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("r_json", jsonobject.toString().getBytes(Charset.forName("UTF-8")));
        if (!flag)
        {
            i = 0;
        }
        contentvalues.put("r_is_free", Integer.valueOf(i));
        return b.insert("receipts_table", null, contentvalues);
    }

    public Cursor a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
            sqlitequerybuilder.setTables("receipts_table LEFT JOIN uploads_table ON (r_id=u_receipt_id)");
            sqlitequerybuilder.appendWhere("IFNULL(u_receipt_id, 0) = 0");
            return sqlitequerybuilder.query(b, null, null, null, null, null, "r_id ASC");
        }
    }

    public Cursor a(String s, String as[], String s1, String as1[], String s2, String s3, String s4)
    {
        if (b == null)
        {
            return null;
        } else
        {
            SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
            sqlitequerybuilder.setTables(s);
            return sqlitequerybuilder.query(b, as, s1, as1, s2, s3, s4);
        }
    }

    public Cursor b()
    {
        if (b == null)
        {
            return null;
        } else
        {
            SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
            sqlitequerybuilder.setTables("receipts_table INNER JOIN uploads_table ON (r_id=u_receipt_id)");
            return sqlitequerybuilder.query(b, null, null, null, null, null, "u_response_status DESC, r_id DESC");
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/a/c.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }
}
