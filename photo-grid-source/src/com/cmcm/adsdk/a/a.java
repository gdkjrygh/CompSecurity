// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.cmcm.adsdk.b.a.c;

public final class a extends SQLiteOpenHelper
{

    public a(Context context)
    {
        super(context, "ad_sdk.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        c.a(sqlitedatabase, "posinfo");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        c.b(sqlitedatabase, "posinfo");
        onCreate(sqlitedatabase);
    }
}
