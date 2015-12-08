// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            fd, ep, fc, zzrx, 
//            ew, fg

public static final class A extends fd
{

    private static volatile z B[];
    public Integer a;
    public z b[];
    public z c[];
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

    public static A[] a()
    {
        if (B == null)
        {
            synchronized (fc.a)
            {
                if (B == null)
                {
                    B = new B[0];
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
                b b1 = b[i1];
                if (b1 != null)
                {
                    zzrx1.a(2, b1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < c.length; j1++)
            {
                b b2 = c[j1];
                if (b2 != null)
                {
                    zzrx1.a(3, b2);
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
                    z z1 = b[j1];
                    int k1 = i1;
                    if (z1 != null)
                    {
                        k1 = i1 + zzrx.b(2, z1);
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
                    z z2 = c[l1];
                    j1 = i1;
                    if (z2 != null)
                    {
                        j1 = i1 + zzrx.b(3, z2);
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

    public final a b(ew ew1)
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
                aa = new b[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, aa, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aa.length - 1; l1++)
                {
                    aa[l1] = new <init>();
                    ew1.a(aa[l1]);
                    ew1.a();
                }

                aa[l1] = new <init>();
                ew1.a(aa[l1]);
                b = aa;
                break;

            case 26: // '\032'
                int i2 = fg.b(ew1, 26);
                a aa1[];
                int k1;
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                aa1 = new c[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, aa1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < aa1.length - 1; i2++)
                {
                    aa1[i2] = new <init>();
                    ew1.a(aa1[i2]);
                    ew1.a();
                }

                aa1[i2] = new <init>();
                ew1.a(aa1[i2]);
                c = aa1;
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
        if (!(obj instanceof z))
        {
            return false;
        }
        obj = (z)obj;
        if (a == null)
        {
            if (((a) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
        if (!fc.a(b, ((b) (obj)).b))
        {
            return false;
        }
        if (!fc.a(c, ((c) (obj)).c))
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
            if (((e) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((e) (obj)).e))
        {
            return false;
        }
        if (f == null)
        {
            if (((f) (obj)).f != null)
            {
                return false;
            }
        } else
        if (!f.equals(((f) (obj)).f))
        {
            return false;
        }
        if (g == null)
        {
            if (((g) (obj)).g != null)
            {
                return false;
            }
        } else
        if (!g.equals(((g) (obj)).g))
        {
            return false;
        }
        if (h == null)
        {
            if (((h) (obj)).h != null)
            {
                return false;
            }
        } else
        if (!h.equals(((h) (obj)).h))
        {
            return false;
        }
        if (i == null)
        {
            if (((i) (obj)).i != null)
            {
                return false;
            }
        } else
        if (!i.equals(((i) (obj)).i))
        {
            return false;
        }
        if (j == null)
        {
            if (((j) (obj)).j != null)
            {
                return false;
            }
        } else
        if (!j.equals(((j) (obj)).j))
        {
            return false;
        }
        if (k == null)
        {
            if (((k) (obj)).k != null)
            {
                return false;
            }
        } else
        if (!k.equals(((k) (obj)).k))
        {
            return false;
        }
        if (l == null)
        {
            if (((l) (obj)).l != null)
            {
                return false;
            }
        } else
        if (!l.equals(((l) (obj)).l))
        {
            return false;
        }
        if (m == null)
        {
            if (((m) (obj)).m != null)
            {
                return false;
            }
        } else
        if (!m.equals(((m) (obj)).m))
        {
            return false;
        }
        if (n == null)
        {
            if (((n) (obj)).n != null)
            {
                return false;
            }
        } else
        if (!n.equals(((n) (obj)).n))
        {
            return false;
        }
        if (o == null)
        {
            if (((o) (obj)).o != null)
            {
                return false;
            }
        } else
        if (!o.equals(((o) (obj)).o))
        {
            return false;
        }
        if (p == null)
        {
            if (((p) (obj)).p != null)
            {
                return false;
            }
        } else
        if (!p.equals(((p) (obj)).p))
        {
            return false;
        }
        if (q == null)
        {
            if (((q) (obj)).q != null)
            {
                return false;
            }
        } else
        if (!q.equals(((q) (obj)).q))
        {
            return false;
        }
        if (r == null)
        {
            if (((r) (obj)).r != null)
            {
                return false;
            }
        } else
        if (!r.equals(((r) (obj)).r))
        {
            return false;
        }
        if (s == null)
        {
            if (((s) (obj)).s != null)
            {
                return false;
            }
        } else
        if (!s.equals(((s) (obj)).s))
        {
            return false;
        }
        if (t == null)
        {
            if (((t) (obj)).t != null)
            {
                return false;
            }
        } else
        if (!t.equals(((t) (obj)).t))
        {
            return false;
        }
        if (u == null)
        {
            if (((u) (obj)).u != null)
            {
                return false;
            }
        } else
        if (!u.equals(((u) (obj)).u))
        {
            return false;
        }
        if (v == null)
        {
            if (((v) (obj)).v != null)
            {
                return false;
            }
        } else
        if (!v.equals(((v) (obj)).v))
        {
            return false;
        }
        if (w == null)
        {
            if (((w) (obj)).w != null)
            {
                return false;
            }
        } else
        if (!w.equals(((w) (obj)).w))
        {
            return false;
        }
        if (x == null)
        {
            if (((x) (obj)).x != null)
            {
                return false;
            }
        } else
        if (!x.equals(((x) (obj)).x))
        {
            return false;
        }
        if (y == null)
        {
            if (((y) (obj)).y != null)
            {
                return false;
            }
        } else
        if (!y.equals(((y) (obj)).y))
        {
            return false;
        }
        if (z != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((z) (obj)).z == null) goto _L1; else goto _L3
_L3:
        return false;
        if (z.equals(((z) (obj)).z)) goto _L1; else goto _L4
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

    public ()
    {
        a = null;
        b = a();
        c = a();
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
