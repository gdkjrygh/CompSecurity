// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPDbAdapter

class a extends SQLiteOpenHelper
{

    private final File a;

    public void a()
    {
        close();
        a.delete();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(MPDbAdapter.b());
        sqlitedatabase.execSQL(MPDbAdapter.c());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL((new StringBuilder()).append("DROP TABLE IF EXISTS ").append(a.a()).toString());
        sqlitedatabase.execSQL(MPDbAdapter.b());
        sqlitedatabase.execSQL(MPDbAdapter.c());
    }

    A(Context context, String s)
    {
        super(context, s, null, 4);
        a = context.getDatabasePath(s);
    }
}
