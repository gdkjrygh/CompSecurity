// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.i;

import com.kik.g.as;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.n.a.b.e;
import com.kik.n.a.b.g;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kik.a.j.n;

// Referenced classes of package kik.a.i:
//            a

final class f
    implements as
{

    final h.a a;
    final a b;

    f(a a1, h.a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    private p a(List list)
    {
        Object obj = a;
        Object obj1;
        g g1;
        Object obj2;
        if (obj == null)
        {
            g1 = null;
        } else
        {
            g1 = (new g()).d(((h.a) (obj)).a()).a(((h.a) (obj)).b()).b(((h.a) (obj)).c()).c(((h.a) (obj)).d()).a(Long.valueOf(((h.a) (obj)).e()));
        }
        list.add(0, a);
        if (kik.a.i.a.a(b).size() > 0)
        {
            obj = (String)kik.a.i.a.a(b).get(0);
            obj1 = (e)kik.a.i.a.e(b).get(obj);
            if (((e) (obj1)).c() >= 10)
            {
                obj1 = null;
                obj = null;
            }
        } else
        {
            obj1 = null;
            obj = null;
        }
        obj2 = obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new Random();
            obj2 = new byte[16];
            for (int i = list.size(); i > 0 && list.size() >= 250; i--)
            {
                String s1 = (String)kik.a.i.a.a(b).remove(kik.a.i.a.a(b).size() - 1);
                e e1 = (e)kik.a.i.a.e(b).get(s1);
                for (int j = 0; j < e1.c(); j++)
                {
                    list.remove(list.size() - 1);
                }

                kik.a.i.a.b(b).b("browser_history_item_list", s1, null);
            }

            ((Random) (obj1)).nextBytes(((byte []) (obj2)));
            try
            {
                list = com.kik.m.e.b(((byte []) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list = ((List) (obj));
            }
            obj2 = new e();
            kik.a.i.a.a(b).add(0, list);
            kik.a.i.a.e(b).put(list, obj2);
            obj1 = list;
        }
        ((e) (obj2)).a(g1);
        return s.a(kik.a.i.a.b(b).b("browser_history_item_list", ((String) (obj1)), ((com.b.a.n) (obj2)), Long.valueOf(5000L)));
    }

    public final volatile Object a(Object obj)
    {
        return a((List)obj);
    }
}
