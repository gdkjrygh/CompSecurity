// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class b
{

    private b()
    {
    }

    private static int a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.rawQuery("PRAGMA page_size", null);
        int i;
        sqlitedatabase.moveToNext();
        i = sqlitedatabase.getInt(0);
        sqlitedatabase.close();
        return i;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    public static void a(SQLiteDatabase sqlitedatabase, int i)
    {
        a(sqlitedatabase, "wal_autocheckpoint", String.valueOf(i / a(sqlitedatabase)));
        a(sqlitedatabase, "journal_size_limit", String.valueOf(i));
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("PRAGMA ").append(s).append("=").append(s1).toString(), null);
        sqlitedatabase.moveToNext();
        sqlitedatabase.close();
        return;
        s;
        sqlitedatabase.close();
        throw s;
    }

    public static void b(SQLiteDatabase sqlitedatabase, int i)
    {
        if (i != -1)
        {
            b(sqlitedatabase, "busy_timeout", String.valueOf(i));
        }
    }

    private static void b(SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        sqlitedatabase.execSQL((new StringBuilder()).append("PRAGMA ").append(s).append("=").append(s1).toString());
    }
}
