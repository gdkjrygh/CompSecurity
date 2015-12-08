// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class cyk
{

    private static final String a = cyk.getSimpleName();

    public cyk()
    {
    }

    private static cyn a(List list, List list1, int i, List list2)
    {
        Object obj;
        Object obj1;
        int j;
        int k;
        int l;
        obj = null;
        j = 10;
        k = 0;
        obj1 = null;
        (new StringBuilder(54)).append("findAllMatchedTypes previousList: curbest: 0");
        l = 0;
_L7:
        if (l >= list.size()) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj4;
        Object obj5;
        int i1;
        int k1;
        obj5 = (cyn)list.get(l);
        obj2 = obj1;
        i1 = k;
        k1 = j;
        obj4 = obj;
        if (((cyn) (obj5)).b == 0) goto _L4; else goto _L3
_L3:
        Iterator iterator;
        obj2 = String.valueOf(((cyn) (obj5)).toString());
        (new StringBuilder(String.valueOf(obj2).length() + 18)).append("ppp: ").append(l).append(": ").append(((String) (obj2)));
        iterator = c(list1.subList(((cyn) (obj5)).b, i + 1), list2).iterator();
_L6:
        obj2 = obj1;
        i1 = k;
        k1 = j;
        obj4 = obj;
        if (!iterator.hasNext()) goto _L4; else goto _L5
_L5:
        obj2 = (cyj)iterator.next();
        obj4 = String.valueOf(((cyj) (obj2)).toString());
        String s = String.valueOf(((cyj) (obj2)).U);
        (new StringBuilder(String.valueOf(obj4).length() + 6 + String.valueOf(s).length())).append("tt: ").append(((String) (obj4))).append(": ").append(s);
        i1 = Math.max(((cyj) (obj2)).S, ((cyn) (obj5)).d);
        obj4 = new HashSet(((cyn) (obj5)).c);
        k1 = ((Set) (obj4)).size();
        (new StringBuilder(16)).append("ddd: ").append(k1);
        ((Set) (obj4)).addAll(((cyj) (obj2)).U);
        if (i1 < j || i1 == j && ((Set) (obj4)).size() > k)
        {
            j = ((Set) (obj4)).size();
            k = i1;
            obj1 = obj5;
            obj = obj2;
        } else
        {
            int j1 = j;
            Object obj3 = obj;
            obj = obj1;
            j = k;
            k = j1;
            obj1 = obj3;
        }
        obj2 = obj1;
        i1 = k;
        obj1 = obj;
        k = j;
        j = i1;
        obj = obj2;
        if (true) goto _L6; else goto _L4
_L4:
        l++;
        obj1 = obj2;
        k = i1;
        j = k1;
        obj = obj4;
          goto _L7
_L2:
        (new StringBuilder(41)).append("findAllMatchedTypes: curbest: ").append(k);
        obj4 = c(list1.subList(0, i + 1), list2).iterator();
        l = k;
label0:
        do
        {
label1:
            {
                if (!((Iterator) (obj4)).hasNext())
                {
                    break label0;
                }
                obj2 = (cyj)((Iterator) (obj4)).next();
                list = String.valueOf(((cyj) (obj2)).toString());
                list2 = String.valueOf(((cyj) (obj2)).U);
                (new StringBuilder(String.valueOf(list).length() + 6 + String.valueOf(list2).length())).append("tt: ").append(list).append(": ").append(list2);
                k1 = ((cyj) (obj2)).S;
                obj5 = ((cyj) (obj2)).U;
                if (k1 >= j)
                {
                    list2 = ((List) (obj1));
                    i1 = l;
                    k = j;
                    list = ((List) (obj));
                    if (k1 != j)
                    {
                        break label1;
                    }
                    list2 = ((List) (obj1));
                    i1 = l;
                    k = j;
                    list = ((List) (obj));
                    if (((List) (obj5)).size() <= l)
                    {
                        break label1;
                    }
                }
                list = null;
                i1 = ((List) (obj5)).size();
                list2 = ((List) (obj2));
                k = k1;
            }
            obj = String.valueOf(((cyj) (obj2)).toString());
            if (((String) (obj)).length() != 0)
            {
                "type: ".concat(((String) (obj)));
                obj1 = list2;
                l = i1;
                j = k;
                obj = list;
            } else
            {
                new String("type: ");
                obj1 = list2;
                l = i1;
                j = k;
                obj = list;
            }
        } while (true);
        list = new cyn();
        if (obj1 == null)
        {
            return list;
        }
        if (obj == null)
        {
            list.a(new cyl(list1.subList(0, i + 1), ((cyj) (obj1))));
            return list;
        }
        for (list2 = ((cyn) (obj)).a.iterator(); list2.hasNext(); list.a((cyl)list2.next())) { }
        list.a(new cyl(list1.subList(((cyn) (obj)).b, i + 1), ((cyj) (obj1))));
        return list;
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        cyj acyj[] = (cyj[])cyj.getEnumConstants();
        int j = acyj.length;
label0:
        for (int i = 0; i < j; i++)
        {
            cyj cyj1 = acyj[i];
            int k = cyj1.S;
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
            } while (!Integer.valueOf(k).equals((Integer)iterator.next()));
            arraylist.add(cyj1);
        }

        return arraylist;
    }

    private static boolean a(List list, cyj cyj1)
    {
        cyj1 = cyj1.V;
        if (cyj1.size() == list.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        boolean flag;
        for (i = 0; i >= cyj1.size();)
        {
            break MISSING_BLOCK_LABEL_116;
        }

        String s = (String)cyj1.get(i);
        Iterator iterator = ((cym)list.get(i)).a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_110;
            }
        } while (!s.equals((String)iterator.next()));
        flag = true;
_L4:
        if (!flag) goto _L1; else goto _L3
_L3:
        i++;
          goto _L2
        flag = false;
          goto _L4
        return true;
          goto _L2
    }

    private static List b(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(a(arraylist, list, i, list1));
        }

        return ((cyn)arraylist.get(j - 1)).a;
    }

    private static List c(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            cyj cyj1 = (cyj)list1.next();
            if (a(list, cyj1))
            {
                arraylist.add(cyj1);
            }
        } while (true);
        return arraylist;
    }

    public final List a(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        int i = list.size();
        if (i == 0)
        {
            return arraylist;
        }
        Object obj = (cnq)list.get(0);
        if (((cnq) (obj)).d == cnt.e || ((cnq) (obj)).d == cnt.d)
        {
            list1 = Arrays.asList(new cym[] {
                new cym(this, ((cnq) (obj)), null, null, (pxq)list1.get(0), null, null)
            });
            if (((cnq) (obj)).d == cnt.e)
            {
                list = cyj.R;
            } else
            {
                list = cyj.Q;
            }
            return Arrays.asList(new cyl[] {
                new cyl(list1, list)
            });
        }
        Object obj1 = Arrays.asList(new cym[] {
            new cym(this, ((cnq) (obj)), null, null, (pxq)list1.get(0), null, null)
        });
        pxq pxq1;
        ArrayList arraylist1;
        int k;
        if (((cnq) (obj)).d == cnt.a)
        {
            obj = cyj.b;
        } else
        {
            obj = cyj.a;
        }
        arraylist.add(new cyl(((List) (obj1)), ((cyj) (obj))));
        obj = (cnq)list.get(i - 1);
        obj1 = (pxq)list1.get(i - 1);
        if (((cnq) (obj)).d == cnt.e)
        {
            obj = new cyl(Arrays.asList(new cym[] {
                new cym(this, ((cnq) (obj)), null, null, ((pxq) (obj1)), null, null)
            }), cyj.R);
            i--;
        } else
        {
            obj = null;
        }
        obj1 = (cnq)list.get(i - 1);
        pxq1 = (pxq)list1.get(i - 1);
        if (((cnq) (obj1)).d == cnt.d)
        {
            obj1 = new cyl(Arrays.asList(new cym[] {
                new cym(this, ((cnq) (obj1)), null, null, pxq1, null, null)
            }), cyj.Q);
            i--;
        } else
        {
            obj1 = null;
        }
        arraylist1 = new ArrayList();
        k = 1;
        while (k < i) 
        {
            cnq cnq1;
            cnq cnq2;
            pxq pxq2;
            pxq pxq3;
            if (k == 1)
            {
                cnq1 = null;
            } else
            {
                cnq1 = (cnq)list.get(k - 1);
            }
            if (k == i - 1)
            {
                cnq2 = null;
            } else
            {
                cnq2 = (cnq)list.get(k + 1);
            }
            if (k == 1)
            {
                pxq2 = null;
            } else
            {
                pxq2 = (pxq)list1.get(k - 1);
            }
            if (k == list1.size() - 1)
            {
                pxq3 = null;
            } else
            {
                pxq3 = (pxq)list1.get(k + 1);
            }
            arraylist1.add(new cym(this, (cnq)list.get(k), cnq1, cnq2, (pxq)list1.get(k), pxq2, pxq3));
            k++;
        }
        if (arraylist1.size() == 0)
        {
            if (obj1 != null)
            {
                arraylist.add(obj1);
            }
            if (obj != null)
            {
                arraylist.add(obj);
            }
            return arraylist;
        }
        for (int j = 1; j <= 3; j++)
        {
            list = new ArrayList();
            for (int l = 0; l <= j; l++)
            {
                list.add(Integer.valueOf(l));
            }

            list = b(arraylist1, a(list));
            if (!list.isEmpty())
            {
                arraylist.addAll(list);
                if (obj1 != null)
                {
                    arraylist.add(obj1);
                }
                if (obj != null)
                {
                    arraylist.add(obj);
                }
                return arraylist;
            }
        }

        return null;
    }

}
