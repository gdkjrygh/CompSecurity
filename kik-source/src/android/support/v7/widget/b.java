// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class android.support.v7.widget.b
{
    static final class a
    {

        long a;
        a b;

        private void a()
        {
            if (b == null)
            {
                b = new a();
            }
        }

        final void a(int i)
        {
            a a1 = this;
            for (; i >= 64; i -= 64)
            {
                a1.a();
                a1 = a1.b;
            }

            a1.a = a1.a | 1L << i;
        }

        final void a(int i, boolean flag)
        {
            a a1;
            boolean flag1;
            a1 = this;
            flag1 = flag;
_L3:
            for (; i >= 64; i -= 64)
            {
                a1.a();
                a1 = a1.b;
            }

            long l;
            long l1;
            if ((a1.a & 0x8000000000000000L) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = (1L << i) - 1L;
            l1 = a1.a;
            a1.a = (~l & a1.a) << 1 | l1 & l;
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
                break MISSING_BLOCK_LABEL_154;
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
            long l1;
            boolean flag;
            if ((a1.a & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.a = a1.a & ~l;
            l--;
            l1 = a1.a;
            a1.a = Long.rotateRight(~l & a1.a, 1) | l1 & l;
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

        a()
        {
            a = 0L;
        }
    }

    static interface b
    {

        public abstract int a();

        public abstract int a(View view);

        public abstract void a(int i);

        public abstract void a(View view, int i);

        public abstract void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams);

        public abstract RecyclerView.t b(View view);

        public abstract View b(int i);

        public abstract void b();

        public abstract void c(int i);
    }


    final b a;
    final a b = new a();
    final List c = new ArrayList();

    android.support.v7.widget.b(b b1)
    {
        a = b1;
    }

    private int e(int i)
    {
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        i = -1;
        return i;
        int j;
        int k;
        int l;
        k = a.a();
        j = i;
          goto _L1
        continue; /* Loop/switch isn't completed */
        j += l;
    }

    final int a()
    {
        return a.a() - c.size();
    }

    final void a(int i)
    {
        i = e(i);
        View view = a.b(i);
        if (view == null)
        {
            return;
        }
        if (b.c(i))
        {
            c.remove(view);
        }
        a.a(i);
    }

    final void a(View view)
    {
        a(view, -1, true);
    }

    final void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = e(i);
        }
        b.a(i, flag);
        if (flag)
        {
            c.add(view);
        }
        a.a(view, i, layoutparams);
    }

    final void a(View view, int i, boolean flag)
    {
        if (i < 0)
        {
            i = a.a();
        } else
        {
            i = e(i);
        }
        b.a(i, flag);
        if (flag)
        {
            c.add(view);
        }
        a.a(view, i);
    }

    final int b()
    {
        return a.a();
    }

    final View b(int i)
    {
        i = e(i);
        return a.b(i);
    }

    final boolean b(View view)
    {
        return c.contains(view);
    }

    final View c(int i)
    {
        return a.b(i);
    }

    final void d(int i)
    {
        i = e(i);
        b.c(i);
        a.c(i);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.toString()).append(", hidden list:").append(c.size()).toString();
    }
}
