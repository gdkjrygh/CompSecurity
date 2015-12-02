// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.dataformat.smile:
//            SmileConstants, SmileBufferRecycler, SmileUtil, ModuleVersion

public class SmileParser extends ParserBase
{

    private static final int NO_INTS[] = new int[0];
    private static final String NO_STRINGS[] = new String[0];
    protected static final ThreadLocal _smileRecyclerRef = new ThreadLocal();
    protected boolean _bufferRecyclable;
    protected boolean _got32BitFloat;
    protected byte _inputBuffer[];
    protected InputStream _inputStream;
    protected boolean _mayContainRawBinary;
    protected ObjectCodec _objectCodec;
    protected int _quad1;
    protected int _quad2;
    protected int _quadBuffer[];
    protected int _seenNameCount;
    protected String _seenNames[];
    protected int _seenStringValueCount;
    protected String _seenStringValues[];
    protected final SmileBufferRecycler _smileBufferRecycler = _smileBufferRecycler();
    protected final BytesToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;
    protected int _typeByte;

    public SmileParser(IOContext iocontext, int i, int j, ObjectCodec objectcodec, BytesToNameCanonicalizer bytestonamecanonicalizer, InputStream inputstream, byte abyte0[], 
            int k, int l, boolean flag)
    {
        super(iocontext, i);
        _tokenIncomplete = false;
        _quadBuffer = NO_INTS;
        _seenNames = NO_STRINGS;
        _seenNameCount = 0;
        _seenStringValues = null;
        _seenStringValueCount = -1;
        _objectCodec = objectcodec;
        _symbols = bytestonamecanonicalizer;
        _inputStream = inputstream;
        _inputBuffer = abyte0;
        _inputPtr = k;
        _inputEnd = l;
        _bufferRecyclable = flag;
        _tokenInputRow = -1;
        _tokenInputCol = -1;
    }

    private final String _addDecodedToSymbols(int i, String s)
    {
        if (i < 5)
        {
            return _symbols.addName(s, _quad1, 0).getName();
        }
        if (i < 9)
        {
            return _symbols.addName(s, _quad1, _quad2).getName();
        } else
        {
            return _symbols.addName(s, _quadBuffer, i + 3 >> 2).getName();
        }
    }

    private final void _addSeenStringValue()
    {
        _finishToken();
        if (_seenStringValueCount < _seenStringValues.length)
        {
            String as[] = _seenStringValues;
            int i = _seenStringValueCount;
            _seenStringValueCount = i + 1;
            as[i] = _textBuffer.contentsAsString();
            return;
        } else
        {
            _expandSeenStringValues();
            return;
        }
    }

    private final void _decodeLongAscii()
    {
        char ac1[];
        int j;
        ac1 = _textBuffer.emptyAndGetCurrentSegment();
        j = 0;
_L2:
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        int k = _inputPtr;
        int l = _inputEnd;
        char ac[] = ac1;
        int i = j;
        if (j >= ac1.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            i = 0;
        }
        l = Math.min(l - k, ac.length - i);
        j = i;
        i = l;
        do
        {
            int i1;
label0:
            {
                ac1 = _inputBuffer;
                i1 = k + 1;
                byte byte0 = ac1[k];
                if (byte0 == -4)
                {
                    _inputPtr = i1;
                    _textBuffer.setCurrentLength(j);
                    return;
                }
                k = j + 1;
                ac[j] = (char)byte0;
                i--;
                if (i > 0)
                {
                    break label0;
                }
                _inputPtr = i1;
                ac1 = ac;
                j = k;
            }
            if (true)
            {
                continue;
            }
            j = k;
            k = i1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void _decodeLongUnicode()
    {
        char ac1[];
        int ai[];
        byte abyte0[];
        int j;
        ac1 = _textBuffer.emptyAndGetCurrentSegment();
        ai = SmileConstants.sUtf8UnitLengths;
        abyte0 = _inputBuffer;
        j = 0;
_L5:
        do
        {
label0:
            {
                int k = _inputPtr;
                int i = k;
                if (k >= _inputEnd)
                {
                    loadMoreGuaranteed();
                    i = _inputPtr;
                }
                char ac[] = ac1;
                k = j;
                if (j >= ac1.length)
                {
                    ac = _textBuffer.finishCurrentSegment();
                    k = 0;
                }
                int l = _inputEnd;
                j = (ac.length - k) + i;
                if (j < l)
                {
                    l = j;
                    j = k;
                } else
                {
                    j = k;
                }
                do
                {
                    if (i >= l)
                    {
                        break;
                    }
                    k = i + 1;
                    i = abyte0[i] & 0xff;
                    if (ai[i] != 0)
                    {
                        _inputPtr = k;
                        if (i == 252)
                        {
                            _textBuffer.setCurrentLength(j);
                            return;
                        }
                        break label0;
                    }
                    ac[j] = (char)i;
                    i = k;
                    j++;
                } while (true);
                _inputPtr = i;
                ac1 = ac;
            }
        } while (true);
        ai[i];
        JVM INSTR tableswitch 1 3: default 220
    //                   1 266
    //                   2 277
    //                   3 312;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_312;
_L1:
        _reportInvalidChar(i);
_L6:
        if (j >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        }
        k = j + 1;
        ac[j] = (char)i;
        ac1 = ac;
        j = k;
          goto _L5
_L2:
        i = _decodeUtf8_2(i);
          goto _L6
_L3:
        if (_inputEnd - _inputPtr >= 2)
        {
            i = _decodeUtf8_3fast(i);
        } else
        {
            i = _decodeUtf8_3(i);
        }
          goto _L6
        k = _decodeUtf8_4(i);
        i = j + 1;
        ac[j] = (char)(0xd800 | k >> 10);
        if (i >= ac.length)
        {
            ac = _textBuffer.finishCurrentSegment();
            j = 0;
        } else
        {
            j = i;
        }
        i = 0xdc00 | k & 0x3ff;
          goto _L6
    }

    private final Name _decodeLongUnicodeName(int ai[], int i, int j)
    {
        char ac[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        j2 = i & 3;
        char ac1[];
        if (j2 < 4)
        {
            i2 = ai[j - 1];
            ai[j - 1] = i2 << (4 - j2 << 3);
        } else
        {
            i2 = 0;
        }
        ac = _textBuffer.emptyAndGetCurrentSegment();
        j1 = 0;
        k = 0;
        if (k >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ai[k >> 2] >> (3 - (k & 3) << 3) & 0xff;
        i1 = k + 1;
        l1 = l;
        k1 = i1;
        if (l <= 127)
        {
            break MISSING_BLOCK_LABEL_555;
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
        if (i1 + l > i)
        {
            _reportInvalidEOF(" in long field name");
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
            break MISSING_BLOCK_LABEL_555;
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
        break MISSING_BLOCK_LABEL_47;
_L1:
        String s = new String(ac, 0, j1);
        if (j2 < 4)
        {
            ai[j - 1] = i2;
        }
        return _symbols.addName(s, ai, j);
        l = l1;
        k = k1;
        i1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final String _decodeShortAsciiName(int i)
    {
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        byte abyte0[] = _inputBuffer;
        int k1 = _inputPtr;
        int k = 0;
        int j = k1;
        int i1;
        do
        {
            i1 = j;
            if (i1 >= (k1 + i) - 3)
            {
                break;
            }
            j = k + 1;
            int i2 = i1 + 1;
            ac[k] = (char)abyte0[i1];
            k = j + 1;
            i1 = i2 + 1;
            ac[j] = (char)abyte0[i2];
            i2 = k + 1;
            int k2 = i1 + 1;
            ac[k] = (char)abyte0[i1];
            j = k2 + 1;
            ac[i2] = (char)abyte0[k2];
            k = i2 + 1;
        } while (true);
        int j2 = i & 3;
        j = i1;
        if (j2 > 0)
        {
            int l2 = k + 1;
            int l1 = i1 + 1;
            ac[k] = (char)abyte0[i1];
            j = l1;
            if (j2 > 1)
            {
                int j1 = l2 + 1;
                int l = l1 + 1;
                ac[l2] = (char)abyte0[l1];
                j = l;
                if (j2 > 2)
                {
                    j = l + 1;
                    ac[j1] = (char)abyte0[l];
                }
            }
        }
        _inputPtr = j;
        _textBuffer.setCurrentLength(i);
        return _textBuffer.contentsAsString();
    }

    private final String _decodeShortUnicodeName(int i)
    {
        char ac[];
        int ai[];
        byte abyte0[];
        int j;
        int k;
        int i1;
        j = 0;
        ac = _textBuffer.emptyAndGetCurrentSegment();
        i1 = _inputPtr;
        _inputPtr = _inputPtr + i;
        ai = SmileConstants.sUtf8UnitLengths;
        abyte0 = _inputBuffer;
        k = i1;
_L8:
        int l;
        int j1;
        l = k;
        if (l >= i1 + i)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        k = l + 1;
        j1 = abyte0[l] & 0xff;
        l = ai[j1];
        if (l == 0) goto _L2; else goto _L1
_L1:
        l;
        JVM INSTR tableswitch 1 3: default 112
    //                   1 180
    //                   2 216
    //                   3 274;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_274;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        _reportError((new StringBuilder()).append("Invalid byte ").append(Integer.toHexString(j1)).append(" in short Unicode text block").toString());
_L2:
        l = j;
        j = k;
        k = j1;
_L9:
        j1 = l + 1;
        ac[l] = (char)k;
        k = j;
        j = j1;
        if (true) goto _L8; else goto _L7
_L7:
        int k1 = k + 1;
        k = (j1 & 0x1f) << 6 | abyte0[k] & 0x3f;
        l = j;
        j = k1;
          goto _L9
_L5:
        l = k + 1;
        k = abyte0[k];
        int l1 = l + 1;
        k = (j1 & 0xf) << 12 | (k & 0x3f) << 6 | abyte0[l] & 0x3f;
        l = j;
        j = l1;
          goto _L9
        l = k + 1;
        k = abyte0[k];
        int i2 = l + 1;
        byte byte0 = abyte0[l];
        l = i2 + 1;
        k = ((j1 & 7) << 18 | (k & 0x3f) << 12 | (byte0 & 0x3f) << 6 | abyte0[i2] & 0x3f) - 0x10000;
        j1 = j + 1;
        ac[j] = (char)(0xd800 | k >> 10);
        k = k & 0x3ff | 0xdc00;
        j = l;
        l = j1;
          goto _L9
        _textBuffer.setCurrentLength(j);
        return _textBuffer.contentsAsString();
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

    private final String[] _expandSeenNames(String as[])
    {
        char c = '\u0400';
        int i = as.length;
        if (i == 0)
        {
            String as1[] = (String[])_smileBufferRecycler.allocSeenNamesBuffer();
            as = as1;
            if (as1 == null)
            {
                as = new String[64];
            }
            return as;
        }
        if (i == 1024)
        {
            _seenNameCount = 0;
            return as;
        }
        if (i == 64)
        {
            c = '\u0100';
        }
        String as2[] = new String[c];
        System.arraycopy(as, 0, as2, 0, as.length);
        return as2;
    }

    private final void _expandSeenStringValues()
    {
        int i = 1024;
        String as[] = _seenStringValues;
        int j = as.length;
        if (j == 0)
        {
            String as1[] = (String[])_smileBufferRecycler.allocSeenStringValuesBuffer();
            as = as1;
            if (as1 == null)
            {
                as = new String[64];
            }
        } else
        if (j == 1024)
        {
            _seenStringValueCount = 0;
        } else
        {
            if (j == 64)
            {
                i = 256;
            }
            String as2[] = new String[i];
            System.arraycopy(as, 0, as2, 0, as.length);
            as = as2;
        }
        _seenStringValues = as;
        as = _seenStringValues;
        i = _seenStringValueCount;
        _seenStringValueCount = i + 1;
        as[i] = _textBuffer.contentsAsString();
    }

    private final Name _findDecodedFromSymbols(int i)
    {
        if (_inputEnd - _inputPtr < i)
        {
            _loadToHaveAtLeast(i);
        }
        if (i < 5)
        {
            int j1 = _inputPtr;
            byte abyte0[] = _inputBuffer;
            int j = abyte0[j1] & 0xff;
            int l = i - 1;
            i = j;
            if (l > 0)
            {
                j1++;
                j = (j << 8) + (abyte0[j1] & 0xff);
                l--;
                i = j;
                if (l > 0)
                {
                    j1++;
                    j = (j << 8) + (abyte0[j1] & 0xff);
                    i = j;
                    if (l - 1 > 0)
                    {
                        i = (j << 8) + (abyte0[j1 + 1] & 0xff);
                    }
                }
            }
            _quad1 = i;
            return _symbols.findName(i);
        }
        if (i < 9)
        {
            int i1 = _inputPtr;
            byte abyte1[] = _inputBuffer;
            int k = abyte1[i1];
            int k1 = i1 + 1;
            i1 = abyte1[k1];
            int l1 = k1 + 1;
            k1 = abyte1[l1];
            l1++;
            i1 = ((((k & 0xff) << 8) + (i1 & 0xff) << 8) + (k1 & 0xff) << 8) + (abyte1[l1] & 0xff);
            l1++;
            k = abyte1[l1] & 0xff;
            k1 = i - 5;
            i = k;
            if (k1 > 0)
            {
                l1++;
                k = (k << 8) + (abyte1[l1] & 0xff);
                k1--;
                i = k;
                if (k1 > 0)
                {
                    l1++;
                    k = (k << 8) + (abyte1[l1] & 0xff);
                    i = k;
                    if (k1 - 1 > 0)
                    {
                        i = (k << 8) + (abyte1[l1 + 1] & 0xff);
                    }
                }
            }
            _quad1 = i1;
            _quad2 = i;
            return _symbols.findName(i1, i);
        } else
        {
            return _findDecodedMedium(i);
        }
    }

    private final Name _findDecodedMedium(int i)
    {
        int j = i + 3 >> 2;
        if (j > _quadBuffer.length)
        {
            _quadBuffer = _growArrayTo(_quadBuffer, j);
        }
        boolean flag = false;
        j = _inputPtr;
        byte abyte0[] = _inputBuffer;
        int k = i;
        i = ((flag) ? 1 : 0);
        do
        {
            int k1 = j + 1;
            byte byte0 = abyte0[j];
            int i1 = k1 + 1;
            k1 = abyte0[k1];
            j = i1 + 1;
            byte byte1 = abyte0[i1];
            i1 = j + 1;
            byte byte2 = abyte0[j];
            int ai[] = _quadBuffer;
            j = i + 1;
            ai[i] = (((byte0 & 0xff) << 8 | k1 & 0xff) << 8 | byte1 & 0xff) << 8 | byte2 & 0xff;
            k -= 4;
            if (k <= 3)
            {
                i = j;
                if (k > 0)
                {
                    i = abyte0[i1] & 0xff;
                    int j1 = k - 1;
                    if (j1 > 0)
                    {
                        i1++;
                        int l = (abyte0[i1] & 0xff) + (i << 8);
                        i = l;
                        if (j1 - 1 > 0)
                        {
                            i = (l << 8) + (abyte0[i1 + 1] & 0xff);
                        }
                    }
                    _quadBuffer[j] = i;
                    i = j + 1;
                }
                return _symbols.findName(_quadBuffer, i);
            }
            i = j;
            j = i1;
        } while (true);
    }

    private final void _finishBigDecimal()
    {
        int i = SmileUtil.zigzagDecode(_readUnsignedVInt());
        _numberBigDecimal = new BigDecimal(new BigInteger(_read7BitBinaryWithLength()), i);
        _numTypesValid = 16;
    }

    private final void _finishBigInteger()
    {
        _numberBigInt = new BigInteger(_read7BitBinaryWithLength());
        _numTypesValid = 4;
    }

    private final void _finishDouble()
    {
        long l = _fourBytesToInt();
        long l1 = _fourBytesToInt();
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        long l2 = abyte0[i];
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        i = _inputPtr;
        _inputPtr = i + 1;
        _numberDouble = Double.longBitsToDouble((((l << 28) + l1 << 7) + l2 << 7) + (long)abyte0[i]);
        _numTypesValid = 8;
    }

    private final void _finishFloat()
    {
        int i = _fourBytesToInt();
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        _numberDouble = Float.intBitsToFloat((i << 7) + abyte0[j]);
        _numTypesValid = 8;
    }

    private final void _finishInt()
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        int k = abyte0[i];
        if (k < 0)
        {
            i = k & 0x3f;
        } else
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte1[] = _inputBuffer;
            i = _inputPtr;
            _inputPtr = i + 1;
            byte byte0 = abyte1[i];
            i = byte0;
            int j = k;
            if (byte0 >= 0)
            {
                k = (k << 7) + byte0;
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte2[] = _inputBuffer;
                i = _inputPtr;
                _inputPtr = i + 1;
                byte0 = abyte2[i];
                i = byte0;
                j = k;
                if (byte0 >= 0)
                {
                    k = (k << 7) + byte0;
                    if (_inputPtr >= _inputEnd)
                    {
                        loadMoreGuaranteed();
                    }
                    byte abyte3[] = _inputBuffer;
                    i = _inputPtr;
                    _inputPtr = i + 1;
                    byte0 = abyte3[i];
                    i = byte0;
                    j = k;
                    if (byte0 >= 0)
                    {
                        k = (k << 7) + byte0;
                        if (_inputPtr >= _inputEnd)
                        {
                            loadMoreGuaranteed();
                        }
                        byte abyte4[] = _inputBuffer;
                        i = _inputPtr;
                        _inputPtr = i + 1;
                        byte0 = abyte4[i];
                        i = byte0;
                        j = k;
                        if (byte0 >= 0)
                        {
                            _reportError("Corrupt input; 32-bit VInt extends beyond 5 data bytes");
                            j = k;
                            i = byte0;
                        }
                    }
                }
            }
            i = (i & 0x3f) + (j << 6);
        }
        _numberInt = SmileUtil.zigzagDecode(i);
        _numTypesValid = 1;
    }

    private final void _finishLong()
    {
        long l = _fourBytesToInt();
        do
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte0[] = _inputBuffer;
            int i = _inputPtr;
            _inputPtr = i + 1;
            i = abyte0[i];
            if (i < 0)
            {
                _numberLong = SmileUtil.zigzagDecode((l << 6) + (long)(i & 0x3f));
                _numTypesValid = 2;
                return;
            }
            l = (l << 7) + (long)i;
        } while (true);
    }

    private final void _finishRawBinary()
    {
        int i = _readUnsignedVInt();
        _binaryValue = new byte[i];
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        int j = 0;
        do
        {
            int k = Math.min(i, _inputEnd - _inputPtr);
            System.arraycopy(_inputBuffer, _inputPtr, _binaryValue, j, k);
            _inputPtr = _inputPtr + k;
            j += k;
            i -= k;
            if (i <= 0)
            {
                return;
            }
            loadMoreGuaranteed();
        } while (true);
    }

    private final int _fourBytesToInt()
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = abyte0[j];
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int k = _inputPtr;
        _inputPtr = k + 1;
        k = abyte0[k];
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        abyte0 = _inputBuffer;
        int l = _inputPtr;
        _inputPtr = l + 1;
        return (((i << 7) + j << 7) + k << 7) + abyte0[l];
    }

    private static int[] _growArrayTo(int ai[], int i)
    {
        int ai1[] = new int[i + 4];
        if (ai != null)
        {
            System.arraycopy(ai, 0, ai1, 0, ai.length);
        }
        return ai1;
    }

    private final void _handleLongFieldName()
    {
        Object obj;
        int i;
        int k;
        obj = _inputBuffer;
        i = 0;
        k = 0;
_L2:
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        int j = _inputPtr;
        _inputPtr = j + 1;
        j = obj[j];
        int l;
        int i1;
        int j1;
        if (-4 == j)
        {
            j = 0;
        } else
        {
            i = j & 0xff;
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            j = _inputPtr;
            _inputPtr = j + 1;
            j = obj[j];
            if (-4 == j)
            {
                j = 1;
            } else
            {
                i = i << 8 | j & 0xff;
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                j = _inputPtr;
                _inputPtr = j + 1;
                j = obj[j];
                if (-4 == j)
                {
                    j = 2;
                } else
                {
label0:
                    {
                        i = i << 8 | j & 0xff;
                        if (_inputPtr >= _inputEnd)
                        {
                            loadMoreGuaranteed();
                        }
                        j = _inputPtr;
                        _inputPtr = j + 1;
                        j = obj[j];
                        if (-4 != j)
                        {
                            break label0;
                        }
                        j = 3;
                    }
                }
            }
        }
        j1 = k << 2;
        i1 = j1;
        l = k;
        if (j > 0)
        {
            if (k >= _quadBuffer.length)
            {
                _quadBuffer = _growArrayTo(_quadBuffer, _quadBuffer.length + 256);
            }
            _quadBuffer[k] = i;
            i1 = j1 + j;
            l = k + 1;
        }
        obj = _symbols.findName(_quadBuffer, l);
        if (obj != null)
        {
            obj = ((Name) (obj)).getName();
        } else
        {
            obj = _decodeLongUnicodeName(_quadBuffer, i1, l).getName();
        }
        if (_seenNames != null)
        {
            if (_seenNameCount >= _seenNames.length)
            {
                _seenNames = _expandSeenNames(_seenNames);
            }
            String as[] = _seenNames;
            i = _seenNameCount;
            _seenNameCount = i + 1;
            as[i] = ((String) (obj));
        }
        _parsingContext.setCurrentName(((String) (obj)));
        return;
        i = i << 8 | j & 0xff;
        if (k >= _quadBuffer.length)
        {
            _quadBuffer = _growArrayTo(_quadBuffer, _quadBuffer.length + 256);
        }
        _quadBuffer[k] = i;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final JsonToken _handleSharedString(int i)
    {
        if (i >= _seenStringValueCount)
        {
            _reportInvalidSharedStringValue(i);
        }
        _textBuffer.resetWithString(_seenStringValues[i]);
        JsonToken jsontoken = JsonToken.VALUE_STRING;
        _currToken = jsontoken;
        return jsontoken;
    }

    private final byte[] _read7BitBinaryWithLength()
    {
        int j = _readUnsignedVInt();
        byte abyte0[] = new byte[j];
        int i;
        for (i = 0; i <= j - 7;)
        {
            if (_inputEnd - _inputPtr < 8)
            {
                _loadToHaveAtLeast(8);
            }
            byte abyte1[] = _inputBuffer;
            int l = _inputPtr;
            _inputPtr = l + 1;
            l = abyte1[l];
            abyte1 = _inputBuffer;
            int k1 = _inputPtr;
            _inputPtr = k1 + 1;
            int i2 = abyte1[k1];
            abyte1 = _inputBuffer;
            k1 = _inputPtr;
            _inputPtr = k1 + 1;
            int k2 = abyte1[k1];
            abyte1 = _inputBuffer;
            k1 = _inputPtr;
            _inputPtr = k1 + 1;
            int l2 = abyte1[k1];
            abyte1 = _inputBuffer;
            k1 = _inputPtr;
            _inputPtr = k1 + 1;
            k1 = abyte1[k1];
            l = (l << 25) + (i2 << 18) + (k2 << 11) + (l2 << 4) + (k1 >> 3);
            abyte1 = _inputBuffer;
            i2 = _inputPtr;
            _inputPtr = i2 + 1;
            i2 = abyte1[i2];
            abyte1 = _inputBuffer;
            k2 = _inputPtr;
            _inputPtr = k2 + 1;
            k2 = abyte1[k2];
            abyte1 = _inputBuffer;
            l2 = _inputPtr;
            _inputPtr = l2 + 1;
            k1 = ((k1 & 7) << 21) + (i2 << 14) + (k2 << 7) + abyte1[l2];
            i2 = i + 1;
            abyte0[i] = (byte)(l >> 24);
            i = i2 + 1;
            abyte0[i2] = (byte)(l >> 16);
            i2 = i + 1;
            abyte0[i] = (byte)(l >> 8);
            i = i2 + 1;
            abyte0[i2] = (byte)l;
            l = i + 1;
            abyte0[i] = (byte)(k1 >> 16);
            i2 = l + 1;
            abyte0[l] = (byte)(k1 >> 8);
            i = i2 + 1;
            abyte0[i2] = (byte)k1;
        }

        int l1 = abyte0.length - i;
        if (l1 > 0)
        {
            if (_inputEnd - _inputPtr < l1 + 1)
            {
                _loadToHaveAtLeast(l1 + 1);
            }
            byte abyte2[] = _inputBuffer;
            int k = _inputPtr;
            _inputPtr = k + 1;
            k = abyte2[k];
            for (int i1 = 1; i1 < l1;)
            {
                abyte2 = _inputBuffer;
                int j2 = _inputPtr;
                _inputPtr = j2 + 1;
                k = (k << 7) + abyte2[j2];
                abyte0[i] = (byte)(k >> 7 - i1);
                i1++;
                i++;
            }

            abyte2 = _inputBuffer;
            int j1 = _inputPtr;
            _inputPtr = j1 + 1;
            abyte0[i] = (byte)((k << l1) + abyte2[j1]);
        }
        return abyte0;
    }

    private final int _readUnsignedVInt()
    {
        int i = 0;
        do
        {
            if (_inputPtr >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            byte abyte0[] = _inputBuffer;
            int j = _inputPtr;
            _inputPtr = j + 1;
            j = abyte0[j];
            if (j < 0)
            {
                return (i << 6) + (j & 0x3f);
            }
            i = (i << 7) + j;
        } while (true);
    }

    protected static final SmileBufferRecycler _smileBufferRecycler()
    {
        Object obj = (SoftReference)_smileRecyclerRef.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (SmileBufferRecycler)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new SmileBufferRecycler();
            _smileRecyclerRef.set(new SoftReference(obj1));
        }
        return ((SmileBufferRecycler) (obj1));
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

    protected final void _decodeShortAsciiValue(int i)
    {
        if (_inputEnd - _inputPtr < i)
        {
            _loadToHaveAtLeast(i);
        }
        char ac[] = _textBuffer.emptyAndGetCurrentSegment();
        int k = 0;
        byte abyte0[] = _inputBuffer;
        int l = _inputPtr;
        int j;
        for (j = l; j < l + i;)
        {
            ac[k] = (char)abyte0[j];
            j++;
            k++;
        }

        _inputPtr = j;
        _textBuffer.setCurrentLength(i);
    }

    protected final void _decodeShortUnicodeValue(int i)
    {
        char ac[];
        int ai[];
        byte abyte0[];
        int j;
        int k;
        int i1;
        if (_inputEnd - _inputPtr < i)
        {
            _loadToHaveAtLeast(i);
        }
        j = 0;
        ac = _textBuffer.emptyAndGetCurrentSegment();
        i1 = _inputPtr;
        _inputPtr = _inputPtr + i;
        ai = SmileConstants.sUtf8UnitLengths;
        abyte0 = _inputBuffer;
        k = i1;
_L8:
        int l;
        int j1;
        l = k;
        if (l >= i1 + i)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        k = l + 1;
        j1 = abyte0[l] & 0xff;
        l = ai[j1];
        if (l == 0) goto _L2; else goto _L1
_L1:
        l;
        JVM INSTR tableswitch 1 3: default 128
    //                   1 196
    //                   2 232
    //                   3 290;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_290;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        _reportError((new StringBuilder()).append("Invalid byte ").append(Integer.toHexString(j1)).append(" in short Unicode text block").toString());
_L2:
        l = j;
        j = k;
        k = j1;
_L9:
        j1 = l + 1;
        ac[l] = (char)k;
        k = j;
        j = j1;
        if (true) goto _L8; else goto _L7
_L7:
        int k1 = k + 1;
        k = (j1 & 0x1f) << 6 | abyte0[k] & 0x3f;
        l = j;
        j = k1;
          goto _L9
_L5:
        l = k + 1;
        k = abyte0[k];
        int l1 = l + 1;
        k = (j1 & 0xf) << 12 | (k & 0x3f) << 6 | abyte0[l] & 0x3f;
        l = j;
        j = l1;
          goto _L9
        l = k + 1;
        k = abyte0[k];
        int i2 = l + 1;
        byte byte0 = abyte0[l];
        l = i2 + 1;
        k = ((j1 & 7) << 18 | (k & 0x3f) << 12 | (byte0 & 0x3f) << 6 | abyte0[i2] & 0x3f) - 0x10000;
        j1 = j + 1;
        ac[j] = (char)(0xd800 | k >> 10);
        k = k & 0x3ff | 0xdc00;
        j = l;
        l = j1;
          goto _L9
        _textBuffer.setCurrentLength(j);
        return;
    }

    protected final void _finishNumberToken(int i)
    {
        int j;
        i &= 0x1f;
        j = i >> 2;
        if (j == 1)
        {
            i &= 3;
            if (i == 0)
            {
                _finishInt();
                return;
            }
            if (i == 1)
            {
                _finishLong();
                return;
            }
            if (i == 2)
            {
                _finishBigInteger();
                return;
            } else
            {
                _throwInternal();
                return;
            }
        }
        if (j != 2) goto _L2; else goto _L1
_L1:
        i & 3;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 93
    //                   1 98
    //                   2 103;
           goto _L2 _L3 _L4 _L5
_L2:
        _throwInternal();
        return;
_L3:
        _finishFloat();
        return;
_L4:
        _finishDouble();
        return;
_L5:
        _finishBigDecimal();
        return;
    }

    protected void _finishString()
    {
        _throwInternal();
    }

    protected void _finishToken()
    {
        int i;
        int j;
        _tokenIncomplete = false;
        i = _typeByte;
        j = i >> 5 & 7;
        if (j == 1)
        {
            _finishNumberToken(i);
            return;
        }
        if (j <= 3)
        {
            _decodeShortAsciiValue((i & 0x3f) + 1);
            return;
        }
        if (j <= 5)
        {
            _decodeShortUnicodeValue((i & 0x3f) + 2);
            return;
        }
        if (j != 7) goto _L2; else goto _L1
_L1:
        (i & 0x1f) >> 2;
        JVM INSTR tableswitch 0 7: default 120
    //                   0 125
    //                   1 130
    //                   2 135
    //                   3 120
    //                   4 120
    //                   5 120
    //                   6 120
    //                   7 144;
           goto _L2 _L3 _L4 _L5 _L2 _L2 _L2 _L2 _L6
_L2:
        _throwInternal();
        return;
_L3:
        _decodeLongAscii();
        return;
_L4:
        _decodeLongUnicode();
        return;
_L5:
        _binaryValue = _read7BitBinaryWithLength();
        return;
_L6:
        _finishRawBinary();
        return;
    }

    protected final JsonToken _handleFieldName()
    {
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        _typeByte = i;
        switch (i >> 6 & 3)
        {
        case 0: // '\0'
            switch (i)
            {
            case 32: // ' '
                _parsingContext.setCurrentName("");
                return JsonToken.FIELD_NAME;

            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte1[] = _inputBuffer;
                int j = _inputPtr;
                _inputPtr = j + 1;
                i = ((i & 3) << 8) + (abyte1[j] & 0xff);
                if (i >= _seenNameCount)
                {
                    _reportInvalidSharedName(i);
                }
                _parsingContext.setCurrentName(_seenNames[i]);
                return JsonToken.FIELD_NAME;

            case 52: // '4'
                _handleLongFieldName();
                return JsonToken.FIELD_NAME;
            }
            // fall through

        default:
            if (true)
            {
                continue;
            }
            // fall through

        case 1: // '\001'
            i &= 0x3f;
            if (i >= _seenNameCount)
            {
                _reportInvalidSharedName(i);
            }
            _parsingContext.setCurrentName(_seenNames[i]);
            return JsonToken.FIELD_NAME;

        case 2: // '\002'
            i = (i & 0x3f) + 1;
            Object obj = _findDecodedFromSymbols(i);
            if (obj != null)
            {
                obj = ((Name) (obj)).getName();
                _inputPtr = i + _inputPtr;
            } else
            {
                obj = _addDecodedToSymbols(i, _decodeShortAsciiName(i));
            }
            if (_seenNames != null)
            {
                if (_seenNameCount >= _seenNames.length)
                {
                    _seenNames = _expandSeenNames(_seenNames);
                }
                String as[] = _seenNames;
                i = _seenNameCount;
                _seenNameCount = i + 1;
                as[i] = ((String) (obj));
            }
            _parsingContext.setCurrentName(((String) (obj)));
            return JsonToken.FIELD_NAME;

        case 3: // '\003'
            i &= 0x3f;
            if (i > 55)
            {
                if (i == 59)
                {
                    if (!_parsingContext.inObject())
                    {
                        _reportMismatchedEndMarker(125, ']');
                    }
                    _parsingContext = _parsingContext.getParent();
                    return JsonToken.END_OBJECT;
                }
            } else
            {
                i += 2;
                Object obj1 = _findDecodedFromSymbols(i);
                if (obj1 != null)
                {
                    obj1 = ((Name) (obj1)).getName();
                    _inputPtr = i + _inputPtr;
                } else
                {
                    obj1 = _addDecodedToSymbols(i, _decodeShortUnicodeName(i));
                }
                if (_seenNames != null)
                {
                    if (_seenNameCount >= _seenNames.length)
                    {
                        _seenNames = _expandSeenNames(_seenNames);
                    }
                    String as1[] = _seenNames;
                    i = _seenNameCount;
                    _seenNameCount = i + 1;
                    as1[i] = ((String) (obj1));
                }
                _parsingContext.setCurrentName(((String) (obj1)));
                return JsonToken.FIELD_NAME;
            }
            break;
        }
        while (true) 
        {
            _reportError((new StringBuilder()).append("Invalid type marker byte 0x").append(Integer.toHexString(_typeByte)).append(" for expected field name (or END_OBJECT marker)").toString());
            return null;
        }
    }

    protected final boolean _loadToHaveAtLeast(int i)
    {
        if (_inputStream != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = _inputEnd - _inputPtr;
        if (j > 0 && _inputPtr > 0)
        {
            _currInputProcessed = _currInputProcessed + (long)_inputPtr;
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
            _inputEnd = k + _inputEnd;
        } while (true);
        return true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void _parseNumericValue(int i)
    {
        if (_tokenIncomplete)
        {
            i = _typeByte;
            if ((i >> 5 & 7) != 1)
            {
                _reportError((new StringBuilder()).append("Current token (").append(_currToken).append(") not numeric, can not use numeric value accessors").toString());
            }
            _tokenIncomplete = false;
            _finishNumberToken(i);
        }
    }

    protected void _releaseBuffers()
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
        String as[] = _seenNames;
        if (as != null && as.length > 0)
        {
            _seenNames = null;
            if (_seenNameCount > 0)
            {
                Arrays.fill(as, 0, _seenNameCount, null);
            }
            _smileBufferRecycler.releaseSeenNamesBuffer(as);
        }
        as = _seenStringValues;
        if (as != null && as.length > 0)
        {
            _seenStringValues = null;
            if (_seenStringValueCount > 0)
            {
                Arrays.fill(as, 0, _seenStringValueCount, null);
            }
            _smileBufferRecycler.releaseSeenStringValuesBuffer(as);
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
        _reportError((new StringBuilder()).append("Invalid UTF-8 start byte 0x").append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i)
    {
        _reportError((new StringBuilder()).append("Invalid UTF-8 middle byte 0x").append(Integer.toHexString(i)).toString());
    }

    protected void _reportInvalidOther(int i, int j)
    {
        _inputPtr = j;
        _reportInvalidOther(i);
    }

    protected void _reportInvalidSharedName(int i)
    {
        if (_seenNames == null)
        {
            _reportError("Encountered shared name reference, even though document header explicitly declared no shared name references are included");
        }
        _reportError((new StringBuilder()).append("Invalid shared name reference ").append(i).append("; only got ").append(_seenNameCount).append(" names in buffer (invalid content)").toString());
    }

    protected void _reportInvalidSharedStringValue(int i)
    {
        if (_seenStringValues == null)
        {
            _reportError("Encountered shared text value reference, even though document header did not declared shared text value references may be included");
        }
        _reportError((new StringBuilder()).append("Invalid shared text value reference ").append(i).append("; only got ").append(_seenStringValueCount).append(" names in buffer (invalid content)").toString());
    }

    protected void _skip7BitBinary()
    {
        int i = _readUnsignedVInt();
        int k = i / 7;
        int j = k * 8;
        k = i - k * 7;
        i = j;
        if (k > 0)
        {
            i = j + (k + 1);
        }
        _skipBytes(i);
    }

    protected void _skipBytes(int i)
    {
        do
        {
            int j = Math.min(i, _inputEnd - _inputPtr);
            _inputPtr = _inputPtr + j;
            i -= j;
            if (i <= 0)
            {
                return;
            }
            loadMoreGuaranteed();
        } while (true);
    }

    protected void _skipIncomplete()
    {
        int i;
        _tokenIncomplete = false;
        i = _typeByte;
        i >> 5 & 7;
        JVM INSTR tableswitch 1 7: default 60
    //                   1 65
    //                   2 242
    //                   3 242
    //                   4 253
    //                   5 253
    //                   6 60
    //                   7 264;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L1 _L5
_L19:
        _throwInternal();
        return;
_L2:
        i &= 0x1f;
        i >> 2;
        JVM INSTR tableswitch 1 2: default 96
    //                   1 99
    //                   2 188;
           goto _L6 _L7 _L8
_L6:
        continue; /* Loop/switch isn't completed */
_L7:
        i & 3;
        JVM INSTR tableswitch 0 2: default 128
    //                   0 131
    //                   1 168
    //                   2 183;
           goto _L9 _L10 _L11 _L12
_L10:
        break MISSING_BLOCK_LABEL_131;
_L9:
        continue; /* Loop/switch isn't completed */
_L17:
        byte abyte0[];
        i = _inputEnd;
        abyte0 = _inputBuffer;
_L16:
        if (_inputPtr >= i) goto _L14; else goto _L13
_L13:
        int k;
        k = _inputPtr;
        _inputPtr = k + 1;
        if (abyte0[k] >= 0) goto _L16; else goto _L15
_L15:
        return;
_L11:
        _skipBytes(4);
          goto _L17
_L14:
        loadMoreGuaranteed();
          goto _L17
_L12:
        _skip7BitBinary();
        return;
_L8:
        switch (i & 3)
        {
        case 0: // '\0'
            _skipBytes(5);
            return;

        case 1: // '\001'
            _skipBytes(10);
            return;

        case 2: // '\002'
            _readUnsignedVInt();
            _skip7BitBinary();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        _skipBytes((i & 0x3f) + 1);
        return;
_L4:
        _skipBytes((i & 0x3f) + 2);
        return;
_L5:
        switch ((i & 0x1f) >> 2)
        {
        case 0: // '\0'
        case 1: // '\001'
            do
            {
                int j = _inputEnd;
                byte abyte1[] = _inputBuffer;
                while (_inputPtr < j) 
                {
                    int l = _inputPtr;
                    _inputPtr = l + 1;
                    if (abyte1[l] == -4)
                    {
                        return;
                    }
                }
                loadMoreGuaranteed();
            } while (true);

        case 2: // '\002'
            _skip7BitBinary();
            return;

        case 7: // '\007'
            _skipBytes(_readUnsignedVInt());
            return;
        }
_L1:
        if (true) goto _L19; else goto _L18
_L18:
    }

    public void close()
    {
        super.close();
        _symbols.release();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        if (_tokenIncomplete)
        {
            _finishToken();
        }
        if (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            _reportError((new StringBuilder()).append("Current token (").append(_currToken).append(") not VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
        }
        return _binaryValue;
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public JsonLocation getCurrentLocation()
    {
        long l = _currInputProcessed;
        l = (long)_inputPtr + l;
        return new JsonLocation(_ioContext.getSourceReference(), l, -1L, -1, (int)l);
    }

    public Object getEmbeddedObject()
    {
        if (_tokenIncomplete)
        {
            _finishToken();
        }
        if (_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            return _binaryValue;
        } else
        {
            return null;
        }
    }

    public Object getInputSource()
    {
        return _inputStream;
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
    {
        if (_got32BitFloat)
        {
            return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
        } else
        {
            return super.getNumberType();
        }
    }

    public String getText()
    {
        if (_tokenIncomplete)
        {
            _tokenIncomplete = false;
            int i = _typeByte;
            int j = i >> 5 & 7;
            if (j == 2 || j == 3)
            {
                _decodeShortAsciiValue((i & 0x3f) + 1);
                return _textBuffer.contentsAsString();
            }
            if (j == 4 || j == 5)
            {
                _decodeShortUnicodeValue((i & 0x3f) + 2);
                return _textBuffer.contentsAsString();
            }
            _finishToken();
        }
        if (_currToken == JsonToken.VALUE_STRING)
        {
            return _textBuffer.contentsAsString();
        }
        JsonToken jsontoken = _currToken;
        if (jsontoken == null)
        {
            return null;
        }
        if (jsontoken == JsonToken.FIELD_NAME)
        {
            return _parsingContext.getCurrentName();
        }
        if (jsontoken.isNumeric())
        {
            return getNumberValue().toString();
        } else
        {
            return _currToken.asString();
        }
    }

    public char[] getTextCharacters()
    {
        if (_currToken != null)
        {
            if (_tokenIncomplete)
            {
                _finishToken();
            }
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
            {
            default:
                return _currToken.asCharArray();

            case 3: // '\003'
                return _textBuffer.getTextBuffer();

            case 4: // '\004'
                if (!_nameCopied)
                {
                    String s = _parsingContext.getCurrentName();
                    int i = s.length();
                    if (_nameCopyBuffer == null)
                    {
                        _nameCopyBuffer = _ioContext.allocNameCopyBuffer(i);
                    } else
                    if (_nameCopyBuffer.length < i)
                    {
                        _nameCopyBuffer = new char[i];
                    }
                    s.getChars(0, i, _nameCopyBuffer, 0);
                    _nameCopied = true;
                }
                return _nameCopyBuffer;

            case 5: // '\005'
            case 6: // '\006'
                return getNumberValue().toString().toCharArray();
            }
        } else
        {
            return null;
        }
    }

    public int getTextLength()
    {
        if (_currToken != null)
        {
            if (_tokenIncomplete)
            {
                _finishToken();
            }
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
            {
            default:
                return _currToken.asCharArray().length;

            case 3: // '\003'
                return _textBuffer.size();

            case 4: // '\004'
                return _parsingContext.getCurrentName().length();

            case 5: // '\005'
            case 6: // '\006'
                return getNumberValue().toString().length();
            }
        } else
        {
            return 0;
        }
    }

    public int getTextOffset()
    {
        return 0;
    }

    public JsonLocation getTokenLocation()
    {
        return new JsonLocation(_ioContext.getSourceReference(), _tokenInputTotal, -1L, -1, (int)_tokenInputTotal);
    }

    protected boolean handleSignature(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        if (flag)
        {
            _inputPtr = _inputPtr + 1;
        }
        if (_inputPtr >= _inputEnd)
        {
            loadMoreGuaranteed();
        }
        if (_inputBuffer[_inputPtr] != 41)
        {
            if (flag1)
            {
                _reportError((new StringBuilder()).append("Malformed content: signature not valid, starts with 0x3a but followed by 0x").append(Integer.toHexString(_inputBuffer[_inputPtr])).append(", not 0x29").toString());
            }
        } else
        {
            int i = _inputPtr + 1;
            _inputPtr = i;
            if (i >= _inputEnd)
            {
                loadMoreGuaranteed();
            }
            if (_inputBuffer[_inputPtr] != 10)
            {
                if (flag1)
                {
                    _reportError((new StringBuilder()).append("Malformed content: signature not valid, starts with 0x3a, 0x29, but followed by 0x").append(Integer.toHexString(_inputBuffer[_inputPtr])).append(", not 0xA").toString());
                    return false;
                }
            } else
            {
                int j = _inputPtr + 1;
                _inputPtr = j;
                if (j >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte0[] = _inputBuffer;
                j = _inputPtr;
                _inputPtr = j + 1;
                j = abyte0[j];
                int k = j >> 4 & 0xf;
                if (k != 0)
                {
                    _reportError((new StringBuilder()).append("Header version number bits (0x").append(Integer.toHexString(k)).append(") indicate unrecognized version; only 0x0 handled by parser").toString());
                }
                if ((j & 1) == 0)
                {
                    _seenNames = null;
                    _seenNameCount = -1;
                }
                if ((j & 2) != 0)
                {
                    _seenStringValues = NO_STRINGS;
                    _seenStringValueCount = 0;
                }
                flag = flag2;
                if ((j & 4) != 0)
                {
                    flag = true;
                }
                _mayContainRawBinary = flag;
                return true;
            }
        }
        return false;
    }

    public boolean hasTextCharacters()
    {
        if (_currToken == JsonToken.VALUE_STRING)
        {
            return _textBuffer.hasTextAsCharacters();
        }
        if (_currToken == JsonToken.FIELD_NAME)
        {
            return _nameCopied;
        } else
        {
            return false;
        }
    }

    protected final boolean loadMore()
    {
        boolean flag1 = false;
        _currInputProcessed = _currInputProcessed + (long)_inputEnd;
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

    public boolean mayContainRawBinary()
    {
        return _mayContainRawBinary;
    }

    public Boolean nextBooleanValue()
    {
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[nextToken().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Boolean.TRUE;

        case 2: // '\002'
            return Boolean.FALSE;
        }
    }

    public boolean nextFieldName(SerializableString serializablestring)
    {
        if (!_parsingContext.inObject() || _currToken == JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        obj = serializablestring.asQuotedUTF8();
        i = obj.length;
        if (_inputPtr + i + 1 >= _inputEnd) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        l = _inputPtr;
        byte abyte0[] = _inputBuffer;
        k = l + 1;
        l = abyte0[l];
        _typeByte = l;
        l >> 6 & 3;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 150
    //                   1 315
    //                   2 391
    //                   3 531;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        obj = _handleFieldName();
        _currToken = ((JsonToken) (obj));
        if (obj != JsonToken.FIELD_NAME || !serializablestring.getValue().equals(_parsingContext.getCurrentName())) goto _L10; else goto _L9
_L9:
        return true;
_L5:
        l;
        JVM INSTR lookupswitch 5: default 204
    //                   32: 207
    //                   48: 237
    //                   49: 237
    //                   50: 237
    //                   51: 237;
           goto _L4 _L11 _L12 _L12 _L12 _L12
_L11:
        _currToken = JsonToken.FIELD_NAME;
        _inputPtr = k;
        _parsingContext.setCurrentName("");
        if (i != 0)
        {
            return false;
        }
          goto _L9
_L12:
        i = ((l & 3) << 8) + (_inputBuffer[k] & 0xff);
        if (i >= _seenNameCount)
        {
            _reportInvalidSharedName(i);
        }
        obj = _seenNames[i];
        _parsingContext.setCurrentName(((String) (obj)));
        _inputPtr = k + 1;
        _currToken = JsonToken.FIELD_NAME;
        return ((String) (obj)).equals(serializablestring.getValue());
_L6:
        i = l & 0x3f;
        if (i >= _seenNameCount)
        {
            _reportInvalidSharedName(i);
        }
        _parsingContext.setCurrentName(_seenNames[i]);
        obj = _seenNames[i];
        _parsingContext.setCurrentName(((String) (obj)));
        _inputPtr = k;
        _currToken = JsonToken.FIELD_NAME;
        return ((String) (obj)).equals(serializablestring.getValue());
_L7:
        l = (l & 0x3f) + 1;
        if (l != i) goto _L4; else goto _L13
_L13:
        i = 0;
_L17:
        if (i >= l) goto _L15; else goto _L14
_L14:
        if (obj[i] != _inputBuffer[k + i]) goto _L4; else goto _L16
_L16:
        i++;
          goto _L17
_L15:
        _inputPtr = k + l;
        serializablestring = serializablestring.getValue();
        if (_seenNames != null)
        {
            if (_seenNameCount >= _seenNames.length)
            {
                _seenNames = _expandSeenNames(_seenNames);
            }
            obj = _seenNames;
            i = _seenNameCount;
            _seenNameCount = i + 1;
            obj[i] = serializablestring;
        }
        _parsingContext.setCurrentName(serializablestring);
        _currToken = JsonToken.FIELD_NAME;
        return true;
_L8:
        l &= 0x3f;
        if (l <= 55) goto _L19; else goto _L18
_L18:
        if (l == 59)
        {
            _currToken = JsonToken.END_OBJECT;
            if (!_parsingContext.inObject())
            {
                _reportMismatchedEndMarker(125, ']');
            }
            _inputPtr = k;
            _parsingContext = _parsingContext.getParent();
            return false;
        }
          goto _L4
_L19:
        l += 2;
        if (l != i) goto _L4; else goto _L20
_L20:
        i = 0;
_L24:
        if (i >= l) goto _L22; else goto _L21
_L21:
        if (obj[i] != _inputBuffer[k + i]) goto _L4; else goto _L23
_L23:
        i++;
          goto _L24
          goto _L4
_L22:
        _inputPtr = k + l;
        serializablestring = serializablestring.getValue();
        if (_seenNames != null)
        {
            if (_seenNameCount >= _seenNames.length)
            {
                _seenNames = _expandSeenNames(_seenNames);
            }
            String as[] = _seenNames;
            int j = _seenNameCount;
            _seenNameCount = j + 1;
            as[j] = serializablestring;
        }
        _parsingContext.setCurrentName(serializablestring);
        _currToken = JsonToken.FIELD_NAME;
        return true;
_L10:
        return false;
_L2:
        if (nextToken() != JsonToken.FIELD_NAME || !serializablestring.getValue().equals(getCurrentName()))
        {
            return false;
        }
          goto _L9
    }

    public int nextIntValue(int i)
    {
        if (nextToken() == JsonToken.VALUE_NUMBER_INT)
        {
            i = getIntValue();
        }
        return i;
    }

    public long nextLongValue(long l)
    {
        if (nextToken() == JsonToken.VALUE_NUMBER_INT)
        {
            l = getLongValue();
        }
        return l;
    }

    public String nextTextValue()
    {
        int i;
        int k;
        if (!_parsingContext.inObject() || _currToken == JsonToken.FIELD_NAME)
        {
            if (_tokenIncomplete)
            {
                _skipIncomplete();
            }
            k = _inputPtr;
            i = k;
            if (k >= _inputEnd)
            {
                if (!loadMore())
                {
                    _handleEOF();
                    close();
                    _currToken = null;
                    return null;
                }
                i = _inputPtr;
            }
            byte abyte0[] = _inputBuffer;
            k = i + 1;
            i = abyte0[i];
            _tokenInputTotal = _currInputProcessed + (long)_inputPtr;
            _binaryValue = null;
            _typeByte = i;
            switch (i >> 5 & 7)
            {
            case 6: // '\006'
            default:
                break;

            case 2: // '\002'
            case 3: // '\003'
                break MISSING_BLOCK_LABEL_268;

            case 4: // '\004'
            case 5: // '\005'
                break MISSING_BLOCK_LABEL_361;

            case 0: // '\0'
                if (i == 0)
                {
                    _reportError("Invalid token byte 0x00");
                }
                i--;
                if (i >= _seenStringValueCount)
                {
                    _reportInvalidSharedStringValue(i);
                }
                _inputPtr = k;
                String s = _seenStringValues[i];
                _textBuffer.resetWithString(s);
                _currToken = JsonToken.VALUE_STRING;
                return s;

            case 1: // '\001'
                break;
            }
            break MISSING_BLOCK_LABEL_237;
        }
_L1:
        if (nextToken() == JsonToken.VALUE_STRING)
        {
            return getText();
        } else
        {
            return null;
        }
        if ((i & 0x1f) == 0)
        {
            _inputPtr = k;
            _textBuffer.resetWithEmpty();
            _currToken = JsonToken.VALUE_STRING;
            return "";
        }
          goto _L1
        _currToken = JsonToken.VALUE_STRING;
        _inputPtr = k;
        _decodeShortAsciiValue((i & 0x3f) + 1);
        if (_seenStringValueCount >= 0)
        {
            if (_seenStringValueCount < _seenStringValues.length)
            {
                String s1 = _textBuffer.contentsAsString();
                String as[] = _seenStringValues;
                i = _seenStringValueCount;
                _seenStringValueCount = i + 1;
                as[i] = s1;
                return s1;
            } else
            {
                _expandSeenStringValues();
                return _textBuffer.contentsAsString();
            }
        } else
        {
            return _textBuffer.contentsAsString();
        }
        _currToken = JsonToken.VALUE_STRING;
        _inputPtr = k;
        _decodeShortUnicodeValue((i & 0x3f) + 2);
        if (_seenStringValueCount >= 0)
        {
            if (_seenStringValueCount < _seenStringValues.length)
            {
                String s2 = _textBuffer.contentsAsString();
                String as1[] = _seenStringValues;
                int j = _seenStringValueCount;
                _seenStringValueCount = j + 1;
                as1[j] = s2;
                return s2;
            } else
            {
                _expandSeenStringValues();
                return _textBuffer.contentsAsString();
            }
        } else
        {
            return _textBuffer.contentsAsString();
        }
    }

    public JsonToken nextToken()
    {
        boolean flag = true;
        _numTypesValid = 0;
        if (_tokenIncomplete)
        {
            _skipIncomplete();
        }
        _tokenInputTotal = _currInputProcessed + (long)_inputPtr;
        _binaryValue = null;
        if (_parsingContext.inObject() && _currToken != JsonToken.FIELD_NAME)
        {
            JsonToken jsontoken = _handleFieldName();
            _currToken = jsontoken;
            return jsontoken;
        }
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _handleEOF();
            close();
            _currToken = null;
            return null;
        }
        byte abyte0[] = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        i = abyte0[i];
        _typeByte = i;
        switch (i >> 5 & 7)
        {
        case 0: // '\0'
            if (i == 0)
            {
                _reportError("Invalid token byte 0x00");
            }
            return _handleSharedString(i - 1);

        case 1: // '\001'
            int j = i & 0x1f;
            if (j < 4)
            {
                JsonToken jsontoken4;
                switch (j)
                {
                default:
                    JsonToken jsontoken1 = JsonToken.VALUE_TRUE;
                    _currToken = jsontoken1;
                    return jsontoken1;

                case 0: // '\0'
                    _textBuffer.resetWithEmpty();
                    JsonToken jsontoken2 = JsonToken.VALUE_STRING;
                    _currToken = jsontoken2;
                    return jsontoken2;

                case 1: // '\001'
                    JsonToken jsontoken3 = JsonToken.VALUE_NULL;
                    _currToken = jsontoken3;
                    return jsontoken3;

                case 2: // '\002'
                    jsontoken4 = JsonToken.VALUE_FALSE;
                    break;
                }
                _currToken = jsontoken4;
                return jsontoken4;
            }
            if (j < 8)
            {
                if ((j & 3) <= 2)
                {
                    _tokenIncomplete = true;
                    _numTypesValid = 0;
                    JsonToken jsontoken5 = JsonToken.VALUE_NUMBER_INT;
                    _currToken = jsontoken5;
                    return jsontoken5;
                }
                continue;
            }
            if (j < 12)
            {
                j &= 3;
                if (j <= 2)
                {
                    _tokenIncomplete = true;
                    _numTypesValid = 0;
                    JsonToken jsontoken6;
                    if (j != 0)
                    {
                        flag = false;
                    }
                    _got32BitFloat = flag;
                    jsontoken6 = JsonToken.VALUE_NUMBER_FLOAT;
                    _currToken = jsontoken6;
                    return jsontoken6;
                }
            } else
            {
                if (j == 26 && handleSignature(false, false))
                {
                    if (_currToken == null)
                    {
                        return nextToken();
                    } else
                    {
                        _currToken = null;
                        return null;
                    }
                }
                _reportError("Unrecognized token byte 0x3A (malformed segment header?");
            }
            continue;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            _currToken = JsonToken.VALUE_STRING;
            if (_seenStringValueCount >= 0)
            {
                _addSeenStringValue();
            } else
            {
                _tokenIncomplete = true;
            }
            return _currToken;

        case 6: // '\006'
            _numberInt = SmileUtil.zigzagDecode(i & 0x1f);
            _numTypesValid = 1;
            JsonToken jsontoken7 = JsonToken.VALUE_NUMBER_INT;
            _currToken = jsontoken7;
            return jsontoken7;

        case 7: // '\007'
            switch (i & 0x1f)
            {
            case 0: // '\0'
            case 4: // '\004'
                _tokenIncomplete = true;
                JsonToken jsontoken8 = JsonToken.VALUE_STRING;
                _currToken = jsontoken8;
                return jsontoken8;

            case 8: // '\b'
                _tokenIncomplete = true;
                JsonToken jsontoken9 = JsonToken.VALUE_EMBEDDED_OBJECT;
                _currToken = jsontoken9;
                return jsontoken9;

            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                if (_inputPtr >= _inputEnd)
                {
                    loadMoreGuaranteed();
                }
                byte abyte1[] = _inputBuffer;
                int k = _inputPtr;
                _inputPtr = k + 1;
                return _handleSharedString(((i & 3) << 8) + (abyte1[k] & 0xff));

            case 24: // '\030'
                _parsingContext = _parsingContext.createChildArrayContext(-1, -1);
                JsonToken jsontoken10 = JsonToken.START_ARRAY;
                _currToken = jsontoken10;
                return jsontoken10;

            case 25: // '\031'
                if (!_parsingContext.inArray())
                {
                    _reportMismatchedEndMarker(93, '}');
                }
                _parsingContext = _parsingContext.getParent();
                JsonToken jsontoken11 = JsonToken.END_ARRAY;
                _currToken = jsontoken11;
                return jsontoken11;

            case 26: // '\032'
                _parsingContext = _parsingContext.createChildObjectContext(-1, -1);
                JsonToken jsontoken12 = JsonToken.START_OBJECT;
                _currToken = jsontoken12;
                return jsontoken12;

            case 27: // '\033'
                _reportError("Invalid type marker byte 0xFB in value mode (would be END_OBJECT in key mode)");
                // fall through

            case 29: // '\035'
                _tokenIncomplete = true;
                JsonToken jsontoken13 = JsonToken.VALUE_EMBEDDED_OBJECT;
                _currToken = jsontoken13;
                return jsontoken13;

            case 31: // '\037'
                _currToken = null;
                return null;
            }
            break;
        }
        while (true) 
        {
            _reportError((new StringBuilder()).append("Invalid type marker byte 0x").append(Integer.toHexString(i & 0xff)).append(" for expected value token").toString());
            return null;
        }
    }

    public int releaseBuffered(OutputStream outputstream)
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

    public Version version()
    {
        return ModuleVersion.instance.version();
    }


    private class _cls1
    {

        static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

        static 
        {
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
