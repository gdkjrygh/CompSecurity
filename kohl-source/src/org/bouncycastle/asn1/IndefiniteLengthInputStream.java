// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            LimitedInputStream

class IndefiniteLengthInputStream extends LimitedInputStream
{

    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    IndefiniteLengthInputStream(InputStream inputstream, int i)
        throws IOException
    {
        super(inputstream, i);
        _eofReached = false;
        _eofOn00 = true;
        _b1 = inputstream.read();
        _b2 = inputstream.read();
        if (_b2 < 0)
        {
            throw new EOFException();
        } else
        {
            checkForEof();
            return;
        }
    }

    private boolean checkForEof()
    {
        if (!_eofReached && _eofOn00 && _b1 == 0 && _b2 == 0)
        {
            _eofReached = true;
            setParentEofDetect(true);
        }
        return _eofReached;
    }

    public int read()
        throws IOException
    {
        if (checkForEof())
        {
            return -1;
        }
        int i = _in.read();
        if (i < 0)
        {
            throw new EOFException();
        } else
        {
            int j = _b1;
            _b1 = _b2;
            _b2 = i;
            return j;
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (_eofOn00 || j < 3)
        {
            return super.read(abyte0, i, j);
        }
        if (_eofReached)
        {
            return -1;
        }
        j = _in.read(abyte0, i + 2, j - 2);
        if (j < 0)
        {
            throw new EOFException();
        }
        abyte0[i] = (byte)_b1;
        abyte0[i + 1] = (byte)_b2;
        _b1 = _in.read();
        _b2 = _in.read();
        if (_b2 < 0)
        {
            throw new EOFException();
        } else
        {
            return j + 2;
        }
    }

    void setEofOn00(boolean flag)
    {
        _eofOn00 = flag;
        checkForEof();
    }
}
