// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gkn
    implements gks, gli, Runnable
{

    private final Context a;
    private final gko b;
    private final gkp c;
    private final ehr d;
    private final gkq e;
    private final List f;
    private final noz g;
    private final gly h;
    private final gld i;
    private final glf j;
    private final ekk k;
    private final List l;
    private long m;
    private List n;
    private int o;

    private gkn(Context context, ehr ehr1, List list, int i1, gkq gkq1, gly gly, gko gko1, 
            gkp gkp1, gld gld1, glf glf1, ekk ekk, List list1)
    {
        f = new ArrayList();
        n = list;
        o = i1;
        l = list1;
        a = context.getApplicationContext();
        b = gko1;
        c = gkp1;
        d = ehr1;
        e = gkq1;
        h = gly;
        i = gld1;
        j = glf1;
        k = ekk;
        g = noz.a(context, 3, "MediaPage", new String[] {
            "perf"
        });
    }

    public gkn(Context context, ehr ehr1, List list, int i1, gkq gkq1, gly gly, gld gld1, 
            glf glf1, ekk ekk, List list1)
    {
        this(context, ehr1, list, i1, gkq1, gly, new gko(), new gkp(), gld1, glf1, ekk, list1);
    }

    public final void a(int i1, ehr ehr1, List list, int j1)
    {
        f.add(j.a(i1, list));
    }

    public final void a(ehr ehr1, long l1, int i1)
    {
        m = l1;
    }

    public final void run()
    {
        long l1 = noy.a();
        (new gkr(a, d, o, this, h)).run();
        Object obj = new HashSet();
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            gld gld1 = i;
            int i1 = Math.max(0, integer.intValue() / gld1.a - 1);
            if (!((Set) (obj)).contains(Integer.valueOf(i1)))
            {
                ((Set) (obj)).add(Integer.valueOf(i1));
                (new glh(a, i1, 3, d, o, this, i, h, k)).run();
            }
        } while (true);
        obj = new ArrayList(l.size());
        for (Iterator iterator1 = l.iterator(); iterator1.hasNext(); ((List) (obj)).add(((gke)iterator1.next()).a(d.a, d.b))) { }
        if (g.a())
        {
            noy.a("key", d);
            noy.a("duration", l1);
        }
        e.a(d, m, f, o, ((List) (obj)));
    }
}
