// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

public class ByteArrayOutputStream extends OutputStream
{

    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private final List buffers;
    private int count;
    private byte currentBuffer[];
    private int currentBufferIndex;
    private int filledBufferSum;
    private boolean reuseBuffers;

    public ByteArrayOutputStream()
    {
        this(1024);
    }

    public ByteArrayOutputStream(int i)
    {
        buffers = new ArrayList();
        reuseBuffers = true;
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

    public static InputStream toBufferedInputStream(InputStream inputstream)
    {
        return toBufferedInputStream(inputstream, 1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputstream, int i)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(i);
        bytearrayoutputstream.write(inputstream);
        return bytearrayoutputstream.toInputStream();
    }

    public void close()
    {
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        count = 0;
        filledBufferSum = 0;
        currentBufferIndex = 0;
        if (!reuseBuffers) goto _L2; else goto _L1
_L1:
        currentBuffer = (byte[])buffers.get(currentBufferIndex);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        currentBuffer = null;
        int i = ((byte[])buffers.get(0)).length;
        buffers.clear();
        needNewBuffer(i);
        reuseBuffers = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = count;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
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

    public InputStream toInputStream()
    {
        this;
        JVM INSTR monitorenter ;
        int i = count;
        if (i != 0) goto _L2; else goto _L1
_L1:
        Object obj = new ClosedInputStream();
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((InputStream) (obj));
_L2:
        Iterator iterator;
        obj = new ArrayList(buffers.size());
        iterator = buffers.iterator();
_L4:
        int j;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = (byte[])iterator.next();
        j = Math.min(abyte0.length, i);
        ((List) (obj)).add(new ByteArrayInputStream(abyte0, 0, j));
        i -= j;
        if (i != 0) goto _L4; else goto _L3
_L3:
        reuseBuffers = false;
        obj = new SequenceInputStream(Collections.enumeration(((java.util.Collection) (obj))));
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        return new String(toByteArray(), Charset.defaultCharset());
    }

    public String toString(String s)
    {
        return new String(toByteArray(), s);
    }

    public String toString(Charset charset)
    {
        return new String(toByteArray(), charset);
    }

    public int write(InputStream inputstream)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = count - filledBufferSum;
        i = inputstream.read(currentBuffer, j, currentBuffer.length - j);
        int k = 0;
_L2:
        int l;
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k + i;
        j += i;
        count = i + count;
        i = j;
        if (j != currentBuffer.length)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        needNewBuffer(currentBuffer.length);
        i = 0;
        k = inputstream.read(currentBuffer, i, currentBuffer.length - i);
        j = i;
        i = k;
        k = l;
        if (true) goto _L2; else goto _L1
_L1:
        return k;
        inputstream;
        throw inputstream;
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

    public void writeTo(OutputStream outputstream)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        int i;
        i = count;
        iterator = buffers.iterator();
_L2:
        int j;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = (byte[])iterator.next();
        j = Math.min(abyte0.length, i);
        outputstream.write(abyte0, 0, j);
        i -= j;
        if (i != 0) goto _L2; else goto _L1
_L1:
        return;
        outputstream;
        throw outputstream;
    }

}
