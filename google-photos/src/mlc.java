// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class mlc
{

    public final mlm a;
    public final List b;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    mlc(mlm mlm, List list)
    {
        a = mlm;
        b = Collections.unmodifiableList(list);
        mlm = b.iterator();
        do
        {
            if (!mlm.hasNext())
            {
                break;
            }
            list = (mkq)mlm.next();
            c.put(((mkq) (list)).a, list);
            if (((mkq) (list)).b != null)
            {
                if (!d.containsKey(((mkq) (list)).b))
                {
                    d.put(((mkq) (list)).b, new HashSet());
                }
                ((Set)d.get(((mkq) (list)).b)).add(list);
            }
        } while (true);
        for (mlm = d.keySet().iterator(); mlm.hasNext(); d.put(list, Collections.unmodifiableSet((Set)d.get(list))))
        {
            list = (String)mlm.next();
        }

    }

    public final long a()
    {
        Iterator iterator = b.iterator();
        long l;
        for (l = 0L; iterator.hasNext(); l = Math.max(l, ((mkq)iterator.next()).c)) { }
        return l;
    }

    public final mkq a(String s)
    {
        return (mkq)c.get(s);
    }
}
