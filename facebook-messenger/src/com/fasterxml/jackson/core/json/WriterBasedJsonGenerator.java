// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
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
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonWriteContext

public final class WriterBasedJsonGenerator extends GeneratorBase
{

    protected static final char HEX_CHARS[] = CharTypes.copyHexChars();
    protected static final int SHORT_WRITE = 32;
    protected static final int sOutputEscapes[] = CharTypes.get7BitOutputEscapes();
    protected CharacterEscapes _characterEscapes;
    protected SerializableString _currentEscape;
    protected char _entityBuffer[];
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected char _outputBuffer[];
    protected int _outputEnd;
    protected int _outputEscapes[];
    protected int _outputHead;
    protected int _outputTail;
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iocontext, int i, ObjectCodec objectcodec, Writer writer)
    {
        super(i, objectcodec);
        _outputEscapes = sOutputEscapes;
        _outputHead = 0;
        _outputTail = 0;
        _ioContext = iocontext;
        _writer = writer;
        _outputBuffer = iocontext.allocConcatBuffer();
        _outputEnd = _outputBuffer.length;
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII))
        {
            setHighestNonEscapedChar(127);
        }
    }

    private char[] _allocateEntityBuffer()
    {
        char ac[] = new char[14];
        ac[0] = '\\';
        ac[2] = '\\';
        ac[3] = 'u';
        ac[4] = '0';
        ac[5] = '0';
        ac[8] = '\\';
        ac[9] = 'u';
        _entityBuffer = ac;
        return ac;
    }

    private final void _appendCharacterEscape(char c, int i)
    {
        if (i >= 0)
        {
            if (_outputTail + 2 > _outputEnd)
            {
                _flushBuffer();
            }
            char ac[] = _outputBuffer;
            c = _outputTail;
            _outputTail = c + 1;
            ac[c] = '\\';
            ac = _outputBuffer;
            c = _outputTail;
            _outputTail = c + 1;
            ac[c] = (char)i;
            return;
        }
        if (i != -2)
        {
            if (_outputTail + 2 > _outputEnd)
            {
                _flushBuffer();
            }
            i = _outputTail;
            char ac1[] = _outputBuffer;
            int j = i + 1;
            ac1[i] = '\\';
            i = j + 1;
            ac1[j] = 'u';
            if (c > '\377')
            {
                j = c >> 8 & 0xff;
                int l = i + 1;
                ac1[i] = HEX_CHARS[j >> 4];
                i = l + 1;
                ac1[l] = HEX_CHARS[j & 0xf];
                c &= '\377';
            } else
            {
                int k = i + 1;
                ac1[i] = '0';
                i = k + 1;
                ac1[k] = '0';
            }
            j = i + 1;
            ac1[i] = HEX_CHARS[c >> 4];
            ac1[j] = HEX_CHARS[c & 0xf];
            _outputTail = j;
            return;
        }
        String s;
        if (_currentEscape == null)
        {
            s = _characterEscapes.getEscapeSequence(c).getValue();
        } else
        {
            s = _currentEscape.getValue();
            _currentEscape = null;
        }
        c = s.length();
        if (_outputTail + c > _outputEnd)
        {
            _flushBuffer();
            if (c > _outputEnd)
            {
                _writer.write(s);
                return;
            }
        }
        s.getChars(0, c, _outputBuffer, _outputTail);
        _outputTail = _outputTail + c;
    }

    private final int _prependOrWriteCharacterEscape(char ac[], int i, int j, char c, int k)
    {
        if (k >= 0)
        {
            if (i > 1 && i < j)
            {
                i -= 2;
                ac[i] = '\\';
                ac[i + 1] = (char)k;
                return i;
            }
            char ac1[] = _entityBuffer;
            ac = ac1;
            if (ac1 == null)
            {
                ac = _allocateEntityBuffer();
            }
            ac[1] = (char)k;
            _writer.write(ac, 0, 2);
            return i;
        }
        if (k != -2)
        {
            if (i > 5 && i < j)
            {
                i -= 6;
                j = i + 1;
                ac[i] = '\\';
                i = j + 1;
                ac[j] = 'u';
                if (c > '\377')
                {
                    j = c >> 8 & 0xff;
                    k = i + 1;
                    ac[i] = HEX_CHARS[j >> 4];
                    i = k + 1;
                    ac[k] = HEX_CHARS[j & 0xf];
                    c &= '\377';
                } else
                {
                    j = i + 1;
                    ac[i] = '0';
                    i = j + 1;
                    ac[j] = '0';
                }
                j = i + 1;
                ac[i] = HEX_CHARS[c >> 4];
                ac[j] = HEX_CHARS[c & 0xf];
                return j - 5;
            }
            char ac2[] = _entityBuffer;
            ac = ac2;
            if (ac2 == null)
            {
                ac = _allocateEntityBuffer();
            }
            _outputHead = _outputTail;
            if (c > '\377')
            {
                j = c >> 8 & 0xff;
                c &= '\377';
                ac[10] = HEX_CHARS[j >> 4];
                ac[11] = HEX_CHARS[j & 0xf];
                ac[12] = HEX_CHARS[c >> 4];
                ac[13] = HEX_CHARS[c & 0xf];
                _writer.write(ac, 8, 6);
                return i;
            } else
            {
                ac[6] = HEX_CHARS[c >> 4];
                ac[7] = HEX_CHARS[c & 0xf];
                _writer.write(ac, 2, 6);
                return i;
            }
        }
        String s;
        if (_currentEscape == null)
        {
            s = _characterEscapes.getEscapeSequence(c).getValue();
        } else
        {
            s = _currentEscape.getValue();
            _currentEscape = null;
        }
        c = s.length();
        if (i >= c && i < j)
        {
            i -= c;
            s.getChars(0, c, ac, i);
            return i;
        } else
        {
            _writer.write(s);
            return i;
        }
    }

    private final void _prependOrWriteCharacterEscape(char c, int i)
    {
        if (i >= 0)
        {
            if (_outputTail >= 2)
            {
                c = _outputTail - 2;
                _outputHead = c;
                _outputBuffer[c] = '\\';
                _outputBuffer[c + 1] = (char)i;
                return;
            }
            char ac3[] = _entityBuffer;
            char ac[] = ac3;
            if (ac3 == null)
            {
                ac = _allocateEntityBuffer();
            }
            _outputHead = _outputTail;
            ac[1] = (char)i;
            _writer.write(ac, 0, 2);
            return;
        }
        if (i != -2)
        {
            if (_outputTail >= 6)
            {
                char ac1[] = _outputBuffer;
                i = _outputTail - 6;
                _outputHead = i;
                ac1[i] = '\\';
                i++;
                ac1[i] = 'u';
                if (c > '\377')
                {
                    int j = c >> 8 & 0xff;
                    i++;
                    ac1[i] = HEX_CHARS[j >> 4];
                    i++;
                    ac1[i] = HEX_CHARS[j & 0xf];
                    c &= '\377';
                } else
                {
                    i++;
                    ac1[i] = '0';
                    i++;
                    ac1[i] = '0';
                }
                i++;
                ac1[i] = HEX_CHARS[c >> 4];
                ac1[i + 1] = HEX_CHARS[c & 0xf];
                return;
            }
            char ac4[] = _entityBuffer;
            char ac2[] = ac4;
            if (ac4 == null)
            {
                ac2 = _allocateEntityBuffer();
            }
            _outputHead = _outputTail;
            if (c > '\377')
            {
                i = c >> 8 & 0xff;
                c &= '\377';
                ac2[10] = HEX_CHARS[i >> 4];
                ac2[11] = HEX_CHARS[i & 0xf];
                ac2[12] = HEX_CHARS[c >> 4];
                ac2[13] = HEX_CHARS[c & 0xf];
                _writer.write(ac2, 8, 6);
                return;
            } else
            {
                ac2[6] = HEX_CHARS[c >> 4];
                ac2[7] = HEX_CHARS[c & 0xf];
                _writer.write(ac2, 2, 6);
                return;
            }
        }
        String s;
        if (_currentEscape == null)
        {
            s = _characterEscapes.getEscapeSequence(c).getValue();
        } else
        {
            s = _currentEscape.getValue();
            _currentEscape = null;
        }
        c = s.length();
        if (_outputTail >= c)
        {
            i = _outputTail - c;
            _outputHead = i;
            s.getChars(0, c, _outputBuffer, i);
            return;
        } else
        {
            _outputHead = _outputTail;
            _writer.write(s);
            return;
        }
    }

    private void _writeLongString(String s)
    {
        _flushBuffer();
        int l = s.length();
        int i = 0;
        do
        {
            int k = _outputEnd;
            int j = k;
            if (i + k > l)
            {
                j = l - i;
            }
            s.getChars(i, i + j, _outputBuffer, 0);
            if (_characterEscapes != null)
            {
                _writeSegmentCustom(j);
            } else
            if (_maximumNonEscapedChar != 0)
            {
                _writeSegmentASCII(j, _maximumNonEscapedChar);
            } else
            {
                _writeSegment(j);
            }
            j = i + j;
            i = j;
        } while (j < l);
    }

    private final void _writeNull()
    {
        if (_outputTail + 4 >= _outputEnd)
        {
            _flushBuffer();
        }
        int i = _outputTail;
        char ac[] = _outputBuffer;
        ac[i] = 'n';
        i++;
        ac[i] = 'u';
        i++;
        ac[i] = 'l';
        i++;
        ac[i] = 'l';
        _outputTail = i + 1;
    }

    private final void _writeQuotedInt(int i)
    {
        if (_outputTail + 13 >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        ac[j] = '"';
        _outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
        ac = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
    }

    private final void _writeQuotedLong(long l)
    {
        if (_outputTail + 23 >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
        _outputTail = NumberOutput.outputLong(l, _outputBuffer, _outputTail);
        ac = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
    }

    private final void _writeQuotedRaw(Object obj)
    {
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
        writeRaw(obj.toString());
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        obj = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        obj[i] = '"';
    }

    private final void _writeSegment(int i)
    {
        int ai[];
        int j;
        int k;
        int j1;
        ai = _outputEscapes;
        j1 = ai.length;
        j = 0;
        k = 0;
_L8:
        if (j >= i) goto _L2; else goto _L1
_L1:
        char c = _outputBuffer[j];
        if (c >= j1 || ai[c] == 0) goto _L4; else goto _L3
_L3:
        int l = j - k;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        _writer.write(_outputBuffer, k, l);
        if (j < i)
        {
            break MISSING_BLOCK_LABEL_98;
        }
_L2:
        return;
_L4:
        int i1 = j + 1;
        j = i1;
        if (i1 < i)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i1;
        if (true) goto _L3; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
        j++;
        k = _prependOrWriteCharacterEscape(_outputBuffer, j, i, c, ai[c]);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private final void _writeSegmentASCII(int i, int j)
    {
        int ai[];
        int k;
        int l;
        int i1;
        int i2;
        k = 0;
        ai = _outputEscapes;
        i2 = Math.min(ai.length, j + 1);
        i1 = 0;
        l = 0;
_L11:
        if (l >= i) goto _L2; else goto _L1
_L1:
        int l1 = k;
_L9:
        char c = _outputBuffer[l];
        if (c >= i2) goto _L4; else goto _L3
_L3:
        k = ai[c];
        if (k == 0) goto _L6; else goto _L5
_L5:
        int j1 = l - i1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        _writer.write(_outputBuffer, i1, j1);
        if (l < i)
        {
            break MISSING_BLOCK_LABEL_137;
        }
_L2:
        return;
_L4:
        k = l1;
        if (c > j)
        {
            k = -1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        int k1 = l + 1;
        l1 = k;
        l = k1;
        if (k1 < i)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k1;
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
        l++;
        i1 = _prependOrWriteCharacterEscape(_outputBuffer, l, i, c, k);
        if (true) goto _L11; else goto _L10
_L10:
    }

    private final void _writeSegmentCustom(int i)
    {
        char c;
        CharacterEscapes characterescapes;
        int j;
        int k;
        int l;
        int i1;
        int l1;
        k = 0;
        int ai[] = _outputEscapes;
        int j1;
        int i2;
        if (_maximumNonEscapedChar < 1)
        {
            l = 65535;
        } else
        {
            l = _maximumNonEscapedChar;
        }
        i2 = Math.min(ai.length, l + 1);
        characterescapes = _characterEscapes;
        i1 = 0;
        j = 0;
_L11:
        if (k >= i) goto _L2; else goto _L1
_L1:
        l1 = j;
_L9:
        c = _outputBuffer[k];
        if (c >= i2) goto _L4; else goto _L3
_L3:
        j = ai[c];
        if (j == 0) goto _L6; else goto _L5
_L5:
        j1 = k - i1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        _writer.write(_outputBuffer, i1, j1);
        if (k < i)
        {
            break MISSING_BLOCK_LABEL_189;
        }
_L2:
        return;
_L4:
        if (c > l)
        {
            j = -1;
            continue; /* Loop/switch isn't completed */
        }
        SerializableString serializablestring = characterescapes.getEscapeSequence(c);
        _currentEscape = serializablestring;
        j = l1;
        if (serializablestring != null)
        {
            j = -2;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        int k1 = k + 1;
        l1 = j;
        k = k1;
        if (k1 < i)
        {
            break; /* Loop/switch isn't completed */
        }
        k = k1;
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
        k++;
        i1 = _prependOrWriteCharacterEscape(_outputBuffer, k, i, c, j);
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void _writeString(String s)
    {
        int i = s.length();
        if (i > _outputEnd)
        {
            _writeLongString(s);
            return;
        }
        if (_outputTail + i > _outputEnd)
        {
            _flushBuffer();
        }
        s.getChars(0, i, _outputBuffer, _outputTail);
        if (_characterEscapes != null)
        {
            _writeStringCustom(i);
            return;
        }
        if (_maximumNonEscapedChar != 0)
        {
            _writeStringASCII(i, _maximumNonEscapedChar);
            return;
        } else
        {
            _writeString2(i);
            return;
        }
    }

    private final void _writeString(char ac[], int i, int j)
    {
        if (_characterEscapes == null) goto _L2; else goto _L1
_L1:
        _writeStringCustom(ac, i, j);
_L4:
        return;
_L2:
        int ai[];
        int l;
        int i1;
        if (_maximumNonEscapedChar != 0)
        {
            _writeStringASCII(ac, i, j, _maximumNonEscapedChar);
            return;
        }
        l = j + i;
        ai = _outputEscapes;
        i1 = ai.length;
_L8:
        if (i >= l) goto _L4; else goto _L3
_L3:
        j = i;
_L10:
        char c1 = ac[j];
        if (c1 >= i1 || ai[c1] == 0) goto _L6; else goto _L5
_L5:
        int k = j - i;
        char c;
        if (k < 32)
        {
            if (_outputTail + k > _outputEnd)
            {
                _flushBuffer();
            }
            if (k > 0)
            {
                System.arraycopy(ac, i, _outputBuffer, _outputTail, k);
                _outputTail = _outputTail + k;
            }
        } else
        {
            _flushBuffer();
            _writer.write(ac, i, k);
        }
        if (j >= l) goto _L4; else goto _L7
_L7:
        i = j + 1;
        c = ac[j];
        _appendCharacterEscape(c, ai[c]);
          goto _L8
_L6:
        k = j + 1;
        j = k;
        if (k < l) goto _L10; else goto _L9
_L9:
        j = k;
          goto _L5
    }

    private void _writeString2(int i)
    {
        i = _outputTail + i;
        int ai[] = _outputEscapes;
        int j = ai.length;
label0:
        do
        {
            int k;
            if (_outputTail < i)
            {
                do
                {
                    k = _outputBuffer[_outputTail];
                    if (k < j && ai[k] != 0)
                    {
                        k = _outputTail - _outputHead;
                        if (k > 0)
                        {
                            _writer.write(_outputBuffer, _outputHead, k);
                        }
                        char ac[] = _outputBuffer;
                        k = _outputTail;
                        _outputTail = k + 1;
                        char c = ac[k];
                        _prependOrWriteCharacterEscape(c, ai[c]);
                        continue label0;
                    }
                    k = _outputTail + 1;
                    _outputTail = k;
                } while (k < i);
            }
            return;
        } while (true);
    }

    private void _writeStringASCII(int i, int j)
    {
        int ai[];
        int k;
        int l;
        k = _outputTail + i;
        ai = _outputEscapes;
        l = Math.min(ai.length, j + 1);
_L8:
        if (_outputTail >= k) goto _L2; else goto _L1
_L1:
        char c = _outputBuffer[_outputTail];
        if (c >= l) goto _L4; else goto _L3
_L3:
        i = ai[c];
        if (i == 0) goto _L6; else goto _L5
_L5:
        int i1 = _outputTail - _outputHead;
        if (i1 > 0)
        {
            _writer.write(_outputBuffer, _outputHead, i1);
        }
        _outputTail = _outputTail + 1;
        _prependOrWriteCharacterEscape(c, i);
        continue; /* Loop/switch isn't completed */
_L4:
        if (c <= j)
        {
            break; /* Loop/switch isn't completed */
        }
        i = -1;
        if (true) goto _L5; else goto _L6
_L6:
        i = _outputTail + 1;
        _outputTail = i;
        if (i < k) goto _L1; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private final void _writeStringASCII(char ac[], int i, int j, int k)
    {
        int ai[];
        int l1;
        int i2;
        l1 = j + i;
        ai = _outputEscapes;
        i2 = Math.min(ai.length, k + 1);
        boolean flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
_L12:
        if (j >= l1) goto _L2; else goto _L1
_L1:
        int l;
        int k1;
        l = j;
        k1 = i;
_L10:
        char c = ac[l];
        if (c >= i2) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = ai[c];
        i = i1;
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        i = i1;
_L8:
        int j1 = l - j;
        if (j1 < 32)
        {
            if (_outputTail + j1 > _outputEnd)
            {
                _flushBuffer();
            }
            if (j1 > 0)
            {
                System.arraycopy(ac, j, _outputBuffer, _outputTail, j1);
                _outputTail = _outputTail + j1;
            }
        } else
        {
            _flushBuffer();
            _writer.write(ac, j, j1);
        }
        if (l < l1)
        {
            break MISSING_BLOCK_LABEL_204;
        }
_L2:
        return;
_L4:
        i = k1;
        if (c <= k) goto _L6; else goto _L7
_L7:
        i = -1;
          goto _L8
_L6:
        j1 = l + 1;
        k1 = i;
        l = j1;
        if (j1 < l1) goto _L10; else goto _L9
_L9:
        l = j1;
          goto _L8
        j = l + 1;
        _appendCharacterEscape(c, i);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void _writeStringCustom(int i)
    {
        char c;
        CharacterEscapes characterescapes;
        int j;
        int k;
        k = _outputTail + i;
        int ai[] = _outputEscapes;
        int l;
        int i1;
        if (_maximumNonEscapedChar < 1)
        {
            j = 65535;
        } else
        {
            j = _maximumNonEscapedChar;
        }
        l = Math.min(ai.length, j + 1);
        characterescapes = _characterEscapes;
_L8:
        if (_outputTail >= k) goto _L2; else goto _L1
_L1:
        c = _outputBuffer[_outputTail];
        if (c >= l) goto _L4; else goto _L3
_L3:
        i = ai[c];
        if (i == 0) goto _L6; else goto _L5
_L5:
        i1 = _outputTail - _outputHead;
        if (i1 > 0)
        {
            _writer.write(_outputBuffer, _outputHead, i1);
        }
        _outputTail = _outputTail + 1;
        _prependOrWriteCharacterEscape(c, i);
        continue; /* Loop/switch isn't completed */
_L4:
        if (c > j)
        {
            i = -1;
            continue; /* Loop/switch isn't completed */
        }
        SerializableString serializablestring = characterescapes.getEscapeSequence(c);
        _currentEscape = serializablestring;
        if (serializablestring == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = -2;
        if (true) goto _L5; else goto _L6
_L6:
        i = _outputTail + 1;
        _outputTail = i;
        if (i < k) goto _L1; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private final void _writeStringCustom(char ac[], int i, int j)
    {
        char c;
        CharacterEscapes characterescapes;
        int k;
        int l;
        int k1;
        int l1;
        l1 = j + i;
        int ai[] = _outputEscapes;
        int i1;
        int i2;
        if (_maximumNonEscapedChar < 1)
        {
            l = 65535;
        } else
        {
            l = _maximumNonEscapedChar;
        }
        i2 = Math.min(ai.length, l + 1);
        characterescapes = _characterEscapes;
        k = 0;
        j = i;
        i = k;
_L12:
        if (j >= l1) goto _L2; else goto _L1
_L1:
        k = j;
        k1 = i;
_L10:
        c = ac[k];
        if (c >= i2) goto _L4; else goto _L3
_L3:
        i1 = ai[c];
        i = i1;
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        i = i1;
_L7:
        int j1 = k - j;
        SerializableString serializablestring;
        if (j1 < 32)
        {
            if (_outputTail + j1 > _outputEnd)
            {
                _flushBuffer();
            }
            if (j1 > 0)
            {
                System.arraycopy(ac, j, _outputBuffer, _outputTail, j1);
                _outputTail = _outputTail + j1;
            }
        } else
        {
            _flushBuffer();
            _writer.write(ac, j, j1);
        }
        if (k < l1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
_L2:
        return;
_L4:
label0:
        {
            if (c <= l)
            {
                break label0;
            }
            i = -1;
        }
          goto _L7
        serializablestring = characterescapes.getEscapeSequence(c);
        _currentEscape = serializablestring;
        i = k1;
        if (serializablestring == null) goto _L6; else goto _L8
_L8:
        i = -2;
          goto _L7
_L6:
        j1 = k + 1;
        k1 = i;
        k = j1;
        if (j1 < l1) goto _L10; else goto _L9
_L9:
        k = j1;
          goto _L7
        j = k + 1;
        _appendCharacterEscape(c, i);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void writeRawLong(String s)
    {
        int j = _outputEnd - _outputTail;
        s.getChars(0, j, _outputBuffer, _outputTail);
        _outputTail = _outputTail + j;
        _flushBuffer();
        int i;
        int k;
        for (i = s.length() - j; i > _outputEnd; i -= k)
        {
            k = _outputEnd;
            s.getChars(j, j + k, _outputBuffer, 0);
            _outputHead = 0;
            _outputTail = k;
            _flushBuffer();
            j += k;
        }

        s.getChars(j, j + i, _outputBuffer, 0);
        _outputHead = 0;
        _outputTail = i;
    }

    protected final void _flushBuffer()
    {
        int i = _outputTail - _outputHead;
        if (i > 0)
        {
            int j = _outputHead;
            _outputHead = 0;
            _outputTail = 0;
            _writer.write(_outputBuffer, j, i);
        }
    }

    protected void _releaseBuffers()
    {
        char ac[] = _outputBuffer;
        if (ac != null)
        {
            _outputBuffer = null;
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
        char c = ',';
_L7:
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        _outputBuffer[_outputTail] = c;
        _outputTail = _outputTail + 1;
        return;
_L5:
        c = ':';
        continue; /* Loop/switch isn't completed */
_L6:
        c = ' ';
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
                char ac[] = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                ac[i] = '\\';
                ac = _outputBuffer;
                i = _outputTail;
                _outputTail = i + 1;
                ac[i] = 'n';
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

    public void _writeFieldName(SerializableString serializablestring, boolean flag)
    {
        if (_cfgPrettyPrinter != null)
        {
            _writePPFieldName(serializablestring, flag);
            return;
        }
        if (_outputTail + 1 >= _outputEnd)
        {
            _flushBuffer();
        }
        if (flag)
        {
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = ',';
        }
        serializablestring = serializablestring.asQuotedChars();
        if (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            writeRaw(serializablestring, 0, serializablestring.length);
            return;
        }
        char ac1[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        ac1[j] = '"';
        j = serializablestring.length;
        if (_outputTail + j + 1 >= _outputEnd)
        {
            writeRaw(serializablestring, 0, j);
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            serializablestring = _outputBuffer;
            j = _outputTail;
            _outputTail = j + 1;
            serializablestring[j] = '"';
            return;
        } else
        {
            System.arraycopy(serializablestring, 0, _outputBuffer, _outputTail, j);
            _outputTail = _outputTail + j;
            serializablestring = _outputBuffer;
            j = _outputTail;
            _outputTail = j + 1;
            serializablestring[j] = '"';
            return;
        }
    }

    protected void _writeFieldName(String s, boolean flag)
    {
        if (_cfgPrettyPrinter != null)
        {
            _writePPFieldName(s, flag);
            return;
        }
        if (_outputTail + 1 >= _outputEnd)
        {
            _flushBuffer();
        }
        if (flag)
        {
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = ',';
        }
        if (!isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            _writeString(s);
            return;
        }
        char ac1[] = _outputBuffer;
        int j = _outputTail;
        _outputTail = j + 1;
        ac1[j] = '"';
        _writeString(s);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        j = _outputTail;
        _outputTail = j + 1;
        s[j] = '"';
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
        serializablestring = serializablestring.asQuotedChars();
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.QUOTE_FIELD_NAMES))
        {
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = '"';
            writeRaw(serializablestring, 0, serializablestring.length);
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            serializablestring = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            serializablestring[i] = '"';
            return;
        } else
        {
            writeRaw(serializablestring, 0, serializablestring.length);
            return;
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
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = '"';
            _writeString(s);
            if (_outputTail >= _outputEnd)
            {
                _flushBuffer();
            }
            s = _outputBuffer;
            i = _outputTail;
            _outputTail = i + 1;
            s[i] = '"';
            return;
        } else
        {
            _writeString(s);
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
        if (_writer == null) goto _L2; else goto _L1
_L1:
        if (!_ioContext.isResourceManaged() && !isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET)) goto _L4; else goto _L3
_L3:
        _writer.close();
_L2:
        _releaseBuffers();
        return;
_L4:
        if (isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        {
            _writer.flush();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void flush()
    {
        _flushBuffer();
        if (_writer != null && isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM))
        {
            _writer.flush();
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
        return _writer;
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
        char ac[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        ac[k] = '"';
        _writeBinary(base64variant, abyte0, i, i + j);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        base64variant = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        base64variant[i] = '"';
    }

    public void writeBoolean(boolean flag)
    {
        _verifyValueWrite("write boolean value");
        if (_outputTail + 5 >= _outputEnd)
        {
            _flushBuffer();
        }
        int i = _outputTail;
        char ac[] = _outputBuffer;
        if (flag)
        {
            ac[i] = 't';
            i++;
            ac[i] = 'r';
            i++;
            ac[i] = 'u';
            i++;
            ac[i] = 'e';
        } else
        {
            ac[i] = 'f';
            i++;
            ac[i] = 'a';
            i++;
            ac[i] = 'l';
            i++;
            ac[i] = 's';
            i++;
            ac[i] = 'e';
        }
        _outputTail = i + 1;
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
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = ']';
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
            char ac[] = _outputBuffer;
            int i = _outputTail;
            _outputTail = i + 1;
            ac[i] = '}';
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
        if (i != 1)
        {
            flag = false;
        }
        _writeFieldName(serializablestring, flag);
    }

    public final void writeFieldName(String s)
    {
        boolean flag = true;
        int i = _writeContext.writeFieldName(s);
        if (i == 4)
        {
            _reportError("Can not write a field name, expecting a value");
        }
        if (i != 1)
        {
            flag = false;
        }
        _writeFieldName(s, flag);
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
        if (_cfgNumbersAsStrings)
        {
            _writeQuotedInt(i);
            return;
        }
        if (_outputTail + 11 >= _outputEnd)
        {
            _flushBuffer();
        }
        _outputTail = NumberOutput.outputInt(i, _outputBuffer, _outputTail);
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
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = c;
    }

    public void writeRaw(String s)
    {
        int k = s.length();
        int j = _outputEnd - _outputTail;
        int i = j;
        if (j == 0)
        {
            _flushBuffer();
            i = _outputEnd - _outputTail;
        }
        if (i >= k)
        {
            s.getChars(0, k, _outputBuffer, _outputTail);
            _outputTail = _outputTail + k;
            return;
        } else
        {
            writeRawLong(s);
            return;
        }
    }

    public void writeRaw(String s, int i, int j)
    {
        int l = _outputEnd - _outputTail;
        int k = l;
        if (l < j)
        {
            _flushBuffer();
            k = _outputEnd - _outputTail;
        }
        if (k >= j)
        {
            s.getChars(i, i + j, _outputBuffer, _outputTail);
            _outputTail = _outputTail + j;
            return;
        } else
        {
            writeRawLong(s.substring(i, i + j));
            return;
        }
    }

    public void writeRaw(char ac[], int i, int j)
    {
        if (j < 32)
        {
            if (j > _outputEnd - _outputTail)
            {
                _flushBuffer();
            }
            System.arraycopy(ac, i, _outputBuffer, _outputTail, j);
            _outputTail = _outputTail + j;
            return;
        } else
        {
            _flushBuffer();
            _writer.write(ac, i, j);
            return;
        }
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
    {
        _reportUnsupportedOperation();
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
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '[';
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
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '{';
    }

    public final void writeString(SerializableString serializablestring)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
        serializablestring = serializablestring.asQuotedChars();
        i = serializablestring.length;
        if (i < 32)
        {
            if (i > _outputEnd - _outputTail)
            {
                _flushBuffer();
            }
            System.arraycopy(serializablestring, 0, _outputBuffer, _outputTail, i);
            _outputTail = _outputTail + i;
        } else
        {
            _flushBuffer();
            _writer.write(serializablestring, 0, i);
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        serializablestring = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        serializablestring[i] = '"';
    }

    public void writeString(String s)
    {
        _verifyValueWrite("write text value");
        if (s == null)
        {
            _writeNull();
            return;
        }
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac[] = _outputBuffer;
        int i = _outputTail;
        _outputTail = i + 1;
        ac[i] = '"';
        _writeString(s);
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        s = _outputBuffer;
        i = _outputTail;
        _outputTail = i + 1;
        s[i] = '"';
    }

    public void writeString(char ac[], int i, int j)
    {
        _verifyValueWrite("write text value");
        if (_outputTail >= _outputEnd)
        {
            _flushBuffer();
        }
        char ac1[] = _outputBuffer;
        int k = _outputTail;
        _outputTail = k + 1;
        ac1[k] = '"';
        _writeString(ac, i, j);
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
        _reportUnsupportedOperation();
    }

}
