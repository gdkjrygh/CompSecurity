// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonParseException, JsonToken, FormatSchema, Base64Variant, 
//            ObjectCodec, JsonLocation

public abstract class JsonParser
    implements Closeable
{
    public static final class Feature extends Enum
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

        public final boolean enabledByDefault()
        {
            return _defaultState;
        }

        public final int getMask()
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

    public static final class NumberType extends Enum
    {

        private static final NumberType $VALUES[];
        public static final NumberType BIG_DECIMAL;
        public static final NumberType BIG_INTEGER;
        public static final NumberType DOUBLE;
        public static final NumberType FLOAT;
        public static final NumberType INT;
        public static final NumberType LONG;

        public static NumberType valueOf(String s)
        {
            return (NumberType)Enum.valueOf(com/fasterxml/jackson/core/JsonParser$NumberType, s);
        }

        public static NumberType[] values()
        {
            return (NumberType[])$VALUES.clone();
        }

        static 
        {
            INT = new NumberType("INT", 0);
            LONG = new NumberType("LONG", 1);
            BIG_INTEGER = new NumberType("BIG_INTEGER", 2);
            FLOAT = new NumberType("FLOAT", 3);
            DOUBLE = new NumberType("DOUBLE", 4);
            BIG_DECIMAL = new NumberType("BIG_DECIMAL", 5);
            $VALUES = (new NumberType[] {
                INT, LONG, BIG_INTEGER, FLOAT, DOUBLE, BIG_DECIMAL
            });
        }

        private NumberType(String s, int i)
        {
            super(s, i);
        }
    }


    public int _features;

    public JsonParser()
    {
    }

    public JsonParser(int i)
    {
        _features = i;
    }

    public JsonParseException _constructError(String s)
    {
        return new JsonParseException(s, getCurrentLocation());
    }

    public abstract void clearCurrentToken();

    public abstract void close()
        throws IOException;

    public JsonParser enable(Feature feature)
    {
        _features = _features | feature.getMask();
        return this;
    }

    public abstract BigInteger getBigIntegerValue()
        throws IOException, JsonParseException;

    public abstract byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException, JsonParseException;

    public byte getByteValue()
        throws IOException, JsonParseException
    {
        int i = getIntValue();
        if (i < -128 || i > 255)
        {
            throw _constructError((new StringBuilder("Numeric value (")).append(getText()).append(") out of range of Java byte").toString());
        } else
        {
            return (byte)i;
        }
    }

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName()
        throws IOException, JsonParseException;

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue()
        throws IOException, JsonParseException;

    public abstract double getDoubleValue()
        throws IOException, JsonParseException;

    public abstract Object getEmbeddedObject()
        throws IOException, JsonParseException;

    public abstract float getFloatValue()
        throws IOException, JsonParseException;

    public abstract int getIntValue()
        throws IOException, JsonParseException;

    public abstract long getLongValue()
        throws IOException, JsonParseException;

    public abstract NumberType getNumberType()
        throws IOException, JsonParseException;

    public abstract Number getNumberValue()
        throws IOException, JsonParseException;

    public short getShortValue()
        throws IOException, JsonParseException
    {
        int i = getIntValue();
        if (i < -32768 || i > 32767)
        {
            throw _constructError((new StringBuilder("Numeric value (")).append(getText()).append(") out of range of Java short").toString());
        } else
        {
            return (short)i;
        }
    }

    public abstract String getText()
        throws IOException, JsonParseException;

    public abstract char[] getTextCharacters()
        throws IOException, JsonParseException;

    public abstract int getTextLength()
        throws IOException, JsonParseException;

    public abstract int getTextOffset()
        throws IOException, JsonParseException;

    public abstract JsonLocation getTokenLocation();

    public int getValueAsInt()
        throws IOException, JsonParseException
    {
        return getValueAsInt(0);
    }

    public int getValueAsInt(int i)
        throws IOException, JsonParseException
    {
        return i;
    }

    public long getValueAsLong()
        throws IOException, JsonParseException
    {
        return getValueAsLong(0L);
    }

    public long getValueAsLong(long l)
        throws IOException, JsonParseException
    {
        return l;
    }

    public String getValueAsString()
        throws IOException, JsonParseException
    {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String s)
        throws IOException, JsonParseException;

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public boolean isEnabled(Feature feature)
    {
        return (_features & feature.getMask()) != 0;
    }

    public boolean isExpectedStartArrayToken()
    {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public abstract JsonToken nextToken()
        throws IOException, JsonParseException;

    public abstract JsonToken nextValue()
        throws IOException, JsonParseException;

    public void setSchema(FormatSchema formatschema)
    {
        throw new UnsupportedOperationException((new StringBuilder("Parser of type ")).append(getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
    }

    public abstract JsonParser skipChildren()
        throws IOException, JsonParseException;
}
