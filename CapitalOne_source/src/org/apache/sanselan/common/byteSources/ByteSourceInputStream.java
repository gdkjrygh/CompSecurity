// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.common.byteSources:
//            ByteSource

public class ByteSourceInputStream extends ByteSource
{

    private final InputStream c;
    private CacheBlock d;
    private byte e[];
    private Long f;

    static CacheBlock a(ByteSourceInputStream bytesourceinputstream)
    {
        return bytesourceinputstream.d();
    }

    static CacheBlock b(ByteSourceInputStream bytesourceinputstream)
    {
        if (bytesourceinputstream.d == null)
        {
            bytesourceinputstream.d = bytesourceinputstream.d();
        }
        return bytesourceinputstream.d;
    }

    private CacheBlock d()
    {
        if (e == null)
        {
            e = new byte[1024];
        }
        int i = c.read(e);
        if (i <= 0)
        {
            return null;
        }
        if (i < 1024)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(e, 0, abyte0, 0, i);
            return new CacheBlock(abyte0);
        } else
        {
            byte abyte1[] = e;
            e = null;
            return new CacheBlock(abyte1);
        }
    }

    public final InputStream b()
    {
        return new CacheReadingInputStream((byte)0);
    }

    public final byte[] b(int i, int j)
    {
        InputStream inputstream = b();
        inputstream.skip(i);
        byte abyte0[] = new byte[j];
        i = 0;
        int k;
        do
        {
            k = inputstream.read(abyte0, i, abyte0.length - i);
            if (k <= 0)
            {
                throw new IOException("Could not read block.");
            }
            k = i + k;
            i = k;
        } while (k < j);
        return abyte0;
    }

    public final long c()
    {
        if (f != null)
        {
            return f.longValue();
        }
        InputStream inputstream = b();
        long l = 0L;
        do
        {
            long l1 = inputstream.skip(1024L);
            if (l1 <= 0L)
            {
                f = new Long(l);
                return l;
            }
            l += l1;
        } while (true);
    }

    private class CacheBlock
    {

        public final byte a[];
        final ByteSourceInputStream b;
        private CacheBlock c;
        private boolean d;

        public final CacheBlock a()
        {
            if (c != null)
            {
                return c;
            }
            if (d)
            {
                return null;
            } else
            {
                d = true;
                c = ByteSourceInputStream.a(b);
                return c;
            }
        }

        public CacheBlock(byte abyte0[])
        {
            b = ByteSourceInputStream.this;
            super();
            c = null;
            d = false;
            a = abyte0;
        }
    }


    private class CacheReadingInputStream extends InputStream
    {

        final ByteSourceInputStream a;
        private CacheBlock b;
        private boolean c;
        private int d;

        public int read()
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            if (!c) goto _L4; else goto _L3
_L3:
            return -1;
_L4:
            b = ByteSourceInputStream.b(a);
            c = true;
_L2:
            if (b != null && d >= b.a.length)
            {
                b = b.a();
                d = 0;
            }
            if (b != null && d < b.a.length)
            {
                byte abyte0[] = b.a;
                int i = d;
                d = i + 1;
                return abyte0[i] & 0xff;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public int read(byte abyte0[], int i, int j)
        {
            if (abyte0 == null)
            {
                throw new NullPointerException();
            }
            if (i < 0 || i > abyte0.length || j < 0 || i + j > abyte0.length || i + j < 0)
            {
                throw new IndexOutOfBoundsException();
            }
            if (j == 0)
            {
                return 0;
            }
            if (b == null)
            {
                if (c)
                {
                    return -1;
                }
                b = ByteSourceInputStream.b(a);
                c = true;
            }
            if (b != null && d >= b.a.length)
            {
                b = b.a();
                d = 0;
            }
            if (b == null)
            {
                return -1;
            }
            if (d >= b.a.length)
            {
                return -1;
            } else
            {
                j = Math.min(j, b.a.length - d);
                System.arraycopy(b.a, d, abyte0, i, j);
                d = d + j;
                return j;
            }
        }

        private CacheReadingInputStream()
        {
            a = ByteSourceInputStream.this;
            super();
            b = null;
            c = false;
            d = 0;
        }

        CacheReadingInputStream(byte byte0)
        {
            this();
        }
    }

}
