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
//            c, b

public class d
{

    private final byte a[] = new byte[256];
    private ByteBuffer b;
    private c c;
    private int d;

    public d()
    {
        d = 0;
    }

    private int[] a(int i1)
    {
        byte abyte0[];
        int j1;
        j1 = 0;
        abyte0 = new byte[i1 * 3];
        int ai1[];
        b.get(abyte0);
        ai1 = new int[256];
        int ai[];
        int k1 = 0;
        do
        {
            ai = ai1;
            if (j1 >= i1)
            {
                break;
            }
            int i2 = k1 + 1;
            byte byte0 = abyte0[k1];
            int l1 = i2 + 1;
            i2 = abyte0[i2];
            k1 = l1 + 1;
            ai1[j1] = (byte0 & 0xff) << 16 | 0xff000000 | (i2 & 0xff) << 8 | abyte0[l1] & 0xff;
            j1++;
        } while (true);
        break MISSING_BLOCK_LABEL_143;
        BufferUnderflowException bufferunderflowexception;
        bufferunderflowexception;
        ai = null;
        if (Log.isLoggable("GifHeaderParser", 3))
        {
            Log.d("GifHeaderParser", "Format Error Reading Color Table", bufferunderflowexception);
        }
        c.b = 1;
        return ai;
    }

    private void c()
    {
        b = null;
        Arrays.fill(a, (byte)0);
        c = new c();
        d = 0;
    }

    private void d()
    {
        boolean flag = false;
        do
        {
            if (flag || o())
            {
                break;
            }
            switch (m())
            {
            default:
                c.b = 1;
                continue;

            case 44: // ','
                if (c.d == null)
                {
                    c.d = new b();
                }
                f();
                continue;

            case 33: // '!'
                switch (m())
                {
                default:
                    k();
                    break;

                case 249: 
                    c.d = new b();
                    e();
                    break;

                case 255: 
                    l();
                    String s = "";
                    for (int i1 = 0; i1 < 11; i1++)
                    {
                        s = (new StringBuilder()).append(s).append((char)a[i1]).toString();
                    }

                    if (s.equals("NETSCAPE2.0"))
                    {
                        g();
                    } else
                    {
                        k();
                    }
                    break;

                case 254: 
                    k();
                    break;

                case 1: // '\001'
                    k();
                    break;
                }
                break;

            case 59: // ';'
                flag = true;
                break;
            }
        } while (true);
    }

    private void e()
    {
        boolean flag = true;
        m();
        int i1 = m();
        c.d.g = (i1 & 0x1c) >> 2;
        if (c.d.g == 0)
        {
            c.d.g = 1;
        }
        b b1 = c.d;
        int j1;
        if ((i1 & 1) == 0)
        {
            flag = false;
        }
        b1.f = flag;
        j1 = n();
        i1 = j1;
        if (j1 < 3)
        {
            i1 = 10;
        }
        c.d.i = i1 * 10;
        c.d.h = m();
        m();
    }

    private void f()
    {
        boolean flag1 = true;
        c.d.a = n();
        c.d.b = n();
        c.d.c = n();
        c.d.d = n();
        int i1 = m();
        b b1;
        boolean flag;
        int j1;
        if ((i1 & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = (int)Math.pow(2D, (i1 & 7) + 1);
        b1 = c.d;
        if ((i1 & 0x40) == 0)
        {
            flag1 = false;
        }
        b1.e = flag1;
        if (flag)
        {
            c.d.k = a(j1);
        } else
        {
            c.d.k = null;
        }
        c.d.j = b.position();
        j();
        if (o())
        {
            return;
        } else
        {
            c c1 = c;
            c1.c = c1.c + 1;
            c.e.add(c.d);
            return;
        }
    }

    private void g()
    {
        do
        {
            l();
            if (a[0] == 1)
            {
                byte byte0 = a[1];
                byte byte1 = a[2];
                c.m = byte0 & 0xff | (byte1 & 0xff) << 8;
            }
        } while (d > 0 && !o());
    }

    private void h()
    {
        String s = "";
        for (int i1 = 0; i1 < 6; i1++)
        {
            s = (new StringBuilder()).append(s).append((char)m()).toString();
        }

        if (!s.startsWith("GIF"))
        {
            c.b = 1;
        } else
        {
            i();
            if (c.h && !o())
            {
                c.a = a(c.i);
                c.l = c.a[c.j];
                return;
            }
        }
    }

    private void i()
    {
        c.f = n();
        c.g = n();
        int i1 = m();
        c c1 = c;
        boolean flag;
        if ((i1 & 0x80) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.h = flag;
        c.i = 2 << (i1 & 7);
        c.j = m();
        c.k = m();
    }

    private void j()
    {
        m();
        k();
    }

    private void k()
    {
        int i1;
        do
        {
            i1 = m();
            b.position(b.position() + i1);
        } while (i1 > 0);
    }

    private int l()
    {
        int i1;
        int l1;
        l1 = 0;
        i1 = 0;
        d = m();
        if (d <= 0) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L3:
        int k1;
        k1 = j1;
        l1 = i1;
        if (i1 >= d)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = j1;
        j1 = d - i1;
        k1 = j1;
        b.get(a, i1, j1);
        i1 += j1;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        if (Log.isLoggable("GifHeaderParser", 3))
        {
            Log.d("GifHeaderParser", (new StringBuilder()).append("Error Reading Block n: ").append(i1).append(" count: ").append(k1).append(" blockSize: ").append(d).toString(), exception);
        }
        c.b = 1;
        l1 = i1;
_L2:
        return l1;
    }

    private int m()
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

    private int n()
    {
        return b.getShort();
    }

    private boolean o()
    {
        return c.b != 0;
    }

    public d a(byte abyte0[])
    {
        c();
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

    public void a()
    {
        b = null;
        c = null;
    }

    public c b()
    {
        if (b == null)
        {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (o())
        {
            return c;
        }
        h();
        if (!o())
        {
            d();
            if (c.c < 0)
            {
                c.b = 1;
            }
        }
        return c;
    }
}
