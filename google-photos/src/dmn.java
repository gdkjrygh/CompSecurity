// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class dmn
{

    private static final String a[] = {
        "start_timestamp"
    };

    static long a(SQLiteDatabase sqlitedatabase, int i)
    {
        return b(sqlitedatabase, i);
    }

    private static long b(SQLiteDatabase sqlitedatabase, int i)
    {
        sqlitedatabase = sqlitedatabase.query("chapters", a, null, null, "start_timestamp", null, "start_timestamp DESC", (new StringBuilder(13)).append(i).append(",1").toString());
        long l;
        if (!sqlitedatabase.moveToNext())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        l = sqlitedatabase.getLong(0);
        sqlitedatabase.close();
        return l;
        sqlitedatabase.close();
        return -1L;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

}
