// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            me, mh

public final class lz
{
    public static class a extends IOException
    {

        a(int i, int j)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final int amW;
    private final byte buffer[];
    private int position;

    private lz(byte abyte0[], int i, int j)
    {
        buffer = abyte0;
        position = i;
        amW = i + j;
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

    public static int J(boolean flag)
    {
        return 1;
    }

    public static int b(int i, double d1)
    {
        return eH(i) + f(d1);
    }

    public static int b(int i, me me1)
    {
        return eH(i) + c(me1);
    }

    public static int b(int i, boolean flag)
    {
        return eH(i) + J(flag);
    }

    public static int b(int i, byte abyte0[])
    {
        return eH(i) + s(abyte0);
    }

    public static lz b(byte abyte0[], int i, int j)
    {
        return new lz(abyte0, i, j);
    }

    public static int c(int i, float f1)
    {
        return eH(i) + e(f1);
    }

    public static int c(me me1)
    {
        int i = me1.oa();
        return i + eJ(i);
    }

    public static int cz(String s1)
    {
        int i;
        int j;
        try
        {
            s1 = s1.getBytes("UTF-8");
            i = eJ(s1.length);
            j = s1.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static int d(int i, long l)
    {
        return eH(i) + D(l);
    }

    public static int e(float f1)
    {
        return 4;
    }

    public static int e(int i, long l)
    {
        return eH(i) + E(l);
    }

    public static int eE(int i)
    {
        if (i >= 0)
        {
            return eJ(i);
        } else
        {
            return 10;
        }
    }

    public static int eF(int i)
    {
        return eJ(eL(i));
    }

    public static int eH(int i)
    {
        return eJ(mh.u(i, 0));
    }

    public static int eJ(int i)
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

    public static int eL(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public static int f(double d1)
    {
        return 8;
    }

    public static int h(int i, String s1)
    {
        return eH(i) + cz(s1);
    }

    public static lz q(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public static int r(int i, int j)
    {
        return eH(i) + eE(j);
    }

    public static int s(int i, int j)
    {
        return eH(i) + eF(j);
    }

    public static int s(byte abyte0[])
    {
        return eJ(abyte0.length) + abyte0.length;
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
                eG((int)l);
                return;
            }
            eG((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void H(long l)
        throws IOException
    {
        eG((int)l & 0xff);
        eG((int)(l >> 8) & 0xff);
        eG((int)(l >> 16) & 0xff);
        eG((int)(l >> 24) & 0xff);
        eG((int)(l >> 32) & 0xff);
        eG((int)(l >> 40) & 0xff);
        eG((int)(l >> 48) & 0xff);
        eG((int)(l >> 56) & 0xff);
    }

    public void I(boolean flag)
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
        eG(i);
    }

    public void a(int i, double d1)
        throws IOException
    {
        t(i, 1);
        e(d1);
    }

    public void a(int i, me me1)
        throws IOException
    {
        t(i, 2);
        b(me1);
    }

    public void a(int i, boolean flag)
        throws IOException
    {
        t(i, 0);
        I(flag);
    }

    public void a(int i, byte abyte0[])
        throws IOException
    {
        t(i, 2);
        r(abyte0);
    }

    public void b(byte byte0)
        throws IOException
    {
        if (position == amW)
        {
            throw new a(position, amW);
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
        t(i, 5);
        d(f1);
    }

    public void b(int i, long l)
        throws IOException
    {
        t(i, 0);
        B(l);
    }

    public void b(int i, String s1)
        throws IOException
    {
        t(i, 2);
        cy(s1);
    }

    public void b(me me1)
        throws IOException
    {
        eI(me1.nZ());
        me1.a(this);
    }

    public void c(int i, long l)
        throws IOException
    {
        t(i, 0);
        C(l);
    }

    public void c(byte abyte0[], int i, int j)
        throws IOException
    {
        if (amW - position >= j)
        {
            System.arraycopy(abyte0, i, buffer, position, j);
            position = position + j;
            return;
        } else
        {
            throw new a(position, amW);
        }
    }

    public void cy(String s1)
        throws IOException
    {
        s1 = s1.getBytes("UTF-8");
        eI(s1.length);
        t(s1);
    }

    public void d(float f1)
        throws IOException
    {
        eK(Float.floatToIntBits(f1));
    }

    public void e(double d1)
        throws IOException
    {
        H(Double.doubleToLongBits(d1));
    }

    public void eC(int i)
        throws IOException
    {
        if (i >= 0)
        {
            eI(i);
            return;
        } else
        {
            F(i);
            return;
        }
    }

    public void eD(int i)
        throws IOException
    {
        eI(eL(i));
    }

    public void eG(int i)
        throws IOException
    {
        b((byte)i);
    }

    public void eI(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                eG(i);
                return;
            }
            eG(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void eK(int i)
        throws IOException
    {
        eG(i & 0xff);
        eG(i >> 8 & 0xff);
        eG(i >> 16 & 0xff);
        eG(i >> 24 & 0xff);
    }

    public int nQ()
    {
        return amW - position;
    }

    public void nR()
    {
        if (nQ() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void p(int i, int j)
        throws IOException
    {
        t(i, 0);
        eC(j);
    }

    public void q(int i, int j)
        throws IOException
    {
        t(i, 0);
        eD(j);
    }

    public void r(byte abyte0[])
        throws IOException
    {
        eI(abyte0.length);
        t(abyte0);
    }

    public void t(int i, int j)
        throws IOException
    {
        eI(mh.u(i, j));
    }

    public void t(byte abyte0[])
        throws IOException
    {
        c(abyte0, 0, abyte0.length);
    }
}
