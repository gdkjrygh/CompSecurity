// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewb
    implements eut
{

    ewb()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE album_enrichments (_id INTEGER PRIMARY KEY, enrichment_media_key STRING UNIQUE NOT NULL, collection_media_key STRING NOT NULL, position REAL NOT NULL, protobuf BLOB NOT NULL)");
    }
}
