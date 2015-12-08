// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class etm
    implements etx
{

    final String a;
    final String b;
    final long c;
    final long d;
    final etl e;

    public etm(String s, String s1, long l, long l1, noz noz)
    {
        a = s;
        b = s1;
        c = l;
        d = l1;
        e = new etl(this, noz);
    }

    public evh a(SQLiteDatabase sqlitedatabase)
    {
        return new evh(b, c, d);
    }

    public Long a()
    {
        return Long.valueOf(c);
    }

    public void a(qgg qgg1)
    {
        if (qgg1.c == null)
        {
            qgg1.c = new qeq();
        }
        if (qgg1.c.k == null)
        {
            qgg1.c.k = new qes();
        }
        qgg1.c.k.a = new int[0];
    }

    public boolean a(Context context, int i, SQLiteDatabase sqlitedatabase)
    {
        context = new ContentValues();
        etl etl1 = e;
        qgg qgg1 = etl1.a(sqlitedatabase);
        if (qgg1 != null)
        {
            etl1.a.a(qgg1);
            context.put("protobuf", qgg.a(qgg1));
        }
        context.put("is_hidden", Integer.valueOf(0));
        return sqlitedatabase.update("remote_media", context, "media_key = ?", new String[] {
            a
        }) != 0;
    }

    public Long b()
    {
        return Long.valueOf(d);
    }

    public String c()
    {
        return a;
    }
}
