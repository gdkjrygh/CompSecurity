// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class evx
    implements eut
{

    evx()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE actors (media_key TEXT PRIMARY KEY NOT NULL, gaia_id TEXT UNIQUE, display_name TEXT, profile_photo_url TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE envelope_members (envelope_media_key TEXT NOT NULL, actor_id TEXT NOT NULL, is_owner INTEGER NOT NULL DEFAULT 0, write_time_ms INTEGER, PRIMARY KEY (envelope_media_key, actor_id))");
    }
}
