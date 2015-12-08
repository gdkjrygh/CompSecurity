// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.b;
import com.fasterxml.jackson.core.io.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.b:
//            b, d

public class g extends com.fasterxml.jackson.core.b.b
{

    private static final byte A = 117;
    private static final byte B = 48;
    private static final byte C = 91;
    private static final byte D = 93;
    private static final byte E = 123;
    private static final byte F = 125;
    private static final byte G = 92;
    private static final byte H = 44;
    private static final byte I = 58;
    private static final byte J = 34;
    private static final int K = 512;
    private static final byte L[] = {
        110, 117, 108, 108
    };
    private static final byte M[] = {
        116, 114, 117, 101
    };
    private static final byte N[] = {
        102, 97, 108, 115, 101
    };
    protected static final int m = 55296;
    protected static final int n = 56319;
    protected static final int o = 56320;
    protected static final int p = 57343;
    static final byte q[] = com.fasterxml.jackson.core.io.b.h();
    protected final OutputStream r;
    protected byte s[];
    protected int t;
    protected final int u;
    protected final int v;
    protected char w[];
    protected final int x;
    protected byte y[];
    protected boolean z;

    public g(c c1, int i1, d d1, OutputStream outputstream)
    {
        super(c1, i1, d1);
        t = 0;
        r = outputstream;
        z = true;
        s = c1.f();
        u = s.length;
        v = u >> 3;
        w = c1.i();
        x = w.length;
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.g))
        {
            a(127);
        }
    }

    public g(c c1, int i1, d d1, OutputStream outputstream, byte abyte0[], int j1, boolean flag)
    {
        super(c1, i1, d1);
        t = 0;
        r = outputstream;
        z = flag;
        t = j1;
        s = abyte0;
        u = s.length;
        v = u >> 3;
        w = c1.i();
        x = w.length;
    }

    private int a(int i1, char ac[], int j1, int k1)
        throws IOException
    {
        if (i1 >= 55296 && i1 <= 57343)
        {
            if (j1 >= k1)
            {
                j("Split surrogate on writeRaw() input (last character)");
            }
            a(i1, ac[j1]);
            return j1 + 1;
        } else
        {
            ac = s;
            k1 = t;
            t = k1 + 1;
            ac[k1] = (byte)(i1 >> 12 | 0xe0);
            k1 = t;
            t = k1 + 1;
            ac[k1] = (byte)(i1 >> 6 & 0x3f | 0x80);
            k1 = t;
            t = k1 + 1;
            ac[k1] = (byte)(i1 & 0x3f | 0x80);
            return j1;
        }
    }

    private int a(InputStream inputstream, byte abyte0[], int i1, int j1, int k1)
        throws IOException
    {
        boolean flag = false;
        int l1 = i1;
        i1 = ((flag) ? 1 : 0);
        for (; l1 < j1; l1++)
        {
            abyte0[i1] = abyte0[l1];
            i1++;
        }

        k1 = Math.min(k1, abyte0.length);
_L5:
        j1 = k1 - i1;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        if ((j1 = inputstream.read(abyte0, i1, j1)) < 0) goto _L1; else goto _L3
_L3:
        j1 = i1 + j1;
        i1 = j1;
        if (j1 >= 3)
        {
            return j1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private int a(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
        throws IOException, JsonGenerationException
    {
        int i2 = abyte1.length;
        if (i1 + i2 <= j1) goto _L2; else goto _L1
_L1:
        int l1;
        t = i1;
        t();
        l1 = t;
        if (i2 <= abyte0.length) goto _L4; else goto _L3
_L3:
        r.write(abyte1, 0, i2);
_L6:
        return l1;
_L4:
        System.arraycopy(abyte1, 0, abyte0, l1, i2);
        i1 = l1 + i2;
_L2:
        l1 = i1;
        if (k1 * 6 + i1 > j1)
        {
            t();
            return t;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int a(byte abyte0[], int i1, f f1, int j1)
        throws IOException, JsonGenerationException
    {
        f1 = f1.d();
        int k1 = f1.length;
        if (k1 > 6)
        {
            return a(abyte0, i1, u, ((byte []) (f1)), j1);
        } else
        {
            System.arraycopy(f1, 0, abyte0, i1, k1);
            return k1 + i1;
        }
    }

    private void b(long l1)
        throws IOException
    {
        if (t + 23 >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        t = com.fasterxml.jackson.core.io.g.a(l1, s, t);
        abyte0 = s;
        i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
    }

    private void b(short word0)
        throws IOException
    {
        if (t + 8 >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        t = com.fasterxml.jackson.core.io.g.a(word0, s, t);
        abyte0 = s;
        word0 = t;
        t = word0 + 1;
        abyte0[word0] = 34;
    }

    private final void b(byte abyte0[])
        throws IOException
    {
        int i1 = abyte0.length;
        if (t + i1 > u)
        {
            t();
            if (i1 > 512)
            {
                r.write(abyte0, 0, i1);
                return;
            }
        }
        System.arraycopy(abyte0, 0, s, t, i1);
        t = i1 + t;
    }

    private int c(int i1, int j1)
        throws IOException
    {
        byte abyte0[] = s;
        if (i1 >= 55296 && i1 <= 57343)
        {
            int k1 = j1 + 1;
            abyte0[j1] = 92;
            j1 = k1 + 1;
            abyte0[k1] = 117;
            k1 = j1 + 1;
            abyte0[j1] = q[i1 >> 12 & 0xf];
            j1 = k1 + 1;
            abyte0[k1] = q[i1 >> 8 & 0xf];
            k1 = j1 + 1;
            abyte0[j1] = q[i1 >> 4 & 0xf];
            abyte0[k1] = q[i1 & 0xf];
            return k1 + 1;
        } else
        {
            int l1 = j1 + 1;
            abyte0[j1] = (byte)(i1 >> 12 | 0xe0);
            j1 = l1 + 1;
            abyte0[l1] = (byte)(i1 >> 6 & 0x3f | 0x80);
            abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
            return j1 + 1;
        }
    }

    private void c(int i1)
        throws IOException
    {
        if (t + 13 >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int j1 = t;
        t = j1 + 1;
        abyte0[j1] = 34;
        t = com.fasterxml.jackson.core.io.g.a(i1, s, t);
        abyte0 = s;
        i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
    }

    private void c(Object obj)
        throws IOException
    {
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        c(obj.toString());
        if (t >= u)
        {
            t();
        }
        obj = s;
        i1 = t;
        t = i1 + 1;
        obj[i1] = 34;
    }

    private int d(int i1, int j1)
        throws IOException
    {
        byte abyte0[] = s;
        int k1 = j1 + 1;
        abyte0[j1] = 92;
        j1 = k1 + 1;
        abyte0[k1] = 117;
        if (i1 > 255)
        {
            k1 = i1 >> 8 & 0xff;
            int i2 = j1 + 1;
            abyte0[j1] = q[k1 >> 4];
            j1 = i2 + 1;
            abyte0[i2] = q[k1 & 0xf];
            i1 &= 0xff;
        } else
        {
            int l1 = j1 + 1;
            abyte0[j1] = 48;
            j1 = l1 + 1;
            abyte0[l1] = 48;
        }
        k1 = j1 + 1;
        abyte0[j1] = q[i1 >> 4];
        abyte0[k1] = q[i1 & 0xf];
        return k1 + 1;
    }

    private final void d(byte abyte0[], int i1, int j1)
        throws IOException
    {
        if (t + j1 > u)
        {
            t();
            if (j1 > 512)
            {
                r.write(abyte0, i1, j1);
                return;
            }
        }
        System.arraycopy(abyte0, i1, s, t, j1);
        t = t + j1;
    }

    private void d(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (t >= u)
        {
            t();
        }
        ac = s;
        i1 = t;
        t = i1 + 1;
        ac[i1] = '"';
        f(w, 0, j1);
        if (t >= u)
        {
            t();
        }
        ac = s;
        i1 = t;
        t = i1 + 1;
        ac[i1] = '"';
    }

    private void e(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k1;
        do
        {
            k1 = Math.min(v, j1);
            f(abyte0, i1, k1);
            i1 += k1;
            k1 = j1 - k1;
            j1 = k1;
        } while (k1 > 0);
    }

    private final void e(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int l1 = u;
        byte abyte0[] = s;
label0:
        do
        {
            if (i1 < j1)
            {
                do
                {
                    int k1 = ac[i1];
                    if (k1 >= 128)
                    {
                        if (t + 3 >= u)
                        {
                            t();
                        }
                        k1 = i1 + 1;
                        i1 = ac[i1];
                        int j2;
                        if (i1 < 2048)
                        {
                            int i2 = t;
                            t = i2 + 1;
                            abyte0[i2] = (byte)(i1 >> 6 | 0xc0);
                            i2 = t;
                            t = i2 + 1;
                            abyte0[i2] = (byte)(i1 & 0x3f | 0x80);
                        } else
                        {
                            a(i1, ac, k1, j1);
                        }
                        i1 = k1;
                        continue label0;
                    }
                    if (t >= l1)
                    {
                        t();
                    }
                    j2 = t;
                    t = j2 + 1;
                    abyte0[j2] = (byte)k1;
                    k1 = i1 + 1;
                    i1 = k1;
                } while (k1 < j1);
            }
            return;
        } while (true);
    }

    private void f(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int ai[] = i;
        for (int k1 = i1; k1 < i1 + j1; k1++)
        {
            byte byte0 = abyte0[k1];
            if (byte0 >= 0 && ai[byte0] != 0)
            {
                g(abyte0, i1, j1);
                return;
            }
        }

        if (t + j1 > u)
        {
            t();
        }
        System.arraycopy(abyte0, i1, s, t, j1);
        t = t + j1;
    }

    private final void f(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k1;
        do
        {
            k1 = Math.min(v, j1);
            if (t + k1 > u)
            {
                t();
            }
            g(ac, i1, k1);
            i1 += k1;
            k1 = j1 - k1;
            j1 = k1;
        } while (k1 > 0);
    }

    private void g(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k1 = t;
        int l1 = k1;
        if (j1 * 6 + k1 > u)
        {
            t();
            l1 = t;
        }
        byte abyte1[] = s;
        int ai[] = i;
        k1 = i1;
        do
        {
            int i2 = k1;
            if (i2 < j1 + i1)
            {
                k1 = i2 + 1;
                byte byte0 = abyte0[i2];
                if (byte0 < 0 || ai[byte0] == 0)
                {
                    abyte1[l1] = byte0;
                    l1++;
                } else
                {
                    int j2 = ai[byte0];
                    if (j2 > 0)
                    {
                        int k2 = l1 + 1;
                        abyte1[l1] = 92;
                        l1 = k2 + 1;
                        abyte1[k2] = (byte)j2;
                    } else
                    {
                        l1 = d(byte0, l1);
                    }
                }
            } else
            {
                t = l1;
                return;
            }
        } while (true);
    }

    private final void g(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int l1 = j1 + i1;
        int k1 = t;
        byte abyte0[] = s;
        int ai[] = i;
        j1 = i1;
        i1 = k1;
label0:
        do
        {
            char c1;
label1:
            {
                if (j1 < l1)
                {
                    c1 = ac[j1];
                    if (c1 <= '\177' && ai[c1] == 0)
                    {
                        break label1;
                    }
                }
                t = i1;
                if (j1 < l1)
                {
                    if (k == null)
                    {
                        break label0;
                    }
                    j(ac, j1, l1);
                }
                return;
            }
            abyte0[i1] = (byte)c1;
            j1++;
            i1++;
        } while (true);
        if (j == 0)
        {
            h(ac, j1, l1);
            return;
        } else
        {
            i(ac, j1, l1);
            return;
        }
    }

    private final void h(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (t + (j1 - i1) * 6 > u)
        {
            t();
        }
        int l1 = t;
        byte abyte0[] = s;
        int ai[] = i;
        int k1 = i1;
        i1 = l1;
        while (k1 < j1) 
        {
            int i2 = k1 + 1;
            k1 = ac[k1];
            if (k1 <= '\177')
            {
                if (ai[k1] == 0)
                {
                    abyte0[i1] = (byte)k1;
                    i1++;
                    k1 = i2;
                } else
                {
                    int j2 = ai[k1];
                    if (j2 > 0)
                    {
                        k1 = i1 + 1;
                        abyte0[i1] = 92;
                        i1 = k1 + 1;
                        abyte0[k1] = (byte)j2;
                        k1 = i2;
                    } else
                    {
                        i1 = d(k1, i1);
                        k1 = i2;
                    }
                }
            } else
            {
                if (k1 <= 2047)
                {
                    int k2 = i1 + 1;
                    abyte0[i1] = (byte)(k1 >> 6 | 0xc0);
                    i1 = k2 + 1;
                    abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
                } else
                {
                    i1 = c(k1, i1);
                }
                k1 = i2;
            }
        }
        t = i1;
    }

    private final void i(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (t + (j1 - i1) * 6 > u)
        {
            t();
        }
        int l1 = t;
        byte abyte0[] = s;
        int ai[] = i;
        int j2 = j;
        int k1 = i1;
        i1 = l1;
        while (k1 < j1) 
        {
            int i2 = k1 + 1;
            k1 = ac[k1];
            if (k1 <= '\177')
            {
                if (ai[k1] == 0)
                {
                    abyte0[i1] = (byte)k1;
                    i1++;
                    k1 = i2;
                } else
                {
                    int k2 = ai[k1];
                    if (k2 > 0)
                    {
                        k1 = i1 + 1;
                        abyte0[i1] = 92;
                        i1 = k1 + 1;
                        abyte0[k1] = (byte)k2;
                        k1 = i2;
                    } else
                    {
                        i1 = d(k1, i1);
                        k1 = i2;
                    }
                }
            } else
            if (k1 > j2)
            {
                i1 = d(k1, i1);
                k1 = i2;
            } else
            {
                if (k1 <= 2047)
                {
                    int l2 = i1 + 1;
                    abyte0[i1] = (byte)(k1 >> 6 | 0xc0);
                    i1 = l2 + 1;
                    abyte0[l2] = (byte)(k1 & 0x3f | 0x80);
                } else
                {
                    i1 = c(k1, i1);
                }
                k1 = i2;
            }
        }
        t = i1;
    }

    private void j(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (t + (j1 - i1) * 6 > u)
        {
            t();
        }
        int l1 = t;
        byte abyte0[] = s;
        int ai[] = i;
        CharacterEscapes characterescapes;
        int k1;
        int j2;
        if (j <= 0)
        {
            j2 = 65535;
        } else
        {
            j2 = j;
        }
        characterescapes = k;
        k1 = i1;
        i1 = l1;
        while (k1 < j1) 
        {
            int i2 = k1 + 1;
            k1 = ac[k1];
            if (k1 <= '\177')
            {
                if (ai[k1] == 0)
                {
                    abyte0[i1] = (byte)k1;
                    i1++;
                    k1 = i2;
                } else
                {
                    int k2 = ai[k1];
                    if (k2 > 0)
                    {
                        k1 = i1 + 1;
                        abyte0[i1] = 92;
                        i1 = k1 + 1;
                        abyte0[k1] = (byte)k2;
                        k1 = i2;
                    } else
                    if (k2 == -2)
                    {
                        f f1 = characterescapes.a(k1);
                        if (f1 == null)
                        {
                            j((new StringBuilder()).append("Invalid custom escape definitions; custom escape not found for character code 0x").append(Integer.toHexString(k1)).append(", although was supposed to have one").toString());
                        }
                        i1 = a(abyte0, i1, f1, j1 - i2);
                        k1 = i2;
                    } else
                    {
                        i1 = d(k1, i1);
                        k1 = i2;
                    }
                }
            } else
            if (k1 > j2)
            {
                i1 = d(k1, i1);
                k1 = i2;
            } else
            {
                f f2 = characterescapes.a(k1);
                if (f2 != null)
                {
                    i1 = a(abyte0, i1, f2, j1 - i2);
                    k1 = i2;
                } else
                {
                    if (k1 <= 2047)
                    {
                        int l2 = i1 + 1;
                        abyte0[i1] = (byte)(k1 >> 6 | 0xc0);
                        i1 = l2 + 1;
                        abyte0[l2] = (byte)(k1 & 0x3f | 0x80);
                    } else
                    {
                        i1 = c(k1, i1);
                    }
                    k1 = i2;
                }
            }
        }
        t = i1;
    }

    private void l(String s1)
        throws IOException, JsonGenerationException
    {
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        m(s1);
        if (t >= u)
        {
            t();
        }
        s1 = s;
        i1 = t;
        t = i1 + 1;
        s1[i1] = 34;
    }

    private final void m(String s1)
        throws IOException, JsonGenerationException
    {
        int i1 = s1.length();
        char ac[] = w;
        int j1 = 0;
        int k1;
        for (; i1 > 0; i1 -= k1)
        {
            k1 = Math.min(v, i1);
            s1.getChars(j1, j1 + k1, ac, 0);
            if (t + k1 > u)
            {
                t();
            }
            g(ac, 0, k1);
            j1 += k1;
        }

    }

    private void u()
        throws IOException
    {
        if (t + 4 >= u)
        {
            t();
        }
        System.arraycopy(L, 0, s, t, 4);
        t = t + 4;
    }

    public int a(Base64Variant base64variant, InputStream inputstream, int i1)
        throws IOException, JsonGenerationException
    {
        byte abyte0[];
        i("write binary value");
        if (t >= u)
        {
            t();
        }
        abyte0 = s;
        int j1 = t;
        t = j1 + 1;
        abyte0[j1] = 34;
        abyte0 = h.g();
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = a(base64variant, inputstream, abyte0);
_L4:
        h.c(abyte0);
        if (t >= u)
        {
            t();
        }
        base64variant = s;
        i1 = t;
        t = i1 + 1;
        base64variant[i1] = 34;
        return k1;
_L2:
        int l1 = a(base64variant, inputstream, abyte0, i1);
        k1 = i1;
        if (l1 <= 0) goto _L4; else goto _L3
_L3:
        j((new StringBuilder()).append("Too few bytes available: missing ").append(l1).append(" bytes (out of ").append(i1).append(")").toString());
        k1 = i1;
          goto _L4
        base64variant;
        h.c(abyte0);
        throw base64variant;
    }

    protected int a(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
        throws IOException, JsonGenerationException
    {
        int k2 = -3;
        int i3 = u - 6;
        int l1 = base64variant.e() >> 2;
        int j1 = 0;
        int j2 = 0;
        int i1 = 0;
        do
        {
            int i2 = k2;
            int l2 = i1;
            int k1 = j2;
            if (i1 > k2)
            {
                k1 = a(inputstream, abyte0, i1, j2, abyte0.length);
                if (k1 < 3)
                {
                    if (k1 < 0)
                    {
                        if (t > i3)
                        {
                            t();
                        }
                        i1 = abyte0[0] << 16;
                        byte abyte1[];
                        if (1 < k1)
                        {
                            k1 = (abyte0[1] & 0xff) << 8 | i1;
                            i1 = 2;
                        } else
                        {
                            k1 = i1;
                            i1 = 1;
                        }
                        t = base64variant.a(k1, i1, s, t);
                        return j1 + i1;
                    } else
                    {
                        return j1;
                    }
                }
                i2 = k1 - 3;
                l2 = 0;
            }
            if (t > i3)
            {
                t();
            }
            j2 = l2 + 1;
            i1 = abyte0[l2];
            l2 = j2 + 1;
            k2 = abyte0[j2];
            j2 = l2 + 1;
            l2 = abyte0[l2];
            j1 += 3;
            t = base64variant.a((k2 & 0xff | i1 << 8) << 8 | l2 & 0xff, s, t);
            l1--;
            i1 = l1;
            if (l1 <= 0)
            {
                abyte1 = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 92;
                abyte1 = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 110;
                i1 = base64variant.e() >> 2;
            }
            l1 = i1;
            k2 = i2;
            i1 = j2;
            j2 = k1;
        } while (true);
    }

    protected int a(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i1)
        throws IOException, JsonGenerationException
    {
        boolean flag = false;
        int k1 = 0;
        int k2 = -3;
        int i3 = u - 6;
        int l1 = base64variant.e() >> 2;
        int j1 = i1;
        i1 = ((flag) ? 1 : 0);
        do
        {
label0:
            {
label1:
                {
                    int j2 = i1;
                    int i2 = k1;
                    int l2;
                    if (j1 > 2)
                    {
                        j2 = k2;
                        l2 = i1;
                        i2 = k1;
                        if (i1 <= k2)
                        {
                            break label0;
                        }
                        i2 = a(inputstream, abyte0, i1, k1, j1);
                        l2 = 0;
                        j2 = 0;
                        if (i2 >= 3)
                        {
                            break label1;
                        }
                    }
                    i1 = j1;
                    if (j1 > 0)
                    {
                        l1 = a(inputstream, abyte0, j2, i2, j1);
                        i1 = j1;
                        if (l1 > 0)
                        {
                            if (t > i3)
                            {
                                t();
                            }
                            k1 = abyte0[0] << 16;
                            byte abyte1[];
                            if (1 < l1)
                            {
                                k1 |= (abyte0[1] & 0xff) << 8;
                                i1 = 2;
                            } else
                            {
                                i1 = 1;
                            }
                            t = base64variant.a(k1, i1, s, t);
                            i1 = j1 - i1;
                        }
                    }
                    return i1;
                }
                j2 = i2 - 3;
            }
            if (t > i3)
            {
                t();
            }
            k1 = l2 + 1;
            i1 = abyte0[l2];
            l2 = k1 + 1;
            k2 = abyte0[k1];
            k1 = l2 + 1;
            l2 = abyte0[l2];
            j1 -= 3;
            t = base64variant.a((k2 & 0xff | i1 << 8) << 8 | l2 & 0xff, s, t);
            l1--;
            i1 = l1;
            if (l1 <= 0)
            {
                abyte1 = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 92;
                abyte1 = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 110;
                i1 = base64variant.e() >> 2;
            }
            l1 = i1;
            k2 = j2;
            i1 = k1;
            k1 = i2;
        } while (true);
    }

    public void a(char c1)
        throws IOException, JsonGenerationException
    {
        if (t + 3 >= u)
        {
            t();
        }
        byte abyte0[] = s;
        if (c1 <= '\177')
        {
            int i1 = t;
            t = i1 + 1;
            abyte0[i1] = (byte)c1;
            return;
        }
        if (c1 < '\u0800')
        {
            int j1 = t;
            t = j1 + 1;
            abyte0[j1] = (byte)(c1 >> 6 | 0xc0);
            j1 = t;
            t = j1 + 1;
            abyte0[j1] = (byte)(c1 & 0x3f | 0x80);
            return;
        } else
        {
            a(c1, ((char []) (null)), 0, 0);
            return;
        }
    }

    public void a(double d1)
        throws IOException, JsonGenerationException
    {
        if (d || (Double.isNaN(d1) || Double.isInfinite(d1)) && c(com.fasterxml.jackson.core.JsonGenerator.Feature.d))
        {
            b(String.valueOf(d1));
            return;
        } else
        {
            i("write number");
            c(String.valueOf(d1));
            return;
        }
    }

    public void a(float f1)
        throws IOException, JsonGenerationException
    {
        if (d || (Float.isNaN(f1) || Float.isInfinite(f1)) && c(com.fasterxml.jackson.core.JsonGenerator.Feature.d))
        {
            b(String.valueOf(f1));
            return;
        } else
        {
            i("write number");
            c(String.valueOf(f1));
            return;
        }
    }

    protected final void a(int i1, int j1)
        throws IOException
    {
        i1 = b(i1, j1);
        if (t + 4 > u)
        {
            t();
        }
        byte abyte0[] = s;
        j1 = t;
        t = j1 + 1;
        abyte0[j1] = (byte)(i1 >> 18 | 0xf0);
        j1 = t;
        t = j1 + 1;
        abyte0[j1] = (byte)(i1 >> 12 & 0x3f | 0x80);
        j1 = t;
        t = j1 + 1;
        abyte0[j1] = (byte)(i1 >> 6 & 0x3f | 0x80);
        j1 = t;
        t = j1 + 1;
        abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
    }

    public void a(long l1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            b(l1);
            return;
        }
        if (t + 21 >= u)
        {
            t();
        }
        t = com.fasterxml.jackson.core.io.g.a(l1, s, t);
    }

    public void a(Base64Variant base64variant, byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write binary value");
        if (t >= u)
        {
            t();
        }
        byte abyte1[] = s;
        int k1 = t;
        t = k1 + 1;
        abyte1[k1] = 34;
        b(base64variant, abyte0, i1, i1 + j1);
        if (t >= u)
        {
            t();
        }
        base64variant = s;
        i1 = t;
        t = i1 + 1;
        base64variant[i1] = 34;
    }

    protected final void a(f f1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (flag)
        {
            a.c(this);
        } else
        {
            a.h(this);
        }
        flag = c(com.fasterxml.jackson.core.JsonGenerator.Feature.c);
        if (flag)
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int i1 = t;
            t = i1 + 1;
            abyte0[i1] = 34;
        }
        b(f1.e());
        if (flag)
        {
            if (t >= u)
            {
                t();
            }
            f1 = s;
            int j1 = t;
            t = j1 + 1;
            f1[j1] = 34;
        }
    }

    public final void a(String s1)
        throws IOException, JsonGenerationException
    {
        boolean flag = true;
        int i1 = e.a(s1);
        if (i1 == 4)
        {
            j("Can not write a field name, expecting a value");
        }
        if (a != null)
        {
            if (i1 != 1)
            {
                flag = false;
            }
            b(s1, flag);
            return;
        }
        if (i1 == 1)
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int j1 = t;
            t = j1 + 1;
            abyte0[j1] = 44;
        }
        k(s1);
    }

    public void a(String s1, int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k1 = j1;
        j1 = i1;
        for (i1 = k1; i1 > 0; i1 -= k1)
        {
            char ac[] = w;
            int l1 = ac.length;
            k1 = l1;
            if (i1 < l1)
            {
                k1 = i1;
            }
            s1.getChars(j1, j1 + k1, ac, 0);
            b(ac, 0, k1);
            j1 += k1;
        }

    }

    public void a(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (bigdecimal == null)
        {
            u();
            return;
        }
        if (d)
        {
            c(bigdecimal);
            return;
        } else
        {
            c(bigdecimal.toString());
            return;
        }
    }

    public void a(BigInteger biginteger)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (biginteger == null)
        {
            u();
            return;
        }
        if (d)
        {
            c(biginteger);
            return;
        } else
        {
            c(biginteger.toString());
            return;
        }
    }

    public void a(short word0)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (t + 6 >= u)
        {
            t();
        }
        if (d)
        {
            b(word0);
            return;
        } else
        {
            t = com.fasterxml.jackson.core.io.g.a(word0, s, t);
            return;
        }
    }

    public void a(boolean flag)
        throws IOException, JsonGenerationException
    {
        i("write boolean value");
        if (t + 5 >= u)
        {
            t();
        }
        byte abyte0[];
        int i1;
        if (flag)
        {
            abyte0 = M;
        } else
        {
            abyte0 = N;
        }
        i1 = abyte0.length;
        System.arraycopy(abyte0, 0, s, t, i1);
        t = t + i1;
    }

    public void a(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (t >= u)
        {
            t();
        }
        byte abyte1[] = s;
        int k1 = t;
        t = k1 + 1;
        abyte1[k1] = 34;
        d(abyte0, i1, j1);
        if (t >= u)
        {
            t();
        }
        abyte0 = s;
        i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
    }

    public void a(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int k1 = t;
        t = k1 + 1;
        abyte0[k1] = 34;
        if (j1 <= v)
        {
            if (t + j1 > u)
            {
                t();
            }
            g(ac, i1, j1);
        } else
        {
            f(ac, i1, j1);
        }
        if (t >= u)
        {
            t();
        }
        ac = s;
        i1 = t;
        t = i1 + 1;
        ac[i1] = '"';
    }

    protected final int b(int i1, int j1)
        throws IOException
    {
        if (j1 < 56320 || j1 > 57343)
        {
            j((new StringBuilder()).append("Incomplete surrogate pair: first char 0x").append(Integer.toHexString(i1)).append(", second 0x").append(Integer.toHexString(j1)).toString());
        }
        return 0x10000 + (i1 - 55296 << 10) + (j1 - 56320);
    }

    public void b(int i1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (t + 11 >= u)
        {
            t();
        }
        if (d)
        {
            c(i1);
            return;
        } else
        {
            t = com.fasterxml.jackson.core.io.g.a(i1, s, t);
            return;
        }
    }

    protected void b(Base64Variant base64variant, byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k2 = u - 6;
        int l1 = base64variant.e() >> 2;
        int k1 = i1;
        i1 = l1;
        do
        {
            if (k1 > j1 - 3)
            {
                break;
            }
            if (t > k2)
            {
                t();
            }
            l1 = k1 + 1;
            k1 = abyte0[k1];
            int i2 = l1 + 1;
            byte byte0 = abyte0[l1];
            l1 = i2 + 1;
            t = base64variant.a((byte0 & 0xff | k1 << 8) << 8 | abyte0[i2] & 0xff, s, t);
            i2 = i1 - 1;
            i1 = i2;
            k1 = l1;
            if (i2 <= 0)
            {
                byte abyte1[] = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 92;
                abyte1 = s;
                i1 = t;
                t = i1 + 1;
                abyte1[i1] = 110;
                i1 = base64variant.e() >> 2;
                k1 = l1;
            }
        } while (true);
        l1 = j1 - k1;
        if (l1 > 0)
        {
            if (t > k2)
            {
                t();
            }
            int j2 = k1 + 1;
            j1 = abyte0[k1] << 16;
            i1 = j1;
            if (l1 == 2)
            {
                i1 = j1 | (abyte0[j2] & 0xff) << 8;
            }
            t = base64variant.a(i1, l1, s, t);
        }
    }

    public final void b(f f1)
        throws IOException, JsonGenerationException
    {
        boolean flag = true;
        int i1 = e.a(f1.a());
        if (i1 == 4)
        {
            j("Can not write a field name, expecting a value");
        }
        if (a != null)
        {
            if (i1 != 1)
            {
                flag = false;
            }
            a(f1, flag);
            return;
        }
        if (i1 == 1)
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int j1 = t;
            t = j1 + 1;
            abyte0[j1] = 44;
        }
        e(f1);
    }

    public void b(String s1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (s1 == null)
        {
            u();
            return;
        }
        int i1 = s1.length();
        if (i1 > x)
        {
            l(s1);
            return;
        }
        s1.getChars(0, i1, w, 0);
        if (i1 > v)
        {
            d(w, 0, i1);
            return;
        }
        if (t + i1 >= u)
        {
            t();
        }
        s1 = s;
        int j1 = t;
        t = j1 + 1;
        s1[j1] = 34;
        g(w, 0, i1);
        if (t >= u)
        {
            t();
        }
        s1 = s;
        i1 = t;
        t = i1 + 1;
        s1[i1] = 34;
    }

    protected final void b(String s1, int i1)
        throws IOException, JsonGenerationException
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 70
    //                   1 37
    //                   2 48
    //                   3 59;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        r();
_L7:
        return;
_L3:
        a.f(this);
        return;
_L4:
        a.d(this);
        return;
_L5:
        a.a(this);
        return;
_L2:
        if (e.b())
        {
            a.g(this);
            return;
        }
        if (e.d())
        {
            a.h(this);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void b(String s1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (flag)
        {
            a.c(this);
        } else
        {
            a.h(this);
        }
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int i1 = t;
            t = i1 + 1;
            abyte0[i1] = 34;
            i1 = s1.length();
            if (i1 <= x)
            {
                s1.getChars(0, i1, w, 0);
                if (i1 <= v)
                {
                    if (t + i1 > u)
                    {
                        t();
                    }
                    g(w, 0, i1);
                } else
                {
                    f(w, 0, i1);
                }
            } else
            {
                m(s1);
            }
            if (t >= u)
            {
                t();
            }
            s1 = s;
            i1 = t;
            t = i1 + 1;
            s1[i1] = 34;
            return;
        } else
        {
            m(s1);
            return;
        }
    }

    public void b(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (t >= u)
        {
            t();
        }
        byte abyte1[] = s;
        int k1 = t;
        t = k1 + 1;
        abyte1[k1] = 34;
        if (j1 <= v)
        {
            f(abyte0, i1, j1);
        } else
        {
            e(abyte0, i1, j1);
        }
        if (t >= u)
        {
            t();
        }
        abyte0 = s;
        i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
    }

    public final void b(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k1 = j1 + j1 + j1;
        if (t + k1 <= u) goto _L2; else goto _L1
_L1:
        if (u >= k1) goto _L4; else goto _L3
_L3:
        e(ac, i1, j1);
_L10:
        return;
_L4:
        t();
_L2:
        k1 = j1 + i1;
_L8:
        if (i1 >= k1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
label0:
        {
            j1 = ac[i1];
            if (j1 <= 127)
            {
                break label0;
            }
            j1 = i1 + 1;
            i1 = ac[i1];
            byte abyte1[];
            int i2;
            if (i1 < 2048)
            {
                byte abyte0[] = s;
                int l1 = t;
                t = l1 + 1;
                abyte0[l1] = (byte)(i1 >> 6 | 0xc0);
                abyte0 = s;
                l1 = t;
                t = l1 + 1;
                abyte0[l1] = (byte)(i1 & 0x3f | 0x80);
            } else
            {
                a(i1, ac, j1, k1);
            }
            i1 = j1;
        }
        continue; /* Loop/switch isn't completed */
        abyte1 = s;
        i2 = t;
        t = i2 + 1;
        abyte1[i2] = (byte)j1;
        j1 = i1 + 1;
        i1 = j1;
        if (j1 < k1) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public Object c()
    {
        return r;
    }

    public final void c(f f1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        i1 = f1.a(s, t);
        if (i1 < 0)
        {
            b(f1.e());
        } else
        {
            t = i1 + t;
        }
        if (t >= u)
        {
            t();
        }
        f1 = s;
        i1 = t;
        t = i1 + 1;
        f1[i1] = 34;
    }

    public void c(String s1)
        throws IOException, JsonGenerationException
    {
        int i1 = s1.length();
        int j1 = 0;
        int k1;
        for (; i1 > 0; i1 -= k1)
        {
            char ac[] = w;
            int l1 = ac.length;
            k1 = l1;
            if (i1 < l1)
            {
                k1 = i1;
            }
            s1.getChars(j1, j1 + k1, ac, 0);
            b(ac, 0, k1);
            j1 += k1;
        }

    }

    public void close()
        throws IOException
    {
        super.close();
        if (s != null && c(com.fasterxml.jackson.core.JsonGenerator.Feature.b))
        {
            do
            {
                com.fasterxml.jackson.core.b.d d1 = p();
                if (d1.b())
                {
                    j();
                    continue;
                }
                if (!d1.d())
                {
                    break;
                }
                l();
            } while (true);
        }
        t();
        if (r == null) goto _L2; else goto _L1
_L1:
        if (!h.c() && !c(com.fasterxml.jackson.core.JsonGenerator.Feature.a)) goto _L4; else goto _L3
_L3:
        r.close();
_L2:
        q();
        return;
_L4:
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.f))
        {
            r.flush();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void d(f f1)
        throws IOException, JsonGenerationException
    {
        f1 = f1.d();
        if (f1.length > 0)
        {
            b(f1);
        }
    }

    protected final void e(f f1)
        throws IOException, JsonGenerationException
    {
        if (!c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            int i1 = f1.a(s, t);
            if (i1 < 0)
            {
                b(f1.e());
                return;
            } else
            {
                t = i1 + t;
                return;
            }
        }
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int j1 = t;
        t = j1 + 1;
        abyte0[j1] = 34;
        j1 = f1.a(s, t);
        if (j1 < 0)
        {
            b(f1.e());
        } else
        {
            t = j1 + t;
        }
        if (t >= u)
        {
            t();
        }
        f1 = s;
        j1 = t;
        t = j1 + 1;
        f1[j1] = 34;
    }

    public void e(String s1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            c(s1);
            return;
        } else
        {
            c(s1);
            return;
        }
    }

    public final void flush()
        throws IOException
    {
        t();
        if (r != null && c(com.fasterxml.jackson.core.JsonGenerator.Feature.f))
        {
            r.flush();
        }
    }

    public final void i()
        throws IOException, JsonGenerationException
    {
        i("start an array");
        e = e.j();
        if (a != null)
        {
            a.e(this);
            return;
        }
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 91;
    }

    protected final void i(String s1)
        throws IOException, JsonGenerationException
    {
        int i1;
        i1 = e.m();
        if (i1 == 5)
        {
            j((new StringBuilder()).append("Can not ").append(s1).append(", expecting field name").toString());
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 1 3: default 76
    //                   1 77
    //                   2 116
    //                   3 122;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L4:
        byte byte0 = 44;
_L7:
        if (t >= u)
        {
            t();
        }
        s[t] = byte0;
        t = t + 1;
        return;
_L5:
        byte0 = 58;
          goto _L7
_L6:
        if (l == null) goto _L3; else goto _L8
_L8:
        s1 = l.d();
        if (s1.length <= 0) goto _L3; else goto _L9
_L9:
        b(s1);
        return;
_L2:
        b(s1, i1);
        return;
    }

    public final void j()
        throws IOException, JsonGenerationException
    {
        if (!e.b())
        {
            j((new StringBuilder()).append("Current context not an ARRAY but ").append(e.e()).toString());
        }
        if (a != null)
        {
            a.b(this, e.f());
        } else
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int i1 = t;
            t = i1 + 1;
            abyte0[i1] = 93;
        }
        e = e.l();
    }

    public final void k()
        throws IOException, JsonGenerationException
    {
        i("start an object");
        e = e.k();
        if (a != null)
        {
            a.b(this);
            return;
        }
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 123;
    }

    protected final void k(String s1)
        throws IOException, JsonGenerationException
    {
        if (!c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            m(s1);
            return;
        }
        if (t >= u)
        {
            t();
        }
        byte abyte0[] = s;
        int i1 = t;
        t = i1 + 1;
        abyte0[i1] = 34;
        i1 = s1.length();
        if (i1 <= x)
        {
            s1.getChars(0, i1, w, 0);
            if (i1 <= v)
            {
                if (t + i1 > u)
                {
                    t();
                }
                g(w, 0, i1);
            } else
            {
                f(w, 0, i1);
            }
        } else
        {
            m(s1);
        }
        if (t >= u)
        {
            t();
        }
        s1 = s;
        i1 = t;
        t = i1 + 1;
        s1[i1] = 34;
    }

    public final void l()
        throws IOException, JsonGenerationException
    {
        if (!e.d())
        {
            j((new StringBuilder()).append("Current context not an object but ").append(e.e()).toString());
        }
        if (a != null)
        {
            a.a(this, e.f());
        } else
        {
            if (t >= u)
            {
                t();
            }
            byte abyte0[] = s;
            int i1 = t;
            t = i1 + 1;
            abyte0[i1] = 125;
        }
        e = e.l();
    }

    public void m()
        throws IOException, JsonGenerationException
    {
        i("write null value");
        u();
    }

    protected void q()
    {
        char ac[] = s;
        if (ac != null && z)
        {
            s = null;
            h.b(ac);
        }
        ac = w;
        if (ac != null)
        {
            w = null;
            h.b(ac);
        }
    }

    protected final void t()
        throws IOException
    {
        int i1 = t;
        if (i1 > 0)
        {
            t = 0;
            r.write(s, 0, i1);
        }
    }

}
