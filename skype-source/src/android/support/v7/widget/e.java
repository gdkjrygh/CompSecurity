// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class e
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

        public abstract RecyclerView.v b(View view);

        public abstract View b(int i);

        public abstract void b();

        public abstract void c(int i);

        public abstract void c(View view);

        public abstract void d(View view);
    }


    final b a;
    final a b = new a();
    final List c = new ArrayList();

    e(b b1)
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

    private void g(View view)
    {
        c.add(view);
        a.c(view);
    }

    private boolean h(View view)
    {
        if (c.remove(view))
        {
            a.d(view);
            return true;
        } else
        {
            return false;
        }
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
            h(view);
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
            g(view);
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
            g(view);
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

    final void b(View view)
    {
        int i = a.a(view);
        if (i < 0)
        {
            return;
        }
        if (b.c(i))
        {
            h(view);
        }
        a.a(i);
    }

    final int c(View view)
    {
        int i;
        for (i = a.a(view); i == -1 || b.b(i);)
        {
            return -1;
        }

        return i - b.d(i);
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

    final boolean d(View view)
    {
        return c.contains(view);
    }

    final void e(View view)
    {
        int i = a.a(view);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            b.a(i);
            g(view);
            return;
        }
    }

    final boolean f(View view)
    {
        int i = a.a(view);
        if (i == -1)
        {
            h(view);
            return true;
        }
        if (b.b(i))
        {
            b.c(i);
            h(view);
            a.a(i);
            return true;
        } else
        {
            return false;
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b.toString()).append(", hidden list:").append(c.size()).toString();
    }
}
