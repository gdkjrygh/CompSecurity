// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;

public class IteratorSerializer extends AsArraySerializerBase
{

    public IteratorSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(java/util/Iterator, javatype, flag, typeserializer, beanproperty, null);
    }

    public IteratorSerializer(IteratorSerializer iteratorserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(iteratorserializer, beanproperty, typeserializer, jsonserializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new IteratorSerializer(_elementType, _staticTyping, typeserializer, _property);
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Iterator)obj);
    }

    public boolean hasSingleElement(Iterator iterator)
    {
        return false;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (Iterator)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Iterator iterator)
    {
        return iterator == null || !iterator.hasNext();
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((Iterator)obj, jsongenerator, serializerprovider);
    }

    public final void serialize(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(iterator))
        {
            serializeContents(iterator, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray();
            serializeContents(iterator, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((Iterator)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (iterator.hasNext())
        {
            TypeSerializer typeserializer = _valueTypeSerializer;
            JsonSerializer jsonserializer = null;
            Class class1 = null;
            do
            {
                Object obj = iterator.next();
                if (obj == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    JsonSerializer jsonserializer3 = _elementSerializer;
                    JsonSerializer jsonserializer1 = jsonserializer3;
                    Class class2 = class1;
                    JsonSerializer jsonserializer2 = jsonserializer;
                    if (jsonserializer3 == null)
                    {
                        class2 = obj.getClass();
                        if (class2 == class1)
                        {
                            jsonserializer1 = jsonserializer;
                            jsonserializer2 = jsonserializer;
                            class2 = class1;
                        } else
                        {
                            jsonserializer1 = serializerprovider.findValueSerializer(class2, _property);
                            jsonserializer2 = jsonserializer1;
                        }
                    }
                    if (typeserializer == null)
                    {
                        jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
                        class1 = class2;
                        jsonserializer = jsonserializer2;
                    } else
                    {
                        jsonserializer1.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
                        class1 = class2;
                        jsonserializer = jsonserializer2;
                    }
                }
            } while (iterator.hasNext());
        }
    }

    public IteratorSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IteratorSerializer(this, beanproperty, typeserializer, jsonserializer);
    }

    public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return withResolved(beanproperty, typeserializer, jsonserializer);
    }
}
