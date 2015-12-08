// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class GeneratorBase extends JsonGenerator
{

    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    protected GeneratorBase(int i, ObjectCodec objectcodec)
    {
        _features = i;
        _writeContext = JsonWriteContext.createRootContext();
        _objectCodec = objectcodec;
        _cfgNumbersAsStrings = isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
    }

    protected void _cantHappen()
    {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    protected abstract void _releaseBuffers();

    protected void _reportError(String s)
        throws JsonGenerationException
    {
        throw new JsonGenerationException(s);
    }

    protected void _reportUnsupportedOperation()
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Operation not supported by generator of type ").append(getClass().getName()).toString());
    }

    protected final void _throwInternal()
    {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    protected abstract void _verifyValueWrite(String s)
        throws IOException, JsonGenerationException;

    protected void _writeSimpleObject(Object obj)
        throws IOException, JsonGenerationException
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (obj instanceof String)
        {
            writeString((String)obj);
            return;
        }
        if (obj instanceof Number)
        {
            Number number = (Number)obj;
            if (number instanceof Integer)
            {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long)
            {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double)
            {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float)
            {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short)
            {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte)
            {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger)
            {
                writeNumber((BigInteger)number);
                return;
            }
            if (number instanceof BigDecimal)
            {
                writeNumber((BigDecimal)number);
                return;
            }
            if (number instanceof AtomicInteger)
            {
                writeNumber(((AtomicInteger)number).get());
                return;
            }
            if (number instanceof AtomicLong)
            {
                writeNumber(((AtomicLong)number).get());
                return;
            }
        } else
        {
            if (obj instanceof byte[])
            {
                writeBinary((byte[])(byte[])obj);
                return;
            }
            if (obj instanceof Boolean)
            {
                writeBoolean(((Boolean)obj).booleanValue());
                return;
            }
            if (obj instanceof AtomicBoolean)
            {
                writeBoolean(((AtomicBoolean)obj).get());
                return;
            }
        }
        throw new IllegalStateException((new StringBuilder()).append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ").append(obj.getClass().getName()).append(")").toString());
    }

    public void close()
        throws IOException
    {
        _closed = true;
    }

    public final void copyCurrentEvent(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == null)
        {
            _reportError("No current event to copy");
        }
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];
            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 4;
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
            _cantHappen();
            return;

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

    public final void copyCurrentStructure(JsonParser jsonparser)
        throws IOException, JsonProcessingException
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
        _features = _features & ~feature.getMask();
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
        {
            _cfgNumbersAsStrings = false;
        } else
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
        {
            setHighestNonEscapedChar(0);
            return this;
        }
        return this;
    }

    public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        _features = _features | feature.getMask();
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
        {
            _cfgNumbersAsStrings = true;
        } else
        if (feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
        {
            setHighestNonEscapedChar(127);
            return this;
        }
        return this;
    }

    public abstract void flush()
        throws IOException;

    public final ObjectCodec getCodec()
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

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return (_features & feature.getMask()) != 0;
    }

    public JsonGenerator setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        return this;
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        if (getPrettyPrinter() != null)
        {
            return this;
        } else
        {
            return setPrettyPrinter(new DefaultPrettyPrinter());
        }
    }

    public Version version()
    {
        return VersionUtil.versionFor(getClass());
    }

    public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
        throws IOException, JsonGenerationException
    {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeFieldName(serializablestring.getValue());
    }

    public void writeObject(Object obj)
        throws IOException, JsonProcessingException
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (_objectCodec != null)
        {
            _objectCodec.writeValue(this, obj);
            return;
        } else
        {
            _writeSimpleObject(obj);
            return;
        }
    }

    public void writeRawValue(String s)
        throws IOException, JsonGenerationException
    {
        _verifyValueWrite("write raw value");
        writeRaw(s);
    }

    public void writeRawValue(String s, int i, int j)
        throws IOException, JsonGenerationException
    {
        _verifyValueWrite("write raw value");
        writeRaw(s, i, j);
    }

    public void writeRawValue(char ac[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _verifyValueWrite("write raw value");
        writeRaw(ac, i, j);
    }

    public void writeString(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeString(serializablestring.getValue());
    }

    public void writeTree(TreeNode treenode)
        throws IOException, JsonProcessingException
    {
        if (treenode == null)
        {
            writeNull();
            return;
        }
        if (_objectCodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the generator, can not serialize JsonNode-based trees");
        } else
        {
            _objectCodec.writeValue(this, treenode);
            return;
        }
    }
}
