// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

public abstract class PropertySerializerMap
{
    private static final class Double extends PropertySerializerMap
    {

        private final JsonSerializer _serializer1;
        private final JsonSerializer _serializer2;
        private final Class _type1;
        private final Class _type2;

        public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
        {
            return new Multi(this, new TypeAndSerializer[] {
                new TypeAndSerializer(_type1, _serializer1), new TypeAndSerializer(_type2, _serializer2), new TypeAndSerializer(class1, jsonserializer)
            });
        }

        public JsonSerializer serializerFor(Class class1)
        {
            if (class1 == _type1)
            {
                return _serializer1;
            }
            if (class1 == _type2)
            {
                return _serializer2;
            } else
            {
                return null;
            }
        }

        public Double(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer, Class class2, JsonSerializer jsonserializer1)
        {
            super(propertyserializermap);
            _type1 = class1;
            _serializer1 = jsonserializer;
            _type2 = class2;
            _serializer2 = jsonserializer1;
        }
    }

    private static final class Empty extends PropertySerializerMap
    {

        public static final Empty FOR_PROPERTIES = new Empty(false);
        public static final Empty FOR_ROOT_VALUES = new Empty(true);

        public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
        {
            return new Single(this, class1, jsonserializer);
        }

        public JsonSerializer serializerFor(Class class1)
        {
            return null;
        }


        protected Empty(boolean flag)
        {
            super(flag);
        }
    }

    private static final class Multi extends PropertySerializerMap
    {

        private final TypeAndSerializer _entries[];

        public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
        {
            int i = _entries.length;
            if (i == 8)
            {
                Object obj = this;
                if (_resetWhenFull)
                {
                    obj = new Single(this, class1, jsonserializer);
                }
                return ((PropertySerializerMap) (obj));
            } else
            {
                TypeAndSerializer atypeandserializer[] = (TypeAndSerializer[])Arrays.copyOf(_entries, i + 1);
                atypeandserializer[i] = new TypeAndSerializer(class1, jsonserializer);
                return new Multi(this, atypeandserializer);
            }
        }

        public JsonSerializer serializerFor(Class class1)
        {
            int i = 0;
            for (int j = _entries.length; i < j; i++)
            {
                TypeAndSerializer typeandserializer = _entries[i];
                if (typeandserializer.type == class1)
                {
                    return typeandserializer.serializer;
                }
            }

            return null;
        }

        public Multi(PropertySerializerMap propertyserializermap, TypeAndSerializer atypeandserializer[])
        {
            super(propertyserializermap);
            _entries = atypeandserializer;
        }
    }

    public static final class SerializerAndMapResult
    {

        public final PropertySerializerMap map;
        public final JsonSerializer serializer;

        public SerializerAndMapResult(JsonSerializer jsonserializer, PropertySerializerMap propertyserializermap)
        {
            serializer = jsonserializer;
            map = propertyserializermap;
        }
    }

    private static final class Single extends PropertySerializerMap
    {

        private final JsonSerializer _serializer;
        private final Class _type;

        public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
        {
            return new Double(this, _type, _serializer, class1, jsonserializer);
        }

        public JsonSerializer serializerFor(Class class1)
        {
            if (class1 == _type)
            {
                return _serializer;
            } else
            {
                return null;
            }
        }

        public Single(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer)
        {
            super(propertyserializermap);
            _type = class1;
            _serializer = jsonserializer;
        }
    }

    private static final class TypeAndSerializer
    {

        public final JsonSerializer serializer;
        public final Class type;

        public TypeAndSerializer(Class class1, JsonSerializer jsonserializer)
        {
            type = class1;
            serializer = jsonserializer;
        }
    }


    protected final boolean _resetWhenFull;

    protected PropertySerializerMap(PropertySerializerMap propertyserializermap)
    {
        _resetWhenFull = propertyserializermap._resetWhenFull;
    }

    protected PropertySerializerMap(boolean flag)
    {
        _resetWhenFull = flag;
    }

    public static PropertySerializerMap emptyForProperties()
    {
        return Empty.FOR_PROPERTIES;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javatype, SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        serializerprovider = serializerprovider.findPrimaryPropertySerializer(javatype, beanproperty);
        return new SerializerAndMapResult(serializerprovider, newWith(javatype.getRawClass(), serializerprovider));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class class1, SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        serializerprovider = serializerprovider.findPrimaryPropertySerializer(class1, beanproperty);
        return new SerializerAndMapResult(serializerprovider, newWith(class1, serializerprovider));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javatype, SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        serializerprovider = serializerprovider.findValueSerializer(javatype, beanproperty);
        return new SerializerAndMapResult(serializerprovider, newWith(javatype.getRawClass(), serializerprovider));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class class1, SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        serializerprovider = serializerprovider.findValueSerializer(class1, beanproperty);
        return new SerializerAndMapResult(serializerprovider, newWith(class1, serializerprovider));
    }

    public abstract PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer);

    public abstract JsonSerializer serializerFor(Class class1);
}
