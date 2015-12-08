// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class b
{

    public static void a(Cursor cursor, SQLiteDatabase sqlitedatabase)
    {
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
        if (sqlitedatabase != null && sqlitedatabase.isOpen())
        {
            sqlitedatabase.close();
        }
    }
}
