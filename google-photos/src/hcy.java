// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class hcy
    implements ert
{

    final List a = new ArrayList();
    private final Context b;
    private final int c;
    private final List d;

    public hcy(Context context, int i, List list)
    {
        b = context;
        c = i;
        d = list;
    }

    public final Cursor a(int i, int j)
    {
        List list = d.subList(j, j + i);
        return (new etj()).a(new String[] {
            "dedup_key"
        }).b(list).a(eun.b).a(b, c);
    }

    public final boolean a(Cursor cursor, int i)
    {
        for (; cursor.moveToNext(); a.add(cursor.getString(cursor.getColumnIndexOrThrow("dedup_key")))) { }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
        cursor.close();
        return true;
    }
}
