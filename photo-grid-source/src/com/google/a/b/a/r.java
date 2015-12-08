// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.b.s;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            s, p

public final class r extends am
{

    final p a;
    private final s b;
    private final Map c;

    private r(p p, s s1, Map map)
    {
        a = p;
        super();
        b = s1;
        c = map;
    }

    r(p p, s s1, Map map, byte byte0)
    {
        this(p, s1, map);
    }

    public final Object a(a a1)
    {
        Object obj;
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        obj = b.a();
        a1.c();
_L1:
        Object obj1;
        if (!a1.e())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = a1.g();
        obj1 = (com.google.a.b.a.s)c.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((com.google.a.b.a.s) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        a1.n();
          goto _L1
        try
        {
            ((com.google.a.b.a.s) (obj1)).a(a1, obj);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ag(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new AssertionError(a1);
        }
          goto _L1
        a1.d();
        return obj;
    }

    public final void a(f f1, Object obj)
    {
        if (obj == null)
        {
            f1.f();
            return;
        }
        f1.d();
        try
        {
            Iterator iterator = c.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.a.b.a.s s1 = (com.google.a.b.a.s)iterator.next();
                if (s1.h)
                {
                    f1.a(s1.g);
                    s1.a(f1, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new AssertionError();
        }
        f1.e();
    }
}
