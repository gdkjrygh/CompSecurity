// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;
import com.facebook.debug.log.b;

public class y extends d
{

    private static final Class a = com/facebook/prefs/shared/y;

    public y()
    {
        super("preferences", 1);
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE orca_non_cached_preferences (key TEXT PRIMARY KEY, value TEXT)");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        b.d(a, (new StringBuilder()).append("Upgrading part from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS orca_non_cached_preferences");
    }

}
