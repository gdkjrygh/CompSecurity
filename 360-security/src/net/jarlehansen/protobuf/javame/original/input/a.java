// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.jarlehansen.protobuf.javame.original.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.b;

// Referenced classes of package net.jarlehansen.protobuf.javame.original.input:
//            InvalidProtocolBufferException

public final class a
{

    private byte a[];
    private int b;
    private int c;
    private int d;
    private InputStream e;
    private int f;
    private int g;
    private int h;
    private int i;

    private a(byte abyte0[], int i1, int j1)
    {
        c = 0;
        f = 0;
        g = 0;
        h = 0x7fffffff;
        i = 0x4000000;
        a = abyte0;
        b = i1 + j1;
        d = i1;
        e = null;
    }

    public static a a(byte abyte0[])
    {
        return new a(abyte0, 0, abyte0.length);
    }

    private boolean a(boolean flag)
        throws IOException
    {
        if (d < b)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (g + b == h)
        {
            if (flag)
            {
                throw InvalidProtocolBufferException.a();
            } else
            {
                return false;
            }
        }
        g = g + b;
        d = 0;
        int i1;
        if (e == null)
        {
            i1 = -1;
        } else
        {
            i1 = e.read(a);
        }
        b = i1;
        if (b == -1)
        {
            b = 0;
            if (flag)
            {
                throw InvalidProtocolBufferException.a();
            } else
            {
                return false;
            }
        }
        m();
        i1 = g + b + c;
        if (i1 > i || i1 < 0)
        {
            throw InvalidProtocolBufferException.e();
        } else
        {
            return true;
        }
    }

    private int[] b(int i1)
        throws IOException
    {
        int j1;
        int k1;
        k1 = c(i1);
        j1 = i1 + 1;
        if (k1 >= 0)
        {
            return (new int[] {
                k1, j1
            });
        }
        i1 = k1 & 0x7f;
        k1 = c(j1);
        if (k1 < 0) goto _L2; else goto _L1
_L1:
        j1++;
        i1 |= k1 << 7;
_L4:
        return (new int[] {
            i1, j1
        });
_L2:
        i1 |= (k1 & 0x7f) << 7;
        k1 = c(j1);
        if (k1 >= 0)
        {
            j1++;
            i1 |= k1 << 14;
            continue; /* Loop/switch isn't completed */
        }
        i1 |= (k1 & 0x7f) << 14;
        k1 = c(j1);
        if (k1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1++;
        i1 |= k1 << 21;
        if (true) goto _L4; else goto _L3
_L3:
        byte byte0 = c(j1);
        i1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        k1 = j1 + 1;
        j1 = k1;
        if (byte0 < 0)
        {
            for (i1 = 0; i1 < 5; i1++)
            {
                if (c(k1) >= 0)
                {
                    return (new int[] {
                        byte0, k1 + 1
                    });
                }
            }

            throw InvalidProtocolBufferException.c();
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private byte c(int i1)
        throws IOException
    {
        return a[i1];
    }

    private byte[] d(int i1)
        throws IOException
    {
        if (i1 < 0)
        {
            throw net.jarlehansen.protobuf.javame.original.input.InvalidProtocolBufferException.b();
        }
        if (g + d + i1 > h)
        {
            e(h - g - d);
            throw InvalidProtocolBufferException.a();
        }
        if (i1 <= b - d)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, d, abyte0, 0, i1);
            d = d + i1;
            return abyte0;
        }
        if (i1 < 2048)
        {
            byte abyte1[] = new byte[i1];
            int j1 = b - d;
            System.arraycopy(a, d, abyte1, 0, j1);
            d = b;
            a(true);
            while (i1 - j1 > b) 
            {
                System.arraycopy(a, 0, abyte1, j1, b);
                j1 += b;
                d = b;
                a(true);
            }
            System.arraycopy(a, 0, abyte1, j1, i1 - j1);
            d = i1 - j1;
            return abyte1;
        }
        int l2 = d;
        int i3 = b;
        g = g + b;
        d = 0;
        b = 0;
        Vector vector = new Vector();
        int j2;
        for (int k1 = i1 - (i3 - l2); k1 > 0; k1 -= j2)
        {
            byte abyte2[] = new byte[Math.min(k1, 2048)];
            int k2;
            for (int i2 = 0; i2 < abyte2.length; i2 += k2)
            {
                if (e == null)
                {
                    k2 = -1;
                } else
                {
                    k2 = e.read(abyte2, i2, abyte2.length - i2);
                }
                if (k2 == -1)
                {
                    throw InvalidProtocolBufferException.a();
                }
                g = g + k2;
            }

            j2 = abyte2.length;
            vector.addElement(abyte2);
        }

        byte abyte3[] = new byte[i1];
        int l1 = i3 - l2;
        System.arraycopy(a, l2, abyte3, 0, l1);
        for (i1 = 0; i1 < vector.size(); i1++)
        {
            byte abyte4[] = (byte[])(byte[])vector.elementAt(i1);
            System.arraycopy(abyte4, 0, abyte3, l1, abyte4.length);
            l1 += abyte4.length;
        }

        return abyte3;
    }

    private void e(int i1)
        throws IOException
    {
        if (i1 < 0)
        {
            throw net.jarlehansen.protobuf.javame.original.input.InvalidProtocolBufferException.b();
        }
        if (g + d + i1 > h)
        {
            e(h - g - d);
            throw InvalidProtocolBufferException.a();
        }
        if (i1 < b - d)
        {
            d = d + i1;
        } else
        {
            int j1 = b - d;
            g = g + j1;
            d = 0;
            b = 0;
            while (j1 < i1) 
            {
                int k1;
                if (e == null)
                {
                    k1 = -1;
                } else
                {
                    k1 = (int)e.skip(i1 - j1);
                }
                if (k1 <= 0)
                {
                    throw InvalidProtocolBufferException.a();
                }
                j1 += k1;
                g = k1 + g;
            }
        }
    }

    private int l()
        throws IOException
    {
        int i1 = n();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = n();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = n();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = n();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = n();
        k1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        i1 = k1;
        if (byte0 < 0)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= 5)
                    {
                        break label1;
                    }
                    i1 = k1;
                    if (n() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw InvalidProtocolBufferException.c();
    }

    private void m()
    {
        b = b + c;
        int i1 = g + b;
        if (i1 > h)
        {
            c = i1 - h;
            b = b - c;
            return;
        } else
        {
            c = 0;
            return;
        }
    }

    private byte n()
        throws IOException
    {
        if (d == b)
        {
            a(true);
        }
        byte abyte0[] = a;
        int i1 = d;
        d = i1 + 1;
        return abyte0[i1];
    }

    public int a()
        throws IOException
    {
        if (d == b && !a(false))
        {
            f = 0;
            return 0;
        }
        f = l();
        if (f == 0)
        {
            throw InvalidProtocolBufferException.d();
        } else
        {
            return f;
        }
    }

    public Vector a(int i1)
        throws IOException
    {
        Vector vector = new Vector();
        int j1 = l();
        int ai[] = new byte[j1];
        System.arraycopy(a, d, ai, 0, j1);
        vector.addElement(ai);
        d = j1 + d;
        j1 = d;
        if (d == b)
        {
            return vector;
        }
        ai = b(j1);
        j1 = ai[0];
        do
        {
label0:
            {
                if (net.jarlehansen.protobuf.javame.original.a.b(j1) == i1)
                {
                    d = ai[1];
                    j1 = l();
                    ai = new byte[j1];
                    System.arraycopy(a, d, ai, 0, j1);
                    vector.addElement(ai);
                    d = j1 + d;
                    if (d != b)
                    {
                        break label0;
                    }
                }
                return vector;
            }
            ai = b(d);
            j1 = ai[0];
        } while (true);
    }

    public double b()
        throws IOException
    {
        return Double.longBitsToDouble(k());
    }

    public float c()
        throws IOException
    {
        return Float.intBitsToFloat(j());
    }

    public long d()
        throws IOException
    {
        return i();
    }

    public int e()
        throws IOException
    {
        return l();
    }

    public boolean f()
        throws IOException
    {
        return l() != 0;
    }

    public String g()
        throws IOException
    {
        int i1 = l();
        if (i1 < b - d && i1 > 0)
        {
            String s = new String(a, d, i1, "UTF-8");
            d = i1 + d;
            return s;
        } else
        {
            return new String(d(i1), "UTF-8");
        }
    }

    public b h()
        throws IOException
    {
        int i1 = l();
        if (i1 < b - d && i1 > 0)
        {
            b b1 = net.jarlehansen.protobuf.javame.b.a(a, d, i1);
            d = i1 + d;
            return b1;
        } else
        {
            return net.jarlehansen.protobuf.javame.b.a(d(i1));
        }
    }

    public long i()
        throws IOException
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = n();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw InvalidProtocolBufferException.c();
    }

    int j()
        throws IOException
    {
        return n() & 0xff | (n() & 0xff) << 8 | (n() & 0xff) << 16 | (n() & 0xff) << 24;
    }

    long k()
        throws IOException
    {
        int i1 = n();
        int j1 = n();
        int k1 = n();
        int l1 = n();
        int i2 = n();
        int j2 = n();
        int k2 = n();
        int l2 = n();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }
}
