// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class dph
{

    final Context a;
    final int b;
    volatile Integer c;

    public dph(Context context, int i)
    {
        a = context;
        b = i;
    }

    static int a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query("all_media_count", null, null, null, null, null, null);
        if (!sqlitedatabase.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("count"));
_L4:
        sqlitedatabase.close();
        return i;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
