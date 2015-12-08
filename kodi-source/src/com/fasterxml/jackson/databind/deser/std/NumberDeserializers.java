// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class NumberDeserializers
{
    public static class BigDecimalDeserializer extends StdScalarDeserializer
    {

        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

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
                obj = jsonparser.getDecimalValue();
            } else
            {
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
                }
                if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
                {
                    jsonparser.nextToken();
                    obj = deserialize(jsonparser, deserializationcontext);
                    if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                    {
                        throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'BigDecimal' value but there was more than a single value in the array");
                    }
                } else
                {
                    throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
                }
            }
            return ((BigDecimal) (obj));
        }


        public BigDecimalDeserializer()
        {
            super(java/math/BigDecimal);
        }
    }

    public static class BigIntegerDeserializer extends StdScalarDeserializer
    {

        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigInteger deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
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
        //                       1 63
        //                       2 63;
               goto _L3 _L4 _L4
_L3:
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() != 0) goto _L6; else goto _L5
_L5:
            obj = null;
_L8:
            return ((BigInteger) (obj));
_L4:
            return BigInteger.valueOf(jsonparser.getLongValue());
_L2:
            if (obj == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue().toBigInteger();
            }
            if (obj != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonparser.nextToken();
            obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() == JsonToken.END_ARRAY) goto _L8; else goto _L7
_L7:
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'BigInteger' value but there was more than a single value in the array");
            if (obj == JsonToken.VALUE_STRING) goto _L3; else goto _L9
_L9:
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
_L6:
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

        static final BooleanDeserializer primitiveInstance;
        static final BooleanDeserializer wrapperInstance;

        public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        static 
        {
            primitiveInstance = new BooleanDeserializer(java/lang/Boolean, Boolean.FALSE);
            wrapperInstance = new BooleanDeserializer(Boolean.TYPE, null);
        }

        public BooleanDeserializer(Class class1, Boolean boolean1)
        {
            super(class1, boolean1);
        }
    }

    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final ByteDeserializer primitiveInstance;
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(java/lang/Byte, null);

        public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseByte(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        static 
        {
            primitiveInstance = new ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0));
        }

        public ByteDeserializer(Class class1, Byte byte1)
        {
            super(class1, byte1);
        }
    }

    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(java/lang/Character, Character.valueOf('\0'));
        static final CharacterDeserializer wrapperInstance;

        public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            Object obj = jsonparser.getCurrentToken();
            if (obj == JsonToken.VALUE_NUMBER_INT)
            {
                int i = jsonparser.getIntValue();
                if (i >= 0 && i <= 65535)
                {
                    return Character.valueOf((char)i);
                }
            } else
            if (obj == JsonToken.VALUE_STRING)
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
            } else
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = deserialize(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
                } else
                {
                    return ((Character) (obj));
                }
            }
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        static 
        {
            wrapperInstance = new CharacterDeserializer(Character.TYPE, null);
        }

        public CharacterDeserializer(Class class1, Character character)
        {
            super(class1, character);
        }
    }

    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(java/lang/Double, Double.valueOf(0.0D));
        static final DoubleDeserializer wrapperInstance;

        public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        static 
        {
            wrapperInstance = new DoubleDeserializer(Double.TYPE, null);
        }

        public DoubleDeserializer(Class class1, Double double1)
        {
            super(class1, double1);
        }
    }

    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final FloatDeserializer primitiveInstance = new FloatDeserializer(java/lang/Float, Float.valueOf(0.0F));
        static final FloatDeserializer wrapperInstance;

        public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseFloat(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        static 
        {
            wrapperInstance = new FloatDeserializer(Float.TYPE, null);
        }

        public FloatDeserializer(Class class1, Float float1)
        {
            super(class1, float1);
        }
    }

    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(java/lang/Integer, Integer.valueOf(0));
        static final IntegerDeserializer wrapperInstance;

        public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        static 
        {
            wrapperInstance = new IntegerDeserializer(Integer.TYPE, null);
        }

        public IntegerDeserializer(Class class1, Integer integer)
        {
            super(class1, integer);
        }
    }

    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final LongDeserializer primitiveInstance = new LongDeserializer(java/lang/Long, Long.valueOf(0L));
        static final LongDeserializer wrapperInstance;

        public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseLong(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        static 
        {
            wrapperInstance = new LongDeserializer(Long.TYPE, null);
        }

        public LongDeserializer(Class class1, Long long1)
        {
            super(class1, long1);
        }
    }

    public static class NumberDeserializer extends StdScalarDeserializer
    {

        public static final NumberDeserializer instance = new NumberDeserializer();

        public Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
                break MISSING_BLOCK_LABEL_261;
            }
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return (Number)getEmptyValue();
            }
            if (_hasTextualNull(jsonparser))
            {
                return (Number)getNullValue();
            }
            if (_isPosInf(jsonparser))
            {
                return Double.valueOf((1.0D / 0.0D));
            }
            if (_isNegInf(jsonparser))
            {
                return Double.valueOf((-1.0D / 0.0D));
            }
            if (_isNaN(jsonparser))
            {
                return Double.valueOf((0.0D / 0.0D));
            }
            if (jsonparser.indexOf('.') < 0)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                break MISSING_BLOCK_LABEL_196;
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
            if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
            {
                jsonparser.nextToken();
                obj = deserialize(jsonparser, deserializationcontext);
                if (jsonparser.nextToken() != JsonToken.END_ARRAY)
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
                } else
                {
                    return ((Number) (obj));
                }
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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

    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer
    {

        static final ShortDeserializer primitiveInstance = new ShortDeserializer(java/lang/Short, Short.valueOf((short)0));
        static final ShortDeserializer wrapperInstance;

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _parseShort(jsonparser, deserializationcontext);
        }

        static 
        {
            wrapperInstance = new ShortDeserializer(Short.TYPE, null);
        }

        public ShortDeserializer(Class class1, Short short1)
        {
            super(class1, short1);
        }
    }


    private static final HashSet _classNames;

    public static JsonDeserializer find(Class class1, String s)
    {
        if (class1.isPrimitive())
        {
            if (class1 == Integer.TYPE)
            {
                return IntegerDeserializer.primitiveInstance;
            }
            if (class1 == Boolean.TYPE)
            {
                return BooleanDeserializer.primitiveInstance;
            }
            if (class1 == Long.TYPE)
            {
                return LongDeserializer.primitiveInstance;
            }
            if (class1 == Double.TYPE)
            {
                return DoubleDeserializer.primitiveInstance;
            }
            if (class1 == Character.TYPE)
            {
                return CharacterDeserializer.primitiveInstance;
            }
            if (class1 == Byte.TYPE)
            {
                return ByteDeserializer.primitiveInstance;
            }
            if (class1 == Short.TYPE)
            {
                return ShortDeserializer.primitiveInstance;
            }
            if (class1 == Float.TYPE)
            {
                return FloatDeserializer.primitiveInstance;
            }
        } else
        if (_classNames.contains(s))
        {
            if (class1 == java/lang/Integer)
            {
                return IntegerDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Boolean)
            {
                return BooleanDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Long)
            {
                return LongDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Double)
            {
                return DoubleDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Character)
            {
                return CharacterDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Byte)
            {
                return ByteDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Short)
            {
                return ShortDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Float)
            {
                return FloatDeserializer.wrapperInstance;
            }
            if (class1 == java/lang/Number)
            {
                return NumberDeserializer.instance;
            }
            if (class1 == java/math/BigDecimal)
            {
                return BigDecimalDeserializer.instance;
            }
            if (class1 == java/math/BigInteger)
            {
                return BigIntegerDeserializer.instance;
            }
        } else
        {
            return null;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Internal error: can't find deserializer for ").append(class1.getName()).toString());
    }

    static 
    {
        _classNames = new HashSet();
        Class aclass[] = new Class[11];
        aclass[0] = java/lang/Boolean;
        aclass[1] = java/lang/Byte;
        aclass[2] = java/lang/Short;
        aclass[3] = java/lang/Character;
        aclass[4] = java/lang/Integer;
        aclass[5] = java/lang/Long;
        aclass[6] = java/lang/Float;
        aclass[7] = java/lang/Double;
        aclass[8] = java/lang/Number;
        aclass[9] = java/math/BigDecimal;
        aclass[10] = java/math/BigInteger;
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aclass[i];
            _classNames.add(class1.getName());
        }

    }
}
