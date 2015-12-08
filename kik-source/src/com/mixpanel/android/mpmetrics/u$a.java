// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            u, t

private static final class Path extends SQLiteOpenHelper
{

    private final File a;

    public final void a()
    {
        close();
        a.delete();
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = t.a;
        sqlitedatabase.execSQL(u.b());
        sqlitedatabase.execSQL(u.c());
        sqlitedatabase.execSQL(u.d());
        sqlitedatabase.execSQL(u.e());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        boolean flag = t.a;
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(a.a()).toString());
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(b.a()).toString());
        sqlitedatabase.execSQL(u.b());
        sqlitedatabase.execSQL(u.c());
        sqlitedatabase.execSQL(u.d());
        sqlitedatabase.execSQL(u.e());
    }

    CursorFactory(Context context, String s)
    {
        super(context, s, null, 4);
        a = context.getDatabasePath(s);
    }
}
