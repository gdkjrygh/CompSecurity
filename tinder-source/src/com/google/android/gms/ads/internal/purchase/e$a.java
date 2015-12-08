// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            e

public final class ory extends SQLiteOpenHelper
{

    final e a;

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(e.c());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        b.c((new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }

    public ory(e e1, Context context, String s)
    {
        a = e1;
        super(context, s, null, 4);
    }
}
