// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

final class gjq
    implements evg
{

    private final SQLiteDatabase a;
    private final gjr b;
    private final noz c;
    private long d;
    private int e;
    private int f;
    private int g;
    private final HashMap h = new HashMap();

    gjq(SQLiteDatabase sqlitedatabase, Context context)
    {
        a = sqlitedatabase;
        b = (gjr)olm.a(context, gjr);
        c = noz.a(context, 3, "Indexer.Updater", new String[] {
            "perf"
        });
    }

    private Set a(String s, long l, qgk aqgk[], boolean flag)
    {
        if (aqgk.length != 0) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptySet();
_L4:
        return ((Set) (obj));
_L2:
        HashSet hashset = new HashSet();
        int j = aqgk.length;
        int i = 0;
        do
        {
            obj = hashset;
            if (i >= j)
            {
                continue;
            }
            obj = aqgk[i];
            if (((qgk) (obj)).a.b != null)
            {
                obj = ((qgk) (obj)).a.b.a;
                boolean flag1;
                if (((int)((Long) (obj)).longValue() >> 24) + 1 == 2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    if (!flag)
                    {
                        gjr.a(a, s, gka.a(((Long) (obj)).longValue()), l);
                    }
                    hashset.add(obj);
                }
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a()
    {
        return "ondevicesearch.Indexer";
    }

    public final void a(long l)
    {
        throw new UnsupportedOperationException("This class does not support rebuild.");
    }

    public final void a(evh evh1)
    {
        if (evh1.c == null)
        {
            return;
        } else
        {
            e = e + 1;
            Set set = a(evh1.a, evh1.b, evh1.c.c.n, false);
            h.put(evh1.a, set);
            return;
        }
    }

    public final void a(String s, long l)
    {
        e = e + 1;
        gjr.a(a, s);
    }

    public final void b()
    {
        h.clear();
        if (c.a())
        {
            noy.a("Total Update", Integer.valueOf(e));
            noy.b("Extra time spent updating index", d);
            noy.a("Total re-add", Integer.valueOf(g));
            noy.a("Total skipped re-add", Integer.valueOf(f));
        }
    }

    public final void b(evh evh1)
    {
        e = e + 1;
        long l = noy.a();
        Set set = (Set)h.get(evh1.a);
        if (set != null && a(evh1.a, evh1.b, evh1.c.c.n, true).equals(set))
        {
            d = d + (noy.a() - l);
            f = f + 1;
            return;
        } else
        {
            g = g + 1;
            gjr.a(a, evh1.a);
            Set set1 = a(evh1.a, evh1.b, evh1.c.c.n, false);
            h.put(evh1.a, set1);
            d = d + (noy.a() - l);
            return;
        }
    }

    public final void c()
    {
    }
}
