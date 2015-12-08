// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class czh
    implements czc
{

    private final Future a;
    private final cza b;
    private cxu c;

    public czh(Future future, cza cza1)
    {
        if (cza1 == cza.a)
        {
            a = null;
        } else
        {
            a = (Future)b.a(future, "modelFuture", null);
        }
        b = (cza)b.a(cza1, "summarizerType", null);
    }

    private cxu a()
    {
        switch (czi.a[b.ordinal()])
        {
        default:
            throw c.a("Unknown summarizer type");

        case 1: // '\001'
            return new cxt();

        case 2: // '\002'
            return cxv.b(b());

        case 3: // '\003'
            return cxv.a(b());
        }
    }

    private cwl b()
    {
        cwl cwl1;
        try
        {
            cwl1 = (cwl)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            throw c.a("Failed to get summarizer", interruptedexception);
        }
        catch (ExecutionException executionexception)
        {
            throw c.a("Failed to get summarizer", executionexception);
        }
        return cwl1;
    }

    public final long a(List list, List list1)
    {
        if (c == null)
        {
            c = a();
        }
        cxx cxx1 = (new cxx()).a(0x1e8480L);
        cxx1.a = 0x7fffffffffffffffL;
        list = cxx1.b(list1).a(list).a();
        return c.b(list);
    }

    public final List a(List list, List list1, Map map, cqp cqp1, czd czd)
    {
        cxx cxx1;
        long l2;
        long l3;
        b.a(cqp1.d, "targetDurationUs");
        Iterator iterator;
        boolean flag1;
        if (!list.isEmpty() || !list1.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "photos or videos non-empty");
        b.a(czd, "limits", null);
        if (c == null)
        {
            c = a();
        }
        cxx1 = new cxx();
        cxx1.a = cqp1.d;
        cxx1 = cxx1.a(0x1e8480L);
        if (!cqp1.c) goto _L2; else goto _L1
_L1:
        l3 = (long)list1.size() * 0x1e8480L;
        iterator = list.iterator();
        for (l2 = 0L; iterator.hasNext(); l2 = ((cqk)iterator.next()).e + l2) { }
        if (l3 + l2 <= 0L) goto _L2; else goto _L3
_L3:
        int i = (int)((100D * (double)l3) / (double)(l2 + l3));
_L5:
        cxx1.b = i;
        list = cxx1.b(list1).a(list);
        list.c = (cqp)b.a(cqp1, "constraints", null);
        list = list.a();
        list1 = c.a(list).a;
        list = cre.a(list1, cnt.a);
        cqp1 = cre.a(list1, cnt.c);
        list1 = new crf(map);
        Collections.sort(list, list1);
        Collections.sort(cqp1, list1);
        if (cqp1 != null && !cqp1.isEmpty())
        {
            int j1 = list.size();
            int k1 = cqp1.size();
            list1 = new ArrayList(j1 + k1);
            int j = Math.min(Math.max(1, j1), ddl.a(k1, 4));
            int k = 0;
            i = 0;
            boolean flag;
            if (j < j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            do
            {
                if (i >= k1 && k >= j1)
                {
                    break;
                }
                int l;
                int l1;
                if (flag)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                l1 = ddl.a(j1 - k, l + j);
                for (l = 0; l < l1;)
                {
                    list1.add(list.get(k));
                    l++;
                    k++;
                }

                if (j > 0)
                {
                    int i2 = ddl.a(k1 - i, j);
                    for (int i1 = 0; i1 < i2;)
                    {
                        list1.add(cqp1.get(i));
                        i1++;
                        i++;
                    }

                    j--;
                }
            } while (true);
            list = list1;
        }
        return cre.a(cre.a(cre.a(list, 0x2dc6c0L), map, czd), 0x2dc6c0L);
_L2:
        i = 25;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof czh)
            {
                if (((czh) (obj = (czh)obj)).a != a || !((czh) (obj)).b.equals(b))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(a, b.hashCode());
    }

    static 
    {
        czh.getSimpleName();
    }
}
