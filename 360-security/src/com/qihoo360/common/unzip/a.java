// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.qihoo360.common.unzip:
//            ZipLong, ZipShort

public class com.qihoo360.common.unzip.a
{
    public class a
    {

        String a;
        int b;
        int c;
        long d;
        long e;
        long f;
        final com.qihoo360.common.unzip.a g;

        static com.qihoo360.common.unzip.a a(a a1)
        {
            return a1.g;
        }

        public String a()
        {
            return a;
        }

        public InputStream b()
            throws IOException
        {
            a a1 = new a(this, f, d);
            Object obj = a1;
            switch (c)
            {
            default:
                throw new IOException((new StringBuilder("Unsupported compression method ")).append(c).toString());

            case 8: // '\b'
                a1.a();
                obj = new Inflater(true);
                obj = new InflaterInputStream(this, a1, ((Inflater) (obj)), ((Inflater) (obj))) {

                    final a a;
                    private final Inflater b;

                    public void close()
                        throws IOException
                    {
                        super.close();
                        b.end();
                    }

            
            {
                a = a1;
                b = inflater1;
                super(inputstream, inflater);
            }
                };
                // fall through

            case 0: // '\0'
                return ((InputStream) (obj));
            }
        }

        void c()
            throws IOException
        {
            g.a.seek(e);
            g.a.readFully(com.qihoo360.common.unzip.a.a(g));
            if (Arrays.equals(com.qihoo360.common.unzip.a.a(g), ZipLong.LFH_SIG.getBytes()))
            {
                g.a.seek(e + 26L);
                g.a.readFully(com.qihoo360.common.unzip.a.c(g));
                int i = ZipShort.getValue(com.qihoo360.common.unzip.a.c(g));
                g.a.readFully(com.qihoo360.common.unzip.a.c(g));
                int j = ZipShort.getValue(com.qihoo360.common.unzip.a.c(g));
                long l = e;
                long l1 = i;
                f = (long)j + (l + 26L + 2L + 2L + l1);
                return;
            } else
            {
                throw new IOException((new StringBuilder("Invalid entry LFH offset: ")).append(e).toString());
            }
        }

        public a()
        {
            g = com.qihoo360.common.unzip.a.this;
            super();
        }
    }

    private class a.a extends InputStream
    {

        final a a;
        private long b;
        private long c;
        private boolean d;

        void a()
        {
            d = true;
        }

        public int read()
            throws IOException
        {
            long l = b;
            b = l - 1L;
            if (l <= 0L)
            {
                if (d)
                {
                    d = false;
                    return 0;
                } else
                {
                    return -1;
                }
            }
            int i;
            synchronized (a.a(a).a)
            {
                RandomAccessFile randomaccessfile1 = a.a(a).a;
                long l1 = c;
                c = l1 + 1L;
                randomaccessfile1.seek(l1);
                i = a.a(a).a.read();
            }
            return i;
            exception;
            randomaccessfile;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            int k = 0;
            if (b > 0L) goto _L2; else goto _L1
_L1:
            if (!d) goto _L4; else goto _L3
_L3:
            d = false;
            abyte0[i] = 0;
            k = 1;
_L6:
            return k;
_L4:
            return -1;
_L2:
            if (j <= 0) goto _L6; else goto _L5
_L5:
            k = j;
            if ((long)j > b)
            {
                k = (int)b;
            }
            synchronized (a.a(a).a)
            {
                a.a(a).a.seek(c);
                i = a.a(a).a.read(abyte0, i, k);
            }
            k = i;
            if (i <= 0) goto _L6; else goto _L7
_L7:
            c = c + (long)i;
            b = b - (long)i;
            return i;
            abyte0;
            randomaccessfile;
            JVM INSTR monitorexit ;
            throw abyte0;
        }

        a.a(a a1, long l, long l1)
        {
            a = a1;
            super();
            d = false;
            b = l1;
            c = l;
        }
    }

    public class b
        implements Enumeration
    {

        final com.qihoo360.common.unzip.a a;
        private boolean b;
        private long c;

        private String a(byte abyte0[])
        {
            char ac[] = new char[abyte0.length];
            int i = 0;
            do
            {
                if (i >= abyte0.length)
                {
                    return new String(ac);
                }
                ac[i] = (char)abyte0[i];
                i++;
            } while (true);
        }

        private a b()
            throws IOException
        {
            a a1 = a. new a();
            a.a.readFully(com.qihoo360.common.unzip.a.b(a));
            a1.b = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 4);
            a1.c = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 6);
            a1.d = ZipLong.getValue(com.qihoo360.common.unzip.a.b(a), 16);
            int i = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 24);
            int j = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 26);
            int k = ZipShort.getValue(com.qihoo360.common.unzip.a.b(a), 28);
            byte abyte0[] = new byte[i];
            a.a.readFully(abyte0);
            a1.a = a(abyte0);
            a1.e = ZipLong.getValue(com.qihoo360.common.unzip.a.b(a), 38);
            com.qihoo360.common.unzip.a.a(a, j);
            com.qihoo360.common.unzip.a.a(a, k);
            c = a.a.getFilePointer();
            a1.c();
            a.a.seek(c);
            return a1;
        }

        public a a()
        {
            if (!b)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            a a1;
            if (c > 0L)
            {
                a.a.seek(c);
            }
            a1 = b();
            a.a.readFully(com.qihoo360.common.unzip.a.a(a));
            boolean flag;
            if (ZipLong.getValue(com.qihoo360.common.unzip.a.a(a)) == com.qihoo360.common.unzip.a.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
            c = a.a.getFilePointer();
            return a1;
            Exception exception;
            exception;
            throw new NoSuchElementException();
        }

        public boolean hasMoreElements()
        {
            return b;
        }

        public Object nextElement()
        {
            return a();
        }

        public b()
        {
            a = com.qihoo360.common.unzip.a.this;
            super();
            b = true;
            c = -1L;
        }
    }


    private static final byte c[] = ZipLong.getBytes(0x6054b50L);
    private static final long d;
    final RandomAccessFile a;
    final b b = new b();
    private final byte e[] = new byte[4];
    private final byte f[] = new byte[42];
    private final byte g[] = new byte[2];

    public com.qihoo360.common.unzip.a(String s)
        throws IOException
    {
        a = new RandomAccessFile(s, "r");
        d();
        a.readFully(e);
        if (ZipLong.getValue(e) != d && g())
        {
            throw new IOException((new StringBuilder(String.valueOf(s))).append(": central directory is empty.").toString());
        } else
        {
            return;
        }
    }

    private void a(int i)
        throws IOException
    {
        int j = 0;
        do
        {
            if (j >= i)
            {
                return;
            }
            int k = a.skipBytes(i - j);
            if (k <= 0)
            {
                throw new EOFException();
            }
            j += k;
        } while (true);
    }

    static void a(com.qihoo360.common.unzip.a a1, int i)
        throws IOException
    {
        a1.a(i);
    }

    private boolean a(long l, long l1, byte abyte0[])
        throws IOException
    {
        long l2;
        boolean flag;
        boolean flag1;
        flag1 = false;
        l = a.length() - l;
        l2 = Math.max(0L, a.length() - l1);
        l1 = l;
        flag = flag1;
        if (l < 0L) goto _L2; else goto _L1
_L1:
        if (l >= l2) goto _L4; else goto _L3
_L3:
        flag = flag1;
        l1 = l;
_L2:
        if (flag)
        {
            a.seek(l1);
        }
        return flag;
_L4:
        a.seek(l);
        int i = a.read();
        l1 = l;
        flag = flag1;
        if (i == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i != abyte0[0] || a.read() != abyte0[1] || a.read() != abyte0[2] || a.read() != abyte0[3])
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        l1 = l;
        if (true) goto _L2; else goto _L5
_L5:
        l--;
        if (true) goto _L1; else goto _L6
_L6:
    }

    static byte[] a(com.qihoo360.common.unzip.a a1)
    {
        return a1.e;
    }

    static byte[] b(com.qihoo360.common.unzip.a a1)
    {
        return a1.f;
    }

    static long c()
    {
        return d;
    }

    static byte[] c(com.qihoo360.common.unzip.a a1)
    {
        return a1.g;
    }

    private void d()
        throws IOException
    {
        e();
        f();
    }

    private void e()
        throws IOException
    {
        if (!a(22L, 0x10015L, c))
        {
            throw new IOException("archive is not a ZIP archive");
        } else
        {
            return;
        }
    }

    private void f()
        throws IOException
    {
        a(16);
        a.readFully(e);
        a.seek(ZipLong.getValue(e));
    }

    private boolean g()
        throws IOException
    {
        a.seek(0L);
        a.readFully(e);
        return Arrays.equals(e, ZipLong.LFH_SIG.getBytes());
    }

    public Enumeration a()
    {
        return b;
    }

    public void b()
        throws IOException
    {
        a.close();
    }

    static 
    {
        d = ZipLong.getValue(ZipLong.CFH_SIG.getBytes());
    }
}
