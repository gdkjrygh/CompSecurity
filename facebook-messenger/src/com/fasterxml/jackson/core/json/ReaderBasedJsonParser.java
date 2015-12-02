// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// Referenced classes of package com.fasterxml.jackson.core.json:
//            JsonReadContext, CoreVersion

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

    private String _parseFieldName2(int i, int j, int k)
    {
        char ac[];
        _textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
        ac = _textBuffer.getCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
_L3:
        char c1;
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF((new StringBuilder()).append(": was expecting closing '").append((char)k).append("' for name").toString());
        }
        char ac1[] = _inputBuffer;
        int l = _inputPtr;
        _inputPtr = l + 1;
        c1 = ac1[l];
        if (c1 > '\\')
        {
            break MISSING_BLOCK_LABEL_243;
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
                _textBuffer.setCurrentLength(i);
                textbuffer = _textBuffer;
                ac2 = textbuffer.getTextBuffer();
                i = textbuffer.getTextOffset();
                k = textbuffer.size();
                return _symbols.findSymbol(ac2, i, k, j);
            }
            if (c1 < ' ')
            {
                _throwUnquotedSpace(c1, "name");
            }
        }
        c = c1;
          goto _L4
    }

    private String _parseUnusualFieldName2(int i, int j, int ai[])
    {
        char ac[];
        int i1;
        _textBuffer.resetWithShared(_inputBuffer, i, _inputPtr - i);
        ac = _textBuffer.getCurrentSegment();
        i = _textBuffer.getCurrentSegmentSize();
        i1 = ai.length;
_L5:
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        char c;
        _textBuffer.setCurrentLength(i);
        ai = _textBuffer;
        ac = ai.getTextBuffer();
        i = ai.getTextOffset();
        int k = ai.size();
        return _symbols.findSymbol(ac, i, k, j);
_L2:
        int l;
        if ((c = _inputBuffer[_inputPtr]) > i1 ? Character.isJavaIdentifierPart(c) : ai[c] == 0) goto _L3; else goto _L1
_L3:
        _inputPtr = _inputPtr + 1;
        j = j * 33 + c;
        l = i + 1;
        ac[i] = c;
        if (l >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        } else
        {
            i = l;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private final void _skipCComment()
    {
        do
        {
            int i;
label0:
            {
label1:
                {
                    if (_inputPtr < _inputEnd || loadMore())
                    {
                        char ac[] = _inputBuffer;
                        i = _inputPtr;
                        _inputPtr = i + 1;
                        i = ac[i];
                        if (i > '*')
                        {
                            continue;
                        }
                        if (i != '*')
                        {
                            break label0;
                        }
                        if (_inputPtr < _inputEnd || loadMore())
                        {
                            break label1;
                        }
                    }
                    _reportInvalidEOF(" in a comment");
                    return;
                }
                if (_inputBuffer[_inputPtr] == '/')
                {
                    _inputPtr = _inputPtr + 1;
                    return;
                }
                continue;
            }
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

    private final void _skipCppComment()
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

    private final int _skipWS()
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
        throw _constructError((new StringBuilder()).append("Unexpected end-of-input within/between ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
    }

    private final int _skipWSOrEnd()
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

    private final char _verifyNoLeadingZeroes()
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

    private final JsonToken parseNumberText2(boolean flag)
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
            break MISSING_BLOCK_LABEL_864;
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
        l = 1;
        c = '\0';
        i1 = k;
        k = i;
        i = l;
_L20:
        if (i1 == 0)
        {
            reportInvalidNumber((new StringBuilder()).append("Missing integer part (next char ").append(_getCharDesc(c)).append(")").toString());
        }
        if (c != '.') goto _L4; else goto _L3
_L3:
        ac1[k] = c;
        k++;
        l = 0;
_L15:
        if (_inputPtr < _inputEnd || loadMore()) goto _L6; else goto _L5
_L5:
        i = 1;
_L13:
        if (l == 0)
        {
            reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
        }
        j1 = l;
        l = k;
        k = i;
        ac2 = ac1;
        i = l;
_L18:
        if (c != 'e' && c != 'E') goto _L8; else goto _L7
_L7:
        l = i;
        ac1 = ac2;
        if (i >= ac2.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            l = 0;
        }
        i = l + 1;
        ac1[l] = c;
        if (_inputPtr < _inputEnd)
        {
            ac2 = _inputBuffer;
            l = _inputPtr;
            _inputPtr = l + 1;
            c = ac2[l];
        } else
        {
            c = getNextChar("expected a digit for number exponent");
        }
        if (c == '-' || c == '+')
        {
            if (i >= ac1.length)
            {
                ac1 = _textBuffer.finishCurrentSegment();
                i = 0;
            }
            ac1[i] = c;
            if (_inputPtr < _inputEnd)
            {
                ac2 = _inputBuffer;
                l = _inputPtr;
                _inputPtr = l + 1;
                c = ac2[l];
            } else
            {
                c = getNextChar("expected a digit for number exponent");
            }
            i++;
            l = 0;
        } else
        {
            l = 0;
        }
        if (c > '9' || c < '0') goto _L10; else goto _L9
_L9:
        l++;
        k1 = i;
        ac2 = ac1;
        if (i >= ac1.length)
        {
            ac2 = _textBuffer.finishCurrentSegment();
            k1 = 0;
        }
        i = k1 + 1;
        ac2[k1] = c;
        if (_inputPtr < _inputEnd || loadMore()) goto _L12; else goto _L11
_L11:
        k1 = 1;
        k = i;
        i = k1;
_L16:
        k1 = i;
        l1 = k;
        i2 = l;
        if (l == 0)
        {
            reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
            i2 = l;
            l1 = k;
            k1 = i;
        }
_L17:
        if (k1 == 0)
        {
            _inputPtr = _inputPtr - 1;
        }
        _textBuffer.setCurrentLength(l1);
        return reset(flag, i1, j1, i2);
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
        if (c >= '0' && c <= '9') goto _L14; else goto _L13
_L14:
        l++;
        if (k >= ac1.length)
        {
            ac1 = _textBuffer.finishCurrentSegment();
            k = 0;
        }
        j1 = k + 1;
        ac1[k] = c;
        k = j1;
          goto _L15
_L12:
        ac1 = _inputBuffer;
        k1 = _inputPtr;
        _inputPtr = k1 + 1;
        c = ac1[k1];
        ac1 = ac2;
        break MISSING_BLOCK_LABEL_456;
_L10:
        k1 = i;
        i = k;
        k = k1;
          goto _L16
_L8:
        k1 = k;
        l1 = i;
          goto _L17
_L4:
        j1 = 0;
        l = i;
        i = k;
        ac2 = ac1;
        k = l;
          goto _L18
        l = 0;
        i1 = k;
        ac1 = ac2;
        k = i;
        i = l;
        if (true) goto _L20; else goto _L19
_L19:
    }

    protected void _closeInput()
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

    protected byte[] _decodeBase64(Base64Variant base64variant)
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
                        throw reportInvalidBase64Char(base64variant, c, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.getPaddingChar()).append("'").toString());
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

    protected void _finishString()
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

    protected void _finishString2()
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
            if (c1 == '"')
            {
                _textBuffer.setCurrentLength(i);
                return;
            }
            c = c1;
            if (c1 < ' ')
            {
                _throwUnquotedSpace(c1, "string value");
                c = c1;
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
            if (c1 == '\'')
            {
                _textBuffer.setCurrentLength(i);
                return JsonToken.VALUE_STRING;
            }
            c = c1;
            if (c1 < ' ')
            {
                _throwUnquotedSpace(c1, "string value");
                c = c1;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected JsonToken _handleInvalidNumberStart(int i, boolean flag)
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

    protected final JsonToken _handleUnexpectedValue(int i)
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
    {
        int i;
        int j;
        int k;
        int i1;
        int k1;
        i1 = _inputPtr;
        k = _hashSeed;
        k1 = _inputEnd;
        i = k;
        j = i1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        int ai[];
        int l1;
        ai = CharTypes.getInputCodeLatin1();
        l1 = ai.length;
        j = i1;
        i = k;
_L4:
        int l = _inputBuffer[j];
        if (l == 39)
        {
            l = _inputPtr;
            _inputPtr = j + 1;
            return _symbols.findSymbol(_inputBuffer, l, j - l, i);
        }
        if (l >= l1 || ai[l] == 0)
        {
            int j1 = i * 33 + l;
            l = j + 1;
            i = j1;
            j = l;
            if (l < k1)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j1;
            j = l;
        }
_L2:
        l = _inputPtr;
        _inputPtr = j;
        return _parseFieldName2(l, i, 39);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final String _parseFieldName(int i)
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

    protected void _releaseBuffers()
    {
        super._releaseBuffers();
        char ac[] = _inputBuffer;
        if (ac != null)
        {
            _inputBuffer = null;
            _ioContext.releaseTokenBuffer(ac);
        }
    }

    protected void _reportInvalidToken(String s, String s1)
    {
        s = new StringBuilder(s);
_L5:
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        char c;
        _reportError((new StringBuilder()).append("Unrecognized token '").append(s.toString()).append("': was expecting ").toString());
        return;
_L2:
        if (!Character.isJavaIdentifierPart(c = _inputBuffer[_inputPtr])) goto _L1; else goto _L3
_L3:
        _inputPtr = _inputPtr + 1;
        s.append(c);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void _skipCR()
    {
        if ((_inputPtr < _inputEnd || loadMore()) && _inputBuffer[_inputPtr] == '\n')
        {
            _inputPtr = _inputPtr + 1;
        }
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected final void _skipLF()
    {
        _currInputRow = _currInputRow + 1;
        _currInputRowStart = _inputPtr;
    }

    protected void _skipString()
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

    public void close()
    {
        super.close();
        _symbols.release();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
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
    {
        return null;
    }

    public Object getInputSource()
    {
        return _reader;
    }

    protected final char getNextChar(String s)
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

    public char[] getTextCharacters()
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

    protected final boolean loadMore()
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
                    throw new IOException((new StringBuilder()).append("Reader returned 0 characters when trying to read ").append(_inputEnd).toString());
                }
            }
        }
        return flag;
    }

    public Boolean nextBooleanValue()
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

    public int nextIntValue(int i)
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
                _reportUnexpectedChar(j, (new StringBuilder()).append("was expecting comma to separate ").append(_parsingContext.getTypeDesc()).append(" entries").toString());
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
        JVM INSTR lookupswitch 19: default 468
    //                   34: 489
    //                   45: 616
    //                   48: 616
    //                   49: 616
    //                   50: 616
    //                   51: 616
    //                   52: 616
    //                   53: 616
    //                   54: 616
    //                   55: 616
    //                   56: 616
    //                   57: 616
    //                   91: 501
    //                   93: 563
    //                   102: 586
    //                   110: 601
    //                   116: 571
    //                   123: 532
    //                   125: 563;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L5
_L3:
        break MISSING_BLOCK_LABEL_616;
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
    {
        int j;
        int l;
        int j1;
        int l1;
        boolean flag;
        int i2;
        boolean flag1;
        l = 1;
        j1 = 0;
        flag = false;
        if (i == 45)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = _inputPtr;
        l1 = j - 1;
        i2 = _inputEnd;
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (j < _inputEnd) goto _L4; else goto _L3
_L3:
        int i1;
        char ac[];
        int k;
        int k1;
        if (flag1)
        {
            i = l1 + 1;
        } else
        {
            i = l1;
        }
        _inputPtr = i;
        return parseNumberText2(flag1);
_L4:
        ac = _inputBuffer;
        k = j + 1;
        i1 = ac[j];
        if (i1 <= '9')
        {
            i = k;
            j = i1;
            if (i1 >= '0')
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        _inputPtr = k;
        return _handleInvalidNumberStart(i1, true);
_L2:
        k = j;
        j = i;
        i = k;
        if (j == 48) goto _L3; else goto _L5
_L5:
        j = i;
_L22:
        if (j >= _inputEnd) goto _L3; else goto _L6
_L6:
        ac = _inputBuffer;
        i = j + 1;
        k = ac[j];
        if (k >= 48 && k <= 57) goto _L8; else goto _L7
_L7:
        if (k != 46)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        j = 0;
        k = i;
        i = j;
_L23:
        if (k >= i2) goto _L3; else goto _L9
_L9:
        ac = _inputBuffer;
        j = k + 1;
        k = ac[k];
        if (k >= 48 && k <= 57) goto _L11; else goto _L10
_L10:
        if (i == 0)
        {
            reportUnexpectedNumberChar(k, "Decimal point not followed by a digit");
        }
        i1 = i;
        i = j;
_L24:
        if (k == 101)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = i;
        if (k != 69) goto _L13; else goto _L12
_L12:
        if (i >= i2) goto _L3; else goto _L14
_L14:
        ac = _inputBuffer;
        j = i + 1;
        k = ac[i];
        if (k != '-' && k != '+') goto _L16; else goto _L15
_L15:
        if (j >= i2) goto _L3; else goto _L17
_L17:
        ac = _inputBuffer;
        i = j + 1;
        k = ac[j];
        j = ((flag) ? 1 : 0);
_L21:
        if (k > '9' || k < '0') goto _L19; else goto _L18
_L18:
        j++;
        if (i >= i2) goto _L3; else goto _L20
_L20:
        k = _inputBuffer[i];
        i++;
          goto _L21
_L8:
        l++;
        j = i;
          goto _L22
_L11:
        i++;
        k = j;
          goto _L23
_L19:
        j1 = j;
        k1 = i;
        if (j == 0)
        {
            reportUnexpectedNumberChar(k, "Exponent indicator not followed by a digit");
            k1 = i;
            j1 = j;
        }
_L13:
        i = k1 - 1;
        _inputPtr = i;
        _textBuffer.resetWithShared(_inputBuffer, l1, i - l1);
        return reset(flag1, l, i1, j1);
_L16:
        i = j;
        j = ((flag) ? 1 : 0);
          goto _L21
        i1 = 0;
          goto _L24
    }

    public int releaseBuffered(Writer writer)
    {
        int i = _inputEnd - _inputPtr;
        if (i < 1)
        {
            return 0;
        } else
        {
            int j = _inputPtr;
            writer.write(_inputBuffer, j, i);
            return i;
        }
    }

    public void setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
    }

    public Version version()
    {
        return CoreVersion.instance.version();
    }

    private class _cls1
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

}
