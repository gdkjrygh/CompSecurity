// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.wire.WireType;
import java.io.IOException;

public final class gxv
{

    private final byte a[];
    private final int b;
    private int c;

    public gxv(byte abyte0[], int i)
    {
        a = abyte0;
        c = 0;
        b = i;
    }

    public static int a(int i)
    {
        return b(a(i, WireType.a));
    }

    public static int a(int i, WireType wiretype)
    {
        return i << 3 | wiretype.value;
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

    public static int b(int i)
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

    public static long d(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int f(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public final void a(byte abyte0[])
    {
        int i = abyte0.length;
        if (b - c >= i)
        {
            System.arraycopy(abyte0, 0, a, c, i);
            c = i + c;
            return;
        } else
        {
            throw new IOException((new StringBuilder("Out of space: position=")).append(c).append(", limit=").append(b).toString());
        }
    }

    public final void b(int i, WireType wiretype)
    {
        d(a(i, wiretype));
    }

    public final void b(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                c((int)l);
                return;
            }
            c((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public final void c(int i)
    {
        byte byte0 = (byte)i;
        if (c == b)
        {
            throw new IOException((new StringBuilder("Out of space: position=")).append(c).append(", limit=").append(b).toString());
        } else
        {
            byte abyte0[] = a;
            i = c;
            c = i + 1;
            abyte0[i] = byte0;
            return;
        }
    }

    public final void c(long l)
    {
        c((int)l & 0xff);
        c((int)(l >> 8) & 0xff);
        c((int)(l >> 16) & 0xff);
        c((int)(l >> 24) & 0xff);
        c((int)(l >> 32) & 0xff);
        c((int)(l >> 40) & 0xff);
        c((int)(l >> 48) & 0xff);
        c((int)(l >> 56) & 0xff);
    }

    public final void d(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                c(i);
                return;
            }
            c(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public final void e(int i)
    {
        c(i & 0xff);
        c(i >> 8 & 0xff);
        c(i >> 16 & 0xff);
        c(i >>> 24);
    }
}
