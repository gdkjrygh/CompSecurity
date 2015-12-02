// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//            Versioned, JsonParseException, Base64Variants, JsonToken, 
//            SerializableString, ObjectCodec, FormatSchema, Base64Variant, 
//            JsonLocation, JsonStreamContext, TreeNode, Version

public abstract class JsonParser
    implements Versioned, Closeable
{

    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    protected int _features;

    protected JsonParser()
    {
    }

    protected JsonParser(int i)
    {
        _features = i;
    }

    protected JsonParseException _constructError(String s)
    {
        return new JsonParseException(s, getCurrentLocation());
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public JsonParser configure(Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public JsonParser disable(Feature feature)
    {
        _features = _features & ~feature.getMask();
        return this;
    }

    public JsonParser enable(Feature feature)
    {
        _features = _features | feature.getMask();
        return this;
    }

    public abstract BigInteger getBigIntegerValue();

    public byte[] getBinaryValue()
    {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64variant);

    public boolean getBooleanValue()
    {
        JsonToken jsontoken = getCurrentToken();
        if (jsontoken == JsonToken.VALUE_TRUE)
        {
            return true;
        }
        if (jsontoken == JsonToken.VALUE_FALSE)
        {
            return false;
        } else
        {
            throw new JsonParseException((new StringBuilder()).append("Current token (").append(jsontoken).append(") not of boolean type").toString(), getCurrentLocation());
        }
    }

    public byte getByteValue()
    {
        int i = getIntValue();
        if (i < -128 || i > 255)
        {
            throw _constructError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of Java byte").toString());
        } else
        {
            return (byte)i;
        }
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract Object getEmbeddedObject();

    public abstract float getFloatValue();

    public Object getInputSource()
    {
        return null;
    }

    public abstract int getIntValue();

    public abstract JsonToken getLastClearedToken();

    public abstract long getLongValue();

    public abstract NumberType getNumberType();

    public abstract Number getNumberValue();

    public abstract JsonStreamContext getParsingContext();

    public FormatSchema getSchema()
    {
        return null;
    }

    public short getShortValue()
    {
        int i = getIntValue();
        if (i < -32768 || i > 32767)
        {
            throw _constructError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of Java short").toString());
        } else
        {
            return (short)i;
        }
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public boolean getValueAsBoolean()
    {
        return getValueAsBoolean(false);
    }

    public boolean getValueAsBoolean(boolean flag)
    {
        return flag;
    }

    public double getValueAsDouble()
    {
        return getValueAsDouble(0.0D);
    }

    public double getValueAsDouble(double d)
    {
        return d;
    }

    public int getValueAsInt()
    {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i)
    {
        return i;
    }

    public long getValueAsLong()
    {
        return getValueAsLong(0L);
    }

    public long getValueAsLong(long l)
    {
        return l;
    }

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean isClosed();

    public boolean isEnabled(Feature feature)
    {
        return (_features & feature.getMask()) != 0;
    }

    public boolean isExpectedStartArrayToken()
    {
        return getCurrentToken() == JsonToken.START_ARRAY;
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
        return nextToken() == JsonToken.FIELD_NAME && serializablestring.getValue().equals(getCurrentName());
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
        if (nextToken() == JsonToken.VALUE_STRING)
        {
            return getText();
        } else
        {
            return null;
        }
    }

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public abstract void overrideCurrentName(String s);

    public Object readValueAs(TypeReference typereference)
    {
        ObjectCodec objectcodec = getCodec();
        if (objectcodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return objectcodec.readValue(this, typereference);
        }
    }

    public Object readValueAs(Class class1)
    {
        ObjectCodec objectcodec = getCodec();
        if (objectcodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return objectcodec.readValue(this, class1);
        }
    }

    public TreeNode readValueAsTree()
    {
        ObjectCodec objectcodec = getCodec();
        if (objectcodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
        } else
        {
            return objectcodec.readTree(this);
        }
    }

    public Iterator readValuesAs(TypeReference typereference)
    {
        ObjectCodec objectcodec = getCodec();
        if (objectcodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return objectcodec.readValues(this, typereference);
        }
    }

    public Iterator readValuesAs(Class class1)
    {
        ObjectCodec objectcodec = getCodec();
        if (objectcodec == null)
        {
            throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
        } else
        {
            return objectcodec.readValues(this, class1);
        }
    }

    public int releaseBuffered(OutputStream outputstream)
    {
        return -1;
    }

    public int releaseBuffered(Writer writer)
    {
        return -1;
    }

    public abstract void setCodec(ObjectCodec objectcodec);

    public void setSchema(FormatSchema formatschema)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Parser of type ").append(getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
    }

    public abstract JsonParser skipChildren();

    public abstract Version version();

    private class Feature extends Enum
    {

        private static final Feature $VALUES[];
        public static final Feature ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        public static final Feature ALLOW_COMMENTS;
        public static final Feature ALLOW_NON_NUMERIC_NUMBERS;
        public static final Feature ALLOW_NUMERIC_LEADING_ZEROS;
        public static final Feature ALLOW_SINGLE_QUOTES;
        public static final Feature ALLOW_UNQUOTED_CONTROL_CHARS;
        public static final Feature ALLOW_UNQUOTED_FIELD_NAMES;
        public static final Feature AUTO_CLOSE_SOURCE;
        private final boolean _defaultState;

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
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$Feature, s);
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
            return 1 << ordinal();
        }

        static 
        {
            AUTO_CLOSE_SOURCE = new Feature("AUTO_CLOSE_SOURCE", 0, true);
            ALLOW_COMMENTS = new Feature("ALLOW_COMMENTS", 1, false);
            ALLOW_UNQUOTED_FIELD_NAMES = new Feature("ALLOW_UNQUOTED_FIELD_NAMES", 2, false);
            ALLOW_SINGLE_QUOTES = new Feature("ALLOW_SINGLE_QUOTES", 3, false);
            ALLOW_UNQUOTED_CONTROL_CHARS = new Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 4, false);
            ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER = new Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 5, false);
            ALLOW_NUMERIC_LEADING_ZEROS = new Feature("ALLOW_NUMERIC_LEADING_ZEROS", 6, false);
            ALLOW_NON_NUMERIC_NUMBERS = new Feature("ALLOW_NON_NUMERIC_NUMBERS", 7, false);
            $VALUES = (new Feature[] {
                AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_NON_NUMERIC_NUMBERS
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
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
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
