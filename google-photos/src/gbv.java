// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class gbv
    implements mvi
{

    gbv()
    {
    }

    public final String a()
    {
        return "com.google.android.apps.photos.mediasync.MediaSyncPartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE media_sync_table(url TEXT NOT NULL, width INTEGER NOT NULL, height INTEGER NOT NULL, sync_time INTEGER NOT NULL)");
        sqlitedatabase.execSQL("CREATE INDEX media_sync_main_index ON media_sync_table(url, width, height)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "media_sync_table"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 1;
    }
}
