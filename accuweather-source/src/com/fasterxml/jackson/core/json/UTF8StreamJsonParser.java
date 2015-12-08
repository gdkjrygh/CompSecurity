// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
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

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonReadContext, CoreVersion

public final class UTF8StreamJsonParser extends ParserBase
{

    static final byte BYTE_LF = 10;
    private static final int sInputCodesLatin1[] = CharTypes.getInputCodeLatin1();
    private static final int sInputCodesUtf8[] = CharTypes.getInputCodeUtf8();
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
        _bufferRecyclable = flag;
    }

    private int _decodeUtf8_2(int i)
        throws IOException, JsonParseException
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
        return (i & 0x1f) << 6 | j & 0x3f;
    }

    private int _decodeUtf8_3(int i)
        throws IOException, JsonParseException
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

    private int _decodeUtf8_3fast(int i)
        throws IOException, JsonParseException
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

    private int _decodeUtf8_4(int i)
        throws IOException, JsonParseException
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
        return ((((i & 7) << 6 | j & 0x3f) << 6 | k & 0x3f) << 6 | l & 0x3f) - 0x10000;
    }

    private void _finishString2(char ac[], int i)
        throws IOException, JsonParseException
    {
label0:
        {
label1:
            {
label2:
                {
                    int ai[] = sInputCodesUtf8;
                    byte abyte0[] = _inputBuffer;
                    char ac1[] = ac;
label3:
                    do
                    {
                        {
                            int j;
label4:
                            {
                                int k = _inputPtr;
                                j = k;
                                if (k >= _inputEnd)
                                {
                                    loadMoreGuaranteed();
                                    j = _inputPtr;
                                }
                                ac = ac1;
                                k = i;
                                if (i >= ac1.length)
                                {
                                    ac = _textBuffer.finishCurrentSegment();
                                    k = 0;
                                }
                                int j1 = Math.min(_inputEnd, (ac.length - k) + j);
                                i = k;
                                do
                                {
                                    if (j >= j1)
                                    {
                                        break;
                                    }
                                    int l = j + 1;
                                    j = abyte0[j] & 0xff;
                                    if (ai[j] != 0)
                                    {
                                        _inputPtr = l;
                                        if (j == 34)
                                        {
                                            _textBuffer.setCurrentLength(i);
                                            return;
                                        }
                                        break label4;
                                    }
                                    ac[i] = (char)j;
                                    j = l;
                                    i++;
                                } while (true);
                                _inputPtr = j;
                                ac1 = ac;
                                continue;
                            }
                            int i1;
                            switch (ai[j])
                            {
                            default:
                                if (j < 32)
                                {
                                    _throwUnquotedSpace(j, "string value");
                                } else
                                {
                                    _reportInvalidChar(j);
                                }
                                break;

                            case 1: // '\001'
                                break label3;

                            case 2: // '\002'
                                break label2;

                            case 3: // '\003'
                                break label1;

                            case 4: // '\004'
                                break label0;
                            }
                        }
                        ac1 = ac;
                        i1 = i;
                        if (i >= ac.length)
                        {
                            ac1 = _textBuffer.finishCurrentSegment();
                            i1 = 0;
                        }
                        ac1[i1] = (char)j;
                        i = i1 + 1;
                    } while (true);
                    j = _decodeEscaped();
                    break MISSING_BLOCK_LABEL_215;
                }
                j = _decodeUtf8_2(j);
                break MISSING_BLOCK_LABEL_215;
            }
            if (_inputEnd - _inputPtr >= 2)
            {
                j = _decodeUtf8_3fast(j);
            } else
            {
                j = _decodeUtf8_3(j);
            }
            break MISSING_BLOCK_LABEL_215;
        }
        i1 = _decodeUtf8_4(j);
        j = i + 1;
        ac[i] = (char)(0xd800 | i1 >> 10);
        ac1 = ac;
        i = j;
        if (j >= ac.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            i = 0;
        }
        j = 0xdc00 | i1 & 0x3ff;
        ac = ac1;
        break MISSING_BLOCK_LABEL_215;
    }

    private boolean _isNextTokenNameMaybe(int i, SerializableString serializablestring)
        throws IOException, JsonParseException
    {
        boolean flag;
        String s = _parseFieldName(i).getName();
        _parsingContext.setCurrentName(s);
        flag = s.equals(serializablestring.getValue());
        _currToken = JsonToken.FIELD_NAME;
        i = _skipWS();
        if (i != 58)
        {
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
        i = _skipWS();
        if (i == 34)
        {
            _tokenIncomplete = true;
            _nextToken = JsonToken.VALUE_STRING;
            return flag;
        }
        i;
        JVM INSTR lookupswitch 18: default 236
    //                   45: 313
    //                   48: 313
    //                   49: 313
    //                   50: 313
    //                   51: 313
    //                   52: 313
    //                   53: 313
    //                   54: 313
    //                   55: 313
    //                   56: 313
    //                   57: 313
    //                   91: 250
    //                   93: 264
    //                   102: 285
    //                   110: 299
    //                   116: 271
    //                   123: 257
    //                   125: 264;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L1:
        serializablestring = _handleUnexpectedValue(i);
_L10:
        _nextToken = serializablestring;
        return flag;
_L3:
        serializablestring = JsonToken.START_ARRAY;
        continue; /* Loop/switch isn't completed */
_L8:
        serializablestring = JsonToken.START_OBJECT;
        continue; /* Loop/switch isn't completed */
_L4:
        _reportUnexpectedChar(i, "expected a value");
_L7:
        _matchToken("true", 1);
        serializablestring = JsonToken.VALUE_TRUE;
        continue; /* Loop/switch isn't completed */
_L5:
        _matchToken("false", 1);
        serializablestring = JsonToken.VALUE_FALSE;
        continue; /* Loop/switch isn't completed */
_L6:
        _matchToken("null", 1);
        serializablestring = JsonToken.VALUE_NULL;
        continue; /* Loop/switch isn't completed */
_L2:
        serializablestring = parseNumberText(i);
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void _isNextTokenNameYes()
        throws IOException, JsonParseException
    {
        int i;
label0:
        {
            if (_inputPtr >= _inputEnd || _inputBuffer[_inputPtr] != 58)
            {
                break MISSING_BLOCK_LABEL_310;
            }
            _inputPtr = _inputPtr + 1;
            byte abyte0[] = _inputBuffer;
            i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i];
            if (i == 34)
            {
                _tokenIncomplete = true;
                _nextToken = JsonToken.VALUE_STRING;
                return;
            }
            if (i == 123)
            {
                _nextToken = JsonToken.START_OBJECT;
                return;
            }
            if (i == 91)
            {
                _nextToken = JsonToken.START_ARRAY;
                return;
            }
            int j = i & 0xff;
            if (j > 32)
            {
                i = j;
                if (j != 47)
                {
                    break label0;
                }
            }
            _inputPtr = _inputPtr - 1;
            i = _skipWS();
        }
_L1:
        switch (i)
        {
        default:
            _nextToken = _handleUnexpectedValue(i);
            return;

        case 34: // '"'
            _tokenIncomplete = true;
            _nextToken = JsonToken.VALUE_STRING;
            return;

        case 91: // '['
            _nextToken = JsonToken.START_ARRAY;
            return;

        case 123: // '{'
            _nextToken = JsonToken.START_OBJECT;
            return;

        case 93: // ']'
        case 125: // '}'
            _reportUnexpectedChar(i, "expected a value");
            // fall through

        case 116: // 't'
            _matchToken("true", 1);
            _nextToken = JsonToken.VALUE_TRUE;
            return;

        case 102: // 'f'
            _matchToken("false", 1);
            _nextToken = JsonToken.VALUE_FALSE;
            return;

        case 110: // 'n'
            _matchToken("null", 1);
            _nextToken = JsonToken.VALUE_NULL;
            return;

        case 45: // '-'
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
            _nextToken = parseNumberText(i);
            return;
        }
        i = _skipColon();
          goto _L1
    }

    private JsonToken _nextAfterName()
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

    private JsonToken _nextTokenNotInObject(int i)
        throws IOException, JsonParseException
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

        case 93: // ']'
        case 125: // '}'
            _reportUnexpectedChar(i, "expected a value");
            // fall through

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
            JsonToken jsontoken7 = parseNumberText(i);
            _currToken = jsontoken7;
            return jsontoken7;
        }
    }

    private JsonToken _parseFloatText(char ac[], int i, int j, boolean flag, int k)
        throws IOException, JsonParseException
    {
        char ac1[];
        int l;
        int i1;
        int k1;
        int l1;
        int i2;
        int j2;
        i2 = 0;
        k1 = 0;
        l = 0;
        j2 = 0;
        ac1 = ac;
        i1 = i;
        l1 = j;
        if (j != 46) goto _L2; else goto _L1
_L1:
        int j1;
        ac[i] = (char)j;
        i++;
        j1 = j;
        j = k1;
_L9:
        if (_inputPtr < _inputEnd || loadMore()) goto _L4; else goto _L3
_L3:
        k1 = 1;
_L6:
        l = k1;
        i2 = j;
        ac1 = ac;
        i1 = i;
        l1 = j1;
        if (j == 0)
        {
            reportUnexpectedNumberChar(j1, "Decimal point not followed by a digit");
            l1 = j1;
            i1 = i;
            ac1 = ac;
            i2 = j;
            l = k1;
        }
_L2:
label0:
        {
            {
                j1 = 0;
                k1 = 0;
                if (l1 != 101)
                {
                    i = l;
                    j2 = i1;
                    if (l1 != 69)
                    {
                        break label0;
                    }
                }
                ac = ac1;
                j = i1;
                if (i1 >= ac1.length)
                {
                    ac = _textBuffer.finishCurrentSegment();
                    j = 0;
                }
                i = j + 1;
                ac[j] = (char)l1;
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                ac1 = _inputBuffer;
                j = _inputPtr;
                _inputPtr = j + 1;
                j = ac1[j] & 0xff;
                if (j == 45 || j == 43)
                {
                    if (i >= ac.length)
                    {
                        ac = _textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    ac[i] = (char)j;
                    if (_inputPtr >= _inputEnd)
                    {
                        loadMoreGuaranteed();
                    }
                    ac1 = _inputBuffer;
                    j = _inputPtr;
                    _inputPtr = j + 1;
                    j = ac1[j] & 0xff;
                    i++;
                    j1 = k1;
                } else
                {
                    j1 = k1;
                }
            }
            l1 = l;
            k1 = j1;
            i1 = i;
            if (j <= 57)
            {
                l1 = l;
                k1 = j1;
                i1 = i;
                if (j >= 48)
                {
                    j1++;
                    ac1 = ac;
                    i1 = i;
                    if (i >= ac.length)
                    {
                        ac1 = _textBuffer.finishCurrentSegment();
                        i1 = 0;
                    }
                    i = i1 + 1;
                    ac1[i1] = (char)j;
                    if (_inputPtr < _inputEnd || loadMore())
                    {
                        break MISSING_BLOCK_LABEL_582;
                    }
                    l1 = 1;
                    i1 = i;
                    k1 = j1;
                }
            }
            i = l1;
            j1 = k1;
            j2 = i1;
            if (k1 == 0)
            {
                reportUnexpectedNumberChar(j, "Exponent indicator not followed by a digit");
                j2 = i1;
                j1 = k1;
                i = l1;
            }
        }
        if (i == 0)
        {
            _inputPtr = _inputPtr - 1;
        }
        _textBuffer.setCurrentLength(j2);
        return resetFloat(flag, k, i2, j1);
_L4:
        ac1 = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        l = ac1[l] & 0xff;
        k1 = j2;
        j1 = l;
        if (l < 48) goto _L6; else goto _L5
_L5:
        k1 = j2;
        j1 = l;
        if (l > 57) goto _L6; else goto _L7
_L7:
        i1 = j + 1;
        ac1 = ac;
        j = i;
        if (i >= ac.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            j = 0;
        }
        ac1[j] = (char)l;
        i = j + 1;
        j = i1;
        ac = ac1;
        j1 = l;
        if (true) goto _L9; else goto _L8
_L8:
        ac = _inputBuffer;
        j = _inputPtr;
        _inputPtr = j + 1;
        j = ac[j] & 0xff;
        ac = ac1;
        break MISSING_BLOCK_LABEL_295;
    }

    private JsonToken _parserNumber2(char ac[], int i, boolean flag, int j)
        throws IOException, JsonParseException
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _textBuffer.setCurrentLength(i);
                return resetInt(flag, j);
            }
            char ac1[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            int l = ac1[k] & 0xff;
            if (l > 57 || l < 48)
            {
                if (l == 46 || l == 101 || l == 69)
                {
                    return _parseFloatText(ac, i, l, flag, j);
                } else
                {
                    _inputPtr = _inputPtr - 1;
                    _textBuffer.setCurrentLength(i);
                    return resetInt(flag, j);
                }
            }
            ac1 = ac;
            k = i;
            if (i >= ac.length)
            {
                ac1 = _textBuffer.finishCurrentSegment();
                k = 0;
            }
            ac1[k] = (char)l;
            j++;
            i = k + 1;
            ac = ac1;
        } while (true);
    }

    private void _skipCComment()
        throws IOException, JsonParseException
    {
        int ai[] = CharTypes.getInputCodeComment();
_L12:
        if (_inputPtr >= _inputEnd && !loadMore()) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i] & 0xff;
        j = ai[i];
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j;
        JVM INSTR lookupswitch 6: default 116
    //                   2: 189
    //                   3: 197
    //                   4: 205
    //                   10: 175
    //                   13: 182
    //                   42: 124;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        _reportInvalidChar(i);
        continue; /* Loop/switch isn't completed */
_L9:
        if (_inputPtr < _inputEnd || loadMore()) goto _L10; else goto _L2
_L2:
        _reportInvalidEOF(" in a comment");
        return;
_L10:
        if (_inputBuffer[_inputPtr] == 47)
        {
            _inputPtr = _inputPtr + 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        _skipLF();
        continue; /* Loop/switch isn't completed */
_L8:
        _skipCR();
        continue; /* Loop/switch isn't completed */
_L4:
        _skipUtf8_2(i);
        continue; /* Loop/switch isn't completed */
_L5:
        _skipUtf8_3(i);
        continue; /* Loop/switch isn't completed */
_L6:
        _skipUtf8_4(i);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private int _skipColon()
        throws IOException, JsonParseException
    {
        int i;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if (i != 58) goto _L2; else goto _L1
_L1:
        if (_inputPtr < _inputEnd)
        {
            i = _inputBuffer[_inputPtr] & 0xff;
            if (i > 32 && i != 47)
            {
                _inputPtr = _inputPtr + 1;
                return i;
            }
        }
          goto _L3
_L2:
        i &= 0xff;
_L14:
        i;
        JVM INSTR lookupswitch 5: default 148
    //                   9: 233
    //                   10: 276
    //                   13: 229
    //                   32: 233
    //                   47: 283;
           goto _L4 _L5 _L6 _L7 _L5 _L8
_L4:
        if (i < 32)
        {
            _throwInvalidSpace(i);
        }
        if (i != 58)
        {
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
_L3:
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte1[i] & 0xff;
        if (i <= 32) goto _L10; else goto _L9
_L9:
        if (i != 47)
        {
            return i;
        }
          goto _L11
_L7:
        _skipCR();
_L5:
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte2[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte2[i] & 0xff;
        continue; /* Loop/switch isn't completed */
_L6:
        _skipLF();
        continue; /* Loop/switch isn't completed */
_L8:
        _skipComment();
        if (true) goto _L5; else goto _L11
_L11:
        _skipComment();
        continue; /* Loop/switch isn't completed */
_L10:
        if (i != 32)
        {
            if (i == 10)
            {
                _skipLF();
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
        if (true) goto _L3; else goto _L12
_L12:
        throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void _skipComment()
        throws IOException, JsonParseException
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
            _skipCppComment();
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

    private void _skipCppComment()
        throws IOException, JsonParseException
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
                                    _reportInvalidChar(i);
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
                                    _skipLF();
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

    private void _skipUtf8_2(int i)
        throws IOException, JsonParseException
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

    private void _skipUtf8_3(int i)
        throws IOException, JsonParseException
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

    private void _skipUtf8_4(int i)
        throws IOException, JsonParseException
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

    private int _skipWS()
        throws IOException, JsonParseException
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
                if (i != 47)
                {
                    return i;
                }
                _skipComment();
            } else
            if (i != 32)
            {
                if (i == 10)
                {
                    _skipLF();
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
        throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
    }

    private int _skipWSOrEnd()
        throws IOException, JsonParseException
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
                if (i != 47)
                {
                    return i;
                }
                _skipComment();
            } else
            if (i != 32)
            {
                if (i == 10)
                {
                    _skipLF();
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
        _handleEOF();
        return -1;
    }

    private int _verifyNoLeadingZeroes()
        throws IOException, JsonParseException
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

    private Name addName(int ai[], int i, int j)
        throws JsonParseException
    {
        char ac[];
        int k;
        int l;
        int j1;
        int k1;
        int i2;
        int j2 = ((i << 2) - 4) + j;
        char ac1[];
        int i1;
        int l1;
        if (j < 4)
        {
            i2 = ai[i - 1];
            ai[i - 1] = i2 << (4 - j << 3);
        } else
        {
            i2 = 0;
        }
        ac = _textBuffer.emptyAndGetCurrentSegment();
        k = 0;
        j1 = 0;
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
        i1 -= 0x10000;
        ac1 = ac;
        if (j1 >= ac.length)
        {
            ac1 = _textBuffer.expandCurrentSegment();
        }
        l = j1 + 1;
        ac1[j1] = (char)(55296 + (i1 >> 10));
        l1 = 0xdc00 | i1 & 0x3ff;
        ac = ac1;
_L4:
        ac1 = ac;
        if (l >= ac.length)
        {
            ac1 = _textBuffer.expandCurrentSegment();
        }
        j1 = l + 1;
        ac1[l] = (char)l1;
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
        l = j1;
        k = k1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Name findName(int i, int j)
        throws JsonParseException
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

    private Name findName(int i, int j, int k)
        throws JsonParseException
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

    private Name findName(int ai[], int i, int j, int k)
        throws JsonParseException
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
            int j = ai.length;
            int ai1[] = new int[j + i];
            System.arraycopy(ai, 0, ai1, 0, j);
            return ai1;
        }
    }

    private int nextByte()
        throws IOException, JsonParseException
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

    private Name parseFieldName(int i, int j, int k)
        throws IOException, JsonParseException
    {
        return parseEscapedFieldName(_quadBuffer, 0, i, j, k);
    }

    private Name parseFieldName(int i, int j, int k, int l)
        throws IOException, JsonParseException
    {
        _quadBuffer[0] = i;
        return parseEscapedFieldName(_quadBuffer, 1, j, k, l);
    }

    protected void _closeInput()
        throws IOException
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

    protected byte[] _decodeBase64(Base64Variant base64variant)
        throws IOException, JsonParseException
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
            j1 = j << 6 | l;
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
                        throw reportInvalidBase64Char(base64variant, j, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
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
            bytearraybuilder.appendThreeBytes(j1 << 6 | i1);
        } while (true);
    }

    protected int _decodeCharForError(int i)
        throws IOException, JsonParseException
    {
        int j = i;
        if (i < 0)
        {
            int k;
            if ((i & 0xe0) == 192)
            {
                j = i & 0x1f;
                i = 1;
            } else
            if ((i & 0xf0) == 224)
            {
                j = i & 0xf;
                i = 2;
            } else
            if ((i & 0xf8) == 240)
            {
                j = i & 7;
                i = 3;
            } else
            {
                _reportInvalidInitial(i & 0xff);
                boolean flag = true;
                j = i;
                i = ((flag) ? 1 : 0);
            }
            k = nextByte();
            if ((k & 0xc0) != 128)
            {
                _reportInvalidOther(k & 0xff);
            }
            k = j << 6 | k & 0x3f;
            j = k;
            if (i > 1)
            {
                j = nextByte();
                if ((j & 0xc0) != 128)
                {
                    _reportInvalidOther(j & 0xff);
                }
                k = k << 6 | j & 0x3f;
                j = k;
                if (i > 2)
                {
                    i = nextByte();
                    if ((i & 0xc0) != 128)
                    {
                        _reportInvalidOther(i & 0xff);
                    }
                    j = k << 6 | i & 0x3f;
                }
            }
        }
        return j;
    }

    protected char _decodeEscaped()
        throws IOException, JsonParseException
    {
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in character escape sequence");
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        int k;
        switch (i)
        {
        default:
            return _handleUnrecognizedCharacterEscape((char)_decodeCharForError(i));

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
            return (char)i;

        case 117: // 'u'
            k = 0;
            break;
        }
        for (int j = 0; j < 4; j++)
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOF(" in character escape sequence");
            }
            byte abyte1[] = _inputBuffer;
            int l = _inputPtr;
            _inputPtr = l + 1;
            l = abyte1[l];
            int i1 = CharTypes.charToHex(l);
            if (i1 < 0)
            {
                _reportUnexpectedChar(l, "expected a hex-digit for character escape sequence");
            }
            k = k << 4 | i1;
        }

        return (char)k;
    }

    protected void _finishString()
        throws IOException, JsonParseException
    {
        int j = _inputPtr;
        int i = j;
        if (j >= _inputEnd)
        {
            loadMoreGuaranteed();
            i = _inputPtr;
        }
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        int ai[] = sInputCodesUtf8;
        int l = Math.min(_inputEnd, ac.length + i);
        byte abyte0[] = _inputBuffer;
        boolean flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (j >= l)
            {
                break;
            }
            int k = abyte0[j] & 0xff;
            if (ai[k] != 0)
            {
                if (k == 34)
                {
                    _inputPtr = j + 1;
                    _textBuffer.setCurrentLength(i);
                    return;
                }
                break;
            }
            j++;
            ac[i] = (char)k;
            i++;
        } while (true);
        _inputPtr = j;
        _finishString2(ac, i);
    }

    protected String _getText2(JsonToken jsontoken)
    {
        if (jsontoken == null)
        {
            return null;
        }
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            return jsontoken.asString();

        case 1: // '\001'
            return _parsingContext.getCurrentName();

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return _textBuffer.contentsAsString();
        }
    }

    protected JsonToken _handleApostropheValue()
        throws IOException, JsonParseException
    {
        char ac1[];
        int ai[];
        byte abyte0[];
        int i;
        i = 0;
        ac1 = _textBuffer.emptyAndGetCurrentSegment();
        ai = sInputCodesUtf8;
        abyte0 = _inputBuffer;
_L7:
        char ac[];
        int j;
        int j1;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        ac = ac1;
        int k = i;
        if (i >= ac1.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            k = 0;
        }
        i = _inputEnd;
        j1 = _inputPtr + (ac.length - k);
        int i1 = i;
        j = k;
        if (j1 < i)
        {
            i1 = j1;
            j = k;
        }
        do
        {
            ac1 = ac;
            i = j;
            if (_inputPtr >= i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = _inputPtr;
            _inputPtr = i + 1;
            j1 = abyte0[i] & 0xff;
            if (j1 == 39 || ai[j1] != 0)
            {
                if (j1 == 39)
                {
                    _textBuffer.setCurrentLength(j);
                    return JsonToken.VALUE_STRING;
                }
                break;
            }
            ac[j] = (char)j1;
            j++;
        } while (true);
        ai[j1];
        JVM INSTR tableswitch 1 4: default 224
    //                   1 297
    //                   2 329
    //                   3 346
    //                   4 393;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_393;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        int l;
        if (j1 < 32)
        {
            _throwUnquotedSpace(j1, "string value");
        }
        _reportInvalidChar(j1);
        l = j;
        ac1 = ac;
        i = j1;
_L8:
        ac = ac1;
        j = l;
        if (l >= ac1.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        }
        ac[j] = (char)i;
        i = j + 1;
        ac1 = ac;
        if (true) goto _L7; else goto _L6
_L6:
        i = j1;
        ac1 = ac;
        l = j;
        if (j1 != 34)
        {
            i = _decodeEscaped();
            ac1 = ac;
            l = j;
        }
          goto _L8
_L3:
        i = _decodeUtf8_2(j1);
        ac1 = ac;
        l = j;
          goto _L8
_L4:
        if (_inputEnd - _inputPtr >= 2)
        {
            i = _decodeUtf8_3fast(j1);
            ac1 = ac;
            l = j;
        } else
        {
            i = _decodeUtf8_3(j1);
            ac1 = ac;
            l = j;
        }
          goto _L8
        i = _decodeUtf8_4(j1);
        l = j + 1;
        ac[j] = (char)(0xd800 | i >> 10);
        if (l >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            l = 0;
        }
        i = 0xdc00 | i & 0x3ff;
        ac1 = ac;
          goto _L8
    }

    protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
        throws IOException, JsonParseException
    {
        double d;
        int j;
        d = (-1.0D / 0.0D);
        j = i;
        if (i != 73) goto _L2; else goto _L1
_L1:
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOFInValue();
        }
        byte abyte0[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if (i != 78) goto _L4; else goto _L3
_L3:
        String s;
        if (flag)
        {
            s = "-INF";
        } else
        {
            s = "+INF";
        }
        _matchToken(s, 3);
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
        {
            if (!flag)
            {
                d = (1.0D / 0.0D);
            }
            return resetAsNaN(s, d);
        }
        _reportError((new StringBuilder()).append("Non-standard token '").append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
        j = i;
_L2:
        reportUnexpectedNumberChar(j, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
_L4:
        j = i;
        if (i == 110)
        {
            String s1;
            if (flag)
            {
                s1 = "-Infinity";
            } else
            {
                s1 = "+Infinity";
            }
            _matchToken(s1, 3);
            if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
            {
                if (!flag)
                {
                    d = (1.0D / 0.0D);
                }
                return resetAsNaN(s1, d);
            }
            _reportError((new StringBuilder()).append("Non-standard token '").append(s1).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
            j = i;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected JsonToken _handleUnexpectedValue(int i)
        throws IOException, JsonParseException
    {
        i;
        JVM INSTR lookupswitch 3: default 36
    //                   39: 46
    //                   43: 100
    //                   78: 61;
           goto _L1 _L2 _L3 _L4
_L1:
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
_L2:
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
        {
            return _handleApostropheValue();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        _matchToken("NaN", 1);
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS))
        {
            return resetAsNaN("NaN", (0.0D / 0.0D));
        }
        _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
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

    protected Name _handleUnusualFieldName(int i)
        throws IOException, JsonParseException
    {
        if (i != 39 || !isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) goto _L2; else goto _L1
_L1:
        Name name = _parseApostropheFieldName();
_L4:
        return name;
_L2:
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
        {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int ai2[] = CharTypes.getInputCodeUtf8JsNames();
        if (ai2[i] != 0)
        {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        name = _quadBuffer;
        int k = 0;
        int l = 0;
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            int i1;
label0:
            {
                int ai[];
                Name name1;
                if (l < 4)
                {
                    l++;
                    k = k << 8 | j;
                    j = l;
                } else
                {
                    int ai1[] = name;
                    if (i >= name.length)
                    {
                        ai1 = growArrayBy(name, name.length);
                        _quadBuffer = ai1;
                    }
                    l = i + 1;
                    ai1[i] = k;
                    i = 1;
                    k = j;
                    j = i;
                    i = l;
                    name = ai1;
                }
                if (_inputPtr >= _inputEnd && !loadMore())
                {
                    _reportInvalidEOF(" in field name");
                }
                i1 = _inputBuffer[_inputPtr] & 0xff;
                if (ai2[i1] == 0)
                {
                    break label0;
                }
                l = i;
                ai = name;
                if (j > 0)
                {
                    ai = name;
                    if (i >= name.length)
                    {
                        ai = growArrayBy(name, name.length);
                        _quadBuffer = ai;
                    }
                    ai[i] = k;
                    l = i + 1;
                }
                name1 = _symbols.findName(ai, l);
                name = name1;
                if (name1 == null)
                {
                    return addName(ai, l, j);
                }
            }
            if (true)
            {
                continue;
            }
            _inputPtr = _inputPtr + 1;
            l = j;
            j = i1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean _loadToHaveAtLeast(int i)
        throws IOException
    {
        if (_inputStream != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = _inputEnd - _inputPtr;
        if (j > 0 && _inputPtr > 0)
        {
            _currInputProcessed = _currInputProcessed + (long)_inputPtr;
            _currInputRowStart = _currInputRowStart - _inputPtr;
            System.arraycopy(_inputBuffer, _inputPtr, _inputBuffer, 0, j);
            _inputEnd = j;
        } else
        {
            _inputEnd = 0;
        }
        _inputPtr = 0;
        do
        {
            if (_inputEnd >= i)
            {
                break;
            }
            int k = _inputStream.read(_inputBuffer, _inputEnd, _inputBuffer.length - _inputEnd);
            if (k < 1)
            {
                _closeInput();
                if (k == 0)
                {
                    throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(j).append(" bytes").toString());
                }
                continue; /* Loop/switch isn't completed */
            }
            _inputEnd = _inputEnd + k;
        } while (true);
        return true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void _matchToken(String s, int i)
        throws IOException, JsonParseException
    {
        int k = s.length();
        int j;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOF(" in a value");
            }
            if (_inputBuffer[_inputPtr] != s.charAt(i))
            {
                _reportInvalidToken(s.substring(0, i), "'null', 'true', 'false' or NaN");
            }
            _inputPtr = _inputPtr + 1;
            j = i + 1;
            i = j;
        } while (j < k);
        if (_inputPtr < _inputEnd || loadMore())
        {
            if ((i = _inputBuffer[_inputPtr] & 0xff) >= 48 && i != 93 && i != 125 && Character.isJavaIdentifierPart((char)_decodeCharForError(i)))
            {
                _inputPtr = _inputPtr + 1;
                _reportInvalidToken(s.substring(0, j), "'null', 'true', 'false' or NaN");
                return;
            }
        }
    }

    protected Name _parseApostropheFieldName()
        throws IOException, JsonParseException
    {
        int i1;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(": was expecting closing ''' for name");
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i1 = abyte0[i] & 0xff;
        if (i1 != 39) goto _L2; else goto _L1
_L1:
        int ai[] = BytesToNameCanonicalizer.getEmptyName();
_L8:
        return ai;
_L2:
        Object obj;
        int j;
        int k;
        int l;
        ai = _quadBuffer;
        l = 0;
        k = 0;
        obj = sInputCodesLatin1;
        j = 0;
_L6:
        int ai1[];
label0:
        {
            if (i1 != 39)
            {
                break label0;
            }
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            if (k > 0)
            {
                ai1 = ai;
                if (j >= ai.length)
                {
                    ai1 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai1;
                }
                i1 = j + 1;
                ai1[j] = l;
                j = i1;
            } else
            {
                ai1 = ai;
            }
            obj = _symbols.findName(ai1, j);
            ai = ((int []) (obj));
            if (obj == null)
            {
                return addName(ai1, j, k);
            }
        }
        if (true) goto _L4; else goto _L3
_L4:
        continue; /* Loop/switch isn't completed */
_L3:
        j1 = i1;
        i2 = l;
        j2 = k;
        l1 = j;
        ai1 = ai;
        if (i1 != 34)
        {
            j1 = i1;
            i2 = l;
            j2 = k;
            l1 = j;
            ai1 = ai;
            if (obj[i1] != 0)
            {
                if (i1 != 92)
                {
                    _throwUnquotedSpace(i1, "name");
                    k1 = i1;
                } else
                {
                    k1 = _decodeEscaped();
                }
                j1 = k1;
                i2 = l;
                j2 = k;
                l1 = j;
                ai1 = ai;
                if (k1 > 127)
                {
                    l1 = l;
                    j1 = k;
                    i1 = j;
                    ai1 = ai;
                    if (k >= 4)
                    {
                        ai1 = ai;
                        if (j >= ai.length)
                        {
                            ai1 = growArrayBy(ai, ai.length);
                            _quadBuffer = ai1;
                        }
                        ai1[j] = l;
                        l1 = 0;
                        j1 = 0;
                        i1 = j + 1;
                    }
                    if (k1 < 2048)
                    {
                        j = l1 << 8 | (k1 >> 6 | 0xc0);
                        l = j1 + 1;
                        k = i1;
                    } else
                    {
                        l = l1 << 8 | (k1 >> 12 | 0xe0);
                        j = j1 + 1;
                        if (j >= 4)
                        {
                            ai = ai1;
                            if (i1 >= ai1.length)
                            {
                                ai = growArrayBy(ai1, ai1.length);
                                _quadBuffer = ai;
                            }
                            k = i1 + 1;
                            ai[i1] = l;
                            l = 0;
                            j = 0;
                        } else
                        {
                            k = i1;
                            ai = ai1;
                        }
                        l = l << 8 | (k1 >> 6 & 0x3f | 0x80);
                        i1 = j + 1;
                        j = l;
                        l = i1;
                        ai1 = ai;
                    }
                    j1 = k1 & 0x3f | 0x80;
                    l1 = k;
                    j2 = l;
                    i2 = j;
                }
            }
        }
        if (j2 < 4)
        {
            k = j2 + 1;
            l = i2 << 8 | j1;
            j = l1;
            ai = ai1;
        } else
        {
            ai = ai1;
            if (l1 >= ai1.length)
            {
                ai = growArrayBy(ai1, ai1.length);
                _quadBuffer = ai;
            }
            j = l1 + 1;
            ai[l1] = i2;
            l = j1;
            k = 1;
        }
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in field name");
        }
        ai1 = _inputBuffer;
        i1 = _inputPtr;
        _inputPtr = i1 + 1;
        i1 = ai1[i1] & 0xff;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Name _parseFieldName(int i)
        throws IOException, JsonParseException
    {
        if (i != 34)
        {
            return _handleUnusualFieldName(i);
        }
        if (_inputPtr + 9 > _inputEnd)
        {
            return slowParseFieldName();
        }
        byte abyte0[] = _inputBuffer;
        int ai[] = sInputCodesLatin1;
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
                            return parseMediumFieldName(j, ai);
                        }
                        if (j == 34)
                        {
                            return findName(i, 4);
                        } else
                        {
                            return parseFieldName(i, j, 4);
                        }
                    }
                    if (j == 34)
                    {
                        return findName(i, 3);
                    } else
                    {
                        return parseFieldName(i, j, 3);
                    }
                }
                if (j == 34)
                {
                    return findName(i, 2);
                } else
                {
                    return parseFieldName(i, j, 2);
                }
            }
            if (j == 34)
            {
                return findName(i, 1);
            } else
            {
                return parseFieldName(i, j, 1);
            }
        }
        if (i == 34)
        {
            return BytesToNameCanonicalizer.getEmptyName();
        } else
        {
            return parseFieldName(0, i, 0);
        }
    }

    protected int _readBinary(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
        throws IOException, JsonParseException
    {
        int i;
        int l;
        int k1;
        i = 0;
        k1 = abyte0.length;
        l = 0;
_L8:
        int k;
        int i1;
        int j1;
        do
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte1[] = _inputBuffer;
            int j = _inputPtr;
            _inputPtr = j + 1;
            i1 = abyte1[j] & 0xff;
        } while (i1 <= 32);
        k = base64variant.decodeBase64Char(i1);
        j1 = k;
        if (k >= 0) goto _L2; else goto _L1
_L1:
        if (i1 != 34) goto _L4; else goto _L3
_L3:
        k = l;
_L6:
        _tokenIncomplete = false;
        l = k;
        if (i > 0)
        {
            l = k + i;
            outputstream.write(abyte0, 0, i);
        }
        return l;
_L4:
        j1 = _decodeBase64Escape(base64variant, i1, 0);
        if (j1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        int l1;
        int i2;
        k = l;
        i1 = i;
        if (i > k1 - 3)
        {
            k = l + i;
            outputstream.write(abyte0, 0, i);
            i1 = 0;
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte2[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        l1 = abyte2[i] & 0xff;
        l = base64variant.decodeBase64Char(l1);
        i = l;
        if (l < 0)
        {
            i = _decodeBase64Escape(base64variant, l1, 1);
        }
        l1 = j1 << 6 | i;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte2 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i2 = abyte2[i] & 0xff;
        l = base64variant.decodeBase64Char(i2);
        j1 = l;
        if (l < 0)
        {
            i = l;
            if (l != -2)
            {
                if (i2 == 34 && !base64variant.usesPadding())
                {
                    abyte0[i1] = (byte)(l1 >> 4);
                    i = i1 + 1;
                    continue; /* Loop/switch isn't completed */
                }
                i = _decodeBase64Escape(base64variant, i2, 2);
            }
            j1 = i;
            if (i == -2)
            {
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                abyte2 = _inputBuffer;
                i = _inputPtr;
                _inputPtr = i + 1;
                i = abyte2[i] & 0xff;
                if (!base64variant.usesPaddingChar(i))
                {
                    throw reportInvalidBase64Char(base64variant, i, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
                }
                abyte0[i1] = (byte)(l1 >> 4);
                i = i1 + 1;
                l = k;
                continue; /* Loop/switch isn't completed */
            }
        }
        l1 = l1 << 6 | j1;
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte2 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i2 = abyte2[i] & 0xff;
        l = base64variant.decodeBase64Char(i2);
        j1 = l;
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_697;
        }
        i = l;
        if (l == -2)
        {
            break MISSING_BLOCK_LABEL_644;
        }
        if (i2 != 34 || base64variant.usesPadding())
        {
            break; /* Loop/switch isn't completed */
        }
        l = l1 >> 2;
        j1 = i1 + 1;
        abyte0[i1] = (byte)(l >> 8);
        i = j1 + 1;
        abyte0[j1] = (byte)l;
        if (true) goto _L6; else goto _L5
_L5:
        i = _decodeBase64Escape(base64variant, i2, 3);
        j1 = i;
        if (i == -2)
        {
            l = l1 >> 2;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(l >> 8);
            i = j1 + 1;
            abyte0[j1] = (byte)l;
            l = k;
            continue; /* Loop/switch isn't completed */
        }
        i = l1 << 6 | j1;
        l = i1 + 1;
        abyte0[i1] = (byte)(i >> 16);
        i1 = l + 1;
        abyte0[l] = (byte)(i >> 8);
        abyte0[i1] = (byte)i;
        i = i1 + 1;
        l = k;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void _releaseBuffers()
        throws IOException
    {
        super._releaseBuffers();
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
        throws JsonParseException
    {
        if (i < 32)
        {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    protected void _reportInvalidInitial(int i)
        throws JsonParseException
    {
        _reportError((new StringBuilder()).append("Invalid UTF-8 start byte 0x").append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i)
        throws JsonParseException
    {
        _reportError((new StringBuilder()).append("Invalid UTF-8 middle byte 0x").append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i, int j)
        throws JsonParseException
    {
        _inputPtr = j;
        _reportInvalidOther(i);
    }

    protected void _reportInvalidToken(String s, String s1)
        throws IOException, JsonParseException
    {
        s = new StringBuilder(s);
_L5:
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        _reportError((new StringBuilder()).append("Unrecognized token '").append(s.toString()).append("': was expecting ").append(s1).toString());
        return;
_L2:
        char c;
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        c = (char)_decodeCharForError(abyte0[i]);
        if (!Character.isJavaIdentifierPart(c)) goto _L1; else goto _L3
_L3:
        s.append(c);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void _skipCR()
        throws IOException
    {
        if ((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == 10)
        {
            _inputPtr = _inputPtr + 1;
        }
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected void _skipLF()
        throws IOException
    {
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected void _skipString()
        throws IOException, JsonParseException
    {
        _tokenIncomplete = false;
        int ai[] = sInputCodesUtf8;
        byte abyte0[] = _inputBuffer;
        do
        {
            int i1;
label0:
            do
            {
                int k = _inputPtr;
                i1 = _inputEnd;
                int j = i1;
                int i = k;
                if (k >= i1)
                {
                    loadMoreGuaranteed();
                    i = _inputPtr;
                    j = _inputEnd;
                }
                while (i < j) 
                {
                    int l = i + 1;
                    i1 = abyte0[i] & 0xff;
                    i = l;
                    if (ai[i1] != 0)
                    {
                        _inputPtr = l;
                        if (i1 == 34)
                        {
                            return;
                        }
                        break label0;
                    }
                }
                _inputPtr = i;
            } while (true);
            switch (ai[i1])
            {
            default:
                if (i1 < 32)
                {
                    _throwUnquotedSpace(i1, "string value");
                } else
                {
                    _reportInvalidChar(i1);
                }
                break;

            case 1: // '\001'
                _decodeEscaped();
                break;

            case 2: // '\002'
                _skipUtf8_2(i1);
                break;

            case 3: // '\003'
                _skipUtf8_3(i1);
                break;

            case 4: // '\004'
                _skipUtf8_4(i1);
                break;
            }
        } while (true);
    }

    public void close()
        throws IOException
    {
        super.close();
        _symbols.release();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        if (_currToken != JsonToken.VALUE_STRING && (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT || _binaryValue == null))
        {
            _reportError((new StringBuilder()).append("Current token (").append(_currToken).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
        }
        if (!_tokenIncomplete) goto _L2; else goto _L1
_L1:
        try
        {
            _binaryValue = _decodeBase64(base64variant);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw _constructError((new StringBuilder()).append("Failed to decode VALUE_STRING as base64 (").append(base64variant).append("): ").append(illegalargumentexception.getMessage()).toString());
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

    public Object getEmbeddedObject()
        throws IOException, JsonParseException
    {
        return null;
    }

    public Object getInputSource()
    {
        return _inputStream;
    }

    public String getText()
        throws IOException, JsonParseException
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
        throws IOException, JsonParseException
    {
        if (_currToken == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 56
    //                   2 135
    //                   3 151
    //                   4 151;
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
        throws IOException, JsonParseException
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
                        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
                        {
                        default:
                            i = _currToken.asCharArray().length;
                            break;

                        case 1: // '\001'
                            break label2;

                        case 2: // '\002'
                            break label1;

                        case 3: // '\003'
                        case 4: // '\004'
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
        throws IOException, JsonParseException
    {
        if (_currToken == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 48
    //                   2 50
    //                   3 66
    //                   4 66;
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

    public String getValueAsString()
        throws IOException, JsonParseException
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
        throws IOException, JsonParseException
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

    protected boolean loadMore()
        throws IOException
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
                    throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(_inputBuffer.length).append(" bytes").toString());
                }
            }
        }
        return flag;
    }

    public Boolean nextBooleanValue()
        throws IOException, JsonParseException
    {
        Boolean boolean1;
        JsonToken jsontoken;
        boolean1 = null;
        if (_currToken != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        _nameCopied = false;
        jsontoken = _nextToken;
        _nextToken = null;
        _currToken = jsontoken;
        if (jsontoken != JsonToken.VALUE_TRUE) goto _L2; else goto _L1
_L1:
        boolean1 = Boolean.TRUE;
_L4:
        return boolean1;
_L2:
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return Boolean.FALSE;
        }
        if (jsontoken == JsonToken.START_ARRAY)
        {
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
            return null;
        }
        if (jsontoken != JsonToken.START_OBJECT) goto _L4; else goto _L3
_L3:
        _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
        return null;
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[nextToken().ordinal()])
        {
        default:
            return null;

        case 5: // '\005'
            return Boolean.TRUE;

        case 6: // '\006'
            return Boolean.FALSE;
        }
    }

    public boolean nextFieldName(SerializableString serializablestring)
        throws IOException, JsonParseException
    {
        int i;
        _numTypesValid = 0;
        if (_currToken == JsonToken.FIELD_NAME)
        {
            _nextAfterName();
            return false;
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
            return false;
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
            _currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (j == 125)
        {
            if (!_parsingContext.inObject())
            {
                _reportMismatchedEndMarker(j, ']');
            }
            _parsingContext = _parsingContext.getParent();
            _currToken = JsonToken.END_OBJECT;
            return false;
        }
        i = j;
        if (_parsingContext.expectComma())
        {
            if (j != 44)
            {
                _reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
            }
            i = _skipWS();
        }
        if (!_parsingContext.inObject())
        {
            _nextTokenNotInObject(i);
            return false;
        }
        if (i != 34) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int l;
        abyte0 = serializablestring.asQuotedUTF8();
        l = abyte0.length;
        if (_inputPtr + l >= _inputEnd) goto _L2; else goto _L3
_L3:
        int i1 = _inputPtr + l;
        if (_inputBuffer[i1] != 34) goto _L2; else goto _L4
_L4:
        int k;
        int j1;
        k = 0;
        j1 = _inputPtr;
_L7:
        if (k == l)
        {
            _inputPtr = i1 + 1;
            _parsingContext.setCurrentName(serializablestring.getValue());
            _currToken = JsonToken.FIELD_NAME;
            _isNextTokenNameYes();
            return true;
        }
        if (abyte0[k] == _inputBuffer[j1 + k]) goto _L5; else goto _L2
_L2:
        return _isNextTokenNameMaybe(i, serializablestring);
_L5:
        k++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int nextIntValue(int i)
        throws IOException, JsonParseException
    {
        if (_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        _nameCopied = false;
        jsontoken = _nextToken;
        _nextToken = null;
        _currToken = jsontoken;
        if (jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
_L3:
        int j = getIntValue();
_L6:
        return j;
_L4:
        if (jsontoken == JsonToken.START_ARRAY)
        {
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
            return i;
        }
        j = i;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
            return i;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        j = i;
        if (nextToken() == JsonToken.VALUE_NUMBER_INT)
        {
            return getIntValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public long nextLongValue(long l)
        throws IOException, JsonParseException
    {
        if (_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        _nameCopied = false;
        jsontoken = _nextToken;
        _nextToken = null;
        _currToken = jsontoken;
        if (jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L4; else goto _L3
_L3:
        long l1 = getLongValue();
_L6:
        return l1;
_L4:
        if (jsontoken == JsonToken.START_ARRAY)
        {
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
            return l;
        }
        l1 = l;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
            return l;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = l;
        if (nextToken() == JsonToken.VALUE_NUMBER_INT)
        {
            return getLongValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String nextTextValue()
        throws IOException, JsonParseException
    {
        String s = null;
        if (_currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        _nameCopied = false;
        jsontoken = _nextToken;
        _nextToken = null;
        _currToken = jsontoken;
        if (jsontoken != JsonToken.VALUE_STRING) goto _L4; else goto _L3
_L3:
        if (_tokenIncomplete)
        {
            _tokenIncomplete = false;
            _finishString();
        }
        s = _textBuffer.contentsAsString();
_L6:
        return s;
_L4:
        if (jsontoken == JsonToken.START_ARRAY)
        {
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
            return null;
        }
        if (jsontoken == JsonToken.START_OBJECT)
        {
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (nextToken() == JsonToken.VALUE_STRING)
        {
            return getText();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public JsonToken nextToken()
        throws IOException, JsonParseException
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
                _reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
            }
            i = _skipWS();
        }
        if (!_parsingContext.inObject())
        {
            return _nextTokenNotInObject(i);
        }
        Name name = _parseFieldName(i);
        _parsingContext.setCurrentName(name.getName());
        _currToken = JsonToken.FIELD_NAME;
        i = _skipWS();
        if (i != 58)
        {
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
        i = _skipWS();
        if (i == 34)
        {
            _tokenIncomplete = true;
            _nextToken = JsonToken.VALUE_STRING;
            return _currToken;
        }
        i;
        JVM INSTR lookupswitch 18: default 488
    //                   45: 567
    //                   48: 567
    //                   49: 567
    //                   50: 567
    //                   51: 567
    //                   52: 567
    //                   53: 567
    //                   54: 567
    //                   55: 567
    //                   56: 567
    //                   57: 567
    //                   91: 504
    //                   93: 518
    //                   102: 539
    //                   110: 553
    //                   116: 525
    //                   123: 511
    //                   125: 518;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L1:
        JsonToken jsontoken2 = _handleUnexpectedValue(i);
_L10:
        _nextToken = jsontoken2;
        return _currToken;
_L3:
        jsontoken2 = JsonToken.START_ARRAY;
        continue; /* Loop/switch isn't completed */
_L8:
        jsontoken2 = JsonToken.START_OBJECT;
        continue; /* Loop/switch isn't completed */
_L4:
        _reportUnexpectedChar(i, "expected a value");
_L7:
        _matchToken("true", 1);
        jsontoken2 = JsonToken.VALUE_TRUE;
        continue; /* Loop/switch isn't completed */
_L5:
        _matchToken("false", 1);
        jsontoken2 = JsonToken.VALUE_FALSE;
        continue; /* Loop/switch isn't completed */
_L6:
        _matchToken("null", 1);
        jsontoken2 = JsonToken.VALUE_NULL;
        continue; /* Loop/switch isn't completed */
_L2:
        jsontoken2 = parseNumberText(i);
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected Name parseEscapedFieldName(int ai[], int i, int j, int k, int l)
        throws IOException, JsonParseException
    {
        int ai5[] = sInputCodesLatin1;
_L2:
        int i1;
        i1 = k;
        if (ai5[k] == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k == 34)
        {
            int ai1[] = ai;
            k = i;
            if (l > 0)
            {
                ai1 = ai;
                if (i >= ai.length)
                {
                    ai1 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai1;
                }
                ai1[i] = j;
                k = i + 1;
            }
            Name name = _symbols.findName(ai1, k);
            ai = name;
            if (name == null)
            {
                ai = addName(ai1, k, l);
            }
            return ai;
        }
        byte abyte0[];
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
            break; /* Loop/switch isn't completed */
        }
        if (l >= 4)
        {
            int ai2[] = ai;
            if (i >= ai.length)
            {
                ai2 = growArrayBy(ai, ai.length);
                _quadBuffer = ai2;
            }
            i1 = i + 1;
            ai2[i] = j;
            j = 0;
            l = 0;
            ai = ai2;
            i = i1;
        }
        if (k < 2048)
        {
            i1 = j << 8 | (k >> 6 | 0xc0);
            j = l + 1;
            l = i;
            i = i1;
        } else
        {
            j = j << 8 | (k >> 12 | 0xe0);
            i1 = l + 1;
            int ai4[];
            if (i1 >= 4)
            {
                int ai3[] = ai;
                if (i >= ai.length)
                {
                    ai3 = growArrayBy(ai, ai.length);
                    _quadBuffer = ai3;
                }
                i1 = i + 1;
                ai3[i] = j;
                l = 0;
                j = 0;
                i = i1;
                ai = ai3;
            } else
            {
                l = j;
                j = i1;
            }
            i1 = l << 8 | (k >> 6 & 0x3f | 0x80);
            j++;
            l = i;
            i = i1;
        }
        k = k & 0x3f | 0x80;
        i1 = j;
        j = k;
        k = i;
        i = l;
_L3:
        if (i1 < 4)
        {
            l = i1 + 1;
            j = k << 8 | j;
        } else
        {
            ai4 = ai;
            if (i >= ai.length)
            {
                ai4 = growArrayBy(ai, ai.length);
                _quadBuffer = ai4;
            }
            l = i + 1;
            ai4[i] = k;
            k = 1;
            ai = ai4;
            i = l;
            l = k;
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
        k = j;
        j = i1;
        i1 = l;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected Name parseLongFieldName(int i)
        throws IOException, JsonParseException
    {
        int ai[] = sInputCodesLatin1;
        byte byte0 = 2;
        int j = i;
        i = byte0;
        do
        {
            if (_inputEnd - _inputPtr < 4)
            {
                return parseEscapedFieldName(_quadBuffer, i, 0, j, 0);
            }
            byte abyte0[] = _inputBuffer;
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
                    return parseEscapedFieldName(_quadBuffer, i, j, k, 1);
                }
            }
            j = j << 8 | k;
            abyte0 = _inputBuffer;
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
                    return parseEscapedFieldName(_quadBuffer, i, j, k, 2);
                }
            }
            j = j << 8 | k;
            abyte0 = _inputBuffer;
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
                    return parseEscapedFieldName(_quadBuffer, i, j, k, 3);
                }
            }
            k = j << 8 | k;
            abyte0 = _inputBuffer;
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
                    return parseEscapedFieldName(_quadBuffer, i, k, j, 4);
                }
            }
            if (i >= _quadBuffer.length)
            {
                _quadBuffer = growArrayBy(_quadBuffer, i);
            }
            _quadBuffer[i] = k;
            i++;
        } while (true);
    }

    protected Name parseMediumFieldName(int i, int ai[])
        throws IOException, JsonParseException
    {
        byte abyte0[] = _inputBuffer;
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
                return parseFieldName(_quad1, i, j, 1);
            }
        }
        i = i << 8 | j;
        abyte0 = _inputBuffer;
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
                return parseFieldName(_quad1, i, j, 2);
            }
        }
        i = i << 8 | j;
        abyte0 = _inputBuffer;
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
                return parseFieldName(_quad1, i, j, 3);
            }
        }
        i = i << 8 | j;
        abyte0 = _inputBuffer;
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
                return parseFieldName(_quad1, i, j, 4);
            }
        } else
        {
            _quadBuffer[0] = _quad1;
            _quadBuffer[1] = i;
            return parseLongFieldName(j);
        }
    }

    protected JsonToken parseNumberText(int i)
        throws IOException, JsonParseException
    {
        char ac[];
        int j;
        boolean flag1;
label0:
        {
            ac = _textBuffer.emptyAndGetCurrentSegment();
            if (i == 45)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                j = 0 + 1;
                ac[0] = '-';
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte0[] = _inputBuffer;
                i = _inputPtr;
                _inputPtr = i + 1;
                int k = abyte0[i] & 0xff;
                if (k >= 48)
                {
                    i = k;
                    if (k <= 57)
                    {
                        break label0;
                    }
                }
                return _handleInvalidNumberStart(k, true);
            }
            j = 0;
        }
        int l = i;
        if (i == 48)
        {
            l = _verifyNoLeadingZeroes();
        }
        int i1 = j + 1;
        ac[j] = (char)l;
        boolean flag = true;
        int k1 = _inputPtr + ac.length;
        j = i1;
        l = ((flag) ? 1 : 0);
        i = k1;
        if (k1 > _inputEnd)
        {
            i = _inputEnd;
            l = ((flag) ? 1 : 0);
            j = i1;
        }
        do
        {
            if (_inputPtr >= i)
            {
                return _parserNumber2(ac, j, flag1, l);
            }
            byte abyte1[] = _inputBuffer;
            int j1 = _inputPtr;
            _inputPtr = j1 + 1;
            j1 = abyte1[j1] & 0xff;
            if (j1 < 48 || j1 > 57)
            {
                if (j1 == 46 || j1 == 101 || j1 == 69)
                {
                    return _parseFloatText(ac, j, j1, flag1, l);
                } else
                {
                    _inputPtr = _inputPtr - 1;
                    _textBuffer.setCurrentLength(j);
                    return resetInt(flag1, l);
                }
            }
            l++;
            ac[j] = (char)j1;
            j++;
        } while (true);
    }

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
        throws IOException, JsonParseException
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

    public int releaseBuffered(OutputStream outputstream)
        throws IOException
    {
        int i = _inputEnd - _inputPtr;
        if (i < 1)
        {
            return 0;
        } else
        {
            int j = _inputPtr;
            outputstream.write(_inputBuffer, j, i);
            return i;
        }
    }

    public void setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
    }

    protected Name slowParseFieldName()
        throws IOException, JsonParseException
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
            return parseEscapedFieldName(_quadBuffer, 0, 0, i, 0);
        }
    }

    public Version version()
    {
        return CoreVersion.instance.version();
    }

}
