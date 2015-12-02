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
    {
        int j = _surrogate;
        _surrogate = 0;
        if (i < 56320 || i > 57343)
        {
            throw new IOException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(j)).append(", second 0x").append(Integer.toHexString(i)).append("; illegal combination").toString());
        } else
        {
            return (j - 55296 << 10) + 0x10000 + (i - 56320);
        }
    }

    private void throwIllegal(int i)
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
    {
        write(c);
        return this;
    }

    public volatile Appendable append(char c)
    {
        return append(c);
    }

    public void close()
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
            int j1 = l + 1;
            abyte2[l] = (byte)(j >> 6 & 0x3f | 0x80);
            abyte2 = _outBuffer;
            i = j1 + 1;
            abyte2[j1] = (byte)(j & 0x3f | 0x80);
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
    {
        write(s, 0, s.length());
    }

    public void write(String s, int i, int j)
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
        int l = i;
        if (j >= i2) goto _L2; else goto _L1
_L1:
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
            break MISSING_BLOCK_LABEL_525;
        }
        i = l + 1;
        abyte0[l] = (byte)k1;
        l = i2 - j1;
        j = l1 - i;
        if (l > j)
        {
            l = j;
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
        j = k1;
        l = c;
_L10:
        if (l < 2048)
        {
            j1 = i + 1;
            abyte0[i] = (byte)(l >> 6 | 0xc0);
            i = j1 + 1;
            abyte0[j1] = (byte)(l & 0x3f | 0x80);
        } else
        {
label0:
            {
                if (l >= 55296 && l <= 57343)
                {
                    break label0;
                }
                j1 = i + 1;
                abyte0[i] = (byte)(l >> 12 | 0xe0);
                k1 = j1 + 1;
                abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
                i = k1 + 1;
                abyte0[k1] = (byte)(l & 0x3f | 0x80);
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
            _outPtr = i;
            throwIllegal(l);
        }
        _surrogate = l;
        if (j < i2) goto _L9; else goto _L8
_L8:
        l = i;
_L2:
        _outPtr = l;
        return;
_L9:
        l = convertSurrogate(s.charAt(j));
        if (l > 0x10ffff)
        {
            _outPtr = i;
            throwIllegal(l);
        }
        j1 = i + 1;
        abyte0[i] = (byte)(l >> 18 | 0xf0);
        i = j1 + 1;
        abyte0[j1] = (byte)(l >> 12 & 0x3f | 0x80);
        j1 = i + 1;
        abyte0[i] = (byte)(l >> 6 & 0x3f | 0x80);
        i = j1 + 1;
        abyte0[j1] = (byte)(l & 0x3f | 0x80);
        j++;
          goto _L3
        j = j1;
        j1 = k1;
        i = l;
        l = j1;
          goto _L10
    }

    public void write(char ac[])
    {
        write(ac, 0, ac.length);
    }

    public void write(char ac[], int i, int j)
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
        int l = i;
        if (j >= i2) goto _L2; else goto _L1
_L1:
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
            break MISSING_BLOCK_LABEL_515;
        }
        i = l + 1;
        abyte0[l] = (byte)k1;
        l = i2 - j1;
        j = l1 - i;
        if (l > j)
        {
            l = j;
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
        j = k1;
        l = c;
_L10:
        if (l < 2048)
        {
            j1 = i + 1;
            abyte0[i] = (byte)(l >> 6 | 0xc0);
            i = j1 + 1;
            abyte0[j1] = (byte)(l & 0x3f | 0x80);
        } else
        {
label0:
            {
                if (l >= 55296 && l <= 57343)
                {
                    break label0;
                }
                j1 = i + 1;
                abyte0[i] = (byte)(l >> 12 | 0xe0);
                k1 = j1 + 1;
                abyte0[j1] = (byte)(l >> 6 & 0x3f | 0x80);
                i = k1 + 1;
                abyte0[k1] = (byte)(l & 0x3f | 0x80);
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
            _outPtr = i;
            throwIllegal(l);
        }
        _surrogate = l;
        if (j < i2) goto _L9; else goto _L8
_L8:
        l = i;
_L2:
        _outPtr = l;
        return;
_L9:
        l = convertSurrogate(ac[j]);
        if (l > 0x10ffff)
        {
            _outPtr = i;
            throwIllegal(l);
        }
        j1 = i + 1;
        abyte0[i] = (byte)(l >> 18 | 0xf0);
        i = j1 + 1;
        abyte0[j1] = (byte)(l >> 12 & 0x3f | 0x80);
        j1 = i + 1;
        abyte0[i] = (byte)(l >> 6 & 0x3f | 0x80);
        i = j1 + 1;
        abyte0[j1] = (byte)(l & 0x3f | 0x80);
        j++;
          goto _L3
        j = j1;
        j1 = k1;
        i = l;
        l = j1;
          goto _L10
    }
}
