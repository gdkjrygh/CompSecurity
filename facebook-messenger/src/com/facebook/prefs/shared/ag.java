// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.d.d.b;

public class ag extends SQLiteOpenHelper
{

    private static final Class a = com/facebook/prefs/shared/ag;

    public ag(Context context)
    {
        super(context, "prefs_db", null, 1);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE preferences (key TEXT PRIMARY KEY, type INTEGER, value TEXT)");
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        b.a(sqlitedatabase, 10240);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

}
