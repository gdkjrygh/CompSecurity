// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class ksl extends krs
{

    private String c[];
    private String d[];
    private ksp e[];
    private ksk f[];
    private ksh g[];
    private ksh h[];
    private ksh i[];
    private ksm j[];
    private String k;
    private String l;
    private String m;
    private String n;
    private ksg o;
    private float p;
    private boolean q;
    private String r[];
    private int s;

    public ksl()
    {
        c = kry.c;
        d = kry.c;
        e = ksp.f();
        f = ksk.f();
        g = ksh.f();
        h = ksh.f();
        i = ksh.f();
        j = ksm.f();
        k = "";
        l = "";
        m = "0";
        n = "";
        o = null;
        p = 0.0F;
        q = false;
        r = kry.c;
        s = 0;
        a = null;
        b = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int k5 = super.a();
        int j1;
        int k1;
        if (d != null && d.length > 0)
        {
            int i1 = 0;
            k1 = 0;
            int l1;
            int i4;
            for (l1 = 0; i1 < d.length; l1 = i4)
            {
                String s1 = d[i1];
                int l4 = k1;
                i4 = l1;
                if (s1 != null)
                {
                    i4 = l1 + 1;
                    l4 = k1 + krr.a(s1);
                }
                i1++;
                k1 = l4;
            }

            k1 = k5 + k1 + l1 * 1;
        } else
        {
            k1 = k5;
        }
        j1 = k1;
        if (e != null)
        {
            j1 = k1;
            if (e.length > 0)
            {
                j1 = k1;
                for (k1 = 0; k1 < e.length;)
                {
                    ksp ksp1 = e[k1];
                    int i2 = j1;
                    if (ksp1 != null)
                    {
                        i2 = j1 + krr.b(2, ksp1);
                    }
                    k1++;
                    j1 = i2;
                }

            }
        }
        k1 = j1;
        if (f != null)
        {
            k1 = j1;
            if (f.length > 0)
            {
                for (k1 = 0; k1 < f.length;)
                {
                    ksk ksk1 = f[k1];
                    int j2 = j1;
                    if (ksk1 != null)
                    {
                        j2 = j1 + krr.b(3, ksk1);
                    }
                    k1++;
                    j1 = j2;
                }

                k1 = j1;
            }
        }
        j1 = k1;
        if (g != null)
        {
            j1 = k1;
            if (g.length > 0)
            {
                j1 = k1;
                for (k1 = 0; k1 < g.length;)
                {
                    ksh ksh1 = g[k1];
                    int k2 = j1;
                    if (ksh1 != null)
                    {
                        k2 = j1 + krr.b(4, ksh1);
                    }
                    k1++;
                    j1 = k2;
                }

            }
        }
        k1 = j1;
        if (h != null)
        {
            k1 = j1;
            if (h.length > 0)
            {
                for (k1 = 0; k1 < h.length;)
                {
                    ksh ksh2 = h[k1];
                    int l2 = j1;
                    if (ksh2 != null)
                    {
                        l2 = j1 + krr.b(5, ksh2);
                    }
                    k1++;
                    j1 = l2;
                }

                k1 = j1;
            }
        }
        j1 = k1;
        if (i != null)
        {
            j1 = k1;
            if (i.length > 0)
            {
                j1 = k1;
                for (k1 = 0; k1 < i.length;)
                {
                    ksh ksh3 = i[k1];
                    int i3 = j1;
                    if (ksh3 != null)
                    {
                        i3 = j1 + krr.b(6, ksh3);
                    }
                    k1++;
                    j1 = i3;
                }

            }
        }
        k1 = j1;
        if (j != null)
        {
            k1 = j1;
            if (j.length > 0)
            {
                for (k1 = 0; k1 < j.length;)
                {
                    ksm ksm1 = j[k1];
                    int j3 = j1;
                    if (ksm1 != null)
                    {
                        j3 = j1 + krr.b(7, ksm1);
                    }
                    k1++;
                    j1 = j3;
                }

                k1 = j1;
            }
        }
        j1 = k1;
        if (!k.equals(""))
        {
            j1 = k1 + krr.b(9, k);
        }
        k1 = j1;
        if (!l.equals(""))
        {
            k1 = j1 + krr.b(10, l);
        }
        j1 = k1;
        if (!m.equals("0"))
        {
            j1 = k1 + krr.b(12, m);
        }
        k1 = j1;
        if (!n.equals(""))
        {
            k1 = j1 + krr.b(13, n);
        }
        j1 = k1;
        if (Float.floatToIntBits(0.0F) != Float.floatToIntBits(0.0F))
        {
            j1 = k1 + (krr.b(15) + 4);
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1;
            if (r.length > 0)
            {
                k1 = 0;
                int k3 = 0;
                int j4;
                int i5;
                for (j4 = 0; k1 < r.length; j4 = i5)
                {
                    String s2 = r[k1];
                    k5 = k3;
                    i5 = j4;
                    if (s2 != null)
                    {
                        i5 = j4 + 1;
                        k5 = k3 + krr.a(s2);
                    }
                    k1++;
                    k3 = k5;
                }

                k1 = j1 + k3 + j4 * 2;
            }
        }
        j1 = k1;
        if (c != null)
        {
            j1 = k1;
            if (c.length > 0)
            {
                int l3 = 0;
                int k4 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < c.length;)
                {
                    String s3 = c[j1];
                    k5 = l3;
                    int j5 = k4;
                    if (s3 != null)
                    {
                        j5 = k4 + 1;
                        k5 = l3 + krr.a(s3);
                    }
                    j1++;
                    l3 = k5;
                    k4 = j5;
                }

                j1 = k1 + l3 + k4 * 2;
            }
        }
        return j1;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s1 = d[i1];
                if (s1 != null)
                {
                    krr1.a(1, s1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                ksp ksp1 = e[j1];
                if (ksp1 != null)
                {
                    krr1.a(2, ksp1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                ksk ksk1 = f[k1];
                if (ksk1 != null)
                {
                    krr1.a(3, ksk1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l1 = 0; l1 < g.length; l1++)
            {
                ksh ksh1 = g[l1];
                if (ksh1 != null)
                {
                    krr1.a(4, ksh1);
                }
            }

        }
        if (h != null && h.length > 0)
        {
            for (int i2 = 0; i2 < h.length; i2++)
            {
                ksh ksh2 = h[i2];
                if (ksh2 != null)
                {
                    krr1.a(5, ksh2);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int j2 = 0; j2 < i.length; j2++)
            {
                ksh ksh3 = i[j2];
                if (ksh3 != null)
                {
                    krr1.a(6, ksh3);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k2 = 0; k2 < j.length; k2++)
            {
                ksm ksm1 = j[k2];
                if (ksm1 != null)
                {
                    krr1.a(7, ksm1);
                }
            }

        }
        if (!k.equals(""))
        {
            krr1.a(9, k);
        }
        if (!l.equals(""))
        {
            krr1.a(10, l);
        }
        if (!m.equals("0"))
        {
            krr1.a(12, m);
        }
        if (!n.equals(""))
        {
            krr1.a(13, n);
        }
        if (Float.floatToIntBits(0.0F) != Float.floatToIntBits(0.0F))
        {
            krr1.c(15, 5);
            int l2 = Float.floatToIntBits(0.0F);
            byte byte0 = (byte)(l2 & 0xff);
            if (!krr1.a.hasRemaining())
            {
                throw new avz(krr1.a.position(), krr1.a.limit());
            }
            krr1.a.put(byte0);
            byte0 = (byte)(l2 >> 8 & 0xff);
            if (!krr1.a.hasRemaining())
            {
                throw new avz(krr1.a.position(), krr1.a.limit());
            }
            krr1.a.put(byte0);
            byte0 = (byte)(l2 >> 16 & 0xff);
            if (!krr1.a.hasRemaining())
            {
                throw new avz(krr1.a.position(), krr1.a.limit());
            }
            krr1.a.put(byte0);
            byte0 = (byte)(l2 >>> 24);
            if (!krr1.a.hasRemaining())
            {
                throw new avz(krr1.a.position(), krr1.a.limit());
            }
            krr1.a.put(byte0);
        }
        if (r != null && r.length > 0)
        {
            for (int i3 = 0; i3 < r.length; i3++)
            {
                String s2 = r[i3];
                if (s2 != null)
                {
                    krr1.a(16, s2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j3 = ((flag) ? 1 : 0); j3 < c.length; j3++)
            {
                String s3 = c[j3];
                if (s3 != null)
                {
                    krr1.a(19, s3);
                }
            }

        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof ksl)) goto _L4; else goto _L3
_L3:
        obj = (ksl)obj;
        flag = flag1;
        if (!krv.a(c, ((ksl) (obj)).c)) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (!krv.a(d, ((ksl) (obj)).d)) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (!krv.a(e, ((ksl) (obj)).e)) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!krv.a(f, ((ksl) (obj)).f)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!krv.a(g, ((ksl) (obj)).g)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!krv.a(h, ((ksl) (obj)).h)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!krv.a(i, ((ksl) (obj)).i)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!krv.a(j, ((ksl) (obj)).j)) goto _L4; else goto _L12
_L12:
        if (k != null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        if (((ksl) (obj)).k != null) goto _L4; else goto _L15
_L15:
        if (l != null) goto _L17; else goto _L16
_L16:
        flag = flag1;
        if (((ksl) (obj)).l != null) goto _L4; else goto _L18
_L18:
        if (m != null) goto _L20; else goto _L19
_L19:
        flag = flag1;
        if (((ksl) (obj)).m != null) goto _L4; else goto _L21
_L21:
        if (n != null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        flag = flag1;
        if (((ksl) (obj)).n != null) goto _L4; else goto _L22
_L22:
        flag = flag1;
        if (Float.floatToIntBits(0.0F) == Float.floatToIntBits(0.0F))
        {
            flag = flag1;
            if (krv.a(r, ((ksl) (obj)).r))
            {
                return a(((krs) (obj)));
            }
        }
          goto _L4
_L14:
        if (!k.equals(((ksl) (obj)).k))
        {
            return false;
        }
          goto _L15
_L17:
        if (!l.equals(((ksl) (obj)).l))
        {
            return false;
        }
          goto _L18
_L20:
        if (!m.equals(((ksl) (obj)).m))
        {
            return false;
        }
          goto _L21
        if (!n.equals(((ksl) (obj)).n))
        {
            return false;
        }
          goto _L22
    }

    public final int hashCode()
    {
        int l1 = 0;
        int i2 = krv.a(c);
        int j2 = krv.a(d);
        int k2 = krv.a(e);
        int l2 = krv.a(f);
        int i3 = krv.a(g);
        int j3 = krv.a(h);
        int k3 = krv.a(i);
        int l3 = krv.a(j);
        int i1;
        int j1;
        int k1;
        if (k == null)
        {
            i1 = 0;
        } else
        {
            i1 = k.hashCode();
        }
        if (l == null)
        {
            j1 = 0;
        } else
        {
            j1 = l.hashCode();
        }
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.hashCode();
        }
        if (n != null)
        {
            l1 = n.hashCode();
        }
        return (((((k1 + (j1 + (i1 + ((((((((i2 + 527) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31) * 31) * 31) * 31 + l1) * 31 * 31 + Float.floatToIntBits(0.0F)) * 31 + 1237) * 31 + krv.a(r)) * 31 * 31 + b();
    }
}
