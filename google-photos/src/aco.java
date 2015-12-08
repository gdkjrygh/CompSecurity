// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aco
{

    private long a;
    private aco b;

    aco()
    {
        a = 0L;
    }

    private void b()
    {
        if (b == null)
        {
            b = new aco();
        }
    }

    private void e(int i)
    {
        if (i >= 64)
        {
            if (b != null)
            {
                b.e(i - 64);
            }
            return;
        } else
        {
            a = a & ~(1L << i);
            return;
        }
    }

    public final void a()
    {
        aco aco1 = this;
        do
        {
            aco1.a = 0L;
            if (aco1.b != null)
            {
                aco1 = aco1.b;
            } else
            {
                return;
            }
        } while (true);
    }

    public final void a(int i)
    {
        if (i >= 64)
        {
            b();
            b.a(i - 64);
            return;
        } else
        {
            a = a | 1L << i;
            return;
        }
    }

    final void a(int i, boolean flag)
    {
        aco aco1;
        boolean flag1;
        flag1 = flag;
        aco1 = this;
_L6:
        if (i < 64) goto _L2; else goto _L1
_L1:
        aco1.b();
        aco1.b.a(i - 64, flag1);
_L4:
        return;
_L2:
        long l;
        long l1;
        if ((aco1.a & 0x8000000000000000L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = (1L << i) - 1L;
        l1 = aco1.a;
        aco1.a = (~l & aco1.a) << 1 | l1 & l;
        if (flag1)
        {
            aco1.a(i);
        } else
        {
            aco1.e(i);
        }
        if (!flag && aco1.b == null) goto _L4; else goto _L3
_L3:
        aco1.b();
        aco1 = aco1.b;
        i = 0;
        flag1 = flag;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean b(int i)
    {
        aco aco1 = this;
        for (; i >= 64; i -= 64)
        {
            aco1.b();
            aco1 = aco1.b;
        }

        return (aco1.a & 1L << i) != 0L;
    }

    public final boolean c(int i)
    {
        aco aco1 = this;
        for (; i >= 64; i -= 64)
        {
            aco1.b();
            aco1 = aco1.b;
        }

        long l = 1L << i;
        long l1;
        boolean flag;
        if ((aco1.a & l) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aco1.a = aco1.a & ~l;
        l--;
        l1 = aco1.a;
        aco1.a = Long.rotateRight(~l & aco1.a, 1) | l1 & l;
        if (aco1.b != null)
        {
            if (aco1.b.b(0))
            {
                aco1.a(63);
            }
            aco1.b.c(0);
        }
        return flag;
    }

    final int d(int i)
    {
        if (b == null)
        {
            if (i >= 64)
            {
                return Long.bitCount(a);
            } else
            {
                return Long.bitCount(a & (1L << i) - 1L);
            }
        }
        if (i < 64)
        {
            return Long.bitCount(a & (1L << i) - 1L);
        } else
        {
            return b.d(i - 64) + Long.bitCount(a);
        }
    }

    public final String toString()
    {
        if (b == null)
        {
            return Long.toBinaryString(a);
        } else
        {
            return (new StringBuilder()).append(b.toString()).append("xx").append(Long.toBinaryString(a)).toString();
        }
    }
}
