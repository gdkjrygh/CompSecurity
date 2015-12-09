// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.aj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c.d:
//            l, e, c, p, 
//            y, g

final class q
{

    l a[];
    int b;
    int c;
    c d;
    c e;
    int f;
    private final List g = new ArrayList();
    private final aj h = new aj();
    private int i;
    private int j;

    q(int k)
    {
        a = new l[8];
        b = a.length - 1;
        c = 0;
        d = new e();
        e = new e();
        f = 0;
        i = k;
        j = k;
    }

    private void a(int k, l l1)
    {
        int i1 = l1.j;
        if (k != -1)
        {
            i1 -= a[d(k)].j;
        }
        if (i1 > j)
        {
            f();
            g.add(l1);
            return;
        }
        int j1 = b((f + i1) - j);
        if (k == -1)
        {
            if (c + 1 > a.length)
            {
                l al[] = new l[a.length * 2];
                System.arraycopy(a, 0, al, a.length, a.length);
                if (al.length == 64)
                {
                    d = ((e)d).b();
                    e = ((e)e).b();
                }
                d.d(a.length);
                e.d(a.length);
                b = a.length - 1;
                a = al;
            }
            k = b;
            b = k - 1;
            d.a(k);
            a[k] = l1;
            c = c + 1;
        } else
        {
            k = j1 + d(k) + k;
            d.a(k);
            a[k] = l1;
        }
        f = f + i1;
    }

    private int b(int k)
    {
        int i1 = 0;
        boolean flag = false;
        if (k > 0)
        {
            i1 = a.length - 1;
            int j1 = k;
            k = ((flag) ? 1 : 0);
            for (; i1 >= b && j1 > 0; i1--)
            {
                j1 -= a[i1].j;
                f = f - a[i1].j;
                c = c - 1;
                k++;
            }

            d.d(k);
            e.d(k);
            System.arraycopy(a, b + 1, a, b + 1 + k, c);
            b = b + k;
            i1 = k;
        }
        return i1;
    }

    private void c(int k)
    {
        if (h(k))
        {
            k -= c;
            if (k > p.a().length - 1)
            {
                throw new IOException((new StringBuilder()).append("Header index too large ").append(k + 1).toString());
            }
            l l1 = p.a()[k];
            if (j == 0)
            {
                g.add(l1);
                return;
            } else
            {
                a(-1, l1);
                return;
            }
        }
        k = d(k);
        if (!d.c(k))
        {
            g.add(a[k]);
            e.a(k);
        }
        d.b(k);
    }

    private int d(int k)
    {
        return b + 1 + k;
    }

    private void e()
    {
label0:
        {
            if (j < f)
            {
                if (j != 0)
                {
                    break label0;
                }
                f();
            }
            return;
        }
        b(f - j);
    }

    private void e(int k)
    {
        g g1 = g(k);
        g g2 = d();
        g.add(new l(g1, g2));
    }

    private void f()
    {
        g();
        Arrays.fill(a, null);
        b = a.length - 1;
        c = 0;
        f = 0;
    }

    private void f(int k)
    {
        a(-1, new l(g(k), d()));
    }

    private g g(int k)
    {
        if (h(k))
        {
            return p.a()[k - c].h;
        } else
        {
            return a[d(k)].h;
        }
    }

    private void g()
    {
        d.a();
        e.a();
    }

    private void h()
    {
        g g1 = p.a(d());
        g g2 = d();
        g.add(new l(g1, g2));
    }

    private boolean h(int k)
    {
        return k >= c;
    }

    private void i()
    {
        a(-1, new l(p.a(d()), d()));
    }

    private int j()
    {
        return h.i() & 0xff;
    }

    int a(int k, int i1)
    {
        k &= i1;
        if (k < i1)
        {
            return k;
        }
        k = 0;
        do
        {
            int j1 = j();
            if ((j1 & 0x80) != 0)
            {
                i1 += (j1 & 0x7f) << k;
                k += 7;
            } else
            {
                return (j1 << k) + i1;
            }
        } while (true);
    }

    void a()
    {
        while (h.e()) 
        {
            int k = h.i() & 0xff;
            if (k == 128)
            {
                throw new IOException("index == 0");
            }
            if ((k & 0x80) == 128)
            {
                c(a(k, 127) - 1);
            } else
            if (k == 64)
            {
                i();
            } else
            if ((k & 0x40) == 64)
            {
                f(a(k, 63) - 1);
            } else
            if ((k & 0x20) == 32)
            {
                if ((k & 0x10) == 16)
                {
                    if ((k & 0xf) != 0)
                    {
                        throw new IOException((new StringBuilder()).append("Invalid header table state change ").append(k).toString());
                    }
                    g();
                } else
                {
                    j = a(k, 15);
                    if (j < 0 || j > i)
                    {
                        throw new IOException((new StringBuilder()).append("Invalid header table byte count ").append(j).toString());
                    }
                    e();
                }
            } else
            if (k == 16 || k == 0)
            {
                h();
            } else
            {
                e(a(k, 15) - 1);
            }
        }
    }

    void a(int k)
    {
        i = k;
        j = i;
        e();
    }

    public void a(aj aj1)
    {
        aj1.a(h);
    }

    void b()
    {
        for (int k = a.length - 1; k != b; k--)
        {
            if (d.c(k) && !e.c(k))
            {
                g.add(a[k]);
            }
        }

    }

    List c()
    {
        ArrayList arraylist = new ArrayList(g);
        g.clear();
        e.a();
        return arraylist;
    }

    g d()
    {
        int k = j();
        boolean flag;
        if ((k & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = a(k, 127);
        if (flag)
        {
            return com.android.slyce.a.c.d.g.a(y.a().a(h.a(k)));
        } else
        {
            return com.android.slyce.a.c.d.g.a(h.a(k));
        }
    }
}
