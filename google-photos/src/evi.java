// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class evi
    implements evk
{

    private static final String a[] = {
        "_id", "position", "protobuf"
    };
    private final evs b;
    private final noz c;

    private evi(Context context)
    {
        c = noz.a(context, "AlbumOrderProcessor", new String[0]);
        b = new evs(context, 52);
    }

    static ezz a(Context context)
    {
        return new ezz(context, evt.d, new evi(context), "AlbumOrderProcessor");
    }

    static String[] a()
    {
        return a;
    }

    public final int a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = new evj(sqlitedatabase, c);
        b.a(2000, sqlitedatabase);
        return ((evj) (sqlitedatabase)).a;
    }

    public final boolean a(int i)
    {
        return b.a(i);
    }

}
