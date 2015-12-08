// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            kt, kw

public final class ko
{
    public static class a extends IOException
    {

        a(int l, int i1)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(l).append(" limit ").append(i1).append(").").toString());
        }
    }


    private final int adT;
    private final byte buffer[];
    private int position;

    private ko(byte abyte0[], int l, int i1)
    {
        buffer = abyte0;
        position = l;
        adT = l + i1;
    }

    public static int A(long l)
    {
        return D(l);
    }

    public static int B(long l)
    {
        return D(E(l));
    }

    public static int D(long l)
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

    public static int E(boolean flag)
    {
        return 1;
    }

    public static long E(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int b(int l, kt kt1)
    {
        return cZ(l) + c(kt1);
    }

    public static int b(int l, boolean flag)
    {
        return cZ(l) + E(flag);
    }

    public static ko b(byte abyte0[], int l, int i1)
    {
        return new ko(abyte0, l, i1);
    }

    public static int c(int l, float f)
    {
        return cZ(l) + e(f);
    }

    public static int c(kt kt1)
    {
        int l = kt1.c();
        return l + db(l);
    }

    public static int cX(int l)
    {
        if (l >= 0)
        {
            return db(l);
        } else
        {
            return 10;
        }
    }

    public static int cZ(int l)
    {
        return db(kw.l(l, 0));
    }

    public static int cf(String s)
    {
        int l;
        int i1;
        try
        {
            s = s.getBytes("UTF-8");
            l = db(s.length);
            i1 = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return i1 + l;
    }

    public static int d(int l, long l1)
    {
        return cZ(l) + A(l1);
    }

    public static int db(int l)
    {
        if ((l & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((l & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & l) == 0)
        {
            return 3;
        }
        return (0xf0000000 & l) != 0 ? 5 : 4;
    }

    public static int e(float f)
    {
        return 4;
    }

    public static int e(int l, long l1)
    {
        return cZ(l) + B(l1);
    }

    public static int g(int l, String s)
    {
        return cZ(l) + cf(s);
    }

    public static int j(int l, int i1)
    {
        return cZ(l) + cX(i1);
    }

    public static ko o(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public void C(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                cY((int)l);
                return;
            }
            cY((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void D(boolean flag)
        throws IOException
    {
        int l;
        if (flag)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        cY(l);
    }

    public void a(int l, kt kt1)
        throws IOException
    {
        k(l, 2);
        b(kt1);
    }

    public void a(int l, boolean flag)
        throws IOException
    {
        k(l, 0);
        D(flag);
    }

    public void b(byte byte0)
        throws IOException
    {
        if (position == adT)
        {
            throw new a(position, adT);
        } else
        {
            byte abyte0[] = buffer;
            int l = position;
            position = l + 1;
            abyte0[l] = byte0;
            return;
        }
    }

    public void b(int l, float f)
        throws IOException
    {
        k(l, 5);
        d(f);
    }

    public void b(int l, long l1)
        throws IOException
    {
        k(l, 0);
        y(l1);
    }

    public void b(int l, String s)
        throws IOException
    {
        k(l, 2);
        ce(s);
    }

    public void b(kt kt1)
        throws IOException
    {
        da(kt1.mF());
        kt1.a(this);
    }

    public void c(int l, long l1)
        throws IOException
    {
        k(l, 0);
        z(l1);
    }

    public void c(byte abyte0[], int l, int i1)
        throws IOException
    {
        if (adT - position >= i1)
        {
            System.arraycopy(abyte0, l, buffer, position, i1);
            position = position + i1;
            return;
        } else
        {
            throw new a(position, adT);
        }
    }

    public void cW(int l)
        throws IOException
    {
        if (l >= 0)
        {
            da(l);
            return;
        } else
        {
            C(l);
            return;
        }
    }

    public void cY(int l)
        throws IOException
    {
        b((byte)l);
    }

    public void ce(String s)
        throws IOException
    {
        s = s.getBytes("UTF-8");
        da(s.length);
        p(s);
    }

    public void d(float f)
        throws IOException
    {
        dc(Float.floatToIntBits(f));
    }

    public void da(int l)
        throws IOException
    {
        do
        {
            if ((l & 0xffffff80) == 0)
            {
                cY(l);
                return;
            }
            cY(l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void dc(int l)
        throws IOException
    {
        cY(l & 0xff);
        cY(l >> 8 & 0xff);
        cY(l >> 16 & 0xff);
        cY(l >> 24 & 0xff);
    }

    public void i(int l, int i1)
        throws IOException
    {
        k(l, 0);
        cW(i1);
    }

    public void k(int l, int i1)
        throws IOException
    {
        da(kw.l(l, i1));
    }

    public int mv()
    {
        return adT - position;
    }

    public void mw()
    {
        if (mv() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void p(byte abyte0[])
        throws IOException
    {
        c(abyte0, 0, abyte0.length);
    }

    public void y(long l)
        throws IOException
    {
        C(l);
    }

    public void z(long l)
        throws IOException
    {
        C(E(l));
    }
}
