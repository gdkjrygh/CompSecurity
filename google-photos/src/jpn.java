// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class jpn extends SQLiteOpenHelper
{

    public jpn(jpm jpm1, Context context, String s)
    {
        super(context, s, null, 4);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(jpm.d());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        (new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString();
        b.p(4);
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }
}
