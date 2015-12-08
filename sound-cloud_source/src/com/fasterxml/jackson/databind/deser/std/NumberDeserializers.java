// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, StdScalarDeserializer

public class NumberDeserializers
{
    public static class BigDecimalDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue();
            }
            if (obj == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return null;
                }
                try
                {
                    obj = new BigDecimal(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid representation");
                }
                return ((BigDecimal) (obj));
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }

        public BigDecimalDeserializer()
        {
            super(java/math/BigDecimal);
        }
    }

    public static class BigIntegerDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigInteger deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
_L1:
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
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()];
            JVM INSTR tableswitch 1 2: default 44
        //                       1 61
        //                       2 61;
               goto _L3 _L4 _L4
_L3:
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return null;
            }
            break; /* Loop/switch isn't completed */
_L4:
            return BigInteger.valueOf(jsonparser.getLongValue());
_L2:
            if (jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue().toBigInteger();
            }
            if (jsontoken != JsonToken.VALUE_STRING)
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
            if (true) goto _L3; else goto _L5
_L5:
            BigInteger biginteger;
            try
            {
                biginteger = new BigInteger(jsonparser);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid representation");
            }
            return biginteger;
        }

        public BigIntegerDeserializer()
        {
            super(java/math/BigInteger);
        }
    }

    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public final volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public BooleanDeserializer(Class class1, Boolean boolean1)
        {
            super(class1, boolean1);
        }
    }

    public static final class ByteDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseByte(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public ByteDeserializer(Class class1, Byte byte1)
        {
            super(class1, byte1);
        }
    }

    public static final class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT)
            {
                int i = jsonparser.getIntValue();
                if (i >= 0 && i <= 65535)
                {
                    return Character.valueOf((char)i);
                }
            } else
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText();
                if (jsonparser.length() == 1)
                {
                    return Character.valueOf(jsonparser.charAt(0));
                }
                if (jsonparser.length() == 0)
                {
                    return (Character)getEmptyValue();
                }
            }
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public CharacterDeserializer(Class class1, Character character)
        {
            super(class1, character);
        }
    }

    public static final class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public final volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public DoubleDeserializer(Class class1, Double double1)
        {
            super(class1, double1);
        }
    }

    public static final class FloatDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseFloat(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public FloatDeserializer(Class class1, Float float1)
        {
            super(class1, float1);
        }
    }

    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public final volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public IntegerDeserializer(Class class1, Integer integer)
        {
            super(class1, integer);
        }
    }

    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseLong(jsonparser, deserializationcontext);
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public LongDeserializer(Class class1, Long long1)
        {
            super(class1, long1);
        }
    }

    public static final class NumberDeserializer extends StdScalarDeserializer
    {

        public final Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj;
            obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.VALUE_NUMBER_INT)
            {
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
                {
                    return jsonparser.getBigIntegerValue();
                } else
                {
                    return jsonparser.getNumberValue();
                }
            }
            if (obj == JsonToken.VALUE_NUMBER_FLOAT)
            {
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
                {
                    return jsonparser.getDecimalValue();
                } else
                {
                    return Double.valueOf(jsonparser.getDoubleValue());
                }
            }
            if (obj != JsonToken.VALUE_STRING)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.indexOf('.') < 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                break MISSING_BLOCK_LABEL_120;
            }
            obj = new BigDecimal(jsonparser);
            return ((Number) (obj));
            return new Double(jsonparser);
            long l;
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return new BigInteger(jsonparser);
            }
            l = Long.parseLong(jsonparser);
            if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
            {
                try
                {
                    return Integer.valueOf((int)l);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid number");
                }
            } else
            {
                return Long.valueOf(l);
            }
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
            {
            default:
                return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                return deserialize(jsonparser, deserializationcontext);
            }
        }

        public NumberDeserializer()
        {
            super(java/lang/Number);
        }
    }

    protected static abstract class PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
    {

        protected final Object _nullValue;

        public final Object getNullValue()
        {
            return _nullValue;
        }

        protected PrimitiveOrWrapperDeserializer(Class class1, Object obj)
        {
            super(class1);
            _nullValue = obj;
        }
    }

    public static final class ShortDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public final Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseShort(jsonparser, deserializationcontext);
        }

        public ShortDeserializer(Class class1, Short short1)
        {
            super(class1, short1);
        }
    }


    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new BooleanDeserializer(java/lang/Boolean, null), new ByteDeserializer(java/lang/Byte, null), new ShortDeserializer(java/lang/Short, null), new CharacterDeserializer(java/lang/Character, null), new IntegerDeserializer(java/lang/Integer, null), new LongDeserializer(java/lang/Long, null), new FloatDeserializer(java/lang/Float, null), new DoubleDeserializer(java/lang/Double, null), new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE), new ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0)), 
            new ShortDeserializer(Short.TYPE, Short.valueOf((short)0)), new CharacterDeserializer(Character.TYPE, Character.valueOf('\0')), new IntegerDeserializer(Integer.TYPE, Integer.valueOf(0)), new LongDeserializer(Long.TYPE, Long.valueOf(0L)), new FloatDeserializer(Float.TYPE, Float.valueOf(0.0F)), new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D)), new NumberDeserializer(), new BigDecimalDeserializer(), new BigIntegerDeserializer()
        });
    }
}
