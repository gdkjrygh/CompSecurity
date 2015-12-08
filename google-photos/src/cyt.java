// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cyt
{

    private static final cyu l = new cyu(null, Collections.emptyList(), null, false);
    public final cyp a;
    public final Object b = new Object();
    public List c;
    public List d;
    public List e;
    public List f;
    public cyy g;
    public czd h;
    public List i;
    public czl j;
    public pye k;
    private final blp m;
    private final czs n;
    private final Object o = new Object();
    private cys p;
    private String q;
    private czc r;
    private boolean s;
    private final List t = new ArrayList();
    private final List u = new ArrayList();
    private final cqp v = new cqp();
    private cnx w;
    private final int x;
    private final cyx y = new cyx();

    public cyt(cyp cyp1, blp blp1, czs czs1, int i1)
    {
        p = cys.a;
        c = Collections.emptyList();
        d = Collections.emptyList();
        e = Collections.emptyList();
        f = Collections.emptyList();
        q = "";
        a = (cyp)b.a(cyp1, "beatMatcher", null);
        m = (blp)b.a(blp1, "clipIdentifierGenerator", null);
        n = (czs)b.a(czs1, "themeApplier", null);
        x = i1;
    }

    public static List b(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            cnz cnz1 = (cnz)list.next();
            if (cnz1.f())
            {
                arraylist.add(cnz1);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    private cyu c()
    {
label0:
        {
            cyu cyu1;
            synchronized (b)
            {
                if (!e.isEmpty() || !f.isEmpty())
                {
                    break label0;
                }
                cyu1 = l;
            }
            return cyu1;
        }
        cyv cyv1;
        cyv1 = new cyv(y, m, r, h, i, j, e, f, v, s, q, g, n, t, u, k, x, c, d, w, a, p);
        p = cys.h;
        t.addAll(u);
        u.clear();
        obj;
        JVM INSTR monitorexit ;
        cyv.b.a("run");
        if (cyv1.q == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        obj = null;
        if (cyv1.u != null)
        {
            obj = cyv1.u.a.e;
        }
        cqc cqc1 = null;
        if (cyv1.q.h.c != null)
        {
            cqc1 = cqc.a(cyv1.q.h.c);
        }
        flag = b.e(obj, cqc1);
        boolean flag1 = cyv1.m.equals(cyy.a(cyv1.q.h.a));
        if (cyv1.l == null)
        {
            obj = "";
        } else
        {
            obj = cyv1.l;
        }
        if (cyv1.q.f == null)
        {
            obj1 = "";
        } else
        {
            obj1 = cyv1.q.f;
        }
        if (!cyv1.o.isEmpty() || !cyv1.p.isEmpty() || ((String) (obj)).isEmpty() != ((String) (obj1)).isEmpty() || !flag1 || !flag) goto _L2; else goto _L3
_L3:
        cyv1.y = true;
        if (!((String) (obj)).equals(obj1)) goto _L2; else goto _L4
_L4:
        flag = false;
_L16:
        boolean flag2;
        if (cyv1.m.w && cyv1.r >= 4)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        cyv1.z = flag2;
        if (cyv1.q != null && cyv1.m == cyy.l && (cyv1.w == cys.e || cyv1.w == cys.f))
        {
            cyv1.w = cys.d;
        }
        cyv.b.b("prepare cloud storyboard");
_L14:
        if (cyv1.w == cys.h)
        {
            break MISSING_BLOCK_LABEL_1239;
        }
        cyw.a[cyv1.w.ordinal()];
        JVM INSTR tableswitch 1 8: default 492
    //                   1 555
    //                   2 725
    //                   3 804
    //                   4 811
    //                   5 1089
    //                   6 1096
    //                   7 1205
    //                   8 1212;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L5:
        cyv.b.b(cyv1.w.toString());
        obj = cyv1.w;
        Object obj2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        java.util.Map map;
        java.util.Map map1;
        int i1;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        if (obj != cys.h)
        {
            obj = cys.values()[((cys) (obj)).ordinal() + 1];
        }
        cyv1.w = ((cys) (obj));
        if (true) goto _L14; else goto _L6
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L6:
        if (cyv1.g == null)
        {
            obj = cyv1.e.a(cyv1.h, cyv1.i, cyv1.s, cyv1.j, cyv1.f);
        } else
        {
            obj = cyv1.g;
        }
        cyv.a(((List) (obj)));
        cyv1.c.b = Collections.unmodifiableList(cre.a(((List) (obj)), cyv1.d));
        if (cyv1.q != null)
        {
            obj = cyv1.c.a;
            obj2 = cyv1.c.b;
            obj4 = cyv1.q;
            obj5 = cyv1.s;
            flag4 = cyv1.z;
            if (!TextUtils.isEmpty(cyv1.l))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            cyv.a(((SparseArray) (obj)), ((List) (obj2)), ((pye) (obj4)), ((java.util.Map) (obj5)), flag4, flag3, cyv1.m.x, cyv1.c.c);
        } else
        {
            cyv1.c.a.clear();
        }
          goto _L5
_L7:
        c.a(cyv1.c.b, "state.clipsFromSelector", null);
        cyv1.c.d = new ArrayList(cyv1.c.b);
        obj = cyv1.o.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((crd)((Iterator) (obj)).next()).a(cyv1.c.d);
        }
          goto _L5
_L8:
        cyv1.a();
          goto _L5
_L9:
        i1 = cyv1.c.b.size();
        (new StringBuilder(25)).append(i1).append(" selector size");
        i1 = cyv1.c.d.size();
        (new StringBuilder(32)).append(i1).append(" after user edit size");
        obj = cyv1.n;
        flag5 = cyv1.y;
        obj2 = cyv1.q;
        i1 = cyv1.r;
        obj4 = cyv1.c.d;
        obj5 = cyv1.m;
        obj6 = cyv1.x;
        obj7 = cyv1.c.a;
        if (!cyv1.y || !cyv1.o.isEmpty() || !cyv1.p.isEmpty())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        map = cyv1.s;
        map1 = cyv1.c.c;
        flag6 = cyv1.z;
        if (!TextUtils.isEmpty(cyv1.l))
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        obj = ((czs) (obj)).a(flag5, ((pye) (obj2)), i1, ((List) (obj4)), ((cyy) (obj5)), ((List) (obj6)), ((SparseArray) (obj7)), flag3, map, map1, flag6, flag4);
        c.a(((czt) (obj)).d.size(), "themedClips.size()", cyv1.c.d.size(), null);
        cyv.a(((czt) (obj)).d);
        cyv1.c.e = ((czt) (obj));
          goto _L5
_L10:
        cyv1.b();
          goto _L5
_L11:
        if (cyv1.c.f == null)
        {
            cyv1.c.g = null;
        } else
        {
            obj2 = cyv1.c;
            obj4 = cyv1.v;
            obj5 = cyv1.c.f;
            obj6 = cyv1.u;
            obj7 = cyv1.s;
            map = cyv1.t;
            flag3 = cyv1.k;
            if (cyv1.y)
            {
                obj = cyv1.q;
            } else
            {
                obj = null;
            }
            obj2.g = ((cyp) (obj4)).a(((cqg) (obj5)), ((cnx) (obj6)), ((java.util.Map) (obj7)), map, flag3, ((pye) (obj)), cyv1.x);
        }
          goto _L5
_L12:
        cyv1.c();
          goto _L5
_L13:
        Log.w(cyv.a, "running NONE step requested");
          goto _L5
        if (cyv1.w != cys.h)
        {
            Log.w(cyv.a, "Storyboard producer settings were modified while storyboard creation was in progress. Storyboard returned for the old parameters.");
        }
        if (cyv1.c.h != null)
        {
            cyv.a(cyv1.c, cyv1.c.h);
        }
        cyv.b.b("sanity check");
        Object obj3 = null;
        pye pye1 = obj3;
        if (cyv1.q != null)
        {
            pye1 = obj3;
            if (cyv1.c.h != null)
            {
                pye1 = b.a(cyv1.r, cyv1.m, cyv1.c.e.c, cyv1.c.c, cyv1.c.d, cyv1.c.h, cyv1.u, cyv1.k, false);
            }
        }
        cyv.b.b("produce cloud storyboard");
        cyv.b.a(true);
        return new cyu(cyv1.c.h, cyv1.c.b, pye1, flag);
_L2:
        flag = true;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final cyu a()
    {
        obj;
        JVM INSTR monitorenter ;
        cyu cyu1;
        synchronized (o)
        {
            cyu1 = c();
        }
        return cyu1;
        RuntimeException runtimeexception;
        runtimeexception;
        synchronized (b)
        {
            a(cys.a);
        }
        throw runtimeexception;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(cnx cnx1)
    {
        synchronized (b)
        {
            if (w != cnx1)
            {
                w = cnx1;
                a(cys.f);
            }
        }
        return;
        cnx1;
        obj;
        JVM INSTR monitorexit ;
        throw cnx1;
    }

    public final void a(cqp cqp1)
    {
        synchronized (b)
        {
            if (v.a((cqp)b.a(cqp1, "constraints", null)))
            {
                a(cys.a);
            }
        }
        return;
        cqp1;
        obj;
        JVM INSTR monitorexit ;
        throw cqp1;
    }

    public void a(cys cys1)
    {
        boolean flag1 = true;
        boolean flag;
        if (p.ordinal() <= cys1.ordinal())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        cys cys2 = p;
        cys cys3 = cys.b;
        if (cys2.ordinal() < cys3.ordinal())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            c.a(t.isEmpty(), "user edits should be converted first");
            c.a(u.isEmpty(), "user edits should be converted first");
        }
        p = cys1;
    }

    public final void a(czc czc1)
    {
        b.a(czc1, "clipSelector", null);
        synchronized (b)
        {
            if (!czc1.equals(r))
            {
                r = czc1;
                a(cys.a);
            }
        }
        return;
        czc1;
        obj;
        JVM INSTR monitorexit ;
        throw czc1;
    }

    public final void a(czd czd)
    {
        b.a(czd, "clipSelectorLimits", null);
        synchronized (b)
        {
            if (!czd.equals(h))
            {
                h = czd;
                a(cys.a);
            }
        }
        return;
        czd;
        obj;
        JVM INSTR monitorexit ;
        throw czd;
    }

    public final void a(String s1)
    {
label0:
        {
            b.a(s1, "title", null);
            synchronized (b)
            {
                if (!b.e(s1, q))
                {
                    break label0;
                }
            }
            return;
        }
        cys cys1;
        if (s1.isEmpty() == q.isEmpty())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        cys1 = cys.e;
_L1:
        q = s1;
        a(cys1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        cys1 = cys.g;
          goto _L1
    }

    public final void a(List list)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = list.size();
        j1 = t.size();
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (t.equals(list.subList(0, j1)))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        t.clear();
        u.clear();
        u.addAll(list);
        a(cys.b);
        obj;
        JVM INSTR monitorexit ;
        return;
        list = list.subList(j1, i1);
        if (!u.equals(list))
        {
            u.clear();
            u.addAll(list);
            a(cys.c);
            return;
        }
        break MISSING_BLOCK_LABEL_149;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag)
    {
        synchronized (b)
        {
            s = flag;
            a(cys.f);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final long b()
    {
label0:
        {
            synchronized (b)
            {
                if (!c.isEmpty() || !d.isEmpty())
                {
                    break label0;
                }
            }
            return 0L;
        }
        ArrayList arraylist;
        ArrayList arraylist1;
        czc czc1;
        arraylist = new ArrayList(c);
        arraylist1 = new ArrayList(d);
        czc1 = r;
        obj;
        JVM INSTR monitorexit ;
        return czc1.a(arraylist, arraylist1);
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        cyt.getSimpleName();
    }
}
