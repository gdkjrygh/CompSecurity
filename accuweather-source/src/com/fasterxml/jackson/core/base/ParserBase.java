// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.base:
//            ParserMinimalBase

public abstract class ParserBase extends ParserMinimalBase
{

    static final BigDecimal BD_MAX_INT;
    static final BigDecimal BD_MAX_LONG;
    static final BigDecimal BD_MIN_INT;
    static final BigDecimal BD_MIN_LONG;
    static final BigInteger BI_MAX_INT;
    static final BigInteger BI_MAX_LONG;
    static final BigInteger BI_MIN_INT;
    static final BigInteger BI_MIN_LONG;
    protected static final char CHAR_NULL = 0;
    protected static final int INT_0 = 48;
    protected static final int INT_1 = 49;
    protected static final int INT_2 = 50;
    protected static final int INT_3 = 51;
    protected static final int INT_4 = 52;
    protected static final int INT_5 = 53;
    protected static final int INT_6 = 54;
    protected static final int INT_7 = 55;
    protected static final int INT_8 = 56;
    protected static final int INT_9 = 57;
    protected static final int INT_DECIMAL_POINT = 46;
    protected static final int INT_E = 69;
    protected static final int INT_MINUS = 45;
    protected static final int INT_PLUS = 43;
    protected static final int INT_e = 101;
    static final double MAX_INT_D = 2147483647D;
    static final long MAX_INT_L = 0x7fffffffL;
    static final double MAX_LONG_D = 9.2233720368547758E+18D;
    static final double MIN_INT_D = -2147483648D;
    static final long MIN_INT_L = 0xffffffff80000000L;
    static final double MIN_LONG_D = -9.2233720368547758E+18D;
    protected static final int NR_BIGDECIMAL = 16;
    protected static final int NR_BIGINT = 4;
    protected static final int NR_DOUBLE = 8;
    protected static final int NR_INT = 1;
    protected static final int NR_LONG = 2;
    protected static final int NR_UNKNOWN = 0;
    protected byte _binaryValue[];
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char _nameCopyBuffer[];
    protected JsonToken _nextToken;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;

    protected ParserBase(IOContext iocontext, int i)
    {
        _inputPtr = 0;
        _inputEnd = 0;
        _currInputProcessed = 0L;
        _currInputRow = 1;
        _currInputRowStart = 0;
        _tokenInputTotal = 0L;
        _tokenInputRow = 1;
        _tokenInputCol = 0;
        _nameCopyBuffer = null;
        _nameCopied = false;
        _byteArrayBuilder = null;
        _numTypesValid = 0;
        _features = i;
        _ioContext = iocontext;
        _textBuffer = iocontext.constructTextBuffer();
        _parsingContext = JsonReadContext.createRootContext();
    }

    private void _parseSlowFloatValue(int i)
        throws IOException, JsonParseException
    {
        if (i == 16)
        {
            try
            {
                _numberBigDecimal = _textBuffer.contentsAsDecimal();
                _numTypesValid = 16;
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                _wrapError((new StringBuilder()).append("Malformed numeric value '").append(_textBuffer.contentsAsString()).append("'").toString(), numberformatexception);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        _numberDouble = _textBuffer.contentsAsDouble();
        _numTypesValid = 8;
        return;
    }

    private void _parseSlowIntValue(int i, char ac[], int j, int k)
        throws IOException, JsonParseException
    {
        String s = _textBuffer.contentsAsString();
        if (NumberInput.inLongRange(ac, j, k, _numberNegative))
        {
            _numberLong = Long.parseLong(s);
            _numTypesValid = 2;
            return;
        }
        try
        {
            _numberBigInt = new BigInteger(s);
            _numTypesValid = 4;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            _wrapError((new StringBuilder()).append("Malformed numeric value '").append(s).append("'").toString(), ac);
        }
        return;
    }

    protected abstract void _closeInput()
        throws IOException;

    protected final int _decodeBase64Escape(Base64Variant base64variant, char c, int i)
        throws IOException, JsonParseException
    {
        if (c != '\\')
        {
            throw reportInvalidBase64Char(base64variant, c, i);
        }
        char c1 = _decodeEscaped();
        if (c1 <= ' ' && i == 0)
        {
            c = '\uFFFF';
        } else
        {
            int j = base64variant.decodeBase64Char(c1);
            c = j;
            if (j < 0)
            {
                throw reportInvalidBase64Char(base64variant, c1, i);
            }
        }
        return c;
    }

    protected final int _decodeBase64Escape(Base64Variant base64variant, int i, int j)
        throws IOException, JsonParseException
    {
        if (i != 92)
        {
            throw reportInvalidBase64Char(base64variant, i, j);
        }
        char c = _decodeEscaped();
        if (c <= ' ' && j == 0)
        {
            i = -1;
        } else
        {
            int k = base64variant.decodeBase64Char(c);
            i = k;
            if (k < 0)
            {
                throw reportInvalidBase64Char(base64variant, c, j);
            }
        }
        return i;
    }

    protected char _decodeEscaped()
        throws IOException, JsonParseException
    {
        throw new UnsupportedOperationException();
    }

    protected abstract void _finishString()
        throws IOException, JsonParseException;

    public ByteArrayBuilder _getByteArrayBuilder()
    {
        if (_byteArrayBuilder == null)
        {
            _byteArrayBuilder = new ByteArrayBuilder();
        } else
        {
            _byteArrayBuilder.reset();
        }
        return _byteArrayBuilder;
    }

    protected void _handleEOF()
        throws JsonParseException
    {
        if (!_parsingContext.inRoot())
        {
            _reportInvalidEOF((new StringBuilder()).append(": expected close marker for ").append(_parsingContext.getTypeDesc()).append(" (from ").append(_parsingContext.getStartLocation(_ioContext.getSourceReference())).append(")").toString());
        }
    }

    protected void _parseNumericValue(int i)
        throws IOException, JsonParseException
    {
        if (_currToken == JsonToken.VALUE_NUMBER_INT)
        {
            char ac[] = _textBuffer.getTextBuffer();
            int k = _textBuffer.getTextOffset();
            int l = _intLength;
            int j = k;
            if (_numberNegative)
            {
                j = k + 1;
            }
            if (l <= 9)
            {
                j = NumberInput.parseInt(ac, j, l);
                i = j;
                if (_numberNegative)
                {
                    i = -j;
                }
                _numberInt = i;
                _numTypesValid = 1;
                return;
            }
            if (l <= 18)
            {
                long l2 = NumberInput.parseLong(ac, j, l);
                long l1 = l2;
                if (_numberNegative)
                {
                    l1 = -l2;
                }
                if (l == 10)
                {
                    if (_numberNegative)
                    {
                        if (l1 >= 0xffffffff80000000L)
                        {
                            _numberInt = (int)l1;
                            _numTypesValid = 1;
                            return;
                        }
                    } else
                    if (l1 <= 0x7fffffffL)
                    {
                        _numberInt = (int)l1;
                        _numTypesValid = 1;
                        return;
                    }
                }
                _numberLong = l1;
                _numTypesValid = 2;
                return;
            } else
            {
                _parseSlowIntValue(i, ac, j, l);
                return;
            }
        }
        if (_currToken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            _parseSlowFloatValue(i);
            return;
        } else
        {
            _reportError((new StringBuilder()).append("Current token (").append(_currToken).append(") not numeric, can not use numeric value accessors").toString());
            return;
        }
    }

    protected void _releaseBuffers()
        throws IOException
    {
        _textBuffer.releaseBuffers();
        char ac[] = _nameCopyBuffer;
        if (ac != null)
        {
            _nameCopyBuffer = null;
            _ioContext.releaseNameCopyBuffer(ac);
        }
    }

    protected void _reportMismatchedEndMarker(int i, char c)
        throws JsonParseException
    {
        String s = (new StringBuilder()).append("").append(_parsingContext.getStartLocation(_ioContext.getSourceReference())).toString();
        _reportError((new StringBuilder()).append("Unexpected close marker '").append((char)i).append("': expected '").append(c).append("' (for ").append(_parsingContext.getTypeDesc()).append(" starting at ").append(s).append(")").toString());
    }

    public void close()
        throws IOException
    {
        if (_closed)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        _closed = true;
        _closeInput();
        _releaseBuffers();
        return;
        Exception exception;
        exception;
        _releaseBuffers();
        throw exception;
    }

    protected void convertNumberToBigDecimal()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 8) != 0)
        {
            _numberBigDecimal = new BigDecimal(getText());
        } else
        if ((_numTypesValid & 4) != 0)
        {
            _numberBigDecimal = new BigDecimal(_numberBigInt);
        } else
        if ((_numTypesValid & 2) != 0)
        {
            _numberBigDecimal = BigDecimal.valueOf(_numberLong);
        } else
        if ((_numTypesValid & 1) != 0)
        {
            _numberBigDecimal = BigDecimal.valueOf(_numberInt);
        } else
        {
            _throwInternal();
        }
        _numTypesValid = _numTypesValid | 0x10;
    }

    protected void convertNumberToBigInteger()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 0x10) != 0)
        {
            _numberBigInt = _numberBigDecimal.toBigInteger();
        } else
        if ((_numTypesValid & 2) != 0)
        {
            _numberBigInt = BigInteger.valueOf(_numberLong);
        } else
        if ((_numTypesValid & 1) != 0)
        {
            _numberBigInt = BigInteger.valueOf(_numberInt);
        } else
        if ((_numTypesValid & 8) != 0)
        {
            _numberBigInt = BigDecimal.valueOf(_numberDouble).toBigInteger();
        } else
        {
            _throwInternal();
        }
        _numTypesValid = _numTypesValid | 4;
    }

    protected void convertNumberToDouble()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 0x10) != 0)
        {
            _numberDouble = _numberBigDecimal.doubleValue();
        } else
        if ((_numTypesValid & 4) != 0)
        {
            _numberDouble = _numberBigInt.doubleValue();
        } else
        if ((_numTypesValid & 2) != 0)
        {
            _numberDouble = _numberLong;
        } else
        if ((_numTypesValid & 1) != 0)
        {
            _numberDouble = _numberInt;
        } else
        {
            _throwInternal();
        }
        _numTypesValid = _numTypesValid | 8;
    }

    protected void convertNumberToInt()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 2) != 0)
        {
            int i = (int)_numberLong;
            if ((long)i != _numberLong)
            {
                _reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of int").toString());
            }
            _numberInt = i;
        } else
        if ((_numTypesValid & 4) != 0)
        {
            if (BI_MIN_INT.compareTo(_numberBigInt) > 0 || BI_MAX_INT.compareTo(_numberBigInt) < 0)
            {
                reportOverflowInt();
            }
            _numberInt = _numberBigInt.intValue();
        } else
        if ((_numTypesValid & 8) != 0)
        {
            if (_numberDouble < -2147483648D || _numberDouble > 2147483647D)
            {
                reportOverflowInt();
            }
            _numberInt = (int)_numberDouble;
        } else
        if ((_numTypesValid & 0x10) != 0)
        {
            if (BD_MIN_INT.compareTo(_numberBigDecimal) > 0 || BD_MAX_INT.compareTo(_numberBigDecimal) < 0)
            {
                reportOverflowInt();
            }
            _numberInt = _numberBigDecimal.intValue();
        } else
        {
            _throwInternal();
        }
        _numTypesValid = _numTypesValid | 1;
    }

    protected void convertNumberToLong()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 1) != 0)
        {
            _numberLong = _numberInt;
        } else
        if ((_numTypesValid & 4) != 0)
        {
            if (BI_MIN_LONG.compareTo(_numberBigInt) > 0 || BI_MAX_LONG.compareTo(_numberBigInt) < 0)
            {
                reportOverflowLong();
            }
            _numberLong = _numberBigInt.longValue();
        } else
        if ((_numTypesValid & 8) != 0)
        {
            if (_numberDouble < -9.2233720368547758E+18D || _numberDouble > 9.2233720368547758E+18D)
            {
                reportOverflowLong();
            }
            _numberLong = (long)_numberDouble;
        } else
        if ((_numTypesValid & 0x10) != 0)
        {
            if (BD_MIN_LONG.compareTo(_numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(_numberBigDecimal) < 0)
            {
                reportOverflowLong();
            }
            _numberLong = _numberBigDecimal.longValue();
        } else
        {
            _throwInternal();
        }
        _numTypesValid = _numTypesValid | 2;
    }

    public BigInteger getBigIntegerValue()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 4) == 0)
        {
            if (_numTypesValid == 0)
            {
                _parseNumericValue(4);
            }
            if ((_numTypesValid & 4) == 0)
            {
                convertNumberToBigInteger();
            }
        }
        return _numberBigInt;
    }

    public JsonLocation getCurrentLocation()
    {
        int i = _inputPtr;
        int j = _currInputRowStart;
        return new JsonLocation(_ioContext.getSourceReference(), (_currInputProcessed + (long)_inputPtr) - 1L, _currInputRow, (i - j) + 1);
    }

    public String getCurrentName()
        throws IOException, JsonParseException
    {
        if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
        {
            return _parsingContext.getParent().getCurrentName();
        } else
        {
            return _parsingContext.getCurrentName();
        }
    }

    public BigDecimal getDecimalValue()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 0x10) == 0)
        {
            if (_numTypesValid == 0)
            {
                _parseNumericValue(16);
            }
            if ((_numTypesValid & 0x10) == 0)
            {
                convertNumberToBigDecimal();
            }
        }
        return _numberBigDecimal;
    }

    public double getDoubleValue()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 8) == 0)
        {
            if (_numTypesValid == 0)
            {
                _parseNumericValue(8);
            }
            if ((_numTypesValid & 8) == 0)
            {
                convertNumberToDouble();
            }
        }
        return _numberDouble;
    }

    public float getFloatValue()
        throws IOException, JsonParseException
    {
        return (float)getDoubleValue();
    }

    public int getIntValue()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 1) == 0)
        {
            if (_numTypesValid == 0)
            {
                _parseNumericValue(1);
            }
            if ((_numTypesValid & 1) == 0)
            {
                convertNumberToInt();
            }
        }
        return _numberInt;
    }

    public long getLongValue()
        throws IOException, JsonParseException
    {
        if ((_numTypesValid & 2) == 0)
        {
            if (_numTypesValid == 0)
            {
                _parseNumericValue(2);
            }
            if ((_numTypesValid & 2) == 0)
            {
                convertNumberToLong();
            }
        }
        return _numberLong;
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
        throws IOException, JsonParseException
    {
        if (_numTypesValid == 0)
        {
            _parseNumericValue(0);
        }
        if (_currToken == JsonToken.VALUE_NUMBER_INT)
        {
            if ((_numTypesValid & 1) != 0)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
            }
            if ((_numTypesValid & 2) != 0)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
            } else
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
            }
        }
        if ((_numTypesValid & 0x10) != 0)
        {
            return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
        } else
        {
            return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
        }
    }

    public Number getNumberValue()
        throws IOException, JsonParseException
    {
        if (_numTypesValid == 0)
        {
            _parseNumericValue(0);
        }
        if (_currToken == JsonToken.VALUE_NUMBER_INT)
        {
            if ((_numTypesValid & 1) != 0)
            {
                return Integer.valueOf(_numberInt);
            }
            if ((_numTypesValid & 2) != 0)
            {
                return Long.valueOf(_numberLong);
            }
            if ((_numTypesValid & 4) != 0)
            {
                return _numberBigInt;
            } else
            {
                return _numberBigDecimal;
            }
        }
        if ((_numTypesValid & 0x10) != 0)
        {
            return _numberBigDecimal;
        }
        if ((_numTypesValid & 8) == 0)
        {
            _throwInternal();
        }
        return Double.valueOf(_numberDouble);
    }

    public volatile JsonStreamContext getParsingContext()
    {
        return getParsingContext();
    }

    public JsonReadContext getParsingContext()
    {
        return _parsingContext;
    }

    public long getTokenCharacterOffset()
    {
        return _tokenInputTotal;
    }

    public int getTokenColumnNr()
    {
        int i = _tokenInputCol;
        if (i < 0)
        {
            return i;
        } else
        {
            return i + 1;
        }
    }

    public int getTokenLineNr()
    {
        return _tokenInputRow;
    }

    public JsonLocation getTokenLocation()
    {
        return new JsonLocation(_ioContext.getSourceReference(), getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    public boolean hasTextCharacters()
    {
        if (_currToken == JsonToken.VALUE_STRING)
        {
            return true;
        }
        if (_currToken == JsonToken.FIELD_NAME)
        {
            return _nameCopied;
        } else
        {
            return false;
        }
    }

    public boolean isClosed()
    {
        return _closed;
    }

    protected abstract boolean loadMore()
        throws IOException;

    protected final void loadMoreGuaranteed()
        throws IOException
    {
        if (!loadMore())
        {
            _reportInvalidEOF();
        }
    }

    public void overrideCurrentName(String s)
    {
        JsonReadContext jsonreadcontext;
label0:
        {
            JsonReadContext jsonreadcontext1 = _parsingContext;
            if (_currToken != JsonToken.START_OBJECT)
            {
                jsonreadcontext = jsonreadcontext1;
                if (_currToken != JsonToken.START_ARRAY)
                {
                    break label0;
                }
            }
            jsonreadcontext = jsonreadcontext1.getParent();
        }
        jsonreadcontext.setCurrentName(s);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j)
        throws IllegalArgumentException
    {
        return reportInvalidBase64Char(base64variant, i, j, null);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j, String s)
        throws IllegalArgumentException
    {
        Object obj;
        if (i <= 32)
        {
            base64variant = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(i)).append(") as character #").append(j + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (base64variant.usesPaddingChar(i))
        {
            base64variant = (new StringBuilder()).append("Unexpected padding character ('").append(base64variant.getPaddingChar()).append("') as character #").append(j + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(i) || Character.isISOControl(i))
        {
            base64variant = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(i)).append(") in base64 content").toString();
        } else
        {
            base64variant = (new StringBuilder()).append("Illegal character '").append((char)i).append("' (code 0x").append(Integer.toHexString(i)).append(") in base64 content").toString();
        }
        obj = base64variant;
        if (s != null)
        {
            obj = (new StringBuilder()).append(base64variant).append(": ").append(s).toString();
        }
        return new IllegalArgumentException(((String) (obj)));
    }

    protected void reportInvalidNumber(String s)
        throws JsonParseException
    {
        _reportError((new StringBuilder()).append("Invalid numeric value: ").append(s).toString());
    }

    protected void reportOverflowInt()
        throws IOException, JsonParseException
    {
        _reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
    }

    protected void reportOverflowLong()
        throws IOException, JsonParseException
    {
        _reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of long (").append(0x8000000000000000L).append(" - ").append(0x7fffffffffffffffL).append(")").toString());
    }

    protected void reportUnexpectedNumberChar(int i, String s)
        throws JsonParseException
    {
        String s2 = (new StringBuilder()).append("Unexpected character (").append(_getCharDesc(i)).append(") in numeric value").toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(": ").append(s).toString();
        }
        _reportError(s1);
    }

    protected final JsonToken reset(boolean flag, int i, int j, int k)
    {
        if (j < 1 && k < 1)
        {
            return resetInt(flag, i);
        } else
        {
            return resetFloat(flag, i, j, k);
        }
    }

    protected final JsonToken resetAsNaN(String s, double d)
    {
        _textBuffer.resetWithString(s);
        _numberDouble = d;
        _numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetFloat(boolean flag, int i, int j, int k)
    {
        _numberNegative = flag;
        _intLength = i;
        _fractLength = j;
        _expLength = k;
        _numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetInt(boolean flag, int i)
    {
        _numberNegative = flag;
        _intLength = i;
        _fractLength = 0;
        _expLength = 0;
        _numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    static 
    {
        BI_MIN_INT = BigInteger.valueOf(0xffffffff80000000L);
        BI_MAX_INT = BigInteger.valueOf(0x7fffffffL);
        BI_MIN_LONG = BigInteger.valueOf(0x8000000000000000L);
        BI_MAX_LONG = BigInteger.valueOf(0x7fffffffffffffffL);
        BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
        BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
        BD_MIN_INT = new BigDecimal(BI_MIN_INT);
        BD_MAX_INT = new BigDecimal(BI_MAX_INT);
    }
}
