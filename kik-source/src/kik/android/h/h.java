// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.h;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kik.a.e.j;

// Referenced classes of package kik.android.h:
//            i

public final class h
    implements j
{
    private static final class a extends i
    {

        public final void a(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s CHAR(36) PRIMARY KEY, %s BOOLEAN NOT NULL, %s VARCHAR);", new Object[] {
                "CoreTable", "core_id", "is_active", "username"
            }));
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        public a(Context context)
        {
            super(context, "kikCoreDatabase.db", 1);
        }
    }


    private final a a;
    private kik.a.d.h b;

    public h(Context context)
    {
        a = new a(context);
    }

    private boolean b(kik.a.d.h h1)
    {
        boolean flag;
        flag = false;
        if (h1 == null)
        {
            return false;
        }
        a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("core_id", h1.a());
        contentvalues.put("is_active", Boolean.valueOf(h1.c()));
        contentvalues.put("username", h1.b());
        if (sqlitedatabase.update("CoreTable", contentvalues, (new StringBuilder("core_id ='")).append(h1.a()).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("CoreTable", null, contentvalues);
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
_L2:
        a1;
        JVM INSTR monitorexit ;
        return flag;
        h1;
        a1;
        JVM INSTR monitorexit ;
        throw h1;
        h1;
        sqlitedatabase.endTransaction();
        if (true) goto _L2; else goto _L1
_L1:
        h1;
        sqlitedatabase.endTransaction();
        throw h1;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        Cursor cursor = a.getReadableDatabase().query("CoreTable", null, null, null, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s = cursor.getString(cursor.getColumnIndex("core_id"));
        Exception exception;
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("is_active")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist.add(new kik.a.d.h(s, flag, cursor.getString(cursor.getColumnIndex("username"))));
        if (cursor.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor.close();
        a1;
        JVM INSTR monitorexit ;
        return arraylist;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s)
    {
        if (b != null)
        {
            b.a(s);
            b(b);
        }
    }

    public final boolean a(kik.a.d.h h1)
    {
        if (h1 == null)
        {
            return false;
        }
        boolean flag;
        synchronized (a)
        {
            if (b != null && b.a() != null && !b.a().equals(h1.a()))
            {
                b.a(false);
                b(b);
            }
            b = h1;
            b.a(true);
            flag = b(b);
        }
        return flag;
        h1;
        a1;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final boolean b(String s)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = false;
        if (s == null)
        {
            return false;
        }
        a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        if (b != null && b.a().equals(s))
        {
            b = null;
        }
        sqlitedatabase.beginTransaction();
        if (sqlitedatabase.delete("CoreTable", "core_id=?", new String[] {
    s
}) <= 0)
        {
            flag = false;
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L1:
        a1;
        JVM INSTR monitorexit ;
        return flag;
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        sqlitedatabase.endTransaction();
        flag = flag1;
          goto _L1
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }
}
