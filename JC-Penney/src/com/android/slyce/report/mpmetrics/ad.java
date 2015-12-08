// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ab, ac, ae

class ad extends SQLiteOpenHelper
{

    private final File a;

    ad(Context context, String s)
    {
        super(context, s, null, 4);
        a = context.getDatabasePath(s);
    }

    public void a()
    {
        close();
        a.delete();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        }
        sqlitedatabase.execSQL(ac.b());
        sqlitedatabase.execSQL(ac.c());
        sqlitedatabase.execSQL(ac.d());
        sqlitedatabase.execSQL(ac.e());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(ae.a.a()).toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(ae.b.a()).toString());
        sqlitedatabase.execSQL(ac.b());
        sqlitedatabase.execSQL(ac.c());
        sqlitedatabase.execSQL(ac.d());
        sqlitedatabase.execSQL(ac.e());
    }
}
