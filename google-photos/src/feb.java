// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class feb extends SQLiteOpenHelper
{

    feb(Context context)
    {
        super(context, "disk_cache", null, 2);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            setWriteAheadLoggingEnabled(true);
        }
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE journal (key STRING PRIMARY KEY, last_modified_time INTEGER NOT NULL, pending_delete INTEGER NOT NULL DEFAULT 0, size INTEGER NOT NULL)");
        sqlitedatabase.execSQL("CREATE INDEX journal_timestamp_key_idx ON journal (last_modified_time, key)");
        sqlitedatabase.execSQL("CREATE TABLE size (id INTEGER PRIMARY KEY, size INTEGER NOT NULL DEFAULT 0)");
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            sqlitedatabase.enableWriteAheadLogging();
        }
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (i < 2)
        {
            mvj.b(sqlitedatabase);
            sqlitedatabase.execSQL("CREATE TABLE journal (key STRING PRIMARY KEY, last_modified_time INTEGER NOT NULL, pending_delete INTEGER NOT NULL DEFAULT 0, size INTEGER NOT NULL)");
            sqlitedatabase.execSQL("CREATE INDEX journal_timestamp_key_idx ON journal (last_modified_time, key)");
            sqlitedatabase.execSQL("CREATE TABLE size (id INTEGER PRIMARY KEY, size INTEGER NOT NULL DEFAULT 0)");
        }
    }
}
