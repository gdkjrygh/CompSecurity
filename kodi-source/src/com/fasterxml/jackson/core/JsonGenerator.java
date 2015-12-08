// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonGenerationException, JsonParser, JsonToken, JsonStreamContext, 
//            Base64Variants, Base64Variant, SerializableString

public abstract class JsonGenerator
    implements Closeable, Flushable
{
    public static final class Feature extends Enum
    {

        private static final Feature $VALUES[];
        public static final Feature AUTO_CLOSE_JSON_CONTENT;
        public static final Feature AUTO_CLOSE_TARGET;
        public static final Feature ESCAPE_NON_ASCII;
        public static final Feature FLUSH_PASSED_TO_STREAM;
        public static final Feature IGNORE_UNKNOWN;
        public static final Feature QUOTE_FIELD_NAMES;
        public static final Feature QUOTE_NON_NUMERIC_NUMBERS;
        public static final Feature STRICT_DUPLICATE_DETECTION;
        public static final Feature WRITE_BIGDECIMAL_AS_PLAIN;
        public static final Feature WRITE_NUMBERS_AS_STRINGS;
        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public static int collectDefaults()
        {
            int j = 0;
            Feature afeature[] = values();
            int l = afeature.length;
            for (int i = 0; i < l;)
            {
                Feature feature = afeature[i];
                int k = j;
                if (feature.enabledByDefault())
                {
                    k = j | feature.getMask();
                }
                i++;
                j = k;
            }

            return j;
        }

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonGenerator$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])$VALUES.clone();
        }

        public boolean enabledByDefault()
        {
            return _defaultState;
        }

        public int getMask()
        {
            return _mask;
        }

        static 
        {
            AUTO_CLOSE_TARGET = new Feature("AUTO_CLOSE_TARGET", 0, true);
            AUTO_CLOSE_JSON_CONTENT = new Feature("AUTO_CLOSE_JSON_CONTENT", 1, true);
            QUOTE_FIELD_NAMES = new Feature("QUOTE_FIELD_NAMES", 2, true);
            QUOTE_NON_NUMERIC_NUMBERS = new Feature("QUOTE_NON_NUMERIC_NUMBERS", 3, true);
            WRITE_NUMBERS_AS_STRINGS = new Feature("WRITE_NUMBERS_AS_STRINGS", 4, false);
            WRITE_BIGDECIMAL_AS_PLAIN = new Feature("WRITE_BIGDECIMAL_AS_PLAIN", 5, false);
            FLUSH_PASSED_TO_STREAM = new Feature("FLUSH_PASSED_TO_STREAM", 6, true);
            ESCAPE_NON_ASCII = new Feature("ESCAPE_NON_ASCII", 7, false);
            STRICT_DUPLICATE_DETECTION = new Feature("STRICT_DUPLICATE_DETECTION", 8, false);
            IGNORE_UNKNOWN = new Feature("IGNORE_UNKNOWN", 9, false);
            $VALUES = (new Feature[] {
                AUTO_CLOSE_TARGET, AUTO_CLOSE_JSON_CONTENT, QUOTE_FIELD_NAMES, QUOTE_NON_NUMERIC_NUMBERS, WRITE_NUMBERS_AS_STRINGS, WRITE_BIGDECIMAL_AS_PLAIN, FLUSH_PASSED_TO_STREAM, ESCAPE_NON_ASCII, STRICT_DUPLICATE_DETECTION, IGNORE_UNKNOWN
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
    }


    protected JsonGenerator()
    {
    }

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
        VersionUtil.throwInternal();
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

    public void copyCurrentEvent(JsonParser jsonparser)
        throws IOException
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
        throws IOException
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

    public abstract void flush()
        throws IOException;

    public abstract JsonStreamContext getOutputContext();

    public void setCurrentValue(Object obj)
    {
        JsonStreamContext jsonstreamcontext = getOutputContext();
        if (jsonstreamcontext != null)
        {
            jsonstreamcontext.setCurrentValue(obj);
        }
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public final void writeArrayFieldStart(String s)
        throws IOException
    {
        writeFieldName(s);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
        throws IOException;

    public int writeBinary(InputStream inputstream, int i)
        throws IOException
    {
        return writeBinary(Base64Variants.getDefaultVariant(), inputstream, i);
    }

    public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
        throws IOException;

    public void writeBinary(byte abyte0[])
        throws IOException
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
    }

    public void writeBinary(byte abyte0[], int i, int j)
        throws IOException
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
    }

    public abstract void writeBoolean(boolean flag)
        throws IOException;

    public abstract void writeEndArray()
        throws IOException;

    public abstract void writeEndObject()
        throws IOException;

    public abstract void writeFieldName(SerializableString serializablestring)
        throws IOException;

    public abstract void writeFieldName(String s)
        throws IOException;

    public abstract void writeNull()
        throws IOException;

    public abstract void writeNumber(double d)
        throws IOException;

    public abstract void writeNumber(float f)
        throws IOException;

    public abstract void writeNumber(int i)
        throws IOException;

    public abstract void writeNumber(long l)
        throws IOException;

    public abstract void writeNumber(String s)
        throws IOException;

    public abstract void writeNumber(BigDecimal bigdecimal)
        throws IOException;

    public abstract void writeNumber(BigInteger biginteger)
        throws IOException;

    public void writeNumber(short word0)
        throws IOException
    {
        writeNumber(word0);
    }

    public abstract void writeObject(Object obj)
        throws IOException;

    public final void writeObjectFieldStart(String s)
        throws IOException
    {
        writeFieldName(s);
        writeStartObject();
    }

    public void writeObjectId(Object obj)
        throws IOException
    {
        throw new JsonGenerationException("No native support for writing Object Ids");
    }

    public void writeObjectRef(Object obj)
        throws IOException
    {
        throw new JsonGenerationException("No native support for writing Object Ids");
    }

    public void writeOmittedField(String s)
        throws IOException
    {
    }

    public abstract void writeRawValue(String s)
        throws IOException;

    public abstract void writeStartArray()
        throws IOException;

    public void writeStartArray(int i)
        throws IOException
    {
        writeStartArray();
    }

    public abstract void writeStartObject()
        throws IOException;

    public abstract void writeString(SerializableString serializablestring)
        throws IOException;

    public abstract void writeString(String s)
        throws IOException;

    public abstract void writeString(char ac[], int i, int j)
        throws IOException;

    public void writeStringField(String s, String s1)
        throws IOException
    {
        writeFieldName(s);
        writeString(s1);
    }

    public void writeTypeId(Object obj)
        throws IOException
    {
        throw new JsonGenerationException("No native support for writing Type Ids");
    }
}
