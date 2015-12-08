// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.google.android.gms.internal:
//            cy, ev

public class sorFactory extends SQLiteOpenHelper
{

    final cy ps;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(cy.bg());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        ev.B((new StringBuilder()).append("Database updated from version ").append(i).append(" to version ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }

    public sorFactory(cy cy1, Context context, String s)
    {
        ps = cy1;
        super(context, s, null, 4);
    }
}
