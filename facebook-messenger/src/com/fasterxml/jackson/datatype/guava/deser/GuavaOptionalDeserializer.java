// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.base.Optional;

public final class GuavaOptionalDeserializer extends StdDeserializer
{

    private final JavaType _referenceType;

    public GuavaOptionalDeserializer(JavaType javatype)
    {
        super(javatype);
        _referenceType = javatype.containedType(0);
    }

    public Optional deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return Optional.of(deserializationcontext.findRootValueDeserializer(_referenceType).deserialize(jsonparser, deserializationcontext));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Optional getNullValue()
    {
        return Optional.absent();
    }

    public volatile Object getNullValue()
    {
        return getNullValue();
    }
}
