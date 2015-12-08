// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cji
    implements ded
{

    public final List a = new ArrayList();
    final List b = new ArrayList();
    public cqn c;
    public ckg d[];
    private final cjb e;
    private ciz f;

    public cji(cqn cqn1, cjb cjb1)
    {
        e = (cjb)b.a(cjb1, "emptyVideoSourceFactory", null);
        c = (cqn)b.a(cqn1, "videoTimeline", null);
        d = new ckg[cqn1.d()];
    }

    private boolean a(cje cje1, int i, long l)
    {
        long l1;
label0:
        {
            cnt cnt1 = c.b(i).d;
            if (cnt1 != cnt.a && cnt1 != cnt.e)
            {
                return false;
            }
            for (Iterator iterator = b.iterator(); iterator.hasNext();)
            {
                cjj cjj1 = (cjj)iterator.next();
                if (cjj1 == cje1)
                {
                    long l2 = cjj1.c();
                    l1 = l2;
                    if (l2 == -1L)
                    {
                        return false;
                    }
                    break label0;
                }
            }

            l1 = -1L;
        }
        if (l1 == -1L)
        {
            cje1 = String.valueOf(cje1);
            throw b.a((new StringBuilder(String.valueOf(cje1).length() + 24)).append("video source not found: ").append(cje1).toString());
        }
        cje1 = c.b(i);
        l = Math.max(c.a(l, i), ((cnq) (cje1)).f.b);
        if (l1 > 0x186a0L + l)
        {
            return false;
        }
        cje1 = c.c(i).b;
        i = b.a(l1, ((cog) (cje1)).b);
        if (i < ((cog) (cje1)).b.length)
        {
            cje1 = Long.valueOf(((cog) (cje1)).b[i]);
        } else
        {
            cje1 = null;
        }
        return cje1 == null || cje1.longValue() > l || cje1.longValue() == l1;
    }

    public final int a(long l, List list, int i)
    {
        int j;
        int k;
        int i1;
        b.b(l, "timestampUs");
        b.a(list, "videoSources", null);
        b.a(list.size(), "videoSources.size()", c.d(), null);
        k = c.a(l, true);
        i1 = -1;
        j = i1;
        if (k != i) goto _L2; else goto _L1
_L1:
        j = i1;
        if (k > c.d()) goto _L2; else goto _L3
_L3:
        i = i1;
        if (a((cje)list.get(k), k, l))
        {
            i = k;
        }
        j = i;
        if (k + 1 >= c.d()) goto _L2; else goto _L4
_L4:
        j = i;
        if (!a((cje)list.get(k + 1), k + 1, c.e(k + 1))) goto _L2; else goto _L5
_L5:
        int j1;
        i1 = k + 1;
        j1 = i;
_L7:
        for (i = 0; i < list.size(); i++)
        {
            cnt cnt1 = c.b(i).d;
            if ((cnt1 == cnt.a || cnt1 == cnt.e) && i != j1 && i != i1)
            {
                ((cje)list.get(i)).a();
            }
        }

        i = 0;
        int k1 = 0;
        while (k1 < d.length) 
        {
            list = d[k1];
            j = i;
            if (list != null)
            {
                if (k1 == j1 || k1 == i1)
                {
                    j = 1;
                } else
                {
                    cnq cnq1 = c.b(k1);
                    j = i | list.a(Math.max(0L, l - (c.e(k1) - cnq1.f.b)));
                }
            }
            k1++;
            i = j;
        }
        j = i;
        if (f != null)
        {
            j = i | f.a(l);
        }
        for (list = a.iterator(); list.hasNext();)
        {
            j |= ((cjf)list.next()).a(l);
        }

        if (j == 0)
        {
            k = c.d();
        }
        return k;
_L2:
        i1 = -1;
        j1 = j;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final ciz a(cqn cqn1)
    {
        boolean flag1 = false;
        if (f == null)
        {
            f = new ciz(e.a);
        }
        ciz ciz1 = f;
        b.a(cqn1, "timeline", null);
        ciz1.a.clear();
        ciz1.b.clear();
        for (int i = 0; i < cqn1.d(); i++)
        {
            cnq cnq1 = cqn1.b(i);
            if (cnq1.d == cnt.d)
            {
                ciz1.a.add(cnq1);
                ciz1.b.add(Long.valueOf(cqn1.e(i)));
            }
        }

        boolean flag = flag1;
        if (!ciz1.a.isEmpty())
        {
            flag = true;
        }
        if (!flag)
        {
            f.a();
            f = null;
        }
        return f;
    }

    public final void a()
    {
        ckg ackg[] = d;
        int j = ackg.length;
        for (int i = 0; i < j; i++)
        {
            ckg ckg1 = ackg[i];
            if (ckg1 != null)
            {
                ckg1.a();
            }
        }

    }

    public final void a(ckl ckl)
    {
        b.a(ckl, "photoDecoder", null);
        a.add(ckl);
    }

    static 
    {
        cji.getSimpleName();
    }
}
