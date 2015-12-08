// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewp
    implements eut
{

    ewp()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP INDEX envelope_start_time_idx");
        sqlitedatabase.execSQL("DROP TABLE envelopes");
        sqlitedatabase.execSQL("CREATE TABLE envelopes (media_key TEXT PRIMARY KEY NOT NULL, title TEXT, auth_key TEXT, short_url TEXT, is_pinned INTEGER NOT NULL DEFAULT 0, is_joined INTEGER NOT NULL DEFAULT 0, is_collaborative INTEGER NOT NULL DEFAULT 0, cover_item_media_key TEXT, current_sync_token TEXT, next_sync_token TEXT, resume_token TEXT, owner_actor_id TEXT NOT NULL, start_time_ms DATETIME, end_time_ms DATETIME, protobuf BLOB)");
        sqlitedatabase.execSQL("CREATE INDEX envelope_start_time_idx ON envelopes (start_time_ms DESC)");
    }
}
