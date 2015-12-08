// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.m.o;
import com.kik.n.a.b.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kik.a.d.ab;
import kik.a.j.n;

// Referenced classes of package kik.a.i:
//            a

final class e
    implements as
{

    final List a;
    final a b;

    e(a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    private p a(o o1)
    {
        ArrayList arraylist = new ArrayList();
        o1 = (Map)o1.b;
        Iterator iterator = o1.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            com.kik.n.a.b.e e1 = (com.kik.n.a.b.e)o1.get(s1);
            List list = e1.b();
            int i = 0;
            boolean flag = false;
label0:
            for (; i < a.size(); i++)
            {
                String s2 = (String)a.get(i);
                Iterator iterator1 = list.iterator();
                g g1;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    g1 = (g)iterator1.next();
                } while (s2 == null || g1.g() == null || !s2.equals(g1.g()));
                list.remove(g1);
                a.remove(i);
                i--;
                flag = true;
            }

            if (flag)
            {
                arraylist.add(ab.a("browser_history_item_list", s1, e1));
            }
        } while (!a.isEmpty());
        if (!arraylist.isEmpty())
        {
            kik.a.i.a.b(b).a(arraylist);
            synchronized (kik.a.i.a.c(b))
            {
                kik.a.i.a.d(b);
            }
        }
        return s.a(null);
        exception;
        o1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final volatile Object a(Object obj)
    {
        return a((o)obj);
    }
}
