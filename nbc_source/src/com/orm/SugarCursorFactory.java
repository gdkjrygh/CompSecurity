// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Log;

public class SugarCursorFactory
    implements android.database.sqlite.SQLiteDatabase.CursorFactory
{

    private boolean debugEnabled;

    public SugarCursorFactory()
    {
        debugEnabled = false;
    }

    public SugarCursorFactory(boolean flag)
    {
        debugEnabled = flag;
    }

    public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
    {
        if (debugEnabled)
        {
            Log.d("SQL Log", sqlitequery.toString());
        }
        return new SQLiteCursor(sqlitedatabase, sqlitecursordriver, s, sqlitequery);
    }
}
