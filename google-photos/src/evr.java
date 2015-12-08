// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evr
{

    private static final String a[] = {
        "_id", "capture_timestamp"
    };

    static Cursor a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        return sqlitedatabase.query("media", a, "month_random_timestamp = 0", null, null, null, null, (new StringBuilder(23)).append(i).append(",2000").toString());
    }

}
