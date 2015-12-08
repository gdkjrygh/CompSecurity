// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gqt
    implements grm
{

    private final int a;
    private final grq b;
    private final boolean c;
    private gqs d;

    gqt(gqs gqs1, int i, grq grq, boolean flag)
    {
        d = gqs1;
        super();
        a = i;
        b = grq;
        c = flag;
    }

    public final grq a()
    {
        return b;
    }

    public final grt a(grq grq)
    {
        if (a < d.a.f.size())
        {
            grq = new gqt(d, a + 1, grq, c);
            return ((grl)d.a.f.get(a)).a(grq);
        } else
        {
            return d.a(grq, c);
        }
    }
}
