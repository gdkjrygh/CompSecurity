// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.qihoo360.common.unzip:
//            a, ZipLong, ZipShort

public class g
{
    private class a extends InputStream
    {

        final a.a a;
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
            synchronized (a.a.a(a).a)
            {
                RandomAccessFile randomaccessfile1 = a.a.a(a).a;
                long l1 = c;
                c = l1 + 1L;
                randomaccessfile1.seek(l1);
                i = a.a.a(a).a.read();
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
            synchronized (a.a.a(a).a)
            {
                a.a.a(a).a.seek(c);
                i = a.a.a(a).a.read(abyte0, i, k);
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

        a(long l, long l1)
        {
            a = a.a.this;
            super();
            d = false;
            b = l1;
            c = l;
        }
    }


    String a;
    int b;
    int c;
    long d;
    long e;
    long f;
    final com.qihoo360.common.unzip.a g;

    static com.qihoo360.common.unzip.a a(a.b b1)
    {
        return b1.g;
    }

    public String a()
    {
        return a;
    }

    public InputStream b()
        throws IOException
    {
        a a1 = new a(f, d);
        Object obj = a1;
        switch (c)
        {
        default:
            throw new IOException((new StringBuilder("Unsupported compression method ")).append(c).toString());

        case 8: // '\b'
            a1.a();
            obj = new Inflater(true);
            obj = new InflaterInputStream(a1, ((Inflater) (obj)), ((Inflater) (obj))) {

                final a.a a;
                private final Inflater b;

                public void close()
                    throws IOException
                {
                    super.close();
                    b.end();
                }

            
            {
                a = a.a.this;
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

    public eam(com.qihoo360.common.unzip.a a1)
    {
        g = a1;
        super();
    }
}
