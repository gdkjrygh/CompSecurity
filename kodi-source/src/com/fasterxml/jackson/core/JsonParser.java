// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonParseException, Base64Variants, JsonToken, JsonStreamContext, 
//            Base64Variant, ObjectCodec, JsonLocation

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
        public static final Feature ALLOW_YAML_COMMENTS;
        public static final Feature AUTO_CLOSE_SOURCE;
        public static final Feature STRICT_DUPLICATE_DETECTION;
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

        public boolean enabledIn(int i)
        {
            return (_mask & i) != 0;
        }

        public int getMask()
        {
            return _mask;
        }

        static 
        {
            AUTO_CLOSE_SOURCE = new Feature("AUTO_CLOSE_SOURCE", 0, true);
            ALLOW_COMMENTS = new Feature("ALLOW_COMMENTS", 1, false);
            ALLOW_YAML_COMMENTS = new Feature("ALLOW_YAML_COMMENTS", 2, false);
            ALLOW_UNQUOTED_FIELD_NAMES = new Feature("ALLOW_UNQUOTED_FIELD_NAMES", 3, false);
            ALLOW_SINGLE_QUOTES = new Feature("ALLOW_SINGLE_QUOTES", 4, false);
            ALLOW_UNQUOTED_CONTROL_CHARS = new Feature("ALLOW_UNQUOTED_CONTROL_CHARS", 5, false);
            ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER = new Feature("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 6, false);
            ALLOW_NUMERIC_LEADING_ZEROS = new Feature("ALLOW_NUMERIC_LEADING_ZEROS", 7, false);
            ALLOW_NON_NUMERIC_NUMBERS = new Feature("ALLOW_NON_NUMERIC_NUMBERS", 8, false);
            STRICT_DUPLICATE_DETECTION = new Feature("STRICT_DUPLICATE_DETECTION", 9, false);
            $VALUES = (new Feature[] {
                AUTO_CLOSE_SOURCE, ALLOW_COMMENTS, ALLOW_YAML_COMMENTS, ALLOW_UNQUOTED_FIELD_NAMES, ALLOW_SINGLE_QUOTES, ALLOW_UNQUOTED_CONTROL_CHARS, ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, ALLOW_NUMERIC_LEADING_ZEROS, ALLOW_NON_NUMERIC_NUMBERS, STRICT_DUPLICATE_DETECTION
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

    protected void _reportUnsupportedOperation()
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Operation not supported by parser of type ").append(getClass().getName()).toString());
    }

    public boolean canReadObjectId()
    {
        return false;
    }

    public boolean canReadTypeId()
    {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close()
        throws IOException;

    public abstract BigInteger getBigIntegerValue()
        throws IOException;

    public byte[] getBinaryValue()
        throws IOException
    {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException;

    public byte getByteValue()
        throws IOException
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

    public abstract String getCurrentName()
        throws IOException;

    public abstract JsonToken getCurrentToken();

    public abstract int getCurrentTokenId();

    public abstract BigDecimal getDecimalValue()
        throws IOException;

    public abstract double getDoubleValue()
        throws IOException;

    public abstract Object getEmbeddedObject()
        throws IOException;

    public int getFeatureMask()
    {
        return _features;
    }

    public abstract float getFloatValue()
        throws IOException;

    public abstract int getIntValue()
        throws IOException;

    public abstract long getLongValue()
        throws IOException;

    public abstract NumberType getNumberType()
        throws IOException;

    public abstract Number getNumberValue()
        throws IOException;

    public Object getObjectId()
        throws IOException
    {
        return null;
    }

    public abstract JsonStreamContext getParsingContext();

    public short getShortValue()
        throws IOException
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

    public abstract String getText()
        throws IOException;

    public abstract char[] getTextCharacters()
        throws IOException;

    public abstract int getTextLength()
        throws IOException;

    public abstract int getTextOffset()
        throws IOException;

    public abstract JsonLocation getTokenLocation();

    public Object getTypeId()
        throws IOException
    {
        return null;
    }

    public String getValueAsString()
        throws IOException
    {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String s)
        throws IOException;

    public abstract boolean hasTextCharacters();

    public boolean isEnabled(Feature feature)
    {
        return feature.enabledIn(_features);
    }

    public boolean isExpectedStartArrayToken()
    {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public String nextTextValue()
        throws IOException, JsonParseException
    {
        if (nextToken() == JsonToken.VALUE_STRING)
        {
            return getText();
        } else
        {
            return null;
        }
    }

    public abstract JsonToken nextToken()
        throws IOException, JsonParseException;

    public abstract JsonToken nextValue()
        throws IOException, JsonParseException;

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
        throws IOException
    {
        _reportUnsupportedOperation();
        return 0;
    }

    public void setCurrentValue(Object obj)
    {
        JsonStreamContext jsonstreamcontext = getParsingContext();
        if (jsonstreamcontext != null)
        {
            jsonstreamcontext.setCurrentValue(obj);
        }
    }

    public JsonParser setFeatureMask(int i)
    {
        _features = i;
        return this;
    }

    public abstract JsonParser skipChildren()
        throws IOException, JsonParseException;
}
