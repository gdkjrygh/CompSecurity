// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class evl
    implements evk
{

    private static final String a[] = {
        "_id", "protobuf"
    };
    private final evs b;
    private final noz c;

    private evl(Context context)
    {
        c = noz.a(context, "AssocEnvelopeProcessor", new String[0]);
        b = new evs(context, 71);
    }

    static ezz a(Context context)
    {
        return new ezz(context, evt.e, new evl(context), "AssocEnvelopeProcessor");
    }

    static String[] a()
    {
        return a;
    }

    public final int a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = new evm(sqlitedatabase, c);
        b.a(500, sqlitedatabase);
        return ((evm) (sqlitedatabase)).a;
    }

    public final boolean a(int i)
    {
        return b.a(i);
    }

}
