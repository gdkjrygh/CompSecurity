// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class ootContext extends ParserMinimalBase
{

    protected transient ByteArrayBuilder _byteBuilder;
    protected boolean _closed;
    protected ObjectCodec _codec;
    protected JsonLocation _location;
    protected JsonReadContext _parsingContext;
    protected  _segment;
    protected int _segmentPtr;

    protected final void _checkIsNumber()
    {
        if (_currToken == null || !_currToken.isNumeric())
        {
            throw _constructError((new StringBuilder()).append("Current token (").append(_currToken).append(") not numeric, can not use numeric value accessors").toString());
        } else
        {
            return;
        }
    }

    protected final Object _currentObject()
    {
        return _segment.get(_segmentPtr);
    }

    protected void _handleEOF()
    {
        _throwInternal();
    }

    public void close()
    {
        if (!_closed)
        {
            _closed = true;
        }
    }

    public BigInteger getBigIntegerValue()
    {
        Number number = getNumberValue();
        if (number instanceof BigInteger)
        {
            return (BigInteger)number;
        }
        switch (chMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()])
        {
        default:
            return BigInteger.valueOf(number.longValue());

        case 3: // '\003'
            return ((BigDecimal)number).toBigInteger();
        }
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        if (_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            Object obj = _currentObject();
            if (obj instanceof byte[])
            {
                return (byte[])(byte[])obj;
            }
        }
        if (_currToken != JsonToken.VALUE_STRING)
        {
            throw _constructError((new StringBuilder()).append("Current token (").append(_currToken).append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary").toString());
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

    public ObjectCodec getCodec()
    {
        return _codec;
    }

    public JsonLocation getCurrentLocation()
    {
        if (_location == null)
        {
            return JsonLocation.NA;
        } else
        {
            return _location;
        }
    }

    public String getCurrentName()
    {
        return _parsingContext.getCurrentName();
    }

    public BigDecimal getDecimalValue()
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

    public double getDoubleValue()
    {
        return getNumberValue().doubleValue();
    }

    public Object getEmbeddedObject()
    {
        if (_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            return _currentObject();
        } else
        {
            return null;
        }
    }

    public float getFloatValue()
    {
        return getNumberValue().floatValue();
    }

    public int getIntValue()
    {
        if (_currToken == JsonToken.VALUE_NUMBER_INT)
        {
            return ((Number)_currentObject()).intValue();
        } else
        {
            return getNumberValue().intValue();
        }
    }

    public long getLongValue()
    {
        return getNumberValue().longValue();
    }

    public com.fasterxml.jackson.core.pe getNumberType()
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
        if (number instanceof Float)
        {
            return com.fasterxml.jackson.core.pe.FLOAT;
        }
        if (number instanceof BigInteger)
        {
            return com.fasterxml.jackson.core.pe.BIG_INTEGER;
        } else
        {
            return null;
        }
    }

    public final Number getNumberValue()
    {
        _checkIsNumber();
        return (Number)_currentObject();
    }

    public JsonStreamContext getParsingContext()
    {
        return _parsingContext;
    }

    public String getText()
    {
        Object obj1 = null;
        if (_currToken != JsonToken.VALUE_STRING && _currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        Object obj = _currentObject();
        if (!(obj instanceof String)) goto _L4; else goto _L3
_L3:
        obj = (String)obj;
_L6:
        return ((String) (obj));
_L4:
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        return ((String) (obj));
_L2:
        obj = obj1;
        if (_currToken != null)
        {
            Object obj2;
            switch (chMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
            {
            default:
                return _currToken.asString();

            case 7: // '\007'
            case 8: // '\b'
                obj2 = _currentObject();
                break;
            }
            obj = obj1;
            if (obj2 != null)
            {
                return obj2.toString();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public char[] getTextCharacters()
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

    public int getTextLength()
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

    public int getTextOffset()
    {
        return 0;
    }

    public JsonLocation getTokenLocation()
    {
        return getCurrentLocation();
    }

    public boolean hasTextCharacters()
    {
        return false;
    }

    public boolean isClosed()
    {
        return _closed;
    }

    public JsonToken nextToken()
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
                _parsingContext = JsonReadContext.createRootContext(-1, -1);
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
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

    public JsonToken peekNextToken()
    {
        if (!_closed)
        {
              = _segment;
            int i = _segmentPtr + 1;
            if (i >= 16)
            {
                if ( == null)
                {
                     = null;
                } else
                {
                     = .next();
                }
                i = 0;
            }
            if ( != null)
            {
                return .type(i);
            }
        }
        return null;
    }

    public void setCodec(ObjectCodec objectcodec)
    {
        _codec = objectcodec;
    }

    public void setLocation(JsonLocation jsonlocation)
    {
        _location = jsonlocation;
    }

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    public ( , ObjectCodec objectcodec)
    {
        super(0);
        _location = null;
        _segment = ;
        _segmentPtr = -1;
        _codec = objectcodec;
        _parsingContext = JsonReadContext.createRootContext(-1, -1);
    }
}
