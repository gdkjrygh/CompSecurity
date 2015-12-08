// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public abstract class ContainerSerializer extends StdSerializer
{

    protected ContainerSerializer(JavaType javatype)
    {
        super(javatype);
    }

    protected ContainerSerializer(ContainerSerializer containerserializer)
    {
        super(containerserializer._handledType, false);
    }

    protected ContainerSerializer(Class class1)
    {
        super(class1);
    }

    protected ContainerSerializer(Class class1, boolean flag)
    {
        super(class1, flag);
    }

    protected abstract ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer);

    protected boolean hasContentTypeAnnotation(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        if (beanproperty != null)
        {
            serializerprovider = serializerprovider.getAnnotationIntrospector();
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            if (annotatedmember != null && serializerprovider != null && serializerprovider.findSerializationContentType(annotatedmember, beanproperty.getType()) != null)
            {
                return true;
            }
        }
        return false;
    }

    public abstract boolean hasSingleElement(Object obj);

    public boolean isEmpty(Object obj)
    {
        return isEmpty(null, obj);
    }

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
