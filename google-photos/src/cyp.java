// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cyp
{

    public cyf a;
    public cyq b;

    public cyp()
    {
        a = new cyh();
        b = cyq.a;
    }

    public cyp(cyf cyf1, cyq cyq1)
    {
        a = cyf1;
        b = cyq1;
    }

    static long a(List list, List list1)
    {
        long l = 0L;
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        long l1 = l;
_L4:
        return l1;
_L2:
        boolean flag;
        if (list1.size() == list.size() - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "should be 1 more clip than there are transitions");
        for (list = list.iterator(); list.hasNext();)
        {
            l = ((cnq)list.next()).f.a() + l;
        }

        list = list1.iterator();
        do
        {
            l1 = l;
            if (!list.hasNext())
            {
                continue;
            }
            l -= ((czw)list.next()).b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private cte a(cnx cnx1)
    {
        int i;
        int j;
        long l1;
        j = cnx1.f;
        l1 = (long)ctb.b(cnx1) * (long)j;
        long al[];
        long l6;
        if (l1 < b.c)
        {
            long l2 = l1 << 1;
            long l4 = Math.abs(l2 - b.c);
            l1 = Math.abs(l1 - b.c);
            i = j;
            if (l2 < b.e)
            {
                i = j;
                if (l4 < l1)
                {
                    i = j << 1;
                }
            }
            break MISSING_BLOCK_LABEL_101;
        } else
        {
            i = j;
            if (l1 > b.c)
            {
                i = j;
                if (j % 2 == 0)
                {
                    l3 = l1 / 2L;
                    l5 = Math.abs(l3 - b.c);
                    l1 = Math.abs(l1 - b.c);
                    i = j;
                    if (l3 > b.d)
                    {
                        i = j;
                        if (l5 < l1)
                        {
                            i = j / 2;
                        }
                    }
                }
            }
            continue;
        }
        do
        {
            long l3 = ctb.a(cnx1);
            ctf ctf1 = new ctf();
            al = cnx1.a();
            int i1 = ctb.a(al, cnx1.e) % i;
            l1 = 0L;
            int k = 0;
            do
            {
                if (k >= b.j)
                {
                    break;
                }
                int l = 0;
                while (l < al.length) 
                {
                    if (al[l] >= l3)
                    {
                        float f;
                        if (l % i == i1)
                        {
                            f = b.h;
                        } else
                        if (i % 2 == 0 && (i / 2 + l) % i == i1 && b.l)
                        {
                            f = b.i;
                        } else
                        if (b.m)
                        {
                            f = 0.0F;
                        } else
                        {
                            f = -1F;
                        }
                        if (f >= 0.0F)
                        {
                            long l5 = (al[l] - l3) + l1;
                            j = 0;
                            if (ctf1.c > 0)
                            {
                                l6 = ctf1.a[ctf1.c - 1];
                                boolean flag;
                                if (l5 >= l6)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                b.a(flag, "Must be >= previous cut point");
                                if (l6 == l5)
                                {
                                    j = 1;
                                } else
                                {
                                    j = 0;
                                }
                            }
                            if (j != 0)
                            {
                                ctf1.b[ctf1.c - 1] = Math.max(f, ctf1.b[ctf1.c - 1]);
                            } else
                            {
                                if (ctf1.c == ctf1.a.length)
                                {
                                    ctf1.a = Arrays.copyOf(ctf1.a, ctf1.c << 1);
                                    ctf1.b = Arrays.copyOf(ctf1.b, ctf1.c << 1);
                                }
                                ctf1.a[ctf1.c] = l5;
                                ctf1.b[ctf1.c] = f;
                                ctf1.c = ctf1.c + 1;
                            }
                        }
                    }
                    l++;
                }
                l1 += cnx1.b - l3;
                l3 = 0L;
                k++;
            } while (true);
            return new cte(Arrays.copyOf(ctf1.a, ctf1.c), Arrays.copyOf(ctf1.b, ctf1.c));
        } while (true);
    }

    private static List a(List list, cqg cqg1, long al[])
    {
        boolean flag;
        if (list.size() == cqg1.b.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "clip counts should match for trimmedLengthUs");
        if (al != null)
        {
            List list1;
            cnq cnq1;
            int i;
            long l;
            long l1;
            if (al.length == cqg1.b.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "clip counts should match for trimmedLengthOffsets");
        }
        al = new ArrayList(list.size());
        list1 = cqg1.b;
        cqg1 = cqg1.d;
        for (i = 0; i < list.size(); i++)
        {
            l1 = ((Long)list.get(i)).longValue();
            l = l1;
            if (cqg1 != null)
            {
                l = l1;
                if (i < list1.size() - 1)
                {
                    l = l1 + ((czw)cqg1.get(i)).b();
                }
            }
            cnq1 = (cnq)list1.get(i);
            al.add(cnq1.a().a(new cod(cnq1.f.b, l + cnq1.f.b)).a());
        }

        return al;
    }

    public final cqg a(cqg cqg1, cnx cnx1, Map map, Map map1, boolean flag, pye pye1, List list)
    {
        if (cnx1 == null)
        {
            if (flag)
            {
                return cqg1;
            } else
            {
                long l = a(cqg1.b, cqg1.d);
                return (new cqg(cqg1)).a(cnm.b(l));
            }
        }
        cqg cqg2 = new cqg(cqg1);
        if (pye1 != null)
        {
            list = new ArrayList();
            ArrayList arraylist = new ArrayList();
            b.a(pye1.b.length, "cloud storyboard clip count", cqg1.b.size(), null);
            for (int i = 0; i < pye1.b.length; i++)
            {
                cod cod1 = b.a(pye1.b[i].c);
                arraylist.add(((cnq)cqg1.b.get(i)).a().a(cod1).a());
            }

            pye1 = pye1.h.d.a.a;
            int k = pye1.length;
            for (int j = 0; j < k; j++)
            {
                Object obj = pye1[j];
                list.add(new cnq(cnt.b, nny.a(cnx1.d, noa.c), b.a(((pxo) (obj)).c)));
            }

            long l1 = a(((List) (arraylist)), cqg1.d);
            cqg2.a(arraylist);
            cqg2.a(cnm.a(list, l1));
        } else
        {
            a(cqg1, cqg2, cnx1, map, list);
        }
        if (flag)
        {
            b.a(cqg2, map, map1);
        }
        return cqg2;
    }

    void a(cqg cqg1, cqg cqg2, cnx cnx1, Map map, List list)
    {
        Object obj = cqg1.b;
        List list1 = cqg1.d;
        int j = cqg1.e.c();
        long al[];
        List list2;
        Object obj1;
        int i;
        if (j == 0)
        {
            al = null;
        } else
        {
            al = new long[((List) (obj)).size()];
            i = 0;
            while (i < list1.size()) 
            {
                czw czw1 = (czw)list1.get(i);
                obj1 = (cnq)((List) (obj)).get(i);
                cnq cnq1 = (cnq)((List) (obj)).get(i + 1);
                if (((cnq) (obj1)).d == cnt.c && cnq1.d == cnt.c && czw1 != null && czw1.b() > 0L)
                {
                    al[i] = j;
                    if (i > 0 && al[i - 1] != 0L)
                    {
                        al[i] = al[i] - al[i - 1];
                    }
                } else
                {
                    al[i] = 0L;
                }
                i++;
            }
            if (i > 0)
            {
                al[i] = -al[i - 1];
            }
        }
        if (al != null)
        {
            c.a(al.length, "beatMatchingOffsets.size()", cqg1.b.size(), "Beat alignment should produce the same sized array as was input");
        }
        list1 = cqg1.d;
        list2 = cqg1.b;
        obj1 = new ArrayList(list2.size());
        if (al != null)
        {
            boolean flag;
            if (al.length == list2.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "clip counts should match for beatMatchingOffsets");
        }
        i = 0;
        while (i < list2.size()) 
        {
            obj = (cnq)list2.get(i);
            long l;
            if (list1 != null && i < list2.size() - 1)
            {
                l = ((czw)list1.get(i)).b();
            } else
            {
                l = 0L;
            }
            l = ((cnq) (obj)).f.a() - l;
            if (!((cnq) (obj)).g)
            {
                obj = new csd(l, l, l);
            } else
            if (((cnq) (obj)).d == cnt.d)
            {
                if (i == 0)
                {
                    obj = new csd(0xf4240L, l, l);
                } else
                {
                    obj = new csd(l, l, l);
                }
            } else
            {
                cnz cnz1 = (cnz)map.get(((cnq) (obj)).e);
                b.a(cnz1, "displayable", null);
                if (cnz1 instanceof cqk)
                {
                    obj = new csd(0xf4240L, l, l + Math.min(cnz1.e() - ((cnq) (obj)).f.c, b.f));
                } else
                if (cnz1 instanceof coo)
                {
                    obj = new csd(0xf4240L, l, l + b.g);
                } else
                {
                    throw b.a("displayable should be a photo or a video");
                }
            }
            ((List) (obj1)).add(obj);
            i++;
        }
        map = a.a(((List) (obj1)), a(cnx1), list, b);
        c.a(map.size(), "trimmedLengths.size()", cqg1.b.size(), "Beat alignment should produce the same sized array as was input");
        map = a(((List) (map)), cqg1, al);
        long l3 = a(((List) (map)), cqg1.d);
        cqg1 = new ArrayList(b.j);
        i = 0;
        long l1 = l3;
        while (i < b.j && l1 > 0L) 
        {
            long l2;
            long l4;
            if (i == 0)
            {
                l2 = ctb.a(cnx1);
            } else
            {
                l2 = 0L;
            }
            l4 = Math.min(cnx1.b, l2 + l1);
            cqg1.add(new cnq(cnt.b, nny.a(cnx1.d, noa.c), new cod(l2, l4)));
            l1 -= l4 - l2;
            i++;
        }
        cqg2.a(map);
        cqg2.a(cnm.a(cqg1, l3));
    }

    static 
    {
        cyp.getSimpleName();
    }
}
