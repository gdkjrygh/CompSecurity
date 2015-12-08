// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.c.b:
//            ax, be, f, au, 
//            cd

public final class h
{
    public static final class a extends IOException
    {

        a()
        {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }


    private final byte a[];
    private final int b;
    private int c;
    private int d;
    private final OutputStream e;

    private h(OutputStream outputstream, byte abyte0[])
    {
        d = 0;
        e = outputstream;
        a = abyte0;
        c = 0;
        b = abyte0.length;
    }

    private h(byte abyte0[], int i1)
    {
        d = 0;
        e = null;
        a = abyte0;
        c = 0;
        b = i1 + 0;
    }

    public static int a()
    {
        return j(4) + 4;
    }

    public static int a(ax ax1)
    {
        int i1 = ax1.b();
        return i1 + l(i1);
    }

    public static h a(OutputStream outputstream, int i1)
    {
        return new h(outputstream, new byte[i1]);
    }

    public static h a(byte abyte0[])
    {
        return new h(abyte0, abyte0.length);
    }

    public static int b(be be1)
    {
        int i1 = be1.b();
        return i1 + l(i1);
    }

    public static int b(f f1)
    {
        return l(f1.a()) + f1.a();
    }

    public static int b(String s)
    {
        s = s.getBytes(au.a);
        int i1 = l(s.length);
        return s.length + i1;
    }

    public static int c(int i1, f f1)
    {
        return j(i1) + b(f1);
    }

    public static int d(int i1, int j1)
    {
        return j(i1) + i(j1);
    }

    public static int d(int i1, long l1)
    {
        return j(i1) + f(l1);
    }

    public static int d(int i1, be be1)
    {
        return j(i1) + b(be1);
    }

    private void d()
    {
        if (e == null)
        {
            throw new a();
        } else
        {
            e.write(a, 0, c);
            c = 0;
            return;
        }
    }

    public static int e(int i1, int j1)
    {
        return j(i1) + l(j1);
    }

    public static int e(int i1, long l1)
    {
        return j(i1) + f(l1);
    }

    public static int e(int i1, be be1)
    {
        return j(1) * 2 + e(2, i1) + d(3, be1);
    }

    public static int f(int i1, int j1)
    {
        return j(i1) + i(j1);
    }

    public static int f(long l1)
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

    public static int g(int i1)
    {
        return j(i1) + 1;
    }

    public static long g(long l1)
    {
        return l1 << 1 ^ l1 >> 63;
    }

    public static int h(int i1)
    {
        return j(i1) + 8;
    }

    private void h(long l1)
    {
        o((int)l1 & 0xff);
        o((int)(l1 >> 8) & 0xff);
        o((int)(l1 >> 16) & 0xff);
        o((int)(l1 >> 24) & 0xff);
        o((int)(l1 >> 32) & 0xff);
        o((int)(l1 >> 40) & 0xff);
        o((int)(l1 >> 48) & 0xff);
        o((int)(l1 >> 56) & 0xff);
    }

    public static int i(int i1)
    {
        if (i1 >= 0)
        {
            return l(i1);
        } else
        {
            return 10;
        }
    }

    public static int j(int i1)
    {
        return l(cd.a(i1, 0));
    }

    public static int l(int i1)
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

    public static int n(int i1)
    {
        return i1 << 1 ^ i1 >> 31;
    }

    private void o(int i1)
    {
        byte byte0 = (byte)i1;
        if (c == b)
        {
            d();
        }
        byte abyte0[] = a;
        i1 = c;
        c = i1 + 1;
        abyte0[i1] = byte0;
        d = d + 1;
    }

    public final void a(double d1)
    {
        h(Double.doubleToRawLongBits(d1));
    }

    public final void a(int i1)
    {
        g(4, 5);
        m(i1);
    }

    public final void a(int i1, int j1)
    {
        g(i1, 0);
        b(j1);
    }

    public final void a(int i1, long l1)
    {
        g(i1, 0);
        e(l1);
    }

    public final void a(int i1, be be1)
    {
        g(i1, 3);
        be1.a(this);
        g(i1, 4);
    }

    public final void a(int i1, f f1)
    {
        g(i1, 2);
        a(f1);
    }

    public final void a(int i1, boolean flag)
    {
        g(i1, 0);
        a(flag);
    }

    public final void a(long l1)
    {
        e(l1);
    }

    public final void a(be be1)
    {
        k(be1.b());
        be1.a(this);
    }

    public final void a(f f1)
    {
        int i1;
        k(f1.a());
        i1 = f1.a();
        if (b - c < i1) goto _L2; else goto _L1
_L1:
        f1.b(a, 0, c, i1);
        c = c + i1;
_L4:
        d = i1 + d;
        return;
_L2:
        int l1 = b - c;
        f1.b(a, 0, c, l1);
        int k1 = l1 + 0;
        int j1 = i1 - l1;
        c = b;
        d = l1 + d;
        d();
        if (j1 <= b)
        {
            f1.b(a, k1, 0, j1);
            c = j1;
            i1 = j1;
        } else
        {
            OutputStream outputstream = e;
            if (k1 < 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Source offset < 0: ")).append(k1).toString());
            }
            if (j1 < 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Length < 0: ")).append(j1).toString());
            }
            if (k1 + j1 > f1.a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Source end offset exceeded: ")).append(j1 + k1).toString());
            }
            i1 = j1;
            if (j1 > 0)
            {
                f1.a(outputstream, k1, j1);
                i1 = j1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s)
    {
        s = s.getBytes(au.a);
        k(s.length);
        b(s);
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        o(i1);
    }

    public final void b()
    {
        if (e != null)
        {
            d();
        }
    }

    public final void b(int i1)
    {
        if (i1 >= 0)
        {
            k(i1);
            return;
        } else
        {
            e(i1);
            return;
        }
    }

    public final void b(int i1, int j1)
    {
        g(i1, 0);
        k(j1);
    }

    public final void b(int i1, long l1)
    {
        g(i1, 0);
        e(l1);
    }

    public final void b(int i1, be be1)
    {
        g(i1, 2);
        a(be1);
    }

    public final void b(int i1, f f1)
    {
        g(1, 3);
        b(2, i1);
        a(3, f1);
        g(1, 4);
    }

    public final void b(long l1)
    {
        e(l1);
    }

    public final void b(byte abyte0[])
    {
        int i1 = abyte0.length;
        if (b - c >= i1)
        {
            System.arraycopy(abyte0, 0, a, c, i1);
            c = c + i1;
        } else
        {
            int j1 = b - c;
            System.arraycopy(abyte0, 0, a, c, j1);
            int k1 = j1 + 0;
            i1 -= j1;
            c = b;
            d = j1 + d;
            d();
            if (i1 <= b)
            {
                System.arraycopy(abyte0, k1, a, 0, i1);
                c = i1;
            } else
            {
                e.write(abyte0, k1, i1);
            }
        }
        d = i1 + d;
    }

    public final void c()
    {
        if (e == null)
        {
            if (b - c != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            } else
            {
                return;
            }
        } else
        {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        }
    }

    public final void c(int i1)
    {
        m(i1);
    }

    public final void c(int i1, int j1)
    {
        g(i1, 0);
        b(j1);
    }

    public final void c(int i1, long l1)
    {
        g(i1, 1);
        h(l1);
    }

    public final void c(int i1, be be1)
    {
        g(1, 3);
        b(2, i1);
        b(3, be1);
        g(1, 4);
    }

    public final void c(long l1)
    {
        h(l1);
    }

    public final void d(int i1)
    {
        k(i1);
    }

    public final void d(long l1)
    {
        h(l1);
    }

    public final void e(int i1)
    {
        b(i1);
    }

    public final void e(long l1)
    {
        do
        {
            if ((-128L & l1) == 0L)
            {
                o((int)l1);
                return;
            }
            o((int)l1 & 0x7f | 0x80);
            l1 >>>= 7;
        } while (true);
    }

    public final void f(int i1)
    {
        m(i1);
    }

    public final void g(int i1, int j1)
    {
        k(cd.a(i1, j1));
    }

    public final void k(int i1)
    {
        do
        {
            if ((i1 & 0xffffff80) == 0)
            {
                o(i1);
                return;
            }
            o(i1 & 0x7f | 0x80);
            i1 >>>= 7;
        } while (true);
    }

    public final void m(int i1)
    {
        o(i1 & 0xff);
        o(i1 >> 8 & 0xff);
        o(i1 >> 16 & 0xff);
        o(i1 >> 24 & 0xff);
    }
}
