// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.orm:
//            SugarDb

public class Database
{

    private SQLiteDatabase sqLiteDatabase;
    private SugarDb sugarDb;

    public Database(Context context)
    {
        sugarDb = new SugarDb(context);
    }

    public SQLiteDatabase getDB()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        if (sqLiteDatabase == null)
        {
            sqLiteDatabase = sugarDb.getWritableDatabase();
        }
        sqlitedatabase = sqLiteDatabase;
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }
}
