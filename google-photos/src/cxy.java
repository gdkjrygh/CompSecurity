// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cxy
{

    private static final String a = cxy.getSimpleName();

    private cxy()
    {
    }

    private static long a(cnq cnq1, cnq cnq2)
    {
        b.a(cnq1, "clipA", null);
        b.a(cnq2, "clipB", null);
        if (!cnq1.e.equals(cnq2.e))
        {
            return 0x8000000000000000L;
        } else
        {
            return Math.min(cnq1.f.c, cnq2.f.c) - Math.max(cnq1.f.b, cnq2.f.b);
        }
    }

    public static long a(List list)
    {
        list = list.iterator();
        long l;
        for (l = 0L; list.hasNext(); l = ((cxj)list.next()).a.f.a() + l) { }
        return l;
    }

    public static Pair a(List list, cxm cxm1, cwm cwm1, cxd cxd)
    {
        int j = list.size();
        float af[] = new float[j];
        System.nanoTime();
        for (int i = 0; i < j; i++)
        {
            af[i] = cwm1.a(((cxj)list.get(i)).b);
        }

        System.nanoTime();
        return Pair.create(af, new cxm(list, cxd, cxm1));
    }

    public static cnt a(Collection collection)
    {
        if (collection.contains(Integer.valueOf(5)))
        {
            return cnt.c;
        } else
        {
            return cnt.a;
        }
    }

    private static cxj a(cnq cnq1, List list)
    {
        long l = -1L;
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cxj cxj1 = (cxj)iterator.next();
            long l1 = a(cnq1, cxj1.a);
            if (l1 > l)
            {
                l = l1;
                list = cxj1;
            }
        } while (true);
        return list;
    }

    public static cyb a(List list, cwm cwm1, cxq cxq1, Collection collection)
    {
        b.a(list, "clipMetrics", null);
        collection = a(collection);
        Object obj1 = cxq1.d;
        Object obj = new ArrayList(((cqp) (obj1)).a.size());
        for (obj1 = ((cqp) (obj1)).a.iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((cqt)((Iterator) (obj1)).next()).a)) { }
        obj = a(((List) (obj)), ((cnt) (collection)));
        collection = list;
        if (!((List) (obj)).isEmpty())
        {
            collection = b(list, ((List) (obj)));
        }
        return a(((List) (collection)), cwm1, cxq1, ((List) (obj)));
    }

    private static cyb a(List list, cwm cwm1, cxq cxq1, List list1)
    {
        cyb cyb1 = new cyb();
        list = list.iterator();
        while (list.hasNext()) 
        {
            cxj cxj1 = (cxj)list.next();
            cnq cnq1 = cxj1.a;
            byte byte0;
            int i;
            if (cnq1.d != cnt.c && cnq1.f.a() < 0x16e360L)
            {
                byte0 = 0;
            } else
            if (!list1.contains(cnq1) && cxq1.d.a(cnq1))
            {
                byte0 = 0;
            } else
            {
                byte0 = 1;
            }
            if (byte0 != 0)
            {
                if (cwm1.a() && cxj1.b.a != 6 && cxj1.b.a != 3)
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (byte0 != 0)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 8;
                }
                i = byte0;
                if (list1.contains(cxj1.a))
                {
                    i = byte0 | 2;
                }
            } else
            {
                i = 1;
            }
            b.a(cxj1, "clipMetric", null);
            b.a(i, "type", 0, 15);
            cyb1.a.add(new cyc(cxj1, i));
        }
        return cyb1;
    }

    public static List a(cxq cxq1, Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = cxq1.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cqh cqh1 = (cqh)iterator.next();
            cmd cmd1 = ((cqi)cxq1.b.get(cqh1.a)).a;
            if (cmd1 != null)
            {
                Iterator iterator1 = collection.iterator();
                while (iterator1.hasNext()) 
                {
                    Iterator iterator2 = cmd1.a(((Integer)iterator1.next()).intValue()).iterator();
                    while (iterator2.hasNext()) 
                    {
                        arraylist.add(new cxj((cof)iterator2.next(), cqh1, cxq1.e));
                    }
                }
            }
        } while (true);
        return arraylist;
    }

    public static List a(List list, long l)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        long l1 = 0L;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            cnq cnq1 = (cnq)list.next();
            if (l1 >= l)
            {
                break;
            }
            arraylist.add(cnq1);
            l1 = cnq1.f.a() + l1;
        } while (true);
        return arraylist;
    }

    private static List a(List list, cnt cnt1)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            cnq cnq1 = (cnq)list.next();
            if (cnt1 == cnq1.d)
            {
                arraylist.add(cnq1);
            }
        } while (true);
        return arraylist;
    }

    public static List a(List list, Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(list.get(((Integer)collection.next()).intValue()))) { }
        return arraylist;
    }

    public static void a(List list, List list1)
    {
        for (list = list.iterator(); list.hasNext(); list1.add(((cxj)list.next()).a)) { }
    }

    public static long b(List list)
    {
        list = list.iterator();
        long l;
        for (l = 0L; list.hasNext(); l = ((cnq)list.next()).f.a() + l) { }
        return l;
    }

    private static List b(List list, List list1)
    {
        ArrayList arraylist = new ArrayList(list);
        for (list1 = list1.iterator(); list1.hasNext();)
        {
            Object obj = (cnq)list1.next();
            Object obj1 = new ArrayList();
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                cxj cxj1 = (cxj)iterator.next();
                if (a(cxj1.a, ((cnq) (obj))) > 0L)
                {
                    ((List) (obj1)).add(cxj1);
                }
            } while (true);
            obj1 = a(((cnq) (obj)), ((List) (obj1)));
            if (obj1 == null)
            {
                obj1 = a;
                obj = String.valueOf(obj);
                Log.e(((String) (obj1)), (new StringBuilder(String.valueOf(obj).length() + 34)).append("No overlapping clip for inclusion ").append(((String) (obj))).toString());
            } else
            {
                arraylist.add(new cxj(((cnq) (obj)), new cof(((cnq) (obj)).f, ((cxj) (obj1)).b.c, ((cxj) (obj1)).b.a), ((cxj) (obj1)).c));
                arraylist.remove(obj1);
            }
        }

        return arraylist;
    }

    public static List c(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(((cxj)list.next()).a)) { }
        return arraylist;
    }

}
