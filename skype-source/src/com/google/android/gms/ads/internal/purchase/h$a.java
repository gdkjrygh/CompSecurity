// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            h

public final class ory extends SQLiteOpenHelper
{

    final h a;

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(com.google.android.gms.ads.internal.purchase.h.b());
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        b.b((new StringBuilder("Database updated from version ")).append(i).append(" to version ").append(j).toString());
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
        onCreate(sqlitedatabase);
    }

    public ory(h h1, Context context, String s)
    {
        a = h1;
        super(context, s, null, 4);
    }
}
