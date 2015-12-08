// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class l extends SQLiteOpenHelper
{

    private final String a = "CREATE TABLE folder (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,folderlist TEXT)";

    public l(Context context)
    {
        super(context, "PG.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE folder (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,folderlist TEXT)");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
