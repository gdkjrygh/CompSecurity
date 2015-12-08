// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.google.android.gms.internal:
//            eh, gr

public class sorFactory extends SQLiteOpenHelper
{

    final eh tc;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(eh.cB());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        gr.U((new StringBuilder()).append("Database updated from version ").append(i).append(" to version ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }

    public sorFactory(eh eh1, Context context, String s)
    {
        tc = eh1;
        super(context, s, null, 4);
    }
}
