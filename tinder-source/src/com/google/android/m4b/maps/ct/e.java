// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            p, m, l, z, 
//            y, d

public final class e
{
    static interface a
    {
    }


    int a;
    int b;
    private final byte c[];
    private final boolean d;
    private int e;
    private int f;
    private int g;
    private final InputStream h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private a n;

    private e(p p1)
    {
        j = false;
        l = 0x7fffffff;
        b = 100;
        m = 0x4000000;
        n = null;
        c = p1.b;
        g = p.h();
        e = g + p1.b();
        k = -g;
        h = null;
        d = true;
    }

    e(InputStream inputstream)
    {
        j = false;
        l = 0x7fffffff;
        b = 100;
        m = 0x4000000;
        n = null;
        c = new byte[4096];
        e = 0;
        g = 0;
        k = 0;
        h = inputstream;
        d = false;
    }

    private e(byte abyte0[], int i1)
    {
        j = false;
        l = 0x7fffffff;
        b = 100;
        m = 0x4000000;
        n = null;
        c = abyte0;
        e = i1 + 0;
        g = 0;
        k = 0;
        h = null;
        d = false;
    }

    static e a(p p1)
    {
        e e1 = new e(p1);
        try
        {
            e1.b(p1.b());
        }
        // Misplaced declaration of an exception variable
        catch (p p1)
        {
            throw new IllegalArgumentException(p1);
        }
        return e1;
    }

    public static e a(byte abyte0[], int i1)
    {
        abyte0 = new e(abyte0, i1);
        try
        {
            abyte0.b(i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException(abyte0);
        }
        return abyte0;
    }

    private void d(int i1)
    {
        if (!e(i1))
        {
            throw com.google.android.m4b.maps.ct.m.a();
        } else
        {
            return;
        }
    }

    private boolean e(int i1)
    {
_L2:
        if (g + i1 <= e)
        {
            throw new IllegalStateException((new StringBuilder(77)).append("refillBuffer() called when ").append(i1).append(" bytes were already available in buffer").toString());
        }
        break MISSING_BLOCK_LABEL_47;
        int j1;
        while (j1 <= 0) 
        {
            do
            {
                return false;
            } while (k + g + i1 > l || h == null);
            j1 = g;
            if (j1 > 0)
            {
                if (e > j1)
                {
                    System.arraycopy(c, j1, c, 0, e - j1);
                }
                k = k + j1;
                e = e - j1;
                g = 0;
            }
            j1 = h.read(c, e, c.length - e);
            if (j1 == 0 || j1 < -1 || j1 > c.length)
            {
                throw new IllegalStateException((new StringBuilder(102)).append("InputStream#read(byte[]) returned invalid result: ").append(j1).append("\nThe InputStream implementation is buggy.").toString());
            }
        }
        e = j1 + e;
        if ((k + i1) - m > 0)
        {
            throw com.google.android.m4b.maps.ct.m.h();
        }
        k();
        if (e >= i1)
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private byte[] f(int i1)
    {
        if (i1 <= 0)
        {
            if (i1 == 0)
            {
                return l.b;
            } else
            {
                throw com.google.android.m4b.maps.ct.m.b();
            }
        }
        if (k + g + i1 > l)
        {
            g(l - k - g);
            throw com.google.android.m4b.maps.ct.m.a();
        }
        if (i1 < 4096)
        {
            byte abyte0[] = new byte[i1];
            int j1 = e - g;
            System.arraycopy(c, g, abyte0, 0, j1);
            g = e;
            int l1 = i1 - j1;
            if (e - g < l1)
            {
                d(l1);
            }
            System.arraycopy(c, 0, abyte0, j1, i1 - j1);
            g = i1 - j1;
            return abyte0;
        }
        int l2 = g;
        int i3 = e;
        k = k + e;
        g = 0;
        e = 0;
        Object obj = new ArrayList();
        int j2;
        for (int k1 = i1 - (i3 - l2); k1 > 0; k1 -= j2)
        {
            byte abyte1[] = new byte[Math.min(k1, 4096)];
            int k2;
            for (int i2 = 0; i2 < abyte1.length; i2 += k2)
            {
                if (h == null)
                {
                    k2 = -1;
                } else
                {
                    k2 = h.read(abyte1, i2, abyte1.length - i2);
                }
                if (k2 == -1)
                {
                    throw com.google.android.m4b.maps.ct.m.a();
                }
                k = k + k2;
            }

            j2 = abyte1.length;
            ((List) (obj)).add(abyte1);
        }

        byte abyte2[] = new byte[i1];
        i1 = i3 - l2;
        System.arraycopy(c, l2, abyte2, 0, i1);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            byte abyte3[] = (byte[])((Iterator) (obj)).next();
            System.arraycopy(abyte3, 0, abyte2, i1, abyte3.length);
            i1 = abyte3.length + i1;
        }

        return abyte2;
    }

    private void g(int i1)
    {
        if (i1 <= e - g && i1 >= 0)
        {
            g = g + i1;
            return;
        }
        if (i1 < 0)
        {
            throw com.google.android.m4b.maps.ct.m.b();
        }
        if (k + g + i1 > l)
        {
            g(l - k - g);
            throw com.google.android.m4b.maps.ct.m.a();
        }
        int j1 = e - g;
        g = e;
        d(1);
        while (i1 - j1 > e) 
        {
            j1 += e;
            g = e;
            d(1);
        }
        g = i1 - j1;
    }

    private long j()
    {
        long l1 = 0L;
        for (int i1 = 0; i1 < 64; i1 += 7)
        {
            if (g == e)
            {
                d(1);
            }
            byte abyte0[] = c;
            int j1 = g;
            g = j1 + 1;
            j1 = abyte0[j1];
            l1 |= (long)(j1 & 0x7f) << i1;
            if ((j1 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw com.google.android.m4b.maps.ct.m.c();
    }

    private void k()
    {
        e = e + f;
        int i1 = k + e;
        if (i1 > l)
        {
            f = i1 - l;
            e = e - f;
            return;
        } else
        {
            f = 0;
            return;
        }
    }

    public final int a()
    {
        boolean flag = true;
        if (g != e || e(1))
        {
            flag = false;
        }
        if (flag)
        {
            i = 0;
            return 0;
        }
        i = e();
        if (z.b(i) == 0)
        {
            throw com.google.android.m4b.maps.ct.m.d();
        } else
        {
            return i;
        }
    }

    public final void a(int i1)
    {
        if (i != i1)
        {
            throw com.google.android.m4b.maps.ct.m.e();
        } else
        {
            return;
        }
    }

    public final int b(int i1)
    {
        if (i1 < 0)
        {
            throw com.google.android.m4b.maps.ct.m.b();
        }
        i1 = k + g + i1;
        int j1 = l;
        if (i1 > j1)
        {
            throw com.google.android.m4b.maps.ct.m.a();
        } else
        {
            l = i1;
            k();
            return j1;
        }
    }

    public final String b()
    {
        int i1 = e();
        if (i1 <= e - g && i1 > 0)
        {
            String s = new String(c, g, i1, l.a);
            g = i1 + g;
            return s;
        }
        if (i1 == 0)
        {
            return "";
        } else
        {
            return new String(f(i1), l.a);
        }
    }

    public final String c()
    {
        byte abyte0[];
        int i1;
        int j1;
        int k1;
        boolean flag1;
        int i2;
        int j2;
        flag1 = false;
        i2 = e();
        j1 = g;
        if (i2 <= e - j1 && i2 > 0)
        {
            abyte0 = c;
            g = j1 + i2;
        } else
        {
            if (i2 == 0)
            {
                return "";
            }
            abyte0 = f(i2);
            j1 = 0;
        }
        j2 = j1 + i2;
        for (k1 = j1; k1 < j2 && abyte0[k1] >= 0; k1++) { }
        i1 = k1;
        if (k1 < j2) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L3:
        boolean flag = flag1;
        if (i1 == 0)
        {
            flag = true;
        }
        int l1;
        byte byte0;
        int k2;
        if (!flag)
        {
            throw com.google.android.m4b.maps.ct.m.i();
        } else
        {
            return new String(abyte0, j1, i2, l.a);
        }
_L5:
        i1 = l1;
_L2:
label0:
        {
            if (i1 < j2)
            {
                break label0;
            }
            i1 = 0;
        }
          goto _L3
        l1 = i1 + 1;
        byte0 = abyte0[i1];
        if (byte0 >= 0) goto _L5; else goto _L4
_L4:
        if (byte0 >= -32)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        i1 = byte0;
        if (l1 >= j2) goto _L3; else goto _L6
_L6:
        if (byte0 < -62)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1 + 1;
        if (abyte0[l1] <= -65) goto _L2; else goto _L7
_L7:
        i1 = -1;
          goto _L3
label1:
        {
            if (byte0 >= -16)
            {
                break MISSING_BLOCK_LABEL_289;
            }
            if (l1 < j2 - 1)
            {
                break label1;
            }
            i1 = y.a(abyte0, l1, j2);
        }
          goto _L3
        k2 = l1 + 1;
        i1 = abyte0[l1];
        if (i1 > -65 || byte0 == -32 && i1 < -96 || byte0 == -19 && i1 >= -96)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k2 + 1;
        if (abyte0[k2] <= -65) goto _L2; else goto _L8
_L8:
        i1 = -1;
          goto _L3
label2:
        {
            if (l1 < j2 - 2)
            {
                break label2;
            }
            i1 = y.a(abyte0, l1, j2);
        }
          goto _L3
        i1 = l1 + 1;
        l1 = abyte0[l1];
        if (l1 > -65 || (byte0 << 28) + (l1 + 112) >> 30 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1 + 1;
        if (abyte0[i1] > -65)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1 + 1;
        if (abyte0[l1] <= -65) goto _L2; else goto _L9
_L9:
        i1 = -1;
          goto _L3
    }

    public final void c(int i1)
    {
        l = i1;
        k();
    }

    public final d d()
    {
        int i1 = e();
        if (i1 <= e - g && i1 > 0)
        {
            d d1 = com.google.android.m4b.maps.ct.d.a(c, g, i1);
            g = i1 + g;
            return d1;
        }
        if (i1 == 0)
        {
            return d.a;
        } else
        {
            return new p(f(i1));
        }
    }

    public final int e()
    {
        int i1 = g;
        if (e == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = c;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            g = j1;
            return k1;
        }
        if (e - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        j1 = k1 ^ 0xffffff80;
_L11:
        g = i1;
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
        return (int)j();
_L7:
        j1 = k1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    final long f()
    {
        int i1 = g;
        if (e == i1) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int j1;
        int k1;
        abyte0 = c;
        j1 = i1 + 1;
        k1 = abyte0[i1];
        if (k1 >= 0)
        {
            g = j1;
            return (long)k1;
        }
        if (e - j1 < 9) goto _L2; else goto _L3
_L3:
        i1 = j1 + 1;
        k1 ^= abyte0[j1] << 7;
        if (k1 >= 0) goto _L5; else goto _L4
_L4:
        long l1 = k1 ^ 0xffffff80;
_L9:
        g = i1;
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
        return j();
_L7:
        i1 = j1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    final int g()
    {
        int j1 = g;
        int i1 = j1;
        if (e - j1 < 4)
        {
            d(4);
            i1 = g;
        }
        byte abyte0[] = c;
        g = i1 + 4;
        j1 = abyte0[i1];
        byte byte0 = abyte0[i1 + 1];
        byte byte1 = abyte0[i1 + 2];
        return (abyte0[i1 + 3] & 0xff) << 24 | (j1 & 0xff | (byte0 & 0xff) << 8 | (byte1 & 0xff) << 16);
    }

    public final long h()
    {
        int j1 = g;
        int i1 = j1;
        if (e - j1 < 8)
        {
            d(8);
            i1 = g;
        }
        byte abyte0[] = c;
        g = i1 + 8;
        long l1 = abyte0[i1];
        long l2 = abyte0[i1 + 1];
        long l3 = abyte0[i1 + 2];
        long l4 = abyte0[i1 + 3];
        long l5 = abyte0[i1 + 4];
        long l6 = abyte0[i1 + 5];
        long l7 = abyte0[i1 + 6];
        return ((long)abyte0[i1 + 7] & 255L) << 56 | (l1 & 255L | (l2 & 255L) << 8 | (l3 & 255L) << 16 | (l4 & 255L) << 24 | (l5 & 255L) << 32 | (l6 & 255L) << 40 | (l7 & 255L) << 48);
    }

    public final int i()
    {
        if (l == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = k;
            int j1 = g;
            return l - (i1 + j1);
        }
    }
}
