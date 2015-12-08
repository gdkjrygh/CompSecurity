// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            o, d, q, y, 
//            l, z

public final class f
{
    public static final class a extends IOException
    {

        private static final long serialVersionUID = 0x9f95917c52ce6e25L;

        a()
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        a(Throwable throwable)
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
        }
    }


    private static final Logger a = Logger.getLogger(com/google/android/m4b/maps/ct/f.getName());
    private final byte b[];
    private final int c;
    private int d;
    private int e;
    private final OutputStream f = null;

    private f(byte abyte0[], int i1)
    {
        e = 0;
        b = abyte0;
        d = 0;
        c = i1 + 0;
    }

    public static int a()
    {
        return 8;
    }

    public static int a(int i1, o o1)
    {
        return i(i1) + a(o1);
    }

    public static int a(int i1, q q1)
    {
        return i(1) * 2 + n(i1) + (i(3) + c(q1));
    }

    public static int a(long l1)
    {
        return g(l1);
    }

    public static int a(o o1)
    {
        int i1 = o1.d();
        return i1 + k(i1);
    }

    public static f a(byte abyte0[])
    {
        return new f(abyte0, abyte0.length);
    }

    public static int b()
    {
        return 4;
    }

    public static int b(int i1)
    {
        return i(i1) + 8;
    }

    public static int b(int i1, long l1)
    {
        return i(i1) + g(l1);
    }

    public static int b(int i1, d d1)
    {
        return i(i1) + b(d1);
    }

    public static int b(int i1, o o1)
    {
        return i(1) * 2 + n(i1) + a(3, o1);
    }

    public static int b(long l1)
    {
        return g(l1);
    }

    public static int b(d d1)
    {
        return k(d1.b()) + d1.b();
    }

    public static int b(q q1)
    {
        return q1.a();
    }

    public static int b(byte abyte0[])
    {
        return k(abyte0.length) + abyte0.length;
    }

    public static int c()
    {
        return 8;
    }

    public static int c(int i1)
    {
        return i(i1) + 4;
    }

    public static int c(long l1)
    {
        return g(f(l1));
    }

    public static int c(q q1)
    {
        int i1 = q1.a();
        return i1 + k(i1);
    }

    public static int c(String s)
    {
        return i(2) + d(s);
    }

    public static int d()
    {
        return 4;
    }

    public static int d(int i1)
    {
        if (i1 >= 0)
        {
            return k(i1);
        } else
        {
            return 10;
        }
    }

    public static int d(String s)
    {
        int i1;
        try
        {
            i1 = y.a(s);
        }
        catch (y.a a1)
        {
            i1 = s.getBytes(l.a).length;
        }
        return i1 + k(i1);
    }

    public static int e()
    {
        return 1;
    }

    public static int e(int i1)
    {
        return k(i1);
    }

    public static int f()
    {
        return 4;
    }

    public static int f(int i1)
    {
        return d(i1);
    }

    public static long f(long l1)
    {
        return l1 << 1 ^ l1 >> 63;
    }

    public static int g()
    {
        return 8;
    }

    public static int g(int i1)
    {
        return k(m(i1));
    }

    private static int g(long l1)
    {
        if ((-128L & l1) == 0L)
        {
            return 1;
        }
        if ((-16384L & l1) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l1) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l1) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l1) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l1) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l1) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l1) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l1) != 0L ? 10 : 9;
    }

    public static int i(int i1)
    {
        return k(z.a(i1, 0));
    }

    public static int k(int i1)
    {
        if ((i1 & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i1 & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i1) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i1) != 0 ? 5 : 4;
    }

    public static int m(int i1)
    {
        return i1 << 1 ^ i1 >> 31;
    }

    private static int n(int i1)
    {
        return i(2) + k(i1);
    }

    public final void a(int i1)
    {
        if (i1 >= 0)
        {
            j(i1);
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        j(z.a(i1, j1));
    }

    public final void a(int i1, long l1)
    {
        a(i1, 1);
        e(l1);
    }

    public final void a(int i1, d d1)
    {
        a(i1, 2);
        a(d1);
    }

    public final void a(d d1)
    {
        j(d1.b());
        int i1 = d1.b();
        if (c - d >= i1)
        {
            d1.a(b, 0, d, i1);
            d = d + i1;
            e = i1 + e;
            return;
        } else
        {
            int j1 = c - d;
            d1.a(b, 0, d, j1);
            d = c;
            e = j1 + e;
            throw new a();
        }
    }

    public final void a(q q1)
    {
        j(q1.a());
        q1.a(this);
    }

    public final void a(String s)
    {
        a(2, 2);
        b(s);
    }

    public final void b(String s)
    {
        int i1;
        int j1;
        int k1;
        k1 = k(s.length() * 3);
        i1 = k(s.length());
        j1 = d;
        if (i1 != k1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        d = j1 + i1;
        k1 = y.a(s, b, d, c - d);
        d = j1;
        i1 = k1 - j1 - i1;
        j(i1);
        d = k1;
_L1:
        y.a a1;
        try
        {
            e = i1 + e;
            return;
        }
        catch (y.a a2)
        {
            a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", a2);
        }
        break MISSING_BLOCK_LABEL_158;
        i1 = y.a(s);
        j(i1);
        d = y.a(s, b, d, c - d);
          goto _L1
        a1;
        d = j1;
        throw a1;
        s = s.getBytes(l.a);
        j(s.length);
        c(s);
        return;
        ArrayIndexOutOfBoundsException arrayindexoutofboundsexception;
        arrayindexoutofboundsexception;
        throw new a(arrayindexoutofboundsexception);
    }

    public final void c(byte abyte0[])
    {
        int i1 = abyte0.length;
        if (c - d >= i1)
        {
            System.arraycopy(abyte0, 0, b, d, i1);
            d = d + i1;
            e = i1 + e;
            return;
        } else
        {
            int j1 = c - d;
            System.arraycopy(abyte0, 0, b, d, j1);
            d = c;
            e = j1 + e;
            throw new a();
        }
    }

    public final void d(long l1)
    {
        do
        {
            if ((-128L & l1) == 0L)
            {
                h((int)l1);
                return;
            }
            h((int)l1 & 0x7f | 0x80);
            l1 >>>= 7;
        } while (true);
    }

    public final void e(long l1)
    {
        h((int)l1 & 0xff);
        h((int)(l1 >> 8) & 0xff);
        h((int)(l1 >> 16) & 0xff);
        h((int)(l1 >> 24) & 0xff);
        h((int)(l1 >> 32) & 0xff);
        h((int)(l1 >> 40) & 0xff);
        h((int)(l1 >> 48) & 0xff);
        h((int)(l1 >> 56) & 0xff);
    }

    public final void h()
    {
        if (c - d != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public final void h(int i1)
    {
        byte byte0 = (byte)i1;
        if (d == c)
        {
            throw new a();
        } else
        {
            byte abyte0[] = b;
            i1 = d;
            d = i1 + 1;
            abyte0[i1] = byte0;
            e = e + 1;
            return;
        }
    }

    public final void j(int i1)
    {
        do
        {
            if ((i1 & 0xffffff80) == 0)
            {
                h(i1);
                return;
            }
            h(i1 & 0x7f | 0x80);
            i1 >>>= 7;
        } while (true);
    }

    public final void l(int i1)
    {
        h(i1 & 0xff);
        h(i1 >> 8 & 0xff);
        h(i1 >> 16 & 0xff);
        h(i1 >> 24 & 0xff);
    }

}
