// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            pn, pq

public final class pg
{
    public static class a extends IOException
    {

        a(int i, int k)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(k).append(").").toString());
        }
    }


    private final int awI;
    private final byte buffer[];
    private int position;

    private pg(byte abyte0[], int i, int k)
    {
        buffer = abyte0;
        position = i;
        awI = i + k;
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

    public static int V(boolean flag)
    {
        return 1;
    }

    public static int b(int i, double d1)
    {
        return gz(i) + f(d1);
    }

    public static int b(int i, pn pn1)
    {
        return gz(i) * 2 + d(pn1);
    }

    public static int b(int i, byte abyte0[])
    {
        return gz(i) + s(abyte0);
    }

    public static pg b(byte abyte0[], int i, int k)
    {
        return new pg(abyte0, i, k);
    }

    public static int c(int i, float f1)
    {
        return gz(i) + e(f1);
    }

    public static int c(int i, pn pn1)
    {
        return gz(i) + e(pn1);
    }

    public static int c(int i, boolean flag)
    {
        return gz(i) + V(flag);
    }

    public static int d(int i, long l)
    {
        return gz(i) + D(l);
    }

    public static int d(pn pn1)
    {
        return pn1.qI();
    }

    public static int di(String s1)
    {
        int i;
        int k;
        try
        {
            s1 = s1.getBytes("UTF-8");
            i = gB(s1.length);
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
        return gz(i) + E(l);
    }

    public static int e(pn pn1)
    {
        int i = pn1.qI();
        return i + gB(i);
    }

    public static int f(double d1)
    {
        return 8;
    }

    public static int gB(int i)
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

    public static int gD(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public static int gw(int i)
    {
        if (i >= 0)
        {
            return gB(i);
        } else
        {
            return 10;
        }
    }

    public static int gx(int i)
    {
        return gB(gD(i));
    }

    public static int gz(int i)
    {
        return gB(pq.x(i, 0));
    }

    public static int j(int i, String s1)
    {
        return gz(i) + di(s1);
    }

    public static pg q(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public static int s(byte abyte0[])
    {
        return gB(abyte0.length) + abyte0.length;
    }

    public static int u(int i, int k)
    {
        return gz(i) + gw(k);
    }

    public static int v(int i, int k)
    {
        return gz(i) + gx(k);
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
                gy((int)l);
                return;
            }
            gy((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void H(long l)
        throws IOException
    {
        gy((int)l & 0xff);
        gy((int)(l >> 8) & 0xff);
        gy((int)(l >> 16) & 0xff);
        gy((int)(l >> 24) & 0xff);
        gy((int)(l >> 32) & 0xff);
        gy((int)(l >> 40) & 0xff);
        gy((int)(l >> 48) & 0xff);
        gy((int)(l >> 56) & 0xff);
    }

    public void U(boolean flag)
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
        gy(i);
    }

    public void a(int i, double d1)
        throws IOException
    {
        w(i, 1);
        e(d1);
    }

    public void a(int i, pn pn1)
        throws IOException
    {
        w(i, 2);
        c(pn1);
    }

    public void a(int i, byte abyte0[])
        throws IOException
    {
        w(i, 2);
        r(abyte0);
    }

    public void b(byte byte0)
        throws IOException
    {
        if (position == awI)
        {
            throw new a(position, awI);
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
        w(i, 5);
        d(f1);
    }

    public void b(int i, long l)
        throws IOException
    {
        w(i, 0);
        B(l);
    }

    public void b(int i, String s1)
        throws IOException
    {
        w(i, 2);
        dh(s1);
    }

    public void b(int i, boolean flag)
        throws IOException
    {
        w(i, 0);
        U(flag);
    }

    public void b(pn pn1)
        throws IOException
    {
        pn1.a(this);
    }

    public void c(int i, long l)
        throws IOException
    {
        w(i, 0);
        C(l);
    }

    public void c(pn pn1)
        throws IOException
    {
        gA(pn1.qH());
        pn1.a(this);
    }

    public void c(byte abyte0[], int i, int k)
        throws IOException
    {
        if (awI - position >= k)
        {
            System.arraycopy(abyte0, i, buffer, position, k);
            position = position + k;
            return;
        } else
        {
            throw new a(position, awI);
        }
    }

    public void d(float f1)
        throws IOException
    {
        gC(Float.floatToIntBits(f1));
    }

    public void dh(String s1)
        throws IOException
    {
        s1 = s1.getBytes("UTF-8");
        gA(s1.length);
        t(s1);
    }

    public void e(double d1)
        throws IOException
    {
        H(Double.doubleToLongBits(d1));
    }

    public void gA(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                gy(i);
                return;
            }
            gy(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void gC(int i)
        throws IOException
    {
        gy(i & 0xff);
        gy(i >> 8 & 0xff);
        gy(i >> 16 & 0xff);
        gy(i >> 24 & 0xff);
    }

    public void gu(int i)
        throws IOException
    {
        if (i >= 0)
        {
            gA(i);
            return;
        } else
        {
            F(i);
            return;
        }
    }

    public void gv(int i)
        throws IOException
    {
        gA(gD(i));
    }

    public void gy(int i)
        throws IOException
    {
        b((byte)i);
    }

    public int qx()
    {
        return awI - position;
    }

    public void qy()
    {
        if (qx() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void r(byte abyte0[])
        throws IOException
    {
        gA(abyte0.length);
        t(abyte0);
    }

    public void s(int i, int k)
        throws IOException
    {
        w(i, 0);
        gu(k);
    }

    public void t(int i, int k)
        throws IOException
    {
        w(i, 0);
        gv(k);
    }

    public void t(byte abyte0[])
        throws IOException
    {
        c(abyte0, 0, abyte0.length);
    }

    public void w(int i, int k)
        throws IOException
    {
        gA(pq.x(i, k));
    }
}
