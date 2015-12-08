// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzsd, fd, fg

public final class ew
{

    final byte a[];
    int b;
    int c;
    int d;
    int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private ew(byte abyte0[], int k)
    {
        e = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = 0;
        c = k + 0;
        d = 0;
    }

    public static ew a(byte abyte0[], int k)
    {
        return new ew(abyte0, k);
    }

    private void g(int k)
        throws IOException
    {
        if (k < 0)
        {
            throw zzsd.b();
        }
        if (d + k > e)
        {
            g(e - d);
            throw zzsd.a();
        }
        if (k <= c - d)
        {
            d = d + k;
            return;
        } else
        {
            throw zzsd.a();
        }
    }

    private void i()
    {
        c = c + f;
        int k = c;
        if (k > e)
        {
            f = k - e;
            c = c - f;
            return;
        } else
        {
            f = 0;
            return;
        }
    }

    private byte j()
        throws IOException
    {
        if (d == c)
        {
            throw zzsd.a();
        } else
        {
            byte abyte0[] = a;
            int k = d;
            d = k + 1;
            return abyte0[k];
        }
    }

    public final int a()
        throws IOException
    {
        boolean flag;
        if (d == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            g = 0;
            return 0;
        }
        g = e();
        if (g == 0)
        {
            throw zzsd.d();
        } else
        {
            return g;
        }
    }

    public final void a(int k)
        throws zzsd
    {
        if (g != k)
        {
            throw zzsd.e();
        } else
        {
            return;
        }
    }

    public final void a(fd fd1)
        throws IOException
    {
        int k = e();
        if (h >= i)
        {
            throw zzsd.g();
        } else
        {
            k = c(k);
            h = h + 1;
            fd1.a(this);
            a(0);
            h = h - 1;
            d(k);
            return;
        }
    }

    public final long b()
        throws IOException
    {
        int k = 0;
        long l = 0L;
        for (; k < 64; k += 7)
        {
            byte byte0 = j();
            l |= (long)(byte0 & 0x7f) << k;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw zzsd.c();
    }

    public final boolean b(int k)
        throws IOException
    {
        switch (fg.a(k))
        {
        default:
            throw zzsd.f();

        case 0: // '\0'
            e();
            return true;

        case 1: // '\001'
            g();
            return true;

        case 2: // '\002'
            g(e());
            return true;

        case 3: // '\003'
            int l;
            do
            {
                l = a();
            } while (l != 0 && b(l));
            a(fg.a(fg.b(k), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            f();
            return true;
        }
    }

    public final int c(int k)
        throws zzsd
    {
        if (k < 0)
        {
            throw zzsd.b();
        }
        k = d + k;
        int l = e;
        if (k > l)
        {
            throw zzsd.a();
        } else
        {
            e = k;
            i();
            return l;
        }
    }

    public final boolean c()
        throws IOException
    {
        return e() != 0;
    }

    public final String d()
        throws IOException
    {
        int k = e();
        if (k <= c - d && k > 0)
        {
            String s = new String(a, d, k, "UTF-8");
            d = k + d;
            return s;
        } else
        {
            return new String(f(k), "UTF-8");
        }
    }

    public final void d(int k)
    {
        e = k;
        i();
    }

    public final int e()
        throws IOException
    {
        int k = j();
        if (k < 0) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        k &= 0x7f;
        byte byte0 = j();
        if (byte0 >= 0)
        {
            return k | byte0 << 7;
        }
        k |= (byte0 & 0x7f) << 7;
        byte0 = j();
        if (byte0 >= 0)
        {
            return k | byte0 << 14;
        }
        k |= (byte0 & 0x7f) << 14;
        int i1 = j();
        if (i1 >= 0)
        {
            return k | i1 << 21;
        }
        byte0 = j();
        i1 = k | (i1 & 0x7f) << 21 | byte0 << 28;
        k = i1;
        if (byte0 < 0)
        {
            int l = 0;
label0:
            do
            {
label1:
                {
                    if (l >= 5)
                    {
                        break label1;
                    }
                    k = i1;
                    if (j() >= 0)
                    {
                        break label0;
                    }
                    l++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw zzsd.c();
    }

    public final void e(int k)
    {
        if (k > d - b)
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(k).append(" is beyond current ").append(d - b).toString());
        }
        if (k < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad position ")).append(k).toString());
        } else
        {
            d = b + k;
            return;
        }
    }

    public final int f()
        throws IOException
    {
        return j() & 0xff | (j() & 0xff) << 8 | (j() & 0xff) << 16 | (j() & 0xff) << 24;
    }

    public final byte[] f(int k)
        throws IOException
    {
        if (k < 0)
        {
            throw zzsd.b();
        }
        if (d + k > e)
        {
            g(e - d);
            throw zzsd.a();
        }
        if (k <= c - d)
        {
            byte abyte0[] = new byte[k];
            System.arraycopy(a, d, abyte0, 0, k);
            d = d + k;
            return abyte0;
        } else
        {
            throw zzsd.a();
        }
    }

    public final long g()
        throws IOException
    {
        int k = j();
        int l = j();
        int i1 = j();
        int j1 = j();
        int k1 = j();
        int l1 = j();
        int i2 = j();
        int j2 = j();
        long l2 = k;
        return ((long)l & 255L) << 8 | l2 & 255L | ((long)i1 & 255L) << 16 | ((long)j1 & 255L) << 24 | ((long)k1 & 255L) << 32 | ((long)l1 & 255L) << 40 | ((long)i2 & 255L) << 48 | ((long)j2 & 255L) << 56;
    }

    public final int h()
    {
        return d - b;
    }
}
