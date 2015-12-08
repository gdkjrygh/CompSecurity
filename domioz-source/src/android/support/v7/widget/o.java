// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


final class o
{

    long a;
    o b;

    o()
    {
        a = 0L;
    }

    private void a()
    {
        if (b == null)
        {
            b = new o();
        }
    }

    final void a(int i)
    {
        o o1 = this;
        for (; i >= 64; i -= 64)
        {
            o1.a();
            o1 = o1.b;
        }

        o1.a = o1.a | 1L << i;
    }

    final void a(int i, boolean flag)
    {
        o o1;
        boolean flag1;
        o1 = this;
        flag1 = flag;
_L3:
        for (; i >= 64; i -= 64)
        {
            o1.a();
            o1 = o1.b;
        }

        long l;
        long l1;
        if ((o1.a & 0x8000000000000000L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = (1L << i) - 1L;
        l1 = o1.a;
        o1.a = (~l & o1.a) << 1 | l1 & l;
        if (!flag1) goto _L2; else goto _L1
_L1:
        o1.a(i);
_L5:
        o o2;
        if (flag || o1.b != null)
        {
            o1.a();
            o1 = o1.b;
            i = 0;
            flag1 = flag;
        } else
        {
            return;
        }
        if (true) goto _L3; else goto _L2
_L2:
        o2 = o1;
_L6:
        if (i < 64)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (o2.b == null) goto _L5; else goto _L4
_L4:
        o2 = o2.b;
        i -= 64;
          goto _L6
        o2.a = o2.a & ~(1L << i);
          goto _L5
    }

    final boolean b(int i)
    {
        o o1 = this;
        for (; i >= 64; i -= 64)
        {
            o1.a();
            o1 = o1.b;
        }

        return (o1.a & 1L << i) != 0L;
    }

    final boolean c(int i)
    {
        o o1 = this;
        for (; i >= 64; i -= 64)
        {
            o1.a();
            o1 = o1.b;
        }

        long l = 1L << i;
        long l1;
        boolean flag;
        if ((o1.a & l) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o1.a = o1.a & ~l;
        l--;
        l1 = o1.a;
        o1.a = Long.rotateRight(~l & o1.a, 1) | l1 & l;
        if (o1.b != null)
        {
            if (o1.b.b(0))
            {
                o1.a(63);
            }
            o1.b.c(0);
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
