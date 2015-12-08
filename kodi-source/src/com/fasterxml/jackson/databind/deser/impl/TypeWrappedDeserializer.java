// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;

public final class TypeWrappedDeserializer extends JsonDeserializer
    implements Serializable
{

    protected final JsonDeserializer _deserializer;
    protected final TypeDeserializer _typeDeserializer;

    public TypeWrappedDeserializer(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        _typeDeserializer = typedeserializer;
        _deserializer = jsondeserializer;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        return _deserializer.deserializeWithType(jsonparser, deserializationcontext, _typeDeserializer);
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException
    {
        return _deserializer.deserialize(jsonparser, deserializationcontext, obj);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public Class handledType()
    {
        return _deserializer.handledType();
    }
}
