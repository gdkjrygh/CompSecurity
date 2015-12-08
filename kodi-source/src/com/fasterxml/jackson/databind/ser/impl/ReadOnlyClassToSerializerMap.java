// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            JsonSerializerMap

public final class ReadOnlyClassToSerializerMap
{

    protected com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey _cacheKey;
    protected final JsonSerializerMap _map;

    private ReadOnlyClassToSerializerMap(JsonSerializerMap jsonserializermap)
    {
        _cacheKey = null;
        _map = jsonserializermap;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap hashmap)
    {
        return new ReadOnlyClassToSerializerMap(new JsonSerializerMap(hashmap));
    }

    public ReadOnlyClassToSerializerMap instance()
    {
        return new ReadOnlyClassToSerializerMap(_map);
    }

    public JsonSerializer typedValueSerializer(Class class1)
    {
        if (_cacheKey == null)
        {
            _cacheKey = new com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey(class1, true);
        } else
        {
            _cacheKey.resetTyped(class1);
        }
        return _map.find(_cacheKey);
    }

    public JsonSerializer untypedValueSerializer(JavaType javatype)
    {
        if (_cacheKey == null)
        {
            _cacheKey = new com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey(javatype, false);
        } else
        {
            _cacheKey.resetUntyped(javatype);
        }
        return _map.find(_cacheKey);
    }

    public JsonSerializer untypedValueSerializer(Class class1)
    {
        if (_cacheKey == null)
        {
            _cacheKey = new com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey(class1, false);
        } else
        {
            _cacheKey.resetUntyped(class1);
        }
        return _map.find(_cacheKey);
    }
}
