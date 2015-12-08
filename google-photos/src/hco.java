// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.List;

final class hco
    implements ert
{

    private List a;
    private Context b;
    private int c;
    private List d;

    hco(hcn hcn1, List list, Context context, int i, List list1)
    {
        a = list;
        b = context;
        c = i;
        d = list1;
        super();
    }

    public final Cursor a(int i, int j)
    {
        return (new etj()).a(hcn.e()).b(a.subList(j, j + i)).a(eun.b).a(b, c);
    }

    public final boolean a(Cursor cursor, int i)
    {
        i = cursor.getColumnIndexOrThrow("content_uri");
        for (; cursor.moveToNext(); d.add(cursor.getString(i))) { }
        return true;
    }
}
