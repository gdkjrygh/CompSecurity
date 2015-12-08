// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.Collections;
import java.util.Set;

final class ijh
    implements ikf
{

    private static final Set a = Collections.singleton("media_key");
    private final est b;

    ijh(est est1)
    {
        b = est1;
    }

    public final ekf a(int i, Object obj)
    {
        boolean flag = true;
        obj = (Cursor)obj;
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key"));
        est est1 = b;
        android.database.sqlite.SQLiteDatabase sqlitedatabase = mvj.b(est1.b, i);
        i = est1.a(i, ((String) (obj)));
        long l = DatabaseUtils.longForQuery(sqlitedatabase, est.a, new String[] {
            obj
        });
        if ((long)i != l)
        {
            flag = false;
        }
        return new iku(flag);
    }

    public final Set a()
    {
        return a;
    }

    public final Class b()
    {
        return iku;
    }

}
