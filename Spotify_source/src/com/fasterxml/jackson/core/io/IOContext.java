// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;

public class IOContext
{

    protected byte _base64Buffer[];
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
        _base64Buffer = null;
        _tokenCBuffer = null;
        _concatCBuffer = null;
        _nameCopyBuffer = null;
        _bufferRecycler = bufferrecycler;
        _sourceRef = obj;
        _managedResource = flag;
    }

    private IllegalArgumentException wrongBuf()
    {
        return new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    protected final void _verifyAlloc(Object obj)
    {
        if (obj != null)
        {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        } else
        {
            return;
        }
    }

    protected final void _verifyRelease(byte abyte0[], byte abyte1[])
    {
        if (abyte0 != abyte1 && abyte0.length <= abyte1.length)
        {
            throw wrongBuf();
        } else
        {
            return;
        }
    }

    protected final void _verifyRelease(char ac[], char ac1[])
    {
        if (ac != ac1 && ac.length <= ac1.length)
        {
            throw wrongBuf();
        } else
        {
            return;
        }
    }

    public byte[] allocBase64Buffer()
    {
        _verifyAlloc(_base64Buffer);
        byte abyte0[] = _bufferRecycler.allocByteBuffer(3);
        _base64Buffer = abyte0;
        return abyte0;
    }

    public char[] allocConcatBuffer()
    {
        _verifyAlloc(_concatCBuffer);
        char ac[] = _bufferRecycler.allocCharBuffer(1);
        _concatCBuffer = ac;
        return ac;
    }

    public char[] allocNameCopyBuffer(int i)
    {
        _verifyAlloc(_nameCopyBuffer);
        char ac[] = _bufferRecycler.allocCharBuffer(3, i);
        _nameCopyBuffer = ac;
        return ac;
    }

    public byte[] allocReadIOBuffer()
    {
        _verifyAlloc(_readIOBuffer);
        byte abyte0[] = _bufferRecycler.allocByteBuffer(0);
        _readIOBuffer = abyte0;
        return abyte0;
    }

    public char[] allocTokenBuffer()
    {
        _verifyAlloc(_tokenCBuffer);
        char ac[] = _bufferRecycler.allocCharBuffer(0);
        _tokenCBuffer = ac;
        return ac;
    }

    public char[] allocTokenBuffer(int i)
    {
        _verifyAlloc(_tokenCBuffer);
        char ac[] = _bufferRecycler.allocCharBuffer(0, i);
        _tokenCBuffer = ac;
        return ac;
    }

    public byte[] allocWriteEncodingBuffer()
    {
        _verifyAlloc(_writeEncodingBuffer);
        byte abyte0[] = _bufferRecycler.allocByteBuffer(1);
        _writeEncodingBuffer = abyte0;
        return abyte0;
    }

    public TextBuffer constructTextBuffer()
    {
        return new TextBuffer(_bufferRecycler);
    }

    public JsonEncoding getEncoding()
    {
        return _encoding;
    }

    public Object getSourceReference()
    {
        return _sourceRef;
    }

    public boolean isResourceManaged()
    {
        return _managedResource;
    }

    public void releaseBase64Buffer(byte abyte0[])
    {
        if (abyte0 != null)
        {
            _verifyRelease(abyte0, _base64Buffer);
            _base64Buffer = null;
            _bufferRecycler.releaseByteBuffer(3, abyte0);
        }
    }

    public void releaseConcatBuffer(char ac[])
    {
        if (ac != null)
        {
            _verifyRelease(ac, _concatCBuffer);
            _concatCBuffer = null;
            _bufferRecycler.releaseCharBuffer(1, ac);
        }
    }

    public void releaseNameCopyBuffer(char ac[])
    {
        if (ac != null)
        {
            _verifyRelease(ac, _nameCopyBuffer);
            _nameCopyBuffer = null;
            _bufferRecycler.releaseCharBuffer(3, ac);
        }
    }

    public void releaseReadIOBuffer(byte abyte0[])
    {
        if (abyte0 != null)
        {
            _verifyRelease(abyte0, _readIOBuffer);
            _readIOBuffer = null;
            _bufferRecycler.releaseByteBuffer(0, abyte0);
        }
    }

    public void releaseTokenBuffer(char ac[])
    {
        if (ac != null)
        {
            _verifyRelease(ac, _tokenCBuffer);
            _tokenCBuffer = null;
            _bufferRecycler.releaseCharBuffer(0, ac);
        }
    }

    public void releaseWriteEncodingBuffer(byte abyte0[])
    {
        if (abyte0 != null)
        {
            _verifyRelease(abyte0, _writeEncodingBuffer);
            _writeEncodingBuffer = null;
            _bufferRecycler.releaseByteBuffer(1, abyte0);
        }
    }

    public void setEncoding(JsonEncoding jsonencoding)
    {
        _encoding = jsonencoding;
    }
}
