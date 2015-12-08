// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class czg
{

    private final Map a = new HashMap();
    private final SparseArray b = new SparseArray();
    private List c;

    czg()
    {
        c = new ArrayList();
    }

    private List a(List list, List list1, Comparator comparator)
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList(list1.size());
        iterator = c.iterator();
        Iterator iterator1;
        if (iterator.hasNext())
        {
            list1 = (cnq)iterator.next();
        } else
        {
            list1 = null;
        }
        iterator1 = list.iterator();
        list = list1;
        do
        {
            list1 = list;
            if (!iterator1.hasNext())
            {
                break;
            }
            list1 = (cnq)iterator1.next();
            Object obj = (List)b.get(((cnq) (list1)).b);
            list1 = list;
            if (obj != null)
            {
                obj = ((List) (obj)).iterator();
                do
                {
                    list1 = list;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    for (list1 = (cnq)((Iterator) (obj)).next(); list != null && comparator.compare(list, list1) < 0;)
                    {
                        arraylist.add(list);
                        if (iterator.hasNext())
                        {
                            list = (cnq)iterator.next();
                        } else
                        {
                            list = null;
                        }
                    }

                    arraylist.add(list1);
                } while (true);
            }
            list = list1;
        } while (true);
          goto _L1
_L5:
        list = null;
_L3:
        list1 = list;
_L1:
label0:
        {
            if (list1 == null)
            {
                break label0;
            }
            arraylist.add(list1);
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            list = (cnq)iterator.next();
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
        return arraylist;
    }

    private void a()
    {
        a.clear();
        b.clear();
        c.clear();
    }

    private void a(List list)
    {
        Iterator iterator1;
        b.clear();
        c.clear();
        iterator1 = list.iterator();
_L3:
        Object obj;
        cnq cnq1;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_334;
        }
        cnq1 = (cnq)iterator1.next();
        obj = (List)a.get(cnq1.e);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L5:
        float f;
        Iterator iterator;
        if (obj == null)
        {
            c.add(cnq1);
        } else
        {
            List list1 = (List)b.get(((cnq) (obj)).b);
            list = list1;
            if (list1 == null)
            {
                list = new ArrayList();
                b.append(((cnq) (obj)).b, list);
            }
            list.add(cnq1);
        }
        if (true) goto _L3; else goto _L2
_L2:
        list = null;
        f = 3.402823E+38F;
        iterator = ((List) (obj)).iterator();
_L6:
        obj = list;
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        obj = (cnq)iterator.next();
        cod cod1 = ((cnq) (obj)).f;
        cod cod2 = cnq1.f;
        long l = Math.abs(cod1.c - cod2.c);
        long l1 = Math.abs(cod1.b - cod2.b);
        long l2 = Math.max(cod1.c, cod2.c);
        long l3 = Math.min(cod1.b, cod2.b);
        float f2 = 0.5F * (float)(l + l1);
        boolean flag = b.a(cod1, cod2);
        float f1 = f2;
        if (b.a(cod2, cod1) ^ flag)
        {
            f1 = f2 - ((float)l * (float)l1) / (float)(l2 - l3);
        }
        if (f1 < f)
        {
            list = ((List) (obj));
            f = f1;
        }
          goto _L6
          goto _L5
    }

    public final List a(Map map, cqv cqv1, List list)
    {
        crf crf1;
        List list1;
        crf1 = new crf(map);
        map = ((Map) (list.toArray()));
        Arrays.sort(map, crf1);
        list1 = Arrays.asList(map);
        Iterator iterator;
        map = cqv1.a;
        a.clear();
        iterator = map.iterator();
_L1:
        cnq cnq1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        cnq1 = (cnq)iterator.next();
        list = (List)a.get(cnq1.e);
        map = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        map = new ArrayList();
        a.put(cnq1.e, map);
        map.add(cnq1);
          goto _L1
        map;
        a();
        throw map;
        a(list1);
        map = a(cqv1.a, list1, ((Comparator) (crf1)));
        a();
        return map;
    }
}
