// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewe
    implements eut
{

    ewe()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("ALTER TABLE local_media ADD COLUMN auto_backup_state INTEGER NOT NULL DEFAULT 0");
        sqlitedatabase.execSQL("ALTER TABLE local_media ADD COLUMN auto_backup_timestamp INTEGER");
    }
}
