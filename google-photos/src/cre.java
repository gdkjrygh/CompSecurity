// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cre
{

    private static final String a = cre.getSimpleName();

    private cre()
    {
    }

    public static cnq a(cqh cqh1)
    {
        return a(cqh1, new cod(0L, cqh1.d));
    }

    public static cnq a(cqh cqh1, long l)
    {
        return new cnq(cnt.c, cqh1.a, new cod(0L, l));
    }

    public static cnq a(cqh cqh1, cod cod1)
    {
        if (cod1.c > cqh1.d)
        {
            String s = a;
            long l = cod1.c;
            long l1 = cqh1.d;
            Log.w(s, (new StringBuilder(80)).append("Clip end point ").append(l).append(" exceeds video end point ").append(l1).toString());
        }
        return new cnq(cnt.a, cqh1.a, cod1);
    }

    public static List a(List list, long l)
    {
        b.b(0x2dc6c0L, "mergeThresholdUs");
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        list = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cnq cnq1 = (cnq)iterator.next();
            if (cnq1 != null)
            {
                if (list == null)
                {
                    list = cnq1;
                } else
                {
                    if (((cnq) (list)).d == cnt.a && cnq1.d == cnt.a && cnq1.e.equals(((cnq) (list)).e) && cnq1.f.b >= ((cnq) (list)).f.b)
                    {
                        l = cnq1.f.b - ((cnq) (list)).f.c;
                    } else
                    {
                        l = 0x7fffffffffffffffL;
                    }
                    if (l >= 0L && l < 0x2dc6c0L)
                    {
                        long l1 = ((cnq) (list)).f.b;
                        long l2 = l / 2L;
                        long l3 = cnq1.f.c;
                        l /= 2L;
                        list = cnq1.a().a(new cod(l1 + l2, l3 - l)).a();
                    } else
                    if (l < 0L)
                    {
                        l = Math.max(cnq1.f.c, ((cnq) (list)).f.c);
                        list = cnq1.a().a(new cod(((cnq) (list)).f.b, l)).a();
                    } else
                    {
                        arraylist.add(list);
                        list = cnq1;
                    }
                }
            }
        } while (true);
        if (list != null)
        {
            arraylist.add(list);
        }
        return arraylist;
    }

    public static List a(List list, blp blp1)
    {
        ArrayList arraylist = new ArrayList(list.size());
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            cns cns1 = ((cnq)list.get(i)).a();
            cns1.a = blp1.a();
            arraylist.add(cns1.a());
        }

        return arraylist;
    }

    public static List a(List list, cnt cnt1)
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
            if (cnq1.d == cnt1)
            {
                arraylist.add(cnq1);
            }
        } while (true);
        return arraylist;
    }

    public static List a(List list, Map map, czd czd1)
    {
        ArrayList arraylist;
        Iterator iterator;
        b.a(czd1, "limits", null);
        b(list, 0x16e360L);
        arraylist = new ArrayList(list.size());
        iterator = list.iterator();
_L2:
        cnq cnq1;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_501;
        }
        cnq1 = (cnq)iterator.next();
        obj = (cnz)map.get(cnq1.e);
        list = cnq1;
        if (cnq1.d == cnt.a)
        {
            if (obj != null)
            {
                break; /* Loop/switch isn't completed */
            }
            list = cnq1;
        }
_L3:
        arraylist.add(list);
        if (true) goto _L2; else goto _L1
_L1:
        cqk cqk1 = (cqk)obj;
        obj = cqk1.b;
        list = cnq1;
        if (obj != null)
        {
            int i = ((coi) (obj)).c;
            list = cnq1;
            if (((coi) (obj)).d * i > czd1.i())
            {
label0:
                {
                    long l3 = cnq1.f.b;
                    long l = cnq1.f.c;
                    Pair pair = cqk1.d.a(l3);
                    list = pair;
                    long l1 = l;
                    long l2 = l3;
                    if (pair.first == null)
                    {
                        if (pair.second == null)
                        {
                            list = String.valueOf(cnq1);
                            throw b.a((new StringBuilder(String.valueOf(list).length() + 32)).append("There are no keyframes for clip ").append(list).toString());
                        }
                        list = a;
                        String s = String.valueOf(cqk1);
                        Log.w(list, (new StringBuilder(String.valueOf(s).length() + 59)).append("First key-frame for ").append(s).append(" before ").append(l3).append(" was unset.").toString());
                        list = cqk1.d.a(((Long)pair.second).longValue());
                        l2 = ((Long)((Pair) (list)).first).longValue();
                        l1 = Math.min(cqk1.f, Math.max(0x16e360L + l2, l));
                    }
                    l3 = ((Long)((Pair) (list)).first).longValue();
                    if (l3 > l2)
                    {
                        throw new IllegalStateException(String.format("invalid earlier keyframe from getNearestKeyFrameTimestampsUs: %s %s", new Object[] {
                            Long.valueOf(l3), Long.valueOf(l2)
                        }));
                    }
                    if (((Pair) (list)).second == null)
                    {
                        l = 0x7fffffffffffffffL;
                    } else
                    {
                        l = ((Long)((Pair) (list)).second).longValue();
                    }
                    if (l2 - l3 >= l - l2)
                    {
                        l2 = l;
                        if (l1 - l >= 0x16e360L)
                        {
                            break label0;
                        }
                    }
                    l2 = l3;
                }
                list = cnq1.a().a(new cod(l2, l1)).a();
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        return arraylist;
    }

    public static void b(List list, long l)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            l = ((cnq)list.next()).f.a();
            if (l < 0x16e360L)
            {
                throw c.a((new StringBuilder(80)).append("clip duration ").append(l).append(" was less than minimum 1500000").append(" us").toString());
            }
        }

    }

}
