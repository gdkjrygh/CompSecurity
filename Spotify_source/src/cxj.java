// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import java.io.File;

public final class cxj extends SQLiteOpenHelper
{

    public final File a;
    public final cxi b;

    public cxj(Context context, String s)
    {
        super(context, s, null, 4);
        a = context.getDatabasePath(s);
        b = cxi.a(context);
    }

    public final void a()
    {
        close();
        a.delete();
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        }
        sqlitedatabase.execSQL(MPDbAdapter.a());
        sqlitedatabase.execSQL(MPDbAdapter.b());
        sqlitedatabase.execSQL(MPDbAdapter.c());
        sqlitedatabase.execSQL(MPDbAdapter.d());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        }
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(com.mixpanel.android.mpmetrics.MPDbAdapter.Table.a.mTableName).toString());
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(com.mixpanel.android.mpmetrics.MPDbAdapter.Table.b.mTableName).toString());
        sqlitedatabase.execSQL(MPDbAdapter.a());
        sqlitedatabase.execSQL(MPDbAdapter.b());
        sqlitedatabase.execSQL(MPDbAdapter.c());
        sqlitedatabase.execSQL(MPDbAdapter.d());
    }
}
