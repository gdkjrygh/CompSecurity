// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bvz extends bmb
{

    private static final String a = bvz.getSimpleName();
    private final bwh b;
    private final bwk e = new bwi(this);
    private final bws f;
    private final String g;
    private final String h;
    private final String i;
    private final bwl j;
    private final bto k = new bwe(this, this, bwj);

    public bvz(bmb bmb1, bwh bwh1, bws bws1, String s, String s1, String s2, bwl bwl1)
    {
        super(bmb1);
        new bwa(this, this, new bxg[] {
            bxg.j
        });
        new bwb(this, this, new bxg[] {
            bxg.e
        });
        new bwc(this, this, new bxg[] {
            bxg.h
        });
        new bwd(this, this, new bxg[] {
            bxg.f
        });
        b = (bwh)b.a(bwh1, "stateController", null);
        f = (bws)b.a(bws1, "soundtrackUsageRecorder", null);
        g = (String)b.a(s, "frequentlyUsedTracksText", null);
        i = (String)b.a(s1, "suggestedTracksForThemeText", null);
        h = (String)b.a(s2, "localMusicText", null);
        j = (bwl)b.a(bwl1, "soundtrackPlayer", null);
    }

    static bto a(bvz bvz1)
    {
        return bvz1.k;
    }

    static void a(bvz bvz1, bwj bwj1)
    {
        bvz1.d(bwj1);
    }

    static void a(bvz bvz1, cqa cqa1)
    {
        boolean flag1 = true;
        bww bww1 = bvz1.c;
        boolean flag;
        if (cqa1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bww1.a(flag);
        bvz1.c.a(cqa1);
        if (!bvz1.c.b.R)
        {
            bvz1 = bvz1.c;
            if (cqa1 == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            bvz1.f(flag);
        }
    }

    static void a(bvz bvz1, String s)
    {
    }

    static bwl b(bvz bvz1)
    {
        return bvz1.j;
    }

    private void b()
    {
        boolean flag1 = true;
        c();
        cst cst1 = c.c.r;
        if (cst1 != null)
        {
            cst1.b();
            cqc cqc1 = c.b.v;
            if (cqc1.b() && cst1.a(cqc1) == null)
            {
                c.a(null);
            }
            boolean flag;
            if (cst1.c().c.size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                bws bws1 = f;
                ArrayList arraylist;
                Iterator iterator1;
                if (cst1.c().c.size() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    flag1 = false;
                }
                c.a(flag1, "!musicLibrary.isEmpty()");
                arraylist = new ArrayList();
                iterator1 = bws1.a.keySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    cqc cqc2 = (cqc)iterator1.next();
                    if (cst1.a(cqc2) == null)
                    {
                        arraylist.add(cqc2);
                    }
                } while (true);
                for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); bws1.a((cqc)iterator.next())) { }
                if (arraylist.size() > 0)
                {
                    int i1 = arraylist.size();
                    (new StringBuilder(60)).append("Removed ").append(i1).append(" deleted tracks from frequently used list");
                }
                bws1.a();
            }
        }
    }

    static void b(bvz bvz1, bwj bwj1)
    {
        bvz1.e(bwj1);
    }

    static void c(bvz bvz1)
    {
        bvz1.c();
    }

    static void c(bvz bvz1, bwj bwj1)
    {
        bvz1.c(bwj1);
    }

    private void c(bwj bwj1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        e(bwj1);
        d(bwj1);
        c();
        bwj1.b_(c.b.Q);
        obj = c;
        flag = flag1;
        if (((bww) (obj)).c.e == null) goto _L2; else goto _L1
_L1:
        int i1;
        obj = ((bww) (obj)).c.e;
        i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= ((cqf) (obj)).d()) goto _L2; else goto _L3
_L3:
        cnq cnq1 = ((cqf) (obj)).b(i1);
        if (cnq1.d != cnt.a || !((cqf) (obj)).a(cnq1.e).b.g) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        bwj1.b(flag);
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void d(bvz bvz1)
    {
        bvz1.c();
    }

    static void d(bvz bvz1, bwj bwj1)
    {
        bvz1.c();
        bwj1.a(bvz1.e);
        bvz1.b();
        bvz1.c(bwj1);
    }

    private void d(bwj bwj1)
    {
        Object obj;
        boolean flag1;
        boolean flag3;
        flag3 = true;
        flag1 = true;
        c();
        obj = c.c.r;
        if (obj == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        cst cst1;
        int i1;
        if (((cst) (obj)).c().c.size() == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L2; else goto _L3
_L3:
        arraylist = new ArrayList();
        cst1 = c.c.r;
        obj = c.c.r;
        cyy cyy = c.b.t;
        obj = (List)((cst) (obj)).c().e.get(cyy);
        cqc acqc[];
        int j1;
        if (obj == null)
        {
            obj = Collections.emptyList();
        }
        if (!((List) (obj)).isEmpty())
        {
            arraylist.add(new bwg(i, ((List) (obj)), -3L));
        }
        obj = new ArrayList();
        acqc = f.a(8, cst1);
        j1 = acqc.length;
        i1 = 0;
        while (i1 < j1) 
        {
            Object obj2 = acqc[i1];
            cqa cqa1 = cst1.a(((cqc) (obj2)));
            if (cqa1 != null)
            {
                ((List) (obj)).add(cqa1);
            } else
            {
                String s = a;
                obj2 = String.valueOf(obj2);
                Log.w(s, (new StringBuilder(String.valueOf(obj2).length() + 34)).append("Frequently used track is missing: ").append(((String) (obj2))).toString());
            }
            i1++;
        }
        if (!((List) (obj)).isEmpty())
        {
            arraylist.add(new bwg(g, ((List) (obj)), -2L));
        }
        if (!ddy.j.a()) goto _L5; else goto _L4
_L4:
        Object obj1 = cst1.d();
        coc coc1;
        List list;
        boolean flag;
        long l1;
        if (((cse) (obj1)).b.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = null;
        } else
        {
            obj = new ArrayList(((cse) (obj1)).b.size());
            ((List) (obj)).addAll(((cse) (obj1)).b.values());
        }
        if (obj == null || ((List) (obj)).isEmpty()) goto _L5; else goto _L6
_L6:
        obj = new bwg(h, ((List) (obj)), -4L);
_L11:
        boolean flag2;
        obj1 = cst1.c().b.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            coc1 = (coc)((Iterator) (obj1)).next();
            list = cst1.c().a(coc1);
            if (list.size() > 0)
            {
                l1 = ((cqa)list.get(0)).g;
                arraylist.add(new bwg(coc1.a, list, l1));
            }
        } while (true);
        obj = new bwf(Collections.unmodifiableList(arraylist), ((bwg) (obj)));
        bwj1.a(((bwf) (obj)).a, ((bwf) (obj)).b);
        flag2 = false;
_L9:
        flag3 = false;
_L8:
        bwj1.a(flag2, flag3);
        return;
_L2:
        bwj1.a(null, null);
        if (b.b())
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = true;
        if (true) goto _L8; else goto _L7
_L7:
        flag2 = true;
        if (true) goto _L9; else goto _L5
_L5:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static bwh e(bvz bvz1)
    {
        return bvz1.b;
    }

    static void e(bvz bvz1, bwj bwj1)
    {
        bvz1.c();
        bvz1.j.a();
        bwj1.a(null);
    }

    private void e(bwj bwj1)
    {
        c();
        bwj1.a(c.c.k);
    }

    static bww f(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww g(bvz bvz1)
    {
        return bvz1.c;
    }

    static void h(bvz bvz1)
    {
        bvz1.c();
    }

    static bww i(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww j(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww k(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww l(bvz bvz1)
    {
        return bvz1.c;
    }

    static void m(bvz bvz1)
    {
        bvz1.c();
    }

    static bww n(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww o(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww p(bvz bvz1)
    {
        return bvz1.c;
    }

    static bww q(bvz bvz1)
    {
        return bvz1.c;
    }

    public final void C_()
    {
        j.a();
        super.C_();
    }

    public final void a(bwj bwj1)
    {
        k.c(bwj1);
    }

    public final void b(bwj bwj1)
    {
        k.d(bwj1);
    }

    public final void e()
    {
        super.e();
        c.a(false);
        b();
    }

}
