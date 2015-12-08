// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

abstract class BaseReader extends Reader
{

    protected static final int LAST_VALID_UNICODE_CHAR = 0x10ffff;
    protected static final char NULL_BYTE = 0;
    protected static final char NULL_CHAR = 0;
    protected byte _buffer[];
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected int _ptr;
    protected char _tmpBuf[];

    protected BaseReader(IOContext iocontext, InputStream inputstream, byte abyte0[], int i, int j)
    {
        _tmpBuf = null;
        _context = iocontext;
        _in = inputstream;
        _buffer = abyte0;
        _ptr = i;
        _length = j;
    }

    public void close()
        throws IOException
    {
        InputStream inputstream = _in;
        if (inputstream != null)
        {
            _in = null;
            freeBuffers();
            inputstream.close();
        }
    }

    public final void freeBuffers()
    {
        byte abyte0[] = _buffer;
        if (abyte0 != null)
        {
            _buffer = null;
            _context.releaseReadIOBuffer(abyte0);
        }
    }

    public int read()
        throws IOException
    {
        if (_tmpBuf == null)
        {
            _tmpBuf = new char[1];
        }
        if (read(_tmpBuf, 0, 1) < 1)
        {
            return -1;
        } else
        {
            return _tmpBuf[0];
        }
    }

    protected void reportBounds(char ac[], int i, int j)
        throws IOException
    {
        throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("read(buf,").append(i).append(",").append(j).append("), cbuf[").append(ac.length).append("]").toString());
    }

    protected void reportStrangeStream()
        throws IOException
    {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
