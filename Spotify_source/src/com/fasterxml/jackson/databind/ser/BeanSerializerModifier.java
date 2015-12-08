// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanSerializerBuilder

public abstract class BeanSerializerModifier
{

    public BeanSerializerModifier()
    {
    }

    public List changeProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }

    public JsonSerializer modifyArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyKeySerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifyMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public JsonSerializer modifySerializer(SerializationConfig serializationconfig, BeanDescription beandescription, JsonSerializer jsonserializer)
    {
        return jsonserializer;
    }

    public List orderProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }

    public BeanSerializerBuilder updateBuilder(SerializationConfig serializationconfig, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
    {
        return beanserializerbuilder;
    }
}
