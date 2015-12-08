// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.facebook.a:
//            h, e, f, g

public class b
{

    private final Map a = new HashMap();
    private final Set b = new CopyOnWriteArraySet();
    private final h c;
    private final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    private boolean e;

    public b(h h1)
    {
        e = true;
        if (h1 == null)
        {
            throw new IllegalArgumentException("springLooper is required");
        } else
        {
            c = h1;
            c.a(this);
            return;
        }
    }

    public final e a()
    {
        e e1 = new e(this);
        if (a.containsKey(e1.c))
        {
            throw new IllegalArgumentException("spring is already registered");
        } else
        {
            a.put(e1.c, e1);
            return e1;
        }
    }

    public final void a(double d1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); iterator.next()) { }
        Iterator iterator1 = b.iterator();
label0:
        do
        {
label1:
            {
                e e1;
                boolean flag;
label2:
                {
                    if (!iterator1.hasNext())
                    {
                        break label0;
                    }
                    e1 = (e)iterator1.next();
                    double d2;
                    double d4;
                    double d6;
                    double d7;
                    double d8;
                    double d9;
                    boolean flag3;
                    if (!e1.b() || !e1.i)
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
                    d4 = d1 / 1000D;
                    flag3 = e1.b();
                    if (flag3 && e1.i)
                    {
                        continue;
                    }
                    d2 = d4;
                    if (d4 > 0.064000000000000001D)
                    {
                        d2 = 0.064000000000000001D;
                    }
                    e1.l = d2 + e1.l;
                    d8 = e1.a.b;
                    d9 = e1.a.a;
                    d4 = e1.d.a;
                    d2 = e1.d.b;
                    d7 = e1.f.a;
                    d6 = e1.f.b;
                    while (e1.l >= 0.001D) 
                    {
                        e1.l = e1.l - 0.001D;
                        if (e1.l < 0.001D)
                        {
                            e1.e.a = d4;
                            e1.e.b = d2;
                        }
                        double d10 = (e1.h - d7) * d8 - d9 * d2;
                        double d14 = d2 + 0.001D * d10 * 0.5D;
                        double d11 = (e1.h - (0.001D * d2 * 0.5D + d4)) * d8 - d9 * d14;
                        double d15 = d2 + 0.001D * d11 * 0.5D;
                        double d12 = (e1.h - (0.001D * d14 * 0.5D + d4)) * d8 - d9 * d15;
                        d7 = d4 + 0.001D * d15;
                        d6 = 0.001D * d12 + d2;
                        double d13 = e1.h;
                        d4 += ((d14 + d15) * 2D + d2 + d6) * 0.16666666666666666D * 0.001D;
                        d2 += (d10 + (d11 + d12) * 2D + ((d13 - d7) * d8 - d9 * d6)) * 0.16666666666666666D * 0.001D;
                    }
                    e1.f.a = d7;
                    e1.f.b = d6;
                    e1.d.a = d4;
                    e1.d.b = d2;
                    if (e1.l > 0.0D)
                    {
                        double d3 = e1.l / 0.001D;
                        e1.d.a = e1.d.a * d3 + e1.e.a * (1.0D - d3);
                        e.a a1 = e1.d;
                        double d5 = e1.d.b;
                        a1.b = (1.0D - d3) * e1.e.b + d5 * d3;
                    }
                    boolean flag2;
                    if (!e1.b())
                    {
                        flag2 = flag3;
                        if (!e1.b)
                        {
                            break label2;
                        }
                        flag2 = flag3;
                        if (!e1.a())
                        {
                            break label2;
                        }
                    }
                    Iterator iterator2;
                    g g1;
                    boolean flag1;
                    if (d8 > 0.0D)
                    {
                        e1.g = e1.h;
                        e1.d.a = e1.h;
                    } else
                    {
                        e1.h = e1.d.a;
                        e1.g = e1.h;
                    }
                    e1.c(0.0D);
                    flag2 = true;
                }
                if (e1.i)
                {
                    e1.i = false;
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = false;
                if (flag2)
                {
                    e1.i = true;
                    flag1 = true;
                }
                iterator2 = e1.k.iterator();
                do
                {
                    do
                    {
                        if (!iterator2.hasNext())
                        {
                            continue label0;
                        }
                        g1 = (g)iterator2.next();
                        if (flag)
                        {
                            g1.onSpringActivate(e1);
                        }
                        g1.onSpringUpdate(e1);
                    } while (!flag1);
                    g1.onSpringAtRest(e1);
                } while (true);
            }
            b.remove(e1);
        } while (true);
        if (b.isEmpty())
        {
            e = true;
        }
        for (iterator1 = d.iterator(); iterator1.hasNext(); iterator1.next()) { }
        if (e)
        {
            c.b();
        }
    }

    final void a(String s)
    {
        e e1 = (e)a.get(s);
        if (e1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("springId ")).append(s).append(" does not reference a registered spring").toString());
        }
        b.add(e1);
        if (e)
        {
            e = false;
            c.a();
        }
    }
}
