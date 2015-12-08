// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

final class dme
    implements ert
{

    private List a;
    private SQLiteDatabase b;
    private String c[];
    private int d;
    private List e;
    private ekk f;
    private List g;
    private dmd h;

    dme(dmd dmd1, List list, SQLiteDatabase sqlitedatabase, String as[], int i, List list1, ekk ekk, 
            List list2)
    {
        h = dmd1;
        a = list;
        b = sqlitedatabase;
        c = as;
        d = i;
        e = list1;
        f = ekk;
        g = list2;
        super();
    }

    public final Cursor a(int i, int j)
    {
        List list = a.subList(j, j + i);
        return (new erm()).b(dmd.a(h, b, list)).a(c).b(dmd.a(h), d);
    }

    public final boolean a(Cursor cursor, int i)
    {
        try
        {
            i = cursor.getColumnIndexOrThrow("media_key");
            for (; cursor.moveToNext(); g.add(cursor.getString(i)))
            {
                e.add(dmd.a(h, cursor, d, f));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            return false;
        }
        return true;
    }
}
