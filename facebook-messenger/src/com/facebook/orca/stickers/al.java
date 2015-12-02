// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;
import com.facebook.debug.log.b;

public class al extends d
{

    private static final Class a = com/facebook/orca/stickers/al;

    public al()
    {
        super("stickers", 4);
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE pack_lists (type INTEGER PRIMARY KEY, serialized_list TEXT, last_fetch_time_ms INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE recent_stickers (list TEXT)");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data.").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS pack_lists");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS recent_stickers");
        a(sqlitedatabase);
    }

    public void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("pack_lists", null, null);
        sqlitedatabase.delete("recent_stickers", null, null);
    }

}
