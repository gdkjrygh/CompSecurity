// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.google.android.gms.internal:
//            ec, gs

public class sorFactory extends SQLiteOpenHelper
{

    final ec sJ;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(ec.cs());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        gs.U((new StringBuilder()).append("Database updated from version ").append(i).append(" to version ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }

    public sorFactory(ec ec1, Context context, String s)
    {
        sJ = ec1;
        super(context, s, null, 4);
    }
}
