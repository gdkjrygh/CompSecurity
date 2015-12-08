// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class czn
    implements czl
{

    private final czj a;

    czn(blp blp, cyy cyy)
    {
        a = new czj(blp, cyy);
    }

    private static List a(Map map, List list)
    {
        b.a(map, "displayableByMediaId", null);
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        map = Collections.emptyList();
_L4:
        return map;
_L2:
        ArrayList arraylist = new ArrayList(list.size() - 1);
        int i = 0;
        do
        {
            map = arraylist;
            if (i >= list.size() - 1)
            {
                continue;
            }
            boolean flag;
            if (i + 1 < list.size() && ((cnq)list.get(i + 1)).k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                map = czu.a();
            } else
            {
                long l = b.a(list, i);
                if (l == 0L)
                {
                    map = czu.a();
                } else
                {
                    map = new czv(l);
                }
            }
            arraylist.add(i, map);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final cqg a(Map map, Map map1, List list, boolean flag, cnq cnq1, cnq cnq2)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        int l = 0;
        int j = -1;
        while (i < list.size()) 
        {
            Object obj = (cnq)list.get(i);
            cns cns1 = ((cnq) (obj)).a();
            obj = ((cnq) (obj)).b();
            int i1 = l;
            int k = j;
            if (obj != null)
            {
                i1 = l;
                k = j;
                if (((pyg) (obj)).f != null)
                {
                    pxu apxu[] = ((pyg) (obj)).f.c;
                    int j1 = ((pyg) (obj)).f.b.intValue();
                    cns1.e = apxu.length;
                    boolean flag1;
                    if (j == j1 && (l == 2 || l == 3))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    cns1.f = flag1;
                    i1 = l;
                    k = j;
                    if (j != j1)
                    {
                        i1 = ((pyg) (obj)).f.a;
                        k = j1;
                    }
                }
            }
            arraylist.add(cns1.a());
            i++;
            l = i1;
            j = k;
        }
        list = czj.a(arraylist, flag, cnq1, cnq2);
        cnq1 = a(map, list);
        return a.a(map, map1, list, cnq1);
    }
}
