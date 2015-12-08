// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

private static final class _serializer2 extends PropertySerializerMap
{

    private final JsonSerializer _serializer1;
    private final JsonSerializer _serializer2;
    private final Class _type1;
    private final Class _type2;

    public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
    {
        return new init>(this, new Serializer[] {
            new Serializer(_type1, _serializer1), new Serializer(_type2, _serializer2), new Serializer(class1, jsonserializer)
        });
    }

    public JsonSerializer serializerFor(Class class1)
    {
        if (class1 == _type1)
        {
            return _serializer1;
        }
        if (class1 == _type2)
        {
            return _serializer2;
        } else
        {
            return null;
        }
    }

    public Serializer(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer, Class class2, JsonSerializer jsonserializer1)
    {
        super(propertyserializermap);
        _type1 = class1;
        _serializer1 = jsonserializer;
        _type2 = class2;
        _serializer2 = jsonserializer1;
    }
}
