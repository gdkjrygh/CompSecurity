// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package b.a:
//            gn, gs, ha, fq, 
//            go, gk, gl, gm, 
//            gr

public final class ge extends gn
{

    private static final gs f = new gs();
    protected boolean a;
    protected boolean b;
    protected int c;
    protected boolean d;
    private byte g[];
    private byte h[];
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l[];
    private byte m[];
    private byte n[];

    public ge(ha ha1, boolean flag, boolean flag1)
    {
        super(ha1);
        a = false;
        b = true;
        d = false;
        g = new byte[1];
        h = new byte[2];
        i = new byte[4];
        j = new byte[8];
        k = new byte[1];
        l = new byte[2];
        m = new byte[4];
        n = new byte[8];
        a = flag;
        b = flag1;
    }

    private int a(byte abyte0[], int i1)
    {
        d(i1);
        return e.b(abyte0, i1);
    }

    private void a(byte byte0)
    {
        g[0] = byte0;
        e.b(g, 0, 1);
    }

    private String c(int i1)
    {
        String s;
        try
        {
            d(i1);
            byte abyte0[] = new byte[i1];
            e.b(abyte0, i1);
            s = new String(abyte0, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new fq("JVM DOES NOT SUPPORT UTF-8");
        }
        return s;
    }

    private void d(int i1)
    {
        if (i1 < 0)
        {
            throw new go((new StringBuilder("Negative length: ")).append(i1).toString());
        }
        if (d)
        {
            c = c - i1;
            if (c < 0)
            {
                throw new go((new StringBuilder("Message length exceeded: ")).append(i1).toString());
            }
        }
    }

    public final void a()
    {
    }

    public final void a(double d1)
    {
        a(Double.doubleToLongBits(d1));
    }

    public final void a(int i1)
    {
        i[0] = (byte)(i1 >> 24 & 0xff);
        i[1] = (byte)(i1 >> 16 & 0xff);
        i[2] = (byte)(i1 >> 8 & 0xff);
        i[3] = (byte)(i1 & 0xff);
        e.b(i, 0, 4);
    }

    public final void a(long l1)
    {
        j[0] = (byte)(int)(l1 >> 56 & 255L);
        j[1] = (byte)(int)(l1 >> 48 & 255L);
        j[2] = (byte)(int)(l1 >> 40 & 255L);
        j[3] = (byte)(int)(l1 >> 32 & 255L);
        j[4] = (byte)(int)(l1 >> 24 & 255L);
        j[5] = (byte)(int)(l1 >> 16 & 255L);
        j[6] = (byte)(int)(l1 >> 8 & 255L);
        j[7] = (byte)(int)(255L & l1);
        e.b(j, 0, 8);
    }

    public final void a(gk gk1)
    {
        a(gk1.b);
        a(gk1.c);
    }

    public final void a(gl gl1)
    {
        a(gl1.a);
        a(gl1.b);
    }

    public final void a(gm gm1)
    {
        a(gm1.a);
        a(gm1.b);
        a(gm1.c);
    }

    public final void a(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
            a(s.length);
            e.b(s, 0, s.length);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fq("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        int i1 = bytebuffer.limit() - bytebuffer.position();
        a(i1);
        e.b(bytebuffer.array(), bytebuffer.position() + bytebuffer.arrayOffset(), i1);
    }

    public final void a(short word0)
    {
        h[0] = (byte)(word0 >> 8 & 0xff);
        h[1] = (byte)(word0 & 0xff);
        e.b(h, 0, 2);
    }

    public final void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        a(byte0);
    }

    public final void b()
    {
    }

    public final void b(int i1)
    {
        c = i1;
        d = true;
    }

    public final void c()
    {
        a((byte)0);
    }

    public final gs d()
    {
        return f;
    }

    public final void e()
    {
    }

    public final gk f()
    {
        byte byte0 = k();
        short word0;
        if (byte0 == 0)
        {
            word0 = 0;
        } else
        {
            word0 = l();
        }
        return new gk("", byte0, word0);
    }

    public final gm g()
    {
        return new gm(k(), k(), m());
    }

    public final gl h()
    {
        return new gl(k(), m());
    }

    public final gr i()
    {
        return new gr(k(), m());
    }

    public final boolean j()
    {
        return k() == 1;
    }

    public final byte k()
    {
        if (e.d() > 0)
        {
            byte byte0 = e.b()[e.c()];
            e.a(1);
            return byte0;
        } else
        {
            a(k, 1);
            return k[0];
        }
    }

    public final short l()
    {
        byte abyte0[] = l;
        int i1 = 0;
        byte byte0;
        if (e.d() >= 2)
        {
            abyte0 = e.b();
            i1 = e.c();
            e.a(2);
        } else
        {
            a(l, 2);
        }
        byte0 = abyte0[i1];
        return (short)(abyte0[i1 + 1] & 0xff | (byte0 & 0xff) << 8);
    }

    public final int m()
    {
        byte abyte0[] = m;
        int i1 = 0;
        byte byte0;
        byte byte1;
        byte byte2;
        if (e.d() >= 4)
        {
            abyte0 = e.b();
            i1 = e.c();
            e.a(4);
        } else
        {
            a(m, 4);
        }
        byte0 = abyte0[i1];
        byte1 = abyte0[i1 + 1];
        byte2 = abyte0[i1 + 2];
        return abyte0[i1 + 3] & 0xff | ((byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8);
    }

    public final long n()
    {
        byte abyte0[] = n;
        int i1 = 0;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        if (e.d() >= 8)
        {
            abyte0 = e.b();
            i1 = e.c();
            e.a(8);
        } else
        {
            a(n, 8);
        }
        l1 = abyte0[i1] & 0xff;
        l2 = abyte0[i1 + 1] & 0xff;
        l3 = abyte0[i1 + 2] & 0xff;
        l4 = abyte0[i1 + 3] & 0xff;
        l5 = abyte0[i1 + 4] & 0xff;
        l6 = abyte0[i1 + 5] & 0xff;
        l7 = abyte0[i1 + 6] & 0xff;
        return (long)(abyte0[i1 + 7] & 0xff) | (l1 << 56 | l2 << 48 | l3 << 40 | l4 << 32 | l5 << 24 | l6 << 16 | l7 << 8);
    }

    public final double o()
    {
        return Double.longBitsToDouble(n());
    }

    public final String p()
    {
        int i1 = m();
        if (e.d() >= i1)
        {
            String s;
            try
            {
                s = new String(e.b(), e.c(), i1, "UTF-8");
                e.a(i1);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new fq("JVM DOES NOT SUPPORT UTF-8");
            }
            return s;
        } else
        {
            return c(i1);
        }
    }

    public final ByteBuffer q()
    {
        int i1 = m();
        d(i1);
        if (e.d() >= i1)
        {
            ByteBuffer bytebuffer = ByteBuffer.wrap(e.b(), e.c(), i1);
            e.a(i1);
            return bytebuffer;
        } else
        {
            byte abyte0[] = new byte[i1];
            e.b(abyte0, i1);
            return ByteBuffer.wrap(abyte0);
        }
    }

}
