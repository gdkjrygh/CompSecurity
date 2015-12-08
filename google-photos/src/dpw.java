// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public final class dpw
{

    final esq a;
    private final dpz b;

    public dpw(esq esq1, dpz dpz1)
    {
        a = esq1;
        b = dpz1;
    }

    private int b(SQLiteDatabase sqlitedatabase, long l)
    {
        sqlitedatabase = sqlitedatabase.query(a.a, dpy.a(), "start_time = ?", dpy.a(l), null, null, null);
        int i;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("items_under_header"));
        sqlitedatabase.close();
        return i;
        sqlitedatabase.close();
        return -1;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    public final dqb a(SQLiteDatabase sqlitedatabase, long l)
    {
        boolean flag = false;
        l = b.a(l);
        int j = b(sqlitedatabase, l);
        int i;
        if (j == -1)
        {
            i = 0;
        } else
        {
            i = j;
        }
        if (j == -1)
        {
            flag = true;
        }
        return new dpx(this, l, i, flag);
    }

    public final List a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query(a.a, dqa.a, null, null, null, null, "start_time DESC");
        Object obj;
        obj = new ArrayList(sqlitedatabase.getCount());
        for (; sqlitedatabase.moveToNext(); ((List) (obj)).add(new dpx(this, sqlitedatabase.getLong(sqlitedatabase.getColumnIndexOrThrow("start_time")), sqlitedatabase.getInt(sqlitedatabase.getColumnIndexOrThrow("items_under_header")), true))) { }
        break MISSING_BLOCK_LABEL_100;
        obj;
        sqlitedatabase.close();
        throw obj;
        sqlitedatabase.close();
        return ((List) (obj));
    }
}
