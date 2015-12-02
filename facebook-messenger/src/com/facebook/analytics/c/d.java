// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.c;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.debug.log.b;

public class d extends com.facebook.d.d.d
{

    private static final Class a = com/facebook/analytics/c/d;

    public d()
    {
        super("analytics", 4);
    }

    protected void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE analytics_db_properties (key TEXT PRIMARY KEY, value TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE events (bid TEXT, type TEXT, data TEXT, timestamp INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE batches (id TEXT, sid TEXT, uid INTEGER, seq INTEGER, timestamp INTEGER, active INTEGER, meta TEXT, PRIMARY KEY (id))");
        sqlitedatabase.execSQL("create table counter_names(_id integer primary key autoincrement, name text not null,  unique(name) on conflict ignore);");
        sqlitedatabase.execSQL("create index counter_names_index on counter_names(name)");
        sqlitedatabase.execSQL("create table counter_values(time integer, counter integer references counter_names(_id), value integer);");
        sqlitedatabase.execSQL("create view view_counter as select time, name, value from counter_names join counter_values where _id = counter");
    }

    protected void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        b.d(a, (new StringBuilder()).append("Upgrading part from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS analytics_db_properties");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS batches");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS events");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS counter_values");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS counter_names_index");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS counter_names");
        sqlitedatabase.execSQL("DROP VIEW IF EXISTS view_counter");
        a(sqlitedatabase);
    }

}
