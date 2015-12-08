// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package c:
//            i, j, ag, z, 
//            aa, ad, k, g, 
//            ab, h, ae

public final class f
    implements i, j, Cloneable
{

    private static final byte c[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    z a;
    long b;

    public f()
    {
    }

    public int a(byte abyte0[], int i1, int j1)
    {
        ag.a(abyte0.length, i1, j1);
        z z1 = a;
        if (z1 == null)
        {
            i1 = -1;
        } else
        {
            j1 = Math.min(j1, z1.c - z1.b);
            System.arraycopy(z1.a, z1.b, abyte0, i1, j1);
            z1.b = z1.b + j1;
            b = b - (long)j1;
            i1 = j1;
            if (z1.b == z1.c)
            {
                a = z1.a();
                aa.a(z1);
                return j1;
            }
        }
        return i1;
    }

    public long a()
    {
        return b;
    }

    public long a(byte byte0)
    {
        return a(byte0, 0L);
    }

    public long a(byte byte0, long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        z z1 = a;
        if (z1 == null)
        {
            return -1L;
        }
        long l2 = 0L;
        do
        {
            int j1 = z1.c - z1.b;
            z z2;
            if (l1 >= (long)j1)
            {
                l1 -= j1;
            } else
            {
                byte abyte0[] = z1.a;
                int i1 = (int)((long)z1.b + l1);
                for (int k1 = z1.c; i1 < k1; i1++)
                {
                    if (abyte0[i1] == byte0)
                    {
                        return (l2 + (long)i1) - (long)z1.b;
                    }
                }

                l1 = 0L;
            }
            l2 += j1;
            z2 = z1.f;
            z1 = z2;
        } while (z2 != a);
        return -1L;
    }

    public long a(ad ad1)
    {
        if (ad1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = ad1.read(this, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
            } else
            {
                return l1;
            }
        } while (true);
    }

    public f a(int i1)
    {
        if (i1 < 128)
        {
            b(i1);
            return this;
        }
        if (i1 < 2048)
        {
            b(i1 >> 6 | 0xc0);
            b(i1 & 0x3f | 0x80);
            return this;
        }
        if (i1 < 0x10000)
        {
            if (i1 >= 55296 && i1 <= 57343)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected code point: ").append(Integer.toHexString(i1)).toString());
            } else
            {
                b(i1 >> 12 | 0xe0);
                b(i1 >> 6 & 0x3f | 0x80);
                b(i1 & 0x3f | 0x80);
                return this;
            }
        }
        if (i1 <= 0x10ffff)
        {
            b(i1 >> 18 | 0xf0);
            b(i1 >> 12 & 0x3f | 0x80);
            b(i1 >> 6 & 0x3f | 0x80);
            b(i1 & 0x3f | 0x80);
            return this;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected code point: ").append(Integer.toHexString(i1)).toString());
        }
    }

    public f a(f f1, long l1, long l2)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        ag.a(b, l1, l2);
        if (l2 != 0L)
        {
            f1.b = f1.b + l2;
            z z1 = a;
            z z3;
            long l3;
            long l4;
            do
            {
                z3 = z1;
                l3 = l1;
                l4 = l2;
                if (l1 < (long)(z1.c - z1.b))
                {
                    break;
                }
                l1 -= z1.c - z1.b;
                z1 = z1.f;
            } while (true);
            while (l4 > 0L) 
            {
                z z2 = new z(z3);
                z2.b = (int)((long)z2.b + l3);
                z2.c = Math.min(z2.b + (int)l4, z2.c);
                if (f1.a == null)
                {
                    z2.g = z2;
                    z2.f = z2;
                    f1.a = z2;
                } else
                {
                    f1.a.g.a(z2);
                }
                l4 -= z2.c - z2.b;
                z3 = z3.f;
                l3 = 0L;
            }
        }
        return this;
    }

    public f a(k k1)
    {
        if (k1 == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            k1.a(this);
            return this;
        }
    }

    public f a(String s1)
    {
        return a(s1, 0, s1.length());
    }

    public f a(String s1, int i1, int j1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (i1 < 0)
        {
            throw new IllegalAccessError((new StringBuilder()).append("beginIndex < 0: ").append(i1).toString());
        }
        if (j1 < i1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("endIndex < beginIndex: ").append(j1).append(" < ").append(i1).toString());
        }
        if (j1 > s1.length())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("endIndex > string.length: ").append(j1).append(" > ").append(s1.length()).toString());
        }
          goto _L1
_L3:
        int k1 = 0;
_L4:
        char c1;
        if (c1 > '\uDBFF' || k1 < 56320 || k1 > 57343)
        {
            b(63);
            i1++;
        } else
        {
            k1 = (k1 & 0xffff23ff | (c1 & 0xffff27ff) << 10) + 0x10000;
            b(k1 >> 18 | 0xf0);
            b(k1 >> 12 & 0x3f | 0x80);
            b(k1 >> 6 & 0x3f | 0x80);
            b(k1 & 0x3f | 0x80);
            i1 += 2;
        }
_L1:
label0:
        do
        {
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_535;
            }
            c1 = s1.charAt(i1);
            if (c1 < '\200')
            {
                z z1 = e(1);
                byte abyte0[] = z1.a;
                int l1 = z1.c - i1;
                int i2 = Math.min(j1, 2048 - l1);
                k1 = i1 + 1;
                abyte0[l1 + i1] = (byte)c1;
                i1 = k1;
                do
                {
label1:
                    {
                        if (i1 < i2)
                        {
                            k1 = s1.charAt(i1);
                            if (k1 < 128)
                            {
                                break label1;
                            }
                        }
                        k1 = (i1 + l1) - z1.c;
                        z1.c = z1.c + k1;
                        b = b + (long)k1;
                        continue label0;
                    }
                    abyte0[i1 + l1] = (byte)k1;
                    i1++;
                } while (true);
            }
            if (c1 < '\u0800')
            {
                b(c1 >> 6 | 0xc0);
                b(c1 & 0x3f | 0x80);
                i1++;
            } else
            {
                if (c1 >= '\uD800' && c1 <= '\uDFFF')
                {
                    continue; /* Loop/switch isn't completed */
                }
                b(c1 >> 12 | 0xe0);
                b(c1 >> 6 & 0x3f | 0x80);
                b(c1 & 0x3f | 0x80);
                i1++;
            }
        } while (true);
        if (i1 + 1 >= j1) goto _L3; else goto _L2
_L2:
        k1 = s1.charAt(i1 + 1);
          goto _L4
        return this;
    }

    public f a(String s1, int i1, int j1, Charset charset)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (i1 < 0)
        {
            throw new IllegalAccessError((new StringBuilder()).append("beginIndex < 0: ").append(i1).toString());
        }
        if (j1 < i1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("endIndex < beginIndex: ").append(j1).append(" < ").append(i1).toString());
        }
        if (j1 > s1.length())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("endIndex > string.length: ").append(j1).append(" > ").append(s1.length()).toString());
        }
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(ag.a))
        {
            return a(s1);
        } else
        {
            s1 = s1.substring(i1, j1).getBytes(charset);
            return b(s1, 0, s1.length);
        }
    }

    public f a(String s1, Charset charset)
    {
        return a(s1, 0, s1.length(), charset);
    }

    public String a(long l1, Charset charset)
    {
        ag.a(b, 0L, l1);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount > Integer.MAX_VALUE: ").append(l1).toString());
        }
        if (l1 == 0L)
        {
            charset = "";
        } else
        {
            z z1 = a;
            if ((long)z1.b + l1 > (long)z1.c)
            {
                return new String(f(l1), charset);
            }
            String s1 = new String(z1.a, z1.b, (int)l1, charset);
            z1.b = (int)((long)z1.b + l1);
            b = b - l1;
            charset = s1;
            if (z1.b == z1.c)
            {
                a = z1.a();
                aa.a(z1);
                return s1;
            }
        }
        return charset;
    }

    public void a(long l1)
    {
        if (b < l1)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public void a(byte abyte0[])
    {
        int j1;
        for (int i1 = 0; i1 < abyte0.length; i1 += j1)
        {
            j1 = a(abyte0, i1, abyte0.length - i1);
            if (j1 == -1)
            {
                throw new EOFException();
            }
        }

    }

    public byte b(long l1)
    {
        ag.a(b, l1, 1L);
        z z1 = a;
        do
        {
            int i1 = z1.c - z1.b;
            if (l1 < (long)i1)
            {
                return z1.a[z1.b + (int)l1];
            }
            l1 -= i1;
            z1 = z1.f;
        } while (true);
    }

    public f b()
    {
        return this;
    }

    public f b(int i1)
    {
        z z1 = e(1);
        byte abyte0[] = z1.a;
        int j1 = z1.c;
        z1.c = j1 + 1;
        abyte0[j1] = (byte)i1;
        b = b + 1L;
        return this;
    }

    public f b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return b(abyte0, 0, abyte0.length);
        }
    }

    public f b(byte abyte0[], int i1, int j1)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        ag.a(abyte0.length, i1, j1);
        for (int k1 = i1 + j1; i1 < k1;)
        {
            z z1 = e(1);
            int l1 = Math.min(k1 - i1, 2048 - z1.c);
            System.arraycopy(abyte0, i1, z1.a, z1.c, l1);
            i1 += l1;
            z1.c = l1 + z1.c;
        }

        b = b + (long)j1;
        return this;
    }

    public i b(k k1)
    {
        return a(k1);
    }

    public i b(String s1)
    {
        return a(s1);
    }

    public f c(int i1)
    {
        z z1 = e(2);
        byte abyte0[] = z1.a;
        int j1 = z1.c;
        int k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[k1] = (byte)(i1 & 0xff);
        z1.c = k1 + 1;
        b = b + 2L;
        return this;
    }

    public i c(byte abyte0[])
    {
        return b(abyte0);
    }

    public i c(byte abyte0[], int i1, int j1)
    {
        return b(abyte0, i1, j1);
    }

    public k c(long l1)
    {
        return new k(f(l1));
    }

    public OutputStream c()
    {
        return new g(this);
    }

    public Object clone()
    {
        return u();
    }

    public void close()
    {
    }

    public f d()
    {
        return this;
    }

    public f d(int i1)
    {
        z z1 = e(4);
        byte abyte0[] = z1.a;
        int k1 = z1.c;
        int j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 24 & 0xff);
        k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 16 & 0xff);
        j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[j1] = (byte)(i1 & 0xff);
        z1.c = j1 + 1;
        b = b + 4L;
        return this;
    }

    public String d(long l1)
    {
        return a(l1, ag.a);
    }

    public i e()
    {
        return this;
    }

    z e(int i1)
    {
        if (i1 < 1 || i1 > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        z z1;
        a = aa.a();
        z z2 = a;
        z z4 = a;
        z1 = a;
        z4.g = z1;
        z2.f = z1;
_L4:
        return z1;
_L2:
        z z3;
        z3 = a.g;
        if (z3.c + i1 > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        z1 = z3;
        if (z3.e) goto _L4; else goto _L3
_L3:
        return z3.a(aa.a());
    }

    String e(long l1)
    {
        if (l1 > 0L && b(l1 - 1L) == 13)
        {
            String s1 = d(l1 - 1L);
            g(2L);
            return s1;
        } else
        {
            String s2 = d(l1);
            g(1L);
            return s2;
        }
    }

    public boolean equals(Object obj)
    {
        long l2 = 0L;
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof f))
        {
            return false;
        }
        obj = (f)obj;
        if (b != ((f) (obj)).b)
        {
            return false;
        }
        if (b == 0L)
        {
            return true;
        }
        Object obj1 = a;
        obj = ((f) (obj)).a;
        int j1 = ((z) (obj1)).b;
        int i1 = ((z) (obj)).b;
        while (l2 < b) 
        {
            long l3 = Math.min(((z) (obj1)).c - j1, ((z) (obj)).c - i1);
            for (int k1 = 0; (long)k1 < l3;)
            {
                if (((z) (obj1)).a[j1] != ((z) (obj)).a[i1])
                {
                    return false;
                }
                k1++;
                i1++;
                j1++;
            }

            int l1 = j1;
            z z1 = ((z) (obj1));
            if (j1 == ((z) (obj1)).c)
            {
                z1 = ((z) (obj1)).f;
                l1 = z1.b;
            }
            j1 = i1;
            obj1 = obj;
            if (i1 == ((z) (obj)).c)
            {
                obj1 = ((z) (obj)).f;
                j1 = ((z) (obj1)).b;
            }
            l2 += l3;
            i1 = j1;
            j1 = l1;
            obj = obj1;
            obj1 = z1;
        }
        return true;
    }

    public k f(int i1)
    {
        if (i1 == 0)
        {
            return k.b;
        } else
        {
            return new ab(this, i1);
        }
    }

    public boolean f()
    {
        return b == 0L;
    }

    public byte[] f(long l1)
    {
        ag.a(b, 0L, l1);
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount > Integer.MAX_VALUE: ").append(l1).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l1];
            a(abyte0);
            return abyte0;
        }
    }

    public void flush()
    {
    }

    public i g(int i1)
    {
        return d(i1);
    }

    public InputStream g()
    {
        return new h(this);
    }

    public void g(long l1)
    {
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            if (a == null)
            {
                throw new EOFException();
            }
            int i1 = (int)Math.min(l1, a.c - a.b);
            b = b - (long)i1;
            long l2 = l1 - (long)i1;
            z z1 = a;
            z1.b = i1 + z1.b;
            l1 = l2;
            if (a.b == a.c)
            {
                z z2 = a;
                a = z2.a();
                aa.a(z2);
                l1 = l2;
            }
        } while (true);
    }

    public long h()
    {
        long l2 = b;
        long l1;
        if (l2 == 0L)
        {
            l1 = 0L;
        } else
        {
            z z1 = a.g;
            l1 = l2;
            if (z1.c < 2048)
            {
                l1 = l2;
                if (z1.e)
                {
                    return l2 - (long)(z1.c - z1.b);
                }
            }
        }
        return l1;
    }

    public f h(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        z z1;
        byte abyte0[];
        int i1;
        boolean flag;
        int j1;
        if (l1 < 0L)
        {
            l1 = -l1;
            if (l1 < 0L)
            {
                return a("-9223372036854775808");
            }
            flag = true;
        } else
        {
            flag = false;
        }
        if (l1 < 0x5f5e100L)
        {
            if (l1 < 10000L)
            {
                if (l1 < 100L)
                {
                    if (l1 < 10L)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 2;
                    }
                } else
                if (l1 < 1000L)
                {
                    i1 = 3;
                } else
                {
                    i1 = 4;
                }
            } else
            if (l1 < 0xf4240L)
            {
                if (l1 < 0x186a0L)
                {
                    i1 = 5;
                } else
                {
                    i1 = 6;
                }
            } else
            if (l1 < 0x989680L)
            {
                i1 = 7;
            } else
            {
                i1 = 8;
            }
        } else
        if (l1 < 0xe8d4a51000L)
        {
            if (l1 < 0x2540be400L)
            {
                if (l1 < 0x3b9aca00L)
                {
                    i1 = 9;
                } else
                {
                    i1 = 10;
                }
            } else
            if (l1 < 0x174876e800L)
            {
                i1 = 11;
            } else
            {
                i1 = 12;
            }
        } else
        if (l1 < 0x38d7ea4c68000L)
        {
            if (l1 < 0x9184e72a000L)
            {
                i1 = 13;
            } else
            if (l1 < 0x5af3107a4000L)
            {
                i1 = 14;
            } else
            {
                i1 = 15;
            }
        } else
        if (l1 < 0x16345785d8a0000L)
        {
            if (l1 < 0x2386f26fc10000L)
            {
                i1 = 16;
            } else
            {
                i1 = 17;
            }
        } else
        if (l1 < 0xde0b6b3a7640000L)
        {
            i1 = 18;
        } else
        {
            i1 = 19;
        }
        j1 = i1;
        if (flag)
        {
            j1 = i1 + 1;
        }
        z1 = e(j1);
        abyte0 = z1.a;
        i1 = z1.c + j1;
        for (; l1 != 0L; l1 /= 10L)
        {
            int k1 = (int)(l1 % 10L);
            i1--;
            abyte0[i1] = c[k1];
        }

        if (flag)
        {
            abyte0[i1 - 1] = 45;
        }
        z1.c = z1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public i h(int i1)
    {
        return c(i1);
    }

    public int hashCode()
    {
        z z1 = a;
        if (z1 == null)
        {
            return 0;
        }
        int j1 = 1;
        z z2;
        int i1;
        do
        {
            int k1 = z1.b;
            int l1 = z1.c;
            for (i1 = j1; k1 < l1; i1 = j1 + i1 * 31)
            {
                j1 = z1.a[k1];
                k1++;
            }

            z2 = z1.f;
            j1 = i1;
            z1 = z2;
        } while (z2 != a);
        return i1;
    }

    public byte i()
    {
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        z z1 = a;
        int i1 = z1.b;
        int j1 = z1.c;
        byte abyte0[] = z1.a;
        int k1 = i1 + 1;
        byte byte0 = abyte0[i1];
        b = b - 1L;
        if (k1 == j1)
        {
            a = z1.a();
            aa.a(z1);
            return byte0;
        } else
        {
            z1.b = k1;
            return byte0;
        }
    }

    public f i(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        int j1 = Long.numberOfTrailingZeros(Long.highestOneBit(l1)) / 4 + 1;
        z z1 = e(j1);
        byte abyte0[] = z1.a;
        int i1 = (z1.c + j1) - 1;
        for (int k1 = z1.c; i1 >= k1; i1--)
        {
            abyte0[i1] = c[(int)(15L & l1)];
            l1 >>>= 4;
        }

        z1.c = z1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public i i(int i1)
    {
        return b(i1);
    }

    public i j(long l1)
    {
        return i(l1);
    }

    public short j()
    {
        if (b < 2L)
        {
            throw new IllegalStateException((new StringBuilder()).append("size < 2: ").append(b).toString());
        }
        z z1 = a;
        int k1 = z1.b;
        int i1 = z1.c;
        if (i1 - k1 < 2)
        {
            return (short)((i() & 0xff) << 8 | i() & 0xff);
        }
        byte abyte0[] = z1.a;
        int j1 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = j1 + 1;
        j1 = abyte0[j1];
        b = b - 2L;
        if (l1 == i1)
        {
            a = z1.a();
            aa.a(z1);
        } else
        {
            z1.b = l1;
        }
        return (short)((k1 & 0xff) << 8 | j1 & 0xff);
    }

    public int k()
    {
        if (b < 4L)
        {
            throw new IllegalStateException((new StringBuilder()).append("size < 4: ").append(b).toString());
        }
        z z1 = a;
        int j1 = z1.b;
        int i1 = z1.c;
        if (i1 - j1 < 4)
        {
            return (i() & 0xff) << 24 | (i() & 0xff) << 16 | (i() & 0xff) << 8 | i() & 0xff;
        }
        byte abyte0[] = z1.a;
        int k1 = j1 + 1;
        j1 = abyte0[j1];
        int i2 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = i2 + 1;
        byte byte0 = abyte0[i2];
        i2 = l1 + 1;
        j1 = (j1 & 0xff) << 24 | (k1 & 0xff) << 16 | (byte0 & 0xff) << 8 | abyte0[l1] & 0xff;
        b = b - 4L;
        if (i2 == i1)
        {
            a = z1.a();
            aa.a(z1);
            return j1;
        } else
        {
            z1.b = i2;
            return j1;
        }
    }

    public i k(long l1)
    {
        return h(l1);
    }

    public short l()
    {
        return ag.a(j());
    }

    public int m()
    {
        return ag.a(k());
    }

    public long n()
    {
        byte byte0;
        int k1;
        int l1;
        long l3;
        long l4;
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l3 = 0L;
        k1 = 0;
        l1 = 0;
        byte0 = 0;
        l4 = -7L;
_L6:
        Object obj;
        byte abyte0[];
        int i1;
        boolean flag;
        int j1;
        int i2;
        long l2;
        obj = a;
        abyte0 = ((z) (obj)).a;
        j1 = ((z) (obj)).b;
        i2 = ((z) (obj)).c;
        l2 = l3;
        i1 = k1;
        flag = l1;
        l3 = l4;
_L2:
        k1 = byte0;
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        k1 = abyte0[j1];
        if (k1 < 48 || k1 > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = 48 - k1;
        if (l2 < 0xf333333333333334L || l2 == 0xf333333333333334L && (long)l1 < l3)
        {
            obj = (new f()).h(l2).b(k1);
            if (!flag)
            {
                ((f) (obj)).i();
            }
            throw new NumberFormatException((new StringBuilder()).append("Number too large: ").append(((f) (obj)).q()).toString());
        }
        l2 = l2 * 10L + (long)l1;
_L3:
        j1++;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (k1 != 45 || i1 != 0)
            {
                break label0;
            }
            flag = true;
            l3--;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if (i1 == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9] or '-' character but was 0x").append(Integer.toHexString(k1)).toString());
        }
        k1 = 1;
        if (j1 == i2)
        {
            a = ((z) (obj)).a();
            aa.a(((z) (obj)));
        } else
        {
            obj.b = j1;
        }
        if (k1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l4 = l3;
        byte0 = k1;
        l1 = ((flag) ? 1 : 0);
        k1 = i1;
        l3 = l2;
        if (a != null) goto _L6; else goto _L5
_L5:
        b = b - (long)i1;
        if (flag)
        {
            return l2;
        } else
        {
            return -l2;
        }
    }

    public long o()
    {
        int i1;
        int j1;
        long l3;
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        l3 = 0L;
        i1 = 0;
        j1 = 0;
_L6:
        Object obj;
        byte abyte0[];
        int k1;
        int l1;
        int i2;
        long l2;
        obj = a;
        abyte0 = ((z) (obj)).a;
        l1 = ((z) (obj)).b;
        i2 = ((z) (obj)).c;
        l2 = l3;
        k1 = i1;
_L7:
        byte byte0;
        i1 = j1;
        if (l1 >= i2)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        byte0 = abyte0[l1];
        if (byte0 < 48 || byte0 > 57) goto _L2; else goto _L1
_L1:
        i1 = byte0 - 48;
_L4:
        if ((0xf000000000000000L & l2) != 0L)
        {
            obj = (new f()).i(l2).b(byte0);
            throw new NumberFormatException((new StringBuilder()).append("Number too large: ").append(((f) (obj)).q()).toString());
        }
        break MISSING_BLOCK_LABEL_299;
_L2:
        if (byte0 >= 97 && byte0 <= 102)
        {
            i1 = (byte0 - 97) + 10;
            continue; /* Loop/switch isn't completed */
        }
        if (byte0 < 65 || byte0 > 70)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (byte0 - 65) + 10;
        if (true) goto _L4; else goto _L3
_L3:
        if (k1 == 0)
        {
            throw new NumberFormatException((new StringBuilder()).append("Expected leading [0-9a-fA-F] character but was 0x").append(Integer.toHexString(byte0)).toString());
        }
        i1 = 1;
        if (l1 == i2)
        {
            a = ((z) (obj)).a();
            aa.a(((z) (obj)));
        } else
        {
            obj.b = l1;
        }
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i1;
        i1 = k1;
        l3 = l2;
        if (a != null) goto _L6; else goto _L5
_L5:
        b = b - (long)k1;
        return l2;
        l3 = i1;
        k1++;
        l1++;
        l2 = l3 | l2 << 4;
          goto _L7
    }

    public k p()
    {
        return new k(s());
    }

    public String q()
    {
        String s1;
        try
        {
            s1 = a(b, ag.a);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s1;
    }

    public String r()
    {
        long l1 = a((byte)10);
        if (l1 == -1L)
        {
            f f1 = new f();
            a(f1, 0L, Math.min(32L, b));
            throw new EOFException((new StringBuilder()).append("\\n not found: size=").append(a()).append(" content=").append(f1.p().d()).append("...").toString());
        } else
        {
            return e(l1);
        }
    }

    public long read(f f1, long l1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("byteCount < 0: ").append(l1).toString());
        }
        if (b == 0L)
        {
            return -1L;
        }
        long l2 = l1;
        if (l1 > b)
        {
            l2 = b;
        }
        f1.write(this, l2);
        return l2;
    }

    public byte[] s()
    {
        byte abyte0[];
        try
        {
            abyte0 = f(b);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return abyte0;
    }

    public void t()
    {
        try
        {
            g(b);
            return;
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
    }

    public ae timeout()
    {
        return ae.NONE;
    }

    public String toString()
    {
        if (b == 0L)
        {
            return "Buffer[size=0]";
        }
        if (b <= 16L)
        {
            k k1 = u().p();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(b), k1.d()
            });
        }
        String s1;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(a.a, a.b, a.c - a.b);
            for (z z1 = a.f; z1 != a; z1 = z1.f)
            {
                messagedigest.update(z1.a, z1.b, z1.c - z1.b);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s1 = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(b), c.k.a(messagedigest.digest()).d()
        });
        return s1;
    }

    public f u()
    {
        f f1 = new f();
        if (b == 0L)
        {
            return f1;
        }
        f1.a = new z(a);
        z z1 = f1.a;
        z z3 = f1.a;
        z z4 = f1.a;
        z3.g = z4;
        z1.f = z4;
        for (z z2 = a.f; z2 != a; z2 = z2.f)
        {
            f1.a.g.a(new z(z2));
        }

        f1.b = b;
        return f1;
    }

    public k v()
    {
        if (b > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("size > Integer.MAX_VALUE: ").append(b).toString());
        } else
        {
            return f((int)b);
        }
    }

    public i w()
    {
        return d();
    }

    public void write(f f1, long l1)
    {
        if (f1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (f1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        ag.a(f1.b, 0L, l1);
        do
        {
label0:
            {
label1:
                {
                    if (l1 > 0L)
                    {
                        if (l1 >= (long)(f1.a.c - f1.a.b))
                        {
                            break label0;
                        }
                        z z1;
                        int i1;
                        long l2;
                        if (a != null)
                        {
                            z1 = a.g;
                        } else
                        {
                            z1 = null;
                        }
                        if (z1 == null || !z1.e)
                        {
                            break label1;
                        }
                        l2 = z1.c;
                        if (z1.d)
                        {
                            i1 = 0;
                        } else
                        {
                            i1 = z1.b;
                        }
                        if ((l2 + l1) - (long)i1 > 2048L)
                        {
                            break label1;
                        }
                        f1.a.a(z1, (int)l1);
                        f1.b = f1.b - l1;
                        b = b + l1;
                    }
                    return;
                }
                f1.a = f1.a.a((int)l1);
            }
            z z2 = f1.a;
            long l3 = z2.c - z2.b;
            f1.a = z2.a();
            if (a == null)
            {
                a = z2;
                z2 = a;
                z z3 = a;
                z z4 = a;
                z3.g = z4;
                z2.f = z4;
            } else
            {
                a.g.a(z2).b();
            }
            f1.b = f1.b - l3;
            b = b + l3;
            l1 -= l3;
        } while (true);
    }

}
