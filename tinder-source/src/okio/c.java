// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package okio:
//            d, e, t, o, 
//            p, r, ByteString, s

public final class c
    implements Cloneable, d, e
{

    private static final byte c[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    o a;
    public long b;

    public c()
    {
    }

    private String a(long l1, Charset charset)
        throws EOFException
    {
        okio.t.a(b, 0L, l1);
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
            o o1 = a;
            if ((long)o1.b + l1 > (long)o1.c)
            {
                return new String(e(l1), charset);
            }
            String s1 = new String(o1.a, o1.b, (int)l1, charset);
            o1.b = (int)((long)o1.b + l1);
            b = b - l1;
            charset = s1;
            if (o1.b == o1.c)
            {
                a = o1.a();
                okio.p.a(o1);
                return s1;
            }
        }
        return charset;
    }

    private String m(long l1)
        throws EOFException
    {
        return a(l1, t.a);
    }

    private c t()
    {
        c c1 = new c();
        if (b == 0L)
        {
            return c1;
        }
        c1.a = new o(a);
        o o1 = c1.a;
        o o3 = c1.a;
        o o4 = c1.a;
        o3.g = o4;
        o1.f = o4;
        for (o o2 = a.f; o2 != a; o2 = o2.f)
        {
            c1.a.g.a(new o(o2));
        }

        c1.b = b;
        return c1;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        okio.t.a(abyte0.length, i1, j1);
        o o1 = a;
        if (o1 == null)
        {
            i1 = -1;
        } else
        {
            j1 = Math.min(j1, o1.c - o1.b);
            System.arraycopy(o1.a, o1.b, abyte0, i1, j1);
            o1.b = o1.b + j1;
            b = b - (long)j1;
            i1 = j1;
            if (o1.b == o1.c)
            {
                a = o1.a();
                okio.p.a(o1);
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
        o o1 = a;
        if (o1 == null)
        {
            return -1L;
        }
        long l2 = 0L;
        do
        {
            int j1 = o1.c - o1.b;
            o o2;
            if (l1 >= (long)j1)
            {
                l1 -= j1;
            } else
            {
                byte abyte0[] = o1.a;
                int i1 = (int)((long)o1.b + l1);
                for (int k1 = o1.c; i1 < k1; i1++)
                {
                    if (abyte0[i1] == byte0)
                    {
                        return (l2 + (long)i1) - (long)o1.b;
                    }
                }

                l1 = 0L;
            }
            l2 += j1;
            o2 = o1.f;
            o1 = o2;
        } while (o2 != a);
        return -1L;
    }

    public final long a(c c1, long l1)
    {
        if (c1 == null)
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
        c1.a_(this, l2);
        return l2;
    }

    public final long a(r r1)
        throws IOException
    {
        if (r1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = r1.a(this, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
            } else
            {
                return l1;
            }
        } while (true);
    }

    public final c a(int i1)
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
                throw new IllegalArgumentException((new StringBuilder("Unexpected code point: ")).append(Integer.toHexString(i1)).toString());
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
            throw new IllegalArgumentException((new StringBuilder("Unexpected code point: ")).append(Integer.toHexString(i1)).toString());
        }
    }

    public final c a(String s1)
    {
        return a(s1, 0, s1.length());
    }

    public final c a(String s1, int i1, int j1)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("string == null");
        }
        if (i1 < 0)
        {
            throw new IllegalAccessError((new StringBuilder("beginIndex < 0: ")).append(i1).toString());
        }
        if (j1 < i1)
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex < beginIndex: ")).append(j1).append(" < ").append(i1).toString());
        }
        if (j1 > s1.length())
        {
            throw new IllegalArgumentException((new StringBuilder("endIndex > string.length: ")).append(j1).append(" > ").append(s1.length()).toString());
        }
          goto _L1
_L3:
        o o1;
        int j2;
        int k1 = (i1 + j2) - o1.c;
        o1.c = o1.c + k1;
        b = b + (long)k1;
_L1:
        byte abyte0[];
        char c2;
        int k2;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        c2 = s1.charAt(i1);
        if (c2 >= '\200')
        {
            break MISSING_BLOCK_LABEL_272;
        }
        o1 = e(1);
        abyte0 = o1.a;
        j2 = o1.c - i1;
        k2 = Math.min(j1, 2048 - j2);
        int l1 = i1 + 1;
        abyte0[j2 + i1] = (byte)c2;
        i1 = l1;
_L5:
        if (i1 >= k2) goto _L3; else goto _L2
_L2:
        char c1 = s1.charAt(i1);
        if (c1 >= '\200') goto _L3; else goto _L4
_L4:
        abyte0[i1 + j2] = (byte)c1;
        i1++;
          goto _L5
        if (c2 < '\u0800')
        {
            b(c2 >> 6 | 0xc0);
            b(c2 & 0x3f | 0x80);
            i1++;
        } else
        if (c2 < '\uD800' || c2 > '\uDFFF')
        {
            b(c2 >> 12 | 0xe0);
            b(c2 >> 6 & 0x3f | 0x80);
            b(c2 & 0x3f | 0x80);
            i1++;
        } else
        {
            int i2;
            if (i1 + 1 < j1)
            {
                i2 = s1.charAt(i1 + 1);
            } else
            {
                i2 = 0;
            }
            if (c2 > '\uDBFF' || i2 < '\uDC00' || i2 > '\uDFFF')
            {
                b(63);
                i1++;
            } else
            {
                i2 = (i2 & 0xffff23ff | (c2 & 0xffff27ff) << 10) + 0x10000;
                b(i2 >> 18 | 0xf0);
                b(i2 >> 12 & 0x3f | 0x80);
                b(i2 >> 6 & 0x3f | 0x80);
                b(i2 & 0x3f | 0x80);
                i1 += 2;
            }
        }
          goto _L1
        return this;
    }

    public final c a(ByteString bytestring)
    {
        if (bytestring == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            b(bytestring.c, 0, bytestring.c.length);
            return this;
        }
    }

    public final c a(c c1, long l1, long l2)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        okio.t.a(b, l1, l2);
        if (l2 != 0L)
        {
            c1.b = c1.b + l2;
            o o1 = a;
            o o3;
            long l3;
            long l4;
            do
            {
                o3 = o1;
                l3 = l1;
                l4 = l2;
                if (l1 < (long)(o1.c - o1.b))
                {
                    break;
                }
                l1 -= o1.c - o1.b;
                o1 = o1.f;
            } while (true);
            while (l4 > 0L) 
            {
                o o2 = new o(o3);
                o2.b = (int)((long)o2.b + l3);
                o2.c = Math.min(o2.b + (int)l4, o2.c);
                if (c1.a == null)
                {
                    o2.g = o2;
                    o2.f = o2;
                    c1.a = o2;
                } else
                {
                    c1.a.g.a(o2);
                }
                l4 -= o2.c - o2.b;
                o3 = o3.f;
                l3 = 0L;
            }
        }
        return this;
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

    public final void a(byte abyte0[])
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

    public final void a_(c c1, long l1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (c1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        okio.t.a(c1.b, 0L, l1);
_L2:
        o o3;
        long l3;
label0:
        {
label1:
            {
                if (l1 > 0L)
                {
                    if (l1 >= (long)(c1.a.c - c1.a.b))
                    {
                        break label0;
                    }
                    o o1;
                    int i1;
                    long l2;
                    if (a != null)
                    {
                        o1 = a.g;
                    } else
                    {
                        o1 = null;
                    }
                    if (o1 == null || !o1.e)
                    {
                        break label1;
                    }
                    l2 = o1.c;
                    if (o1.d)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = o1.b;
                    }
                    if ((l2 + l1) - (long)i1 > 2048L)
                    {
                        break label1;
                    }
                    c1.a.a(o1, (int)l1);
                    c1.b = c1.b - l1;
                    b = b + l1;
                }
                return;
            }
            o o2 = c1.a;
            int j1 = (int)l1;
            if (j1 <= 0 || j1 > o2.c - o2.b)
            {
                throw new IllegalArgumentException();
            }
            o o4 = new o(o2);
            o4.c = o4.b + j1;
            o2.b = j1 + o2.b;
            o2.g.a(o4);
            c1.a = o4;
        }
        o3 = c1.a;
        l3 = o3.c - o3.b;
        c1.a = o3.a();
        if (a != null)
        {
            break; /* Loop/switch isn't completed */
        }
        a = o3;
        o3 = a;
        o o5 = a;
        o o6 = a;
        o5.g = o6;
        o3.f = o6;
_L3:
        c1.b = c1.b - l3;
        b = b + l3;
        l1 -= l3;
        if (true) goto _L2; else goto _L1
_L1:
        o3 = a.g.a(o3);
        if (o3.g == o3)
        {
            throw new IllegalStateException();
        }
        if (o3.g.e)
        {
            int i2 = o3.c - o3.b;
            int j2 = o3.g.c;
            int k1;
            if (o3.g.d)
            {
                k1 = 0;
            } else
            {
                k1 = o3.g.b;
            }
            if (i2 <= k1 + (2048 - j2))
            {
                o3.a(o3.g, i2);
                o3.a();
                okio.p.a(o3);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final byte b(long l1)
    {
        okio.t.a(b, l1, 1L);
        o o1 = a;
        do
        {
            int i1 = o1.c - o1.b;
            if (l1 < (long)i1)
            {
                return o1.a[o1.b + (int)l1];
            }
            l1 -= i1;
            o1 = o1.f;
        } while (true);
    }

    public final c b()
    {
        return this;
    }

    public final c b(int i1)
    {
        o o1 = e(1);
        byte abyte0[] = o1.a;
        int j1 = o1.c;
        o1.c = j1 + 1;
        abyte0[j1] = (byte)i1;
        b = b + 1L;
        return this;
    }

    public final c b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return b(abyte0, 0, abyte0.length);
        }
    }

    public final c b(byte abyte0[], int i1, int j1)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        okio.t.a(abyte0.length, i1, j1);
        for (int k1 = i1 + j1; i1 < k1;)
        {
            o o1 = e(1);
            int l1 = Math.min(k1 - i1, 2048 - o1.c);
            System.arraycopy(abyte0, i1, o1.a, o1.c, l1);
            i1 += l1;
            o1.c = l1 + o1.c;
        }

        b = b + (long)j1;
        return this;
    }

    public final d b(String s1)
        throws IOException
    {
        return a(s1);
    }

    public final d b(ByteString bytestring)
        throws IOException
    {
        return a(bytestring);
    }

    public final void b(c c1, long l1)
        throws EOFException
    {
        if (b < l1)
        {
            c1.a_(this, b);
            throw new EOFException();
        } else
        {
            c1.a_(this, l1);
            return;
        }
    }

    public final ByteString c(long l1)
        throws EOFException
    {
        return new ByteString(e(l1));
    }

    public final c c(int i1)
    {
        o o1 = e(2);
        byte abyte0[] = o1.a;
        int j1 = o1.c;
        int k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[k1] = (byte)(i1 & 0xff);
        o1.c = k1 + 1;
        b = b + 2L;
        return this;
    }

    public final d c()
    {
        return this;
    }

    public final d c(byte abyte0[])
        throws IOException
    {
        return b(abyte0);
    }

    public final d c(byte abyte0[], int i1, int j1)
        throws IOException
    {
        return b(abyte0, i1, j1);
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return t();
    }

    public final void close()
    {
    }

    final String d(long l1)
        throws EOFException
    {
        if (l1 > 0L && b(l1 - 1L) == 13)
        {
            String s1 = m(l1 - 1L);
            f(2L);
            return s1;
        } else
        {
            String s2 = m(l1);
            f(1L);
            return s2;
        }
    }

    public final c d(int i1)
    {
        o o1 = e(4);
        byte abyte0[] = o1.a;
        int k1 = o1.c;
        int j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 24 & 0xff);
        k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 16 & 0xff);
        j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 8 & 0xff);
        abyte0[j1] = (byte)(i1 & 0xff);
        o1.c = j1 + 1;
        b = b + 4L;
        return this;
    }

    public final boolean d()
    {
        return b == 0L;
    }

    public final InputStream e()
    {
        return new InputStream() {

            final c a;

            public final int available()
            {
                return (int)Math.min(a.b, 0x7fffffffL);
            }

            public final void close()
            {
            }

            public final int read()
            {
                if (a.b > 0L)
                {
                    return a.f() & 0xff;
                } else
                {
                    return -1;
                }
            }

            public final int read(byte abyte0[], int i1, int j1)
            {
                return a.a(abyte0, i1, j1);
            }

            public final String toString()
            {
                return (new StringBuilder()).append(a).append(".inputStream()").toString();
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    final o e(int i1)
    {
        if (i1 <= 0 || i1 > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        o o1;
        a = okio.p.a();
        o o2 = a;
        o o4 = a;
        o1 = a;
        o4.g = o1;
        o2.f = o1;
_L4:
        return o1;
_L2:
        o o3;
        o3 = a.g;
        if (o3.c + i1 > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        o1 = o3;
        if (o3.e) goto _L4; else goto _L3
_L3:
        return o3.a(okio.p.a());
    }

    public final byte[] e(long l1)
        throws EOFException
    {
        okio.t.a(b, 0L, l1);
        if (l1 > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount > Integer.MAX_VALUE: ")).append(l1).toString());
        } else
        {
            byte abyte0[] = new byte[(int)l1];
            a(abyte0);
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
        if (!(obj instanceof c))
        {
            return false;
        }
        obj = (c)obj;
        if (b != ((c) (obj)).b)
        {
            return false;
        }
        if (b == 0L)
        {
            return true;
        }
        o o2 = a;
        obj = ((c) (obj)).a;
        int j1 = o2.b;
        int i1 = ((o) (obj)).b;
        while (l2 < b) 
        {
            long l3 = Math.min(o2.c - j1, ((o) (obj)).c - i1);
            for (int k1 = 0; (long)k1 < l3;)
            {
                if (o2.a[j1] != ((o) (obj)).a[i1])
                {
                    return false;
                }
                k1++;
                i1++;
                j1++;
            }

            int l1 = j1;
            o o1 = o2;
            if (j1 == o2.c)
            {
                o1 = o2.f;
                l1 = o1.b;
            }
            j1 = i1;
            Object obj1 = obj;
            if (i1 == ((o) (obj)).c)
            {
                obj1 = ((o) (obj)).f;
                j1 = ((o) (obj1)).b;
            }
            l2 += l3;
            i1 = j1;
            j1 = l1;
            o2 = o1;
            obj = obj1;
        }
        return true;
    }

    public final byte f()
    {
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        o o1 = a;
        int i1 = o1.b;
        int j1 = o1.c;
        byte abyte0[] = o1.a;
        int k1 = i1 + 1;
        byte byte0 = abyte0[i1];
        b = b - 1L;
        if (k1 == j1)
        {
            a = o1.a();
            okio.p.a(o1);
            return byte0;
        } else
        {
            o1.b = k1;
            return byte0;
        }
    }

    public final d f(int i1)
        throws IOException
    {
        return d(i1);
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
            o o1 = a;
            o1.b = i1 + o1.b;
            l1 = l2;
            if (a.b == a.c)
            {
                o o2 = a;
                a = o2.a();
                okio.p.a(o2);
                l1 = l2;
            }
        } while (true);
    }

    public final void flush()
    {
    }

    public final c g(long l1)
    {
        o o1 = e(8);
        byte abyte0[] = o1.a;
        int j1 = o1.c;
        int i1 = j1 + 1;
        abyte0[j1] = (byte)(int)(l1 >>> 56 & 255L);
        j1 = i1 + 1;
        abyte0[i1] = (byte)(int)(l1 >>> 48 & 255L);
        i1 = j1 + 1;
        abyte0[j1] = (byte)(int)(l1 >>> 40 & 255L);
        j1 = i1 + 1;
        abyte0[i1] = (byte)(int)(l1 >>> 32 & 255L);
        i1 = j1 + 1;
        abyte0[j1] = (byte)(int)(l1 >>> 24 & 255L);
        j1 = i1 + 1;
        abyte0[i1] = (byte)(int)(l1 >>> 16 & 255L);
        i1 = j1 + 1;
        abyte0[j1] = (byte)(int)(l1 >>> 8 & 255L);
        abyte0[i1] = (byte)(int)(l1 & 255L);
        o1.c = i1 + 1;
        b = b + 8L;
        return this;
    }

    public final d g(int i1)
        throws IOException
    {
        return c(i1);
    }

    public final short g()
    {
        if (b < 2L)
        {
            throw new IllegalStateException((new StringBuilder("size < 2: ")).append(b).toString());
        }
        o o1 = a;
        int k1 = o1.b;
        int i1 = o1.c;
        if (i1 - k1 < 2)
        {
            return (short)((f() & 0xff) << 8 | f() & 0xff);
        }
        byte abyte0[] = o1.a;
        int j1 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = j1 + 1;
        j1 = abyte0[j1];
        b = b - 2L;
        if (l1 == i1)
        {
            a = o1.a();
            okio.p.a(o1);
        } else
        {
            o1.b = l1;
        }
        return (short)((k1 & 0xff) << 8 | j1 & 0xff);
    }

    public final int h()
    {
        if (b < 4L)
        {
            throw new IllegalStateException((new StringBuilder("size < 4: ")).append(b).toString());
        }
        o o1 = a;
        int j1 = o1.b;
        int i1 = o1.c;
        if (i1 - j1 < 4)
        {
            return (f() & 0xff) << 24 | (f() & 0xff) << 16 | (f() & 0xff) << 8 | f() & 0xff;
        }
        byte abyte0[] = o1.a;
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
            a = o1.a();
            okio.p.a(o1);
            return j1;
        } else
        {
            o1.b = i2;
            return j1;
        }
    }

    public final c h(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        o o1;
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
        o1 = e(j1);
        abyte0 = o1.a;
        i1 = o1.c + j1;
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
        o1.c = o1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final d h(int i1)
        throws IOException
    {
        return b(i1);
    }

    public final int hashCode()
    {
        o o1 = a;
        if (o1 == null)
        {
            return 0;
        }
        int j1 = 1;
        o o2;
        int i1;
        do
        {
            int k1 = o1.b;
            int l1 = o1.c;
            for (i1 = j1; k1 < l1; i1 = j1 + i1 * 31)
            {
                j1 = o1.a[k1];
                k1++;
            }

            o2 = o1.f;
            j1 = i1;
            o1 = o2;
        } while (o2 != a);
        return i1;
    }

    public final long i()
    {
        if (b < 8L)
        {
            throw new IllegalStateException((new StringBuilder("size < 8: ")).append(b).toString());
        }
        o o1 = a;
        int k1 = o1.b;
        int i1 = o1.c;
        if (i1 - k1 < 8)
        {
            return ((long)h() & 0xffffffffL) << 32 | (long)h() & 0xffffffffL;
        }
        byte abyte0[] = o1.a;
        int j1 = k1 + 1;
        long l1 = abyte0[k1];
        k1 = j1 + 1;
        long l2 = abyte0[j1];
        j1 = k1 + 1;
        long l3 = abyte0[k1];
        k1 = j1 + 1;
        long l4 = abyte0[j1];
        j1 = k1 + 1;
        long l5 = abyte0[k1];
        k1 = j1 + 1;
        long l6 = abyte0[j1];
        j1 = k1 + 1;
        long l7 = abyte0[k1];
        k1 = j1 + 1;
        l1 = (long)abyte0[j1] & 255L | ((l2 & 255L) << 48 | (l1 & 255L) << 56 | (l3 & 255L) << 40 | (l4 & 255L) << 32 | (l5 & 255L) << 24 | (l6 & 255L) << 16 | (l7 & 255L) << 8);
        b = b - 8L;
        if (k1 == i1)
        {
            a = o1.a();
            okio.p.a(o1);
            return l1;
        } else
        {
            o1.b = k1;
            return l1;
        }
    }

    public final c i(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        int j1 = Long.numberOfTrailingZeros(Long.highestOneBit(l1)) / 4 + 1;
        o o1 = e(j1);
        byte abyte0[] = o1.a;
        int i1 = (o1.c + j1) - 1;
        for (int k1 = o1.c; i1 >= k1; i1--)
        {
            abyte0[i1] = c[(int)(15L & l1)];
            l1 >>>= 4;
        }

        o1.c = o1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final d j(long l1)
        throws IOException
    {
        return i(l1);
    }

    public final short j()
    {
        return okio.t.a(g());
    }

    public final int k()
    {
        return okio.t.a(h());
    }

    public final d k(long l1)
        throws IOException
    {
        return h(l1);
    }

    public final long l()
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
        abyte0 = ((o) (obj)).a;
        j1 = ((o) (obj)).b;
        i2 = ((o) (obj)).c;
        l2 = l3;
        i1 = k1;
        flag = l1;
        l3 = l4;
_L2:
        k1 = byte0;
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        k1 = abyte0[j1];
        if (k1 < 48 || k1 > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = 48 - k1;
        if (l2 < 0xf333333333333334L || l2 == 0xf333333333333334L && (long)l1 < l3)
        {
            obj = (new c()).h(l2).b(k1);
            if (!flag)
            {
                ((c) (obj)).f();
            }
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((c) (obj)).o()).toString());
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
            throw new NumberFormatException((new StringBuilder("Expected leading [0-9] or '-' character but was 0x")).append(Integer.toHexString(k1)).toString());
        }
        k1 = 1;
        if (j1 == i2)
        {
            a = ((o) (obj)).a();
            okio.p.a(((o) (obj)));
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

    public final d l(long l1)
        throws IOException
    {
        return g(l1);
    }

    public final long m()
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
        abyte0 = ((o) (obj)).a;
        l1 = ((o) (obj)).b;
        i2 = ((o) (obj)).c;
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
            obj = (new c()).i(l2).b(byte0);
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((c) (obj)).o()).toString());
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
            a = ((o) (obj)).a();
            okio.p.a(((o) (obj)));
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

    public final ByteString n()
    {
        return new ByteString(q());
    }

    public final String o()
    {
        String s1;
        try
        {
            s1 = a(b, t.a);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s1;
    }

    public final String p()
        throws EOFException
    {
        long l1 = a((byte)10, 0L);
        if (l1 == -1L)
        {
            c c1 = new c();
            a(c1, 0L, Math.min(32L, b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(b).append(" content=").append(c1.n().b()).append("...").toString());
        } else
        {
            return d(l1);
        }
    }

    public final byte[] q()
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

    public final s q_()
    {
        return s.b;
    }

    public final void r()
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

    public final volatile d s()
        throws IOException
    {
        return this;
    }

    public final String toString()
    {
        if (b == 0L)
        {
            return "Buffer[size=0]";
        }
        if (b <= 16L)
        {
            ByteString bytestring = t().n();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(b), bytestring.b()
            });
        }
        String s1;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(a.a, a.b, a.c - a.b);
            for (o o1 = a.f; o1 != a; o1 = o1.f)
            {
                messagedigest.update(o1.a, o1.b, o1.c - o1.b);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s1 = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(b), ByteString.a(messagedigest.digest()).b()
        });
        return s1;
    }

}
