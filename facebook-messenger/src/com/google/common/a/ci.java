// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.a:
//            bj, cm, dk, cn

abstract class ci
{

    int b;
    int c;
    cn d;
    AtomicReferenceArray e;
    cm f;
    dk g;
    dk h;
    final bj i;

    ci(bj bj1)
    {
        i = bj1;
        super();
        b = bj1.d.length - 1;
        c = -1;
        b();
    }

    boolean a(cm cm1)
    {
        Object obj;
        obj = cm1.getKey();
        cm1 = ((cm) (i.b(cm1)));
        if (cm1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        g = new dk(i, obj, cm1);
        d.n();
        return true;
        d.n();
        return false;
        cm1;
        d.n();
        throw cm1;
    }

    final void b()
    {
        g = null;
        break MISSING_BLOCK_LABEL_5;
        if (!c() && !d())
        {
            while (b >= 0) 
            {
                cn acn[] = i.d;
                int j = b;
                b = j - 1;
                d = acn[j];
                if (d.b != 0)
                {
                    e = d.e;
                    c = e.length() - 1;
                    if (d())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    boolean c()
    {
        if (f != null)
        {
            for (f = f.getNext(); f != null; f = f.getNext())
            {
                if (a(f))
                {
                    return true;
                }
            }

        }
        return false;
    }

    boolean d()
    {
        while (c >= 0) 
        {
            Object obj = e;
            int j = c;
            c = j - 1;
            obj = (cm)((AtomicReferenceArray) (obj)).get(j);
            f = ((cm) (obj));
            if (obj != null && (a(f) || c()))
            {
                return true;
            }
        }
        return false;
    }

    dk e()
    {
        if (g == null)
        {
            throw new NoSuchElementException();
        } else
        {
            h = g;
            b();
            return h;
        }
    }

    public boolean hasNext()
    {
        return g != null;
    }

    public void remove()
    {
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        i.remove(h.getKey());
        h = null;
    }
}
