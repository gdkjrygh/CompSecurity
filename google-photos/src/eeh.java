// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class eeh
    implements iwj
{

    private final List a;
    private final Map b = new HashMap();
    private final eer c;

    eeh(List list, eer eer1)
    {
        a = list;
        c = eer1;
    }

    public final Object a(Object obj)
    {
        eea eea1 = (eea)obj;
        List list = eea1.a;
        obj = null;
        int i = -1;
        b.clear();
        hgo hgo1;
        for (Iterator iterator = eea1.a.iterator(); iterator.hasNext(); b.put(Long.valueOf(hgo1.b()), hgo1))
        {
            hgo1 = (hgo)iterator.next();
        }

        Iterator iterator1 = a.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            long l = ((eer)iterator1.next()).a;
            hgo hgo2 = (hgo)b.get(Long.valueOf(l));
            if (hgo2 != null)
            {
                int j = i;
                Object obj1 = obj;
                if (c != null)
                {
                    j = i;
                    obj1 = obj;
                    if (c.a == l)
                    {
                        j = list.indexOf(hgo2);
                        obj1 = hgo2;
                    }
                }
                list.remove(hgo2);
                i = j;
                obj = obj1;
            }
        } while (true);
        return new eei(list, eea1.b, ((hgo) (obj)), i);
    }
}
