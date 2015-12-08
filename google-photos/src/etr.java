// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Collection;

final class etr
    implements ert
{

    private String a[];
    private SQLiteDatabase b;
    private Collection c;

    etr(eto eto, String as[], SQLiteDatabase sqlitedatabase, Collection collection)
    {
        a = as;
        b = sqlitedatabase;
        c = collection;
        super();
    }

    public final Cursor a(int i, int j)
    {
        String as[] = new String[i];
        System.arraycopy(a, j, as, 0, i);
        return (new euj()).a(new String[] {
            "collection_id"
        }).b(as).a(b);
    }

    public final boolean a(Cursor cursor, int i)
    {
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            String s = cursor.getString(cursor.getColumnIndexOrThrow("collection_id"));
            if (!TextUtils.isEmpty(s))
            {
                c.add(s);
            }
        } while (true);
        return true;
    }
}
