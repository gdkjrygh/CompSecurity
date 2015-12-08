// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            qw, qz

public final class qp
{
    public static class a extends IOException
    {

        a(int i, int k)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(k).append(").").toString());
        }
    }


    private final int ayV;
    private final byte buffer[];
    private int position;

    private qp(byte abyte0[], int i, int k)
    {
        buffer = abyte0;
        position = i;
        ayV = i + k;
    }

    public static int D(long l)
    {
        return G(l);
    }

    public static int E(long l)
    {
        return G(I(l));
    }

    public static int G(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    public static long I(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int X(boolean flag)
    {
        return 1;
    }

    public static int b(int i, double d1)
    {
        return hc(i) + f(d1);
    }

    public static int b(int i, qw qw1)
    {
        return hc(i) * 2 + d(qw1);
    }

    public static int b(int i, byte abyte0[])
    {
        return hc(i) + s(abyte0);
    }

    public static qp b(byte abyte0[], int i, int k)
    {
        return new qp(abyte0, i, k);
    }

    public static int c(int i, float f1)
    {
        return hc(i) + e(f1);
    }

    public static int c(int i, qw qw1)
    {
        return hc(i) + e(qw1);
    }

    public static int c(int i, boolean flag)
    {
        return hc(i) + X(flag);
    }

    public static int d(int i, long l)
    {
        return hc(i) + D(l);
    }

    public static int d(qw qw1)
    {
        return qw1.rZ();
    }

    public static int dk(String s1)
    {
        int i;
        int k;
        try
        {
            s1 = s1.getBytes("UTF-8");
            i = he(s1.length);
            k = s1.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return k + i;
    }

    public static int e(float f1)
    {
        return 4;
    }

    public static int e(int i, long l)
    {
        return hc(i) + E(l);
    }

    public static int e(qw qw1)
    {
        int i = qw1.rZ();
        return i + he(i);
    }

    public static int f(double d1)
    {
        return 8;
    }

    public static int gZ(int i)
    {
        if (i >= 0)
        {
            return he(i);
        } else
        {
            return 10;
        }
    }

    public static int ha(int i)
    {
        return he(hg(i));
    }

    public static int hc(int i)
    {
        return he(qz.y(i, 0));
    }

    public static int he(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public static int hg(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public static int j(int i, String s1)
    {
        return hc(i) + dk(s1);
    }

    public static qp q(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public static int s(byte abyte0[])
    {
        return he(abyte0.length) + abyte0.length;
    }

    public static int v(int i, int k)
    {
        return hc(i) + gZ(k);
    }

    public static int w(int i, int k)
    {
        return hc(i) + ha(k);
    }

    public void B(long l)
        throws IOException
    {
        F(l);
    }

    public void C(long l)
        throws IOException
    {
        F(I(l));
    }

    public void F(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                hb((int)l);
                return;
            }
            hb((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void H(long l)
        throws IOException
    {
        hb((int)l & 0xff);
        hb((int)(l >> 8) & 0xff);
        hb((int)(l >> 16) & 0xff);
        hb((int)(l >> 24) & 0xff);
        hb((int)(l >> 32) & 0xff);
        hb((int)(l >> 40) & 0xff);
        hb((int)(l >> 48) & 0xff);
        hb((int)(l >> 56) & 0xff);
    }

    public void W(boolean flag)
        throws IOException
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        hb(i);
    }

    public void a(int i, double d1)
        throws IOException
    {
        x(i, 1);
        e(d1);
    }

    public void a(int i, qw qw1)
        throws IOException
    {
        x(i, 2);
        c(qw1);
    }

    public void a(int i, byte abyte0[])
        throws IOException
    {
        x(i, 2);
        r(abyte0);
    }

    public void b(byte byte0)
        throws IOException
    {
        if (position == ayV)
        {
            throw new a(position, ayV);
        } else
        {
            byte abyte0[] = buffer;
            int i = position;
            position = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public void b(int i, float f1)
        throws IOException
    {
        x(i, 5);
        d(f1);
    }

    public void b(int i, long l)
        throws IOException
    {
        x(i, 0);
        B(l);
    }

    public void b(int i, String s1)
        throws IOException
    {
        x(i, 2);
        dj(s1);
    }

    public void b(int i, boolean flag)
        throws IOException
    {
        x(i, 0);
        W(flag);
    }

    public void b(qw qw1)
        throws IOException
    {
        qw1.a(this);
    }

    public void c(int i, long l)
        throws IOException
    {
        x(i, 0);
        C(l);
    }

    public void c(qw qw1)
        throws IOException
    {
        hd(qw1.rY());
        qw1.a(this);
    }

    public void c(byte abyte0[], int i, int k)
        throws IOException
    {
        if (ayV - position >= k)
        {
            System.arraycopy(abyte0, i, buffer, position, k);
            position = position + k;
            return;
        } else
        {
            throw new a(position, ayV);
        }
    }

    public void d(float f1)
        throws IOException
    {
        hf(Float.floatToIntBits(f1));
    }

    public void dj(String s1)
        throws IOException
    {
        s1 = s1.getBytes("UTF-8");
        hd(s1.length);
        t(s1);
    }

    public void e(double d1)
        throws IOException
    {
        H(Double.doubleToLongBits(d1));
    }

    public void gX(int i)
        throws IOException
    {
        if (i >= 0)
        {
            hd(i);
            return;
        } else
        {
            F(i);
            return;
        }
    }

    public void gY(int i)
        throws IOException
    {
        hd(hg(i));
    }

    public void hb(int i)
        throws IOException
    {
        b((byte)i);
    }

    public void hd(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                hb(i);
                return;
            }
            hb(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void hf(int i)
        throws IOException
    {
        hb(i & 0xff);
        hb(i >> 8 & 0xff);
        hb(i >> 16 & 0xff);
        hb(i >> 24 & 0xff);
    }

    public void r(byte abyte0[])
        throws IOException
    {
        hd(abyte0.length);
        t(abyte0);
    }

    public int rO()
    {
        return ayV - position;
    }

    public void rP()
    {
        if (rO() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void t(int i, int k)
        throws IOException
    {
        x(i, 0);
        gX(k);
    }

    public void t(byte abyte0[])
        throws IOException
    {
        c(abyte0, 0, abyte0.length);
    }

    public void u(int i, int k)
        throws IOException
    {
        x(i, 0);
        gY(k);
    }

    public void x(int i, int k)
        throws IOException
    {
        hd(qz.y(i, k));
    }
}
