// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer extends StdSerializer
{

    public ContainerSerializer(ContainerSerializer containerserializer)
    {
        super(containerserializer._handledType, false);
    }

    public ContainerSerializer(Class class1)
    {
        super(class1);
    }

    public ContainerSerializer(Class class1, boolean flag)
    {
        super(class1, flag);
    }

    public abstract ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer);

    public boolean hasContentTypeAnnotation(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        if (beanproperty != null)
        {
            serializerprovider = serializerprovider.getAnnotationIntrospector();
            if (serializerprovider != null && serializerprovider.findSerializationContentType(beanproperty.getMember(), beanproperty.getType()) != null)
            {
                return true;
            }
        }
        return false;
    }

    public abstract boolean hasSingleElement(Object obj);

    public ContainerSerializer withValueTypeSerializer(TypeSerializer typeserializer)
    {
        if (typeserializer == null)
        {
            return this;
        } else
        {
            return _withValueTypeSerializer(typeserializer);
        }
    }
}
