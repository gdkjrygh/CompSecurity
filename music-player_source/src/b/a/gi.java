// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package b.a:
//            gn, gs, gk, fl, 
//            ha, go, gl, gm, 
//            fq, gr

public class gi extends gn
{

    private static final gs d = new gs("");
    private static final gk f = new gk("", (byte)0, (short)0);
    private static final byte g[];
    byte a[];
    byte b[];
    byte c[];
    private fl h;
    private short i;
    private gk j;
    private Boolean k;
    private final long l;
    private byte m[];

    public gi(ha ha1, long l1)
    {
        super(ha1);
        h = new fl();
        i = 0;
        j = null;
        k = null;
        a = new byte[5];
        b = new byte[10];
        m = new byte[1];
        c = new byte[1];
        l = l1;
    }

    private void a(gk gk1, byte byte0)
    {
        byte byte1 = byte0;
        if (byte0 == -1)
        {
            byte byte2 = gk1.b;
            byte1 = g[byte2];
        }
        if (gk1.c > i && gk1.c - i <= 15)
        {
            b((byte)(gk1.c - i << 4 | byte1));
        } else
        {
            b(byte1);
            a(gk1.c);
        }
        i = gk1.c;
    }

    private void a(byte abyte0[], int i1, int j1)
    {
        b(j1);
        e.b(abyte0, i1, j1);
    }

    private void b(byte byte0)
    {
        m[0] = byte0;
        e.a(m);
    }

    private void b(int i1)
    {
        boolean flag = false;
        int j1 = i1;
        i1 = ((flag) ? 1 : 0);
        do
        {
            if ((j1 & 0xffffff80) == 0)
            {
                a[i1] = (byte)j1;
                e.b(a, 0, i1 + 1);
                return;
            }
            a[i1] = (byte)(j1 & 0x7f | 0x80);
            j1 >>>= 7;
            i1++;
        } while (true);
    }

    private static byte c(byte byte0)
    {
        switch ((byte)(byte0 & 0xf))
        {
        default:
            throw new go((new StringBuilder("don't know what type: ")).append((byte)(byte0 & 0xf)).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 6;

        case 5: // '\005'
            return 8;

        case 6: // '\006'
            return 10;

        case 7: // '\007'
            return 4;

        case 8: // '\b'
            return 11;

        case 9: // '\t'
            return 15;

        case 10: // '\n'
            return 14;

        case 11: // '\013'
            return 13;

        case 12: // '\f'
            return 12;
        }
    }

    private static int c(int i1)
    {
        return i1 << 1 ^ i1 >> 31;
    }

    private void d(int i1)
    {
        if (i1 < 0)
        {
            throw new go((new StringBuilder("Negative length: ")).append(i1).toString());
        }
        if (l != -1L && (long)i1 > l)
        {
            throw new go((new StringBuilder("Length exceeded max allowed: ")).append(i1).toString());
        } else
        {
            return;
        }
    }

    private static int e(int i1)
    {
        return i1 >>> 1 ^ -(i1 & 1);
    }

    private int t()
    {
_L2:
        int k1;
        do
        {
            l1 = k();
            k1 |= (l1 & 0x7f) << i1;
            if ((l1 & 0x80) == 128)
            {
                i1 += 7;
            } else
            {
                return k1;
            }
        } while (true);
        int l1 = 0;
        int i1 = 0;
        if (e.d() >= 5)
        {
            byte abyte0[] = e.b();
            int i2 = e.c();
            int j1 = 0;
            l1 = 0;
            do
            {
                byte byte0 = abyte0[i2 + i1];
                l1 |= (byte0 & 0x7f) << j1;
                if ((byte0 & 0x80) == 128)
                {
                    j1 += 7;
                    i1++;
                } else
                {
                    e.a(i1 + 1);
                    return l1;
                }
            } while (true);
        }
        k1 = 0;
        i1 = l1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        h.a(i);
        i = 0;
    }

    public final void a(byte byte0)
    {
        b(byte0);
    }

    public final void a(double d1)
    {
        byte abyte0[] = new byte[8];
        byte[] _tmp = abyte0;
        abyte0[0] = 0;
        abyte0[1] = 0;
        abyte0[2] = 0;
        abyte0[3] = 0;
        abyte0[4] = 0;
        abyte0[5] = 0;
        abyte0[6] = 0;
        abyte0[7] = 0;
        long l1 = Double.doubleToLongBits(d1);
        abyte0[0] = (byte)(int)(l1 & 255L);
        abyte0[1] = (byte)(int)(l1 >> 8 & 255L);
        abyte0[2] = (byte)(int)(l1 >> 16 & 255L);
        abyte0[3] = (byte)(int)(l1 >> 24 & 255L);
        abyte0[4] = (byte)(int)(l1 >> 32 & 255L);
        abyte0[5] = (byte)(int)(l1 >> 40 & 255L);
        abyte0[6] = (byte)(int)(l1 >> 48 & 255L);
        abyte0[7] = (byte)(int)(l1 >> 56 & 255L);
        e.a(abyte0);
    }

    public final void a(int i1)
    {
        b(c(i1));
    }

    public final void a(long l1)
    {
        l1 = l1 << 1 ^ l1 >> 63;
        int i1 = 0;
        do
        {
            if ((-128L & l1) == 0L)
            {
                b[i1] = (byte)(int)l1;
                e.b(b, 0, i1 + 1);
                return;
            }
            b[i1] = (byte)(int)(127L & l1 | 128L);
            l1 >>>= 7;
            i1++;
        } while (true);
    }

    public final void a(gk gk1)
    {
        if (gk1.b == 2)
        {
            j = gk1;
            return;
        } else
        {
            a(gk1, (byte)-1);
            return;
        }
    }

    public final void a(gl gl1)
    {
        byte byte0 = gl1.a;
        int i1 = gl1.b;
        if (i1 <= 14)
        {
            b((byte)(g[byte0] | i1 << 4));
            return;
        } else
        {
            b((byte)(g[byte0] | 0xf0));
            b(i1);
            return;
        }
    }

    public final void a(gm gm1)
    {
        if (gm1.c == 0)
        {
            b((byte)0);
            return;
        } else
        {
            b(gm1.c);
            byte byte0 = gm1.a;
            byte0 = g[byte0];
            byte byte1 = gm1.b;
            b((byte)(byte0 << 4 | g[byte1]));
            return;
        }
    }

    public final void a(String s)
    {
        try
        {
            s = s.getBytes("UTF-8");
            a(((byte []) (s)), 0, s.length);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fq("UTF-8 not supported!");
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        int i1 = bytebuffer.limit();
        int j1 = bytebuffer.position();
        a(bytebuffer.array(), bytebuffer.position() + bytebuffer.arrayOffset(), i1 - j1);
    }

    public final void a(short word0)
    {
        b(c(word0));
    }

    public final void a(boolean flag)
    {
        boolean flag1 = true;
        byte byte0 = 1;
        if (j != null)
        {
            gk gk1 = j;
            if (!flag)
            {
                byte0 = 2;
            }
            a(gk1, byte0);
            j = null;
            return;
        }
        if (flag)
        {
            byte0 = flag1;
        } else
        {
            byte0 = 2;
        }
        b(byte0);
    }

    public final void b()
    {
        i = h.a();
    }

    public final void c()
    {
        b((byte)0);
    }

    public final gs d()
    {
        h.a(i);
        i = 0;
        return d;
    }

    public final void e()
    {
        i = h.a();
    }

    public final gk f()
    {
        byte byte0 = k();
        if (byte0 == 0)
        {
            return f;
        }
        int i1 = (short)((byte0 & 0xf0) >> 4);
        short word0;
        gk gk1;
        boolean flag;
        if (i1 == 0)
        {
            word0 = l();
        } else
        {
            word0 = (short)(i1 + i);
        }
        gk1 = new gk("", c((byte)(byte0 & 0xf)), word0);
        i1 = byte0 & 0xf;
        if (i1 == 1 || i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Boolean boolean1;
            if ((byte)i1 == 1)
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                boolean1 = Boolean.FALSE;
            }
            k = boolean1;
        }
        i = gk1.c;
        return gk1;
    }

    public final gm g()
    {
        int j1 = t();
        int i1;
        if (j1 == 0)
        {
            i1 = 0;
        } else
        {
            i1 = k();
        }
        return new gm(c((byte)(i1 >> 4)), c((byte)(i1 & 0xf)), j1);
    }

    public final gl h()
    {
        byte byte0 = k();
        int j1 = byte0 >> 4 & 0xf;
        int i1 = j1;
        if (j1 == 15)
        {
            i1 = t();
        }
        return new gl(c(byte0), i1);
    }

    public final gr i()
    {
        return new gr(h());
    }

    public final boolean j()
    {
        boolean flag = true;
        if (k != null)
        {
            flag = k.booleanValue();
            k = null;
        } else
        if (k() != 1)
        {
            return false;
        }
        return flag;
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
            e.b(c, 1);
            return c[0];
        }
    }

    public final short l()
    {
        return (short)e(t());
    }

    public final int m()
    {
        return e(t());
    }

    public final long n()
    {
        int i1;
        boolean flag;
        long l1;
        long l2;
        i1 = 0;
        flag = false;
        l1 = 0L;
        l2 = l1;
        if (e.d() < 10) goto _L2; else goto _L1
_L1:
        byte abyte0[] = e.b();
        int k1 = e.c();
        int j1 = 0;
        i1 = ((flag) ? 1 : 0);
        do
        {
            byte byte1 = abyte0[k1 + i1];
            l1 |= (long)(byte1 & 0x7f) << j1;
            if ((byte1 & 0x80) != 128)
            {
                break;
            }
            j1 += 7;
            i1++;
        } while (true);
        e.a(i1 + 1);
_L4:
        return l1 >>> 1 ^ -(l1 & 1L);
_L2:
        do
        {
            byte byte0 = k();
            l2 |= (long)(byte0 & 0x7f) << i1;
            l1 = l2;
            if ((byte0 & 0x80) != 128)
            {
                continue;
            }
            i1 += 7;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final double o()
    {
        byte abyte0[] = new byte[8];
        e.b(abyte0, 8);
        long l1 = abyte0[7];
        long l2 = abyte0[6];
        long l3 = abyte0[5];
        long l4 = abyte0[4];
        long l5 = abyte0[3];
        long l6 = abyte0[2];
        long l7 = abyte0[1];
        return Double.longBitsToDouble((long)abyte0[0] & 255L | ((l1 & 255L) << 56 | (l2 & 255L) << 48 | (l3 & 255L) << 40 | (l4 & 255L) << 32 | (l5 & 255L) << 24 | (l6 & 255L) << 16 | (l7 & 255L) << 8));
    }

    public final String p()
    {
        int i1;
label0:
        {
            i1 = t();
            d(i1);
            if (i1 == 0)
            {
                return "";
            }
            String s;
            try
            {
                if (e.d() < i1)
                {
                    break label0;
                }
                s = new String(e.b(), e.c(), i1, "UTF-8");
                e.a(i1);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new fq("UTF-8 not supported!");
            }
            return s;
        }
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[0];
_L4:
        return new String(abyte0, "UTF-8");
_L2:
        abyte0 = new byte[i1];
        e.b(abyte0, i1);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ByteBuffer q()
    {
        int i1 = t();
        d(i1);
        if (i1 == 0)
        {
            return ByteBuffer.wrap(new byte[0]);
        } else
        {
            byte abyte0[] = new byte[i1];
            e.b(abyte0, i1);
            return ByteBuffer.wrap(abyte0);
        }
    }

    public final void r()
    {
        h.b();
        i = 0;
    }

    static 
    {
        byte abyte0[] = new byte[16];
        g = abyte0;
        abyte0[0] = 0;
        g[2] = 1;
        g[3] = 3;
        g[6] = 4;
        g[8] = 5;
        g[10] = 6;
        g[4] = 7;
        g[11] = 8;
        g[15] = 9;
        g[14] = 10;
        g[13] = 11;
        g[12] = 12;
    }
}
