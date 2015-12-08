// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class dmm
{

    private static final String a[] = {
        "media_id"
    };

    static Cursor a(SQLiteDatabase sqlitedatabase, long l)
    {
        return sqlitedatabase.query("chapters", a, "start_timestamp = ?", new String[] {
            String.valueOf(l)
        }, null, null, null);
    }

}
