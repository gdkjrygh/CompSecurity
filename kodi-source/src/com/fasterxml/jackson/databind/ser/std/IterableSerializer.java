// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            AsArraySerializerBase

public class IterableSerializer extends AsArraySerializerBase
{

    public IterableSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(java/lang/Iterable, javatype, flag, typeserializer, beanproperty, null);
    }

    public IterableSerializer(IterableSerializer iterableserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(iterableserializer, beanproperty, typeserializer, jsonserializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new IterableSerializer(_elementType, _staticTyping, typeserializer, _property);
    }

    public boolean hasSingleElement(Iterable iterable)
    {
        if (iterable != null)
        {
            iterable = iterable.iterator();
            if (iterable.hasNext())
            {
                iterable.next();
                if (!iterable.hasNext())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Iterable)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Iterable iterable)
    {
        return iterable == null || !iterable.iterator().hasNext();
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (Iterable)obj);
    }

    public final void serialize(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(iterable))
        {
            serializeContents(iterable, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray();
            serializeContents(iterable, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serialize((Iterable)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            TypeSerializer typeserializer = _valueTypeSerializer;
            iterable = null;
            Class class1 = null;
            do
            {
                Object obj2 = iterator.next();
                if (obj2 == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    JsonSerializer jsonserializer = _elementSerializer;
                    Object obj = jsonserializer;
                    Class class2 = class1;
                    Object obj1 = iterable;
                    if (jsonserializer == null)
                    {
                        class2 = obj2.getClass();
                        if (class2 == class1)
                        {
                            obj = iterable;
                            obj1 = iterable;
                            class2 = class1;
                        } else
                        {
                            obj = serializerprovider.findValueSerializer(class2, _property);
                            obj1 = obj;
                        }
                    }
                    if (typeserializer == null)
                    {
                        ((JsonSerializer) (obj)).serialize(obj2, jsongenerator, serializerprovider);
                        class1 = class2;
                        iterable = ((Iterable) (obj1));
                    } else
                    {
                        ((JsonSerializer) (obj)).serializeWithType(obj2, jsongenerator, serializerprovider, typeserializer);
                        class1 = class2;
                        iterable = ((Iterable) (obj1));
                    }
                }
            } while (iterator.hasNext());
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        serializeContents((Iterable)obj, jsongenerator, serializerprovider);
    }

    public volatile AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return withResolved(beanproperty, typeserializer, jsonserializer);
    }

    public IterableSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IterableSerializer(this, beanproperty, typeserializer, jsonserializer);
    }
}
