// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            DaoMaster

public static abstract class y extends SQLiteOpenHelper
{

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Log.i("greenDAO", "Creating tables for schema version 153");
        DaoMaster.createAllTables(sqlitedatabase, false);
    }

    public y(Context context, String s, android.database.sqlite.Factory factory)
    {
        super(context, s, factory, 153);
    }
}
