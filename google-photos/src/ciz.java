// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class ciz
    implements cje, cjf, ded
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    private final chq c;
    private ciy d;
    private long e;
    private int f;

    public ciz(chq chq1)
    {
        c = (chq)b.a(chq1, "renderContext", null);
    }

    public final void a()
    {
        if (d != null)
        {
            dee.a(d.c);
            d = null;
        }
    }

    public final volatile void a(Object obj)
    {
    }

    public final boolean a(long l)
    {
        b.b(l, "timestampUs");
        for (f = 0; f < a.size(); f = f + 1)
        {
            cnq cnq1 = (cnq)a.get(f);
            long l1 = l - ((Long)b.get(f)).longValue();
            if (l1 < cnq1.f.a())
            {
                l = Math.max(0L, l1);
                e = cnq1.f.b + l;
                return true;
            }
        }

        return false;
    }

    public final Object b()
    {
        c.a(f, "mCurrentIndex", a);
        if (d == null)
        {
            d = new ciy(c.b(1, 1));
            csc.a(d.d);
        }
        d.a = e;
        e = e + 33000L;
        if (e >= ((cnq)a.get(f)).f.c)
        {
            d.b = true;
            f = f + 1;
            if (f < a.size())
            {
                e = ((cnq)a.get(f)).f.b;
            }
        } else
        {
            d.b = false;
        }
        return d;
    }
}
