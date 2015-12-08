// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import java.util.Map;

public class NumberSerializers
{

    public static void addAll(Map map)
    {
        IntegerSerializer integerserializer = new IntegerSerializer();
        map.put(java/lang/Integer.getName(), integerserializer);
        map.put(Integer.TYPE.getName(), integerserializer);
        map.put(java/lang/Long.getName(), LongSerializer.instance);
        map.put(Long.TYPE.getName(), LongSerializer.instance);
        map.put(java/lang/Byte.getName(), IntLikeSerializer.instance);
        map.put(Byte.TYPE.getName(), IntLikeSerializer.instance);
        map.put(java/lang/Short.getName(), ShortSerializer.instance);
        map.put(Short.TYPE.getName(), ShortSerializer.instance);
        map.put(java/lang/Float.getName(), FloatSerializer.instance);
        map.put(Float.TYPE.getName(), FloatSerializer.instance);
        map.put(java/lang/Double.getName(), DoubleSerializer.instance);
        map.put(Double.TYPE.getName(), DoubleSerializer.instance);
    }

    // Unreferenced inner class com/fasterxml/jackson/databind/ser/std/NumberSerializers$1

/* anonymous class */
    class _cls1
    {

        static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

        static 
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
            try
            {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class IntegerSerializer extends Base
    {
        private class Base extends StdScalarSerializer
            implements ContextualSerializer
        {

            protected final boolean _isInt;
            protected final com.fasterxml.jackson.core.JsonParser.NumberType _numberType;
            protected final String _schemaType;

            public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            {
                if (beanproperty == null) goto _L2; else goto _L1
_L1:
                serializerprovider = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty.getMember());
                if (serializerprovider == null) goto _L2; else goto _L3
_L3:
    class _cls1
    {

        static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

        static 
        {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
            try
            {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }

                _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[serializerprovider.getShape().ordinal()];
                JVM INSTR tableswitch 1 1: default 52
            //                           1 54;
                   goto _L2 _L4
_L2:
                return this;
_L4:
                return ToStringSerializer.instance;
            }

            protected Base(Class class1, com.fasterxml.jackson.core.JsonParser.NumberType numbertype, String s)
            {
                super(class1);
                _numberType = numbertype;
                _schemaType = s;
                boolean flag;
                if (numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.INT || numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.LONG || numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                _isInt = flag;
            }
        }


        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final void serialize(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(integer.intValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Integer)obj, jsongenerator, serializerprovider);
        }

        public final void serializeWithType(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        {
            serialize(integer, jsongenerator, serializerprovider);
        }

        public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        {
            serializeWithType((Integer)obj, jsongenerator, serializerprovider, typeserializer);
        }

        public IntegerSerializer()
        {
            super(java/lang/Integer, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
        }
    }


    private class LongSerializer extends Base
    {

        static final LongSerializer instance = new LongSerializer();

        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(long1.longValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Long)obj, jsongenerator, serializerprovider);
        }


        public LongSerializer()
        {
            super(java/lang/Long, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, "number");
        }
    }


    private class IntLikeSerializer extends Base
    {

        static final IntLikeSerializer instance = new IntLikeSerializer();

        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(number.intValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public IntLikeSerializer()
        {
            super(java/lang/Number, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
        }
    }


    private class ShortSerializer extends Base
    {

        static final ShortSerializer instance = new ShortSerializer();

        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Short)obj, jsongenerator, serializerprovider);
        }

        public final void serialize(Short short1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(short1.shortValue());
        }


        public ShortSerializer()
        {
            super(java/lang/Short, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "number");
        }
    }


    private class FloatSerializer extends Base
    {

        static final FloatSerializer instance = new FloatSerializer();

        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final void serialize(Float float1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(float1.floatValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Float)obj, jsongenerator, serializerprovider);
        }


        public FloatSerializer()
        {
            super(java/lang/Float, com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT, "number");
        }
    }


    private class DoubleSerializer extends Base
    {

        static final DoubleSerializer instance = new DoubleSerializer();

        public final volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public final void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            jsongenerator.writeNumber(double1.doubleValue());
        }

        public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            serialize((Double)obj, jsongenerator, serializerprovider);
        }

        public final void serializeWithType(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        {
            serialize(double1, jsongenerator, serializerprovider);
        }

        public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        {
            serializeWithType((Double)obj, jsongenerator, serializerprovider, typeserializer);
        }


        public DoubleSerializer()
        {
            super(java/lang/Double, com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE, "number");
        }
    }

}
