// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

abstract class b
    implements Iterator
{

    private int a;
    private int b;
    private g c;
    private AtomicReferenceArray d;
    private ferenceArray e;
    private ferenceArray f;
    private ferenceArray g;
    private aw h;

    private boolean a(b b1)
    {
        Object obj1 = null;
        Object obj3;
        aw aw1;
        obj3 = b1.d();
        aw1 = h;
        if (b1.d() != null) goto _L2; else goto _L1
_L1:
        Object obj = obj1;
_L4:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        f = new <init>(h, obj3, obj);
        c.c();
        return true;
_L2:
        Object obj2 = b1.a().get();
        obj = obj1;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (!aw1.b())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag = aw1.a(b1);
        obj = obj1;
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        c.c();
        return false;
        b1;
        c.c();
        throw b1;
    }

    private void b()
    {
        f = null;
        break MISSING_BLOCK_LABEL_5;
        if (!c() && !d())
        {
            while (a >= 0) 
            {
                c ac[] = h.a;
                int i = a;
                a = i - 1;
                c = ac[i];
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
            for (e = e.b(); e != null; e = e.b())
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
            obj = (b)((AtomicReferenceArray) (obj)).get(i);
            e = ((e) (obj));
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
        j.b(flag, "no calls to next() since the last call to remove()");
        h.remove(g.getKey());
        g = null;
    }

    ferenceArray(aw aw1)
    {
        h = aw1;
        super();
        a = aw1.a.length - 1;
        b = -1;
        b();
    }
}
