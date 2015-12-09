// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.uploader.client:
//            DataStream

public final class InputStreamDataStream
    implements DataStream
{

    private final int internalReadAheadLimit;
    private long markPosition;
    private final int readAheadLimit;
    private long readPosition;
    private boolean reset;
    private long size;
    private final InputStream stream;

    public InputStreamDataStream(InputStream inputstream, int i)
    {
        this(inputstream, -1L, i);
    }

    private InputStreamDataStream(InputStream inputstream, long l, int i)
    {
        if (!inputstream.markSupported())
        {
            stream = new BufferedInputStream(inputstream);
        } else
        {
            stream = inputstream;
        }
        size = l;
        readAheadLimit = i;
        if (i != 0x7fffffff)
        {
            i++;
        }
        internalReadAheadLimit = i;
        stream.mark(internalReadAheadLimit);
    }

    public final long getMarkPosition()
    {
        this;
        JVM INSTR monitorenter ;
        long l = markPosition;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getReadAheadLimit()
    {
        this;
        JVM INSTR monitorenter ;
        int i = readAheadLimit;
        long l = i;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getReadPosition()
    {
        this;
        JVM INSTR monitorenter ;
        long l = readPosition;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getSize()
    {
        this;
        JVM INSTR monitorenter ;
        long l = size;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean hasMoreData()
        throws IOException
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        int i;
        if (reset)
        {
            stream.reset();
            reset = false;
        }
        i = stream.available();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (stream.read() != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        size = readPosition;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        long l;
        stream.reset();
        l = readPosition - markPosition;
_L6:
        flag = flag1;
        if (l <= 0L) goto _L4; else goto _L5
_L5:
        long l1 = stream.skip(l);
        l -= l1;
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }

    public final void mark()
    {
        this;
        JVM INSTR monitorenter ;
        if (markPosition != readPosition)
        {
            stream.mark(internalReadAheadLimit);
        }
        markPosition = readPosition;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (abyte0.length - i >= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot read into a buffer smaller than given length");
        if (j != 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        if (reset)
        {
            stream.reset();
            reset = false;
        }
        j = (int)Math.min(j, (long)readAheadLimit - (readPosition - markPosition));
        j = stream.read(abyte0, i, j);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (size == -1L)
        {
            size = readPosition;
            break MISSING_BLOCK_LABEL_190;
        }
        if (readPosition < size)
        {
            throw new IOException("The stream ended before all expected bytes were read");
        }
        break MISSING_BLOCK_LABEL_190;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        readPosition = readPosition + (long)j;
        i = j;
        if (size == -1L)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (readPosition > size)
        {
            throw new IOException("The stream continues beyond expected size");
        }
        continue; /* Loop/switch isn't completed */
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void rewind()
    {
        this;
        JVM INSTR monitorenter ;
        readPosition = markPosition;
        reset = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        long l2 = Math.min(l, (long)readAheadLimit - (readPosition - markPosition));
        if (l2 != 0L) goto _L2; else goto _L1
_L1:
        l = 0L;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1;
        if (reset)
        {
            stream.reset();
            reset = false;
        }
        l1 = stream.skip(l2);
        l = l1;
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        l = l1;
        if (hasMoreData())
        {
            do
            {
                l = stream.skip(l2);
            } while (l == 0L);
        }
        readPosition = readPosition + l;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
