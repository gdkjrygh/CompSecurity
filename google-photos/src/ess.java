// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

final class ess
    implements etx
{

    private static final String a[] = {
        "utc_timestamp", "timezone_offset", "dedup_key"
    };
    private final String b;
    private final String c;
    private final eun d;
    private final String e[];

    public ess(String s, String s1, String s2, eun eun)
    {
        b = s;
        c = s1;
        e = (new String[] {
            s2
        });
        d = eun;
    }

    public final evh a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query(b, a, c, e, null, null, null);
        boolean flag = sqlitedatabase.moveToFirst();
        if (!flag)
        {
            sqlitedatabase.close();
            return null;
        }
        evh evh1 = new evh(sqlitedatabase.getString(sqlitedatabase.getColumnIndexOrThrow("dedup_key")), sqlitedatabase.getLong(sqlitedatabase.getColumnIndexOrThrow("utc_timestamp")), sqlitedatabase.getLong(sqlitedatabase.getColumnIndexOrThrow("timezone_offset")));
        sqlitedatabase.close();
        return evh1;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    public final Long a()
    {
        return null;
    }

    public final boolean a(Context context, int i, SQLiteDatabase sqlitedatabase)
    {
        context = new eui();
        context.a(d);
        context = ((eui) (context)).b;
        return sqlitedatabase.update(b, context, c, e) > 0;
    }

    public final Long b()
    {
        return null;
    }

}
