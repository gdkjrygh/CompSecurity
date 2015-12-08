// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.b;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.bumptech.glide.b:
//            d, c

public final class e
{

    private final byte a[] = new byte[256];
    private ByteBuffer b;
    private d c;
    private int d;

    public e()
    {
        d = 0;
    }

    private int[] a(int j)
    {
        int ai[];
        byte abyte0[];
        int l;
        l = 0;
        ai = null;
        abyte0 = new byte[j * 3];
        int ai1[];
        b.get(abyte0);
        ai1 = new int[256];
        int k = 0;
        do
        {
            ai = ai1;
            if (k >= j)
            {
                break;
            }
            int j1 = l + 1;
            byte byte0 = abyte0[l];
            int i1 = j1 + 1;
            j1 = abyte0[j1];
            l = i1 + 1;
            ai1[k] = (byte0 & 0xff) << 16 | 0xff000000 | (j1 & 0xff) << 8 | abyte0[i1] & 0xff;
            k++;
        } while (true);
        break MISSING_BLOCK_LABEL_132;
        BufferUnderflowException bufferunderflowexception;
        bufferunderflowexception;
        Log.isLoggable("GifHeaderParser", 3);
        c.b = 1;
        return ai;
    }

    private void c()
    {
        boolean flag = false;
        do
        {
            if (flag || i())
            {
                break;
            }
            switch (h())
            {
            default:
                c.b = 1;
                continue;

            case 44: // ','
                if (c.d == null)
                {
                    c.d = new c();
                }
                c.d.a = b.getShort();
                c.d.b = b.getShort();
                c.d.c = b.getShort();
                c.d.d = b.getShort();
                int l = h();
                c c1;
                boolean flag1;
                int i1;
                boolean flag2;
                if ((l & 0x80) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                i1 = (int)Math.pow(2D, (l & 7) + 1);
                c1 = c.d;
                if ((l & 0x40) != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                c1.e = flag2;
                if (flag1)
                {
                    c.d.k = a(i1);
                } else
                {
                    c.d.k = null;
                }
                c.d.j = b.position();
                h();
                f();
                if (!i())
                {
                    d d1 = c;
                    d1.c = d1.c + 1;
                    c.e.add(c.d);
                }
                continue;

            case 33: // '!'
                switch (h())
                {
                default:
                    f();
                    break;

                case 249: 
                    c.d = new c();
                    h();
                    int j = h();
                    c.d.g = (j & 0x1c) >> 2;
                    if (c.d.g == 0)
                    {
                        c.d.g = 1;
                    }
                    c c2 = c.d;
                    short word0;
                    boolean flag3;
                    if ((j & 1) != 0)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    c2.f = flag3;
                    word0 = b.getShort();
                    j = word0;
                    if (word0 < 3)
                    {
                        j = 10;
                    }
                    c.d.i = j * 10;
                    c.d.h = h();
                    h();
                    break;

                case 255: 
                    g();
                    String s = "";
                    for (int k = 0; k < 11; k++)
                    {
                        s = (new StringBuilder()).append(s).append((char)a[k]).toString();
                    }

                    if (s.equals("NETSCAPE2.0"))
                    {
                        d();
                    } else
                    {
                        f();
                    }
                    break;

                case 254: 
                    f();
                    break;

                case 1: // '\001'
                    f();
                    break;
                }
                break;

            case 59: // ';'
                flag = true;
                break;
            }
        } while (true);
    }

    private void d()
    {
        do
        {
            g();
            if (a[0] == 1)
            {
                byte byte0 = a[1];
                byte byte1 = a[2];
                c.m = byte0 & 0xff | (byte1 & 0xff) << 8;
            }
        } while (d > 0 && !i());
    }

    private void e()
    {
        boolean flag = true;
        String s = "";
        for (int j = 0; j < 6; j++)
        {
            s = (new StringBuilder()).append(s).append((char)h()).toString();
        }

        if (!s.startsWith("GIF"))
        {
            c.b = 1;
        } else
        {
            c.f = b.getShort();
            c.g = b.getShort();
            int k = h();
            d d1 = c;
            if ((k & 0x80) == 0)
            {
                flag = false;
            }
            d1.h = flag;
            c.i = 2 << (k & 7);
            c.j = h();
            c.k = h();
            if (c.h && !i())
            {
                c.a = a(c.i);
                c.l = c.a[c.j];
                return;
            }
        }
    }

    private void f()
    {
        int j;
        do
        {
            j = h();
            b.position(b.position() + j);
        } while (j > 0);
    }

    private int g()
    {
        int j;
        int i1;
        i1 = 0;
        j = 0;
        d = h();
        if (d <= 0) goto _L2; else goto _L1
_L1:
        int k = 0;
_L3:
        int l;
        l = k;
        i1 = j;
        if (j >= d)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k;
        k = d - j;
        l = k;
        b.get(a, j, k);
        j += k;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        if (Log.isLoggable("GifHeaderParser", 3))
        {
            (new StringBuilder("Error Reading Block n: ")).append(j).append(" count: ").append(l).append(" blockSize: ").append(d);
        }
        c.b = 1;
        i1 = j;
_L2:
        return i1;
    }

    private int h()
    {
        byte byte0;
        try
        {
            byte0 = b.get();
        }
        catch (Exception exception)
        {
            c.b = 1;
            return 0;
        }
        return byte0 & 0xff;
    }

    private boolean i()
    {
        return c.b != 0;
    }

    public final e a(byte abyte0[])
    {
        b = null;
        Arrays.fill(a, (byte)0);
        c = new d();
        d = 0;
        if (abyte0 != null)
        {
            b = ByteBuffer.wrap(abyte0);
            b.rewind();
            b.order(ByteOrder.LITTLE_ENDIAN);
            return this;
        } else
        {
            b = null;
            c.b = 2;
            return this;
        }
    }

    public final void a()
    {
        b = null;
        c = null;
    }

    public final d b()
    {
        if (b == null)
        {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (i())
        {
            return c;
        }
        e();
        if (!i())
        {
            c();
            if (c.c < 0)
            {
                c.b = 1;
            }
        }
        return c;
    }
}
