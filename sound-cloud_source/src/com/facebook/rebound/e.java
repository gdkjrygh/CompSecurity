// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.facebook.rebound:
//            m, h, i, j, 
//            l

public class e
{

    final Map a = new HashMap();
    final Set b = new CopyOnWriteArraySet();
    final m c;
    boolean d;
    private final i e;
    private final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    private long g;

    public e(i k, m m1)
    {
        g = -1L;
        d = true;
        if (k == null)
        {
            throw new IllegalArgumentException("clock is required");
        }
        if (m1 == null)
        {
            throw new IllegalArgumentException("springLooper is required");
        } else
        {
            e = k;
            c = m1;
            c.a(this);
            return;
        }
    }

    public final h a()
    {
        h h1 = new h(this);
        if (a.containsKey(h1.c))
        {
            throw new IllegalArgumentException("spring is already registered");
        } else
        {
            a.put(h1.c, h1);
            return h1;
        }
    }

    public final void b()
    {
        long l2 = e.a();
        if (g == -1L)
        {
            g = l2 - 1L;
        }
        long l3 = g;
        g = l2;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); iterator.next()) { }
        Iterator iterator1 = b.iterator();
label0:
        do
        {
label1:
            {
                h h1;
                boolean flag;
                boolean flag1;
label2:
                {
                    if (!iterator1.hasNext())
                    {
                        break label0;
                    }
                    h1 = (h)iterator1.next();
                    double d1;
                    double d3;
                    double d5;
                    double d6;
                    double d7;
                    double d8;
                    boolean flag2;
                    if (!h1.b() || !h1.i)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    d3 = (double)(l2 - l3) / 1000D;
                    flag2 = h1.b();
                    if (flag2 && h1.i)
                    {
                        continue;
                    }
                    d1 = d3;
                    if (d3 > 0.064000000000000001D)
                    {
                        d1 = 0.064000000000000001D;
                    }
                    h1.k = d1 + h1.k;
                    d7 = h1.a.b;
                    d8 = h1.a.a;
                    d3 = h1.d.a;
                    d1 = h1.d.b;
                    d6 = h1.f.a;
                    d5 = h1.f.b;
                    while (h1.k >= 0.001D) 
                    {
                        h1.k = h1.k - 0.001D;
                        if (h1.k < 0.001D)
                        {
                            h1.e.a = d3;
                            h1.e.b = d1;
                        }
                        double d9 = (h1.h - d6) * d7 - d8 * d1;
                        double d13 = d1 + 0.001D * d9 * 0.5D;
                        double d10 = (h1.h - (0.001D * d1 * 0.5D + d3)) * d7 - d8 * d13;
                        double d14 = d1 + 0.001D * d10 * 0.5D;
                        double d11 = (h1.h - (0.001D * d13 * 0.5D + d3)) * d7 - d8 * d14;
                        d6 = d3 + 0.001D * d14;
                        d5 = 0.001D * d11 + d1;
                        double d12 = h1.h;
                        d3 += ((d13 + d14) * 2D + d1 + d5) * 0.16666666666666666D * 0.001D;
                        d1 += (d9 + (d10 + d11) * 2D + ((d12 - d6) * d7 - d8 * d5)) * 0.16666666666666666D * 0.001D;
                    }
                    h1.f.a = d6;
                    h1.f.b = d5;
                    h1.d.a = d3;
                    h1.d.b = d1;
                    if (h1.k > 0.0D)
                    {
                        double d2 = h1.k / 0.001D;
                        h1.d.a = h1.d.a * d2 + h1.e.a * (1.0D - d2);
                        h.a a1 = h1.d;
                        double d4 = h1.d.b;
                        a1.b = (1.0D - d2) * h1.e.b + d4 * d2;
                    }
                    if (!h1.b())
                    {
                        if (!h1.b)
                        {
                            break label2;
                        }
                        Iterator iterator2;
                        l l1;
                        if (h1.g < h1.h && h1.d.a > h1.h || h1.g > h1.h && h1.d.a < h1.h)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (!flag)
                        {
                            break label2;
                        }
                    }
                    h1.g = h1.h;
                    h1.d.a = h1.h;
                    h1.d.b = 0.0D;
                    flag2 = true;
                }
                Exception exception;
                if (h1.i)
                {
                    h1.i = false;
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag2)
                {
                    h1.i = true;
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                iterator2 = h1.j.iterator();
                do
                {
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            continue label0;
                        }
                        l1 = (l)iterator2.next();
                        if (flag)
                        {
                            l1.onSpringActivate(h1);
                        }
                        l1.onSpringUpdate(h1);
                    } while (!flag1);
                    l1.onSpringAtRest(h1);
                } while (true);
            }
            b.remove(h1);
        } while (true);
        this;
        JVM INSTR monitorenter ;
        if (b.isEmpty())
        {
            d = true;
            g = -1L;
        }
        this;
        JVM INSTR monitorexit ;
        for (iterator1 = f.iterator(); iterator1.hasNext(); iterator1.next()) { }
        break MISSING_BLOCK_LABEL_938;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (d)
        {
            c.b();
        }
        return;
    }
}
