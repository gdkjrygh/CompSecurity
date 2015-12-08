// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewn
    implements eut
{

    ewn()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("ALTER TABLE media ADD COLUMN month_random_timestamp INTEGER NOT NULL DEFAULT 0");
        sqlitedatabase.execSQL("CREATE INDEX month_random_timestamp_idx ON media (is_hidden, is_deleted, month_random_timestamp)");
    }
}
