// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, ky, kq

public final class kp
{

    private final byte a[];
    private final int b;
    private int c;

    private kp(byte abyte0[], int i)
    {
        a = abyte0;
        c = 0;
        b = i + 0;
    }

    public static int a(int i)
    {
        return c(1) + b(i);
    }

    public static int a(long l)
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

    private static int a(String s)
    {
        int i;
        int j;
        try
        {
            s = s.getBytes("UTF-8");
            i = e(s.length);
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF-8 not supported.");
        }
        return j + i;
    }

    public static kp a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    public static kp a(byte abyte0[], int i)
    {
        return new kp(abyte0, i);
    }

    public static int b(int i)
    {
        if (i >= 0)
        {
            return e(i);
        } else
        {
            return 10;
        }
    }

    public static int b(int i, kv kv1)
    {
        i = c(i);
        int j = kv1.b();
        return i + (j + e(j));
    }

    public static int b(int i, String s)
    {
        return c(i) + a(s);
    }

    private void b(int i, int j)
    {
        d(ky.a(i, j));
    }

    private void b(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                f((int)l);
                return;
            }
            f((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public static int c(int i)
    {
        return e(ky.a(i, 0));
    }

    public static int c(int i, long l)
    {
        return c(i) + a(c(l));
    }

    private static long c(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int e(int i)
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

    private void f(int i)
    {
        byte byte0 = (byte)i;
        if (c == b)
        {
            throw new kq(c, b);
        } else
        {
            byte abyte0[] = a;
            i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public final int a()
    {
        return b - c;
    }

    public final void a(int i, int j)
    {
        b(i, 0);
        if (j >= 0)
        {
            d(j);
            return;
        } else
        {
            b(j);
            return;
        }
    }

    public final void a(int i, long l)
    {
        b(i, 0);
        b(l);
    }

    public final void a(int i, kv kv1)
    {
        b(i, 2);
        d(kv1.a());
        kv1.a(this);
    }

    public final void a(int i, String s)
    {
        b(i, 2);
        s = s.getBytes("UTF-8");
        d(s.length);
        b(s);
    }

    public final void a(int i, boolean flag)
    {
        boolean flag1 = false;
        b(i, 0);
        i = ((flag1) ? 1 : 0);
        if (flag)
        {
            i = 1;
        }
        f(i);
    }

    public final void b(int i, long l)
    {
        b(i, 0);
        b(c(l));
    }

    public final void b(byte abyte0[])
    {
        int i = abyte0.length;
        if (b - c >= i)
        {
            System.arraycopy(abyte0, 0, a, c, i);
            c = i + c;
            return;
        } else
        {
            throw new kq(c, b);
        }
    }

    public final void d(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                f(i);
                return;
            }
            f(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }
}
