// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class cyv
{

    static final String a = cyv.getSimpleName();
    static final deo b = new deo("MMStoryboard");
    private final czl A;
    final cyx c;
    final blp d;
    final czc e;
    final czd f;
    final List g;
    final List h;
    final List i;
    final cqp j = new cqp();
    boolean k;
    final String l;
    final cyy m;
    final czs n;
    final List o;
    final List p;
    final pye q;
    final int r;
    final Map s;
    final Map t;
    final cnx u;
    final cyp v;
    cys w;
    final List x = new ArrayList();
    boolean y;
    boolean z;

    cyv(cyx cyx1, blp blp1, czc czc1, czd czd1, List list, czl czl1, List list1, 
            List list2, cqp cqp1, boolean flag, String s1, cyy cyy1, czs czs1, List list3, 
            List list4, pye pye1, int i1, List list5, List list6, cnx cnx, cyp cyp1, 
            cys cys)
    {
        y = false;
        z = false;
        c = (cyx)b.a(cyx1, "state", null);
        if (pye1 == null)
        {
            b.a(cqp1.d, "targetDurationUs");
        }
        d = (blp)b.a(blp1, "clipIdentifierGenerator", null);
        e = (czc)b.a(czc1, "clipSelector", null);
        f = (czd)c.a(czd1, "clipSelectorLimits", null);
        g = list;
        A = (czl)c.a(czl1, "effectApplier", null);
        h = list1;
        i = list2;
        j.a(cqp1);
        k = flag;
        l = s1;
        m = (cyy)b.a(cyy1, "themeForThemeApplier", null);
        n = (czs)b.a(czs1, "themeApplier", null);
        o = new ArrayList(list3);
        p = new ArrayList(list4);
        q = pye1;
        if (pye1 != null)
        {
            cyx1 = ddy.h.b();
            if (cyx1 != null)
            {
                i1 = cyx1.intValue();
            } else
            {
                i1 = Math.min(i1, pye1.a.intValue());
            }
        }
        r = i1;
        s = b.a(list6, list5);
        t = cno.a(list5);
        u = cnx;
        v = (cyp)b.a(cyp1, "beatMatcher", null);
        w = cys;
    }

    static void a(SparseArray sparsearray, List list, pye pye1, Map map, boolean flag, boolean flag1, boolean flag2, Map map1)
    {
        sparsearray.clear();
        int i1;
        int j1;
        int k1;
        int l1;
        if (pye1.j == null)
        {
            j1 = 720;
        } else
        {
            j1 = pye1.j.intValue();
        }
        if (pye1.i == null)
        {
            k1 = 1280;
        } else
        {
            k1 = pye1.i.intValue();
        }
        i1 = 0;
        l1 = 0;
        while (l1 < pye1.b.length) 
        {
            if (pye1.d[l1])
            {
                continue;
            }
            pxq pxq = pye1.b[l1].d;
            cnq cnq1 = (cnq)list.get(i1);
            map1.put(cnq1.e, pxq);
            cnz cnz1 = (cnz)map.get(cnq1.e);
            if (cnz1 != null)
            {
                boolean flag3;
                if (l1 == 0 && flag1 && flag2)
                {
                    flag3 = false;
                } else
                {
                    flag3 = flag;
                }
                sparsearray.append(cnq1.b, cnu.a(cnq1, pxq, k1, j1, cnz1, flag3));
            }
            i1++;
            l1++;
        }
    }

    static void a(cyx cyx1, cqf cqf1)
    {
        cyx1 = cyx1.i;
        ((ddj) (cyx1)).a.clear();
        cqf1 = Collections.unmodifiableList(cqf1.b).iterator();
        while (cqf1.hasNext()) 
        {
            cnq cnq1 = (cnq)cqf1.next();
            boolean flag;
            if (cnq1.b != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "Clip with no identifier");
            if (!cyx1.b(cnq1.b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "Clip identifier used twice");
            cyx1.a(cnq1.b);
        }
    }

    static void a(List list)
    {
        cre.b(list, 0x16e360L);
    }

    void a()
    {
        c.a(c.d, "state.clipsAfterUserEdits", null);
        for (Iterator iterator = p.iterator(); iterator.hasNext(); ((crd)iterator.next()).a(c.d)) { }
        if (q == null)
        {
            c.d = cre.a(c.d, s, f);
        } else
        {
            Iterator iterator1 = s.values().iterator();
            while (iterator1.hasNext()) 
            {
                coi coi1 = ((cnz)iterator1.next()).b();
                if (coi1.e == coj.a && coi1.c * coi1.d > 0xe1000)
                {
                    String s1 = a;
                    int i1 = coi1.c;
                    int j1 = coi1.d;
                    Log.e(s1, (new StringBuilder(59)).append("Cloud displayable has dimensions ").append(i1).append(" by ").append(j1).toString());
                }
            }
        }
        cre.b(c.d, 0x16e360L);
    }

    void b()
    {
        boolean flag1 = true;
        c.a(c.e.d, "state.clipsAfterUserEdits", null);
        ArrayList arraylist = new ArrayList();
        Object obj = c.e.d.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            cnq cnq2 = (cnq)((Iterator) (obj)).next();
            cnq cnq1;
            boolean flag;
            if (cnq2.i != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cnq1 = cnq2;
            if (!flag)
            {
                cnq1 = n.a(cnq2, m);
            }
            arraylist.add(cnq1);
        }
        cyx cyx1 = c;
        czl czl1 = A;
        obj = s;
        Map map = t;
        if (l.isEmpty())
        {
            flag1 = false;
        }
        cyx1.f = czl1.a(((Map) (obj)), map, arraylist, flag1, c.e.e, c.e.f);
        if (c.f != null)
        {
            c.f.i = c.e.a;
        }
    }

    void c()
    {
        if (c.g == null)
        {
            c.h = null;
            return;
        }
        c.g.f = (String)b.a(l, "title", null);
        if (q != null && q.g != null)
        {
            c.g.g = (String)b.a(q.g, "subtitle", null);
        }
        if (!c.g.b.isEmpty())
        {
            cnq cnq1 = (cnq)c.g.b.get(0);
            if (cnq1.d == cnt.d)
            {
                c.g.h = cnq1.f;
            }
        }
        if (q != null)
        {
            cqg cqg1 = c.g;
            Object obj = c.g.b;
            SparseArray sparsearray = c.e.b;
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(sparsearray.get(((cnq)((Iterator) (obj)).next()).b, cnu.a))) { }
            cqg1.c = arraylist;
        }
        try
        {
            c.h = c.g.a();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e(a, "Invalid storyboard generated.", illegalargumentexception);
        }
        c.h = null;
    }

}
