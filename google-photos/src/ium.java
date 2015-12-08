// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

public final class ium
    implements mvi
{

    public ium()
    {
    }

    public final String a()
    {
        return "StoriesDbPartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS stories (_id INTEGER PRIMARY KEY AUTOINCREMENT, story_key TEXT UNIQUE NOT NULL, data BLOB, refresh_timestamp INT, requested_freeze INT, end_timestamp INT);");
        sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS stories_idx ON stories(story_key)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS stories");
        sqlitedatabase.execSQL("DROP INDEX IF EXISTS stories_idx");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS stories (_id INTEGER PRIMARY KEY AUTOINCREMENT, story_key TEXT UNIQUE NOT NULL, data BLOB, refresh_timestamp INT, requested_freeze INT, end_timestamp INT);");
        sqlitedatabase.execSQL("CREATE INDEX IF NOT EXISTS stories_idx ON stories(story_key)");
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "stories"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 5;
    }
}
