// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzrm, zzrn, zzrq

public final class zzrf
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private zzrf(byte abyte0[], int i1, int j1)
    {
        g = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = i1;
        c = i1 + j1;
        e = i1;
    }

    public static zzrf a(byte abyte0[], int i1, int j1)
    {
        return new zzrf(abyte0, i1, j1);
    }

    public static int c(int i1)
    {
        return i1 >>> 1 ^ -(i1 & 1);
    }

    private void s()
    {
        c = c + d;
        int i1 = c;
        if (i1 > g)
        {
            d = i1 - g;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    public int a()
    {
        if (p())
        {
            f = 0;
            return 0;
        }
        f = k();
        if (f == 0)
        {
            throw zzrm.d();
        } else
        {
            return f;
        }
    }

    public void a(int i1)
    {
        if (f != i1)
        {
            throw zzrm.e();
        } else
        {
            return;
        }
    }

    public void a(zzrn zzrn1)
    {
        int i1 = k();
        if (h >= i)
        {
            throw zzrm.g();
        } else
        {
            i1 = d(i1);
            h = h + 1;
            zzrn1.b(this);
            a(0);
            h = h - 1;
            e(i1);
            return;
        }
    }

    public byte[] a(int i1, int j1)
    {
        if (j1 == 0)
        {
            return zzrq.h;
        } else
        {
            byte abyte0[] = new byte[j1];
            int k1 = b;
            System.arraycopy(a, k1 + i1, abyte0, 0, j1);
            return abyte0;
        }
    }

    public void b()
    {
        int i1;
        do
        {
            i1 = a();
        } while (i1 != 0 && b(i1));
    }

    public boolean b(int i1)
    {
        switch (zzrq.a(i1))
        {
        default:
            throw zzrm.f();

        case 0: // '\0'
            f();
            return true;

        case 1: // '\001'
            n();
            return true;

        case 2: // '\002'
            h(k());
            return true;

        case 3: // '\003'
            b();
            a(zzrq.a(zzrq.b(i1), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            m();
            break;
        }
        return true;
    }

    public double c()
    {
        return Double.longBitsToDouble(n());
    }

    public float d()
    {
        return Float.intBitsToFloat(m());
    }

    public int d(int i1)
    {
        if (i1 < 0)
        {
            throw zzrm.b();
        }
        i1 = e + i1;
        int j1 = g;
        if (i1 > j1)
        {
            throw zzrm.a();
        } else
        {
            g = i1;
            s();
            return j1;
        }
    }

    public long e()
    {
        return l();
    }

    public void e(int i1)
    {
        g = i1;
        s();
    }

    public int f()
    {
        return k();
    }

    public void f(int i1)
    {
        if (i1 > e - b)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i1).append(" is beyond current ").append(e - b).toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i1).toString());
        } else
        {
            e = b + i1;
            return;
        }
    }

    public boolean g()
    {
        return k() != 0;
    }

    public byte[] g(int i1)
    {
        if (i1 < 0)
        {
            throw zzrm.b();
        }
        if (e + i1 > g)
        {
            h(g - e);
            throw zzrm.a();
        }
        if (i1 <= c - e)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = e + i1;
            return abyte0;
        } else
        {
            throw zzrm.a();
        }
    }

    public String h()
    {
        int i1 = k();
        if (i1 <= c - e && i1 > 0)
        {
            String s1 = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s1;
        } else
        {
            return new String(g(i1), "UTF-8");
        }
    }

    public void h(int i1)
    {
        if (i1 < 0)
        {
            throw zzrm.b();
        }
        if (e + i1 > g)
        {
            h(g - e);
            throw zzrm.a();
        }
        if (i1 <= c - e)
        {
            e = e + i1;
            return;
        } else
        {
            throw zzrm.a();
        }
    }

    public byte[] i()
    {
        int i1 = k();
        if (i1 <= c - e && i1 > 0)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = i1 + e;
            return abyte0;
        } else
        {
            return g(i1);
        }
    }

    public int j()
    {
        return c(k());
    }

    public int k()
    {
        int i1 = r();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = r();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = r();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = r();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = r();
        k1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        i1 = k1;
        if (byte0 < 0)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= 5)
                    {
                        break label1;
                    }
                    i1 = k1;
                    if (r() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw zzrm.c();
    }

    public long l()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = r();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw zzrm.c();
    }

    public int m()
    {
        return r() & 0xff | (r() & 0xff) << 8 | (r() & 0xff) << 16 | (r() & 0xff) << 24;
    }

    public long n()
    {
        int i1 = r();
        int j1 = r();
        int k1 = r();
        int l1 = r();
        int i2 = r();
        int j2 = r();
        int k2 = r();
        int l2 = r();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    public int o()
    {
        if (g == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = e;
            return g - i1;
        }
    }

    public boolean p()
    {
        return e == c;
    }

    public int q()
    {
        return e - b;
    }

    public byte r()
    {
        if (e == c)
        {
            throw zzrm.a();
        } else
        {
            byte abyte0[] = a;
            int i1 = e;
            e = i1 + 1;
            return abyte0[i1];
        }
    }
}
