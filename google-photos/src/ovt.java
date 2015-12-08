// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ovt
    implements ovr, ovs
{

    private final ovn a;
    private final List b = new CopyOnWriteArrayList();
    private final List c = new ArrayList();

    public ovt(ovn ovn1)
    {
        a = (ovn)p.a(ovn1);
    }

    private void a(long l, long l1, Map map)
    {
        long l2;
        for (; l < l1; l = l2)
        {
            l2 = c(1L + l);
            ove ove1 = (ove)map.remove(Long.valueOf(l));
            Object obj = ove1;
            if (ove1 == null)
            {
                obj = String.format("Subsequence: %d - %d", new Object[] {
                    Long.valueOf(l / 1000L), Long.valueOf(l2 / 1000L)
                });
                obj = a.a(l, l2 - 1L, ((String) (obj)));
                ((ove) (obj)).a(this);
            }
            c.add(obj);
        }

    }

    private long b(long l)
    {
        ote ote1 = a.d();
        int i = ote1.d(l);
        if (i != -1)
        {
            return ote1.b(i);
        } else
        {
            return 0L;
        }
    }

    private long c(long l)
    {
        ote ote1 = a.d();
        int i = ote1.c(l);
        if (i != -1)
        {
            return ote1.b(i);
        } else
        {
            return ote1.f;
        }
    }

    public final ovg a(long l)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            ove ove1 = (ove)iterator.next();
            if (ove1.e().b() <= l && ove1.f().b() >= l)
            {
                return ove1.a(l);
            }
        }

        return null;
    }

    public final ovg a(long l, boolean flag)
    {
        Iterator iterator = c.iterator();
        ovg ovg1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ovg ovg2 = ((ove)iterator.next()).a(l, flag);
            if (ovg2 != null)
            {
                if (ovg1 == null)
                {
                    ovg1 = ovg2;
                } else
                {
                    long l1 = ovg2.b();
                    long l2 = ovg1.b();
                    if (Math.abs(l1 - l) < Math.abs(l2 - l))
                    {
                        ovg1.e();
                        ovg1 = ovg2;
                    }
                }
            }
        } while (true);
        return ovg1;
    }

    public final void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ove)iterator.next()).a()) { }
        b.clear();
    }

    public final void a(long l, long l1, long l2)
    {
        Object obj = new HashMap();
        ove ove1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((Map) (obj)).put(Long.valueOf(ove1.e().b()), ove1))
        {
            ove1 = (ove)iterator.next();
        }

        c.clear();
        l2 = b(l);
        long l3 = c(l1);
        a(l2, l3, ((Map) (obj)));
        if (l - 0xf4240L < l2)
        {
            a(b(l - 0xf4240L), l2, ((Map) (obj)));
        }
        if (l1 + 0xf4240L > l3)
        {
            a(l3, c(l1 + 0xf4240L), ((Map) (obj)));
        }
        for (obj = ((Map) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); ((ove)((Iterator) (obj)).next()).a()) { }
    }

    public final void a(Exception exception)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ovs)iterator.next()).a(exception)) { }
    }

    public final void a(ovg ovg1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ovs)iterator.next()).a(ovg1)) { }
    }

    public final void a(ovr ovr1)
    {
        if (g())
        {
            for (ovr1 = b.iterator(); ovr1.hasNext(); ((ovs)ovr1.next()).a(this)) { }
        }
    }

    public final void a(ovs ovs1)
    {
        b.add(ovs1);
        if (g())
        {
            ovs1.a(this);
        }
    }

    public final void b(ovs ovs1)
    {
        b.remove(ovs1);
    }

    public final boolean g()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (!((ove)iterator.next()).g())
            {
                return false;
            }
        }

        return true;
    }
}
