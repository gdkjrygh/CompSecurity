// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class ouv
    implements out
{

    private final ote a;
    private final int b[];
    private List c;
    private boolean d;
    private long e;
    private long f;
    private Iterator g;

    public ouv(int ai[], ote ote1)
    {
        c = new ArrayList();
        d = true;
        e = -1L;
        f = -1L;
        b = (int[])p.a(ai);
        a = (ote)p.a(ote1);
        int i;
        int k;
        int i1;
        int j1;
        if (ote1.h != null)
        {
            i1 = ote1.h.length;
        } else
        {
            i1 = ote1.g.length;
        }
        Arrays.sort(ai);
        i = 0;
        j1 = -1;
        k = -1;
        while (i < ai.length) 
        {
            int l1 = ai[i];
            p.a(l1, ote1.g.length);
            int k1 = ote1.d(l1);
            int l = k;
            if (k != -1)
            {
                l = k;
                if (j1 != k1)
                {
                    l = a(j1, i1);
                    c.add(new ouw(this, k, i - k, l));
                    l = -1;
                }
            }
            if (ote1.a(l1))
            {
                k = a(k1, i1);
                c.add(new ouw(this, i, 1, k - 0x80000000));
                k = l;
            } else
            {
                k = l;
                if (l == -1)
                {
                    j1 = k1;
                    k = i;
                }
            }
            i++;
        }
        if (k != -1)
        {
            int j = a(j1, i1);
            c.add(new ouw(this, k, ai.length - k, j));
        }
    }

    private static int a(int i, int j)
    {
        int k;
        k = 0;
        boolean flag = false;
        boolean flag1;
        if (j > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        p.a(i, j);
        if (j <= 1) goto _L2; else goto _L1
_L1:
        k = j - 1;
        j = ((flag) ? 1 : 0);
_L6:
        if (i % k != 0) goto _L4; else goto _L3
_L3:
        k = j;
_L2:
        return k;
_L4:
        int l = k / 2;
        int i1 = j + 1;
        k = l;
        j = i1;
        if (l <= 1)
        {
            return i1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            Collections.sort(c);
            d = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static int[] a(ouv ouv1)
    {
        return ouv1.b;
    }

    static long b(ouv ouv1)
    {
        return ouv1.e;
    }

    static long c(ouv ouv1)
    {
        return ouv1.f;
    }

    static ote d(ouv ouv1)
    {
        return ouv1.a;
    }

    public final void a(long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e != l || f != l1)
        {
            e = l;
            f = l1;
            d = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean hasNext()
    {
        if (g != null && g.hasNext()) goto _L2; else goto _L1
_L1:
        a();
_L6:
        if (c.size() <= 0) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((ouw)c.remove(c.size() - 1)).iterator();
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        g = iterator;
_L2:
        return g != null && g.hasNext();
_L4:
        iterator = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public final Object next()
    {
        if (hasNext())
        {
            return (Integer)g.next();
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
