// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.b;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;
import com.facebook.debug.log.b;

public class c extends d
{

    private static final Class a = com/facebook/zero/b/c;

    public c()
    {
        super("zero_rating", 1);
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE zero_rating_db_key_value_properties_table (key TEXT PRIMARY KEY, value TEXT)");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Upgrading part from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS zero_rating_db_key_value_properties_table");
    }

    public void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("zero_rating_db_key_value_properties_table", null, null);
    }

}
