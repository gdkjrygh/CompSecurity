// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.qihoo.security.support:
//            StatisticianProvider

private static class ry extends SQLiteOpenHelper
{

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        StringBuilder stringbuilder = new StringBuilder(512);
        stringbuilder.append("CREATE TABLE IF NOT EXISTS ").append("logs").append(" (").append("_id").append(" INTEGER PRIMARY KEY autoincrement,").append("sid").append(" INTEGER NOT NULL,").append("sv").append(" TEXT,").append("ts").append(" BIGINT NOT NULL DEFAULT 0,").append("ver").append(" TEXT,").append("r0").append(" TEXT,").append("r1").append(" TEXT);");
        sqlitedatabase.execSQL(stringbuilder.toString());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("ALTER TABLE logs RENAME TO temp_logs");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS logs");
        onCreate(sqlitedatabase);
        sqlitedatabase.execSQL("INSERT INTO logs (sid,sv,ts,ver,r0,r1)  SELECT sid,sv,ts,ver,r0,r1 FROM temp_logs");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS temp_logs");
    }

    public ry(Context context)
    {
        super(context, "statdb.db", null, 2);
    }
}
