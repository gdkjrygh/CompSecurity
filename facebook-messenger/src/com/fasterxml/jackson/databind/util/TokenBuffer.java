// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBuffer extends JsonGenerator
{

    protected static final int DEFAULT_PARSER_FEATURES = com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults();
    protected int _appendOffset;
    protected boolean _closed;
    protected Segment _first;
    protected int _generatorFeatures;
    protected Segment _last;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    public TokenBuffer(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        _generatorFeatures = DEFAULT_PARSER_FEATURES;
        _writeContext = JsonWriteContext.createRootContext();
        objectcodec = new Segment();
        _last = objectcodec;
        _first = objectcodec;
        _appendOffset = 0;
    }

    protected final void _append(JsonToken jsontoken)
    {
        jsontoken = _last.append(_appendOffset, jsontoken);
        if (jsontoken == null)
        {
            _appendOffset = _appendOffset + 1;
            return;
        } else
        {
            _last = jsontoken;
            _appendOffset = 1;
            return;
        }
    }

    protected final void _append(JsonToken jsontoken, Object obj)
    {
        jsontoken = _last.append(_appendOffset, jsontoken, obj);
        if (jsontoken == null)
        {
            _appendOffset = _appendOffset + 1;
            return;
        } else
        {
            _last = jsontoken;
            _appendOffset = 1;
            return;
        }
    }

    protected final void _appendRaw(int i, Object obj)
    {
        obj = _last.appendRaw(_appendOffset, i, obj);
        if (obj == null)
        {
            _appendOffset = _appendOffset + 1;
            return;
        } else
        {
            _last = ((Segment) (obj));
            _appendOffset = 1;
            return;
        }
    }

    protected void _reportUnsupportedOperation()
    {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenbuffer)
    {
        for (tokenbuffer = tokenbuffer.asParser(); tokenbuffer.nextToken() != null; copyCurrentEvent(tokenbuffer)) { }
        return this;
    }

    public JsonParser asParser()
    {
        return asParser(_objectCodec);
    }

    public JsonParser asParser(JsonParser jsonparser)
    {
        Parser parser = new Parser(_first, jsonparser.getCodec());
        parser.setLocation(jsonparser.getTokenLocation());
        return parser;
    }

    public JsonParser asParser(ObjectCodec objectcodec)
    {
        return new Parser(_first, objectcodec);
    }

    public void close()
    {
        _closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonparser)
    {
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
    {
        JsonToken jsontoken1 = jsonparser.getCurrentToken();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == JsonToken.FIELD_NAME)
        {
            writeFieldName(jsonparser.getCurrentName());
            jsontoken = jsonparser.nextToken();
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

    public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures & ~feature.getMask();
        return this;
    }

    public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures | feature.getMask();
        return this;
    }

    public void flush()
    {
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public volatile JsonStreamContext getOutputContext()
    {
        return getOutputContext();
    }

    public final JsonWriteContext getOutputContext()
    {
        return _writeContext;
    }

    public boolean isClosed()
    {
        return _closed;
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return (_generatorFeatures & feature.getMask()) != 0;
    }

    public void serialize(JsonGenerator jsongenerator)
    {
        Segment segment;
        int i;
        segment = _first;
        i = -1;
_L7:
        i++;
        if (i < 16) goto _L2; else goto _L1
_L1:
        segment = segment.next();
        if (segment != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        i = 0;
_L2:
        JsonToken jsontoken = segment.type(i);
        if (jsontoken == null) goto _L3; else goto _L5
_L5:
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw new RuntimeException("Internal error: should never end up through this code path");

        case 1: // '\001'
            jsongenerator.writeStartObject();
            break;

        case 2: // '\002'
            jsongenerator.writeEndObject();
            break;

        case 3: // '\003'
            jsongenerator.writeStartArray();
            break;

        case 4: // '\004'
            jsongenerator.writeEndArray();
            break;

        case 5: // '\005'
            Object obj = segment.get(i);
            if (obj instanceof SerializableString)
            {
                jsongenerator.writeFieldName((SerializableString)obj);
            } else
            {
                jsongenerator.writeFieldName((String)obj);
            }
            break;

        case 6: // '\006'
            Object obj1 = segment.get(i);
            if (obj1 instanceof SerializableString)
            {
                jsongenerator.writeString((SerializableString)obj1);
            } else
            {
                jsongenerator.writeString((String)obj1);
            }
            break;

        case 7: // '\007'
            Number number = (Number)segment.get(i);
            if (number instanceof BigInteger)
            {
                jsongenerator.writeNumber((BigInteger)number);
            } else
            if (number instanceof Long)
            {
                jsongenerator.writeNumber(number.longValue());
            } else
            {
                jsongenerator.writeNumber(number.intValue());
            }
            break;

        case 8: // '\b'
            Object obj2 = segment.get(i);
            if (obj2 instanceof BigDecimal)
            {
                jsongenerator.writeNumber((BigDecimal)obj2);
            } else
            if (obj2 instanceof Float)
            {
                jsongenerator.writeNumber(((Float)obj2).floatValue());
            } else
            if (obj2 instanceof Double)
            {
                jsongenerator.writeNumber(((Double)obj2).doubleValue());
            } else
            if (obj2 == null)
            {
                jsongenerator.writeNull();
            } else
            if (obj2 instanceof String)
            {
                jsongenerator.writeNumber((String)obj2);
            } else
            {
                throw new JsonGenerationException((new StringBuilder()).append("Unrecognized value type for VALUE_NUMBER_FLOAT: ").append(obj2.getClass().getName()).append(", can not serialize").toString());
            }
            break;

        case 9: // '\t'
            jsongenerator.writeBoolean(true);
            break;

        case 10: // '\n'
            jsongenerator.writeBoolean(false);
            break;

        case 11: // '\013'
            jsongenerator.writeNull();
            break;

        case 12: // '\f'
            jsongenerator.writeObject(segment.get(i));
            break;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public JsonGenerator setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        JsonParser jsonparser;
        int i;
        stringbuilder = new StringBuilder();
        stringbuilder.append("[TokenBuffer: ");
        jsonparser = asParser();
        i = 0;
_L1:
        JsonToken jsontoken;
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
        if (i >= 100)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_94;
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

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
    {
        base64variant = new byte[j];
        System.arraycopy(abyte0, i, base64variant, 0, j);
        writeObject(base64variant);
    }

    public void writeBoolean(boolean flag)
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
    {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext jsonwritecontext = _writeContext.getParent();
        if (jsonwritecontext != null)
        {
            _writeContext = jsonwritecontext;
        }
    }

    public final void writeEndObject()
    {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext jsonwritecontext = _writeContext.getParent();
        if (jsonwritecontext != null)
        {
            _writeContext = jsonwritecontext;
        }
    }

    public void writeFieldName(SerializableString serializablestring)
    {
        _append(JsonToken.FIELD_NAME, serializablestring);
        _writeContext.writeFieldName(serializablestring.getValue());
    }

    public final void writeFieldName(String s)
    {
        _append(JsonToken.FIELD_NAME, s);
        _writeContext.writeFieldName(s);
    }

    public void writeNull()
    {
        _append(JsonToken.VALUE_NULL);
    }

    public void writeNumber(double d)
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeNumber(float f)
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeNumber(int i)
    {
        _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeNumber(long l)
    {
        _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(l));
    }

    public void writeNumber(String s)
    {
        _append(JsonToken.VALUE_NUMBER_FLOAT, s);
    }

    public void writeNumber(BigDecimal bigdecimal)
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

    public void writeObject(Object obj)
    {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void writeRaw(char c)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String s)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String s, int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(char ac[], int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String s)
    {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String s, int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(char ac[], int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray()
    {
        _append(JsonToken.START_ARRAY);
        _writeContext = _writeContext.createChildArrayContext();
    }

    public final void writeStartObject()
    {
        _append(JsonToken.START_OBJECT);
        _writeContext = _writeContext.createChildObjectContext();
    }

    public void writeString(SerializableString serializablestring)
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
    {
        writeString(new String(ac, i, j));
    }

    public void writeTree(TreeNode treenode)
    {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, treenode);
    }

    public void writeUTF8String(byte abyte0[], int i, int j)
    {
        _reportUnsupportedOperation();
    }


    private class Segment
    {

        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken TOKEN_TYPES_BY_INDEX[];
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object _tokens[] = new Object[16];

        private void set(int i, int j, Object obj)
        {
            _tokens[i] = obj;
            long l1 = j;
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = l | _tokenTypes;
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

        public Segment appendRaw(int i, int j, Object obj)
        {
            if (i < 16)
            {
                set(i, j, obj);
                return null;
            } else
            {
                _next = new Segment();
                _next.set(0, j, obj);
                return _next;
            }
        }

        public Object get(int i)
        {
            return _tokens[i];
        }

        public Segment next()
        {
            return _next;
        }

        public int rawType(int i)
        {
            long l1 = _tokenTypes;
            long l = l1;
            if (i > 0)
            {
                l = l1 >> (i << 2);
            }
            return (int)l & 0xf;
        }

        public void set(int i, JsonToken jsontoken)
        {
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = l | _tokenTypes;
        }

        public void set(int i, JsonToken jsontoken, Object obj)
        {
            _tokens[i] = obj;
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = l | _tokenTypes;
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


    private class Parser extends ParserMinimalBase
    {

        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected JsonLocation _location;
        protected JsonReadContext _parsingContext;
        protected Segment _segment;
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
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()])
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

        public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
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
            if (number instanceof Float)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
            }
            if (number instanceof BigInteger)
            {
                return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
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
                switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
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
                Segment segment = _segment;
                int i = _segmentPtr + 1;
                if (i >= 16)
                {
                    if (segment == null)
                    {
                        segment = null;
                    } else
                    {
                        segment = segment.next();
                    }
                    i = 0;
                }
                if (segment != null)
                {
                    return segment.type(i);
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

        public Parser(Segment segment, ObjectCodec objectcodec)
        {
            super(0);
            _location = null;
            _segment = segment;
            _segmentPtr = -1;
            _codec = objectcodec;
            _parsingContext = JsonReadContext.createRootContext(-1, -1);
        }
    }


    private class _cls1
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

}
