// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Set;

final class etp
    implements ert
{

    private String a[];
    private eun b;
    private SQLiteDatabase c;
    private Set d;

    etp(eto eto, String as[], eun eun, SQLiteDatabase sqlitedatabase, Set set)
    {
        a = as;
        b = eun;
        c = sqlitedatabase;
        d = set;
        super();
    }

    public final Cursor a(int i, int j)
    {
        String as[] = new String[i];
        System.arraycopy(a, j, as, 0, i);
        euj euj1 = (new euj()).a(new String[] {
            "dedup_key"
        }).b(as);
        if (b != null)
        {
            euj1.a(b);
        }
        return euj1.a(c);
    }

    public final boolean a(Cursor cursor, int i)
    {
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            String s = cursor.getString(cursor.getColumnIndexOrThrow("dedup_key"));
            if (!TextUtils.isEmpty(s))
            {
                d.add(s);
            }
        } while (true);
        return true;
    }
}
