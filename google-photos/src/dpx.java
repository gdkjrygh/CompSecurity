// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class dpx
    implements dqb
{

    private final long a;
    private final int b;
    private final boolean c;
    private dpw d;

    dpx(dpw dpw1, long l, int i, boolean flag)
    {
        d = dpw1;
        super();
        a = l;
        b = i;
        c = flag;
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.delete(d.a.a, "start_time = ?", dpy.a(a));
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("start_time", Long.valueOf(a));
        contentvalues.put("items_under_header", Integer.valueOf(i));
        sqlitedatabase.insertWithOnConflict(d.a.a, null, contentvalues, 5);
    }

    public final boolean a()
    {
        return c;
    }

    public final long b()
    {
        return a;
    }

    public final int c()
    {
        return b;
    }
}
