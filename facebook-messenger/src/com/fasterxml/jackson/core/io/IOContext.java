// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public final class IOContext
{

    protected final BufferRecycler _bufferRecycler;
    protected char _concatCBuffer[];
    protected JsonEncoding _encoding;
    protected final boolean _managedResource;
    protected char _nameCopyBuffer[];
    protected byte _readIOBuffer[];
    protected final Object _sourceRef;
    protected char _tokenCBuffer[];
    protected byte _writeEncodingBuffer[];

    public IOContext(BufferRecycler bufferrecycler, Object obj, boolean flag)
    {
        _readIOBuffer = null;
        _writeEncodingBuffer = null;
        _tokenCBuffer = null;
        _concatCBuffer = null;
        _nameCopyBuffer = null;
        _bufferRecycler = bufferrecycler;
        _sourceRef = obj;
        _managedResource = flag;
    }

    public final char[] allocConcatBuffer()
    {
        if (_concatCBuffer != null)
        {
            throw new IllegalStateException("Trying to call allocConcatBuffer() second time");
        } else
        {
            _concatCBuffer = _bufferRecycler.allocCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER);
            return _concatCBuffer;
        }
    }

    public final char[] allocNameCopyBuffer(int i)
    {
        if (_nameCopyBuffer != null)
        {
            throw new IllegalStateException("Trying to call allocNameCopyBuffer() second time");
        } else
        {
            _nameCopyBuffer = _bufferRecycler.allocCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER, i);
            return _nameCopyBuffer;
        }
    }

    public final byte[] allocReadIOBuffer()
    {
        if (_readIOBuffer != null)
        {
            throw new IllegalStateException("Trying to call allocReadIOBuffer() second time");
        } else
        {
            _readIOBuffer = _bufferRecycler.allocByteBuffer(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.READ_IO_BUFFER);
            return _readIOBuffer;
        }
    }

    public final char[] allocTokenBuffer()
    {
        if (_tokenCBuffer != null)
        {
            throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
        } else
        {
            _tokenCBuffer = _bufferRecycler.allocCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TOKEN_BUFFER);
            return _tokenCBuffer;
        }
    }

    public final byte[] allocWriteEncodingBuffer()
    {
        if (_writeEncodingBuffer != null)
        {
            throw new IllegalStateException("Trying to call allocWriteEncodingBuffer() second time");
        } else
        {
            _writeEncodingBuffer = _bufferRecycler.allocByteBuffer(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER);
            return _writeEncodingBuffer;
        }
    }

    public final TextBuffer constructTextBuffer()
    {
        return new TextBuffer(_bufferRecycler);
    }

    public final JsonEncoding getEncoding()
    {
        return _encoding;
    }

    public final Object getSourceReference()
    {
        return _sourceRef;
    }

    public final boolean isResourceManaged()
    {
        return _managedResource;
    }

    public final void releaseConcatBuffer(char ac[])
    {
        if (ac != null)
        {
            if (ac != _concatCBuffer)
            {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            _concatCBuffer = null;
            _bufferRecycler.releaseCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.CONCAT_BUFFER, ac);
        }
    }

    public final void releaseNameCopyBuffer(char ac[])
    {
        if (ac != null)
        {
            if (ac != _nameCopyBuffer)
            {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            _nameCopyBuffer = null;
            _bufferRecycler.releaseCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.NAME_COPY_BUFFER, ac);
        }
    }

    public final void releaseReadIOBuffer(byte abyte0[])
    {
        if (abyte0 != null)
        {
            if (abyte0 != _readIOBuffer)
            {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            _readIOBuffer = null;
            _bufferRecycler.releaseByteBuffer(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.READ_IO_BUFFER, abyte0);
        }
    }

    public final void releaseTokenBuffer(char ac[])
    {
        if (ac != null)
        {
            if (ac != _tokenCBuffer)
            {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            _tokenCBuffer = null;
            _bufferRecycler.releaseCharBuffer(com.fasterxml.jackson.core.util.BufferRecycler.CharBufferType.TOKEN_BUFFER, ac);
        }
    }

    public final void releaseWriteEncodingBuffer(byte abyte0[])
    {
        if (abyte0 != null)
        {
            if (abyte0 != _writeEncodingBuffer)
            {
                throw new IllegalArgumentException("Trying to release buffer not owned by the context");
            }
            _writeEncodingBuffer = null;
            _bufferRecycler.releaseByteBuffer(com.fasterxml.jackson.core.util.BufferRecycler.ByteBufferType.WRITE_ENCODING_BUFFER, abyte0);
        }
    }

    public void setEncoding(JsonEncoding jsonencoding)
    {
        _encoding = jsonencoding;
    }
}
