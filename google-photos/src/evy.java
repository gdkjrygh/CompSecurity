// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class evy
    implements eut
{

    evy()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE external_deleted_media (local_dedup_key TEXT PRIMARY KEY NOT NULL, entry_timestamp INTEGER NOT NULL )");
    }
}
