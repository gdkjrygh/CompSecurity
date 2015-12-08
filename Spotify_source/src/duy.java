// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class duy extends SQLiteOpenHelper
{

    private duy(Context context)
    {
        super(context, "cached_logs.db", null, 1);
    }

    public duy(Context context, byte byte0)
    {
        this(context);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE log (_ID INTEGER PRIMARY KEY,source_uri TEXT,context TEXT,event TEXT,event_version TEXT,test_version TEXT,data TEXT)");
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }
}
