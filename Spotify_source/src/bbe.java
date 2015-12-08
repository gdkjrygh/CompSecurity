// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class bbe extends bbc
{

    final bbh h;
    final bbh i;
    private final String j;

    public bbe(bax bax1, long l, long l1, long l2, 
            int k, long l3, List list, bbh bbh1, bbh bbh2, String s)
    {
        super(bax1, l, l1, l2, k, l3, list);
        h = bbh1;
        i = bbh2;
        j = s;
    }

    public final int a()
    {
        if (g != null)
        {
            return (g.size() + e) - 1;
        }
        if (d == -1L)
        {
            return -1;
        } else
        {
            long l = (f * 1000L) / b;
            int k = e;
            return ((int)bej.a(d, l) + k) - 1;
        }
    }

    public final bax a(bay bay1)
    {
        if (h != null)
        {
            bay1 = h.a(bay1.a.a, 0, bay1.a.c, 0L);
            return new bax(j, bay1, 0L, -1L);
        } else
        {
            return super.a(bay1);
        }
    }

    public final bax a(bay bay1, int k)
    {
        long l;
        if (g != null)
        {
            l = ((bbf)g.get(k - e)).a;
        } else
        {
            l = (long)(k - e) * f;
        }
        bay1 = i.a(bay1.a.a, k, bay1.a.c, l);
        return new bax(j, bay1, 0L, -1L);
    }
}
