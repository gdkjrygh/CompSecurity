// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

public final class MergedStream extends InputStream
{

    private byte _b[];
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iocontext, InputStream inputstream, byte abyte0[], int i, int j)
    {
        _ctxt = iocontext;
        _in = inputstream;
        _b = abyte0;
        _ptr = i;
        _end = j;
    }

    private void _free()
    {
        byte abyte0[] = _b;
        if (abyte0 != null)
        {
            _b = null;
            if (_ctxt != null)
            {
                _ctxt.releaseReadIOBuffer(abyte0);
            }
        }
    }

    public final int available()
    {
        if (_b != null)
        {
            return _end - _ptr;
        } else
        {
            return _in.available();
        }
    }

    public final void close()
    {
        _free();
        _in.close();
    }

    public final void mark(int i)
    {
        if (_b == null)
        {
            _in.mark(i);
        }
    }

    public final boolean markSupported()
    {
        return _b == null && _in.markSupported();
    }

    public final int read()
    {
        if (_b != null)
        {
            byte abyte0[] = _b;
            int i = _ptr;
            _ptr = i + 1;
            i = abyte0[i];
            if (_ptr >= _end)
            {
                _free();
            }
            return i & 0xff;
        } else
        {
            return _in.read();
        }
    }

    public final int read(byte abyte0[])
    {
        return read(abyte0, 0, abyte0.length);
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (_b != null)
        {
            int l = _end - _ptr;
            int k = j;
            if (j > l)
            {
                k = l;
            }
            System.arraycopy(_b, _ptr, abyte0, i, k);
            _ptr = _ptr + k;
            if (_ptr >= _end)
            {
                _free();
            }
            return k;
        } else
        {
            return _in.read(abyte0, i, j);
        }
    }

    public final void reset()
    {
        if (_b == null)
        {
            _in.reset();
        }
    }

    public final long skip(long l)
    {
        long l1;
        long l2;
        if (_b != null)
        {
            int i = _end - _ptr;
            if ((long)i > l)
            {
                _ptr = _ptr + (int)l;
                return l;
            }
            _free();
            l1 = (long)i + 0L;
            l -= i;
        } else
        {
            l1 = 0L;
        }
        l2 = l1;
        if (l > 0L)
        {
            l2 = l1 + _in.skip(l);
        }
        return l2;
    }
}
