// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

abstract class amb extends alZ
{
    static final class a extends anb
    {

        public final int a(Locale locale)
        {
            return amo.a(locale).m;
        }

        public final long a(long l, String s, Locale locale)
        {
            locale = amo.a(locale).f;
            int i = locale.length;
            do
            {
                int j = i - 1;
                if (j >= 0)
                {
                    i = j;
                    if (locale[j].equalsIgnoreCase(s))
                    {
                        return b(l, j);
                    }
                } else
                {
                    throw new alB(alu.k(), s);
                }
            } while (true);
        }

        public final String a(int i, Locale locale)
        {
            return amo.a(locale).f[i];
        }

        a()
        {
            super(alu.k(), amb.U(), amb.V());
        }
    }

    static final class b
    {

        public final int a;
        public final long b;

        b(int i, long l)
        {
            a = i;
            b = l;
        }
    }


    private static final alz F;
    private static final alz G;
    private static final alz H;
    private static final alz I;
    private static final alz J;
    private static final alz K;
    private static final alz L = new and(alA.g(), 0x240c8400L);
    private static final alt M;
    private static final alt N;
    private static final alt O;
    private static final alt P;
    private static final alt Q;
    private static final alt R;
    private static final alt S;
    private static final alt T;
    private static final alt U;
    private static final alt V;
    private static final alt W = new a();
    final int E;
    private final transient b X[] = new b[1024];

    amb(alr alr1, int i)
    {
        super(alr1, null);
        if (i <= 0 || i > 7)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid min days in first week: ")).append(i).toString());
        } else
        {
            E = i;
            return;
        }
    }

    static int L()
    {
        return 366;
    }

    static int M()
    {
        return 31;
    }

    static int P()
    {
        return 12;
    }

    static alz U()
    {
        return J;
    }

    static alz V()
    {
        return K;
    }

    static int d(long l)
    {
        if (l >= 0L)
        {
            l /= 0x5265c00L;
        } else
        {
            long l1 = (l - 0x5265bffL) / 0x5265c00L;
            l = l1;
            if (l1 < -3L)
            {
                return (int)((l1 + 4L) % 7L) + 7;
            }
        }
        return (int)((l + 3L) % 7L) + 1;
    }

    static int e(long l)
    {
        if (l >= 0L)
        {
            return (int)(l % 0x5265c00L);
        } else
        {
            return 0x5265bff + (int)((1L + l) % 0x5265c00L);
        }
    }

    private int e(long l, int i)
    {
        long l1 = e(i);
        if (l < l1)
        {
            return a(i - 1);
        }
        if (l >= e(i + 1))
        {
            return 1;
        } else
        {
            return (int)((l - l1) / 0x240c8400L) + 1;
        }
    }

    private long e(int i)
    {
        long l = b(i);
        i = d(l);
        if (i > 8 - E)
        {
            return l + (long)(8 - i) * 0x5265c00L;
        } else
        {
            return l - (long)(i - 1) * 0x5265c00L;
        }
    }

    abstract int N();

    abstract int O();

    abstract long Q();

    abstract long R();

    abstract long S();

    abstract long T();

    final int a(int i)
    {
        long l = e(i);
        return (int)((e(i + 1) - l) / 0x240c8400L);
    }

    final int a(long l)
    {
        long l3 = 0x757b12c00L;
        long l5 = R();
        long l4 = (l >> 1) + T();
        long l1 = l4;
        if (l4 < 0L)
        {
            l1 = (l4 - l5) + 1L;
        }
        int j = (int)(l1 / l5);
        l4 = b(j);
        l1 = l - l4;
        int i;
        if (l1 < 0L)
        {
            i = j - 1;
        } else
        {
            i = j;
            if (l1 >= 0x757b12c00L)
            {
                long l2 = l3;
                if (c(j))
                {
                    l2 = 0x75cd78800L;
                }
                i = j;
                if (l2 + l4 <= l)
                {
                    return j + 1;
                }
            }
        }
        return i;
    }

    abstract int a(long l, int i);

    final int a(long l, int i, int j)
    {
        return (int)((l - (b(i) + c(i, j))) / 0x5265c00L) + 1;
    }

    final long a(int i, int j)
    {
        return b(i) + c(i, j);
    }

    final long a(int i, int j, int k)
    {
        return b(i) + c(i, j) + (long)(k - 1) * 0x5265c00L;
    }

    public final long a(int i, int j, int k, int l)
    {
        alr alr1 = super.a;
        if (alr1 != null)
        {
            return alr1.a(i, j, k, l);
        } else
        {
            amX.a(alu.b(), l, 0, 0x5265bff);
            return b(i, j, k) + (long)l;
        }
    }

    public final long a(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        alr alr1 = super.a;
        if (alr1 != null)
        {
            return alr1.a(i, j, k, l, i1, j1, k1);
        } else
        {
            amX.a(alu.g(), l, 0, 23);
            amX.a(alu.e(), i1, 0, 59);
            amX.a(alu.c(), j1, 0, 59);
            amX.a(alu.a(), k1, 0, 999);
            return b(i, j, k) + (long)(0x36ee80 * l) + (long)(60000 * i1) + (long)(j1 * 1000) + (long)k1;
        }
    }

    abstract long a(long l, long l1);

    public final alw a()
    {
        alr alr1 = super.a;
        if (alr1 != null)
        {
            return alr1.a();
        } else
        {
            return alw.a;
        }
    }

    protected void a(alZ.a a1)
    {
        a1.a = F;
        a1.b = G;
        a1.c = H;
        a1.d = I;
        a1.e = J;
        a1.f = K;
        a1.g = L;
        a1.m = M;
        a1.n = N;
        a1.o = O;
        a1.p = P;
        a1.q = Q;
        a1.r = R;
        a1.s = S;
        a1.u = T;
        a1.t = U;
        a1.v = V;
        a1.w = W;
        a1.E = new amj(this);
        a1.F = new amq(a1.E, this);
        a1.H = new amW(new ana(a1.F, 99), alu.v());
        a1.G = new ana(new ane((amW)a1.H), alu.u());
        a1.I = new amn(this);
        a1.x = new amm(this, a1.f);
        a1.y = new amc(this, a1.f);
        a1.z = new amd(this, a1.f);
        a1.D = new amp(this);
        a1.B = new ami(this);
        a1.A = new amh(this, a1.g);
        a1.C = new ana(new ane(a1.B, alu.q()), alu.q());
        a1.j = a1.E.d();
        a1.k = a1.H.d();
        a1.i = a1.D.d();
        a1.h = a1.B.d();
    }

    abstract int b(int i, int j);

    final int b(long l)
    {
        int i = a(l);
        int j = e(l, i);
        if (j == 1)
        {
            i = a(0x240c8400L + l);
        } else
        if (j > 51)
        {
            return a(l - 0x48190800L);
        }
        return i;
    }

    final int b(long l, int i)
    {
        return (int)((l - b(i)) / 0x5265c00L) + 1;
    }

    final long b(int i)
    {
        b b1;
label0:
        {
            b b2 = X[i & 0x3ff];
            if (b2 != null)
            {
                b1 = b2;
                if (b2.a == i)
                {
                    break label0;
                }
            }
            b1 = new b(i, d(i));
            X[i & 0x3ff] = b1;
        }
        return b1.b;
    }

    long b(int i, int j, int k)
    {
        amX.a(alu.s(), i, N(), O());
        amX.a(alu.r(), j, 1, 12);
        amX.a(alu.m(), k, 1, b(i, j));
        return a(i, j, k);
    }

    final int c(long l)
    {
        return e(l, a(l));
    }

    int c(long l, int i)
    {
        return f(l);
    }

    abstract long c(int i, int j);

    abstract boolean c(int i);

    abstract long d(int i);

    abstract long d(long l, int i);

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && getClass() == obj.getClass())
            {
                if (E != ((amb) (obj = (amb)obj)).E || !a().equals(((amb) (obj)).a()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    final int f(long l)
    {
        int i = a(l);
        return b(i, a(l, i));
    }

    public int hashCode()
    {
        return getClass().getName().hashCode() * 11 + a().hashCode() + E;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(60);
        String s = getClass().getName();
        int i = s.lastIndexOf('.');
        Object obj = s;
        if (i >= 0)
        {
            obj = s.substring(i + 1);
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append('[');
        obj = a();
        if (obj != null)
        {
            stringbuilder.append(((alw) (obj)).c);
        }
        if (E != 4)
        {
            stringbuilder.append(",mdfw=");
            stringbuilder.append(E);
        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }

    static 
    {
        F = amZ.a;
        G = new and(alA.b(), 1000L);
        H = new and(alA.c(), 60000L);
        I = new and(alA.d(), 0x36ee80L);
        J = new and(alA.e(), 0x2932e00L);
        K = new and(alA.f(), 0x5265c00L);
        M = new anb(alu.a(), F, G);
        N = new anb(alu.b(), F, K);
        O = new anb(alu.c(), G, H);
        P = new anb(alu.d(), G, K);
        Q = new anb(alu.e(), H, I);
        R = new anb(alu.f(), H, K);
        S = new anb(alu.g(), I, K);
        T = new anb(alu.i(), I, J);
        U = new ank(S, alu.h());
        V = new ank(T, alu.j());
    }
}
