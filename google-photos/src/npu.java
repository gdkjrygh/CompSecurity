// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class npu extends SQLiteOpenHelper
{

    public npu(Context context)
    {
        super(context, "networkstatistics.sqlite", null, 1);
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE historical_speed(day INTEGER NOT NULL, hour INTEGER NOT NULL, speed INTEGER NOT NULL,  timestamp DATETIME DEFAULT CURRENT_TIMESTAMP);");
        sqlitedatabase.execSQL(String.format("CREATE UNIQUE INDEX day_index ON %s (%s, %s)", new Object[] {
            "historical_speed", "day", "hour"
        }));
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTShistorical_speed;");
        onCreate(sqlitedatabase);
    }
}
