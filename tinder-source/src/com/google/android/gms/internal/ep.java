// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            fd, fc, ew, fg, 
//            zzrx

public interface ep
{
    public static final class a extends fd
    {

        private static volatile a f[];
        public b a[];
        public String b;
        public Long c;
        public Long d;
        public Integer e;

        public static a[] a()
        {
            if (f == null)
            {
                synchronized (fc.a)
                {
                    if (f == null)
                    {
                        f = new a[0];
                    }
                }
            }
            return f;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final fd a(ew ew1)
            throws IOException
        {
            do
            {
                int i = ew1.a();
                switch (i)
                {
                default:
                    if (fg.a(ew1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k = fg.b(ew1, 10);
                    b ab[];
                    int j;
                    if (a == null)
                    {
                        j = 0;
                    } else
                    {
                        j = a.length;
                    }
                    ab = new b[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(a, 0, ab, 0, j);
                        k = j;
                    }
                    for (; k < ab.length - 1; k++)
                    {
                        ab[k] = new b();
                        ew1.a(ab[k]);
                        ew1.a();
                    }

                    ab[k] = new b();
                    ew1.a(ab[k]);
                    a = ab;
                    break;

                case 18: // '\022'
                    b = ew1.d();
                    break;

                case 24: // '\030'
                    c = Long.valueOf(ew1.b());
                    break;

                case 32: // ' '
                    d = Long.valueOf(ew1.b());
                    break;

                case 40: // '('
                    e = Integer.valueOf(ew1.e());
                    break;
                }
            } while (true);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            if (a != null && a.length > 0)
            {
                for (int i = 0; i < a.length; i++)
                {
                    b b1 = a[i];
                    if (b1 != null)
                    {
                        zzrx1.a(1, b1);
                    }
                }

            }
            if (b != null)
            {
                zzrx1.a(2, b);
            }
            if (c != null)
            {
                zzrx1.a(3, c.longValue());
            }
            if (d != null)
            {
                zzrx1.a(4, d.longValue());
            }
            if (e != null)
            {
                zzrx1.a(5, e.intValue());
            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            int i = super.b();
            int j = i;
            if (a != null)
            {
                j = i;
                if (a.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= a.length)
                        {
                            break;
                        }
                        b b1 = a[k];
                        j = i;
                        if (b1 != null)
                        {
                            j = i + zzrx.b(1, b1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (b != null)
            {
                i = j + zzrx.b(2, b);
            }
            j = i;
            if (c != null)
            {
                j = i + zzrx.b(3, c.longValue());
            }
            i = j;
            if (d != null)
            {
                i = j + zzrx.b(4, d.longValue());
            }
            j = i;
            if (e != null)
            {
                j = i + zzrx.b(5, e.intValue());
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (!fc.a(a, ((a) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((a) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((a) (obj)).b))
            {
                return false;
            }
            if (c == null)
            {
                if (((a) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((a) (obj)).c))
            {
                return false;
            }
            if (d == null)
            {
                if (((a) (obj)).d != null)
                {
                    return false;
                }
            } else
            if (!d.equals(((a) (obj)).d))
            {
                return false;
            }
            if (e != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((a) (obj)).e == null) goto _L1; else goto _L3
_L3:
            return false;
            if (e.equals(((a) (obj)).e)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l = 0;
            int i1 = getClass().getName().hashCode();
            int j1 = fc.a(a);
            int i;
            int j;
            int k;
            if (b == null)
            {
                i = 0;
            } else
            {
                i = b.hashCode();
            }
            if (c == null)
            {
                j = 0;
            } else
            {
                j = c.hashCode();
            }
            if (d == null)
            {
                k = 0;
            } else
            {
                k = d.hashCode();
            }
            if (e != null)
            {
                l = e.hashCode();
            }
            return (k + (j + (i + ((i1 + 527) * 31 + j1) * 31) * 31) * 31) * 31 + l;
        }

        public a()
        {
            a = b.a();
            b = null;
            c = null;
            d = null;
            e = null;
            A = -1;
        }
    }

    public static final class b extends fd
    {

        private static volatile b e[];
        public String a;
        public String b;
        public Long c;
        public Float d;

        public static b[] a()
        {
            if (e == null)
            {
                synchronized (fc.a)
                {
                    if (e == null)
                    {
                        e = new b[0];
                    }
                }
            }
            return e;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final fd a(ew ew1)
            throws IOException
        {
            do
            {
                int i = ew1.a();
                switch (i)
                {
                default:
                    if (fg.a(ew1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    a = ew1.d();
                    break;

                case 18: // '\022'
                    b = ew1.d();
                    break;

                case 24: // '\030'
                    c = Long.valueOf(ew1.b());
                    break;

                case 37: // '%'
                    d = Float.valueOf(Float.intBitsToFloat(ew1.f()));
                    break;
                }
            } while (true);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            if (a != null)
            {
                zzrx1.a(1, a);
            }
            if (b != null)
            {
                zzrx1.a(2, b);
            }
            if (c != null)
            {
                zzrx1.a(3, c.longValue());
            }
            if (d != null)
            {
                zzrx1.a(4, d.floatValue());
            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            int j = super.b();
            int i = j;
            if (a != null)
            {
                i = j + zzrx.b(1, a);
            }
            j = i;
            if (b != null)
            {
                j = i + zzrx.b(2, b);
            }
            i = j;
            if (c != null)
            {
                i = j + zzrx.b(3, c.longValue());
            }
            j = i;
            if (d != null)
            {
                d.floatValue();
                j = i + (zzrx.a(4) + 4);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (a == null)
            {
                if (((b) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((b) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((b) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((b) (obj)).b))
            {
                return false;
            }
            if (c == null)
            {
                if (((b) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((b) (obj)).c))
            {
                return false;
            }
            if (d != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((b) (obj)).d == null) goto _L1; else goto _L3
_L3:
            return false;
            if (d.equals(((b) (obj)).d)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l = 0;
            int i1 = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.hashCode();
            }
            if (c == null)
            {
                k = 0;
            } else
            {
                k = c.hashCode();
            }
            if (d != null)
            {
                l = d.hashCode();
            }
            return (k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + l;
        }

        public b()
        {
            a = null;
            b = null;
            c = null;
            d = null;
            A = -1;
        }
    }

    public static final class c extends fd
    {

        public d a[];

        public final fd a(ew ew1)
            throws IOException
        {
            do
            {
                int i = ew1.a();
                switch (i)
                {
                default:
                    if (fg.a(ew1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k = fg.b(ew1, 10);
                    d ad[];
                    int j;
                    if (a == null)
                    {
                        j = 0;
                    } else
                    {
                        j = a.length;
                    }
                    ad = new d[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(a, 0, ad, 0, j);
                        k = j;
                    }
                    for (; k < ad.length - 1; k++)
                    {
                        ad[k] = new d();
                        ew1.a(ad[k]);
                        ew1.a();
                    }

                    ad[k] = new d();
                    ew1.a(ad[k]);
                    a = ad;
                    break;
                }
            } while (true);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            if (a != null && a.length > 0)
            {
                for (int i = 0; i < a.length; i++)
                {
                    d d1 = a[i];
                    if (d1 != null)
                    {
                        zzrx1.a(1, d1);
                    }
                }

            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            int i = super.b();
            int k = i;
            if (a != null)
            {
                k = i;
                if (a.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= a.length)
                        {
                            break;
                        }
                        d d1 = a[j];
                        k = i;
                        if (d1 != null)
                        {
                            k = i + zzrx.b(1, d1);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof c))
                {
                    return false;
                }
                obj = (c)obj;
                if (!fc.a(a, ((c) (obj)).a))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + fc.a(a);
        }

        public c()
        {
            a = d.a();
            A = -1;
        }
    }

    public static final class d extends fd
    {

        private static volatile d B[];
        public Integer a;
        public a b[];
        public e c[];
        public Long d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public String i;
        public String j;
        public String k;
        public String l;
        public Integer m;
        public String n;
        public String o;
        public String p;
        public Long q;
        public Long r;
        public String s;
        public Boolean t;
        public String u;
        public Long v;
        public Integer w;
        public String x;
        public String y;
        public Boolean z;

        public static d[] a()
        {
            if (B == null)
            {
                synchronized (fc.a)
                {
                    if (B == null)
                    {
                        B = new d[0];
                    }
                }
            }
            return B;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final fd a(ew ew1)
            throws IOException
        {
            return b(ew1);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            boolean flag = false;
            if (a != null)
            {
                zzrx1.a(1, a.intValue());
            }
            if (b != null && b.length > 0)
            {
                for (int i1 = 0; i1 < b.length; i1++)
                {
                    a a1 = b[i1];
                    if (a1 != null)
                    {
                        zzrx1.a(2, a1);
                    }
                }

            }
            if (c != null && c.length > 0)
            {
                for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
                {
                    e e1 = c[j1];
                    if (e1 != null)
                    {
                        zzrx1.a(3, e1);
                    }
                }

            }
            if (d != null)
            {
                zzrx1.a(4, d.longValue());
            }
            if (e != null)
            {
                zzrx1.a(5, e.longValue());
            }
            if (f != null)
            {
                zzrx1.a(6, f.longValue());
            }
            if (h != null)
            {
                zzrx1.a(7, h.longValue());
            }
            if (i != null)
            {
                zzrx1.a(8, i);
            }
            if (j != null)
            {
                zzrx1.a(9, j);
            }
            if (k != null)
            {
                zzrx1.a(10, k);
            }
            if (l != null)
            {
                zzrx1.a(11, l);
            }
            if (m != null)
            {
                zzrx1.a(12, m.intValue());
            }
            if (n != null)
            {
                zzrx1.a(13, n);
            }
            if (o != null)
            {
                zzrx1.a(14, o);
            }
            if (p != null)
            {
                zzrx1.a(16, p);
            }
            if (q != null)
            {
                zzrx1.a(17, q.longValue());
            }
            if (r != null)
            {
                zzrx1.a(18, r.longValue());
            }
            if (s != null)
            {
                zzrx1.a(19, s);
            }
            if (t != null)
            {
                zzrx1.a(20, t.booleanValue());
            }
            if (u != null)
            {
                zzrx1.a(21, u);
            }
            if (v != null)
            {
                zzrx1.a(22, v.longValue());
            }
            if (w != null)
            {
                zzrx1.a(23, w.intValue());
            }
            if (x != null)
            {
                zzrx1.a(24, x);
            }
            if (y != null)
            {
                zzrx1.a(25, y);
            }
            if (g != null)
            {
                zzrx1.a(26, g.longValue());
            }
            if (z != null)
            {
                zzrx1.a(28, z.booleanValue());
            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            boolean flag = false;
            int i1 = super.b();
            int j1 = i1;
            if (a != null)
            {
                j1 = i1 + zzrx.b(1, a.intValue());
            }
            i1 = j1;
            if (b != null)
            {
                i1 = j1;
                if (b.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < b.length;)
                    {
                        a a1 = b[j1];
                        int k1 = i1;
                        if (a1 != null)
                        {
                            k1 = i1 + zzrx.b(2, a1);
                        }
                        j1++;
                        i1 = k1;
                    }

                }
            }
            j1 = i1;
            if (c != null)
            {
                j1 = i1;
                if (c.length > 0)
                {
                    int l1 = ((flag) ? 1 : 0);
                    do
                    {
                        j1 = i1;
                        if (l1 >= c.length)
                        {
                            break;
                        }
                        e e1 = c[l1];
                        j1 = i1;
                        if (e1 != null)
                        {
                            j1 = i1 + zzrx.b(3, e1);
                        }
                        l1++;
                        i1 = j1;
                    } while (true);
                }
            }
            i1 = j1;
            if (d != null)
            {
                i1 = j1 + zzrx.b(4, d.longValue());
            }
            j1 = i1;
            if (e != null)
            {
                j1 = i1 + zzrx.b(5, e.longValue());
            }
            i1 = j1;
            if (f != null)
            {
                i1 = j1 + zzrx.b(6, f.longValue());
            }
            j1 = i1;
            if (h != null)
            {
                j1 = i1 + zzrx.b(7, h.longValue());
            }
            i1 = j1;
            if (i != null)
            {
                i1 = j1 + zzrx.b(8, i);
            }
            j1 = i1;
            if (j != null)
            {
                j1 = i1 + zzrx.b(9, j);
            }
            i1 = j1;
            if (k != null)
            {
                i1 = j1 + zzrx.b(10, k);
            }
            j1 = i1;
            if (l != null)
            {
                j1 = i1 + zzrx.b(11, l);
            }
            i1 = j1;
            if (m != null)
            {
                i1 = j1 + zzrx.b(12, m.intValue());
            }
            j1 = i1;
            if (n != null)
            {
                j1 = i1 + zzrx.b(13, n);
            }
            i1 = j1;
            if (o != null)
            {
                i1 = j1 + zzrx.b(14, o);
            }
            j1 = i1;
            if (p != null)
            {
                j1 = i1 + zzrx.b(16, p);
            }
            i1 = j1;
            if (q != null)
            {
                i1 = j1 + zzrx.b(17, q.longValue());
            }
            j1 = i1;
            if (r != null)
            {
                j1 = i1 + zzrx.b(18, r.longValue());
            }
            i1 = j1;
            if (s != null)
            {
                i1 = j1 + zzrx.b(19, s);
            }
            j1 = i1;
            if (t != null)
            {
                t.booleanValue();
                j1 = i1 + (zzrx.a(20) + 1);
            }
            i1 = j1;
            if (u != null)
            {
                i1 = j1 + zzrx.b(21, u);
            }
            j1 = i1;
            if (v != null)
            {
                j1 = i1 + zzrx.b(22, v.longValue());
            }
            i1 = j1;
            if (w != null)
            {
                i1 = j1 + zzrx.b(23, w.intValue());
            }
            j1 = i1;
            if (x != null)
            {
                j1 = i1 + zzrx.b(24, x);
            }
            i1 = j1;
            if (y != null)
            {
                i1 = j1 + zzrx.b(25, y);
            }
            j1 = i1;
            if (g != null)
            {
                j1 = i1 + zzrx.b(26, g.longValue());
            }
            i1 = j1;
            if (z != null)
            {
                z.booleanValue();
                i1 = j1 + (zzrx.a(28) + 1);
            }
            return i1;
        }

        public final d b(ew ew1)
            throws IOException
        {
            do
            {
                int i1 = ew1.a();
                switch (i1)
                {
                default:
                    if (fg.a(ew1, i1))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    a = Integer.valueOf(ew1.e());
                    break;

                case 18: // '\022'
                    int l1 = fg.b(ew1, 18);
                    a aa[];
                    int j1;
                    if (b == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = b.length;
                    }
                    aa = new a[l1 + j1];
                    l1 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(b, 0, aa, 0, j1);
                        l1 = j1;
                    }
                    for (; l1 < aa.length - 1; l1++)
                    {
                        aa[l1] = new a();
                        ew1.a(aa[l1]);
                        ew1.a();
                    }

                    aa[l1] = new a();
                    ew1.a(aa[l1]);
                    b = aa;
                    break;

                case 26: // '\032'
                    int i2 = fg.b(ew1, 26);
                    e ae[];
                    int k1;
                    if (c == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = c.length;
                    }
                    ae = new e[i2 + k1];
                    i2 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(c, 0, ae, 0, k1);
                        i2 = k1;
                    }
                    for (; i2 < ae.length - 1; i2++)
                    {
                        ae[i2] = new e();
                        ew1.a(ae[i2]);
                        ew1.a();
                    }

                    ae[i2] = new e();
                    ew1.a(ae[i2]);
                    c = ae;
                    break;

                case 32: // ' '
                    d = Long.valueOf(ew1.b());
                    break;

                case 40: // '('
                    e = Long.valueOf(ew1.b());
                    break;

                case 48: // '0'
                    f = Long.valueOf(ew1.b());
                    break;

                case 56: // '8'
                    h = Long.valueOf(ew1.b());
                    break;

                case 66: // 'B'
                    i = ew1.d();
                    break;

                case 74: // 'J'
                    j = ew1.d();
                    break;

                case 82: // 'R'
                    k = ew1.d();
                    break;

                case 90: // 'Z'
                    l = ew1.d();
                    break;

                case 96: // '`'
                    m = Integer.valueOf(ew1.e());
                    break;

                case 106: // 'j'
                    n = ew1.d();
                    break;

                case 114: // 'r'
                    o = ew1.d();
                    break;

                case 130: 
                    p = ew1.d();
                    break;

                case 136: 
                    q = Long.valueOf(ew1.b());
                    break;

                case 144: 
                    r = Long.valueOf(ew1.b());
                    break;

                case 154: 
                    s = ew1.d();
                    break;

                case 160: 
                    t = Boolean.valueOf(ew1.c());
                    break;

                case 170: 
                    u = ew1.d();
                    break;

                case 176: 
                    v = Long.valueOf(ew1.b());
                    break;

                case 184: 
                    w = Integer.valueOf(ew1.e());
                    break;

                case 194: 
                    x = ew1.d();
                    break;

                case 202: 
                    y = ew1.d();
                    break;

                case 208: 
                    g = Long.valueOf(ew1.b());
                    break;

                case 224: 
                    z = Boolean.valueOf(ew1.c());
                    break;
                }
            } while (true);
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof d))
            {
                return false;
            }
            obj = (d)obj;
            if (a == null)
            {
                if (((d) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((d) (obj)).a))
            {
                return false;
            }
            if (!fc.a(b, ((d) (obj)).b))
            {
                return false;
            }
            if (!fc.a(c, ((d) (obj)).c))
            {
                return false;
            }
            if (d == null)
            {
                if (((d) (obj)).d != null)
                {
                    return false;
                }
            } else
            if (!d.equals(((d) (obj)).d))
            {
                return false;
            }
            if (e == null)
            {
                if (((d) (obj)).e != null)
                {
                    return false;
                }
            } else
            if (!e.equals(((d) (obj)).e))
            {
                return false;
            }
            if (f == null)
            {
                if (((d) (obj)).f != null)
                {
                    return false;
                }
            } else
            if (!f.equals(((d) (obj)).f))
            {
                return false;
            }
            if (g == null)
            {
                if (((d) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((d) (obj)).g))
            {
                return false;
            }
            if (h == null)
            {
                if (((d) (obj)).h != null)
                {
                    return false;
                }
            } else
            if (!h.equals(((d) (obj)).h))
            {
                return false;
            }
            if (i == null)
            {
                if (((d) (obj)).i != null)
                {
                    return false;
                }
            } else
            if (!i.equals(((d) (obj)).i))
            {
                return false;
            }
            if (j == null)
            {
                if (((d) (obj)).j != null)
                {
                    return false;
                }
            } else
            if (!j.equals(((d) (obj)).j))
            {
                return false;
            }
            if (k == null)
            {
                if (((d) (obj)).k != null)
                {
                    return false;
                }
            } else
            if (!k.equals(((d) (obj)).k))
            {
                return false;
            }
            if (l == null)
            {
                if (((d) (obj)).l != null)
                {
                    return false;
                }
            } else
            if (!l.equals(((d) (obj)).l))
            {
                return false;
            }
            if (m == null)
            {
                if (((d) (obj)).m != null)
                {
                    return false;
                }
            } else
            if (!m.equals(((d) (obj)).m))
            {
                return false;
            }
            if (n == null)
            {
                if (((d) (obj)).n != null)
                {
                    return false;
                }
            } else
            if (!n.equals(((d) (obj)).n))
            {
                return false;
            }
            if (o == null)
            {
                if (((d) (obj)).o != null)
                {
                    return false;
                }
            } else
            if (!o.equals(((d) (obj)).o))
            {
                return false;
            }
            if (p == null)
            {
                if (((d) (obj)).p != null)
                {
                    return false;
                }
            } else
            if (!p.equals(((d) (obj)).p))
            {
                return false;
            }
            if (q == null)
            {
                if (((d) (obj)).q != null)
                {
                    return false;
                }
            } else
            if (!q.equals(((d) (obj)).q))
            {
                return false;
            }
            if (r == null)
            {
                if (((d) (obj)).r != null)
                {
                    return false;
                }
            } else
            if (!r.equals(((d) (obj)).r))
            {
                return false;
            }
            if (s == null)
            {
                if (((d) (obj)).s != null)
                {
                    return false;
                }
            } else
            if (!s.equals(((d) (obj)).s))
            {
                return false;
            }
            if (t == null)
            {
                if (((d) (obj)).t != null)
                {
                    return false;
                }
            } else
            if (!t.equals(((d) (obj)).t))
            {
                return false;
            }
            if (u == null)
            {
                if (((d) (obj)).u != null)
                {
                    return false;
                }
            } else
            if (!u.equals(((d) (obj)).u))
            {
                return false;
            }
            if (v == null)
            {
                if (((d) (obj)).v != null)
                {
                    return false;
                }
            } else
            if (!v.equals(((d) (obj)).v))
            {
                return false;
            }
            if (w == null)
            {
                if (((d) (obj)).w != null)
                {
                    return false;
                }
            } else
            if (!w.equals(((d) (obj)).w))
            {
                return false;
            }
            if (x == null)
            {
                if (((d) (obj)).x != null)
                {
                    return false;
                }
            } else
            if (!x.equals(((d) (obj)).x))
            {
                return false;
            }
            if (y == null)
            {
                if (((d) (obj)).y != null)
                {
                    return false;
                }
            } else
            if (!y.equals(((d) (obj)).y))
            {
                return false;
            }
            if (z != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((d) (obj)).z == null) goto _L1; else goto _L3
_L3:
            return false;
            if (z.equals(((d) (obj)).z)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l6 = 0;
            int i7 = getClass().getName().hashCode();
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            int l4;
            int i5;
            int j5;
            int k5;
            int l5;
            int i6;
            int j6;
            int k6;
            int j7;
            int k7;
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.hashCode();
            }
            j7 = fc.a(b);
            k7 = fc.a(c);
            if (d == null)
            {
                j1 = 0;
            } else
            {
                j1 = d.hashCode();
            }
            if (e == null)
            {
                k1 = 0;
            } else
            {
                k1 = e.hashCode();
            }
            if (f == null)
            {
                l1 = 0;
            } else
            {
                l1 = f.hashCode();
            }
            if (g == null)
            {
                i2 = 0;
            } else
            {
                i2 = g.hashCode();
            }
            if (h == null)
            {
                j2 = 0;
            } else
            {
                j2 = h.hashCode();
            }
            if (i == null)
            {
                k2 = 0;
            } else
            {
                k2 = i.hashCode();
            }
            if (j == null)
            {
                l2 = 0;
            } else
            {
                l2 = j.hashCode();
            }
            if (k == null)
            {
                i3 = 0;
            } else
            {
                i3 = k.hashCode();
            }
            if (l == null)
            {
                j3 = 0;
            } else
            {
                j3 = l.hashCode();
            }
            if (m == null)
            {
                k3 = 0;
            } else
            {
                k3 = m.hashCode();
            }
            if (n == null)
            {
                l3 = 0;
            } else
            {
                l3 = n.hashCode();
            }
            if (o == null)
            {
                i4 = 0;
            } else
            {
                i4 = o.hashCode();
            }
            if (p == null)
            {
                j4 = 0;
            } else
            {
                j4 = p.hashCode();
            }
            if (q == null)
            {
                k4 = 0;
            } else
            {
                k4 = q.hashCode();
            }
            if (r == null)
            {
                l4 = 0;
            } else
            {
                l4 = r.hashCode();
            }
            if (s == null)
            {
                i5 = 0;
            } else
            {
                i5 = s.hashCode();
            }
            if (t == null)
            {
                j5 = 0;
            } else
            {
                j5 = t.hashCode();
            }
            if (u == null)
            {
                k5 = 0;
            } else
            {
                k5 = u.hashCode();
            }
            if (v == null)
            {
                l5 = 0;
            } else
            {
                l5 = v.hashCode();
            }
            if (w == null)
            {
                i6 = 0;
            } else
            {
                i6 = w.hashCode();
            }
            if (x == null)
            {
                j6 = 0;
            } else
            {
                j6 = x.hashCode();
            }
            if (y == null)
            {
                k6 = 0;
            } else
            {
                k6 = y.hashCode();
            }
            if (z != null)
            {
                l6 = z.hashCode();
            }
            return (k6 + (j6 + (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (((i1 + (i7 + 527) * 31) * 31 + j7) * 31 + k7) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l6;
        }

        public d()
        {
            a = null;
            b = a.a();
            c = e.a();
            d = null;
            e = null;
            f = null;
            g = null;
            h = null;
            i = null;
            j = null;
            k = null;
            l = null;
            m = null;
            n = null;
            o = null;
            p = null;
            q = null;
            r = null;
            s = null;
            t = null;
            u = null;
            v = null;
            w = null;
            x = null;
            y = null;
            z = null;
            A = -1;
        }
    }

    public static final class e extends fd
    {

        private static volatile e f[];
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Float e;

        public static e[] a()
        {
            if (f == null)
            {
                synchronized (fc.a)
                {
                    if (f == null)
                    {
                        f = new e[0];
                    }
                }
            }
            return f;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final fd a(ew ew1)
            throws IOException
        {
            do
            {
                int i = ew1.a();
                switch (i)
                {
                default:
                    if (fg.a(ew1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    a = Long.valueOf(ew1.b());
                    break;

                case 18: // '\022'
                    b = ew1.d();
                    break;

                case 26: // '\032'
                    c = ew1.d();
                    break;

                case 32: // ' '
                    d = Long.valueOf(ew1.b());
                    break;

                case 45: // '-'
                    e = Float.valueOf(Float.intBitsToFloat(ew1.f()));
                    break;
                }
            } while (true);
        }

        public final void a(zzrx zzrx1)
            throws IOException
        {
            if (a != null)
            {
                zzrx1.a(1, a.longValue());
            }
            if (b != null)
            {
                zzrx1.a(2, b);
            }
            if (c != null)
            {
                zzrx1.a(3, c);
            }
            if (d != null)
            {
                zzrx1.a(4, d.longValue());
            }
            if (e != null)
            {
                zzrx1.a(5, e.floatValue());
            }
            super.a(zzrx1);
        }

        protected final int b()
        {
            int j = super.b();
            int i = j;
            if (a != null)
            {
                i = j + zzrx.b(1, a.longValue());
            }
            j = i;
            if (b != null)
            {
                j = i + zzrx.b(2, b);
            }
            i = j;
            if (c != null)
            {
                i = j + zzrx.b(3, c);
            }
            j = i;
            if (d != null)
            {
                j = i + zzrx.b(4, d.longValue());
            }
            i = j;
            if (e != null)
            {
                e.floatValue();
                i = j + (zzrx.a(5) + 4);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof e))
            {
                return false;
            }
            obj = (e)obj;
            if (a == null)
            {
                if (((e) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((e) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((e) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((e) (obj)).b))
            {
                return false;
            }
            if (c == null)
            {
                if (((e) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((e) (obj)).c))
            {
                return false;
            }
            if (d == null)
            {
                if (((e) (obj)).d != null)
                {
                    return false;
                }
            } else
            if (!d.equals(((e) (obj)).d))
            {
                return false;
            }
            if (e != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((e) (obj)).e == null) goto _L1; else goto _L3
_L3:
            return false;
            if (e.equals(((e) (obj)).e)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int i1 = 0;
            int j1 = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            int l;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            if (b == null)
            {
                j = 0;
            } else
            {
                j = b.hashCode();
            }
            if (c == null)
            {
                k = 0;
            } else
            {
                k = c.hashCode();
            }
            if (d == null)
            {
                l = 0;
            } else
            {
                l = d.hashCode();
            }
            if (e != null)
            {
                i1 = e.hashCode();
            }
            return (l + (k + (j + (i + (j1 + 527) * 31) * 31) * 31) * 31) * 31 + i1;
        }

        public e()
        {
            a = null;
            b = null;
            c = null;
            d = null;
            e = null;
            A = -1;
        }
    }

}
