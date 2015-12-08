// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonReadContext

public final class ReaderBasedJsonParser extends ParserBase
{

    protected final int _hashSeed;
    protected char _inputBuffer[];
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iocontext, int i, Reader reader, ObjectCodec objectcodec, CharsToNameCanonicalizer charstonamecanonicalizer)
    {
        super(iocontext, i);
        _tokenIncomplete = false;
        _reader = reader;
        _inputBuffer = iocontext.allocTokenBuffer();
        _objectCodec = objectcodec;
        _symbols = charstonamecanonicalizer;
        _hashSeed = charstonamecanonicalizer.hashSeed();
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

    private String _parseFieldName2(int i, int j, int k)
        throws IOException, JsonParseException
    {
        char ac[];
        _textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
        ac = _textBuffer.getCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
_L3:
        char c1;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF((new StringBuilder(": was expecting closing '")).append((char)k).append("' for name").toString());
        }
        char ac1[] = _inputBuffer;
        int l = _inputPtr;
        _inputPtr = l + 1;
        c1 = ac1[l];
        if (c1 > '\\')
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (c1 != '\\') goto _L2; else goto _L1
_L1:
        char c = _decodeEscaped();
_L4:
        j = j * 33 + c1;
        int i1 = i + 1;
        ac[i] = c;
        TextBuffer textbuffer;
        char ac2[];
        if (i1 >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        } else
        {
            i = i1;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (c1 <= k)
        {
            if (c1 == k)
            {
                break MISSING_BLOCK_LABEL_201;
            }
            if (c1 < ' ')
            {
                _throwUnquotedSpace(c1, "name");
            }
        }
        c = c1;
          goto _L4
        _textBuffer.setCurrentLength(i);
        textbuffer = _textBuffer;
        ac2 = textbuffer.getTextBuffer();
        i = textbuffer.getTextOffset();
        k = textbuffer.size();
        return _symbols.findSymbol(ac2, i, k, j);
    }

    private String _parseUnusualFieldName2(int i, int j, int ai[])
        throws IOException, JsonParseException
    {
        _textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
        char ac[] = _textBuffer.getCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
        int i1 = ai.length;
        do
        {
            char c;
label0:
            {
                if (_inputPtr < _inputEnd || loadMore())
                {
                    c = _inputBuffer[_inputPtr];
                    int k;
                    if (c > i1 ? Character.isJavaIdentifierPart(c) : ai[c] == 0)
                    {
                        break label0;
                    }
                }
                _textBuffer.setCurrentLength(i);
                ai = _textBuffer;
                ac = ai.getTextBuffer();
                i = ai.getTextOffset();
                k = ai.size();
                return _symbols.findSymbol(ac, i, k, j);
            }
            _inputPtr = _inputPtr + 1;
            j = j * 33 + c;
            int l = i + 1;
            ac[i] = c;
            if (l >= ac.length)
            {
                ac = _textBuffer.finishCurrentSegment();
                i = 0;
            } else
            {
                i = l;
            }
        } while (true);
    }

    private void _skipCComment()
        throws IOException, JsonParseException
    {
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            char ac[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = ac[i];
            if (i > '*')
            {
                continue;
            }
            if (i == '*')
            {
                if (_inputPtr >= _inputEnd && !loadMore())
                {
                    break;
                }
                if (_inputBuffer[_inputPtr] == '/')
                {
                    _inputPtr = _inputPtr + 1;
                    return;
                }
            } else
            if (i < ' ')
            {
                if (i == '\n')
                {
                    _skipLF();
                } else
                if (i == '\r')
                {
                    _skipCR();
                } else
                if (i != '\t')
                {
                    _throwInvalidSpace(i);
                }
            }
        } while (true);
        _reportInvalidEOF(" in a comment");
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
        char ac[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = ac[i];
        if (i == '/')
        {
            _skipCppComment();
            return;
        }
        if (i == '*')
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
        do
        {
            int i;
label0:
            {
                if (_inputPtr < _inputEnd || loadMore())
                {
                    char ac[] = _inputBuffer;
                    i = _inputPtr;
                    _inputPtr = i + 1;
                    i = ac[i];
                    if (i >= ' ')
                    {
                        continue;
                    }
                    if (i != '\n')
                    {
                        break label0;
                    }
                    _skipLF();
                }
                return;
            }
            if (i == '\r')
            {
                _skipCR();
                return;
            }
            if (i != '\t')
            {
                _throwInvalidSpace(i);
            }
        } while (true);
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
            char ac[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = ac[i];
            if (i > ' ')
            {
                if (i != '/')
                {
                    return i;
                }
                _skipComment();
            } else
            if (i != ' ')
            {
                if (i == '\n')
                {
                    _skipLF();
                } else
                if (i == '\r')
                {
                    _skipCR();
                } else
                if (i != '\t')
                {
                    _throwInvalidSpace(i);
                }
            }
        } while (true);
        throw _constructError((new StringBuilder("Unexpected end-of-input within/between ")).append(_parsingContext.getTypeDesc()).append(" entries").toString());
    }

    private int _skipWSOrEnd()
        throws IOException, JsonParseException
    {
        int i;
label0:
        {
            while (_inputPtr < _inputEnd || loadMore()) 
            {
                char ac[] = _inputBuffer;
                i = _inputPtr;
                _inputPtr = i + 1;
                char c = ac[i];
                if (c > ' ')
                {
                    i = c;
                    if (c != '/')
                    {
                        break label0;
                    }
                    _skipComment();
                } else
                if (c != ' ')
                {
                    if (c == '\n')
                    {
                        _skipLF();
                    } else
                    if (c == '\r')
                    {
                        _skipCR();
                    } else
                    if (c != '\t')
                    {
                        _throwInvalidSpace(c);
                    }
                }
            }
            _handleEOF();
            i = -1;
        }
        return i;
    }

    private char _verifyNoLeadingZeroes()
        throws IOException, JsonParseException
    {
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        char c = '0';
_L4:
        return c;
_L2:
        char c1;
        c1 = _inputBuffer[_inputPtr];
        if (c1 < '0' || c1 > '9')
        {
            return '0';
        }
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS))
        {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        _inputPtr = _inputPtr + 1;
        c = c1;
        if (c1 != '0')
        {
            continue; /* Loop/switch isn't completed */
        }
        c = c1;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                continue; /* Loop/switch isn't completed */
            }
            c1 = _inputBuffer[_inputPtr];
            if (c1 < '0' || c1 > '9')
            {
                return '0';
            }
            _inputPtr = _inputPtr + 1;
            c = c1;
        } while (c1 == '0');
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return c1;
    }

    private JsonToken parseNumberText2(boolean flag)
        throws IOException, JsonParseException
    {
        int i2 = 0;
        char ac2[] = _textBuffer.emptyAndGetCurrentSegment();
        char c;
        char c1;
        char ac1[];
        int i;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int j2;
        int k2;
        if (flag)
        {
            ac2[0] = '-';
            i = 1;
        } else
        {
            i = 0;
        }
        if (_inputPtr < _inputEnd)
        {
            char ac[] = _inputBuffer;
            int j = _inputPtr;
            _inputPtr = j + 1;
            c = ac[j];
        } else
        {
            c = getNextChar("No digit following minus sign");
        }
        c1 = c;
        if (c == '0')
        {
            c1 = _verifyNoLeadingZeroes();
        }
        k = 0;
        c = c1;
        if (c < '0' || c > '9')
        {
            break MISSING_BLOCK_LABEL_895;
        }
        k++;
        l = i;
        ac1 = ac2;
        if (i >= ac2.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            l = 0;
        }
        i = l + 1;
        ac1[l] = c;
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        i1 = 1;
        c = '\0';
        l = i;
        i = k;
        k = i1;
_L24:
        if (i == 0)
        {
            reportInvalidNumber((new StringBuilder("Missing integer part (next char ")).append(_getCharDesc(c)).append(")").toString());
        }
        if (c != '.') goto _L4; else goto _L3
_L3:
        ac1[l] = c;
        l++;
        i1 = 0;
_L17:
        if (_inputPtr < _inputEnd || loadMore()) goto _L6; else goto _L5
_L5:
        j1 = 1;
_L21:
        if (i1 == 0)
        {
            reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
        }
        k = i1;
        i1 = l;
        l = j1;
        ac2 = ac1;
_L22:
        if (c != 'e' && c != 'E') goto _L8; else goto _L7
_L7:
        j1 = i1;
        ac1 = ac2;
        if (i1 >= ac2.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            j1 = 0;
        }
        i1 = j1 + 1;
        ac1[j1] = c;
        if (_inputPtr < _inputEnd)
        {
            ac2 = _inputBuffer;
            j1 = _inputPtr;
            _inputPtr = j1 + 1;
            c = ac2[j1];
        } else
        {
            c = getNextChar("expected a digit for number exponent");
        }
        if (c != '-' && c != '+') goto _L10; else goto _L9
_L9:
        if (i1 >= ac1.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            i1 = 0;
        }
        j1 = i1 + 1;
        ac1[i1] = c;
        if (_inputPtr < _inputEnd)
        {
            ac2 = _inputBuffer;
            i1 = _inputPtr;
            _inputPtr = i1 + 1;
            c = ac2[i1];
            i1 = 0;
        } else
        {
            c = getNextChar("expected a digit for number exponent");
            i1 = 0;
        }
_L18:
        k1 = j1;
        ac2 = ac1;
        j1 = i1;
        i1 = k1;
_L19:
        if (c > '9' || c < '0') goto _L12; else goto _L11
_L11:
        k1 = j1 + 1;
        l1 = i1;
        ac1 = ac2;
        if (i1 >= ac2.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            l1 = 0;
        }
        j1 = l1 + 1;
        ac1[l1] = c;
        if (_inputPtr < _inputEnd || loadMore()) goto _L14; else goto _L13
_L13:
        l = 1;
        i1 = j1;
        j1 = k1;
_L12:
        k1 = l;
        l1 = i1;
        i2 = j1;
        j2 = k;
        k2 = i;
        if (j1 == 0)
        {
            reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
            k2 = i;
            j2 = k;
            i2 = j1;
            l1 = i1;
            k1 = l;
        }
_L20:
        if (k1 == 0)
        {
            _inputPtr = _inputPtr - 1;
        }
        _textBuffer.setCurrentLength(l1);
        return reset(flag, k2, j2, i2);
_L2:
        ac2 = _inputBuffer;
        l = _inputPtr;
        _inputPtr = l + 1;
        c = ac2[l];
        ac2 = ac1;
        break MISSING_BLOCK_LABEL_80;
_L6:
        ac2 = _inputBuffer;
        j1 = _inputPtr;
        _inputPtr = j1 + 1;
        c = ac2[j1];
        if (c < '0' || c > '9') goto _L16; else goto _L15
_L15:
        i1++;
        if (l >= ac1.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            l = 0;
        }
        j1 = l + 1;
        ac1[l] = c;
        l = j1;
          goto _L17
_L14:
        ac2 = _inputBuffer;
        i1 = _inputPtr;
        _inputPtr = i1 + 1;
        c = ac2[i1];
        i1 = k1;
          goto _L18
_L10:
        j1 = 0;
        ac2 = ac1;
          goto _L19
_L8:
        k1 = l;
        l1 = i1;
        j2 = k;
        k2 = i;
          goto _L20
_L16:
        j1 = k;
          goto _L21
_L4:
        j1 = 0;
        i1 = l;
        ac2 = ac1;
        l = k;
        k = j1;
          goto _L22
        j1 = 0;
        i1 = k;
        ac1 = ac2;
        l = i;
        k = j1;
        i = i1;
        if (true) goto _L24; else goto _L23
_L23:
    }

    protected final void _closeInput()
        throws IOException
    {
        if (_reader != null)
        {
            if (_ioContext.isResourceManaged() || isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE))
            {
                _reader.close();
            }
            _reader = null;
        }
    }

    protected final byte[] _decodeBase64(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
        do
        {
            char c;
            do
            {
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                char ac[] = _inputBuffer;
                int i = _inputPtr;
                _inputPtr = i + 1;
                c = ac[i];
            } while (c <= ' ');
            int l = base64variant.decodeBase64Char(c);
            int j = l;
            if (l < 0)
            {
                if (c == '"')
                {
                    return bytearraybuilder.toByteArray();
                }
                j = _decodeBase64Escape(base64variant, c, 0);
                if (j < 0)
                {
                    continue;
                }
            }
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            char ac1[] = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            c = ac1[l];
            int i1 = base64variant.decodeBase64Char(c);
            l = i1;
            if (i1 < 0)
            {
                l = _decodeBase64Escape(base64variant, c, 1);
            }
            int j1 = l | j << 6;
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            ac1 = _inputBuffer;
            j = _inputPtr;
            _inputPtr = j + 1;
            c = ac1[j];
            l = base64variant.decodeBase64Char(c);
            i1 = l;
            if (l < 0)
            {
                j = l;
                if (l != -2)
                {
                    if (c == '"' && !base64variant.usesPadding())
                    {
                        bytearraybuilder.append(j1 >> 4);
                        return bytearraybuilder.toByteArray();
                    }
                    j = _decodeBase64Escape(base64variant, c, 2);
                }
                i1 = j;
                if (j == -2)
                {
                    if (_inputPtr >= _inputEnd)
                    {
                        loadMoreGuaranteed();
                    }
                    ac1 = _inputBuffer;
                    j = _inputPtr;
                    _inputPtr = j + 1;
                    c = ac1[j];
                    if (!base64variant.usesPaddingChar(c))
                    {
                        throw reportInvalidBase64Char(base64variant, c, 3, (new StringBuilder("expected padding character '")).append(base64variant.getPaddingChar()).append("'").toString());
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
            ac1 = _inputBuffer;
            j = _inputPtr;
            _inputPtr = j + 1;
            c = ac1[j];
            l = base64variant.decodeBase64Char(c);
            i1 = l;
            if (l < 0)
            {
                int k = l;
                if (l != -2)
                {
                    if (c == '"' && !base64variant.usesPadding())
                    {
                        bytearraybuilder.appendTwoBytes(j1 >> 2);
                        return bytearraybuilder.toByteArray();
                    }
                    k = _decodeBase64Escape(base64variant, c, 3);
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

    protected final char _decodeEscaped()
        throws IOException, JsonParseException
    {
        int j = 0;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(" in character escape sequence");
        }
        char ac[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        char c1 = ac[i];
        char c = c1;
        switch (c1)
        {
        default:
            c = _handleUnrecognizedCharacterEscape(c1);
            // fall through

        case 34: // '"'
        case 47: // '/'
        case 92: // '\\'
            return c;

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

        case 117: // 'u'
            i = 0;
            break;
        }
        for (; i < 4; i++)
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOF(" in character escape sequence");
            }
            char ac1[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            k = ac1[k];
            int l = CharTypes.charToHex(k);
            if (l < 0)
            {
                _reportUnexpectedChar(k, "expected a hex-digit for character escape sequence");
            }
            j = j << 4 | l;
        }

        return (char)j;
    }

    protected final void _finishString()
        throws IOException, JsonParseException
    {
        int i = _inputPtr;
        int k = _inputEnd;
        int j = i;
        if (i < k)
        {
            int ai[] = CharTypes.getInputCodeLatin1();
            int l = ai.length;
            do
            {
                char c = _inputBuffer[i];
                if (c < l && ai[c] != 0)
                {
                    j = i;
                    if (c == '"')
                    {
                        _textBuffer.resetWithShared(_inputBuffer, _inputPtr, i - _inputPtr);
                        _inputPtr = i + 1;
                        return;
                    }
                    break;
                }
                j = i + 1;
                i = j;
            } while (j < k);
        }
        _textBuffer.resetWithCopy(_inputBuffer, _inputPtr, j - _inputPtr);
        _inputPtr = j;
        _finishString2();
    }

    protected final void _finishString2()
        throws IOException, JsonParseException
    {
        char ac[];
        int i;
        ac = _textBuffer.getCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
_L2:
        char c;
        char c1;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(": was expecting closing quote for a string value");
        }
        char ac1[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        c1 = ac1[j];
        c = c1;
        if (c1 <= '\\')
        {
            if (c1 != '\\')
            {
                break; /* Loop/switch isn't completed */
            }
            c = _decodeEscaped();
        }
_L3:
        if (i >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        }
        int k = i + 1;
        ac[i] = c;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        c = c1;
        if (c1 <= '"')
        {
            if (c1 != '"')
            {
                c = c1;
                if (c1 < ' ')
                {
                    _throwUnquotedSpace(c1, "string value");
                    c = c1;
                }
            } else
            {
                _textBuffer.setCurrentLength(i);
                return;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected final String _getText2(JsonToken jsontoken)
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

    protected final JsonToken _handleApostropheValue()
        throws IOException, JsonParseException
    {
        char ac[];
        int i;
        ac = _textBuffer.emptyAndGetCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
_L2:
        char c;
        char c1;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(": was expecting closing quote for a string value");
        }
        char ac1[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        c1 = ac1[j];
        c = c1;
        if (c1 <= '\\')
        {
            if (c1 != '\\')
            {
                break; /* Loop/switch isn't completed */
            }
            c = _decodeEscaped();
        }
_L3:
        if (i >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        }
        int k = i + 1;
        ac[i] = c;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        c = c1;
        if (c1 <= '\'')
        {
            if (c1 != '\'')
            {
                c = c1;
                if (c1 < ' ')
                {
                    _throwUnquotedSpace(c1, "string value");
                    c = c1;
                }
            } else
            {
                _textBuffer.setCurrentLength(i);
                return JsonToken.VALUE_STRING;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected final JsonToken _handleInvalidNumberStart(int i, boolean flag)
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
        char ac[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        i = ac[i];
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
        _reportError((new StringBuilder("Non-standard token '")).append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
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
            _reportError((new StringBuilder("Non-standard token '")).append(s1).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
            j = i;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected final JsonToken _handleUnexpectedValue(int i)
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
        char ac[] = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        return _handleInvalidNumberStart(ac[i], false);
    }

    protected final String _handleUnusualFieldName(int i)
        throws IOException, JsonParseException
    {
        if (i == 39 && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
        {
            return _parseApostropheFieldName();
        }
        if (!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES))
        {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int ai[] = CharTypes.getInputCodeLatin1JsNames();
        int i1 = ai.length;
        int j;
        int k;
        int l;
        int j1;
        boolean flag;
        if (i < i1)
        {
            if (ai[i] == 0 && (i < 48 || i > 57))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = Character.isJavaIdentifierPart((char)i);
        }
        if (!flag)
        {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        l = _inputPtr;
        j = _hashSeed;
        j1 = _inputEnd;
        k = j;
        i = l;
        if (l < j1)
        {
            i = l;
            do
            {
                k = _inputBuffer[i];
                if (k < i1)
                {
                    if (ai[k] != 0)
                    {
                        k = _inputPtr - 1;
                        _inputPtr = i;
                        return _symbols.findSymbol(_inputBuffer, k, i - k, j);
                    }
                } else
                if (!Character.isJavaIdentifierPart((char)k))
                {
                    k = _inputPtr - 1;
                    _inputPtr = i;
                    return _symbols.findSymbol(_inputBuffer, k, i - k, j);
                }
                k = j * 33 + k;
                l = i + 1;
                j = k;
                i = l;
            } while (l < j1);
            i = l;
        }
        j = _inputPtr;
        _inputPtr = i;
        return _parseUnusualFieldName2(j - 1, k, ai);
    }

    protected final void _matchToken(String s, int i)
        throws IOException, JsonParseException
    {
        int k = s.length();
        int j;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOFInValue();
            }
            if (_inputBuffer[_inputPtr] != s.charAt(i))
            {
                _reportInvalidToken(s.substring(0, i), "'null', 'true', 'false' or NaN");
            }
            _inputPtr = _inputPtr + 1;
            j = i + 1;
            i = j;
        } while (j < k);
        char c;
        if (_inputPtr < _inputEnd || loadMore())
        {
            if ((c = _inputBuffer[_inputPtr]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c))
            {
                _reportInvalidToken(s.substring(0, j), "'null', 'true', 'false' or NaN");
                return;
            }
        }
    }

    protected final String _parseApostropheFieldName()
        throws IOException, JsonParseException
    {
        int i = _inputPtr;
        int k = _hashSeed;
        int i1 = _inputEnd;
        int l = k;
        int j = i;
        if (i < i1)
        {
            int ai[] = CharTypes.getInputCodeLatin1();
            int j1 = ai.length;
            do
            {
                char c = _inputBuffer[i];
                if (c == '\'')
                {
                    j = _inputPtr;
                    _inputPtr = i + 1;
                    return _symbols.findSymbol(_inputBuffer, j, i - j, k);
                }
                if (c < j1)
                {
                    l = k;
                    j = i;
                    if (ai[c] != 0)
                    {
                        break;
                    }
                }
                l = k * 33 + c;
                j = i + 1;
                k = l;
                i = j;
            } while (j < i1);
        }
        i = _inputPtr;
        _inputPtr = j;
        return _parseFieldName2(i, l, 39);
    }

    protected final String _parseFieldName(int i)
        throws IOException, JsonParseException
    {
        if (i != 34)
        {
            return _handleUnusualFieldName(i);
        }
        i = _inputPtr;
        int j = _hashSeed;
        int i1 = _inputEnd;
        int l = j;
        int k = i;
        if (i < i1)
        {
            int ai[] = CharTypes.getInputCodeLatin1();
            int j1 = ai.length;
            do
            {
                char c = _inputBuffer[i];
                if (c < j1 && ai[c] != 0)
                {
                    l = j;
                    k = i;
                    if (c == '"')
                    {
                        k = _inputPtr;
                        _inputPtr = i + 1;
                        return _symbols.findSymbol(_inputBuffer, k, i - k, j);
                    }
                    break;
                }
                l = j * 33 + c;
                k = i + 1;
                j = l;
                i = k;
            } while (k < i1);
        }
        i = _inputPtr;
        _inputPtr = k;
        return _parseFieldName2(i, l, 34);
    }

    protected final void _releaseBuffers()
        throws IOException
    {
        super._releaseBuffers();
        char ac[] = _inputBuffer;
        if (ac != null)
        {
            _inputBuffer = null;
            _ioContext.releaseTokenBuffer(ac);
        }
    }

    protected final void _reportInvalidToken(String s, String s1)
        throws IOException, JsonParseException
    {
        s = new StringBuilder(s);
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                break;
            }
            char c = _inputBuffer[_inputPtr];
            if (!Character.isJavaIdentifierPart(c))
            {
                break;
            }
            _inputPtr = _inputPtr + 1;
            s.append(c);
        } while (true);
        _reportError((new StringBuilder("Unrecognized token '")).append(s.toString()).append("': was expecting ").toString());
    }

    protected final void _skipCR()
        throws IOException
    {
        if ((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == '\n')
        {
            _inputPtr = _inputPtr + 1;
        }
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected final void _skipLF()
        throws IOException
    {
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected final void _skipString()
        throws IOException, JsonParseException
    {
        _tokenIncomplete = false;
        int i = _inputPtr;
        int j = _inputEnd;
        char ac[] = _inputBuffer;
        do
        {
            int k = j;
            int l = i;
            if (i >= j)
            {
                _inputPtr = i;
                if (!loadMore())
                {
                    _reportInvalidEOF(": was expecting closing quote for a string value");
                }
                l = _inputPtr;
                k = _inputEnd;
            }
            i = l + 1;
            j = ac[l];
            if (j <= '\\')
            {
                if (j == '\\')
                {
                    _inputPtr = i;
                    _decodeEscaped();
                    i = _inputPtr;
                    j = _inputEnd;
                    continue;
                }
                if (j <= 34)
                {
                    if (j == 34)
                    {
                        _inputPtr = i;
                        return;
                    }
                    if (j < 32)
                    {
                        _inputPtr = i;
                        _throwUnquotedSpace(j, "string value");
                    }
                }
            }
            j = k;
        } while (true);
    }

    public final void close()
        throws IOException
    {
        super.close();
        _symbols.release();
    }

    public final byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException, JsonParseException
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

    public final ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public final Object getEmbeddedObject()
        throws IOException, JsonParseException
    {
        return null;
    }

    protected final char getNextChar(String s)
        throws IOException, JsonParseException
    {
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(s);
        }
        s = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        return s[i];
    }

    public final String getText()
        throws IOException, JsonParseException
    {
        JsonToken jsontoken = _currToken;
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            if (_tokenIncomplete)
            {
                _tokenIncomplete = false;
                _finishString();
            }
            return _textBuffer.contentsAsString();
        } else
        {
            return _getText2(jsontoken);
        }
    }

    public final char[] getTextCharacters()
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

    public final int getTextLength()
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

    public final int getTextOffset()
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

    public final String getValueAsString()
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

    public final String getValueAsString(String s)
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

    protected final boolean loadMore()
        throws IOException
    {
        boolean flag1 = false;
        _currInputProcessed = _currInputProcessed + (long)_inputEnd;
        _currInputRowStart = _currInputRowStart - _inputEnd;
        boolean flag = flag1;
        if (_reader != null)
        {
            int i = _reader.read(_inputBuffer, 0, _inputBuffer.length);
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
                    throw new IOException((new StringBuilder("Reader returned 0 characters when trying to read ")).append(_inputEnd).toString());
                }
            }
        }
        return flag;
    }

    public final JsonToken nextToken()
        throws IOException, JsonParseException
    {
        int j;
        boolean flag;
        _numTypesValid = 0;
        if (_currToken == JsonToken.FIELD_NAME)
        {
            return _nextAfterName();
        }
        if (_tokenIncomplete)
        {
            _skipString();
        }
        j = _skipWSOrEnd();
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
        int i = j;
        if (_parsingContext.expectComma())
        {
            if (j != 44)
            {
                _reportUnexpectedChar(j, (new StringBuilder("was expecting comma to separate ")).append(_parsingContext.getTypeDesc()).append(" entries").toString());
            }
            i = _skipWS();
        }
        flag = _parsingContext.inObject();
        j = i;
        if (flag)
        {
            String s = _parseFieldName(i);
            _parsingContext.setCurrentName(s);
            _currToken = JsonToken.FIELD_NAME;
            i = _skipWS();
            if (i != 58)
            {
                _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
            }
            j = _skipWS();
        }
        j;
        JVM INSTR lookupswitch 19: default 464
    //                   34: 485
    //                   45: 612
    //                   48: 612
    //                   49: 612
    //                   50: 612
    //                   51: 612
    //                   52: 612
    //                   53: 612
    //                   54: 612
    //                   55: 612
    //                   56: 612
    //                   57: 612
    //                   91: 497
    //                   93: 559
    //                   102: 582
    //                   110: 597
    //                   116: 567
    //                   123: 528
    //                   125: 559;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L5
_L3:
        break MISSING_BLOCK_LABEL_612;
_L1:
        JsonToken jsontoken2 = _handleUnexpectedValue(j);
_L10:
        if (flag)
        {
            _nextToken = jsontoken2;
            return _currToken;
        } else
        {
            _currToken = jsontoken2;
            return jsontoken2;
        }
_L2:
        _tokenIncomplete = true;
        jsontoken2 = JsonToken.VALUE_STRING;
          goto _L10
_L4:
        if (!flag)
        {
            _parsingContext = _parsingContext.createChildArrayContext(_tokenInputRow, _tokenInputCol);
        }
        jsontoken2 = JsonToken.START_ARRAY;
          goto _L10
_L9:
        if (!flag)
        {
            _parsingContext = _parsingContext.createChildObjectContext(_tokenInputRow, _tokenInputCol);
        }
        jsontoken2 = JsonToken.START_OBJECT;
          goto _L10
_L5:
        _reportUnexpectedChar(j, "expected a value");
_L8:
        _matchToken("true", 1);
        jsontoken2 = JsonToken.VALUE_TRUE;
          goto _L10
_L6:
        _matchToken("false", 1);
        jsontoken2 = JsonToken.VALUE_FALSE;
          goto _L10
_L7:
        _matchToken("null", 1);
        jsontoken2 = JsonToken.VALUE_NULL;
          goto _L10
        jsontoken2 = parseNumberText(j);
          goto _L10
    }

    protected final JsonToken parseNumberText(int i)
        throws IOException, JsonParseException
    {
        int j;
        int j1;
        int l1;
        int j2;
        boolean flag;
        int k2;
        boolean flag1;
        j1 = 1;
        l1 = 0;
        flag = false;
        char ac[];
        int k;
        char c;
        if (i == 45)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = _inputPtr;
        j2 = j - 1;
        k2 = _inputEnd;
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (j >= _inputEnd) goto _L4; else goto _L3
_L3:
        ac = _inputBuffer;
        k = j + 1;
        c = ac[j];
        if (c > '9') goto _L6; else goto _L5
_L5:
        i = k;
        j = c;
        if (c >= '0') goto _L7; else goto _L6
_L6:
        _inputPtr = k;
        return _handleInvalidNumberStart(c, true);
_L2:
        int l = j;
        j = i;
        i = l;
_L7:
        int i1;
        if (j != 48)
        {
            for (j = i; j < _inputEnd; j = i)
            {
                char ac1[] = _inputBuffer;
                i = j + 1;
                i1 = ac1[j];
                if (i1 < 48 || i1 > 57)
                {
                    break MISSING_BLOCK_LABEL_165;
                }
                j1++;
            }

        }
          goto _L4
        if (i1 != 46) goto _L9; else goto _L8
_L8:
        j = 0;
        i1 = i;
        i = j;
        for (; i1 < k2; i1 = j)
        {
            char ac2[] = _inputBuffer;
            j = i1 + 1;
            i1 = ac2[i1];
            if (i1 < 48 || i1 > 57)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            i++;
        }

          goto _L4
        int k1;
        if (i == 0)
        {
            reportUnexpectedNumberChar(i1, "Decimal point not followed by a digit");
        }
        k1 = i;
        i = j;
_L21:
        if (i1 == 101) goto _L11; else goto _L10
_L10:
        int i2 = i;
        if (i1 != 69) goto _L12; else goto _L11
_L11:
        if (i >= k2) goto _L4; else goto _L13
_L13:
        char ac3[] = _inputBuffer;
        j = i + 1;
        i1 = ac3[i];
        if (i1 != '-' && i1 != '+') goto _L15; else goto _L14
_L14:
        if (j >= k2) goto _L4; else goto _L16
_L16:
        char ac4[] = _inputBuffer;
        i = j + 1;
        i1 = ac4[j];
        j = ((flag) ? 1 : 0);
_L19:
        if (i1 > '9' || i1 < '0') goto _L18; else goto _L17
_L17:
        j++;
        if (i < k2)
        {
            i1 = _inputBuffer[i];
            i++;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L18:
        l1 = j;
        i2 = i;
        if (j == 0)
        {
            reportUnexpectedNumberChar(i1, "Exponent indicator not followed by a digit");
            i2 = i;
            l1 = j;
        }
_L12:
        i = i2 - 1;
        _inputPtr = i;
        _textBuffer.resetWithShared(_inputBuffer, j2, i - j2);
        return reset(flag1, j1, k1, l1);
_L4:
        if (flag1)
        {
            i = j2 + 1;
        } else
        {
            i = j2;
        }
        _inputPtr = i;
        return parseNumberText2(flag1);
_L15:
        i = j;
        j = ((flag) ? 1 : 0);
        if (true) goto _L19; else goto _L9
_L9:
        k1 = 0;
        if (true) goto _L21; else goto _L20
_L20:
    }
}
