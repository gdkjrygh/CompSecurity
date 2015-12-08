// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;

// Referenced classes of package com.google.protobuf:
//            ByteString, LiteralByteString

public static final class buffer extends OutputStream
{

    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private byte buffer[];
    private int bufferPos;
    private final ArrayList flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    private static byte[] copyArray(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(abyte0.length, i));
        return abyte1;
    }

    private void flushFullBuffer(int i)
    {
        flushedBuffers.add(new LiteralByteString(buffer));
        flushedBuffersTotalBytes = flushedBuffersTotalBytes + buffer.length;
        buffer = new byte[Math.max(initialCapacity, Math.max(i, flushedBuffersTotalBytes >>> 1))];
        bufferPos = 0;
    }

    private void flushLastBuffer()
    {
        if (bufferPos < buffer.length)
        {
            if (bufferPos > 0)
            {
                byte abyte0[] = copyArray(buffer, bufferPos);
                flushedBuffers.add(new LiteralByteString(abyte0));
            }
        } else
        {
            flushedBuffers.add(new LiteralByteString(buffer));
            buffer = EMPTY_BYTE_ARRAY;
        }
        flushedBuffersTotalBytes = flushedBuffersTotalBytes + bufferPos;
        bufferPos = 0;
    }

    private int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = flushedBuffersTotalBytes;
        j = bufferPos;
        this;
        JVM INSTR monitorexit ;
        return i + j;
        Exception exception;
        exception;
        throw exception;
    }

    public final ByteString toByteString()
    {
        this;
        JVM INSTR monitorenter ;
        ByteString bytestring;
        flushLastBuffer();
        bytestring = ByteString.copyFrom(flushedBuffers);
        this;
        JVM INSTR monitorexit ;
        return bytestring;
        Exception exception;
        exception;
        throw exception;
    }

    public final String toString()
    {
        return String.format("<ByteString.Output@%s size=%d>", new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())
        });
    }

    public final void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[];
        int j;
        if (bufferPos == buffer.length)
        {
            flushFullBuffer(1);
        }
        abyte0 = buffer;
        j = bufferPos;
        bufferPos = j + 1;
        abyte0[j] = (byte)i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (j > buffer.length - bufferPos) goto _L2; else goto _L1
_L1:
        System.arraycopy(abyte0, i, buffer, bufferPos, j);
        bufferPos = bufferPos + j;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int k;
        k = buffer.length - bufferPos;
        System.arraycopy(abyte0, i, buffer, bufferPos, k);
        j -= k;
        flushFullBuffer(j);
        System.arraycopy(abyte0, i + k, buffer, 0, j);
        bufferPos = j;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }


    (int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Buffer size < 0");
        } else
        {
            initialCapacity = i;
            flushedBuffers = new ArrayList();
            buffer = new byte[i];
            return;
        }
    }
}
