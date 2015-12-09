// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.a;
import com.fasterxml.jackson.core.util.f;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            b, j

public final class d
{

    protected static final ThreadLocal a = new ThreadLocal();
    private static final char e[] = com.fasterxml.jackson.core.io.b.g();
    private static final byte f[] = com.fasterxml.jackson.core.io.b.h();
    private static final int g = 55296;
    private static final int h = 56319;
    private static final int i = 56320;
    private static final int j = 57343;
    private static final int k = 92;
    private static final int l = 117;
    private static final int m = 48;
    protected f b;
    protected a c;
    protected final char d[] = new char[6];

    public d()
    {
        d[0] = '\\';
        d[2] = '0';
        d[3] = '0';
    }

    protected static int a(int i1, int j1)
    {
        if (j1 < 56320 || j1 > 57343)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(i1)).append(", second 0x").append(Integer.toHexString(j1)).append("; illegal combination").toString());
        } else
        {
            return 0x10000 + (i1 - 55296 << 10) + (j1 - 56320);
        }
    }

    private int a(int i1, int j1, a a1, int k1)
    {
        a1.e(k1);
        a1.a(92);
        if (j1 < 0)
        {
            a1.a(117);
            if (i1 > 255)
            {
                j1 = i1 >> 8;
                a1.a(f[j1 >> 4]);
                a1.a(f[j1 & 0xf]);
                i1 &= 0xff;
            } else
            {
                a1.a(48);
                a1.a(48);
            }
            a1.a(f[i1 >> 4]);
            a1.a(f[i1 & 0xf]);
        } else
        {
            a1.a((byte)j1);
        }
        return a1.g();
    }

    private int a(int i1, char ac[])
    {
        ac[1] = 'u';
        ac[4] = e[i1 >> 4];
        ac[5] = e[i1 & 0xf];
        return 6;
    }

    public static d a()
    {
        Object obj = (SoftReference)a.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (d)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new d();
            a.set(new SoftReference(obj1));
        }
        return ((d) (obj1));
    }

    protected static void a(int i1)
    {
        throw new IllegalArgumentException(com.fasterxml.jackson.core.io.j.c(i1));
    }

    private int b(int i1, char ac[])
    {
        ac[1] = (char)i1;
        return 2;
    }

    public char[] a(String s)
    {
        f f1 = b;
        f f2 = f1;
        if (f1 == null)
        {
            f2 = new f(null);
            b = f2;
        }
        char ac[] = f2.m();
        int ai[] = com.fasterxml.jackson.core.io.b.f();
        int i2 = ai.length;
        int j2 = s.length();
        int i1 = 0;
        int j1 = 0;
label0:
        do
        {
            int k1 = i1;
            if (j1 < j2)
            {
                do
                {
                    char c1 = s.charAt(j1);
                    if (c1 < i2 && ai[c1] != 0)
                    {
                        k1 = s.charAt(j1);
                        int l1 = ai[k1];
                        if (l1 < 0)
                        {
                            k1 = a(k1, d);
                        } else
                        {
                            k1 = b(l1, d);
                        }
                        if (i1 + k1 > ac.length)
                        {
                            l1 = ac.length - i1;
                            if (l1 > 0)
                            {
                                System.arraycopy(d, 0, ac, i1, l1);
                            }
                            ac = f2.o();
                            i1 = k1 - l1;
                            System.arraycopy(d, l1, ac, 0, i1);
                        } else
                        {
                            System.arraycopy(d, 0, ac, i1, k1);
                            i1 += k1;
                        }
                        j1++;
                        continue label0;
                    }
                    if (i1 >= ac.length)
                    {
                        ac = f2.o();
                        i1 = 0;
                    }
                    k1 = i1 + 1;
                    ac[i1] = c1;
                    l1 = j1 + 1;
                    i1 = k1;
                    j1 = l1;
                } while (l1 < j2);
            }
            f2.a(k1);
            return f2.h();
        } while (true);
    }

    public byte[] b(String s)
    {
        byte abyte0[];
        a a2;
        int i1;
        int j1;
        int i2;
        a a1 = c;
        a2 = a1;
        if (a1 == null)
        {
            a2 = new a(null);
            c = a2;
        }
        i2 = s.length();
        abyte0 = a2.d();
        i1 = 0;
        j1 = 0;
_L2:
        int k1;
        int l1;
label0:
        {
            k1 = i1;
            if (j1 < i2)
            {
                int ai[] = com.fasterxml.jackson.core.io.b.f();
                byte abyte1[] = abyte0;
                do
                {
                    l1 = s.charAt(j1);
                    if (l1 > 127 || ai[l1] != 0)
                    {
                        abyte0 = abyte1;
                        l1 = i1;
                        if (i1 >= abyte1.length)
                        {
                            abyte0 = a2.e();
                            l1 = 0;
                        }
                        k1 = j1 + 1;
                        j1 = s.charAt(j1);
                        if (j1 <= 127)
                        {
                            i1 = a(j1, ai[j1], a2, l1);
                            abyte0 = a2.f();
                            j1 = k1;
                            continue; /* Loop/switch isn't completed */
                        }
                        break label0;
                    }
                    if (i1 >= abyte1.length)
                    {
                        abyte1 = a2.e();
                        i1 = 0;
                    }
                    k1 = i1 + 1;
                    abyte1[i1] = (byte)l1;
                    l1 = j1 + 1;
                    i1 = k1;
                    j1 = l1;
                } while (l1 < i2);
            }
            return c.d(k1);
        }
        if (j1 > 2047)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l1 + 1;
        abyte0[l1] = (byte)(j1 >> 6 | 0xc0);
        j1 = j1 & 0x3f | 0x80;
_L3:
        byte abyte2[] = abyte0;
        l1 = i1;
        if (i1 >= abyte0.length)
        {
            abyte2 = a2.e();
            l1 = 0;
        }
        abyte2[l1] = (byte)j1;
        abyte0 = abyte2;
        j1 = k1;
        i1 = l1 + 1;
        if (true) goto _L2; else goto _L1
_L1:
        if (j1 < 55296 || j1 > 57343)
        {
            i1 = l1 + 1;
            abyte0[l1] = (byte)(j1 >> 12 | 0xe0);
            if (i1 >= abyte0.length)
            {
                abyte0 = a2.e();
                i1 = 0;
            }
            l1 = i1 + 1;
            abyte0[i1] = (byte)(j1 >> 6 & 0x3f | 0x80);
            j1 = j1 & 0x3f | 0x80;
            i1 = l1;
        } else
        {
            if (j1 > 56319)
            {
                a(j1);
            }
            if (k1 >= i2)
            {
                a(j1);
            }
            int j2 = a(j1, s.charAt(k1));
            if (j2 > 0x10ffff)
            {
                a(j2);
            }
            i1 = l1 + 1;
            abyte0[l1] = (byte)(j2 >> 18 | 0xf0);
            if (i1 >= abyte0.length)
            {
                abyte0 = a2.e();
                i1 = 0;
            }
            j1 = i1 + 1;
            abyte0[i1] = (byte)(j2 >> 12 & 0x3f | 0x80);
            if (j1 >= abyte0.length)
            {
                abyte0 = a2.e();
                i1 = 0;
            } else
            {
                i1 = j1;
            }
            l1 = i1 + 1;
            abyte0[i1] = (byte)(j2 >> 6 & 0x3f | 0x80);
            k1++;
            j1 = j2 & 0x3f | 0x80;
            i1 = l1;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public byte[] c(String s)
    {
        byte abyte0[];
        a a2;
        int i1;
        int j1;
        int k1;
        int k3;
        a a1 = c;
        a2 = a1;
        if (a1 == null)
        {
            a2 = new a(null);
            c = a2;
        }
        k3 = s.length();
        abyte0 = a2.d();
        k1 = abyte0.length;
        i1 = 0;
        j1 = 0;
_L7:
        if (j1 >= k3) goto _L2; else goto _L1
_L1:
        int l1;
        int i2 = j1 + 1;
        char c1 = s.charAt(j1);
        l1 = k1;
        j1 = i2;
        k1 = c1;
_L5:
        int j2;
        if (k1 > 127)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = l1;
        int i3 = i1;
        if (i1 >= l1)
        {
            abyte0 = a2.e();
            j2 = abyte0.length;
            i3 = 0;
        }
        i1 = i3 + 1;
        abyte0[i3] = (byte)k1;
        if (j1 < k3) goto _L3; else goto _L2
_L2:
        return c.d(i1);
_L3:
        k1 = s.charAt(j1);
        j1++;
        l1 = j2;
        if (true) goto _L5; else goto _L4
_L4:
        int k2;
        int j3;
        if (i1 >= l1)
        {
            abyte0 = a2.e();
            i1 = abyte0.length;
            l1 = 0;
        } else
        {
            int l2 = i1;
            i1 = l1;
            l1 = l2;
        }
        if (k1 >= 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        k2 = l1 + 1;
        abyte0[l1] = (byte)(k1 >> 6 | 0xc0);
        l1 = k1;
        k1 = k2;
        k2 = i1;
        j3 = k1;
        if (k1 >= i1)
        {
            abyte0 = a2.e();
            k2 = abyte0.length;
            j3 = 0;
        }
        abyte0[j3] = (byte)(l1 & 0x3f | 0x80);
        k1 = k2;
        i1 = j3 + 1;
        if (true) goto _L7; else goto _L6
_L6:
        if (k1 < 55296 || k1 > 57343)
        {
            j3 = l1 + 1;
            abyte0[l1] = (byte)(k1 >> 12 | 0xe0);
            l1 = i1;
            k2 = j3;
            if (j3 >= i1)
            {
                abyte0 = a2.e();
                l1 = abyte0.length;
                k2 = 0;
            }
            abyte0[k2] = (byte)(k1 >> 6 & 0x3f | 0x80);
            j3 = k2 + 1;
            k2 = k1;
            i1 = l1;
            k1 = j3;
            l1 = k2;
        } else
        {
            if (k1 > 56319)
            {
                a(k1);
            }
            if (j1 >= k3)
            {
                a(k1);
            }
            k2 = a(k1, s.charAt(j1));
            if (k2 > 0x10ffff)
            {
                a(k2);
            }
            j3 = l1 + 1;
            abyte0[l1] = (byte)(k2 >> 18 | 0xf0);
            k1 = i1;
            l1 = j3;
            if (j3 >= i1)
            {
                abyte0 = a2.e();
                k1 = abyte0.length;
                l1 = 0;
            }
            i1 = l1 + 1;
            abyte0[l1] = (byte)(k2 >> 12 & 0x3f | 0x80);
            if (i1 >= k1)
            {
                abyte0 = a2.e();
                i1 = abyte0.length;
                k1 = 0;
            } else
            {
                l1 = i1;
                i1 = k1;
                k1 = l1;
            }
            abyte0[k1] = (byte)(k2 >> 6 & 0x3f | 0x80);
            k1++;
            l1 = k2;
            j1++;
        }
        break MISSING_BLOCK_LABEL_219;
        if (true) goto _L7; else goto _L8
_L8:
    }

}
