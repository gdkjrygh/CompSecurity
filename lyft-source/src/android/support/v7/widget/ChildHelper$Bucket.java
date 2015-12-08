// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


class a
{

    long a;
    a b;

    private void b()
    {
        if (b == null)
        {
            b = new <init>();
        }
    }

    void a()
    {
        a = 0L;
        if (b != null)
        {
            b.a();
        }
    }

    void a(int i)
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

    void a(int i, boolean flag)
    {
        if (i >= 64)
        {
            b();
            b.a(i - 64, flag);
        } else
        {
            long l;
            long l1;
            boolean flag1;
            if ((a & 0x8000000000000000L) != 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            l = (1L << i) - 1L;
            l1 = a;
            a = (~l & a) << 1 | l1 & l;
            if (flag)
            {
                a(i);
            } else
            {
                b(i);
            }
            if (flag1 || b != null)
            {
                b();
                b.a(0, flag1);
                return;
            }
        }
    }

    void b(int i)
    {
        if (i >= 64)
        {
            if (b != null)
            {
                b.b(i - 64);
            }
            return;
        } else
        {
            a = a & ~(1L << i);
            return;
        }
    }

    boolean c(int i)
    {
        if (i >= 64)
        {
            b();
            return b.c(i - 64);
        }
        return (a & 1L << i) != 0L;
    }

    boolean d(int i)
    {
        boolean flag1;
        if (i >= 64)
        {
            b();
            flag1 = b.d(i - 64);
        } else
        {
            long l = 1L << i;
            long l1;
            boolean flag;
            if ((a & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = a & ~l;
            l--;
            l1 = a;
            a = Long.rotateRight(~l & a, 1) | l1 & l;
            flag1 = flag;
            if (b != null)
            {
                if (b.c(0))
                {
                    a(63);
                }
                b.d(0);
                return flag;
            }
        }
        return flag1;
    }

    int e(int i)
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
            return b.e(i - 64) + Long.bitCount(a);
        }
    }

    public String toString()
    {
        if (b == null)
        {
            return Long.toBinaryString(a);
        } else
        {
            return (new StringBuilder()).append(b.toString()).append("xx").append(Long.toBinaryString(a)).toString();
        }
    }

    ()
    {
        a = 0L;
    }
}
