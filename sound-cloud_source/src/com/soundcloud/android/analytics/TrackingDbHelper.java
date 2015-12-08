// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import com.soundcloud.propeller.schema.Table;

class TrackingDbHelper extends SQLiteOpenHelper
{
    abstract class TrackingColumns
        implements BaseColumns
    {

        static final String BACKEND = "backend";
        static final String DATA = "data";
        static final String TIMESTAMP = "timestamp";
        final TrackingDbHelper this$0;

        TrackingColumns()
        {
            this$0 = TrackingDbHelper.this;
            super();
        }
    }


    static final String DATABASE_CREATE_EVENTS_TABLE;
    private static final String DATABASE_NAME = "SoundCloud-tracking.sqlite";
    private static final int DATABASE_VERSION = 5;
    static final Table EVENTS_TABLE;

    TrackingDbHelper(Context context)
    {
        super(context, "SoundCloud-tracking.sqlite", null, 5);
    }

    private void onRecreateDb(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(EVENTS_TABLE.name()).toString());
        onCreate(sqlitedatabase);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(DATABASE_CREATE_EVENTS_TABLE);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        onRecreateDb(sqlitedatabase);
    }

    static 
    {
        EVENTS_TABLE = new _cls1();
        DATABASE_CREATE_EVENTS_TABLE = (new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(EVENTS_TABLE.name()).append("(_id INTEGER PRIMARY KEY,timestamp INTEGER NOT NULL,backend STRING NOT NULL,data STRING NOT NULL,UNIQUE (timestamp, backend, data) ON CONFLICT IGNORE)").toString();
    }

    private class _cls1
        implements Table
    {

        public final String name()
        {
            return "events";
        }

        public final com.soundcloud.propeller.schema.Table.PrimaryKey primaryKey()
        {
            return com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "_id"
            });
        }

        _cls1()
        {
        }
    }

}
