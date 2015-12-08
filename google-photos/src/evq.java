// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class evq
    implements evk
{

    private final ive a = new ive();
    private final evs b;

    evq(Context context)
    {
        b = new evs(context, 48);
    }

    public final int a(SQLiteDatabase sqlitedatabase)
    {
        ContentValues contentvalues;
        int j;
        int k;
        int l;
        contentvalues = new ContentValues();
        l = 0;
        j = 0;
        k = 0;
_L4:
        int i1;
        i1 = k + l;
        sqlitedatabase.beginTransaction();
        Cursor cursor = evr.a(sqlitedatabase, j, 2000);
        int i = 0;
_L2:
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = cursor.getLong(0);
        long l2 = cursor.getLong(1);
        l2 = a.b(l2);
        contentvalues.clear();
        contentvalues.put("month_random_timestamp", Long.valueOf(l2));
        sqlitedatabase.update("media", contentvalues, "_id = ?", new String[] {
            Long.toString(l1)
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        cursor.close();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        j += 2000;
        l = i;
        k = i1;
        if (i > 0) goto _L4; else goto _L3
_L3:
        return i1;
        Exception exception1;
        exception1;
        cursor.close();
        throw exception1;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public final boolean a(int i)
    {
        return b.a(i);
    }
}
