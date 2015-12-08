// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

public final class div
    implements mvi
{

    public div()
    {
    }

    public final String a()
    {
        return "photos_action_queue";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE action_queue (entity_type INTEGER NOT NULL, entity_blob BLOB NOT NULL, fetch_count INTEGER NOT NULL DEFAULT 0, schedule_timestamp INTEGER(4) NOT NULL, creation_timestamp INTEGER(4) NOT NULL)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        return false;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "action_queue"
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
