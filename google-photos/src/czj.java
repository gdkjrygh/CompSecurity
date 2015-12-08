// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class czj
    implements czl
{

    public static final czm a = new czk();
    private final blp b;
    private final cyy c;

    protected czj(blp blp1, cyy cyy1)
    {
        c = cyy1;
        b = (blp)b.a(blp1, "clipIdentifierGenerator", null);
    }

    public static List a(List list, boolean flag, cnq cnq1, cnq cnq2)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (flag && cnq1 != null)
        {
            arraylist.add(cnq1);
        }
        arraylist.addAll(list);
        if (cnq2 == null) goto _L2; else goto _L1
_L1:
        int i = arraylist.size() - 1;
_L7:
        if (i < 0) goto _L2; else goto _L3
_L3:
        if (((cnq)arraylist.get(i)).d == cnt.e) goto _L5; else goto _L4
_L4:
        arraylist.add(i + 1, cnq2);
_L2:
        return arraylist;
_L5:
        i--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final cqg a(Map map, Map map1, List list, List list1)
    {
        cqg cqg1 = new cqg();
        cqg1.a = map.values();
        cqg1 = cqg1.a(list);
        cqg1.d = Collections.unmodifiableList(list1);
        cqg1.e = c.s;
        map = b.a(map, map1, list, list1);
        cqg1.a((cnn)((Pair) (map)).first);
        if (((Pair) (map)).second != null)
        {
            cqg1.a((cnn)((Pair) (map)).second);
        }
        return cqg1;
    }

    public final cqg a(Map map, Map map1, List list, boolean flag, cnq cnq1, cnq cnq2)
    {
        if (list.isEmpty())
        {
            return null;
        }
        cnq2 = a(list, flag, cnq1, cnq2);
        b.a(map, "displayableByMediaId", null);
        if (cnq2.isEmpty())
        {
            list = Collections.emptyList();
        } else
        {
            cnq1 = new ArrayList(cnq2.size() - 1);
            flag = b.a(map, cnq2);
            int i = 0;
            while (i < cnq2.size() - 1) 
            {
                list = ((cnq)cnq2.get(i)).d;
                cnt cnt1 = ((cnq)cnq2.get(i + 1)).d;
                if (flag && (list == cnt.a || cnt1 == cnt.a))
                {
                    list = czu.a();
                } else
                {
                    long l = b.a(cnq2, i);
                    if (l == 0L)
                    {
                        list = czu.a();
                    } else
                    {
                        list = new czv(l);
                    }
                }
                cnq1.add(i, list);
                i++;
            }
            list = cnq1;
        }
        return a(map, map1, ((List) (cnq2)), list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof czj))
            {
                return false;
            }
            obj = (czj)obj;
            if (!((czj) (obj)).b.equals(b) || !c.equals(((czj) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(b, c.hashCode());
    }

}
