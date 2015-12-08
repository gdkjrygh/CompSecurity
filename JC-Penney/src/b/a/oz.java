// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;

// Referenced classes of package b.a:
//            ow, pb, pd, pa, 
//            oy

public final class oz
    implements ow, pb
{

    public byte a[];
    public int b;
    public boolean c;
    public ArrayList d;
    public int e;
    public int f;
    private final boolean g;

    public oz()
    {
        this((byte)0);
    }

    private oz(byte byte0)
    {
        this(new byte[1000], true);
    }

    public oz(byte abyte0[])
    {
        this(abyte0, false);
    }

    private oz(byte abyte0[], boolean flag)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("data == null");
        } else
        {
            g = flag;
            a = abyte0;
            b = 0;
            c = false;
            d = null;
            e = 0;
            f = 0;
            return;
        }
    }

    private static void g()
    {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    private void i(int j)
    {
        if (a.length < j)
        {
            byte abyte0[] = new byte[j * 2 + 1000];
            System.arraycopy(a, 0, abyte0, 0, b);
            a = abyte0;
        }
    }

    public final void a(int j)
    {
        if (b != j)
        {
            throw new pd((new StringBuilder("expected cursor ")).append(j).append("; actual value: ").append(b).toString());
        } else
        {
            return;
        }
    }

    public final void a(int j, String s)
    {
        if (d == null)
        {
            return;
        }
        c();
        int k = d.size();
        int l;
        if (k == 0)
        {
            k = 0;
        } else
        {
            k = ((pa)d.get(k - 1)).b;
        }
        l = k;
        if (k <= b)
        {
            l = b;
        }
        d.add(new pa(l, l + j, s));
    }

    public final void a(oy oy1)
    {
        int k = oy1.c;
        int j = b;
        k += j;
        byte abyte0[];
        if (g)
        {
            i(k);
        } else
        if (k > a.length)
        {
            g();
            return;
        }
        abyte0 = a;
        if (abyte0.length - j < oy1.c)
        {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        } else
        {
            System.arraycopy(oy1.a, oy1.b, abyte0, j, oy1.c);
            b = k;
            return;
        }
    }

    public final void a(String s)
    {
        if (d == null)
        {
            return;
        } else
        {
            c();
            d.add(new pa(b, s));
            return;
        }
    }

    public final void a(byte abyte0[])
    {
        int j = abyte0.length;
        int k = b;
        int l = k + j;
        if ((j | 0 | l) < 0 || j + 0 > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("bytes.length ")).append(abyte0.length).append("; 0..!").append(l).toString());
        }
        if (g)
        {
            i(l);
        } else
        if (l > a.length)
        {
            g();
            return;
        }
        System.arraycopy(abyte0, 0, a, k, j);
        b = l;
    }

    public final boolean a()
    {
        return d != null;
    }

    public final void b(int j)
    {
        int k = b;
        int l = k + 1;
        if (g)
        {
            i(l);
        } else
        if (l > a.length)
        {
            g();
            return;
        }
        a[k] = (byte)j;
        b = l;
    }

    public final boolean b()
    {
        return c;
    }

    public final void c()
    {
        int j;
        if (d != null)
        {
            if ((j = d.size()) != 0)
            {
                pa pa1 = (pa)d.get(j - 1);
                j = b;
                if (pa1.b == 0x7fffffff)
                {
                    pa1.b = j;
                    return;
                }
            }
        }
    }

    public final void c(int j)
    {
        int k = b;
        int l = k + 2;
        if (g)
        {
            i(l);
        } else
        if (l > a.length)
        {
            g();
            return;
        }
        a[k] = (byte)j;
        a[k + 1] = (byte)(j >> 8);
        b = l;
    }

    public final int d()
    {
        int j = f;
        int k = f / 2;
        return e - (j * 2 + 8 + k);
    }

    public final void d(int j)
    {
        int k = b;
        int l = k + 4;
        if (g)
        {
            i(l);
        } else
        if (l > a.length)
        {
            g();
            return;
        }
        a[k] = (byte)j;
        a[k + 1] = (byte)(j >> 8);
        a[k + 2] = (byte)(j >> 16);
        a[k + 3] = (byte)(j >> 24);
        b = l;
    }

    public final int e(int j)
    {
        if (g)
        {
            i(b + 5);
        }
        int i1 = b;
        int l = j >>> 7;
        int k = j;
        for (j = l; j != 0; j >>>= 7)
        {
            b((byte)(k & 0x7f | 0x80));
            k = j;
        }

        b((byte)(k & 0x7f));
        return b - i1;
    }

    public final byte[] e()
    {
        byte abyte0[] = new byte[b];
        System.arraycopy(a, 0, abyte0, 0, b);
        return abyte0;
    }

    public final int f()
    {
        return b;
    }

    public final int f(int j)
    {
        if (g)
        {
            i(b + 5);
        }
        int j1 = b;
        boolean flag;
        int k;
        int l;
        int i1;
        if ((0x80000000 & j) == 0)
        {
            k = 0;
        } else
        {
            k = -1;
        }
        flag = true;
        i1 = j >> 7;
        l = j;
        j = i1;
        while (flag) 
        {
            char c1;
            if (j != k || (j & 1) != (l >> 6 & 1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                c1 = '\200';
            } else
            {
                c1 = '\0';
            }
            b((byte)(c1 | l & 0x7f));
            l = j;
            j >>= 7;
        }
        return b - j1;
    }

    public final void g(int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("count < 0");
        }
        j = b + j;
        if (g)
        {
            i(j);
        } else
        if (j > a.length)
        {
            g();
            return;
        }
        b = j;
    }

    public final void h(int j)
    {
        int k = j - 1;
        if (j < 0 || (k & j) != 0)
        {
            throw new IllegalArgumentException("bogus alignment");
        }
        j = ~k & b + k;
        if (g)
        {
            i(j);
        } else
        if (j > a.length)
        {
            g();
            return;
        }
        b = j;
    }
}
