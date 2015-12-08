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

    static final int DEFAULT_BLOCK_ARRAY_SIZE = 40;
    private static final int INITIAL_BLOCK_SIZE = 500;
    private static final int MAX_BLOCK_SIZE = 0x40000;
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
        _pastLen = _pastLen + _currBlock.length;
        int j = Math.max(_pastLen >> 1, 1000);
        int i = j;
        if (j > 0x40000)
        {
            i = 0x40000;
        }
        _pastBlocks.add(_currBlock);
        _currBlock = new byte[i];
        _currBlockPtr = 0;
    }

    public void append(int i)
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

    public void appendThreeBytes(int i)
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

    public void appendTwoBytes(int i)
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

    public void close()
    {
    }

    public byte[] completeAndCoalesce(int i)
    {
        _currBlockPtr = i;
        return toByteArray();
    }

    public byte[] finishCurrentSegment()
    {
        _allocMore();
        return _currBlock;
    }

    public void flush()
    {
    }

    public byte[] getCurrentSegment()
    {
        return _currBlock;
    }

    public int getCurrentSegmentLength()
    {
        return _currBlockPtr;
    }

    public void release()
    {
        reset();
        if (_bufferRecycler != null && _currBlock != null)
        {
            _bufferRecycler.releaseByteBuffer(BufferRecycler.ByteBufferType.WRITE_CONCAT_BUFFER, _currBlock);
            _currBlock = null;
        }
    }

    public void reset()
    {
        _pastLen = 0;
        _currBlockPtr = 0;
        if (!_pastBlocks.isEmpty())
        {
            _pastBlocks.clear();
        }
    }

    public byte[] resetAndGetFirstSegment()
    {
        reset();
        return _currBlock;
    }

    public void setCurrentSegmentLength(int i)
    {
        _currBlockPtr = i;
    }

    public byte[] toByteArray()
    {
        int j = _pastLen + _currBlockPtr;
        Object obj;
        if (j == 0)
        {
            obj = NO_BYTES;
        } else
        {
            byte abyte0[] = new byte[j];
            int i = 0;
            for (obj = _pastBlocks.iterator(); ((Iterator) (obj)).hasNext();)
            {
                byte abyte1[] = (byte[])((Iterator) (obj)).next();
                int k = abyte1.length;
                System.arraycopy(abyte1, 0, abyte0, i, k);
                i += k;
            }

            System.arraycopy(_currBlock, 0, abyte0, i, _currBlockPtr);
            i += _currBlockPtr;
            if (i != j)
            {
                throw new RuntimeException((new StringBuilder()).append("Internal error: total len assumed to be ").append(j).append(", copied ").append(i).append(" bytes").toString());
            }
            obj = abyte0;
            if (!_pastBlocks.isEmpty())
            {
                reset();
                return abyte0;
            }
        }
        return ((byte []) (obj));
    }

    public void write(int i)
    {
        append(i);
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
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
            if (i <= 0)
            {
                return;
            }
            _allocMore();
            k = l;
            j = i;
        } while (true);
    }

}
