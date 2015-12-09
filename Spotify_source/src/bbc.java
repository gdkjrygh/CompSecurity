// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public abstract class bbc extends bbb
{

    final long d;
    final int e;
    final long f;
    final List g;

    public bbc(bax bax, long l, long l1, long l2, 
            int i, long l3, List list)
    {
        super(bax, l, l1);
        d = l2;
        e = i;
        f = l3;
        g = list;
    }

    public abstract int a();

    public final long a(int i)
    {
        long l;
        if (g != null)
        {
            l = ((bbf)g.get(i - e)).a - c;
        } else
        {
            l = (long)(i - e) * f;
        }
        return bej.a(l, 0xf4240L, b);
    }

    public abstract bax a(bay bay, int i);

    public boolean b()
    {
        return g != null;
    }
}
