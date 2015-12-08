// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerationException, JsonParser, JsonToken, FormatSchema, 
//            Base64Variants, SerializableString, PrettyPrinter, Base64Variant

public abstract class JsonGenerator
    implements Closeable, Flushable
{

    public PrettyPrinter _cfgPrettyPrinter;

    public JsonGenerator()
    {
    }

    public void _reportError(String s)
    {
        throw new JsonGenerationException(s);
    }

    public void _reportUnsupportedOperation()
    {
        throw new UnsupportedOperationException((new StringBuilder("Operation not supported by generator of type ")).append(getClass().getName()).toString());
    }

    public final void _throwInternal()
    {
        VersionUtil.throwInternal();
    }

    public void _writeSimpleObject(Object obj)
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
                writeBinary((byte[])obj);
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
        throw new IllegalStateException((new StringBuilder("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ")).append(obj.getClass().getName()).append(")").toString());
    }

    public boolean canOmitFields()
    {
        return true;
    }

    public boolean canWriteBinaryNatively()
    {
        return false;
    }

    public boolean canWriteObjectId()
    {
        return false;
    }

    public boolean canWriteTypeId()
    {
        return false;
    }

    public abstract void close();

    public void copyCurrentEvent(JsonParser jsonparser)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == null)
        {
            _reportError("No current event to copy");
        }
        switch (jsontoken.id())
        {
        case 0: // '\0'
        default:
            _throwInternal();
            return;

        case -1: 
            _reportError("No current event to copy");
            // fall through

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
            JsonParser.NumberType numbertype = jsonparser.getNumberType();
            if (numbertype == JsonParser.NumberType.INT)
            {
                writeNumber(jsonparser.getIntValue());
                return;
            }
            if (numbertype == JsonParser.NumberType.BIG_INTEGER)
            {
                writeNumber(jsonparser.getBigIntegerValue());
                return;
            } else
            {
                writeNumber(jsonparser.getLongValue());
                return;
            }

        case 8: // '\b'
            JsonParser.NumberType numbertype1 = jsonparser.getNumberType();
            if (numbertype1 == JsonParser.NumberType.BIG_DECIMAL)
            {
                writeNumber(jsonparser.getDecimalValue());
                return;
            }
            if (numbertype1 == JsonParser.NumberType.FLOAT)
            {
                writeNumber(jsonparser.getFloatValue());
                return;
            } else
            {
                writeNumber(jsonparser.getDoubleValue());
                return;
            }

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
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == null)
        {
            _reportError("No current event to copy");
        }
        int j = jsontoken.id();
        int i = j;
        if (j == 5)
        {
            writeFieldName(jsonparser.getCurrentName());
            i = jsonparser.nextToken().id();
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            copyCurrentEvent(jsonparser);
            return;

        case 1: // '\001'
            writeStartObject();
            for (; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser)) { }
            writeEndObject();
            return;

        case 3: // '\003'
            writeStartArray();
            break;
        }
        for (; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser)) { }
        writeEndArray();
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    public abstract void flush();

    public PrettyPrinter getPrettyPrinter()
    {
        return _cfgPrettyPrinter;
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
    {
        _cfgPrettyPrinter = prettyprinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
    {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatschema)
    {
        throw new UnsupportedOperationException((new StringBuilder("Generator of type ")).append(getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public final void writeArrayFieldStart(String s)
    {
        writeFieldName(s);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64variant, InputStream inputstream, int i);

    public int writeBinary(InputStream inputstream, int i)
    {
        return writeBinary(Base64Variants.getDefaultVariant(), inputstream, i);
    }

    public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j);

    public void writeBinary(byte abyte0[])
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
    }

    public void writeBinary(byte abyte0[], int i, int j)
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
    }

    public abstract void writeBoolean(boolean flag);

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(SerializableString serializablestring);

    public abstract void writeFieldName(String s);

    public abstract void writeNull();

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long l);

    public abstract void writeNumber(String s);

    public abstract void writeNumber(BigDecimal bigdecimal);

    public abstract void writeNumber(BigInteger biginteger);

    public void writeNumber(short word0)
    {
        writeNumber(word0);
    }

    public abstract void writeObject(Object obj);

    public final void writeObjectFieldStart(String s)
    {
        writeFieldName(s);
        writeStartObject();
    }

    public void writeObjectId(Object obj)
    {
        throw new JsonGenerationException("No native support for writing Object Ids");
    }

    public void writeObjectRef(Object obj)
    {
        throw new JsonGenerationException("No native support for writing Object Ids");
    }

    public void writeOmittedField(String s)
    {
    }

    public abstract void writeRaw(char c);

    public void writeRaw(SerializableString serializablestring)
    {
        writeRaw(serializablestring.getValue());
    }

    public abstract void writeRaw(String s);

    public abstract void writeRaw(char ac[], int i, int j);

    public abstract void writeRawValue(String s);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(SerializableString serializablestring);

    public abstract void writeString(String s);

    public abstract void writeString(char ac[], int i, int j);

    public void writeStringField(String s, String s1)
    {
        writeFieldName(s);
        writeString(s1);
    }

    public void writeTypeId(Object obj)
    {
        throw new JsonGenerationException("No native support for writing Type Ids");
    }
}
