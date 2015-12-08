// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            IOContext

public final class UTF8Writer extends Writer
{

    static final int SURR1_FIRST = 55296;
    static final int SURR1_LAST = 56319;
    static final int SURR2_FIRST = 56320;
    static final int SURR2_LAST = 57343;
    protected final IOContext _context;
    OutputStream _out;
    byte _outBuffer[];
    final int _outBufferEnd;
    int _outPtr;
    int _surrogate;

    public UTF8Writer(IOContext iocontext, OutputStream outputstream)
    {
        _surrogate = 0;
        _context = iocontext;
        _out = outputstream;
        _outBuffer = iocontext.allocWriteEncodingBuffer();
        _outBufferEnd = _outBuffer.length - 4;
        _outPtr = 0;
    }

    private int convertSurrogate(int i)
        throws IOException
    {
        int j = _surrogate;
        _surrogate = 0;
        if (i < 56320 || i > 57343)
        {
            throw new IOException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(j)).append(", second 0x").append(Integer.toHexString(i)).append("; illegal combination").toString());
        } else
        {
            return 0x10000 + (j - 55296 << 10) + (i - 56320);
        }
    }

    private void throwIllegal(int i)
        throws IOException
    {
        if (i > 0x10ffff)
        {
            throw new IOException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output; max is 0x10FFFF as per RFC 4627").toString());
        }
        if (i >= 55296)
        {
            if (i <= 56319)
            {
                throw new IOException((new StringBuilder()).append("Unmatched first part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            } else
            {
                throw new IOException((new StringBuilder()).append("Unmatched second part of surrogate pair (0x").append(Integer.toHexString(i)).append(")").toString());
            }
        } else
        {
            throw new IOException((new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(i)).append(") to output").toString());
        }
    }

    public Writer append(char c)
        throws IOException
    {
        write(c);
        return this;
    }

    public volatile Appendable append(char c)
        throws IOException
    {
        return append(c);
    }

    public void close()
        throws IOException
    {
        if (_out != null)
        {
            if (_outPtr > 0)
            {
                _out.write(_outBuffer, 0, _outPtr);
                _outPtr = 0;
            }
            OutputStream outputstream = _out;
            _out = null;
            byte abyte0[] = _outBuffer;
            if (abyte0 != null)
            {
                _outBuffer = null;
                _context.releaseWriteEncodingBuffer(abyte0);
            }
            outputstream.close();
            int i = _surrogate;
            _surrogate = 0;
            if (i > 0)
            {
                throwIllegal(i);
            }
        }
    }

    public void flush()
        throws IOException
    {
        if (_out != null)
        {
            if (_outPtr > 0)
            {
                _out.write(_outBuffer, 0, _outPtr);
                _outPtr = 0;
            }
            _out.flush();
        }
    }

    public void write(int i)
        throws IOException
    {
        int j;
        if (_surrogate > 0)
        {
            j = convertSurrogate(i);
        } else
        {
            j = i;
            if (i >= 55296)
            {
                j = i;
                if (i <= 57343)
                {
                    if (i > 56319)
                    {
                        throwIllegal(i);
                    }
                    _surrogate = i;
                    return;
                }
            }
        }
        if (_outPtr >= _outBufferEnd)
        {
            _out.write(_outBuffer, 0, _outPtr);
            _outPtr = 0;
        }
        if (j < 128)
        {
            byte abyte0[] = _outBuffer;
            i = _outPtr;
            _outPtr = i + 1;
            abyte0[i] = (byte)j;
            return;
        }
        i = _outPtr;
        if (j < 2048)
        {
            byte abyte1[] = _outBuffer;
            int k = i + 1;
            abyte1[i] = (byte)(j >> 6 | 0xc0);
            abyte1 = _outBuffer;
            i = k + 1;
            abyte1[k] = (byte)(j & 0x3f | 0x80);
        } else
        if (j <= 65535)
        {
            byte abyte2[] = _outBuffer;
            int l = i + 1;
            abyte2[i] = (byte)(j >> 12 | 0xe0);
            abyte2 = _outBuffer;
            i = l + 1;
            abyte2[l] = (byte)(j >> 6 & 0x3f | 0x80);
            _outBuffer[i] = (byte)(j & 0x3f | 0x80);
            i++;
        } else
        {
            if (j > 0x10ffff)
            {
                throwIllegal(j);
            }
            byte abyte3[] = _outBuffer;
            int i1 = i + 1;
            abyte3[i] = (byte)(j >> 18 | 0xf0);
            abyte3 = _outBuffer;
            i = i1 + 1;
            abyte3[i1] = (byte)(j >> 12 & 0x3f | 0x80);
            abyte3 = _outBuffer;
            i1 = i + 1;
            abyte3[i] = (byte)(j >> 6 & 0x3f | 0x80);
            abyte3 = _outBuffer;
            i = i1 + 1;
            abyte3[i1] = (byte)(j & 0x3f | 0x80);
        }
        _outPtr = i;
    }

    public void write(String s)
        throws IOException
    {
        write(s, 0, s.length());
    }

    public void write(String s, int i, int j)
        throws IOException
    {
        byte abyte0[];
        int l1;
        int i2;
        if (j < 2)
        {
            if (j == 1)
            {
                write(s.charAt(i));
            }
            return;
        }
        int k = i;
        int i1 = j;
        if (_surrogate > 0)
        {
            k = s.charAt(i);
            i1 = j - 1;
            write(convertSurrogate(k));
            k = i + 1;
        }
        i = _outPtr;
        abyte0 = _outBuffer;
        l1 = _outBufferEnd;
        i2 = i1 + k;
        j = k;
_L3:
        if (j >= i2) goto _L2; else goto _L1
_L1:
        int l;
        int j1;
        int k1;
        l = i;
        if (i >= l1)
        {
            _out.write(abyte0, 0, i);
            l = 0;
        }
        j1 = j + 1;
        k1 = s.charAt(j);
        if (k1 >= 128)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        i = l + 1;
        abyte0[l] = (byte)k1;
        j = i2 - j1;
        k1 = l1 - i;
        l = j;
        if (j > k1)
        {
            l = k1;
        }
        j = j1;
_L7:
        if (j < l + j1) goto _L4; else goto _L3
_L4:
        char c;
        k1 = j + 1;
        c = s.charAt(j);
        if (c < '\200') goto _L6; else goto _L5
_L5:
        j = i;
        i = k1;
        l = c;
_L10:
        if (l < 2048)
        {
            j1 = j + 1;
            abyte0[j] = (byte)(l >> 6 | 0xc0);
            abyte0[j1] = (byte)(l & 0x3f | 0x80);
            l = j1 + 1;
            j = i;
            i = l;
        } else
        {
label0:
            {
                if (l >= 55296 && l <= 57343)
                {
                    break label0;
                }
                j1 = j + 1;
                abyte0[j] = (byte)(l >> 12 | 0xe0);
                j = j1 + 1;
                abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
                j1 = j + 1;
                abyte0[j] = (byte)(l & 0x3f | 0x80);
                j = i;
                i = j1;
            }
        }
          goto _L3
_L6:
        abyte0[i] = (byte)c;
        i++;
        j = k1;
          goto _L7
        if (l > 56319)
        {
            _outPtr = j;
            throwIllegal(l);
        }
        _surrogate = l;
        if (i < i2) goto _L9; else goto _L8
_L8:
        i = j;
_L2:
        _outPtr = i;
        return;
_L9:
        l = i + 1;
        i = convertSurrogate(s.charAt(i));
        if (i > 0x10ffff)
        {
            _outPtr = j;
            throwIllegal(i);
        }
        j1 = j + 1;
        abyte0[j] = (byte)(i >> 18 | 0xf0);
        j = j1 + 1;
        abyte0[j1] = (byte)(i >> 12 & 0x3f | 0x80);
        j1 = j + 1;
        abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
        abyte0[j1] = (byte)(i & 0x3f | 0x80);
        i = j1 + 1;
        j = l;
          goto _L3
        j = l;
        i = j1;
        l = k1;
          goto _L10
    }

    public void write(char ac[])
        throws IOException
    {
        write(ac, 0, ac.length);
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        byte abyte0[];
        int l1;
        int i2;
        if (j < 2)
        {
            if (j == 1)
            {
                write(ac[i]);
            }
            return;
        }
        int k = i;
        int i1 = j;
        if (_surrogate > 0)
        {
            k = ac[i];
            i1 = j - 1;
            write(convertSurrogate(k));
            k = i + 1;
        }
        i = _outPtr;
        abyte0 = _outBuffer;
        l1 = _outBufferEnd;
        i2 = i1 + k;
        j = k;
_L3:
        if (j >= i2) goto _L2; else goto _L1
_L1:
        int l;
        int j1;
        int k1;
        l = i;
        if (i >= l1)
        {
            _out.write(abyte0, 0, i);
            l = 0;
        }
        j1 = j + 1;
        k1 = ac[j];
        if (k1 >= 128)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        i = l + 1;
        abyte0[l] = (byte)k1;
        j = i2 - j1;
        k1 = l1 - i;
        l = j;
        if (j > k1)
        {
            l = k1;
        }
        j = j1;
_L7:
        if (j < l + j1) goto _L4; else goto _L3
_L4:
        char c;
        k1 = j + 1;
        c = ac[j];
        if (c < '\200') goto _L6; else goto _L5
_L5:
        j = i;
        i = k1;
        l = c;
_L10:
        if (l < 2048)
        {
            j1 = j + 1;
            abyte0[j] = (byte)(l >> 6 | 0xc0);
            abyte0[j1] = (byte)(l & 0x3f | 0x80);
            l = j1 + 1;
            j = i;
            i = l;
        } else
        {
label0:
            {
                if (l >= 55296 && l <= 57343)
                {
                    break label0;
                }
                j1 = j + 1;
                abyte0[j] = (byte)(l >> 12 | 0xe0);
                j = j1 + 1;
                abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
                j1 = j + 1;
                abyte0[j] = (byte)(l & 0x3f | 0x80);
                j = i;
                i = j1;
            }
        }
          goto _L3
_L6:
        abyte0[i] = (byte)c;
        i++;
        j = k1;
          goto _L7
        if (l > 56319)
        {
            _outPtr = j;
            throwIllegal(l);
        }
        _surrogate = l;
        if (i < i2) goto _L9; else goto _L8
_L8:
        i = j;
_L2:
        _outPtr = i;
        return;
_L9:
        l = i + 1;
        i = convertSurrogate(ac[i]);
        if (i > 0x10ffff)
        {
            _outPtr = j;
            throwIllegal(i);
        }
        j1 = j + 1;
        abyte0[j] = (byte)(i >> 18 | 0xf0);
        j = j1 + 1;
        abyte0[j1] = (byte)(i >> 12 & 0x3f | 0x80);
        j1 = j + 1;
        abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
        abyte0[j1] = (byte)(i & 0x3f | 0x80);
        i = j1 + 1;
        j = l;
          goto _L3
        j = l;
        i = j1;
        l = k1;
          goto _L10
    }
}
