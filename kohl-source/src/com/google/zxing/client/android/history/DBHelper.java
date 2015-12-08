// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.history;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class DBHelper extends SQLiteOpenHelper
{

    private static final String DB_NAME = "barcode_scanner_history.db";
    private static final int DB_VERSION = 5;
    static final String DETAILS_COL = "details";
    static final String DISPLAY_COL = "display";
    static final String FORMAT_COL = "format";
    static final String ID_COL = "id";
    static final String TABLE_NAME = "history";
    static final String TEXT_COL = "text";
    static final String TIMESTAMP_COL = "timestamp";

    DBHelper(Context context)
    {
        super(context, "barcode_scanner_history.db", null, 5);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE history (id INTEGER PRIMARY KEY, text TEXT, format TEXT, display TEXT, timestamp INTEGER, details TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS history");
        onCreate(sqlitedatabase);
    }
}
