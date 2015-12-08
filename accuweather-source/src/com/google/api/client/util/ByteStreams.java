// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.util:
//            Preconditions

public final class ByteStreams
{
    private static final class LimitedInputStream extends FilterInputStream
    {

        private long left;
        private long mark;

        public int available()
            throws IOException
        {
            return (int)Math.min(in.available(), left);
        }

        public void mark(int i)
        {
            this;
            JVM INSTR monitorenter ;
            in.mark(i);
            mark = left;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public int read()
            throws IOException
        {
            int i;
            if (left == 0L)
            {
                i = -1;
            } else
            {
                int j = in.read();
                i = j;
                if (j != -1)
                {
                    left = left - 1L;
                    return j;
                }
            }
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            if (left == 0L)
            {
                i = -1;
            } else
            {
                j = (int)Math.min(j, left);
                j = in.read(abyte0, i, j);
                i = j;
                if (j != -1)
                {
                    left = left - (long)j;
                    return j;
                }
            }
            return i;
        }

        public void reset()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (!in.markSupported())
            {
                throw new IOException("Mark not supported");
            }
            break MISSING_BLOCK_LABEL_27;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (mark == -1L)
            {
                throw new IOException("Mark not set");
            }
            in.reset();
            left = mark;
            this;
            JVM INSTR monitorexit ;
        }

        public long skip(long l)
            throws IOException
        {
            l = Math.min(l, left);
            l = in.skip(l);
            left = left - l;
            return l;
        }

        LimitedInputStream(InputStream inputstream, long l)
        {
            super(inputstream);
            mark = -1L;
            Preconditions.checkNotNull(inputstream);
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "limit must be non-negative");
            left = l;
        }
    }


    private static final int BUF_SIZE = 4096;

    private ByteStreams()
    {
    }

    public static long copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return l;
            }
            outputstream.write(abyte0, 0, i);
            l += i;
        } while (true);
    }

    public static InputStream limit(InputStream inputstream, long l)
    {
        return new LimitedInputStream(inputstream, l);
    }

    public static int read(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(abyte0);
        if (j < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int k = 0;
        do
        {
            int l;
label0:
            {
                if (k < j)
                {
                    l = inputstream.read(abyte0, i + k, j - k);
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                return k;
            }
            k += l;
        } while (true);
    }
}
