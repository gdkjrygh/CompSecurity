// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.orm:
//            Database

public class SugarApp extends Application
{

    private static SugarApp sugarContext;
    private Database database;

    public SugarApp()
    {
    }

    public static SugarApp getSugarContext()
    {
        return sugarContext;
    }

    protected Database getDatabase()
    {
        return database;
    }

    public void onCreate()
    {
        super.onCreate();
        sugarContext = this;
        database = new Database(this);
    }

    public void onTerminate()
    {
        if (database != null)
        {
            database.getDB().close();
        }
        super.onTerminate();
    }
}
