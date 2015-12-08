// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class als extends alV
    implements alK, Serializable
{
    public static final class a extends amQ
    {

        private als a;
        private alt b;

        public final alt a()
        {
            return b;
        }

        protected final long b()
        {
            return ((alV) (a)).a;
        }

        protected final alr c()
        {
            return ((alV) (a)).b;
        }

        public a(als als1, alt alt)
        {
            a = als1;
            b = alt;
        }
    }


    public als()
    {
    }

    public als(long l)
    {
        super(l);
    }

    public als(long l, alr alr1)
    {
        super(l, alr1);
    }

    public als(long l, alw alw)
    {
        super(l, alw);
    }

    public als(alr alr1)
    {
        super(alr1);
    }

    private als(alw alw)
    {
        super(alw);
    }

    public als(Object obj)
    {
        super(obj);
    }

    public static als a(alw alw)
    {
        if (alw == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new als(alw);
        }
    }

    private als b(long l)
    {
        if (l == super.a)
        {
            return this;
        } else
        {
            return new als(l, super.b);
        }
    }

    public final als a()
    {
        return this;
    }

    public final als a(int i)
    {
        if (i == 0)
        {
            return this;
        }
        alz alz1 = super.b.s();
        long l = super.a;
        if (i == 0x80000000)
        {
            long l1 = i;
            if (l1 == 0x8000000000000000L)
            {
                throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
            }
            l = alz1.a(l, -l1);
        } else
        {
            l = alz1.a(l, -i);
        }
        return b(l);
    }

    public final als aj_()
    {
        return (new alE(super.a, super.b)).a(d().a());
    }

    public final als ak_()
    {
        return b(super.b.l().a(super.a, 4));
    }
}
