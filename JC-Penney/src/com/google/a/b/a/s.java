// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ab;
import com.google.a.af;
import com.google.a.b.ae;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            t, r

public final class s extends af
{

    private final ae a;
    private final Map b;

    private s(ae ae1, Map map)
    {
        a = ae1;
        b = map;
    }

    s(ae ae1, Map map, r r)
    {
        this(ae1, map);
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.d();
        try
        {
            Iterator iterator = b.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                t t1 = (t)iterator.next();
                if (t1.a(obj))
                {
                    d1.a(t1.g);
                    t1.a(d1, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            throw new AssertionError();
        }
        d1.e();
    }

    public Object b(a a1)
    {
        Object obj;
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        obj = a.a();
        a1.c();
_L1:
        Object obj1;
        if (!a1.e())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = a1.g();
        obj1 = (t)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((t) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        a1.n();
          goto _L1
        try
        {
            ((t) (obj1)).a(a1, obj);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ab(a1);
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
}
