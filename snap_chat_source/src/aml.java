// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class aml extends alZ
{
    class a extends amR
    {

        final alt a;
        final alt b;
        final long c;
        final boolean d;
        protected alz e;
        protected alz f;
        private aml h;

        public final int a(long l)
        {
            if (l >= c)
            {
                return b.a(l);
            } else
            {
                return a.a(l);
            }
        }

        public final int a(Locale locale)
        {
            return Math.max(a.a(locale), b.a(locale));
        }

        public long a(long l, int i)
        {
            return b.a(l, i);
        }

        public long a(long l, long l1)
        {
            return b.a(l, l1);
        }

        public final long a(long l, String s, Locale locale)
        {
            if (l >= c)
            {
                long l1 = b.a(l, s, locale);
                l = l1;
                if (l1 < c)
                {
                    l = l1;
                    if (aml.a(h) + l1 < c)
                    {
                        l = h(l1);
                    }
                }
            } else
            {
                long l2 = a.a(l, s, locale);
                l = l2;
                if (l2 >= c)
                {
                    l = l2;
                    if (l2 - aml.a(h) >= c)
                    {
                        return g(l2);
                    }
                }
            }
            return l;
        }

        public final String a(int i, Locale locale)
        {
            return b.a(i, locale);
        }

        public final String a(long l, Locale locale)
        {
            if (l >= c)
            {
                return b.a(l, locale);
            } else
            {
                return a.a(l, locale);
            }
        }

        public int b(long l, long l1)
        {
            return b.b(l, l1);
        }

        public final long b(long l, int i)
        {
            if (l >= c)
            {
                long l3 = b.b(l, i);
                l = l3;
                if (l3 < c)
                {
                    long l1 = l3;
                    if (aml.a(h) + l3 < c)
                    {
                        l1 = h(l3);
                    }
                    l = l1;
                    if (a(l1) != i)
                    {
                        throw new alB(b.a(), Integer.valueOf(i), null, null);
                    }
                }
            } else
            {
                long l4 = a.b(l, i);
                l = l4;
                if (l4 >= c)
                {
                    long l2 = l4;
                    if (l4 - aml.a(h) >= c)
                    {
                        l2 = g(l4);
                    }
                    l = l2;
                    if (a(l2) != i)
                    {
                        throw new alB(a.a(), Integer.valueOf(i), null, null);
                    }
                }
            }
            return l;
        }

        public final String b(int i, Locale locale)
        {
            return b.b(i, locale);
        }

        public final String b(long l, Locale locale)
        {
            if (l >= c)
            {
                return b.b(l, locale);
            } else
            {
                return a.b(l, locale);
            }
        }

        public final boolean b(long l)
        {
            if (l >= c)
            {
                return b.b(l);
            } else
            {
                return a.b(l);
            }
        }

        public int c(long l)
        {
            int i;
            if (l >= c)
            {
                i = b.c(l);
            } else
            {
                int j = a.c(l);
                i = j;
                if (a.b(l, j) >= c)
                {
                    return a.a(a.a(c, -1));
                }
            }
            return i;
        }

        public long c(long l, long l1)
        {
            return b.c(l, l1);
        }

        public final long d(long l)
        {
            if (l >= c)
            {
                long l1 = b.d(l);
                l = l1;
                if (l1 < c)
                {
                    l = l1;
                    if (aml.a(h) + l1 < c)
                    {
                        l = h(l1);
                    }
                }
                return l;
            } else
            {
                return a.d(l);
            }
        }

        public final alz d()
        {
            return e;
        }

        public final long e(long l)
        {
            if (l >= c)
            {
                l = b.e(l);
            } else
            {
                long l1 = a.e(l);
                l = l1;
                if (l1 >= c)
                {
                    l = l1;
                    if (l1 - aml.a(h) >= c)
                    {
                        return g(l1);
                    }
                }
            }
            return l;
        }

        public final alz e()
        {
            return f;
        }

        public final alz f()
        {
            return b.f();
        }

        public final int g()
        {
            return a.g();
        }

        protected final long g(long l)
        {
            if (d)
            {
                aml aml1 = h;
                return aml.b(l, aml1.E, aml1.F);
            } else
            {
                return h.a(l);
            }
        }

        public final int h()
        {
            return b.h();
        }

        protected final long h(long l)
        {
            if (d)
            {
                aml aml1 = h;
                return aml.b(l, aml1.F, aml1.E);
            } else
            {
                aml aml2 = h;
                return aml.a(l, aml2.F, aml2.E);
            }
        }

        a(alt alt1, alt alt2, long l)
        {
            this(alt1, alt2, l, false);
        }

        a(alt alt1, alt alt2, long l, boolean flag)
        {
            h = aml.this;
            super(alt2.a());
            a = alt1;
            b = alt2;
            c = l;
            d = flag;
            e = alt2.d();
            alt2 = alt2.e();
            aml1 = alt2;
            if (alt2 == null)
            {
                aml1 = alt1.e();
            }
            f = aml.this;
        }
    }

    final class b extends a
    {

        private aml h;

        public final long a(long l, int i)
        {
            if (l < c) goto _L2; else goto _L1
_L1:
            long l1;
            l1 = b.a(l, i);
            l = l1;
            if (l1 >= c) goto _L4; else goto _L3
_L3:
            l = l1;
            if (aml.a(h) + l1 >= c) goto _L4; else goto _L5
_L5:
            if (!d) goto _L7; else goto _L6
_L6:
            l = l1;
            if (((alZ) (aml.b(h))).w.a(l1) <= 0)
            {
                l = ((alZ) (aml.b(h))).w.a(l1, -1);
            }
_L11:
            l = h(l);
_L4:
            return l;
_L7:
            l = l1;
            if (((alZ) (aml.b(h))).z.a(l1) <= 0)
            {
                l = ((alZ) (aml.b(h))).z.a(l1, -1);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l1 = a.a(l, i);
            l = l1;
            if (l1 < c) goto _L4; else goto _L8
_L8:
            l = l1;
            if (l1 - aml.a(h) < c) goto _L4; else goto _L9
_L9:
            return g(l1);
            if (true) goto _L11; else goto _L10
_L10:
        }

        public final long a(long l, long l1)
        {
            if (l < c) goto _L2; else goto _L1
_L1:
            l1 = b.a(l, l1);
            l = l1;
            if (l1 >= c) goto _L4; else goto _L3
_L3:
            l = l1;
            if (aml.a(h) + l1 >= c) goto _L4; else goto _L5
_L5:
            if (!d) goto _L7; else goto _L6
_L6:
            l = l1;
            if (((alZ) (aml.b(h))).w.a(l1) <= 0)
            {
                l = ((alZ) (aml.b(h))).w.a(l1, -1);
            }
_L11:
            l = h(l);
_L4:
            return l;
_L7:
            l = l1;
            if (((alZ) (aml.b(h))).z.a(l1) <= 0)
            {
                l = ((alZ) (aml.b(h))).z.a(l1, -1);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l1 = a.a(l, l1);
            l = l1;
            if (l1 < c) goto _L4; else goto _L8
_L8:
            l = l1;
            if (l1 - aml.a(h) < c) goto _L4; else goto _L9
_L9:
            return g(l1);
            if (true) goto _L11; else goto _L10
_L10:
        }

        public final int b(long l, long l1)
        {
            if (l >= c)
            {
                if (l1 >= c)
                {
                    return b.b(l, l1);
                } else
                {
                    l = h(l);
                    return a.b(l, l1);
                }
            }
            if (l1 < c)
            {
                return a.b(l, l1);
            } else
            {
                l = g(l);
                return b.b(l, l1);
            }
        }

        public final int c(long l)
        {
            if (l >= c)
            {
                return b.c(l);
            } else
            {
                return a.c(l);
            }
        }

        public final long c(long l, long l1)
        {
            if (l >= c)
            {
                if (l1 >= c)
                {
                    return b.c(l, l1);
                } else
                {
                    l = h(l);
                    return a.c(l, l1);
                }
            }
            if (l1 < c)
            {
                return a.c(l, l1);
            } else
            {
                l = g(l);
                return b.c(l, l1);
            }
        }

        b(alt alt1, alt alt2, long l)
        {
            this(alt1, alt2, null, l, false);
        }

        b(alt alt1, alt alt2, alz alz, long l)
        {
            this(alt1, alt2, alz, l, false);
        }

        b(alt alt1, alt alt2, alz alz, long l, boolean flag)
        {
            h = aml.this;
            super(alt1, alt2, l, flag);
            aml1 = alz;
            if (alz == null)
            {
                aml1 = new c(e, this);
            }
            e = aml.this;
        }
    }

    static final class c extends amU
    {

        private final b c;

        public final long a(long l, int i)
        {
            return c.a(l, i);
        }

        public final long a(long l, long l1)
        {
            return c.a(l, l1);
        }

        public final int b(long l, long l1)
        {
            return c.b(l, l1);
        }

        public final long c(long l, long l1)
        {
            return c.c(l, l1);
        }

        c(alz alz1, b b1)
        {
            super(alz1, alz1.a());
            c = b1;
        }
    }


    private static alD G = new alD(0xfffff4e2f964ac00L);
    private static final Map H = new HashMap();
    amu E;
    amr F;
    private alD I;
    private long J;
    private long K;

    private aml(alr alr1, amu amu1, amr amr1, alD ald)
    {
        super(alr1, ((Object) (new Object[] {
            amu1, amr1, ald
        })));
    }

    private aml(amu amu1, amr amr1, alD ald)
    {
        super(null, ((Object) (new Object[] {
            amu1, amr1, ald
        })));
    }

    static long a(long l, alr alr1, alr alr2)
    {
        return alr2.a(alr1.E().a(l), alr1.C().a(l), alr1.u().a(l), alr1.e().a(l));
    }

    static long a(aml aml1)
    {
        return aml1.K;
    }

    public static aml a(alw alw1, long l)
    {
        Object obj;
        if (l == G.a)
        {
            obj = null;
        } else
        {
            obj = new alD(l);
        }
        return a(alw1, ((alM) (obj)), 4);
    }

    private static aml a(alw alw1, alM alm, int i)
    {
        aml;
        JVM INSTR monitorenter ;
        alw alw2 = alv.a(alw1);
        if (alm != null) goto _L2; else goto _L1
_L1:
        alw1 = G;
_L6:
        Map map = H;
        map;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)H.get(alw2);
        if (arraylist != null) goto _L4; else goto _L3
_L3:
        alm = new ArrayList(2);
        H.put(alw2, alm);
_L8:
        if (alw2 != alw.a)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        alw1 = new aml(amu.a(alw2, i), amr.a(alw2, i), alw1);
_L12:
        alm.add(alw1);
        map;
        JVM INSTR monitorexit ;
_L11:
        aml;
        JVM INSTR monitorexit ;
        return alw1;
_L2:
        alw1 = alm.b();
        alm = new alE(((alD) (alw1)).a, amr.b(alw2));
        if (((alE) (alm)).b.E().a(((alE) (alm)).a) > 0) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
        alw1;
        aml;
        JVM INSTR monitorexit ;
        throw alw1;
_L4:
        int j = arraylist.size();
_L10:
        j--;
        alm = arraylist;
        if (j < 0) goto _L8; else goto _L7
_L7:
        alm = (aml)arraylist.get(j);
        if (i != ((amb) (((aml) (alm)).F)).E || !alw1.equals(((aml) (alm)).I)) goto _L10; else goto _L9
_L9:
        map;
        JVM INSTR monitorexit ;
        alw1 = alm;
          goto _L11
        alw1;
        map;
        JVM INSTR monitorexit ;
        throw alw1;
        alw1 = a(alw.a, ((alM) (alw1)), i);
        alw1 = new aml(amw.a(alw1, alw2), ((aml) (alw1)).E, ((aml) (alw1)).F, ((aml) (alw1)).I);
          goto _L12
    }

    static long b(long l, alr alr1, alr alr2)
    {
        long l1 = alr2.z().b(0L, alr1.z().a(l));
        l1 = alr2.x().b(l1, alr1.x().a(l));
        l1 = alr2.t().b(l1, alr1.t().a(l));
        return alr2.e().b(l1, alr1.e().a(l));
    }

    public static aml b(alw alw1)
    {
        return a(alw1, ((alM) (null)), 4);
    }

    static amr b(aml aml1)
    {
        return aml1.F;
    }

    public final long a(int i, int j, int k, int l)
    {
        alr alr1 = super.a;
        long l1;
        if (alr1 != null)
        {
            l1 = alr1.a(i, j, k, l);
        } else
        {
            long l2 = F.a(i, j, k, l);
            l1 = l2;
            if (l2 < J)
            {
                long l3 = E.a(i, j, k, l);
                l1 = l3;
                if (l3 >= J)
                {
                    throw new IllegalArgumentException("Specified date does not exist");
                }
            }
        }
        return l1;
    }

    public final long a(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        alr alr1 = super.a;
        if (alr1 == null) goto _L2; else goto _L1
_L1:
        long l1 = alr1.a(i, j, k, l, i1, j1, k1);
_L4:
        return l1;
_L2:
        long l3;
        try
        {
            l3 = F.a(i, j, k, l, i1, j1, k1);
        }
        catch (alB alb)
        {
            if (j != 2 || k != 29)
            {
                throw alb;
            }
            long l2 = F.a(i, j, 28, l, i1, j1, k1);
            l3 = l2;
            if (l2 >= J)
            {
                throw alb;
            }
        }
        l1 = l3;
        if (l3 < J)
        {
            l3 = E.a(i, j, k, l, i1, j1, k1);
            l1 = l3;
            if (l3 >= J)
            {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final long a(long l)
    {
        return a(l, ((alr) (E)), ((alr) (F)));
    }

    public final alr a(alw alw1)
    {
        alw alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = alw.a();
        }
        if (alw2 == a())
        {
            return this;
        } else
        {
            return a(alw2, ((alM) (I)), ((amb) (F)).E);
        }
    }

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

    protected final void a(alZ.a a1)
    {
        Object aobj[] = (Object[])super.b;
        Object obj = (amu)aobj[0];
        amr amr1 = (amr)aobj[1];
        alD ald = (alD)aobj[2];
        J = ald.a;
        E = ((amu) (obj));
        F = amr1;
        I = ald;
        if (super.a != null)
        {
            return;
        }
        if (((amb) (obj)).E != ((amb) (amr1)).E)
        {
            throw new IllegalArgumentException();
        }
        K = J - a(J);
        a1.a(amr1);
        if (((alZ) (amr1)).i.a(J) == 0)
        {
            a1.m = new a(((alZ) (obj)).h, a1.m, J);
            a1.n = new a(((alZ) (obj)).i, a1.n, J);
            a1.o = new a(((alZ) (obj)).j, a1.o, J);
            a1.p = new a(((alZ) (obj)).k, a1.p, J);
            a1.q = new a(((alZ) (obj)).l, a1.q, J);
            a1.r = new a(((alZ) (obj)).m, a1.r, J);
            a1.s = new a(((alZ) (obj)).n, a1.s, J);
            a1.u = new a(((alZ) (obj)).p, a1.u, J);
            a1.t = new a(((alZ) (obj)).o, a1.t, J);
            a1.v = new a(((alZ) (obj)).q, a1.v, J);
            a1.w = new a(((alZ) (obj)).r, a1.w, J);
        }
        a1.I = new a(((alZ) (obj)).D, a1.I, J);
        long l = ((alZ) (amr1)).z.e(J);
        a1.z = new a(((alZ) (obj)).u, a1.z, l);
        l = ((alZ) (amr1)).w.e(J);
        a1.A = new a(((alZ) (obj)).v, a1.A, l, true);
        a1.E = new b(((alZ) (obj)).z, a1.E, J);
        a1.j = a1.E.d();
        a1.F = new b(((alZ) (obj)).A, a1.F, a1.j, J);
        a1.G = new b(((alZ) (obj)).B, a1.G, a1.j, J);
        a1.H = new b(((alZ) (obj)).C, a1.H, J);
        a1.k = a1.H.d();
        a1.D = new b(((alZ) (obj)).y, a1.D, J);
        a1.i = a1.D.d();
        a1.B = new b(((alZ) (obj)).w, a1.B, null, J, true);
        a1.C = new b(((alZ) (obj)).x, a1.C, a1.h, J);
        a1.h = a1.B.d();
        obj = new a(((alZ) (obj)).t, a1.y, J);
        obj.f = a1.i;
        a1.y = ((alt) (obj));
    }

    public final alr b()
    {
        return a(alw.a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof aml)
            {
                if (J != ((aml) (obj = (aml)obj)).J || ((amb) (F)).E != ((amb) (((aml) (obj)).F)).E || !a().equals(((aml) (obj)).a()))
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

    public final int hashCode()
    {
        return "GJ".hashCode() * 11 + a().hashCode() + ((amb) (F)).E + I.hashCode();
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(60);
        stringbuffer.append("GJChronology");
        stringbuffer.append('[');
        stringbuffer.append(a().c);
        if (J != G.a)
        {
            stringbuffer.append(",cutover=");
            anm anm1;
            if (a(alw.a).v().f(J) == 0L)
            {
                anm1 = ans.a.c();
            } else
            {
                anm1 = ans.a.b();
            }
            anm1.a(a(alw.a)).a(stringbuffer, J, null);
        }
        if (((amb) (F)).E != 4)
        {
            stringbuffer.append(",mdfw=");
            stringbuffer.append(((amb) (F)).E);
        }
        stringbuffer.append(']');
        return stringbuffer.toString();
    }

}
