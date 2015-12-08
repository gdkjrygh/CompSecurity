// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class amY extends amR
{
    final class a extends amS
    {

        private amY b;

        public final long a(long l, int i)
        {
            return b.a(l, i);
        }

        public final long a(long l, long l1)
        {
            return b.a(l, l1);
        }

        public final int b(long l, long l1)
        {
            return b.b(l, l1);
        }

        public final long c(long l, long l1)
        {
            return b.c(l, l1);
        }

        public final boolean c()
        {
            return false;
        }

        public final long d()
        {
            return b.a;
        }

        a(alA ala)
        {
            b = amY.this;
            super(ala);
        }
    }


    final long a;
    private final alz b;

    public amY(alu alu1, long l)
    {
        super(alu1);
        a = l;
        b = new a(alu1.x());
    }

    public abstract long a(long l, int i);

    public abstract long a(long l, long l1);

    public final int b(long l, long l1)
    {
        return amX.a(c(l, l1));
    }

    public long c(long l, long l1)
    {
        long l3;
        if (l < l1)
        {
            l3 = -c(l1, l);
        } else
        {
            long l2 = (l - l1) / a;
            if (a(l1, l2) < l)
            {
                do
                {
                    l3 = l2 + 1L;
                    l2 = l3;
                } while (a(l1, l3) <= l);
                return l3 - 1L;
            }
            l3 = l2;
            if (a(l1, l2) > l)
            {
                long l4;
                do
                {
                    l4 = l2 - 1L;
                    l2 = l4;
                } while (a(l1, l4) > l);
                return l4;
            }
        }
        return l3;
    }

    public final alz d()
    {
        return b;
    }
}
