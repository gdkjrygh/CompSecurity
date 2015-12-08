// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public final class mrj
    implements mvi
{

    public mrj()
    {
    }

    public final String a()
    {
        return "album_upload";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE album_upload_batch (_id INTEGER PRIMARY KEY AUTOINCREMENT, album_id TEXT NOT NULL, created_time INTEGER NOT NULL)");
        sqlitedatabase.execSQL(mrg.a);
        sqlitedatabase.execSQL("CREATE INDEX album_upload_batch_album_idx ON album_upload_batch (album_id)");
        sqlitedatabase.execSQL("CREATE INDEX album_upload_media_batch_idx ON album_upload_media (batch_id,status)");
        sqlitedatabase.execSQL("CREATE INDEX album_upload_media_status_idx ON album_upload_media (status)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        if (Log.isLoggable("AlbumUploadDatabase", 4))
        {
            (new StringBuilder(45)).append("Upgrade database: ").append(j).append(" --> ").append(k);
        }
        if (j < 3)
        {
            return false;
        }
        if (j == 3)
        {
            sqlitedatabase.execSQL("ALTER TABLE album_upload_media ADD COLUMN media_key TEXT NOT NULL DEFAULT ''");
        }
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "album_upload_batch", "album_upload_media"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 4;
    }
}
