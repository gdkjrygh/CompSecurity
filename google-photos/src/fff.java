// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

public final class fff
    implements mvi
{

    public fff()
    {
    }

    public final String a()
    {
        return "SyncStatusDbPartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        for (int i = 0; i <= 0; i++)
        {
            sqlitedatabase.execSQL((new String[] {
                "CREATE TABLE sync_status (sync_data_kind INTEGER PRIMARY KEY,last_sync INT NOT NULL);"
            })[0]);
        }

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
            "sync_status"
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
