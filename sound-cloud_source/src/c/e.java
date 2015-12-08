// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package c:
//            g, h, B, v, 
//            w, y, i, f, 
//            z

public final class e
    implements g, h, Cloneable
{

    private static final byte c[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    v a;
    public long b;

    public e()
    {
    }

    private String a(long l1, Charset charset)
        throws EOFException
    {
        B.a(b, 0L, l1);
        if (charset == null)
        {
            throw new IllegalArgumentException("charset == null");
        }
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l1).toString());
        }
        if (l1 == 0L)
        {
            charset = "";
        } else
        {
            v v1 = a;
            if ((long)v1.b + l1 > (long)v1.c)
            {
                return new String(e(l1), charset);
            }
            String s = new String(v1.a, v1.b, (int)l1, charset);
            v1.b = (int)((long)v1.b + l1);
            b = b - l1;
            charset = s;
            if (v1.b == v1.c)
            {
                a = v1.a();
                w.a(v1);
                return s;
            }
        }
        return charset;
    }

    private void c(byte abyte0[])
        throws EOFException
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

    private String k(long l1)
        throws EOFException
    {
        return a(l1, B.a);
    }

    private String p()
    {
        String s;
        try
        {
            s = a(b, B.a);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s;
    }

    private e q()
    {
        e e1 = new e();
        if (b == 0L)
        {
            return e1;
        }
        e1.a = new v(a);
        v v1 = e1.a;
        v v3 = e1.a;
        v v4 = e1.a;
        v3.g = v4;
        v1.f = v4;
        for (v v2 = a.f; v2 != a; v2 = v2.f)
        {
            e1.a.g.a(new v(v2));
        }

        e1.b = b;
        return e1;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        B.a(abyte0.length, i1, j1);
        v v1 = a;
        if (v1 == null)
        {
            i1 = -1;
        } else
        {
            j1 = Math.min(j1, v1.c - v1.b);
            System.arraycopy(v1.a, v1.b, abyte0, i1, j1);
            v1.b = v1.b + j1;
            b = b - (long)j1;
            i1 = j1;
            if (v1.b == v1.c)
            {
                a = v1.a();
                w.a(v1);
                return j1;
            }
        }
        return i1;
    }

    public final long a(byte byte0)
    {
        return a(byte0, 0L);
    }

    public final long a(byte byte0, long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        v v1 = a;
        if (v1 == null)
        {
            return -1L;
        }
        long l2 = 0L;
        do
        {
            int i1 = v1.c - v1.b;
            v v2;
            if (l1 >= (long)i1)
            {
                l1 -= i1;
            } else
            {
                byte abyte0[] = v1.a;
                l1 = (long)v1.b + l1;
                for (long l3 = v1.c; l1 < l3; l1++)
                {
                    if (abyte0[(int)l1] == byte0)
                    {
                        return (l2 + l1) - (long)v1.b;
                    }
                }

                l1 = 0L;
            }
            l2 += i1;
            v2 = v1.f;
            v1 = v2;
        } while (v2 != a);
        return -1L;
    }

    public final long a(e e1, long l1)
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("sink == null");
        }
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(l1).toString());
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
        e1.write(this, l2);
        return l2;
    }

    public final long a(y y1)
        throws IOException
    {
        if (y1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = y1.a(this, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
            } else
            {
                return l1;
            }
        } while (true);
    }

    public final e a()
    {
        return this;
    }

    public final e a(int i1)
    {
        v v1 = d(1);
        byte abyte0[] = v1.a;
        int j1 = v1.c;
        v1.c = j1 + 1;
        abyte0[j1] = (byte)i1;
        b = b + 1L;
        return this;
    }

    public final e a(e e1, long l1, long l2)
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        B.a(b, l1, l2);
        if (l2 != 0L)
        {
            e1.b = e1.b + l2;
            v v1 = a;
            v v3;
            long l3;
            long l4;
            do
            {
                v3 = v1;
                l3 = l1;
                l4 = l2;
                if (l1 < (long)(v1.c - v1.b))
                {
                    break;
                }
                l1 -= v1.c - v1.b;
                v1 = v1.f;
            } while (true);
            while (l4 > 0L) 
            {
                v v2 = new v(v3);
                v2.b = (int)((long)v2.b + l3);
                v2.c = Math.min(v2.b + (int)l4, v2.c);
                if (e1.a == null)
                {
                    v2.g = v2;
                    v2.f = v2;
                    e1.a = v2;
                } else
                {
                    e1.a.g.a(v2);
                }
                l4 -= v2.c - v2.b;
                v3 = v3.f;
                l3 = 0L;
            }
        }
        return this;
    }

    public final e a(i i1)
    {
        if (i1 == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            b(i1.c, 0, i1.c.length);
            return this;
        }
    }

    public final e a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        int l1 = s.length();
        for (int i1 = 0; i1 < l1;)
        {
            char c1 = s.charAt(i1);
            if (c1 < '\200')
            {
                v v1 = d(1);
                byte abyte0[] = v1.a;
                int i2 = v1.c - i1;
                int j2 = Math.min(l1, 2048 - i2);
                int j1 = i1 + 1;
                abyte0[i1 + i2] = (byte)c1;
                i1 = j1;
                do
                {
                    if (i1 >= j2)
                    {
                        break;
                    }
                    j1 = s.charAt(i1);
                    if (j1 >= '\200')
                    {
                        break;
                    }
                    abyte0[i1 + i2] = (byte)j1;
                    i1++;
                } while (true);
                j1 = (i1 + i2) - v1.c;
                v1.c = v1.c + j1;
                b = b + (long)j1;
            } else
            if (c1 < '\u0800')
            {
                a(c1 >> 6 | 0xc0);
                a(c1 & 0x3f | 0x80);
                i1++;
            } else
            if (c1 < '\uD800' || c1 > '\uDFFF')
            {
                a(c1 >> 12 | 0xe0);
                a(c1 >> 6 & 0x3f | 0x80);
                a(c1 & 0x3f | 0x80);
                i1++;
            } else
            {
                int k1;
                if (i1 + 1 < l1)
                {
                    k1 = s.charAt(i1 + 1);
                } else
                {
                    k1 = 0;
                }
                if (c1 > '\uDBFF' || k1 < '\uDC00' || k1 > '\uDFFF')
                {
                    a(63);
                    i1++;
                } else
                {
                    k1 = (k1 & 0xffff23ff | (c1 & 0xffff27ff) << 10) + 0x10000;
                    a(k1 >> 18 | 0xf0);
                    a(k1 >> 12 & 0x3f | 0x80);
                    a(k1 >> 6 & 0x3f | 0x80);
                    a(k1 & 0x3f | 0x80);
                    i1 += 2;
                }
            }
        }

        return this;
    }

    public final e a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return b(abyte0, 0, abyte0.length);
        }
    }

    public final void a(long l1)
        throws EOFException
    {
        if (b < l1)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final byte b(long l1)
    {
        B.a(b, l1, 1L);
        v v1 = a;
        do
        {
            int i1 = v1.c - v1.b;
            if (l1 < (long)i1)
            {
                return v1.a[v1.b + (int)l1];
            }
            l1 -= i1;
            v1 = v1.f;
        } while (true);
    }

    public final e b(int i1)
    {
        v v1 = d(2);
        byte abyte0[] = v1.a;
        int j1 = v1.c;
        int k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[k1] = (byte)(i1 & 0xff);
        v1.c = k1 + 1;
        b = b + 2L;
        return this;
    }

    public final e b(byte abyte0[], int i1, int j1)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        B.a(abyte0.length, i1, j1);
        for (int k1 = i1 + j1; i1 < k1;)
        {
            v v1 = d(1);
            int l1 = Math.min(k1 - i1, 2048 - v1.c);
            System.arraycopy(abyte0, i1, v1.a, v1.c, l1);
            i1 += l1;
            v1.c = l1 + v1.c;
        }

        b = b + (long)j1;
        return this;
    }

    public final g b()
    {
        return this;
    }

    public final g b(i i1)
        throws IOException
    {
        return a(i1);
    }

    public final g b(String s)
        throws IOException
    {
        return a(s);
    }

    public final g b(byte abyte0[])
        throws IOException
    {
        return a(abyte0);
    }

    public final e c(int i1)
    {
        v v1 = d(4);
        byte abyte0[] = v1.a;
        int k1 = v1.c;
        int j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 24 & 0xff);
        k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 16 & 0xff);
        j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[j1] = (byte)(i1 & 0xff);
        v1.c = j1 + 1;
        b = b + 4L;
        return this;
    }

    public final g c(byte abyte0[], int i1, int j1)
        throws IOException
    {
        return b(abyte0, i1, j1);
    }

    public final i c(long l1)
        throws EOFException
    {
        return new i(e(l1));
    }

    public final boolean c()
    {
        return b == 0L;
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return q();
    }

    public final void close()
    {
    }

    final v d(int i1)
    {
        if (i1 <= 0 || i1 > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        v v1;
        a = w.a();
        v v2 = a;
        v v4 = a;
        v1 = a;
        v4.g = v1;
        v2.f = v1;
_L4:
        return v1;
_L2:
        v v3;
        v3 = a.g;
        if (v3.c + i1 > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        v1 = v3;
        if (v3.e) goto _L4; else goto _L3
_L3:
        return v3.a(w.a());
    }

    public final InputStream d()
    {
        return new f(this);
    }

    final String d(long l1)
        throws EOFException
    {
        if (l1 > 0L && b(l1 - 1L) == 13)
        {
            String s = k(l1 - 1L);
            f(2L);
            return s;
        } else
        {
            String s1 = k(l1);
            f(1L);
            return s1;
        }
    }

    public final byte e()
    {
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        v v1 = a;
        int i1 = v1.b;
        int j1 = v1.c;
        byte abyte0[] = v1.a;
        int k1 = i1 + 1;
        byte byte0 = abyte0[i1];
        b = b - 1L;
        if (k1 == j1)
        {
            a = v1.a();
            w.a(v1);
            return byte0;
        } else
        {
            v1.b = k1;
            return byte0;
        }
    }

    public final g e(int i1)
        throws IOException
    {
        return c(i1);
    }

    public final byte[] e(long l1)
        throws EOFException
    {
        B.a(b, 0L, l1);
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l1).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l1];
            c(abyte0);
            return abyte0;
        }
    }

    public final boolean equals(Object obj)
    {
        long l2 = 0L;
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof e))
        {
            return false;
        }
        obj = (e)obj;
        if (b != ((e) (obj)).b)
        {
            return false;
        }
        if (b == 0L)
        {
            return true;
        }
        v v2 = a;
        obj = ((e) (obj)).a;
        int j1 = v2.b;
        int i1 = ((v) (obj)).b;
        while (l2 < b) 
        {
            long l3 = Math.min(v2.c - j1, ((v) (obj)).c - i1);
            for (int k1 = 0; (long)k1 < l3;)
            {
                if (v2.a[j1] != ((v) (obj)).a[i1])
                {
                    return false;
                }
                k1++;
                i1++;
                j1++;
            }

            int l1 = j1;
            v v1 = v2;
            if (j1 == v2.c)
            {
                v1 = v2.f;
                l1 = v1.b;
            }
            j1 = i1;
            Object obj1 = obj;
            if (i1 == ((v) (obj)).c)
            {
                obj1 = ((v) (obj)).f;
                j1 = ((v) (obj1)).b;
            }
            l2 += l3;
            i1 = j1;
            j1 = l1;
            v2 = v1;
            obj = obj1;
        }
        return true;
    }

    public final g f(int i1)
        throws IOException
    {
        return b(i1);
    }

    public final short f()
    {
        if (b < 2L)
        {
            throw new IllegalStateException((new StringBuilder("size < 2: ")).append(b).toString());
        }
        v v1 = a;
        int k1 = v1.b;
        int i1 = v1.c;
        if (i1 - k1 < 2)
        {
            return (short)((e() & 0xff) << 8 | e() & 0xff);
        }
        byte abyte0[] = v1.a;
        int j1 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = j1 + 1;
        j1 = abyte0[j1];
        b = b - 2L;
        if (l1 == i1)
        {
            a = v1.a();
            w.a(v1);
        } else
        {
            v1.b = l1;
        }
        return (short)((k1 & 0xff) << 8 | j1 & 0xff);
    }

    public final void f(long l1)
        throws EOFException
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
            v v1 = a;
            v1.b = i1 + v1.b;
            l1 = l2;
            if (a.b == a.c)
            {
                v v2 = a;
                a = v2.a();
                w.a(v2);
                l1 = l2;
            }
        } while (true);
    }

    public final void flush()
    {
    }

    public final int g()
    {
        if (b < 4L)
        {
            throw new IllegalStateException((new StringBuilder("size < 4: ")).append(b).toString());
        }
        v v1 = a;
        int j1 = v1.b;
        int i1 = v1.c;
        if (i1 - j1 < 4)
        {
            return (e() & 0xff) << 24 | (e() & 0xff) << 16 | (e() & 0xff) << 8 | e() & 0xff;
        }
        byte abyte0[] = v1.a;
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
            a = v1.a();
            w.a(v1);
            return j1;
        } else
        {
            v1.b = i2;
            return j1;
        }
    }

    public final e g(long l1)
    {
        if (l1 == 0L)
        {
            return a(48);
        }
        v v1;
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
        v1 = d(j1);
        abyte0 = v1.a;
        i1 = v1.c + j1;
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
        v1.c = v1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final g g(int i1)
        throws IOException
    {
        return a(i1);
    }

    public final e h(long l1)
    {
        if (l1 == 0L)
        {
            return a(48);
        }
        int j1 = Long.numberOfTrailingZeros(Long.highestOneBit(l1)) / 4 + 1;
        v v1 = d(j1);
        byte abyte0[] = v1.a;
        int i1 = (v1.c + j1) - 1;
        for (int k1 = v1.c; i1 >= k1; i1--)
        {
            abyte0[i1] = c[(int)(15L & l1)];
            l1 >>>= 4;
        }

        v1.c = v1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final short h()
    {
        return B.a(f());
    }

    public final int hashCode()
    {
        v v1 = a;
        if (v1 == null)
        {
            return 0;
        }
        int j1 = 1;
        v v2;
        int i1;
        do
        {
            int k1 = v1.b;
            int l1 = v1.c;
            for (i1 = j1; k1 < l1; i1 = j1 + i1 * 31)
            {
                j1 = v1.a[k1];
                k1++;
            }

            v2 = v1.f;
            j1 = i1;
            v1 = v2;
        } while (v2 != a);
        return i1;
    }

    public final int i()
    {
        return B.a(g());
    }

    public final g i(long l1)
        throws IOException
    {
        return h(l1);
    }

    public final long j()
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
        abyte0 = ((v) (obj)).a;
        l1 = ((v) (obj)).b;
        i2 = ((v) (obj)).c;
        l2 = l3;
        k1 = i1;
_L7:
        byte byte0;
        i1 = j1;
        if (l1 >= i2)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        byte0 = abyte0[l1];
        if (byte0 < 48 || byte0 > 57) goto _L2; else goto _L1
_L1:
        i1 = byte0 - 48;
_L4:
        if ((0xf000000000000000L & l2) != 0L)
        {
            obj = (new e()).h(l2).a(byte0);
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((e) (obj)).p()).toString());
        }
        break MISSING_BLOCK_LABEL_293;
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
            throw new NumberFormatException((new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x")).append(Integer.toHexString(byte0)).toString());
        }
        i1 = 1;
        if (l1 == i2)
        {
            a = ((v) (obj)).a();
            w.a(((v) (obj)));
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

    public final g j(long l1)
        throws IOException
    {
        return g(l1);
    }

    public final i k()
    {
        return new i(m());
    }

    public final String l()
        throws EOFException
    {
        long l1 = a((byte)10, 0L);
        if (l1 == -1L)
        {
            e e1 = new e();
            a(e1, 0L, Math.min(32L, b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(b).append(" content=").append(e1.k().b()).append("...").toString());
        } else
        {
            return d(l1);
        }
    }

    public final byte[] m()
    {
        byte abyte0[];
        try
        {
            abyte0 = e(b);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return abyte0;
    }

    public final void n()
    {
        try
        {
            f(b);
            return;
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
    }

    public final volatile g o()
        throws IOException
    {
        return this;
    }

    public final z timeout()
    {
        return z.b;
    }

    public final String toString()
    {
        if (b == 0L)
        {
            return "Buffer[size=0]";
        }
        if (b <= 16L)
        {
            i i1 = q().k();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(b), i1.b()
            });
        }
        String s;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(a.a, a.b, a.c - a.b);
            for (v v1 = a.f; v1 != a; v1 = v1.f)
            {
                messagedigest.update(v1.a, v1.b, v1.c - v1.b);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(b), c.i.a(messagedigest.digest()).b()
        });
        return s;
    }

    public final void write(e e1, long l1)
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (e1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        B.a(e1.b, 0L, l1);
_L2:
        v v3;
        long l3;
label0:
        {
label1:
            {
                if (l1 > 0L)
                {
                    if (l1 >= (long)(e1.a.c - e1.a.b))
                    {
                        break label0;
                    }
                    v v1;
                    int i1;
                    long l2;
                    if (a != null)
                    {
                        v1 = a.g;
                    } else
                    {
                        v1 = null;
                    }
                    if (v1 == null || !v1.e)
                    {
                        break label1;
                    }
                    l2 = v1.c;
                    if (v1.d)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = v1.b;
                    }
                    if ((l2 + l1) - (long)i1 > 2048L)
                    {
                        break label1;
                    }
                    e1.a.a(v1, (int)l1);
                    e1.b = e1.b - l1;
                    b = b + l1;
                }
                return;
            }
            v v2 = e1.a;
            int j1 = (int)l1;
            if (j1 <= 0 || j1 > v2.c - v2.b)
            {
                throw new IllegalArgumentException();
            }
            v v4 = new v(v2);
            v4.c = v4.b + j1;
            v2.b = j1 + v2.b;
            v2.g.a(v4);
            e1.a = v4;
        }
        v3 = e1.a;
        l3 = v3.c - v3.b;
        e1.a = v3.a();
        if (a != null)
        {
            break; /* Loop/switch isn't completed */
        }
        a = v3;
        v3 = a;
        v v5 = a;
        v v6 = a;
        v5.g = v6;
        v3.f = v6;
_L3:
        e1.b = e1.b - l3;
        b = b + l3;
        l1 -= l3;
        if (true) goto _L2; else goto _L1
_L1:
        v3 = a.g.a(v3);
        if (v3.g == v3)
        {
            throw new IllegalStateException();
        }
        if (v3.g.e)
        {
            int i2 = v3.c - v3.b;
            int j2 = v3.g.c;
            int k1;
            if (v3.g.d)
            {
                k1 = 0;
            } else
            {
                k1 = v3.g.b;
            }
            if (i2 <= k1 + (2048 - j2))
            {
                v3.a(v3.g, i2);
                v3.a();
                w.a(v3);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

}
