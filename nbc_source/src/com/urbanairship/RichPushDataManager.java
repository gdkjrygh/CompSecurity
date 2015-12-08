// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.urbanairship.util.DataManager;

class RichPushDataManager extends DataManager
{

    private static final String DATABASE_NAME = "ua_richpush.db";
    private static final int DATABASE_VERSION = 3;
    public static final String TABLE_NAME = "richpush";

    RichPushDataManager(Context context)
    {
        super(context, "ua_richpush.db", 3);
    }

    protected void bindValuesToSqlLiteStatment(SQLiteStatement sqlitestatement, ContentValues contentvalues)
    {
        bind(sqlitestatement, 1, contentvalues.getAsString("message_id"));
        bind(sqlitestatement, 2, contentvalues.getAsString("message_url"));
        bind(sqlitestatement, 3, contentvalues.getAsString("message_body_url"));
        bind(sqlitestatement, 4, contentvalues.getAsString("message_read_url"));
        bind(sqlitestatement, 5, contentvalues.getAsString("title"));
        bind(sqlitestatement, 6, contentvalues.getAsString("extra"));
        bind(sqlitestatement, 7, contentvalues.getAsBoolean("unread"), Boolean.valueOf(true));
        bind(sqlitestatement, 8, contentvalues.getAsBoolean("unread_orig"));
        bind(sqlitestatement, 9, contentvalues.getAsBoolean("deleted"), Boolean.valueOf(false));
        bind(sqlitestatement, 10, contentvalues.getAsString("timestamp"));
        bind(sqlitestatement, 11, contentvalues.getAsString("raw_message_object"));
        bind(sqlitestatement, 12, contentvalues.getAsString("expiration_timestamp"));
    }

    protected SQLiteStatement getInsertStatement(String s, SQLiteDatabase sqlitedatabase)
    {
        return sqlitedatabase.compileStatement(buildInsertStatement(s, new String[] {
            "message_id", "message_url", "message_body_url", "message_read_url", "title", "extra", "unread", "unread_orig", "deleted", "timestamp", 
            "raw_message_object", "expiration_timestamp"
        }));
    }

    protected void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS richpush (_id INTEGER PRIMARY KEY AUTOINCREMENT, message_id TEXT UNIQUE, message_url TEXT, message_body_url TEXT, message_read_url TEXT, title TEXT, extra TEXT, unread INTEGER, unread_orig INTEGER, deleted INTEGER, timestamp TEXT, raw_message_object TEXT,expiration_timestamp TEXT);");
    }

    protected void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS richpush");
        onCreate(sqlitedatabase);
    }

    protected void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (i)
        {
        default:
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS richpush");
            return;

        case 1: // '\001'
            sqlitedatabase.execSQL("ALTER TABLE richpush ADD COLUMN raw_message_object TEXT;");
            // fall through

        case 2: // '\002'
            sqlitedatabase.execSQL("ALTER TABLE richpush ADD COLUMN expiration_timestamp TEXT;");
            break;
        }
    }
}
