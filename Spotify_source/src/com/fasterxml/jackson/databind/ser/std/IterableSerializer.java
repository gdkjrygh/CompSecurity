// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
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

    public boolean isEmpty(Iterable iterable)
    {
        return iterable == null || !iterable.iterator().hasNext();
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Iterable)obj);
    }

    public void serializeContents(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Class class1 = null;
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            TypeSerializer typeserializer = _valueTypeSerializer;
            iterable = null;
            do
            {
                Object obj2 = iterator.next();
                if (obj2 == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    JsonSerializer jsonserializer = _elementSerializer;
                    Class class2 = class1;
                    Object obj = iterable;
                    Object obj1 = jsonserializer;
                    if (jsonserializer == null)
                    {
                        class2 = obj2.getClass();
                        if (class2 == class1)
                        {
                            obj1 = iterable;
                            obj = iterable;
                            class2 = class1;
                        } else
                        {
                            obj = serializerprovider.findValueSerializer(class2, _property);
                            obj1 = obj;
                        }
                    }
                    if (typeserializer == null)
                    {
                        ((JsonSerializer) (obj1)).serialize(obj2, jsongenerator, serializerprovider);
                        class1 = class2;
                        iterable = ((Iterable) (obj));
                    } else
                    {
                        ((JsonSerializer) (obj1)).serializeWithType(obj2, jsongenerator, serializerprovider, typeserializer);
                        class1 = class2;
                        iterable = ((Iterable) (obj));
                    }
                }
            } while (iterator.hasNext());
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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
