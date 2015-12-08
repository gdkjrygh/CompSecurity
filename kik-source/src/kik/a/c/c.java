// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.c;

import com.c.a.a.af;
import com.c.a.b.m;
import com.c.a.b.v;
import com.c.a.f.a;
import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.g.s;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.d.r;
import kik.a.f.f.d;
import org.c.b;

// Referenced classes of package kik.a.c:
//            d, g, f, e

public final class c
{

    private static final b a = org.c.c.a("LinkModerationManager");
    private static final v b = v.a("kik.com", "kik.me", "photobombkik.com", "youtube.com", "soundcloud.com");
    private final g c;
    private f d;
    private final kik.a.c.f e;
    private final i f = new kik.a.c.d(this);

    public c(kik.a.e.f f1, e e1, kik.a.e.v v1)
    {
        d = new f();
        c = new g(f1);
        d.a(e1, f);
        e = new kik.a.c.f(v1.p());
    }

    static kik.a.c.f a(c c1)
    {
        return c1.e;
    }

    private Map b(List list)
    {
        HashMap hashmap = new HashMap(list.size());
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (af.b(s1) || b(s1))
            {
                hashmap.put(s1, s.a(r.a(0x7fffffffffffffffL)));
            } else
            {
                p p1 = e.a(s1);
                if (p1 != null)
                {
                    hashmap.put(s1, p1);
                }
            }
        } while (true);
        list = new ArrayList(list);
        list.removeAll(hashmap.keySet());
        Map map;
        for (list = c(list).iterator(); list.hasNext(); e.a(map))
        {
            map = (Map)list.next();
            c.a(new d(map.keySet()), new kik.a.c.e(this, map));
            hashmap.putAll(map);
        }

        return hashmap;
    }

    private static boolean b(String s1)
    {
        boolean flag = b.contains(com.c.a.f.a.a(URI.create(s1).getHost()).a().toString());
        return flag;
        s1;
_L2:
        return false;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static List c(List list)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new HashMap();
        Iterator iterator = list.iterator();
        for (list = ((List) (obj)); iterator.hasNext(); list = ((List) (obj)))
        {
            String s1 = (String)iterator.next();
            p p1 = new p();
            obj = list;
            if (list.size() == 100)
            {
                arraylist.add(list);
                obj = new HashMap();
            }
            ((Map) (obj)).put(s1, p1);
        }

        if (list.size() > 0)
        {
            arraylist.add(list);
        }
        return arraylist;
    }

    public final p a(String s1)
    {
        try
        {
            s1 = s.c((p)b(m.a(s1)).get(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s.a(s1);
        }
        return s1;
    }

    public final void a()
    {
        e.a();
        d.a();
    }

    public final void a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        } else
        {
            b(list);
            return;
        }
    }

}
