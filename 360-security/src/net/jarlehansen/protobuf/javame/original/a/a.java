// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame.original.a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.jarlehansen.protobuf.javame.b;

public final class a
{

    private final byte a[];
    private final int b;
    private int c;

    private a(byte abyte0[], int i, int j)
    {
        a = abyte0;
        c = i;
        b = i + j;
    }

    public static int a(int i)
    {
        return c(net.jarlehansen.protobuf.javame.original.a.a(i, 0));
    }

    public static a a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    private static a a(byte abyte0[], int i, int j)
    {
        return new a(abyte0, i, j);
    }

    private void a(byte byte0)
        throws IOException
    {
        byte abyte0[] = a;
        int i = c;
        c = i + 1;
        abyte0[i] = byte0;
    }

    private void a(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                d((int)l);
                return;
            }
            d((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public static int b(int i, double d1)
    {
        return a(i) + 8;
    }

    public static int b(int i, float f)
    {
        return a(i) + 4;
    }

    public static int b(int i, long l)
    {
        return a(i) + b(l);
    }

    public static int b(int i, String s)
    {
        if (s == null)
        {
            return 0;
        }
        int j;
        int k;
        try
        {
            s = s.getBytes("UTF-8");
            i = a(i);
            j = c(s.length);
            k = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException("UTF-8 not supported.");
        }
        return k + (i + j);
    }

    public static int b(int i, b b1)
    {
        if (b1 == null)
        {
            return 0;
        } else
        {
            return a(i) + c(b1.a()) + b1.a();
        }
    }

    public static int b(int i, boolean flag)
    {
        return a(i) + 1;
    }

    private static int b(long l)
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

    private void b(byte abyte0[])
        throws IOException
    {
        if (abyte0 == null)
        {
            return;
        } else
        {
            b(abyte0, 0, abyte0.length);
            return;
        }
    }

    private void b(byte abyte0[], int i, int j)
        throws IOException
    {
        if (abyte0 != null)
        {
            if (b - c >= j)
            {
                System.arraycopy(abyte0, i, a, c, j);
                c = c + j;
                return;
            }
            int k = b - c;
            System.arraycopy(abyte0, i, a, c, k);
            j -= k;
            c = b;
            if (j <= b)
            {
                System.arraycopy(abyte0, i + k, a, 0, j);
                c = j;
                return;
            }
        }
    }

    public static int c(int i)
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

    public static int c(int i, int j)
    {
        if (j >= 0)
        {
            return a(i) + c(j);
        } else
        {
            return a(i) + 10;
        }
    }

    private void c(long l)
        throws IOException
    {
        d((int)l & 0xff);
        d((int)(l >> 8) & 0xff);
        d((int)(l >> 16) & 0xff);
        d((int)(l >> 24) & 0xff);
        d((int)(l >> 32) & 0xff);
        d((int)(l >> 40) & 0xff);
        d((int)(l >> 48) & 0xff);
        d((int)(l >> 56) & 0xff);
    }

    private void d(int i)
        throws IOException
    {
        a((byte)i);
    }

    private void d(int i, int j)
        throws IOException
    {
        b(net.jarlehansen.protobuf.javame.original.a.a(i, j));
    }

    private void e(int i)
        throws IOException
    {
        d(i & 0xff);
        d(i >> 8 & 0xff);
        d(i >> 16 & 0xff);
        d(i >> 24 & 0xff);
    }

    public void a(int i, double d1)
        throws IOException
    {
        d(i, 1);
        c(Double.doubleToLongBits(d1));
    }

    public void a(int i, float f)
        throws IOException
    {
        d(i, 5);
        e(Float.floatToIntBits(f));
    }

    public void a(int i, int j)
        throws IOException
    {
        d(i, 0);
        if (j >= 0)
        {
            b(j);
            return;
        } else
        {
            a(j);
            return;
        }
    }

    public void a(int i, long l)
        throws IOException
    {
        d(i, 0);
        a(l);
    }

    public void a(int i, String s)
        throws IOException
    {
        if (s == null)
        {
            return;
        } else
        {
            d(i, 2);
            s = s.getBytes("UTF-8");
            b(s.length);
            b(s);
            return;
        }
    }

    public void a(int i, b b1)
        throws IOException
    {
        if (b1 == null)
        {
            return;
        } else
        {
            d(i, 2);
            b1 = b1.b();
            b(b1.length);
            b(b1);
            return;
        }
    }

    public void a(int i, boolean flag)
        throws IOException
    {
        boolean flag1 = false;
        d(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        d(i);
    }

    public void b(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                d(i);
                return;
            }
            d(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void b(int i, int j)
        throws IOException
    {
        d(i, 2);
        b(j);
    }
}
