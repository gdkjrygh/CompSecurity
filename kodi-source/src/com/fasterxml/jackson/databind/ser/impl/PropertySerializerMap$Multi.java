// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

private static final class _entries extends PropertySerializerMap
{

    private final dSerializer _entries[];

    public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
    {
        int i = _entries.length;
        if (i == 8)
        {
            Object obj = this;
            if (_resetWhenFull)
            {
                obj = new (this, class1, jsonserializer);
            }
            return ((PropertySerializerMap) (obj));
        } else
        {
            dSerializer adserializer[] = (dSerializer[])Arrays.copyOf(_entries, i + 1);
            adserializer[i] = new dSerializer(class1, jsonserializer);
            return new <init>(this, adserializer);
        }
    }

    public JsonSerializer serializerFor(Class class1)
    {
        int i = 0;
        for (int j = _entries.length; i < j; i++)
        {
            dSerializer dserializer = _entries[i];
            if (dserializer.type == class1)
            {
                return dserializer.serializer;
            }
        }

        return null;
    }

    public dSerializer(PropertySerializerMap propertyserializermap, dSerializer adserializer[])
    {
        super(propertyserializermap);
        _entries = adserializer;
    }
}
