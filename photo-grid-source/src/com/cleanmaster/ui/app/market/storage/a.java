// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.data.PackageStatInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class a extends SQLiteOpenHelper
{

    public a(Context context)
    {
        super(context, "market.db", null, 43);
    }

    private static List a(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        obj = new ArrayList();
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table';", null);
        sqlitedatabase.moveToFirst();
        for (; !sqlitedatabase.isAfterLast(); sqlitedatabase.moveToNext())
        {
            String s = sqlitedatabase.getString(1);
            if (!s.equals("android_metadata") && !s.equals("sqlite_sequence"))
            {
                ((List) (obj)).add(s);
            }
        }

        break MISSING_BLOCK_LABEL_89;
        obj;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return ((List) (obj));
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        PackageStatInfo.createTable(sqlitedatabase, "tbl_apps_update");
        Ad.createTable(sqlitedatabase, "tbl_41");
        com.cleanmaster.ui.app.market.data.a.a(sqlitedatabase, "tbl_market_globel_property");
        Ad.createTable(sqlitedatabase, "tbl_downloading_apps");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        String s;
        for (Iterator iterator = a(sqlitedatabase).iterator(); iterator.hasNext(); sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString()))
        {
            s = (String)iterator.next();
        }

        onCreate(sqlitedatabase);
    }
}
