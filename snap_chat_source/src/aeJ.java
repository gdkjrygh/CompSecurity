// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aeJ
    implements aeG, aeK
{

    public byte a[];
    public int b;
    private final boolean c;

    public aeJ()
    {
        this((byte)0);
    }

    private aeJ(byte byte0)
    {
        this(new byte[1000], true);
    }

    public aeJ(byte abyte0[])
    {
        this(abyte0, false);
    }

    private aeJ(byte abyte0[], boolean flag)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("data == null");
        } else
        {
            c = flag;
            a = abyte0;
            b = 0;
            return;
        }
    }

    private static void c()
    {
        throw new IndexOutOfBoundsException("attempt to write past the end");
    }

    private void i(int j)
    {
        if (a.length < j)
        {
            byte abyte0[] = new byte[(j << 1) + 1000];
            System.arraycopy(a, 0, abyte0, 0, b);
            a = abyte0;
        }
    }

    public final void a(int j)
    {
        if (b != j)
        {
            throw new aeM((new StringBuilder("expected cursor ")).append(j).append("; actual value: ").append(b).toString());
        } else
        {
            return;
        }
    }

    public final void a(aeI aei)
    {
        int k = aei.b;
        int j = b;
        k += j;
        byte abyte0[];
        if (c)
        {
            i(k);
        } else
        if (k > a.length)
        {
            c();
            return;
        }
        abyte0 = a;
        if (abyte0.length - j < aei.b)
        {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        } else
        {
            System.arraycopy(aei.a, 0, abyte0, j, aei.b);
            b = k;
            return;
        }
    }

    public final void a(byte abyte0[])
    {
        int j = abyte0.length;
        int k = b;
        int l = k + j;
        if ((j | 0 | l) < 0 || j > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("bytes.length ")).append(abyte0.length).append("; 0..!").append(l).toString());
        }
        if (c)
        {
            i(l);
        } else
        if (l > a.length)
        {
            c();
            return;
        }
        System.arraycopy(abyte0, 0, a, k, j);
        b = l;
    }

    public final byte[] a()
    {
        byte abyte0[] = new byte[b];
        System.arraycopy(a, 0, abyte0, 0, b);
        return abyte0;
    }

    public final int b()
    {
        return b;
    }

    public final void b(int j)
    {
        int k = b;
        int l = k + 1;
        if (c)
        {
            i(l);
        } else
        if (l > a.length)
        {
            c();
            return;
        }
        a[k] = (byte)j;
        b = l;
    }

    public final void c(int j)
    {
        int k = b;
        int l = k + 2;
        if (c)
        {
            i(l);
        } else
        if (l > a.length)
        {
            c();
            return;
        }
        a[k] = (byte)j;
        a[k + 1] = (byte)(j >> 8);
        b = l;
    }

    public final void d(int j)
    {
        int k = b;
        int l = k + 4;
        if (c)
        {
            i(l);
        } else
        if (l > a.length)
        {
            c();
            return;
        }
        a[k] = (byte)j;
        a[k + 1] = (byte)(j >> 8);
        a[k + 2] = (byte)(j >> 16);
        a[k + 3] = j >> 24;
        b = l;
    }

    public final int e(int j)
    {
        if (c)
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

    public final int f(int j)
    {
        if (c)
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
        if (c)
        {
            i(j);
        } else
        if (j > a.length)
        {
            c();
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
        if (c)
        {
            i(j);
        } else
        if (j > a.length)
        {
            c();
            return;
        }
        b = j;
    }
}
