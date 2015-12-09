// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.util.Arrays;

// Referenced classes of package c:
//            k, f, ag, z

final class ab extends k
{

    final transient byte f[][];
    final transient int g[];

    ab(f f1, int i)
    {
        boolean flag = false;
        super(null);
        ag.a(f1.b, 0L, i);
        z z1 = f1.a;
        int j = 0;
        for (int l = 0; l < i;)
        {
            if (z1.c == z1.b)
            {
                throw new AssertionError("s.limit == s.pos");
            }
            l += z1.c - z1.b;
            j++;
            z1 = z1.f;
        }

        f = new byte[j][];
        g = new int[j * 2];
        f1 = f1.a;
        j = 0;
        for (int i1 = ((flag) ? 1 : 0); i1 < i;)
        {
            f[j] = ((z) (f1)).a;
            i1 += ((z) (f1)).c - ((z) (f1)).b;
            g[j] = i1;
            g[f.length + j] = ((z) (f1)).b;
            f1.d = true;
            j++;
            f1 = ((z) (f1)).f;
        }

    }

    private int b(int i)
    {
        i = Arrays.binarySearch(g, 0, f.length, i + 1);
        if (i >= 0)
        {
            return i;
        } else
        {
            return ~i;
        }
    }

    private k h()
    {
        return new k(g());
    }

    public byte a(int i)
    {
        ag.a(g[f.length - 1], i, 1L);
        int l = b(i);
        int j;
        int i1;
        if (l == 0)
        {
            j = 0;
        } else
        {
            j = g[l - 1];
        }
        i1 = g[f.length + l];
        return f[l][(i - j) + i1];
    }

    public String a()
    {
        return h().a();
    }

    void a(f f1)
    {
        int i = 0;
        int i1 = f.length;
        int j = 0;
        while (i < i1) 
        {
            int j1 = g[i1 + i];
            int l = g[i];
            z z1 = new z(f[i], j1, (j1 + l) - j);
            if (f1.a == null)
            {
                z1.g = z1;
                z1.f = z1;
                f1.a = z1;
            } else
            {
                f1.a.g.a(z1);
            }
            i++;
            j = l;
        }
        long l1 = f1.b;
        f1.b = (long)j + l1;
    }

    public boolean a(int i, k k1, int j, int l)
    {
        if (i <= f() - l) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = b(i);
        int i1 = i;
        i = j1;
        do
        {
label0:
            {
                if (l <= 0)
                {
                    break label0;
                }
                int l1;
                int i2;
                int j2;
                if (i == 0)
                {
                    l1 = 0;
                } else
                {
                    l1 = g[i - 1];
                }
                i2 = Math.min(l, ((g[i] - l1) + l1) - i1);
                j2 = g[f.length + i];
                if (!k1.a(j, f[i], (i1 - l1) + j2, i2))
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 += i2;
                j += i2;
                l -= i2;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public boolean a(int i, byte abyte0[], int j, int l)
    {
        if (i <= f() - l && j <= abyte0.length - l) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = b(i);
        int i1 = i;
        i = j1;
        do
        {
label0:
            {
                if (l <= 0)
                {
                    break label0;
                }
                int k1;
                int l1;
                int i2;
                if (i == 0)
                {
                    k1 = 0;
                } else
                {
                    k1 = g[i - 1];
                }
                l1 = Math.min(l, ((g[i] - k1) + k1) - i1);
                i2 = g[f.length + i];
                if (!ag.a(f[i], (i1 - k1) + i2, abyte0, j, l1))
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 += l1;
                j += l1;
                l -= l1;
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public String b()
    {
        return h().b();
    }

    public k c()
    {
        return h().c();
    }

    public String d()
    {
        return h().d();
    }

    public k e()
    {
        return h().e();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        if ((obj instanceof k) && ((k)obj).f() == f() && a(0, (k)obj, 0, f()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int f()
    {
        return g[f.length - 1];
    }

    public byte[] g()
    {
        int i = 0;
        byte abyte0[] = new byte[g[f.length - 1]];
        int i1 = f.length;
        int l;
        for (int j = 0; i < i1; j = l)
        {
            int j1 = g[i1 + i];
            l = g[i];
            System.arraycopy(f[i], j1, abyte0, j, l - j);
            i++;
        }

        return abyte0;
    }

    public int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        }
        i = 1;
        int l1 = f.length;
        int j = 0;
        int j1;
        for (int l = 0; j < l1; l = j1)
        {
            byte abyte0[] = f[j];
            int k1 = g[l1 + j];
            j1 = g[j];
            for (int i1 = k1; i1 < (j1 - l) + k1; i1++)
            {
                i = i * 31 + abyte0[i1];
            }

            j++;
        }

        d = i;
        return i;
    }

    public String toString()
    {
        return h().toString();
    }
}
