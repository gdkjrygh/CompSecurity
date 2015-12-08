// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class erb
    implements SQLiteTransactionListener
{

    final List a;
    final SQLiteDatabase b;
    long c;
    int d;
    private final List e;
    private final noz f;
    private final noz g;
    private final Map h;
    private int i;
    private boolean j;

    public erb(Context context, int k)
    {
        this(context, k, false);
    }

    public erb(Context context, int k, boolean flag)
    {
        h = new HashMap();
        i = k;
        b = mvj.a(context, k);
        j = flag;
        ArrayList arraylist1;
        if (flag)
        {
            Object obj = olm.c(context, evf);
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                evf evf1 = (evf)((Iterator) (obj)).next();
                if (evf1.a())
                {
                    arraylist.add(evf1);
                }
            } while (true);
            e = Collections.unmodifiableList(arraylist);
        } else
        {
            e = Collections.unmodifiableList(olm.c(context, evf));
        }
        arraylist1 = new ArrayList(e.size());
        for (Iterator iterator = e.iterator(); iterator.hasNext(); arraylist1.add(((evf)iterator.next()).b(b, k))) { }
        a = Collections.unmodifiableList(arraylist1);
        f = noz.a(context, 2, "ListenerBatch", new String[] {
            "perf"
        });
        g = noz.a(context, 3, "ListenerBatch", new String[] {
            "perf"
        });
    }

    public final void a(evh evh)
    {
        p.a(b.inTransaction(), "Cannot update all media view outside of a transaction");
        d = d + 1;
        long l = noy.a();
        a("Finished updating all listeners", ((eri) (new erc(this, evh))));
        long l1 = c;
        c = (noy.a() - l) + l1;
    }

    public final void a(String s, long l)
    {
        p.a(b.inTransaction(), "Cannot update all media view outside of a transaction");
        d = d + 1;
        long l1 = noy.a();
        a("Finished updating all listeners", ((eri) (new ere(this, s, l))));
        l = c;
        c = (noy.a() - l1) + l;
    }

    void a(String s, eri eri1)
    {
        long l1 = noy.a();
        boolean flag = f.a();
        boolean flag1 = g.a();
        s = new ArrayList(a.size() + 3);
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            evg evg1 = (evg)iterator.next();
            long l2 = noy.a();
            eri1.a(evg1);
            if (flag1)
            {
                long l = noy.a() - l2;
                Long long1 = (Long)h.get(evg1.a());
                if (long1 != null)
                {
                    l += long1.longValue();
                }
                h.put(evg1.a(), Long.valueOf(l));
            }
            if (flag)
            {
                s.add(noy.a(evg1.a(), l2));
            }
        } while (true);
        if (flag)
        {
            s.add(noy.a(i));
            s.add(noy.a("total time", l1));
            s.add(noy.a("total updates processed", Integer.valueOf(d)));
            s.toArray(new noy[s.size()]);
        }
    }

    public final void b(evh evh)
    {
        p.a(b.inTransaction(), "Cannot update all media view outside of a transaction");
        d = d + 1;
        long l = noy.a();
        a("Finished updating all listeners", new erf(this, evh));
        long l1 = c;
        c = (noy.a() - l) + l1;
    }

    public final void onBegin()
    {
        if (j)
        {
            for (Iterator iterator = e.iterator(); iterator.hasNext(); ((evf)iterator.next()).a(b, i)) { }
        }
    }

    public final void onCommit()
    {
        if (d != 0)
        {
            long l = noy.a();
            a("Committed listener batch", new erg(this));
            long l1 = c;
            c = (noy.a() - l) + l1;
            if (g.a())
            {
                ArrayList arraylist = new ArrayList(a.size() + 3);
                java.util.Map.Entry entry;
                for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); arraylist.add(noy.b((String)entry.getKey(), ((Long)entry.getValue()).longValue())))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                }

                arraylist.add(noy.a(i));
                arraylist.add(noy.b("total time", c));
                arraylist.add(noy.a("total updates", Integer.valueOf(d)));
                arraylist.toArray(new noy[arraylist.size()]);
                return;
            }
        }
    }

    public final void onRollback()
    {
        a("Rollback", new erh(this));
    }
}
