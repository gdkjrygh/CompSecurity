// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            BufferRecycler

public final class ByteArrayBuilder extends OutputStream
{

    private static final byte NO_BYTES[] = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte _currBlock[];
    private int _currBlockPtr;
    private final LinkedList _pastBlocks;
    private int _pastLen;

    public ByteArrayBuilder()
    {
        this(((BufferRecycler) (null)));
    }

    public ByteArrayBuilder(int i)
    {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferrecycler)
    {
        this(bufferrecycler, 500);
    }

    public ByteArrayBuilder(BufferRecycler bufferrecycler, int i)
    {
        _pastBlocks = new LinkedList();
        _bufferRecycler = bufferrecycler;
        if (bufferrecycler == null)
        {
            _currBlock = new byte[i];
            return;
        } else
        {
            _currBlock = bufferrecycler.allocByteBuffer(BufferRecycler.ByteBufferType.WRITE_CONCAT_BUFFER);
            return;
        }
    }

    private void _allocMore()
    {
        int i = 0x40000;
        _pastLen = _pastLen + _currBlock.length;
        int j = Math.max(_pastLen >> 1, 1000);
        if (j <= 0x40000)
        {
            i = j;
        }
        _pastBlocks.add(_currBlock);
        _currBlock = new byte[i];
        _currBlockPtr = 0;
    }

    public final void append(int i)
    {
        if (_currBlockPtr >= _currBlock.length)
        {
            _allocMore();
        }
        byte abyte0[] = _currBlock;
        int j = _currBlockPtr;
        _currBlockPtr = j + 1;
        abyte0[j] = (byte)i;
    }

    public final void appendThreeBytes(int i)
    {
        if (_currBlockPtr + 2 < _currBlock.length)
        {
            byte abyte0[] = _currBlock;
            int j = _currBlockPtr;
            _currBlockPtr = j + 1;
            abyte0[j] = (byte)(i >> 16);
            abyte0 = _currBlock;
            j = _currBlockPtr;
            _currBlockPtr = j + 1;
            abyte0[j] = (byte)(i >> 8);
            abyte0 = _currBlock;
            j = _currBlockPtr;
            _currBlockPtr = j + 1;
            abyte0[j] = (byte)i;
            return;
        } else
        {
            append(i >> 16);
            append(i >> 8);
            append(i);
            return;
        }
    }

    public final void appendTwoBytes(int i)
    {
        if (_currBlockPtr + 1 < _currBlock.length)
        {
            byte abyte0[] = _currBlock;
            int j = _currBlockPtr;
            _currBlockPtr = j + 1;
            abyte0[j] = (byte)(i >> 8);
            abyte0 = _currBlock;
            j = _currBlockPtr;
            _currBlockPtr = j + 1;
            abyte0[j] = (byte)i;
            return;
        } else
        {
            append(i >> 8);
            append(i);
            return;
        }
    }

    public final void close()
    {
    }

    public final void flush()
    {
    }

    public final void reset()
    {
        _pastLen = 0;
        _currBlockPtr = 0;
        if (!_pastBlocks.isEmpty())
        {
            _pastBlocks.clear();
        }
    }

    public final byte[] toByteArray()
    {
        int j = _pastLen + _currBlockPtr;
        if (j == 0)
        {
            return NO_BYTES;
        }
        byte abyte0[] = new byte[j];
        Iterator iterator = _pastBlocks.iterator();
        int i;
        int k;
        for (i = 0; iterator.hasNext(); i += k)
        {
            byte abyte1[] = (byte[])iterator.next();
            k = abyte1.length;
            System.arraycopy(abyte1, 0, abyte0, i, k);
        }

        System.arraycopy(_currBlock, 0, abyte0, i, _currBlockPtr);
        i = _currBlockPtr + i;
        if (i != j)
        {
            throw new RuntimeException((new StringBuilder("Internal error: total len assumed to be ")).append(j).append(", copied ").append(i).append(" bytes").toString());
        }
        if (!_pastBlocks.isEmpty())
        {
            reset();
        }
        return abyte0;
    }

    public final void write(int i)
    {
        append(i);
    }

    public final void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        int k = i;
        do
        {
            int i1 = Math.min(_currBlock.length - _currBlockPtr, j);
            int l = k;
            i = j;
            if (i1 > 0)
            {
                System.arraycopy(abyte0, k, _currBlock, _currBlockPtr, i1);
                l = k + i1;
                _currBlockPtr = _currBlockPtr + i1;
                i = j - i1;
            }
            if (i > 0)
            {
                _allocMore();
                k = l;
                j = i;
            } else
            {
                return;
            }
        } while (true);
    }

}
