// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

final class erq
{

    private static final String c[] = {
        "is_hidden"
    };
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    private final noz d;

    public erq(noz noz1)
    {
        d = noz1;
    }

    private static ers a(SQLiteDatabase sqlitedatabase, String s)
    {
        s = sqlitedatabase.query("collections", c, "collection_media_key = ?", new String[] {
            s
        }, null, null, null);
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        boolean flag;
        if (s.getInt(s.getColumnIndexOrThrow("is_hidden")) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ers.a;
_L3:
        s.close();
        return sqlitedatabase;
_L2:
        sqlitedatabase = ers.b;
          goto _L3
        sqlitedatabase = ers.c;
          goto _L3
        sqlitedatabase;
        s.close();
        throw sqlitedatabase;
    }

    public final void a(SQLiteDatabase sqlitedatabase, err err1)
    {
        long l = noy.a();
        String s = err1.a();
        ers ers1 = a(sqlitedatabase, s);
        err1 = ((err) (err1.a(sqlitedatabase)));
        sqlitedatabase = a(sqlitedatabase, s);
        if (err1 != null)
        {
            if (!ers1.d && ((ers) (sqlitedatabase)).d)
            {
                a.add(err1);
            } else
            if (ers1.d && !((ers) (sqlitedatabase)).d)
            {
                b.add(err1);
            }
        }
        if (d.a())
        {
            boolean flag;
            if (err1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            noy.a("had metadata", Boolean.valueOf(flag));
            noy.a("duration", l);
        }
    }

}
