// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ews
    implements eut
{

    ews()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        mvj.a(sqlitedatabase, new String[] {
            "search_results"
        });
        sqlitedatabase.execSQL("CREATE TABLE search_results (dedup_key TEXT NOT NULL, search_query TEXT NOT NULL, is_rejected INTEGER NOT NULL DEFAULT 0, date_header_start_timestamp INTEGER, PRIMARY KEY (dedup_key, search_query))");
        sqlitedatabase.execSQL("CREATE UNIQUE INDEX main_search_media_idx ON search_results(search_query, dedup_key, is_rejected)");
    }
}
