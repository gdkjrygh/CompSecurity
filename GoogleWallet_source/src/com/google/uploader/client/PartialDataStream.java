// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.uploader.client:
//            DataStream

class PartialDataStream
    implements DataStream
{

    private long markPosition;
    private long readPosition;
    private final long size;
    private final long startPosition;
    private final DataStream underlyingStream;

    public PartialDataStream(DataStream datastream, long l)
    {
        if (datastream.getReadAheadLimit() < 0x7fffffffffffffffL)
        {
            boolean flag;
            if (l <= datastream.getReadAheadLimit() - (datastream.getReadPosition() - datastream.getMarkPosition()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
        }
        underlyingStream = datastream;
        startPosition = datastream.getReadPosition();
        size = l;
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
        return 0x7fffffffffffffffL;
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
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        l = readPosition;
        l1 = size;
        boolean flag;
        if (l < l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void mark()
    {
        this;
        JVM INSTR monitorenter ;
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
        long l;
        boolean flag;
        if (abyte0.length - i >= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot read into a buffer smaller than given length");
        j = (int)Math.min(j, size - readPosition);
        if (startPosition + readPosition == underlyingStream.getReadPosition())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        underlyingStream.rewind();
        l = (startPosition - underlyingStream.getMarkPosition()) + readPosition;
_L1:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        l -= underlyingStream.skip(l);
          goto _L1
        i = underlyingStream.read(abyte0, i, j);
        readPosition = readPosition + (long)i;
        this;
        JVM INSTR monitorexit ;
        return i;
        abyte0;
        throw abyte0;
    }

    public final void rewind()
    {
        this;
        JVM INSTR monitorenter ;
        readPosition = markPosition;
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
        long l1;
        l1 = Math.min(l, size - readPosition);
        if (startPosition + readPosition == underlyingStream.getReadPosition())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        underlyingStream.rewind();
        l = (startPosition - underlyingStream.getMarkPosition()) + readPosition;
_L1:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        l -= underlyingStream.skip(l);
          goto _L1
        l = underlyingStream.skip(l1);
        readPosition = readPosition + l;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
