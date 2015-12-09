// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenBuffer extends JsonGenerator
{

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
    {
        _closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonparser)
    {
        if (_mayHaveNativeIds)
        {
            _checkNativeIds(jsonparser);
        }
        class _cls1
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
            throw deserializationcontext.mappingException((new StringBuilder("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ")).append(jsontoken).toString());
        } else
        {
            writeEndObject();
            return this;
        }
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
    {
    }

    public void serialize(JsonGenerator jsongenerator)
    {
        Segment segment;
        int i;
        int j;
        int k;
        segment = _first;
        boolean flag = _mayHaveNativeIds;
        JsonToken jsontoken;
        Object obj4;
        if (flag && segment.hasIds())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = -1;
_L9:
        k = j + 1;
        if (k < 16) goto _L2; else goto _L1
_L1:
        segment = segment.next();
        if (segment == null) goto _L4; else goto _L3
_L3:
        if (flag && segment.hasIds())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = 0;
        j = i;
        i = k;
_L7:
        jsontoken = segment.type(i);
        if (jsontoken == null) goto _L4; else goto _L5
_L5:
        if (j != 0)
        {
            obj4 = segment.findObjectId(i);
            if (obj4 != null)
            {
                jsongenerator.writeObjectId(obj4);
            }
            obj4 = segment.findTypeId(i);
            if (obj4 != null)
            {
                jsongenerator.writeTypeId(obj4);
            }
        }
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw new RuntimeException("Internal error: should never end up through this code path");

        case 1: // '\001'
            jsongenerator.writeStartObject();
            k = i;
            i = j;
            j = k;
            break;

        case 2: // '\002'
            jsongenerator.writeEndObject();
            k = i;
            i = j;
            j = k;
            break;

        case 3: // '\003'
            jsongenerator.writeStartArray();
            k = i;
            i = j;
            j = k;
            break;

        case 4: // '\004'
            jsongenerator.writeEndArray();
            k = i;
            i = j;
            j = k;
            break;

        case 5: // '\005'
            Object obj = segment.get(i);
            if (obj instanceof SerializableString)
            {
                jsongenerator.writeFieldName((SerializableString)obj);
                k = i;
                i = j;
                j = k;
            } else
            {
                jsongenerator.writeFieldName((String)obj);
                k = i;
                i = j;
                j = k;
            }
            break;

        case 6: // '\006'
            Object obj1 = segment.get(i);
            if (obj1 instanceof SerializableString)
            {
                jsongenerator.writeString((SerializableString)obj1);
                k = i;
                i = j;
                j = k;
            } else
            {
                jsongenerator.writeString((String)obj1);
                k = i;
                i = j;
                j = k;
            }
            break;

        case 7: // '\007'
            Object obj2 = segment.get(i);
            if (obj2 instanceof Integer)
            {
                jsongenerator.writeNumber(((Integer)obj2).intValue());
                k = i;
                i = j;
                j = k;
            } else
            if (obj2 instanceof BigInteger)
            {
                jsongenerator.writeNumber((BigInteger)obj2);
                k = i;
                i = j;
                j = k;
            } else
            if (obj2 instanceof Long)
            {
                jsongenerator.writeNumber(((Long)obj2).longValue());
                k = i;
                i = j;
                j = k;
            } else
            if (obj2 instanceof Short)
            {
                jsongenerator.writeNumber(((Short)obj2).shortValue());
                k = i;
                i = j;
                j = k;
            } else
            {
                jsongenerator.writeNumber(((Number)obj2).intValue());
                k = i;
                i = j;
                j = k;
            }
            break;

        case 8: // '\b'
            Object obj3 = segment.get(i);
            if (obj3 instanceof Double)
            {
                jsongenerator.writeNumber(((Double)obj3).doubleValue());
                k = i;
                i = j;
                j = k;
            } else
            if (obj3 instanceof BigDecimal)
            {
                jsongenerator.writeNumber((BigDecimal)obj3);
                k = i;
                i = j;
                j = k;
            } else
            if (obj3 instanceof Float)
            {
                jsongenerator.writeNumber(((Float)obj3).floatValue());
                k = i;
                i = j;
                j = k;
            } else
            if (obj3 == null)
            {
                jsongenerator.writeNull();
                k = i;
                i = j;
                j = k;
            } else
            if (obj3 instanceof String)
            {
                jsongenerator.writeNumber((String)obj3);
                k = i;
                i = j;
                j = k;
            } else
            {
                throw new JsonGenerationException((new StringBuilder("Unrecognized value type for VALUE_NUMBER_FLOAT: ")).append(obj3.getClass().getName()).append(", can not serialize").toString());
            }
            break;

        case 9: // '\t'
            jsongenerator.writeBoolean(true);
            k = i;
            i = j;
            j = k;
            break;

        case 10: // '\n'
            jsongenerator.writeBoolean(false);
            k = i;
            i = j;
            j = k;
            break;

        case 11: // '\013'
            jsongenerator.writeNull();
            k = i;
            i = j;
            j = k;
            break;

        case 12: // '\f'
            jsongenerator.writeObject(segment.get(i));
            k = i;
            i = j;
            j = k;
            break;
        }
          goto _L6
_L4:
        return;
_L2:
        j = i;
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        JsonParser jsonparser;
        JsonToken jsontoken;
        boolean flag;
        int i;
        i = 0;
        stringbuilder = new StringBuilder();
        stringbuilder.append("[TokenBuffer: ");
        jsonparser = asParser();
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

    public void writeNumber(short word0)
    {
        _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(word0));
    }

    public void writeObject(Object obj)
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

    public void writeRaw(char c)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(SerializableString serializablestring)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String s)
    {
        _reportUnsupportedOperation();
    }

    public void writeRaw(char ac[], int i, int j)
    {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String s)
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

    public void writeTypeId(Object obj)
    {
        _typeId = obj;
        _hasNativeId = true;
    }


    private class Segment
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
            _tokenTypes = l | _tokenTypes;
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
            _tokenTypes = l | _tokenTypes;
        }

        private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
        {
            long l1 = jsontoken.ordinal();
            long l = l1;
            if (i > 0)
            {
                l = l1 << (i << 2);
            }
            _tokenTypes = l | _tokenTypes;
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
            _tokenTypes = l | _tokenTypes;
            assignNativeIds(i, obj1, obj2);
        }

        public final Segment append(int i, JsonToken jsontoken)
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

        public final Segment append(int i, JsonToken jsontoken, Object obj)
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

        public final Segment append(int i, JsonToken jsontoken, Object obj, Object obj1)
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

        public final Segment append(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
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

        public final Object findObjectId(int i)
        {
            if (_nativeIds == null)
            {
                return null;
            } else
            {
                return _nativeIds.get(Integer.valueOf(_objectIdIndex(i)));
            }
        }

        public final Object findTypeId(int i)
        {
            if (_nativeIds == null)
            {
                return null;
            } else
            {
                return _nativeIds.get(Integer.valueOf(_typeIdIndex(i)));
            }
        }

        public final Object get(int i)
        {
            return _tokens[i];
        }

        public final boolean hasIds()
        {
            return _nativeIds != null;
        }

        public final Segment next()
        {
            return _next;
        }

        public final JsonToken type(int i)
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
        protected final boolean _hasNativeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location;
        protected JsonReadContext _parsingContext;
        protected Segment _segment;
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
            if (getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL)
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

        public final com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
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
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
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

}
