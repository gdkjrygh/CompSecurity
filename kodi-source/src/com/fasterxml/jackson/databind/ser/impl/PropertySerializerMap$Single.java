// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

private static final class _serializer extends PropertySerializerMap
{

    private final JsonSerializer _serializer;
    private final Class _type;

    public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
    {
        return new <init>(this, _type, _serializer, class1, jsonserializer);
    }

    public JsonSerializer serializerFor(Class class1)
    {
        if (class1 == _type)
        {
            return _serializer;
        } else
        {
            return null;
        }
    }

    public (PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer)
    {
        super(propertyserializermap);
        _type = class1;
        _serializer = jsonserializer;
    }
}
