// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public final class TypeWrappedSerializer extends JsonSerializer
{

    protected final JsonSerializer _serializer;
    protected final TypeSerializer _typeSerializer;

    public TypeWrappedSerializer(TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        _typeSerializer = typeserializer;
        _serializer = jsonserializer;
    }

    public Class handledType()
    {
        return java/lang/Object;
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        _serializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        _serializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
    }
}
