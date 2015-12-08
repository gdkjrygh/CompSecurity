// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            NonTypedScalarSerializerBase, StdScalarSerializer

public class NumberSerializers
{
    public static final class DoubleSerializer extends NonTypedScalarSerializerBase
    {

        static final DoubleSerializer instance = new DoubleSerializer();

        public final void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(double1.doubleValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Double)obj, jsongenerator, serializerprovider);
        }


        public DoubleSerializer()
        {
            super(java/lang/Double);
        }
    }

    public static final class FloatSerializer extends StdScalarSerializer
    {

        static final FloatSerializer instance = new FloatSerializer();

        public final void serialize(Float float1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(float1.floatValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Float)obj, jsongenerator, serializerprovider);
        }


        public FloatSerializer()
        {
            super(java/lang/Float);
        }
    }

    public static final class IntLikeSerializer extends StdScalarSerializer
    {

        static final IntLikeSerializer instance = new IntLikeSerializer();

        public final void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(number.intValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public IntLikeSerializer()
        {
            super(java/lang/Number);
        }
    }

    public static final class IntegerSerializer extends NonTypedScalarSerializerBase
    {

        public final void serialize(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(integer.intValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Integer)obj, jsongenerator, serializerprovider);
        }

        public IntegerSerializer()
        {
            super(java/lang/Integer);
        }
    }

    public static final class LongSerializer extends StdScalarSerializer
    {

        static final LongSerializer instance = new LongSerializer();

        public final void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeNumber(long1.longValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Long)obj, jsongenerator, serializerprovider);
        }


        public LongSerializer()
        {
            super(java/lang/Long);
        }
    }

    public static final class NumberSerializer extends StdScalarSerializer
    {

        public static final NumberSerializer instance = new NumberSerializer();

        public final void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            if (number instanceof BigDecimal)
            {
                jsongenerator.writeNumber((BigDecimal)number);
                return;
            }
            if (number instanceof BigInteger)
            {
                jsongenerator.writeNumber((BigInteger)number);
                return;
            }
            if (number instanceof Integer)
            {
                jsongenerator.writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long)
            {
                jsongenerator.writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double)
            {
                jsongenerator.writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float)
            {
                jsongenerator.writeNumber(number.floatValue());
                return;
            }
            if ((number instanceof Byte) || (number instanceof Short))
            {
                jsongenerator.writeNumber(number.intValue());
                return;
            } else
            {
                jsongenerator.writeNumber(number.toString());
                return;
            }
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public NumberSerializer()
        {
            super(java/lang/Number);
        }
    }


    public static void addAll(Map map)
    {
        IntegerSerializer integerserializer = new IntegerSerializer();
        map.put(java/lang/Integer.getName(), integerserializer);
        map.put(Integer.TYPE.getName(), integerserializer);
        map.put(java/lang/Long.getName(), LongSerializer.instance);
        map.put(Long.TYPE.getName(), LongSerializer.instance);
        map.put(java/lang/Byte.getName(), IntLikeSerializer.instance);
        map.put(Byte.TYPE.getName(), IntLikeSerializer.instance);
        map.put(java/lang/Short.getName(), IntLikeSerializer.instance);
        map.put(Short.TYPE.getName(), IntLikeSerializer.instance);
        map.put(java/lang/Float.getName(), FloatSerializer.instance);
        map.put(Float.TYPE.getName(), FloatSerializer.instance);
        map.put(java/lang/Double.getName(), DoubleSerializer.instance);
        map.put(Double.TYPE.getName(), DoubleSerializer.instance);
    }
}
