// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonWriteContext

public class UTF8JsonGenerator extends GeneratorBase
{

    private static final byte BYTE_0 = 48;
    private static final byte BYTE_BACKSLASH = 92;
    private static final byte BYTE_COLON = 58;
    private static final byte BYTE_COMMA = 44;
    private static final byte BYTE_LBRACKET = 91;
    private static final byte BYTE_LCURLY = 123;
    private static final byte BYTE_QUOTE = 34;
    private static final byte BYTE_RBRACKET = 93;
    private static final byte BYTE_RCURLY = 125;
    private static final byte BYTE_SPACE = 32;
    private static final byte BYTE_u = 117;
    private static final byte FALSE_BYTES[] = {
        102, 97, 108, 115, 101
    };
    static final byte HEX_CHARS[] = CharTypes.copyHexBytes();
    private static final int MAX_BYTES_TO_BUFFER = 512;
    private static final byte NULL_BYTES[] = {
        110, 117, 108, 108
    };
    protected static final int SURR1_FIRST = 55296;
    protected static final int SURR1_LAST = 56319;
    protected static final int SURR2_FIRST = 56320;
    protected static final int SURR2_LAST = 57343;
    private static final byte TRUE_BYTES[] = {
        116, 114, 117, 101
    };
    protected static final int sOutputEscapes[] = CharTypes.get7BitOutputEscapes();
    protected boolean _bufferRecyclable;
    protected char _charBuffer[];
    protected final int _charBufferLength;
    protected CharacterEscapes _characterEscapes;
    protected byte _entityBuffer[];
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected byte _outputBuffer[];
    protected final int _outputEnd;
    protected int _outputEscapes[];
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;

    public UTF8JsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, OutputStream outputstream)
    {
        super(i, objectcodec);
        _outputEscapes = sOutputEscapes;
        _outputTail = 0;
        _ioContext = iocontext;
        _outputStream = outputstream;
        _bufferRecyclable = true;
        _outputBuffer = iocontext.allocWriteEncodingBuffer();
        _outputEnd = _outputBuffer.length;
        _outputMaxContiguous = _outputEnd >> 3;
        _charBuffer = iocontext.allocConcatBuffer();
        _charBufferLength = _charBuffer.length;
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
        {
            setHighestNonEscapedChar(127);
        }
    }

    public UTF8JsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, OutputStream outputstream, byte abyte0[], int j, boolean flag)
    {
        super(i, objectcodec);
        _outputEscapes = sOutputEscapes;
        _outputTail = 0;
        _ioContext = iocontext;
        _outputStream = outputstream;
        _bufferRecyclable = flag;
        _outputTail = j;
        _outputBuffer = abyte0;
        _outputEnd = _outputBuffer.length;
        _outputMaxContiguous = _outputEnd >> 3;
        _charBuffer = iocontext.allocConcatBuffer();
        _charBufferLength = _charBuffer.length;
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
        {
            setHighestNonEscapedChar(127);
        }
    }

    private int _handleLongCustomEscape(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int i1 = abyte1.length;
        if (i + i1 <= j) goto _L2; else goto _L1
_L1:
        int l;
        _outputTail = i;
        _flushBuffer();
        l = _outputTail;
        if (i1 <= abyte0.length) goto _L4; else goto _L3
_L3:
        _outputStream.write(abyte1, 0, i1);
_L6:
        return l;
_L4:
        System.arraycopy(abyte1, 0, abyte0, l, i1);
        i = l + i1;
_L2:
        l = i;
        if (k * 6 + i > j)
        {
            _flushBuffer();
            return _outputTail;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private final int _outputMultiByteChar(int i, int j)
    {
        byte abyte0[] = _outputBuffer;
        if (i >= 55296 && i <= 57343)
        {
            int k = j + 1;
            abyte0[j] = 92;
            j = k + 1;
            abyte0[k] = 117;
            k = j + 1;
            abyte0[j] = HEX_CHARS[i >> 12 & 0xf];
            j = k + 1;
            abyte0[k] = HEX_CHARS[i >> 8 & 0xf];
            k = j + 1;
            abyte0[j] = HEX_CHARS[i >> 4 & 0xf];
            abyte0[k] = HEX_CHARS[i & 0xf];
            return k + 1;
        } else
        {
            int l = j + 1;
            abyte0[j] = (byte)(i >> 12 | 0xe0);
            j = l + 1;
            abyte0[l] = (byte)(i >> 6 & 0x3f | 0x80);
            abyte0[j] = (byte)(i & 0x3f | 0x80);
            return j + 1;
        }
    }

    private final int _outputRawMultiByteChar(int i, char ac[], int j, int k)
    {
        if (i >= 55296 && i <= 57343)
        {
            if (j >= k)
            {
                _reportError("Split surrogate on writeRaw() input (last character)");
            }
            _outputSurrogates(i, ac[j]);
            return j + 1;
        } else
        {
            ac = _outputBuffer;
            k = _outputTail;
            _outputTail = k + 1;
            ac[k] = (byte)(i >> 12 | 0xe0);
            k = _outputTail;
            _outputTail = k + 1;
            ac[k] = (byte)(i >> 6 & 0x3f | 0x80);
            k = _outputTail;
            _outputTail = k + 1;
            ac[k] = (byte)(i & 0x3f | 0x80);
            return j;
        }
    }

    private final void _writeBytes(byte abyte0[])
    {
        int i = abyte0.length;
        if (_outputTail + i > _outputEnd)
        {
            _flushBuffer();
            if (i > 512)
            {
                _outputStream.write(abyte0, 0, i);
                return;
            }
        }
        System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
        _outputTail = i + _outputTail;
    }

    private final void _writeBytes(byte abyte0[], int i, int j)
    {
        if (_outputTail + j > _outputEnd)
        {
            _flushBuffer();
            if (j > 512)
            {
                _outputStream.write(abyte0, i, j);
                return;
            }
        }
        System.arraycopy(abyte0, i, _outputBuffer, _outputTail, j);
        _outputTail = _outputTail + j;
    }

    private int _writeCustomEscape(byte abyte0[], int i, SerializableString serializablestring, int j)
    {
        serializablestring = serializablestring.asUnquotedUTF8();
        int k = serializablestring.length;
        if (k > 6)
        {
            return _handleLongCustomEscape(abyte0, i, _outputEnd, serializablestring, j);
        } else
        {
            System.arraycopy(serializablestring, 0, abyte0, i, k);
            return k + i;
        }
    }

    private final void _writeCustomStringSegment2(char ac[], int i, int j)
    {
        if (_outputTail + (j - i) * 6 > _outputEnd)
        {
            _flushBuffer();
        }
        int l = _outputTail;
        byte abyte0[] = _outputBuffer;
        int ai[] = _outputEscapes;
        CharacterEscapes characterescapes;
        int k;
        int j1;
        if (_maximumNonEscapedChar <= 0)
        {
            j1 = 65535;
        } else
        {
            j1 = _maximumNonEscapedChar;
        }
        characterescapes = _characterEscapes;
        k = i;
        i = l;
        while (k < j) 
        {
            int i1 = k + 1;
            k = ac[k];
            if (k <= '\177')
            {
                if (ai[k] == 0)
                {
                    abyte0[i] = (byte)k;
                    i++;
                    k = i1;
                } else
                {
                    int k1 = ai[k];
                    if (k1 > 0)
                    {
                        k = i + 1;
                        abyte0[i] = 92;
                        i = k + 1;
                        abyte0[k] = (byte)k1;
                        k = i1;
                    } else
                    if (k1 == -2)
                    {
                        SerializableString serializablestring = characterescapes.getEscapeSequence(k);
                        if (serializablestring == null)
                        {
                            throw new JsonGenerationException((new StringBuilder()).append("Invalid custom escape definitions; custom escape not found for character code 0x").append(Integer.toHexString(k)).append(", although was supposed to have one").toString());
                        }
                        i = _writeCustomEscape(abyte0, i, serializablestring, j - i1);
                        k = i1;
                    } else
                    {
                        i = _writeGenericEscape(k, i);
                        k = i1;
                    }
                }
            } else
            if (k > j1)
            {
                i = _writeGenericEscape(k, i);
                k = i1;
            } else
            {
                SerializableString serializablestring1 = characterescapes.getEscapeSequence(k);
                if (serializablestring1 != null)
                {
                    i = _writeCustomEscape(abyte0, i, serializablestring1, j - i1);
                    k = i1;
                } else
                {
                    if (k <= 2047)
                    {
                        int l1 = i + 1;
                        abyte0[i] = (byte)(k >> 6 | 0xc0);
                        i = l1 + 1;
                        abyte0[l1] = (byte)(k & 0x3f | 0x80);
                    } else
                    {
                        i = _outputMultiByteChar(k, i);
                    }
                    k = i1;
                }
            }
        }
        _outputTail = i;
    }

    private int _writeGenericEscape(int i, int j)
    {
        byte abyte0[] = _outputBuffer;
        int k = j + 1;
        abyte0[j] = 92;
        j = k + 1;
        abyte0[k] = 117;
        if (i > 255)
        {
            k = i >> 8 & 0xff;
            int i1 = j + 1;
            abyte0[j] = HEX_CHARS[k >> 4];
            j = i1 + 1;
            abyte0[i1] = HEX_CHARS[k & 0xf];
            i &= 0xff;
        } else
        {
            int l = j + 1;
            abyte0[j] = 48;
            j = l + 1;
            abyte0[l] = 48;
        }
        k = j + 1;
        abyte0[j] = HEX_CHARS[i >> 4];
        abyte0[k] = HEX_CHARS[i & 0xf];
        return k + 1;
    }

    private final void _writeLongString(String s)
    {
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
        _writeStringSegments(s);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = 34;
    }

    private final void _writeLongString(char ac[], int i, int j)
    {
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        ac = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
        _writeStringSegments(_charBuffer, 0, j);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        ac = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
    }

    private final void _writeNull()
    {
        if (_outputTail + 4 >= _outputEnd)
        {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, _outputBuffer, _outputTail, 4);
        _outputTail = _outputTail + 4;
    }

    private final void _writeQuotedInt(int i)
    {
        if (_outputTail + 13 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = 34;
        _outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
    }

    private final void _writeQuotedLong(long l)
    {
        if (_outputTail + 23 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
        _outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
    }

    private final void _writeQuotedRaw(Object obj)
    {
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
        writeRaw(obj.toString());
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        obj = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        obj[i] = 34;
    }

    private final void _writeSegmentedRaw(char ac[], int i, int j)
    {
        int l = _outputEnd;
        byte abyte0[] = _outputBuffer;
label0:
        do
        {
            if (i < j)
            {
                do
                {
                    int k = ac[i];
                    if (k >= 128)
                    {
                        if (_outputTail + 3 >= _outputEnd)
                        {
                            _flushBuffer();
                        }
                        k = i + 1;
                        i = ac[i];
                        int j1;
                        if (i < 2048)
                        {
                            int i1 = _outputTail;
                            _outputTail = i1 + 1;
                            abyte0[i1] = (byte)(i >> 6 | 0xc0);
                            i1 = _outputTail;
                            _outputTail = i1 + 1;
                            abyte0[i1] = (byte)(i & 0x3f | 0x80);
                        } else
                        {
                            _outputRawMultiByteChar(i, ac, k, j);
                        }
                        i = k;
                        continue label0;
                    }
                    if (_outputTail >= l)
                    {
                        _flushBuffer();
                    }
                    j1 = _outputTail;
                    _outputTail = j1 + 1;
                    abyte0[j1] = (byte)k;
                    k = i + 1;
                    i = k;
                } while (k < j);
            }
            return;
        } while (true);
    }

    private final void _writeStringSegment(char ac[], int i, int j)
    {
        int l = j + i;
        int k = _outputTail;
        byte abyte0[] = _outputBuffer;
        int ai[] = _outputEscapes;
        j = i;
        i = k;
label0:
        do
        {
            char c;
label1:
            {
                if (j < l)
                {
                    c = ac[j];
                    if (c <= '\177' && ai[c] == 0)
                    {
                        break label1;
                    }
                }
                _outputTail = i;
                if (j < l)
                {
                    if (_characterEscapes == null)
                    {
                        break label0;
                    }
                    _writeCustomStringSegment2(ac, j, l);
                }
                return;
            }
            abyte0[i] = (byte)c;
            j++;
            i++;
        } while (true);
        if (_maximumNonEscapedChar == 0)
        {
            _writeStringSegment2(ac, j, l);
            return;
        } else
        {
            _writeStringSegmentASCII2(ac, j, l);
            return;
        }
    }

    private final void _writeStringSegment2(char ac[], int i, int j)
    {
        if (_outputTail + (j - i) * 6 > _outputEnd)
        {
            _flushBuffer();
        }
        int l = _outputTail;
        byte abyte0[] = _outputBuffer;
        int ai[] = _outputEscapes;
        int k = i;
        i = l;
        while (k < j) 
        {
            int i1 = k + 1;
            k = ac[k];
            if (k <= '\177')
            {
                if (ai[k] == 0)
                {
                    abyte0[i] = (byte)k;
                    i++;
                    k = i1;
                } else
                {
                    int j1 = ai[k];
                    if (j1 > 0)
                    {
                        k = i + 1;
                        abyte0[i] = 92;
                        i = k + 1;
                        abyte0[k] = (byte)j1;
                        k = i1;
                    } else
                    {
                        i = _writeGenericEscape(k, i);
                        k = i1;
                    }
                }
            } else
            {
                if (k <= 2047)
                {
                    int k1 = i + 1;
                    abyte0[i] = (byte)(k >> 6 | 0xc0);
                    i = k1 + 1;
                    abyte0[k1] = (byte)(k & 0x3f | 0x80);
                } else
                {
                    i = _outputMultiByteChar(k, i);
                }
                k = i1;
            }
        }
        _outputTail = i;
    }

    private final void _writeStringSegmentASCII2(char ac[], int i, int j)
    {
        if (_outputTail + (j - i) * 6 > _outputEnd)
        {
            _flushBuffer();
        }
        int l = _outputTail;
        byte abyte0[] = _outputBuffer;
        int ai[] = _outputEscapes;
        int j1 = _maximumNonEscapedChar;
        int k = i;
        i = l;
        while (k < j) 
        {
            int i1 = k + 1;
            k = ac[k];
            if (k <= '\177')
            {
                if (ai[k] == 0)
                {
                    abyte0[i] = (byte)k;
                    i++;
                    k = i1;
                } else
                {
                    int k1 = ai[k];
                    if (k1 > 0)
                    {
                        k = i + 1;
                        abyte0[i] = 92;
                        i = k + 1;
                        abyte0[k] = (byte)k1;
                        k = i1;
                    } else
                    {
                        i = _writeGenericEscape(k, i);
                        k = i1;
                    }
                }
            } else
            if (k > j1)
            {
                i = _writeGenericEscape(k, i);
                k = i1;
            } else
            {
                if (k <= 2047)
                {
                    int l1 = i + 1;
                    abyte0[i] = (byte)(k >> 6 | 0xc0);
                    i = l1 + 1;
                    abyte0[l1] = (byte)(k & 0x3f | 0x80);
                } else
                {
                    i = _outputMultiByteChar(k, i);
                }
                k = i1;
            }
        }
        _outputTail = i;
    }

    private final void _writeStringSegments(String s)
    {
        int i = s.length();
        char ac[] = _charBuffer;
        int j = 0;
        int k;
        for (; i > 0; i -= k)
        {
            k = Math.min(_outputMaxContiguous, i);
            s.getChars(j, j + k, ac, 0);
            if (_outputTail + k > _outputEnd)
            {
                _flushBuffer();
            }
            _writeStringSegment(ac, 0, k);
            j += k;
        }

    }

    private final void _writeStringSegments(char ac[], int i, int j)
    {
        int k;
        do
        {
            k = Math.min(_outputMaxContiguous, j);
            if (_outputTail + k > _outputEnd)
            {
                _flushBuffer();
            }
            _writeStringSegment(ac, i, k);
            i += k;
            k = j - k;
            j = k;
        } while (k > 0);
    }

    private final void _writeUTF8Segment(byte abyte0[], int i, int j)
    {
        int ai[] = _outputEscapes;
        for (int k = i; k < i + j; k++)
        {
            byte byte0 = abyte0[k];
            if (byte0 >= 0 && ai[byte0] != 0)
            {
                _writeUTF8Segment2(abyte0, i, j);
                return;
            }
        }

        if (_outputTail + j > _outputEnd)
        {
            _flushBuffer();
        }
        System.arraycopy(abyte0, i, _outputBuffer, _outputTail, j);
        _outputTail = _outputTail + j;
    }

    private final void _writeUTF8Segment2(byte abyte0[], int i, int j)
    {
        int k = _outputTail;
        int l = k;
        if (j * 6 + k > _outputEnd)
        {
            _flushBuffer();
            l = _outputTail;
        }
        byte abyte1[] = _outputBuffer;
        int ai[] = _outputEscapes;
        k = i;
        do
        {
            int i1 = k;
            if (i1 < j + i)
            {
                k = i1 + 1;
                byte byte0 = abyte0[i1];
                if (byte0 < 0 || ai[byte0] == 0)
                {
                    abyte1[l] = byte0;
                    l++;
                } else
                {
                    int j1 = ai[byte0];
                    if (j1 > 0)
                    {
                        int k1 = l + 1;
                        abyte1[l] = 92;
                        l = k1 + 1;
                        abyte1[k1] = (byte)j1;
                    } else
                    {
                        l = _writeGenericEscape(byte0, l);
                    }
                }
            } else
            {
                _outputTail = l;
                return;
            }
        } while (true);
    }

    private final void _writeUTF8Segments(byte abyte0[], int i, int j)
    {
        int k;
        do
        {
            k = Math.min(_outputMaxContiguous, j);
            _writeUTF8Segment(abyte0, i, k);
            i += k;
            k = j - k;
            j = k;
        } while (k > 0);
    }

    protected final int _decodeSurrogate(int i, int j)
    {
        if (j < 56320 || j > 57343)
        {
            _reportError((new StringBuilder()).append("Incomplete surrogate pair: first char 0x").append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).toString());
        }
        return 0x10000 + (i - 55296 << 10) + (j - 56320);
    }

    protected final void _flushBuffer()
    {
        int i = _outputTail;
        if (i > 0)
        {
            _outputTail = 0;
            _outputStream.write(_outputBuffer, 0, i);
        }
    }

    protected final void _outputSurrogates(int i, int j)
    {
        i = _decodeSurrogate(i, j);
        if (_outputTail + 4 > _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = (byte)(i >> 18 | 0xf0);
        j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = (byte)(i >> 12 & 0x3f | 0x80);
        j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = (byte)(i >> 6 & 0x3f | 0x80);
        j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = (byte)(i & 0x3f | 0x80);
    }

    protected void _releaseBuffers()
    {
        char ac[] = _outputBuffer;
        if (ac != null && _bufferRecyclable)
        {
            _outputBuffer = null;
            _ioContext.releaseWriteEncodingBuffer(ac);
        }
        ac = _charBuffer;
        if (ac != null)
        {
            _charBuffer = null;
            _ioContext.releaseConcatBuffer(ac);
        }
    }

    protected final void _verifyPrettyValueWrite(String s, int i)
    {
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 70
    //                   1 37
    //                   2 48
    //                   3 59;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        _cantHappen();
_L7:
        return;
_L3:
        _cfgPrettyPrinter.writeArrayValueSeparator(this);
        return;
_L4:
        _cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
        return;
_L5:
        _cfgPrettyPrinter.writeRootValueSeparator(this);
        return;
_L2:
        if (_writeContext.inArray())
        {
            _cfgPrettyPrinter.beforeArrayValues(this);
            return;
        }
        if (_writeContext.inObject())
        {
            _cfgPrettyPrinter.beforeObjectEntries(this);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void _verifyValueWrite(String s)
    {
        int i;
        i = _writeContext.writeValue();
        if (i == 5)
        {
            _reportError((new StringBuilder()).append("Can not ").append(s).append(", expecting field name").toString());
        }
        if (_cfgPrettyPrinter != null) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 1 3: default 76
    //                   1 77
    //                   2 116
    //                   3 122;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L4:
        byte byte0 = 44;
_L7:
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        _outputBuffer[_outputTail] = byte0;
        _outputTail = _outputTail + 1;
        return;
_L5:
        byte0 = 58;
        continue; /* Loop/switch isn't completed */
_L6:
        byte0 = 32;
        if (true) goto _L7; else goto _L2
_L2:
        _verifyPrettyValueWrite(s, i);
        return;
    }

    protected void _writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
    {
        int k1 = _outputEnd - 6;
        int l = base64variant.getMaxLineLength() >> 2;
        int k = i;
        i = l;
        do
        {
            if (k > j - 3)
            {
                break;
            }
            if (_outputTail > k1)
            {
                _flushBuffer();
            }
            l = k + 1;
            k = abyte0[k];
            int i1 = l + 1;
            byte byte0 = abyte0[l];
            l = i1 + 1;
            _outputTail = base64variant.encodeBase64Chunk((byte0 & 0xff | k << 8) << 8 | abyte0[i1] & 0xff, _outputBuffer, _outputTail);
            i1 = i - 1;
            i = i1;
            k = l;
            if (i1 <= 0)
            {
                byte abyte1[] = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                abyte1[i] = 92;
                abyte1 = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                abyte1[i] = 110;
                i = base64variant.getMaxLineLength() >> 2;
                k = l;
            }
        } while (true);
        l = j - k;
        if (l > 0)
        {
            if (_outputTail > k1)
            {
                _flushBuffer();
            }
            int j1 = k + 1;
            j = abyte0[k] << 16;
            i = j;
            if (l == 2)
            {
                i = j | (abyte0[j1] & 0xff) << 8;
            }
            _outputTail = base64variant.encodeBase64Partial(i, l, _outputBuffer, _outputTail);
        }
    }

    protected final void _writeFieldName(SerializableString serializablestring)
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            int i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
            if (i < 0)
            {
                _writeBytes(serializablestring.asQuotedUTF8());
                return;
            } else
            {
                _outputTail = i + _outputTail;
                return;
            }
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        abyte0[j] = 34;
        j = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
        if (j < 0)
        {
            _writeBytes(serializablestring.asQuotedUTF8());
        } else
        {
            _outputTail = j + _outputTail;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        serializablestring = _outputBuffer;
        j = _outputTail;
        _outputTail = j + 1;
        serializablestring[j] = 34;
    }

    protected final void _writeFieldName(String s)
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            _writeStringSegments(s);
            return;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
        i = s.length();
        if (i <= _charBufferLength)
        {
            s.getChars(0, i, _charBuffer, 0);
            if (i <= _outputMaxContiguous)
            {
                if (_outputTail + i > _outputEnd)
                {
                    _flushBuffer();
                }
                _writeStringSegment(_charBuffer, 0, i);
            } else
            {
                _writeStringSegments(_charBuffer, 0, i);
            }
        } else
        {
            _writeStringSegments(s);
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = 34;
    }

    protected final void _writePPFieldName(SerializableString serializablestring, boolean flag)
    {
        if (flag)
        {
            _cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else
        {
            _cfgPrettyPrinter.beforeObjectEntries(this);
        }
        flag = isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        if (flag)
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = 34;
        }
        _writeBytes(serializablestring.asQuotedUTF8());
        if (flag)
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            serializablestring = _outputBuffer;
            int j = _outputTail;
            _outputTail = j + 1;
            serializablestring[j] = 34;
        }
    }

    protected final void _writePPFieldName(String s, boolean flag)
    {
        if (flag)
        {
            _cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else
        {
            _cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = 34;
            i = s.length();
            if (i <= _charBufferLength)
            {
                s.getChars(0, i, _charBuffer, 0);
                if (i <= _outputMaxContiguous)
                {
                    if (_outputTail + i > _outputEnd)
                    {
                        _flushBuffer();
                    }
                    _writeStringSegment(_charBuffer, 0, i);
                } else
                {
                    _writeStringSegments(_charBuffer, 0, i);
                }
            } else
            {
                _writeStringSegments(s);
            }
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            s = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            s[i] = 34;
            return;
        } else
        {
            _writeStringSegments(s);
            return;
        }
    }

    public void close()
    {
        super.close();
        if (_outputBuffer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT))
        {
            do
            {
                JsonWriteContext jsonwritecontext = getOutputContext();
                if (jsonwritecontext.inArray())
                {
                    writeEndArray();
                    continue;
                }
                if (!jsonwritecontext.inObject())
                {
                    break;
                }
                writeEndObject();
            } while (true);
        }
        _flushBuffer();
        if (_outputStream == null) goto _L2; else goto _L1
_L1:
        if (!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET)) goto _L4; else goto _L3
_L3:
        _outputStream.close();
_L2:
        _releaseBuffers();
        return;
_L4:
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        {
            _outputStream.flush();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void flush()
    {
        _flushBuffer();
        if (_outputStream != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        {
            _outputStream.flush();
        }
    }

    public CharacterEscapes getCharacterEscapes()
    {
        return _characterEscapes;
    }

    public int getHighestEscapedChar()
    {
        return _maximumNonEscapedChar;
    }

    public Object getOutputTarget()
    {
        return _outputStream;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        _characterEscapes = characterescapes;
        if (characterescapes == null)
        {
            _outputEscapes = sOutputEscapes;
            return this;
        } else
        {
            _outputEscapes = characterescapes.getEscapeCodesForAscii();
            return this;
        }
    }

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        _maximumNonEscapedChar = j;
        return this;
    }

    public Version version()
    {
        return VersionUtil.versionFor(getClass());
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
    {
        _verifyValueWrite("write binary value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte1[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        abyte1[k] = 34;
        _writeBinary(base64variant, abyte0, i, i + j);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        base64variant = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        base64variant[i] = 34;
    }

    public void writeBoolean(boolean flag)
    {
        _verifyValueWrite("write boolean value");
        if (_outputTail + 5 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[];
        int i;
        if (flag)
        {
            abyte0 = TRUE_BYTES;
        } else
        {
            abyte0 = FALSE_BYTES;
        }
        i = abyte0.length;
        System.arraycopy(abyte0, 0, _outputBuffer, _outputTail, i);
        _outputTail = _outputTail + i;
    }

    public final void writeEndArray()
    {
        if (!_writeContext.inArray())
        {
            _reportError((new StringBuilder()).append("Current context not an ARRAY but ").append(_writeContext.getTypeDesc()).toString());
        }
        if (_cfgPrettyPrinter != null)
        {
            _cfgPrettyPrinter.writeEndArray(this, _writeContext.getEntryCount());
        } else
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = 93;
        }
        _writeContext = _writeContext.getParent();
    }

    public final void writeEndObject()
    {
        if (!_writeContext.inObject())
        {
            _reportError((new StringBuilder()).append("Current context not an object but ").append(_writeContext.getTypeDesc()).toString());
        }
        if (_cfgPrettyPrinter != null)
        {
            _cfgPrettyPrinter.writeEndObject(this, _writeContext.getEntryCount());
        } else
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = 125;
        }
        _writeContext = _writeContext.getParent();
    }

    public final void writeFieldName(SerializableString serializablestring)
    {
        boolean flag = true;
        int i = _writeContext.writeFieldName(serializablestring.getValue());
        if (i == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        if (_cfgPrettyPrinter != null)
        {
            if (i != 1)
            {
                flag = false;
            }
            _writePPFieldName(serializablestring, flag);
            return;
        }
        if (i == 1)
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int j = _outputTail;
            _outputTail = j + 1;
            abyte0[j] = 44;
        }
        _writeFieldName(serializablestring);
    }

    public final void writeFieldName(String s)
    {
        boolean flag = true;
        int i = _writeContext.writeFieldName(s);
        if (i == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        if (_cfgPrettyPrinter != null)
        {
            if (i != 1)
            {
                flag = false;
            }
            _writePPFieldName(s, flag);
            return;
        }
        if (i == 1)
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            byte abyte0[] = _outputBuffer;
            int j = _outputTail;
            _outputTail = j + 1;
            abyte0[j] = 44;
        }
        _writeFieldName(s);
    }

    public void writeNull()
    {
        _verifyValueWrite("write null value");
        _writeNull();
    }

    public void writeNumber(double d)
    {
        if (_cfgNumbersAsStrings || (Double.isNaN(d) || Double.isInfinite(d)) && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))
        {
            writeString(String.valueOf(d));
            return;
        } else
        {
            _verifyValueWrite("write number");
            writeRaw(String.valueOf(d));
            return;
        }
    }

    public void writeNumber(float f)
    {
        if (_cfgNumbersAsStrings || (Float.isNaN(f) || Float.isInfinite(f)) && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))
        {
            writeString(String.valueOf(f));
            return;
        } else
        {
            _verifyValueWrite("write number");
            writeRaw(String.valueOf(f));
            return;
        }
    }

    public void writeNumber(int i)
    {
        _verifyValueWrite("write number");
        if (_outputTail + 11 >= _outputEnd)
        {
            _flushBuffer();
        }
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedInt(i);
            return;
        } else
        {
            _outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
            return;
        }
    }

    public void writeNumber(long l)
    {
        _verifyValueWrite("write number");
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedLong(l);
            return;
        }
        if (_outputTail + 21 >= _outputEnd)
        {
            _flushBuffer();
        }
        _outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
    }

    public void writeNumber(String s)
    {
        _verifyValueWrite("write number");
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedRaw(s);
            return;
        } else
        {
            writeRaw(s);
            return;
        }
    }

    public void writeNumber(BigDecimal bigdecimal)
    {
        _verifyValueWrite("write number");
        if (bigdecimal == null)
        {
            _writeNull();
            return;
        }
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedRaw(bigdecimal);
            return;
        } else
        {
            writeRaw(bigdecimal.toString());
            return;
        }
    }

    public void writeNumber(BigInteger biginteger)
    {
        _verifyValueWrite("write number");
        if (biginteger == null)
        {
            _writeNull();
            return;
        }
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedRaw(biginteger);
            return;
        } else
        {
            writeRaw(biginteger.toString());
            return;
        }
    }

    public void writeRaw(char c)
    {
        if (_outputTail + 3 >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        if (c <= '\177')
        {
            int i = _outputTail;
            _outputTail = i + 1;
            abyte0[i] = (byte)c;
            return;
        }
        if (c < '\u0800')
        {
            int j = _outputTail;
            _outputTail = j + 1;
            abyte0[j] = (byte)(c >> 6 | 0xc0);
            j = _outputTail;
            _outputTail = j + 1;
            abyte0[j] = (byte)(c & 0x3f | 0x80);
            return;
        } else
        {
            _outputRawMultiByteChar(c, null, 0, 0);
            return;
        }
    }

    public void writeRaw(String s)
    {
        int i = s.length();
        int j = 0;
        int k;
        for (; i > 0; i -= k)
        {
            char ac[] = _charBuffer;
            int l = ac.length;
            k = l;
            if (i < l)
            {
                k = i;
            }
            s.getChars(j, j + k, ac, 0);
            writeRaw(ac, 0, k);
            j += k;
        }

    }

    public void writeRaw(String s, int i, int j)
    {
        int k = j;
        j = i;
        for (i = k; i > 0; i -= k)
        {
            char ac[] = _charBuffer;
            int l = ac.length;
            k = l;
            if (i < l)
            {
                k = i;
            }
            s.getChars(j, j + k, ac, 0);
            writeRaw(ac, 0, k);
            j += k;
        }

    }

    public final void writeRaw(char ac[], int i, int j)
    {
        int k = j + j + j;
        if (_outputTail + k <= _outputEnd) goto _L2; else goto _L1
_L1:
        if (_outputEnd >= k) goto _L4; else goto _L3
_L3:
        _writeSegmentedRaw(ac, i, j);
_L10:
        return;
_L4:
        _flushBuffer();
_L2:
        k = j + i;
_L8:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
label0:
        {
            j = ac[i];
            if (j <= 127)
            {
                break label0;
            }
            j = i + 1;
            i = ac[i];
            byte abyte1[];
            int i1;
            if (i < 2048)
            {
                byte abyte0[] = _outputBuffer;
                int l = _outputTail;
                _outputTail = l + 1;
                abyte0[l] = (byte)(i >> 6 | 0xc0);
                abyte0 = _outputBuffer;
                l = _outputTail;
                _outputTail = l + 1;
                abyte0[l] = (byte)(i & 0x3f | 0x80);
            } else
            {
                _outputRawMultiByteChar(i, ac, j, k);
            }
            i = j;
        }
        continue; /* Loop/switch isn't completed */
        abyte1 = _outputBuffer;
        i1 = _outputTail;
        _outputTail = i1 + 1;
        abyte1[i1] = (byte)j;
        j = i + 1;
        i = j;
        if (j < k) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte1[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        abyte1[k] = 34;
        _writeBytes(abyte0, i, j);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
    }

    public final void writeStartArray()
    {
        _verifyValueWrite("start an array");
        _writeContext = _writeContext.createChildArrayContext();
        if (_cfgPrettyPrinter != null)
        {
            _cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 91;
    }

    public final void writeStartObject()
    {
        _verifyValueWrite("start an object");
        _writeContext = _writeContext.createChildObjectContext();
        if (_cfgPrettyPrinter != null)
        {
            _cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 123;
    }

    public final void writeString(SerializableString serializablestring)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
        i = serializablestring.appendQuotedUTF8(_outputBuffer, _outputTail);
        if (i < 0)
        {
            _writeBytes(serializablestring.asQuotedUTF8());
        } else
        {
            _outputTail = i + _outputTail;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        serializablestring = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        serializablestring[i] = 34;
    }

    public void writeString(String s)
    {
        _verifyValueWrite("write text value");
        if (s == null)
        {
            _writeNull();
            return;
        }
        int i = s.length();
        if (i > _charBufferLength)
        {
            _writeLongString(s);
            return;
        }
        s.getChars(0, i, _charBuffer, 0);
        if (i > _outputMaxContiguous)
        {
            _writeLongString(_charBuffer, 0, i);
            return;
        }
        if (_outputTail + i >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        s[j] = 34;
        _writeStringSegment(_charBuffer, 0, i);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = 34;
    }

    public void writeString(char ac[], int i, int j)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte0[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        abyte0[k] = 34;
        if (j <= _outputMaxContiguous)
        {
            if (_outputTail + j > _outputEnd)
            {
                _flushBuffer();
            }
            _writeStringSegment(ac, i, j);
        } else
        {
            _writeStringSegments(ac, i, j);
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        ac = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
    }

    public final void writeStringField(String s, String s1)
    {
        writeFieldName(s);
        writeString(s1);
    }

    public void writeUTF8String(byte abyte0[], int i, int j)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        byte abyte1[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        abyte1[k] = 34;
        if (j <= _outputMaxContiguous)
        {
            _writeUTF8Segment(abyte0, i, j);
        } else
        {
            _writeUTF8Segments(abyte0, i, j);
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        abyte0 = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        abyte0[i] = 34;
    }

}
