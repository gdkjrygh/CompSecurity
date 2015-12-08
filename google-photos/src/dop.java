// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

final class dop
    implements evf
{

    private final Context a;

    dop(Context context)
    {
        a = context;
    }

    public final void a(SQLiteDatabase sqlitedatabase, int i)
    {
        Object obj = new dos(a);
        sqlitedatabase.delete("chapters", null, null);
        for (obj = ((dos) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); ((eru)((Iterator) (obj)).next()).a(sqlitedatabase, i)) { }
    }

    public final boolean a()
    {
        return true;
    }

    public final evg b(SQLiteDatabase sqlitedatabase, int i)
    {
        return new doq(a, sqlitedatabase, i, new dos(a));
    }
}
