// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            e

static final class a
{

    long a;
    ng b;

    private void a()
    {
        if (b == null)
        {
            b = new <init>();
        }
    }

    final void a(int i)
    {
        <init> <init>1 = this;
        for (; i >= 64; i -= 64)
        {
            <init>1.a();
            <init>1 = <init>1.b;
        }

        <init>1.a = <init>1.a | 1L << i;
    }

    final void a(int i, boolean flag)
    {
        a a1;
        boolean flag1;
        flag1 = flag;
        a1 = this;
_L3:
        for (; i >= 64; i -= 64)
        {
            a1.a();
            a1 = a1.b;
        }

        long l;
        if ((a1.a & 0x8000000000000000L) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = (1L << i) - 1L;
        a1.a = a1.a & l | (a1.a & (-1L ^ l)) << 1;
        if (!flag1) goto _L2; else goto _L1
_L1:
        a1.a(i);
_L5:
        a a2;
        if (flag || a1.b != null)
        {
            a1.a();
            a1 = a1.b;
            i = 0;
            flag1 = flag;
        } else
        {
            return;
        }
        if (true) goto _L3; else goto _L2
_L2:
        a2 = a1;
_L6:
        if (i < 64)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (a2.b == null) goto _L5; else goto _L4
_L4:
        a2 = a2.b;
        i -= 64;
          goto _L6
        a2.a = a2.a & ~(1L << i);
          goto _L5
    }

    final boolean b(int i)
    {
        a a1 = this;
        for (; i >= 64; i -= 64)
        {
            a1.a();
            a1 = a1.b;
        }

        return (a1.a & 1L << i) != 0L;
    }

    final boolean c(int i)
    {
        a a1 = this;
        for (; i >= 64; i -= 64)
        {
            a1.a();
            a1 = a1.b;
        }

        long l = 1L << i;
        boolean flag;
        if ((a1.a & l) != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.a = a1.a & (-1L ^ l);
        l--;
        a1.a = a1.a & l | Long.rotateRight(a1.a & (-1L ^ l), 1);
        if (a1.b != null)
        {
            if (a1.b.b(0))
            {
                a1.a(63);
            }
            a1.b.c(0);
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

    ()
    {
        a = 0L;
    }
}
