// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

public class TokenBuffer extends JsonGenerator
{
    protected static final class Parser extends ParserMinimalBase
    {

        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location;
        protected JsonReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        protected final void _checkIsNumber()
            throws JsonParseException
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
            throws JsonParseException
        {
            _throwInternal();
        }

        public boolean canReadObjectId()
        {
            return _hasNativeObjectIds;
        }

        public boolean canReadTypeId()
        {
            return _hasNativeTypeIds;
        }

        public void close()
            throws IOException
        {
            if (!_closed)
            {
                _closed = true;
            }
        }

        public BigInteger getBigIntegerValue()
            throws IOException, JsonParseException
        {
            Number number = getNumberValue();
            if (number instanceof BigInteger)
            {
                return (BigInteger)number;
            }
            if (getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL)
            {
                return ((BigDecimal)number).toBigInteger();
            } else
            {
                return BigInteger.valueOf(number.longValue());
            }
        }

        public byte[] getBinaryValue(Base64Variant base64variant)
            throws IOException, JsonParseException
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
            throws IOException, JsonParseException
        {
            Number number = getNumberValue();
            if (number instanceof BigDecimal)
            {
                return (BigDecimal)number;
            }
            static class _cls1
            {

                static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];
                static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

                static 
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()])
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
            throws IOException, JsonParseException
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
            throws IOException, JsonParseException
        {
            return getNumberValue().floatValue();
        }

        public int getIntValue()
            throws IOException, JsonParseException
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
            throws IOException, JsonParseException
        {
            return getNumberValue().longValue();
        }

        public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
            throws IOException, JsonParseException
        {
            Number number = getNumberValue();
            if (number instanceof Integer)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
            }
            if (number instanceof Long)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
            }
            if (number instanceof Double)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
            }
            if (number instanceof BigDecimal)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
            }
            if (number instanceof BigInteger)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
            }
            if (number instanceof Float)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
            }
            if (number instanceof Short)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
            } else
            {
                return null;
            }
        }

        public final Number getNumberValue()
            throws IOException, JsonParseException
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
                throw new IllegalStateException((new StringBuilder()).append("Internal error: entry should be a Number, but is of type ").append(obj.getClass().getName()).toString());
            }
        }

        public Object getObjectId()
        {
            return _segment.findObjectId(_segmentPtr);
        }

        public JsonStreamContext getParsingContext()
        {
            return _parsingContext;
        }

        public String getText()
        {
            Object obj = null;
            if (_currToken != JsonToken.VALUE_STRING && _currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
            Object obj1 = _currentObject();
            if (!(obj1 instanceof String)) goto _L4; else goto _L3
_L3:
            String s = (String)obj1;
_L6:
            return s;
_L4:
            s = obj;
            if (obj1 != null)
            {
                return obj1.toString();
            }
            continue; /* Loop/switch isn't completed */
_L2:
            s = obj;
            if (_currToken != null)
            {
                Object obj2;
                switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
                {
                default:
                    return _currToken.asString();

                case 7: // '\007'
                case 8: // '\b'
                    obj2 = _currentObject();
                    break;
                }
                s = obj;
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

        public Object getTypeId()
        {
            return _segment.findTypeId(_segmentPtr);
        }

        public boolean hasTextCharacters()
        {
            return false;
        }

        public JsonToken nextToken()
            throws IOException, JsonParseException
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

        public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
            throws IOException, JsonParseException
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

        public void setLocation(JsonLocation jsonlocation)
        {
            _location = jsonlocation;
        }

        public Parser(Segment segment, ObjectCodec objectcodec, boolean flag, boolean flag1)
        {
            super(0);
            _location = null;
            _segment = segment;
            _segmentPtr = -1;
            _codec = objectcodec;
            _parsingContext = JsonReadContext.createRootContext(null);
            _hasNativeTypeIds = flag;
            _hasNativeObjectIds = flag1;
            _hasNativeIds = flag | flag1;
        }
    }

    protected static final class Segment
    {

        private static final JsonToken TOKEN_TYPES_BY_INDEX[];
        protected TreeMap _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object _tokens[] = new Object[16];

        private final int _objectIdIndex(int i)
        {
            return i + i + 1;
        }

        private final int _typeIdIndex(int i)
        {
            return i + i;
        }

        private final void assignNativeIds(int i, Object obj, Object obj1)
        {
            if (_nativeIds == null)
            {
                _nativeIds = new TreeMap();
            }
            if (obj != null)
            {
                _nativeIds.put(Integer.valueOf(_objectIdIndex(i)), obj);
            }
            if (obj1 != null)
            {
                _nativeIds.put(Integer.valueOf(_typeIdIndex(i)), obj1);
            }
        }

        private void set(int i, JsonToken jsontoken)
        {
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = _tokenTypes | l;
        }

        private void set(int i, JsonToken jsontoken, Object obj)
        {
            _tokens[i] = obj;
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = _tokenTypes | l;
        }

        private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
        {
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = _tokenTypes | l;
            assignNativeIds(i, obj, obj1);
        }

        private void set(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
        {
            _tokens[i] = obj;
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = _tokenTypes | l;
            assignNativeIds(i, obj1, obj2);
        }

        public Segment append(int i, JsonToken jsontoken)
        {
            if (i < 16)
            {
                set(i, jsontoken);
                return null;
            } else
            {
                _next = new Segment();
                _next.set(0, jsontoken);
                return _next;
            }
        }

        public Segment append(int i, JsonToken jsontoken, Object obj)
        {
            if (i < 16)
            {
                set(i, jsontoken, obj);
                return null;
            } else
            {
                _next = new Segment();
                _next.set(0, jsontoken, obj);
                return _next;
            }
        }

        public Segment append(int i, JsonToken jsontoken, Object obj, Object obj1)
        {
            if (i < 16)
            {
                set(i, jsontoken, obj, obj1);
                return null;
            } else
            {
                _next = new Segment();
                _next.set(0, jsontoken, obj, obj1);
                return _next;
            }
        }

        public Segment append(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
        {
            if (i < 16)
            {
                set(i, jsontoken, obj, obj1, obj2);
                return null;
            } else
            {
                _next = new Segment();
                _next.set(0, jsontoken, obj, obj1, obj2);
                return _next;
            }
        }

        public Object findObjectId(int i)
        {
            if (_nativeIds == null)
            {
                return null;
            } else
            {
                return _nativeIds.get(Integer.valueOf(_objectIdIndex(i)));
            }
        }

        public Object findTypeId(int i)
        {
            if (_nativeIds == null)
            {
                return null;
            } else
            {
                return _nativeIds.get(Integer.valueOf(_typeIdIndex(i)));
            }
        }

        public Object get(int i)
        {
            return _tokens[i];
        }

        public boolean hasIds()
        {
            return _nativeIds != null;
        }

        public Segment next()
        {
            return _next;
        }

        public JsonToken type(int i)
        {
            long l1 = _tokenTypes;
            long l = l1;
            if (i > 0)
            {
                l = l1 >> (i << 2);
            }
            i = (int)l;
            return TOKEN_TYPES_BY_INDEX[i & 0xf];
        }

        static 
        {
            TOKEN_TYPES_BY_INDEX = new JsonToken[16];
            JsonToken ajsontoken[] = JsonToken.values();
            System.arraycopy(ajsontoken, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, ajsontoken.length - 1));
        }

        public Segment()
        {
        }
    }


    protected static final int DEFAULT_GENERATOR_FEATURES = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected boolean _closed;
    protected Segment _first;
    protected int _generatorFeatures;
    protected boolean _hasNativeId;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected Object _typeId;
    protected JsonWriteContext _writeContext;

    public TokenBuffer(JsonParser jsonparser)
    {
        _hasNativeId = false;
        _objectCodec = jsonparser.getCodec();
        _generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        _writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        _last = segment;
        _first = segment;
        _appendAt = 0;
        _hasNativeTypeIds = jsonparser.canReadTypeId();
        _hasNativeObjectIds = jsonparser.canReadObjectId();
        _mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
    }

    public TokenBuffer(ObjectCodec objectcodec, boolean flag)
    {
        _hasNativeId = false;
        _objectCodec = objectcodec;
        _generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        _writeContext = JsonWriteContext.createRootContext(null);
        objectcodec = new Segment();
        _last = objectcodec;
        _first = objectcodec;
        _appendAt = 0;
        _hasNativeTypeIds = flag;
        _hasNativeObjectIds = flag;
        _mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
    }

    private final void _appendNativeIds(StringBuilder stringbuilder)
    {
        Object obj = _last.findObjectId(_appendAt - 1);
        if (obj != null)
        {
            stringbuilder.append("[objectId=").append(String.valueOf(obj)).append(']');
        }
        obj = _last.findTypeId(_appendAt - 1);
        if (obj != null)
        {
            stringbuilder.append("[typeId=").append(String.valueOf(obj)).append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        Object obj = jsonparser.getTypeId();
        _typeId = obj;
        if (obj != null)
        {
            _hasNativeId = true;
        }
        jsonparser = ((JsonParser) (jsonparser.getObjectId()));
        _objectId = jsonparser;
        if (jsonparser != null)
        {
            _hasNativeId = true;
        }
    }

    protected final void _append(JsonToken jsontoken)
    {
        if (_hasNativeId)
        {
            jsontoken = _last.append(_appendAt, jsontoken, _objectId, _typeId);
        } else
        {
            jsontoken = _last.append(_appendAt, jsontoken);
        }
        if (jsontoken == null)
        {
            _appendAt = _appendAt + 1;
            return;
        } else
        {
            _last = jsontoken;
            _appendAt = 1;
            return;
        }
    }

    protected final void _append(JsonToken jsontoken, Object obj)
    {
        if (_hasNativeId)
        {
            jsontoken = _last.append(_appendAt, jsontoken, obj, _objectId, _typeId);
        } else
        {
            jsontoken = _last.append(_appendAt, jsontoken, obj);
        }
        if (jsontoken == null)
        {
            _appendAt = _appendAt + 1;
            return;
        } else
        {
            _last = jsontoken;
            _appendAt = 1;
            return;
        }
    }

    protected void _reportUnsupportedOperation()
    {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public JsonParser asParser()
    {
        return asParser(_objectCodec);
    }

    public JsonParser asParser(JsonParser jsonparser)
    {
        Parser parser = new Parser(_first, jsonparser.getCodec(), _hasNativeTypeIds, _hasNativeObjectIds);
        parser.setLocation(jsonparser.getTokenLocation());
        return parser;
    }

    public JsonParser asParser(ObjectCodec objectcodec)
    {
        return new Parser(_first, objectcodec, _hasNativeTypeIds, _hasNativeObjectIds);
    }

    public boolean canWriteBinaryNatively()
    {
        return true;
    }

    public boolean canWriteObjectId()
    {
        return _hasNativeObjectIds;
    }

    public boolean canWriteTypeId()
    {
        return _hasNativeTypeIds;
    }

    public void close()
        throws IOException
    {
        _closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        if (_mayHaveNativeIds)
        {
            _checkNativeIds(jsonparser);
        }
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        default:
            throw new RuntimeException("Internal error: should never end up through this code path");

        case 1: // '\001'
            writeStartObject();
            return;

        case 2: // '\002'
            writeEndObject();
            return;

        case 3: // '\003'
            writeStartArray();
            return;

        case 4: // '\004'
            writeEndArray();
            return;

        case 5: // '\005'
            writeFieldName(jsonparser.getCurrentName());
            return;

        case 6: // '\006'
            if (jsonparser.hasTextCharacters())
            {
                writeString(jsonparser.getTextCharacters(), jsonparser.getTextOffset(), jsonparser.getTextLength());
                return;
            } else
            {
                writeString(jsonparser.getText());
                return;
            }

        case 7: // '\007'
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
            {
            default:
                writeNumber(jsonparser.getLongValue());
                return;

            case 1: // '\001'
                writeNumber(jsonparser.getIntValue());
                return;

            case 2: // '\002'
                writeNumber(jsonparser.getBigIntegerValue());
                break;
            }
            return;

        case 8: // '\b'
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
            {
            default:
                writeNumber(jsonparser.getDoubleValue());
                return;

            case 3: // '\003'
                writeNumber(jsonparser.getDecimalValue());
                return;

            case 4: // '\004'
                writeNumber(jsonparser.getFloatValue());
                break;
            }
            return;

        case 9: // '\t'
            writeBoolean(true);
            return;

        case 10: // '\n'
            writeBoolean(false);
            return;

        case 11: // '\013'
            writeNull();
            return;

        case 12: // '\f'
            writeObject(jsonparser.getEmbeddedObject());
            return;
        }
    }

    public void copyCurrentStructure(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken1 = jsonparser.getCurrentToken();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == JsonToken.FIELD_NAME)
        {
            if (_mayHaveNativeIds)
            {
                _checkNativeIds(jsonparser);
            }
            writeFieldName(jsonparser.getCurrentName());
            jsontoken = jsonparser.nextToken();
        }
        if (_mayHaveNativeIds)
        {
            _checkNativeIds(jsonparser);
        }
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        case 2: // '\002'
        default:
            copyCurrentEvent(jsonparser);
            return;

        case 3: // '\003'
            writeStartArray();
            for (; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser)) { }
            writeEndArray();
            return;

        case 1: // '\001'
            writeStartObject();
            break;
        }
        for (; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser)) { }
        writeEndObject();
    }

    public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (jsonparser.getCurrentTokenId() != JsonToken.FIELD_NAME.id())
        {
            copyCurrentStructure(jsonparser);
            return this;
        }
        writeStartObject();
        JsonToken jsontoken;
        do
        {
            copyCurrentStructure(jsonparser);
            jsontoken = jsonparser.nextToken();
        } while (jsontoken == JsonToken.FIELD_NAME);
        if (jsontoken != JsonToken.END_OBJECT)
        {
            throw deserializationcontext.mappingException((new StringBuilder()).append("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ").append(jsontoken).toString());
        } else
        {
            writeEndObject();
            return this;
        }
    }

    public JsonToken firstToken()
    {
        if (_first != null)
        {
            return _first.type(0);
        } else
        {
            return null;
        }
    }

    public void flush()
        throws IOException
    {
    }

    public volatile JsonStreamContext getOutputContext()
    {
        return getOutputContext();
    }

    public final JsonWriteContext getOutputContext()
    {
        return _writeContext;
    }

    public void serialize(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        Segment segment;
        Object obj;
        boolean flag;
        int i;
        boolean flag1;
        obj = _first;
        i = -1;
        flag1 = _mayHaveNativeIds;
        int j;
        if (flag1 && ((Segment) (obj)).hasIds())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L7:
        j = i + 1;
        i = j;
        segment = ((Segment) (obj));
        if (j < 16) goto _L2; else goto _L1
_L1:
        i = 0;
        segment = ((Segment) (obj)).next();
        if (segment != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (flag1 && segment.hasIds())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        obj = segment.type(i);
        if (obj == null) goto _L3; else goto _L5
_L5:
        if (flag)
        {
            Object obj1 = segment.findObjectId(i);
            if (obj1 != null)
            {
                jsongenerator.writeObjectId(obj1);
            }
            obj1 = segment.findTypeId(i);
            if (obj1 != null)
            {
                jsongenerator.writeTypeId(obj1);
            }
        }
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[((JsonToken) (obj)).ordinal()])
        {
        default:
            throw new RuntimeException("Internal error: should never end up through this code path");

        case 1: // '\001'
            jsongenerator.writeStartObject();
            obj = segment;
            break;

        case 2: // '\002'
            jsongenerator.writeEndObject();
            obj = segment;
            break;

        case 3: // '\003'
            jsongenerator.writeStartArray();
            obj = segment;
            break;

        case 4: // '\004'
            jsongenerator.writeEndArray();
            obj = segment;
            break;

        case 5: // '\005'
            obj = segment.get(i);
            if (obj instanceof SerializableString)
            {
                jsongenerator.writeFieldName((SerializableString)obj);
                obj = segment;
            } else
            {
                jsongenerator.writeFieldName((String)obj);
                obj = segment;
            }
            break;

        case 6: // '\006'
            obj = segment.get(i);
            if (obj instanceof SerializableString)
            {
                jsongenerator.writeString((SerializableString)obj);
                obj = segment;
            } else
            {
                jsongenerator.writeString((String)obj);
                obj = segment;
            }
            break;

        case 7: // '\007'
            obj = segment.get(i);
            if (obj instanceof Integer)
            {
                jsongenerator.writeNumber(((Integer)obj).intValue());
                obj = segment;
            } else
            if (obj instanceof BigInteger)
            {
                jsongenerator.writeNumber((BigInteger)obj);
                obj = segment;
            } else
            if (obj instanceof Long)
            {
                jsongenerator.writeNumber(((Long)obj).longValue());
                obj = segment;
            } else
            if (obj instanceof Short)
            {
                jsongenerator.writeNumber(((Short)obj).shortValue());
                obj = segment;
            } else
            {
                jsongenerator.writeNumber(((Number)obj).intValue());
                obj = segment;
            }
            break;

        case 8: // '\b'
            obj = segment.get(i);
            if (obj instanceof Double)
            {
                jsongenerator.writeNumber(((Double)obj).doubleValue());
                obj = segment;
            } else
            if (obj instanceof BigDecimal)
            {
                jsongenerator.writeNumber((BigDecimal)obj);
                obj = segment;
            } else
            if (obj instanceof Float)
            {
                jsongenerator.writeNumber(((Float)obj).floatValue());
                obj = segment;
            } else
            if (obj == null)
            {
                jsongenerator.writeNull();
                obj = segment;
            } else
            if (obj instanceof String)
            {
                jsongenerator.writeNumber((String)obj);
                obj = segment;
            } else
            {
                throw new JsonGenerationException((new StringBuilder()).append("Unrecognized value type for VALUE_NUMBER_FLOAT: ").append(obj.getClass().getName()).append(", can not serialize").toString());
            }
            break;

        case 9: // '\t'
            jsongenerator.writeBoolean(true);
            obj = segment;
            break;

        case 10: // '\n'
            jsongenerator.writeBoolean(false);
            obj = segment;
            break;

        case 11: // '\013'
            jsongenerator.writeNull();
            obj = segment;
            break;

        case 12: // '\f'
            jsongenerator.writeObject(segment.get(i));
            obj = segment;
            break;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        JsonParser jsonparser;
        JsonToken jsontoken;
        boolean flag;
        int i;
        stringbuilder = new StringBuilder();
        stringbuilder.append("[TokenBuffer: ");
        jsonparser = asParser();
        i = 0;
        if (_hasNativeTypeIds || _hasNativeObjectIds)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L1:
        try
        {
            jsontoken = jsonparser.nextToken();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        if (jsontoken == null)
        {
            if (i >= 100)
            {
                stringbuilder.append(" ... (truncated ").append(i - 100).append(" entries)");
            }
            stringbuilder.append(']');
            return stringbuilder.toString();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        _appendNativeIds(stringbuilder);
        if (i >= 100)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        stringbuilder.append(", ");
        stringbuilder.append(jsontoken.toString());
        if (jsontoken == JsonToken.FIELD_NAME)
        {
            stringbuilder.append('(');
            stringbuilder.append(jsonparser.getCurrentName());
            stringbuilder.append(')');
        }
        i++;
          goto _L1
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        return this;
    }

    public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
    {
        throw new UnsupportedOperationException();
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException
    {
        base64variant = new byte[j];
        System.arraycopy(abyte0, i, base64variant, 0, j);
        writeObject(base64variant);
    }

    public void writeBoolean(boolean flag)
        throws IOException, JsonGenerationException
    {
        JsonToken jsontoken;
        if (flag)
        {
            jsontoken = JsonToken.VALUE_TRUE;
        } else
        {
            jsontoken = JsonToken.VALUE_FALSE;
        }
        _append(jsontoken);
    }

    public final void writeEndArray()
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext jsonwritecontext = _writeContext.getParent();
        if (jsonwritecontext != null)
        {
            _writeContext = jsonwritecontext;
        }
    }

    public final void writeEndObject()
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext jsonwritecontext = _writeContext.getParent();
        if (jsonwritecontext != null)
        {
            _writeContext = jsonwritecontext;
        }
    }

    public void writeFieldName(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.FIELD_NAME, serializablestring);
        _writeContext.writeFieldName(serializablestring.getValue());
    }

    public final void writeFieldName(String s)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.FIELD_NAME, s);
        _writeContext.writeFieldName(s);
    }

    public void writeNull()
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NULL);
    }

    public void writeNumber(double d)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeNumber(float f)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeNumber(int i)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeNumber(long l)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
    }

    public void writeNumber(String s)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, s);
    }

    public void writeNumber(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        if (bigdecimal == null)
        {
            writeNull();
            return;
        } else
        {
            _append(JsonToken.VALUE_NUMBER_FLOAT, bigdecimal);
            return;
        }
    }

    public void writeNumber(BigInteger biginteger)
        throws IOException, JsonGenerationException
    {
        if (biginteger == null)
        {
            writeNull();
            return;
        } else
        {
            _append(JsonToken.VALUE_NUMBER_INT, biginteger);
            return;
        }
    }

    public void writeNumber(short word0)
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(word0));
    }

    public void writeObject(Object obj)
        throws IOException
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (obj.getClass() == [B)
        {
            _append(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        if (_objectCodec == null)
        {
            _append(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        } else
        {
            _objectCodec.writeValue(this, obj);
            return;
        }
    }

    public void writeObjectId(Object obj)
    {
        _objectId = obj;
        _hasNativeId = true;
    }

    public void writeRawValue(String s)
        throws IOException, JsonGenerationException
    {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray()
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.START_ARRAY);
        _writeContext = _writeContext.createChildArrayContext();
    }

    public final void writeStartObject()
        throws IOException, JsonGenerationException
    {
        _append(JsonToken.START_OBJECT);
        _writeContext = _writeContext.createChildObjectContext();
    }

    public void writeString(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        if (serializablestring == null)
        {
            writeNull();
            return;
        } else
        {
            _append(JsonToken.VALUE_STRING, serializablestring);
            return;
        }
    }

    public void writeString(String s)
        throws IOException, JsonGenerationException
    {
        if (s == null)
        {
            writeNull();
            return;
        } else
        {
            _append(JsonToken.VALUE_STRING, s);
            return;
        }
    }

    public void writeString(char ac[], int i, int j)
        throws IOException, JsonGenerationException
    {
        writeString(new String(ac, i, j));
    }

    public void writeTypeId(Object obj)
    {
        _typeId = obj;
        _hasNativeId = true;
    }

}
