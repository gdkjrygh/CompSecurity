// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.platforms.fitbit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.fitbit.analytics.platforms.fitbit:
//            DbAdapter, b

private static class a extends SQLiteOpenHelper
{

    private final File a;

    public void a()
    {
        close();
        a.delete();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (b.a)
        {
            Log.d("FitbitAnalytics", "Creating FitbitAnalytics database...");
        }
        sqlitedatabase.execSQL(DbAdapter.b());
        sqlitedatabase.execSQL(DbAdapter.c());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (b.a)
        {
            Log.d("FitbitAnalytics", "Upgrading FitbitAnalytics database...");
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(ble.a.a()).toString());
        sqlitedatabase.execSQL(DbAdapter.b());
        sqlitedatabase.execSQL(DbAdapter.c());
    }

    ry(Context context, String s)
    {
        super(context, s, null, 1);
        a = context.getDatabasePath(s);
    }
}
