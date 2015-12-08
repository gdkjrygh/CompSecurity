// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;

import com.microsoft.a.b.a;
import java.io.IOException;

// Referenced classes of package com.microsoft.a:
//            i, g, h, a, 
//            f

public final class b extends i
{

    public static final short a;
    private final a b;
    private final h c;
    private final byte d[] = new byte[10];

    private b(h h1, a a1)
    {
        c = h1;
        b = a1;
    }

    public static b a(a a1)
    {
        return new b(com.microsoft.a.h.a, a1);
    }

    private void a(byte byte0)
        throws IOException
    {
        b.a(byte0);
    }

    private void b(int j)
        throws IOException
    {
        j = com.microsoft.a.a.a.a(j, d, 0);
        b.a(d, j);
    }

    public final void a()
        throws IOException
    {
        a((byte)com.microsoft.a.a.a.a());
    }

    public final void a(double d1)
        throws IOException
    {
        byte abyte0[] = d;
        long l = Double.doubleToRawLongBits(d1);
        abyte0[0] = (byte)(int)l;
        abyte0[1] = (byte)(int)(l >> 8);
        abyte0[2] = (byte)(int)(l >> 16);
        abyte0[3] = (byte)(int)(l >> 24);
        abyte0[4] = (byte)(int)(l >> 32);
        abyte0[5] = (byte)(int)(l >> 40);
        abyte0[6] = (byte)(int)(l >> 48);
        abyte0[7] = (byte)(int)(l >> 56);
        b.a(d, 8);
    }

    public final void a(int j)
        throws IOException
    {
        j = com.microsoft.a.a.a.a(j << 1 ^ j >> 31, d, 0);
        b.a(d, j);
    }

    public final void a(int j, com.microsoft.a.a a1)
        throws IOException
    {
        a((byte)a1.a());
        b(j);
    }

    public final void a(int j, com.microsoft.a.a a1, com.microsoft.a.a a2)
        throws IOException
    {
        a((byte)a1.a());
        a((byte)a2.a());
        b(j);
    }

    public final void a(long l)
        throws IOException
    {
        long l1 = l << 1 ^ l >> 63;
        byte abyte0[] = d;
        byte byte0 = 0;
        l = l1;
        if ((-128L & l1) != 0L)
        {
            byte0 = 1;
            abyte0[0] = (byte)(int)(127L & l1 | 128L);
            l1 >>>= 7;
            l = l1;
            if ((-128L & l1) != 0L)
            {
                byte0 = 2;
                abyte0[1] = (byte)(int)(127L & l1 | 128L);
                l1 >>>= 7;
                l = l1;
                if ((-128L & l1) != 0L)
                {
                    byte0 = 3;
                    abyte0[2] = (byte)(int)(127L & l1 | 128L);
                    l1 >>>= 7;
                    l = l1;
                    if ((-128L & l1) != 0L)
                    {
                        byte0 = 4;
                        abyte0[3] = (byte)(int)(127L & l1 | 128L);
                        l1 >>>= 7;
                        l = l1;
                        if ((-128L & l1) != 0L)
                        {
                            byte0 = 5;
                            abyte0[4] = (byte)(int)(127L & l1 | 128L);
                            l1 >>>= 7;
                            l = l1;
                            if ((-128L & l1) != 0L)
                            {
                                byte0 = 6;
                                abyte0[5] = (byte)(int)(127L & l1 | 128L);
                                l1 >>>= 7;
                                l = l1;
                                if ((-128L & l1) != 0L)
                                {
                                    byte0 = 7;
                                    abyte0[6] = (byte)(int)(127L & l1 | 128L);
                                    l1 >>>= 7;
                                    l = l1;
                                    if ((-128L & l1) != 0L)
                                    {
                                        byte0 = 8;
                                        abyte0[7] = (byte)(int)(127L & l1 | 128L);
                                        l1 >>>= 7;
                                        l = l1;
                                        if ((-128L & l1) != 0L)
                                        {
                                            byte0 = 9;
                                            abyte0[8] = (byte)(int)(127L & l1 | 128L);
                                            l = l1 >>> 7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        abyte0[byte0] = (byte)(int)(l & 127L);
        b.a(d, byte0 + 1);
    }

    public final void a(com.microsoft.a.a a1, int j)
        throws IOException
    {
        byte byte0 = (byte)a1.a();
        if (j <= 5)
        {
            b.a((byte)(j << 5 | byte0));
            return;
        }
        if (j <= 255)
        {
            b.a((byte)(byte0 | 0xc0));
            b.a((byte)j);
            return;
        } else
        {
            b.a((byte)(byte0 | 0xe0));
            b.a((byte)j);
            b.a((byte)(j >>> 8));
            return;
        }
    }

    public final void a(String s)
        throws IOException
    {
        if (s.isEmpty())
        {
            b(0);
            return;
        } else
        {
            s = com.microsoft.a.a.b.a(s);
            b(s.length);
            b.a(s);
            return;
        }
    }

    public final boolean a(f f1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[f.values().length];
                try
                {
                    a[f.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.microsoft.a.f.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.microsoft.a._cls1.a[f1.ordinal()])
        {
        default:
            return super.a(f1);

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    public final String toString()
    {
        return String.format("[%s version=%d]", new Object[] {
            getClass().getName(), Short.valueOf(c.a())
        });
    }

    static 
    {
        a = (short)g.c.a();
    }
}
