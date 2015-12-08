// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class cze
    implements czc
{

    private final nom a;
    private final Map b;

    public cze(nom nom1, Map map)
    {
        a = (nom)b.a(nom1, "getStoryboardResult", null);
        b = (Map)b.a(map, "photoIdToUriMap", null);
    }

    public final long a(List list, List list1)
    {
        long l = 0L;
        list = a.b.b;
        int j = list.length;
        for (int i = 0; i < j; i++)
        {
            list1 = list[i];
            l += ((pxo) (list1)).c.b.longValue() - ((pxo) (list1)).c.a.longValue();
        }

        return l;
    }

    public final List a(List list, List list1, Map map, cqp cqp, czd czd)
    {
        if (a.a != noo.a)
        {
            return Collections.emptyList();
        }
        list = new ArrayList();
        list1 = new cns();
        map = a.b;
        int j = 0;
        int i = 0;
        do
        {
            while (i < ((pye) (map)).b.length) 
            {
                cqp = ((pye) (map)).b[i];
                int k = j;
                if (!((pye) (map)).d[i])
                {
                    czd = ((pye) (map)).e[j];
                    Object obj = nnt.a(((pxo) (cqp)).b);
                    obj = (nob)b.get(obj);
                    if (obj == null)
                    {
                        cqp = list1.a(b.a(czd)).a(cnt.f);
                        cqp.c = false;
                        list.add(cqp.a());
                    } else
                    {
                        obj = nny.a(((pxo) (cqp)).b, ((nob) (obj)).a, ((pxo) (cqp)).a);
                        czd = list1.a(b.a(czd));
                        czd.d = ((nny) (obj));
                        czd = czd.a(cnt.a(((pxo) (cqp)).a));
                        boolean flag;
                        if (((pxo) (cqp)).a != 7)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        czd.c = flag;
                        list.add(czd.a());
                    }
                    k = j + 1;
                }
                i++;
                j = k;
            }
            return list;
        } while (true);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cze)
        {
            if (((cze) (obj = (cze)obj)).a.equals(a) && ((cze) (obj)).b.equals(b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return b.h(a, b.hashCode());
    }
}
