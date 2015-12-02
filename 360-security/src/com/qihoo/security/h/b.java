// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.h;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.qihoo.security.SecurityApplication;

public class b
{
    private static class a extends SQLiteOpenHelper
    {

        private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s (%s VARCHAR PRIMARY KEY, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL DEFAULT 0, %s VARCHAR)", new Object[] {
            "pkginfo", "pkg", "shield", "type", "taxis", "smark", "tmark", "etc", "tis"
        });

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(a);
        }

        public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (i <= j);
        }


        public a(Context context)
        {
            super(context, "shield.db", null, 3);
        }
    }


    private static final String a = com/qihoo/security/h/b.getSimpleName();
    private static b b;
    private SQLiteDatabase c;
    private SQLiteDatabase d;
    private boolean e;
    private final Context f;

    private b(Context context)
    {
        e = false;
        f = context;
    }

    public static b a()
    {
        com/qihoo/security/h/b;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new b(SecurityApplication.a());
        }
        com/qihoo/security/h/b;
        JVM INSTR monitorexit ;
        return b;
        Exception exception;
        exception;
        com/qihoo/security/h/b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b()
    {
        if (e)
        {
            return;
        }
        com/qihoo/security/h/b;
        JVM INSTR monitorenter ;
        a a1 = new a(f);
        d = a1.getReadableDatabase();
        c = a1.getWritableDatabase();
_L1:
        e = true;
        com/qihoo/security/h/b;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com/qihoo/security/h/b;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        d = null;
        c = null;
          goto _L1
        obj;
        d = null;
        c = null;
          goto _L1
    }

    public int a(String s, ContentValues contentvalues, String s1, String as[])
    {
        b();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        int i = c.update(s, contentvalues, s1, as);
        return i;
        s;
        return 0;
    }

    public int a(String s, String s1, String as[])
    {
        b();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        int i = c.delete(s, s1, as);
        return i;
        s;
        return 0;
    }

    public long a(String s, ContentValues contentvalues)
    {
        b();
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        long l = c.insert(s, null, contentvalues);
        return l;
        s;
        return -1L;
    }

    public Cursor a(String s, String as[])
    {
        b();
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s = d.rawQuery(s, as);
        return s;
        s;
        return null;
    }

    public Cursor b(String s, String as[])
    {
        b();
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        s = d.rawQuery(s, as);
        return s;
        s;
        return null;
    }

}
