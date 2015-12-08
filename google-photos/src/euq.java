// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.HashSet;

final class euq
{

    private final int a;
    private final eto b;
    private final erz c;
    private final gjj d;

    public euq(Context context, int i)
    {
        a = i;
        b = (eto)olm.a(context, eto);
        c = (erz)olm.a(context, erz);
        d = (gjj)olm.a(context, gjj);
    }

    final ett a(SQLiteDatabase sqlitedatabase, qgi aqgi[], erb erb)
    {
        HashSet hashset = new HashSet();
        int i1 = aqgi.length;
        int j = 0;
        int i = 0;
        while (j < i1) 
        {
            Object obj = aqgi[j];
            if (((qgi) (obj)).b != null && ((qgi) (obj)).b.a != null)
            {
                ett ett1 = b.a(sqlitedatabase, a, ((qgi) (obj)).b.a, erb);
                i = ett1.a + i;
                hashset.addAll(ett1.b);
            } else
            if (((qgi) (obj)).c != null && ((qgi) (obj)).c.a != null)
            {
                i = c.b(a, ((qgi) (obj)).c.a) + i;
            } else
            if (((qgi) (obj)).d != null && !TextUtils.isEmpty(((qgi) (obj)).d.a))
            {
                if (gjr.b())
                {
                    gjj gjj1 = d;
                    obj = ((qgi) (obj)).d.a;
                    long l1 = noy.a();
                    int k = gjr.b(sqlitedatabase, ((String) (obj)));
                    if (k == -1)
                    {
                        if (gjj1.d.a())
                        {
                            noy.a("media key", obj);
                        }
                        k = 0;
                    } else
                    {
                        int l = gjr.a(sqlitedatabase, k);
                        k = l;
                        if (gjj1.d.a())
                        {
                            noy.a("duration", l1);
                            noy.a("total removed", Integer.valueOf(l));
                            k = l;
                        }
                    }
                    i = k + i;
                }
            } else
            if (Log.isLoggable("TombstoneProcessor", 5))
            {
                Log.w("TombstoneProcessor", "Missing item ID in tombstone");
            }
            j++;
        }
        return new ett(i, hashset);
    }
}
