// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.ByteString;

public final class hch
    implements hci, hcj, Cloneable
{

    private static final byte c[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    public hct a;
    public long b;

    public hch()
    {
    }

    private void c(byte abyte0[])
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
    {
        return a(l1, hcy.a);
    }

    private hch u()
    {
        hch hch1 = new hch();
        if (b == 0L)
        {
            return hch1;
        }
        hch1.a = new hct(a);
        hct hct1 = hch1.a;
        hct hct3 = hch1.a;
        hct hct4 = hch1.a;
        hct3.g = hct4;
        hct1.f = hct4;
        for (hct hct2 = a.f; hct2 != a; hct2 = hct2.f)
        {
            hch1.a.g.a(new hct(hct2));
        }

        hch1.b = b;
        return hch1;
    }

    public final hcx T_()
    {
        return hcx.b;
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        hcy.a(abyte0.length, i1, j1);
        hct hct1 = a;
        if (hct1 == null)
        {
            i1 = -1;
        } else
        {
            j1 = Math.min(j1, hct1.c - hct1.b);
            System.arraycopy(hct1.a, hct1.b, abyte0, i1, j1);
            hct1.b = hct1.b + j1;
            b = b - (long)j1;
            i1 = j1;
            if (hct1.b == hct1.c)
            {
                a = hct1.a();
                hcu.a(hct1);
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
        hct hct1 = a;
        if (hct1 == null)
        {
            return -1L;
        }
        long l2 = 0L;
        do
        {
            int j1 = hct1.c - hct1.b;
            hct hct2;
            if (l1 >= (long)j1)
            {
                l1 -= j1;
            } else
            {
                byte abyte0[] = hct1.a;
                int i1 = (int)((long)hct1.b + l1);
                for (int k1 = hct1.c; i1 < k1; i1++)
                {
                    if (abyte0[i1] == byte0)
                    {
                        return (l2 + (long)i1) - (long)hct1.b;
                    }
                }

                l1 = 0L;
            }
            l2 += j1;
            hct2 = hct1.f;
            hct1 = hct2;
        } while (hct2 != a);
        return -1L;
    }

    public final long a(hch hch1, long l1)
    {
        if (hch1 == null)
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
        hch1.a_(this, l2);
        return l2;
    }

    public final long a(hcw hcw1)
    {
        if (hcw1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        long l1 = 0L;
        do
        {
            long l2 = hcw1.a(this, 2048L);
            if (l2 != -1L)
            {
                l1 += l2;
            } else
            {
                return l1;
            }
        } while (true);
    }

    public final hch a(int i1)
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

    public final hch a(hch hch1, long l1, long l2)
    {
        if (hch1 == null)
        {
            throw new IllegalArgumentException("out == null");
        }
        hcy.a(b, l1, l2);
        if (l2 != 0L)
        {
            hch1.b = hch1.b + l2;
            hct hct1 = a;
            hct hct3;
            long l3;
            long l4;
            do
            {
                hct3 = hct1;
                l3 = l1;
                l4 = l2;
                if (l1 < (long)(hct1.c - hct1.b))
                {
                    break;
                }
                l1 -= hct1.c - hct1.b;
                hct1 = hct1.f;
            } while (true);
            while (l4 > 0L) 
            {
                hct hct2 = new hct(hct3);
                hct2.b = (int)((long)hct2.b + l3);
                hct2.c = Math.min(hct2.b + (int)l4, hct2.c);
                if (hch1.a == null)
                {
                    hct2.g = hct2;
                    hct2.f = hct2;
                    hch1.a = hct2;
                } else
                {
                    hch1.a.g.a(hct2);
                }
                l4 -= hct2.c - hct2.b;
                hct3 = hct3.f;
                l3 = 0L;
            }
        }
        return this;
    }

    public final hch a(String s1)
    {
        return a(s1, 0, s1.length());
    }

    public final hch a(String s1, int i1, int j1)
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
        hct hct1;
        int j2;
        int k1 = (i1 + j2) - hct1.c;
        hct1.c = hct1.c + k1;
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
        hct1 = e(1);
        abyte0 = hct1.a;
        j2 = hct1.c - i1;
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

    public final hch a(ByteString bytestring)
    {
        if (bytestring == null)
        {
            throw new IllegalArgumentException("byteString == null");
        } else
        {
            bytestring.a(this);
            return this;
        }
    }

    public final hch a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        } else
        {
            return b(abyte0, 0, abyte0.length);
        }
    }

    public final hci a(byte abyte0[], int i1)
    {
        return b(abyte0, 0, i1);
    }

    public final String a(long l1, Charset charset)
    {
        hcy.a(b, 0L, l1);
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
            hct hct1 = a;
            if ((long)hct1.b + l1 > (long)hct1.c)
            {
                return new String(e(l1), charset);
            }
            String s1 = new String(hct1.a, hct1.b, (int)l1, charset);
            hct1.b = (int)((long)hct1.b + l1);
            b = b - l1;
            charset = s1;
            if (hct1.b == hct1.c)
            {
                a = hct1.a();
                hcu.a(hct1);
                return s1;
            }
        }
        return charset;
    }

    public final void a(long l1)
    {
        if (b < l1)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public final void a_(hch hch1, long l1)
    {
        if (hch1 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        if (hch1 == this)
        {
            throw new IllegalArgumentException("source == this");
        }
        hcy.a(hch1.b, 0L, l1);
_L2:
        hct hct3;
        long l3;
label0:
        {
label1:
            {
                if (l1 > 0L)
                {
                    if (l1 >= (long)(hch1.a.c - hch1.a.b))
                    {
                        break label0;
                    }
                    hct hct1;
                    int i1;
                    long l2;
                    if (a != null)
                    {
                        hct1 = a.g;
                    } else
                    {
                        hct1 = null;
                    }
                    if (hct1 == null || !hct1.e)
                    {
                        break label1;
                    }
                    l2 = hct1.c;
                    if (hct1.d)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = hct1.b;
                    }
                    if ((l2 + l1) - (long)i1 > 2048L)
                    {
                        break label1;
                    }
                    hch1.a.a(hct1, (int)l1);
                    hch1.b = hch1.b - l1;
                    b = b + l1;
                }
                return;
            }
            hct hct2 = hch1.a;
            int j1 = (int)l1;
            if (j1 <= 0 || j1 > hct2.c - hct2.b)
            {
                throw new IllegalArgumentException();
            }
            hct hct4 = new hct(hct2);
            hct4.c = hct4.b + j1;
            hct2.b = j1 + hct2.b;
            hct2.g.a(hct4);
            hch1.a = hct4;
        }
        hct3 = hch1.a;
        l3 = hct3.c - hct3.b;
        hch1.a = hct3.a();
        if (a != null)
        {
            break; /* Loop/switch isn't completed */
        }
        a = hct3;
        hct3 = a;
        hct hct5 = a;
        hct hct6 = a;
        hct5.g = hct6;
        hct3.f = hct6;
_L3:
        hch1.b = hch1.b - l3;
        b = b + l3;
        l1 -= l3;
        if (true) goto _L2; else goto _L1
_L1:
        hct3 = a.g.a(hct3);
        if (hct3.g == hct3)
        {
            throw new IllegalStateException();
        }
        if (hct3.g.e)
        {
            int i2 = hct3.c - hct3.b;
            int j2 = hct3.g.c;
            int k1;
            if (hct3.g.d)
            {
                k1 = 0;
            } else
            {
                k1 = hct3.g.b;
            }
            if (i2 <= k1 + (2048 - j2))
            {
                hct3.a(hct3.g, i2);
                hct3.a();
                hcu.a(hct3);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public final byte b(long l1)
    {
        hcy.a(b, l1, 1L);
        hct hct1 = a;
        do
        {
            int i1 = hct1.c - hct1.b;
            if (l1 < (long)i1)
            {
                return hct1.a[hct1.b + (int)l1];
            }
            l1 -= i1;
            hct1 = hct1.f;
        } while (true);
    }

    public final hch b()
    {
        return this;
    }

    public final hch b(int i1)
    {
        hct hct1 = e(1);
        byte abyte0[] = hct1.a;
        int j1 = hct1.c;
        hct1.c = j1 + 1;
        abyte0[j1] = (byte)i1;
        b = b + 1L;
        return this;
    }

    public final hch b(byte abyte0[], int i1, int j1)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("source == null");
        }
        hcy.a(abyte0.length, i1, j1);
        for (int k1 = i1 + j1; i1 < k1;)
        {
            hct hct1 = e(1);
            int l1 = Math.min(k1 - i1, 2048 - hct1.c);
            System.arraycopy(abyte0, i1, hct1.a, hct1.c, l1);
            i1 += l1;
            hct1.c = l1 + hct1.c;
        }

        b = b + (long)j1;
        return this;
    }

    public final hci b(String s1)
    {
        return a(s1);
    }

    public final hci b(ByteString bytestring)
    {
        return a(bytestring);
    }

    public final hci b(byte abyte0[])
    {
        return a(abyte0);
    }

    public final hch c(int i1)
    {
        hct hct1 = e(2);
        byte abyte0[] = hct1.a;
        int j1 = hct1.c;
        int k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 8);
        abyte0[k1] = (byte)i1;
        hct1.c = k1 + 1;
        b = b + 2L;
        return this;
    }

    public final OutputStream c()
    {
        return new OutputStream() {

            private hch a;

            public final void close()
            {
            }

            public final void flush()
            {
            }

            public final String toString()
            {
                return (new StringBuilder()).append(this).append(".outputStream()").toString();
            }

            public final void write(int i1)
            {
                a.b((byte)i1);
            }

            public final void write(byte abyte0[], int i1, int j1)
            {
                a.b(abyte0, i1, j1);
            }

            
            {
                a = hch.this;
                super();
            }
        };
    }

    public final ByteString c(long l1)
    {
        return new ByteString(e(l1));
    }

    public final Object clone()
    {
        return u();
    }

    public final void close()
    {
    }

    public final hch d(int i1)
    {
        hct hct1 = e(4);
        byte abyte0[] = hct1.a;
        int k1 = hct1.c;
        int j1 = k1 + 1;
        abyte0[k1] = i1 >> 24;
        k1 = j1 + 1;
        abyte0[j1] = (byte)(i1 >>> 16);
        j1 = k1 + 1;
        abyte0[k1] = (byte)(i1 >>> 8);
        abyte0[j1] = (byte)i1;
        hct1.c = j1 + 1;
        b = b + 4L;
        return this;
    }

    public final hci d()
    {
        return this;
    }

    final String d(long l1)
    {
        if (l1 > 0L && b(l1 - 1L) == 13)
        {
            String s1 = k(l1 - 1L);
            f(2L);
            return s1;
        } else
        {
            String s2 = k(l1);
            f(1L);
            return s2;
        }
    }

    final hct e(int i1)
    {
        if (i1 <= 0 || i1 > 2048)
        {
            throw new IllegalArgumentException();
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        hct hct1;
        a = hcu.a();
        hct hct2 = a;
        hct hct4 = a;
        hct1 = a;
        hct4.g = hct1;
        hct2.f = hct1;
_L4:
        return hct1;
_L2:
        hct hct3;
        hct3 = a.g;
        if (hct3.c + i1 > 2048)
        {
            break; /* Loop/switch isn't completed */
        }
        hct1 = hct3;
        if (hct3.e) goto _L4; else goto _L3
_L3:
        return hct3.a(hcu.a());
    }

    public final boolean e()
    {
        return b == 0L;
    }

    public final byte[] e(long l1)
    {
        hcy.a(b, 0L, l1);
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
        if (!(obj instanceof hch))
        {
            return false;
        }
        obj = (hch)obj;
        if (b != ((hch) (obj)).b)
        {
            return false;
        }
        if (b == 0L)
        {
            return true;
        }
        hct hct2 = a;
        obj = ((hch) (obj)).a;
        int j1 = hct2.b;
        int i1 = ((hct) (obj)).b;
        while (l2 < b) 
        {
            long l3 = Math.min(hct2.c - j1, ((hct) (obj)).c - i1);
            for (int k1 = 0; (long)k1 < l3;)
            {
                if (hct2.a[j1] != ((hct) (obj)).a[i1])
                {
                    return false;
                }
                k1++;
                i1++;
                j1++;
            }

            int l1 = j1;
            hct hct1 = hct2;
            if (j1 == hct2.c)
            {
                hct1 = hct2.f;
                l1 = hct1.b;
            }
            j1 = i1;
            Object obj1 = obj;
            if (i1 == ((hct) (obj)).c)
            {
                obj1 = ((hct) (obj)).f;
                j1 = ((hct) (obj1)).b;
            }
            l2 += l3;
            i1 = j1;
            j1 = l1;
            hct2 = hct1;
            obj = obj1;
        }
        return true;
    }

    public final hci f(int i1)
    {
        return d(i1);
    }

    public final InputStream f()
    {
        return new InputStream() {

            private hch a;

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
                    return a.g() & 0xff;
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
                a = hch.this;
                super();
            }
        };
    }

    public final void f(long l1)
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
            hct hct1 = a;
            hct1.b = i1 + hct1.b;
            l1 = l2;
            if (a.b == a.c)
            {
                hct hct2 = a;
                a = hct2.a();
                hcu.a(hct2);
                l1 = l2;
            }
        } while (true);
    }

    public final void flush()
    {
    }

    public final byte g()
    {
        if (b == 0L)
        {
            throw new IllegalStateException("size == 0");
        }
        hct hct1 = a;
        int i1 = hct1.b;
        int j1 = hct1.c;
        byte abyte0[] = hct1.a;
        int k1 = i1 + 1;
        byte byte0 = abyte0[i1];
        b = b - 1L;
        if (k1 == j1)
        {
            a = hct1.a();
            hcu.a(hct1);
            return byte0;
        } else
        {
            hct1.b = k1;
            return byte0;
        }
    }

    public final hch g(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        hct hct1;
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
        hct1 = e(j1);
        abyte0 = hct1.a;
        i1 = hct1.c + j1;
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
        hct1.c = hct1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final hci g(int i1)
    {
        return c(i1);
    }

    public final hch h(long l1)
    {
        if (l1 == 0L)
        {
            return b(48);
        }
        int j1 = Long.numberOfTrailingZeros(Long.highestOneBit(l1)) / 4 + 1;
        hct hct1 = e(j1);
        byte abyte0[] = hct1.a;
        int i1 = (hct1.c + j1) - 1;
        for (int k1 = hct1.c; i1 >= k1; i1--)
        {
            abyte0[i1] = c[(int)(15L & l1)];
            l1 >>>= 4;
        }

        hct1.c = hct1.c + j1;
        l1 = b;
        b = (long)j1 + l1;
        return this;
    }

    public final hci h(int i1)
    {
        return b(i1);
    }

    public final short h()
    {
        if (b < 2L)
        {
            throw new IllegalStateException((new StringBuilder("size < 2: ")).append(b).toString());
        }
        hct hct1 = a;
        int k1 = hct1.b;
        int i1 = hct1.c;
        if (i1 - k1 < 2)
        {
            return (short)((g() & 0xff) << 8 | g() & 0xff);
        }
        byte abyte0[] = hct1.a;
        int j1 = k1 + 1;
        k1 = abyte0[k1];
        int l1 = j1 + 1;
        j1 = abyte0[j1];
        b = b - 2L;
        if (l1 == i1)
        {
            a = hct1.a();
            hcu.a(hct1);
        } else
        {
            hct1.b = l1;
        }
        return (short)((k1 & 0xff) << 8 | j1 & 0xff);
    }

    public final int hashCode()
    {
        hct hct1 = a;
        if (hct1 == null)
        {
            return 0;
        }
        int j1 = 1;
        hct hct2;
        int i1;
        do
        {
            int k1 = hct1.b;
            int l1 = hct1.c;
            for (i1 = j1; k1 < l1; i1 = j1 + i1 * 31)
            {
                j1 = hct1.a[k1];
                k1++;
            }

            hct2 = hct1.f;
            j1 = i1;
            hct1 = hct2;
        } while (hct2 != a);
        return i1;
    }

    public final int i()
    {
        if (b < 4L)
        {
            throw new IllegalStateException((new StringBuilder("size < 4: ")).append(b).toString());
        }
        hct hct1 = a;
        int j1 = hct1.b;
        int i1 = hct1.c;
        if (i1 - j1 < 4)
        {
            return (g() & 0xff) << 24 | (g() & 0xff) << 16 | (g() & 0xff) << 8 | g() & 0xff;
        }
        byte abyte0[] = hct1.a;
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
            a = hct1.a();
            hcu.a(hct1);
            return j1;
        } else
        {
            hct1.b = i2;
            return j1;
        }
    }

    public final hci i(long l1)
    {
        return h(l1);
    }

    public final hci j(long l1)
    {
        return g(l1);
    }

    public final short j()
    {
        return hcy.a(h());
    }

    public final int k()
    {
        return hcy.a(i());
    }

    public final long l()
    {
        if (b < 8L)
        {
            throw new IllegalStateException((new StringBuilder("size < 8: ")).append(b).toString());
        }
        hct hct1 = a;
        int k1 = hct1.b;
        int i1 = hct1.c;
        long l1;
        if (i1 - k1 < 8)
        {
            l1 = ((long)i() & 0xffffffffL) << 32 | (long)i() & 0xffffffffL;
        } else
        {
            byte abyte0[] = hct1.a;
            int j1 = k1 + 1;
            l1 = abyte0[k1];
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
                a = hct1.a();
                hcu.a(hct1);
            } else
            {
                hct1.b = k1;
            }
        }
        return hcy.a(l1);
    }

    public final long m()
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
        abyte0 = ((hct) (obj)).a;
        j1 = ((hct) (obj)).b;
        i2 = ((hct) (obj)).c;
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
            obj = (new hch()).g(l2).b(k1);
            if (!flag)
            {
                ((hch) (obj)).g();
            }
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((hch) (obj)).p()).toString());
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
            a = ((hct) (obj)).a();
            hcu.a(((hct) (obj)));
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

    public final long n()
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
        abyte0 = ((hct) (obj)).a;
        l1 = ((hct) (obj)).b;
        i2 = ((hct) (obj)).c;
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
            obj = (new hch()).h(l2).b(byte0);
            throw new NumberFormatException((new StringBuilder("Number too large: ")).append(((hch) (obj)).p()).toString());
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
            a = ((hct) (obj)).a();
            hcu.a(((hct) (obj)));
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

    public final ByteString o()
    {
        return new ByteString(r());
    }

    public final String p()
    {
        String s1;
        try
        {
            s1 = a(b, hcy.a);
        }
        catch (EOFException eofexception)
        {
            throw new AssertionError(eofexception);
        }
        return s1;
    }

    public final String q()
    {
        long l1 = a((byte)10, 0L);
        if (l1 == -1L)
        {
            hch hch1 = new hch();
            a(hch1, 0L, Math.min(32L, b));
            throw new EOFException((new StringBuilder("\\n not found: size=")).append(b).append(" content=").append(hch1.o().d()).append("...").toString());
        } else
        {
            return d(l1);
        }
    }

    public final byte[] r()
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

    public final void s()
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

    public final volatile hci t()
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
            ByteString bytestring = u().o();
            return String.format("Buffer[size=%s data=%s]", new Object[] {
                Long.valueOf(b), bytestring.d()
            });
        }
        String s1;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(a.a, a.b, a.c - a.b);
            for (hct hct1 = a.f; hct1 != a; hct1 = hct1.f)
            {
                messagedigest.update(hct1.a, hct1.b, hct1.c - hct1.b);
            }

        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        s1 = String.format("Buffer[size=%s md5=%s]", new Object[] {
            Long.valueOf(b), ByteString.a(messagedigest.digest()).d()
        });
        return s1;
    }

}
