// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ByteArrayOutputStream extends OutputStream
{

    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private final List buffers;
    private int count;
    private byte currentBuffer[];
    private int currentBufferIndex;
    private int filledBufferSum;

    public ByteArrayOutputStream()
    {
        this(1024);
    }

    public ByteArrayOutputStream(int i)
    {
        buffers = new ArrayList();
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Negative initial size: ")).append(i).toString());
        }
        this;
        JVM INSTR monitorenter ;
        needNewBuffer(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void needNewBuffer(int i)
    {
        if (currentBufferIndex < buffers.size() - 1)
        {
            filledBufferSum = filledBufferSum + currentBuffer.length;
            currentBufferIndex = currentBufferIndex + 1;
            currentBuffer = (byte[])buffers.get(currentBufferIndex);
            return;
        }
        if (currentBuffer == null)
        {
            filledBufferSum = 0;
        } else
        {
            i = Math.max(currentBuffer.length << 1, i - filledBufferSum);
            filledBufferSum = filledBufferSum + currentBuffer.length;
        }
        currentBufferIndex = currentBufferIndex + 1;
        currentBuffer = new byte[i];
        buffers.add(currentBuffer);
    }

    public void close()
    {
    }

    public byte[] toByteArray()
    {
        this;
        JVM INSTR monitorenter ;
        int j = count;
        if (j != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = EMPTY_BYTE_ARRAY;
_L4:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        Iterator iterator;
        abyte0 = new byte[j];
        iterator = buffers.iterator();
        int i = 0;
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        int k;
        byte abyte1[] = (byte[])iterator.next();
        k = Math.min(abyte1.length, j);
        System.arraycopy(abyte1, 0, abyte0, i, k);
        j -= k;
        if (j != 0) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_97;
        Exception exception;
        exception;
        throw exception;
        i += k;
          goto _L6
    }

    public String toString()
    {
        return new String(toByteArray());
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int k = count - filledBufferSum;
        int j = k;
        if (k != currentBuffer.length)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        needNewBuffer(count + 1);
        j = 0;
        currentBuffer[j] = (byte)i;
        count = count + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (i < 0 || i > abyte0.length || j < 0 || i + j > abyte0.length || i + j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        int j1;
        j1 = count + j;
        l = count - filledBufferSum;
        int k = j;
_L2:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        i1 = Math.min(k, currentBuffer.length - l);
        System.arraycopy(abyte0, (i + j) - k, currentBuffer, l, i1);
        i1 = k - i1;
        k = i1;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        needNewBuffer(j1);
        l = 0;
        k = i1;
        if (true) goto _L2; else goto _L1
_L1:
        count = j1;
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

}
