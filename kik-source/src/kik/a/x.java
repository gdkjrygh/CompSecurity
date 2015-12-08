// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kik.a.d.h;
import kik.a.e.j;

// Referenced classes of package kik.a:
//            a

public final class x
{

    private List a;
    private Map b;
    private final j c;
    private h d;

    public x(j j1)
    {
        b = new HashMap();
        c = j1;
        a = c.a();
        j1 = a.iterator();
        do
        {
            if (!j1.hasNext())
            {
                break;
            }
            h h1 = (h)j1.next();
            if (h1.c())
            {
                d = h1;
            }
        } while (true);
    }

    public final a a()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return (a)b.get(d.a());
        }
    }

    public final void a(String s)
    {
        if (d == null)
        {
            return;
        } else
        {
            d.a(s);
            c.a(s);
            return;
        }
    }

    public final String b()
    {
        if (d != null)
        {
            return d.a();
        } else
        {
            return null;
        }
    }

    public final a b(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        h h1;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            h1 = (h)iterator.next();
        } while (!s.equals(h1.b()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        a a1 = (a)b.get(h1.a());
        s = a1;
        if (a1 == null)
        {
            s = new a(h1.a());
            h1.a(true);
            c.a(h1);
            b.put(h1.a(), s);
        }
        d = h1;
        return s;
    }

    public final a c()
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        obj1 = d.a();
        obj = d;
_L4:
        a a1 = new a(((String) (obj1)));
        a.add(obj);
        b.put(obj1, a1);
        d = ((h) (obj));
        c.a(d);
        return a1;
_L2:
        obj = a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (h)((Iterator) (obj)).next();
        } while (((h) (obj1)).b() != null);
_L5:
        obj = obj1;
        if (obj1 == null)
        {
            obj = new h(UUID.randomUUID().toString());
        }
        obj1 = ((h) (obj)).a();
        ((h) (obj)).a(true);
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = null;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void d()
    {
        if (a() == null)
        {
            return;
        }
        String s = d.a();
        a a1 = (a)b.get(s);
        if (a1 != null)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                h h1 = (h)iterator.next();
                if (!h1.a().equals(s))
                {
                    continue;
                }
                a.remove(h1);
                break;
            } while (true);
            b.remove(s);
            c.b(s);
            a1.y();
            a1.e();
        }
        d = null;
    }
}
