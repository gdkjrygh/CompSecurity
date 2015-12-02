// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.c;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.d;

public class a extends d
{

    private static final Class a = com/facebook/abtest/qe/c/a;

    public a()
    {
        super("quick_experiment", 4);
    }

    protected void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE experiments (name TEXT, groupName TEXT, hash TEXT, loggingEnabled INTEGER, locale TEXT, customContentJSON TEXT, dataSource TEXT, meta_info TEXT,PRIMARY KEY (name, dataSource))");
    }

    protected void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS experiments");
        a(sqlitedatabase);
    }

    void b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete("experiments", null, null);
    }

}
