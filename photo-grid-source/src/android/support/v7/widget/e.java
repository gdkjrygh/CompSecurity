// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


final class e
{

    long a;
    e b;

    e()
    {
        a = 0L;
    }

    private void a()
    {
        if (b == null)
        {
            b = new e();
        }
    }

    final void a(int i)
    {
        e e1 = this;
        for (; i >= 64; i -= 64)
        {
            e1.a();
            e1 = e1.b;
        }

        e1.a = e1.a | 1L << i;
    }

    final void a(int i, boolean flag)
    {
        e e1;
        boolean flag1;
        e1 = this;
        flag1 = flag;
_L3:
        for (; i >= 64; i -= 64)
        {
            e1.a();
            e1 = e1.b;
        }

        long l;
        long l1;
        if ((e1.a & 0x8000000000000000L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = (1L << i) - 1L;
        l1 = e1.a;
        e1.a = (~l & e1.a) << 1 | l1 & l;
        if (!flag1) goto _L2; else goto _L1
_L1:
        e1.a(i);
_L5:
        e e2;
        if (flag || e1.b != null)
        {
            e1.a();
            e1 = e1.b;
            i = 0;
            flag1 = flag;
        } else
        {
            return;
        }
        if (true) goto _L3; else goto _L2
_L2:
        e2 = e1;
_L6:
        if (i < 64)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (e2.b == null) goto _L5; else goto _L4
_L4:
        e2 = e2.b;
        i -= 64;
          goto _L6
        e2.a = e2.a & ~(1L << i);
          goto _L5
    }

    final boolean b(int i)
    {
        e e1 = this;
        for (; i >= 64; i -= 64)
        {
            e1.a();
            e1 = e1.b;
        }

        return (e1.a & 1L << i) != 0L;
    }

    final boolean c(int i)
    {
        e e1 = this;
        for (; i >= 64; i -= 64)
        {
            e1.a();
            e1 = e1.b;
        }

        long l = 1L << i;
        long l1;
        boolean flag;
        if ((e1.a & l) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e1.a = e1.a & ~l;
        l--;
        l1 = e1.a;
        e1.a = Long.rotateRight(~l & e1.a, 1) | l1 & l;
        if (e1.b != null)
        {
            if (e1.b.b(0))
            {
                e1.a(63);
            }
            e1.b.c(0);
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
