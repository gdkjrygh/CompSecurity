// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewr
    implements eut
{

    ewr()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE search_results");
        sqlitedatabase.execSQL("CREATE TABLE search_results (_id INTEGER PRIMARY KEY, all_media_id INTEGER NOT NULL REFERENCES media(_id) ON UPDATE CASCADE,dedup_key TEXT NOT NULL, capture_timestamp INTEGER NOT NULL, search_query TEXT NOT NULL, is_rejected INTEGER NOT NULL DEFAULT 0, date_header_start_timestamp INTEGER, UNIQUE(dedup_key, search_query))");
        sqlitedatabase.execSQL("CREATE UNIQUE INDEX main_search_media_idx ON search_results (search_query, dedup_key, is_rejected)");
    }
}
