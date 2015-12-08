// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonReadContext

public class UTF8StreamJsonParser extends ParserBase
{

    protected static final int _icLatin1[] = CharTypes.getInputCodeLatin1();
    private static final int _icUTF8[] = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte _inputBuffer[];
    protected InputStream _inputStream;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int _quadBuffer[];
    protected final BytesToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iocontext, int i, InputStream inputstream, ObjectCodec objectcodec, BytesToNameCanonicalizer bytestonamecanonicalizer, byte abyte0[], int j, 
            int k, boolean flag)
    {
        super(iocontext, i);
        _quadBuffer = new int[16];
        _tokenIncomplete = false;
        _inputStream = inputstream;
        _objectCodec = objectcodec;
        _symbols = bytestonamecanonicalizer;
        _inputBuffer = abyte0;
        _inputPtr = j;
        _inputEnd = k;
        _currInputRowStart = j;
        _currInputProcessed = -j;
        _bufferRecyclable = flag;
    }

    private final void _checkMatchEnd(String s, int i, int j)
    {
        if (Character.isJavaIdentifierPart((char)_decodeCharForError(j)))
        {
            _reportInvalidToken(s.substring(0, i));
        }
    }

    private final int _decodeUtf8_2(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        if ((j & 0xc0) != 128)
        {
            _reportInvalidOther(j & 0xff, _inputPtr);
        }
        return j & 0x3f | (i & 0x1f) << 6;
    }

    private final int _decodeUtf8_3(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        if ((j & 0xc0) != 128)
        {
            _reportInvalidOther(j & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int k = _inputPtr;
        _inputPtr = k + 1;
        k = abyte0[k];
        if ((k & 0xc0) != 128)
        {
            _reportInvalidOther(k & 0xff, _inputPtr);
        }
        return ((i & 0xf) << 6 | j & 0x3f) << 6 | k & 0x3f;
    }

    private final int _decodeUtf8_3fast(int i)
    {
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        if ((j & 0xc0) != 128)
        {
            _reportInvalidOther(j & 0xff, _inputPtr);
        }
        abyte0 = _inputBuffer;
        int k = _inputPtr;
        _inputPtr = k + 1;
        k = abyte0[k];
        if ((k & 0xc0) != 128)
        {
            _reportInvalidOther(k & 0xff, _inputPtr);
        }
        return ((i & 0xf) << 6 | j & 0x3f) << 6 | k & 0x3f;
    }

    private final int _decodeUtf8_4(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        if ((j & 0xc0) != 128)
        {
            _reportInvalidOther(j & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int k = _inputPtr;
        _inputPtr = k + 1;
        k = abyte0[k];
        if ((k & 0xc0) != 128)
        {
            _reportInvalidOther(k & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int l = _inputPtr;
        _inputPtr = l + 1;
        l = abyte0[l];
        if ((l & 0xc0) != 128)
        {
            _reportInvalidOther(l & 0xff, _inputPtr);
        }
        return (((j & 0x3f | (i & 7) << 6) << 6 | k & 0x3f) << 6 | l & 0x3f) - 0x10000;
    }

    private final void _finishString2(char ac[], int i)
    {
        int ai[] = _icUTF8;
        byte abyte0[] = _inputBuffer;
        char ac1[] = ac;
label0:
        do
        {
            int j;
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
                                j = _inputPtr;
                                int k = j;
                                if (j >= _inputEnd)
                                {
                                    loadMoreGuaranteed();
                                    k = _inputPtr;
                                }
                                ac = ac1;
                                j = i;
                                if (i >= ac1.length)
                                {
                                    ac = _textBuffer.finishCurrentSegment();
                                    j = 0;
                                }
                                int l = Math.min(_inputEnd, (ac.length - j) + k);
                                do
                                {
                                    if (k >= l)
                                    {
                                        break;
                                    }
                                    i = k + 1;
                                    k = abyte0[k] & 0xff;
                                    if (ai[k] != 0)
                                    {
                                        {
                                            _inputPtr = i;
                                            if (k == 34)
                                            {
                                                break label1;
                                            }
                                            int i1;
                                            switch (ai[k])
                                            {
                                            default:
                                                if (k < 32)
                                                {
                                                    _throwUnquotedSpace(k, "string value");
                                                    i = k;
                                                } else
                                                {
                                                    _reportInvalidChar(k);
                                                    i = k;
                                                }
                                                break;

                                            case 1: // '\001'
                                                break label5;

                                            case 2: // '\002'
                                                break label4;

                                            case 3: // '\003'
                                                break label3;

                                            case 4: // '\004'
                                                break label2;
                                            }
                                        }
                                        if (j >= ac.length)
                                        {
                                            ac = _textBuffer.finishCurrentSegment();
                                            j = 0;
                                        }
                                        k = j + 1;
                                        ac[j] = (char)i;
                                        ac1 = ac;
                                        i = k;
                                        continue label0;
                                    }
                                    ac[j] = (char)k;
                                    k = i;
                                    j++;
                                } while (true);
                                _inputPtr = k;
                                ac1 = ac;
                                i = j;
                                continue;
                            }
                            i = _decodeEscaped();
                            break MISSING_BLOCK_LABEL_178;
                        }
                        i = _decodeUtf8_2(k);
                        break MISSING_BLOCK_LABEL_178;
                    }
                    if (_inputEnd - _inputPtr >= 2)
                    {
                        i = _decodeUtf8_3fast(k);
                    } else
                    {
                        i = _decodeUtf8_3(k);
                    }
                    break MISSING_BLOCK_LABEL_178;
                }
                i1 = _decodeUtf8_4(k);
                k = j + 1;
                ac[j] = (char)(0xd800 | i1 >> 10);
                i = k;
                ac1 = ac;
                if (k >= ac.length)
                {
                    ac1 = _textBuffer.finishCurrentSegment();
                    i = 0;
                }
                j = i;
                i = i1 & 0x3ff | 0xdc00;
                ac = ac1;
                break MISSING_BLOCK_LABEL_178;
            }
            _textBuffer.setCurrentLength(j);
            return;
        } while (true);
    }

    private final void _matchToken2(String s, int i)
    {
        int k = s.length();
        int j;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore() || _inputBuffer[_inputPtr] != s.charAt(i))
            {
                _reportInvalidToken(s.substring(0, i));
            }
            _inputPtr = _inputPtr + 1;
            j = i + 1;
            i = j;
        } while (j < k);
        if (_inputPtr < _inputEnd || loadMore())
        {
            if ((i = _inputBuffer[_inputPtr] & 0xff) >= 48 && i != 93 && i != 125)
            {
                _checkMatchEnd(s, j, i);
                return;
            }
        }
    }

    private final JsonToken _nextAfterName()
    {
        JsonToken jsontoken;
        _nameCopied = false;
        jsontoken = _nextToken;
        _nextToken = null;
        if (jsontoken != JsonToken.START_ARRAY) goto _L2; else goto _L1
_L1:
        _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
_L4:
        _currToken = jsontoken;
        return jsontoken;
_L2:
        if (jsontoken == JsonToken.START_OBJECT)
        {
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final JsonToken _nextTokenNotInObject(int i)
    {
        if (i == 34)
        {
            _tokenIncomplete = true;
            JsonToken jsontoken = JsonToken.VALUE_STRING;
            _currToken = jsontoken;
            return jsontoken;
        }
        switch (i)
        {
        default:
            JsonToken jsontoken1 = _handleUnexpectedValue(i);
            _currToken = jsontoken1;
            return jsontoken1;

        case 91: // '['
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
            JsonToken jsontoken2 = JsonToken.START_ARRAY;
            _currToken = jsontoken2;
            return jsontoken2;

        case 123: // '{'
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
            JsonToken jsontoken3 = JsonToken.START_OBJECT;
            _currToken = jsontoken3;
            return jsontoken3;

        case 116: // 't'
            _matchToken("true", 1);
            JsonToken jsontoken4 = JsonToken.VALUE_TRUE;
            _currToken = jsontoken4;
            return jsontoken4;

        case 102: // 'f'
            _matchToken("false", 1);
            JsonToken jsontoken5 = JsonToken.VALUE_FALSE;
            _currToken = jsontoken5;
            return jsontoken5;

        case 110: // 'n'
            _matchToken("null", 1);
            JsonToken jsontoken6 = JsonToken.VALUE_NULL;
            _currToken = jsontoken6;
            return jsontoken6;

        case 45: // '-'
            JsonToken jsontoken7 = _parseNegNumber();
            _currToken = jsontoken7;
            return jsontoken7;

        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            JsonToken jsontoken8 = _parsePosNumber(i);
            _currToken = jsontoken8;
            return jsontoken8;
        }
    }

    private final JsonToken _parseFloat(char ac[], int i, int j, boolean flag, int k)
    {
        int l;
        boolean flag1;
        int k1;
        boolean flag2 = false;
        k1 = 0;
        flag1 = false;
        if (j != 46)
        {
            break MISSING_BLOCK_LABEL_607;
        }
        k1 = i + 1;
        ac[i] = (char)j;
        l = j;
        i = k1;
        j = ((flag2) ? 1 : 0);
_L11:
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        flag1 = true;
_L10:
        char ac1[];
        int j1;
        if (j == 0)
        {
            reportUnexpectedNumberChar(l, "Decimal point not followed by a digit");
        }
        j1 = j;
        j = ((flag1) ? 1 : 0);
        ac1 = ac;
_L14:
        k1 = 0;
        if (l != 101 && l != 69) goto _L4; else goto _L3
_L3:
        int l1;
        int i2;
        int j2;
        int i1 = i;
        ac = ac1;
        if (i >= ac1.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i1 = 0;
        }
        i = i1 + 1;
        ac[i1] = (char)l;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        ac1 = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        l = ac1[l] & 0xff;
        if (l == 45 || l == 43)
        {
            if (i >= ac.length)
            {
                ac = _textBuffer.finishCurrentSegment();
                i = 0;
            }
            ac[i] = (char)l;
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            ac1 = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            l = ac1[l] & 0xff;
            i++;
            i1 = k1;
        } else
        {
            i1 = k1;
        }
        if (l > 57 || l < 48) goto _L6; else goto _L5
_L5:
        i1++;
        k1 = i;
        ac1 = ac;
        if (i >= ac.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            k1 = 0;
        }
        i = k1 + 1;
        ac1[k1] = (char)l;
        if (_inputPtr < _inputEnd || loadMore()) goto _L8; else goto _L7
_L7:
        k1 = i1;
        j = 1;
        i1 = i;
        i = k1;
_L12:
        k1 = i;
        l1 = j;
        i2 = l;
        j2 = i1;
        if (i == 0)
        {
            reportUnexpectedNumberChar(l, "Exponent indicator not followed by a digit");
            j2 = i1;
            i2 = l;
            l1 = j;
            k1 = i;
        }
_L13:
        if (l1 == 0)
        {
            _inputPtr = _inputPtr - 1;
            if (_parsingContext.inRoot())
            {
                _verifyRootSpace(i2);
            }
        }
        _textBuffer.setCurrentLength(j2);
        return resetFloat(flag, k, j1, k1);
_L2:
        ac1 = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        l = ac1[l] & 0xff;
        if (l < 48 || l > 57) goto _L10; else goto _L9
_L9:
        j++;
        if (i >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        }
        j1 = i + 1;
        ac[i] = (char)l;
        i = j1;
          goto _L11
_L8:
        ac = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        l = ac[l] & 0xff;
        ac = ac1;
        break MISSING_BLOCK_LABEL_265;
_L6:
        k1 = i;
        i = i1;
        i1 = k1;
          goto _L12
_L4:
        k1 = 0;
        l1 = j;
        i2 = l;
        j2 = i;
          goto _L13
        j1 = 0;
        l = j;
        ac1 = ac;
        j = k1;
          goto _L14
    }

    private final JsonToken _parseNumber2(char ac[], int i, boolean flag, int j)
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _textBuffer.setCurrentLength(i);
                return resetInt(flag, j);
            }
            byte abyte0[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            int l = abyte0[k] & 0xff;
            if (l > 57 || l < 48)
            {
                if (l == 46 || l == 101 || l == 69)
                {
                    return _parseFloat(ac, i, l, flag, j);
                }
                break;
            }
            if (i >= ac.length)
            {
                ac = _textBuffer.finishCurrentSegment();
                i = 0;
            }
            k = i + 1;
            ac[i] = (char)l;
            j++;
            i = k;
        } while (true);
        _inputPtr = _inputPtr - 1;
        _textBuffer.setCurrentLength(i);
        if (_parsingContext.inRoot())
        {
            ac = _inputBuffer;
            i = _inputPtr;
            _inputPtr = i + 1;
            _verifyRootSpace(ac[i] & 0xff);
        }
        return resetInt(flag, j);
    }

    private final void _skipCComment()
    {
        int ai[] = CharTypes.getInputCodeComment();
label0:
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i] & 0xff;
            int j = ai[i];
            if (j == 0)
            {
                continue;
            }
            switch (j)
            {
            default:
                _reportInvalidChar(i);
                break;

            case 42: // '*'
                if (_inputPtr < _inputEnd || loadMore())
                {
                    if (_inputBuffer[_inputPtr] == 47)
                    {
                        _inputPtr = _inputPtr + 1;
                        return;
                    }
                    break;
                }
                break label0;

            case 10: // '\n'
                _currInputRow = _currInputRow + 1;
                _currInputRowStart = _inputPtr;
                break;

            case 13: // '\r'
                _skipCR();
                break;

            case 2: // '\002'
                _skipUtf8_2(i);
                break;

            case 3: // '\003'
                _skipUtf8_3(i);
                break;

            case 4: // '\004'
                _skipUtf8_4(i);
                break;
            }
        } while (true);
        _reportInvalidEOF(" in a comment");
    }

    private final int _skipColon()
    {
        int k;
label0:
        {
            if (_inputPtr + 4 >= _inputEnd)
            {
                return _skipColon2(false);
            }
            byte byte0 = _inputBuffer[_inputPtr];
            if (byte0 == 58)
            {
                byte abyte0[] = _inputBuffer;
                int i = _inputPtr + 1;
                _inputPtr = i;
                i = abyte0[i];
                if (i > 32)
                {
                    if (i == 47 || i == 35)
                    {
                        return _skipColon2(true);
                    } else
                    {
                        _inputPtr = _inputPtr + 1;
                        return i;
                    }
                }
                if (i == 32 || i == 9)
                {
                    byte abyte1[] = _inputBuffer;
                    int j = _inputPtr + 1;
                    _inputPtr = j;
                    j = abyte1[j];
                    if (j > 32)
                    {
                        if (j == 47 || j == 35)
                        {
                            return _skipColon2(true);
                        } else
                        {
                            _inputPtr = _inputPtr + 1;
                            return j;
                        }
                    }
                }
                return _skipColon2(true);
            }
            if (byte0 != 32)
            {
                k = byte0;
                if (byte0 != 9)
                {
                    break label0;
                }
            }
            byte abyte2[] = _inputBuffer;
            k = _inputPtr + 1;
            _inputPtr = k;
            k = abyte2[k];
        }
        if (k == 58)
        {
            byte abyte3[] = _inputBuffer;
            int l = _inputPtr + 1;
            _inputPtr = l;
            l = abyte3[l];
            if (l > 32)
            {
                if (l == 47 || l == 35)
                {
                    return _skipColon2(true);
                } else
                {
                    _inputPtr = _inputPtr + 1;
                    return l;
                }
            }
            if (l == 32 || l == 9)
            {
                byte abyte4[] = _inputBuffer;
                int i1 = _inputPtr + 1;
                _inputPtr = i1;
                i1 = abyte4[i1];
                if (i1 > 32)
                {
                    if (i1 == 47 || i1 == 35)
                    {
                        return _skipColon2(true);
                    } else
                    {
                        _inputPtr = _inputPtr + 1;
                        return i1;
                    }
                }
            }
            return _skipColon2(true);
        } else
        {
            return _skipColon2(false);
        }
    }

    private final int _skipColon2(boolean flag)
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i] & 0xff;
            if (i > 32)
            {
                if (i == 47)
                {
                    _skipComment();
                } else
                if (i != 35 || !_skipYAMLComment())
                {
                    if (flag)
                    {
                        return i;
                    }
                    if (i != 58)
                    {
                        if (i < 32)
                        {
                            _throwInvalidSpace(i);
                        }
                        _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
                    }
                    flag = true;
                }
            } else
            if (i != 32)
            {
                if (i == 10)
                {
                    _currInputRow = _currInputRow + 1;
                    _currInputRowStart = _inputPtr;
                } else
                if (i == 13)
                {
                    _skipCR();
                } else
                if (i != 9)
                {
                    _throwInvalidSpace(i);
                }
            }
        } while (true);
        throw _constructError((new StringBuilder("Unexpected end-of-input within/between ")).append(_parsingContext.getTypeDesc()).append(" entries").toString());
    }

    private final void _skipComment()
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS))
        {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in a comment");
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i] & 0xff;
        if (i == 47)
        {
            _skipLine();
            return;
        }
        if (i == 42)
        {
            _skipCComment();
            return;
        } else
        {
            _reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
            return;
        }
    }

    private final void _skipLine()
    {
        int ai[] = CharTypes.getInputCodeComment();
        do
        {
            int i;
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
                            if (_inputPtr < _inputEnd || loadMore())
                            {
                                byte abyte0[] = _inputBuffer;
                                i = _inputPtr;
                                _inputPtr = i + 1;
                                i = abyte0[i] & 0xff;
                                int j = ai[i];
                                if (j == 0)
                                {
                                    continue;
                                }
                                switch (j)
                                {
                                default:
                                    if (j < 0)
                                    {
                                        _reportInvalidChar(i);
                                    }
                                    continue;

                                case 2: // '\002'
                                    break label2;

                                case 3: // '\003'
                                    break label1;

                                case 4: // '\004'
                                    break label0;

                                case 13: // '\r'
                                    break label3;

                                case 42: // '*'
                                    continue;

                                case 10: // '\n'
                                    _currInputRow = _currInputRow + 1;
                                    _currInputRowStart = _inputPtr;
                                    break;
                                }
                            }
                            return;
                        }
                        _skipCR();
                        return;
                    }
                    _skipUtf8_2(i);
                    continue;
                }
                _skipUtf8_3(i);
                continue;
            }
            _skipUtf8_4(i);
        } while (true);
    }

    private final void _skipUtf8_2(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
    }

    private final void _skipUtf8_3(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
    }

    private final void _skipUtf8_4(int i)
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if ((i & 0xc0) != 128)
        {
            _reportInvalidOther(i & 0xff, _inputPtr);
        }
    }

    private final int _skipWS()
    {
label0:
        do
        {
            int j;
label1:
            {
                int i;
label2:
                {
                    if (_inputPtr >= _inputEnd)
                    {
                        break label0;
                    }
                    byte abyte0[] = _inputBuffer;
                    i = _inputPtr;
                    _inputPtr = i + 1;
                    j = abyte0[i] & 0xff;
                    if (j <= 32)
                    {
                        break label1;
                    }
                    if (j != 47)
                    {
                        i = j;
                        if (j != 35)
                        {
                            break label2;
                        }
                    }
                    _inputPtr = _inputPtr - 1;
                    i = _skipWS2();
                }
                return i;
            }
            if (j != 32)
            {
                if (j == 10)
                {
                    _currInputRow = _currInputRow + 1;
                    _currInputRowStart = _inputPtr;
                } else
                if (j == 13)
                {
                    _skipCR();
                } else
                if (j != 9)
                {
                    _throwInvalidSpace(j);
                }
            }
        } while (true);
        return _skipWS2();
    }

    private final int _skipWS2()
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i] & 0xff;
            if (i > 32)
            {
                if (i == 47)
                {
                    _skipComment();
                } else
                if (i != 35 || !_skipYAMLComment())
                {
                    return i;
                }
            } else
            if (i != 32)
            {
                if (i == 10)
                {
                    _currInputRow = _currInputRow + 1;
                    _currInputRowStart = _inputPtr;
                } else
                if (i == 13)
                {
                    _skipCR();
                } else
                if (i != 9)
                {
                    _throwInvalidSpace(i);
                }
            }
        } while (true);
        throw _constructError((new StringBuilder("Unexpected end-of-input within/between ")).append(_parsingContext.getTypeDesc()).append(" entries").toString());
    }

    private final int _skipWSOrEnd()
    {
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        int i = _eofAsNextChar();
_L4:
        return i;
_L2:
        int j;
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        j = abyte0[i] & 0xff;
        if (j <= 32)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (j == 47)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (j != 35) goto _L4; else goto _L3
_L3:
        _inputPtr = _inputPtr - 1;
        return _skipWSOrEnd2();
        byte abyte1[];
        if (j != 32)
        {
            if (j == 10)
            {
                _currInputRow = _currInputRow + 1;
                _currInputRowStart = _inputPtr;
            } else
            if (j == 13)
            {
                _skipCR();
            } else
            if (j != 9)
            {
                _throwInvalidSpace(j);
            }
        }
_L6:
        if (_inputPtr >= _inputEnd)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        abyte1 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        j = abyte1[i] & 0xff;
        if (j <= 32)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (j == 47)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (j != 35) goto _L4; else goto _L5
_L5:
        _inputPtr = _inputPtr - 1;
        return _skipWSOrEnd2();
        if (j != 32)
        {
            if (j == 10)
            {
                _currInputRow = _currInputRow + 1;
                _currInputRowStart = _inputPtr;
            } else
            if (j == 13)
            {
                _skipCR();
            } else
            if (j != 9)
            {
                _throwInvalidSpace(j);
            }
        }
          goto _L6
        return _skipWSOrEnd2();
    }

    private final int _skipWSOrEnd2()
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i] & 0xff;
            if (i > 32)
            {
                if (i == 47)
                {
                    _skipComment();
                } else
                if (i != 35 || !_skipYAMLComment())
                {
                    return i;
                }
            } else
            if (i != 32)
            {
                if (i == 10)
                {
                    _currInputRow = _currInputRow + 1;
                    _currInputRowStart = _inputPtr;
                } else
                if (i == 13)
                {
                    _skipCR();
                } else
                if (i != 9)
                {
                    _throwInvalidSpace(i);
                }
            }
        } while (true);
        return _eofAsNextChar();
    }

    private final boolean _skipYAMLComment()
    {
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS))
        {
            return false;
        } else
        {
            _skipLine();
            return true;
        }
    }

    private final int _verifyNoLeadingZeroes()
    {
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        int i = 48;
_L4:
        return i;
_L2:
        int j;
        j = _inputBuffer[_inputPtr] & 0xff;
        if (j < 48 || j > 57)
        {
            return 48;
        }
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
        {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        _inputPtr = _inputPtr + 1;
        i = j;
        if (j != 48)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                continue; /* Loop/switch isn't completed */
            }
            j = _inputBuffer[_inputPtr] & 0xff;
            if (j < 48 || j > 57)
            {
                return 48;
            }
            _inputPtr = _inputPtr + 1;
            i = j;
        } while (j == 48);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return j;
    }

    private final void _verifyRootSpace(int i)
    {
        _inputPtr = _inputPtr + 1;
        switch (i)
        {
        default:
            _reportMissingRootWS(i);
            // fall through

        case 9: // '\t'
        case 32: // ' '
            return;

        case 13: // '\r'
            _skipCR();
            return;

        case 10: // '\n'
            _currInputRow = _currInputRow + 1;
            _currInputRowStart = _inputPtr;
            return;
        }
    }

    private final Name addName(int ai[], int i, int j)
    {
        char ac[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2 = ((i << 2) - 4) + j;
        char ac1[];
        if (j < 4)
        {
            i2 = ai[i - 1];
            ai[i - 1] = i2 << (4 - j << 3);
        } else
        {
            i2 = 0;
        }
        ac = _textBuffer.emptyAndGetCurrentSegment();
        j1 = 0;
        k = 0;
        if (k >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ai[k >> 2] >> (3 - (k & 3) << 3) & 0xff;
        i1 = k + 1;
        l1 = l;
        k1 = i1;
        if (l <= 127)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        if ((l & 0xe0) == 192)
        {
            k = l & 0x1f;
            l = 1;
        } else
        if ((l & 0xf0) == 224)
        {
            k = l & 0xf;
            l = 2;
        } else
        if ((l & 0xf8) == 240)
        {
            k = l & 7;
            l = 3;
        } else
        {
            _reportInvalidInitial(l);
            k = 1;
            l = 1;
        }
        if (i1 + l > j2)
        {
            _reportInvalidEOF(" in field name");
        }
        l1 = ai[i1 >> 2] >> (3 - (i1 & 3) << 3);
        k1 = i1 + 1;
        if ((l1 & 0xc0) != 128)
        {
            _reportInvalidOther(l1);
        }
        l1 = k << 6 | l1 & 0x3f;
        i1 = l1;
        k = k1;
        if (l > 1)
        {
            k = ai[k1 >> 2] >> (3 - (k1 & 3) << 3);
            k1++;
            if ((k & 0xc0) != 128)
            {
                _reportInvalidOther(k);
            }
            l1 = l1 << 6 | k & 0x3f;
            i1 = l1;
            k = k1;
            if (l > 2)
            {
                i1 = ai[k1 >> 2] >> (3 - (k1 & 3) << 3);
                k = k1 + 1;
                if ((i1 & 0xc0) != 128)
                {
                    _reportInvalidOther(i1 & 0xff);
                }
                i1 = l1 << 6 | i1 & 0x3f;
            }
        }
        l1 = i1;
        k1 = k;
        if (l <= 2)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        l = i1 - 0x10000;
        ac1 = ac;
        if (j1 >= ac.length)
        {
            ac1 = _textBuffer.expandCurrentSegment();
        }
        ac1[j1] = (char)(55296 + (l >> 10));
        i1 = j1 + 1;
        ac = ac1;
        l = l & 0x3ff | 0xdc00;
_L4:
        ac1 = ac;
        if (i1 >= ac.length)
        {
            ac1 = _textBuffer.expandCurrentSegment();
        }
        j1 = i1 + 1;
        ac1[i1] = (char)l;
        ac = ac1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_49;
_L1:
        String s = new String(ac, 0, j1);
        if (j < 4)
        {
            ai[i - 1] = i2;
        }
        return _symbols.addName(s, ai, i);
        l = l1;
        k = k1;
        i1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final Name findName(int i, int j)
    {
        Name name = _symbols.findName(i);
        if (name != null)
        {
            return name;
        } else
        {
            _quadBuffer[0] = i;
            return addName(_quadBuffer, 1, j);
        }
    }

    private final Name findName(int i, int j, int k)
    {
        Name name = _symbols.findName(i, j);
        if (name != null)
        {
            return name;
        } else
        {
            _quadBuffer[0] = i;
            _quadBuffer[1] = j;
            return addName(_quadBuffer, 2, k);
        }
    }

    private final Name findName(int ai[], int i, int j, int k)
    {
        int ai1[] = ai;
        if (i >= ai.length)
        {
            ai1 = growArrayBy(ai, ai.length);
            _quadBuffer = ai1;
        }
        int l = i + 1;
        ai1[i] = j;
        Name name = _symbols.findName(ai1, l);
        ai = name;
        if (name == null)
        {
            ai = addName(ai1, l, k);
        }
        return ai;
    }

    public static int[] growArrayBy(int ai[], int i)
    {
        if (ai == null)
        {
            return new int[i];
        } else
        {
            return Arrays.copyOf(ai, ai.length + i);
        }
    }

    private int nextByte()
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        return abyte0[i] & 0xff;
    }

    private final Name parseName(int i, int j, int k)
    {
        return parseEscapedName(_quadBuffer, 0, i, j, k);
    }

    private final Name parseName(int i, int j, int k, int l)
    {
        _quadBuffer[0] = i;
        return parseEscapedName(_quadBuffer, 1, j, k, l);
    }

    protected void _closeInput()
    {
        if (_inputStream != null)
        {
            if (_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
            {
                _inputStream.close();
            }
            _inputStream = null;
        }
    }

    protected final byte[] _decodeBase64(Base64Variant base64variant)
    {
        ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
        do
        {
            int i1;
            do
            {
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte0[] = _inputBuffer;
                int i = _inputPtr;
                _inputPtr = i + 1;
                i1 = abyte0[i] & 0xff;
            } while (i1 <= 32);
            int l = base64variant.decodeBase64Char(i1);
            int j = l;
            if (l < 0)
            {
                if (i1 == 34)
                {
                    return bytearraybuilder.toByteArray();
                }
                j = _decodeBase64Escape(base64variant, i1, 0);
                if (j < 0)
                {
                    continue;
                }
            }
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte1[] = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            int j1 = abyte1[l] & 0xff;
            i1 = base64variant.decodeBase64Char(j1);
            l = i1;
            if (i1 < 0)
            {
                l = _decodeBase64Escape(base64variant, j1, 1);
            }
            j1 = l | j << 6;
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            abyte1 = _inputBuffer;
            j = _inputPtr;
            _inputPtr = j + 1;
            int k1 = abyte1[j] & 0xff;
            l = base64variant.decodeBase64Char(k1);
            i1 = l;
            if (l < 0)
            {
                j = l;
                if (l != -2)
                {
                    if (k1 == 34 && !base64variant.usesPadding())
                    {
                        bytearraybuilder.append(j1 >> 4);
                        return bytearraybuilder.toByteArray();
                    }
                    j = _decodeBase64Escape(base64variant, k1, 2);
                }
                i1 = j;
                if (j == -2)
                {
                    if (_inputPtr >= _inputEnd)
                    {
                        loadMoreGuaranteed();
                    }
                    abyte1 = _inputBuffer;
                    j = _inputPtr;
                    _inputPtr = j + 1;
                    j = abyte1[j] & 0xff;
                    if (!base64variant.usesPaddingChar(j))
                    {
                        throw reportInvalidBase64Char(base64variant, j, 3, (new StringBuilder("expected padding character '")).append(base64variant.getPaddingChar()).append("'").toString());
                    }
                    bytearraybuilder.append(j1 >> 4);
                    continue;
                }
            }
            j1 = j1 << 6 | i1;
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            abyte1 = _inputBuffer;
            j = _inputPtr;
            _inputPtr = j + 1;
            k1 = abyte1[j] & 0xff;
            l = base64variant.decodeBase64Char(k1);
            i1 = l;
            if (l < 0)
            {
                int k = l;
                if (l != -2)
                {
                    if (k1 == 34 && !base64variant.usesPadding())
                    {
                        bytearraybuilder.appendTwoBytes(j1 >> 2);
                        return bytearraybuilder.toByteArray();
                    }
                    k = _decodeBase64Escape(base64variant, k1, 3);
                }
                i1 = k;
                if (k == -2)
                {
                    bytearraybuilder.appendTwoBytes(j1 >> 2);
                    continue;
                }
            }
            bytearraybuilder.appendThreeBytes(i1 | j1 << 6);
        } while (true);
    }

    protected int _decodeCharForError(int i)
    {
        int j;
label0:
        {
label1:
            {
                j = i & 0xff;
                i = j;
                if (j > 127)
                {
                    int k;
                    if ((j & 0xe0) == 192)
                    {
                        j &= 0x1f;
                        i = 1;
                    } else
                    if ((j & 0xf0) == 224)
                    {
                        j &= 0xf;
                        i = 2;
                    } else
                    if ((j & 0xf8) == 240)
                    {
                        j &= 7;
                        i = 3;
                    } else
                    {
                        _reportInvalidInitial(j & 0xff);
                        i = 1;
                    }
                    k = nextByte();
                    if ((k & 0xc0) != 128)
                    {
                        _reportInvalidOther(k & 0xff);
                    }
                    j = j << 6 | k & 0x3f;
                    if (i <= 1)
                    {
                        break label0;
                    }
                    k = nextByte();
                    if ((k & 0xc0) != 128)
                    {
                        _reportInvalidOther(k & 0xff);
                    }
                    j = k & 0x3f | j << 6;
                    if (i <= 2)
                    {
                        break label1;
                    }
                    i = nextByte();
                    if ((i & 0xc0) != 128)
                    {
                        _reportInvalidOther(i & 0xff);
                    }
                    i = i & 0x3f | j << 6;
                }
                return i;
            }
            return j;
        }
        return j;
    }

    protected char _decodeEscaped()
    {
        int i = 0;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in character escape sequence");
        }
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        switch (j)
        {
        default:
            return _handleUnrecognizedCharacterEscape((char)_decodeCharForError(j));

        case 98: // 'b'
            return '\b';

        case 116: // 't'
            return '\t';

        case 110: // 'n'
            return '\n';

        case 102: // 'f'
            return '\f';

        case 114: // 'r'
            return '\r';

        case 34: // '"'
        case 47: // '/'
        case 92: // '\\'
            return (char)j;

        case 117: // 'u'
            j = 0;
            break;
        }
        for (; i < 4; i++)
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOF(" in character escape sequence");
            }
            byte abyte1[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            k = abyte1[k];
            int l = CharTypes.charToHex(k);
            if (l < 0)
            {
                _reportUnexpectedChar(k, "expected a hex-digit for character escape sequence");
            }
            j = j << 4 | l;
        }

        return (char)j;
    }

    protected void _finishString()
    {
        int j = _inputPtr;
        int i = j;
        if (j >= _inputEnd)
        {
            loadMoreGuaranteed();
            i = _inputPtr;
        }
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        int ai[] = _icUTF8;
        int k = Math.min(_inputEnd, ac.length + i);
        byte abyte0[] = _inputBuffer;
        j = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            int l = abyte0[i] & 0xff;
            if (ai[l] != 0)
            {
                if (l == 34)
                {
                    _inputPtr = i + 1;
                    _textBuffer.setCurrentLength(j);
                    return;
                }
                break;
            }
            ac[j] = (char)l;
            j++;
            i++;
        } while (true);
        _inputPtr = i;
        _finishString2(ac, j);
    }

    protected final String _getText2(JsonToken jsontoken)
    {
        if (jsontoken == null)
        {
            return null;
        }
        switch (jsontoken.id())
        {
        default:
            return jsontoken.asString();

        case 5: // '\005'
            return _parsingContext.getCurrentName();

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return _textBuffer.contentsAsString();
        }
    }

    protected JsonToken _handleApos()
    {
        char ac1[];
        int ai[];
        byte abyte0[];
        int i;
        ac1 = _textBuffer.emptyAndGetCurrentSegment();
        ai = _icUTF8;
        abyte0 = _inputBuffer;
        i = 0;
_L7:
        char ac[];
        int j;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        ac = ac1;
        j = i;
        if (i >= ac1.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        }
        int k = _inputEnd;
        i = _inputPtr + (ac.length - j);
        if (i < k)
        {
            k = i;
        }
        do
        {
            ac1 = ac;
            i = j;
            if (_inputPtr >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i] & 0xff;
            if (i == 39 || ai[i] != 0)
            {
                break;
            }
            ac[j] = (char)i;
            j++;
        } while (true);
        if (i == 39)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        ai[i];
        JVM INSTR tableswitch 1 4: default 200
    //                   1 261
    //                   2 277
    //                   3 288
    //                   4 323;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_323;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        if (i < 32)
        {
            _throwUnquotedSpace(i, "string value");
        }
        _reportInvalidChar(i);
_L8:
        if (j >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        }
        int l = j + 1;
        ac[j] = (char)i;
        ac1 = ac;
        i = l;
        if (true) goto _L7; else goto _L6
_L6:
        if (i != 39)
        {
            i = _decodeEscaped();
        }
          goto _L8
_L3:
        i = _decodeUtf8_2(i);
          goto _L8
_L4:
        if (_inputEnd - _inputPtr >= 2)
        {
            i = _decodeUtf8_3fast(i);
        } else
        {
            i = _decodeUtf8_3(i);
        }
          goto _L8
        int i1 = _decodeUtf8_4(i);
        i = j + 1;
        ac[j] = (char)(0xd800 | i1 >> 10);
        if (i >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        } else
        {
            j = i;
        }
        i = 0xdc00 | i1 & 0x3ff;
          goto _L8
        _textBuffer.setCurrentLength(j);
        return JsonToken.VALUE_STRING;
    }

    protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
    {
        int j;
label0:
        {
            do
            {
                j = i;
                if (i != 73)
                {
                    break label0;
                }
                if (_inputPtr >= _inputEnd && !loadMore())
                {
                    _reportInvalidEOFInValue();
                }
                byte abyte0[] = _inputBuffer;
                i = _inputPtr;
                _inputPtr = i + 1;
                i = abyte0[i];
                String s;
                if (i == 78)
                {
                    if (flag)
                    {
                        s = "-INF";
                    } else
                    {
                        s = "+INF";
                    }
                } else
                {
                    if (i != 110)
                    {
                        break;
                    }
                    if (flag)
                    {
                        s = "-Infinity";
                    } else
                    {
                        s = "+Infinity";
                    }
                }
                _matchToken(s, 3);
                if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
                {
                    double d;
                    if (flag)
                    {
                        d = (-1.0D / 0.0D);
                    } else
                    {
                        d = (1.0D / 0.0D);
                    }
                    return resetAsNaN(s, d);
                }
                _reportError((new StringBuilder("Non-standard token '")).append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
            } while (true);
            j = i;
        }
        reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected Name _handleOddName(int i)
    {
        if (i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
        {
            return _parseAposName();
        }
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
        {
            _reportUnexpectedChar((char)_decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int ai3[] = CharTypes.getInputCodeUtf8JsNames();
        if (ai3[i] != 0)
        {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int ai[] = _quadBuffer;
        int l = 0;
        int k = 0;
        int j = i;
        i = 0;
        do
        {
            int j1;
            if (l < 4)
            {
                k = j | k << 8;
                j = l + 1;
            } else
            {
                int ai1[] = ai;
                if (i >= ai.length)
                {
                    ai1 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai1;
                }
                ai1[i] = k;
                ai = ai1;
                boolean flag = true;
                k = j;
                i++;
                j = ((flag) ? 1 : 0);
            }
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOF(" in field name");
            }
            j1 = _inputBuffer[_inputPtr] & 0xff;
            if (ai3[j1] == 0)
            {
                _inputPtr = _inputPtr + 1;
                l = j;
                j = j1;
            } else
            {
                int i1 = i;
                int ai2[] = ai;
                if (j > 0)
                {
                    ai2 = ai;
                    if (i >= ai.length)
                    {
                        ai2 = growArrayBy(ai, ai.length);
                        _quadBuffer = ai2;
                    }
                    ai2[i] = k;
                    i1 = i + 1;
                }
                Name name = _symbols.findName(ai2, i1);
                if (name == null)
                {
                    return addName(ai2, i1, j);
                }
                return name;
            }
        } while (true);
    }

    protected JsonToken _handleUnexpectedValue(int i)
    {
        i;
        JVM INSTR lookupswitch 6: default 60
    //                   39: 107
    //                   43: 200
    //                   73: 161
    //                   78: 122
    //                   93: 99
    //                   125: 99;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6
_L1:
        if (Character.isJavaIdentifierStart(i))
        {
            _reportInvalidToken((new StringBuilder()).append((char)i).toString(), "('true', 'false' or 'null')");
        }
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
_L6:
        _reportUnexpectedChar(i, "expected a value");
_L2:
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
        {
            return _handleApos();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        _matchToken("NaN", 1);
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
        {
            return resetAsNaN("NaN", (0.0D / 0.0D));
        }
        _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        continue; /* Loop/switch isn't completed */
_L4:
        _matchToken("Infinity", 1);
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
        {
            return resetAsNaN("Infinity", (1.0D / 0.0D));
        }
        _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        if (true) goto _L1; else goto _L3
_L3:
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOFInValue();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        return _handleInvalidNumberStart(abyte0[i] & 0xff, false);
    }

    protected final void _matchToken(String s, int i)
    {
        int k = s.length();
        int j = i;
        if (_inputPtr + k >= _inputEnd)
        {
            _matchToken2(s, i);
        } else
        {
            do
            {
                if (_inputBuffer[_inputPtr] != s.charAt(j))
                {
                    _reportInvalidToken(s.substring(0, j));
                }
                _inputPtr = _inputPtr + 1;
                i = j + 1;
                j = i;
            } while (i < k);
            j = _inputBuffer[_inputPtr] & 0xff;
            if (j >= 48 && j != 93 && j != 125)
            {
                _checkMatchEnd(s, i, j);
                return;
            }
        }
    }

    protected Name _parseAposName()
    {
        int ai[];
        int ai5[];
        int i;
        int j;
        int k;
        int l;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(": was expecting closing ''' for name");
        }
        ai = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        l = ai[i] & 0xff;
        if (l == 39)
        {
            return BytesToNameCanonicalizer.getEmptyName();
        }
        ai = _quadBuffer;
        ai5 = _icLatin1;
        j = 0;
        k = 0;
        i = 0;
_L2:
        int i1;
        if (l == 39)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = l;
        if (l == 34)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        i1 = l;
        if (ai5[l] == 0)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        byte abyte0[];
        if (l != 92)
        {
            _throwUnquotedSpace(l, "name");
        } else
        {
            l = _decodeEscaped();
        }
        i1 = l;
        if (l <= 127)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        if (j >= 4)
        {
            int ai1[] = ai;
            if (i >= ai.length)
            {
                ai1 = growArrayBy(ai, ai.length);
                _quadBuffer = ai1;
            }
            ai1[i] = k;
            j = 0;
            i++;
            k = 0;
            ai = ai1;
        }
        if (l < 2048)
        {
            k = k << 8 | (l >> 6 | 0xc0);
            j++;
        } else
        {
            k = k << 8 | (l >> 12 | 0xe0);
            j++;
            if (j >= 4)
            {
                int ai2[] = ai;
                if (i >= ai.length)
                {
                    ai2 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai2;
                }
                ai2[i] = k;
                i++;
                ai = ai2;
                j = 0;
                k = 0;
            }
            k = k << 8 | (l >> 6 & 0x3f | 0x80);
            j++;
        }
        i1 = k;
        k = j;
        j = l & 0x3f | 0x80;
        l = k;
_L3:
        if (l < 4)
        {
            k = j | i1 << 8;
            l++;
            j = i;
            i = l;
        } else
        {
            int ai3[] = ai;
            if (i >= ai.length)
            {
                ai3 = growArrayBy(ai, ai.length);
                _quadBuffer = ai3;
            }
            ai3[i] = i1;
            ai = ai3;
            k = 1;
            l = i + 1;
            i = k;
            k = j;
            j = l;
        }
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in field name");
        }
        abyte0 = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        i1 = abyte0[l] & 0xff;
        l = i;
        i = j;
        j = l;
        l = i1;
        if (true) goto _L2; else goto _L1
_L1:
        if (j > 0)
        {
            int ai4[] = ai;
            if (i >= ai.length)
            {
                ai4 = growArrayBy(ai, ai.length);
                _quadBuffer = ai4;
            }
            ai4[i] = k;
            ai = ai4;
            i++;
        }
        Name name = _symbols.findName(ai, i);
        if (name == null)
        {
            return addName(ai, i, j);
        } else
        {
            return name;
        }
        l = j;
        j = i1;
        i1 = k;
          goto _L3
    }

    protected final Name _parseName(int i)
    {
        if (i != 34)
        {
            return _handleOddName(i);
        }
        if (_inputPtr + 9 > _inputEnd)
        {
            return slowParseName();
        }
        byte abyte0[] = _inputBuffer;
        int ai[] = _icLatin1;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i] & 0xff;
        if (ai[i] == 0)
        {
            int j = _inputPtr;
            _inputPtr = j + 1;
            j = abyte0[j] & 0xff;
            if (ai[j] == 0)
            {
                i = i << 8 | j;
                j = _inputPtr;
                _inputPtr = j + 1;
                j = abyte0[j] & 0xff;
                if (ai[j] == 0)
                {
                    i = i << 8 | j;
                    j = _inputPtr;
                    _inputPtr = j + 1;
                    j = abyte0[j] & 0xff;
                    if (ai[j] == 0)
                    {
                        i = i << 8 | j;
                        j = _inputPtr;
                        _inputPtr = j + 1;
                        j = abyte0[j] & 0xff;
                        if (ai[j] == 0)
                        {
                            _quad1 = i;
                            return parseMediumName(j);
                        }
                        if (j == 34)
                        {
                            return findName(i, 4);
                        } else
                        {
                            return parseName(i, j, 4);
                        }
                    }
                    if (j == 34)
                    {
                        return findName(i, 3);
                    } else
                    {
                        return parseName(i, j, 3);
                    }
                }
                if (j == 34)
                {
                    return findName(i, 2);
                } else
                {
                    return parseName(i, j, 2);
                }
            }
            if (j == 34)
            {
                return findName(i, 1);
            } else
            {
                return parseName(i, j, 1);
            }
        }
        if (i == 34)
        {
            return BytesToNameCanonicalizer.getEmptyName();
        } else
        {
            return parseName(0, i, 0);
        }
    }

    protected JsonToken _parseNegNumber()
    {
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        ac[0] = '-';
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        int j = abyte0[i] & 0xff;
        if (j < 48 || j > 57)
        {
            return _handleInvalidNumberStart(j, true);
        }
        i = j;
        if (j == 48)
        {
            i = _verifyNoLeadingZeroes();
        }
        int k = 2;
        ac[1] = (char)i;
        j = (_inputPtr + ac.length) - 2;
        int l;
        if (j > _inputEnd)
        {
            j = _inputEnd;
            i = 1;
        } else
        {
            i = 1;
        }
        do
        {
            if (_inputPtr >= j)
            {
                return _parseNumber2(ac, k, true, i);
            }
            byte abyte1[] = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            l = abyte1[l] & 0xff;
            if (l < 48 || l > 57)
            {
                break;
            }
            i++;
            ac[k] = (char)l;
            k++;
        } while (true);
        if (l == 46 || l == 101 || l == 69)
        {
            return _parseFloat(ac, k, l, true, i);
        }
        _inputPtr = _inputPtr - 1;
        _textBuffer.setCurrentLength(k);
        if (_parsingContext.inRoot())
        {
            _verifyRootSpace(l);
        }
        return resetInt(true, i);
    }

    protected JsonToken _parsePosNumber(int i)
    {
        int k = 1;
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        int j = i;
        if (i == 48)
        {
            j = _verifyNoLeadingZeroes();
        }
        ac[0] = (char)j;
        j = (_inputPtr + ac.length) - 1;
        int l;
        if (j > _inputEnd)
        {
            j = _inputEnd;
            i = 1;
        } else
        {
            i = 1;
        }
        do
        {
            if (_inputPtr >= j)
            {
                return _parseNumber2(ac, k, false, i);
            }
            byte abyte0[] = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            l = abyte0[l] & 0xff;
            if (l < 48 || l > 57)
            {
                break;
            }
            ac[k] = (char)l;
            k++;
            i++;
        } while (true);
        if (l == 46 || l == 101 || l == 69)
        {
            return _parseFloat(ac, k, l, false, i);
        }
        _inputPtr = _inputPtr - 1;
        _textBuffer.setCurrentLength(k);
        if (_parsingContext.inRoot())
        {
            _verifyRootSpace(l);
        }
        return resetInt(false, i);
    }

    protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
    {
        int i;
        int j;
        int l1;
        l1 = abyte0.length;
        j = 0;
        i = 0;
_L13:
        int l;
        int i1;
        int j1;
        do
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte1[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            j1 = abyte1[k] & 0xff;
        } while (j1 <= 32);
        l = base64variant.decodeBase64Char(j1);
        i1 = l;
        if (l >= 0) goto _L2; else goto _L1
_L1:
        i1 = j;
        l = i;
        if (j1 == 34) goto _L4; else goto _L3
_L3:
        i1 = _decodeBase64Escape(base64variant, j1, 0);
        if (i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        byte abyte2[];
        int k1;
        int i2;
        int j2;
        if (i > l1 - 3)
        {
            j += i;
            outputstream.write(abyte0, 0, i);
            l = 0;
            i = j;
        } else
        {
            l = i;
            i = j;
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte2 = _inputBuffer;
        j = _inputPtr;
        _inputPtr = j + 1;
        i2 = abyte2[j] & 0xff;
        k1 = base64variant.decodeBase64Char(i2);
        j = k1;
        if (k1 < 0)
        {
            j = _decodeBase64Escape(base64variant, i2, 1);
        }
        i2 = i1 << 6 | j;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte2 = _inputBuffer;
        j = _inputPtr;
        _inputPtr = j + 1;
        j2 = abyte2[j] & 0xff;
        i1 = base64variant.decodeBase64Char(j2);
        k1 = i1;
        if (i1 >= 0) goto _L6; else goto _L5
_L5:
        j = i1;
        if (i1 == -2) goto _L8; else goto _L7
_L7:
        if (j2 != 34 || base64variant.usesPadding()) goto _L10; else goto _L9
_L9:
        j = l + 1;
        abyte0[l] = (byte)(i2 >> 4);
        l = j;
        i1 = i;
_L4:
        _tokenIncomplete = false;
        i = i1;
        if (l > 0)
        {
            i = i1 + l;
            outputstream.write(abyte0, 0, l);
        }
        return i;
_L10:
        j = _decodeBase64Escape(base64variant, j2, 2);
_L8:
        k1 = j;
        if (j == -2)
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            abyte2 = _inputBuffer;
            j = _inputPtr;
            _inputPtr = j + 1;
            j = abyte2[j] & 0xff;
            if (!base64variant.usesPaddingChar(j))
            {
                throw reportInvalidBase64Char(base64variant, j, 3, (new StringBuilder("expected padding character '")).append(base64variant.getPaddingChar()).append("'").toString());
            }
            i1 = l + 1;
            abyte0[l] = (byte)(i2 >> 4);
            j = i;
            i = i1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i2 = i2 << 6 | k1;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte2 = _inputBuffer;
        j = _inputPtr;
        _inputPtr = j + 1;
        j2 = abyte2[j] & 0xff;
        i1 = base64variant.decodeBase64Char(j2);
        k1 = i1;
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_711;
        }
        j = i1;
        if (i1 == -2)
        {
            break MISSING_BLOCK_LABEL_654;
        }
        if (j2 != 34 || base64variant.usesPadding())
        {
            break; /* Loop/switch isn't completed */
        }
        j = i2 >> 2;
        i1 = l + 1;
        abyte0[l] = (byte)(j >> 8);
        l = i1 + 1;
        abyte0[i1] = (byte)j;
        i1 = i;
        if (true) goto _L4; else goto _L11
_L11:
        j = _decodeBase64Escape(base64variant, j2, 3);
        k1 = j;
        if (j == -2)
        {
            j = i2 >> 2;
            i1 = l + 1;
            abyte0[l] = (byte)(j >> 8);
            l = i1 + 1;
            abyte0[i1] = (byte)j;
            j = i;
            i = l;
            continue; /* Loop/switch isn't completed */
        }
        j = i2 << 6 | k1;
        i1 = l + 1;
        abyte0[l] = (byte)(j >> 16);
        k1 = i1 + 1;
        abyte0[i1] = (byte)(j >> 8);
        l = k1 + 1;
        abyte0[k1] = (byte)j;
        j = i;
        i = l;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected void _releaseBuffers()
    {
        super._releaseBuffers();
        _symbols.release();
        if (_bufferRecyclable)
        {
            byte abyte0[] = _inputBuffer;
            if (abyte0 != null)
            {
                _inputBuffer = null;
                _ioContext.releaseReadIOBuffer(abyte0);
            }
        }
    }

    protected void _reportInvalidChar(int i)
    {
        if (i < 32)
        {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    protected void _reportInvalidInitial(int i)
    {
        _reportError((new StringBuilder("Invalid UTF-8 start byte 0x")).append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i)
    {
        _reportError((new StringBuilder("Invalid UTF-8 middle byte 0x")).append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i, int j)
    {
        _inputPtr = j;
        _reportInvalidOther(i);
    }

    protected void _reportInvalidToken(String s)
    {
        _reportInvalidToken(s, "'null', 'true', 'false' or NaN");
    }

    protected void _reportInvalidToken(String s, String s1)
    {
        s = new StringBuilder(s);
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            char c = (char)_decodeCharForError(abyte0[i]);
            if (!Character.isJavaIdentifierPart(c))
            {
                break;
            }
            s.append(c);
        } while (true);
        _reportError((new StringBuilder("Unrecognized token '")).append(s.toString()).append("': was expecting ").append(s1).toString());
    }

    protected final void _skipCR()
    {
        if ((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == 10)
        {
            _inputPtr = _inputPtr + 1;
        }
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected void _skipString()
    {
        int ai[];
        byte abyte0[];
        _tokenIncomplete = false;
        ai = _icUTF8;
        abyte0 = _inputBuffer;
_L8:
        int i;
        int j;
        int k = _inputPtr;
        int i1 = _inputEnd;
        j = i1;
        i = k;
        if (k >= i1)
        {
            loadMoreGuaranteed();
            i = _inputPtr;
            j = _inputEnd;
        }
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int l;
        l = i + 1;
        i = abyte0[i] & 0xff;
        if (ai[i] == 0) goto _L4; else goto _L3
_L3:
        _inputPtr = l;
        if (i != 34)
        {
            switch (ai[i])
            {
            default:
                if (i < 32)
                {
                    _throwUnquotedSpace(i, "string value");
                } else
                {
                    _reportInvalidChar(i);
                }
                break;

            case 1: // '\001'
                _decodeEscaped();
                break;

            case 2: // '\002'
                _skipUtf8_2(i);
                break;

            case 3: // '\003'
                _skipUtf8_3(i);
                break;

            case 4: // '\004'
                _skipUtf8_4(i);
                break;
            }
        } else
        {
            return;
        }
          goto _L5
_L2:
        _inputPtr = i;
          goto _L5
_L4:
        i = l;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        if (_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
        {
            _reportError((new StringBuilder("Current token (")).append(_currToken).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
        }
        if (!_tokenIncomplete) goto _L2; else goto _L1
_L1:
        try
        {
            _binaryValue = _decodeBase64(base64variant);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw _constructError((new StringBuilder("Failed to decode VALUE_STRING as base64 (")).append(base64variant).append("): ").append(illegalargumentexception.getMessage()).toString());
        }
        _tokenIncomplete = false;
_L4:
        return _binaryValue;
_L2:
        if (_binaryValue == null)
        {
            ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), bytearraybuilder, base64variant);
            _binaryValue = bytearraybuilder.toByteArray();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public JsonLocation getCurrentLocation()
    {
        int i = _inputPtr;
        int j = _currInputRowStart;
        return new JsonLocation(_ioContext.getSourceReference(), _currInputProcessed + (long)_inputPtr, -1L, _currInputRow, (i - j) + 1);
    }

    public String getText()
    {
        if (_currToken == JsonToken.VALUE_STRING)
        {
            if (_tokenIncomplete)
            {
                _tokenIncomplete = false;
                _finishString();
            }
            return _textBuffer.contentsAsString();
        } else
        {
            return _getText2(_currToken);
        }
    }

    public char[] getTextCharacters()
    {
        if (_currToken == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        _currToken.id();
        JVM INSTR tableswitch 5 8: default 44
    //                   5 52
    //                   6 131
    //                   7 147
    //                   8 147;
           goto _L1 _L2 _L3 _L4 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        return _currToken.asCharArray();
_L2:
        if (_nameCopied) goto _L6; else goto _L5
_L5:
        String s;
        int i;
        s = _parsingContext.getCurrentName();
        i = s.length();
        if (_nameCopyBuffer != null) goto _L8; else goto _L7
_L7:
        _nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
_L10:
        s.getChars(0, i, _nameCopyBuffer, 0);
        _nameCopied = true;
_L6:
        return _nameCopyBuffer;
_L8:
        if (_nameCopyBuffer.length < i)
        {
            _nameCopyBuffer = new char[i];
        }
        if (true) goto _L10; else goto _L9
_L9:
        break; /* Loop/switch isn't completed */
_L3:
        if (_tokenIncomplete)
        {
            _tokenIncomplete = false;
            _finishString();
        }
        return _textBuffer.getTextBuffer();
        return null;
    }

    public int getTextLength()
    {
label0:
        {
label1:
            {
label2:
                {
                    int i = 0;
                    if (_currToken != null)
                    {
                        switch (_currToken.id())
                        {
                        default:
                            i = _currToken.asCharArray().length;
                            break;

                        case 5: // '\005'
                            break label2;

                        case 6: // '\006'
                            break label1;

                        case 7: // '\007'
                        case 8: // '\b'
                            break label0;
                        }
                    }
                    return i;
                }
                return _parsingContext.getCurrentName().length();
            }
            if (_tokenIncomplete)
            {
                _tokenIncomplete = false;
                _finishString();
            }
        }
        return _textBuffer.size();
    }

    public int getTextOffset()
    {
        if (_currToken == null) goto _L2; else goto _L1
_L1:
        _currToken.id();
        JVM INSTR tableswitch 5 8: default 44
    //                   5 44
    //                   6 46
    //                   7 62
    //                   8 62;
           goto _L2 _L2 _L3 _L4 _L4
_L2:
        return 0;
_L3:
        if (_tokenIncomplete)
        {
            _tokenIncomplete = false;
            _finishString();
        }
_L4:
        return _textBuffer.getTextOffset();
    }

    public JsonLocation getTokenLocation()
    {
        return new JsonLocation(_ioContext.getSourceReference(), getTokenCharacterOffset(), -1L, getTokenLineNr(), getTokenColumnNr());
    }

    public String getValueAsString()
    {
        if (_currToken == JsonToken.VALUE_STRING)
        {
            if (_tokenIncomplete)
            {
                _tokenIncomplete = false;
                _finishString();
            }
            return _textBuffer.contentsAsString();
        } else
        {
            return super.getValueAsString(null);
        }
    }

    public String getValueAsString(String s)
    {
        if (_currToken == JsonToken.VALUE_STRING)
        {
            if (_tokenIncomplete)
            {
                _tokenIncomplete = false;
                _finishString();
            }
            return _textBuffer.contentsAsString();
        } else
        {
            return super.getValueAsString(s);
        }
    }

    protected final boolean loadMore()
    {
        boolean flag1 = false;
        _currInputProcessed = _currInputProcessed + (long)_inputEnd;
        _currInputRowStart = _currInputRowStart - _inputEnd;
        boolean flag = flag1;
        if (_inputStream != null)
        {
            int i = _inputStream.read(_inputBuffer, 0, _inputBuffer.length);
            if (i > 0)
            {
                _inputPtr = 0;
                _inputEnd = i;
                flag = true;
            } else
            {
                _closeInput();
                flag = flag1;
                if (i == 0)
                {
                    throw new IOException((new StringBuilder("InputStream.read() returned 0 characters when trying to read ")).append(_inputBuffer.length).append(" bytes").toString());
                }
            }
        }
        return flag;
    }

    public JsonToken nextToken()
    {
        int i;
        _numTypesValid = 0;
        if (_currToken == JsonToken.FIELD_NAME)
        {
            return _nextAfterName();
        }
        if (_tokenIncomplete)
        {
            _skipString();
        }
        int j = _skipWSOrEnd();
        if (j < 0)
        {
            close();
            _currToken = null;
            return null;
        }
        _tokenInputTotal = (_currInputProcessed + (long)_inputPtr) - 1L;
        _tokenInputRow = _currInputRow;
        _tokenInputCol = _inputPtr - _currInputRowStart - 1;
        _binaryValue = null;
        if (j == 93)
        {
            if (!_parsingContext.inArray())
            {
                _reportMismatchedEndMarker(j, '}');
            }
            _parsingContext = _parsingContext.getParent();
            JsonToken jsontoken = JsonToken.END_ARRAY;
            _currToken = jsontoken;
            return jsontoken;
        }
        if (j == 125)
        {
            if (!_parsingContext.inObject())
            {
                _reportMismatchedEndMarker(j, ']');
            }
            _parsingContext = _parsingContext.getParent();
            JsonToken jsontoken1 = JsonToken.END_OBJECT;
            _currToken = jsontoken1;
            return jsontoken1;
        }
        i = j;
        if (_parsingContext.expectComma())
        {
            if (j != 44)
            {
                _reportUnexpectedChar(j, (new StringBuilder("was expecting comma to separate ")).append(_parsingContext.getTypeDesc()).append(" entries").toString());
            }
            i = _skipWS();
        }
        if (!_parsingContext.inObject())
        {
            return _nextTokenNotInObject(i);
        }
        Name name = _parseName(i);
        _parsingContext.setCurrentName(name.getName());
        _currToken = JsonToken.FIELD_NAME;
        i = _skipColon();
        if (i == 34)
        {
            _tokenIncomplete = true;
            _nextToken = JsonToken.VALUE_STRING;
            return _currToken;
        }
        i;
        JVM INSTR lookupswitch 16: default 448
    //                   45: 464
    //                   48: 472
    //                   49: 472
    //                   50: 472
    //                   51: 472
    //                   52: 472
    //                   53: 472
    //                   54: 472
    //                   55: 472
    //                   56: 472
    //                   57: 472
    //                   91: 523
    //                   102: 481
    //                   110: 495
    //                   116: 509
    //                   123: 530;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        JsonToken jsontoken2 = _handleUnexpectedValue(i);
_L10:
        _nextToken = jsontoken2;
        return _currToken;
_L2:
        jsontoken2 = _parseNegNumber();
        continue; /* Loop/switch isn't completed */
_L3:
        jsontoken2 = _parsePosNumber(i);
        continue; /* Loop/switch isn't completed */
_L5:
        _matchToken("false", 1);
        jsontoken2 = JsonToken.VALUE_FALSE;
        continue; /* Loop/switch isn't completed */
_L6:
        _matchToken("null", 1);
        jsontoken2 = JsonToken.VALUE_NULL;
        continue; /* Loop/switch isn't completed */
_L7:
        _matchToken("true", 1);
        jsontoken2 = JsonToken.VALUE_TRUE;
        continue; /* Loop/switch isn't completed */
_L4:
        jsontoken2 = JsonToken.START_ARRAY;
        continue; /* Loop/switch isn't completed */
_L8:
        jsontoken2 = JsonToken.START_OBJECT;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected final Name parseEscapedName(int ai[], int i, int j, int k, int l)
    {
        int ai4[] = _icLatin1;
_L2:
        int i1;
        i1 = k;
        if (ai4[k] == 0)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        if (k == 34)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[];
        int j1;
        if (k != 92)
        {
            _throwUnquotedSpace(k, "name");
        } else
        {
            k = _decodeEscaped();
        }
        i1 = k;
        if (k <= 127)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        if (l >= 4)
        {
            int ai1[] = ai;
            if (i >= ai.length)
            {
                ai1 = growArrayBy(ai, ai.length);
                _quadBuffer = ai1;
            }
            i1 = i + 1;
            ai1[i] = j;
            l = 0;
            j = 0;
            ai = ai1;
            i = i1;
        }
        if (k < 2048)
        {
            i1 = k >> 6 | 0xc0 | j << 8;
            l++;
            j = i;
            i = i1;
        } else
        {
            i1 = k >> 12 | 0xe0 | j << 8;
            j = l + 1;
            int ai3[];
            Name name;
            if (j >= 4)
            {
                int ai2[] = ai;
                if (i >= ai.length)
                {
                    ai2 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai2;
                }
                ai2[i] = i1;
                i++;
                ai = ai2;
                j = 0;
                l = 0;
            } else
            {
                l = i1;
            }
            i1 = l << 8 | (k >> 6 & 0x3f | 0x80);
            l = j + 1;
            j = i;
            i = i1;
        }
        j1 = k & 0x3f | 0x80;
        i1 = l;
        k = j;
        l = i;
        j = j1;
        i = k;
        k = l;
_L3:
        if (i1 < 4)
        {
            l = i1 + 1;
            j |= k << 8;
        } else
        {
            ai3 = ai;
            if (i >= ai.length)
            {
                ai3 = growArrayBy(ai, ai.length);
                _quadBuffer = ai3;
            }
            ai3[i] = k;
            l = 1;
            i++;
            ai = ai3;
        }
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in field name");
        }
        abyte0 = _inputBuffer;
        k = _inputPtr;
        _inputPtr = k + 1;
        k = abyte0[k] & 0xff;
        if (true) goto _L2; else goto _L1
_L1:
        ai3 = ai;
        k = i;
        if (l > 0)
        {
            ai3 = ai;
            if (i >= ai.length)
            {
                ai3 = growArrayBy(ai, ai.length);
                _quadBuffer = ai3;
            }
            ai3[i] = j;
            k = i + 1;
        }
        name = _symbols.findName(ai3, k);
        ai = name;
        if (name == null)
        {
            ai = addName(ai3, k, l);
        }
        return ai;
        k = j;
        j = i1;
        i1 = l;
          goto _L3
    }

    protected final Name parseLongName(int i, int j)
    {
        _quadBuffer[0] = _quad1;
        _quadBuffer[1] = j;
        byte abyte0[] = _inputBuffer;
        int ai[] = _icLatin1;
        byte byte0 = 2;
        j = i;
        for (i = byte0; _inputPtr + 4 <= _inputEnd; i++)
        {
            int k = _inputPtr;
            _inputPtr = k + 1;
            k = abyte0[k] & 0xff;
            if (ai[k] != 0)
            {
                if (k == 34)
                {
                    return findName(_quadBuffer, i, j, 1);
                } else
                {
                    return parseEscapedName(_quadBuffer, i, j, k, 1);
                }
            }
            j = j << 8 | k;
            k = _inputPtr;
            _inputPtr = k + 1;
            k = abyte0[k] & 0xff;
            if (ai[k] != 0)
            {
                if (k == 34)
                {
                    return findName(_quadBuffer, i, j, 2);
                } else
                {
                    return parseEscapedName(_quadBuffer, i, j, k, 2);
                }
            }
            j = j << 8 | k;
            k = _inputPtr;
            _inputPtr = k + 1;
            k = abyte0[k] & 0xff;
            if (ai[k] != 0)
            {
                if (k == 34)
                {
                    return findName(_quadBuffer, i, j, 3);
                } else
                {
                    return parseEscapedName(_quadBuffer, i, j, k, 3);
                }
            }
            k = j << 8 | k;
            j = _inputPtr;
            _inputPtr = j + 1;
            j = abyte0[j] & 0xff;
            if (ai[j] != 0)
            {
                if (j == 34)
                {
                    return findName(_quadBuffer, i, k, 4);
                } else
                {
                    return parseEscapedName(_quadBuffer, i, k, j, 4);
                }
            }
            if (i >= _quadBuffer.length)
            {
                _quadBuffer = growArrayBy(_quadBuffer, i);
            }
            _quadBuffer[i] = k;
        }

        return parseEscapedName(_quadBuffer, i, 0, j, 0);
    }

    protected final Name parseMediumName(int i)
    {
        byte abyte0[] = _inputBuffer;
        int ai[] = _icLatin1;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j] & 0xff;
        if (ai[j] != 0)
        {
            if (j == 34)
            {
                return findName(_quad1, i, 1);
            } else
            {
                return parseName(_quad1, i, j, 1);
            }
        }
        i = j | i << 8;
        j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j] & 0xff;
        if (ai[j] != 0)
        {
            if (j == 34)
            {
                return findName(_quad1, i, 2);
            } else
            {
                return parseName(_quad1, i, j, 2);
            }
        }
        i = i << 8 | j;
        j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j] & 0xff;
        if (ai[j] != 0)
        {
            if (j == 34)
            {
                return findName(_quad1, i, 3);
            } else
            {
                return parseName(_quad1, i, j, 3);
            }
        }
        i = i << 8 | j;
        j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j] & 0xff;
        if (ai[j] != 0)
        {
            if (j == 34)
            {
                return findName(_quad1, i, 4);
            } else
            {
                return parseName(_quad1, i, j, 4);
            }
        } else
        {
            return parseLongName(j, i);
        }
    }

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
    {
        byte abyte0[];
        if (!_tokenIncomplete || _currToken != JsonToken.VALUE_STRING)
        {
            base64variant = getBinaryValue(base64variant);
            outputstream.write(base64variant);
            return base64variant.length;
        }
        abyte0 = _ioContext.allocBase64Buffer();
        int i = _readBinary(base64variant, outputstream, abyte0);
        _ioContext.releaseBase64Buffer(abyte0);
        return i;
        base64variant;
        _ioContext.releaseBase64Buffer(abyte0);
        throw base64variant;
    }

    protected Name slowParseName()
    {
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(": was expecting closing '\"' for name");
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i] & 0xff;
        if (i == 34)
        {
            return BytesToNameCanonicalizer.getEmptyName();
        } else
        {
            return parseEscapedName(_quadBuffer, 0, 0, i, 0);
        }
    }

}
