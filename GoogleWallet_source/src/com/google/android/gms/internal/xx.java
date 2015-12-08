// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            ye, yh

public final class xx
{
    public static final class a extends IOException
    {

        a(int i, int k)
        {
            super((new StringBuilder("CodedOutputStream was writing to a flat byte array and ran out of space (pos ")).append(i).append(" limit ").append(k).append(").").toString());
        }
    }


    private final int aLZ;
    private final byte buffer[];
    private int position;

    private xx(byte abyte0[], int i, int k)
    {
        buffer = abyte0;
        position = i;
        aLZ = i + k;
    }

    public static int E(int i, int k)
    {
        return ml(i) + mi(k);
    }

    private void F(long l)
        throws IOException
    {
        J(l);
    }

    private static int H(long l)
    {
        return K(l);
    }

    private void J(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                mk((int)l);
                return;
            }
            mk((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    private static int K(long l)
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

    private void ab(boolean flag)
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
        mk(i);
    }

    private static int ac(boolean flag)
    {
        return 1;
    }

    public static int b(int i, ye ye1)
    {
        return (ml(i) << 1) + d(ye1);
    }

    private static xx b(byte abyte0[], int i, int k)
    {
        return new xx(abyte0, i, k);
    }

    private void b(byte byte0)
        throws IOException
    {
        if (position == aLZ)
        {
            throw new a(position, aLZ);
        } else
        {
            byte abyte0[] = buffer;
            int i = position;
            position = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public static int c(int i, ye ye1)
    {
        return ml(i) + e(ye1);
    }

    public static int c(int i, boolean flag)
    {
        return ml(i) + ac(flag);
    }

    private void c(byte abyte0[], int i, int k)
        throws IOException
    {
        if (aLZ - position >= k)
        {
            System.arraycopy(abyte0, i, buffer, position, k);
            position = position + k;
            return;
        } else
        {
            throw new a(position, aLZ);
        }
    }

    public static int d(int i, long l)
    {
        return ml(i) + H(l);
    }

    private static int d(ye ye1)
    {
        return ye1.getSerializedSize();
    }

    private static int e(ye ye1)
    {
        int i = ye1.getSerializedSize();
        return i + mn(i);
    }

    private void ew(String s)
        throws IOException
    {
        s = s.getBytes("UTF-8");
        mm(s.length);
        x(s);
    }

    private static int ex(String s)
    {
        int i;
        int k;
        try
        {
            s = s.getBytes("UTF-8");
            i = mn(s.length);
            k = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return k + i;
    }

    public static int j(int i, String s)
    {
        return ml(i) + ex(s);
    }

    private void mg(int i)
        throws IOException
    {
        if (i >= 0)
        {
            mm(i);
            return;
        } else
        {
            J(i);
            return;
        }
    }

    public static int mi(int i)
    {
        if (i >= 0)
        {
            return mn(i);
        } else
        {
            return 10;
        }
    }

    private void mk(int i)
        throws IOException
    {
        b((byte)i);
    }

    private static int ml(int i)
    {
        return mn(yh.H(i, 0));
    }

    public static int mn(int i)
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

    public static xx u(byte abyte0[])
    {
        return b(abyte0, 0, abyte0.length);
    }

    public final void C(int i, int k)
        throws IOException
    {
        G(i, 0);
        mg(k);
    }

    public final void G(int i, int k)
        throws IOException
    {
        mm(yh.H(i, k));
    }

    public final void a(int i, ye ye1)
        throws IOException
    {
        G(i, 2);
        c(ye1);
    }

    public final void b(int i, long l)
        throws IOException
    {
        G(i, 0);
        F(l);
    }

    public final void b(int i, String s)
        throws IOException
    {
        G(i, 2);
        ew(s);
    }

    public final void b(int i, boolean flag)
        throws IOException
    {
        G(i, 0);
        ab(flag);
    }

    public final void b(ye ye1)
        throws IOException
    {
        ye1.writeTo(this);
    }

    public final void c(ye ye1)
        throws IOException
    {
        mm(ye1.getCachedSize());
        ye1.writeTo(this);
    }

    public final void mm(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                mk(i);
                return;
            }
            mk(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void x(byte abyte0[])
        throws IOException
    {
        c(abyte0, 0, abyte0.length);
    }
}
