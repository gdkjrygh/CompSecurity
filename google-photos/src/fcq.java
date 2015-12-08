// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class fcq
    implements ert
{

    final Map a = new HashMap();
    private final List b;
    private final SQLiteDatabase c;
    private final noz d;

    fcq(List list, SQLiteDatabase sqlitedatabase, Context context)
    {
        b = list;
        c = sqlitedatabase;
        d = noz.a(context, "QueryOriginalBytes", new String[0]);
    }

    public final Cursor a(int i, int j)
    {
        String as[] = (String[])b.subList(j, j + i).toArray(new String[i]);
        mvu mvu1 = new mvu(c);
        mvu1.a = "remote_media";
        mvu1.b = (new String[] {
            "protobuf"
        });
        mvu1.c = b.b("dedup_key", i);
        mvu1.d = as;
        return mvu1.a();
    }

    public final boolean a(Cursor cursor, int i)
    {
        while (cursor.moveToNext()) 
        {
            try
            {
                qgg qgg1 = (qgg)qlw.a(new qgg(), cursor.getBlob(cursor.getColumnIndexOrThrow("protobuf")));
                fco fco1 = fco.a(qgg1.c.o);
                a.put(qgg1.c.l.a, fco1);
            }
            catch (qlv qlv1) { }
        }
        return true;
    }
}
