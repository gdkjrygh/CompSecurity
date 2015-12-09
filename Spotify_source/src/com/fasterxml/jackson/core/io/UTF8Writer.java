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

    private final IOContext _context;
    private OutputStream _out;
    private byte _outBuffer[];
    private final int _outBufferEnd;
    private int _outPtr;
    private int _surrogate;

    public UTF8Writer(IOContext iocontext, OutputStream outputstream)
    {
        _surrogate = 0;
        _context = iocontext;
        _out = outputstream;
        _outBuffer = iocontext.allocWriteEncodingBuffer();
        _outBufferEnd = _outBuffer.length - 4;
        _outPtr = 0;
    }

    protected static void illegalSurrogate(int i)
    {
        throw new IOException(illegalSurrogateDesc(i));
    }

    protected static String illegalSurrogateDesc(int i)
    {
        if (i > 0x10ffff)
        {
            return (new StringBuilder("Illegal character point (0x")).append(Integer.toHexString(i)).append(") to output; max is 0x10FFFF as per RFC 4627").toString();
        }
        if (i >= 55296)
        {
            if (i <= 56319)
            {
                return (new StringBuilder("Unmatched first part of surrogate pair (0x")).append(Integer.toHexString(i)).append(")").toString();
            } else
            {
                return (new StringBuilder("Unmatched second part of surrogate pair (0x")).append(Integer.toHexString(i)).append(")").toString();
            }
        } else
        {
            return (new StringBuilder("Illegal character point (0x")).append(Integer.toHexString(i)).append(") to output").toString();
        }
    }

    public final Writer append(char c)
    {
        write(c);
        return this;
    }

    public final volatile Appendable append(char c)
    {
        return append(c);
    }

    public final void close()
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
                illegalSurrogate(i);
            }
        }
    }

    protected final int convertSurrogate(int i)
    {
        int j = _surrogate;
        _surrogate = 0;
        if (i < 56320 || i > 57343)
        {
            throw new IOException((new StringBuilder("Broken surrogate pair: first char 0x")).append(Integer.toHexString(j)).append(", second 0x").append(Integer.toHexString(i)).append("; illegal combination").toString());
        } else
        {
            return (j - 55296 << 10) + 0x10000 + (i - 56320);
        }
    }

    public final void flush()
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

    public final void write(int i)
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
                        illegalSurrogate(i);
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
                illegalSurrogate(j);
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

    public final void write(String s)
    {
        write(s, 0, s.length());
    }

    public final void write(String s, int i, int j)
    {
        if (j < 2)
        {
            if (j == 1)
            {
                write(s.charAt(i));
            }
            return;
        }
        int k = i;
        int l = j;
        if (_surrogate > 0)
        {
            k = s.charAt(i);
            l = j - 1;
            write(convertSurrogate(k));
            k = i + 1;
        }
        i = _outPtr;
        byte abyte0[] = _outBuffer;
        int k1 = _outBufferEnd;
        int l1 = l + k;
        j = k;
label0:
        do
        {
            k = i;
            if (j >= l1)
            {
                break;
            }
            k = i;
            if (i >= k1)
            {
                _out.write(abyte0, 0, i);
                k = 0;
            }
            int i1 = j + 1;
            char c = s.charAt(j);
            j = k;
            int j1 = c;
            i = i1;
            if (c < '\200')
            {
                i = k + 1;
                abyte0[k] = (byte)c;
                k = l1 - i1;
                j = k1 - i;
                if (k > j)
                {
                    k = j;
                }
                j = i1;
                do
                {
                    if (j >= k + i1)
                    {
                        continue label0;
                    }
                    j1 = j + 1;
                    c = s.charAt(j);
                    if (c >= '\200')
                    {
                        break;
                    }
                    abyte0[i] = (byte)c;
                    i++;
                    j = j1;
                } while (true);
                j = i;
                k = c;
                i = j1;
                j1 = k;
            }
            if (j1 < 2048)
            {
                i1 = j + 1;
                abyte0[j] = (byte)(j1 >> 6 | 0xc0);
                k = i1 + 1;
                abyte0[i1] = (byte)(j1 & 0x3f | 0x80);
                j = i;
                i = k;
                continue;
            }
            if (j1 < 55296 || j1 > 57343)
            {
                k = j + 1;
                abyte0[j] = (byte)(j1 >> 12 | 0xe0);
                j = k + 1;
                abyte0[k] = (byte)(j1 >> 6 & 0x3f | 0x80);
                k = j + 1;
                abyte0[j] = (byte)(j1 & 0x3f | 0x80);
                j = i;
                i = k;
                continue;
            }
            if (j1 > 56319)
            {
                _outPtr = j;
                illegalSurrogate(j1);
            }
            _surrogate = j1;
            k = j;
            if (i >= l1)
            {
                break;
            }
            k = i + 1;
            i1 = convertSurrogate(s.charAt(i));
            if (i1 > 0x10ffff)
            {
                _outPtr = j;
                illegalSurrogate(i1);
            }
            i = j + 1;
            abyte0[j] = (byte)(i1 >> 18 | 0xf0);
            j = i + 1;
            abyte0[i] = (byte)(i1 >> 12 & 0x3f | 0x80);
            j1 = j + 1;
            abyte0[j] = (byte)(i1 >> 6 & 0x3f | 0x80);
            i = j1 + 1;
            abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
            j = k;
        } while (true);
        _outPtr = k;
    }

    public final void write(char ac[])
    {
        write(ac, 0, ac.length);
    }

    public final void write(char ac[], int i, int j)
    {
        if (j < 2)
        {
            if (j == 1)
            {
                write(ac[i]);
            }
            return;
        }
        int k = i;
        int l = j;
        if (_surrogate > 0)
        {
            k = ac[i];
            l = j - 1;
            write(convertSurrogate(k));
            k = i + 1;
        }
        i = _outPtr;
        byte abyte0[] = _outBuffer;
        int k1 = _outBufferEnd;
        int l1 = l + k;
        j = k;
label0:
        do
        {
            k = i;
            if (j >= l1)
            {
                break;
            }
            k = i;
            if (i >= k1)
            {
                _out.write(abyte0, 0, i);
                k = 0;
            }
            int i1 = j + 1;
            char c = ac[j];
            j = k;
            int j1 = c;
            i = i1;
            if (c < '\200')
            {
                i = k + 1;
                abyte0[k] = (byte)c;
                k = l1 - i1;
                j = k1 - i;
                if (k > j)
                {
                    k = j;
                }
                j = i1;
                do
                {
                    if (j >= k + i1)
                    {
                        continue label0;
                    }
                    j1 = j + 1;
                    c = ac[j];
                    if (c >= '\200')
                    {
                        break;
                    }
                    abyte0[i] = (byte)c;
                    i++;
                    j = j1;
                } while (true);
                j = i;
                k = c;
                i = j1;
                j1 = k;
            }
            if (j1 < 2048)
            {
                i1 = j + 1;
                abyte0[j] = (byte)(j1 >> 6 | 0xc0);
                k = i1 + 1;
                abyte0[i1] = (byte)(j1 & 0x3f | 0x80);
                j = i;
                i = k;
                continue;
            }
            if (j1 < 55296 || j1 > 57343)
            {
                k = j + 1;
                abyte0[j] = (byte)(j1 >> 12 | 0xe0);
                j = k + 1;
                abyte0[k] = (byte)(j1 >> 6 & 0x3f | 0x80);
                k = j + 1;
                abyte0[j] = (byte)(j1 & 0x3f | 0x80);
                j = i;
                i = k;
                continue;
            }
            if (j1 > 56319)
            {
                _outPtr = j;
                illegalSurrogate(j1);
            }
            _surrogate = j1;
            k = j;
            if (i >= l1)
            {
                break;
            }
            k = i + 1;
            i1 = convertSurrogate(ac[i]);
            if (i1 > 0x10ffff)
            {
                _outPtr = j;
                illegalSurrogate(i1);
            }
            i = j + 1;
            abyte0[j] = (byte)(i1 >> 18 | 0xf0);
            j = i + 1;
            abyte0[i] = (byte)(i1 >> 12 & 0x3f | 0x80);
            j1 = j + 1;
            abyte0[j] = (byte)(i1 >> 6 & 0x3f | 0x80);
            i = j1 + 1;
            abyte0[j1] = (byte)(i1 & 0x3f | 0x80);
            j = k;
        } while (true);
        _outPtr = k;
    }
}
