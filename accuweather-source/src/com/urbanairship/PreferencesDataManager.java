// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.urbanairship.util.DataManager;

class PreferencesDataManager extends DataManager
{

    static final String COLUMN_NAME_KEY = "_id";
    static final String COLUMN_NAME_VALUE = "value";
    static final String DATABASE_NAME = "ua_preferences.db";
    static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "preferences";
    protected static final String WHERE_CLAUSE_KEY = "_id = ?";

    public PreferencesDataManager(Context context)
    {
        super(context, "ua_preferences.db", 1);
    }

    protected void bindValuesToSqlLiteStatment(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        bind(sqlitestatement, 1, contentvalues.getAsString("_id"));
        bind(sqlitestatement, 2, contentvalues.getAsString("value"));
    }

    protected SQLiteStatement getInsertStatement(String s, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.compileStatement(buildInsertStatement(s, new String[] {
            "_id", "value"
        }));
    }

    protected void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (_id TEXT PRIMARY KEY, value TEXT);");
    }

    protected void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS preferences");
        onCreate(sqlitedatabase);
    }
}
