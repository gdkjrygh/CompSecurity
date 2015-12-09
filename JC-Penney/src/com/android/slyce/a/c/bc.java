// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.e;
import com.android.slyce.a.am;
import com.android.slyce.a.ao;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.android.slyce.a.c:
//            bd, be, bf, bg, 
//            bh, bi

abstract class bc
{

    private static final List v = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10)
    });
    private static final List w = Arrays.asList(new Integer[] {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2)
    });
    e a;
    e b;
    e c;
    e d;
    e e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private byte p[];
    private byte q[];
    private boolean r;
    private ByteArrayOutputStream s;
    private Inflater t;
    private byte u[];
    private ao x;

    public bc(am am1)
    {
        f = true;
        g = false;
        p = new byte[0];
        q = new byte[0];
        r = false;
        s = new ByteArrayOutputStream();
        t = new Inflater(true);
        u = new byte[4096];
        a = new bd(this);
        b = new be(this);
        c = new bf(this);
        d = new bg(this);
        e = new bh(this);
        x = new ao();
        am1.a(x);
        a();
    }

    static int a(bc bc1)
    {
        return bc1.m;
    }

    static int a(bc bc1, int i1)
    {
        bc1.h = i1;
        return i1;
    }

    private static long a(byte abyte0[], int i1, int j1)
    {
        if (abyte0.length < j1)
        {
            throw new IllegalArgumentException("length must be less than or equal to b.length");
        }
        long l1 = 0L;
        for (int k1 = 0; k1 < j1; k1++)
        {
            l1 += (abyte0[k1 + i1] & 0xff) << (j1 - 1 - k1) * 8;
        }

        return l1;
    }

    private void a(byte byte0)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if ((byte0 & 0x40) == 64)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((byte0 & 0x20) == 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((byte0 & 0x10) == 16)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!g && flag2 || flag || flag1)
        {
            throw new bi("RSV not zero");
        }
        boolean flag3;
        if ((byte0 & 0x80) == 128)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        i = flag3;
        l = byte0 & 0xf;
        k = flag2;
        p = new byte[0];
        q = new byte[0];
        if (!v.contains(Integer.valueOf(l)))
        {
            throw new bi("Bad opcode");
        }
        if (!w.contains(Integer.valueOf(l)) && !i)
        {
            throw new bi("Expected non-final packet");
        } else
        {
            h = 1;
            return;
        }
    }

    static void a(bc bc1, byte byte0)
    {
        bc1.a(byte0);
    }

    static void a(bc bc1, byte abyte0[])
    {
        bc1.e(abyte0);
    }

    private byte[] a(int i1, String s1, int j1)
    {
        return a(i1, d(s1), j1);
    }

    private byte[] a(int i1, byte abyte0[], int j1)
    {
        return a(i1, abyte0, j1, 0, abyte0.length);
    }

    private byte[] a(int i1, byte abyte0[], int j1, int k1, int l1)
    {
        if (r)
        {
            return null;
        }
        byte abyte1[];
        byte byte0;
        byte byte1;
        char c1;
        int i2;
        int j2;
        if (j1 > 0)
        {
            byte1 = 2;
        } else
        {
            byte1 = 0;
        }
        i2 = (l1 + byte1) - k1;
        if (i2 <= 125)
        {
            byte0 = 2;
        } else
        if (i2 <= 65535)
        {
            byte0 = 4;
        } else
        {
            byte0 = 10;
        }
        if (f)
        {
            c1 = '\004';
        } else
        {
            c1 = '\0';
        }
        j2 = byte0 + c1;
        if (f)
        {
            c1 = '\200';
        } else
        {
            c1 = '\0';
        }
        abyte1 = new byte[i2 + j2];
        abyte1[0] = (byte)((byte)i1 | 0xffffff80);
        if (i2 <= 125)
        {
            abyte1[1] = (byte)(c1 | i2);
        } else
        if (i2 <= 65535)
        {
            abyte1[1] = (byte)(c1 | 0x7e);
            abyte1[2] = (byte)(i2 / 256);
            abyte1[3] = (byte)(i2 & 0xff);
        } else
        {
            abyte1[1] = (byte)(c1 | 0x7f);
            abyte1[2] = (byte)(int)((long)i2 / 0x100000000000000L & 255L);
            abyte1[3] = (byte)(int)((long)i2 / 0x1000000000000L & 255L);
            abyte1[4] = (byte)(int)((long)i2 / 0x10000000000L & 255L);
            abyte1[5] = (byte)(int)((long)i2 / 0x100000000L & 255L);
            abyte1[6] = (byte)(int)((long)i2 / 0x1000000L & 255L);
            abyte1[7] = (byte)(int)((long)i2 / 0x10000L & 255L);
            abyte1[8] = (byte)(int)((long)i2 / 256L & 255L);
            abyte1[9] = (byte)(i2 & 0xff);
        }
        if (j1 > 0)
        {
            abyte1[j2] = (byte)(j1 / 256 & 0xff);
            abyte1[j2 + 1] = (byte)(j1 & 0xff);
        }
        System.arraycopy(abyte0, k1, abyte1, j2 + byte1, l1 - k1);
        if (f)
        {
            abyte0 = new byte[4];
            abyte0[0] = (byte)(int)Math.floor(Math.random() * 256D);
            abyte0[1] = (byte)(int)Math.floor(Math.random() * 256D);
            abyte0[2] = (byte)(int)Math.floor(Math.random() * 256D);
            abyte0[3] = (byte)(int)Math.floor(Math.random() * 256D);
            System.arraycopy(abyte0, 0, abyte1, byte0, abyte0.length);
            a(abyte1, abyte0, j2);
        }
        return abyte1;
    }

    private byte[] a(byte abyte0[], int i1)
    {
        byte abyte1[] = new byte[abyte0.length - i1];
        System.arraycopy(abyte0, i1, abyte1, 0, abyte0.length - i1);
        return abyte1;
    }

    private static byte[] a(byte abyte0[], byte abyte1[], int i1)
    {
        if (abyte1.length != 0)
        {
            int j1 = 0;
            while (j1 < abyte0.length - i1) 
            {
                abyte0[i1 + j1] = (byte)(abyte0[i1 + j1] ^ abyte1[j1 % 4]);
                j1++;
            }
        }
        return abyte0;
    }

    private void b()
    {
        int i1 = 0;
        byte abyte0[] = a(q, p, 0);
        Object obj = abyte0;
        int j1;
        if (k)
        {
            try
            {
                obj = d(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IOException("Invalid deflated data");
            }
        }
        j1 = l;
        if (j1 == 0)
        {
            if (o == 0)
            {
                throw new bi("Mode was not set.");
            }
            s.write(((byte []) (obj)));
            if (i)
            {
                obj = s.toByteArray();
                if (o == 1)
                {
                    b(f(((byte []) (obj))));
                } else
                {
                    b(((byte []) (obj)));
                }
                c();
            }
        } else
        {
            if (j1 == 1)
            {
                if (i)
                {
                    b(f(((byte []) (obj))));
                    return;
                } else
                {
                    o = 1;
                    s.write(((byte []) (obj)));
                    return;
                }
            }
            if (j1 == 2)
            {
                if (i)
                {
                    b(((byte []) (obj)));
                    return;
                } else
                {
                    o = 2;
                    s.write(((byte []) (obj)));
                    return;
                }
            }
            if (j1 == 8)
            {
                if (obj.length >= 2)
                {
                    i1 = (obj[0] & 0xff) * 256 + (obj[1] & 0xff);
                }
                if (obj.length > 2)
                {
                    obj = f(a(((byte []) (obj)), 2));
                } else
                {
                    obj = null;
                }
                a(i1, ((String) (obj)));
                return;
            }
            if (j1 == 9)
            {
                if (obj.length > 125)
                {
                    throw new bi("Ping payload too large");
                } else
                {
                    c(a(10, ((byte []) (obj)), -1));
                    return;
                }
            }
            if (j1 == 10)
            {
                c(f(((byte []) (obj))));
                return;
            }
        }
    }

    private void b(byte byte0)
    {
        boolean flag;
        if ((byte0 & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        n = byte0 & 0x7f;
        if (n >= 0 && n <= 125)
        {
            if (j)
            {
                byte0 = 3;
            } else
            {
                byte0 = 4;
            }
            h = byte0;
            return;
        }
        if (n == 126)
        {
            byte0 = 2;
        } else
        {
            byte0 = 8;
        }
        m = byte0;
        h = 2;
    }

    static void b(bc bc1, byte byte0)
    {
        bc1.b(byte0);
    }

    static byte[] b(bc bc1)
    {
        return bc1.p;
    }

    static byte[] b(bc bc1, byte abyte0[])
    {
        bc1.p = abyte0;
        return abyte0;
    }

    static int c(bc bc1)
    {
        return bc1.n;
    }

    private void c()
    {
        o = 0;
        s.reset();
    }

    static byte[] c(bc bc1, byte abyte0[])
    {
        bc1.q = abyte0;
        return abyte0;
    }

    static byte[] d(bc bc1)
    {
        return bc1.q;
    }

    private byte[] d(String s1)
    {
        try
        {
            s1 = s1.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new RuntimeException(s1);
        }
        return s1;
    }

    private byte[] d(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        t.setInput(abyte0);
        int i1;
        for (; !t.needsInput(); bytearrayoutputstream.write(u, 0, i1))
        {
            i1 = t.inflate(u);
        }

        t.setInput(new byte[] {
            0, 0, -1, -1
        });
        int j1;
        for (; !t.needsInput(); bytearrayoutputstream.write(u, 0, j1))
        {
            j1 = t.inflate(u);
        }

        return bytearrayoutputstream.toByteArray();
    }

    static void e(bc bc1)
    {
        bc1.b();
    }

    private void e(byte abyte0[])
    {
        n = g(abyte0);
        int i1;
        if (j)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        h = i1;
    }

    private String f(byte abyte0[])
    {
        try
        {
            abyte0 = new String(abyte0, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    private int g(byte abyte0[])
    {
        long l1 = a(abyte0, 0, abyte0.length);
        if (l1 < 0L || l1 > 0x7fffffffL)
        {
            throw new bi((new StringBuilder()).append("Bad integer: ").append(l1).toString());
        } else
        {
            return (int)l1;
        }
    }

    void a()
    {
        switch (h)
        {
        default:
            return;

        case 0: // '\0'
            x.a(1, a);
            return;

        case 1: // '\001'
            x.a(1, b);
            return;

        case 2: // '\002'
            x.a(m, c);
            return;

        case 3: // '\003'
            x.a(4, d);
            return;

        case 4: // '\004'
            x.a(n, e);
            break;
        }
    }

    protected abstract void a(int i1, String s1);

    protected abstract void a(Exception exception);

    public void a(boolean flag)
    {
        f = flag;
    }

    public byte[] a(String s1)
    {
        return a(1, s1, -1);
    }

    public byte[] a(byte abyte0[])
    {
        return a(2, abyte0, -1);
    }

    protected abstract void b(String s1);

    public void b(boolean flag)
    {
        g = flag;
    }

    protected abstract void b(byte abyte0[]);

    protected abstract void c(String s1);

    protected abstract void c(byte abyte0[]);

}
