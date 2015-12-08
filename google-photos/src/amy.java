// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

public final class amy
{

    public ByteBuffer a;
    public amx b;
    private final byte c[] = new byte[256];
    private int d;

    public amy()
    {
        d = 0;
    }

    private int[] b(int i)
    {
        int ai[];
        byte abyte0[];
        int k;
        k = 0;
        ai = null;
        abyte0 = new byte[i * 3];
        int ai1[];
        a.get(abyte0);
        ai1 = new int[256];
        int j = 0;
        do
        {
            ai = ai1;
            if (j >= i)
            {
                break;
            }
            int i1 = k + 1;
            byte byte0 = abyte0[k];
            int l = i1 + 1;
            i1 = abyte0[i1];
            k = l + 1;
            ai1[j] = (byte0 & 0xff) << 16 | 0xff000000 | (i1 & 0xff) << 8 | abyte0[l] & 0xff;
            j++;
        } while (true);
        break MISSING_BLOCK_LABEL_125;
        BufferUnderflowException bufferunderflowexception;
        bufferunderflowexception;
        b.b = 1;
        return ai;
    }

    private void d()
    {
        do
        {
            f();
        } while (d > 0 && !c());
    }

    private void e()
    {
        int i;
        do
        {
            i = g();
            a.position(a.position() + i);
        } while (i > 0);
    }

    private int f()
    {
        int i;
        int i1;
        i1 = 0;
        i = 0;
        d = g();
        if (d <= 0) goto _L2; else goto _L1
_L1:
        int j = 0;
_L3:
        int l;
        l = j;
        i1 = i;
        if (i >= d)
        {
            break; /* Loop/switch isn't completed */
        }
        l = j;
        j = d - i;
        l = j;
        a.get(c, i, j);
        i += j;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        if (Log.isLoggable("GifHeaderParser", 3))
        {
            int k = d;
            (new StringBuilder(76)).append("Error Reading Block n: ").append(i).append(" count: ").append(l).append(" blockSize: ").append(k);
        }
        b.b = 1;
        i1 = i;
_L2:
        return i1;
    }

    private int g()
    {
        byte byte0;
        try
        {
            byte0 = a.get();
        }
        catch (Exception exception)
        {
            b.b = 1;
            return 0;
        }
        return byte0 & 0xff;
    }

    public final amy a(ByteBuffer bytebuffer)
    {
        a = null;
        Arrays.fill(c, (byte)0);
        b = new amx();
        d = 0;
        a = bytebuffer.asReadOnlyBuffer();
        a.position(0);
        a.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void a(int i)
    {
        boolean flag = false;
        do
        {
            if (flag || c() || b.c > i)
            {
                break;
            }
            switch (g())
            {
            default:
                b.b = 1;
                continue;

            case 44: // ','
                if (b.d == null)
                {
                    b.d = new amw();
                }
                b.d.a = a.getShort();
                b.d.b = a.getShort();
                b.d.c = a.getShort();
                b.d.d = a.getShort();
                int l = g();
                amw amw1;
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
                amw1 = b.d;
                if ((l & 0x40) != 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                amw1.e = flag2;
                if (flag1)
                {
                    b.d.k = b(i1);
                } else
                {
                    b.d.k = null;
                }
                b.d.j = a.position();
                g();
                e();
                if (!c())
                {
                    amx amx1 = b;
                    amx1.c = amx1.c + 1;
                    b.e.add(b.d);
                }
                continue;

            case 33: // '!'
                switch (g())
                {
                default:
                    e();
                    break;

                case 249: 
                    b.d = new amw();
                    g();
                    int j = g();
                    b.d.g = (j & 0x1c) >> 2;
                    if (b.d.g == 0)
                    {
                        b.d.g = 1;
                    }
                    amw amw2 = b.d;
                    short word0;
                    boolean flag3;
                    if ((j & 1) != 0)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    amw2.f = flag3;
                    word0 = a.getShort();
                    j = word0;
                    if (word0 < 2)
                    {
                        j = 10;
                    }
                    b.d.i = j * 10;
                    b.d.h = g();
                    g();
                    break;

                case 255: 
                    f();
                    String s = "";
                    for (int k = 0; k < 11; k++)
                    {
                        s = String.valueOf(s);
                        char c1 = (char)c[k];
                        s = (new StringBuilder(String.valueOf(s).length() + 1)).append(s).append(c1).toString();
                    }

                    if (s.equals("NETSCAPE2.0"))
                    {
                        d();
                    } else
                    {
                        e();
                    }
                    break;

                case 254: 
                    e();
                    break;

                case 1: // '\001'
                    e();
                    break;
                }
                break;

            case 59: // ';'
                flag = true;
                break;
            }
        } while (true);
    }

    public final boolean a()
    {
        b();
        if (!c())
        {
            a(2);
        }
        return b.c > 1;
    }

    public void b()
    {
        boolean flag = true;
        String s = "";
        for (int i = 0; i < 6; i++)
        {
            s = String.valueOf(s);
            char c1 = (char)g();
            s = (new StringBuilder(String.valueOf(s).length() + 1)).append(s).append(c1).toString();
        }

        if (!s.startsWith("GIF"))
        {
            b.b = 1;
        } else
        {
            b.f = a.getShort();
            b.g = a.getShort();
            int j = g();
            amx amx1 = b;
            if ((j & 0x80) == 0)
            {
                flag = false;
            }
            amx1.h = flag;
            b.i = 2 << (j & 7);
            b.j = g();
            g();
            if (b.h && !c())
            {
                b.a = b(b.i);
                b.k = b.a[b.j];
                return;
            }
        }
    }

    public boolean c()
    {
        return b.b != 0;
    }
}
