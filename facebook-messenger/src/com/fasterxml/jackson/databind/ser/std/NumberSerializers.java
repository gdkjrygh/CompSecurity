// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import java.util.Map;

public class NumberSerializers
{

    protected NumberSerializers()
    {
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

    private class IntegerSerializer extends NonTypedScalarSerializerBase
    {

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public void serialize(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(integer.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Integer)obj, jsongenerator, serializerprovider);
        }

        public IntegerSerializer()
        {
            super(java/lang/Integer);
        }
    }


    private class LongSerializer extends StdScalarSerializer
    {

        static final LongSerializer instance = new LongSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(long1.longValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Long)obj, jsongenerator, serializerprovider);
        }


        public LongSerializer()
        {
            super(java/lang/Long);
        }
    }


    private class IntLikeSerializer extends StdScalarSerializer
    {

        static final IntLikeSerializer instance = new IntLikeSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("integer", true);
        }

        public void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(number.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public IntLikeSerializer()
        {
            super(java/lang/Number);
        }
    }


    private class FloatSerializer extends StdScalarSerializer
    {

        static final FloatSerializer instance = new FloatSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Float float1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(float1.floatValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Float)obj, jsongenerator, serializerprovider);
        }


        public FloatSerializer()
        {
            super(java/lang/Float);
        }
    }


    private class DoubleSerializer extends NonTypedScalarSerializerBase
    {

        static final DoubleSerializer instance = new DoubleSerializer();

        public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        {
            return createSchemaNode("number", true);
        }

        public void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(double1.doubleValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Double)obj, jsongenerator, serializerprovider);
        }


        public DoubleSerializer()
        {
            super(java/lang/Double);
        }
    }

}
