// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class eeb extends mvc
{

    private final int l;
    private final boolean m;
    private final List n;
    private final ej o = new ej(this);
    private final imj p;
    private final noz q;

    public eeb(Context context, int i, boolean flag)
    {
        super(context);
        l = i;
        m = flag;
        n = olm.c(context, dur);
        HashSet hashset = new HashSet();
        for (Iterator iterator = n.iterator(); iterator.hasNext(); hashset.add(((dur)iterator.next()).a())) { }
        p = new imj(hashset);
        q = noz.a(context, 3, "CardRenderDataLoader", new String[] {
            "perf"
        });
    }

    public final Object d()
    {
        ArrayList arraylist = new ArrayList();
        boolean flag = q.a();
        Object obj;
        Iterator iterator;
        long l1;
        if (flag)
        {
            l1 = noy.a();
            obj = new ArrayList(n.size() + 1);
        } else
        {
            obj = null;
            l1 = 0L;
        }
        iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dur dur1 = (dur)iterator.next();
            if (m && dur1.c())
            {
                if (flag)
                {
                    ((List) (obj)).add(noy.a((String)dur1.a(), "skipped"));
                }
            } else
            {
                Object obj1;
                Comparable comparable;
                int i;
                long l2;
                if (flag)
                {
                    l2 = noy.a();
                } else
                {
                    l2 = 0L;
                }
                obj1 = p;
                comparable = (Comparable)dur1.a();
                i = ((imj) (obj1)).a.indexOf(comparable);
                if (i == -1)
                {
                    obj = String.valueOf(comparable);
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 16)).append("Unknown domain: ").append(((String) (obj))).toString());
                }
                obj1 = new imi(i);
                arraylist.addAll(dur1.a(l, ((imi) (obj1))));
                if (flag)
                {
                    ((List) (obj)).add(noy.a((String)dur1.a(), l2));
                }
            }
        } while (true);
        if (flag)
        {
            ((List) (obj)).add(noy.a("duration", l1));
            ((List) (obj)).toArray(new noy[((List) (obj)).size()]);
        }
        return arraylist;
    }

    protected final boolean q()
    {
        ContentResolver contentresolver = super.f.getContentResolver();
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.net.Uri uri = ((dur)iterator.next()).b();
            if (uri != null)
            {
                contentresolver.registerContentObserver(uri, true, o);
            }
        } while (true);
        return true;
    }

    protected final boolean r()
    {
        super.f.getContentResolver().unregisterContentObserver(o);
        return true;
    }
}
