// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class UnknownSerializer extends StdSerializer
{

    public UnknownSerializer()
    {
        super(java/lang/Object);
    }

    protected void failForEmpty(Object obj)
    {
        throw new JsonMappingException((new StringBuilder("No serializer found for class ")).append(obj.getClass().getName()).append(" and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )").toString());
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (serializerprovider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS))
        {
            failForEmpty(obj);
        }
        jsongenerator.writeStartObject();
        jsongenerator.writeEndObject();
    }

    public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        if (serializerprovider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS))
        {
            failForEmpty(obj);
        }
        typeserializer.writeTypePrefixForObject(obj, jsongenerator);
        typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
    }
}
