// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class fpz
    implements mvi
{

    fpz()
    {
    }

    public final String a()
    {
        return "JobQueuePartition";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE job_queue_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, subsystem_id TEXT NOT NULL, network_required INTEGER, job_data BLOB)");
        sqlitedatabase.execSQL("CREATE INDEX main_job_queue_index ON job_queue_table (subsystem_id)");
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
            "job_queue_table"
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
