// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class _hasNativeIds extends ParserMinimalBase
{

    protected transient ByteArrayBuilder _byteBuilder;
    protected boolean _closed;
    protected ObjectCodec _codec;
    protected final boolean _hasNativeIds;
    protected final boolean _hasNativeObjectIds;
    protected final boolean _hasNativeTypeIds;
    protected JsonLocation _location;
    protected JsonReadContext _parsingContext;
    protected  _segment;
    protected int _segmentPtr;

    protected final void _checkIsNumber()
    {
        if (_currToken == null || !_currToken.isNumeric())
        {
            throw _constructError((new StringBuilder("Current token (")).append(_currToken).append(") not numeric, can not use numeric value accessors").toString());
        } else
        {
            return;
        }
    }

    protected final Object _currentObject()
    {
        return _segment.get(_segmentPtr);
    }

    protected final void _handleEOF()
    {
        _throwInternal();
    }

    public final boolean canReadObjectId()
    {
        return _hasNativeObjectIds;
    }

    public final boolean canReadTypeId()
    {
        return _hasNativeTypeIds;
    }

    public final void close()
    {
        if (!_closed)
        {
            _closed = true;
        }
    }

    public final BigInteger getBigIntegerValue()
    {
        Number number = getNumberValue();
        if (number instanceof BigInteger)
        {
            return (BigInteger)number;
        }
        if (getNumberType() == com.fasterxml.jackson.core.pe.BIG_DECIMAL)
        {
            return ((BigDecimal)number).toBigInteger();
        } else
        {
            return BigInteger.valueOf(number.longValue());
        }
    }

    public final byte[] getBinaryValue(Base64Variant base64variant)
    {
        if (_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            Object obj = _currentObject();
            if (obj instanceof byte[])
            {
                return (byte[])obj;
            }
        }
        if (_currToken != JsonToken.VALUE_STRING)
        {
            throw _constructError((new StringBuilder("Current token (")).append(_currToken).append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary").toString());
        }
        String s = getText();
        if (s == null)
        {
            return null;
        }
        ByteArrayBuilder bytearraybuilder = _byteBuilder;
        if (bytearraybuilder == null)
        {
            bytearraybuilder = new ByteArrayBuilder(100);
            _byteBuilder = bytearraybuilder;
        } else
        {
            _byteBuilder.reset();
        }
        _decodeBase64(s, bytearraybuilder, base64variant);
        return bytearraybuilder.toByteArray();
    }

    public final ObjectCodec getCodec()
    {
        return _codec;
    }

    public final JsonLocation getCurrentLocation()
    {
        if (_location == null)
        {
            return JsonLocation.NA;
        } else
        {
            return _location;
        }
    }

    public final String getCurrentName()
    {
        return _parsingContext.getCurrentName();
    }

    public final BigDecimal getDecimalValue()
    {
        Number number = getNumberValue();
        if (number instanceof BigDecimal)
        {
            return (BigDecimal)number;
        }
        switch (chMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()])
        {
        case 3: // '\003'
        case 4: // '\004'
        default:
            return BigDecimal.valueOf(number.doubleValue());

        case 1: // '\001'
        case 5: // '\005'
            return BigDecimal.valueOf(number.longValue());

        case 2: // '\002'
            return new BigDecimal((BigInteger)number);
        }
    }

    public final double getDoubleValue()
    {
        return getNumberValue().doubleValue();
    }

    public final Object getEmbeddedObject()
    {
        if (_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            return _currentObject();
        } else
        {
            return null;
        }
    }

    public final float getFloatValue()
    {
        return getNumberValue().floatValue();
    }

    public final int getIntValue()
    {
        if (_currToken == JsonToken.VALUE_NUMBER_INT)
        {
            return ((Number)_currentObject()).intValue();
        } else
        {
            return getNumberValue().intValue();
        }
    }

    public final long getLongValue()
    {
        return getNumberValue().longValue();
    }

    public final com.fasterxml.jackson.core.pe getNumberType()
    {
        Number number = getNumberValue();
        if (number instanceof Integer)
        {
            return com.fasterxml.jackson.core.pe.INT;
        }
        if (number instanceof Long)
        {
            return com.fasterxml.jackson.core.pe.LONG;
        }
        if (number instanceof Double)
        {
            return com.fasterxml.jackson.core.pe.DOUBLE;
        }
        if (number instanceof BigDecimal)
        {
            return com.fasterxml.jackson.core.pe.BIG_DECIMAL;
        }
        if (number instanceof BigInteger)
        {
            return com.fasterxml.jackson.core.pe.BIG_INTEGER;
        }
        if (number instanceof Float)
        {
            return com.fasterxml.jackson.core.pe.FLOAT;
        }
        if (number instanceof Short)
        {
            return com.fasterxml.jackson.core.pe.INT;
        } else
        {
            return null;
        }
    }

    public final Number getNumberValue()
    {
        _checkIsNumber();
        Object obj = _currentObject();
        if (obj instanceof Number)
        {
            return (Number)obj;
        }
        if (obj instanceof String)
        {
            obj = (String)obj;
            if (((String) (obj)).indexOf('.') >= 0)
            {
                return Double.valueOf(Double.parseDouble(((String) (obj))));
            } else
            {
                return Long.valueOf(Long.parseLong(((String) (obj))));
            }
        }
        if (obj == null)
        {
            return null;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Internal error: entry should be a Number, but is of type ")).append(obj.getClass().getName()).toString());
        }
    }

    public final Object getObjectId()
    {
        return _segment.findObjectId(_segmentPtr);
    }

    public final String getText()
    {
        if (_currToken == JsonToken.VALUE_STRING || _currToken == JsonToken.FIELD_NAME)
        {
            Object obj = _currentObject();
            if (obj instanceof String)
            {
                return (String)obj;
            }
            if (obj == null)
            {
                return null;
            } else
            {
                return obj.toString();
            }
        }
        if (_currToken == null)
        {
            return null;
        }
        Object obj1;
        switch (chMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
        {
        default:
            return _currToken.asString();

        case 7: // '\007'
        case 8: // '\b'
            obj1 = _currentObject();
            break;
        }
        if (obj1 == null)
        {
            return null;
        } else
        {
            return obj1.toString();
        }
    }

    public final char[] getTextCharacters()
    {
        String s = getText();
        if (s == null)
        {
            return null;
        } else
        {
            return s.toCharArray();
        }
    }

    public final int getTextLength()
    {
        String s = getText();
        if (s == null)
        {
            return 0;
        } else
        {
            return s.length();
        }
    }

    public final int getTextOffset()
    {
        return 0;
    }

    public final JsonLocation getTokenLocation()
    {
        return getCurrentLocation();
    }

    public final Object getTypeId()
    {
        return _segment.findTypeId(_segmentPtr);
    }

    public final boolean hasTextCharacters()
    {
        return false;
    }

    public final JsonToken nextToken()
    {
        if (!_closed && _segment != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i = _segmentPtr + 1;
        _segmentPtr = i;
        if (i < 16)
        {
            break; /* Loop/switch isn't completed */
        }
        _segmentPtr = 0;
        _segment = _segment.next();
        if (_segment == null) goto _L1; else goto _L3
_L3:
        _currToken = _segment.type(_segmentPtr);
        if (_currToken != JsonToken.FIELD_NAME) goto _L5; else goto _L4
_L4:
        Object obj = _currentObject();
        if (obj instanceof String)
        {
            obj = (String)obj;
        } else
        {
            obj = obj.toString();
        }
        _parsingContext.setCurrentName(((String) (obj)));
_L7:
        return _currToken;
_L5:
        if (_currToken == JsonToken.START_OBJECT)
        {
            _parsingContext = _parsingContext.createChildObjectContext(-1, -1);
        } else
        if (_currToken == JsonToken.START_ARRAY)
        {
            _parsingContext = _parsingContext.createChildArrayContext(-1, -1);
        } else
        if (_currToken == JsonToken.END_OBJECT || _currToken == JsonToken.END_ARRAY)
        {
            _parsingContext = _parsingContext.getParent();
            if (_parsingContext == null)
            {
                _parsingContext = JsonReadContext.createRootContext(null);
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
    {
        int i = 0;
        base64variant = getBinaryValue(base64variant);
        if (base64variant != null)
        {
            outputstream.write(base64variant, 0, base64variant.length);
            i = base64variant.length;
        }
        return i;
    }

    public final void setLocation(JsonLocation jsonlocation)
    {
        _location = jsonlocation;
    }

    public ( , ObjectCodec objectcodec, boolean flag, boolean flag1)
    {
        super(0);
        _location = null;
        _segment = ;
        _segmentPtr = -1;
        _codec = objectcodec;
        _parsingContext = JsonReadContext.createRootContext(null);
        _hasNativeTypeIds = flag;
        _hasNativeObjectIds = flag1;
        _hasNativeIds = flag | flag1;
    }
}
