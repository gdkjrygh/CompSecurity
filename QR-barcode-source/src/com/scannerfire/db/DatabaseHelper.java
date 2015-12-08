// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper
{

    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_CREATE = "CREATE TABLE scans (_id INTEGER PRIMARY KEY AUTOINCREMENT , text TEXT ,byte BLOB ,result_x FLOAT ,result_y FLOAT ,format TEXT ,time TEXT , date TEXT );";
    private static final String TABLE_NAME = "scans";

    public DatabaseHelper(Context context)
    {
        super(context, "scans", null, 1);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE scans (_id INTEGER PRIMARY KEY AUTOINCREMENT , text TEXT ,byte BLOB ,result_x FLOAT ,result_y FLOAT ,format TEXT ,time TEXT , date TEXT );");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXIST contact");
        onCreate(sqlitedatabase);
    }
}
