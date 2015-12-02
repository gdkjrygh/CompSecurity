// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.base.Optional;

public final class GuavaOptionalSerializer extends StdSerializer
{

    public GuavaOptionalSerializer(JavaType javatype)
    {
        super(javatype);
    }

    public void serialize(Optional optional, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (optional.isPresent())
        {
            serializerprovider.defaultSerializeValue(optional.get(), jsongenerator);
            return;
        } else
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            return;
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Optional)obj, jsongenerator, serializerprovider);
    }
}
