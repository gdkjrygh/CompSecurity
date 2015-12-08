// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class ewo
    implements eut
{

    ewo()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE partition_version (id INTEGER PRIMARY KEY, created_at_version INTEGER NOT NULL)");
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", Integer.valueOf(1));
        contentvalues.put("created_at_version", Integer.valueOf(1));
        sqlitedatabase.insert("partition_version", null, contentvalues);
    }
}
