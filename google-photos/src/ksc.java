// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ksc extends krs
{

    public long c;
    public long d;
    public int e;
    public byte f[];
    public long g;
    public byte h[];
    private String i;
    private int j;
    private boolean k;
    private ksd l[];
    private ksa m;
    private byte n[];
    private byte o[];
    private krz p;
    private String q;
    private ksb r;
    private int s;
    private int t[];

    public ksc()
    {
        c = 0L;
        d = 0L;
        i = "";
        e = 0;
        j = 0;
        k = false;
        l = ksd.f();
        m = null;
        f = kry.e;
        n = kry.e;
        o = kry.e;
        p = null;
        q = "";
        g = 0x2bf20L;
        r = null;
        h = kry.e;
        s = 0;
        t = kry.a;
        a = null;
        b = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j1 = i1;
        if (c != 0L)
        {
            j1 = i1 + krr.b(1, c);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + krr.b(2, i);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    ksd ksd1 = l[j1];
                    int k1 = i1;
                    if (ksd1 != null)
                    {
                        k1 = i1 + krr.b(3, ksd1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (!Arrays.equals(f, kry.e))
        {
            i1 = j1 + krr.b(6, f);
        }
        j1 = i1;
        if (!Arrays.equals(n, kry.e))
        {
            j1 = i1 + krr.b(8, n);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + krr.b(11, e);
        }
        j1 = i1;
        if (!Arrays.equals(o, kry.e))
        {
            j1 = i1 + krr.b(13, o);
        }
        i1 = j1;
        if (!q.equals(""))
        {
            i1 = j1 + krr.b(14, q);
        }
        j1 = i1;
        if (g != 0x2bf20L)
        {
            long l2 = g;
            j1 = krr.b(15);
            j1 = i1 + (krr.b(krr.c(l2)) + j1);
        }
        int l1 = j1;
        if (d != 0L)
        {
            l1 = j1 + krr.b(17, d);
        }
        i1 = l1;
        if (!Arrays.equals(h, kry.e))
        {
            i1 = l1 + krr.b(18, h);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
                {
                    i2 += krr.a(t[j1]);
                }

                j1 = i1 + i2 + t.length * 2;
            }
        }
        return j1;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        if (c != 0L)
        {
            krr1.a(1, c);
        }
        if (!i.equals(""))
        {
            krr1.a(2, i);
        }
        if (l != null && l.length > 0)
        {
            for (int i1 = 0; i1 < l.length; i1++)
            {
                ksd ksd1 = l[i1];
                if (ksd1 != null)
                {
                    krr1.a(3, ksd1);
                }
            }

        }
        if (!Arrays.equals(f, kry.e))
        {
            krr1.a(6, f);
        }
        if (!Arrays.equals(n, kry.e))
        {
            krr1.a(8, n);
        }
        if (e != 0)
        {
            krr1.a(11, e);
        }
        if (!Arrays.equals(o, kry.e))
        {
            krr1.a(13, o);
        }
        if (!q.equals(""))
        {
            krr1.a(14, q);
        }
        if (g != 0x2bf20L)
        {
            long l1 = g;
            krr1.c(15, 0);
            krr1.a(krr.c(l1));
        }
        if (d != 0L)
        {
            krr1.a(17, d);
        }
        if (!Arrays.equals(h, kry.e))
        {
            krr1.a(18, h);
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                krr1.a(20, t[j1]);
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
        if (!(obj instanceof ksc)) goto _L4; else goto _L3
_L3:
        obj = (ksc)obj;
        flag = flag1;
        if (c != ((ksc) (obj)).c) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (d != ((ksc) (obj)).d) goto _L4; else goto _L6
_L6:
        if (i != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((ksc) (obj)).i != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (e != ((ksc) (obj)).e) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!krv.a(l, ((ksc) (obj)).l)) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (!Arrays.equals(f, ((ksc) (obj)).f)) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!Arrays.equals(n, ((ksc) (obj)).n)) goto _L4; else goto _L13
_L13:
        flag = flag1;
        if (!Arrays.equals(o, ((ksc) (obj)).o)) goto _L4; else goto _L14
_L14:
        if (q != null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        flag = flag1;
        if (((ksc) (obj)).q != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (g == ((ksc) (obj)).g)
        {
            flag = flag1;
            if (Arrays.equals(h, ((ksc) (obj)).h))
            {
                flag = flag1;
                if (krv.a(t, ((ksc) (obj)).t))
                {
                    return a(((krs) (obj)));
                }
            }
        }
          goto _L4
_L8:
        if (!i.equals(((ksc) (obj)).i))
        {
            return false;
        }
          goto _L9
        if (!q.equals(((ksc) (obj)).q))
        {
            return false;
        }
          goto _L15
    }

    public final int hashCode()
    {
        int j1 = 0;
        int k1 = (int)(c ^ c >>> 32);
        int l1 = (int)(d ^ d >>> 32);
        int i1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (i == null)
        {
            i1 = 0;
        } else
        {
            i1 = i.hashCode();
        }
        i2 = e;
        j2 = krv.a(l);
        k2 = Arrays.hashCode(f);
        l2 = Arrays.hashCode(n);
        i3 = Arrays.hashCode(o);
        if (q != null)
        {
            j1 = q.hashCode();
        }
        return (((((((((((i1 + ((k1 + 527) * 31 + l1) * 31) * 31 + i2) * 31 * 31 + 1237) * 31 + j2) * 31 * 31 + k2) * 31 + l2) * 31 + i3) * 31 * 31 + j1) * 31 + (int)(g ^ g >>> 32)) * 31 * 31 + Arrays.hashCode(h)) * 31 * 31 + krv.a(t)) * 31 + b();
    }
}
