// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

final class jaf
    implements ert
{

    private List a;
    private SQLiteDatabase b;
    private List c;

    jaf(jae jae, List list, SQLiteDatabase sqlitedatabase, List list1)
    {
        a = list;
        b = sqlitedatabase;
        c = list1;
        super();
    }

    public final Cursor a(int i, int j)
    {
        String s = b.b("content_uri", i);
        String as[] = (String[])a.subList(j, j + i).toArray(new String[i]);
        return b.query("local", new String[] {
            "content_uri"
        }, s, as, null, null, null);
    }

    public final boolean a(Cursor cursor, int i)
    {
        i = cursor.getColumnIndexOrThrow("content_uri");
        for (; cursor.moveToNext(); c.add(cursor.getString(i))) { }
        return true;
    }
}
