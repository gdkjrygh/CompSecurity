// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.a.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.mobvista.sdk.m.a.a.a:
//            a

final class b extends SQLiteOpenHelper
{

    final a a;

    public b(a a1, Context context, String s, int i)
    {
        a = a1;
        super(context, s, null, i);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a.a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a.b(sqlitedatabase);
    }
}
