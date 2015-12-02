// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;


// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class NumberDeserializers
{

    public NumberDeserializers()
    {
    }

    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new BooleanDeserializer(java/lang/Boolean, null), new ByteDeserializer(java/lang/Byte, null), new ShortDeserializer(java/lang/Short, null), new CharacterDeserializer(java/lang/Character, null), new IntegerDeserializer(java/lang/Integer, null), new LongDeserializer(java/lang/Long, null), new FloatDeserializer(java/lang/Float, null), new DoubleDeserializer(java/lang/Double, null), new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE), new ByteDeserializer(Byte.TYPE, Byte.valueOf((byte)0)), 
            new ShortDeserializer(Short.TYPE, Short.valueOf((short)0)), new CharacterDeserializer(Character.TYPE, Character.valueOf('\0')), new IntegerDeserializer(Integer.TYPE, Integer.valueOf(0)), new LongDeserializer(Long.TYPE, Long.valueOf(0L)), new FloatDeserializer(Float.TYPE, Float.valueOf(0.0F)), new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D)), new NumberDeserializer(), new BigDecimalDeserializer(), new BigIntegerDeserializer()
        });
    }

    private class BooleanDeserializer extends PrimitiveOrWrapperDeserializer
    {
        private class PrimitiveOrWrapperDeserializer extends StdScalarDeserializer
        {

            final Object _nullValue;

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


        public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return _parseBoolean(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public BooleanDeserializer(Class class1, Boolean boolean1)
        {
            super(class1, boolean1);
        }
    }


    private class ByteDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseByte(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public ByteDeserializer(Class class1, Byte byte1)
        {
            super(class1, byte1);
        }
    }


    private class ShortDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseShort(jsonparser, deserializationcontext);
        }

        public ShortDeserializer(Class class1, Short short1)
        {
            super(class1, short1);
        }
    }


    private class CharacterDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public CharacterDeserializer(Class class1, Character character)
        {
            super(class1, character);
        }
    }


    private class IntegerDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return _parseInteger(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public IntegerDeserializer(Class class1, Integer integer)
        {
            super(class1, integer);
        }
    }


    private class LongDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseLong(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public LongDeserializer(Class class1, Long long1)
        {
            super(class1, long1);
        }
    }


    private class FloatDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseFloat(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public FloatDeserializer(Class class1, Float float1)
        {
            super(class1, float1);
        }
    }


    private class DoubleDeserializer extends PrimitiveOrWrapperDeserializer
    {

        public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return _parseDouble(jsonparser, deserializationcontext);
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public DoubleDeserializer(Class class1, Double double1)
        {
            super(class1, double1);
        }
    }


    private class NumberDeserializer extends StdScalarDeserializer
    {

        public Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            JsonToken jsontoken;
            jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT)
            {
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
                {
                    return jsonparser.getBigIntegerValue();
                } else
                {
                    return jsonparser.getNumberValue();
                }
            }
            if (jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
                {
                    return jsonparser.getDecimalValue();
                } else
                {
                    return Double.valueOf(jsonparser.getDoubleValue());
                }
            }
            if (jsontoken != JsonToken.VALUE_STRING)
            {
                break MISSING_BLOCK_LABEL_184;
            }
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.indexOf('.') < 0)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            if (!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            jsonparser = new BigDecimal(jsonparser);
            return jsonparser;
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
                catch (JsonParser jsonparser)
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "not a valid number");
                }
            } else
            {
                return Long.valueOf(l);
            }
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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

    }


    private class BigDecimalDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
            {
                return jsonparser.getDecimalValue();
            }
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return null;
                }
                try
                {
                    jsonparser = new BigDecimal(jsonparser);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
                }
                return jsonparser;
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
        }

        public BigDecimalDeserializer()
        {
            super(java/math/BigDecimal);
        }
    }


    private class BigIntegerDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public BigInteger deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
_L1:
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
            try
            {
                jsonparser = new BigInteger(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
            }
            return jsonparser;
        }

        public BigIntegerDeserializer()
        {
            super(java/math/BigInteger);
        }
    }

}
