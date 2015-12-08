// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            ArraySerializerBase, StdSerializer

public class StdArraySerializers
{
    public static class BooleanArraySerializer extends ArraySerializerBase
    {

        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Boolean);

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return this;
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((boolean[])obj);
        }

        public boolean hasSingleElement(boolean aflag[])
        {
            return aflag.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (boolean[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, boolean aflag[])
        {
            return aflag == null || aflag.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((boolean[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = aflag.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(aflag, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(aflag, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((boolean[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            int i = 0;
            for (int j = aflag.length; i < j; i++)
            {
                jsongenerator.writeBoolean(aflag[i]);
            }

        }


        public BooleanArraySerializer()
        {
            super([Z, null);
        }
    }

    public static class ByteArraySerializer extends StdSerializer
    {

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (byte[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, byte abyte0[])
        {
            return abyte0 == null || abyte0.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((byte[])obj, jsongenerator, serializerprovider);
        }

        public void serialize(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
        }

        public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serializeWithType((byte[])obj, jsongenerator, serializerprovider, typeserializer);
        }

        public void serializeWithType(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            typeserializer.writeTypePrefixForScalar(abyte0, jsongenerator);
            jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
            typeserializer.writeTypeSuffixForScalar(abyte0, jsongenerator);
        }

        public ByteArraySerializer()
        {
            super([B);
        }
    }

    public static class CharArraySerializer extends StdSerializer
    {

        private final void _writeArrayContents(JsonGenerator jsongenerator, char ac[])
            throws IOException, JsonGenerationException
        {
            int i = 0;
            for (int j = ac.length; i < j; i++)
            {
                jsongenerator.writeString(ac, i, 1);
            }

        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (char[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, char ac[])
        {
            return ac == null || ac.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            serialize((char[])obj, jsongenerator, serializerprovider);
        }

        public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            if (serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
            {
                jsongenerator.writeStartArray(ac.length);
                _writeArrayContents(jsongenerator, ac);
                jsongenerator.writeEndArray();
                return;
            } else
            {
                jsongenerator.writeString(ac, 0, ac.length);
                return;
            }
        }

        public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException
        {
            serializeWithType((char[])obj, jsongenerator, serializerprovider, typeserializer);
        }

        public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException, JsonGenerationException
        {
            if (serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
            {
                typeserializer.writeTypePrefixForArray(ac, jsongenerator);
                _writeArrayContents(jsongenerator, ac);
                typeserializer.writeTypeSuffixForArray(ac, jsongenerator);
                return;
            } else
            {
                typeserializer.writeTypePrefixForScalar(ac, jsongenerator);
                jsongenerator.writeString(ac, 0, ac.length);
                typeserializer.writeTypeSuffixForScalar(ac, jsongenerator);
                return;
            }
        }

        public CharArraySerializer()
        {
            super([C);
        }
    }

    public static class DoubleArraySerializer extends ArraySerializerBase
    {

        private static final JavaType VALUE_TYPE;

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return this;
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((double[])obj);
        }

        public boolean hasSingleElement(double ad[])
        {
            return ad.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (double[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, double ad[])
        {
            return ad == null || ad.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((double[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = ad.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(ad, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(ad, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((double[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = 0;
            for (int j = ad.length; i < j; i++)
            {
                jsongenerator.writeNumber(ad[i]);
            }

        }

        static 
        {
            VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);
        }

        public DoubleArraySerializer()
        {
            super([D, null);
        }
    }

    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer
    {

        private static final JavaType VALUE_TYPE;

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return new FloatArraySerializer(this, _property, typeserializer);
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((float[])obj);
        }

        public boolean hasSingleElement(float af[])
        {
            return af.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (float[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, float af[])
        {
            return af == null || af.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((float[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = af.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(af, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(af, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((float[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            if (_valueTypeSerializer != null)
            {
                int i = 0;
                for (int k = af.length; i < k; i++)
                {
                    _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Float.TYPE);
                    jsongenerator.writeNumber(af[i]);
                    _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
                }

            } else
            {
                int j = 0;
                for (int l = af.length; j < l; j++)
                {
                    jsongenerator.writeNumber(af[j]);
                }

            }
        }

        static 
        {
            VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);
        }

        public FloatArraySerializer()
        {
            super([F);
        }

        public FloatArraySerializer(FloatArraySerializer floatarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer)
        {
            super(floatarrayserializer, beanproperty, typeserializer);
        }
    }

    public static class IntArraySerializer extends ArraySerializerBase
    {

        private static final JavaType VALUE_TYPE;

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return this;
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((int[])obj);
        }

        public boolean hasSingleElement(int ai[])
        {
            return ai.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (int[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, int ai[])
        {
            return ai == null || ai.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((int[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = ai.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(ai, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(ai, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((int[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = 0;
            for (int j = ai.length; i < j; i++)
            {
                jsongenerator.writeNumber(ai[i]);
            }

        }

        static 
        {
            VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);
        }

        public IntArraySerializer()
        {
            super([I, null);
        }
    }

    public static class LongArraySerializer extends TypedPrimitiveArraySerializer
    {

        private static final JavaType VALUE_TYPE;

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return new LongArraySerializer(this, _property, typeserializer);
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((long[])obj);
        }

        public boolean hasSingleElement(long al[])
        {
            return al.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (long[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, long al[])
        {
            return al == null || al.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((long[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = al.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(al, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(al, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((long[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            if (_valueTypeSerializer != null)
            {
                int i = 0;
                for (int k = al.length; i < k; i++)
                {
                    _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Long.TYPE);
                    jsongenerator.writeNumber(al[i]);
                    _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
                }

            } else
            {
                int j = 0;
                for (int l = al.length; j < l; j++)
                {
                    jsongenerator.writeNumber(al[j]);
                }

            }
        }

        static 
        {
            VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);
        }

        public LongArraySerializer()
        {
            super([J);
        }

        public LongArraySerializer(LongArraySerializer longarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer)
        {
            super(longarrayserializer, beanproperty, typeserializer);
        }
    }

    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer
    {

        private static final JavaType VALUE_TYPE;

        public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
        {
            return new ShortArraySerializer(this, _property, typeserializer);
        }

        public volatile boolean hasSingleElement(Object obj)
        {
            return hasSingleElement((short[])obj);
        }

        public boolean hasSingleElement(short aword0[])
        {
            return aword0.length == 1;
        }

        public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
        {
            return isEmpty(serializerprovider, (short[])obj);
        }

        public boolean isEmpty(SerializerProvider serializerprovider, short aword0[])
        {
            return aword0 == null || aword0.length == 0;
        }

        public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serialize((short[])obj, jsongenerator, serializerprovider);
        }

        public final void serialize(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            int i = aword0.length;
            if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
            {
                serializeContents(aword0, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsongenerator.writeStartArray(i);
                serializeContents(aword0, jsongenerator, serializerprovider);
                jsongenerator.writeEndArray();
                return;
            }
        }

        public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException
        {
            serializeContents((short[])obj, jsongenerator, serializerprovider);
        }

        public void serializeContents(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonGenerationException
        {
            if (_valueTypeSerializer != null)
            {
                int i = 0;
                for (int k = aword0.length; i < k; i++)
                {
                    _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Short.TYPE);
                    jsongenerator.writeNumber(aword0[i]);
                    _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
                }

            } else
            {
                int j = 0;
                for (int l = aword0.length; j < l; j++)
                {
                    jsongenerator.writeNumber(aword0[j]);
                }

            }
        }

        static 
        {
            VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);
        }

        public ShortArraySerializer()
        {
            super([S);
        }

        public ShortArraySerializer(ShortArraySerializer shortarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer)
        {
            super(shortarrayserializer, beanproperty, typeserializer);
        }
    }

    protected static abstract class TypedPrimitiveArraySerializer extends ArraySerializerBase
    {

        protected final TypeSerializer _valueTypeSerializer;

        protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer typedprimitivearrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer)
        {
            super(typedprimitivearrayserializer, beanproperty);
            _valueTypeSerializer = typeserializer;
        }

        protected TypedPrimitiveArraySerializer(Class class1)
        {
            super(class1);
            _valueTypeSerializer = null;
        }
    }


    protected static final HashMap _arraySerializers;

    public static JsonSerializer findStandardImpl(Class class1)
    {
        return (JsonSerializer)_arraySerializers.get(class1.getName());
    }

    static 
    {
        _arraySerializers = new HashMap();
        _arraySerializers.put([Z.getName(), new BooleanArraySerializer());
        _arraySerializers.put([B.getName(), new ByteArraySerializer());
        _arraySerializers.put([C.getName(), new CharArraySerializer());
        _arraySerializers.put([S.getName(), new ShortArraySerializer());
        _arraySerializers.put([I.getName(), new IntArraySerializer());
        _arraySerializers.put([J.getName(), new LongArraySerializer());
        _arraySerializers.put([F.getName(), new FloatArraySerializer());
        _arraySerializers.put([D.getName(), new DoubleArraySerializer());
    }
}
