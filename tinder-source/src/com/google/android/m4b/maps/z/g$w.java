// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.j;
import com.google.android.m4b.maps.y.s;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

abstract class b
    implements Iterator
{

    private int a;
    private int b;
    private g c;
    private AtomicReferenceArray d;
    private  e;
    private  f;
    private  g;
    private g h;

    private boolean a( )
    {
        Object obj1 = null;
        Object obj3;
        g g1;
        long l;
        l = h.p.a();
        obj3 = .g();
        g1 = h;
        if (.g() != null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L4:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        f = new <init>(h, obj3, obj);
        c.a();
        return true;
_L2:
        Object obj2 = .h().get();
        obj = obj1;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = g1.a(, l);
        obj = obj1;
        if (!flag)
        {
            obj = obj2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        c.a();
        return false;
        ;
        c.a();
        throw ;
    }

    private void b()
    {
        f = null;
        break MISSING_BLOCK_LABEL_5;
        if (!c() && !d())
        {
            while (a >= 0) 
            {
                a aa[] = h.c;
                int i = a;
                a = i - 1;
                c = aa[i];
                if (c.b != 0)
                {
                    d = c.d;
                    b = d.length() - 1;
                    if (d())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    private boolean c()
    {
        if (e != null)
        {
            for (e = e.j(); e != null; e = e.j())
            {
                if (a(e))
                {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean d()
    {
        while (b >= 0) 
        {
            Object obj = d;
            int i = b;
            b = i - 1;
            obj = ()((AtomicReferenceArray) (obj)).get(i);
            e = (() (obj));
            if (obj != null && (a(e) || c()))
            {
                return true;
            }
        }
        return false;
    }

    final c a()
    {
        if (f == null)
        {
            throw new NoSuchElementException();
        } else
        {
            g = f;
            b();
            return g;
        }
    }

    public boolean hasNext()
    {
        return f != null;
    }

    public void remove()
    {
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        h.remove(g.getKey());
        g = null;
    }

    (g g1)
    {
        h = g1;
        super();
        a = g1.c.length - 1;
        b = -1;
        b();
    }
}
