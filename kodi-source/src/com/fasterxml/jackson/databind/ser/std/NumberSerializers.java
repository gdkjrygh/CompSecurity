// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer, ToStringSerializer

public class NumberSerializers
{
    protected static abstract class Base extends StdScalarSerializer
        implements ContextualSerializer
    {

        protected final boolean _isInt;
        protected final com.fasterxml.jackson.core.JsonParser.NumberType _numberType;
        protected final String _schemaType;

        public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            if (beanproperty == null) goto _L2; else goto _L1
_L1:
            beanproperty = beanproperty.getMember();
            if (beanproperty == null) goto _L2; else goto _L3
_L3:
            serializerprovider = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty);
            if (serializerprovider == null) goto _L2; else goto _L4
_L4:
            static class _cls1
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
            JVM INSTR tableswitch 1 1: default 56
        //                       1 58;
               goto _L2 _L5
_L2:
            return this;
_L5:
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

    public static final class DoubleSerializer extends Base
    {

        static final DoubleSerializer instance = new DoubleSerializer();

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public void serialize(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(double1.doubleValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Double)obj, jsongenerator, serializerprovider);
        }

        public void serializeWithType(Double double1, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serialize(double1, jsongenerator, serializerprovider);
        }

        public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serializeWithType((Double)obj, jsongenerator, serializerprovider, typeserializer);
        }


        public DoubleSerializer()
        {
            super(java/lang/Double, com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE, "number");
        }
    }

    public static final class FloatSerializer extends Base
    {

        static final FloatSerializer instance = new FloatSerializer();

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public void serialize(Float float1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(float1.floatValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Float)obj, jsongenerator, serializerprovider);
        }


        public FloatSerializer()
        {
            super(java/lang/Float, com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT, "number");
        }
    }

    public static final class IntLikeSerializer extends Base
    {

        static final IntLikeSerializer instance = new IntLikeSerializer();

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(number.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Number)obj, jsongenerator, serializerprovider);
        }


        public IntLikeSerializer()
        {
            super(java/lang/Number, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
        }
    }

    public static final class IntegerSerializer extends Base
    {

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public void serialize(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(integer.intValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Integer)obj, jsongenerator, serializerprovider);
        }

        public void serializeWithType(Integer integer, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serialize(integer, jsongenerator, serializerprovider);
        }

        public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serializeWithType((Integer)obj, jsongenerator, serializerprovider, typeserializer);
        }

        public IntegerSerializer()
        {
            super(java/lang/Integer, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
        }
    }

    public static final class LongSerializer extends Base
    {

        static final LongSerializer instance = new LongSerializer();

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public void serialize(Long long1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(long1.longValue());
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Long)obj, jsongenerator, serializerprovider);
        }


        public LongSerializer()
        {
            super(java/lang/Long, com.fasterxml.jackson.core.JsonParser.NumberType.LONG, "number");
        }
    }

    public static final class ShortSerializer extends Base
    {

        static final ShortSerializer instance = new ShortSerializer();

        public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
            throws JsonMappingException
        {
            return super.createContextual(serializerprovider, beanproperty);
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((Short)obj, jsongenerator, serializerprovider);
        }

        public void serialize(Short short1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeNumber(short1.shortValue());
        }


        public ShortSerializer()
        {
            super(java/lang/Short, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "number");
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
        map.put(java/lang/Short.getName(), ShortSerializer.instance);
        map.put(Short.TYPE.getName(), ShortSerializer.instance);
        map.put(java/lang/Float.getName(), FloatSerializer.instance);
        map.put(Float.TYPE.getName(), FloatSerializer.instance);
        map.put(java/lang/Double.getName(), DoubleSerializer.instance);
        map.put(Double.TYPE.getName(), DoubleSerializer.instance);
    }
}
