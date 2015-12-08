// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.c.b:
//            ba, av, au, cd, 
//            bk, be, cc, e, 
//            f, aq

public final class g
{
    private static interface a
    {
    }


    private final byte a[];
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private a n;

    private g(ba ba1)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = ba1.c;
        e = ba1.b();
        c = e + ba1.a();
        i = -e;
        f = null;
        b = true;
    }

    private g(InputStream inputstream)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = new byte[4096];
        c = 0;
        e = 0;
        i = 0;
        f = inputstream;
        b = false;
    }

    private g(byte abyte0[], int i1)
    {
        h = false;
        j = 0x7fffffff;
        l = 100;
        m = 0x4000000;
        n = null;
        a = abyte0;
        c = i1 + 0;
        e = 0;
        i = 0;
        f = null;
        b = false;
    }

    static g a(ba ba1)
    {
        g g1 = new g(ba1);
        try
        {
            g1.c(ba1.a());
        }
        // Misplaced declaration of an exception variable
        catch (ba ba1)
        {
            throw new IllegalArgumentException(ba1);
        }
        return g1;
    }

    public static g a(InputStream inputstream)
    {
        return new g(inputstream);
    }

    public static g a(byte abyte0[], int i1)
    {
        abyte0 = new g(abyte0, i1);
        try
        {
            abyte0.c(i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0);
        }
        return abyte0;
    }

    private void e(int i1)
    {
        if (!f(i1))
        {
            throw av.b();
        } else
        {
            return;
        }
    }

    private boolean f(int i1)
    {
_L2:
        if (e + i1 <= c)
        {
            throw new IllegalStateException((new StringBuilder("refillBuffer() called when ")).append(i1).append(" bytes were already available in buffer").toString());
        }
        break MISSING_BLOCK_LABEL_42;
        int j1;
        while (j1 <= 0) 
        {
            do
            {
                return false;
            } while (i + e + i1 > j || f == null);
            j1 = e;
            if (j1 > 0)
            {
                if (c > j1)
                {
                    System.arraycopy(a, j1, a, 0, c - j1);
                }
                i = i + j1;
                c = c - j1;
                e = 0;
            }
            j1 = f.read(a, c, a.length - c);
            if (j1 == 0 || j1 < -1 || j1 > a.length)
            {
                throw new IllegalStateException((new StringBuilder("InputStream#read(byte[]) returned invalid result: ")).append(j1).append("\nThe InputStream implementation is buggy.").toString());
            }
        }
        c = j1 + c;
        if ((i + i1) - m > 0)
        {
            throw av.i();
        }
        y();
        if (c >= i1)
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private byte[] g(int i1)
    {
        if (i1 <= 0)
        {
            if (i1 == 0)
            {
                return au.c;
            } else
            {
                throw av.c();
            }
        }
        if (i + e + i1 > j)
        {
            h(j - i - e);
            throw av.b();
        }
        if (i1 < 4096)
        {
            byte abyte0[] = new byte[i1];
            int j1 = c - e;
            System.arraycopy(a, e, abyte0, 0, j1);
            e = c;
            int l1 = i1 - j1;
            if (c - e < l1)
            {
                e(l1);
            }
            System.arraycopy(a, 0, abyte0, j1, i1 - j1);
            e = i1 - j1;
            return abyte0;
        }
        int l2 = e;
        int i3 = c;
        i = i + c;
        e = 0;
        c = 0;
        Object obj = new ArrayList();
        int j2;
        for (int k1 = i1 - (i3 - l2); k1 > 0; k1 -= j2)
        {
            byte abyte1[] = new byte[Math.min(k1, 4096)];
            int k2;
            for (int i2 = 0; i2 < abyte1.length; i2 += k2)
            {
                if (f == null)
                {
                    k2 = -1;
                } else
                {
                    k2 = f.read(abyte1, i2, abyte1.length - i2);
                }
                if (k2 == -1)
                {
                    throw av.b();
                }
                i = i + k2;
            }

            j2 = abyte1.length;
            ((List) (obj)).add(abyte1);
        }

        byte abyte2[] = new byte[i1];
        i1 = i3 - l2;
        System.arraycopy(a, l2, abyte2, 0, i1);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            byte abyte3[] = (byte[])((Iterator) (obj)).next();
            System.arraycopy(abyte3, 0, abyte2, i1, abyte3.length);
            i1 = abyte3.length + i1;
        }

        return abyte2;
    }

    private void h(int i1)
    {
        if (i1 <= c - e && i1 >= 0)
        {
            e = e + i1;
            return;
        }
        if (i1 < 0)
        {
            throw av.c();
        }
        if (i + e + i1 > j)
        {
            h(j - i - e);
            throw av.b();
        }
        int j1 = c - e;
        e = c;
        e(1);
        while (i1 - j1 > c) 
        {
            j1 += c;
            e = c;
            e(1);
        }
        e = i1 - j1;
    }

    private long u()
    {
        int i1 = e;
        if (c == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = a;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            e = j1;
            return (long)k1;
        }
        if (c - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        long l1 = k1 ^ 0xffffff80;
_L9:
        e = i1;
        return l1;
_L5:
        j1 = i1 + 1;
        k1 ^= abyte0[i1] << 14;
        if (k1 >= 0)
        {
            l1 = k1 ^ 0x3f80;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        j1 = k1 ^ abyte0[j1] << 21;
        if (j1 < 0)
        {
            l1 = j1 ^ 0xffe03f80;
            continue; /* Loop/switch isn't completed */
        }
        l1 = j1;
        j1 = i1 + 1;
        l1 ^= (long)abyte0[i1] << 28;
        if (l1 >= 0L)
        {
            l1 ^= 0xfe03f80L;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        l1 ^= (long)abyte0[j1] << 35;
        if (l1 < 0L)
        {
            l1 ^= 0xfffffff80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i1 + 1;
        l1 ^= (long)abyte0[i1] << 42;
        if (l1 >= 0L)
        {
            l1 ^= 0x3f80fe03f80L;
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        l1 ^= (long)abyte0[j1] << 49;
        if (l1 < 0L)
        {
            l1 ^= 0xfffe03f80fe03f80L;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i1 + 1;
        l1 = l1 ^ (long)abyte0[i1] << 56 ^ 0xfe03f80fe03f80L;
        if (l1 >= 0L) goto _L7; else goto _L6
_L6:
        i1 = j1 + 1;
        if ((long)abyte0[j1] >= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return v();
_L7:
        i1 = j1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private long v()
    {
        long l1 = 0L;
        for (int i1 = 0; i1 < 64; i1 += 7)
        {
            byte byte0 = z();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw av.d();
    }

    private int w()
    {
        int j1 = e;
        int i1 = j1;
        if (c - j1 < 4)
        {
            e(4);
            i1 = e;
        }
        byte abyte0[] = a;
        e = i1 + 4;
        j1 = abyte0[i1];
        byte byte0 = abyte0[i1 + 1];
        byte byte1 = abyte0[i1 + 2];
        return (abyte0[i1 + 3] & 0xff) << 24 | (j1 & 0xff | (byte0 & 0xff) << 8 | (byte1 & 0xff) << 16);
    }

    private long x()
    {
        int j1 = e;
        int i1 = j1;
        if (c - j1 < 8)
        {
            e(8);
            i1 = e;
        }
        byte abyte0[] = a;
        e = i1 + 8;
        long l1 = abyte0[i1];
        long l2 = abyte0[i1 + 1];
        long l3 = abyte0[i1 + 2];
        long l4 = abyte0[i1 + 3];
        long l5 = abyte0[i1 + 4];
        long l6 = abyte0[i1 + 5];
        long l7 = abyte0[i1 + 6];
        return ((long)abyte0[i1 + 7] & 255L) << 56 | (l1 & 255L | (l2 & 255L) << 8 | (l3 & 255L) << 16 | (l4 & 255L) << 24 | (l5 & 255L) << 32 | (l6 & 255L) << 40 | (l7 & 255L) << 48);
    }

    private void y()
    {
        c = c + d;
        int i1 = i + c;
        if (i1 > j)
        {
            d = i1 - j;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    private byte z()
    {
        if (e == c)
        {
            e(1);
        }
        byte abyte0[] = a;
        int i1 = e;
        e = i1 + 1;
        return abyte0[i1];
    }

    public final int a()
    {
        boolean flag = true;
        if (e != c || f(1))
        {
            flag = false;
        }
        if (flag)
        {
            g = 0;
            return 0;
        }
        g = s();
        if (cd.b(g) == 0)
        {
            throw av.e();
        } else
        {
            return g;
        }
    }

    public final be a(bk bk1, aq aq)
    {
        int i1 = s();
        if (k >= l)
        {
            throw av.h();
        } else
        {
            i1 = c(i1);
            k = k + 1;
            bk1 = (be)bk1.a(this, aq);
            a(0);
            k = k - 1;
            d(i1);
            return bk1;
        }
    }

    public final void a(int i1)
    {
        if (g != i1)
        {
            throw av.f();
        } else
        {
            return;
        }
    }

    public final void a(int i1, be.a a1, aq aq)
    {
        if (k >= l)
        {
            throw av.h();
        } else
        {
            k = k + 1;
            a1.c(this, aq);
            a(cd.a(i1, 4));
            k = k - 1;
            return;
        }
    }

    public final void a(be.a a1, aq aq)
    {
        int i1 = s();
        if (k >= l)
        {
            throw av.h();
        } else
        {
            i1 = c(i1);
            k = k + 1;
            a1.c(this, aq);
            a(0);
            k = k - 1;
            d(i1);
            return;
        }
    }

    public final double b()
    {
        return Double.longBitsToDouble(x());
    }

    public final boolean b(int i1)
    {
        boolean flag = false;
        cd.a(i1);
        JVM INSTR tableswitch 0 5: default 44
    //                   0 48
    //                   1 144
    //                   2 152
    //                   3 162
    //                   4 193
    //                   5 195;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw av.g();
_L2:
        int l1 = ((flag) ? 1 : 0);
        if (c - e < 10) goto _L9; else goto _L8
_L8:
        byte abyte0[];
        int j1;
        abyte0 = a;
        j1 = e;
        i1 = 0;
_L16:
        l1 = ((flag) ? 1 : 0);
        if (i1 >= 10) goto _L9; else goto _L10
_L10:
        l1 = j1 + 1;
        if (abyte0[j1] < 0) goto _L12; else goto _L11
_L11:
        e = l1;
_L14:
        return true;
_L12:
        i1++;
        j1 = l1;
        continue; /* Loop/switch isn't completed */
_L9:
        do
        {
            if (l1 >= 10)
            {
                break; /* Loop/switch isn't completed */
            }
            if (z() >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            l1++;
        } while (true);
        if (true) goto _L14; else goto _L13
_L13:
        throw av.d();
_L3:
        h(8);
        return true;
_L4:
        h(s());
        return true;
_L5:
        int k1;
        do
        {
            k1 = a();
        } while (k1 != 0 && b(k1));
        a(cd.a(cd.b(i1), 4));
        return true;
_L6:
        return false;
_L7:
        h(4);
        return true;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final float c()
    {
        return Float.intBitsToFloat(w());
    }

    public final int c(int i1)
    {
        if (i1 < 0)
        {
            throw av.c();
        }
        i1 = i + e + i1;
        int j1 = j;
        if (i1 > j1)
        {
            throw av.b();
        } else
        {
            j = i1;
            y();
            return j1;
        }
    }

    public final long d()
    {
        return u();
    }

    public final void d(int i1)
    {
        j = i1;
        y();
    }

    public final long e()
    {
        return u();
    }

    public final int f()
    {
        return s();
    }

    public final long g()
    {
        return x();
    }

    public final int h()
    {
        return w();
    }

    public final boolean i()
    {
        return u() != 0L;
    }

    public final String j()
    {
        int i1 = s();
        if (i1 <= c - e && i1 > 0)
        {
            String s1 = new String(a, e, i1, au.a);
            e = i1 + e;
            return s1;
        }
        if (i1 == 0)
        {
            return "";
        } else
        {
            return new String(g(i1), au.a);
        }
    }

    public final String k()
    {
        int j1 = s();
        int i1 = e;
        byte abyte0[];
        if (j1 <= c - i1 && j1 > 0)
        {
            abyte0 = a;
            e = i1 + j1;
        } else
        {
            if (j1 == 0)
            {
                return "";
            }
            abyte0 = g(j1);
            i1 = 0;
        }
        if (!cc.a(abyte0, i1, i1 + j1))
        {
            throw av.j();
        } else
        {
            return new String(abyte0, i1, j1, au.a);
        }
    }

    public final f l()
    {
        int i1 = s();
        if (i1 <= c - e && i1 > 0)
        {
            Object obj;
            if (b && h)
            {
                obj = new e(a, e, i1);
            } else
            {
                obj = com.c.b.f.a(a, e, i1);
            }
            e = i1 + e;
            return ((f) (obj));
        }
        if (i1 == 0)
        {
            return f.a;
        } else
        {
            return new ba(g(i1));
        }
    }

    public final int m()
    {
        return s();
    }

    public final int n()
    {
        return s();
    }

    public final int o()
    {
        return w();
    }

    public final long p()
    {
        return x();
    }

    public final int q()
    {
        int i1 = s();
        return -(i1 & 1) ^ i1 >>> 1;
    }

    public final long r()
    {
        long l1 = u();
        return -(l1 & 1L) ^ l1 >>> 1;
    }

    public final int s()
    {
        int i1 = e;
        if (c == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = a;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            e = j1;
            return k1;
        }
        if (c - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        j1 = k1 ^ 0xffffff80;
_L11:
        e = i1;
        return j1;
_L5:
        int l1;
        j1 = i1 + 1;
        k1 ^= abyte0[i1] << 14;
        if (k1 >= 0)
        {
            k1 ^= 0x3f80;
            i1 = j1;
            j1 = k1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 21;
        if (k1 < 0)
        {
            j1 = k1 ^ 0xffe03f80;
            continue; /* Loop/switch isn't completed */
        }
        l1 = i1 + 1;
        j1 = abyte0[i1];
        k1 = k1 ^ j1 << 28 ^ 0xfe03f80;
        i1 = l1;
        if (j1 >= 0) goto _L7; else goto _L6
_L6:
        int i2;
        i2 = l1 + 1;
        j1 = k1;
        i1 = i2;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i2 + 1;
        i1 = l1;
        if (abyte0[i2] >= 0) goto _L7; else goto _L8
_L8:
        i2 = l1 + 1;
        j1 = k1;
        i1 = i2;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i2 + 1;
        i1 = l1;
        if (abyte0[i2] >= 0) goto _L7; else goto _L9
_L9:
        i1 = l1 + 1;
        j1 = k1;
        if (abyte0[l1] >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return (int)v();
_L7:
        j1 = k1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final int t()
    {
        if (j == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = i;
            int j1 = e;
            return j - (i1 + j1);
        }
    }
}
