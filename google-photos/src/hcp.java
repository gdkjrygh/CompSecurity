// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.List;

final class hcp
    implements ert
{

    private List a;
    private List b;
    private Context c;
    private int d;
    private List e;

    hcp(hcn hcn1, List list, List list1, Context context, int i, List list2)
    {
        a = list;
        b = list1;
        c = context;
        d = i;
        e = list2;
        super();
    }

    public final Cursor a(int i, int j)
    {
        return (new etj()).a(hcn.e()).a(a.subList(j, j + i)).c(b).a(c, d);
    }

    public final boolean a(Cursor cursor, int i)
    {
        i = cursor.getColumnIndexOrThrow("content_uri");
        for (; cursor.moveToNext(); e.add(cursor.getString(i))) { }
        return true;
    }
}
