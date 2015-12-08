// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.core.format:
//            InputAccessor, DataFormatMatcher, MatchStrength

public static class _bufferedEnd
    implements InputAccessor
{

    protected final byte _buffer[];
    protected int _bufferedEnd;
    protected final int _bufferedStart;
    protected final InputStream _in;
    protected int _ptr;

    public DataFormatMatcher createMatcher(JsonFactory jsonfactory, MatchStrength matchstrength)
    {
        return new DataFormatMatcher(_in, _buffer, _bufferedStart, _bufferedEnd - _bufferedStart, jsonfactory, matchstrength);
    }

    public boolean hasMoreBytes()
        throws IOException
    {
        if (_ptr < _bufferedEnd)
        {
            return true;
        }
        if (_in == null)
        {
            return false;
        }
        int i = _buffer.length - _ptr;
        if (i < 1)
        {
            return false;
        }
        i = _in.read(_buffer, _ptr, i);
        if (i <= 0)
        {
            return false;
        } else
        {
            _bufferedEnd = _bufferedEnd + i;
            return true;
        }
    }

    public byte nextByte()
        throws IOException
    {
        if (_ptr >= _bufferedEnd && !hasMoreBytes())
        {
            throw new EOFException((new StringBuilder()).append("Failed auto-detect: could not read more than ").append(_ptr).append(" bytes (max buffer size: ").append(_buffer.length).append(")").toString());
        } else
        {
            byte abyte0[] = _buffer;
            int i = _ptr;
            _ptr = i + 1;
            return abyte0[i];
        }
    }

    public void reset()
    {
        _ptr = _bufferedStart;
    }

    public _cls9(InputStream inputstream, byte abyte0[])
    {
        _in = inputstream;
        _buffer = abyte0;
        _bufferedStart = 0;
        _ptr = 0;
        _bufferedEnd = 0;
    }

    public _bufferedEnd(byte abyte0[])
    {
        _in = null;
        _buffer = abyte0;
        _bufferedStart = 0;
        _bufferedEnd = abyte0.length;
    }

    public _bufferedEnd(byte abyte0[], int i, int j)
    {
        _in = null;
        _buffer = abyte0;
        _ptr = i;
        _bufferedStart = i;
        _bufferedEnd = i + j;
    }
}
