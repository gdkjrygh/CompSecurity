// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class esh
    implements err
{

    private int a;
    private qfz b;

    public esh(int i, qfz qfz1)
    {
        a = i;
        b = qfz1;
    }

    public final Object a(SQLiteDatabase sqlitedatabase)
    {
        int i = 0;
        esm esm1 = erz.a(b);
        qfz qfz1 = b;
        int j = esm1.f;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("collection_media_key", qfz1.a.a);
        if (qfz1.a.b != null)
        {
            contentvalues.put("collection_album_id", qfz1.a.b.b);
        }
        if (qfz1.b.i != null)
        {
            contentvalues.put("cover_item_media_key", qfz1.b.i.a);
        }
        pzy apzy[];
        pzy pzy1;
        boolean flag;
        if (qfz1.b.k != null && qfz1.b.k.a != null)
        {
            if (qfz1.b.k.a.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        contentvalues.put("start", qfz1.b.d.a);
        contentvalues.put("end", qfz1.b.d.b);
        contentvalues.put("title", qfz1.b.b);
        contentvalues.put("total_items", qfz1.b.c);
        contentvalues.put("type", Integer.valueOf(j));
        contentvalues.put("protobuf", qlw.a(qfz1));
        contentvalues.put("is_hidden", Boolean.valueOf(flag));
        if (qfz1.b.g != null)
        {
            contentvalues.put("audience", Integer.valueOf(qfz1.b.g.a));
        }
        if (qfz1.b.f == null) goto _L2; else goto _L1
_L1:
        apzy = qfz1.b.f;
        j = apzy.length;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        pzy1 = apzy[i];
        if (pzy1.a != 12 || pzy1.b == null || pzy1.b.a == null) goto _L5; else goto _L4
_L4:
        contentvalues.put("associated_envelope_media_key", pzy1.b.a.a);
_L2:
        sqlitedatabase.insertWithOnConflict("collections", null, contentvalues, 5);
        return new esi(a, b.a.a, esm1, b);
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final String a()
    {
        return b.a.a;
    }
}
