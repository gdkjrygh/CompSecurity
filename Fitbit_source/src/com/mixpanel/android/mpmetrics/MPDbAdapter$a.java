// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPDbAdapter, g

private static class b extends SQLiteOpenHelper
{

    private final File a;
    private final g b;

    public void a()
    {
        close();
        a.delete();
    }

    public boolean b()
    {
        return !a.exists() || Math.max(a.getUsableSpace(), b.d()) >= a.length();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (g.b)
        {
            Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        }
        sqlitedatabase.execSQL(MPDbAdapter.c());
        sqlitedatabase.execSQL(MPDbAdapter.d());
        sqlitedatabase.execSQL(MPDbAdapter.e());
        sqlitedatabase.execSQL(MPDbAdapter.f());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (g.b)
        {
            Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(ble.a.a()).toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(ble.b.a()).toString());
        sqlitedatabase.execSQL(MPDbAdapter.c());
        sqlitedatabase.execSQL(MPDbAdapter.d());
        sqlitedatabase.execSQL(MPDbAdapter.e());
        sqlitedatabase.execSQL(MPDbAdapter.f());
    }

    Factory(Context context, String s)
    {
        super(context, s, null, 4);
        a = context.getDatabasePath(s);
        b = g.a(context);
    }
}
