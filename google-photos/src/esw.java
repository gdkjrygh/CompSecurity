// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class esw
    implements etx
{

    private final ContentValues a;
    private final String b;
    private final ContentValues c;
    private final String d;
    private final String e;
    private final qgg f;

    public esw(ContentValues contentvalues, String s, ContentValues contentvalues1, String s1, String s2)
    {
        this(contentvalues, s, contentvalues1, s1, s2, null);
    }

    public esw(ContentValues contentvalues, String s, ContentValues contentvalues1, String s1, String s2, qgg qgg)
    {
        a = contentvalues;
        b = s;
        c = contentvalues1;
        d = s1;
        e = s2;
        f = qgg;
    }

    public final evh a(SQLiteDatabase sqlitedatabase)
    {
        return new evh(a.getAsString("dedup_key"), a.getAsLong("utc_timestamp").longValue(), a.getAsLong("timezone_offset").longValue(), f);
    }

    public final Long a()
    {
        return c.getAsLong(d);
    }

    public final boolean a(Context context, int i, SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.insertWithOnConflict("media", null, a, 4);
        sqlitedatabase.insertWithOnConflict(b, null, c, 5);
        return true;
    }

    public final Long b()
    {
        return c.getAsLong(e);
    }
}
