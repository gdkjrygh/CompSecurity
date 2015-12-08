// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class czp
    implements czs
{

    private static final String a = czp.getSimpleName();
    private final blp b;

    public czp(blp blp1)
    {
        b = (blp)b.a(blp1, "clipIdentifierGenerator", null);
    }

    private static long a(cay cay1, cnt cnt1, cnt cnt2, cnq cnq1)
    {
        return Math.min(cay1.a(cnt1, cnt2), cnq1.f.a() / 3L);
    }

    private static SparseArray a(List list, cyy cyy1, Map map, Map map1, cok cok1, boolean flag, boolean flag1)
    {
        SparseArray sparsearray = new SparseArray(list.size());
        list = list.iterator();
        int i = 0;
        while (list.hasNext()) 
        {
            cnq cnq1 = (cnq)list.next();
            pxq pxq1 = (pxq)map1.get(cnq1.e);
            cnz cnz1 = (cnz)map.get(cnq1.e);
            if (cnz1 == null)
            {
                list = String.valueOf(cnq1.e);
                throw c.a((new StringBuilder(String.valueOf(list).length() + 31)).append("Displayable for clip:").append(list).append(" not found").toString());
            }
            boolean flag2;
            if (flag && i == 0 && flag1 && cyy1.x)
            {
                flag2 = false;
            } else
            {
                flag2 = flag;
            }
            sparsearray.put(cnq1.b, cnu.a(cnq1, pxq1, cok1.a, cok1.b, cnz1, flag2));
            i++;
        }
        return sparsearray;
    }

    public final cnq a(cnq cnq1, cyy cyy1)
    {
        boolean flag = false;
        pyg pyg1 = new pyg();
        Object obj = cyy1.s;
        pyg1.c = new pyi();
        pyg1.b = new pyi();
        pyg1.c.a = Long.valueOf(a(((cay) (obj)), cnt.c, cnq1.d, cnq1));
        pyg1.c.b = Long.valueOf(a(((cay) (obj)), cnt.a, cnq1.d, cnq1));
        pyg1.b.a = Long.valueOf(a(((cay) (obj)), cnq1.d, cnt.c, cnq1));
        pyg1.b.b = Long.valueOf(a(((cay) (obj)), cnq1.d, cnt.a, cnq1));
        obj = cyy1.s.a(cnq1);
        pyg1.a = new int[((List) (obj)).size()];
        for (int i = 0; i < ((List) (obj)).size(); i++)
        {
            pyg1.a[i] = ((Integer)((List) (obj)).get(i)).intValue();
        }

        pyg1.d = cyy1.s.b(cnq1);
        cyy1 = cyy1.s.c(cnq1);
        pyg1.e = new double[cyy1.size()];
        for (int j = ((flag) ? 1 : 0); j < cyy1.size(); j++)
        {
            pyg1.e[j] = ((Double)cyy1.get(j)).doubleValue();
        }

        return cnq1.a().a(pyg1).a();
    }

    public final czt a(boolean flag, pye pye1, int i, List list, cyy cyy1, List list1, SparseArray sparsearray, 
            boolean flag1, Map map, Map map1, boolean flag2, boolean flag3)
    {
        if (cyy1 == cyy.l)
        {
            return (new czq(b)).a(flag, pye1, i, list, cyy1, list1, sparsearray, flag1, map, map1, flag2, flag3);
        }
        pyj pyj1;
        ArrayList arraylist;
        if (flag && pye1 != null && pye1.i != null && pye1.j != null)
        {
            list1 = String.valueOf(pye1.i);
            String s = String.valueOf(pye1.j);
            (new StringBuilder(String.valueOf(list1).length() + 36 + String.valueOf(s).length())).append("Using cloud storyboard dimensions:").append(list1).append(", ").append(s);
            list1 = cok.a(list, map, pye1.i.intValue(), pye1.j.intValue());
        } else
        {
            list1 = cok.a(list, map);
        }
        pyj1 = new pyj();
        arraylist = new ArrayList(list.size());
        if (b.a(pye1, flag1, cyy1, list1))
        {
            return b.a(list1, pye1, list, cyy1, b, sparsearray);
        }
        for (i = 0; i < list.size(); i++)
        {
            arraylist.add(a((cnq)list.get(i), cyy1));
        }

        Object obj = new pyg();
        obj.b = new pyi();
        ((pyg) (obj)).b.a = Long.valueOf(0L);
        ((pyg) (obj)).b.b = Long.valueOf(0L);
        obj.c = new pyi();
        ((pyg) (obj)).c.a = Long.valueOf(0L);
        ((pyg) (obj)).c.b = Long.valueOf(0L);
        cns cns1 = new cns();
        cns1.a = b.a();
        cns1 = cns1.a(cnt.d);
        cns1.d = cnq.a;
        cns1 = cns1.a(new cod(0L, 0xf4240L));
        cns1.c = true;
        obj = cns1.a(((pyg) (obj))).a();
        if (pye1 != null)
        {
            sparsearray = a(list, cyy1, map, map1, ((cok) (list1)), flag2, flag3);
        }
        return new czt(list1, sparsearray, pyj1, arraylist, b.a(cyy1, b), ((cnq) (obj)));
    }

}
