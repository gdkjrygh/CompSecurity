// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class gut
    implements mvi
{

    gut()
    {
    }

    public final String a()
    {
        return "PhotoEditorPartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE edits (_id INTEGER PRIMARY KEY, original_uri TEXT NOT NULL,original_fingerprint TEXT NOT NULL, media_store_uri TEXT,media_store_fingerprint TEXT,app_id INTEGER NOT NULL, edit_data BLOB, status INT NOT NULL DEFAULT 0)");
        sqlitedatabase.execSQL("CREATE INDEX edit_media_store_uri_idx ON edits (media_store_uri)");
        sqlitedatabase.execSQL("CREATE INDEX edit_original_uri_idx ON edits (original_uri)");
        sqlitedatabase.execSQL("CREATE INDEX edit_status_idx ON edits (status)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        return j >= 5;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "edits"
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
