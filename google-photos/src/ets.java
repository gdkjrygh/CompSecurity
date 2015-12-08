// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.List;

final class ets
    implements ert
{

    private int a;
    private List b;
    private eto c;

    ets(eto eto1, int i, List list)
    {
        c = eto1;
        a = i;
        b = list;
        super();
    }

    public final Cursor a(int i, int j)
    {
        boolean flag1 = true;
        etj etj1 = (new etj()).a(new String[] {
            "content_uri"
        });
        etj1.a(etj.a);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Must query more than 0 items.");
        if (j >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Cannot offset negative number.");
        etj1.b = i;
        etj1.c = j;
        return etj1.a(eto.a(c), a);
    }

    public final boolean a(Cursor cursor, int i)
    {
        String s;
        for (; cursor.moveToNext(); b.add(s))
        {
            s = cursor.getString(cursor.getColumnIndexOrThrow("content_uri"));
        }

        return cursor.getCount() == 3000;
    }
}
